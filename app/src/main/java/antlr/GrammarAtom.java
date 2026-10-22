package antlr;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class GrammarAtom extends AlternativeElement {
    protected String ASTNodeType;
    protected String atomText;
    protected String label;
    protected boolean not;
    protected int tokenType;

    public GrammarAtom(Grammar grammar, Token token, int i10) {
        super(grammar, token, i10);
        this.tokenType = 0;
        this.not = false;
        this.ASTNodeType = null;
        this.atomText = token.getText();
    }

    public String getASTNodeType() {
        return this.ASTNodeType;
    }

    @Override // antlr.AlternativeElement
    public String getLabel() {
        return this.label;
    }

    public String getText() {
        return this.atomText;
    }

    public int getType() {
        return this.tokenType;
    }

    public void setASTNodeType(String str) {
        this.ASTNodeType = str;
    }

    @Override // antlr.AlternativeElement
    public void setLabel(String str) {
        this.label = str;
    }

    public void setOption(Token token, Token token2) {
        if (token.getText().equals("AST")) {
            setASTNodeType(token2.getText());
            return;
        }
        Tool tool = this.grammar.antlrTool;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Invalid element option:");
        stringBuffer.append(token.getText());
        tool.error(stringBuffer.toString(), this.grammar.getFilename(), token.getLine(), token.getColumn());
    }

    @Override // antlr.GrammarElement
    public String toString() {
        String str = " ";
        if (this.label != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(" ");
            stringBuffer.append(this.label);
            stringBuffer.append(":");
            str = stringBuffer.toString();
        }
        if (this.not) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(str);
            stringBuffer2.append("~");
            str = stringBuffer2.toString();
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(str);
        stringBuffer3.append(this.atomText);
        return stringBuffer3.toString();
    }
}
