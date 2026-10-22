package antlr;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class Alternative {
    protected Lookahead[] cache;
    private boolean doAutoGen;
    protected ExceptionSpec exceptionSpec;
    AlternativeElement head;
    protected int lookaheadDepth;
    protected String semPred;
    protected SynPredBlock synPred;
    AlternativeElement tail;
    protected Token treeSpecifier = null;

    public Alternative() {
    }

    public void addElement(AlternativeElement alternativeElement) {
        if (this.head == null) {
            this.tail = alternativeElement;
            this.head = alternativeElement;
        } else {
            this.tail.next = alternativeElement;
            this.tail = alternativeElement;
        }
    }

    public boolean atStart() {
        if (this.head == null) {
            return true;
        }
        return false;
    }

    public boolean getAutoGen() {
        if (this.doAutoGen && this.treeSpecifier == null) {
            return true;
        }
        return false;
    }

    public Token getTreeSpecifier() {
        return this.treeSpecifier;
    }

    public void setAutoGen(boolean z10) {
        this.doAutoGen = z10;
    }

    public Alternative(AlternativeElement alternativeElement) {
        addElement(alternativeElement);
    }
}
