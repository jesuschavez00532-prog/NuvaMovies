package antlr;

/* loaded from: classes.dex */
public class CommonToken extends Token {
    protected int col;
    protected int line;
    protected String text;

    public CommonToken() {
        this.text = null;
    }

    @Override // antlr.Token
    public int getColumn() {
        return this.col;
    }

    @Override // antlr.Token
    public int getLine() {
        return this.line;
    }

    @Override // antlr.Token
    public String getText() {
        return this.text;
    }

    @Override // antlr.Token
    public void setColumn(int i10) {
        this.col = i10;
    }

    @Override // antlr.Token
    public void setLine(int i10) {
        this.line = i10;
    }

    @Override // antlr.Token
    public void setText(String str) {
        this.text = str;
    }

    @Override // antlr.Token
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[\"");
        stringBuffer.append(getText());
        stringBuffer.append("\",<");
        stringBuffer.append(this.type);
        stringBuffer.append(">,line=");
        stringBuffer.append(this.line);
        stringBuffer.append(",col=");
        stringBuffer.append(this.col);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public CommonToken(int i10, String str) {
        this.text = null;
        this.type = i10;
        setText(str);
    }

    public CommonToken(String str) {
        this.text = str;
    }
}
