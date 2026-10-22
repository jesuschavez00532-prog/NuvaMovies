package antlr;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CharRangeElement extends AlternativeElement {
    protected char begin;
    protected String beginText;
    protected char end;
    protected String endText;
    String label;

    public CharRangeElement(LexerGrammar lexerGrammar, Token token, Token token2, int i10) {
        super(lexerGrammar);
        this.begin = (char) 0;
        this.end = (char) 0;
        this.begin = (char) ANTLRLexer.tokenTypeForCharLiteral(token.getText());
        this.beginText = token.getText();
        this.end = (char) ANTLRLexer.tokenTypeForCharLiteral(token2.getText());
        this.endText = token2.getText();
        this.line = token.getLine();
        for (int i11 = this.begin; i11 <= this.end; i11++) {
            lexerGrammar.charVocabulary.add(i11);
        }
        this.autoGenType = i10;
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
