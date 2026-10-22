package antlr;

/* loaded from: classes.dex */
public abstract class InputBuffer {
    protected int nMarkers = 0;
    protected int markerOffset = 0;
    protected int numToConsume = 0;
    protected CharQueue queue = new CharQueue(1);

    /* renamed from: LA */
    public char mo4815LA(int i10) {
        fill(i10);
        return this.queue.elementAt((this.markerOffset + i10) - 1);
    }

    public void commit() {
        this.nMarkers--;
    }

    public void consume() {
        this.numToConsume++;
    }

    public abstract void fill(int i10);

    public String getLAChars() {
        StringBuffer stringBuffer = new StringBuffer();
        int i10 = this.markerOffset;
        while (true) {
            CharQueue charQueue = this.queue;
            if (i10 < charQueue.nbrEntries) {
                stringBuffer.append(charQueue.elementAt(i10));
                i10++;
            } else {
                return stringBuffer.toString();
            }
        }
    }

    public String getMarkedChars() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < this.markerOffset; i10++) {
            stringBuffer.append(this.queue.elementAt(i10));
        }
        return stringBuffer.toString();
    }

    public boolean isMarked() {
        if (this.nMarkers != 0) {
            return true;
        }
        return false;
    }

    public int mark() {
        syncConsume();
        this.nMarkers++;
        return this.markerOffset;
    }

    public void reset() {
        this.nMarkers = 0;
        this.markerOffset = 0;
        this.numToConsume = 0;
        this.queue.reset();
    }

    public void rewind(int i10) {
        syncConsume();
        this.markerOffset = i10;
        this.nMarkers--;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void syncConsume() {
        while (this.numToConsume > 0) {
            if (this.nMarkers > 0) {
                this.markerOffset++;
            } else {
                this.queue.removeFirst();
            }
            this.numToConsume--;
        }
    }
}
