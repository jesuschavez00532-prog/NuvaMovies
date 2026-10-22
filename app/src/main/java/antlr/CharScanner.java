package antlr;

import antlr.collections.impl.BitSet;
import java.io.PrintStream;
import java.util.Hashtable;

/* loaded from: classes.dex */
public abstract class CharScanner implements TokenStream {
    public static final char EOF_CHAR = 65535;
    static final char NO_CHAR = 0;
    protected Token _returnToken;
    protected boolean caseSensitive;
    protected boolean caseSensitiveLiterals;
    protected boolean commitToPath;
    protected ANTLRHashString hashString;
    protected LexerSharedInputState inputState;
    protected Hashtable literals;
    protected boolean saveConsumedInput;
    protected int tabsize;
    protected ANTLRStringBuffer text;
    protected Class tokenObjectClass;
    protected int traceDepth;

    public CharScanner() {
        this.saveConsumedInput = true;
        this.caseSensitive = true;
        this.caseSensitiveLiterals = true;
        this.tabsize = 8;
        this._returnToken = null;
        this.commitToPath = false;
        this.traceDepth = 0;
        this.text = new ANTLRStringBuffer();
        this.hashString = new ANTLRHashString(this);
        setTokenObjectClass("antlr.CommonToken");
    }

    /* renamed from: LA */
    public char mo4814LA(int i10) {
        if (this.caseSensitive) {
            return this.inputState.input.mo4815LA(i10);
        }
        return toLower(this.inputState.input.mo4815LA(i10));
    }

    public void append(char c10) {
        if (this.saveConsumedInput) {
            this.text.append(c10);
        }
    }

    public void commit() {
        this.inputState.input.commit();
    }

    public void consume() {
        if (this.inputState.guessing == 0) {
            char mo4814LA = mo4814LA(1);
            if (this.caseSensitive) {
                append(mo4814LA);
            } else {
                append(this.inputState.input.mo4815LA(1));
            }
            if (mo4814LA == '\t') {
                tab();
            } else {
                this.inputState.column++;
            }
        }
        this.inputState.input.consume();
    }

    public void consumeUntil(int i10) {
        while (mo4814LA(1) != 65535 && mo4814LA(1) != i10) {
            consume();
        }
    }

    public boolean getCaseSensitive() {
        return this.caseSensitive;
    }

    public final boolean getCaseSensitiveLiterals() {
        return this.caseSensitiveLiterals;
    }

    public int getColumn() {
        return this.inputState.column;
    }

    public boolean getCommitToPath() {
        return this.commitToPath;
    }

    public String getFilename() {
        return this.inputState.filename;
    }

    public InputBuffer getInputBuffer() {
        return this.inputState.input;
    }

    public LexerSharedInputState getInputState() {
        return this.inputState;
    }

    public int getLine() {
        return this.inputState.line;
    }

    public int getTabSize() {
        return this.tabsize;
    }

    public String getText() {
        return this.text.toString();
    }

