package antlr.debug;

/* loaded from: classes.dex */
public class NewLineEvent extends Event {
    private int line;

    public NewLineEvent(Object obj) {
        super(obj);
    }

    public int getLine() {
        return this.line;
    }

    void setLine(int i10) {
        this.line = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // antlr.debug.Event
    public void setValues(int i10) {
        setLine(i10);
    }

    @Override // java.util.EventObject
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("NewLineEvent [");
        stringBuffer.append(this.line);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public NewLineEvent(Object obj, int i10) {
        super(obj);
        setValues(i10);
    }
}
