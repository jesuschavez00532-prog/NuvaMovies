package antlr;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class RuleRefElement extends AlternativeElement {
    protected String args;
    protected String idAssign;
    protected String label;
    protected String targetRule;

    public RuleRefElement(Grammar grammar, Token token, int i10) {
        super(grammar, token, i10);
        this.args = null;
        this.idAssign = null;
        String text = token.getText();
        this.targetRule = text;
        if (token.type == 24) {
            this.targetRule = CodeGenerator.encodeLexerRuleName(text);
        }
    }

    @Override // antlr.GrammarElement
    public void generate() {
        this.grammar.generator.gen(this);
    }

    public String getArgs() {
        return this.args;
    }

    public String getIdAssign() {
        return this.idAssign;
    }

    @Override // antlr.AlternativeElement
    public String getLabel() {
        return this.label;
    }

    @Override // antlr.GrammarElement
    public Lookahead look(int i10) {
        return this.grammar.theLLkAnalyzer.look(i10, this);
    }

    public void setArgs(String str) {
        this.args = str;
    }

    public void setIdAssign(String str) {
        this.idAssign = str;
    }

    @Override // antlr.AlternativeElement
    public void setLabel(String str) {
        this.label = str;
    }

    @Override // antlr.GrammarElement
    public String toString() {
        if (this.args != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(" ");
            stringBuffer.append(this.targetRule);
            stringBuffer.append(this.args);
            return stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(" ");
        stringBuffer2.append(this.targetRule);
        return stringBuffer2.toString();
    }
}
