package na;

import ac.C0157g2;
import ac.C0180m1;
import ac.C0213u2;
import ac.C0220x;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import ca.InterfaceC1439a;
import cc.AbstractC1459j;
import cc.C1466m0;
import com.module.event.LoginSuccessRequestDataEvent;
import com.request.result.LoginResult;
import la.InterfaceC5536d;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p135fd.C4307b;
import p170i2.C4842a;
import p185j2.C4982a;
import p301qb.InterfaceC6394i1;
import p301qb.InterfaceC6428u;
import p301qb.InterfaceC6430u1;
import p301qb.InterfaceC6444z0;
import p415y9.AbstractApplicationC7689d;
import ye.C7709c;

/* renamed from: na.c */
/* loaded from: classes2.dex */
public final class C5832c implements InterfaceC1439a, InterfaceC6394i1, InterfaceC6430u1, InterfaceC6428u, InterfaceC6444z0 {

    /* renamed from: a */
    private InterfaceC5536d f23342a;

    /* renamed from: b */
    private final InterfaceC1312h f23343b;

    /* renamed from: c */
    private final InterfaceC1312h f23344c;

    /* renamed from: d */
    private final InterfaceC1312h f23345d;

    /* renamed from: e */
    private final InterfaceC1312h f23346e;

    /* renamed from: f */
    private String f23347f;

    /* renamed from: na.c$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0220x invoke() {
            return new C0220x(C5832c.this);
        }
    }

    /* renamed from: na.c$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0180m1 invoke() {
            return new C0180m1(C5832c.this, null, 2, null);
        }
    }

    /* renamed from: na.c$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5642a {
        c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0157g2 invoke() {
            return new C0157g2(C5832c.this);
        }
    }

    /* renamed from: na.c$d */
    /* loaded from: classes2.dex */
    static final class d extends AbstractC5869l implements InterfaceC5642a {
        d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0213u2 invoke() {
            return new C0213u2(C5832c.this);
        }
    }

