package com.umeng.analytics.pro;

import anet.channel.request.Request;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: com.umeng.analytics.pro.da */
/* loaded from: classes3.dex */
public class C3360da extends AbstractC3366dg {

    /* renamed from: d */
    private static final C3371dl f14455d = new C3371dl("");

    /* renamed from: e */
    private static final C3361db f14456e = new C3361db("", (byte) 0, 0);

    /* renamed from: f */
    private static final byte[] f14457f;

    /* renamed from: h */
    private static final byte f14458h = -126;

    /* renamed from: i */
    private static final byte f14459i = 1;

    /* renamed from: j */
    private static final byte f14460j = 31;

    /* renamed from: k */
    private static final byte f14461k = -32;

    /* renamed from: l */
    private static final int f14462l = 5;

    /* renamed from: a */
    byte[] f14463a;

    /* renamed from: b */
    byte[] f14464b;

    /* renamed from: c */
    byte[] f14465c;

    /* renamed from: m */
    private C3338cf f14466m;

    /* renamed from: n */
    private short f14467n;

    /* renamed from: o */
    private C3361db f14468o;

    /* renamed from: p */
    private Boolean f14469p;

    /* renamed from: q */
    private final long f14470q;

    /* renamed from: r */
    private byte[] f14471r;

    /* renamed from: com.umeng.analytics.pro.da$b */
    /* loaded from: classes3.dex */
    private static class b {

        /* renamed from: a */
        public static final byte f14473a = 1;

        /* renamed from: b */
        public static final byte f14474b = 2;

        /* renamed from: c */
        public static final byte f14475c = 3;

        /* renamed from: d */
        public static final byte f14476d = 4;

        /* renamed from: e */
        public static final byte f14477e = 5;

        /* renamed from: f */
        public static final byte f14478f = 6;

        /* renamed from: g */
        public static final byte f14479g = 7;

        /* renamed from: h */
        public static final byte f14480h = 8;

        /* renamed from: i */
        public static final byte f14481i = 9;

        /* renamed from: j */
        public static final byte f14482j = 10;

        /* renamed from: k */
        public static final byte f14483k = 11;

        /* renamed from: l */
        public static final byte f14484l = 12;

        private b() {
        }
    }

    static {
        f14457f = r0;
        byte[] bArr = {0, 0, 1, 3, 7, 0, 4, 0, 5, 0, 6, 8, 12, 11, 10, 9};
    }

    public C3360da(AbstractC3380du abstractC3380du, long j10) {
        super(abstractC3380du);
        this.f14466m = new C3338cf(15);
        this.f14467n = (short) 0;
        this.f14468o = null;
        this.f14469p = null;
        this.f14463a = new byte[5];
        this.f14464b = new byte[10];
        this.f14471r = new byte[1];
        this.f14465c = new byte[1];
        this.f14470q = j10;
    }

