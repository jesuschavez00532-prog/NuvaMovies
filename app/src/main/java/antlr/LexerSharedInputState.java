package antlr;

import java.io.InputStream;
import java.io.Reader;

/* loaded from: classes.dex */
public class LexerSharedInputState {
    protected int column;
    protected String filename;
    public int guessing;
    protected InputBuffer input;
    protected int line;
    protected int tokenStartColumn;
    protected int tokenStartLine;

    public LexerSharedInputState(InputBuffer inputBuffer) {
        this.column = 1;
        this.line = 1;
        this.tokenStartColumn = 1;
        this.tokenStartLine = 1;
        this.guessing = 0;
        this.input = inputBuffer;
    }

    public void reset() {
        this.column = 1;
        this.line = 1;
        this.tokenStartColumn = 1;
        this.tokenStartLine = 1;
        this.guessing = 0;
        this.filename = null;
        this.input.reset();
    }

    public LexerSharedInputState(InputStream inputStream) {
        this(new ByteBuffer(inputStream));
    }

    public LexerSharedInputState(Reader reader) {
        this(new CharBuffer(reader));
    }
}
