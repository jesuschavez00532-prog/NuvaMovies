package p329s8;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
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
import com.taobao.accs.common.Constants;
import com.zhy.autolayout.AutoLinearLayout;
import ga.C4417e;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import la.InterfaceC5537e;
import la.InterfaceC5538f;
import mc.C5634i;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import na.C5833d;
import na.C5834e;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5876s;
import ne.C5881x;
import p132fa.C4300d;
import p161ha.ViewOnClickListenerC4799t0;
import p161ha.ViewOnClickListenerC4802v;
import p201k2.AbstractC5085b;
import p217l2.InterfaceC5342c;
import p285p8.InterfaceC6241d;
import p299q8.C6352b;
import p302qc.C6448c;
import p340t8.C6926a;
import p348u2.AbstractC7028e;
import p359ue.AbstractC7167u;
import p400xa.C7556b1;
import p400xa.C7559c1;
import p400xa.C7615w;
import p415y9.AbstractApplicationC7689d;
import p430z9.C7767e;
import p433zd.AbstractC7786b;
import va.InterfaceC7251a;
import ye.C7709c;

/* renamed from: s8.x1 */
/* loaded from: classes2.dex */
public final class C6768x1 extends C7767e implements InterfaceC5537e, InterfaceC6241d, InterfaceC5538f {

    /* renamed from: F0 */
    private ViewOnClickListenerC4802v f26014F0;

    /* renamed from: H0 */
    private View f26016H0;

    /* renamed from: I0 */
    private InterfaceC5660l f26017I0;

    /* renamed from: M0 */
    private boolean f26021M0;

    /* renamed from: P0 */
    private Disposable f26024P0;

    /* renamed from: Q0 */
    private final InterfaceC1312h f26025Q0;

    /* renamed from: R0 */
    private final InterfaceC1312h f26026R0;

    /* renamed from: S0 */
    private final InterfaceC1312h f26027S0;

    /* renamed from: T0 */
    public Map f26028T0 = new LinkedHashMap();

    /* renamed from: G0 */
    private final String f26015G0 = C6768x1.class.getSimpleName();

    /* renamed from: J0 */
    private boolean f26018J0 = true;

    /* renamed from: K0 */
    private String f26019K0 = "Brazil";

    /* renamed from: L0 */
    private String f26020L0 = "55";

    /* renamed from: N0 */
    private String f26022N0 = "";

