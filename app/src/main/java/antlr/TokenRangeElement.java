package antlr;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class TokenRangeElement extends AlternativeElement {
    protected int begin;
    protected String beginText;
    protected int end;
    protected String endText;
    String label;

    public TokenRangeElement(Grammar grammar, Token token, Token token2, int i10) {
        super(grammar, token, i10);
        this.begin = 0;
        this.end = 0;
        this.begin = this.grammar.tokenManager.getTokenSymbol(token.getText()).getTokenType();
        this.beginText = token.getText();
        this.end = this.grammar.tokenManager.getTokenSymbol(token2.getText()).getTokenType();
        this.endText = token2.getText();
        this.line = token.getLine();
    }

    @Override // antlr.GrammarElement
    public void generate() {
        this.grammar.generator.gen(this);
    }

    @Override // antlr.AlternativeElement
    public String getLabel() {
        return this.label;
    }

    @Override // antlr.GrammarElement
    public Lookahead look(int i10) {
        return this.grammar.theLLkAnalyzer.look(i10, this);
    }

    @Override // antlr.AlternativeElement
    public void setLabel(String str) {
        this.label = str;
    }

    @Override // antlr.GrammarElement
    public String toString() {
        if (this.label != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(" ");
            stringBuffer.append(this.label);
            stringBuffer.append(":");
            stringBuffer.append(this.beginText);
            stringBuffer.append("..");
            stringBuffer.append(this.endText);
            return stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(" ");
        stringBuffer2.append(this.beginText);
        stringBuffer2.append("..");
        stringBuffer2.append(this.endText);
        return stringBuffer2.toString();
    }
}
