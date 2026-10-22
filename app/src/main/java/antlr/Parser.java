package antlr;

import antlr.collections.AST;
import antlr.collections.impl.BitSet;
import antlr.debug.MessageListener;
import antlr.debug.ParserListener;
import antlr.debug.ParserMatchListener;
import antlr.debug.ParserTokenListener;
import antlr.debug.SemanticPredicateListener;
import antlr.debug.SyntacticPredicateListener;
import antlr.debug.TraceListener;
import java.io.PrintStream;
import java.util.Hashtable;

/* loaded from: classes.dex */
public abstract class Parser {
    protected ASTFactory astFactory;
    private boolean ignoreInvalidDebugCalls;
    protected ParserSharedInputState inputState;
    protected AST returnAST;
    protected String[] tokenNames;
    protected Hashtable tokenTypeToASTClassMap;
    protected int traceDepth;

    public Parser() {
        this(new ParserSharedInputState());
    }

    public static void panic() {
        System.err.println("Parser: panic");
        System.exit(1);
    }

    /* renamed from: LA */
    public abstract int mo4816LA(int i10);

    /* renamed from: LT */
    public abstract Token mo4817LT(int i10);

    public void addMessageListener(MessageListener messageListener) {
        if (this.ignoreInvalidDebugCalls) {
        } else {
            throw new IllegalArgumentException("addMessageListener() is only valid if parser built for debugging");
        }
    }

    public void addParserListener(ParserListener parserListener) {
        if (this.ignoreInvalidDebugCalls) {
        } else {
            throw new IllegalArgumentException("addParserListener() is only valid if parser built for debugging");
        }
    }

    public void addParserMatchListener(ParserMatchListener parserMatchListener) {
        if (this.ignoreInvalidDebugCalls) {
        } else {
            throw new IllegalArgumentException("addParserMatchListener() is only valid if parser built for debugging");
        }
    }

    public void addParserTokenListener(ParserTokenListener parserTokenListener) {
        if (this.ignoreInvalidDebugCalls) {
        } else {
            throw new IllegalArgumentException("addParserTokenListener() is only valid if parser built for debugging");
        }
    }

    public void addSemanticPredicateListener(SemanticPredicateListener semanticPredicateListener) {
        if (this.ignoreInvalidDebugCalls) {
        } else {
            throw new IllegalArgumentException("addSemanticPredicateListener() is only valid if parser built for debugging");
        }
    }

    public void addSyntacticPredicateListener(SyntacticPredicateListener syntacticPredicateListener) {
        if (this.ignoreInvalidDebugCalls) {
        } else {
            throw new IllegalArgumentException("addSyntacticPredicateListener() is only valid if parser built for debugging");
        }
    }

    public void addTraceListener(TraceListener traceListener) {
        if (this.ignoreInvalidDebugCalls) {
        } else {
            throw new IllegalArgumentException("addTraceListener() is only valid if parser built for debugging");
        }
    }

    public abstract void consume();

    public void consumeUntil(int i10) {
        while (mo4816LA(1) != 1 && mo4816LA(1) != i10) {
            consume();
        }
    }

    protected void defaultDebuggingSetup(TokenStream tokenStream, TokenBuffer tokenBuffer) {
    }

    public AST getAST() {
        return this.returnAST;
    }

    public ASTFactory getASTFactory() {
        return this.astFactory;
    }

    public String getFilename() {
        return this.inputState.filename;
    }

    public ParserSharedInputState getInputState() {
        return this.inputState;
    }

    public String getTokenName(int i10) {
        return this.tokenNames[i10];
    }

    public String[] getTokenNames() {
        return this.tokenNames;
    }

    public Hashtable getTokenTypeToASTClassMap() {
        return this.tokenTypeToASTClassMap;
    }

    public boolean isDebugMode() {
        return false;
    }

    public int mark() {
        return this.inputState.input.mark();
    }

    public void match(int i10) {
        if (mo4816LA(1) == i10) {
            consume();
            return;
        }
        throw new MismatchedTokenException(this.tokenNames, mo4817LT(1), i10, false, getFilename());
    }

    public void matchNot(int i10) {
        if (mo4816LA(1) != i10) {
            consume();
            return;
        }
        throw new MismatchedTokenException(this.tokenNames, mo4817LT(1), i10, true, getFilename());
    }

    public void removeMessageListener(MessageListener messageListener) {
        if (this.ignoreInvalidDebugCalls) {
        } else {
            throw new RuntimeException("removeMessageListener() is only valid if parser built for debugging");
        }
    }

    public void removeParserListener(ParserListener parserListener) {
        if (this.ignoreInvalidDebugCalls) {
        } else {
            throw new RuntimeException("removeParserListener() is only valid if parser built for debugging");
        }
    }

