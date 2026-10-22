package antlr;

/* loaded from: classes.dex */
class CSharpBlockFinishingInfo {
    boolean generatedAnIf;
    boolean generatedSwitch;
    boolean needAnErrorClause;
    String postscript;

    public CSharpBlockFinishingInfo() {
        this.postscript = null;
        this.generatedSwitch = false;
        this.needAnErrorClause = true;
    }

    public CSharpBlockFinishingInfo(String str, boolean z10, boolean z11, boolean z12) {
        this.postscript = str;
        this.generatedSwitch = z10;
        this.generatedAnIf = z11;
        this.needAnErrorClause = z12;
    }
}
