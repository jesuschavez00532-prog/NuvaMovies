package p329s8;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AbstractActivityC0302c;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0729o;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.C1441a;
import cc.C1466m0;
import com.login.R$id;
import com.login.R$layout;
import com.login.R$string;
import com.login.R$style;
import com.login.p065ui.activity.ForcePasswordChangeActivity;
import com.module.event.LoginSuccessRequestDataEvent;
import com.module.view.DialogBottomBar;
import com.module.view.DropDownListView;
import com.module.view.LoadingView;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.request.bean.CloseForceChangePwdPageEvent;
import com.request.result.LoginResult;
import com.request.result.UserInfo;
import com.zhy.autolayout.AutoRelativeLayout;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import la.InterfaceC5536d;
import mc.C5634i;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import na.C5832c;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5876s;
import ne.C5881x;
import p102db.C4049j1;
import p170i2.C4842a;
import p302qc.C6448c;
import p340t8.C6926a;
import p359ue.AbstractC7166t;
import p359ue.AbstractC7167u;
import p400xa.AbstractC7557c;
import p400xa.C7559c1;
import p400xa.C7615w;
import p430z9.C7767e;
import p433zd.AbstractC7786b;
import va.InterfaceC7251a;
import ye.C7709c;

/* renamed from: s8.k1 */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC6729k1 extends C7767e implements View.OnClickListener, InterfaceC5536d, C4049j1.b {

    /* renamed from: G0 */
    private View f25841G0;

    /* renamed from: J0 */
    private final InterfaceC1312h f25844J0;

    /* renamed from: K0 */
    private String f25845K0;

    /* renamed from: L0 */
    private boolean f25846L0;

    /* renamed from: M0 */
    private Disposable f25847M0;

    /* renamed from: N0 */
    private C4049j1 f25848N0;

    /* renamed from: O0 */
    public Map f25849O0 = new LinkedHashMap();

    /* renamed from: F0 */
    private final String f25840F0 = ViewOnClickListenerC6729k1.class.getSimpleName();

    /* renamed from: H0 */
    private String f25842H0 = "";

    /* renamed from: I0 */
    private String f25843I0 = "";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s8.k1$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {
        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m26404a(ArrayList arrayList) {
            boolean z10 = false;
            AbstractC5868k.m23674f(arrayList, "it");
            if (ViewOnClickListenerC6729k1.this.m3075C6() != null) {
                AbstractActivityC0712e m3075C6 = ViewOnClickListenerC6729k1.this.m3075C6();
                if (m3075C6 != null) {
                    z10 = m3075C6.isFinishing();
                } else {
                    z10 = true;
                }
                if (!z10 && !ViewOnClickListenerC6729k1.this.m3192t7()) {
                    ViewOnClickListenerC6729k1 viewOnClickListenerC6729k1 = ViewOnClickListenerC6729k1.this;
                    int i10 = R$id.mDpView;
                    if (TextUtils.isEmpty(((DropDownListView) viewOnClickListenerC6729k1.m26400L9(i10)).getText())) {
                        DropDownListView dropDownListView = (DropDownListView) ViewOnClickListenerC6729k1.this.m26400L9(i10);
                        Object obj = arrayList.get(0);
                        AbstractC5868k.m23673e(obj, "it[0]");
                        dropDownListView.setText((String) obj);
                    }
                    ((DropDownListView) ViewOnClickListenerC6729k1.this.m26400L9(i10)).m12090d(arrayList);
                }
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26404a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: s8.k1$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5832c invoke() {
            return new C5832c(ViewOnClickListenerC6729k1.this);
        }
    }

    /* renamed from: s8.k1$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f25852a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m26406a(LoginResult loginResult) {
            C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(true, false, null, 6, null));
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26406a((LoginResult) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: s8.k1$d */
    /* loaded from: classes2.dex */
    public static final class d implements TextWatcher {
        d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((DialogBottomBar) ViewOnClickListenerC6729k1.this.m26400L9(R$id.mBottomBar)).m12079e();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s8.k1$e */
    /* loaded from: classes2.dex */
    public static final class e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ C5876s f25855b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C5876s c5876s) {
            super(1);
            this.f25855b = c5876s;
        }

        /* renamed from: a */
        public final void m26407a(Long l10) {
            TextView textView = (TextView) ViewOnClickListenerC6729k1.this.m26400L9(R$id.mTextGetCode);
            C5881x c5881x = C5881x.f23415a;
            String m3172j7 = ViewOnClickListenerC6729k1.this.m3172j7(R$string.dialog_verification_send_time);
            AbstractC5868k.m23673e(m3172j7, "getString(R.string.dialog_verification_send_time)");
            String format = String.format(m3172j7, Arrays.copyOf(new Object[]{Integer.valueOf(this.f25855b.f23410a)}, 1));
            AbstractC5868k.m23673e(format, "format(format, *args)");
            textView.setText(format);
            C5876s c5876s = this.f25855b;
            c5876s.f23410a--;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26407a((Long) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s8.k1$f */
    /* loaded from: classes2.dex */
    public static final class f extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final f f25856a = new f();

        f() {
            super(1);
        }

        /* renamed from: a */
        public final void m26408a(Throwable th) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26408a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    public ViewOnClickListenerC6729k1() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(new b());
        this.f25844J0 = m5965b;
        this.f25845K0 = "";
        this.f25846L0 = true;
    }

    /* renamed from: M9 */
    private final String m26388M9(boolean z10) {
        String m27728o = null;
        String m27728o2 = null;
        String email = null;
        if (this.f25846L0) {
            UserInfo m6887v = C1466m0.f5627a.m6887v();
            if (m6887v == null || (email = m6887v.getEmail()) == null) {
                return "";
            }
            return email;
        }
        if (z10) {
            m27728o2 = AbstractC7166t.m27728o(((EditText) m26400L9(R$id.mEditEmail)).getText().toString(), " ", "", false, 4, null);
            return m27728o2 + ((DropDownListView) m26400L9(R$id.mDpView)).getText();
        }
        m27728o = AbstractC7166t.m27728o(((EditText) m26400L9(R$id.mEditEmail)).getText().toString(), " ", "", false, 4, null);
        return m27728o;
    }

    /* renamed from: N9 */
    static /* synthetic */ String m26389N9(ViewOnClickListenerC6729k1 viewOnClickListenerC6729k1, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return viewOnClickListenerC6729k1.m26388M9(z10);
    }

    /* renamed from: O9 */
    private final C5832c m26390O9() {
        return (C5832c) this.f25844J0.getValue();
    }

    /* renamed from: P9 */
    private final String m26391P9(String str) {
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

    /* renamed from: R9 */
    private final void m26392R9() {
        C7615w c7615w = C7615w.f27995a;
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        c7615w.m29311S(m3096J6, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U9 */
    public static final void m26393U9(ViewOnClickListenerC6729k1 viewOnClickListenerC6729k1, View view, boolean z10) {
        AbstractC5868k.m23674f(viewOnClickListenerC6729k1, "this$0");
        if (z10) {
            ((DialogBottomBar) viewOnClickListenerC6729k1.m26400L9(R$id.mBottomBar)).m12079e();
        }
    }

    /* renamed from: V9 */
    private final void m26394V9(String str, boolean z10) {
        DialogBottomBar.EnumC2998a enumC2998a;
        DialogBottomBar dialogBottomBar = (DialogBottomBar) m26400L9(R$id.mBottomBar);
        if (z10) {
            enumC2998a = DialogBottomBar.EnumC2998a.SUCCESS;
        } else {
            enumC2998a = DialogBottomBar.EnumC2998a.FAIL;
        }
        dialogBottomBar.m12080g(str, enumC2998a);
    }

    /* renamed from: W9 */
    private final void m26395W9(int i10) {
        C5876s c5876s = new C5876s();
        c5876s.f23410a = i10;
        Observable<Long> observeOn = Observable.interval(0L, 1L, TimeUnit.SECONDS).take(i10 + 1).observeOn(AndroidSchedulers.mainThread());
        final e eVar = new e(c5876s);
        Consumer<? super Long> consumer = new Consumer() { // from class: s8.h1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ViewOnClickListenerC6729k1.m26396X9(InterfaceC5660l.this, obj);
            }
        };
        final f fVar = f.f25856a;
        this.f25847M0 = observeOn.subscribe(consumer, new Consumer() { // from class: s8.i1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ViewOnClickListenerC6729k1.m26397Y9(InterfaceC5660l.this, obj);
            }
        }, new Action() { // from class: s8.j1
            @Override // io.reactivex.functions.Action
            public final void run() {
                ViewOnClickListenerC6729k1.m26398Z9(ViewOnClickListenerC6729k1.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X9 */
    public static final void m26396X9(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y9 */
    public static final void m26397Y9(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z9 */
    public static final void m26398Z9(ViewOnClickListenerC6729k1 viewOnClickListenerC6729k1) {
        String str = null;
        Resources resources;
        AbstractC5868k.m23674f(viewOnClickListenerC6729k1, "this$0");
        TextView textView = (TextView) viewOnClickListenerC6729k1.m26400L9(R$id.mTextGetCode);
        Context m3096J6 = viewOnClickListenerC6729k1.m3096J6();
        if (m3096J6 != null && (resources = m3096J6.getResources()) != null) {
            str = resources.getString(R$string.dialog_get_verification_code);
        } else {
            str = null;
        }
        textView.setText(str);
    }

    /* renamed from: aa */
    private final void m26399aa() {
        CharSequence m27758b0;
        this.f25842H0 = m26389N9(this, false, 1, null);
        Editable text = ((EditText) m26400L9(R$id.mEditVerificationCode)).getText();
        AbstractC5868k.m23673e(text, "mEditVerificationCode.text");
        m27758b0 = AbstractC7167u.m27758b0(text);
        this.f25843I0 = m27758b0.toString();
        if (TextUtils.isEmpty(m26388M9(false))) {
            String m3172j7 = m3172j7(R$string.personal_email_or_verification_code_empty);
            AbstractC5868k.m23673e(m3172j7, "getString(R.string.perso…_verification_code_empty)");
            m26394V9(m3172j7, false);
            return;
        }
        if (TextUtils.isEmpty(this.f25843I0)) {
            String m3172j72 = m3172j7(R$string.personal_verification_code_empty);
            AbstractC5868k.m23673e(m3172j72, "getString(R.string.perso…_verification_code_empty)");
            m26394V9(m3172j72, false);
            return;
        }
        if (TextUtils.isEmpty(m26388M9(false))) {
            String m3172j73 = m3172j7(R$string.email_input_must_not_empty);
            AbstractC5868k.m23673e(m3172j73, "getString(R.string.email_input_must_not_empty)");
            m26394V9(m3172j73, false);
        } else if (!AbstractC7557c.m28974b(this.f25842H0)) {
            String m3172j74 = m3172j7(R$string.account_incorrect_email);
            AbstractC5868k.m23673e(m3172j74, "getString(R.string.account_incorrect_email)");
            m26394V9(m3172j74, false);
        } else {
            if (TextUtils.isEmpty(this.f25843I0)) {
                String m3172j75 = m3172j7(R$string.phone_please_input_verifitation_code);
                AbstractC5868k.m23673e(m3172j75, "getString(R.string.phone…_input_verifitation_code)");
                m26394V9(m3172j75, false);
                return;
            }
            m26390O9().m23583K(this.f25842H0, this.f25843I0);
        }
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f25849O0.clear();
    }

    @Override // la.InterfaceC5536d
    /* renamed from: I1 */
    public void mo22446I1(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f25845K0 = str;
        C4049j1 c4049j1 = this.f25848N0;
        if (c4049j1 != null) {
            c4049j1.m17040n(m26391P9(m26389N9(this, false, 1, null)), 1);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.InputPasswordDialog);
    }

    /* renamed from: L9 */
    public View m26400L9(int i10) {
        View findViewById;
        Map map = this.f25849O0;
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
        View inflate = layoutInflater.inflate(R$layout.dialog_retrieve_password, viewGroup, false);
        this.f25841G0 = inflate;
        return inflate;
    }

    @Override // p102db.C4049j1.b
    /* renamed from: Q0 */
    public void mo17041Q0(String str) {
        AbstractC5868k.m23674f(str, "password");
        m26390O9().m23582J3(m26389N9(this, false, 1, null), C4842a.f20329a.m19920a().mo19949Z(str), this.f25843I0);
    }

    /* renamed from: Q9 */
    public void m26401Q9() {
        C4049j1 c4049j1 = this.f25848N0;
        if (c4049j1 != null) {
            ((AutoRelativeLayout) m26400L9(R$id.mLayoutContainer)).removeView(c4049j1);
        }
        ((AutoRelativeLayout) m26400L9(R$id.mLayoutRetrieve)).setVisibility(0);
        this.f25848N0 = null;
    }

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo16979F9();
    }

    /* renamed from: S9 */
    public final void m26402S9(boolean z10) {
        this.f25846L0 = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0128  */
    /* renamed from: T9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m26403T9() {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p329s8.ViewOnClickListenerC6729k1.m26403T9():void");
    }

    @Override // la.InterfaceC5536d
    /* renamed from: a */
    public void mo22447a() {
        ((LoadingView) m26400L9(R$id.mLoadingView)).setVisibility(0);
        ((Button) m26400L9(R$id.mBtnNext)).setEnabled(false);
        ((EditText) m26400L9(R$id.mEditEmail)).setEnabled(false);
    }

    @Override // la.InterfaceC5536d
    /* renamed from: b */
    public void mo22448b() {
        ((LoadingView) m26400L9(R$id.mLoadingView)).setVisibility(8);
        ((Button) m26400L9(R$id.mBtnNext)).setEnabled(true);
        ((EditText) m26400L9(R$id.mEditEmail)).setEnabled(true);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        Window window;
        super.mo3164g8();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setLayout(AbstractC7786b.m30166j(980), AbstractC7786b.m30163g(700));
        }
    }

    @Override // la.InterfaceC5536d
    /* renamed from: h5 */
    public void mo22449h5() {
        this.f25845K0 = "forcePwd";
        C6448c m25254t = C5634i.m22843d("http://module_login/ForcePasswordChangeActivity").m25254t(262144);
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        C6448c.m25240q(m25254t, m3096J6, null, 2, null);
        mo3279p9();
    }

    @Override // la.InterfaceC5536d
    /* renamed from: i */
    public void mo22450i() {
        ((EditText) m26400L9(R$id.mEditVerificationCode)).requestFocus();
        ((TextView) m26400L9(R$id.mTextGetCode)).setEnabled(true);
        C6926a.m26890h("key_verifycode_bind_time", System.currentTimeMillis());
        m26395W9(180);
        C5881x c5881x = C5881x.f23415a;
        String m3172j7 = m3172j7(R$string.email_verifycode_sent);
        AbstractC5868k.m23673e(m3172j7, "getString(R.string.email_verifycode_sent)");
        String format = String.format(m3172j7, Arrays.copyOf(new Object[]{m26391P9(m26389N9(this, false, 1, null))}, 1));
        AbstractC5868k.m23673e(format, "format(format, *args)");
        m26394V9(format, true);
    }

    @Override // la.InterfaceC5536d
    /* renamed from: k */
    public void mo22451k(String str) {
        String m3172j7 = null;
        AbstractC5868k.m23674f(str, "errCode");
        boolean z10 = true;
        ((TextView) m26400L9(R$id.mTextGetCode)).setEnabled(true);
        int hashCode = str.hashCode();
        if (hashCode != -396102937) {
            if (hashCode != -338366941) {
                if (hashCode == -310215703 && str.equals("portal400001")) {
                    m3172j7 = m3172j7(R$string.account_not_suport_email);
                }
                C7559c1 c7559c1 = C7559c1.f27762a;
                Context m3096J6 = m3096J6();
                AbstractC5868k.m23671c(m3096J6);
                m3172j7 = C7559c1.m28982c(c7559c1, m3096J6, str, null, 4, null);
            } else {
                if (str.equals("aaa100003")) {
                    m3172j7 = m3172j7(R$string.email_input_not_exist);
                }
                C7559c1 c7559c12 = C7559c1.f27762a;
                Context m3096J62 = m3096J6();
                AbstractC5868k.m23671c(m3096J62);
                m3172j7 = C7559c1.m28982c(c7559c12, m3096J62, str, null, 4, null);
            }
        } else {
            if (str.equals("portal100073")) {
                m3172j7 = m3172j7(R$string.email_verify_code_failed);
            }
            C7559c1 c7559c122 = C7559c1.f27762a;
            Context m3096J622 = m3096J6();
            AbstractC5868k.m23671c(m3096J622);
            m3172j7 = C7559c1.m28982c(c7559c122, m3096J622, str, null, 4, null);
        }
        AbstractC5868k.m23673e(m3172j7, "if (errCode == PortalErr…ext!!, errCode)\n        }");
        if (m3172j7.length() <= 0) {
            z10 = false;
        }
        if (z10) {
            m26394V9(m3172j7, false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        Window window;
        AbstractC5868k.m23674f(view, "view");
        m26392R9();
        m26403T9();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setSoftInputMode(2);
        }
        super.mo3176k8(view, bundle);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        Disposable disposable = this.f25847M0;
        if (disposable != null) {
            AbstractC5868k.m23671c(disposable);
            if (!disposable.isDisposed()) {
                Disposable disposable2 = this.f25847M0;
                AbstractC5868k.m23671c(disposable2);
                disposable2.dispose();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str = null;
        Resources resources;
        AbstractC5868k.m23674f(view, "v");
        int id2 = view.getId();
        if (id2 == R$id.mBtnNext) {
            m26399aa();
            return;
        }
        int i10 = R$id.mTextGetCode;
        if (id2 == i10) {
            CharSequence text = ((TextView) m26400L9(i10)).getText();
            Context m3096J6 = m3096J6();
            if (m3096J6 != null && (resources = m3096J6.getResources()) != null) {
                str = resources.getString(R$string.dialog_get_verification_code);
            } else {
                str = null;
            }
            if (!AbstractC5868k.m23669a(text, str)) {
                return;
            }
            String m26389N9 = m26389N9(this, false, 1, null);
            this.f25842H0 = m26389N9;
            if (!AbstractC7557c.m28974b(m26389N9)) {
                String m3172j7 = m3172j7(R$string.account_incorrect_email);
                AbstractC5868k.m23673e(m3172j7, "getString(R.string.account_incorrect_email)");
                m26394V9(m3172j7, false);
            } else {
                m26390O9().m23584e0(this.f25842H0);
                ((TextView) m26400L9(i10)).setEnabled(false);
            }
        }
    }

    @Override // p102db.C4049j1.b
    public void onDismiss() {
        mo3279p9();
    }

    @Override // p102db.C4049j1.b
    /* renamed from: s1 */
    public void mo17042s1() {
        m26401Q9();
    }

    @Override // la.InterfaceC5536d
    /* renamed from: v0 */
    public void mo22452v0() {
        C4049j1 c4049j1 = this.f25848N0;
        if (c4049j1 != null) {
            ((AutoRelativeLayout) m26400L9(R$id.mLayoutContainer)).removeView(c4049j1);
        }
        ((AutoRelativeLayout) m26400L9(R$id.mLayoutRetrieve)).setVisibility(4);
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        C4049j1 c4049j12 = new C4049j1(m3096J6, null, 0, 6, null);
        this.f25848N0 = c4049j12;
        c4049j12.setSetPasswordCallback(this);
        ((AutoRelativeLayout) m26400L9(R$id.mLayoutContainer)).addView(this.f25848N0, 1);
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
            ((DialogBottomBar) m26400L9(R$id.mBottomBar)).m12079e();
        } else {
            m26394V9(str, false);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        AbstractC0729o m3294d4;
        InterfaceC7251a interfaceC7251a;
        AbstractC5868k.m23674f(dialogInterface, "dialog");
        if (AbstractC5868k.m23669a(this.f25845K0, "isNotLogin")) {
            Activity m6706d = C1441a.f5552a.m6706d(ForcePasswordChangeActivity.class);
            AbstractActivityC0302c abstractActivityC0302c = m6706d instanceof AbstractActivityC0302c ? (AbstractActivityC0302c) m6706d : null;
            if (abstractActivityC0302c != null && (m3294d4 = abstractActivityC0302c.m3294d4()) != null && (interfaceC7251a = (InterfaceC7251a) C5634i.m22844e(InterfaceC7251a.class, new Object[0])) != null) {
                interfaceC7251a.mo25622b(m3294d4, false, this.f25845K0, c.f25852a);
            }
        }
        if ((this.f25845K0.length() > 0) && !AbstractC5868k.m23669a(this.f25845K0, "forcePwd")) {
            C7709c.m29787d().m29801m(new CloseForceChangePwdPageEvent());
        }
        super.onDismiss(dialogInterface);
    }
}
