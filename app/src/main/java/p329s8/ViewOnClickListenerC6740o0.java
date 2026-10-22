package p329s8;

import ac.C0161h2;
import ac.C0197q2;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0729o;
import cc.C1466m0;
import com.login.R$id;
import com.login.R$layout;
import com.login.R$string;
import com.login.R$style;
import com.module.event.RefreshUerInfoDisplayEvent;
import com.module.view.DialogBottomBar;
import com.module.view.LoadingView;
import com.request.result.BaseResult;
import com.request.result.UserInfo;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import me.InterfaceC5642a;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import org.android.agoo.message.MessageService;
import p170i2.C4842a;
import p201k2.C5090g;
import p301qb.InterfaceC6397j1;
import p301qb.InterfaceC6418q1;
import p340t8.C6926a;
import p359ue.AbstractC7167u;
import p400xa.AbstractC7555b0;
import p400xa.AbstractC7557c;
import p400xa.AbstractC7598p1;
import p400xa.C7554b;
import p430z9.C7767e;
import p433zd.AbstractC7786b;
import ye.C7709c;

/* renamed from: s8.o0 */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC6740o0 extends C7767e implements View.OnClickListener, View.OnFocusChangeListener, InterfaceC6397j1, InterfaceC6418q1 {

    /* renamed from: O0 */
    public static final a f25929O0 = new a(null);

    /* renamed from: G0 */
    private View f25931G0;

    /* renamed from: M0 */
    private InterfaceC5642a f25937M0;

    /* renamed from: N0 */
    public Map f25938N0 = new LinkedHashMap();

    /* renamed from: F0 */
    private final String f25930F0 = ViewOnClickListenerC6740o0.class.getSimpleName();

    /* renamed from: H0 */
    private String f25932H0 = "";

    /* renamed from: I0 */
    private String f25933I0 = "";

    /* renamed from: J0 */
    private String f25934J0 = "";

    /* renamed from: K0 */
    private String f25935K0 = "";

    /* renamed from: L0 */
    private a.EnumC7860a f25936L0 = a.EnumC7860a.SET;

    /* renamed from: s8.o0$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: s8.o0$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public enum EnumC7860a {
            SET,
            MODIFY
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }
    }

    /* renamed from: I9 */
    private final void m26480I9() {
        AutoRelativeLayout.C3912a c3912a;
        if (this.f25936L0 == a.EnumC7860a.MODIFY) {
            ((TextView) m26487H9(R$id.mDialogTitle)).setText(m3172j7(R$string.personal_modify_login_password));
            ((AutoLinearLayout) m26487H9(R$id.mLayoutSet)).setVisibility(8);
            ((AutoLinearLayout) m26487H9(R$id.mLayoutModify)).setVisibility(0);
            c3912a = new AutoRelativeLayout.C3912a(AbstractC7786b.m30166j(980), AbstractC7786b.m30163g(710));
        } else {
            ((TextView) m26487H9(R$id.mDialogTitle)).setText(m3172j7(R$string.personal_setting_login_password));
            ((AutoLinearLayout) m26487H9(R$id.mLayoutSet)).setVisibility(0);
            ((AutoLinearLayout) m26487H9(R$id.mLayoutModify)).setVisibility(8);
            c3912a = new AutoRelativeLayout.C3912a(AbstractC7786b.m30166j(980), AbstractC7786b.m30166j(560));
        }
        ((AutoLinearLayout) m26487H9(R$id.mLayoutPassword)).setLayoutParams(c3912a);
    }

    /* renamed from: J9 */
    private final void m26481J9() {
        if (!AbstractC7557c.m28976d(this.f25933I0)) {
            String m3172j7 = m3172j7(R$string.original_password_wrong);
            AbstractC5868k.m23673e(m3172j7, "getString(R.string.original_password_wrong)");
            m26483M9(m3172j7, false);
            TextView textView = (TextView) m26487H9(R$id.mTextInitial);
            AbstractC5868k.m23673e(textView, "mTextInitial");
            m26485P9(textView);
            return;
        }
        if (!AbstractC7557c.m28975c(this.f25934J0)) {
            String m3172j72 = m3172j7(R$string.password_format_wrong);
            AbstractC5868k.m23673e(m3172j72, "getString(R.string.password_format_wrong)");
            m26483M9(m3172j72, false);
            TextView textView2 = (TextView) m26487H9(R$id.mTextNew);
            AbstractC5868k.m23673e(textView2, "mTextNew");
            m26485P9(textView2);
            return;
        }
        if (!AbstractC7557c.m28975c(this.f25935K0)) {
            String m3172j73 = m3172j7(R$string.confirm_password_wrong);
            AbstractC5868k.m23673e(m3172j73, "getString(R.string.confirm_password_wrong)");
            m26483M9(m3172j73, false);
            TextView textView3 = (TextView) m26487H9(R$id.mTextConfirm);
            AbstractC5868k.m23673e(textView3, "mTextConfirm");
            m26485P9(textView3);
            return;
        }
        if (AbstractC5868k.m23669a(this.f25934J0, this.f25933I0)) {
            String m3172j74 = m3172j7(R$string.pwd_consistent);
            AbstractC5868k.m23673e(m3172j74, "getString(R.string.pwd_consistent)");
            m26483M9(m3172j74, false);
        } else if (!AbstractC5868k.m23669a(this.f25934J0, this.f25935K0)) {
            String m3172j75 = m3172j7(R$string.personal_password_inconsistent);
            AbstractC5868k.m23673e(m3172j75, "getString(R.string.personal_password_inconsistent)");
            m26483M9(m3172j75, false);
        } else {
            C0197q2 c0197q2 = new C0197q2(this);
            C4842a c4842a = C4842a.f20329a;
            c0197q2.m712b(c4842a.m19920a().mo19949Z(this.f25933I0), c4842a.m19920a().mo19949Z(this.f25934J0));
            m26482L9(true);
        }
    }

    /* renamed from: L9 */
    private final void m26482L9(boolean z10) {
        int i10;
        LoadingView loadingView = (LoadingView) m26487H9(R$id.mLoadingView);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        loadingView.setVisibility(i10);
        ((Button) m26487H9(R$id.mBtnConfirm)).setEnabled(!z10);
        ((Button) m26487H9(R$id.mBtnCancel)).setEnabled(!z10);
        ((TextView) m26487H9(R$id.mTextForget)).setEnabled(!z10);
        ((EditText) m26487H9(R$id.mEditPasswordOriginal)).setEnabled(!z10);
        ((EditText) m26487H9(R$id.mEditPasswordNew)).setEnabled(!z10);
        ((EditText) m26487H9(R$id.mEditPasswordConfirm)).setEnabled(!z10);
    }

    /* renamed from: M9 */
    private final void m26483M9(String str, boolean z10) {
        DialogBottomBar.EnumC2998a enumC2998a;
        DialogBottomBar dialogBottomBar = (DialogBottomBar) m26487H9(R$id.mBottomBar);
        if (z10) {
            enumC2998a = DialogBottomBar.EnumC2998a.SUCCESS;
        } else {
            enumC2998a = DialogBottomBar.EnumC2998a.FAIL;
        }
        dialogBottomBar.m12080g(str, enumC2998a);
    }

    /* renamed from: N9 */
    private final void m26484N9() {
        if (!AbstractC7557c.m28975c(this.f25932H0)) {
            String m3172j7 = m3172j7(R$string.password_format_wrong);
            AbstractC5868k.m23673e(m3172j7, "getString(R.string.password_format_wrong)");
            m26483M9(m3172j7, false);
        } else {
            new C0161h2(this).m611b(C4842a.f20329a.m19920a().mo19949Z(this.f25932H0));
            m26482L9(true);
        }
    }

    /* renamed from: P9 */
    private final void m26485P9(View view) {
        ObjectAnimator m28941a = new C7554b().m28941a(view);
        m28941a.setInterpolator(new LinearInterpolator());
        m28941a.start();
    }

    /* renamed from: Q9 */
    private final void m26486Q9() {
        CharSequence m27758b0;
        CharSequence m27758b02;
        CharSequence m27758b03;
        CharSequence m27758b04;
        Editable text = ((EditText) m26487H9(R$id.mEditPasswordSetInitial)).getText();
        AbstractC5868k.m23673e(text, "mEditPasswordSetInitial.text");
        m27758b0 = AbstractC7167u.m27758b0(text);
        this.f25932H0 = m27758b0.toString();
        Editable text2 = ((EditText) m26487H9(R$id.mEditPasswordOriginal)).getText();
        AbstractC5868k.m23673e(text2, "mEditPasswordOriginal.text");
        m27758b02 = AbstractC7167u.m27758b0(text2);
        this.f25933I0 = m27758b02.toString();
        Editable text3 = ((EditText) m26487H9(R$id.mEditPasswordNew)).getText();
        AbstractC5868k.m23673e(text3, "mEditPasswordNew.text");
        m27758b03 = AbstractC7167u.m27758b0(text3);
        this.f25934J0 = m27758b03.toString();
        Editable text4 = ((EditText) m26487H9(R$id.mEditPasswordConfirm)).getText();
        AbstractC5868k.m23673e(text4, "mEditPasswordConfirm.text");
        m27758b04 = AbstractC7167u.m27758b0(text4);
        this.f25935K0 = m27758b04.toString();
        if (this.f25936L0 == a.EnumC7860a.MODIFY) {
            m26481J9();
        } else {
            m26484N9();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r4.equals("aaa100027") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        if (r4.equals("aaa100028") == false) goto L20;
     */
    @Override // p301qb.InterfaceC6418q1
    /* renamed from: A0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo11752A0(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "errCode"
            ne.AbstractC5868k.m23674f(r4, r0)
            r0 = 0
            r3.m26482L9(r0)
            int r1 = r4.hashCode()
            switch(r1) {
                case -338366880: goto L5f;
                case -338366875: goto L32;
                case -338366874: goto L29;
                case 68379: goto L11;
                default: goto L10;
            }
        L10:
            goto L77
        L11:
            java.lang.String r1 = "EA7"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L1a
            goto L77
        L1a:
            int r4 = com.login.R$string.network_timed_out
            java.lang.String r4 = r3.m3172j7(r4)
            java.lang.String r1 = "getString(R.string.network_timed_out)"
            ne.AbstractC5868k.m23673e(r4, r1)
            r3.m26483M9(r4, r0)
            goto L85
        L29:
            java.lang.String r1 = "aaa100028"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L3b
            goto L77
        L32:
            java.lang.String r1 = "aaa100027"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L3b
            goto L77
        L3b:
            int r4 = com.module.R$string.error_code_net_type
            java.lang.String r4 = r3.m3172j7(r4)
            int r1 = com.module.R$string.cdn_ee2
            java.lang.String r1 = r3.m3172j7(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = "2"
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = r2.toString()
            r3.m26483M9(r4, r0)
            goto L85
        L5f:
            java.lang.String r1 = "aaa100022"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L68
            goto L77
        L68:
            int r4 = com.login.R$string.original_password_wrong
            java.lang.String r4 = r3.m3172j7(r4)
            java.lang.String r1 = "getString(R.string.original_password_wrong)"
            ne.AbstractC5868k.m23673e(r4, r1)
            r3.m26483M9(r4, r0)
            goto L85
        L77:
            int r4 = com.login.R$string.pwd_modify_fail
            java.lang.String r4 = r3.m3172j7(r4)
            java.lang.String r1 = "getString(R.string.pwd_modify_fail)"
            ne.AbstractC5868k.m23673e(r4, r1)
            r3.m26483M9(r4, r0)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p329s8.ViewOnClickListenerC6740o0.mo11752A0(java.lang.String):void");
    }

    @Override // p301qb.InterfaceC6397j1
    /* renamed from: D1 */
    public void mo25212D1(BaseResult baseResult) {
        AbstractC5868k.m23674f(baseResult, "bean");
        m26482L9(false);
        AbstractC7598p1.m29244h(m3096J6(), m3172j7(R$string.pwd_set_suc), new int[0]);
        C1466m0 c1466m0 = C1466m0.f5627a;
        c1466m0.m6875k0(C4842a.f20329a.m19920a().mo19949Z(this.f25932H0));
        UserInfo m6887v = c1466m0.m6887v();
        if (m6887v != null) {
            m6887v.setHasPwd("1");
        }
        C7709c.m29787d().m29801m(new RefreshUerInfoDisplayEvent(false, 1, null));
        InterfaceC5642a interfaceC5642a = this.f25937M0;
        if (interfaceC5642a != null) {
            interfaceC5642a.invoke();
        }
        mo3278o9();
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f25938N0.clear();
    }

    /* renamed from: H9 */
    public View m26487H9(int i10) {
        View findViewById;
        Map map = this.f25938N0;
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

    /* renamed from: K9 */
    public final void m26488K9() {
        Button button = (Button) m26487H9(R$id.mBtnSetConfirm);
        AbstractC5868k.m23673e(button, "mBtnSetConfirm");
        AbstractC7555b0.m28955i(button, this);
        Button button2 = (Button) m26487H9(R$id.mBtnConfirm);
        AbstractC5868k.m23673e(button2, "mBtnConfirm");
        AbstractC7555b0.m28955i(button2, this);
        ((Button) m26487H9(R$id.mBtnCancel)).setOnClickListener(this);
        ((TextView) m26487H9(R$id.mTextForget)).setOnClickListener(this);
        int i10 = R$id.mEditPasswordSetInitial;
        ((EditText) m26487H9(i10)).setOnFocusChangeListener(this);
        int i11 = R$id.mEditPasswordOriginal;
        ((EditText) m26487H9(i11)).setOnFocusChangeListener(this);
        int i12 = R$id.mEditPasswordNew;
        ((EditText) m26487H9(i12)).setOnFocusChangeListener(this);
        int i13 = R$id.mEditPasswordConfirm;
        ((EditText) m26487H9(i13)).setOnFocusChangeListener(this);
        ((EditText) m26487H9(i10)).setTypeface(Typeface.DEFAULT);
        ((EditText) m26487H9(i10)).setTransformationMethod(PasswordTransformationMethod.getInstance());
        ((EditText) m26487H9(i11)).setTransformationMethod(PasswordTransformationMethod.getInstance());
        ((EditText) m26487H9(i13)).setTransformationMethod(PasswordTransformationMethod.getInstance());
        ((EditText) m26487H9(i12)).setTransformationMethod(PasswordTransformationMethod.getInstance());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.InputPasswordDialog);
    }

    /* renamed from: O9 */
    public final void m26489O9(a.EnumC7860a enumC7860a) {
        AbstractC5868k.m23674f(enumC7860a, "type");
        this.f25936L0 = enumC7860a;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.dialog_password_setting, viewGroup, false);
        this.f25931G0 = inflate;
        return inflate;
    }

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo16979F9();
    }

    @Override // p301qb.InterfaceC6397j1
    /* renamed from: a6 */
    public void mo25213a6(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        m26482L9(false);
        if (AbstractC5868k.m23669a(str, "EA7")) {
            String m3172j7 = m3172j7(R$string.network_timed_out);
            AbstractC5868k.m23673e(m3172j7, "getString(R.string.network_timed_out)");
            m26483M9(m3172j7, false);
        } else {
            String m3172j72 = m3172j7(R$string.pwd_set_fail);
            AbstractC5868k.m23673e(m3172j72, "getString(R.string.pwd_set_fail)");
            m26483M9(m3172j72, false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        Window window;
        Window window2;
        super.mo3164g8();
        if (this.f25936L0 == a.EnumC7860a.MODIFY) {
            Dialog m3280r9 = m3280r9();
            if (m3280r9 != null && (window2 = m3280r9.getWindow()) != null) {
                window2.setLayout(AbstractC7786b.m30166j(980), AbstractC7786b.m30166j(820));
                return;
            }
            return;
        }
        Dialog m3280r92 = m3280r9();
        if (m3280r92 != null && (window = m3280r92.getWindow()) != null) {
            window.setLayout(AbstractC7786b.m30166j(980), AbstractC7786b.m30166j(560));
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        Window window;
        AbstractC5868k.m23674f(view, "view");
        m26480I9();
        m26488K9();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setSoftInputMode(2);
        }
        super.mo3176k8(view, bundle);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        String str2;
        AbstractC5868k.m23674f(view, "v");
        int id2 = view.getId();
        boolean z10 = true;
        if (id2 != R$id.mBtnSetConfirm && id2 != R$id.mBtnConfirm) {
            z10 = false;
        }
        if (z10) {
            m26486Q9();
            return;
        }
        if (id2 == R$id.mBtnCancel) {
            mo3278o9();
            return;
        }
        if (id2 == R$id.mTextForget) {
            C1466m0 c1466m0 = C1466m0.f5627a;
            UserInfo m6887v = c1466m0.m6887v();
            if (m6887v != null) {
                str = m6887v.getBindMail();
            } else {
                str = null;
            }
            if (AbstractC5868k.m23669a(str, MessageService.MSG_DB_READY_REPORT)) {
                UserInfo m6887v2 = c1466m0.m6887v();
                if (m6887v2 != null) {
                    str2 = m6887v2.getBindMobile();
                } else {
                    str2 = null;
                }
                if (AbstractC5868k.m23669a(str2, MessageService.MSG_DB_READY_REPORT)) {
                    AbstractC7598p1.m29244h(m3096J6(), m3172j7(R$string.personal_please_link_email), new int[0]);
                    return;
                }
            }
            C6926a c6926a = C6926a.f26260a;
            AbstractC0729o m3119R6 = m3119R6();
            AbstractC5868k.m23671c(m3119R6);
            C6926a.m26894t(c6926a, m3119R6, false, 2, null);
            mo3278o9();
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z10) {
        ((DialogBottomBar) m26487H9(R$id.mBottomBar)).m12079e();
    }

    @Override // p301qb.InterfaceC6418q1
    /* renamed from: u3 */
    public void mo11756u3(BaseResult baseResult) {
        AbstractC5868k.m23674f(baseResult, "bean");
        m26482L9(false);
        AbstractC7598p1.m29244h(m3096J6(), m3172j7(R$string.personal_password_modified_successfully), new int[0]);
        C1466m0 c1466m0 = C1466m0.f5627a;
        C4842a c4842a = C4842a.f20329a;
        c1466m0.m6875k0(c4842a.m19920a().mo19949Z(this.f25934J0));
        if (c4842a.m19920a().m19976y()) {
            C5090g c5090g = C5090g.f20948a;
            c5090g.m20656x(c5090g.m20645j(), c1466m0.m6889x());
        }
        mo3278o9();
    }
}
