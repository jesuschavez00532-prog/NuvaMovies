package antlr;

import antlr.collections.AST;
import antlr.collections.impl.BitSet;
import java.io.PrintStream;

/* loaded from: classes.dex */
public class TreeParser {
    public static ASTNULLType ASTNULL = new ASTNULLType();
    protected AST _retTree;
    protected AST returnAST;
    protected String[] tokenNames;
    protected ASTFactory astFactory = new ASTFactory();
    protected int traceDepth = 0;
    protected TreeParserSharedInputState inputState = new TreeParserSharedInputState();

    public static void panic() {
        System.err.println("TreeWalker: panic");
        System.exit(1);
    }

    public AST getAST() {
        return this.returnAST;
    }

    public ASTFactory getASTFactory() {
        return this.astFactory;
    }

    public String getTokenName(int i10) {
        return this.tokenNames[i10];
    }

    public String[] getTokenNames() {
        return this.tokenNames;
    }

    protected void match(AST ast, int i10) {
        if (ast == null || ast == ASTNULL || ast.getType() != i10) {
            throw new MismatchedTokenException(getTokenNames(), ast, i10, false);
        }
    }

    protected void matchNot(AST ast, int i10) {
        if (ast != null && ast != ASTNULL && ast.getType() != i10) {
        } else {
            throw new MismatchedTokenException(getTokenNames(), ast, i10, true);
        }
    }

    public void reportError(RecognitionException recognitionException) {
        System.err.println(recognitionException.toString());
    }

    public void reportWarning(String str) {
        PrintStream printStream = System.err;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("warning: ");
        stringBuffer.append(str);
        printStream.println(stringBuffer.toString());
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

    public void traceIn(String str, AST ast) {
        String str2;
        String str3;
        this.traceDepth++;
        traceIndent();
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("> ");
        stringBuffer.append(str);
        stringBuffer.append("(");
        if (ast != null) {
            str2 = ast.toString();
        } else {
            str2 = "null";
        }
        stringBuffer.append(str2);
        stringBuffer.append(")");
        if (this.inputState.guessing > 0) {
            str3 = " [guessing]";
        } else {
            str3 = "";
        }
        stringBuffer.append(str3);
        printStream.println(stringBuffer.toString());
    }

    public void traceIndent() {
        for (int i10 = 0; i10 < this.traceDepth; i10++) {
            System.out.print(" ");
        }
    }

    public void traceOut(String str, AST ast) {
        String str2;
        String str3;
        traceIndent();
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("< ");
        stringBuffer.append(str);
        stringBuffer.append("(");
        if (ast != null) {
            str2 = ast.toString();
        } else {
            str2 = "null";
        }
        stringBuffer.append(str2);
        stringBuffer.append(")");
        if (this.inputState.guessing > 0) {
            str3 = " [guessing]";
        } else {
            str3 = "";
        }
        stringBuffer.append(str3);
        printStream.println(stringBuffer.toString());
        this.traceDepth--;
    }

    public void reportError(String str) {
        PrintStream printStream = System.err;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error: ");
        stringBuffer.append(str);
        printStream.println(stringBuffer.toString());
    }

    public void match(AST ast, BitSet bitSet) {
        if (ast == null || ast == ASTNULL || !bitSet.member(ast.getType())) {
            throw new MismatchedTokenException(getTokenNames(), ast, bitSet, false);
        }
    }
}
