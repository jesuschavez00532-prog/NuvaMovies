package p329s8;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0729o;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.AbstractC1459j;
import cc.C1466m0;
import com.login.R$color;
import com.login.R$drawable;
import com.login.R$id;
import com.login.R$layout;
import com.login.R$mipmap;
import com.login.R$string;
import com.login.R$style;
import com.module.childlock.view.MarqueTextView;
import com.module.event.CloseDialogEvent;
import com.module.view.AutoFocusedTextView;
import com.module.view.CustomImageTextView;
import com.module.view.LoadingView;
import com.module.view.NationSelectView;
import com.request.result.LoginResult;
import com.zhy.autolayout.AutoLinearLayout;
import ga.C4417e;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import la.InterfaceC5537e;
import mc.C5634i;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import na.C5833d;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p132fa.C4300d;
import p161ha.ViewOnClickListenerC4799t0;
import p161ha.ViewOnClickListenerC4802v;
import p170i2.C4842a;
import p185j2.C4982a;
import p201k2.AbstractC5085b;
import p217l2.InterfaceC5342c;
import p285p8.InterfaceC6240c;
import p285p8.InterfaceC6241d;
import p287pb.AbstractApplicationC6253c;
import p299q8.C6352b;
import p302qc.C6448c;
import p340t8.C6926a;
import p348u2.AbstractC7028e;
import p359ue.AbstractC7167u;
import p400xa.AbstractC7557c;
import p400xa.C7556b1;
import p400xa.C7559c1;
import p400xa.C7615w;
import p415y9.AbstractApplicationC7689d;
import p430z9.C7767e;
import p433zd.AbstractC7786b;
import va.InterfaceC7251a;
import ye.C7709c;

/* renamed from: s8.u0 */
/* loaded from: classes2.dex */
public final class C6758u0 extends C7767e implements InterfaceC6241d, InterfaceC5537e {

    /* renamed from: F0 */
    private ViewOnClickListenerC4802v f25984F0;

    /* renamed from: G0 */
    private View f25985G0;

    /* renamed from: H0 */
    private InterfaceC5660l f25986H0;

    /* renamed from: N0 */
    private boolean f25992N0;

    /* renamed from: O0 */
    private final InterfaceC1312h f25993O0;

    /* renamed from: P0 */
    private final InterfaceC1312h f25994P0;

    /* renamed from: Q0 */
    public Map f25995Q0 = new LinkedHashMap();

    /* renamed from: I0 */
    private boolean f25987I0 = true;

    /* renamed from: J0 */
    private String f25988J0 = "Brazil";

    /* renamed from: K0 */
    private String f25989K0 = "55";

    /* renamed from: L0 */
    private String f25990L0 = "";

    /* renamed from: M0 */
    private String f25991M0 = "";

    /* renamed from: s8.u0$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5833d invoke() {
            C6758u0 c6758u0 = C6758u0.this;
            Context m3096J6 = c6758u0.m3096J6();
            AbstractC5868k.m23671c(m3096J6);
            return new C5833d(c6758u0, m3096J6);
        }
    }

    /* renamed from: s8.u0$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6352b invoke() {
            return new C6352b(C6758u0.this);
        }
    }

    /* renamed from: s8.u0$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5660l {
        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m26572a(String str) {
            AbstractC5868k.m23674f(str, "it");
            if (C6758u0.this.m3075C6() != null) {
                AbstractActivityC0712e m3075C6 = C6758u0.this.m3075C6();
                AbstractC5868k.m23671c(m3075C6);
                if (!m3075C6.isFinishing()) {
                    ((AutoFocusedTextView) C6758u0.this.m26564M9(R$id.mTextContact)).setText(C6758u0.this.m3175k7(R$string.account_questions_contact, str));
                }
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26572a((String) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: s8.u0$d */
    /* loaded from: classes2.dex */
    public static final class d implements NationSelectView.InterfaceC3018b {
        d() {
        }

