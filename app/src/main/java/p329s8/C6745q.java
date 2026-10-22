package p329s8;

import ac.C0178m;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0729o;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.C1466m0;
import com.login.R$id;
import com.login.R$layout;
import com.login.R$string;
import com.login.R$style;
import com.module.event.RefreshUerInfoDisplayEvent;
import com.module.view.CustomImageTextView;
import com.module.view.DialogBottomBar;
import com.module.view.LoadingView;
import com.module.view.NationSelectView;
import com.request.result.GetAuthInfoResult;
import com.request.result.GetAuthInfoResultData;
import com.request.result.UserInfo;
import com.taobao.accs.common.Constants;
import com.zhy.autolayout.AutoLinearLayout;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.Arrays;
import java.util.LinkedHashMap;
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
import p153h2.AbstractC4509b;
import p217l2.InterfaceC5342c;
import p301qb.InterfaceC6401l;
import p340t8.C6926a;
import p359ue.AbstractC7167u;
import p371vb.C7252a;
import p400xa.AbstractC7555b0;
import p400xa.C7559c1;
import p400xa.C7586l1;
import p415y9.AbstractApplicationC7689d;
import p430z9.C7767e;
import p433zd.AbstractC7786b;
import ye.C7709c;

/* renamed from: s8.q */
/* loaded from: classes2.dex */
public final class C6745q extends C7767e implements InterfaceC5537e, InterfaceC5538f, InterfaceC6401l {

    /* renamed from: G0 */
    private View f25947G0;

    /* renamed from: J0 */
    private boolean f25950J0;

    /* renamed from: K0 */
    private final InterfaceC1312h f25951K0;

    /* renamed from: L0 */
    private final InterfaceC1312h f25952L0;

    /* renamed from: M0 */
    private Disposable f25953M0;

    /* renamed from: N0 */
    private final InterfaceC1312h f25954N0;

    /* renamed from: O0 */
    private boolean f25955O0;

    /* renamed from: P0 */
    private InterfaceC5642a f25956P0;

    /* renamed from: Q0 */
    public Map f25957Q0 = new LinkedHashMap();

    /* renamed from: F0 */
    private final String f25946F0 = C6745q.class.getSimpleName();

    /* renamed from: H0 */
    private String f25948H0 = "Brazil";

    /* renamed from: I0 */
    private String f25949I0 = "55";

    /* renamed from: s8.q$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0178m invoke() {
            return new C0178m(C6745q.this);
        }
    }

    /* renamed from: s8.q$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5833d invoke() {
            C6745q c6745q = C6745q.this;
            Context m3096J6 = c6745q.m3096J6();
            AbstractC5868k.m23671c(m3096J6);
            return new C5833d(c6745q, m3096J6);
        }
    }

    /* renamed from: s8.q$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5642a {
        c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5834e invoke() {
            return new C5834e(C6745q.this);
        }
    }

    /* renamed from: s8.q$d */
    /* loaded from: classes2.dex */
    public static final class d implements NationSelectView.InterfaceC3018b {
        d() {
        }

