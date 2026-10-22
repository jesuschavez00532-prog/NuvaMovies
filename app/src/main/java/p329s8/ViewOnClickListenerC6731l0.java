package p329s8;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0729o;
import androidx.recyclerview.widget.LinearLayoutManager;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.C1466m0;
import com.login.R$color;
import com.login.R$id;
import com.login.R$layout;
import com.login.R$string;
import com.login.R$style;
import com.module.view.AutoCompleteEditView;
import com.module.view.AutoEmailCompleteRecyclerView;
import com.module.view.AutoFocusedTextView;
import com.module.view.LoadingView;
import com.request.result.LoginResult;
import com.taobao.accs.common.Constants;
import com.titans.entity.CdnType;
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
import p201k2.AbstractC5085b;
import p285p8.InterfaceC6240c;
import p285p8.InterfaceC6241d;
import p287pb.AbstractApplicationC6253c;
import p299q8.C6352b;
import p302qc.C6448c;
import p317rb.AbstractC6567a;
import p340t8.C6926a;
import p359ue.AbstractC7167u;
import p400xa.AbstractC7557c;
import p400xa.C7556b1;
import p400xa.C7615w;
import p430z9.C7767e;
import p433zd.AbstractC7786b;

/* renamed from: s8.l0 */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC6731l0 extends C7767e implements InterfaceC6241d, View.OnClickListener, TextWatcher {

    /* renamed from: G0 */
    private View f25859G0;

    /* renamed from: H0 */
    private InterfaceC5660l f25860H0;

    /* renamed from: I0 */
    private final InterfaceC1312h f25861I0;

    /* renamed from: J0 */
    private ViewOnClickListenerC4802v f25862J0;

    /* renamed from: K0 */
    private String f25863K0;

    /* renamed from: L0 */
    private String f25864L0;

    /* renamed from: M0 */
    private String f25865M0;

    /* renamed from: N0 */
    private boolean f25866N0;

    /* renamed from: O0 */
    public Map f25867O0 = new LinkedHashMap();

    /* renamed from: F0 */
    private final String f25858F0 = ViewOnClickListenerC6731l0.class.getSimpleName();

    /* renamed from: s8.l0$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6352b invoke() {
            return new C6352b(ViewOnClickListenerC6731l0.this);
        }
    }

    /* renamed from: s8.l0$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5660l {
        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m26424a(String str) {
            AbstractC5868k.m23674f(str, "it");
            if (ViewOnClickListenerC6731l0.this.m3075C6() != null) {
                AbstractActivityC0712e m3075C6 = ViewOnClickListenerC6731l0.this.m3075C6();
                AbstractC5868k.m23671c(m3075C6);
                if (!m3075C6.isFinishing()) {
                    ((TextView) ViewOnClickListenerC6731l0.this.m26418H9(R$id.tvEmail)).setText(ViewOnClickListenerC6731l0.this.m3175k7(R$string.account_questions_contact, str));
                }
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26424a((String) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: s8.l0$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5660l {
        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m26425a(ArrayList arrayList) {
            AbstractC5868k.m23674f(arrayList, "completeList");
            if (!AbstractC6567a.m25635e(arrayList) && ViewOnClickListenerC6731l0.this.m3075C6() != null) {
                AbstractActivityC0712e m3075C6 = ViewOnClickListenerC6731l0.this.m3075C6();
                AbstractC5868k.m23671c(m3075C6);
                if (!m3075C6.isFinishing()) {
                    ((AutoEmailCompleteRecyclerView) ViewOnClickListenerC6731l0.this.m26418H9(R$id.mRvCompleteList)).setCompleteList(arrayList);
                }
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26425a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: s8.l0$d */
    /* loaded from: classes2.dex */
    public static final class d implements ViewOnClickListenerC4802v.b {

        /* renamed from: b */
        final /* synthetic */ ViewOnClickListenerC4802v f25872b;

        /* renamed from: s8.l0$d$a */
        /* loaded from: classes2.dex */
        public static final class a implements ViewOnClickListenerC4799t0.a {

            /* renamed from: a */
            final /* synthetic */ ViewOnClickListenerC6731l0 f25873a;

            a(ViewOnClickListenerC6731l0 viewOnClickListenerC6731l0) {
                this.f25873a = viewOnClickListenerC6731l0;
            }

            @Override // p161ha.ViewOnClickListenerC4799t0.a
            /* renamed from: a */
            public void mo11875a(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
                AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
                this.f25873a.m26412L9().m25135I0();
            }

            @Override // p161ha.ViewOnClickListenerC4799t0.a
            /* renamed from: b */
            public void mo11876b(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
                AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
            }
        }

        /* renamed from: s8.l0$d$b */
        /* loaded from: classes2.dex */
        public static final class b implements ViewOnClickListenerC4799t0.a {

            /* renamed from: a */
            final /* synthetic */ ViewOnClickListenerC6731l0 f25874a;

            b(ViewOnClickListenerC6731l0 viewOnClickListenerC6731l0) {
                this.f25874a = viewOnClickListenerC6731l0;
            }

            @Override // p161ha.ViewOnClickListenerC4799t0.a
            /* renamed from: a */
            public void mo11875a(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
                AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
                ViewOnClickListenerC4802v viewOnClickListenerC4802v = this.f25874a.f25862J0;
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
            this.f25872b = viewOnClickListenerC4802v;
        }

        @Override // p161ha.ViewOnClickListenerC4802v.b
        /* renamed from: a0 */
        public void mo11902a0() {
            ViewOnClickListenerC4802v viewOnClickListenerC4802v = ViewOnClickListenerC6731l0.this.f25862J0;
            if (viewOnClickListenerC4802v != null) {
                viewOnClickListenerC4802v.mo3279p9();
            }
            ViewOnClickListenerC6731l0.this.m26412L9().m25133F3();
        }

        @Override // p161ha.ViewOnClickListenerC4802v.b
        /* renamed from: b0 */
        public void mo11903b0() {
            String str;
            String str2;
            C7556b1 c7556b1 = C7556b1.f27754a;
            AbstractC0729o m3110N8 = this.f25872b.m3110N8();
            AbstractC5868k.m23673e(m3110N8, "requireFragmentManager()");
            Context m3096J6 = this.f25872b.m3096J6();
            if (m3096J6 == null || (str = m3096J6.getString(com.module.R$string.operation_failed_tips)) == null) {
                str = "";
            }
            Context m3096J62 = this.f25872b.m3096J6();
            if (m3096J62 == null || (str2 = m3096J62.getString(com.module.R$string.commmon_confirm_text)) == null) {
                str2 = "";
            }
            C7556b1.m28962j(c7556b1, m3110N8, str, "", str2, true, new a(ViewOnClickListenerC6731l0.this), false, null, false, 384, null);
        }

        @Override // p161ha.ViewOnClickListenerC4802v.b
        /* renamed from: c0 */
        public void mo11904c0() {
            String str;
            String str2;
            C7556b1 c7556b1 = C7556b1.f27754a;
            AbstractC0729o m3110N8 = this.f25872b.m3110N8();
            AbstractC5868k.m23673e(m3110N8, "requireFragmentManager()");
            Context m3096J6 = this.f25872b.m3096J6();
            if (m3096J6 == null || (str = m3096J6.getString(com.module.R$string.login_invaild_text)) == null) {
                str = "";
            }
            Context m3096J62 = this.f25872b.m3096J6();
            if (m3096J62 == null || (str2 = m3096J62.getString(com.module.R$string.commmon_refresh_text)) == null) {
                str2 = "";
            }
            C7556b1.m28962j(c7556b1, m3110N8, str, "", str2, true, new b(ViewOnClickListenerC6731l0.this), false, null, false, 384, null);
        }
    }

    /* renamed from: s8.l0$e */
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

    public ViewOnClickListenerC6731l0() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(new a());
        this.f25861I0 = m5965b;
        this.f25863K0 = "";
        this.f25864L0 = "";
        this.f25865M0 = "";
        this.f25866N0 = true;
    }

    /* renamed from: K9 */
    private final void m26411K9() {
        mo3278o9();
        C4417e c4417e = C4417e.f19115a;
        AbstractApplicationC6253c.a aVar = AbstractApplicationC6253c.f24484b;
        Context m24887a = aVar.m24887a();
        String m20598h = AbstractC5085b.m20598h(aVar.m24887a());
        AbstractC5868k.m23673e(m20598h, "getPackageName(\n                BaseApp.context)");
        C4417e.m18497f(c4417e, m24887a, m20598h, false, false, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L9 */
    public final C6352b m26412L9() {
        return (C6352b) this.f25861I0.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (ne.AbstractC5868k.m23669a(r4, r1) == false) goto L24;
     */
    /* renamed from: M9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m26413M9(java.lang.String r4) {
        /*
            r3 = this;
            cc.m0 r0 = cc.C1466m0.f5627a
            boolean r1 = r0.m6833F()
            if (r1 != 0) goto L71
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L71
            com.request.result.UserInfo r1 = r0.m6887v()
            if (r1 == 0) goto L71
            java.lang.String r1 = r0.m6878m()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L28
            java.lang.String r1 = r0.m6878m()
            boolean r1 = ne.AbstractC5868k.m23669a(r4, r1)
            if (r1 != 0) goto L6f
        L28:
            com.request.result.UserInfo r1 = r0.m6887v()
            r2 = 0
            if (r1 == 0) goto L34
            java.lang.String r1 = r1.getEmail()
            goto L35
        L34:
            r1 = r2
        L35:
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L4d
            com.request.result.UserInfo r1 = r0.m6887v()
            if (r1 == 0) goto L46
            java.lang.String r1 = r1.getEmail()
            goto L47
        L46:
            r1 = r2
        L47:
            boolean r1 = ne.AbstractC5868k.m23669a(r4, r1)
            if (r1 != 0) goto L6f
        L4d:
            com.request.result.UserInfo r1 = r0.m6887v()
            if (r1 == 0) goto L58
            java.lang.String r1 = r1.getMobile()
            goto L59
        L58:
            r1 = r2
        L59:
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L71
            com.request.result.UserInfo r0 = r0.m6887v()
            if (r0 == 0) goto L69
            java.lang.String r2 = r0.getMobile()
        L69:
            boolean r4 = ne.AbstractC5868k.m23669a(r4, r2)
            if (r4 == 0) goto L71
        L6f:
            r4 = 1
            goto L72
        L71:
            r4 = 0
        L72:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p329s8.ViewOnClickListenerC6731l0.m26413M9(java.lang.String):boolean");
    }

    /* renamed from: N9 */
    private final void m26414N9() {
        CharSequence m27758b0;
        CharSequence m27758b02;
        boolean m27763v;
        boolean m27763v2;
        String str;
        Editable text = ((AutoCompleteEditView) m26418H9(R$id.mEditAccount)).getText();
        AbstractC5868k.m23673e(text, "mEditAccount.text");
        m27758b0 = AbstractC7167u.m27758b0(text);
        this.f25864L0 = m27758b0.toString();
        Editable text2 = ((EditText) m26418H9(R$id.mEditPassword)).getText();
        AbstractC5868k.m23673e(text2, "mEditPassword.text");
        m27758b02 = AbstractC7167u.m27758b0(text2);
        this.f25865M0 = m27758b02.toString();
        if (!TextUtils.isEmpty(this.f25864L0) && !TextUtils.isEmpty(this.f25865M0)) {
            if (AbstractC7557c.m28973a(this.f25864L0) && !AbstractC7557c.m28976d(this.f25865M0)) {
                String string = m3154d7().getString(R$string.personal_password_format);
                AbstractC5868k.m23673e(string, "resources.getString(R.st…personal_password_format)");
                m26417U9(string, false);
                return;
            }
            if (AbstractC7557c.m28976d(this.f25865M0)) {
                m27763v = AbstractC7167u.m27763v(this.f25864L0, "@", false, 2, null);
                if (m27763v && !AbstractC7557c.m28974b(this.f25864L0)) {
                    String string2 = m3154d7().getString(R$string.account_incorrect_email);
                    AbstractC5868k.m23673e(string2, "resources.getString(R.st….account_incorrect_email)");
                    m26417U9(string2, false);
                    return;
                }
                if (m26413M9(this.f25864L0)) {
                    String string3 = m3154d7().getString(R$string.account_already_login);
                    AbstractC5868k.m23673e(string3, "resources.getString(R.st…ng.account_already_login)");
                    m26417U9(string3, false);
                    return;
                }
                if (!AbstractC7557c.m28973a(this.f25864L0)) {
                    m27763v2 = AbstractC7167u.m27763v(this.f25864L0, "@", false, 2, null);
                    if (m27763v2) {
                        str = "2";
                    } else {
                        str = "1";
                    }
                } else {
                    str = CdnType.DIGITAL_TYPE_PEERSTAR;
                }
                String str2 = str;
                String mo19949Z = C4842a.f20329a.m19920a().mo19949Z(this.f25865M0);
                C1466m0.f5627a.m6851X(this.f25864L0);
                InterfaceC6240c.a.m24847a(m26412L9(), str2, this.f25864L0, mo19949Z, null, null, null, 56, null);
                m26416T9(true);
                return;
            }
            String string4 = m3154d7().getString(R$string.personal_password_format);
            AbstractC5868k.m23673e(string4, "resources.getString(R.st…personal_password_format)");
            m26417U9(string4, false);
            return;
        }
        String string5 = m3154d7().getString(R$string.account_incorrect_account_or_password);
        AbstractC5868k.m23673e(string5, "resources.getString(R.st…rect_account_or_password)");
        m26417U9(string5, false);
    }

    /* renamed from: O9 */
    private final void m26415O9() {
        C6926a c6926a = C6926a.f26260a;
        AbstractC0729o m3093I6 = m3093I6();
        AbstractC5868k.m23673e(m3093I6, "childFragmentManager");
        c6926a.m26908s(m3093I6, false);
    }

    /* renamed from: T9 */
    private final void m26416T9(boolean z10) {
        int i10;
        LoadingView loadingView = (LoadingView) m26418H9(R$id.mLoadingView);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        loadingView.setVisibility(i10);
        ((Button) m26418H9(R$id.mBtnLogin)).setEnabled(!z10);
        ((TextView) m26418H9(R$id.mTextRetrieve)).setEnabled(!z10);
        ((AutoCompleteEditView) m26418H9(R$id.mEditAccount)).setEnabled(!z10);
        ((EditText) m26418H9(R$id.mEditPassword)).setEnabled(!z10);
    }

    /* renamed from: U9 */
    private final void m26417U9(String str, boolean z10) {
        Resources m3154d7;
        int i10;
        int i11 = R$id.mTextNotify;
        ((AutoFocusedTextView) m26418H9(i11)).setText(str);
        AutoFocusedTextView autoFocusedTextView = (AutoFocusedTextView) m26418H9(i11);
        if (z10) {
            m3154d7 = m3154d7();
            i10 = R$color.color_339900;
        } else {
            m3154d7 = m3154d7();
            i10 = R$color.color_ffaa00;
        }
        autoFocusedTextView.setTextColor(m3154d7.getColor(i10));
        ((AutoFocusedTextView) m26418H9(i11)).setVisibility(0);
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f25867O0.clear();
    }

    /* renamed from: H9 */
    public View m26418H9(int i10) {
        View findViewById;
        Map map = this.f25867O0;
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
        m26416T9(false);
        InterfaceC5660l interfaceC5660l = this.f25860H0;
        if (interfaceC5660l != null) {
            interfaceC5660l.mo542f(loginResult);
        }
        mo3278o9();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.dialog_login, viewGroup, false);
        this.f25859G0 = inflate;
        return inflate;
    }

    /* renamed from: P9 */
    public final void m26419P9(InterfaceC5660l interfaceC5660l) {
        this.f25860H0 = interfaceC5660l;
    }

    /* renamed from: Q9 */
    public final void m26420Q9(boolean z10) {
        this.f25866N0 = z10;
    }

    /* renamed from: R9 */
    public final void m26421R9(String str) {
        AbstractC5868k.m23674f(str, Constants.KEY_ERROR_CODE);
        this.f25863K0 = str;
    }

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo16979F9();
    }

    /* renamed from: S9 */
    public final void m26422S9() {
        ((Button) m26418H9(R$id.mBtnLogin)).setOnClickListener(this);
        ((TextView) m26418H9(R$id.mTextRetrieve)).setOnClickListener(this);
        ((AutoCompleteEditView) m26418H9(R$id.mEditAccount)).addTextChangedListener(this);
        int i10 = R$id.mEditPassword;
        ((EditText) m26418H9(i10)).addTextChangedListener(this);
        ((EditText) m26418H9(i10)).setTypeface(Typeface.DEFAULT);
        ((EditText) m26418H9(i10)).setTransformationMethod(new PasswordTransformationMethod());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
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
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        if (r4.equals("aaa100018") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (r4.equals("aaa100017") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
    
        if (r4.equals("portal100024") == false) goto L35;
     */
    @Override // p285p8.InterfaceC6241d
    /* renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo24850f0(boolean r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r3 = "errCode"
            ne.AbstractC5868k.m23674f(r4, r3)
            r3 = 0
            r2.m26416T9(r3)
            int r0 = r4.hashCode()
            java.lang.String r1 = "resources.getString(R.st…rect_account_or_password)"
            switch(r0) {
                case -396103091: goto La9;
                case -367474005: goto L8d;
                case -338366941: goto L73;
                case -338366906: goto L6a;
                case -338366905: goto L61;
                case -338366880: goto L45;
                case -338366661: goto L32;
                case 68379: goto L14;
                default: goto L12;
            }
        L12:
            goto Lc5
        L14:
            java.lang.String r0 = "EA7"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L1e
            goto Lc5
        L1e:
            android.content.res.Resources r4 = r2.m3154d7()
            int r0 = com.login.R$string.account_login_timeout
            java.lang.String r4 = r4.getString(r0)
            java.lang.String r0 = "resources.getString(R.st…ng.account_login_timeout)"
            ne.AbstractC5868k.m23673e(r4, r0)
            r2.m26417U9(r4, r3)
            goto Ld7
        L32:
            java.lang.String r0 = "aaa100094"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L3c
            goto Lc5
        L3c:
            q8.b r3 = r2.m26412L9()
            r3.m25136Y0()
            goto Ld7
        L45:
            java.lang.String r0 = "aaa100022"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L4f
            goto Lc5
        L4f:
            android.content.res.Resources r4 = r2.m3154d7()
            int r0 = com.login.R$string.account_incorrect_account_or_password
            java.lang.String r4 = r4.getString(r0)
            ne.AbstractC5868k.m23673e(r4, r1)
            r2.m26417U9(r4, r3)
            goto Ld7
        L61:
            java.lang.String r0 = "aaa100018"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lb2
            goto Lc5
        L6a:
            java.lang.String r0 = "aaa100017"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lb2
            goto Lc5
        L73:
            java.lang.String r0 = "aaa100003"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L7c
            goto Lc5
        L7c:
            android.content.res.Resources r4 = r2.m3154d7()
            int r0 = com.login.R$string.account_incorrect_account_or_password
            java.lang.String r4 = r4.getString(r0)
            ne.AbstractC5868k.m23673e(r4, r1)
            r2.m26417U9(r4, r3)
            goto Ld7
        L8d:
            java.lang.String r0 = "portal200001"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L96
            goto Lc5
        L96:
            android.content.res.Resources r4 = r2.m3154d7()
            int r0 = com.login.R$string.account_version_disable
            java.lang.String r4 = r4.getString(r0)
            java.lang.String r0 = "resources.getString(R.st….account_version_disable)"
            ne.AbstractC5868k.m23673e(r4, r0)
            r2.m26417U9(r4, r3)
            goto Ld7
        La9:
            java.lang.String r0 = "portal100024"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Lb2
            goto Lc5
        Lb2:
            android.content.res.Resources r4 = r2.m3154d7()
            int r0 = com.login.R$string.account_blacklist
            java.lang.String r4 = r4.getString(r0)
            java.lang.String r0 = "resources.getString(R.string.account_blacklist)"
            ne.AbstractC5868k.m23673e(r4, r0)
            r2.m26417U9(r4, r3)
            goto Ld7
        Lc5:
            android.content.res.Resources r4 = r2.m3154d7()
            int r0 = com.login.R$string.account_login_failed
            java.lang.String r4 = r4.getString(r0)
            java.lang.String r0 = "resources.getString(R.string.account_login_failed)"
            ne.AbstractC5868k.m23673e(r4, r0)
            r2.m26417U9(r4, r3)
        Ld7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p329s8.ViewOnClickListenerC6731l0.mo24850f0(boolean, java.lang.String):void");
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        Window window;
        super.mo3164g8();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setLayout(AbstractC7786b.m30166j(892), AbstractC7786b.m30163g(632));
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        Window window;
        Window window2;
        AbstractC5868k.m23674f(view, "view");
        m26422S9();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window2 = m3280r9.getWindow()) != null) {
            window2.setSoftInputMode(2);
        }
        super.mo3176k8(view, bundle);
        C1466m0 c1466m0 = C1466m0.f5627a;
        boolean z10 = true;
        if (!TextUtils.isEmpty(c1466m0.m6870i())) {
            int i10 = R$id.mTextDeviceId;
            ((TextView) m26418H9(i10)).setVisibility(0);
            TextView textView = (TextView) m26418H9(i10);
            C5881x c5881x = C5881x.f23415a;
            String m3172j7 = m3172j7(R$string.account_device_id);
            AbstractC5868k.m23673e(m3172j7, "getString(R.string.account_device_id)");
            String format = String.format(m3172j7, Arrays.copyOf(new Object[]{c1466m0.m6870i()}, 1));
            AbstractC5868k.m23673e(format, "format(format, *args)");
            textView.setText(format);
        } else {
            ((TextView) m26418H9(R$id.mTextDeviceId)).setVisibility(8);
        }
        C7615w c7615w = C7615w.f27995a;
        C7615w.m29301w(c7615w, new b(), null, null, 6, null);
        int i11 = R$id.mEditAccount;
        ((AutoCompleteEditView) m26418H9(i11)).setText("");
        Context m3096J6 = m3096J6();
        if (m3096J6 != null) {
            int i12 = R$id.mRvCompleteList;
            ((AutoEmailCompleteRecyclerView) m26418H9(i12)).setLayoutManager(new LinearLayoutManager(m3096J6));
            AutoEmailCompleteRecyclerView autoEmailCompleteRecyclerView = (AutoEmailCompleteRecyclerView) m26418H9(i12);
            Dialog m3280r92 = m3280r9();
            if (m3280r92 != null) {
                window = m3280r92.getWindow();
            } else {
                window = null;
            }
            autoEmailCompleteRecyclerView.m12066d(window, (AutoCompleteEditView) m26418H9(i11));
            c7615w.m29311S(m3096J6, new c());
        }
        if (this.f25863K0.length() <= 0) {
            z10 = false;
        }
        if (z10) {
            mo24850f0(false, this.f25863K0);
        }
    }

    @Override // p285p8.InterfaceC6241d
    /* renamed from: l */
    public void mo24851l(List list, String str, boolean z10) {
        AbstractC5868k.m23674f(list, "deviceList");
        AbstractC5868k.m23674f(str, "tempToken");
        if (z10) {
            ViewOnClickListenerC4802v viewOnClickListenerC4802v = this.f25862J0;
            if (viewOnClickListenerC4802v != null) {
                viewOnClickListenerC4802v.m19847Q9(list);
                return;
            }
            return;
        }
        ViewOnClickListenerC4802v.a aVar = ViewOnClickListenerC4802v.f20235P0;
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        ViewOnClickListenerC4802v m19852a = aVar.m19852a(m3096J6, list, str, this.f25866N0);
        m19852a.m19849V9(new d(m19852a));
        this.f25862J0 = m19852a;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(dialogInterface, "dialog");
        if (this.f25866N0) {
            mo3278o9();
        } else {
            m26411K9();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC5868k.m23674f(view, "v");
        int id2 = view.getId();
        if (id2 == R$id.mBtnLogin) {
            m26414N9();
        } else if (id2 == R$id.mTextRetrieve) {
            m26415O9();
        }
        this.f25863K0 = "";
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (AbstractC6567a.m25634d(this.f25863K0)) {
            ((AutoFocusedTextView) m26418H9(R$id.mTextNotify)).setText("");
        }
    }

    @Override // p285p8.InterfaceC6241d
    /* renamed from: v */
    public void mo24852v(boolean z10) {
        String str;
        String str2;
        ViewOnClickListenerC4802v viewOnClickListenerC4802v;
        if (z10 && (viewOnClickListenerC4802v = this.f25862J0) != null) {
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
