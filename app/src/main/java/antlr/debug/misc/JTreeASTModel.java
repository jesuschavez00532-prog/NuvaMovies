package antlr.debug.misc;

import antlr.collections.AST;
import java.util.NoSuchElementException;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/* loaded from: classes.dex */
public class JTreeASTModel implements TreeModel {
    AST root;

    public JTreeASTModel(AST ast) {
        this.root = null;
        if (ast != null) {
            this.root = ast;
            return;
        }
        throw new IllegalArgumentException("root is null");
    }

    public void addTreeModelListener(TreeModelListener treeModelListener) {
    }

    public Object getChild(Object obj, int i10) {
        if (obj == null) {
            return null;
        }
        AST firstChild = ((AST) obj).getFirstChild();
        if (firstChild != null) {
            for (int i11 = 0; firstChild != null && i11 < i10; i11++) {
                firstChild = firstChild.getNextSibling();
            }
            return firstChild;
        }
        throw new ArrayIndexOutOfBoundsException("node has no children");
    }

    public int getChildCount(Object obj) {
        if (obj != null) {
            AST firstChild = ((AST) obj).getFirstChild();
            int i10 = 0;
            while (firstChild != null) {
                firstChild = firstChild.getNextSibling();
                i10++;
            }
            return i10;
        }
        throw new IllegalArgumentException("root is null");
    }

    public int getIndexOfChild(Object obj, Object obj2) {
        if (obj != null && obj2 != null) {
            AST firstChild = ((AST) obj).getFirstChild();
            if (firstChild != null) {
                int i10 = 0;
                while (firstChild != null && firstChild != obj2) {
                    firstChild = firstChild.getNextSibling();
                    i10++;
                }
                if (firstChild == obj2) {
                    return i10;
                }
                throw new NoSuchElementException("node is not a child");
            }
            throw new ArrayIndexOutOfBoundsException("node has no children");
        }
        throw new IllegalArgumentException("root or child is null");
    }

    public Object getRoot() {
        return this.root;
    }

    public boolean isLeaf(Object obj) {
        if (obj != null) {
            if (((AST) obj).getFirstChild() == null) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("node is null");
    }

    public void removeTreeModelListener(TreeModelListener treeModelListener) {
    }

    public void valueForPathChanged(TreePath treePath, Object obj) {
        System.out.println("heh, who is calling this mystery method?");
    }
}
