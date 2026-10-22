package antlr;

import anet.channel.entity.EventType;
import antlr.collections.impl.BitSet;
import antlr.collections.impl.Vector;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.StringTokenizer;

/* loaded from: classes.dex */
public class Tool {
    protected static String literalsPrefix = "LITERAL_";
    protected static String outputDir = ".";
    protected static boolean upperCaseMangledLiterals = false;
    public static String version = "";
    protected String grammarFile;
    protected boolean hasError = false;
    boolean genDiagnostics = false;
    boolean genDocBook = false;
    boolean genHTML = false;

    /* renamed from: f */
    transient Reader f4240f = new InputStreamReader(System.in);
    protected NameSpace nameSpace = null;
    protected String namespaceAntlr = null;
    protected String namespaceStd = null;
    protected boolean genHashLines = true;
    protected boolean noConstructors = false;
    private BitSet cmdLineArgValid = new BitSet();
    ToolErrorHandler errorHandler = new DefaultToolErrorHandler(this);

    private static void help() {
        System.err.println("usage: java antlr.Tool [args] file.g");
        System.err.println("  -o outputDir       specify output directory where all output generated.");
        System.err.println("  -glib superGrammar specify location of supergrammar file.");
        System.err.println("  -debug             launch the ParseView debugger upon parser invocation.");
        System.err.println("  -html              generate a html file from your grammar.");
        System.err.println("  -docbook           generate a docbook sgml file from your grammar.");
        System.err.println("  -diagnostic        generate a textfile with diagnostics.");
        System.err.println("  -trace             have all rules call traceIn/traceOut.");
        System.err.println("  -traceLexer        have lexer rules call traceIn/traceOut.");
        System.err.println("  -traceParser       have parser rules call traceIn/traceOut.");
        System.err.println("  -traceTreeParser   have tree parser rules call traceIn/traceOut.");
        System.err.println("  -h|-help|--help    this message");
    }

