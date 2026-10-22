package antlr;

/* loaded from: classes.dex */
public class ANTLRStringBuffer {
    protected char[] buffer;
    protected int length;

    public ANTLRStringBuffer() {
        this.length = 0;
        this.buffer = new char[50];
    }

    public final void append(char c10) {
        int i10 = this.length;
        char[] cArr = this.buffer;
        if (i10 >= cArr.length) {
            int length = cArr.length;
            while (this.length >= length) {
                length *= 2;
            }
            char[] cArr2 = new char[length];
            for (int i11 = 0; i11 < this.length; i11++) {
                cArr2[i11] = this.buffer[i11];
            }
            this.buffer = cArr2;
        }
        char[] cArr3 = this.buffer;
        int i12 = this.length;
        cArr3[i12] = c10;
        this.length = i12 + 1;
    }

    public final char charAt(int i10) {
        return this.buffer[i10];
    }

    public final char[] getBuffer() {
        return this.buffer;
    }

    public final int length() {
        return this.length;
    }

    public final void setCharAt(int i10, char c10) {
        this.buffer[i10] = c10;
    }

    public final void setLength(int i10) {
        if (i10 < this.length) {
            this.length = i10;
        } else {
            while (i10 > this.length) {
                append((char) 0);
            }
        }
    }

    public final String toString() {
        return new String(this.buffer, 0, this.length);
    }

    public ANTLRStringBuffer(int i10) {
        this.buffer = null;
        this.length = 0;
        this.buffer = new char[i10];
    }

    public final void append(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            append(str.charAt(i10));
        }
    }
}
