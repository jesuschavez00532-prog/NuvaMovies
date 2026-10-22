package antlr;

import antlr.collections.AST;

/* loaded from: classes.dex */
public class CommonAST extends BaseAST {
    String text;
    int ttype = 0;

    public CommonAST() {
    }

    @Override // antlr.BaseAST, antlr.collections.AST
    public String getText() {
        return this.text;
    }

    @Override // antlr.BaseAST, antlr.collections.AST
    public int getType() {
        return this.ttype;
    }

    @Override // antlr.BaseAST, antlr.collections.AST
    public void initialize(int i10, String str) {
        setType(i10);
        setText(str);
    }

    @Override // antlr.BaseAST, antlr.collections.AST
    public void setText(String str) {
        this.text = str;
    }

    @Override // antlr.BaseAST, antlr.collections.AST
    public void setType(int i10) {
        this.ttype = i10;
    }

    public CommonAST(Token token) {
        initialize(token);
    }

    @Override // antlr.BaseAST, antlr.collections.AST
    public void initialize(AST ast) {
        setText(ast.getText());
        setType(ast.getType());
    }

    @Override // antlr.BaseAST, antlr.collections.AST
    public void initialize(Token token) {
        setText(token.getText());
        setType(token.getType());
    }
}
