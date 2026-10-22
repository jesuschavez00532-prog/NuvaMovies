package na;

import ac.C0157g2;
import ac.C0194q;
import ac.C0196q1;
import ac.C0213u2;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import ca.InterfaceC1439a;
import cc.C1466m0;
import com.module.event.RefreshUerInfoDisplayEvent;
import com.request.result.BaseResult;
import com.request.result.UserInfo;
import la.InterfaceC5535c;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p135fd.C4307b;
import p170i2.C4842a;
import p201k2.C5090g;
import p301qb.InterfaceC6379d1;
import p301qb.InterfaceC6394i1;
import p301qb.InterfaceC6407n;
import p301qb.InterfaceC6430u1;
import ye.C7709c;

/* renamed from: na.b */
/* loaded from: classes2.dex */
public final class C5831b implements InterfaceC1439a, InterfaceC6394i1, InterfaceC6407n, InterfaceC6430u1, InterfaceC6379d1 {

    /* renamed from: a */
    private InterfaceC5535c f23331a;

    /* renamed from: b */
    private final InterfaceC1312h f23332b;

    /* renamed from: c */
    private final InterfaceC1312h f23333c;

    /* renamed from: d */
    private final InterfaceC1312h f23334d;

    /* renamed from: e */
    private final InterfaceC1312h f23335e;

    /* renamed from: f */
    private String f23336f;

    /* renamed from: g */
    private String f23337g;

    /* renamed from: na.b$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0194q invoke() {
            return new C0194q(C5831b.this);
        }
    }

    /* renamed from: na.b$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0196q1 invoke() {
            return new C0196q1(C5831b.this);
        }
    }

    /* renamed from: na.b$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5642a {
        c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0157g2 invoke() {
            return new C0157g2(C5831b.this);
        }
    }

    /* renamed from: na.b$d */
    /* loaded from: classes2.dex */
    static final class d extends AbstractC5869l implements InterfaceC5642a {
        d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0213u2 invoke() {
            return new C0213u2(C5831b.this);
        }
    }

