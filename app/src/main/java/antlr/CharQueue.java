package antlr;

/* loaded from: classes.dex */
public class CharQueue {
    protected char[] buffer;
    protected int nbrEntries;
    private int offset;
    private int sizeLessOne;

    public CharQueue(int i10) {
        if (i10 < 0) {
            init(16);
            return;
        }
        if (i10 >= 1073741823) {
            init(Integer.MAX_VALUE);
            return;
        }
        int i11 = 2;
        while (i11 < i10) {
            i11 *= 2;
        }
        init(i11);
    }

    private final void expand() {
        char[] cArr = new char[this.buffer.length * 2];
        for (int i10 = 0; i10 < this.buffer.length; i10++) {
            cArr[i10] = elementAt(i10);
        }
        this.buffer = cArr;
        this.sizeLessOne = cArr.length - 1;
        this.offset = 0;
    }

    public final void append(char c10) {
        if (this.nbrEntries == this.buffer.length) {
            expand();
        }
        char[] cArr = this.buffer;
        int i10 = this.offset;
        int i11 = this.nbrEntries;
        cArr[(i10 + i11) & this.sizeLessOne] = c10;
        this.nbrEntries = i11 + 1;
    }

    public final char elementAt(int i10) {
        return this.buffer[this.sizeLessOne & (this.offset + i10)];
    }

    public void init(int i10) {
        this.buffer = new char[i10];
        this.sizeLessOne = i10 - 1;
        this.offset = 0;
        this.nbrEntries = 0;
    }

    public final void removeFirst() {
        this.offset = (this.offset + 1) & this.sizeLessOne;
        this.nbrEntries--;
    }

    public final void reset() {
        this.offset = 0;
        this.nbrEntries = 0;
    }
}