        @Override // com.module.view.NationSelectView.InterfaceC3018b
        /* renamed from: a */
        public void mo12230a(int i10, String str, String str2) {
            AbstractC5868k.m23674f(str, "nation");
            AbstractC5868k.m23674f(str2, "nationCode");
            C6758u0.this.f25988J0 = str;
            C6758u0.this.f25989K0 = str2;
            ((CustomImageTextView) C6758u0.this.m26564M9(R$id.mTextNationCode)).setViewText(str2);
            C7559c1 c7559c1 = C7559c1.f27762a;
            EditText editText = (EditText) C6758u0.this.m26564M9(R$id.mEditPhoneNum);
            AbstractC5868k.m23673e(editText, "mEditPhoneNum");
            c7559c1.m28990i(editText, C6758u0.this.f25988J0);
        }
    }

    /* renamed from: s8.u0$e */
    /* loaded from: classes2.dex */
    public static final class e implements TextWatcher {
        e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C7559c1 c7559c1 = C7559c1.f27762a;
            EditText editText = (EditText) C6758u0.this.m26564M9(R$id.mEditPhoneNum);
            AbstractC5868k.m23673e(editText, "mEditPhoneNum");
            c7559c1.m28984a(editText, this, C6758u0.this.f25988J0);
            ((AutoLinearLayout) C6758u0.this.m26564M9(R$id.mLayoutNotify)).setVisibility(8);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* renamed from: s8.u0$f */
    /* loaded from: classes2.dex */
    public static final class f implements ViewOnClickListenerC4802v.b {

        /* renamed from: b */
        final /* synthetic */ ViewOnClickListenerC4802v f26002b;

        /* renamed from: s8.u0$f$a */
        /* loaded from: classes2.dex */
        public static final class a implements ViewOnClickListenerC4799t0.a {

            /* renamed from: a */
            final /* synthetic */ C6758u0 f26003a;

            a(C6758u0 c6758u0) {
                this.f26003a = c6758u0;
            }

            @Override // p161ha.ViewOnClickListenerC4799t0.a
            /* renamed from: a */
            public void mo11875a(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
                AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
                this.f26003a.m26553U9().m25135I0();
            }

            @Override // p161ha.ViewOnClickListenerC4799t0.a
            /* renamed from: b */
            public void mo11876b(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
                AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
            }
        }

        /* renamed from: s8.u0$f$b */
        /* loaded from: classes2.dex */
        public static final class b implements ViewOnClickListenerC4799t0.a {

            /* renamed from: a */
            final /* synthetic */ C6758u0 f26004a;

            b(C6758u0 c6758u0) {
                this.f26004a = c6758u0;
            }

