package antlr.debug;

/* loaded from: classes.dex */
public class ParserTokenEvent extends Event {
    public static int CONSUME = 1;

    /* renamed from: LA */
    public static int f4256LA;
    private int amount;
    private int value;

    public ParserTokenEvent(Object obj) {
        super(obj);
    }

    public int getAmount() {
        return this.amount;
    }

    public int getValue() {
        return this.value;
    }

    void setAmount(int i10) {
        this.amount = i10;
    }

    void setValue(int i10) {
        this.value = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setValues(int i10, int i11, int i12) {
        super.setValues(i10);
        setAmount(i11);
        setValue(i12);
    }

    @Override // java.util.EventObject
    public String toString() {
        if (getType() == f4256LA) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("ParserTokenEvent [LA,");
            stringBuffer.append(getAmount());
            stringBuffer.append(",");
            stringBuffer.append(getValue());
            stringBuffer.append("]");
            return stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("ParserTokenEvent [consume,1,");
        stringBuffer2.append(getValue());
        stringBuffer2.append("]");
        return stringBuffer2.toString();
    }

    public ParserTokenEvent(Object obj, int i10, int i11, int i12) {
        super(obj);
        setValues(i10, i11, i12);
    }
}
