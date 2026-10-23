package p026b6;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b6.e */
/* loaded from: classes.dex */
public class C1133e implements Closeable {

    /* renamed from: g */
    private static final Logger f4429g = Logger.getLogger(C1133e.class.getName());

    /* renamed from: a */
    private final RandomAccessFile f4430a;

    /* renamed from: b */
    int f4431b;

    /* renamed from: c */
    private int f4432c;

    /* renamed from: d */
    private b f4433d;

    /* renamed from: e */
    private b f4434e;

    /* renamed from: f */
    private final byte[] f4435f = new byte[16];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b6.e$a */
    /* loaded from: classes.dex */
    public class a implements d {

        /* renamed from: a */
        boolean f4436a = true;

        /* renamed from: b */
        final /* synthetic */ StringBuilder f4437b;

        a(StringBuilder sb2) {
            this.f4437b = sb2;
        }

        @Override // p026b6.C1133e.d
        /* renamed from: a */
        public void mo5166a(InputStream inputStream, int i10) {
            if (this.f4436a) {
                this.f4436a = false;
            } else {
                this.f4437b.append(", ");
            }
            this.f4437b.append(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b6.e$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: c */
        static final b f4439c = new b(0, 0);

        /* renamed from: a */
        final int f4440a;

        /* renamed from: b */
        final int f4441b;

        b(int i10, int i11) {
            this.f4440a = i10;
            this.f4441b = i11;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f4440a + ", length = " + this.f4441b + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b6.e$c */
    /* loaded from: classes.dex */
    public final class c extends InputStream {

        /* renamed from: a */
        private int f4442a;

        /* renamed from: b */
        private int f4443b;

        /* synthetic */ c(C1133e c1133e, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws java.io.IOException {
            C1133e.m5153r(bArr, "buffer");
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f4443b;
                if (i12 <= 0) {
                    return -1;
                }
                if (i11 > i12) {
                    i11 = i12;
                }
                C1133e.this.m5140B(this.f4442a, bArr, i10, i11);
                this.f4442a = C1133e.this.m5143F(this.f4442a + i11);
                this.f4443b -= i11;
                return i11;
            }
            throw new ArrayIndexOutOfBoundsException();
        }

        private c(b bVar) {
            this.f4442a = C1133e.this.m5143F(bVar.f4440a + 4);
            this.f4443b = bVar.f4441b;
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
            if (this.f4443b == 0) {
                return -1;
            }
            C1133e.this.f4430a.seek(this.f4442a);
            int read = C1133e.this.f4430a.read();
            this.f4442a = C1133e.this.m5143F(this.f4442a + 1);
            this.f4443b--;
            return read;
        }
    }

    /* renamed from: b6.e$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        void mo5166a(InputStream inputStream, int i10);
    }

    public C1133e(File file) {
        if (!file.exists()) {
            m5152n(file);
        }
        this.f4430a = m5154s(file);
        m5156x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public void m5140B(int i10, byte[] bArr, int i11, int i12) {
        int m5143F = m5143F(i10);
        int i13 = m5143F + i12;
        int i14 = this.f4431b;
        if (i13 <= i14) {
            this.f4430a.seek(m5143F);
            this.f4430a.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - m5143F;
        this.f4430a.seek(m5143F);
        this.f4430a.readFully(bArr, i11, i15);
        this.f4430a.seek(16L);
        this.f4430a.readFully(bArr, i11 + i15, i12 - i15);
    }

    /* renamed from: C */
    private void m5141C(int i10, byte[] bArr, int i11, int i12) {
        int m5143F = m5143F(i10);
        int i13 = m5143F + i12;
        int i14 = this.f4431b;
        if (i13 <= i14) {
            this.f4430a.seek(m5143F);
            this.f4430a.write(bArr, i11, i12);
            return;
        }
        int i15 = i14 - m5143F;
        this.f4430a.seek(m5143F);
        this.f4430a.write(bArr, i11, i15);
        this.f4430a.seek(16L);
        this.f4430a.write(bArr, i11 + i15, i12 - i15);
    }

    /* renamed from: D */
    private void m5142D(int i10) {
        this.f4430a.setLength(i10);
        this.f4430a.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public int m5143F(int i10) {
        int i11 = this.f4431b;
        if (i10 >= i11) {
            return (i10 + 16) - i11;
        }
        return i10;
    }

    /* renamed from: G */
    private void m5144G(int i10, int i11, int i12, int i13) {
        m5146I(this.f4435f, i10, i11, i12, i13);
        this.f4430a.seek(0L);
        this.f4430a.write(this.f4435f);
    }

    /* renamed from: H */
    private static void m5145H(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    /* renamed from: I */
    private static void m5146I(byte[] bArr, int... iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            m5145H(bArr, i10, i11);
            i10 += 4;
        }
    }

    /* renamed from: l */
    private void m5151l(int i10) {
        int i11 = i10 + 4;
        int m5158z = m5158z();
        if (m5158z >= i11) {
            return;
        }
        int i12 = this.f4431b;
        do {
            m5158z += i12;
            i12 <<= 1;
        } while (m5158z < i11);
        m5142D(i12);
        b bVar = this.f4434e;
        int m5143F = m5143F(bVar.f4440a + 4 + bVar.f4441b);
        if (m5143F < this.f4433d.f4440a) {
            FileChannel channel = this.f4430a.getChannel();
            channel.position(this.f4431b);
            long j10 = m5143F - 4;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f4434e.f4440a;
        int i14 = this.f4433d.f4440a;
        if (i13 < i14) {
            int i15 = (this.f4431b + i13) - 16;
            m5144G(i12, this.f4432c, i14, i15);
            this.f4434e = new b(i15, this.f4434e.f4441b);
        } else {
            m5144G(i12, this.f4432c, i14, i13);
        }
        this.f4431b = i12;
    }

    /* renamed from: n */
    private static void m5152n(File file) throws java.io.IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile m5154s = m5154s(file2);
        try {
            m5154s.setLength(IjkMediaMeta.AV_CH_TOP_FRONT_LEFT);
            m5154s.seek(0L);
            byte[] bArr = new byte[16];
            m5146I(bArr, 4096, 0, 0, 0);
            m5154s.write(bArr);
            m5154s.close();
            if (file2.renameTo(file)) {
            } else {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            m5154s.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static Object m5153r(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: s */
    private static RandomAccessFile m5154s(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: t */
    private b m5155t(int i10) {
        if (i10 == 0) {
            return b.f4439c;
        }
        this.f4430a.seek(i10);
        return new b(i10, this.f4430a.readInt());
    }

    /* renamed from: x */
    private void m5156x() {
        this.f4430a.seek(0L);
        this.f4430a.readFully(this.f4435f);
        int m5157y = m5157y(this.f4435f, 0);
        this.f4431b = m5157y;
        if (m5157y <= this.f4430a.length()) {
            this.f4432c = m5157y(this.f4435f, 4);
            int m5157y2 = m5157y(this.f4435f, 8);
            int m5157y3 = m5157y(this.f4435f, 12);
            this.f4433d = m5155t(m5157y2);
            this.f4434e = m5155t(m5157y3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f4431b + ", Actual length: " + this.f4430a.length());
    }

    /* renamed from: y */
    private static int m5157y(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    /* renamed from: z */
    private int m5158z() {
        return this.f4431b - m5160E();
    }

    /* renamed from: A */
    public synchronized void m5159A() throws java.io.IOException {
        if (!m5165q()) {
            if (this.f4432c == 1) {
                m5163h();
            } else {
                b bVar = this.f4433d;
                int m5143F = m5143F(bVar.f4440a + 4 + bVar.f4441b);
                m5140B(m5143F, this.f4435f, 0, 4);
                int m5157y = m5157y(this.f4435f, 0);
                m5144G(this.f4431b, this.f4432c - 1, m5143F, this.f4434e.f4440a);
                this.f4432c--;
                this.f4433d = new b(m5143F, m5157y);
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    /* renamed from: E */
    public int m5160E() {
        if (this.f4432c == 0) {
            return 16;
        }
        b bVar = this.f4434e;
        int i10 = bVar.f4440a;
        int i11 = this.f4433d.f4440a;
        if (i10 >= i11) {
            return (i10 - i11) + 4 + bVar.f4441b + 16;
        }
        return (((i10 + 4) + bVar.f4441b) + this.f4431b) - i11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
        this.f4430a.close();
    }

    /* renamed from: e */
    public void m5161e(byte[] bArr) {
        m5162f(bArr, 0, bArr.length);
    }

    /* renamed from: f */
    public synchronized void m5162f(byte[] bArr, int i10, int i11) {
        int m5143F;
        int i12 = 0;
        m5153r(bArr, "buffer");
        if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
            m5151l(i11);
            boolean m5165q = m5165q();
            if (m5165q) {
                m5143F = 16;
            } else {
                b bVar = this.f4434e;
                m5143F = m5143F(bVar.f4440a + 4 + bVar.f4441b);
            }
            b bVar2 = new b(m5143F, i11);
            m5145H(this.f4435f, 0, i11);
            m5141C(bVar2.f4440a, this.f4435f, 0, 4);
            m5141C(bVar2.f4440a + 4, bArr, i10, i11);
            if (m5165q) {
                i12 = bVar2.f4440a;
            } else {
                i12 = this.f4433d.f4440a;
            }
            m5144G(this.f4431b, this.f4432c + 1, i12, bVar2.f4440a);
            this.f4434e = bVar2;
            this.f4432c++;
            if (m5165q) {
                this.f4433d = bVar2;
            }
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: h */
    public synchronized void m5163h() {
        m5144G(4096, 0, 0, 0);
        this.f4432c = 0;
        b bVar = b.f4439c;
        this.f4433d = bVar;
        this.f4434e = bVar;
        if (this.f4431b > 4096) {
            m5142D(4096);
        }
        this.f4431b = 4096;
    }

    /* renamed from: m */
    public synchronized void m5164m(d dVar) {
        int i10 = this.f4433d.f4440a;
        for (int i11 = 0; i11 < this.f4432c; i11++) {
            b m5155t = m5155t(i10);
            dVar.mo5166a(new c(this, m5155t, null), m5155t.f4441b);
            i10 = m5143F(m5155t.f4440a + 4 + m5155t.f4441b);
        }
    }

    /* renamed from: q */
    public synchronized boolean m5165q() {
        boolean z10 = false;
        if (this.f4432c == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.f4431b);
        sb2.append(", size=");
        sb2.append(this.f4432c);
        sb2.append(", first=");
        sb2.append(this.f4433d);
        sb2.append(", last=");
        sb2.append(this.f4434e);
        sb2.append(", element lengths=[");
        try {
            m5164m(new a(sb2));
        } catch (IOException e10) {
            f4429g.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }
}