            @Override // p161ha.ViewOnClickListenerC4799t0.a
            /* renamed from: a */
            public void mo11875a(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
                AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
                ViewOnClickListenerC4802v viewOnClickListenerC4802v = this.f26004a.f25984F0;
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

        f(ViewOnClickListenerC4802v viewOnClickListenerC4802v) {
            this.f26002b = viewOnClickListenerC4802v;
        }

        @Override // p161ha.ViewOnClickListenerC4802v.b
        /* renamed from: a0 */
        public void mo11902a0() {
            ViewOnClickListenerC4802v viewOnClickListenerC4802v = C6758u0.this.f25984F0;
            if (viewOnClickListenerC4802v != null) {
                viewOnClickListenerC4802v.mo3279p9();
            }
            C6758u0.this.m26553U9().m25133F3();
        }

        @Override // p161ha.ViewOnClickListenerC4802v.b
        /* renamed from: b0 */
        public void mo11903b0() {
            String str;
            String str2;
            C7556b1 c7556b1 = C7556b1.f27754a;
            AbstractC0729o m3110N8 = this.f26002b.m3110N8();
            AbstractC5868k.m23673e(m3110N8, "requireFragmentManager()");
            Context m3096J6 = this.f26002b.m3096J6();
            if (m3096J6 == null || (str = m3096J6.getString(com.module.R$string.operation_failed_tips)) == null) {
                str = "";
            }
            Context m3096J62 = this.f26002b.m3096J6();
            if (m3096J62 == null || (str2 = m3096J62.getString(com.module.R$string.commmon_confirm_text)) == null) {
                str2 = "";
            }
            C7556b1.m28962j(c7556b1, m3110N8, str, "", str2, true, new a(C6758u0.this), false, null, false, 384, null);
        }

        @Override // p161ha.ViewOnClickListenerC4802v.b
        /* renamed from: c0 */
        public void mo11904c0() {
            String str;
            String str2;
            C7556b1 c7556b1 = C7556b1.f27754a;
            AbstractC0729o m3110N8 = this.f26002b.m3110N8();
            AbstractC5868k.m23673e(m3110N8, "requireFragmentManager()");
            Context m3096J6 = this.f26002b.m3096J6();
            if (m3096J6 == null || (str = m3096J6.getString(com.module.R$string.login_invaild_text)) == null) {
                str = "";
            }
            Context m3096J62 = this.f26002b.m3096J6();
            if (m3096J62 == null || (str2 = m3096J62.getString(com.module.R$string.commmon_refresh_text)) == null) {
                str2 = "";
            }
            C7556b1.m28962j(c7556b1, m3110N8, str, "", str2, true, new b(C6758u0.this), false, null, false, 384, null);
        }
    }

    /* renamed from: s8.u0$g */
    /* loaded from: classes2.dex */
    public static final class g implements ViewOnClickListenerC4799t0.a {
        g() {
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

    public C6758u0() {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        m5965b = AbstractC1314j.m5965b(new a());
        this.f25993O0 = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new b());
        this.f25994P0 = m5965b2;
    }

    /* renamed from: S9 */
    private final void m26551S9() {
        mo3278o9();
        AbstractC7028e.m27115a("pld");
        C4417e c4417e = C4417e.f19115a;
        Context m24887a = AbstractApplicationC6253c.f24484b.m24887a();
        String m20598h = AbstractC5085b.m20598h(m3096J6());
        AbstractC5868k.m23673e(m20598h, "getPackageName(context)");
        C4417e.m18497f(c4417e, m24887a, m20598h, false, false, 12, null);
    }

