package antlr;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class BlockWithImpliedExitPath extends AlternativeBlock {
    protected Lookahead[] exitCache;
    protected int exitLookaheadDepth;

    public BlockWithImpliedExitPath(Grammar grammar) {
        super(grammar);
        this.exitCache = new Lookahead[this.grammar.maxk + 1];
    }

    public BlockWithImpliedExitPath(Grammar grammar, Token token) {
        super(grammar, token, false);
        this.exitCache = new Lookahead[this.grammar.maxk + 1];
    }
}
