package antlr.debug;

/* loaded from: classes.dex */
public class TraceEvent extends GuessingEvent {
    public static int DONE_PARSING = 2;
    public static int ENTER = 0;
    public static int EXIT = 1;
    private int data;
    private int ruleNum;

    public TraceEvent(Object obj) {
        super(obj);
    }

    public int getData() {
        return this.data;
    }

    public int getRuleNum() {
        return this.ruleNum;
    }

    void setData(int i10) {
        this.data = i10;
    }

    void setRuleNum(int i10) {
        this.ruleNum = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setValues(int i10, int i11, int i12, int i13) {
        super.setValues(i10, i12);
        setRuleNum(i11);
        setData(i13);
    }

    @Override // java.util.EventObject
    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ParserTraceEvent [");
        if (getType() == ENTER) {
            str = "enter,";
        } else {
            str = "exit,";
        }
        stringBuffer.append(str);
        stringBuffer.append(getRuleNum());
        stringBuffer.append(",");
        stringBuffer.append(getGuessing());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public TraceEvent(Object obj, int i10, int i11, int i12, int i13) {
        super(obj);
        setValues(i10, i11, i12, i13);
    }
}
