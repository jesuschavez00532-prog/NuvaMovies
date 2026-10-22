package antlr;

import antlr.collections.impl.Vector;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class RuleSymbol extends GrammarSymbol {
    String access;
    RuleBlock block;
    String comment;
    boolean defined;
    Vector references;

    public RuleSymbol(String str) {
        super(str);
        this.references = new Vector();
    }

    public void addReference(RuleRefElement ruleRefElement) {
        this.references.appendElement(ruleRefElement);
    }

    public RuleBlock getBlock() {
        return this.block;
    }

    public RuleRefElement getReference(int i10) {
        return (RuleRefElement) this.references.elementAt(i10);
    }

    public boolean isDefined() {
        return this.defined;
    }

    public int numReferences() {
        return this.references.size();
    }

    public void setBlock(RuleBlock ruleBlock) {
        this.block = ruleBlock;
    }

    public void setDefined() {
        this.defined = true;
    }
}
