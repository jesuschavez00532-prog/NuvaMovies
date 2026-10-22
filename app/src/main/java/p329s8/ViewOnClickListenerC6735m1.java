package p329s8;

import ac.C0180m1;
import ac.C0202s;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import androidx.fragment.app.AbstractC0729o;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import cc.AbstractC1459j;
import cc.C1466m0;
import com.login.R$id;
import com.login.R$layout;
import com.login.R$string;
import com.login.R$style;
import com.module.event.LoginSuccessRequestDataEvent;
import com.module.view.DialogBottomBar;
import com.module.view.LoadingView;
import com.request.result.LoginResult;
import com.taobao.accs.common.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import mc.C5634i;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p170i2.C4842a;
import p185j2.C4982a;
import p301qb.InterfaceC6413p;
import p301qb.InterfaceC6444z0;
import p302qc.C6448c;
import p340t8.C6926a;
import p359ue.AbstractC7167u;
import p400xa.AbstractC7557c;
import p400xa.C7559c1;
import p415y9.AbstractApplicationC7689d;
import p430z9.C7767e;
import p433zd.AbstractC7786b;
import ye.C7709c;

/* renamed from: s8.m1 */
/* loaded from: classes2.dex */
public class ViewOnClickListenerC6735m1 extends C7767e implements View.OnClickListener, View.OnFocusChangeListener, InterfaceC6413p, InterfaceC6444z0 {

    /* renamed from: F0 */
    private View f25882F0;

    /* renamed from: G0 */
    private final InterfaceC1312h f25883G0;

    /* renamed from: H0 */
    private final InterfaceC1312h f25884H0;

    /* renamed from: I0 */
    private String f25885I0;

    /* renamed from: J0 */
    private String f25886J0;

    /* renamed from: K0 */
    private String f25887K0;

    /* renamed from: L0 */
    private String f25888L0;

    /* renamed from: M0 */
    public Map f25889M0 = new LinkedHashMap();

    /* renamed from: s8.m1$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0202s invoke() {
            return new C0202s(ViewOnClickListenerC6735m1.this);
        }
    }

    /* renamed from: s8.m1$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0180m1 invoke() {
            return new C0180m1(ViewOnClickListenerC6735m1.this, null, 2, null);
        }
    }

    public ViewOnClickListenerC6735m1() {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        m5965b = AbstractC1314j.m5965b(new a());
        this.f25883G0 = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new b());
        this.f25884H0 = m5965b2;
        this.f25885I0 = "";
        this.f25886J0 = "";
        this.f25887K0 = "";
        this.f25888L0 = "";
    }

    /* renamed from: I9 */
    private final void m26430I9() {
        CharSequence m27758b0;
        CharSequence m27758b02;
        m27758b0 = AbstractC7167u.m27758b0(((EditText) m26437H9(R$id.mEtPwd)).getText().toString());
        this.f25888L0 = m27758b0.toString();
        m27758b02 = AbstractC7167u.m27758b0(((EditText) m26437H9(R$id.mEtConfirmPwd)).getText().toString());
        String obj = m27758b02.toString();
        if (!TextUtils.isEmpty(this.f25888L0) && AbstractC7557c.m28975c(this.f25888L0)) {
            if (!TextUtils.isEmpty(obj) && AbstractC7557c.m28975c(obj)) {
                if (!TextUtils.equals(this.f25888L0, obj)) {
                    String m3172j7 = m3172j7(R$string.personal_password_inconsistent);
                    AbstractC5868k.m23673e(m3172j7, "getString(R.string.personal_password_inconsistent)");
                    m26436S9(m3172j7, false);
                    return;
                } else {
                    m26433L9();
                    m26434O9(this.f25888L0, obj);
                    return;
                }
            }
            String m3172j72 = m3172j7(R$string.confirm_password_wrong);
            AbstractC5868k.m23673e(m3172j72, "getString(R.string.confirm_password_wrong)");
            m26436S9(m3172j72, false);
            return;
        }
        String m3172j73 = m3172j7(R$string.password_format_wrong);
        AbstractC5868k.m23673e(m3172j73, "getString(R.string.password_format_wrong)");
        m26436S9(m3172j73, false);
    }

    /* renamed from: J9 */
    private final C0202s m26431J9() {
        return (C0202s) this.f25883G0.getValue();
    }

    /* renamed from: K9 */
    private final C0180m1 m26432K9() {
        return (C0180m1) this.f25884H0.getValue();
    }

    /* renamed from: L9 */
    private final void m26433L9() {
        ((DialogBottomBar) m26437H9(R$id.mBottomBar)).m12079e();
    }

    /* renamed from: O9 */
    private final void m26434O9(String str, String str2) {
        if (!TextUtils.isEmpty(this.f25885I0) && !TextUtils.isEmpty(this.f25886J0) && !TextUtils.isEmpty(this.f25887K0)) {
            m26439N9(true);
            m26431J9().m724b(this.f25885I0, this.f25886J0, this.f25887K0, "3", C4842a.f20329a.m19920a().mo19949Z(str));
        }
    }

