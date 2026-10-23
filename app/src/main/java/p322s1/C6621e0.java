package p322s1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p230m1.InterfaceC5569b;

/* renamed from: s1.e0 */
/* loaded from: classes.dex */
public class C6621e0 extends FilterInputStream {

    /* renamed from: a */
    private volatile byte[] f25425a;

    /* renamed from: b */
    private int f25426b;

    /* renamed from: c */
    private int f25427c;

    /* renamed from: d */
    private int f25428d;

    /* renamed from: e */
    private int f25429e;

    /* renamed from: f */
    private final InterfaceC5569b f25430f;

    /* renamed from: s1.e0$a */
    /* loaded from: classes.dex */
    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    public C6621e0(InputStream inputStream, InterfaceC5569b interfaceC5569b) {
        this(inputStream, interfaceC5569b, 65536);
    }

    /* renamed from: a */
    private int m25843a(InputStream inputStream, byte[] bArr) throws java.io.IOException {
        int i10 = this.f25428d;
        if (i10 != -1) {
            int i11 = this.f25429e - i10;
            int i12 = this.f25427c;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f25426b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f25430f.mo22611d(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f25425a = bArr2;
                    this.f25430f.put(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f25429e - this.f25428d;
                this.f25429e = i13;
                this.f25428d = 0;
                this.f25426b = 0;
                int read = inputStream.read(bArr, i13, bArr.length - i13);
                int i14 = this.f25429e;
                if (read > 0) {
                    i14 += read;
                }
                this.f25426b = i14;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f25428d = -1;
            this.f25429e = 0;
            this.f25426b = read2;
        }
        return read2;
    }

    /* renamed from: d */
    private static IOException m25844d() {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f25425a != null && inputStream != null) {
        } else {
            throw m25844d();
        }
        return (this.f25426b - this.f25429e) + inputStream.available();
    }

    /* renamed from: b */
    public synchronized void m25845b() throws java.io.IOException {
        this.f25427c = this.f25425a.length;
    }

    /* renamed from: c */
    public synchronized void m25846c() throws java.io.IOException {
        if (this.f25425a != null) {
            this.f25430f.put(this.f25425a);
            this.f25425a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        if (this.f25425a != null) {
            this.f25430f.put(this.f25425a);
            this.f25425a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        this.f25427c = Math.max(this.f25427c, i10);
        this.f25428d = this.f25429e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f25425a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.f25429e >= this.f25426b && m25843a(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.f25425a && (bArr = this.f25425a) == null) {
                throw m25844d();
            }
            int i10 = this.f25426b;
            int i11 = this.f25429e;
            if (i10 - i11 <= 0) {
                return -1;
            }
            this.f25429e = i11 + 1;
            return bArr[i11] & 255;
        }
        throw m25844d();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f25425a != null) {
            int i10 = this.f25428d;
            if (-1 != i10) {
                this.f25429e = i10;
            } else {
                throw new a("Mark has been invalidated, pos: " + this.f25429e + " markLimit: " + this.f25427c);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f25425a;
        if (bArr != null) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i10 = this.f25426b;
                int i11 = this.f25429e;
                if (i10 - i11 >= j10) {
                    this.f25429e = (int) (i11 + j10);
                    return j10;
                }
                long j11 = i10 - i11;
                this.f25429e = i10;
                if (this.f25428d != -1 && j10 <= this.f25427c) {
                    if (m25843a(inputStream, bArr) == -1) {
                        return j11;
                    }
                    int i12 = this.f25426b;
                    int i13 = this.f25429e;
                    if (i12 - i13 >= j10 - j11) {
                        this.f25429e = (int) ((i13 + j10) - j11);
                        return j10;
                    }
                    long j12 = (j11 + i12) - i13;
                    this.f25429e = i12;
                    return j12;
                }
                long skip = inputStream.skip(j10 - j11);
                if (skip > 0) {
                    this.f25428d = -1;
                }
                return j11 + skip;
            }
            throw m25844d();
        }
        throw m25844d();
    }

    C6621e0(InputStream inputStream, InterfaceC5569b interfaceC5569b, int i10) {
        super(inputStream);
        this.f25428d = -1;
        this.f25430f = interfaceC5569b;
        this.f25425a = (byte[]) interfaceC5569b.mo22611d(i10, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        byte[] bArr2 = this.f25425a;
        if (bArr2 == null) {
            throw m25844d();
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i14 = this.f25429e;
            int i15 = this.f25426b;
            if (i14 < i15) {
                int i16 = i15 - i14 >= i11 ? i11 : i15 - i14;
                System.arraycopy(bArr2, i14, bArr, i10, i16);
                this.f25429e += i16;
                if (i16 == i11 || inputStream.available() == 0) {
                    return i16;
                }
                i10 += i16;
                i12 = i11 - i16;
            } else {
                i12 = i11;
            }
            while (true) {
                if (this.f25428d == -1 && i12 >= bArr2.length) {
                    i13 = inputStream.read(bArr, i10, i12);
                    if (i13 == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                } else {
                    if (m25843a(inputStream, bArr2) == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                    if (bArr2 != this.f25425a && (bArr2 = this.f25425a) == null) {
                        throw m25844d();
                    }
                    int i17 = this.f25426b;
                    int i18 = this.f25429e;
                    i13 = i17 - i18 >= i12 ? i12 : i17 - i18;
                    System.arraycopy(bArr2, i18, bArr, i10, i13);
                    this.f25429e += i13;
                }
                i12 -= i13;
                if (i12 == 0) {
                    return i11;
                }
                if (inputStream.available() == 0) {
                    return i11 - i12;
                }
                i10 += i13;
            }
        } else {
            throw m25844d();
        }
    }
}
