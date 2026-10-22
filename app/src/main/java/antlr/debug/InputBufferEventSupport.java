package antlr.debug;

import java.util.Vector;

/* loaded from: classes.dex */
public class InputBufferEventSupport {
    protected static final int CONSUME = 0;

    /* renamed from: LA */
    protected static final int f4254LA = 1;
    protected static final int MARK = 2;
    protected static final int REWIND = 3;
    private InputBufferEvent inputBufferEvent;
    private Vector inputBufferListeners;
    private Object source;

    public InputBufferEventSupport(Object obj) {
        this.inputBufferEvent = new InputBufferEvent(obj);
        this.source = obj;
    }

    public void addInputBufferListener(InputBufferListener inputBufferListener) {
        if (this.inputBufferListeners == null) {
            this.inputBufferListeners = new Vector();
        }
        this.inputBufferListeners.addElement(inputBufferListener);
    }

    public void fireConsume(char c10) {
        this.inputBufferEvent.setValues(0, c10, 0);
        fireEvents(0, this.inputBufferListeners);
    }

    public void fireEvent(int i10, ListenerBase listenerBase) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        ((InputBufferListener) listenerBase).inputBufferRewind(this.inputBufferEvent);
                        return;
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("bad type ");
                    stringBuffer.append(i10);
                    stringBuffer.append(" for fireEvent()");
                    throw new IllegalArgumentException(stringBuffer.toString());
                }
                ((InputBufferListener) listenerBase).inputBufferMark(this.inputBufferEvent);
                return;
            }
            ((InputBufferListener) listenerBase).inputBufferLA(this.inputBufferEvent);
            return;
        }
        ((InputBufferListener) listenerBase).inputBufferConsume(this.inputBufferEvent);
    }

    public void fireEvents(int i10, Vector vector) {
        synchronized (this) {
            if (vector == null) {
                return;
            }
            Vector vector2 = (Vector) vector.clone();
            if (vector2 != null) {
                for (int i11 = 0; i11 < vector2.size(); i11++) {
                    fireEvent(i10, (ListenerBase) vector2.elementAt(i11));
                }
            }
        }
    }

    public void fireLA(char c10, int i10) {
        this.inputBufferEvent.setValues(1, c10, i10);
        fireEvents(1, this.inputBufferListeners);
    }

    public void fireMark(int i10) {
        this.inputBufferEvent.setValues(2, ' ', i10);
        fireEvents(2, this.inputBufferListeners);
    }

    public void fireRewind(int i10) {
        this.inputBufferEvent.setValues(3, ' ', i10);
        fireEvents(3, this.inputBufferListeners);
    }

    public Vector getInputBufferListeners() {
        return this.inputBufferListeners;
    }

    protected void refresh(Vector vector) {
        Vector vector2;
        synchronized (vector) {
            vector2 = (Vector) vector.clone();
        }
        if (vector2 != null) {
            for (int i10 = 0; i10 < vector2.size(); i10++) {
                ((ListenerBase) vector2.elementAt(i10)).refresh();
            }
        }
    }

    public void refreshListeners() {
        refresh(this.inputBufferListeners);
    }

    public void removeInputBufferListener(InputBufferListener inputBufferListener) {
        Vector vector = this.inputBufferListeners;
        if (vector != null) {
            vector.removeElement(inputBufferListener);
        }
    }
}
