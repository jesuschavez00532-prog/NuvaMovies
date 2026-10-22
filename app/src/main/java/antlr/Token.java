package antlr;

/* loaded from: classes.dex */
public class Token implements Cloneable {
    public static final int EOF_TYPE = 1;
    public static final int INVALID_TYPE = 0;
    public static final int MIN_USER_TYPE = 4;
    public static final int NULL_TREE_LOOKAHEAD = 3;
    public static final int SKIP = -1;
    public static Token badToken = new Token(0, "<no text>");
    int type;

    public Token() {
        this.type = 0;
    }

    public int getColumn() {
        return 0;
    }

    public String getFilename() {
        return null;
    }

    public int getLine() {
        return 0;
    }

    public String getText() {
        return "<no text>";
    }

    public int getType() {
        return this.type;
    }

    public void setColumn(int i10) {
    }

    public void setFilename(String str) {
    }

    public void setLine(int i10) {
    }

    public void setText(String str) {
    }

    public void setType(int i10) {
        this.type = i10;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[\"");
        stringBuffer.append(getText());
        stringBuffer.append("\",<");
        stringBuffer.append(this.type);
        stringBuffer.append(">]");
        return stringBuffer.toString();
    }

    public Token(int i10) {
        this.type = i10;
    }

    public Token(int i10, String str) {
        this.type = i10;
        setText(str);
    }
}
