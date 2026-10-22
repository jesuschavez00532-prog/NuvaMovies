package antlr.preprocessor;

import antlr.collections.impl.IndexedVector;
import java.io.PrintWriter;
import java.util.Enumeration;

/* loaded from: classes.dex */
public class GrammarFile {
    protected String fileName;
    protected IndexedVector options;
    protected antlr.Tool tool;
    protected String headerAction = "";
    protected boolean expanded = false;
    protected IndexedVector grammars = new IndexedVector();

    public GrammarFile(antlr.Tool tool, String str) {
        this.fileName = str;
        this.tool = tool;
    }

    public void addGrammar(Grammar grammar) {
        this.grammars.appendElement(grammar.getName(), grammar);
    }

    public void addHeaderAction(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.headerAction);
        stringBuffer.append(str);
        stringBuffer.append(System.getProperty("line.separator"));
        this.headerAction = stringBuffer.toString();
    }

    public void generateExpandedFile() {
        if (!this.expanded) {
            return;
        }
        PrintWriter openOutputFile = this.tool.openOutputFile(nameForExpandedGrammarFile(getName()));
        openOutputFile.println(toString());
        openOutputFile.close();
    }

    public IndexedVector getGrammars() {
        return this.grammars;
    }

    public String getName() {
        return this.fileName;
    }

    public String nameForExpandedGrammarFile(String str) {
        if (this.expanded) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("expanded");
            stringBuffer.append(this.tool.fileMinusPath(str));
            return stringBuffer.toString();
        }
        return str;
    }

    public void setExpanded(boolean z10) {
        this.expanded = z10;
    }

    public void setOptions(IndexedVector indexedVector) {
        this.options = indexedVector;
    }

    public String toString() {
        String str = this.headerAction;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        IndexedVector indexedVector = this.options;
        if (indexedVector != null) {
            str2 = Hierarchy.optionsToString(indexedVector);
        }
        StringBuffer stringBuffer = new StringBuffer(10000);
        stringBuffer.append(str);
        stringBuffer.append(str2);
        Enumeration elements = this.grammars.elements();
        while (elements.hasMoreElements()) {
            stringBuffer.append(((Grammar) elements.nextElement()).toString());
        }
        return stringBuffer.toString();
    }
}