    public C5831b(InterfaceC5535c interfaceC5535c) {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        InterfaceC1312h m5965b3;
        InterfaceC1312h m5965b4;
        this.f23331a = interfaceC5535c;
        m5965b = AbstractC1314j.m5965b(new a());
        this.f23332b = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new c());
        this.f23333c = m5965b2;
        m5965b3 = AbstractC1314j.m5965b(new d());
        this.f23334d = m5965b3;
        m5965b4 = AbstractC1314j.m5965b(new b());
        this.f23335e = m5965b4;
        this.f23336f = "";
        this.f23337g = "";
    }

    /* renamed from: E3 */
    private final C0194q m23565E3() {
        return (C0194q) this.f23332b.getValue();
    }

    /* renamed from: F3 */
    private final C0196q1 m23566F3() {
        return (C0196q1) this.f23335e.getValue();
    }

    /* renamed from: G3 */
    private final C0157g2 m23567G3() {
        return (C0157g2) this.f23333c.getValue();
    }

    /* renamed from: J3 */
    private final C0213u2 m23568J3() {
        return (C0213u2) this.f23334d.getValue();
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
    }

    @Override // p301qb.InterfaceC6394i1
    /* renamed from: E0 */
    public void mo23552E0(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        InterfaceC5535c interfaceC5535c = this.f23331a;
        if (interfaceC5535c != null) {
            interfaceC5535c.mo22442b();
        }
        InterfaceC5535c interfaceC5535c2 = this.f23331a;
        if (interfaceC5535c2 != null) {
            interfaceC5535c2.mo22445k(str);
        }
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        InterfaceC5535c interfaceC5535c = this.f23331a;
        if (interfaceC5535c != null) {
            return interfaceC5535c.mo523N3();
        }
        return null;
    }

    @Override // p301qb.InterfaceC6430u1
    /* renamed from: O2 */
    public void mo23553O2(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        InterfaceC5535c interfaceC5535c = this.f23331a;
        if (interfaceC5535c != null) {
            interfaceC5535c.mo22442b();
        }
        InterfaceC5535c interfaceC5535c2 = this.f23331a;
        if (interfaceC5535c2 != null) {
            interfaceC5535c2.mo22445k(str);
        }
    }

    @Override // p301qb.InterfaceC6407n
    /* renamed from: R0 */
    public void mo23569R0(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        InterfaceC5535c interfaceC5535c = this.f23331a;
        if (interfaceC5535c != null) {
            interfaceC5535c.mo22442b();
        }
        InterfaceC5535c interfaceC5535c2 = this.f23331a;
        if (interfaceC5535c2 != null) {
            interfaceC5535c2.mo22445k(str);
        }
    }

    @Override // p301qb.InterfaceC6379d1
    /* renamed from: S0 */
    public void mo19724S0(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        InterfaceC5535c interfaceC5535c = this.f23331a;
        if (interfaceC5535c != null) {
            interfaceC5535c.mo22442b();
        }
        InterfaceC5535c interfaceC5535c2 = this.f23331a;
        if (interfaceC5535c2 != null) {
            interfaceC5535c2.mo22445k(str);
        }
    }

    /* renamed from: Y0 */
    public void m23570Y0(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "pwd");
        AbstractC5868k.m23674f(str2, "email");
        AbstractC5868k.m23674f(str3, "verifyCode");
        InterfaceC5535c interfaceC5535c = this.f23331a;
        if (interfaceC5535c != null) {
            interfaceC5535c.mo22441a();
        }
        this.f23336f = str2;
        this.f23337g = str3;
        m23566F3().m710b(str);
    }

    /* renamed from: e0 */
    public void m23571e0(String str) {
        AbstractC5868k.m23674f(str, "email");
        InterfaceC5535c interfaceC5535c = this.f23331a;
        if (interfaceC5535c != null) {
            interfaceC5535c.mo22441a();
        }
        m23567G3().m603b(str, "2");
    }

    @Override // p301qb.InterfaceC6379d1
    /* renamed from: h3 */
    public void mo19725h3(BaseResult baseResult) {
        AbstractC5868k.m23674f(baseResult, "bean");
        m23568J3().m743b(this.f23336f, "2", this.f23337g);
    }

    @Override // p301qb.InterfaceC6407n
    /* renamed from: l5 */
    public void mo23572l5(String str) {
        AbstractC5868k.m23674f(str, "email");
        InterfaceC5535c interfaceC5535c = this.f23331a;
        if (interfaceC5535c != null) {
            interfaceC5535c.mo22442b();
        }
        InterfaceC5535c interfaceC5535c2 = this.f23331a;
        if (interfaceC5535c2 != null) {
            interfaceC5535c2.mo22443g3();
        }
        C1466m0 c1466m0 = C1466m0.f5627a;
        UserInfo m6887v = c1466m0.m6887v();
        if (m6887v != null) {
            m6887v.setEmail(str);
        }
        C7709c.m29787d().m29801m(new RefreshUerInfoDisplayEvent(false, 1, null));
        if (AbstractC5868k.m23669a(c1466m0.m6860d(), "2") && C4842a.f20329a.m19920a().m19976y()) {
            C5090g c5090g = C5090g.f20948a;
            c5090g.m20656x(c5090g.m20641f(), str);
        }
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p301qb.InterfaceC6430u1
    /* renamed from: x0 */
    public void mo23558x0(String str, String str2) {
        AbstractC5868k.m23674f(str, "email");
        AbstractC5868k.m23674f(str2, "verifyCode");
        m23565E3().m701b(str, "2", str2);
    }

    @Override // p301qb.InterfaceC6394i1
    /* renamed from: x5 */
    public void mo23559x5() {
        InterfaceC5535c interfaceC5535c = this.f23331a;
        if (interfaceC5535c != null) {
            interfaceC5535c.mo22442b();
        }
        InterfaceC5535c interfaceC5535c2 = this.f23331a;
        if (interfaceC5535c2 != null) {
            interfaceC5535c2.mo22444i();
        }
    }
}
