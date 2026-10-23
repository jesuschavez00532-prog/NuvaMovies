package na;

import ac.C0157g2;
import ac.C0170k;
import ac.C0175l0;
import ac.C0180m1;
import ac.C0213u2;
import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import cc.AbstractC1459j;
import cc.C1461k;
import cc.C1466m0;
import com.module.R$string;
import com.module.event.CloseForceBindEvent;
import com.module.event.LoginSuccessRequestDataEvent;
import com.module.event.RefreshUerInfoDisplayEvent;
import com.request.result.GetAuthInfoResult;
import com.request.result.GetAuthInfoResultData;
import com.request.result.GetDeviceResult;
import com.request.result.LoginResult;
import com.request.result.UserInfo;
import java.util.Arrays;
import la.InterfaceC5533a;
import la.InterfaceC5534b;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5881x;
import p135fd.C4307b;
import p170i2.C4842a;
import p185j2.C4982a;
import p201k2.AbstractC5094k;
import p201k2.C5096m;
import p301qb.InterfaceC6381e0;
import p301qb.InterfaceC6394i1;
import p301qb.InterfaceC6398k;
import p301qb.InterfaceC6430u1;
import p301qb.InterfaceC6444z0;
import p317rb.AbstractC6567a;
import p371vb.C7252a;
import p400xa.C7586l1;
import p415y9.AbstractApplicationC7689d;
import ye.C7709c;

/* renamed from: na.a */
/* loaded from: classes2.dex */
public final class C5830a implements InterfaceC5533a, InterfaceC6398k, InterfaceC6394i1, InterfaceC6430u1, InterfaceC6444z0, InterfaceC6381e0 {

    /* renamed from: a */
    private InterfaceC5534b f23319a;

    /* renamed from: b */
    private final InterfaceC1312h f23320b;

    /* renamed from: c */
    private String f23321c;

    /* renamed from: d */
    private final InterfaceC1312h f23322d;

    /* renamed from: e */
    private final InterfaceC1312h f23323e;

    /* renamed from: f */
    private final InterfaceC1312h f23324f;

    /* renamed from: g */
    private final InterfaceC1312h f23325g;

    /* renamed from: na.a$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0170k invoke() {
            return new C0170k(C5830a.this);
        }
    }

    /* renamed from: na.a$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0175l0 invoke() {
            return new C0175l0(C5830a.this);
        }
    }

    /* renamed from: na.a$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5642a {
        c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0180m1 invoke() {
            return new C0180m1(C5830a.this, null, 2, null);
        }
    }

    /* renamed from: na.a$d */
    /* loaded from: classes2.dex */
    static final class d extends AbstractC5869l implements InterfaceC5642a {
        d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0157g2 invoke() {
            return new C0157g2(C5830a.this);
        }
    }

    /* renamed from: na.a$e */
    /* loaded from: classes2.dex */
    static final class e extends AbstractC5869l implements InterfaceC5642a {
        e() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0213u2 invoke() {
            return new C0213u2(C5830a.this);
        }
    }

    public C5830a(InterfaceC5534b interfaceC5534b) {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        InterfaceC1312h m5965b3;
        InterfaceC1312h m5965b4;
        InterfaceC1312h m5965b5;
        this.f23319a = interfaceC5534b;
        m5965b = AbstractC1314j.m5965b(new b());
        this.f23320b = m5965b;
        this.f23321c = "";
        m5965b2 = AbstractC1314j.m5965b(new a());
        this.f23322d = m5965b2;
        m5965b3 = AbstractC1314j.m5965b(new d());
        this.f23323e = m5965b3;
        m5965b4 = AbstractC1314j.m5965b(new e());
        this.f23324f = m5965b4;
        m5965b5 = AbstractC1314j.m5965b(new c());
        this.f23325g = m5965b5;
    }

    /* renamed from: E3 */
    private final C0175l0 m23547E3() {
        return (C0175l0) this.f23320b.getValue();
    }

    /* renamed from: F3 */
    private final C0180m1 m23548F3() {
        return (C0180m1) this.f23325g.getValue();
    }

    /* renamed from: G3 */
    private final C0157g2 m23549G3() {
        return (C0157g2) this.f23323e.getValue();
    }

    /* renamed from: J3 */
    private final C0213u2 m23550J3() {
        return (C0213u2) this.f23324f.getValue();
    }

