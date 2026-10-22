package antlr;

import antlr.collections.AST;

/* loaded from: classes.dex */
public class ASTPair {
    public AST child;
    public AST root;

    public final void advanceChildToEnd() {
        if (this.child != null) {
            while (this.child.getNextSibling() != null) {
                this.child = this.child.getNextSibling();
            }
        }
    }

    public ASTPair copy() {
        ASTPair aSTPair = new ASTPair();
        aSTPair.root = this.root;
        aSTPair.child = this.child;
        return aSTPair;
    }

    public String toString() {
        String text;
        AST ast = this.root;
        String str = "null";
        if (ast == null) {
            text = "null";
        } else {
            text = ast.getText();
        }
        AST ast2 = this.child;
        if (ast2 != null) {
            str = ast2.getText();
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        stringBuffer.append(text);
        stringBuffer.append(",");
        stringBuffer.append(str);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
