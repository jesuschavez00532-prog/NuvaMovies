package p329s8;

import ac.C0178m;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import androidx.fragment.app.AbstractC0729o;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.AbstractC1459j;
import cc.C1466m0;
import com.login.R$id;
import com.login.R$layout;
import com.login.R$style;
import com.module.R$string;
import com.module.event.LoginSuccessRequestDataEvent;
import com.module.view.DialogBottomBar;
import com.module.view.LoadingView;
import com.request.result.GetAuthInfoResult;
import com.request.result.GetAuthInfoResultData;
import com.request.result.LoginResult;
import com.request.result.UserInfo;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mc.C5634i;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5881x;
import p161ha.ViewOnClickListenerC4799t0;
import p161ha.ViewOnClickListenerC4802v;
import p170i2.C4842a;
import p185j2.C4982a;
import p285p8.InterfaceC6240c;
import p285p8.InterfaceC6241d;
import p299q8.C6352b;
import p301qb.InterfaceC6401l;
import p302qc.C6448c;
import p340t8.C6926a;
import p359ue.AbstractC7167u;
import p371vb.C7252a;
import p400xa.AbstractC7555b0;
import p400xa.AbstractC7557c;
import p400xa.C7556b1;
import p400xa.C7559c1;
import p400xa.C7586l1;
import p415y9.AbstractApplicationC7689d;
import p430z9.C7767e;
import p433zd.AbstractC7786b;
import va.InterfaceC7251a;
import ye.C7709c;

