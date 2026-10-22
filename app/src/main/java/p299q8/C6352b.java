package p299q8;

import ac.C0175l0;
import ac.C0180m1;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import cc.AbstractC1459j;
import cc.C1461k;
import com.module.R$string;
import com.request.bean.CloseForceChangePwdPageEvent;
import com.request.result.GetDeviceResult;
import com.request.result.LoginResult;
import com.titans.entity.CdnType;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p135fd.C4307b;
import p170i2.C4842a;
import p185j2.C4982a;
import p201k2.AbstractC5094k;
import p285p8.InterfaceC6240c;
import p285p8.InterfaceC6241d;
import p301qb.InterfaceC6381e0;
import p301qb.InterfaceC6444z0;
import p317rb.AbstractC6567a;
import p400xa.C7586l1;
import p415y9.AbstractApplicationC7689d;
import ye.C7709c;

/* renamed from: q8.b */
/* loaded from: classes2.dex */
public final class C6352b implements InterfaceC6240c, InterfaceC6444z0, InterfaceC6381e0 {

    /* renamed from: a */
    private InterfaceC6241d f24709a;

    /* renamed from: b */
    private String f24710b;

    /* renamed from: c */
    private String f24711c;

    /* renamed from: d */
    private C0180m1 f24712d;

    /* renamed from: e */
    private final InterfaceC1312h f24713e;

    /* renamed from: q8.b$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0175l0 invoke() {
            return new C0175l0(C6352b.this);
        }
    }

    public C6352b(InterfaceC6241d interfaceC6241d) {
        InterfaceC1312h m5965b;
        AbstractC5868k.m23674f(interfaceC6241d, "view");
        this.f24709a = interfaceC6241d;
        m5965b = AbstractC1314j.m5965b(new a());
        this.f24713e = m5965b;
    }

    /* renamed from: E3 */
    private final C0175l0 m25132E3() {
        return (C0175l0) this.f24713e.getValue();
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
    }

    /* renamed from: F3 */
    public void m25133F3() {
        C0180m1 c0180m1;
        C1461k c1461k = C1461k.f5605a;
        String m6802b = c1461k.m6802b();
        String m6808h = c1461k.m6808h();
        String m6805e = c1461k.m6805e();
        String m6803c = c1461k.m6803c();
        String m6810j = c1461k.m6810j();
        String m6809i = c1461k.m6809i();
        if (AbstractC6567a.m25637g(m6802b) && AbstractC6567a.m25637g(m6808h)) {
            if ((AbstractC6567a.m25637g(m6805e) || AbstractC6567a.m25637g(m6810j) || AbstractC6567a.m25637g(m6809i)) && (c0180m1 = this.f24712d) != null) {
                c0180m1.m664g(m6802b, m6808h, m6805e, "1", m6803c, m6809i, m6810j);
            }
        }
    }

    /* renamed from: G3 */
    public final void m25134G3() {
        if (AbstractC5868k.m23669a(this.f24710b, "3")) {
            String m6799d = AbstractC1459j.m6799d(this.f24711c, C4842a.f20329a.m19920a().mo19967p());
            C4982a c4982a = C4982a.f20721a;
            AbstractApplicationC7689d.a aVar = AbstractApplicationC7689d.f28135d;
            c4982a.m20335c(aVar.m29494a(), "user_account_PHONE", m6799d);
            c4982a.m20335c(aVar.m29494a(), "user_account_EMAIL", "");
        }
        if (AbstractC5868k.m23669a(this.f24710b, "2") || AbstractC5868k.m23669a(this.f24710b, "1") || AbstractC5868k.m23669a(this.f24710b, CdnType.DIGITAL_TYPE_PEERSTAR)) {
            String m6799d2 = AbstractC1459j.m6799d(this.f24711c, C4842a.f20329a.m19920a().mo19967p());
            C4982a c4982a2 = C4982a.f20721a;
            AbstractApplicationC7689d.a aVar2 = AbstractApplicationC7689d.f28135d;
            c4982a2.m20335c(aVar2.m29494a(), "user_account_EMAIL", m6799d2);
            c4982a2.m20335c(aVar2.m29494a(), "user_account_PHONE", "");
        }
    }

    @Override // p301qb.InterfaceC6444z0
    /* renamed from: H4 */
    public void mo18504H4(String str, boolean z10, LoginResult loginResult) {
        AbstractC5868k.m23674f(str, "accountType");
        this.f24709a.mo24849e();
    }

    /* renamed from: I0 */
    public void m25135I0() {
        AbstractApplicationC7689d.a aVar = AbstractApplicationC7689d.f28135d;
        if (!AbstractC5094k.m20685b(aVar.m29494a())) {
            C7586l1.m29111d(C7586l1.f27877a, aVar.m29494a(), aVar.m29494a().getString(R$string.error_code_net_type) + "1" + aVar.m29494a().getString(R$string.cdn_ee1), 0, 0, 12, null);
            return;
        }
        m25132E3().m644b(C1461k.f5605a.m6806f(), true);
    }

    @Override // p301qb.InterfaceC6444z0
    /* renamed from: N */
    public void mo18505N(boolean z10, LoginResult loginResult) {
        m25134G3();
        this.f24709a.mo24848N(z10, loginResult);
        C7709c.m29787d().m29801m(new CloseForceChangePwdPageEvent());
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f24709a.mo523N3();
    }

    @Override // p301qb.InterfaceC6381e0
    /* renamed from: T4 */
    public void mo23554T4(String str, boolean z10) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f24709a.mo24852v(z10);
    }

    /* renamed from: Y0 */
    public void m25136Y0() {
        AbstractApplicationC7689d.a aVar = AbstractApplicationC7689d.f28135d;
        if (!AbstractC5094k.m20685b(aVar.m29494a())) {
            C7586l1.m29111d(C7586l1.f27877a, aVar.m29494a(), aVar.m29494a().getString(R$string.error_code_net_type) + "1" + aVar.m29494a().getString(R$string.cdn_ee1), 0, 0, 12, null);
            return;
        }
        C0175l0.m643c(m25132E3(), C1461k.f5605a.m6806f(), false, 2, null);
    }

    @Override // p285p8.InterfaceC6240c
    /* renamed from: b0 */
    public void mo24846b0(String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC5868k.m23674f(str, "accountType");
        AbstractC5868k.m23674f(str2, "userName");
        AbstractC5868k.m23674f(str3, "password");
        C0180m1 c0180m1 = new C0180m1(this, null, 2, null);
        this.f24712d = c0180m1;
        this.f24711c = str2;
        this.f24710b = str;
        c0180m1.m664g(str, str2, str3, "1", str4, str5, str6);
    }

    @Override // p301qb.InterfaceC6444z0
    /* renamed from: f0 */
    public void mo18506f0(boolean z10, String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f24709a.mo24850f0(z10, str);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p301qb.InterfaceC6381e0
    /* renamed from: u6 */
    public void mo23556u6(GetDeviceResult getDeviceResult, String str, boolean z10) {
        AbstractC5868k.m23674f(getDeviceResult, "bean");
        AbstractC5868k.m23674f(str, "tempToken");
        this.f24709a.mo24851l(getDeviceResult.getData().getDeviceList(), str, z10);
    }
}
