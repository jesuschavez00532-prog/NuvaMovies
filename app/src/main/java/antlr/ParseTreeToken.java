package antlr;

/* loaded from: classes.dex */
public class ParseTreeToken extends ParseTree {
    protected Token token;

    public ParseTreeToken(Token token) {
        this.token = token;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // antlr.ParseTree
    public int getLeftmostDerivation(StringBuffer stringBuffer, int i10) {
        stringBuffer.append(' ');
        stringBuffer.append(toString());
        return i10;
    }

    @Override // antlr.BaseAST, antlr.collections.AST
    public String toString() {
        Token token = this.token;
        if (token != null) {
            return token.getText();
        }
        return "<missing token>";
    }
}
