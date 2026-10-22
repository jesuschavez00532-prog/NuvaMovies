package antlr.debug;

/* loaded from: classes.dex */
public class SemanticPredicateEvent extends GuessingEvent {
    public static final int PREDICTING = 1;
    public static final int VALIDATING = 0;
    private int condition;
    private boolean result;

    public SemanticPredicateEvent(Object obj) {
        super(obj);
    }

    public int getCondition() {
        return this.condition;
    }

    public boolean getResult() {
        return this.result;
    }

    void setCondition(int i10) {
        this.condition = i10;
    }

    void setResult(boolean z10) {
        this.result = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setValues(int i10, int i11, boolean z10, int i12) {
        super.setValues(i10, i12);
        setCondition(i11);
        setResult(z10);
    }

    @Override // java.util.EventObject
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SemanticPredicateEvent [");
        stringBuffer.append(getCondition());
        stringBuffer.append(",");
        stringBuffer.append(getResult());
        stringBuffer.append(",");
        stringBuffer.append(getGuessing());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public SemanticPredicateEvent(Object obj, int i10) {
        super(obj, i10);
    }
}
