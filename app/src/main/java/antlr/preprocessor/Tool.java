package antlr.preprocessor;

import antlr.collections.impl.Vector;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Enumeration;

/* loaded from: classes.dex */
public class Tool {
    protected antlr.Tool antlrTool;
    protected String[] args;
    protected String grammarFileName;
    protected Vector grammars;
    protected int nargs;
    protected Hierarchy theHierarchy;

    public Tool(antlr.Tool tool, String[] strArr) {
        this.antlrTool = tool;
        processArguments(strArr);
    }

    public static void main(String[] strArr) {
        Tool tool = new Tool(new antlr.Tool(), strArr);
        tool.preprocess();
        for (String str : tool.preprocessedArgList()) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(" ");
            stringBuffer.append(str);
            printStream.print(stringBuffer.toString());
        }
        System.out.println();
    }

    private void processArguments(String[] strArr) {
        this.nargs = 0;
        this.args = new String[strArr.length];
        int i10 = 0;
        while (i10 < strArr.length) {
            if (strArr[i10].length() == 0) {
                this.antlrTool.warning("Zero length argument ignoring...");
            } else if (strArr[i10].equals("-glib")) {
                if (File.separator.equals("\\") && strArr[i10].indexOf(47) != -1) {
                    this.antlrTool.warning("-glib cannot deal with '/' on a PC: use '\\'; ignoring...");
                } else {
                    i10++;
                    this.grammars = antlr.Tool.parseSeparatedList(strArr[i10], ';');
                }
            } else if (strArr[i10].equals("-o")) {
                String[] strArr2 = this.args;
                int i11 = this.nargs;
                int i12 = i11 + 1;
                this.nargs = i12;
                strArr2[i11] = strArr[i10];
                int i13 = i10 + 1;
                if (i13 >= strArr.length) {
                    this.antlrTool.error("missing output directory with -o option; ignoring");
                } else {
                    this.nargs = i12 + 1;
                    strArr2[i12] = strArr[i13];
                    this.antlrTool.setOutputDirectory(strArr[i13]);
                    i10 = i13;
                }
            } else if (strArr[i10].charAt(0) == '-') {
                String[] strArr3 = this.args;
                int i14 = this.nargs;
                this.nargs = i14 + 1;
                strArr3[i14] = strArr[i10];
            } else {
                this.grammarFileName = strArr[i10];
                if (this.grammars == null) {
                    this.grammars = new Vector(10);
                }
                this.grammars.appendElement(this.grammarFileName);
                if (i10 + 1 < strArr.length) {
                    this.antlrTool.warning("grammar file must be last; ignoring other arguments...");
                    return;
                }
            }
            i10++;
        }
    }

    public boolean preprocess() {
        if (this.grammarFileName == null) {
            this.antlrTool.toolError("no grammar file specified");
            return false;
        }
        if (this.grammars != null) {
            this.theHierarchy = new Hierarchy(this.antlrTool);
            Enumeration elements = this.grammars.elements();
            while (elements.hasMoreElements()) {
                String str = (String) elements.nextElement();
                try {
                    this.theHierarchy.readGrammarFile(str);
                } catch (FileNotFoundException unused) {
                    antlr.Tool tool = this.antlrTool;
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("file ");
                    stringBuffer.append(str);
                    stringBuffer.append(" not found");
                    tool.toolError(stringBuffer.toString());
                    return false;
                }
            }
        }
        if (!this.theHierarchy.verifyThatHierarchyIsComplete()) {
            return false;
        }
        this.theHierarchy.expandGrammarsInFile(this.grammarFileName);
        GrammarFile file = this.theHierarchy.getFile(this.grammarFileName);
        String nameForExpandedGrammarFile = file.nameForExpandedGrammarFile(this.grammarFileName);
        if (nameForExpandedGrammarFile.equals(this.grammarFileName)) {
            String[] strArr = this.args;
            int i10 = this.nargs;
            this.nargs = i10 + 1;
            strArr[i10] = this.grammarFileName;
            return true;
        }
        try {
            file.generateExpandedFile();
            String[] strArr2 = this.args;
            int i11 = this.nargs;
            this.nargs = i11 + 1;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(this.antlrTool.getOutputDirectory());
            stringBuffer2.append(System.getProperty("file.separator"));
            stringBuffer2.append(nameForExpandedGrammarFile);
            strArr2[i11] = stringBuffer2.toString();
            return true;
        } catch (IOException unused2) {
            antlr.Tool tool2 = this.antlrTool;
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("cannot write expanded grammar file ");
            stringBuffer3.append(nameForExpandedGrammarFile);
            tool2.toolError(stringBuffer3.toString());
            return false;
        }
    }

    public String[] preprocessedArgList() {
        int i10 = this.nargs;
        String[] strArr = new String[i10];
        System.arraycopy(this.args, 0, strArr, 0, i10);
        this.args = strArr;
        return strArr;
    }
}