    /* renamed from: T9 */
    private final C5833d m26552T9() {
        return (C5833d) this.f25993O0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U9 */
    public final C6352b m26553U9() {
        return (C6352b) this.f25994P0.getValue();
    }

    /* renamed from: W9 */
    private final void m26554W9() {
        C6926a c6926a = C6926a.f26260a;
        AbstractC0729o m3093I6 = m3093I6();
        AbstractC5868k.m23673e(m3093I6, "childFragmentManager");
        c6926a.m26908s(m3093I6, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aa */
    public static final void m26555aa(C6758u0 c6758u0, View view) {
        AbstractC5868k.m23674f(c6758u0, "this$0");
        c6758u0.f25992N0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ba */
    public static final void m26556ba(C6758u0 c6758u0, View view) {
        CharSequence m27758b0;
        CharSequence m27758b02;
        AbstractC5868k.m23674f(c6758u0, "this$0");
        Editable text = ((EditText) c6758u0.m26564M9(R$id.mEditPhoneNum)).getText();
        AbstractC5868k.m23673e(text, "mEditPhoneNum.text");
        m27758b0 = AbstractC7167u.m27758b0(text);
        c6758u0.f25990L0 = m27758b0.toString();
        Editable text2 = ((EditText) c6758u0.m26564M9(R$id.mEditPassword)).getText();
        AbstractC5868k.m23673e(text2, "mEditPassword.text");
        m27758b02 = AbstractC7167u.m27758b0(text2);
        c6758u0.f25991M0 = m27758b02.toString();
        if (!c6758u0.m26563ha()) {
            c6758u0.m26561ga(R$string.phone_mumber_invalid, true);
            return;
        }
        if (!AbstractC7557c.m28976d(c6758u0.f25991M0)) {
            c6758u0.m26561ga(R$string.personal_password_format, true);
            return;
        }
        String m28987e = C7559c1.f27762a.m28987e(c6758u0.f25990L0, c6758u0.f25988J0);
        String mo19949Z = C4842a.f20329a.m19920a().mo19949Z(c6758u0.f25991M0);
        C1466m0.f5627a.m6851X(c6758u0.f25990L0);
        InterfaceC6240c.a.m24847a(c6758u0.m26553U9(), "3", m28987e, mo19949Z, c6758u0.f25989K0, null, null, 48, null);
        c6758u0.m26560fa(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ca */
    public static final void m26557ca(C6758u0 c6758u0, View view) {
        AbstractC5868k.m23674f(c6758u0, "this$0");
        c6758u0.m26554W9();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: da */
    public static final void m26558da(C6758u0 c6758u0, View view) {
        AbstractC5868k.m23674f(c6758u0, "this$0");
        InterfaceC7251a interfaceC7251a = (InterfaceC7251a) C5634i.m22844e(InterfaceC7251a.class, new Object[0]);
        if (interfaceC7251a != null) {
            AbstractC0729o m3119R6 = c6758u0.m3119R6();
            AbstractC5868k.m23671c(m3119R6);
            interfaceC7251a.mo25622b(m3119R6, c6758u0.f25987I0, "", c6758u0.f25986H0);
        }
        c6758u0.mo3278o9();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ea */
    public static final void m26559ea(C6758u0 c6758u0, View view) {
        AbstractC5868k.m23674f(c6758u0, "this$0");
        InterfaceC5342c interfaceC5342c = (InterfaceC5342c) C5634i.m22844e(InterfaceC5342c.class, new Object[0]);
        if (interfaceC5342c != null) {
            AbstractC0729o m3119R6 = c6758u0.m3119R6();
            AbstractC5868k.m23671c(m3119R6);
            interfaceC5342c.mo21622i(m3119R6, c6758u0.f25987I0, c6758u0.f25986H0);
        }
        c6758u0.mo3278o9();
    }

    /* renamed from: fa */
    private final void m26560fa(boolean z10) {
        int i10;
        LoadingView loadingView = (LoadingView) m26564M9(R$id.mLoadingView);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        loadingView.setVisibility(i10);
        ((TextView) m26564M9(R$id.mTextLogin)).setEnabled(!z10);
        ((TextView) m26564M9(R$id.mTextForgetPwd)).setEnabled(!z10);
        ((EditText) m26564M9(R$id.mEditPhoneNum)).setEnabled(!z10);
        ((EditText) m26564M9(R$id.mEditPassword)).setEnabled(!z10);
        ((NationSelectView) m26564M9(R$id.mNationSelectView)).setEnabled(!z10);
        ((ImageView) m26564M9(R$id.mImageAccountLogin)).setEnabled(!z10);
        ((ImageView) m26564M9(R$id.mImageSMSLogin)).setEnabled(!z10);
    }

    /* renamed from: ga */
    private final void m26561ga(int i10, boolean z10) {
        int i11 = R$id.mLayoutNotify;
        ((AutoLinearLayout) m26564M9(i11)).setVisibility(0);
        int i12 = R$id.mTextNotify;
        ((MarqueTextView) m26564M9(i12)).setText(i10);
        if (z10) {
            ((AutoLinearLayout) m26564M9(i11)).setBackgroundResource(R$drawable.bg_notify_error);
            ((ImageView) m26564M9(R$id.mImageNotify)).setImageResource(R$mipmap.icon_notify_error);
            MarqueTextView marqueTextView = (MarqueTextView) m26564M9(i12);
            Context m3096J6 = m3096J6();
            AbstractC5868k.m23671c(m3096J6);
            marqueTextView.setTextColor(m3096J6.getResources().getColor(R$color.color_333333));
            return;
        }
        ((AutoLinearLayout) m26564M9(i11)).setBackgroundResource(R$drawable.bg_notify_success);
        ((ImageView) m26564M9(R$id.mImageNotify)).setImageResource(R$drawable.icon_notify_success);
        MarqueTextView marqueTextView2 = (MarqueTextView) m26564M9(i12);
        Context m3096J62 = m3096J6();
        AbstractC5868k.m23671c(m3096J62);
        marqueTextView2.setTextColor(m3096J62.getResources().getColor(R$color.color_ffffff));
    }

    /* renamed from: h */
    private final void m26562h() {
        String str;
        boolean z10;
        C4300d c4300d = C4300d.f18678a;
        Pair m18021a = c4300d.m18021a();
        String str2 = null;
        if (m18021a != null) {
            str = (String) m18021a.first;
        } else {
            str = null;
        }
        boolean z11 = false;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            Pair m18021a2 = c4300d.m18021a();
            if (m18021a2 != null) {
                str2 = (String) m18021a2.first;
            }
            if (str2 == null || str2.length() == 0) {
                z11 = true;
            }
            if (!z11) {
                Pair m18021a3 = c4300d.m18021a();
                AbstractC5868k.m23671c(m18021a3);
                Object obj = m18021a3.first;
                AbstractC5868k.m23673e(obj, "Pref.areaInfo!!.first");
                this.f25988J0 = (String) obj;
                Pair m18021a4 = c4300d.m18021a();
                AbstractC5868k.m23671c(m18021a4);
                Object obj2 = m18021a4.second;
                AbstractC5868k.m23673e(obj2, "Pref.areaInfo!!.second");
                this.f25989K0 = (String) obj2;
                ((NationSelectView) m26564M9(R$id.mNationSelectView)).setNationName(this.f25988J0);
                ((CustomImageTextView) m26564M9(R$id.mTextNationCode)).setViewText(this.f25989K0);
                return;
            }
        }
        C5833d m26552T9 = m26552T9();
        if (m26552T9 != null) {
            m26552T9.m23594Y0();
        }
    }

    /* renamed from: ha */
    private final boolean m26563ha() {
        CharSequence m27758b0;
        CharSequence m27758b02;
        int i10 = R$id.mEditPhoneNum;
        m27758b0 = AbstractC7167u.m27758b0(((EditText) m26564M9(i10)).getText().toString());
        if (TextUtils.isEmpty(m27758b0.toString())) {
            return false;
        }
        C7559c1 c7559c1 = C7559c1.f27762a;
        m27758b02 = AbstractC7167u.m27758b0(((EditText) m26564M9(i10)).getText().toString());
        String m28987e = c7559c1.m28987e(m27758b02.toString(), this.f25988J0);
        if (TextUtils.isEmpty(m28987e) || !c7559c1.m28991j(m28987e, this.f25988J0)) {
            return false;
        }
        return true;
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f25995Q0.clear();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.InputPasswordDialog);
    }

    /* renamed from: M9 */
    public View m26564M9(int i10) {
        View findViewById;
        Map map = this.f25995Q0;
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

    @Override // p285p8.InterfaceC6241d
    /* renamed from: N */
    public void mo24848N(boolean z10, LoginResult loginResult) {
        m26560fa(false);
        InterfaceC5660l interfaceC5660l = this.f25986H0;
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
        View inflate = layoutInflater.inflate(R$layout.dialog_phone_login, viewGroup, false);
        this.f25985G0 = inflate;
        return inflate;
    }

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo16979F9();
    }

    /* renamed from: V9 */
    public final void m26565V9() {
        ((AutoLinearLayout) m26564M9(R$id.mLayoutNotify)).setVisibility(8);
    }

    /* renamed from: W0 */
    public final void m26566W0() {
        if (AbstractC5868k.m23669a(C1466m0.f5627a.m6860d(), "")) {
            String str = (String) C4982a.f20721a.m20333a(AbstractApplicationC7689d.f28135d.m29494a(), "user_account_PHONE", "");
            if (!AbstractC5868k.m23669a(str, "")) {
                String m6797b = AbstractC1459j.m6797b(str, C4842a.f20329a.m19920a().mo19967p());
                int i10 = R$id.mEditPhoneNum;
                ((EditText) m26564M9(i10)).setText(m6797b);
                ((EditText) m26564M9(i10)).setSelection(((EditText) m26564M9(i10)).getText().length());
            }
        }
    }

    /* renamed from: X9 */
    public final void m26567X9(InterfaceC5660l interfaceC5660l) {
        this.f25986H0 = interfaceC5660l;
    }

    /* renamed from: Y9 */
    public final void m26568Y9(boolean z10) {
        this.f25987I0 = z10;
    }

    /* renamed from: Z9 */
    public final void m26569Z9() {
        int i10 = R$id.mEditPassword;
        ((EditText) m26564M9(i10)).setTypeface(Typeface.DEFAULT);
        ((EditText) m26564M9(i10)).setTransformationMethod(new PasswordTransformationMethod());
        int i11 = R$id.mNationSelectView;
        ((NationSelectView) m26564M9(i11)).setOnClickCallback(new View.OnClickListener() { // from class: s8.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6758u0.m26555aa(C6758u0.this, view);
            }
        });
        ((NationSelectView) m26564M9(i11)).setOnItemClickListener(new d());
        ((TextView) m26564M9(R$id.mTextLogin)).setOnClickListener(new View.OnClickListener() { // from class: s8.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6758u0.m26556ba(C6758u0.this, view);
            }
        });
        ((TextView) m26564M9(R$id.mTextForgetPwd)).setOnClickListener(new View.OnClickListener() { // from class: s8.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6758u0.m26557ca(C6758u0.this, view);
            }
        });
        ((ImageView) m26564M9(R$id.mImageAccountLogin)).setOnClickListener(new View.OnClickListener() { // from class: s8.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6758u0.m26558da(C6758u0.this, view);
            }
        });
        ((ImageView) m26564M9(R$id.mImageSMSLogin)).setOnClickListener(new View.OnClickListener() { // from class: s8.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6758u0.m26559ea(C6758u0.this, view);
            }
        });
        ((EditText) m26564M9(R$id.mEditPhoneNum)).addTextChangedListener(new e());
    }

    @Override // la.InterfaceC5537e
    /* renamed from: a4 */
    public void mo22453a4(String str, String str2) {
        boolean z10;
        CharSequence m27758b0;
        AbstractC5868k.m23674f(str, "nationCode");
        AbstractC5868k.m23674f(str2, "nation");
        if (str2.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.f25992N0) {
            m27758b0 = AbstractC7167u.m27758b0(((EditText) m26564M9(R$id.mEditPhoneNum)).getText().toString());
            if (TextUtils.isEmpty(m27758b0.toString())) {
                this.f25989K0 = str;
                this.f25988J0 = str2;
                ((NationSelectView) m26564M9(R$id.mNationSelectView)).setNationName(this.f25988J0);
                ((CustomImageTextView) m26564M9(R$id.mTextNationCode)).setViewText(this.f25989K0);
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
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r3.equals("aaa100018") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r3.equals("aaa100017") == false) goto L36;
     */
    @Override // p285p8.InterfaceC6241d
    /* renamed from: f0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo24850f0(boolean r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r2 = "errCode"
            ne.AbstractC5868k.m23674f(r3, r2)
            r2 = 0
            r1.m26560fa(r2)
            int r2 = r3.hashCode()
            r0 = 1
            switch(r2) {
                case -396103091: goto L7a;
                case -367474005: goto L6b;
                case -338366941: goto L5c;
                case -338366906: goto L4d;
                case -338366905: goto L44;
                case -338366880: goto L35;
                case -338366661: goto L24;
                case 68379: goto L13;
                default: goto L11;
            }
        L11:
            goto L89
        L13:
            java.lang.String r2 = "EA7"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1d
            goto L89
        L1d:
            int r2 = com.login.R$string.account_login_timeout
            r1.m26561ga(r2, r0)
            goto L8e
        L24:
            java.lang.String r2 = "aaa100094"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L2d
            goto L89
        L2d:
            q8.b r2 = r1.m26553U9()
            r2.m25136Y0()
            goto L8e
        L35:
            java.lang.String r2 = "aaa100022"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L3e
            goto L89
        L3e:
            int r2 = com.login.R$string.account_incorrect_account_or_password
            r1.m26561ga(r2, r0)
            goto L8e
        L44:
            java.lang.String r2 = "aaa100018"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L56
            goto L89
        L4d:
            java.lang.String r2 = "aaa100017"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L56
            goto L89
        L56:
            int r2 = com.login.R$string.account_area_invalid
            r1.m26561ga(r2, r0)
            goto L8e
        L5c:
            java.lang.String r2 = "aaa100003"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L65
            goto L89
        L65:
            int r2 = com.login.R$string.phone_number_not_exitst
            r1.m26561ga(r2, r0)
            goto L8e
        L6b:
            java.lang.String r2 = "portal200001"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L74
            goto L89
        L74:
            int r2 = com.login.R$string.account_version_disable
            r1.m26561ga(r2, r0)
            goto L8e
        L7a:
            java.lang.String r2 = "portal100024"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L83
            goto L89
        L83:
            int r2 = com.login.R$string.account_cur_column_invisible
            r1.m26561ga(r2, r0)
            goto L8e
        L89:
            int r2 = com.login.R$string.account_login_failed
            r1.m26561ga(r2, r0)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p329s8.C6758u0.mo24850f0(boolean, java.lang.String):void");
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
        super.mo3176k8(view, bundle);
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setSoftInputMode(2);
        }
        m26565V9();
        m26569Z9();
        m26562h();
        C7615w.m29301w(C7615w.f27995a, new c(), null, null, 6, null);
        m26566W0();
    }

    @Override // p285p8.InterfaceC6241d
    /* renamed from: l */
    public void mo24851l(List list, String str, boolean z10) {
        AbstractC5868k.m23674f(list, "deviceList");
        AbstractC5868k.m23674f(str, "tempToken");
        if (z10) {
            ViewOnClickListenerC4802v viewOnClickListenerC4802v = this.f25984F0;
            if (viewOnClickListenerC4802v != null) {
                viewOnClickListenerC4802v.m19847Q9(list);
                return;
            }
            return;
        }
        ViewOnClickListenerC4802v.a aVar = ViewOnClickListenerC4802v.f20235P0;
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        ViewOnClickListenerC4802v m19852a = aVar.m19852a(m3096J6, list, str, this.f25987I0);
        m19852a.m19849V9(new f(m19852a));
        this.f25984F0 = m19852a;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(dialogInterface, "dialog");
        if (this.f25987I0) {
            mo3278o9();
        } else {
            m26551S9();
        }
    }

    @Override // p285p8.InterfaceC6241d
    /* renamed from: v */
    public void mo24852v(boolean z10) {
        String str;
        String str2;
        ViewOnClickListenerC4802v viewOnClickListenerC4802v;
        if (z10 && (viewOnClickListenerC4802v = this.f25984F0) != null) {
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
        C7556b1.m28962j(c7556b1, m3110N8, str, "", str2, true, new g(), false, null, false, 384, null);
    }
}
