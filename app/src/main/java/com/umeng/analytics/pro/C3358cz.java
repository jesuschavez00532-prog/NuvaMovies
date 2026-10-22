package com.umeng.analytics.pro;

import anet.channel.request.Request;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: com.umeng.analytics.pro.cz */
/* loaded from: classes3.dex */
public class C3358cz extends AbstractC3366dg {

    /* renamed from: a */
    protected static final int f14431a = -65536;

    /* renamed from: b */
    protected static final int f14432b = -2147418112;

    /* renamed from: h */
    private static final C3371dl f14433h = new C3371dl();

    /* renamed from: c */
    protected boolean f14434c;

    /* renamed from: d */
    protected boolean f14435d;

    /* renamed from: e */
    protected int f14436e;

    /* renamed from: f */
    protected boolean f14437f;

    /* renamed from: i */
    private byte[] f14438i;

    /* renamed from: j */
    private byte[] f14439j;

    /* renamed from: k */
    private byte[] f14440k;

    /* renamed from: l */
    private byte[] f14441l;

    /* renamed from: m */
    private byte[] f14442m;

    /* renamed from: n */
    private byte[] f14443n;

    /* renamed from: o */
    private byte[] f14444o;

    /* renamed from: p */
    private byte[] f14445p;

    /* renamed from: com.umeng.analytics.pro.cz$a */
    /* loaded from: classes3.dex */
    public static class a implements InterfaceC3368di {

        /* renamed from: a */
        protected boolean f14446a;

        /* renamed from: b */
        protected boolean f14447b;

        /* renamed from: c */
        protected int f14448c;

        public a() {
            this(false, true);
        }

        @Override // com.umeng.analytics.pro.InterfaceC3368di
        /* renamed from: a */
        public AbstractC3366dg mo14177a(AbstractC3380du abstractC3380du) {
            C3358cz c3358cz = new C3358cz(abstractC3380du, this.f14446a, this.f14447b);
            int i10 = this.f14448c;
            if (i10 != 0) {
                c3358cz.m14152c(i10);
            }
            return c3358cz;
        }

        public a(boolean z10, boolean z11) {
            this(z10, z11, 0);
        }

        public a(boolean z10, boolean z11, int i10) {
            this.f14446a = z10;
            this.f14447b = z11;
            this.f14448c = i10;
        }
    }