        @Override // com.module.view.NationSelectView.InterfaceC3018b
        /* renamed from: a */
        public void mo12230a(int i10, String str, String str2) {
            AbstractC5868k.m23674f(str, "nation");
            AbstractC5868k.m23674f(str2, "nationCode");
            C6745q.this.f25948H0 = str;
            C6745q.this.f25949I0 = str2;
            ((CustomImageTextView) C6745q.this.m26523Q9(R$id.mTextNationCode)).setViewText(str2);
            C7559c1 c7559c1 = C7559c1.f27762a;
            EditText editText = (EditText) C6745q.this.m26523Q9(R$id.mEditPhoneNum);
            AbstractC5868k.m23673e(editText, "mEditPhoneNum");
            c7559c1.m28990i(editText, C6745q.this.f25948H0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s8.q$e */
    /* loaded from: classes2.dex */
    public static final class e extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final e f25962a = new e();

        e() {
            super(0);
        }

        /* renamed from: a */
        public final void m26531a() {
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m26531a();
            return C1328x.f4998a;
        }
    }

    /* renamed from: s8.q$f */
    /* loaded from: classes2.dex */
    public static final class f implements TextWatcher {
        f() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C7559c1 c7559c1 = C7559c1.f27762a;
            EditText editText = (EditText) C6745q.this.m26523Q9(R$id.mEditPhoneNum);
            AbstractC5868k.m23673e(editText, "mEditPhoneNum");
            c7559c1.m28984a(editText, this, C6745q.this.f25948H0);
            ((DialogBottomBar) C6745q.this.m26523Q9(R$id.mBottomBar)).m12079e();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* renamed from: s8.q$g */
    /* loaded from: classes2.dex */
    public static final class g implements TextWatcher {
        g() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((DialogBottomBar) C6745q.this.m26523Q9(R$id.mBottomBar)).m12079e();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s8.q$h */
    /* loaded from: classes2.dex */
    public static final class h extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ C5876s f25966b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C5876s c5876s) {
            super(1);
            this.f25966b = c5876s;
        }

        /* renamed from: a */
        public final void m26532a(Long l10) {
            TextView textView = (TextView) C6745q.this.m26523Q9(R$id.mTextGetCode);
            C5881x c5881x = C5881x.f23415a;
            String m3172j7 = C6745q.this.m3172j7(R$string.dialog_verification_send_time);
            AbstractC5868k.m23673e(m3172j7, "getString(R.string.dialog_verification_send_time)");
            String format = String.format(m3172j7, Arrays.copyOf(new Object[]{Integer.valueOf(this.f25966b.f23410a)}, 1));
            AbstractC5868k.m23673e(format, "format(format, *args)");
            textView.setText(format);
            C5876s c5876s = this.f25966b;
            c5876s.f23410a--;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26532a((Long) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s8.q$i */
    /* loaded from: classes2.dex */
    public static final class i extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final i f25967a = new i();

        i() {
            super(1);
        }

        /* renamed from: a */
        public final void m26533a(Throwable th) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26533a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    public C6745q() {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        InterfaceC1312h m5965b3;
        m5965b = AbstractC1314j.m5965b(new b());
        this.f25951K0 = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new c());
        this.f25952L0 = m5965b2;
        m5965b3 = AbstractC1314j.m5965b(new a());
        this.f25954N0 = m5965b3;
    }

    /* renamed from: U9 */
    private final void m26503U9(String str, String str2, String str3, String str4) {
        ((TextView) m26523Q9(R$id.mTextNextStep)).setEnabled(false);
        m26504W9().m648b(str, str2, str3, str4);
    }

    /* renamed from: W9 */
    private final C0178m m26504W9() {
        return (C0178m) this.f25954N0.getValue();
    }

    /* renamed from: X9 */
    private final C5833d m26505X9() {
        return (C5833d) this.f25951K0.getValue();
    }

    /* renamed from: Y9 */
    private final C5834e m26506Y9() {
        return (C5834e) this.f25952L0.getValue();
    }

    /* renamed from: Z9 */
    private final void m26507Z9() {
        ((TextView) m26523Q9(R$id.mDialogTitle)).setText(m3172j7(R$string.personal_bind_mobile));
        if (this.f25955O0) {
            ((AutoLinearLayout) m26523Q9(R$id.mLlTwoBtn)).setVisibility(0);
            ((TextView) m26523Q9(R$id.mTextNextStep)).setVisibility(8);
        } else {
            ((AutoLinearLayout) m26523Q9(R$id.mLlTwoBtn)).setVisibility(8);
            ((TextView) m26523Q9(R$id.mTextNextStep)).setVisibility(0);
        }
    }

    /* renamed from: ba */
    private final void m26508ba() {
        if (C1466m0.f5627a.m6829B()) {
            ((AutoLinearLayout) m26523Q9(R$id.mLayoutPrivacy)).setVisibility(0);
        } else {
            ((AutoLinearLayout) m26523Q9(R$id.mLayoutPrivacy)).setVisibility(4);
        }
        long currentTimeMillis = 180 - ((System.currentTimeMillis() - C6926a.f26260a.m26898e("key_verifycode_bind_time")) / 1000);
        if (currentTimeMillis > 0) {
            m26517ka((int) currentTimeMillis);
        }
        int i10 = R$id.mNationSelectView;
        ((NationSelectView) m26523Q9(i10)).setOnClickCallback(new View.OnClickListener() { // from class: s8.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6745q.m26509ca(C6745q.this, view);
            }
        });
        ((NationSelectView) m26523Q9(i10)).setOnItemClickListener(new d());
        TextView textView = (TextView) m26523Q9(R$id.mTextGetCode);
        AbstractC5868k.m23673e(textView, "mTextGetCode");
        AbstractC7555b0.m28955i(textView, new View.OnClickListener() { // from class: s8.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6745q.m26510da(C6745q.this, view);
            }
        });
        ((TextView) m26523Q9(R$id.mTextPolicy)).setOnClickListener(new View.OnClickListener() { // from class: s8.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6745q.m26511ea(C6745q.this, view);
            }
        });
        TextView textView2 = (TextView) m26523Q9(R$id.mTextNextStep);
        AbstractC5868k.m23673e(textView2, "mTextNextStep");
        AbstractC7555b0.m28955i(textView2, new View.OnClickListener() { // from class: s8.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6745q.m26512fa(C6745q.this, view);
            }
        });
        ((Button) m26523Q9(R$id.mBtnNextStep)).setOnClickListener(new View.OnClickListener() { // from class: s8.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6745q.m26513ga(C6745q.this, view);
            }
        });
        ((Button) m26523Q9(R$id.mBtnBindEmail)).setOnClickListener(new View.OnClickListener() { // from class: s8.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6745q.m26515ha(C6745q.this, view);
            }
        });
        ((EditText) m26523Q9(R$id.mEditPhoneNum)).addTextChangedListener(new f());
        ((EditText) m26523Q9(R$id.mEditVerificationCode)).addTextChangedListener(new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ca */
    public static final void m26509ca(C6745q c6745q, View view) {
        AbstractC5868k.m23674f(c6745q, "this$0");
        c6745q.f25950J0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: da */
    public static final void m26510da(C6745q c6745q, View view) {
        String str;
        CharSequence m27758b0;
        Resources resources;
        AbstractC5868k.m23674f(c6745q, "this$0");
        int i10 = R$id.mTextGetCode;
        CharSequence text = ((TextView) c6745q.m26523Q9(i10)).getText();
        Context m3096J6 = c6745q.m3096J6();
        if (m3096J6 != null && (resources = m3096J6.getResources()) != null) {
            str = resources.getString(R$string.dialog_get_verification_code);
        } else {
            str = null;
        }
        if (!AbstractC5868k.m23669a(text, str)) {
            return;
        }
        if (c6745q.m26522pa()) {
            C7559c1 c7559c1 = C7559c1.f27762a;
            m27758b0 = AbstractC7167u.m27758b0(((EditText) c6745q.m26523Q9(R$id.mEditPhoneNum)).getText().toString());
            String m28987e = c7559c1.m28987e(m27758b0.toString(), c6745q.f25948H0);
            c6745q.m26525a();
            c6745q.m26506Y9().m23599E3(m28987e, c6745q.f25949I0, "1");
            ((TextView) c6745q.m26523Q9(i10)).setEnabled(false);
            return;
        }
        String m3172j7 = c6745q.m3172j7(R$string.phone_mumber_invalid);
        AbstractC5868k.m23673e(m3172j7, "getString(R.string.phone_mumber_invalid)");
        c6745q.m26516ia(m3172j7, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ea */
    public static final void m26511ea(C6745q c6745q, View view) {
        AbstractC5868k.m23674f(c6745q, "this$0");
        C6926a c6926a = C6926a.f26260a;
        AbstractC0729o m3093I6 = c6745q.m3093I6();
        AbstractC5868k.m23673e(m3093I6, "childFragmentManager");
        c6926a.m26905o(m3093I6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fa */
    public static final void m26512fa(C6745q c6745q, View view) {
        AbstractC5868k.m23674f(c6745q, "this$0");
        c6745q.m26521oa();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ga */
    public static final void m26513ga(C6745q c6745q, View view) {
        AbstractC5868k.m23674f(c6745q, "this$0");
        c6745q.m26521oa();
    }

    /* renamed from: h */
    private final void m26514h() {
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
                this.f25948H0 = (String) obj;
                Pair m18021a4 = c4300d.m18021a();
                AbstractC5868k.m23671c(m18021a4);
                Object obj2 = m18021a4.second;
                AbstractC5868k.m23673e(obj2, "Pref.areaInfo!!.second");
                this.f25949I0 = (String) obj2;
                ((NationSelectView) m26523Q9(R$id.mNationSelectView)).setNationName(this.f25948H0);
                ((CustomImageTextView) m26523Q9(R$id.mTextNationCode)).setViewText(this.f25949I0);
                return;
            }
        }
        m26505X9().m23594Y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ha */
    public static final void m26515ha(C6745q c6745q, View view) {
        AbstractC5868k.m23674f(c6745q, "this$0");
        if (c6745q.f25955O0) {
            C6926a c6926a = C6926a.f26260a;
            AbstractC0729o m3119R6 = c6745q.m3119R6();
            AbstractC5868k.m23671c(m3119R6);
            c6926a.m26901i(m3119R6, e.f25962a, true);
        }
        c6745q.mo3279p9();
    }

    /* renamed from: ia */
    private final void m26516ia(String str, boolean z10) {
        DialogBottomBar.EnumC2998a enumC2998a;
        DialogBottomBar dialogBottomBar = (DialogBottomBar) m26523Q9(R$id.mBottomBar);
        if (z10) {
            enumC2998a = DialogBottomBar.EnumC2998a.SUCCESS;
        } else {
            enumC2998a = DialogBottomBar.EnumC2998a.FAIL;
        }
        dialogBottomBar.m12080g(str, enumC2998a);
    }

    /* renamed from: ka */
    private final void m26517ka(int i10) {
        C5876s c5876s = new C5876s();
        c5876s.f23410a = i10;
        Observable<Long> observeOn = Observable.interval(0L, 1L, TimeUnit.SECONDS).take(i10 + 1).observeOn(AndroidSchedulers.mainThread());
        final h hVar = new h(c5876s);
        Consumer<? super Long> consumer = new Consumer() { // from class: s8.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6745q.m26518la(InterfaceC5660l.this, obj);
            }
        };
        final i iVar = i.f25967a;
        this.f25953M0 = observeOn.subscribe(consumer, new Consumer() { // from class: s8.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6745q.m26519ma(InterfaceC5660l.this, obj);
            }
        }, new Action() { // from class: s8.p
            @Override // io.reactivex.functions.Action
            public final void run() {
                C6745q.m26520na(C6745q.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: la */
    public static final void m26518la(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ma */
    public static final void m26519ma(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: na */
    public static final void m26520na(C6745q c6745q) {
        String str;
        Resources resources;
        AbstractC5868k.m23674f(c6745q, "this$0");
        TextView textView = (TextView) c6745q.m26523Q9(R$id.mTextGetCode);
        Context m3096J6 = c6745q.m3096J6();
        if (m3096J6 != null && (resources = m3096J6.getResources()) != null) {
            str = resources.getString(R$string.dialog_get_verification_code);
        } else {
            str = null;
        }
        textView.setText(str);
    }

    /* renamed from: oa */
    private final void m26521oa() {
        CharSequence m27758b0;
        CharSequence m27758b02;
        String str;
        Editable text = ((EditText) m26523Q9(R$id.mEditPhoneNum)).getText();
        AbstractC5868k.m23673e(text, "mEditPhoneNum.text");
        m27758b0 = AbstractC7167u.m27758b0(text);
        String obj = m27758b0.toString();
        Editable text2 = ((EditText) m26523Q9(R$id.mEditVerificationCode)).getText();
        AbstractC5868k.m23673e(text2, "mEditVerificationCode.text");
        m27758b02 = AbstractC7167u.m27758b0(text2);
        String obj2 = m27758b02.toString();
        if (TextUtils.isEmpty(obj)) {
            String m3172j7 = m3172j7(R$string.phone_please_input_number);
            AbstractC5868k.m23673e(m3172j7, "getString(R.string.phone_please_input_number)");
            m26516ia(m3172j7, false);
            return;
        }
        if (!m26522pa()) {
            String m3172j72 = m3172j7(R$string.phone_mumber_invalid);
            AbstractC5868k.m23673e(m3172j72, "getString(R.string.phone_mumber_invalid)");
            m26516ia(m3172j72, false);
            return;
        }
        if (TextUtils.isEmpty(obj2)) {
            String m3172j73 = m3172j7(R$string.phone_please_input_verifitation_code);
            AbstractC5868k.m23673e(m3172j73, "getString(R.string.phone…_input_verifitation_code)");
            m26516ia(m3172j73, false);
            return;
        }
        C1466m0 c1466m0 = C1466m0.f5627a;
        if (c1466m0.m6829B() && !((CheckBox) m26523Q9(R$id.mCheckBox)).isChecked()) {
            String m3172j74 = m3172j7(R$string.personal_please_agree_privacy_policy);
            AbstractC5868k.m23673e(m3172j74, "getString(R.string.perso…ase_agree_privacy_policy)");
            m26516ia(m3172j74, false);
            return;
        }
        String m28987e = C7559c1.f27762a.m28987e(obj, this.f25948H0);
        UserInfo m6887v = c1466m0.m6887v();
        if (m6887v != null) {
            str = m6887v.getHasPwd();
        } else {
            str = null;
        }
        if (AbstractC5868k.m23669a(str, "1")) {
            m26503U9(m28987e, this.f25949I0, obj2, null);
            return;
        }
        InterfaceC5342c interfaceC5342c = (InterfaceC5342c) C5634i.m22844e(InterfaceC5342c.class, new Object[0]);
        if (interfaceC5342c != null) {
            AbstractC0729o m3119R6 = m3119R6();
            AbstractC5868k.m23671c(m3119R6);
            interfaceC5342c.mo21625l(m3119R6, m28987e, this.f25949I0, obj2, this.f25956P0);
        }
        mo3279p9();
    }

    /* renamed from: pa */
    private final boolean m26522pa() {
        CharSequence m27758b0;
        CharSequence m27758b02;
        int i10 = R$id.mEditPhoneNum;
        m27758b0 = AbstractC7167u.m27758b0(((EditText) m26523Q9(i10)).getText().toString());
        if (TextUtils.isEmpty(m27758b0.toString())) {
            return false;
        }
        C7559c1 c7559c1 = C7559c1.f27762a;
        m27758b02 = AbstractC7167u.m27758b0(((EditText) m26523Q9(i10)).getText().toString());
        String m28987e = c7559c1.m28987e(m27758b02.toString(), this.f25948H0);
        if (TextUtils.isEmpty(m28987e) || !c7559c1.m28991j(m28987e, this.f25948H0)) {
            return false;
        }
        return true;
    }

    @Override // la.InterfaceC5538f
    /* renamed from: C */
    public void mo22454C(String str) {
        AbstractC5868k.m23674f(str, Constants.KEY_ERROR_CODE);
        m26524V9();
        AbstractC4509b.m18869b(this.f25946F0, "requestGetVerifiCodeFail " + str, new Object[0]);
        boolean z10 = true;
        ((TextView) m26523Q9(R$id.mTextGetCode)).setEnabled(true);
        C7559c1 c7559c1 = C7559c1.f27762a;
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        String m28982c = C7559c1.m28982c(c7559c1, m3096J6, str, null, 4, null);
        if (m28982c.length() <= 0) {
            z10 = false;
        }
        if (z10) {
            m26516ia(m28982c, false);
        }
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f25957Q0.clear();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.InputPasswordDialog);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.dialog_bind_phone, viewGroup, false);
        this.f25947G0 = inflate;
        return inflate;
    }

    /* renamed from: Q9 */
    public View m26523Q9(int i10) {
        View findViewById;
        Map map = this.f25957Q0;
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

    /* renamed from: V9 */
    public final void m26524V9() {
        ((LoadingView) m26523Q9(R$id.mLoadingView)).setVisibility(8);
    }

    /* renamed from: a */
    public final void m26525a() {
        ((LoadingView) m26523Q9(R$id.mLoadingView)).setVisibility(0);
    }

    @Override // la.InterfaceC5537e
    /* renamed from: a4 */
    public void mo22453a4(String str, String str2) {
        CharSequence m27758b0;
        AbstractC5868k.m23674f(str, "nationCode");
        AbstractC5868k.m23674f(str2, "nation");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !this.f25950J0) {
            m27758b0 = AbstractC7167u.m27758b0(((EditText) m26523Q9(R$id.mEditPhoneNum)).getText().toString());
            if (TextUtils.isEmpty(m27758b0.toString())) {
                this.f25949I0 = str;
                this.f25948H0 = str2;
                ((NationSelectView) m26523Q9(R$id.mNationSelectView)).setNationName(this.f25948H0);
                ((CustomImageTextView) m26523Q9(R$id.mTextNationCode)).setViewText(this.f25949I0);
            }
        }
    }

    /* renamed from: aa */
    public final void m26526aa(InterfaceC5642a interfaceC5642a) {
        this.f25956P0 = interfaceC5642a;
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

    /* renamed from: ja */
    public final void m26527ja(boolean z10) {
        this.f25955O0 = z10;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        m26507Z9();
        m26508ba();
        m26514h();
    }

    @Override // p301qb.InterfaceC6401l
    /* renamed from: n6 */
    public void mo25216n6() {
        CharSequence m27758b0;
        GetAuthInfoResultData getAuthInfoResultData;
        CharSequence m27758b02;
        ((TextView) m26523Q9(R$id.mTextNextStep)).setEnabled(true);
        C1466m0 c1466m0 = C1466m0.f5627a;
        if (c1466m0.m6837J()) {
            C7252a c7252a = C7252a.f27087a;
            if (c7252a.m28070e() > 0 && c1466m0.m6829B()) {
                C7586l1 c7586l1 = C7586l1.f27877a;
                AbstractApplicationC7689d.a aVar = AbstractApplicationC7689d.f28135d;
                Context m29494a = aVar.m29494a();
                C5881x c5881x = C5881x.f23415a;
                String string = aVar.m29494a().getString(R$string.get_bind_gift_days_tips);
                if (string == null) {
                    string = "";
                }
                String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(c7252a.m28070e())}, 1));
                AbstractC5868k.m23673e(format, "format(format, *args)");
                Spanned fromHtml = Html.fromHtml(format);
                AbstractC5868k.m23673e(fromHtml, "fromHtml(String.format(A…    SPConstant.giftDays))");
                C7586l1.m29110c(c7586l1, m29494a, fromHtml, 1, 0, 8, null);
            }
        }
        int i10 = R$id.mEditPhoneNum;
        m27758b0 = AbstractC7167u.m27758b0(((EditText) m26523Q9(i10)).getText().toString());
        String obj = m27758b0.toString();
        GetAuthInfoResult m28073h = C7252a.f27087a.m28073h();
        if (m28073h != null) {
            getAuthInfoResultData = m28073h.getData();
        } else {
            getAuthInfoResultData = null;
        }
        if (getAuthInfoResultData != null) {
            getAuthInfoResultData.setBindMobile("1");
        }
        UserInfo m6887v = c1466m0.m6887v();
        if (m6887v != null) {
            m6887v.setBindMobile("1");
        }
        UserInfo m6887v2 = c1466m0.m6887v();
        if (m6887v2 != null) {
            m27758b02 = AbstractC7167u.m27758b0(((EditText) m26523Q9(i10)).getText().toString());
            m6887v2.setMobile(m27758b02.toString());
        }
        UserInfo m6887v3 = c1466m0.m6887v();
        if (m6887v3 != null) {
            m6887v3.setAreaCode(this.f25949I0);
        }
        C7709c.m29787d().m29801m(new RefreshUerInfoDisplayEvent(false, 1, null));
        InterfaceC5642a interfaceC5642a = this.f25956P0;
        if (interfaceC5642a == null) {
            C6926a c6926a = C6926a.f26260a;
            AbstractC0729o m3119R6 = m3119R6();
            AbstractC5868k.m23671c(m3119R6);
            C6926a.m26892m(c6926a, m3119R6, C7559c1.f27762a.m28988f(obj, this.f25949I0, false), null, 4, null);
        } else if (interfaceC5642a != null) {
            interfaceC5642a.invoke();
        }
        mo3279p9();
    }

    @Override // p301qb.InterfaceC6401l
    /* renamed from: t2 */
    public void mo25217t2(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        ((TextView) m26523Q9(R$id.mTextNextStep)).setEnabled(true);
        C7559c1 c7559c1 = C7559c1.f27762a;
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        String m3172j7 = m3172j7(R$string.phone_bind_failed);
        AbstractC5868k.m23673e(m3172j7, "getString(R.string.phone_bind_failed)");
        m26516ia(c7559c1.m28985b(m3096J6, str, m3172j7), false);
    }

    @Override // la.InterfaceC5538f
    /* renamed from: w */
    public void mo22455w() {
        CharSequence m27758b0;
        m26524V9();
        ((TextView) m26523Q9(R$id.mTextGetCode)).setEnabled(true);
        C6926a.m26890h("key_verifycode_bind_time", System.currentTimeMillis());
        m26517ka(180);
        C5881x c5881x = C5881x.f23415a;
        String m3172j7 = m3172j7(R$string.phone_verifitation_code_send);
        AbstractC5868k.m23673e(m3172j7, "getString(R.string.phone_verifitation_code_send)");
        C7559c1 c7559c1 = C7559c1.f27762a;
        m27758b0 = AbstractC7167u.m27758b0(((EditText) m26523Q9(R$id.mEditPhoneNum)).getText().toString());
        String format = String.format(m3172j7, Arrays.copyOf(new Object[]{c7559c1.m28989h(m27758b0.toString(), this.f25949I0)}, 1));
        AbstractC5868k.m23673e(format, "format(format, *args)");
        m26516ia(format, true);
    }
}
