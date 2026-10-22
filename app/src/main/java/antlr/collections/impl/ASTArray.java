package antlr.collections.impl;

import antlr.collections.AST;

/* loaded from: classes.dex */
public class ASTArray {
    public AST[] array;
    public int size = 0;

    public ASTArray(int i10) {
        this.array = new AST[i10];
    }

    public ASTArray add(AST ast) {
        AST[] astArr = this.array;
        int i10 = this.size;
        this.size = i10 + 1;
        astArr[i10] = ast;
        return this;
    }
}