    /* renamed from: Y0 */
    private final C0170k m23551Y0() {
        return (C0170k) this.f23322d.getValue();
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
    }

    @Override // p301qb.InterfaceC6394i1
    /* renamed from: E0 */
    public void mo23552E0(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        InterfaceC5534b interfaceC5534b = this.f23319a;
        if (interfaceC5534b != null) {
            interfaceC5534b.mo22434b();
        }
        InterfaceC5534b interfaceC5534b2 = this.f23319a;
        if (interfaceC5534b2 != null) {
            interfaceC5534b2.mo22437k(str);
        }
    }

    @Override // p301qb.InterfaceC6444z0
    /* renamed from: H4 */
    public void mo18504H4(String str, boolean z10, LoginResult loginResult) {
        AbstractC5868k.m23674f(str, "accountType");
        InterfaceC5534b interfaceC5534b = this.f23319a;
        if (interfaceC5534b != null) {
            interfaceC5534b.mo22435e();
        }
    }

    @Override // la.InterfaceC5533a
    /* renamed from: I0 */
    public void mo22426I0() {
        AbstractApplicationC7689d.a aVar = AbstractApplicationC7689d.f28135d;
        if (!AbstractC5094k.m20685b(aVar.m29494a())) {
            C7586l1.m29111d(C7586l1.f27877a, aVar.m29494a(), aVar.m29494a().getString(R$string.error_code_net_type) + '1' + aVar.m29494a().getString(R$string.cdn_ee1), 0, 0, 12, null);
            return;
        }
        m23547E3().m644b(C1461k.f5605a.m6806f(), true);
    }

    @Override // la.InterfaceC5533a
    /* renamed from: K */
    public void mo22427K(String str, String str2) {
        AbstractC5868k.m23674f(str, "email");
        AbstractC5868k.m23674f(str2, "verifyCode");
        InterfaceC5534b interfaceC5534b = this.f23319a;
        if (interfaceC5534b != null) {
            interfaceC5534b.mo22433a();
        }
        m23550J3().m743b(str, "1", str2);
    }

