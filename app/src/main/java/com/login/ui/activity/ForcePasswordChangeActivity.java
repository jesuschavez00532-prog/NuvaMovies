package com.login.ui.activity;

import ac.C0197q2;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0729o;
import be.C1328x;
import cc.C1466m0;
import com.login.R$id;
import com.login.R$layout;
import com.login.R$string;
import com.module.basemvp.AbstractActivityC2972a;
import com.module.event.LoginSuccessRequestDataEvent;
import com.module.view.DialogBottomBar;
import com.module.view.LoadingView;
import com.request.bean.CloseForceChangePwdPageEvent;
import com.request.result.BaseResult;
import com.request.result.LoginResult;
import java.util.LinkedHashMap;
import java.util.Map;
import mc.C5634i;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.greenrobot.eventbus.ThreadMode;
import p170i2.C4842a;
import p201k2.C5090g;
import p285p8.InterfaceC6238a;
import p285p8.InterfaceC6239b;
import p299q8.C6351a;
import p301qb.InterfaceC6418q1;
import p340t8.C6926a;
import p359ue.AbstractC7167u;
import p400xa.AbstractC7557c;
import p400xa.AbstractC7598p1;
import p400xa.C7554b;
import va.InterfaceC7251a;
import ye.C7709c;
import ye.InterfaceC7719m;

/* loaded from: classes.dex */
public final class ForcePasswordChangeActivity extends AbstractActivityC2972a implements InterfaceC6239b, View.OnClickListener, View.OnFocusChangeListener, InterfaceC6418q1 {

    /* renamed from: H */
    public Map f11262H = new LinkedHashMap();

    /* renamed from: E */
    private String f11259E = "";

    /* renamed from: F */
    private String f11260F = "";

    /* renamed from: G */
    private String f11261G = "";

    /* renamed from: com.login.ui.activity.ForcePasswordChangeActivity$a */
    /* loaded from: classes2.dex */
    static final class C2895a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final C2895a f11263a = new C2895a();

        C2895a() {
            super(1);
        }

