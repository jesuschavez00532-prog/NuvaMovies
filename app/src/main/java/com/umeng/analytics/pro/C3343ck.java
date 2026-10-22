package com.umeng.analytics.pro;

import com.umeng.analytics.pro.C3360da;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: com.umeng.analytics.pro.ck */
/* loaded from: classes3.dex */
public class C3343ck {

    /* renamed from: a */
    private final AbstractC3366dg f14405a;

    /* renamed from: b */
    private final C3379dt f14406b;

    public C3343ck() {
        this(new C3360da.a());
    }

    /* renamed from: j */
    private C3361db m14080j(byte[] bArr, InterfaceC3347co interfaceC3347co, InterfaceC3347co... interfaceC3347coArr) {
        this.f14406b.m14226a(bArr);
        int length = interfaceC3347coArr.length + 1;
        InterfaceC3347co[] interfaceC3347coArr2 = new InterfaceC3347co[length];
        int i10 = 0;
        interfaceC3347coArr2[0] = interfaceC3347co;
        int i11 = 0;
        while (i11 < interfaceC3347coArr.length) {
            int i12 = i11 + 1;
            interfaceC3347coArr2[i12] = interfaceC3347coArr[i11];
            i11 = i12;
        }
        this.f14405a.mo14160j();
        C3361db c3361db = null;
        while (i10 < length) {
            c3361db = this.f14405a.mo14162l();
            if (c3361db.f14486b == 0 || c3361db.f14487c > interfaceC3347coArr2[i10].mo13982a()) {
                return null;
            }
            if (c3361db.f14487c != interfaceC3347coArr2[i10].mo13982a()) {
                C3369dj.m14213a(this.f14405a, c3361db.f14486b);
                this.f14405a.mo14163m();
            } else {
                i10++;
                if (i10 < length) {
                    this.f14405a.mo14160j();
                }
            }
        }
        return c3361db;
    }

    /* renamed from: a */
    public void m14084a(InterfaceC3340ch interfaceC3340ch, byte[] bArr) {
        try {
            this.f14406b.m14226a(bArr);
            interfaceC3340ch.read(this.f14405a);
        } finally {
            this.f14406b.m14228e();
            this.f14405a.mo14204B();
        }
    }

    /* renamed from: b */
    public Byte m14086b(byte[] bArr, InterfaceC3347co interfaceC3347co, InterfaceC3347co... interfaceC3347coArr) {
        return (Byte) m14079a((byte) 3, bArr, interfaceC3347co, interfaceC3347coArr);
    }

    /* renamed from: c */
    public Double m14087c(byte[] bArr, InterfaceC3347co interfaceC3347co, InterfaceC3347co... interfaceC3347coArr) {
        return (Double) m14079a((byte) 4, bArr, interfaceC3347co, interfaceC3347coArr);
    }

    /* renamed from: d */
    public Short m14088d(byte[] bArr, InterfaceC3347co interfaceC3347co, InterfaceC3347co... interfaceC3347coArr) {
        return (Short) m14079a((byte) 6, bArr, interfaceC3347co, interfaceC3347coArr);
    }

    /* renamed from: e */
    public Integer m14089e(byte[] bArr, InterfaceC3347co interfaceC3347co, InterfaceC3347co... interfaceC3347coArr) {
        return (Integer) m14079a((byte) 8, bArr, interfaceC3347co, interfaceC3347coArr);
    }

    /* renamed from: f */
    public Long m14090f(byte[] bArr, InterfaceC3347co interfaceC3347co, InterfaceC3347co... interfaceC3347coArr) {
        return (Long) m14079a((byte) 10, bArr, interfaceC3347co, interfaceC3347coArr);
    }

    /* renamed from: g */
    public String m14091g(byte[] bArr, InterfaceC3347co interfaceC3347co, InterfaceC3347co... interfaceC3347coArr) {
        return (String) m14079a((byte) 11, bArr, interfaceC3347co, interfaceC3347coArr);
    }

    /* renamed from: h */
    public ByteBuffer m14092h(byte[] bArr, InterfaceC3347co interfaceC3347co, InterfaceC3347co... interfaceC3347coArr) {
        return (ByteBuffer) m14079a((byte) 100, bArr, interfaceC3347co, interfaceC3347coArr);
    }