    public C3358cz(AbstractC3380du abstractC3380du) {
        this(abstractC3380du, false, true);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: A */
    public ByteBuffer mo14133A() {
        int mo14173w = mo14173w();
        m14154d(mo14173w);
        if (this.f14500g.mo14231h() >= mo14173w) {
            ByteBuffer wrap = ByteBuffer.wrap(this.f14500g.mo14229f(), this.f14500g.mo14230g(), mo14173w);
            this.f14500g.mo14225a(mo14173w);
            return wrap;
        }
        byte[] bArr = new byte[mo14173w];
        this.f14500g.m14233d(bArr, 0, mo14173w);
        return ByteBuffer.wrap(bArr);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14134a() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: b */
    public void mo14150b() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: c */
    public void mo14151c() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: d */
    public void mo14153d() {
        mo14135a((byte) 0);
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
    /* renamed from: g */
    public void mo14157g() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: h */
    public C3364de mo14158h() {
        int mo14173w = mo14173w();
        if (mo14173w < 0) {
            if ((f14431a & mo14173w) == f14432b) {
                return new C3364de(mo14176z(), (byte) (mo14173w & 255), mo14173w());
            }
            throw new C3367dh(4, "Bad version in readMessageBegin");
        }
        if (!this.f14434c) {
            return new C3364de(m14149b(mo14173w), mo14171u(), mo14173w());
        }
        throw new C3367dh(4, "Missing version in readMessageBegin, old client?");
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: i */
    public void mo14159i() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: j */
    public C3371dl mo14160j() {
        return f14433h;
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: k */
    public void mo14161k() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: l */
    public C3361db mo14162l() {
        short mo14172v;
        byte mo14171u = mo14171u();
        if (mo14171u == 0) {
            mo14172v = 0;
        } else {
            mo14172v = mo14172v();
        }
        return new C3361db("", mo14171u, mo14172v);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: m */
    public void mo14163m() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: n */
    public C3363dd mo14164n() {
        return new C3363dd(mo14171u(), mo14171u(), mo14173w());
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: o */
    public void mo14165o() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: p */
    public C3362dc mo14166p() {
        return new C3362dc(mo14171u(), mo14173w());
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: q */
    public void mo14167q() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: r */
    public C3370dk mo14168r() {
        return new C3370dk(mo14171u(), mo14173w());
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: s */
    public void mo14169s() {
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: t */
    public boolean mo14170t() {
        if (mo14171u() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: u */
    public byte mo14171u() {
        if (this.f14500g.mo14231h() >= 1) {
            byte b10 = this.f14500g.mo14229f()[this.f14500g.mo14230g()];
            this.f14500g.mo14225a(1);
            return b10;
        }
        m14132a(this.f14442m, 0, 1);
        return this.f14442m[0];
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: v */
    public short mo14172v() {
        int i10;
        byte[] bArr = this.f14443n;
        if (this.f14500g.mo14231h() >= 2) {
            bArr = this.f14500g.mo14229f();
            i10 = this.f14500g.mo14230g();
            this.f14500g.mo14225a(2);
        } else {
            m14132a(this.f14443n, 0, 2);
            i10 = 0;
        }
        return (short) ((bArr[i10 + 1] & 255) | ((bArr[i10] & 255) << 8));
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: w */
    public int mo14173w() {
        int i10;
        byte[] bArr = this.f14444o;
        if (this.f14500g.mo14231h() >= 4) {
            bArr = this.f14500g.mo14229f();
            i10 = this.f14500g.mo14230g();
            this.f14500g.mo14225a(4);
        } else {
            m14132a(this.f14444o, 0, 4);
            i10 = 0;
        }
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: x */
    public long mo14174x() {
        int i10;
        byte[] bArr = this.f14445p;
        if (this.f14500g.mo14231h() >= 8) {
            bArr = this.f14500g.mo14229f();
            i10 = this.f14500g.mo14230g();
            this.f14500g.mo14225a(8);
        } else {
            m14132a(this.f14445p, 0, 8);
            i10 = 0;
        }
        return (bArr[i10 + 7] & 255) | ((bArr[i10] & 255) << 56) | ((bArr[i10 + 1] & 255) << 48) | ((bArr[i10 + 2] & 255) << 40) | ((bArr[i10 + 3] & 255) << 32) | ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: y */
    public double mo14175y() {
        return Double.longBitsToDouble(mo14174x());
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: z */
    public String mo14176z() {
        int mo14173w = mo14173w();
        if (this.f14500g.mo14231h() >= mo14173w) {
            try {
                String str = new String(this.f14500g.mo14229f(), this.f14500g.mo14230g(), mo14173w, Request.DEFAULT_CHARSET);
                this.f14500g.mo14225a(mo14173w);
                return str;
            } catch (UnsupportedEncodingException unused) {
                throw new C3346cn("JVM DOES NOT SUPPORT UTF-8");
            }
        }
        return m14149b(mo14173w);
    }

    public C3358cz(AbstractC3380du abstractC3380du, boolean z10, boolean z11) {
        super(abstractC3380du);
        this.f14437f = false;
        this.f14438i = new byte[1];
        this.f14439j = new byte[2];
        this.f14440k = new byte[4];
        this.f14441l = new byte[8];
        this.f14442m = new byte[1];
        this.f14443n = new byte[2];
        this.f14444o = new byte[4];
        this.f14445p = new byte[8];
        this.f14434c = z10;
        this.f14435d = z11;
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14144a(C3371dl c3371dl) {
    }

    /* renamed from: b */
    public String m14149b(int i10) {
        try {
            m14154d(i10);
            byte[] bArr = new byte[i10];
            this.f14500g.m14233d(bArr, 0, i10);
            return new String(bArr, Request.DEFAULT_CHARSET);
        } catch (UnsupportedEncodingException unused) {
            throw new C3346cn("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    /* renamed from: c */
    public void m14152c(int i10) {
        this.f14436e = i10;
        this.f14437f = true;
    }

    /* renamed from: d */
    protected void m14154d(int i10) {
        if (i10 >= 0) {
            if (this.f14437f) {
                int i11 = this.f14436e - i10;
                this.f14436e = i11;
                if (i11 >= 0) {
                    return;
                }
                throw new C3367dh("Message length exceeded: " + i10);
            }
            return;
        }
        throw new C3367dh("Negative length: " + i10);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14142a(C3364de c3364de) {
        if (this.f14435d) {
            mo14137a(c3364de.f14494b | f14432b);
            mo14145a(c3364de.f14493a);
            mo14137a(c3364de.f14495c);
        } else {
            mo14145a(c3364de.f14493a);
            mo14135a(c3364de.f14494b);
            mo14137a(c3364de.f14495c);
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14139a(C3361db c3361db) {
        mo14135a(c3361db.f14486b);
        mo14147a(c3361db.f14487c);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14141a(C3363dd c3363dd) {
        mo14135a(c3363dd.f14490a);
        mo14135a(c3363dd.f14491b);
        mo14137a(c3363dd.f14492c);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14140a(C3362dc c3362dc) {
        mo14135a(c3362dc.f14488a);
        mo14137a(c3362dc.f14489b);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14143a(C3370dk c3370dk) {
        mo14135a(c3370dk.f14510a);
        mo14137a(c3370dk.f14511b);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14148a(boolean z10) {
        mo14135a(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14135a(byte b10) {
        byte[] bArr = this.f14438i;
        bArr[0] = b10;
        this.f14500g.mo14222b(bArr, 0, 1);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14147a(short s10) {
        byte[] bArr = this.f14439j;
        bArr[0] = (byte) ((s10 >> 8) & 255);
        bArr[1] = (byte) (s10 & 255);
        this.f14500g.mo14222b(bArr, 0, 2);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14137a(int i10) {
        byte[] bArr = this.f14440k;
        bArr[0] = (byte) ((i10 >> 24) & 255);
        bArr[1] = (byte) ((i10 >> 16) & 255);
        bArr[2] = (byte) ((i10 >> 8) & 255);
        bArr[3] = (byte) (i10 & 255);
        this.f14500g.mo14222b(bArr, 0, 4);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14138a(long j10) {
        byte[] bArr = this.f14441l;
        bArr[0] = (byte) ((j10 >> 56) & 255);
        bArr[1] = (byte) ((j10 >> 48) & 255);
        bArr[2] = (byte) ((j10 >> 40) & 255);
        bArr[3] = (byte) ((j10 >> 32) & 255);
        bArr[4] = (byte) ((j10 >> 24) & 255);
        bArr[5] = (byte) ((j10 >> 16) & 255);
        bArr[6] = (byte) ((j10 >> 8) & 255);
        bArr[7] = (byte) (j10 & 255);
        this.f14500g.mo14222b(bArr, 0, 8);
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14136a(double d10) {
        mo14138a(Double.doubleToLongBits(d10));
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14145a(String str) {
        try {
            byte[] bytes = str.getBytes(Request.DEFAULT_CHARSET);
            mo14137a(bytes.length);
            this.f14500g.mo14222b(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new C3346cn("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.umeng.analytics.pro.AbstractC3366dg
    /* renamed from: a */
    public void mo14146a(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit() - byteBuffer.position();
        mo14137a(limit);
        this.f14500g.mo14222b(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), limit);
    }

    /* renamed from: a */
    private int m14132a(byte[] bArr, int i10, int i11) {
        m14154d(i11);
        return this.f14500g.m14233d(bArr, i10, i11);
    }
}