    public C5832c(InterfaceC5536d interfaceC5536d) {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        InterfaceC1312h m5965b3;
        InterfaceC1312h m5965b4;
        this.f23342a = interfaceC5536d;
        m5965b = AbstractC1314j.m5965b(new a());
        this.f23343b = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new c());
        this.f23344c = m5965b2;
        m5965b3 = AbstractC1314j.m5965b(new d());
        this.f23345d = m5965b3;
        m5965b4 = AbstractC1314j.m5965b(new b());
        this.f23346e = m5965b4;
        this.f23347f = "";
    }

    /* renamed from: E3 */
    private final C0180m1 m23577E3() {
        return (C0180m1) this.f23346e.getValue();
    }

    /* renamed from: F3 */
    private final C0157g2 m23578F3() {
        return (C0157g2) this.f23344c.getValue();
    }

    /* renamed from: G3 */
    private final C0213u2 m23579G3() {
        return (C0213u2) this.f23345d.getValue();
    }

    /* renamed from: O3 */
    private final void m23580O3() {
        String m6799d = AbstractC1459j.m6799d(this.f23347f, C4842a.f20329a.m19920a().mo19967p());
        C4982a c4982a = C4982a.f20721a;
        AbstractApplicationC7689d.a aVar = AbstractApplicationC7689d.f28135d;
        c4982a.m20335c(aVar.m29494a(), "user_account_EMAIL", m6799d);
        c4982a.m20335c(aVar.m29494a(), "user_account_PHONE", "");
    }

    /* renamed from: Y0 */
    private final C0220x m23581Y0() {
        return (C0220x) this.f23343b.getValue();
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
    }

    @Override // p301qb.InterfaceC6394i1
    /* renamed from: E0 */
    public void mo23552E0(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        InterfaceC5536d interfaceC5536d = this.f23342a;
        if (interfaceC5536d != null) {
            interfaceC5536d.mo22448b();
        }
        InterfaceC5536d interfaceC5536d2 = this.f23342a;
        if (interfaceC5536d2 != null) {
            interfaceC5536d2.mo22451k(str);
        }
    }

    @Override // p301qb.InterfaceC6444z0
    /* renamed from: H4 */
    public void mo18504H4(String str, boolean z10, LoginResult loginResult) {
        AbstractC5868k.m23674f(str, "password");
        InterfaceC5536d interfaceC5536d = this.f23342a;
        if (interfaceC5536d != null) {
            interfaceC5536d.mo22448b();
        }
        InterfaceC5536d interfaceC5536d2 = this.f23342a;
        if (interfaceC5536d2 != null) {
            interfaceC5536d2.mo22449h5();
        }
    }

    /* renamed from: J3 */
    public void m23582J3(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "email");
        AbstractC5868k.m23674f(str2, "password");
        AbstractC5868k.m23674f(str3, "verifyCode");
        this.f23347f = str;
        m23581Y0().m774b(str, str2, str3);
    }

    /* renamed from: K */
    public void m23583K(String str, String str2) {
        AbstractC5868k.m23674f(str, "email");
        AbstractC5868k.m23674f(str2, "verifyCode");
        InterfaceC5536d interfaceC5536d = this.f23342a;
        if (interfaceC5536d != null) {
            interfaceC5536d.mo22447a();
        }
        m23579G3().m743b(str, "3", str2);
    }

    @Override // p301qb.InterfaceC6444z0
    /* renamed from: N */
    public void mo18505N(boolean z10, LoginResult loginResult) {
        InterfaceC5536d interfaceC5536d = this.f23342a;
        if (interfaceC5536d != null) {
            interfaceC5536d.mo22448b();
        }
        m23580O3();
        C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(true, false, null, 6, null));
        InterfaceC5536d interfaceC5536d2 = this.f23342a;
        if (interfaceC5536d2 != null) {
            interfaceC5536d2.mo22446I1("isLogin");
        }
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        InterfaceC5536d interfaceC5536d = this.f23342a;
        if (interfaceC5536d != null) {
            return interfaceC5536d.mo523N3();
        }
        return null;
    }

    @Override // p301qb.InterfaceC6430u1
    /* renamed from: O2 */
    public void mo23553O2(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        InterfaceC5536d interfaceC5536d = this.f23342a;
        if (interfaceC5536d != null) {
            interfaceC5536d.mo22448b();
        }
        InterfaceC5536d interfaceC5536d2 = this.f23342a;
        if (interfaceC5536d2 != null) {
            interfaceC5536d2.mo22451k(str);
        }
    }

    /* renamed from: e0 */
    public void m23584e0(String str) {
        AbstractC5868k.m23674f(str, "email");
        InterfaceC5536d interfaceC5536d = this.f23342a;
        if (interfaceC5536d != null) {
            interfaceC5536d.mo22447a();
        }
        m23578F3().m603b(str, "3");
    }

    @Override // p301qb.InterfaceC6444z0
    /* renamed from: f0 */
    public void mo18506f0(boolean z10, String str) {
        AbstractC5868k.m23674f(str, "errCode");
        InterfaceC5536d interfaceC5536d = this.f23342a;
        if (interfaceC5536d != null) {
            interfaceC5536d.mo22448b();
        }
        InterfaceC5536d interfaceC5536d2 = this.f23342a;
        if (interfaceC5536d2 != null) {
            interfaceC5536d2.mo22446I1("isNotLogin");
        }
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p301qb.InterfaceC6428u
    /* renamed from: v5 */
    public void mo23585v5(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        InterfaceC5536d interfaceC5536d = this.f23342a;
        if (interfaceC5536d != null) {
            interfaceC5536d.mo22448b();
        }
        InterfaceC5536d interfaceC5536d2 = this.f23342a;
        if (interfaceC5536d2 != null) {
            interfaceC5536d2.mo22451k(str);
        }
    }

    @Override // p301qb.InterfaceC6428u
    /* renamed from: v6 */
    public void mo23586v6() {
        C0180m1.m657h(m23577E3(), "2", this.f23347f, C1466m0.f5627a.m6889x(), "1", null, null, null, 112, null);
    }

    @Override // p301qb.InterfaceC6430u1
    /* renamed from: x0 */
    public void mo23558x0(String str, String str2) {
        AbstractC5868k.m23674f(str, "email");
        AbstractC5868k.m23674f(str2, "verifyCode");
        InterfaceC5536d interfaceC5536d = this.f23342a;
        if (interfaceC5536d != null) {
            interfaceC5536d.mo22448b();
        }
        InterfaceC5536d interfaceC5536d2 = this.f23342a;
        if (interfaceC5536d2 != null) {
            interfaceC5536d2.mo22452v0();
        }
    }

    @Override // p301qb.InterfaceC6394i1
    /* renamed from: x5 */
    public void mo23559x5() {
        InterfaceC5536d interfaceC5536d = this.f23342a;
        if (interfaceC5536d != null) {
            interfaceC5536d.mo22448b();
        }
        InterfaceC5536d interfaceC5536d2 = this.f23342a;
        if (interfaceC5536d2 != null) {
            interfaceC5536d2.mo22450i();
        }
    }
}