        /* renamed from: a */
        public final void m11757a(LoginResult loginResult) {
            C7709c.m29787d().m29801m(new CloseForceChangePwdPageEvent());
            C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(true, false, null, 6, null));
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m11757a((LoginResult) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h6 */
    private final void m11747h6() {
        if (!AbstractC7557c.m28976d(this.f11259E)) {
            String string = getString(R$string.original_password_wrong);
            AbstractC5868k.m23673e(string, "getString(R.string.original_password_wrong)");
            m11749l6(string, false);
            EditText editText = (EditText) m11753e6(R$id.mOriginalPassword);
            AbstractC5868k.m23673e(editText, "mOriginalPassword");
            m11750p6(editText);
            return;
        }
        if (!AbstractC7557c.m28975c(this.f11260F)) {
            String string2 = getString(R$string.password_format_wrong);
            AbstractC5868k.m23673e(string2, "getString(R.string.password_format_wrong)");
            m11749l6(string2, false);
            EditText editText2 = (EditText) m11753e6(R$id.mNewPassword);
            AbstractC5868k.m23673e(editText2, "mNewPassword");
            m11750p6(editText2);
            return;
        }
        if (!AbstractC7557c.m28975c(this.f11261G)) {
            String string3 = getString(R$string.confirm_password_wrong);
            AbstractC5868k.m23673e(string3, "getString(R.string.confirm_password_wrong)");
            m11749l6(string3, false);
            EditText editText3 = (EditText) m11753e6(R$id.mConfirmPassword);
            AbstractC5868k.m23673e(editText3, "mConfirmPassword");
            m11750p6(editText3);
            return;
        }
        if (AbstractC5868k.m23669a(this.f11260F, this.f11259E)) {
            String string4 = getString(R$string.pwd_consistent);
            AbstractC5868k.m23673e(string4, "getString(R.string.pwd_consistent)");
            m11749l6(string4, false);
        } else if (!AbstractC5868k.m23669a(this.f11260F, this.f11261G)) {
            String string5 = getString(R$string.personal_password_inconsistent);
            AbstractC5868k.m23673e(string5, "getString(R.string.personal_password_inconsistent)");
            m11749l6(string5, false);
        } else {
            C0197q2 c0197q2 = new C0197q2(this);
            C4842a c4842a = C4842a.f20329a;
            c0197q2.m712b(c4842a.m19920a().mo19949Z(this.f11259E), c4842a.m19920a().mo19949Z(this.f11260F));
            m11748j6(true);
        }
    }

    /* renamed from: j6 */
    private final void m11748j6(boolean z10) {
        int i10;
        LoadingView loadingView = (LoadingView) m11753e6(R$id.mLoadingView);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        loadingView.setVisibility(i10);
        ((TextView) m11753e6(R$id.mConfirm)).setEnabled(!z10);
        ((TextView) m11753e6(R$id.mChangeAccounts)).setEnabled(!z10);
        ((TextView) m11753e6(R$id.mTextForget)).setEnabled(!z10);
        ((EditText) m11753e6(R$id.mOriginalPassword)).setEnabled(!z10);
        ((EditText) m11753e6(R$id.mNewPassword)).setEnabled(!z10);
        ((EditText) m11753e6(R$id.mConfirmPassword)).setEnabled(!z10);
    }

    /* renamed from: l6 */
    private final void m11749l6(String str, boolean z10) {
        DialogBottomBar.EnumC2998a enumC2998a;
        DialogBottomBar dialogBottomBar = (DialogBottomBar) m11753e6(R$id.mBottomBar);
        if (z10) {
            enumC2998a = DialogBottomBar.EnumC2998a.SUCCESS;
        } else {
            enumC2998a = DialogBottomBar.EnumC2998a.FAIL;
        }
        dialogBottomBar.m12081h(str, enumC2998a);
    }

    /* renamed from: p6 */
    private final void m11750p6(View view) {
        ObjectAnimator m28941a = new C7554b().m28941a(view);
        m28941a.setInterpolator(new LinearInterpolator());
        m28941a.start();
    }

    /* renamed from: q6 */
    private final void m11751q6() {
        CharSequence m27758b0;
        CharSequence m27758b02;
        CharSequence m27758b03;
        Editable text = ((EditText) m11753e6(R$id.mOriginalPassword)).getText();
        AbstractC5868k.m23673e(text, "mOriginalPassword.text");
        m27758b0 = AbstractC7167u.m27758b0(text);
        this.f11259E = m27758b0.toString();
        Editable text2 = ((EditText) m11753e6(R$id.mNewPassword)).getText();
        AbstractC5868k.m23673e(text2, "mNewPassword.text");
        m27758b02 = AbstractC7167u.m27758b0(text2);
        this.f11260F = m27758b02.toString();
        Editable text3 = ((EditText) m11753e6(R$id.mConfirmPassword)).getText();
        AbstractC5868k.m23673e(text3, "mConfirmPassword.text");
        m27758b03 = AbstractC7167u.m27758b0(text3);
        this.f11261G = m27758b03.toString();
        m11747h6();
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
            r3.m11748j6(r0)
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
            java.lang.String r4 = r3.getString(r4)
            java.lang.String r1 = "getString(R.string.network_timed_out)"
            ne.AbstractC5868k.m23673e(r4, r1)
            r3.m11749l6(r4, r0)
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
            java.lang.String r4 = r3.getString(r4)
            int r1 = com.module.R$string.cdn_ee2
            java.lang.String r1 = r3.getString(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = "2"
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = r2.toString()
            r3.m11749l6(r4, r0)
            goto L85
        L5f:
            java.lang.String r1 = "aaa100022"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L68
            goto L77
        L68:
            int r4 = com.login.R$string.original_password_wrong
            java.lang.String r4 = r3.getString(r4)
            java.lang.String r1 = "getString(R.string.original_password_wrong)"
            ne.AbstractC5868k.m23673e(r4, r1)
            r3.m11749l6(r4, r0)
            goto L85
        L77:
            int r4 = com.login.R$string.pwd_modify_fail
            java.lang.String r4 = r3.getString(r4)
            java.lang.String r1 = "getString(R.string.pwd_modify_fail)"
            ne.AbstractC5868k.m23673e(r4, r1)
            r3.m11749l6(r4, r0)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.login.p065ui.activity.ForcePasswordChangeActivity.mo11752A0(java.lang.String):void");
    }

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final void closeForceChangePwdPage(CloseForceChangePwdPageEvent closeForceChangePwdPageEvent) {
        AbstractC5868k.m23674f(closeForceChangePwdPageEvent, "event");
        finish();
    }

    /* renamed from: e6 */
    public View m11753e6(int i10) {
        Map map = this.f11262H;
        View view = (View) map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i10);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g5 */
    protected void mo7513g5() {
        m11755i6();
        ((InterfaceC6238a) m11977r5()).mo24844K0();
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: g6, reason: merged with bridge method [inline-methods] */
    public InterfaceC6238a mo7516s5() {
        return new C6351a(this, this);
    }

    /* renamed from: i6 */
    public final void m11755i6() {
        int i10 = R$id.mTextForget;
        ((TextView) m11753e6(i10)).setOnClickListener(this);
        ((TextView) m11753e6(R$id.mChangeAccounts)).setOnClickListener(this);
        ((TextView) m11753e6(R$id.mConfirm)).setOnClickListener(this);
        int i11 = R$id.mOriginalPassword;
        ((EditText) m11753e6(i11)).setOnFocusChangeListener(this);
        int i12 = R$id.mNewPassword;
        ((EditText) m11753e6(i12)).setOnFocusChangeListener(this);
        int i13 = R$id.mConfirmPassword;
        ((EditText) m11753e6(i13)).setOnFocusChangeListener(this);
        ((EditText) m11753e6(i11)).setTransformationMethod(PasswordTransformationMethod.getInstance());
        ((EditText) m11753e6(i12)).setTransformationMethod(PasswordTransformationMethod.getInstance());
        ((EditText) m11753e6(i13)).setTransformationMethod(PasswordTransformationMethod.getInstance());
        ((TextView) m11753e6(i10)).getPaint().setFlags(8);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m11968K5();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i10 = R$id.mTextForget;
        if (num != null && num.intValue() == i10) {
            C6926a c6926a = C6926a.f26260a;
            AbstractC0729o m3294d4 = m3294d4();
            AbstractC5868k.m23673e(m3294d4, "this.supportFragmentManager");
            C6926a.m26894t(c6926a, m3294d4, false, 2, null);
            return;
        }
        int i11 = R$id.mChangeAccounts;
        if (num != null && num.intValue() == i11) {
            InterfaceC7251a interfaceC7251a = (InterfaceC7251a) C5634i.m22844e(InterfaceC7251a.class, new Object[0]);
            if (interfaceC7251a != null) {
                AbstractC0729o m3294d42 = m3294d4();
                AbstractC5868k.m23673e(m3294d42, "supportFragmentManager");
                InterfaceC7251a.a.m28064a(interfaceC7251a, m3294d42, true, null, C2895a.f11263a, 4, null);
                return;
            }
            return;
        }
        int i12 = R$id.mConfirm;
        if (num != null && num.intValue() == i12) {
            m11751q6();
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z10) {
        ((DialogBottomBar) m11753e6(R$id.mBottomBar)).m12079e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.AbstractActivityC0712e, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        ((InterfaceC6238a) m11977r5()).mo24844K0();
    }

    @Override // p301qb.InterfaceC6418q1
    /* renamed from: u3 */
    public void mo11756u3(BaseResult baseResult) {
        AbstractC5868k.m23674f(baseResult, "bean");
        m11748j6(false);
        AbstractC7598p1.m29244h(m30049S4(), getString(R$string.personal_password_modified_successfully), new int[0]);
        C1466m0 c1466m0 = C1466m0.f5627a;
        C4842a c4842a = C4842a.f20329a;
        c1466m0.m6875k0(c4842a.m19920a().mo19949Z(this.f11260F));
        if (c4842a.m19920a().m19976y()) {
            C5090g c5090g = C5090g.f20948a;
            c5090g.m20656x(c5090g.m20645j(), c1466m0.m6889x());
        }
        ((InterfaceC6238a) m11977r5()).mo24845u0();
    }

    @Override // com.module.basemvp.AbstractActivityC2972a
    /* renamed from: z5 */
    protected int mo7518z5() {
        return R$layout.activity_force_password_change;
    }
}
