package antlr;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class GrammarElement {
    public static final int AUTO_GEN_BANG = 3;
    public static final int AUTO_GEN_CARET = 2;
    public static final int AUTO_GEN_NONE = 1;
    protected int column;
    protected Grammar grammar;
    protected int line;

    public GrammarElement(Grammar grammar) {
        this.grammar = grammar;
        this.line = -1;
        this.column = -1;
    }

    public void generate() {
    }

    public int getColumn() {
        return this.column;
    }

    public int getLine() {
        return this.line;
    }

    public Lookahead look(int i10) {
        return null;
    }

    public abstract String toString();

    public GrammarElement(Grammar grammar, Token token) {
        this.grammar = grammar;
        this.line = token.getLine();
        this.column = token.getColumn();
    }
}
