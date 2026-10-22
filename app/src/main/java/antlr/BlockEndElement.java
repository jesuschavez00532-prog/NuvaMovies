package antlr;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class BlockEndElement extends AlternativeElement {
    protected AlternativeBlock block;
    protected boolean[] lock;

    public BlockEndElement(Grammar grammar) {
        super(grammar);
        this.lock = new boolean[grammar.maxk + 1];
    }

    @Override // antlr.GrammarElement
    public Lookahead look(int i10) {
        return this.grammar.theLLkAnalyzer.look(i10, this);
    }

    @Override // antlr.GrammarElement
    public String toString() {
        return "";
    }
}
