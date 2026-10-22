package antlr;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class TreeElement extends AlternativeBlock {
    GrammarAtom root;

    public TreeElement(Grammar grammar, Token token) {
        super(grammar, token, false);
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
        stringBuffer.append(" #(");
        stringBuffer.append(this.root);
        String stringBuffer2 = stringBuffer.toString();
        for (AlternativeElement alternativeElement = ((Alternative) this.alternatives.elementAt(0)).head; alternativeElement != null; alternativeElement = alternativeElement.next) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(stringBuffer2);
            stringBuffer3.append(alternativeElement);
            stringBuffer2 = stringBuffer3.toString();
        }
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append(stringBuffer2);
        stringBuffer4.append(" )");
        return stringBuffer4.toString();
    }
}
