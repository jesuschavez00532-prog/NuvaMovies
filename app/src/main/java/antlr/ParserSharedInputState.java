package antlr;

/* loaded from: classes.dex */
public class ParserSharedInputState {
    protected String filename;
    public int guessing = 0;
    protected TokenBuffer input;

    public void reset() {
        this.guessing = 0;
        this.filename = null;
        this.input.reset();
    }
}