    public static void main(String[] strArr) {
        System.err.println("ANTLR Parser Generator   Version 2.7.4   1989-2004 jGuru.com");
        version = Version.project_version;
        try {
            if (strArr.length == 0) {
                help();
                System.exit(1);
            }
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (strArr[i10].equals("-h") || strArr[i10].equals("-help") || strArr[i10].equals("--help")) {
                    help();
                    System.exit(1);
                }
            }
            new Tool().doEverything(strArr);
        } catch (Exception e10) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(System.getProperty("line.separator"));
            stringBuffer.append(System.getProperty("line.separator"));
            printStream.println(stringBuffer.toString());
            PrintStream printStream2 = System.err;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("#$%%*&@# internal error: ");
            stringBuffer2.append(e10.toString());
            printStream2.println(stringBuffer2.toString());
            System.err.println("[complain to nearest government official");
            System.err.println(" or send hate-mail to parrt@jguru.com;");
            PrintStream printStream3 = System.err;
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(" please send stack trace with report.]");
            stringBuffer3.append(System.getProperty("line.separator"));
            printStream3.println(stringBuffer3.toString());
            e10.printStackTrace();
        }
        System.exit(0);
    }

    public static Vector parseSeparatedList(String str, char c10) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, String.valueOf(c10));
        Vector vector = new Vector(10);
        while (stringTokenizer.hasMoreTokens()) {
            vector.appendElement(stringTokenizer.nextToken());
        }
        if (vector.size() == 0) {
            return null;
        }
        return vector;
    }

    protected void checkForInvalidArguments(String[] strArr, BitSet bitSet) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (!bitSet.member(i10)) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("invalid command-line argument: ");
                stringBuffer.append(strArr[i10]);
                stringBuffer.append("; ignored");
                warning(stringBuffer.toString());
            }
        }
    }

    public void copyFile(String str, String str2) {
        BufferedWriter bufferedWriter;
        File file = new File(str);
        File file2 = new File(str2);
        BufferedReader bufferedReader = null;
        try {
            if (file.exists() && file.isFile()) {
                if (file.canRead()) {
                    if (file2.exists()) {
                        if (file2.isFile()) {
                            new DataInputStream(System.in);
                            if (!file2.canWrite()) {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("FileCopy: destination file is unwriteable: ");
                                stringBuffer.append(str2);
                                throw new FileCopyException(stringBuffer.toString());
                            }
                        } else {
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append("FileCopy: destination is not a file: ");
                            stringBuffer2.append(str2);
                            throw new FileCopyException(stringBuffer2.toString());
                        }
                    } else {
                        File parent = parent(file2);
                        if (parent.exists()) {
                            if (!parent.canWrite()) {
                                StringBuffer stringBuffer3 = new StringBuffer();
                                stringBuffer3.append("FileCopy: destination directory is unwriteable: ");
                                stringBuffer3.append(str2);
                                throw new FileCopyException(stringBuffer3.toString());
                            }
                        } else {
                            StringBuffer stringBuffer4 = new StringBuffer();
                            stringBuffer4.append("FileCopy: destination directory doesn't exist: ");
                            stringBuffer4.append(str2);
                            throw new FileCopyException(stringBuffer4.toString());
                        }
                    }
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                    try {
                        bufferedWriter = new BufferedWriter(new FileWriter(file2));
                        try {
                            char[] cArr = new char[EventType.AUTH_FAIL];
                            while (true) {
                                int read = bufferedReader2.read(cArr, 0, EventType.AUTH_FAIL);
                                if (read == -1) {
                                    try {
                                        break;
                                    } catch (IOException unused) {
                                    }
                                } else {
                                    bufferedWriter.write(cArr, 0, read);
                                }
                            }
                            bufferedReader2.close();
                            try {
                                bufferedWriter.close();
                            } catch (IOException unused2) {
                            }
                        } catch (Throwable th) {
                            bufferedReader = bufferedReader2;
                            th = th;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (bufferedWriter != null) {
                                try {
                                    bufferedWriter.close();
                                } catch (IOException unused4) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        bufferedReader = bufferedReader2;
                        th = th2;
                        bufferedWriter = null;
                    }
                } else {
                    StringBuffer stringBuffer5 = new StringBuffer();
                    stringBuffer5.append("FileCopy: source file is unreadable: ");
                    stringBuffer5.append(str);
                    throw new FileCopyException(stringBuffer5.toString());
                }
            } else {
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append("FileCopy: no such source file: ");
                stringBuffer6.append(str);
                throw new FileCopyException(stringBuffer6.toString());
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter = null;
        }
    }

    public int doEverything(String[] strArr) {
        antlr.preprocessor.Tool tool = new antlr.preprocessor.Tool(this, strArr);
        boolean preprocess = tool.preprocess();
        String[] preprocessedArgList = tool.preprocessedArgList();
        processArguments(preprocessedArgList);
        if (!preprocess) {
            return 1;
        }
        this.f4240f = getGrammarReader();
        TokenBuffer tokenBuffer = new TokenBuffer(new ANTLRLexer(this.f4240f));
        LLkAnalyzer lLkAnalyzer = new LLkAnalyzer(this);
        MakeGrammar makeGrammar = new MakeGrammar(this, strArr, lLkAnalyzer);
        try {
            ANTLRParser aNTLRParser = new ANTLRParser(tokenBuffer, makeGrammar, this);
            aNTLRParser.setFilename(this.grammarFile);
            aNTLRParser.grammar();
            if (hasError()) {
                fatalError("Exiting due to errors.");
            }
            checkForInvalidArguments(preprocessedArgList, this.cmdLineArgValid);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("antlr.");
            stringBuffer.append(getLanguage(makeGrammar));
            stringBuffer.append("CodeGenerator");
            String stringBuffer2 = stringBuffer.toString();
            try {
                CodeGenerator codeGenerator = (CodeGenerator) Class.forName(stringBuffer2).newInstance();
                codeGenerator.setBehavior(makeGrammar);
                codeGenerator.setAnalyzer(lLkAnalyzer);
                codeGenerator.setTool(this);
                codeGenerator.gen();
                return 0;
            } catch (ClassNotFoundException unused) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("Cannot instantiate code-generator: ");
                stringBuffer3.append(stringBuffer2);
                panic(stringBuffer3.toString());
                return 0;
            } catch (IllegalAccessException unused2) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("code-generator class '");
                stringBuffer4.append(stringBuffer2);
                stringBuffer4.append("' is not accessible");
                panic(stringBuffer4.toString());
                return 0;
            } catch (IllegalArgumentException unused3) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("Cannot instantiate code-generator: ");
                stringBuffer5.append(stringBuffer2);
                panic(stringBuffer5.toString());
                return 0;
            } catch (InstantiationException unused4) {
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append("Cannot instantiate code-generator: ");
                stringBuffer6.append(stringBuffer2);
                panic(stringBuffer6.toString());
                return 0;
            }
        } catch (RecognitionException e10) {
            StringBuffer stringBuffer7 = new StringBuffer();
            stringBuffer7.append("Unhandled parser error: ");
            stringBuffer7.append(e10.getMessage());
            fatalError(stringBuffer7.toString());
            return 0;
        } catch (TokenStreamException e11) {
            StringBuffer stringBuffer8 = new StringBuffer();
            stringBuffer8.append("TokenStreamException: ");
            stringBuffer8.append(e11.getMessage());
            fatalError(stringBuffer8.toString());
            return 0;
        }
    }

    public void doEverythingWrapper(String[] strArr) {
        System.exit(doEverything(strArr));
    }

    public void error(String str) {
        this.hasError = true;
        PrintStream printStream = System.err;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error: ");
        stringBuffer.append(str);
        printStream.println(stringBuffer.toString());
    }

    public Object factory(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Exception unused) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Can't create an object of type ");
            stringBuffer.append(str);
            warning(stringBuffer.toString());
            return null;
        }
    }

    public void fatalError(String str) {
        System.err.println(str);
        System.exit(1);
    }

    public String fileMinusPath(String str) {
        int lastIndexOf = str.lastIndexOf(System.getProperty("file.separator"));
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(lastIndexOf + 1);
    }

    public boolean getGenHashLines() {
        return this.genHashLines;
    }

    public String getGrammarFile() {
        return this.grammarFile;
    }

    public Reader getGrammarReader() {
        try {
            if (this.grammarFile == null) {
                return null;
            }
            return new BufferedReader(new FileReader(this.grammarFile));
        } catch (IOException unused) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("cannot open grammar file ");
            stringBuffer.append(this.grammarFile);
            fatalError(stringBuffer.toString());
            return null;
        }
    }

    public String getLanguage(MakeGrammar makeGrammar) {
        if (this.genDiagnostics) {
            return "Diagnostic";
        }
        if (this.genHTML) {
            return "HTML";
        }
        if (this.genDocBook) {
            return "DocBook";
        }
        return makeGrammar.language;
    }

    public String getLiteralsPrefix() {
        return literalsPrefix;
    }

    public NameSpace getNameSpace() {
        return this.nameSpace;
    }

    public String getNamespaceAntlr() {
        return this.namespaceAntlr;
    }

    public String getNamespaceStd() {
        return this.namespaceStd;
    }

    public String getOutputDirectory() {
        return outputDir;
    }

    public boolean getUpperCaseMangledLiterals() {
        return upperCaseMangledLiterals;
    }

    public boolean hasError() {
        return this.hasError;
    }

    public PrintWriter openOutputFile(String str) {
        if (outputDir != ".") {
            File file = new File(outputDir);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(outputDir);
        stringBuffer.append(System.getProperty("file.separator"));
        stringBuffer.append(str);
        return new PrintWriter(new PreservingFileWriter(stringBuffer.toString()));
    }

    public void panic() {
        fatalError("panic");
    }

    public File parent(File file) {
        String parent = file.getParent();
        if (parent == null) {
            if (file.isAbsolute()) {
                return new File(File.separator);
            }
            return new File(System.getProperty("user.dir"));
        }
        return new File(parent);
    }

    public String pathToFile(String str) {
        int lastIndexOf = str.lastIndexOf(System.getProperty("file.separator"));
        if (lastIndexOf == -1) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(".");
            stringBuffer.append(System.getProperty("file.separator"));
            return stringBuffer.toString();
        }
        return str.substring(0, lastIndexOf + 1);
    }

    protected void processArguments(String[] strArr) {
        int i10 = 0;
        while (i10 < strArr.length) {
            if (strArr[i10].equals("-diagnostic")) {
                this.genDiagnostics = true;
                this.genHTML = false;
                setArgOK(i10);
            } else if (strArr[i10].equals("-o")) {
                setArgOK(i10);
                int i11 = i10 + 1;
                if (i11 >= strArr.length) {
                    error("missing output directory with -o option; ignoring");
                } else {
                    setOutputDirectory(strArr[i11]);
                    setArgOK(i11);
                    i10 = i11;
                }
            } else if (strArr[i10].equals("-html")) {
                this.genHTML = true;
                this.genDiagnostics = false;
                setArgOK(i10);
            } else if (strArr[i10].equals("-docbook")) {
                this.genDocBook = true;
                this.genDiagnostics = false;
                setArgOK(i10);
            } else if (strArr[i10].charAt(0) != '-') {
                this.grammarFile = strArr[i10];
                setArgOK(i10);
            }
            i10++;
        }
    }

    public void reportException(Exception exc, String str) {
        String stringBuffer;
        PrintStream printStream = System.err;
        if (str == null) {
            stringBuffer = exc.getMessage();
        } else {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(str);
            stringBuffer2.append(": ");
            stringBuffer2.append(exc.getMessage());
            stringBuffer = stringBuffer2.toString();
        }
        printStream.println(stringBuffer);
    }

    public void reportProgress(String str) {
        System.out.println(str);
    }

    public void setArgOK(int i10) {
        this.cmdLineArgValid.add(i10);
    }

    public void setFileLineFormatter(FileLineFormatter fileLineFormatter) {
        FileLineFormatter.setFormatter(fileLineFormatter);
    }

    public void setNameSpace(String str) {
        if (this.nameSpace == null) {
            this.nameSpace = new NameSpace(StringUtils.stripFrontBack(str, "\"", "\""));
        }
    }

    public void setOutputDirectory(String str) {
        outputDir = str;
    }

    public void toolError(String str) {
        PrintStream printStream = System.err;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error: ");
        stringBuffer.append(str);
        printStream.println(stringBuffer.toString());
    }

    public void warning(String str) {
        PrintStream printStream = System.err;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("warning: ");
        stringBuffer.append(str);
        printStream.println(stringBuffer.toString());
    }

    public void panic(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("panic: ");
        stringBuffer.append(str);
        fatalError(stringBuffer.toString());
    }

    public void warning(String str, String str2, int i10, int i11) {
        PrintStream printStream = System.err;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(FileLineFormatter.getFormatter().getFormatString(str2, i10, i11));
        stringBuffer.append("warning:");
        stringBuffer.append(str);
        printStream.println(stringBuffer.toString());
    }

    public void error(String str, String str2, int i10, int i11) {
        this.hasError = true;
        PrintStream printStream = System.err;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(FileLineFormatter.getFormatter().getFormatString(str2, i10, i11));
        stringBuffer.append(str);
        printStream.println(stringBuffer.toString());
    }

    public void warning(String[] strArr, String str, int i10, int i11) {
        if (strArr == null || strArr.length == 0) {
            panic("bad multi-line message to Tool.warning");
        }
        PrintStream printStream = System.err;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(FileLineFormatter.getFormatter().getFormatString(str, i10, i11));
        stringBuffer.append("warning:");
        stringBuffer.append(strArr[0]);
        printStream.println(stringBuffer.toString());
        for (int i12 = 1; i12 < strArr.length; i12++) {
            PrintStream printStream2 = System.err;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(FileLineFormatter.getFormatter().getFormatString(str, i10, i11));
            stringBuffer2.append("    ");
            stringBuffer2.append(strArr[i12]);
            printStream2.println(stringBuffer2.toString());
        }
    }
}