    /* renamed from: E */
    private int m14185E() {
        int i10 = 0;
        if (this.f14500g.mo14231h() >= 5) {
            byte[] mo14229f = this.f14500g.mo14229f();
            int mo14230g = this.f14500g.mo14230g();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                byte b10 = mo14229f[mo14230g + i10];
                i11 |= (b10 & Byte.MAX_VALUE) << i12;
                if ((b10 & 128) != 128) {
                    this.f14500g.mo14225a(i10 + 1);
                    return i11;
                }
                i12 += 7;
                i10++;
            }
        } else {
            int i13 = 0;
            while (true) {
                byte mo14171u = mo14171u();
                i10 |= (mo14171u & Byte.MAX_VALUE) << i13;
                if ((mo14171u & 128) != 128) {
                    return i10;
                }
                i13 += 7;
            }
        }
    }

    /* renamed from: F */
    private long m14186F() {
        int i10 = 0;
        long j10 = 0;
        if (this.f14500g.mo14231h() >= 10) {
            byte[] mo14229f = this.f14500g.mo14229f();
            int mo14230g = this.f14500g.mo14230g();
            long j11 = 0;
            int i11 = 0;
            while (true) {
                j11 |= (r7 & Byte.MAX_VALUE) << i11;
                if ((mo14229f[mo14230g + i10] & 128) != 128) {
                    this.f14500g.mo14225a(i10 + 1);
                    return j11;
                }
                i11 += 7;
                i10++;
            }
        } else {
            while (true) {
                j10 |= (r0 & Byte.MAX_VALUE) << i10;
                if ((mo14171u() & 128) != 128) {
                    return j10;
                }
                i10 += 7;
            }
        }
    }

    /* renamed from: c */
    private int m14194c(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    /* renamed from: d */
    private long m14198d(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    /* renamed from: g */
    private int m14203g(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: A */
    public ByteBuffer mo14133A() {
        int m14185E = m14185E();
        m14202f(m14185E);
        if (m14185E == 0) {
            return ByteBuffer.wrap(new byte[0]);
        }
        byte[] bArr = new byte[m14185E];
        this.f14500g.m14233d(bArr, 0, m14185E);
        return ByteBuffer.wrap(bArr);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: B */
    public void mo14204B() {
        this.f14466m.m14052c();
        this.f14467n = (short) 0;
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14134a() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: b */
    public void mo14150b() {
        this.f14467n = this.f14466m.m14049a();
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: e */
    public void mo14155e() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: f */
    public void mo14156f() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: h */
    public C3364de mo14158h() {
        byte mo14171u = mo14171u();
        if (mo14171u == -126) {
            byte mo14171u2 = mo14171u();
            byte b10 = (byte) (mo14171u2 & f14460j);
            if (b10 == 1) {
                return new C3364de(mo14176z(), (byte) ((mo14171u2 >> 5) & 3), m14185E());
            }
            throw new C3367dh("Expected version 1 but got " + ((int) b10));
        }
        throw new C3367dh("Expected protocol id " + Integer.toHexString(-126) + " but got " + Integer.toHexString(mo14171u));
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: i */
    public void mo14159i() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: j */
    public C3371dl mo14160j() {
        this.f14466m.m14050a(this.f14467n);
        this.f14467n = (short) 0;
        return f14455d;
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: k */
    public void mo14161k() {
        this.f14467n = this.f14466m.m14049a();
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: l */
    public C3361db mo14162l() {
        short s10;
        Boolean bool;
        byte mo14171u = mo14171u();
        if (mo14171u == 0) {
            return f14456e;
        }
        short s11 = (short) ((mo14171u & 240) >> 4);
        if (s11 == 0) {
            s10 = mo14172v();
        } else {
            s10 = (short) (this.f14467n + s11);
        }
        byte b10 = (byte) (mo14171u & C3373dn.f14525m);
        C3361db c3361db = new C3361db("", m14197d(b10), s10);
        if (m14196c(mo14171u)) {
            if (b10 == 1) {
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            this.f14469p = bool;
        }
        this.f14467n = c3361db.f14487c;
        return c3361db;
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: m */
    public void mo14163m() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: n */
    public C3363dd mo14164n() {
        byte mo14171u;
        int m14185E = m14185E();
        if (m14185E == 0) {
            mo14171u = 0;
        } else {
            mo14171u = mo14171u();
        }
        return new C3363dd(m14197d((byte) (mo14171u >> 4)), m14197d((byte) (mo14171u & C3373dn.f14525m)), m14185E);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: o */
    public void mo14165o() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: p */
    public C3362dc mo14166p() {
        byte mo14171u = mo14171u();
        int i10 = (mo14171u >> 4) & 15;
        if (i10 == 15) {
            i10 = m14185E();
        }
        return new C3362dc(m14197d(mo14171u), i10);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: q */
    public void mo14167q() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: r */
    public C3370dk mo14168r() {
        return new C3370dk(mo14166p());
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: s */
    public void mo14169s() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: t */
    public boolean mo14170t() {
        Boolean bool = this.f14469p;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.f14469p = null;
            return booleanValue;
        }
        if (mo14171u() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: u */
    public byte mo14171u() {
        if (this.f14500g.mo14231h() > 0) {
            byte b10 = this.f14500g.mo14229f()[this.f14500g.mo14230g()];
            this.f14500g.mo14225a(1);
            return b10;
        }
        this.f14500g.m14233d(this.f14465c, 0, 1);
        return this.f14465c[0];
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: v */
    public short mo14172v() {
        return (short) m14203g(m14185E());
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: w */
    public int mo14173w() {
        return m14203g(m14185E());
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: x */
    public long mo14174x() {
        return m14198d(m14186F());
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: y */
    public double mo14175y() {
        byte[] bArr = new byte[8];
        this.f14500g.m14233d(bArr, 0, 8);
        return Double.longBitsToDouble(m14187a(bArr));
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: z */
    public String mo14176z() {
        int m14185E = m14185E();
        m14202f(m14185E);
        if (m14185E == 0) {
            return "";
        }
        try {
            if (this.f14500g.mo14231h() >= m14185E) {
                String str = new String(this.f14500g.mo14229f(), this.f14500g.mo14230g(), m14185E, Request.DEFAULT_CHARSET);
                this.f14500g.mo14225a(m14185E);
                return str;
            }
            return new String(m14201e(m14185E), Request.DEFAULT_CHARSET);
        } catch (UnsupportedEncodingException unused) {
            throw new C3346cn("UTF-8 not supported!");
        }
    }

    /* renamed from: com.umeng.analytics.pro.da$a */
    /* loaded from: classes3.dex */
    public static class a implements InterfaceC3368di {

        /* renamed from: a */
        private final long f14472a;

        public a() {
            this.f14472a = -1L;
        }

        @Override // com.umeng.analytics.pro.InterfaceC3368di
        /* renamed from: a */
        public AbstractC3366dg mo14177a(AbstractC3380du abstractC3380du) {
            return new C3360da(abstractC3380du, this.f14472a);
        }

        public a(int i10) {
            this.f14472a = i10;
        }
    }

    /* renamed from: b */
    private void m14192b(int i10) {
        int i11 = 0;
        while ((i10 & (-128)) != 0) {
            this.f14463a[i11] = (byte) ((i10 & 127) | 128);
            i10 >>>= 7;
            i11++;
        }
        byte[] bArr = this.f14463a;
        bArr[i11] = (byte) i10;
        this.f14500g.mo14222b(bArr, 0, i11 + 1);
    }

    /* renamed from: c */
    private long m14195c(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    /* renamed from: e */
    private byte[] m14201e(int i10) {
        if (i10 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i10];
        this.f14500g.m14233d(bArr, 0, i10);
        return bArr;
    }

    /* renamed from: f */
    private void m14202f(int i10) {
        if (i10 >= 0) {
            long j10 = this.f14470q;
            if (j10 == -1 || i10 <= j10) {
                return;
            }
            throw new C3367dh("Length exceeded max allowed: " + i10);
        }
        throw new C3367dh("Negative length: " + i10);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14142a(C3364de c3364de) {
        m14191b(f14458h);
        m14199d(((c3364de.f14494b << 5) & (-32)) | 1);
        m14192b(c3364de.f14495c);
        mo14145a(c3364de.f14493a);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: d */
    public void mo14153d() {
        m14191b((byte) 0);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: g */
    public void mo14157g() {
    }

    /* renamed from: d */
    private void m14199d(int i10) {
        m14191b((byte) i10);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: c */
    public void mo14151c() {
    }

    /* renamed from: c */
    private boolean m14196c(byte b10) {
        int i10 = b10 & C3373dn.f14525m;
        return i10 == 1 || i10 == 2;
    }

    /* renamed from: d */
    private byte m14197d(byte b10) {
        byte b11 = (byte) (b10 & C3373dn.f14525m);
        switch (b11) {
            case 0:
                return (byte) 0;
            case 1:
            case 2:
                return (byte) 2;
            case 3:
                return (byte) 3;
            case 4:
                return (byte) 6;
            case 5:
                return (byte) 8;
            case 6:
                return (byte) 10;
            case 7:
                return (byte) 4;
            case 8:
                return (byte) 11;
            case 9:
                return C3373dn.f14525m;
            case 10:
                return C3373dn.f14524l;
            case 11:
                return C3373dn.f14523k;
            case 12:
                return (byte) 12;
            default:
                throw new C3367dh("don't know what type: " + ((int) b11));
        }
    }

    /* renamed from: e */
    private byte m14200e(byte b10) {
        return f14457f[b10];
    }

    /* renamed from: b */
    private void m14193b(long j10) {
        int i10 = 0;
        while (((-128) & j10) != 0) {
            this.f14464b[i10] = (byte) ((127 & j10) | 128);
            j10 >>>= 7;
            i10++;
        }
        byte[] bArr = this.f14464b;
        bArr[i10] = (byte) j10;
        this.f14500g.mo14222b(bArr, 0, i10 + 1);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14144a(C3371dl c3371dl) {
        this.f14466m.m14050a(this.f14467n);
        this.f14467n = (short) 0;
    }

    /* renamed from: b */
    private void m14191b(byte b10) {
        byte[] bArr = this.f14471r;
        bArr[0] = b10;
        this.f14500g.m14232b(bArr);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14139a(C3361db c3361db) {
        if (c3361db.f14486b == 2) {
            this.f14468o = c3361db;
        } else {
            m14189a(c3361db, (byte) -1);
        }
    }

    public C3360da(AbstractC3380du abstractC3380du) {
        this(abstractC3380du, -1L);
    }

    /* renamed from: a */
    private void m14189a(C3361db c3361db, byte b10) {
        if (b10 == -1) {
            b10 = m14200e(c3361db.f14486b);
        }
        short s10 = c3361db.f14487c;
        short s11 = this.f14467n;
        if (s10 > s11 && s10 - s11 <= 15) {
            m14199d(b10 | ((s10 - s11) << 4));
        } else {
            m14191b(b10);
            mo14147a(c3361db.f14487c);
        }
        this.f14467n = c3361db.f14487c;
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14141a(C3363dd c3363dd) {
        int i10 = c3363dd.f14492c;
        if (i10 == 0) {
            m14199d(0);
            return;
        }
        m14192b(i10);
        m14199d(m14200e(c3363dd.f14491b) | (m14200e(c3363dd.f14490a) << 4));
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14140a(C3362dc c3362dc) {
        m14205a(c3362dc.f14488a, c3362dc.f14489b);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14143a(C3370dk c3370dk) {
        m14205a(c3370dk.f14510a, c3370dk.f14511b);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14148a(boolean z10) {
        C3361db c3361db = this.f14468o;
        if (c3361db != null) {
            m14189a(c3361db, z10 ? (byte) 1 : (byte) 2);
            this.f14468o = null;
        } else {
            m14191b(z10 ? (byte) 1 : (byte) 2);
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14135a(byte b10) {
        m14191b(b10);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14147a(short s10) {
        m14192b(m14194c((int) s10));
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14137a(int i10) {
        m14192b(m14194c(i10));
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14138a(long j10) {
        m14193b(m14195c(j10));
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14136a(double d10) {
        byte[] bArr = {0, 0, 0, 0, 0, 0, 0, 0};
        m14188a(Double.doubleToLongBits(d10), bArr, 0);
        this.f14500g.m14232b(bArr);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14145a(String str) {
        try {
            byte[] bytes = str.getBytes(Request.DEFAULT_CHARSET);
            m14190a(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new C3346cn("UTF-8 not supported!");
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14146a(ByteBuffer byteBuffer) {
        m14190a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position());
    }

    /* renamed from: a */
    private void m14190a(byte[] bArr, int i10, int i11) {
        m14192b(i11);
        this.f14500g.mo14222b(bArr, i10, i11);
    }

    /* renamed from: a */
    protected void m14205a(byte b10, int i10) {
        if (i10 <= 14) {
            m14199d(m14200e(b10) | (i10 << 4));
        } else {
            m14199d(m14200e(b10) | 240);
            m14192b(i10);
        }
    }

    /* renamed from: a */
    private void m14188a(long j10, byte[] bArr, int i10) {
        bArr[i10 + 0] = (byte) (j10 & 255);
        bArr[i10 + 1] = (byte) ((j10 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((j10 >> 16) & 255);
        bArr[i10 + 3] = (byte) ((j10 >> 24) & 255);
        bArr[i10 + 4] = (byte) ((j10 >> 32) & 255);
        bArr[i10 + 5] = (byte) ((j10 >> 40) & 255);
        bArr[i10 + 6] = (byte) ((j10 >> 48) & 255);
        bArr[i10 + 7] = (byte) ((j10 >> 56) & 255);
    }

    /* renamed from: a */
    private long m14187a(byte[] bArr) {
        return ((bArr[7] & 255) << 56) | ((bArr[6] & 255) << 48) | ((bArr[5] & 255) << 40) | ((bArr[4] & 255) << 32) | ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8) | (255 & bArr[0]);
    }
}