    public Token getTokenObject() {
        return this._returnToken;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Token makeToken(int i10) {
        try {
            Token token = (Token) this.tokenObjectClass.newInstance();
            token.setType(i10);
            token.setColumn(this.inputState.tokenStartColumn);
            token.setLine(this.inputState.tokenStartLine);
            return token;
        } catch (IllegalAccessException unused) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Token class is not accessible");
            stringBuffer.append(this.tokenObjectClass);
            panic(stringBuffer.toString());
            return Token.badToken;
        } catch (InstantiationException unused2) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("can't instantiate token: ");
            stringBuffer2.append(this.tokenObjectClass);
            panic(stringBuffer2.toString());
            return Token.badToken;
        }
    }

    public int mark() {
        return this.inputState.input.mark();
    }

    public void match(char c10) {
        if (mo4814LA(1) == c10) {
            consume();
            return;
        }
        throw new MismatchedCharException(mo4814LA(1), c10, false, this);
    }

    public void matchNot(char c10) {
        if (mo4814LA(1) != c10) {
            consume();
            return;
        }
        throw new MismatchedCharException(mo4814LA(1), c10, true, this);
    }

    public void matchRange(char c10, char c11) {
        if (mo4814LA(1) >= c10 && mo4814LA(1) <= c11) {
            consume();
            return;
        }
        throw new MismatchedCharException(mo4814LA(1), c10, c11, false, this);
    }

    public void newline() {
        LexerSharedInputState lexerSharedInputState = this.inputState;
        lexerSharedInputState.line++;
        lexerSharedInputState.column = 1;
    }

    public void panic() {
        System.err.println("CharScanner: panic");
        System.exit(1);
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

    public void resetText() {
        this.text.setLength(0);
        LexerSharedInputState lexerSharedInputState = this.inputState;
        lexerSharedInputState.tokenStartColumn = lexerSharedInputState.column;
        lexerSharedInputState.tokenStartLine = lexerSharedInputState.line;
    }

    public void rewind(int i10) {
        this.inputState.input.rewind(i10);
    }

    public void setCaseSensitive(boolean z10) {
        this.caseSensitive = z10;
    }

    public void setColumn(int i10) {
        this.inputState.column = i10;
    }

    public void setCommitToPath(boolean z10) {
        this.commitToPath = z10;
    }

    public void setFilename(String str) {
        this.inputState.filename = str;
    }

    public void setInputState(LexerSharedInputState lexerSharedInputState) {
        this.inputState = lexerSharedInputState;
    }

    public void setLine(int i10) {
        this.inputState.line = i10;
    }

    public void setTabSize(int i10) {
        this.tabsize = i10;
    }

    public void setText(String str) {
        resetText();
        this.text.append(str);
    }

    public void setTokenObjectClass(String str) {
        try {
            this.tokenObjectClass = Class.forName(str);
        } catch (ClassNotFoundException unused) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("ClassNotFoundException: ");
            stringBuffer.append(str);
            panic(stringBuffer.toString());
        }
    }

    public void tab() {
        int column = getColumn() - 1;
        int i10 = this.tabsize;
        setColumn((((column / i10) + 1) * i10) + 1);
    }

    public int testLiteralsTable(int i10) {
        this.hashString.setBuffer(this.text.getBuffer(), this.text.length());
        Integer num = (Integer) this.literals.get(this.hashString);
        return num != null ? num.intValue() : i10;
    }

    public char toLower(char c10) {
        return Character.toLowerCase(c10);
    }

    public void traceIn(String str) {
        this.traceDepth++;
        traceIndent();
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("> lexer ");
        stringBuffer.append(str);
        stringBuffer.append("; c==");
        stringBuffer.append(mo4814LA(1));
        printStream.println(stringBuffer.toString());
    }

    public void traceIndent() {
        for (int i10 = 0; i10 < this.traceDepth; i10++) {
            System.out.print(" ");
        }
    }

    public void traceOut(String str) {
        traceIndent();
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("< lexer ");
        stringBuffer.append(str);
        stringBuffer.append("; c==");
        stringBuffer.append(mo4814LA(1));
        printStream.println(stringBuffer.toString());
        this.traceDepth--;
    }

    public void uponEOF() {
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

    public void append(String str) {
        if (this.saveConsumedInput) {
            this.text.append(str);
        }
    }

    public void consumeUntil(BitSet bitSet) {
        while (mo4814LA(1) != 65535 && !bitSet.member(mo4814LA(1))) {
            consume();
        }
    }

    public void panic(String str) {
        PrintStream printStream = System.err;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("CharScanner; panic: ");
        stringBuffer.append(str);
        printStream.println(stringBuffer.toString());
        System.exit(1);
    }

    public void match(BitSet bitSet) {
        if (bitSet.member(mo4814LA(1))) {
            consume();
            return;
        }
        throw new MismatchedCharException(mo4814LA(1), bitSet, false, this);
    }

    public int testLiteralsTable(String str, int i10) {
        Integer num = (Integer) this.literals.get(new ANTLRHashString(str, this));
        return num != null ? num.intValue() : i10;
    }

    public void match(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (mo4814LA(1) == str.charAt(i10)) {
                consume();
            } else {
                throw new MismatchedCharException(mo4814LA(1), str.charAt(i10), false, this);
            }
        }
    }

    public CharScanner(InputBuffer inputBuffer) {
        this();
        this.inputState = new LexerSharedInputState(inputBuffer);
    }

    public CharScanner(LexerSharedInputState lexerSharedInputState) {
        this();
        this.inputState = lexerSharedInputState;
    }
}
