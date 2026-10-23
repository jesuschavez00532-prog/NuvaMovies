package p140g1;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: g1.c */
/* loaded from: classes.dex */
class C4335c implements Closeable {

    /* renamed from: a */
    private final InputStream f18874a;

    /* renamed from: b */
    private final Charset f18875b;

    /* renamed from: c */
    private byte[] f18876c;

    /* renamed from: d */
    private int f18877d;

    /* renamed from: e */
    private int f18878e;

    /* renamed from: g1.c$a */
    /* loaded from: classes.dex */
    class a extends ByteArrayOutputStream {
        a(int i10) {
            super(i10);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i10 = ((ByteArrayOutputStream) this).count;
            if (i10 > 0 && ((ByteArrayOutputStream) this).buf[i10 - 1] == 13) {
                i10--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i10, C4335c.this.f18875b.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public C4335c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: b */
    private void m18200b() {
        InputStream inputStream = this.f18874a;
        byte[] bArr = this.f18876c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f18877d = 0;
            this.f18878e = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: c */
    public boolean m18201c() {
        if (this.f18878e == -1) {
            return true;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f18874a) {
            if (this.f18876c != null) {
                this.f18876c = null;
                this.f18874a.close();
            }
        }
    }

    /* renamed from: d */
    public String m18202d() {
        int i10 = 0;
        byte[] bArr;
        int i11 = 0;
        synchronized (this.f18874a) {
            if (this.f18876c != null) {
                if (this.f18877d >= this.f18878e) {
                    m18200b();
                }
                for (int i12 = this.f18877d; i12 != this.f18878e; i12++) {
                    byte[] bArr2 = this.f18876c;
                    if (bArr2[i12] == 10) {
                        int i13 = this.f18877d;
                        if (i12 != i13) {
                            i11 = i12 - 1;
                            if (bArr2[i11] == 13) {
                                String str = new String(bArr2, i13, i11 - i13, this.f18875b.name());
                                this.f18877d = i12 + 1;
                                return str;
                            }
                        }
                        i11 = i12;
                        String str2 = new String(bArr2, i13, i11 - i13, this.f18875b.name());
                        this.f18877d = i12 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f18878e - this.f18877d) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f18876c;
                    int i14 = this.f18877d;
                    aVar.write(bArr3, i14, this.f18878e - i14);
                    this.f18878e = -1;
                    m18200b();
                    i10 = this.f18877d;
                    while (i10 != this.f18878e) {
                        bArr = this.f18876c;
                        if (bArr[i10] == 10) {
                            break loop1;
                        }
                        i10++;
                    }
                }
                int i15 = this.f18877d;
                if (i10 != i15) {
                    aVar.write(bArr, i15, i10 - i15);
                }
                this.f18877d = i10 + 1;
                return aVar.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }

    public C4335c(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i10 >= 0) {
            if (charset.equals(AbstractC4336d.f18880a)) {
                this.f18874a = inputStream;
                this.f18875b = charset;
                this.f18876c = new byte[i10];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw new IllegalArgumentException("capacity <= 0");
    }
}
