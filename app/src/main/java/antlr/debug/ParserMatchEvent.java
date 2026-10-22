package antlr.debug;

/* loaded from: classes.dex */
public class ParserMatchEvent extends GuessingEvent {
    public static int BITSET = 1;
    public static int CHAR = 2;
    public static int CHAR_BITSET = 3;
    public static int CHAR_RANGE = 5;
    public static int STRING = 4;
    public static int TOKEN;
    private boolean inverse;
    private boolean matched;
    private Object target;
    private String text;
    private int value;

    public ParserMatchEvent(Object obj) {
        super(obj);
    }

    public Object getTarget() {
        return this.target;
    }

    public String getText() {
        return this.text;
    }

    public int getValue() {
        return this.value;
    }

    public boolean isInverse() {
        return this.inverse;
    }

    public boolean isMatched() {
        return this.matched;
    }

    void setInverse(boolean z10) {
        this.inverse = z10;
    }

    void setMatched(boolean z10) {
        this.matched = z10;
    }

    void setTarget(Object obj) {
        this.target = obj;
    }

    void setText(String str) {
        this.text = str;
    }

    void setValue(int i10) {
        this.value = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setValues(int i10, int i11, Object obj, String str, int i12, boolean z10, boolean z11) {
        super.setValues(i10, i12);
        setValue(i11);
        setTarget(obj);
        setInverse(z10);
        setMatched(z11);
        setText(str);
    }

    @Override // java.util.EventObject
    public String toString() {
        String str;
        String str2;
        String str3;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ParserMatchEvent [");
        if (isMatched()) {
            str = "ok,";
        } else {
            str = "bad,";
        }
        stringBuffer.append(str);
        if (isInverse()) {
            str2 = "NOT ";
        } else {
            str2 = "";
        }
        stringBuffer.append(str2);
        if (getType() == TOKEN) {
            str3 = "token,";
        } else {
            str3 = "bitset,";
        }
        stringBuffer.append(str3);
        stringBuffer.append(getValue());
        stringBuffer.append(",");
        stringBuffer.append(getTarget());
        stringBuffer.append(",");
        stringBuffer.append(getGuessing());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public ParserMatchEvent(Object obj, int i10, int i11, Object obj2, String str, int i12, boolean z10, boolean z11) {
        super(obj);
        setValues(i10, i11, obj2, str, i12, z10, z11);
    }
}
