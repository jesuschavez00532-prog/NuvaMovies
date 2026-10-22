package antlr;

/* loaded from: classes.dex */
class TokenSymbol extends GrammarSymbol {
    protected String ASTNodeType;
    protected String paraphrase;
    protected int ttype;

    public TokenSymbol(String str) {
        super(str);
        this.paraphrase = null;
        this.ttype = 0;
    }

    public String getASTNodeType() {
        return this.ASTNodeType;
    }

    public String getParaphrase() {
        return this.paraphrase;
    }

    public int getTokenType() {
        return this.ttype;
    }

    public void setASTNodeType(String str) {
        this.ASTNodeType = str;
    }

    public void setParaphrase(String str) {
        this.paraphrase = str;
    }

    public void setTokenType(int i10) {
        this.ttype = i10;
    }
}