    /* renamed from: P9 */
    private final void m26435P9() {
        String m6799d = AbstractC1459j.m6799d(this.f25885I0, C4842a.f20329a.m19920a().mo19967p());
        C4982a c4982a = C4982a.f20721a;
        AbstractApplicationC7689d.a aVar = AbstractApplicationC7689d.f28135d;
        c4982a.m20335c(aVar.m29494a(), "user_account_PHONE", m6799d);
        c4982a.m20335c(aVar.m29494a(), "user_account_EMAIL", "");
    }

    /* renamed from: S9 */
    private final void m26436S9(String str, boolean z10) {
        DialogBottomBar.EnumC2998a enumC2998a;
        DialogBottomBar dialogBottomBar = (DialogBottomBar) m26437H9(R$id.mBottomBar);
        if (z10) {
            enumC2998a = DialogBottomBar.EnumC2998a.SUCCESS;
        } else {
            enumC2998a = DialogBottomBar.EnumC2998a.FAIL;
        }
        dialogBottomBar.m12080g(str, enumC2998a);
    }

    @Override // p301qb.InterfaceC6413p
    /* renamed from: F1 */
    public void mo25222F1() {
        C1466m0 c1466m0 = C1466m0.f5627a;
        c1466m0.m6875k0(C4842a.f20329a.m19920a().mo19949Z(this.f25888L0));
        C0180m1.m657h(m26432K9(), "3", this.f25885I0, c1466m0.m6889x(), "1", this.f25886J0, null, null, 96, null);
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f25889M0.clear();
    }

    @Override // p301qb.InterfaceC6444z0
    /* renamed from: H4 */
    public void mo18504H4(String str, boolean z10, LoginResult loginResult) {
        AbstractC5868k.m23674f(str, "password");
        C6448c m25254t = C5634i.m22843d("http://module_login/ForcePasswordChangeActivity").m25254t(262144);
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        C6448c.m25240q(m25254t, m3096J6, null, 2, null);
        mo3279p9();
    }

    /* renamed from: H9 */
    public View m26437H9(int i10) {
        View findViewById;
        Map map = this.f25889M0;
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

    /* renamed from: M9 */
    public void m26438M9() {
    }

    @Override // p301qb.InterfaceC6444z0
    /* renamed from: N */
    public void mo18505N(boolean z10, LoginResult loginResult) {
        m26439N9(false);
        m26435P9();
        C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(true, false, null, 6, null));
        C6926a c6926a = C6926a.f26260a;
        AbstractC0729o m3119R6 = m3119R6();
        AbstractC5868k.m23671c(m3119R6);
        C6926a.m26893q(c6926a, m3119R6, null, 2, null);
        mo3279p9();
    }

    /* renamed from: N9 */
    public final void m26439N9(boolean z10) {
        int i10;
        LoadingView loadingView = (LoadingView) m26437H9(R$id.mLoadingView);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        loadingView.setVisibility(i10);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        m26438M9();
        View inflate = layoutInflater.inflate(R$layout.dialog_set_login_pwd_on_retrieve, viewGroup, false);
        this.f25882F0 = inflate;
        return inflate;
    }

    /* renamed from: Q9 */
    public void m26440Q9() {
        ((Button) m26437H9(R$id.mBtnConfirm)).setOnClickListener(this);
        ((Button) m26437H9(R$id.mBtnCancel)).setOnClickListener(this);
        ((EditText) m26437H9(R$id.mEtPwd)).setOnFocusChangeListener(this);
        ((EditText) m26437H9(R$id.mEtConfirmPwd)).setOnFocusChangeListener(this);
    }

    /* renamed from: R9 */
    public final void m26441R9(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "mobile");
        AbstractC5868k.m23674f(str2, "areaCode");
        AbstractC5868k.m23674f(str3, "verificationCode");
        this.f25885I0 = str;
        this.f25886J0 = str2;
        this.f25887K0 = str3;
    }

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo16979F9();
    }

    @Override // p301qb.InterfaceC6413p
    /* renamed from: U4 */
    public void mo25223U4(String str) {
        boolean z10;
        AbstractC5868k.m23674f(str, Constants.KEY_ERROR_CODE);
        m26439N9(false);
        C7559c1 c7559c1 = C7559c1.f27762a;
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        String m28982c = C7559c1.m28982c(c7559c1, m3096J6, str, null, 4, null);
        if (m28982c.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            m26436S9(m28982c, false);
        }
    }

    @Override // p301qb.InterfaceC6444z0
    /* renamed from: f0 */
    public void mo18506f0(boolean z10, String str) {
        AbstractC5868k.m23674f(str, "errCode");
        m26439N9(false);
        C6926a c6926a = C6926a.f26260a;
        AbstractC0729o m3119R6 = m3119R6();
        AbstractC5868k.m23671c(m3119R6);
        c6926a.m26906p(m3119R6, str);
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
        m26440Q9();
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
            m26430I9();
            return;
        }
        int i11 = R$id.mBtnCancel;
        if (num != null && num.intValue() == i11) {
            mo3279p9();
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
            m26433L9();
        }
    }
}