    @Override // p301qb.InterfaceC6444z0
    /* renamed from: N */
    public void mo18505N(boolean z10, LoginResult loginResult) {
        InterfaceC5534b interfaceC5534b = this.f23319a;
        if (interfaceC5534b != null) {
            interfaceC5534b.mo22434b();
        }
        C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(true, true, loginResult));
        C7709c.m29787d().m29801m(new RefreshUerInfoDisplayEvent(false, 1, null));
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        InterfaceC5534b interfaceC5534b = this.f23319a;
        if (interfaceC5534b != null) {
            return interfaceC5534b.mo523N3();
        }
        return null;
    }

    @Override // p301qb.InterfaceC6430u1
    /* renamed from: O2 */
    public void mo23553O2(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        InterfaceC5534b interfaceC5534b = this.f23319a;
        if (interfaceC5534b != null) {
            interfaceC5534b.mo22434b();
        }
        InterfaceC5534b interfaceC5534b2 = this.f23319a;
        if (interfaceC5534b2 != null) {
            interfaceC5534b2.mo22437k(str);
        }
    }

    @Override // p301qb.InterfaceC6381e0
    /* renamed from: T4 */
    public void mo23554T4(String str, boolean z10) {
        AbstractC5868k.m23674f(str, "errCode");
        InterfaceC5534b interfaceC5534b = this.f23319a;
        if (interfaceC5534b != null) {
            interfaceC5534b.mo22439v(z10);
        }
    }

    @Override // p301qb.InterfaceC6398k
    /* renamed from: X0 */
    public void mo23555X0(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        InterfaceC5534b interfaceC5534b = this.f23319a;
        if (interfaceC5534b != null) {
            interfaceC5534b.mo22434b();
        }
        InterfaceC5534b interfaceC5534b2 = this.f23319a;
        if (interfaceC5534b2 != null) {
            interfaceC5534b2.mo22437k(str);
        }
    }

    @Override // la.InterfaceC5533a
    /* renamed from: e0 */
    public void mo22428e0(String str) {
        AbstractC5868k.m23674f(str, "email");
        InterfaceC5534b interfaceC5534b = this.f23319a;
        if (interfaceC5534b != null) {
            interfaceC5534b.mo22433a();
        }
        m23549G3().m603b(str, "1");
    }

    @Override // p301qb.InterfaceC6444z0
    /* renamed from: f0 */
    public void mo18506f0(boolean z10, String str) {
        AbstractC5868k.m23674f(str, "errCode");
        if (AbstractC5868k.m23669a(str, "aaa100094")) {
            AbstractApplicationC7689d.a aVar = AbstractApplicationC7689d.f28135d;
            if (!AbstractC5094k.m20685b(aVar.m29494a())) {
                C7586l1.m29111d(C7586l1.f27877a, aVar.m29494a(), aVar.m29494a().getString(R$string.error_code_net_type) + '1' + aVar.m29494a().getString(R$string.cdn_ee1), 0, 0, 12, null);
                return;
            }
            C0175l0.m643c(m23547E3(), C1461k.f5605a.m6806f(), false, 2, null);
            return;
        }
        InterfaceC5534b interfaceC5534b = this.f23319a;
        if (interfaceC5534b != null) {
            interfaceC5534b.mo22434b();
        }
        InterfaceC5534b interfaceC5534b2 = this.f23319a;
        if (interfaceC5534b2 != null) {
            interfaceC5534b2.mo22432R();
        }
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // la.InterfaceC5533a
    /* renamed from: t */
    public void mo22429t() {
        InterfaceC5534b interfaceC5534b = this.f23319a;
        if (interfaceC5534b != null) {
            interfaceC5534b.mo22433a();
        }
        C0180m1.m657h(m23548F3(), "1", C1466m0.f5627a.m6878m(), this.f23321c, "1", null, null, null, 112, null);
    }

    @Override // la.InterfaceC5533a
    /* renamed from: u1 */
    public void mo22430u1(String str, String str2) {
        AbstractC5868k.m23674f(str, "email");
        AbstractC5868k.m23674f(str2, "pwd");
        InterfaceC5534b interfaceC5534b = this.f23319a;
        if (interfaceC5534b != null) {
            interfaceC5534b.mo22433a();
        }
        m23551Y0().m620b(str, "1", str2);
    }

    @Override // p301qb.InterfaceC6381e0
    /* renamed from: u6 */
    public void mo23556u6(GetDeviceResult getDeviceResult, String str, boolean z10) {
        AbstractC5868k.m23674f(getDeviceResult, "bean");
        AbstractC5868k.m23674f(str, "tempToken");
        InterfaceC5534b interfaceC5534b = this.f23319a;
        if (interfaceC5534b != null) {
            interfaceC5534b.mo22438l(getDeviceResult.getData().getDeviceList(), str, z10);
        }
    }

    @Override // p301qb.InterfaceC6398k
    /* renamed from: v1 */
    public void mo23557v1(String str, String str2) {
        GetAuthInfoResultData getAuthInfoResultData;
        String str3 = null;
        GetAuthInfoResultData getAuthInfoResultData2;
        UserInfo m6887v;
        AbstractC5868k.m23674f(str, "password");
        AbstractC5868k.m23674f(str2, "email");
        InterfaceC5534b interfaceC5534b = this.f23319a;
        if (interfaceC5534b != null) {
            interfaceC5534b.mo22434b();
        }
        InterfaceC5534b interfaceC5534b2 = this.f23319a;
        if (interfaceC5534b2 != null) {
            interfaceC5534b2.mo22431F4();
        }
        if (AbstractC6567a.m25637g(str)) {
            C1466m0.f5627a.m6875k0(str);
        }
        C7709c.m29787d().m29801m(new CloseForceBindEvent());
        C1466m0 c1466m0 = C1466m0.f5627a;
        if (c1466m0.m6837J()) {
            C7252a c7252a = C7252a.f27087a;
            if (c7252a.m28070e() > 0 && c1466m0.m6829B()) {
                C7586l1 c7586l1 = C7586l1.f27877a;
                AbstractApplicationC7689d.a aVar = AbstractApplicationC7689d.f28135d;
                Context m29494a = aVar.m29494a();
                C5881x c5881x = C5881x.f23415a;
                String string = aVar.m29494a().getString(R$string.get_bind_gift_days_tips);
                if (string == null) {
                    string = "";
                }
                String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(c7252a.m28070e())}, 1));
                AbstractC5868k.m23673e(format, "format(format, *args)");
                Spanned fromHtml = Html.fromHtml(format);
                AbstractC5868k.m23673e(fromHtml, "fromHtml(String.format(A…    SPConstant.giftDays))");
                C7586l1.m29110c(c7586l1, m29494a, fromHtml, 1, 0, 8, null);
            }
        }
        if (C5096m.f20979a.m20692c()) {
            UserInfo m6887v2 = c1466m0.m6887v();
            if (m6887v2 != null) {
                str3 = m6887v2.getHasPwd();
            } else {
                str3 = null;
            }
            if (!AbstractC5868k.m23669a(str3, "1")) {
                if (c1466m0.m6842O() && (m6887v = c1466m0.m6887v()) != null) {
                    m6887v.setUserIdentity("2");
                }
                GetAuthInfoResult m28073h = C7252a.f27087a.m28073h();
                if (m28073h != null) {
                    getAuthInfoResultData2 = m28073h.getData();
                } else {
                    getAuthInfoResultData2 = null;
                }
                if (getAuthInfoResultData2 != null) {
                    getAuthInfoResultData2.setBindMail("1");
                }
                UserInfo m6887v3 = c1466m0.m6887v();
                if (m6887v3 != null) {
                    m6887v3.setBindMail("1");
                }
                UserInfo m6887v4 = c1466m0.m6887v();
                if (m6887v4 != null) {
                    m6887v4.setEmail(str2);
                }
                UserInfo m6887v5 = c1466m0.m6887v();
                if (m6887v5 != null) {
                    m6887v5.setHasPwd("1");
                }
                C7709c.m29787d().m29801m(new RefreshUerInfoDisplayEvent(false, 1, null));
                if (AbstractC6567a.m25637g(str)) {
                    this.f23321c = c1466m0.m6889x();
                }
                mo22429t();
                String m6799d = AbstractC1459j.m6799d(str2, C4842a.f20329a.m19920a().mo19967p());
                C4982a c4982a = C4982a.f20721a;
                AbstractApplicationC7689d.a aVar2 = AbstractApplicationC7689d.f28135d;
                c4982a.m20335c(aVar2.m29494a(), "user_account_EMAIL", m6799d);
                c4982a.m20335c(aVar2.m29494a(), "user_account_PHONE", "");
                return;
            }
        }
        GetAuthInfoResult m28073h2 = C7252a.f27087a.m28073h();
        if (m28073h2 != null) {
            getAuthInfoResultData = m28073h2.getData();
        } else {
            getAuthInfoResultData = null;
        }
        if (getAuthInfoResultData != null) {
            getAuthInfoResultData.setBindMail("1");
        }
        UserInfo m6887v6 = c1466m0.m6887v();
        if (m6887v6 != null) {
            m6887v6.setBindMail("1");
        }
        UserInfo m6887v7 = c1466m0.m6887v();
        if (m6887v7 != null) {
            m6887v7.setEmail(str2);
        }
        C7709c.m29787d().m29801m(new RefreshUerInfoDisplayEvent(false, 1, null));
    }

    @Override // p301qb.InterfaceC6430u1
    /* renamed from: x0 */
    public void mo23558x0(String str, String str2) {
        String str3 = null;
        AbstractC5868k.m23674f(str, "email");
        AbstractC5868k.m23674f(str2, "verifyCode");
        InterfaceC5534b interfaceC5534b = this.f23319a;
        if (interfaceC5534b != null) {
            interfaceC5534b.mo22434b();
        }
        if (C5096m.f20979a.m20692c()) {
            UserInfo m6887v = C1466m0.f5627a.m6887v();
            if (m6887v != null) {
                str3 = m6887v.getHasPwd();
            } else {
                str3 = null;
            }
            if (!AbstractC5868k.m23669a(str3, "1")) {
                InterfaceC5534b interfaceC5534b2 = this.f23319a;
                if (interfaceC5534b2 != null) {
                    interfaceC5534b2.mo22440v0();
                    return;
                }
                return;
            }
        }
        mo22430u1(str, "");
    }

    @Override // p301qb.InterfaceC6394i1
    /* renamed from: x5 */
    public void mo23559x5() {
        InterfaceC5534b interfaceC5534b = this.f23319a;
        if (interfaceC5534b != null) {
            interfaceC5534b.mo22434b();
        }
        InterfaceC5534b interfaceC5534b2 = this.f23319a;
        if (interfaceC5534b2 != null) {
            interfaceC5534b2.mo22436i();
        }
    }
}
