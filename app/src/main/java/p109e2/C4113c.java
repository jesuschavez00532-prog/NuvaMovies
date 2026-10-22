package p109e2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: e2.c */
/* loaded from: classes.dex */
public final class C4113c extends FilterInputStream {

    /* renamed from: a */
    private final long f18069a;

    /* renamed from: b */
    private int f18070b;

    private C4113c(InputStream inputStream, long j10) {
        super(inputStream);
        this.f18069a = j10;
    }

    /* renamed from: a */
    private int m17200a(int i10) {
        if (i10 >= 0) {
            this.f18070b += i10;
        } else if (this.f18069a - this.f18070b > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f18069a + ", but read: " + this.f18070b);
        }
        return i10;
    }

    /* renamed from: b */
    public static InputStream m17201b(InputStream inputStream, long j10) {
        return new C4113c(inputStream, j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f18069a - this.f18070b, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int read;
        read = super.read();
        m17200a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        return m17200a(super.read(bArr, i10, i11));
    }
}
