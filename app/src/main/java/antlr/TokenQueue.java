package antlr;

/* loaded from: classes.dex */
class TokenQueue {
    private Token[] buffer;
    protected int nbrEntries;
    private int offset;
    private int sizeLessOne;

    public TokenQueue(int i10) {
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
        Token[] tokenArr = new Token[this.buffer.length * 2];
        for (int i10 = 0; i10 < this.buffer.length; i10++) {
            tokenArr[i10] = elementAt(i10);
        }
        this.buffer = tokenArr;
        this.sizeLessOne = tokenArr.length - 1;
        this.offset = 0;
    }

    private final void init(int i10) {
        this.buffer = new Token[i10];
        this.sizeLessOne = i10 - 1;
        this.offset = 0;
        this.nbrEntries = 0;
    }

    public final void append(Token token) {
        if (this.nbrEntries == this.buffer.length) {
            expand();
        }
        Token[] tokenArr = this.buffer;
        int i10 = this.offset;
        int i11 = this.nbrEntries;
        tokenArr[(i10 + i11) & this.sizeLessOne] = token;
        this.nbrEntries = i11 + 1;
    }

    public final Token elementAt(int i10) {
        return this.buffer[this.sizeLessOne & (this.offset + i10)];
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
