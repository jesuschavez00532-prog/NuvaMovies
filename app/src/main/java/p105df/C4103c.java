package p105df;

import p120ef.AbstractC4187b;

/* renamed from: df.c */
/* loaded from: classes3.dex */
public class C4103c {

    /* renamed from: a */
    private a f18034a;

    /* renamed from: b */
    private boolean f18035b;

    /* renamed from: c */
    private boolean f18036c;

    /* renamed from: d */
    private boolean f18037d;

    /* renamed from: e */
    private byte f18038e;

    /* renamed from: f */
    private String f18039f;

    /* renamed from: h */
    private AbstractC4187b f18041h = null;

    /* renamed from: g */
    private AbstractC4187b[] f18040g = new AbstractC4187b[3];

    /* renamed from: df.c$a */
    /* loaded from: classes3.dex */
    public enum a {
        PURE_ASCII,
        ESC_ASCII,
        HIGHBYTE
    }

    public C4103c(InterfaceC4101a interfaceC4101a) {
        int i10 = 0;
        while (true) {
            AbstractC4187b[] abstractC4187bArr = this.f18040g;
            if (i10 >= abstractC4187bArr.length) {
                m17165e();
                return;
            } else {
                abstractC4187bArr[i10] = null;
                i10++;
            }
        }
    }

    /* renamed from: a */
    public void m17161a() {
        AbstractC4187b[] abstractC4187bArr;
        if (this.f18037d) {
            if (this.f18039f != null) {
                this.f18035b = true;
                return;
            }
            if (this.f18034a == a.HIGHBYTE) {
                int i10 = 0;
                int i11 = 0;
                float f10 = 0.0f;
                while (true) {
                    abstractC4187bArr = this.f18040g;
                    if (i10 >= abstractC4187bArr.length) {
                        break;
                    }
                    float mo17500d = abstractC4187bArr[i10].mo17500d();
                    if (mo17500d > f10) {
                        i11 = i10;
                        f10 = mo17500d;
                    }
                    i10++;
                }
                if (f10 > 0.2f) {
                    this.f18039f = abstractC4187bArr[i11].mo17499c();
                }
            }
        }
    }

    /* renamed from: b */
    public String m17162b() {
        return this.f18039f;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m17163c(byte[] r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p105df.C4103c.m17163c(byte[], int, int):void");
    }

    /* renamed from: d */
    public boolean m17164d() {
        return this.f18035b;
    }

    /* renamed from: e */
    public void m17165e() {
        int i10 = 0;
        this.f18035b = false;
        this.f18036c = true;
        this.f18039f = null;
        this.f18037d = false;
        this.f18034a = a.PURE_ASCII;
        this.f18038e = (byte) 0;
        AbstractC4187b abstractC4187b = this.f18041h;
        if (abstractC4187b != null) {
            abstractC4187b.mo17503i();
        }
        while (true) {
            AbstractC4187b[] abstractC4187bArr = this.f18040g;
            if (i10 >= abstractC4187bArr.length) {
                return;
            }
            AbstractC4187b abstractC4187b2 = abstractC4187bArr[i10];
            if (abstractC4187b2 != null) {
                abstractC4187b2.mo17503i();
            }
            i10++;
        }
    }
}
