package p329s8;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
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
import com.zhy.autolayout.AutoRelativeLayout;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import la.InterfaceC5535c;
import mc.C5634i;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import na.C5831b;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5874q;
import ne.C5876s;
import ne.C5881x;
import p170i2.C4842a;
import p317rb.AbstractC6567a;
import p340t8.C6926a;
import p359ue.AbstractC7166t;
import p359ue.AbstractC7167u;
import p400xa.AbstractC7555b0;
import p400xa.AbstractC7557c;
import p400xa.C7559c1;
import p400xa.C7615w;
import p430z9.C7767e;
import p433zd.AbstractC7786b;
import va.InterfaceC7251a;
import ye.C7709c;

/* renamed from: s8.y */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC6769y extends C7767e implements View.OnClickListener, InterfaceC5535c {

    /* renamed from: G0 */
    private View f26044G0;

    /* renamed from: I0 */
    private final InterfaceC1312h f26046I0;

    /* renamed from: J0 */
    private Disposable f26047J0;

    /* renamed from: K0 */
    public Map f26048K0 = new LinkedHashMap();

    /* renamed from: F0 */
    private final String f26043F0 = ViewOnClickListenerC6769y.class.getSimpleName();

    /* renamed from: H0 */
    private String f26045H0 = "";

    /* renamed from: s8.y$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5831b invoke() {
            return new C5831b(ViewOnClickListenerC6769y.this);
        }
    }

    /* renamed from: s8.y$b */
    /* loaded from: classes2.dex */
    public static final class b implements TextWatcher {
        b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((DialogBottomBar) ViewOnClickListenerC6769y.this.m26638M9(R$id.mBottomBar)).m12079e();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s8.y$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ C5874q f26052b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C5874q c5874q) {
            super(1);
            this.f26052b = c5874q;
        }

        /* renamed from: a */
        public final void m26641a(ArrayList arrayList) {
            boolean z10;
            AbstractC5868k.m23674f(arrayList, "it");
            C7615w c7615w = C7615w.f27995a;
            String m29317x = c7615w.m29317x(ViewOnClickListenerC6769y.this.f26045H0);
            C5874q c5874q = this.f26052b;
            if (m29317x != null) {
                z10 = arrayList.contains(m29317x);
            } else {
                z10 = false;
            }
            c5874q.f23408a = z10;
            if (!AbstractC7557c.m28974b(ViewOnClickListenerC6769y.this.f26045H0)) {
                ViewOnClickListenerC6769y viewOnClickListenerC6769y = ViewOnClickListenerC6769y.this;
                String m3172j7 = viewOnClickListenerC6769y.m3172j7(R$string.account_incorrect_email);
                AbstractC5868k.m23673e(m3172j7, "getString(R.string.account_incorrect_email)");
                viewOnClickListenerC6769y.m26632X9(m3172j7, false);
                return;
            }
            String m29302F = c7615w.m29302F();
            Locale locale = Locale.getDefault();
            AbstractC5868k.m23673e(locale, "getDefault()");
            String lowerCase = m29302F.toLowerCase(locale);
            AbstractC5868k.m23673e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String str = ViewOnClickListenerC6769y.this.f26045H0;
            Locale locale2 = Locale.getDefault();
            AbstractC5868k.m23673e(locale2, "getDefault()");
            String lowerCase2 = str.toLowerCase(locale2);
            AbstractC5868k.m23673e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (AbstractC5868k.m23669a(lowerCase, lowerCase2)) {
                ViewOnClickListenerC6769y viewOnClickListenerC6769y2 = ViewOnClickListenerC6769y.this;
                String m3172j72 = viewOnClickListenerC6769y2.m3172j7(R$string.account_same_with_service_email);
                AbstractC5868k.m23673e(m3172j72, "getString(R.string.accou…_same_with_service_email)");
                viewOnClickListenerC6769y2.m26632X9(m3172j72, false);
                return;
            }
            if (!this.f26052b.f23408a) {
                ViewOnClickListenerC6769y viewOnClickListenerC6769y3 = ViewOnClickListenerC6769y.this;
                String m3172j73 = viewOnClickListenerC6769y3.m3172j7(R$string.account_not_suport_email);
                AbstractC5868k.m23673e(m3172j73, "getString(R.string.account_not_suport_email)");
                viewOnClickListenerC6769y3.m26632X9(m3172j73, false);
                return;
            }
            ((TextView) ViewOnClickListenerC6769y.this.m26638M9(R$id.mTextGetCode)).setEnabled(false);
            ViewOnClickListenerC6769y.this.m26628S9().m23571e0(ViewOnClickListenerC6769y.this.f26045H0);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26641a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s8.y$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {
        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m26642a(ArrayList arrayList) {
            AbstractC5868k.m23674f(arrayList, "completeList");
            if (!AbstractC6567a.m25635e(arrayList) && ViewOnClickListenerC6769y.this.m3075C6() != null) {
                AbstractActivityC0712e m3075C6 = ViewOnClickListenerC6769y.this.m3075C6();
                AbstractC5868k.m23671c(m3075C6);
                if (!m3075C6.isFinishing()) {
                    ((AutoEmailCompleteRecyclerView) ViewOnClickListenerC6769y.this.m26638M9(R$id.mRvCompleteList)).setCompleteList(arrayList);
                }
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26642a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: s8.y$e */
    /* loaded from: classes2.dex */
    public static final class e implements TextWatcher {
        e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z10;
            boolean z11;
            boolean z12 = false;
            String m26627R9 = ViewOnClickListenerC6769y.m26627R9(ViewOnClickListenerC6769y.this, false, 1, null);
            TextView textView = (TextView) ViewOnClickListenerC6769y.this.m26638M9(R$id.mTextGetCode);
            if (m26627R9.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                Editable text = ((EditText) ViewOnClickListenerC6769y.this.m26638M9(R$id.mEditPassword)).getText();
                AbstractC5868k.m23673e(text, "mEditPassword.text");
                if (text.length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    z12 = true;
                }
            }
            textView.setEnabled(z12);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* renamed from: s8.y$f */
    /* loaded from: classes2.dex */
    public static final class f implements TextWatcher {
        f() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z10;
            boolean z11;
            boolean z12 = false;
            String m26627R9 = ViewOnClickListenerC6769y.m26627R9(ViewOnClickListenerC6769y.this, false, 1, null);
            TextView textView = (TextView) ViewOnClickListenerC6769y.this.m26638M9(R$id.mTextGetCode);
            if (m26627R9.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                Editable text = ((EditText) ViewOnClickListenerC6769y.this.m26638M9(R$id.mEditPassword)).getText();
                AbstractC5868k.m23673e(text, "mEditPassword.text");
                if (text.length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    z12 = true;
                }
            }
            textView.setEnabled(z12);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* renamed from: s8.y$g */
    /* loaded from: classes2.dex */
    static final class g extends AbstractC5869l implements InterfaceC5642a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: s8.y$g$a */
        /* loaded from: classes2.dex */
        public static final class a extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            final /* synthetic */ ViewOnClickListenerC6769y f26057a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ViewOnClickListenerC6769y viewOnClickListenerC6769y) {
                super(1);
                this.f26057a = viewOnClickListenerC6769y;
            }

            /* renamed from: a */
            public final void m26644a(LoginResult loginResult) {
                this.f26057a.mo3279p9();
                C1466m0.f5627a.m6849V(true);
                C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(true, false, null, 6, null));
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m26644a((LoginResult) obj);
                return C1328x.f4998a;
            }
        }

        g() {
            super(0);
        }

        /* renamed from: a */
        public final void m26643a() {
            InterfaceC7251a interfaceC7251a = (InterfaceC7251a) C5634i.m22844e(InterfaceC7251a.class, new Object[0]);
            if (interfaceC7251a != null) {
                AbstractC0729o m3093I6 = ViewOnClickListenerC6769y.this.m3093I6();
                AbstractC5868k.m23673e(m3093I6, "childFragmentManager");
                InterfaceC7251a.a.m28064a(interfaceC7251a, m3093I6, true, null, new a(ViewOnClickListenerC6769y.this), 4, null);
            }
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m26643a();
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s8.y$h */
    /* loaded from: classes2.dex */
    public static final class h extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ C5876s f26059b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C5876s c5876s) {
            super(1);
            this.f26059b = c5876s;
        }

        /* renamed from: a */
        public final void m26645a(Long l10) {
            TextView textView = (TextView) ViewOnClickListenerC6769y.this.m26638M9(R$id.mTextGetCode);
            C5881x c5881x = C5881x.f23415a;
            String m3172j7 = ViewOnClickListenerC6769y.this.m3172j7(R$string.dialog_verification_send_time);
            AbstractC5868k.m23673e(m3172j7, "getString(R.string.dialog_verification_send_time)");
            String format = String.format(m3172j7, Arrays.copyOf(new Object[]{Integer.valueOf(this.f26059b.f23410a)}, 1));
            AbstractC5868k.m23673e(format, "format(format, *args)");
            textView.setText(format);
            C5876s c5876s = this.f26059b;
            c5876s.f23410a--;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26645a((Long) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s8.y$i */
    /* loaded from: classes2.dex */
    public static final class i extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final i f26060a = new i();

        i() {
            super(1);
        }

        /* renamed from: a */
        public final void m26646a(Throwable th) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26646a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    public ViewOnClickListenerC6769y() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(new a());
        this.f26046I0 = m5965b;
    }

    /* renamed from: Q9 */
    private final String m26626Q9(boolean z10) {
        String m27728o;
        m27728o = AbstractC7166t.m27728o(((AutoCompleteEditView) m26638M9(R$id.mEditNewEmail)).getText().toString(), " ", "", false, 4, null);
        return m27728o;
    }

    /* renamed from: R9 */
    static /* synthetic */ String m26627R9(ViewOnClickListenerC6769y viewOnClickListenerC6769y, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return viewOnClickListenerC6769y.m26626Q9(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S9 */
    public final C5831b m26628S9() {
        return (C5831b) this.f26046I0.getValue();
    }

    /* renamed from: T9 */
    private final String m26629T9(String str) {
        int m27735E;
        boolean z10;
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
    /* renamed from: V9 */
    public static final void m26630V9(ViewOnClickListenerC6769y viewOnClickListenerC6769y, View view) {
        String str;
        Resources resources;
        AbstractC5868k.m23674f(viewOnClickListenerC6769y, "this$0");
        int i10 = R$id.mTextGetCode;
        CharSequence text = ((TextView) viewOnClickListenerC6769y.m26638M9(i10)).getText();
        Context m3096J6 = viewOnClickListenerC6769y.m3096J6();
        if (m3096J6 != null && (resources = m3096J6.getResources()) != null) {
            str = resources.getString(R$string.dialog_get_verification_code);
        } else {
            str = null;
        }
        if (!AbstractC5868k.m23669a(text, str)) {
            return;
        }
        C5874q c5874q = new C5874q();
        String m26627R9 = m26627R9(viewOnClickListenerC6769y, false, 1, null);
        viewOnClickListenerC6769y.f26045H0 = m26627R9;
        C7615w c7615w = C7615w.f27995a;
        if (AbstractC6567a.m25637g(c7615w.m29317x(m26627R9))) {
            if (!AbstractC7557c.m28974b(viewOnClickListenerC6769y.f26045H0)) {
                String m3172j7 = viewOnClickListenerC6769y.m3172j7(R$string.account_incorrect_email);
                AbstractC5868k.m23673e(m3172j7, "getString(R.string.account_incorrect_email)");
                viewOnClickListenerC6769y.m26632X9(m3172j7, false);
                return;
            }
            String m29302F = c7615w.m29302F();
            Locale locale = Locale.getDefault();
            AbstractC5868k.m23673e(locale, "getDefault()");
            String lowerCase = m29302F.toLowerCase(locale);
            AbstractC5868k.m23673e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String str2 = viewOnClickListenerC6769y.f26045H0;
            Locale locale2 = Locale.getDefault();
            AbstractC5868k.m23673e(locale2, "getDefault()");
            String lowerCase2 = str2.toLowerCase(locale2);
            AbstractC5868k.m23673e(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (AbstractC5868k.m23669a(lowerCase, lowerCase2)) {
                String m3172j72 = viewOnClickListenerC6769y.m3172j7(R$string.account_same_with_service_email);
                AbstractC5868k.m23673e(m3172j72, "getString(R.string.accou…_same_with_service_email)");
                viewOnClickListenerC6769y.m26632X9(m3172j72, false);
                return;
            } else {
                ((TextView) viewOnClickListenerC6769y.m26638M9(i10)).setEnabled(false);
                viewOnClickListenerC6769y.m26628S9().m23571e0(viewOnClickListenerC6769y.f26045H0);
                return;
            }
        }
        Context m3096J62 = viewOnClickListenerC6769y.m3096J6();
        if (m3096J62 != null) {
            c7615w.m29311S(m3096J62, new c(c5874q));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W9 */
    public static final boolean m26631W9(ViewOnClickListenerC6769y viewOnClickListenerC6769y, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(viewOnClickListenerC6769y, "this$0");
        if (keyEvent.getAction() == 0 && i10 == 20) {
            int i11 = R$id.mRvCompleteList;
            if (((AutoEmailCompleteRecyclerView) viewOnClickListenerC6769y.m26638M9(i11)).getVisibility() == 0 && !((AutoEmailCompleteRecyclerView) viewOnClickListenerC6769y.m26638M9(i11)).m12068f()) {
                ((AutoEmailCompleteRecyclerView) viewOnClickListenerC6769y.m26638M9(i11)).requestFocus();
                return true;
            }
            int i12 = R$id.mTextGetCode;
            if (((TextView) viewOnClickListenerC6769y.m26638M9(i12)).isEnabled()) {
                ((TextView) viewOnClickListenerC6769y.m26638M9(i12)).requestFocus();
            } else {
                ((Button) viewOnClickListenerC6769y.m26638M9(R$id.mBtnConfirm)).requestFocus();
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X9 */
    public final void m26632X9(String str, boolean z10) {
        DialogBottomBar.EnumC2998a enumC2998a;
        DialogBottomBar dialogBottomBar = (DialogBottomBar) m26638M9(R$id.mBottomBar);
        if (z10) {
            enumC2998a = DialogBottomBar.EnumC2998a.SUCCESS;
        } else {
            enumC2998a = DialogBottomBar.EnumC2998a.FAIL;
        }
        dialogBottomBar.m12080g(str, enumC2998a);
    }

    /* renamed from: Y9 */
    private final void m26633Y9(int i10) {
        C5876s c5876s = new C5876s();
        c5876s.f23410a = i10;
        Observable<Long> observeOn = Observable.interval(0L, 1L, TimeUnit.SECONDS).take(i10 + 1).observeOn(AndroidSchedulers.mainThread());
        final h hVar = new h(c5876s);
        Consumer<? super Long> consumer = new Consumer() { // from class: s8.t
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ViewOnClickListenerC6769y.m26634Z9(InterfaceC5660l.this, obj);
            }
        };
        final i iVar = i.f26060a;
        this.f26047J0 = observeOn.subscribe(consumer, new Consumer() { // from class: s8.u
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ViewOnClickListenerC6769y.m26635aa(InterfaceC5660l.this, obj);
            }
        }, new Action() { // from class: s8.v
            @Override // io.reactivex.functions.Action
            public final void run() {
                ViewOnClickListenerC6769y.m26636ba(ViewOnClickListenerC6769y.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z9 */
    public static final void m26634Z9(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aa */
    public static final void m26635aa(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ba */
    public static final void m26636ba(ViewOnClickListenerC6769y viewOnClickListenerC6769y) {
        String str;
        Resources resources;
        AbstractC5868k.m23674f(viewOnClickListenerC6769y, "this$0");
        TextView textView = (TextView) viewOnClickListenerC6769y.m26638M9(R$id.mTextGetCode);
        Context m3096J6 = viewOnClickListenerC6769y.m3096J6();
        if (m3096J6 != null && (resources = m3096J6.getResources()) != null) {
            str = resources.getString(R$string.dialog_get_verification_code);
        } else {
            str = null;
        }
        textView.setText(str);
    }

    /* renamed from: ca */
    private final void m26637ca() {
        CharSequence m27758b0;
        CharSequence m27758b02;
        this.f26045H0 = m26627R9(this, false, 1, null);
        m27758b0 = AbstractC7167u.m27758b0(((EditText) m26638M9(R$id.mEditPassword)).getText().toString());
        String obj = m27758b0.toString();
        Editable text = ((EditText) m26638M9(R$id.mEditVerificationCode)).getText();
        AbstractC5868k.m23673e(text, "mEditVerificationCode.text");
        m27758b02 = AbstractC7167u.m27758b0(text);
        String obj2 = m27758b02.toString();
        if (TextUtils.isEmpty(m26626Q9(false))) {
            String m3172j7 = m3172j7(R$string.personal_email_or_verification_code_empty);
            AbstractC5868k.m23673e(m3172j7, "getString(R.string.perso…_verification_code_empty)");
            m26632X9(m3172j7, false);
            return;
        }
        if (TextUtils.isEmpty(obj2)) {
            String m3172j72 = m3172j7(R$string.personal_verification_code_empty);
            AbstractC5868k.m23673e(m3172j72, "getString(R.string.perso…_verification_code_empty)");
            m26632X9(m3172j72, false);
            return;
        }
        if (!AbstractC7557c.m28976d(obj)) {
            String m3172j73 = m3172j7(R$string.password_format_wrong);
            AbstractC5868k.m23673e(m3172j73, "getString(R.string.password_format_wrong)");
            m26632X9(m3172j73, false);
            return;
        }
        if (TextUtils.isEmpty(m26626Q9(false))) {
            String m3172j74 = m3172j7(R$string.email_input_must_not_empty);
            AbstractC5868k.m23673e(m3172j74, "getString(R.string.email_input_must_not_empty)");
            m26632X9(m3172j74, false);
        } else if (!AbstractC7557c.m28974b(this.f26045H0)) {
            String m3172j75 = m3172j7(R$string.account_incorrect_email);
            AbstractC5868k.m23673e(m3172j75, "getString(R.string.account_incorrect_email)");
            m26632X9(m3172j75, false);
        } else {
            if (TextUtils.isEmpty(obj2)) {
                String m3172j76 = m3172j7(R$string.phone_please_input_verifitation_code);
                AbstractC5868k.m23673e(m3172j76, "getString(R.string.phone…_input_verifitation_code)");
                m26632X9(m3172j76, false);
                return;
            }
            m26628S9().m23570Y0(C4842a.f20329a.m19920a().mo19949Z(obj), this.f26045H0, obj2);
        }
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f26048K0.clear();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.InputPasswordDialog);
    }

    /* renamed from: M9 */
    public View m26638M9(int i10) {
        View findViewById;
        Map map = this.f26048K0;
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
        View inflate = layoutInflater.inflate(R$layout.dialog_change_email, viewGroup, false);
        this.f26044G0 = inflate;
        return inflate;
    }

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public void mo3123S7() {
        Disposable disposable = this.f26047J0;
        if (disposable != null) {
            AbstractC5868k.m23671c(disposable);
            if (!disposable.isDisposed()) {
                Disposable disposable2 = this.f26047J0;
                AbstractC5868k.m23671c(disposable2);
                disposable2.dispose();
            }
        }
        super.mo3123S7();
        mo16979F9();
    }

    /* renamed from: U9 */
    public final void m26639U9() {
        Window window;
        Button button = (Button) m26638M9(R$id.mBtnConfirm);
        AbstractC5868k.m23673e(button, "mBtnConfirm");
        AbstractC7555b0.m28955i(button, this);
        ((Button) m26638M9(R$id.mBtnCancel)).setOnClickListener(this);
        ((Button) m26638M9(R$id.mBtnClose)).setOnClickListener(this);
        long currentTimeMillis = 180 - ((System.currentTimeMillis() - C6926a.f26260a.m26898e("key_verifycode_bind_time")) / 1000);
        if (currentTimeMillis > 0) {
            m26633Y9((int) currentTimeMillis);
        }
        ((EditText) m26638M9(R$id.mEditVerificationCode)).addTextChangedListener(new b());
        ((TextView) m26638M9(R$id.mTextGetCode)).setOnClickListener(new View.OnClickListener() { // from class: s8.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewOnClickListenerC6769y.m26630V9(ViewOnClickListenerC6769y.this, view);
            }
        });
        Context m3096J6 = m3096J6();
        if (m3096J6 != null) {
            int i10 = R$id.mRvCompleteList;
            ((AutoEmailCompleteRecyclerView) m26638M9(i10)).setLayoutManager(new LinearLayoutManager(m3096J6));
            AutoEmailCompleteRecyclerView autoEmailCompleteRecyclerView = (AutoEmailCompleteRecyclerView) m26638M9(i10);
            Dialog m3280r9 = m3280r9();
            if (m3280r9 != null) {
                window = m3280r9.getWindow();
            } else {
                window = null;
            }
            autoEmailCompleteRecyclerView.m12066d(window, (AutoCompleteEditView) m26638M9(R$id.mEditNewEmail));
            C7615w.f27995a.m29311S(m3096J6, new d());
        }
        int i11 = R$id.mEditNewEmail;
        ((AutoCompleteEditView) m26638M9(i11)).addTextChangedListener(new e());
        ((EditText) m26638M9(R$id.mEditPassword)).addTextChangedListener(new f());
        ((AutoCompleteEditView) m26638M9(i11)).setOnKeyListener(new View.OnKeyListener() { // from class: s8.x
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i12, KeyEvent keyEvent) {
                boolean m26631W9;
                m26631W9 = ViewOnClickListenerC6769y.m26631W9(ViewOnClickListenerC6769y.this, view, i12, keyEvent);
                return m26631W9;
            }
        });
    }

    @Override // la.InterfaceC5535c
    /* renamed from: a */
    public void mo22441a() {
        ((LoadingView) m26638M9(R$id.mLoadingView)).setVisibility(0);
        ((Button) m26638M9(R$id.mBtnConfirm)).setClickable(false);
    }

    @Override // la.InterfaceC5535c
    /* renamed from: b */
    public void mo22442b() {
        ((LoadingView) m26638M9(R$id.mLoadingView)).setVisibility(8);
        ((Button) m26638M9(R$id.mBtnConfirm)).setClickable(true);
    }

    @Override // la.InterfaceC5535c
    /* renamed from: g3 */
    public void mo22443g3() {
        ((AutoRelativeLayout) m26638M9(R$id.mLayoutChangeEmail)).setVisibility(4);
        ((AutoRelativeLayout) m26638M9(R$id.mLayoutSuccess)).setVisibility(0);
        C6926a.m26890h("key_verifycode_bind_time", 0L);
        ((Button) m26638M9(R$id.mBtnClose)).requestFocus();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        Window window;
        super.mo3164g8();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setLayout(AbstractC7786b.m30166j(980), AbstractC7786b.m30163g(880));
        }
    }

    @Override // la.InterfaceC5535c
    /* renamed from: i */
    public void mo22444i() {
        ((EditText) m26638M9(R$id.mEditVerificationCode)).requestFocus();
        ((TextView) m26638M9(R$id.mTextGetCode)).setEnabled(true);
        C6926a.m26890h("key_verifycode_bind_time", System.currentTimeMillis());
        m26633Y9(180);
        C5881x c5881x = C5881x.f23415a;
        String m3172j7 = m3172j7(R$string.email_verifycode_sent);
        AbstractC5868k.m23673e(m3172j7, "getString(R.string.email_verifycode_sent)");
        String format = String.format(m3172j7, Arrays.copyOf(new Object[]{m26629T9(m26627R9(this, false, 1, null))}, 1));
        AbstractC5868k.m23673e(format, "format(format, *args)");
        m26632X9(format, true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // la.InterfaceC5535c
    /* renamed from: k */
    public void mo22445k(String str) {
        String m28982c;
        DialogC6728k0 dialogC6728k0;
        AbstractC5868k.m23674f(str, "errCode");
        boolean z10 = true;
        ((TextView) m26638M9(R$id.mTextGetCode)).setEnabled(true);
        if (AbstractC5868k.m23669a(str, "aaa100077")) {
            Context m3096J6 = m3096J6();
            if (m3096J6 != null) {
                dialogC6728k0 = new DialogC6728k0(m3096J6, new g());
            } else {
                dialogC6728k0 = null;
            }
            if (dialogC6728k0 != null) {
                dialogC6728k0.show();
                return;
            }
            return;
        }
        switch (str.hashCode()) {
            case -396102937:
                if (str.equals("portal100073")) {
                    m28982c = m3172j7(R$string.email_verify_code_failed);
                    break;
                }
                C7559c1 c7559c1 = C7559c1.f27762a;
                Context m3096J62 = m3096J6();
                AbstractC5868k.m23671c(m3096J62);
                m28982c = C7559c1.m28982c(c7559c1, m3096J62, str, null, 4, null);
                break;
            case -338366941:
                if (str.equals("aaa100003")) {
                    m28982c = m3172j7(R$string.email_input_not_exist);
                    break;
                }
                C7559c1 c7559c12 = C7559c1.f27762a;
                Context m3096J622 = m3096J6();
                AbstractC5868k.m23671c(m3096J622);
                m28982c = C7559c1.m28982c(c7559c12, m3096J622, str, null, 4, null);
                break;
            case -338366911:
                if (str.equals("aaa100012")) {
                    m28982c = m3172j7(R$string.personal_incorrect_password);
                    break;
                }
                C7559c1 c7559c122 = C7559c1.f27762a;
                Context m3096J6222 = m3096J6();
                AbstractC5868k.m23671c(m3096J6222);
                m28982c = C7559c1.m28982c(c7559c122, m3096J6222, str, null, 4, null);
                break;
            case -310215703:
                if (str.equals("portal400001")) {
                    m28982c = m3172j7(R$string.account_not_suport_email);
                    break;
                }
                C7559c1 c7559c1222 = C7559c1.f27762a;
                Context m3096J62222 = m3096J6();
                AbstractC5868k.m23671c(m3096J62222);
                m28982c = C7559c1.m28982c(c7559c1222, m3096J62222, str, null, 4, null);
                break;
            default:
                C7559c1 c7559c12222 = C7559c1.f27762a;
                Context m3096J622222 = m3096J6();
                AbstractC5868k.m23671c(m3096J622222);
                m28982c = C7559c1.m28982c(c7559c12222, m3096J622222, str, null, 4, null);
                break;
        }
        AbstractC5868k.m23673e(m28982c, "if (errCode == PortalErr…ext!!, errCode)\n        }");
        if (m28982c.length() <= 0) {
            z10 = false;
        }
        if (z10) {
            m26632X9(m28982c, false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        Window window;
        AbstractC5868k.m23674f(view, "view");
        ((TextView) m26638M9(R$id.mTextGetCode)).setEnabled(false);
        m26639U9();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setSoftInputMode(2);
        }
        super.mo3176k8(view, bundle);
        ((EditText) m26638M9(R$id.mEditPassword)).setTransformationMethod(new PasswordTransformationMethod());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC5868k.m23674f(view, "v");
        int id2 = view.getId();
        if (id2 == R$id.mBtnConfirm) {
            m26637ca();
            return;
        }
        boolean z10 = true;
        if (id2 != R$id.mBtnCancel && id2 != R$id.mBtnClose) {
            z10 = false;
        }
        if (z10) {
            mo3279p9();
        }
    }
}
