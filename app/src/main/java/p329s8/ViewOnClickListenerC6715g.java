package p329s8;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0729o;
import androidx.recyclerview.widget.LinearLayoutManager;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.C1466m0;
import com.login.R$id;
import com.login.R$layout;
import com.login.R$string;
import com.login.R$style;
import com.module.event.LoginSuccessRequestDataEvent;
import com.module.view.AutoCompleteEditView;
import com.module.view.AutoEmailCompleteRecyclerView;
import com.module.view.DialogBottomBar;
import com.module.view.LoadingView;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.request.result.LoginResult;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import la.InterfaceC5533a;
import la.InterfaceC5534b;
import mc.C5634i;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import na.C5830a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5874q;
import ne.C5876s;
import ne.C5881x;
import p102db.C4049j1;
import p161ha.ViewOnClickListenerC4799t0;
import p161ha.ViewOnClickListenerC4802v;
import p170i2.C4842a;
import p302qc.C6448c;
import p317rb.AbstractC6567a;
import p340t8.C6926a;
import p359ue.AbstractC7166t;
import p359ue.AbstractC7167u;
import p400xa.AbstractC7555b0;
import p400xa.AbstractC7557c;
import p400xa.C7556b1;
import p400xa.C7559c1;
import p400xa.C7615w;
import p430z9.C7767e;
import p433zd.AbstractC7786b;
import va.InterfaceC7251a;
import ye.C7709c;

