package antlr;

/* loaded from: classes.dex */
public class TokenWithIndex extends CommonToken {
    int index;

    public TokenWithIndex() {
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int i10) {
        this.index = i10;
    }

    @Override // antlr.CommonToken, antlr.Token
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        stringBuffer.append(this.index);
        stringBuffer.append(":\"");
        stringBuffer.append(getText());
        stringBuffer.append("\",<");
        stringBuffer.append(getType());
        stringBuffer.append(">,line=");
        stringBuffer.append(this.line);
        stringBuffer.append(",col=");
        stringBuffer.append(this.col);
        stringBuffer.append("]\n");
        return stringBuffer.toString();
    }

    public TokenWithIndex(int i10, String str) {
        super(i10, str);
    }
}