    /* renamed from: O0 */
    private String f26023O0 = "";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s8.x1$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {
        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m26612a(String str) {
            AbstractC5868k.m23674f(str, "it");
            if (C6768x1.this.m3075C6() != null) {
                AbstractActivityC0712e m3075C6 = C6768x1.this.m3075C6();
                AbstractC5868k.m23671c(m3075C6);
                if (!m3075C6.isFinishing()) {
                    ((AutoFocusedTextView) C6768x1.this.m26607Q9(R$id.mTextContact)).setText(C6768x1.this.m3175k7(R$string.account_questions_contact, str));
                }
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26612a((String) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: s8.x1$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5833d invoke() {
            C6768x1 c6768x1 = C6768x1.this;
            Context m3096J6 = c6768x1.m3096J6();
            AbstractC5868k.m23671c(m3096J6);
            return new C5833d(c6768x1, m3096J6);
        }
    }

    /* renamed from: s8.x1$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5642a {
        c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5834e invoke() {
            return new C5834e(C6768x1.this);
        }
    }

    /* renamed from: s8.x1$d */
    /* loaded from: classes2.dex */
    static final class d extends AbstractC5869l implements InterfaceC5642a {
        d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6352b invoke() {
            return new C6352b(C6768x1.this);
        }
    }

    /* renamed from: s8.x1$e */
    /* loaded from: classes2.dex */
    public static final class e implements NationSelectView.InterfaceC3018b {
        e() {
        }

        @Override // com.module.view.NationSelectView.InterfaceC3018b
        /* renamed from: a */
        public void mo12230a(int i10, String str, String str2) {
            AbstractC5868k.m23674f(str, "nation");
            AbstractC5868k.m23674f(str2, "nationCode");
            C6768x1.this.f26019K0 = str;
            C6768x1.this.f26020L0 = str2;
            ((CustomImageTextView) C6768x1.this.m26607Q9(R$id.mTextNationCode)).setViewText(str2);
            C7559c1 c7559c1 = C7559c1.f27762a;
            EditText editText = (EditText) C6768x1.this.m26607Q9(R$id.mEditPhoneNum);
            AbstractC5868k.m23673e(editText, "mEditPhoneNum");
            c7559c1.m28990i(editText, C6768x1.this.f26019K0);
        }
    }

    /* renamed from: s8.x1$f */
    /* loaded from: classes2.dex */
    public static final class f implements TextWatcher {
        f() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C7559c1 c7559c1 = C7559c1.f27762a;
            EditText editText = (EditText) C6768x1.this.m26607Q9(R$id.mEditPhoneNum);
            AbstractC5868k.m23673e(editText, "mEditPhoneNum");
            c7559c1.m28984a(editText, this, C6768x1.this.f26019K0);
            ((AutoLinearLayout) C6768x1.this.m26607Q9(R$id.mLayoutNotify)).setVisibility(8);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* renamed from: s8.x1$g */
    /* loaded from: classes2.dex */
    public static final class g implements TextWatcher {
        g() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((AutoLinearLayout) C6768x1.this.m26607Q9(R$id.mLayoutNotify)).setVisibility(8);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* renamed from: s8.x1$h */
    /* loaded from: classes2.dex */
    public static final class h implements ViewOnClickListenerC4802v.b {

        /* renamed from: b */
        final /* synthetic */ ViewOnClickListenerC4802v f26037b;

        /* renamed from: s8.x1$h$a */
        /* loaded from: classes2.dex */
        public static final class a implements ViewOnClickListenerC4799t0.a {

            /* renamed from: a */
            final /* synthetic */ C6768x1 f26038a;

            a(C6768x1 c6768x1) {
                this.f26038a = c6768x1;
            }

            @Override // p161ha.ViewOnClickListenerC4799t0.a
            /* renamed from: a */
            public void mo11875a(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
                AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
                this.f26038a.m26590Z9().m25135I0();
            }

            @Override // p161ha.ViewOnClickListenerC4799t0.a
            /* renamed from: b */
            public void mo11876b(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
                AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
            }
        }

        /* renamed from: s8.x1$h$b */
        /* loaded from: classes2.dex */
        public static final class b implements ViewOnClickListenerC4799t0.a {

            /* renamed from: a */
            final /* synthetic */ C6768x1 f26039a;

            b(C6768x1 c6768x1) {
                this.f26039a = c6768x1;
            }

            @Override // p161ha.ViewOnClickListenerC4799t0.a
            /* renamed from: a */
            public void mo11875a(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
                AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
                ViewOnClickListenerC4802v viewOnClickListenerC4802v = this.f26039a.f26014F0;
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

        h(ViewOnClickListenerC4802v viewOnClickListenerC4802v) {
            this.f26037b = viewOnClickListenerC4802v;
        }

        @Override // p161ha.ViewOnClickListenerC4802v.b
        /* renamed from: a0 */
        public void mo11902a0() {
            ViewOnClickListenerC4802v viewOnClickListenerC4802v = C6768x1.this.f26014F0;
            if (viewOnClickListenerC4802v != null) {
                viewOnClickListenerC4802v.mo3279p9();
            }
            C6768x1.this.m26590Z9().m25133F3();
        }

        @Override // p161ha.ViewOnClickListenerC4802v.b
        /* renamed from: b0 */
        public void mo11903b0() {
            String str;
            String str2;
            C7556b1 c7556b1 = C7556b1.f27754a;
            AbstractC0729o m3110N8 = this.f26037b.m3110N8();
            AbstractC5868k.m23673e(m3110N8, "requireFragmentManager()");
            Context m3096J6 = this.f26037b.m3096J6();
            if (m3096J6 == null || (str = m3096J6.getString(com.module.R$string.operation_failed_tips)) == null) {
                str = "";
            }
            Context m3096J62 = this.f26037b.m3096J6();
            if (m3096J62 == null || (str2 = m3096J62.getString(com.module.R$string.commmon_confirm_text)) == null) {
                str2 = "";
            }
            C7556b1.m28962j(c7556b1, m3110N8, str, "", str2, true, new a(C6768x1.this), false, null, false, 384, null);
        }

        @Override // p161ha.ViewOnClickListenerC4802v.b
        /* renamed from: c0 */
        public void mo11904c0() {
            String str;
            String str2;
            C7556b1 c7556b1 = C7556b1.f27754a;
            AbstractC0729o m3110N8 = this.f26037b.m3110N8();
            AbstractC5868k.m23673e(m3110N8, "requireFragmentManager()");
            Context m3096J6 = this.f26037b.m3096J6();
            if (m3096J6 == null || (str = m3096J6.getString(com.module.R$string.login_invaild_text)) == null) {
                str = "";
            }
            Context m3096J62 = this.f26037b.m3096J6();
            if (m3096J62 == null || (str2 = m3096J62.getString(com.module.R$string.commmon_refresh_text)) == null) {
                str2 = "";
            }
            C7556b1.m28962j(c7556b1, m3110N8, str, "", str2, true, new b(C6768x1.this), false, null, false, 384, null);
        }
    }

    /* renamed from: s8.x1$i */
    /* loaded from: classes2.dex */
    public static final class i implements ViewOnClickListenerC4799t0.a {
        i() {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s8.x1$j */
    /* loaded from: classes2.dex */
    public static final class j extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ C5876s f26041b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(C5876s c5876s) {
            super(1);
            this.f26041b = c5876s;
        }

        /* renamed from: a */
        public final void m26616a(Long l10) {
            TextView textView = (TextView) C6768x1.this.m26607Q9(R$id.mTextGetCode);
            C5881x c5881x = C5881x.f23415a;
            String m3172j7 = C6768x1.this.m3172j7(R$string.dialog_verification_send_time);
            AbstractC5868k.m23673e(m3172j7, "getString(R.string.dialog_verification_send_time)");
            String format = String.format(m3172j7, Arrays.copyOf(new Object[]{Integer.valueOf(this.f26041b.f23410a)}, 1));
            AbstractC5868k.m23673e(format, "format(format, *args)");
            textView.setText(format);
            C5876s c5876s = this.f26041b;
            c5876s.f23410a--;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26616a((Long) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s8.x1$k */
    /* loaded from: classes2.dex */
    public static final class k extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final k f26042a = new k();

        k() {
            super(1);
        }

        /* renamed from: a */
        public final void m26617a(Throwable th) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26617a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    public C6768x1() {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        InterfaceC1312h m5965b3;
        m5965b = AbstractC1314j.m5965b(new b());
        this.f26025Q0 = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new c());
        this.f26026R0 = m5965b2;
        m5965b3 = AbstractC1314j.m5965b(new d());
        this.f26027S0 = m5965b3;
    }

    /* renamed from: W9 */
    private final void m26587W9() {
        mo3278o9();
        AbstractC7028e.m27115a("smsl");
        C4417e c4417e = C4417e.f19115a;
        Context m29494a = AbstractApplicationC7689d.f28135d.m29494a();
        String m20598h = AbstractC5085b.m20598h(m3096J6());
        AbstractC5868k.m23673e(m20598h, "getPackageName(context)");
        C4417e.m18497f(c4417e, m29494a, m20598h, false, false, 12, null);
    }

    /* renamed from: X9 */
    private final C5833d m26588X9() {
        return (C5833d) this.f26025Q0.getValue();
    }

    /* renamed from: Y9 */
    private final C5834e m26589Y9() {
        return (C5834e) this.f26026R0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z9 */
    public final C6352b m26590Z9() {
        return (C6352b) this.f26027S0.getValue();
    }

    /* renamed from: ba */
    private final void m26591ba() {
        C6926a c6926a = C6926a.f26260a;
        AbstractC0729o m3093I6 = m3093I6();
        AbstractC5868k.m23673e(m3093I6, "childFragmentManager");
        c6926a.m26908s(m3093I6, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fa */
    public static final void m26592fa(C6768x1 c6768x1, View view) {
        AbstractC5868k.m23674f(c6768x1, "this$0");
        c6768x1.f26021M0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ga */
    public static final void m26593ga(C6768x1 c6768x1, View view) {
        String str;
        CharSequence m27758b0;
        Resources resources;
        AbstractC5868k.m23674f(c6768x1, "this$0");
        int i10 = R$id.mTextGetCode;
        CharSequence text = ((TextView) c6768x1.m26607Q9(i10)).getText();
        Context m3096J6 = c6768x1.m3096J6();
        if (m3096J6 != null && (resources = m3096J6.getResources()) != null) {
            str = resources.getString(R$string.dialog_get_verification_code);
        } else {
            str = null;
        }
        if (!AbstractC5868k.m23669a(text, str)) {
            return;
        }
        if (c6768x1.m26606sa()) {
            C7559c1 c7559c1 = C7559c1.f27762a;
            m27758b0 = AbstractC7167u.m27758b0(((EditText) c6768x1.m26607Q9(R$id.mEditPhoneNum)).getText().toString());
            c6768x1.m26589Y9().m23599E3(c7559c1.m28987e(m27758b0.toString(), c6768x1.f26019K0), c6768x1.f26020L0, "4");
            ((TextView) c6768x1.m26607Q9(i10)).setEnabled(false);
            return;
        }
        c6768x1.m26600ma(R$string.phone_mumber_invalid, true);
    }

    /* renamed from: h */
    private final void m26594h() {
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
                str2 = (String) m18021a2.second;
            }
            if (str2 == null || str2.length() == 0) {
                z11 = true;
            }
            if (!z11) {
                Pair m18021a3 = c4300d.m18021a();
                AbstractC5868k.m23671c(m18021a3);
                Object obj = m18021a3.first;
                AbstractC5868k.m23673e(obj, "Pref.areaInfo!!.first");
                this.f26019K0 = (String) obj;
                Pair m18021a4 = c4300d.m18021a();
                AbstractC5868k.m23671c(m18021a4);
                Object obj2 = m18021a4.second;
                AbstractC5868k.m23673e(obj2, "Pref.areaInfo!!.second");
                this.f26020L0 = (String) obj2;
                ((NationSelectView) m26607Q9(R$id.mNationSelectView)).setNationName(this.f26019K0);
                ((CustomImageTextView) m26607Q9(R$id.mTextNationCode)).setViewText(this.f26020L0);
                return;
            }
        }
        m26588X9().m23594Y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ha */
    public static final void m26595ha(C6768x1 c6768x1, View view) {
        CharSequence m27758b0;
        CharSequence m27758b02;
        AbstractC5868k.m23674f(c6768x1, "this$0");
        Editable text = ((EditText) c6768x1.m26607Q9(R$id.mEditPhoneNum)).getText();
        AbstractC5868k.m23673e(text, "mEditPhoneNum.text");
        m27758b0 = AbstractC7167u.m27758b0(text);
        c6768x1.f26022N0 = m27758b0.toString();
        Editable text2 = ((EditText) c6768x1.m26607Q9(R$id.mEditVerificationCode)).getText();
        AbstractC5868k.m23673e(text2, "mEditVerificationCode.text");
        m27758b02 = AbstractC7167u.m27758b0(text2);
        c6768x1.f26023O0 = m27758b02.toString();
        if (TextUtils.isEmpty(c6768x1.f26022N0)) {
            String m3172j7 = c6768x1.m3172j7(R$string.phone_please_input_number);
            AbstractC5868k.m23673e(m3172j7, "getString(R.string.phone_please_input_number)");
            c6768x1.m26601na(m3172j7, true);
        } else if (!c6768x1.m26606sa()) {
            String m3172j72 = c6768x1.m3172j7(R$string.phone_mumber_invalid);
            AbstractC5868k.m23673e(m3172j72, "getString(R.string.phone_mumber_invalid)");
            c6768x1.m26601na(m3172j72, true);
        } else if (TextUtils.isEmpty(c6768x1.f26023O0)) {
            String m3172j73 = c6768x1.m3172j7(R$string.phone_please_input_verifitation_code);
            AbstractC5868k.m23673e(m3172j73, "getString(R.string.phone…_input_verifitation_code)");
            c6768x1.m26601na(m3172j73, true);
        } else {
            c6768x1.m26590Z9().mo24846b0("4", C7559c1.f27762a.m28987e(c6768x1.f26022N0, c6768x1.f26019K0), "", c6768x1.f26020L0, c6768x1.f26023O0, "");
            c6768x1.m26599la(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ia */
    public static final void m26596ia(C6768x1 c6768x1, View view) {
        AbstractC5868k.m23674f(c6768x1, "this$0");
        c6768x1.m26591ba();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ja */
    public static final void m26597ja(C6768x1 c6768x1, View view) {
        AbstractC5868k.m23674f(c6768x1, "this$0");
        InterfaceC7251a interfaceC7251a = (InterfaceC7251a) C5634i.m22844e(InterfaceC7251a.class, new Object[0]);
        if (interfaceC7251a != null) {
            AbstractC0729o m3119R6 = c6768x1.m3119R6();
            AbstractC5868k.m23671c(m3119R6);
            interfaceC7251a.mo25622b(m3119R6, c6768x1.f26018J0, "", c6768x1.f26017I0);
        }
        c6768x1.mo3278o9();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ka */
    public static final void m26598ka(C6768x1 c6768x1, View view) {
        AbstractC5868k.m23674f(c6768x1, "this$0");
        InterfaceC5342c interfaceC5342c = (InterfaceC5342c) C5634i.m22844e(InterfaceC5342c.class, new Object[0]);
        if (interfaceC5342c != null) {
            AbstractC0729o m3119R6 = c6768x1.m3119R6();
            AbstractC5868k.m23671c(m3119R6);
            interfaceC5342c.mo21617d(m3119R6, c6768x1.f26018J0, c6768x1.f26017I0);
        }
        c6768x1.mo3278o9();
    }

    /* renamed from: la */
    private final void m26599la(boolean z10) {
        int i10;
        LoadingView loadingView = (LoadingView) m26607Q9(R$id.mLoadingView);
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        loadingView.setVisibility(i10);
        ((TextView) m26607Q9(R$id.mTextLogin)).setEnabled(!z10);
        ((TextView) m26607Q9(R$id.mTextForgetPwd)).setEnabled(!z10);
        ((TextView) m26607Q9(R$id.mTextGetCode)).setEnabled(!z10);
        ((EditText) m26607Q9(R$id.mEditPhoneNum)).setEnabled(!z10);
        ((EditText) m26607Q9(R$id.mEditVerificationCode)).setEnabled(!z10);
        ((NationSelectView) m26607Q9(R$id.mNationSelectView)).setEnabled(!z10);
        ((ImageView) m26607Q9(R$id.mImageAccountLogin)).setEnabled(!z10);
        ((ImageView) m26607Q9(R$id.mImagePhoneLogin)).setEnabled(!z10);
    }

    /* renamed from: ma */
    private final void m26600ma(int i10, boolean z10) {
        String m3172j7 = m3172j7(i10);
        AbstractC5868k.m23673e(m3172j7, "getString(textId)");
        m26601na(m3172j7, z10);
    }

    /* renamed from: na */
    private final void m26601na(String str, boolean z10) {
        int i10 = R$id.mLayoutNotify;
        ((AutoLinearLayout) m26607Q9(i10)).setVisibility(0);
        int i11 = R$id.mTextNotify;
        ((MarqueTextView) m26607Q9(i11)).setText(str);
        Resources resources = null;
        if (z10) {
            ((AutoLinearLayout) m26607Q9(i10)).setBackgroundResource(R$drawable.bg_notify_error);
            ((ImageView) m26607Q9(R$id.mImageNotify)).setImageResource(R$mipmap.icon_notify_error);
            MarqueTextView marqueTextView = (MarqueTextView) m26607Q9(i11);
            Context m3096J6 = m3096J6();
            if (m3096J6 != null) {
                resources = m3096J6.getResources();
            }
            AbstractC5868k.m23671c(resources);
            marqueTextView.setTextColor(resources.getColor(R$color.color_333333));
            return;
        }
        ((AutoLinearLayout) m26607Q9(i10)).setBackgroundResource(R$drawable.bg_notify_success);
        ((ImageView) m26607Q9(R$id.mImageNotify)).setImageResource(R$drawable.icon_notify_success);
        MarqueTextView marqueTextView2 = (MarqueTextView) m26607Q9(i11);
        Context m3096J62 = m3096J6();
        if (m3096J62 != null) {
            resources = m3096J62.getResources();
        }
        AbstractC5868k.m23671c(resources);
        marqueTextView2.setTextColor(resources.getColor(R$color.color_ffffff));
    }

    /* renamed from: oa */
    private final void m26602oa(int i10) {
        C5876s c5876s = new C5876s();
        c5876s.f23410a = i10;
        Observable<Long> observeOn = Observable.interval(0L, 1L, TimeUnit.SECONDS).take(i10 + 1).observeOn(AndroidSchedulers.mainThread());
        final j jVar = new j(c5876s);
        Consumer<? super Long> consumer = new Consumer() { // from class: s8.u1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6768x1.m26604qa(InterfaceC5660l.this, obj);
            }
        };
        final k kVar = k.f26042a;
        this.f26024P0 = observeOn.subscribe(consumer, new Consumer() { // from class: s8.v1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6768x1.m26605ra(InterfaceC5660l.this, obj);
            }
        }, new Action() { // from class: s8.w1
            @Override // io.reactivex.functions.Action
            public final void run() {
                C6768x1.m26603pa(C6768x1.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pa */
    public static final void m26603pa(C6768x1 c6768x1) {
        String str;
        Resources resources;
        AbstractC5868k.m23674f(c6768x1, "this$0");
        TextView textView = (TextView) c6768x1.m26607Q9(R$id.mTextGetCode);
        Context m3096J6 = c6768x1.m3096J6();
        if (m3096J6 != null && (resources = m3096J6.getResources()) != null) {
            str = resources.getString(R$string.dialog_get_verification_code);
        } else {
            str = null;
        }
        textView.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qa */
    public static final void m26604qa(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ra */
    public static final void m26605ra(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: sa */
    private final boolean m26606sa() {
        CharSequence m27758b0;
        CharSequence m27758b02;
        int i10 = R$id.mEditPhoneNum;
        m27758b0 = AbstractC7167u.m27758b0(((EditText) m26607Q9(i10)).getText().toString());
        if (TextUtils.isEmpty(m27758b0.toString())) {
            return false;
        }
        C7559c1 c7559c1 = C7559c1.f27762a;
        m27758b02 = AbstractC7167u.m27758b0(((EditText) m26607Q9(i10)).getText().toString());
        String m28987e = c7559c1.m28987e(m27758b02.toString(), this.f26019K0);
        if (TextUtils.isEmpty(m28987e) || !c7559c1.m28991j(m28987e, this.f26019K0)) {
            return false;
        }
        return true;
    }

    @Override // la.InterfaceC5538f
    /* renamed from: C */
    public void mo22454C(String str) {
        boolean z10;
        AbstractC5868k.m23674f(str, Constants.KEY_ERROR_CODE);
        ((TextView) m26607Q9(R$id.mTextGetCode)).setEnabled(true);
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
            m26601na(m28982c, true);
        }
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f26028T0.clear();
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
        m26599la(false);
        InterfaceC5660l interfaceC5660l = this.f26017I0;
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
        View inflate = layoutInflater.inflate(R$layout.dialog_sms_login, viewGroup, false);
        this.f26016H0 = inflate;
        return inflate;
    }

    /* renamed from: Q9 */
    public View m26607Q9(int i10) {
        View findViewById;
        Map map = this.f26028T0;
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

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo16979F9();
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
        if (z10 && !this.f26021M0) {
            m27758b0 = AbstractC7167u.m27758b0(((EditText) m26607Q9(R$id.mEditPhoneNum)).getText().toString());
            if (TextUtils.isEmpty(m27758b0.toString())) {
                this.f26020L0 = str;
                this.f26019K0 = str2;
                ((NationSelectView) m26607Q9(R$id.mNationSelectView)).setNationName(this.f26019K0);
                ((CustomImageTextView) m26607Q9(R$id.mTextNationCode)).setViewText(this.f26020L0);
            }
        }
    }

    /* renamed from: aa */
    public final void m26608aa() {
        ((AutoLinearLayout) m26607Q9(R$id.mLayoutNotify)).setVisibility(8);
        C7615w.m29301w(C7615w.f27995a, new a(), null, null, 6, null);
    }

    /* renamed from: ca */
    public final void m26609ca(InterfaceC5660l interfaceC5660l) {
        this.f26017I0 = interfaceC5660l;
    }

    /* renamed from: da */
    public final void m26610da(boolean z10) {
        this.f26018J0 = z10;
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

    /* renamed from: ea */
    public final void m26611ea() {
        long currentTimeMillis = 180 - ((System.currentTimeMillis() - C6926a.f26260a.m26898e("key_verifycode_loing_time")) / 1000);
        if (currentTimeMillis > 0) {
            m26602oa((int) currentTimeMillis);
        }
        int i10 = R$id.mNationSelectView;
        ((NationSelectView) m26607Q9(i10)).setOnClickCallback(new View.OnClickListener() { // from class: s8.o1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6768x1.m26592fa(C6768x1.this, view);
            }
        });
        ((NationSelectView) m26607Q9(i10)).setOnItemClickListener(new e());
        ((TextView) m26607Q9(R$id.mTextGetCode)).setOnClickListener(new View.OnClickListener() { // from class: s8.p1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6768x1.m26593ga(C6768x1.this, view);
            }
        });
        ((TextView) m26607Q9(R$id.mTextLogin)).setOnClickListener(new View.OnClickListener() { // from class: s8.q1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6768x1.m26595ha(C6768x1.this, view);
            }
        });
        ((TextView) m26607Q9(R$id.mTextForgetPwd)).setOnClickListener(new View.OnClickListener() { // from class: s8.r1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6768x1.m26596ia(C6768x1.this, view);
            }
        });
        ((ImageView) m26607Q9(R$id.mImageAccountLogin)).setOnClickListener(new View.OnClickListener() { // from class: s8.s1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6768x1.m26597ja(C6768x1.this, view);
            }
        });
        ((ImageView) m26607Q9(R$id.mImagePhoneLogin)).setOnClickListener(new View.OnClickListener() { // from class: s8.t1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6768x1.m26598ka(C6768x1.this, view);
            }
        });
        ((EditText) m26607Q9(R$id.mEditPhoneNum)).addTextChangedListener(new f());
        ((EditText) m26607Q9(R$id.mEditVerificationCode)).addTextChangedListener(new g());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r3.equals("aaa100018") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r3.equals("aaa100017") == false) goto L40;
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
            r1.m26599la(r2)
            int r2 = r3.hashCode()
            r0 = 1
            switch(r2) {
                case -396103091: goto L96;
                case -396102965: goto L7e;
                case -367474005: goto L6f;
                case -338366941: goto L60;
                case -338366906: goto L51;
                case -338366905: goto L48;
                case -338366880: goto L37;
                case -338366661: goto L24;
                case 68379: goto L13;
                default: goto L11;
            }
        L11:
            goto La5
        L13:
            java.lang.String r2 = "EA7"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1d
            goto La5
        L1d:
            int r2 = com.login.R$string.account_login_timeout
            r1.m26600ma(r2, r0)
            goto Laa
        L24:
            java.lang.String r2 = "aaa100094"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L2e
            goto La5
        L2e:
            q8.b r2 = r1.m26590Z9()
            r2.m25136Y0()
            goto Laa
        L37:
            java.lang.String r2 = "aaa100022"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L41
            goto La5
        L41:
            int r2 = com.login.R$string.account_incorrect_account_or_password
            r1.m26600ma(r2, r0)
            goto Laa
        L48:
            java.lang.String r2 = "aaa100018"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L5a
            goto La5
        L51:
            java.lang.String r2 = "aaa100017"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L5a
            goto La5
        L5a:
            int r2 = com.login.R$string.account_area_invalid
            r1.m26600ma(r2, r0)
            goto Laa
        L60:
            java.lang.String r2 = "aaa100003"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L69
            goto La5
        L69:
            int r2 = com.login.R$string.account_incorrect_account_or_password
            r1.m26600ma(r2, r0)
            goto Laa
        L6f:
            java.lang.String r2 = "portal200001"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L78
            goto La5
        L78:
            int r2 = com.login.R$string.account_version_disable
            r1.m26600ma(r2, r0)
            goto Laa
        L7e:
            java.lang.String r2 = "portal100066"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L87
            goto La5
        L87:
            int r2 = com.login.R$string.phone_verification_code_invalid
            java.lang.String r2 = r1.m3172j7(r2)
            java.lang.String r3 = "getString(R.string.phone…erification_code_invalid)"
            ne.AbstractC5868k.m23673e(r2, r3)
            r1.m26601na(r2, r0)
            goto Laa
        L96:
            java.lang.String r2 = "portal100024"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L9f
            goto La5
        L9f:
            int r2 = com.login.R$string.account_cur_column_invisible
            r1.m26600ma(r2, r0)
            goto Laa
        La5:
            int r2 = com.login.R$string.account_login_failed
            r1.m26600ma(r2, r0)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p329s8.C6768x1.mo24850f0(boolean, java.lang.String):void");
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
        m26608aa();
        m26611ea();
        m26594h();
    }

    @Override // p285p8.InterfaceC6241d
    /* renamed from: l */
    public void mo24851l(List list, String str, boolean z10) {
        AbstractC5868k.m23674f(list, "deviceList");
        AbstractC5868k.m23674f(str, "tempToken");
        if (z10) {
            ViewOnClickListenerC4802v viewOnClickListenerC4802v = this.f26014F0;
            if (viewOnClickListenerC4802v != null) {
                viewOnClickListenerC4802v.m19847Q9(list);
                return;
            }
            return;
        }
        ViewOnClickListenerC4802v.a aVar = ViewOnClickListenerC4802v.f20235P0;
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        ViewOnClickListenerC4802v m19852a = aVar.m19852a(m3096J6, list, str, this.f26018J0);
        m19852a.m19849V9(new h(m19852a));
        this.f26014F0 = m19852a;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d
    /* renamed from: o9 */
    public void mo3278o9() {
        super.mo3278o9();
        Disposable disposable = this.f26024P0;
        if (disposable != null) {
            AbstractC5868k.m23671c(disposable);
            if (!disposable.isDisposed()) {
                Disposable disposable2 = this.f26024P0;
                AbstractC5868k.m23671c(disposable2);
                disposable2.dispose();
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(dialogInterface, "dialog");
        if (this.f26018J0) {
            mo3278o9();
        } else {
            m26587W9();
        }
    }

    @Override // p285p8.InterfaceC6241d
    /* renamed from: v */
    public void mo24852v(boolean z10) {
        String str;
        String str2;
        ViewOnClickListenerC4802v viewOnClickListenerC4802v;
        if (z10 && (viewOnClickListenerC4802v = this.f26014F0) != null) {
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
        C7556b1.m28962j(c7556b1, m3110N8, str, "", str2, true, new i(), false, null, false, 384, null);
    }

    @Override // la.InterfaceC5538f
    /* renamed from: w */
    public void mo22455w() {
        CharSequence m27758b0;
        ((TextView) m26607Q9(R$id.mTextGetCode)).setEnabled(true);
        C6926a.m26890h("key_verifycode_loing_time", System.currentTimeMillis());
        m26602oa(180);
        C5881x c5881x = C5881x.f23415a;
        String m3172j7 = m3172j7(R$string.phone_verifitation_code_send);
        AbstractC5868k.m23673e(m3172j7, "getString(R.string.phone_verifitation_code_send)");
        C7559c1 c7559c1 = C7559c1.f27762a;
        m27758b0 = AbstractC7167u.m27758b0(((EditText) m26607Q9(R$id.mEditPhoneNum)).getText().toString());
        String format = String.format(m3172j7, Arrays.copyOf(new Object[]{c7559c1.m28989h(m27758b0.toString(), this.f26020L0)}, 1));
        AbstractC5868k.m23673e(format, "format(format, *args)");
        m26601na(format, false);
    }
}
