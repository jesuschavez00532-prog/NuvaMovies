package antlr;

import antlr.collections.AST;
import java.io.PrintStream;

/* loaded from: classes.dex */
public class DumpASTVisitor implements ASTVisitor {
    protected int level = 0;

    private void tabs() {
        for (int i10 = 0; i10 < this.level; i10++) {
            System.out.print("   ");
        }
    }

    @Override // antlr.ASTVisitor
    public void visit(AST ast) {
        for (AST ast2 = ast; ast2 != null && ast2.getFirstChild() == null; ast2 = ast2.getNextSibling()) {
        }
        while (ast != null) {
            tabs();
            if (ast.getText() == null) {
                System.out.print("nil");
            } else {
                System.out.print(ast.getText());
            }
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(" [");
            stringBuffer.append(ast.getType());
            stringBuffer.append("] ");
            printStream.print(stringBuffer.toString());
            System.out.println("");
            if (ast.getFirstChild() != null) {
                this.level++;
                visit(ast.getFirstChild());
                this.level--;
            }
            ast = ast.getNextSibling();
        }
    }
}
