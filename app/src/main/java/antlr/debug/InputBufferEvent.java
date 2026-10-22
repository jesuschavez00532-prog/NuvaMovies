package antlr.debug;

/* loaded from: classes.dex */
public class InputBufferEvent extends Event {
    public static final int CONSUME = 0;

    /* renamed from: LA */
    public static final int f4252LA = 1;
    public static final int MARK = 2;
    public static final int REWIND = 3;

    /* renamed from: c */
    char f4253c;
    int lookaheadAmount;

    public InputBufferEvent(Object obj) {
        super(obj);
    }

    public char getChar() {
        return this.f4253c;
    }

    public int getLookaheadAmount() {
        return this.lookaheadAmount;
    }

    void setChar(char c10) {
        this.f4253c = c10;
    }

    void setLookaheadAmount(int i10) {
        this.lookaheadAmount = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setValues(int i10, char c10, int i11) {
        super.setValues(i10);
        setChar(c10);
        setLookaheadAmount(i11);
    }

    @Override // java.util.EventObject
    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("CharBufferEvent [");
        if (getType() == 0) {
            str = "CONSUME, ";
        } else {
            str = "LA, ";
        }
        stringBuffer.append(str);
        stringBuffer.append(getChar());
        stringBuffer.append(",");
        stringBuffer.append(getLookaheadAmount());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public InputBufferEvent(Object obj, int i10, char c10, int i11) {
        super(obj);
        setValues(i10, c10, i11);
    }
}