/* renamed from: s8.n1 */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC6738n1 extends C7767e implements View.OnClickListener, View.OnFocusChangeListener, InterfaceC6401l, InterfaceC6241d {

    /* renamed from: F0 */
    private ViewOnClickListenerC4802v f25912F0;

    /* renamed from: G0 */
    private View f25913G0;

    /* renamed from: K0 */
    private final InterfaceC1312h f25917K0;

    /* renamed from: L0 */
    private final InterfaceC1312h f25918L0;

    /* renamed from: M0 */
    private InterfaceC5642a f25919M0;

    /* renamed from: N0 */
    public Map f25920N0 = new LinkedHashMap();

    /* renamed from: H0 */
    private String f25914H0 = "";

    /* renamed from: I0 */
    private String f25915I0 = "";

    /* renamed from: J0 */
    private String f25916J0 = "";

    /* renamed from: s8.n1$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0178m invoke() {
            return new C0178m(ViewOnClickListenerC6738n1.this);
        }
    }

    /* renamed from: s8.n1$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6352b invoke() {
            return new C6352b(ViewOnClickListenerC6738n1.this);
        }
    }

    /* renamed from: s8.n1$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f25923a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m26479a(LoginResult loginResult) {
            C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(true, false, null, 6, null));
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26479a((LoginResult) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: s8.n1$d */
    /* loaded from: classes2.dex */
    public static final class d implements ViewOnClickListenerC4802v.b {

        /* renamed from: b */
        final /* synthetic */ ViewOnClickListenerC4802v f25925b;

        /* renamed from: s8.n1$d$a */
        /* loaded from: classes2.dex */
        public static final class a implements ViewOnClickListenerC4799t0.a {

            /* renamed from: a */
            final /* synthetic */ ViewOnClickListenerC6738n1 f25926a;

            a(ViewOnClickListenerC6738n1 viewOnClickListenerC6738n1) {
                this.f25926a = viewOnClickListenerC6738n1;
            }

            @Override // p161ha.ViewOnClickListenerC4799t0.a
            /* renamed from: a */
            public void mo11875a(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
                AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
                this.f25926a.m26469N9().m25135I0();
            }

            @Override // p161ha.ViewOnClickListenerC4799t0.a
            /* renamed from: b */
            public void mo11876b(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
                AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
            }
        }

        /* renamed from: s8.n1$d$b */
        /* loaded from: classes2.dex */
        public static final class b implements ViewOnClickListenerC4799t0.a {

            /* renamed from: a */
            final /* synthetic */ ViewOnClickListenerC6738n1 f25927a;

            b(ViewOnClickListenerC6738n1 viewOnClickListenerC6738n1) {
                this.f25927a = viewOnClickListenerC6738n1;
            }

            @Override // p161ha.ViewOnClickListenerC4799t0.a
            /* renamed from: a */
            public void mo11875a(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
                AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
                ViewOnClickListenerC4802v viewOnClickListenerC4802v = this.f25927a.f25912F0;
                if (viewOnClickListenerC4802v != null) {
                    viewOnClickListenerC4802v.mo3279p9();
                }
            }

            @Override // p161ha.ViewOnClickListenerC4799t0.a
            /* renamed from: b */
            public void mo11876b(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
                AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
            }
        }

        d(ViewOnClickListenerC4802v viewOnClickListenerC4802v) {
            this.f25925b = viewOnClickListenerC4802v;
        }

        @Override // p161ha.ViewOnClickListenerC4802v.b
        /* renamed from: a0 */
        public void mo11902a0() {
            ViewOnClickListenerC4802v viewOnClickListenerC4802v = ViewOnClickListenerC6738n1.this.f25912F0;
            if (viewOnClickListenerC4802v != null) {
                viewOnClickListenerC4802v.mo3279p9();
            }
            ViewOnClickListenerC6738n1.this.m26469N9().m25133F3();
        }

        @Override // p161ha.ViewOnClickListenerC4802v.b
        /* renamed from: b0 */
        public void mo11903b0() {
            String str = null;
            String str2 = null;
            C7556b1 c7556b1 = C7556b1.f27754a;
            AbstractC0729o m3110N8 = this.f25925b.m3110N8();
            AbstractC5868k.m23673e(m3110N8, "requireFragmentManager()");
            Context m3096J6 = this.f25925b.m3096J6();
            if (m3096J6 == null || (str = m3096J6.getString(R$string.operation_failed_tips)) == null) {
                str = "";
            }
            Context m3096J62 = this.f25925b.m3096J6();
            if (m3096J62 == null || (str2 = m3096J62.getString(R$string.commmon_confirm_text)) == null) {
                str2 = "";
            }
            C7556b1.m28962j(c7556b1, m3110N8, str, "", str2, true, new a(ViewOnClickListenerC6738n1.this), false, null, false, 384, null);
        }

        @Override // p161ha.ViewOnClickListenerC4802v.b
        /* renamed from: c0 */
        public void mo11904c0() {
            String str = null;
            String str2 = null;
            C7556b1 c7556b1 = C7556b1.f27754a;
            AbstractC0729o m3110N8 = this.f25925b.m3110N8();
            AbstractC5868k.m23673e(m3110N8, "requireFragmentManager()");
            Context m3096J6 = this.f25925b.m3096J6();
            if (m3096J6 == null || (str = m3096J6.getString(R$string.login_invaild_text)) == null) {
                str = "";
            }
            Context m3096J62 = this.f25925b.m3096J6();
            if (m3096J62 == null || (str2 = m3096J62.getString(R$string.commmon_refresh_text)) == null) {
                str2 = "";
            }
            C7556b1.m28962j(c7556b1, m3110N8, str, "", str2, true, new b(ViewOnClickListenerC6738n1.this), false, null, false, 384, null);
        }
    }

    /* renamed from: s8.n1$e */
    /* loaded from: classes2.dex */
    public static final class e implements ViewOnClickListenerC4799t0.a {
        e() {
        }

        @Override // p161ha.ViewOnClickListenerC4799t0.a
        /* renamed from: a */
        public void mo11875a(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
            AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
        }

        @Override // p161ha.ViewOnClickListenerC4799t0.a
        /* renamed from: b */
        public void mo11876b(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
            AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
        }
    }

    public ViewOnClickListenerC6738n1() {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        m5965b = AbstractC1314j.m5965b(new a());
        this.f25917K0 = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new b());
        this.f25918L0 = m5965b2;
    }

    /* renamed from: K9 */
    private final void m26466K9(String str) {
        m26474P9(true);
        m26468M9().m648b(this.f25914H0, this.f25915I0, this.f25916J0, C4842a.f20329a.m19920a().mo19949Z(str));
    }

    /* renamed from: L9 */
    private final void m26467L9() {
        CharSequence m27758b0;
        CharSequence m27758b02;
        m27758b0 = AbstractC7167u.m27758b0(((EditText) m26473H9(R$id.mEtPwd)).getText().toString());
        String obj = m27758b0.toString();
        m27758b02 = AbstractC7167u.m27758b0(((EditText) m26473H9(R$id.mEtConfirmPwd)).getText().toString());
        String obj2 = m27758b02.toString();
        if (!TextUtils.isEmpty(obj) && AbstractC7557c.m28975c(obj)) {
            if (!TextUtils.isEmpty(obj2) && AbstractC7557c.m28975c(obj2)) {
                if (!TextUtils.equals(obj, obj2)) {
                    String m3172j7 = m3172j7(com.login.R$string.personal_password_inconsistent);
                    AbstractC5868k.m23673e(m3172j7, "getString(R.string.personal_password_inconsistent)");
                    m26472T9(m3172j7, false);
                    return;
                } else {
                    m26470O9();
                    m26466K9(obj);
                    return;
                }
            }
            String m3172j72 = m3172j7(com.login.R$string.confirm_password_wrong);
            AbstractC5868k.m23673e(m3172j72, "getString(R.string.confirm_password_wrong)");
            m26472T9(m3172j72, false);
            return;
        }
        String m3172j73 = m3172j7(com.login.R$string.password_format_wrong);
        AbstractC5868k.m23673e(m3172j73, "getString(R.string.password_format_wrong)");
        m26472T9(m3172j73, false);
    }

    /* renamed from: M9 */
    private final C0178m m26468M9() {
        return (C0178m) this.f25917K0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N9 */
    public final C6352b m26469N9() {
        return (C6352b) this.f25918L0.getValue();
    }

    /* renamed from: O9 */
    private final void m26470O9() {
        ((DialogBottomBar) m26473H9(R$id.mBottomBar)).m12079e();
    }

    /* renamed from: S9 */
    private final void m26471S9() {
        Button button = (Button) m26473H9(R$id.mBtnConfirm);
        AbstractC5868k.m23673e(button, "mBtnConfirm");
        AbstractC7555b0.m28955i(button, this);
        ((Button) m26473H9(R$id.mBtnCancel)).setOnClickListener(this);
        ((EditText) m26473H9(R$id.mEtPwd)).setOnFocusChangeListener(this);
        ((EditText) m26473H9(R$id.mEtConfirmPwd)).setOnFocusChangeListener(this);
    }

    /* renamed from: T9 */
    private final void m26472T9(String str, boolean z10) {
        DialogBottomBar.EnumC2998a enumC2998a;
        DialogBottomBar dialogBottomBar = (DialogBottomBar) m26473H9(R$id.mBottomBar);
        if (z10) {
            enumC2998a = DialogBottomBar.EnumC2998a.SUCCESS;
        } else {
            enumC2998a = DialogBottomBar.EnumC2998a.FAIL;
        }
        dialogBottomBar.m12080g(str, enumC2998a);
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f25920N0.clear();
    }

    /* renamed from: H9 */
    public View m26473H9(int i10) {
        View findViewById;
        Map map = this.f25920N0;
        View view = (View) map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View m3182n7 = m3182n7();
        if (m3182n7 == null || (findViewById = m3182n7.findViewById(i10)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.InputPasswordDialog);
    }

    @Override // p285p8.InterfaceC6241d
    /* renamed from: N */
    public void mo24848N(boolean z10, LoginResult loginResult) {
        m26474P9(false);
        C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(true, true, loginResult));
        mo3279p9();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.dialog_set_login_pwd_on_visitor, viewGroup, false);
        this.f25913G0 = inflate;
        return inflate;
    }

    /* renamed from: P9 */
    public final void m26474P9(boolean z10) {
        int i10 = 0;
        LoadingView loadingView = (LoadingView) m26473H9(R$id.mLoadingView);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        loadingView.setVisibility(i10);
    }

    /* renamed from: Q9 */
    public final void m26475Q9(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "realPhone");
        AbstractC5868k.m23674f(str2, "nationCode");
        AbstractC5868k.m23674f(str3, "verificationCode");
        this.f25914H0 = str;
        this.f25915I0 = str2;
        this.f25916J0 = str3;
    }

    /* renamed from: R9 */
    public final void m26476R9(InterfaceC5642a interfaceC5642a) {
        this.f25919M0 = interfaceC5642a;
    }

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo16979F9();
    }

    @Override // p285p8.InterfaceC6241d
    /* renamed from: e */
    public void mo24849e() {
        C6448c m25254t = C5634i.m22843d("http://module_login/ForcePasswordChangeActivity").m25254t(262144);
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        C6448c.m25240q(m25254t, m3096J6, null, 2, null);
        mo3279p9();
    }

    @Override // p285p8.InterfaceC6241d
    /* renamed from: f0 */
    public void mo24850f0(boolean z10, String str) {
        AbstractC5868k.m23674f(str, "errCode");
        m26474P9(false);
        InterfaceC7251a interfaceC7251a = (InterfaceC7251a) C5634i.m22844e(InterfaceC7251a.class, new Object[0]);
        if (interfaceC7251a != null) {
            AbstractC0729o m3119R6 = m3119R6();
            AbstractC5868k.m23671c(m3119R6);
            InterfaceC7251a.a.m28064a(interfaceC7251a, m3119R6, m3282t9(), null, c.f25923a, 4, null);
        }
        mo3279p9();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        Window window;
        super.mo3164g8();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setLayout(AbstractC7786b.m30166j(980), AbstractC7786b.m30163g(720));
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        m26471S9();
    }

    @Override // p285p8.InterfaceC6241d
    /* renamed from: l */
    public void mo24851l(List list, String str, boolean z10) {
        AbstractC5868k.m23674f(list, "deviceList");
        AbstractC5868k.m23674f(str, "tempToken");
        if (z10) {
            ViewOnClickListenerC4802v viewOnClickListenerC4802v = this.f25912F0;
            if (viewOnClickListenerC4802v != null) {
                viewOnClickListenerC4802v.m19847Q9(list);
                return;
            }
            return;
        }
        ViewOnClickListenerC4802v.a aVar = ViewOnClickListenerC4802v.f20235P0;
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        ViewOnClickListenerC4802v m19851b = ViewOnClickListenerC4802v.a.m19851b(aVar, m3096J6, list, str, false, 8, null);
        m19851b.m19849V9(new d(m19851b));
        this.f25912F0 = m19851b;
    }

    @Override // p301qb.InterfaceC6401l
    /* renamed from: n6 */
    public void mo25216n6() {
        GetAuthInfoResultData getAuthInfoResultData;
        m26474P9(false);
        C1466m0 c1466m0 = C1466m0.f5627a;
        if (c1466m0.m6837J()) {
            C7252a c7252a = C7252a.f27087a;
            if (c7252a.m28070e() > 0 && c1466m0.m6829B()) {
                C7586l1 c7586l1 = C7586l1.f27877a;
                AbstractApplicationC7689d.a aVar = AbstractApplicationC7689d.f28135d;
                Context m29494a = aVar.m29494a();
                C5881x c5881x = C5881x.f23415a;
                String string = aVar.m29494a().getString(com.login.R$string.get_bind_gift_days_tips);
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
        GetAuthInfoResult m28073h = C7252a.f27087a.m28073h();
        if (m28073h != null) {
            getAuthInfoResultData = m28073h.getData();
        } else {
            getAuthInfoResultData = null;
        }
        if (getAuthInfoResultData != null) {
            getAuthInfoResultData.setBindMobile("1");
        }
        UserInfo m6887v = c1466m0.m6887v();
        if (m6887v != null) {
            m6887v.setBindMobile("1");
        }
        UserInfo m6887v2 = c1466m0.m6887v();
        if (m6887v2 != null) {
            m6887v2.setMobile(this.f25914H0);
        }
        UserInfo m6887v3 = c1466m0.m6887v();
        if (m6887v3 != null) {
            m6887v3.setAreaCode(this.f25915I0);
        }
        InterfaceC5642a interfaceC5642a = this.f25919M0;
        if (interfaceC5642a == null) {
            C6926a c6926a = C6926a.f26260a;
            AbstractC0729o m3119R6 = m3119R6();
            AbstractC5868k.m23671c(m3119R6);
            C6926a.m26892m(c6926a, m3119R6, C7559c1.f27762a.m28988f(this.f25914H0, this.f25915I0, false), null, 4, null);
        } else if (interfaceC5642a != null) {
            interfaceC5642a.invoke();
        }
        String m6799d = AbstractC1459j.m6799d(this.f25914H0, C4842a.f20329a.m19920a().mo19967p());
        C4982a c4982a = C4982a.f20721a;
        AbstractApplicationC7689d.a aVar2 = AbstractApplicationC7689d.f28135d;
        c4982a.m20335c(aVar2.m29494a(), "user_account_PHONE", m6799d);
        c4982a.m20335c(aVar2.m29494a(), "user_account_EMAIL", "");
        InterfaceC6240c.a.m24847a(m26469N9(), "3", this.f25914H0, c1466m0.m6889x(), this.f25915I0, null, null, 48, null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i10 = R$id.mBtnConfirm;
        if (num != null && num.intValue() == i10) {
            m26467L9();
            return;
        }
        int i11 = R$id.mBtnCancel;
        if (num != null && num.intValue() == i11) {
            mo3278o9();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z10) {
        if (z10) {
            m26470O9();
        }
    }

    @Override // p301qb.InterfaceC6401l
    /* renamed from: t2 */
    public void mo25217t2(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        m26474P9(false);
        C7559c1 c7559c1 = C7559c1.f27762a;
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        String m3172j7 = m3172j7(com.login.R$string.phone_bind_failed);
        AbstractC5868k.m23673e(m3172j7, "getString(R.string.phone_bind_failed)");
        m26472T9(c7559c1.m28985b(m3096J6, str, m3172j7), false);
    }

    @Override // p285p8.InterfaceC6241d
    /* renamed from: v */
    public void mo24852v(boolean z10) {
        String str = null;
        String str2 = null;
        ViewOnClickListenerC4802v viewOnClickListenerC4802v;
        if (z10 && (viewOnClickListenerC4802v = this.f25912F0) != null) {
            viewOnClickListenerC4802v.mo3279p9();
        }
        C7556b1 c7556b1 = C7556b1.f27754a;
        AbstractC0729o m3110N8 = m3110N8();
        AbstractC5868k.m23673e(m3110N8, "requireFragmentManager()");
        Context m3096J6 = m3096J6();
        if (m3096J6 == null || (str = m3096J6.getString(R$string.login_invaild_text)) == null) {
            str = "";
        }
        Context m3096J62 = m3096J6();
        if (m3096J62 == null || (str2 = m3096J62.getString(R$string.commmon_refresh_text)) == null) {
            str2 = "";
        }
        C7556b1.m28962j(c7556b1, m3110N8, str, "", str2, true, new e(), false, null, false, 384, null);
    }
}