    /* renamed from: i */
    public Short m14093i(byte[] bArr, InterfaceC3347co interfaceC3347co, InterfaceC3347co... interfaceC3347coArr) {
        try {
            try {
                if (m14080j(bArr, interfaceC3347co, interfaceC3347coArr) != null) {
                    this.f14405a.mo14160j();
                    return Short.valueOf(this.f14405a.mo14162l().f14487c);
                }
                this.f14406b.m14228e();
                this.f14405a.mo14204B();
                return null;
            } catch (Exception e10) {
                throw new C3346cn(e10);
            }
        } finally {
            this.f14406b.m14228e();
            this.f14405a.mo14204B();
        }
    }

    public C3343ck(InterfaceC3368di interfaceC3368di) {
        C3379dt c3379dt = new C3379dt();
        this.f14406b = c3379dt;
        this.f14405a = interfaceC3368di.mo14177a(c3379dt);
    }

    /* renamed from: a */
    public void m14083a(InterfaceC3340ch interfaceC3340ch, String str, String str2) {
        try {
            try {
                m14084a(interfaceC3340ch, str.getBytes(str2));
            } catch (UnsupportedEncodingException unused) {
                throw new C3346cn("JVM DOES NOT SUPPORT ENCODING: " + str2);
            }
        } finally {
            this.f14405a.mo14204B();
        }
    }

    /* renamed from: a */
    public void m14085a(InterfaceC3340ch interfaceC3340ch, byte[] bArr, InterfaceC3347co interfaceC3347co, InterfaceC3347co... interfaceC3347coArr) {
        try {
            try {
                if (m14080j(bArr, interfaceC3347co, interfaceC3347coArr) != null) {
                    interfaceC3340ch.read(this.f14405a);
                }
            } catch (Exception e10) {
                throw new C3346cn(e10);
            }
        } finally {
            this.f14406b.m14228e();
            this.f14405a.mo14204B();
        }
    }

    /* renamed from: a */
    public Boolean m14081a(byte[] bArr, InterfaceC3347co interfaceC3347co, InterfaceC3347co... interfaceC3347coArr) {
        return (Boolean) m14079a((byte) 2, bArr, interfaceC3347co, interfaceC3347coArr);
    }

    /* renamed from: a */
    private Object m14079a(byte b10, byte[] bArr, InterfaceC3347co interfaceC3347co, InterfaceC3347co... interfaceC3347coArr) {
        try {
            try {
                C3361db m14080j = m14080j(bArr, interfaceC3347co, interfaceC3347coArr);
                if (m14080j != null) {
                    if (b10 != 2) {
                        if (b10 != 3) {
                            if (b10 != 4) {
                                if (b10 != 6) {
                                    if (b10 != 8) {
                                        if (b10 != 100) {
                                            if (b10 != 10) {
                                                if (b10 == 11 && m14080j.f14486b == 11) {
                                                    return this.f14405a.mo14176z();
                                                }
                                            } else if (m14080j.f14486b == 10) {
                                                return Long.valueOf(this.f14405a.mo14174x());
                                            }
                                        } else if (m14080j.f14486b == 11) {
                                            return this.f14405a.mo14133A();
                                        }
                                    } else if (m14080j.f14486b == 8) {
                                        return Integer.valueOf(this.f14405a.mo14173w());
                                    }
                                } else if (m14080j.f14486b == 6) {
                                    return Short.valueOf(this.f14405a.mo14172v());
                                }
                            } else if (m14080j.f14486b == 4) {
                                return Double.valueOf(this.f14405a.mo14175y());
                            }
                        } else if (m14080j.f14486b == 3) {
                            return Byte.valueOf(this.f14405a.mo14171u());
                        }
                    } else if (m14080j.f14486b == 2) {
                        return Boolean.valueOf(this.f14405a.mo14170t());
                    }
                }
                this.f14406b.m14228e();
                this.f14405a.mo14204B();
                return null;
            } catch (Exception e10) {
                throw new C3346cn(e10);
            }
        } finally {
            this.f14406b.m14228e();
            this.f14405a.mo14204B();
        }
    }

    /* renamed from: a */
    public void m14082a(InterfaceC3340ch interfaceC3340ch, String str) {
        m14084a(interfaceC3340ch, str.getBytes());
    }
}
