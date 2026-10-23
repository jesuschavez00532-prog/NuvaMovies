package p109e2;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: e2.i */
/* loaded from: classes.dex */
public class C4119i extends FilterInputStream {

    /* renamed from: a */
    private int f18085a;

    public C4119i(InputStream inputStream) {
        super(inputStream);
        this.f18085a = Integer.MIN_VALUE;
    }

    /* renamed from: a */
    private long m17220a(long j10) {
        int i10 = this.f18085a;
        if (i10 == 0) {
            return -1L;
        }
        if (i10 != Integer.MIN_VALUE && j10 > i10) {
            return i10;
        }
        return j10;
    }

    /* renamed from: b */
    private void m17221b(long j10) {
        int i10 = this.f18085a;
        if (i10 != Integer.MIN_VALUE && j10 != -1) {
            this.f18085a = (int) (i10 - j10);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws java.io.IOException {
        int i10 = this.f18085a;
        if (i10 == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i10, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        super.mark(i10);
        this.f18085a = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
        if (m17220a(1L) == -1) {
            return -1;
        }
        int read = super.read();
        m17221b(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f18085a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws java.io.IOException {
        long m17220a = m17220a(j10);
        if (m17220a == -1) {
            return 0L;
        }
        long skip = super.skip(m17220a);
        m17221b(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws java.io.IOException {
        int m17220a = (int) m17220a(i11);
        if (m17220a == -1) {
            return -1;
        }
        int read = super.read(bArr, i10, m17220a);
        m17221b(read);
        return read;
    }
}
