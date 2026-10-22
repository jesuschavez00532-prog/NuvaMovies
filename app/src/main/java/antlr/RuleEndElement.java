package antlr;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class RuleEndElement extends BlockEndElement {
    protected Lookahead[] cache;
    protected boolean noFOLLOW;

    public RuleEndElement(Grammar grammar) {
        super(grammar);
        this.cache = new Lookahead[grammar.maxk + 1];
    }

    @Override // antlr.BlockEndElement, antlr.GrammarElement
    public Lookahead look(int i10) {
        return this.grammar.theLLkAnalyzer.look(i10, this);
    }

    @Override // antlr.BlockEndElement, antlr.GrammarElement
    public String toString() {
        return "";
    }
}
