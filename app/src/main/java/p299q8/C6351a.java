package p299q8;

import ac.C0180m1;
import android.app.Activity;
import androidx.appcompat.app.AbstractActivityC0302c;
import androidx.fragment.app.AbstractC0729o;
import be.C1328x;
import cc.AbstractC1459j;
import cc.C1441a;
import cc.C1461k;
import cc.C1466m0;
import com.login.p065ui.activity.ForcePasswordChangeActivity;
import com.module.event.LoginSuccessRequestDataEvent;
import com.request.bean.AutoLoginBean;
import com.request.result.LoginResult;
import com.titans.entity.CdnType;
import mc.C5634i;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p135fd.C4307b;
import p170i2.C4842a;
import p185j2.C4982a;
import p285p8.InterfaceC6238a;
import p285p8.InterfaceC6239b;
import p301qb.InterfaceC6444z0;
import p415y9.AbstractApplicationC7689d;
import p430z9.AbstractActivityC7763a;
import va.InterfaceC7251a;
import ye.C7709c;

/* renamed from: q8.a */
/* loaded from: classes2.dex */
public final class C6351a implements InterfaceC6238a, InterfaceC6444z0 {

    /* renamed from: a */
    private AbstractActivityC7763a f24704a;

    /* renamed from: b */
    private InterfaceC6239b f24705b;

    /* renamed from: c */
    private AutoLoginBean f24706c;

    /* renamed from: d */
    private C0180m1 f24707d;

    /* renamed from: q8.a$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final a f24708a = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m25131a(LoginResult loginResult) {
            C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(true, false, null, 6, null));
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m25131a((LoginResult) obj);
            return C1328x.f4998a;
        }
    }

    public C6351a(AbstractActivityC7763a abstractActivityC7763a, InterfaceC6239b interfaceC6239b) {
        AbstractC5868k.m23674f(abstractActivityC7763a, "activity");
        AbstractC5868k.m23674f(interfaceC6239b, "view");
        this.f24704a = abstractActivityC7763a;
        this.f24705b = interfaceC6239b;
    }

    /* renamed from: Y0 */
    private final void m25130Y0() {
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        AutoLoginBean autoLoginBean = this.f24706c;
        String str6 = null;
        if (autoLoginBean != null) {
            str = autoLoginBean.getAccountType();
        } else {
            str = null;
        }
        if (AbstractC5868k.m23669a(str, "3")) {
            AutoLoginBean autoLoginBean2 = this.f24706c;
            if (autoLoginBean2 == null || (str5 = autoLoginBean2.getUsername()) == null) {
                str5 = "";
            }
            String m6799d = AbstractC1459j.m6799d(str5, C4842a.f20329a.m19920a().mo19967p());
            C4982a c4982a = C4982a.f20721a;
            AbstractApplicationC7689d.a aVar = AbstractApplicationC7689d.f28135d;
            c4982a.m20335c(aVar.m29494a(), "user_account_PHONE", m6799d);
            c4982a.m20335c(aVar.m29494a(), "user_account_EMAIL", "");
        }
        AutoLoginBean autoLoginBean3 = this.f24706c;
        if (autoLoginBean3 != null) {
            str2 = autoLoginBean3.getAccountType();
        } else {
            str2 = null;
        }
        if (!AbstractC5868k.m23669a(str2, "2")) {
            AutoLoginBean autoLoginBean4 = this.f24706c;
            if (autoLoginBean4 != null) {
                str4 = autoLoginBean4.getAccountType();
            } else {
                str4 = null;
            }
            if (!AbstractC5868k.m23669a(str4, "1")) {
                AutoLoginBean autoLoginBean5 = this.f24706c;
                if (autoLoginBean5 != null) {
                    str6 = autoLoginBean5.getAccountType();
                }
                if (!AbstractC5868k.m23669a(str6, CdnType.DIGITAL_TYPE_PEERSTAR)) {
                    return;
                }
            }
        }
        AutoLoginBean autoLoginBean6 = this.f24706c;
        if (autoLoginBean6 == null || (str3 = autoLoginBean6.getUsername()) == null) {
            str3 = "";
        }
        String m6799d2 = AbstractC1459j.m6799d(str3, C4842a.f20329a.m19920a().mo19967p());
        C4982a c4982a2 = C4982a.f20721a;
        AbstractApplicationC7689d.a aVar2 = AbstractApplicationC7689d.f28135d;
        c4982a2.m20335c(aVar2.m29494a(), "user_account_EMAIL", m6799d2);
        c4982a2.m20335c(aVar2.m29494a(), "user_account_PHONE", "");
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
    }

    @Override // p301qb.InterfaceC6444z0
    /* renamed from: H4 */
    public void mo18504H4(String str, boolean z10, LoginResult loginResult) {
        AbstractC5868k.m23674f(str, "password");
        this.f24704a.finish();
    }

    @Override // p285p8.InterfaceC6238a
    /* renamed from: K0 */
    public void mo24844K0() {
        this.f24706c = C1461k.f5605a.m6804d();
    }

    @Override // p301qb.InterfaceC6444z0
    /* renamed from: N */
    public void mo18505N(boolean z10, LoginResult loginResult) {
        m25130Y0();
        C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(true, false, null, 6, null));
        this.f24704a.finish();
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f24704a.m19900N3();
    }

    @Override // p301qb.InterfaceC6444z0
    /* renamed from: f0 */
    public void mo18506f0(boolean z10, String str) {
        AbstractActivityC0302c abstractActivityC0302c;
        AbstractC0729o m3294d4;
        InterfaceC7251a interfaceC7251a;
        AbstractC5868k.m23674f(str, "errCode");
        Activity m6706d = C1441a.f5552a.m6706d(ForcePasswordChangeActivity.class);
        if (m6706d instanceof AbstractActivityC0302c) {
            abstractActivityC0302c = (AbstractActivityC0302c) m6706d;
        } else {
            abstractActivityC0302c = null;
        }
        if (abstractActivityC0302c != null && (m3294d4 = abstractActivityC0302c.m3294d4()) != null && (interfaceC7251a = (InterfaceC7251a) C5634i.m22844e(InterfaceC7251a.class, new Object[0])) != null) {
            interfaceC7251a.mo25622b(m3294d4, false, str, a.f24708a);
        }
        this.f24704a.finish();
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p285p8.InterfaceC6238a
    /* renamed from: u0 */
    public void mo24845u0() {
        this.f24707d = new C0180m1(this, null, 2, null);
        AutoLoginBean autoLoginBean = this.f24706c;
        if (autoLoginBean != null) {
            autoLoginBean.setPassword(C1466m0.f5627a.m6889x());
            C0180m1 c0180m1 = this.f24707d;
            if (c0180m1 != null) {
                c0180m1.m664g(autoLoginBean.getAccountType(), autoLoginBean.getUsername(), autoLoginBean.getPassword(), "1", autoLoginBean.getAreaCode(), autoLoginBean.getVerificationCode(), autoLoginBean.getVerificationToken());
            }
        }
    }
}
