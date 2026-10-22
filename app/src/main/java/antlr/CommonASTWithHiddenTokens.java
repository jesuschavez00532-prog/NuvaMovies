package antlr;

/* loaded from: classes.dex */
public class CommonASTWithHiddenTokens extends CommonAST {
    protected CommonHiddenStreamToken hiddenAfter;
    protected CommonHiddenStreamToken hiddenBefore;

    public CommonASTWithHiddenTokens() {
    }

    public CommonHiddenStreamToken getHiddenAfter() {
        return this.hiddenAfter;
    }

    public CommonHiddenStreamToken getHiddenBefore() {
        return this.hiddenBefore;
    }

    @Override // antlr.CommonAST, antlr.BaseAST, antlr.collections.AST
    public void initialize(Token token) {
        CommonHiddenStreamToken commonHiddenStreamToken = (CommonHiddenStreamToken) token;
        super.initialize(commonHiddenStreamToken);
        this.hiddenBefore = commonHiddenStreamToken.getHiddenBefore();
        this.hiddenAfter = commonHiddenStreamToken.getHiddenAfter();
    }

    public CommonASTWithHiddenTokens(Token token) {
        super(token);
    }
}
