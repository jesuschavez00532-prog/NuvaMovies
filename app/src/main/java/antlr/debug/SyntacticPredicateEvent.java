package antlr.debug;

/* loaded from: classes.dex */
public class SyntacticPredicateEvent extends GuessingEvent {
    public SyntacticPredicateEvent(Object obj) {
        super(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // antlr.debug.GuessingEvent
    public void setValues(int i10, int i11) {
        super.setValues(i10, i11);
    }

    @Override // java.util.EventObject
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SyntacticPredicateEvent [");
        stringBuffer.append(getGuessing());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public SyntacticPredicateEvent(Object obj, int i10) {
        super(obj, i10);
    }
}
