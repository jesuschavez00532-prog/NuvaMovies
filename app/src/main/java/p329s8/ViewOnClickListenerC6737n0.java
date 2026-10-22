package p329s8;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0729o;
import androidx.recyclerview.widget.LinearLayoutManager;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.AbstractC1459j;
import cc.C1466m0;
import com.login.R$id;
import com.login.R$layout;
import com.login.R$string;
import com.login.R$style;
import com.module.childlock.view.MarqueTextView;
import com.module.event.CloseDialogEvent;
import com.module.view.AutoCompleteEditView;
import com.module.view.AutoEmailCompleteRecyclerView;
import com.module.view.AutoFocusedTextView;
import com.module.view.LoadingView;
import com.request.result.LoginResult;
import com.taobao.accs.common.Constants;
import com.titans.entity.CdnType;
import com.zhy.autolayout.AutoLinearLayout;
import ga.C4417e;
import java.util.ArrayList;
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
import p201k2.AbstractC5085b;
import p217l2.InterfaceC5342c;
import p285p8.InterfaceC6240c;
import p285p8.InterfaceC6241d;
import p299q8.C6352b;
import p302qc.C6448c;
import p317rb.AbstractC6567a;
import p340t8.C6926a;
import p348u2.AbstractC7028e;
import p359ue.AbstractC7167u;
import p400xa.AbstractC7557c;
import p400xa.C7556b1;
import p400xa.C7615w;
import p415y9.AbstractApplicationC7689d;
import p430z9.C7767e;
import p433zd.AbstractC7786b;
import ye.C7709c;

