package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.g */
/* loaded from: classes.dex */
public final class C1607g extends FilterInputStream {

    /* renamed from: c */
    private static final byte[] f6402c;

    /* renamed from: d */
    private static final int f6403d;

    /* renamed from: e */
    private static final int f6404e;

    /* renamed from: a */
    private final byte f6405a;

    /* renamed from: b */
    private int f6406b;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f6402c = bArr;
        int length = bArr.length;
        f6403d = length;
        f6404e = length + 2;
    }

    public C1607g(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 >= -1 && i10 <= 8) {
            this.f6405a = (byte) i10;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read;
        int i10;
        int i11 = this.f6406b;
        if (i11 < 2 || i11 > (i10 = f6404e)) {
            read = super.read();
        } else if (i11 == i10) {
            read = this.f6405a;
        } else {
            read = f6402c[i11 - 2] & 255;
        }
        if (read != -1) {
            this.f6406b++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) {
        long skip = super.skip(j10);
        if (skip > 0) {
            this.f6406b = (int) (this.f6406b + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13 = this.f6406b;
        int i14 = f6404e;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f6405a;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int min = Math.min(i14 - i13, i11);
            System.arraycopy(f6402c, this.f6406b - 2, bArr, i10, min);
            i12 = min;
        }
        if (i12 > 0) {
            this.f6406b += i12;
        }
        return i12;
    }
}
