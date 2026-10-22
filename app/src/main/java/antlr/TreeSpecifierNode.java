package antlr;

/* loaded from: classes.dex */
class TreeSpecifierNode {
    private Token tok;
    private TreeSpecifierNode parent = null;
    private TreeSpecifierNode firstChild = null;
    private TreeSpecifierNode nextSibling = null;

    TreeSpecifierNode(Token token) {
        this.tok = token;
    }

    public TreeSpecifierNode getFirstChild() {
        return this.firstChild;
    }

    public TreeSpecifierNode getNextSibling() {
        return this.nextSibling;
    }

    public TreeSpecifierNode getParent() {
        return this.parent;
    }

    public Token getToken() {
        return this.tok;
    }

    public void setFirstChild(TreeSpecifierNode treeSpecifierNode) {
        this.firstChild = treeSpecifierNode;
        treeSpecifierNode.parent = this;
    }

    public void setNextSibling(TreeSpecifierNode treeSpecifierNode) {
        this.nextSibling = treeSpecifierNode;
        treeSpecifierNode.parent = this.parent;
    }
}