/* renamed from: s8.g */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC6715g extends C7767e implements View.OnClickListener, InterfaceC5534b, C4049j1.b {

    /* renamed from: G0 */
    private View f25770G0;

    /* renamed from: I0 */
    private final InterfaceC1312h f25772I0;

    /* renamed from: J0 */
    private Disposable f25773J0;

    /* renamed from: K0 */
    private InterfaceC5642a f25774K0;

    /* renamed from: L0 */
    private C4049j1 f25775L0;

    /* renamed from: M0 */
    private boolean f25776M0;

    /* renamed from: N0 */
    private ViewOnClickListenerC4802v f25777N0;

    /* renamed from: O0 */
    private boolean f25778O0;

    /* renamed from: P0 */
    public Map f25779P0 = new LinkedHashMap();

    /* renamed from: F0 */
    private final String f25769F0 = ViewOnClickListenerC6715g.class.getSimpleName();

    /* renamed from: H0 */
    private String f25771H0 = "";

    /* renamed from: s8.g$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5830a invoke() {
            return new C5830a(ViewOnClickListenerC6715g.this);
        }
    }

    /* renamed from: s8.g$b */
    /* loaded from: classes2.dex */
    public static final class b implements TextWatcher {
        b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((DialogBottomBar) ViewOnClickListenerC6715g.this.m26321N9(R$id.mBottomBar)).m12079e();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s8.g$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ C5874q f25782a;

        /* renamed from: b */
        final /* synthetic */ String f25783b;

        /* renamed from: c */
        final /* synthetic */ ViewOnClickListenerC6715g f25784c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C5874q c5874q, String str, ViewOnClickListenerC6715g viewOnClickListenerC6715g) {
            super(1);
            this.f25782a = c5874q;
            this.f25783b = str;
            this.f25784c = viewOnClickListenerC6715g;
        }

        /* renamed from: a */
        public final void m26328a(ArrayList arrayList) {
            boolean z10 = false;
            AbstractC5868k.m23674f(arrayList, "it");
            C5874q c5874q = this.f25782a;
            String str = this.f25783b;
            if (str != null) {
                z10 = arrayList.contains(str);
            } else {
                z10 = false;
            }
            c5874q.f23408a = z10;
            if (!AbstractC7557c.m28974b(this.f25784c.f25771H0)) {
                ViewOnClickListenerC6715g viewOnClickListenerC6715g = this.f25784c;
                String m3172j7 = viewOnClickListenerC6715g.m3172j7(R$string.account_incorrect_email);
                AbstractC5868k.m23673e(m3172j7, "getString(R.string.account_incorrect_email)");
                viewOnClickListenerC6715g.m26315da(m3172j7, false);
                return;
            }
            String m29302F = C7615w.f27995a.m29302F();
            Locale locale = Locale.getDefault();
            AbstractC5868k.m23673e(locale, "getDefault()");
            String lowerCase = m29302F.toLowerCase(locale);
            AbstractC5868k.m23673e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String str2 = this.f25784c.f25771H0;
            Locale locale2 = Locale.getDefault();
            AbstractC5868k.m23673e(locale2, "getDefault()");
            String lowerCase2 = str2.toLowerCase(locale2);
            AbstractC5868k.m23673e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (AbstractC5868k.m23669a(lowerCase, lowerCase2)) {
                ViewOnClickListenerC6715g viewOnClickListenerC6715g2 = this.f25784c;
                String m3172j72 = viewOnClickListenerC6715g2.m3172j7(R$string.account_same_with_service_email);
                AbstractC5868k.m23673e(m3172j72, "getString(R.string.accou…_same_with_service_email)");
                viewOnClickListenerC6715g2.m26315da(m3172j72, false);
                return;
            }
            if (!this.f25782a.f23408a) {
                ViewOnClickListenerC6715g viewOnClickListenerC6715g3 = this.f25784c;
                String m3172j73 = viewOnClickListenerC6715g3.m3172j7(R$string.account_not_suport_email);
                AbstractC5868k.m23673e(m3172j73, "getString(R.string.account_not_suport_email)");
                viewOnClickListenerC6715g3.m26315da(m3172j73, false);
                return;
            }
            ((TextView) this.f25784c.m26321N9(R$id.mTextGetCode)).setEnabled(false);
            this.f25784c.m26310U9().mo22428e0(this.f25784c.f25771H0);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26328a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s8.g$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {
        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m26329a(ArrayList arrayList) {
            AbstractC5868k.m23674f(arrayList, "completeList");
            if (!AbstractC6567a.m25635e(arrayList) && ViewOnClickListenerC6715g.this.m3075C6() != null) {
                AbstractActivityC0712e m3075C6 = ViewOnClickListenerC6715g.this.m3075C6();
                AbstractC5868k.m23671c(m3075C6);
                if (!m3075C6.isFinishing()) {
                    ((AutoEmailCompleteRecyclerView) ViewOnClickListenerC6715g.this.m26321N9(R$id.mRvCompleteList)).setCompleteList(arrayList);
                }
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26329a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: s8.g$e */
    /* loaded from: classes2.dex */
    public static final class e implements TextWatcher {
        e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextView) ViewOnClickListenerC6715g.this.m26321N9(R$id.mTextGetCode)).setEnabled(!AbstractC6567a.m25634d(ViewOnClickListenerC6715g.m26309T9(ViewOnClickListenerC6715g.this, false, 1, null)));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* renamed from: s8.g$f */
    /* loaded from: classes2.dex */
    public static final class f implements ViewOnClickListenerC4802v.b {

        /* renamed from: b */
        final /* synthetic */ ViewOnClickListenerC4802v f25788b;

        /* renamed from: s8.g$f$a */
        /* loaded from: classes2.dex */
        public static final class a implements ViewOnClickListenerC4799t0.a {

            /* renamed from: a */
            final /* synthetic */ ViewOnClickListenerC6715g f25789a;

            a(ViewOnClickListenerC6715g viewOnClickListenerC6715g) {
                this.f25789a = viewOnClickListenerC6715g;
            }

            @Override // p161ha.ViewOnClickListenerC4799t0.a
            /* renamed from: a */
            public void mo11875a(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
                AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
                this.f25789a.m26310U9().mo22426I0();
            }

            @Override // p161ha.ViewOnClickListenerC4799t0.a
            /* renamed from: b */
            public void mo11876b(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
                AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
            }
        }

        /* renamed from: s8.g$f$b */
        /* loaded from: classes2.dex */
        public static final class b implements ViewOnClickListenerC4799t0.a {

            /* renamed from: a */
            final /* synthetic */ ViewOnClickListenerC6715g f25790a;

            /* renamed from: b */
            final /* synthetic */ ViewOnClickListenerC4802v f25791b;

            /* renamed from: s8.g$f$b$a */
            /* loaded from: classes2.dex */
            static final class a extends AbstractC5869l implements InterfaceC5660l {

                /* renamed from: a */
                public static final a f25792a = new a();

                a() {
                    super(1);
                }

                /* renamed from: a */
                public final void m26330a(LoginResult loginResult) {
                    C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(true, false, null, 6, null));
                }

                @Override // me.InterfaceC5660l
                /* renamed from: f */
                public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                    m26330a((LoginResult) obj);
                    return C1328x.f4998a;
                }
            }

            b(ViewOnClickListenerC6715g viewOnClickListenerC6715g, ViewOnClickListenerC4802v viewOnClickListenerC4802v) {
                this.f25790a = viewOnClickListenerC6715g;
                this.f25791b = viewOnClickListenerC4802v;
            }

            @Override // p161ha.ViewOnClickListenerC4799t0.a
            /* renamed from: a */
            public void mo11875a(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
                AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
                ViewOnClickListenerC4802v viewOnClickListenerC4802v = this.f25790a.f25777N0;
                if (viewOnClickListenerC4802v != null) {
                    viewOnClickListenerC4802v.mo3279p9();
                }
                InterfaceC7251a interfaceC7251a = (InterfaceC7251a) C5634i.m22844e(InterfaceC7251a.class, new Object[0]);
                if (interfaceC7251a != null) {
                    AbstractC0729o m3119R6 = this.f25791b.m3119R6();
                    AbstractC5868k.m23671c(m3119R6);
                    InterfaceC7251a.a.m28064a(interfaceC7251a, m3119R6, true, null, a.f25792a, 4, null);
                }
            }

            @Override // p161ha.ViewOnClickListenerC4799t0.a
            /* renamed from: b */
            public void mo11876b(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
                AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
            }
        }

        f(ViewOnClickListenerC4802v viewOnClickListenerC4802v) {
            this.f25788b = viewOnClickListenerC4802v;
        }

        @Override // p161ha.ViewOnClickListenerC4802v.b
        /* renamed from: a0 */
        public void mo11902a0() {
            ViewOnClickListenerC4802v viewOnClickListenerC4802v = ViewOnClickListenerC6715g.this.f25777N0;
            if (viewOnClickListenerC4802v != null) {
                viewOnClickListenerC4802v.mo3279p9();
            }
            ViewOnClickListenerC6715g.this.m26310U9().mo22429t();
        }

        @Override // p161ha.ViewOnClickListenerC4802v.b
        /* renamed from: b0 */
        public void mo11903b0() {
            String str = null;
            String str2 = null;
            C7556b1 c7556b1 = C7556b1.f27754a;
            AbstractC0729o m3110N8 = this.f25788b.m3110N8();
            AbstractC5868k.m23673e(m3110N8, "requireFragmentManager()");
            Context m3096J6 = this.f25788b.m3096J6();
            if (m3096J6 == null || (str = m3096J6.getString(com.module.R$string.operation_failed_tips)) == null) {
                str = "";
            }
            Context m3096J62 = this.f25788b.m3096J6();
            if (m3096J62 == null || (str2 = m3096J62.getString(com.module.R$string.commmon_confirm_text)) == null) {
                str2 = "";
            }
            C7556b1.m28962j(c7556b1, m3110N8, str, "", str2, true, new a(ViewOnClickListenerC6715g.this), false, null, false, 384, null);
        }

        @Override // p161ha.ViewOnClickListenerC4802v.b
        /* renamed from: c0 */
        public void mo11904c0() {
            String str = null;
            String str2 = null;
            C7556b1 c7556b1 = C7556b1.f27754a;
            AbstractC0729o m3110N8 = this.f25788b.m3110N8();
            AbstractC5868k.m23673e(m3110N8, "requireFragmentManager()");
            Context m3096J6 = this.f25788b.m3096J6();
            if (m3096J6 == null || (str = m3096J6.getString(com.module.R$string.login_invaild_text)) == null) {
                str = "";
            }
            Context m3096J62 = this.f25788b.m3096J6();
            if (m3096J62 == null || (str2 = m3096J62.getString(com.module.R$string.commmon_refresh_text)) == null) {
                str2 = "";
            }
            C7556b1.m28962j(c7556b1, m3110N8, str, "", str2, true, new b(ViewOnClickListenerC6715g.this, this.f25788b), false, null, false, 384, null);
        }
    }

    /* renamed from: s8.g$g */
    /* loaded from: classes2.dex */
    static final class g extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final g f25793a = new g();

        g() {
            super(1);
        }

        /* renamed from: a */
        public final void m26331a(LoginResult loginResult) {
            C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(true, false, null, 6, null));
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26331a((LoginResult) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: s8.g$h */
    /* loaded from: classes2.dex */
    public static final class h implements ViewOnClickListenerC4799t0.a {

        /* renamed from: s8.g$h$a */
        /* loaded from: classes2.dex */
        static final class a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            public static final a f25795a = new a();

            a() {
                super(1);
            }

            /* renamed from: a */
            public final void m26332a(LoginResult loginResult) {
                C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(true, false, null, 6, null));
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m26332a((LoginResult) obj);
                return C1328x.f4998a;
            }
        }

        h() {
        }

        @Override // p161ha.ViewOnClickListenerC4799t0.a
        /* renamed from: a */
        public void mo11875a(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
            AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
            InterfaceC7251a interfaceC7251a = (InterfaceC7251a) C5634i.m22844e(InterfaceC7251a.class, new Object[0]);
            if (interfaceC7251a != null) {
                AbstractC0729o m3119R6 = ViewOnClickListenerC6715g.this.m3119R6();
                AbstractC5868k.m23671c(m3119R6);
                InterfaceC7251a.a.m28064a(interfaceC7251a, m3119R6, true, null, a.f25795a, 4, null);
            }
        }

        @Override // p161ha.ViewOnClickListenerC4799t0.a
        /* renamed from: b */
        public void mo11876b(ViewOnClickListenerC4799t0 viewOnClickListenerC4799t0) {
            AbstractC5868k.m23674f(viewOnClickListenerC4799t0, "dialog");
        }
    }

    /* renamed from: s8.g$i */
    /* loaded from: classes2.dex */
    static final class i extends AbstractC5869l implements InterfaceC5642a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: s8.g$i$a */
        /* loaded from: classes2.dex */
        public static final class a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            final /* synthetic */ ViewOnClickListenerC6715g f25797a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ViewOnClickListenerC6715g viewOnClickListenerC6715g) {
                super(1);
                this.f25797a = viewOnClickListenerC6715g;
            }

            /* renamed from: a */
            public final void m26334a(LoginResult loginResult) {
                this.f25797a.mo3279p9();
                C1466m0.f5627a.m6849V(true);
                C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(true, false, null, 6, null));
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m26334a((LoginResult) obj);
                return C1328x.f4998a;
            }
        }

        i() {
            super(0);
        }

        /* renamed from: a */
        public final void m26333a() {
            InterfaceC7251a interfaceC7251a = (InterfaceC7251a) C5634i.m22844e(InterfaceC7251a.class, new Object[0]);
            if (interfaceC7251a != null) {
                AbstractC0729o m3093I6 = ViewOnClickListenerC6715g.this.m3093I6();
                AbstractC5868k.m23673e(m3093I6, "childFragmentManager");
                InterfaceC7251a.a.m28064a(interfaceC7251a, m3093I6, true, null, new a(ViewOnClickListenerC6715g.this), 4, null);
            }
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m26333a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s8.g$j */
    /* loaded from: classes2.dex */
    public static final class j extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ C5876s f25799b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(C5876s c5876s) {
            super(1);
            this.f25799b = c5876s;
        }

        /* renamed from: a */
        public final void m26335a(Long l10) {
            TextView textView = (TextView) ViewOnClickListenerC6715g.this.m26321N9(R$id.mTextGetCode);
            C5881x c5881x = C5881x.f23415a;
            String m3172j7 = ViewOnClickListenerC6715g.this.m3172j7(R$string.dialog_verification_send_time);
            AbstractC5868k.m23673e(m3172j7, "getString(R.string.dialog_verification_send_time)");
            String format = String.format(m3172j7, Arrays.copyOf(new Object[]{Integer.valueOf(this.f25799b.f23410a)}, 1));
            AbstractC5868k.m23673e(format, "format(format, *args)");
            textView.setText(format);
            C5876s c5876s = this.f25799b;
            c5876s.f23410a--;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26335a((Long) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s8.g$k */
    /* loaded from: classes2.dex */
    public static final class k extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final k f25800a = new k();

        k() {
            super(1);
        }

        /* renamed from: a */
        public final void m26336a(Throwable th) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26336a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    public ViewOnClickListenerC6715g() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(new a());
        this.f25772I0 = m5965b;
    }

    /* renamed from: S9 */
    private final String m26308S9(boolean z10) {
        String m27728o = null;
        m27728o = AbstractC7166t.m27728o(((AutoCompleteEditView) m26321N9(R$id.mEditEmail)).getText().toString(), " ", "", false, 4, null);
        return m27728o;
    }

    /* renamed from: T9 */
    static /* synthetic */ String m26309T9(ViewOnClickListenerC6715g viewOnClickListenerC6715g, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return viewOnClickListenerC6715g.m26308S9(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U9 */
    public final InterfaceC5533a m26310U9() {
        return (InterfaceC5533a) this.f25772I0.getValue();
    }

    /* renamed from: V9 */
    private final String m26311V9(String str) {
        int m27735E;
        boolean z10 = false;
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            m27735E = AbstractC7167u.m27735E(str, "@", 0, false, 6, null);
            int i10 = 0;
            int i11 = 0;
            while (i10 < str.length()) {
                char charAt = str.charAt(i10);
                int i12 = i11 + 1;
                if (m27735E - 3 <= i11 && i11 < m27735E) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    sb2.append(Operator.Operation.MULTIPLY);
                } else {
                    sb2.append(charAt);
                }
                i10++;
                i11 = i12;
            }
        }
        String sb3 = sb2.toString();
        AbstractC5868k.m23673e(sb3, "emailShow.toString()");
        return sb3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aa */
    public static final void m26312aa(ViewOnClickListenerC6715g viewOnClickListenerC6715g, View view, boolean z10) {
        AbstractC5868k.m23674f(viewOnClickListenerC6715g, "this$0");
        if (z10) {
            ((DialogBottomBar) viewOnClickListenerC6715g.m26321N9(R$id.mBottomBar)).m12079e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ba */
    public static final void m26313ba(ViewOnClickListenerC6715g viewOnClickListenerC6715g, View view) {
        String str = null;
        Resources resources;
        AbstractC5868k.m23674f(viewOnClickListenerC6715g, "this$0");
        int i10 = R$id.mTextGetCode;
        CharSequence text = ((TextView) viewOnClickListenerC6715g.m26321N9(i10)).getText();
        Context m3096J6 = viewOnClickListenerC6715g.m3096J6();
        if (m3096J6 != null && (resources = m3096J6.getResources()) != null) {
            str = resources.getString(R$string.dialog_get_verification_code);
        } else {
            str = null;
        }
        if (!AbstractC5868k.m23669a(text, str)) {
            return;
        }
        C5874q c5874q = new C5874q();
        String m26309T9 = m26309T9(viewOnClickListenerC6715g, false, 1, null);
        viewOnClickListenerC6715g.f25771H0 = m26309T9;
        C7615w c7615w = C7615w.f27995a;
        String m29317x = c7615w.m29317x(m26309T9);
        if (AbstractC6567a.m25637g(m29317x)) {
            if (!AbstractC7557c.m28974b(viewOnClickListenerC6715g.f25771H0)) {
                String m3172j7 = viewOnClickListenerC6715g.m3172j7(R$string.account_incorrect_email);
                AbstractC5868k.m23673e(m3172j7, "getString(R.string.account_incorrect_email)");
                viewOnClickListenerC6715g.m26315da(m3172j7, false);
                return;
            }
            String m29302F = c7615w.m29302F();
            Locale locale = Locale.getDefault();
            AbstractC5868k.m23673e(locale, "getDefault()");
            String lowerCase = m29302F.toLowerCase(locale);
            AbstractC5868k.m23673e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String str2 = viewOnClickListenerC6715g.f25771H0;
            Locale locale2 = Locale.getDefault();
            AbstractC5868k.m23673e(locale2, "getDefault()");
            String lowerCase2 = str2.toLowerCase(locale2);
            AbstractC5868k.m23673e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (AbstractC5868k.m23669a(lowerCase, lowerCase2)) {
                String m3172j72 = viewOnClickListenerC6715g.m3172j7(R$string.account_same_with_service_email);
                AbstractC5868k.m23673e(m3172j72, "getString(R.string.accou…_same_with_service_email)");
                viewOnClickListenerC6715g.m26315da(m3172j72, false);
                return;
            } else {
                ((TextView) viewOnClickListenerC6715g.m26321N9(i10)).setEnabled(false);
                viewOnClickListenerC6715g.m26310U9().mo22428e0(viewOnClickListenerC6715g.f25771H0);
                return;
            }
        }
        Context m3096J62 = viewOnClickListenerC6715g.m3096J6();
        if (m3096J62 != null) {
            c7615w.m29311S(m3096J62, new c(c5874q, m29317x, viewOnClickListenerC6715g));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ca */
    public static final boolean m26314ca(ViewOnClickListenerC6715g viewOnClickListenerC6715g, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(viewOnClickListenerC6715g, "this$0");
        if (keyEvent.getAction() == 0 && i10 == 20) {
            int i11 = R$id.mRvCompleteList;
            if (((AutoEmailCompleteRecyclerView) viewOnClickListenerC6715g.m26321N9(i11)).getVisibility() == 0 && !((AutoEmailCompleteRecyclerView) viewOnClickListenerC6715g.m26321N9(i11)).m12068f()) {
                ((AutoEmailCompleteRecyclerView) viewOnClickListenerC6715g.m26321N9(i11)).requestFocus();
                return true;
            }
            int i12 = R$id.mTextGetCode;
            if (((TextView) viewOnClickListenerC6715g.m26321N9(i12)).isEnabled()) {
                ((TextView) viewOnClickListenerC6715g.m26321N9(i12)).requestFocus();
            } else {
                ((CheckBox) viewOnClickListenerC6715g.m26321N9(R$id.mCheckBox)).requestFocus();
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: da */
    public final void m26315da(String str, boolean z10) {
        DialogBottomBar.EnumC2998a enumC2998a;
        DialogBottomBar dialogBottomBar = (DialogBottomBar) m26321N9(R$id.mBottomBar);
        if (z10) {
            enumC2998a = DialogBottomBar.EnumC2998a.SUCCESS;
        } else {
            enumC2998a = DialogBottomBar.EnumC2998a.FAIL;
        }
        dialogBottomBar.m12080g(str, enumC2998a);
    }

    /* renamed from: fa */
    private final void m26316fa(int i10) {
        C5876s c5876s = new C5876s();
        c5876s.f23410a = i10;
        Observable<Long> observeOn = Observable.interval(0L, 1L, TimeUnit.SECONDS).take(i10 + 1).observeOn(AndroidSchedulers.mainThread());
        final j jVar = new j(c5876s);
        Consumer<? super Long> consumer = new Consumer() { // from class: s8.a
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ViewOnClickListenerC6715g.m26317ga(InterfaceC5660l.this, obj);
            }
        };
        final k kVar = k.f25800a;
        this.f25773J0 = observeOn.subscribe(consumer, new Consumer() { // from class: s8.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ViewOnClickListenerC6715g.m26318ha(InterfaceC5660l.this, obj);
            }
        }, new Action() { // from class: s8.c
            @Override // io.reactivex.functions.Action
            public final void run() {
                ViewOnClickListenerC6715g.m26319ia(ViewOnClickListenerC6715g.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ga */
    public static final void m26317ga(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ha */
    public static final void m26318ha(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ia */
    public static final void m26319ia(ViewOnClickListenerC6715g viewOnClickListenerC6715g) {
        String str = null;
        Resources resources;
        AbstractC5868k.m23674f(viewOnClickListenerC6715g, "this$0");
        TextView textView = (TextView) viewOnClickListenerC6715g.m26321N9(R$id.mTextGetCode);
        Context m3096J6 = viewOnClickListenerC6715g.m3096J6();
        if (m3096J6 != null && (resources = m3096J6.getResources()) != null) {
            str = resources.getString(R$string.dialog_get_verification_code);
        } else {
            str = null;
        }
        textView.setText(str);
    }

    /* renamed from: ja */
    private final void m26320ja() {
        CharSequence m27758b0;
        this.f25771H0 = m26309T9(this, false, 1, null);
        Editable text = ((EditText) m26321N9(R$id.mEditVerificationCode)).getText();
        AbstractC5868k.m23673e(text, "mEditVerificationCode.text");
        m27758b0 = AbstractC7167u.m27758b0(text);
        String obj = m27758b0.toString();
        if (TextUtils.isEmpty(m26308S9(false))) {
            String m3172j7 = m3172j7(R$string.personal_email_or_verification_code_empty);
            AbstractC5868k.m23673e(m3172j7, "getString(R.string.perso…_verification_code_empty)");
            m26315da(m3172j7, false);
            return;
        }
        if (TextUtils.isEmpty(obj)) {
            String m3172j72 = m3172j7(R$string.personal_verification_code_empty);
            AbstractC5868k.m23673e(m3172j72, "getString(R.string.perso…_verification_code_empty)");
            m26315da(m3172j72, false);
            return;
        }
        if (TextUtils.isEmpty(m26308S9(false))) {
            String m3172j73 = m3172j7(R$string.email_input_must_not_empty);
            AbstractC5868k.m23673e(m3172j73, "getString(R.string.email_input_must_not_empty)");
            m26315da(m3172j73, false);
        } else if (!AbstractC7557c.m28974b(this.f25771H0)) {
            String m3172j74 = m3172j7(R$string.account_incorrect_email);
            AbstractC5868k.m23673e(m3172j74, "getString(R.string.account_incorrect_email)");
            m26315da(m3172j74, false);
        } else {
            if (TextUtils.isEmpty(obj)) {
                String m3172j75 = m3172j7(R$string.phone_please_input_verifitation_code);
                AbstractC5868k.m23673e(m3172j75, "getString(R.string.phone…_input_verifitation_code)");
                m26315da(m3172j75, false);
                return;
            }
            m26310U9().mo22427K(this.f25771H0, obj);
        }
    }

    @Override // la.InterfaceC5534b
    /* renamed from: F4 */
    public void mo22431F4() {
        this.f25776M0 = true;
        mo22440v0();
        C4049j1 c4049j1 = this.f25775L0;
        if (c4049j1 != null) {
            c4049j1.m17040n(m26311V9(m26309T9(this, false, 1, null)), 0);
        }
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f25779P0.clear();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.InputPasswordDialog);
    }

    /* renamed from: N9 */
    public View m26321N9(int i10) {
        View findViewById;
        Map map = this.f25779P0;
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

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.dialog_bind_email, viewGroup, false);
        this.f25770G0 = inflate;
        return inflate;
    }

    @Override // p102db.C4049j1.b
    /* renamed from: Q0 */
    public void mo17041Q0(String str) {
        AbstractC5868k.m23674f(str, "password");
        m26310U9().mo22430u1(m26309T9(this, false, 1, null), C4842a.f20329a.m19920a().mo19949Z(str));
    }

    @Override // la.InterfaceC5534b
    /* renamed from: R */
    public void mo22432R() {
        InterfaceC7251a interfaceC7251a = (InterfaceC7251a) C5634i.m22844e(InterfaceC7251a.class, new Object[0]);
        if (interfaceC7251a != null) {
            AbstractC0729o m3119R6 = m3119R6();
            AbstractC5868k.m23671c(m3119R6);
            InterfaceC7251a.a.m28064a(interfaceC7251a, m3119R6, false, null, g.f25793a, 4, null);
        }
    }

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo16979F9();
    }

    /* renamed from: W9 */
    public void m26322W9() {
        C4049j1 c4049j1 = this.f25775L0;
        if (c4049j1 != null) {
            ((AutoRelativeLayout) m26321N9(R$id.mLayoutContainer)).removeView(c4049j1);
        }
        ((AutoLinearLayout) m26321N9(R$id.mLayoutBind)).setVisibility(0);
        this.f25775L0 = null;
    }

    /* renamed from: X9 */
    public final void m26323X9() {
        Resources resources;
        Resources resources2;
        String str = null;
        if (this.f25778O0) {
            Button button = (Button) m26321N9(R$id.mBtnCancel);
            Context m3096J6 = m3096J6();
            if (m3096J6 != null && (resources2 = m3096J6.getResources()) != null) {
                str = resources2.getString(R$string.personal_bind_mobile);
            }
            button.setText(str);
        } else {
            Button button2 = (Button) m26321N9(R$id.mBtnCancel);
            Context m3096J62 = m3096J6();
            if (m3096J62 != null && (resources = m3096J62.getResources()) != null) {
                str = resources.getString(R$string.dlg_cancel);
            }
            button2.setText(str);
        }
        ((TextView) m26321N9(R$id.mTextGetCode)).setEnabled(false);
    }

    /* renamed from: Y9 */
    public final void m26324Y9(InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(interfaceC5642a, "callback");
        this.f25774K0 = interfaceC5642a;
    }

    /* renamed from: Z9 */
    public final void m26325Z9() {
        Window window;
        if (C1466m0.f5627a.m6829B()) {
            ((AutoLinearLayout) m26321N9(R$id.mLayoutPrivacy)).setVisibility(0);
        } else {
            ((AutoLinearLayout) m26321N9(R$id.mLayoutPrivacy)).setVisibility(4);
        }
        Button button = (Button) m26321N9(R$id.mBtnConfirm);
        AbstractC5868k.m23673e(button, "mBtnConfirm");
        AbstractC7555b0.m28955i(button, this);
        ((Button) m26321N9(R$id.mBtnCancel)).setOnClickListener(this);
        ((TextView) m26321N9(R$id.mTextPolicy)).setOnClickListener(this);
        long currentTimeMillis = 180 - ((System.currentTimeMillis() - C6926a.f26260a.m26898e("key_verifycode_bind_time")) / 1000);
        if (currentTimeMillis > 0) {
            m26316fa((int) currentTimeMillis);
        }
        int i10 = R$id.mEditEmail;
        ((AutoCompleteEditView) m26321N9(i10)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: s8.d
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                ViewOnClickListenerC6715g.m26312aa(ViewOnClickListenerC6715g.this, view, z10);
            }
        });
        ((EditText) m26321N9(R$id.mEditVerificationCode)).addTextChangedListener(new b());
        ((TextView) m26321N9(R$id.mTextGetCode)).setOnClickListener(new View.OnClickListener() { // from class: s8.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewOnClickListenerC6715g.m26313ba(ViewOnClickListenerC6715g.this, view);
            }
        });
        Context m3096J6 = m3096J6();
        if (m3096J6 != null) {
            int i11 = R$id.mRvCompleteList;
            ((AutoEmailCompleteRecyclerView) m26321N9(i11)).setLayoutManager(new LinearLayoutManager(m3096J6));
            AutoEmailCompleteRecyclerView autoEmailCompleteRecyclerView = (AutoEmailCompleteRecyclerView) m26321N9(i11);
            Dialog m3280r9 = m3280r9();
            if (m3280r9 != null) {
                window = m3280r9.getWindow();
            } else {
                window = null;
            }
            autoEmailCompleteRecyclerView.m12066d(window, (AutoCompleteEditView) m26321N9(i10));
            C7615w.f27995a.m29311S(m3096J6, new d());
        }
        ((AutoCompleteEditView) m26321N9(i10)).addTextChangedListener(new e());
        ((AutoCompleteEditView) m26321N9(i10)).setOnKeyListener(new View.OnKeyListener() { // from class: s8.f
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i12, KeyEvent keyEvent) {
                boolean m26314ca;
                m26314ca = ViewOnClickListenerC6715g.m26314ca(ViewOnClickListenerC6715g.this, view, i12, keyEvent);
                return m26314ca;
            }
        });
    }

    @Override // la.InterfaceC5534b
    /* renamed from: a */
    public void mo22433a() {
        ((LoadingView) m26321N9(R$id.mLoadingView)).setVisibility(0);
        ((Button) m26321N9(R$id.mBtnConfirm)).setEnabled(false);
    }

    @Override // la.InterfaceC5534b
    /* renamed from: b */
    public void mo22434b() {
        ((LoadingView) m26321N9(R$id.mLoadingView)).setVisibility(8);
        ((Button) m26321N9(R$id.mBtnConfirm)).setEnabled(true);
    }

    @Override // la.InterfaceC5534b
    /* renamed from: e */
    public void mo22435e() {
        C6448c m25254t = C5634i.m22843d("http://module_login/ForcePasswordChangeActivity").m25254t(262144);
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        C6448c.m25240q(m25254t, m3096J6, null, 2, null);
        mo3279p9();
    }

    /* renamed from: ea */
    public final void m26326ea(boolean z10) {
        this.f25778O0 = z10;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        Window window;
        super.mo3164g8();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setLayout(AbstractC7786b.m30166j(980), AbstractC7786b.m30163g(736));
        }
    }

    @Override // la.InterfaceC5534b
    /* renamed from: i */
    public void mo22436i() {
        ((EditText) m26321N9(R$id.mEditVerificationCode)).requestFocus();
        ((TextView) m26321N9(R$id.mTextGetCode)).setEnabled(true);
        C6926a.m26890h("key_verifycode_bind_time", System.currentTimeMillis());
        m26316fa(180);
        C5881x c5881x = C5881x.f23415a;
        String m3172j7 = m3172j7(R$string.email_verifycode_sent);
        AbstractC5868k.m23673e(m3172j7, "getString(R.string.email_verifycode_sent)");
        String format = String.format(m3172j7, Arrays.copyOf(new Object[]{m26311V9(m26309T9(this, false, 1, null))}, 1));
        AbstractC5868k.m23673e(format, "format(format, *args)");
        m26315da(format, true);
    }

    @Override // la.InterfaceC5534b
    /* renamed from: k */
    public void mo22437k(String str) {
        String m3172j7 = null;
        DialogC6728k0 dialogC6728k0;
        AbstractC5868k.m23674f(str, "errCode");
        boolean z10 = true;
        ((TextView) m26321N9(R$id.mTextGetCode)).setEnabled(true);
        if (AbstractC5868k.m23669a(str, "aaa100077")) {
            Context m3096J6 = m3096J6();
            if (m3096J6 != null) {
                dialogC6728k0 = new DialogC6728k0(m3096J6, new i());
            } else {
                dialogC6728k0 = null;
            }
            if (dialogC6728k0 != null) {
                dialogC6728k0.show();
                return;
            }
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != -396102937) {
            if (hashCode != -338366941) {
                if (hashCode == -310215703 && str.equals("portal400001")) {
                    m3172j7 = m3172j7(R$string.account_not_suport_email);
                }
                C7559c1 c7559c1 = C7559c1.f27762a;
                Context m3096J62 = m3096J6();
                AbstractC5868k.m23671c(m3096J62);
                m3172j7 = C7559c1.m28982c(c7559c1, m3096J62, str, null, 4, null);
            } else {
                if (str.equals("aaa100003")) {
                    m3172j7 = m3172j7(R$string.email_input_not_exist);
                }
                C7559c1 c7559c12 = C7559c1.f27762a;
                Context m3096J622 = m3096J6();
                AbstractC5868k.m23671c(m3096J622);
                m3172j7 = C7559c1.m28982c(c7559c12, m3096J622, str, null, 4, null);
            }
        } else {
            if (str.equals("portal100073")) {
                m3172j7 = m3172j7(R$string.email_verify_code_failed);
            }
            C7559c1 c7559c122 = C7559c1.f27762a;
            Context m3096J6222 = m3096J6();
            AbstractC5868k.m23671c(m3096J6222);
            m3172j7 = C7559c1.m28982c(c7559c122, m3096J6222, str, null, 4, null);
        }
        AbstractC5868k.m23673e(m3172j7, "if (errCode == PortalErr…ext!!, errCode)\n        }");
        if (m3172j7.length() <= 0) {
            z10 = false;
        }
        if (z10) {
            m26315da(m3172j7, false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        Window window;
        AbstractC5868k.m23674f(view, "view");
        m26323X9();
        m26325Z9();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setSoftInputMode(2);
        }
        super.mo3176k8(view, bundle);
    }

    @Override // la.InterfaceC5534b
    /* renamed from: l */
    public void mo22438l(List list, String str, boolean z10) {
        AbstractC5868k.m23674f(list, "deviceList");
        AbstractC5868k.m23674f(str, "tempToken");
        if (z10) {
            ViewOnClickListenerC4802v viewOnClickListenerC4802v = this.f25777N0;
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
        m19851b.m19849V9(new f(m19851b));
        this.f25777N0 = m19851b;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d
    /* renamed from: o9 */
    public void mo3278o9() {
        InterfaceC5642a interfaceC5642a;
        super.mo3278o9();
        Disposable disposable = this.f25773J0;
        if (disposable != null) {
            AbstractC5868k.m23671c(disposable);
            if (!disposable.isDisposed()) {
                Disposable disposable2 = this.f25773J0;
                AbstractC5868k.m23671c(disposable2);
                disposable2.dispose();
            }
        }
        if (this.f25776M0 && (interfaceC5642a = this.f25774K0) != null) {
            interfaceC5642a.invoke();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        InterfaceC5642a interfaceC5642a;
        AbstractC5868k.m23674f(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        Disposable disposable = this.f25773J0;
        if (disposable != null) {
            AbstractC5868k.m23671c(disposable);
            if (!disposable.isDisposed()) {
                Disposable disposable2 = this.f25773J0;
                AbstractC5868k.m23671c(disposable2);
                disposable2.dispose();
            }
        }
        if (this.f25776M0 && (interfaceC5642a = this.f25774K0) != null) {
            interfaceC5642a.invoke();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC5868k.m23674f(view, "v");
        int id2 = view.getId();
        if (id2 == R$id.mBtnConfirm) {
            if (C1466m0.f5627a.m6829B() && !((CheckBox) m26321N9(R$id.mCheckBox)).isChecked()) {
                String m3172j7 = m3172j7(R$string.personal_please_agree_privacy_policy);
                AbstractC5868k.m23673e(m3172j7, "getString(R.string.perso…ase_agree_privacy_policy)");
                m26315da(m3172j7, false);
                return;
            }
            m26320ja();
            return;
        }
        if (id2 == R$id.mBtnCancel) {
            if (this.f25778O0) {
                C6926a c6926a = C6926a.f26260a;
                AbstractC0729o m3119R6 = m3119R6();
                AbstractC5868k.m23671c(m3119R6);
                C6926a.m26891k(c6926a, m3119R6, true, null, 4, null);
                mo3278o9();
                return;
            }
            mo3278o9();
            return;
        }
        if (id2 == R$id.mTextPolicy) {
            C6926a c6926a2 = C6926a.f26260a;
            AbstractC0729o m3093I6 = m3093I6();
            AbstractC5868k.m23673e(m3093I6, "childFragmentManager");
            c6926a2.m26905o(m3093I6);
        }
    }

    @Override // p102db.C4049j1.b
    public void onDismiss() {
        mo3279p9();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d
    /* renamed from: p9 */
    public void mo3279p9() {
        InterfaceC5642a interfaceC5642a;
        super.mo3279p9();
        Disposable disposable = this.f25773J0;
        if (disposable != null) {
            AbstractC5868k.m23671c(disposable);
            if (!disposable.isDisposed()) {
                Disposable disposable2 = this.f25773J0;
                AbstractC5868k.m23671c(disposable2);
                disposable2.dispose();
            }
        }
        if (this.f25776M0 && (interfaceC5642a = this.f25774K0) != null) {
            interfaceC5642a.invoke();
        }
    }

    @Override // p102db.C4049j1.b
    /* renamed from: s1 */
    public void mo17042s1() {
        m26322W9();
    }

    @Override // la.InterfaceC5534b
    /* renamed from: v */
    public void mo22439v(boolean z10) {
        String str = null;
        String str2 = null;
        ViewOnClickListenerC4802v viewOnClickListenerC4802v;
        if (z10 && (viewOnClickListenerC4802v = this.f25777N0) != null) {
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
        C7556b1.m28962j(c7556b1, m3110N8, str, "", str2, true, new h(), false, null, false, 384, null);
    }

    @Override // la.InterfaceC5534b
    /* renamed from: v0 */
    public void mo22440v0() {
        C4049j1 c4049j1 = this.f25775L0;
        if (c4049j1 != null) {
            ((AutoRelativeLayout) m26321N9(R$id.mLayoutContainer)).removeView(c4049j1);
        }
        ((AutoLinearLayout) m26321N9(R$id.mLayoutBind)).setVisibility(4);
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        C4049j1 c4049j12 = new C4049j1(m3096J6, null, 0, 6, null);
        this.f25775L0 = c4049j12;
        c4049j12.setSetPasswordCallback(this);
        ((AutoRelativeLayout) m26321N9(R$id.mLayoutContainer)).addView(this.f25775L0, 1);
    }

    @Override // p102db.C4049j1.b
    /* renamed from: v4 */
    public void mo17043v4(String str) {
        boolean z10 = false;
        AbstractC5868k.m23674f(str, "msg");
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ((DialogBottomBar) m26321N9(R$id.mBottomBar)).m12079e();
        } else {
            m26315da(str, false);
        }
    }
}
