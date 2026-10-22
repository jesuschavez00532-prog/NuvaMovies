package antlr.debug;

/* loaded from: classes.dex */
public class MessageEvent extends Event {
    public static int ERROR = 1;
    public static int WARNING;
    private String text;

    public MessageEvent(Object obj) {
        super(obj);
    }

    public String getText() {
        return this.text;
    }

    void setText(String str) {
        this.text = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setValues(int i10, String str) {
        super.setValues(i10);
        setText(str);
    }

    @Override // java.util.EventObject
    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ParserMessageEvent [");
        if (getType() == WARNING) {
            str = "warning,";
        } else {
            str = "error,";
        }
        stringBuffer.append(str);
        stringBuffer.append(getText());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public MessageEvent(Object obj, int i10, String str) {
        super(obj);
        setValues(i10, str);
    }
}
