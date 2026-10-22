package antlr;

/* loaded from: classes.dex */
class SynPredBlock extends AlternativeBlock {
    public SynPredBlock(Grammar grammar) {
        super(grammar);
    }

    @Override // antlr.AlternativeBlock, antlr.GrammarElement
    public void generate() {
        this.grammar.generator.gen(this);
    }

    @Override // antlr.AlternativeBlock, antlr.GrammarElement
    public Lookahead look(int i10) {
        return this.grammar.theLLkAnalyzer.look(i10, this);
    }

    @Override // antlr.AlternativeBlock, antlr.GrammarElement
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append("=>");
        return stringBuffer.toString();
    }

    public SynPredBlock(Grammar grammar, Token token) {
        super(grammar, token, false);
    }
}
