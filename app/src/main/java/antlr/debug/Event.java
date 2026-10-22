package antlr.debug;

import java.util.EventObject;

/* loaded from: classes.dex */
public abstract class Event extends EventObject {
    private int type;

    public Event(Object obj) {
        super(obj);
    }

    public int getType() {
        return this.type;
    }

    void setType(int i10) {
        this.type = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setValues(int i10) {
        setType(i10);
    }

    public Event(Object obj, int i10) {
        super(obj);
        setType(i10);
    }
}
