package antlr;

import com.raizlabs.android.dbflow.sql.language.Operator;

/* loaded from: classes.dex */
class ActionElement extends AlternativeElement {
    protected String actionText;
    protected boolean isSemPred;

    public ActionElement(Grammar grammar, Token token) {
        super(grammar);
        this.isSemPred = false;
        this.actionText = token.getText();
        this.line = token.getLine();
        this.column = token.getColumn();
    }

    @Override // antlr.GrammarElement
    public void generate() {
        this.grammar.generator.gen(this);
    }

    @Override // antlr.GrammarElement
    public Lookahead look(int i10) {
        return this.grammar.theLLkAnalyzer.look(i10, this);
    }

    @Override // antlr.GrammarElement
    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" ");
        stringBuffer.append(this.actionText);
        if (this.isSemPred) {
            str = Operator.Operation.EMPTY_PARAM;
        } else {
            str = "";
        }
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