    public void removeParserMatchListener(ParserMatchListener parserMatchListener) {
        if (this.ignoreInvalidDebugCalls) {
        } else {
            throw new RuntimeException("removeParserMatchListener() is only valid if parser built for debugging");
        }
    }

    public void removeParserTokenListener(ParserTokenListener parserTokenListener) {
        if (this.ignoreInvalidDebugCalls) {
        } else {
            throw new RuntimeException("removeParserTokenListener() is only valid if parser built for debugging");
        }
    }

    public void removeSemanticPredicateListener(SemanticPredicateListener semanticPredicateListener) {
        if (this.ignoreInvalidDebugCalls) {
        } else {
            throw new IllegalArgumentException("removeSemanticPredicateListener() is only valid if parser built for debugging");
        }
    }

    public void removeSyntacticPredicateListener(SyntacticPredicateListener syntacticPredicateListener) {
        if (this.ignoreInvalidDebugCalls) {
        } else {
            throw new IllegalArgumentException("removeSyntacticPredicateListener() is only valid if parser built for debugging");
        }
    }

    public void removeTraceListener(TraceListener traceListener) {
        if (this.ignoreInvalidDebugCalls) {
        } else {
            throw new RuntimeException("removeTraceListener() is only valid if parser built for debugging");
        }
    }

    public void reportError(RecognitionException recognitionException) {
        System.err.println(recognitionException);
    }

    public void reportWarning(String str) {
        if (getFilename() == null) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("warning: ");
            stringBuffer.append(str);
            printStream.println(stringBuffer.toString());
            return;
        }
        PrintStream printStream2 = System.err;
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(getFilename());
        stringBuffer2.append(": warning: ");
        stringBuffer2.append(str);
        printStream2.println(stringBuffer2.toString());
    }

    public void rewind(int i10) {
        this.inputState.input.rewind(i10);
    }

    public void setASTFactory(ASTFactory aSTFactory) {
        this.astFactory = aSTFactory;
    }

    public void setASTNodeClass(String str) {
        this.astFactory.setASTNodeType(str);
    }

    public void setASTNodeType(String str) {
        setASTNodeClass(str);
    }

    public void setDebugMode(boolean z10) {
        if (this.ignoreInvalidDebugCalls) {
        } else {
            throw new RuntimeException("setDebugMode() only valid if parser built for debugging");
        }
    }

    public void setFilename(String str) {
        this.inputState.filename = str;
    }

    public void setIgnoreInvalidDebugCalls(boolean z10) {
        this.ignoreInvalidDebugCalls = z10;
    }

    public void setInputState(ParserSharedInputState parserSharedInputState) {
        this.inputState = parserSharedInputState;
    }

    public void setTokenBuffer(TokenBuffer tokenBuffer) {
        this.inputState.input = tokenBuffer;
    }

    public void traceIn(String str) {
        String str2;
        this.traceDepth++;
        traceIndent();
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("> ");
        stringBuffer.append(str);
        stringBuffer.append("; LA(1)==");
        stringBuffer.append(mo4817LT(1).getText());
        if (this.inputState.guessing > 0) {
            str2 = " [guessing]";
        } else {
            str2 = "";
        }
        stringBuffer.append(str2);
        printStream.println(stringBuffer.toString());
    }

    public void traceIndent() {
        for (int i10 = 0; i10 < this.traceDepth; i10++) {
            System.out.print(" ");
        }
    }

    public void traceOut(String str) {
        String str2;
        traceIndent();
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("< ");
        stringBuffer.append(str);
        stringBuffer.append("; LA(1)==");
        stringBuffer.append(mo4817LT(1).getText());
        if (this.inputState.guessing > 0) {
            str2 = " [guessing]";
        } else {
            str2 = "";
        }
        stringBuffer.append(str2);
        printStream.println(stringBuffer.toString());
        this.traceDepth--;
    }

    public Parser(ParserSharedInputState parserSharedInputState) {
        this.astFactory = null;
        this.tokenTypeToASTClassMap = null;
        this.ignoreInvalidDebugCalls = false;
        this.traceDepth = 0;
        this.inputState = parserSharedInputState;
    }

    public void reportError(String str) {
        if (getFilename() == null) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("error: ");
            stringBuffer.append(str);
            printStream.println(stringBuffer.toString());
            return;
        }
        PrintStream printStream2 = System.err;
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(getFilename());
        stringBuffer2.append(": error: ");
        stringBuffer2.append(str);
        printStream2.println(stringBuffer2.toString());
    }

    public void consumeUntil(BitSet bitSet) {
        while (mo4816LA(1) != 1 && !bitSet.member(mo4816LA(1))) {
            consume();
        }
    }

    public void match(BitSet bitSet) {
        if (bitSet.member(mo4816LA(1))) {
            consume();
            return;
        }
        throw new MismatchedTokenException(this.tokenNames, mo4817LT(1), bitSet, false, getFilename());
    }
}
