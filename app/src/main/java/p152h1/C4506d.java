package p152h1;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: h1.d */
/* loaded from: classes.dex */
public class C4506d {

    /* renamed from: b */
    private ByteBuffer f19497b;

    /* renamed from: c */
    private C4505c f19498c;

    /* renamed from: a */
    private final byte[] f19496a = new byte[256];

    /* renamed from: d */
    private int f19499d = 0;

    /* renamed from: b */
    private boolean m18838b() {
        if (this.f19498c.f19484b != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private int m18839d() {
        try {
            return this.f19497b.get() & 255;
        } catch (Exception unused) {
            this.f19498c.f19484b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    private void m18840e() {
        boolean z10 = false;
        this.f19498c.f19486d.f19472a = m18849n();
        this.f19498c.f19486d.f19473b = m18849n();
        this.f19498c.f19486d.f19474c = m18849n();
        this.f19498c.f19486d.f19475d = m18849n();
        int m18839d = m18839d();
        boolean z11 = false;
        if ((m18839d & 128) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int pow = (int) Math.pow(2.0d, (m18839d & 7) + 1);
        C4504b c4504b = this.f19498c.f19486d;
        if ((m18839d & 64) != 0) {
            z11 = true;
        }
        c4504b.f19476e = z11;
        if (z10) {
            c4504b.f19482k = m18842g(pow);
        } else {
            c4504b.f19482k = null;
        }
        this.f19498c.f19486d.f19481j = this.f19497b.position();
        m18852r();
        if (m18838b()) {
            return;
        }
        C4505c c4505c = this.f19498c;
        c4505c.f19485c++;
        c4505c.f19487e.add(c4505c.f19486d);
    }

    /* renamed from: f */
    private void m18841f() {
        int m18839d = m18839d();
        this.f19499d = m18839d;
        if (m18839d > 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                try {
                    i11 = this.f19499d;
                    if (i10 < i11) {
                        i11 -= i10;
                        this.f19497b.get(this.f19496a, i10, i11);
                        i10 += i11;
                    } else {
                        return;
                    }
                } catch (Exception e10) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i10 + " count: " + i11 + " blockSize: " + this.f19499d, e10);
                    }
                    this.f19498c.f19484b = 1;
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    private int[] m18842g(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f19497b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = i12 + 1;
                int i14 = i13 + 1;
                int i15 = i14 + 1;
                int i16 = i11 + 1;
                iArr[i11] = ((bArr[i12] & 255) << 16) | (-16777216) | ((bArr[i13] & 255) << 8) | (bArr[i14] & 255);
                i12 = i15;
                i11 = i16;
            }
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f19498c.f19484b = 1;
        }
        return iArr;
    }

    /* renamed from: h */
    private void m18843h() {
        m18844i(Integer.MAX_VALUE);
    }

    /* renamed from: i */
    private void m18844i(int i10) {
        boolean z10 = false;
        while (!z10 && !m18838b() && this.f19498c.f19485c <= i10) {
            int m18839d = m18839d();
            if (m18839d != 33) {
                if (m18839d != 44) {
                    if (m18839d != 59) {
                        this.f19498c.f19484b = 1;
                    } else {
                        z10 = true;
                    }
                } else {
                    C4505c c4505c = this.f19498c;
                    if (c4505c.f19486d == null) {
                        c4505c.f19486d = new C4504b();
                    }
                    m18840e();
                }
            } else {
                int m18839d2 = m18839d();
                if (m18839d2 != 1) {
                    if (m18839d2 != 249) {
                        if (m18839d2 != 254) {
                            if (m18839d2 != 255) {
                                m18851q();
                            } else {
                                m18841f();
                                StringBuilder sb2 = new StringBuilder();
                                for (int i11 = 0; i11 < 11; i11++) {
                                    sb2.append((char) this.f19496a[i11]);
                                }
                                if (sb2.toString().equals("NETSCAPE2.0")) {
                                    m18848m();
                                } else {
                                    m18851q();
                                }
                            }
                        } else {
                            m18851q();
                        }
                    } else {
                        this.f19498c.f19486d = new C4504b();
                        m18845j();
                    }
                } else {
                    m18851q();
                }
            }
        }
    }

    /* renamed from: j */
    private void m18845j() {
        m18839d();
        int m18839d = m18839d();
        C4504b c4504b = this.f19498c.f19486d;
        int i10 = (m18839d & 28) >> 2;
        c4504b.f19478g = i10;
        boolean z10 = true;
        if (i10 == 0) {
            c4504b.f19478g = 1;
        }
        if ((m18839d & 1) == 0) {
            z10 = false;
        }
        c4504b.f19477f = z10;
        int m18849n = m18849n();
        if (m18849n < 2) {
            m18849n = 10;
        }
        C4504b c4504b2 = this.f19498c.f19486d;
        c4504b2.f19480i = m18849n * 10;
        c4504b2.f19479h = m18839d();
        m18839d();
    }

    /* renamed from: k */
    private void m18846k() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) m18839d());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f19498c.f19484b = 1;
            return;
        }
        m18847l();
        if (this.f19498c.f19490h && !m18838b()) {
            C4505c c4505c = this.f19498c;
            c4505c.f19483a = m18842g(c4505c.f19491i);
            C4505c c4505c2 = this.f19498c;
            c4505c2.f19494l = c4505c2.f19483a[c4505c2.f19492j];
        }
    }

    /* renamed from: l */
    private void m18847l() {
        boolean z10 = false;
        this.f19498c.f19488f = m18849n();
        this.f19498c.f19489g = m18849n();
        int m18839d = m18839d();
        C4505c c4505c = this.f19498c;
        if ((m18839d & 128) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        c4505c.f19490h = z10;
        c4505c.f19491i = (int) Math.pow(2.0d, (m18839d & 7) + 1);
        this.f19498c.f19492j = m18839d();
        this.f19498c.f19493k = m18839d();
    }

    /* renamed from: m */
    private void m18848m() {
        do {
            m18841f();
            byte[] bArr = this.f19496a;
            if (bArr[0] == 1) {
                this.f19498c.f19495m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f19499d <= 0) {
                return;
            }
        } while (!m18838b());
    }

    /* renamed from: n */
    private int m18849n() {
        return this.f19497b.getShort();
    }

    /* renamed from: o */
    private void m18850o() {
        this.f19497b = null;
        Arrays.fill(this.f19496a, (byte) 0);
        this.f19498c = new C4505c();
        this.f19499d = 0;
    }

    /* renamed from: q */
    private void m18851q() {
        int m18839d;
        do {
            m18839d = m18839d();
            this.f19497b.position(Math.min(this.f19497b.position() + m18839d, this.f19497b.limit()));
        } while (m18839d > 0);
    }

    /* renamed from: r */
    private void m18852r() {
        m18839d();
        m18851q();
    }

    /* renamed from: a */
    public void m18853a() {
        this.f19497b = null;
        this.f19498c = null;
    }

    /* renamed from: c */
    public C4505c m18854c() {
        if (this.f19497b != null) {
            if (m18838b()) {
                return this.f19498c;
            }
            m18846k();
            if (!m18838b()) {
                m18843h();
                C4505c c4505c = this.f19498c;
                if (c4505c.f19485c < 0) {
                    c4505c.f19484b = 1;
                }
            }
            return this.f19498c;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    /* renamed from: p */
    public C4506d m18855p(ByteBuffer byteBuffer) {
        m18850o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f19497b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f19497b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