/* renamed from: s8.n0 */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC6737n0 extends C7767e implements InterfaceC6241d, View.OnClickListener, View.OnFocusChangeListener {

    /* renamed from: F0 */
    private View f25893F0;

    /* renamed from: G0 */
    private InterfaceC5660l f25894G0;

    /* renamed from: H0 */
    private String f25895H0;

    /* renamed from: I0 */
    private ViewOnClickListenerC4802v f25896I0;

    /* renamed from: K0 */
    private boolean f25898K0;

    /* renamed from: L0 */
    private final InterfaceC1312h f25899L0;

    /* renamed from: M0 */
    private String f25900M0;

    /* renamed from: N0 */
    private String f25901N0;

    /* renamed from: O0 */
    private boolean f25902O0;

    /* renamed from: P0 */
    private boolean f25903P0;

    /* renamed from: Q0 */
    public Map f25904Q0 = new LinkedHashMap();

    /* renamed from: J0 */
    private String f25897J0 = "";

    /* renamed from: s8.n0$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6352b invoke() {
            return new C6352b(ViewOnClickListenerC6737n0.this);
        }
    }

    /* renamed from: s8.n0$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5660l {
        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m26462a(String str) {
            AbstractC5868k.m23674f(str, "it");
            if (ViewOnClickListenerC6737n0.this.m3075C6() != null) {
                AbstractActivityC0712e m3075C6 = ViewOnClickListenerC6737n0.this.m3075C6();
                AbstractC5868k.m23671c(m3075C6);
                if (!m3075C6.isFinishing()) {
                    ((AutoFocusedTextView) ViewOnClickListenerC6737n0.this.m26455I9(R$id.mTextContact)).setText(ViewOnClickListenerC6737n0.this.m3175k7(R$string.account_questions_contact, str));
                }
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26462a((String) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s8.n0$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {
        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m26463a(ArrayList arrayList) {
            AbstractC5868k.m23674f(arrayList, "completeList");
            if (!AbstractC6567a.m25635e(arrayList) && ViewOnClickListenerC6737n0.this.m3075C6() != null) {
                AbstractActivityC0712e m3075C6 = ViewOnClickListenerC6737n0.this.m3075C6();
                AbstractC5868k.m23671c(m3075C6);
                if (!m3075C6.isFinishing()) {
                    ((AutoEmailCompleteRecyclerView) ViewOnClickListenerC6737n0.this.m26455I9(R$id.mRvCompleteList)).setCompleteList(arrayList);
                }
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26463a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: s8.n0$d */
    /* loaded from: classes2.dex */
    public static final class d implements ViewOnClickListenerC4802v.b {

        /* renamed from: b */
        final /* synthetic */ ViewOnClickListenerC4802v f25909b;

        /* renamed from: s8.n0$d$a */
        /* loaded from: classes2.dex */
        public static final class a implements ViewOnClickListenerC4799t0.a {

            /* renamed from: a */
            final /* synthetic */ ViewOnClickListenerC6737n0 f25910a;

            a(ViewOnClickListenerC6737n0 viewOnClickListenerC6737n0) {
                this.f25910a = viewOnClickListenerC6737n0;
            }

            @Override // p161ha.ViewOnClickListenerC4799t0.a
            /* renamed from: a */
            public void mo11875a(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
                AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
                this.f25910a.m26448M9().m25135I0();
            }

            @Override // p161ha.ViewOnClickListenerC4799t0.a
            /* renamed from: b */
            public void mo11876b(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
                AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
            }
        }

        /* renamed from: s8.n0$d$b */
        /* loaded from: classes2.dex */
        public static final class b implements ViewOnClickListenerC4799t0.a {

            /* renamed from: a */
            final /* synthetic */ ViewOnClickListenerC6737n0 f25911a;

            b(ViewOnClickListenerC6737n0 viewOnClickListenerC6737n0) {
                this.f25911a = viewOnClickListenerC6737n0;
            }

            @Override // p161ha.ViewOnClickListenerC4799t0.a
            /* renamed from: a */
            public void mo11875a(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
                AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
                ViewOnClickListenerC4802v viewOnClickListenerC4802v = this.f25911a.f25896I0;
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
            this.f25909b = viewOnClickListenerC4802v;
        }

        @Override // p161ha.ViewOnClickListenerC4802v.b
        /* renamed from: a0 */
        public void mo11902a0() {
            ViewOnClickListenerC4802v viewOnClickListenerC4802v = ViewOnClickListenerC6737n0.this.f25896I0;
            if (viewOnClickListenerC4802v != null) {
                viewOnClickListenerC4802v.mo3279p9();
            }
            ViewOnClickListenerC6737n0.this.m26448M9().m25133F3();
        }

        @Override // p161ha.ViewOnClickListenerC4802v.b
        /* renamed from: b0 */
        public void mo11903b0() {
            String str;
            String str2;
            C7556b1 c7556b1 = C7556b1.f27754a;
            AbstractC0729o m3110N8 = this.f25909b.m3110N8();
            AbstractC5868k.m23673e(m3110N8, "requireFragmentManager()");
            Context m3096J6 = this.f25909b.m3096J6();
            if (m3096J6 == null || (str = m3096J6.getString(com.module.R$string.operation_failed_tips)) == null) {
                str = "";
            }
            Context m3096J62 = this.f25909b.m3096J6();
            if (m3096J62 == null || (str2 = m3096J62.getString(com.module.R$string.commmon_confirm_text)) == null) {
                str2 = "";
            }
            C7556b1.m28962j(c7556b1, m3110N8, str, "", str2, true, new a(ViewOnClickListenerC6737n0.this), false, null, false, 384, null);
        }

        @Override // p161ha.ViewOnClickListenerC4802v.b
        /* renamed from: c0 */
        public void mo11904c0() {
            String str;
            String str2;
            C7556b1 c7556b1 = C7556b1.f27754a;
            AbstractC0729o m3110N8 = this.f25909b.m3110N8();
            AbstractC5868k.m23673e(m3110N8, "requireFragmentManager()");
            Context m3096J6 = this.f25909b.m3096J6();
            if (m3096J6 == null || (str = m3096J6.getString(com.module.R$string.login_invaild_text)) == null) {
                str = "";
            }
            Context m3096J62 = this.f25909b.m3096J6();
            if (m3096J62 == null || (str2 = m3096J62.getString(com.module.R$string.commmon_refresh_text)) == null) {
                str2 = "";
            }
            C7556b1.m28962j(c7556b1, m3110N8, str, "", str2, true, new b(ViewOnClickListenerC6737n0.this), false, null, false, 384, null);
        }
    }

    /* renamed from: s8.n0$e */
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

    public ViewOnClickListenerC6737n0() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(new a());
        this.f25899L0 = m5965b;
        this.f25900M0 = "";
        this.f25901N0 = "";
        this.f25902O0 = true;
        this.f25903P0 = true;
    }

    /* renamed from: L9 */
    private final void m26447L9() {
        mo3278o9();
        AbstractC7028e.m27115a("login");
        C4417e c4417e = C4417e.f19115a;
        Context m29494a = AbstractApplicationC7689d.f28135d.m29494a();
        String m20598h = AbstractC5085b.m20598h(m3096J6());
        AbstractC5868k.m23673e(m20598h, "getPackageName(context)");
        C4417e.m18497f(c4417e, m29494a, m20598h, false, false, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M9 */
    public final C6352b m26448M9() {
        return (C6352b) this.f25899L0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N9 */
    public static final void m26449N9(ViewOnClickListenerC6737n0 viewOnClickListenerC6737n0, String str) {
        AbstractC5868k.m23674f(viewOnClickListenerC6737n0, "this$0");
        int i10 = R$id.mEditAccount;
        if (((AutoCompleteEditView) viewOnClickListenerC6737n0.m26455I9(i10)) != null) {
            ((AutoCompleteEditView) viewOnClickListenerC6737n0.m26455I9(i10)).setText(str);
            ((AutoCompleteEditView) viewOnClickListenerC6737n0.m26455I9(i10)).setSelection(((AutoCompleteEditView) viewOnClickListenerC6737n0.m26455I9(i10)).getText().length());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (ne.AbstractC5868k.m23669a(r4, r1) == false) goto L26;
     */
    /* renamed from: O9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m26450O9(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = r3.f25898K0
            if (r0 != 0) goto L75
            cc.m0 r0 = cc.C1466m0.f5627a
            boolean r1 = r0.m6833F()
            if (r1 != 0) goto L75
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L75
            com.request.result.UserInfo r1 = r0.m6887v()
            if (r1 == 0) goto L75
            java.lang.String r1 = r0.m6878m()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L2c
            java.lang.String r1 = r0.m6878m()
            boolean r1 = ne.AbstractC5868k.m23669a(r4, r1)
            if (r1 != 0) goto L73
        L2c:
            com.request.result.UserInfo r1 = r0.m6887v()
            r2 = 0
            if (r1 == 0) goto L38
            java.lang.String r1 = r1.getEmail()
            goto L39
        L38:
            r1 = r2
        L39:
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L51
            com.request.result.UserInfo r1 = r0.m6887v()
            if (r1 == 0) goto L4a
            java.lang.String r1 = r1.getEmail()
            goto L4b
        L4a:
            r1 = r2
        L4b:
            boolean r1 = ne.AbstractC5868k.m23669a(r4, r1)
            if (r1 != 0) goto L73
        L51:
            com.request.result.UserInfo r1 = r0.m6887v()
            if (r1 == 0) goto L5c
            java.lang.String r1 = r1.getMobile()
            goto L5d
        L5c:
            r1 = r2
        L5d:
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L75
            com.request.result.UserInfo r0 = r0.m6887v()
            if (r0 == 0) goto L6d
            java.lang.String r2 = r0.getMobile()
        L6d:
            boolean r4 = ne.AbstractC5868k.m23669a(r4, r2)
            if (r4 == 0) goto L75
        L73:
            r4 = 1
            goto L76
        L75:
            r4 = 0
        L76:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p329s8.ViewOnClickListenerC6737n0.m26450O9(java.lang.String):boolean");
    }

    /* renamed from: P9 */
    private final void m26451P9() {
        CharSequence m27758b0;
        CharSequence m27758b02;
        boolean m27763v;
        boolean m27763v2;
        String str;
        Editable text = ((AutoCompleteEditView) m26455I9(R$id.mEditAccount)).getText();
        AbstractC5868k.m23673e(text, "mEditAccount.text");
        m27758b0 = AbstractC7167u.m27758b0(text);
        this.f25900M0 = m27758b0.toString();
        Editable text2 = ((EditText) m26455I9(R$id.mEditPassword)).getText();
        AbstractC5868k.m23673e(text2, "mEditPassword.text");
        m27758b02 = AbstractC7167u.m27758b0(text2);
        this.f25901N0 = m27758b02.toString();
        if (!TextUtils.isEmpty(this.f25900M0) && !TextUtils.isEmpty(this.f25901N0)) {
            if (AbstractC7557c.m28973a(this.f25900M0) && !AbstractC7557c.m28976d(this.f25901N0)) {
                m26454W9(R$string.personal_password_format);
                return;
            }
            if (AbstractC7557c.m28973a(this.f25900M0) || AbstractC7557c.m28976d(this.f25901N0)) {
                m27763v = AbstractC7167u.m27763v(this.f25900M0, "@", false, 2, null);
                if (m27763v && !AbstractC7557c.m28974b(this.f25900M0)) {
                    m26454W9(R$string.account_incorrect_email);
                    return;
                }
                if (m26450O9(this.f25900M0)) {
                    m26454W9(R$string.account_already_login);
                    return;
                }
                if (!AbstractC7557c.m28973a(this.f25900M0)) {
                    m27763v2 = AbstractC7167u.m27763v(this.f25900M0, "@", false, 2, null);
                    if (m27763v2) {
                        str = "2";
                    } else {
                        str = "1";
                    }
                } else {
                    str = CdnType.DIGITAL_TYPE_PEERSTAR;
                }
                String str2 = str;
                String mo19949Z = C4842a.f20329a.m19920a().mo19949Z(this.f25901N0);
                C1466m0.f5627a.m6851X(this.f25900M0);
                InterfaceC6240c.a.m24847a(m26448M9(), str2, this.f25900M0, mo19949Z, null, null, null, 56, null);
                m26453V9(true);
                this.f25898K0 = false;
                return;
            }
            m26454W9(R$string.personal_password_format);
            return;
        }
        m26454W9(R$string.account_incorrect_account_or_password);
    }

    /* renamed from: Q9 */
    private final void m26452Q9() {
        C6926a c6926a = C6926a.f26260a;
        AbstractC0729o m3093I6 = m3093I6();
        AbstractC5868k.m23673e(m3093I6, "childFragmentManager");
        c6926a.m26908s(m3093I6, false);
    }

    /* renamed from: V9 */
    private final void m26453V9(boolean z10) {
        int i10;
        LoadingView loadingView = (LoadingView) m26455I9(R$id.mLoadingView);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        loadingView.setVisibility(i10);
        ((TextView) m26455I9(R$id.mTextLogin)).setEnabled(!z10);
        ((TextView) m26455I9(R$id.mTextForgetPwd)).setEnabled(!z10);
        ((AutoCompleteEditView) m26455I9(R$id.mEditAccount)).setEnabled(!z10);
        ((EditText) m26455I9(R$id.mEditPassword)).setEnabled(!z10);
    }

    /* renamed from: W9 */
    private final void m26454W9(int i10) {
        ((AutoLinearLayout) m26455I9(R$id.mLayoutNotify)).setVisibility(0);
        ((MarqueTextView) m26455I9(R$id.mTextNotify)).setText(i10);
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f25904Q0.clear();
    }

    /* renamed from: I9 */
    public View m26455I9(int i10) {
        View findViewById;
        Map map = this.f25904Q0;
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
        m26453V9(false);
        InterfaceC5660l interfaceC5660l = this.f25894G0;
        if (interfaceC5660l != null) {
            interfaceC5660l.mo542f(loginResult);
        }
        mo3278o9();
        C7709c.m29787d().m29801m(new CloseDialogEvent());
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.dialog_enable_phone_login, viewGroup, false);
        this.f25893F0 = inflate;
        return inflate;
    }

    /* renamed from: R9 */
    public final void m26456R9(InterfaceC5660l interfaceC5660l) {
        this.f25894G0 = interfaceC5660l;
    }

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo16979F9();
    }

    /* renamed from: S9 */
    public final void m26457S9(boolean z10) {
        this.f25902O0 = z10;
    }

    /* renamed from: T9 */
    public final void m26458T9(String str) {
        AbstractC5868k.m23674f(str, Constants.KEY_ERROR_CODE);
        this.f25898K0 = true;
        this.f25897J0 = str;
    }

    /* renamed from: U9 */
    public final void m26459U9() {
        Window window;
        ((TextView) m26455I9(R$id.mTextLogin)).setOnClickListener(this);
        ((TextView) m26455I9(R$id.mTextForgetPwd)).setOnClickListener(this);
        ((ImageView) m26455I9(R$id.mImagePhoneLogin)).setOnClickListener(this);
        ((ImageView) m26455I9(R$id.mImageSMSLogin)).setOnClickListener(this);
        int i10 = R$id.mEditAccount;
        ((AutoCompleteEditView) m26455I9(i10)).setOnFocusChangeListener(this);
        int i11 = R$id.mEditPassword;
        ((EditText) m26455I9(i11)).setOnFocusChangeListener(this);
        ((EditText) m26455I9(i11)).setTypeface(Typeface.DEFAULT);
        ((EditText) m26455I9(i11)).setTransformationMethod(new PasswordTransformationMethod());
        Context m3096J6 = m3096J6();
        if (m3096J6 != null) {
            int i12 = R$id.mRvCompleteList;
            ((AutoEmailCompleteRecyclerView) m26455I9(i12)).setLayoutManager(new LinearLayoutManager(m3096J6));
            AutoEmailCompleteRecyclerView autoEmailCompleteRecyclerView = (AutoEmailCompleteRecyclerView) m26455I9(i12);
            Dialog m3280r9 = m3280r9();
            if (m3280r9 != null) {
                window = m3280r9.getWindow();
            } else {
                window = null;
            }
            autoEmailCompleteRecyclerView.m12066d(window, (AutoCompleteEditView) m26455I9(i10));
            C7615w.f27995a.m29311S(m3096J6, new c());
        }
    }

    /* renamed from: W0 */
    public final void m26460W0() {
        if (AbstractC5868k.m23669a(C1466m0.f5627a.m6860d(), "")) {
            C4982a c4982a = C4982a.f20721a;
            AbstractApplicationC7689d.a aVar = AbstractApplicationC7689d.f28135d;
            if (!AbstractC5868k.m23669a(c4982a.m20333a(aVar.m29494a(), "user_account_EMAIL", ""), "")) {
                String str = (String) c4982a.m20333a(aVar.m29494a(), "user_account_EMAIL", "");
                this.f25895H0 = str;
                final String m6797b = AbstractC1459j.m6797b(str, C4842a.f20329a.m19920a().mo19967p());
                if (!TextUtils.isEmpty(m6797b)) {
                    ((AutoCompleteEditView) m26455I9(R$id.mEditAccount)).postDelayed(new Runnable() { // from class: s8.m0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewOnClickListenerC6737n0.m26449N9(ViewOnClickListenerC6737n0.this, m6797b);
                        }
                    }, 500L);
                }
            }
        }
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r2.equals("aaa100019") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        m26454W9(com.login.R$string.account_frozen);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r2.equals("aaa100018") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
    
        m26454W9(com.login.R$string.account_blacklist);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        if (r2.equals("aaa100017") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (r2.equals("aaa100004") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:
    
        if (r2.equals("portal100024") == false) goto L42;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000d. Please report as an issue. */
    @Override // p285p8.InterfaceC6241d
    /* renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo24850f0(boolean r1, java.lang.String r2) {
        /*
            r0 = this;
            java.lang.String r1 = "errCode"
            ne.AbstractC5868k.m23674f(r2, r1)
            r1 = 0
            r0.m26453V9(r1)
            int r1 = r2.hashCode()
            switch(r1) {
                case -396103091: goto L8d;
                case -367474005: goto L7e;
                case -338366941: goto L6f;
                case -338366940: goto L60;
                case -338366906: goto L57;
                case -338366905: goto L4e;
                case -338366904: goto L45;
                case -338366880: goto L36;
                case -338366661: goto L23;
                case 68379: goto L12;
                default: goto L10;
            }
        L10:
            goto L9c
        L12:
            java.lang.String r1 = "EA7"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L1c
            goto L9c
        L1c:
            int r1 = com.login.R$string.account_login_timeout
            r0.m26454W9(r1)
            goto La1
        L23:
            java.lang.String r1 = "aaa100094"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L2d
            goto L9c
        L2d:
            q8.b r1 = r0.m26448M9()
            r1.m25136Y0()
            goto La1
        L36:
            java.lang.String r1 = "aaa100022"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L3f
            goto L9c
        L3f:
            int r1 = com.login.R$string.account_incorrect_account_or_password
            r0.m26454W9(r1)
            goto La1
        L45:
            java.lang.String r1 = "aaa100019"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L69
            goto L9c
        L4e:
            java.lang.String r1 = "aaa100018"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L96
            goto L9c
        L57:
            java.lang.String r1 = "aaa100017"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L96
            goto L9c
        L60:
            java.lang.String r1 = "aaa100004"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L69
            goto L9c
        L69:
            int r1 = com.login.R$string.account_frozen
            r0.m26454W9(r1)
            goto La1
        L6f:
            java.lang.String r1 = "aaa100003"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L78
            goto L9c
        L78:
            int r1 = com.login.R$string.account_incorrect_account_or_password
            r0.m26454W9(r1)
            goto La1
        L7e:
            java.lang.String r1 = "portal200001"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L87
            goto L9c
        L87:
            int r1 = com.login.R$string.account_version_disable
            r0.m26454W9(r1)
            goto La1
        L8d:
            java.lang.String r1 = "portal100024"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L96
            goto L9c
        L96:
            int r1 = com.login.R$string.account_blacklist
            r0.m26454W9(r1)
            goto La1
        L9c:
            int r1 = com.login.R$string.account_login_failed
            r0.m26454W9(r1)
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p329s8.ViewOnClickListenerC6737n0.mo24850f0(boolean, java.lang.String):void");
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        Window window;
        super.mo3164g8();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setLayout(AbstractC7786b.m30166j(720), AbstractC7786b.m30163g(980));
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        Window window;
        AbstractC5868k.m23674f(view, "view");
        m26459U9();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setSoftInputMode(2);
        }
        super.mo3176k8(view, bundle);
        C1466m0 c1466m0 = C1466m0.f5627a;
        boolean z10 = true;
        if (!TextUtils.isEmpty(c1466m0.m6870i())) {
            int i10 = R$id.mTextDeviceId;
            ((TextView) m26455I9(i10)).setVisibility(0);
            TextView textView = (TextView) m26455I9(i10);
            C5881x c5881x = C5881x.f23415a;
            String m3172j7 = m3172j7(R$string.account_device_id);
            AbstractC5868k.m23673e(m3172j7, "getString(R.string.account_device_id)");
            String format = String.format(m3172j7, Arrays.copyOf(new Object[]{c1466m0.m6870i()}, 1));
            AbstractC5868k.m23673e(format, "format(format, *args)");
            textView.setText(format);
        } else {
            ((TextView) m26455I9(R$id.mTextDeviceId)).setVisibility(8);
        }
        C7615w.m29301w(C7615w.f27995a, new b(), null, null, 6, null);
        ((AutoCompleteEditView) m26455I9(R$id.mEditAccount)).setText("");
        m26460W0();
        if (this.f25897J0.length() <= 0) {
            z10 = false;
        }
        if (z10) {
            mo24850f0(false, this.f25897J0);
        }
    }

    @Override // p285p8.InterfaceC6241d
    /* renamed from: l */
    public void mo24851l(List list, String str, boolean z10) {
        AbstractC5868k.m23674f(list, "deviceList");
        AbstractC5868k.m23674f(str, "tempToken");
        if (z10) {
            ViewOnClickListenerC4802v viewOnClickListenerC4802v = this.f25896I0;
            if (viewOnClickListenerC4802v != null) {
                viewOnClickListenerC4802v.m19847Q9(list);
                return;
            }
            return;
        }
        ViewOnClickListenerC4802v.a aVar = ViewOnClickListenerC4802v.f20235P0;
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        ViewOnClickListenerC4802v m19852a = aVar.m19852a(m3096J6, list, str, this.f25902O0);
        m19852a.m19849V9(new d(m19852a));
        this.f25896I0 = m19852a;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(dialogInterface, "dialog");
        if (this.f25902O0) {
            mo3278o9();
        } else {
            m26447L9();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC5868k.m23674f(view, "v");
        int id2 = view.getId();
        if (id2 == R$id.mTextLogin) {
            m26451P9();
        } else if (id2 == R$id.mTextForgetPwd) {
            m26452Q9();
        } else if (id2 == R$id.mImagePhoneLogin) {
            InterfaceC5342c interfaceC5342c = (InterfaceC5342c) C5634i.m22844e(InterfaceC5342c.class, new Object[0]);
            if (interfaceC5342c != null) {
                AbstractC0729o m3119R6 = m3119R6();
                AbstractC5868k.m23671c(m3119R6);
                interfaceC5342c.mo21617d(m3119R6, this.f25902O0, this.f25894G0);
            }
            mo3278o9();
        } else if (id2 == R$id.mImageSMSLogin) {
            InterfaceC5342c interfaceC5342c2 = (InterfaceC5342c) C5634i.m22844e(InterfaceC5342c.class, new Object[0]);
            if (interfaceC5342c2 != null) {
                AbstractC0729o m3119R62 = m3119R6();
                AbstractC5868k.m23671c(m3119R62);
                interfaceC5342c2.mo21622i(m3119R62, this.f25902O0, this.f25894G0);
            }
            mo3278o9();
        }
        this.f25897J0 = "";
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z10) {
        boolean z11;
        boolean z12 = true;
        if (view != null && view.getId() == R$id.mEditAccount) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            if (view == null || view.getId() != R$id.mEditPassword) {
                z12 = false;
            }
            if (!z12) {
                return;
            }
        }
        if (AbstractC6567a.m25634d(this.f25897J0)) {
            AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m26455I9(R$id.mLayoutNotify);
            if (autoLinearLayout != null) {
                autoLinearLayout.setVisibility(8);
                return;
            }
            return;
        }
        this.f25897J0 = "";
    }

    @Override // p285p8.InterfaceC6241d
    /* renamed from: v */
    public void mo24852v(boolean z10) {
        String str;
        String str2;
        ViewOnClickListenerC4802v viewOnClickListenerC4802v;
        if (z10 && (viewOnClickListenerC4802v = this.f25896I0) != null) {
            viewOnClickListenerC4802v.mo3279p9();
        }
        C7556b1 c7556b1 = C7556b1.f27754a;
        AbstractC0729o m3110N8 = m3110N8();
        AbstractC5868k.m23673e(m3110N8, "requireFragmentManager()");
        Context m3096J6 = m3096J6();
        if (m3096J6 == null || (str = m3096J6.getString(com.module.R$string.login_invaild_text)) == null) {
            str = "";
        }
        Context m3096J62 = m3096J6();
        if (m3096J62 == null || (str2 = m3096J62.getString(com.module.R$string.commmon_refresh_text)) == null) {
            str2 = "";
        }
        C7556b1.m28962j(c7556b1, m3110N8, str, "", str2, true, new e(), false, null, false, 384, null);
    }
}
