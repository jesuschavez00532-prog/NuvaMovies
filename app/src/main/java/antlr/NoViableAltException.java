package antlr;

import antlr.collections.AST;

/* loaded from: classes.dex */
public class NoViableAltException extends RecognitionException {
    public AST node;
    public Token token;

    public NoViableAltException(AST ast) {
        super("NoViableAlt", "<AST>", ast.getLine(), ast.getColumn());
        this.node = ast;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.token != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("unexpected token: ");
            stringBuffer.append(this.token.getText());
            return stringBuffer.toString();
        }
        if (this.node == TreeParser.ASTNULL) {
            return "unexpected end of subtree";
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("unexpected AST node: ");
        stringBuffer2.append(this.node.toString());
        return stringBuffer2.toString();
    }

    public NoViableAltException(Token token, String str) {
        super("NoViableAlt", str, token.getLine(), token.getColumn());
        this.token = token;
    }
}
