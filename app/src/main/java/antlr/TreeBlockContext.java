package antlr;

/* loaded from: classes.dex */
class TreeBlockContext extends BlockContext {
    protected boolean nextElementIsRoot = true;

    @Override // antlr.BlockContext
    public void addAlternativeElement(AlternativeElement alternativeElement) {
        TreeElement treeElement = (TreeElement) this.block;
        if (this.nextElementIsRoot) {
            treeElement.root = (GrammarAtom) alternativeElement;
            this.nextElementIsRoot = false;
        } else {
            super.addAlternativeElement(alternativeElement);
        }
    }
}
