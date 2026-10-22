package antlr;

/* loaded from: classes.dex */
class StringLiteralSymbol extends TokenSymbol {
    protected String label;

    public StringLiteralSymbol(String str) {
        super(str);
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String str) {
        this.label = str;
    }
}
