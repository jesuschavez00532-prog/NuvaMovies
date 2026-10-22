package antlr.debug;

/* loaded from: classes.dex */
public abstract class GuessingEvent extends Event {
    private int guessing;

    public GuessingEvent(Object obj) {
        super(obj);
    }

    public int getGuessing() {
        return this.guessing;
    }

    void setGuessing(int i10) {
        this.guessing = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setValues(int i10, int i11) {
        super.setValues(i10);
        setGuessing(i11);
    }

    public GuessingEvent(Object obj, int i10) {
        super(obj, i10);
    }
}
