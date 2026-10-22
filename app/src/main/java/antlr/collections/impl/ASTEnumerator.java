package antlr.collections.impl;

import antlr.collections.AST;
import antlr.collections.ASTEnumeration;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class ASTEnumerator implements ASTEnumeration {

    /* renamed from: i */
    int f4249i = 0;
    VectorEnumerator nodes;

    public ASTEnumerator(Vector vector) {
        this.nodes = new VectorEnumerator(vector);
    }

    @Override // antlr.collections.ASTEnumeration
    public boolean hasMoreNodes() {
        boolean z10;
        synchronized (this.nodes) {
            if (this.f4249i <= this.nodes.vector.lastElement) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // antlr.collections.ASTEnumeration
    public AST nextNode() {
        AST ast;
        synchronized (this.nodes) {
            int i10 = this.f4249i;
            Vector vector = this.nodes.vector;
            if (i10 <= vector.lastElement) {
                Object[] objArr = vector.data;
                this.f4249i = i10 + 1;
                ast = (AST) objArr[i10];
            } else {
                throw new NoSuchElementException("ASTEnumerator");
            }
        }
        return ast;
    }
}
