package p329s8;

import ac.C0202s;
import android.app.Dialog;
import android.content.Context;
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
import com.module.view.CustomImageTextView;
import com.module.view.DialogBottomBar;
import com.module.view.NationSelectView;
import com.request.result.UserInfo;
import com.taobao.accs.common.Constants;
import com.titans.entity.CdnType;
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
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import na.C5833d;
import na.C5834e;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5876s;
import ne.C5881x;
import p132fa.C4300d;
import p301qb.InterfaceC6413p;
import p340t8.C6926a;
import p359ue.AbstractC7167u;
import p400xa.C7559c1;
import p430z9.C7767e;
import p433zd.AbstractC7786b;

/* renamed from: s8.b1 */
/* loaded from: classes2.dex */
public final class C6702b1 extends C7767e implements InterfaceC5538f, InterfaceC5537e, InterfaceC6413p {

    /* renamed from: G0 */
    private View f25727G0;

    /* renamed from: J0 */
    private boolean f25730J0;

    /* renamed from: K0 */
    private Disposable f25731K0;

    /* renamed from: L0 */
    private final InterfaceC1312h f25732L0;

    /* renamed from: M0 */
    private final InterfaceC1312h f25733M0;

    /* renamed from: N0 */
    private final InterfaceC1312h f25734N0;

    /* renamed from: O0 */
    private boolean f25735O0;

    /* renamed from: P0 */
    public Map f25736P0 = new LinkedHashMap();

    /* renamed from: F0 */
    private final String f25726F0 = C6702b1.class.getSimpleName();

    /* renamed from: H0 */
    private String f25728H0 = "Brazil";

    /* renamed from: I0 */
    private String f25729I0 = "55";

    /* renamed from: s8.b1$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0202s invoke() {
            return new C0202s(C6702b1.this);
        }
    }

    /* renamed from: s8.b1$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5833d invoke() {
            C6702b1 c6702b1 = C6702b1.this;
            Context m3096J6 = c6702b1.m3096J6();
            AbstractC5868k.m23671c(m3096J6);
            return new C5833d(c6702b1, m3096J6);
        }
    }

    /* renamed from: s8.b1$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5642a {
        c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5834e invoke() {
            return new C5834e(C6702b1.this);
        }
    }

    /* renamed from: s8.b1$d */
    /* loaded from: classes2.dex */
    public static final class d implements NationSelectView.InterfaceC3018b {
        d() {
        }

        @Override // com.module.view.NationSelectView.InterfaceC3018b
        /* renamed from: a */
        public void mo12230a(int i10, String str, String str2) {
            AbstractC5868k.m23674f(str, "nation");
            AbstractC5868k.m23674f(str2, "nationCode");
            C6702b1.this.f25728H0 = str;
            C6702b1.this.f25729I0 = str2;
            ((CustomImageTextView) C6702b1.this.m26274N9(R$id.mTextNationCode)).setViewText(str2);
            C7559c1 c7559c1 = C7559c1.f27762a;
            EditText editText = (EditText) C6702b1.this.m26274N9(R$id.mEditPhoneNum);
            AbstractC5868k.m23673e(editText, "mEditPhoneNum");
            c7559c1.m28990i(editText, C6702b1.this.f25728H0);
        }
    }

    /* renamed from: s8.b1$e */
    /* loaded from: classes2.dex */
    public static final class e implements TextWatcher {
        e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C7559c1 c7559c1 = C7559c1.f27762a;
            EditText editText = (EditText) C6702b1.this.m26274N9(R$id.mEditPhoneNum);
            AbstractC5868k.m23673e(editText, "mEditPhoneNum");
            c7559c1.m28984a(editText, this, C6702b1.this.f25728H0);
            ((DialogBottomBar) C6702b1.this.m26274N9(R$id.mBottomBar)).m12079e();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* renamed from: s8.b1$f */
    /* loaded from: classes2.dex */
    public static final class f implements TextWatcher {
        f() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((DialogBottomBar) C6702b1.this.m26274N9(R$id.mBottomBar)).m12079e();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s8.b1$g */
    /* loaded from: classes2.dex */
    public static final class g extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ C5876s f25744b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C5876s c5876s) {
            super(1);
            this.f25744b = c5876s;
        }

        /* renamed from: a */
        public final void m26279a(Long l10) {
            TextView textView = (TextView) C6702b1.this.m26274N9(R$id.mTextGetCode);
            C5881x c5881x = C5881x.f23415a;
            String m3172j7 = C6702b1.this.m3172j7(R$string.dialog_verification_send_time);
            AbstractC5868k.m23673e(m3172j7, "getString(R.string.dialog_verification_send_time)");
            String format = String.format(m3172j7, Arrays.copyOf(new Object[]{Integer.valueOf(this.f25744b.f23410a)}, 1));
            AbstractC5868k.m23673e(format, "format(format, *args)");
            textView.setText(format);
            C5876s c5876s = this.f25744b;
            c5876s.f23410a--;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26279a((Long) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s8.b1$h */
    /* loaded from: classes2.dex */
    public static final class h extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final h f25745a = new h();

        h() {
            super(1);
        }

        /* renamed from: a */
        public final void m26280a(Throwable th) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26280a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    public C6702b1() {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        InterfaceC1312h m5965b3;
        m5965b = AbstractC1314j.m5965b(new b());
        this.f25732L0 = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new c());
        this.f25733M0 = m5965b2;
        m5965b3 = AbstractC1314j.m5965b(new a());
        this.f25734N0 = m5965b3;
        this.f25735O0 = true;
    }

    /* renamed from: R9 */
    private final void m26257R9(String str, String str2) {
        m26258S9().m724b(str, this.f25729I0, str2, CdnType.DIGITAL_TYPE_PCDN, "");
    }

    /* renamed from: S9 */
    private final C0202s m26258S9() {
        return (C0202s) this.f25734N0.getValue();
    }

    /* renamed from: T9 */
    private final C5833d m26259T9() {
        return (C5833d) this.f25732L0.getValue();
    }

    /* renamed from: U9 */
    private final C5834e m26260U9() {
        return (C5834e) this.f25733M0.getValue();
    }

    /* renamed from: V9 */
    private final void m26261V9() {
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00f3  */
    /* renamed from: X9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m26262X9() {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p329s8.C6702b1.m26262X9():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y9 */
    public static final void m26263Y9(final C6702b1 c6702b1, View view) {
        String str;
        CharSequence m27758b0;
        String m28987e;
        String str2;
        Resources resources;
        AbstractC5868k.m23674f(c6702b1, "this$0");
        int i10 = R$id.mTextGetCode;
        CharSequence text = ((TextView) c6702b1.m26274N9(i10)).getText();
        Context m3096J6 = c6702b1.m3096J6();
        if (m3096J6 != null && (resources = m3096J6.getResources()) != null) {
            str = resources.getString(R$string.dialog_get_verification_code);
        } else {
            str = null;
        }
        if (!AbstractC5868k.m23669a(text, str)) {
            return;
        }
        ((NationSelectView) c6702b1.m26274N9(R$id.mNationSelectView)).setOnClickCallback(new View.OnClickListener() { // from class: s8.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C6702b1.m26264Z9(C6702b1.this, view2);
            }
        });
        if (!c6702b1.f25735O0 && !c6702b1.m26273ha()) {
            String m3172j7 = c6702b1.m3172j7(R$string.phone_mumber_invalid);
            AbstractC5868k.m23673e(m3172j7, "getString(R.string.phone_mumber_invalid)");
            c6702b1.m26266ba(m3172j7, false);
            return;
        }
        if (c6702b1.f25735O0) {
            UserInfo m6887v = C1466m0.f5627a.m6887v();
            if (m6887v == null || (str2 = m6887v.getAreaCode()) == null) {
                str2 = c6702b1.f25729I0;
            }
            c6702b1.f25729I0 = str2;
            C7559c1 c7559c1 = C7559c1.f27762a;
            Context m3096J62 = c6702b1.m3096J6();
            AbstractC5868k.m23671c(m3096J62);
            c6702b1.f25728H0 = c7559c1.m28986d(m3096J62, c6702b1.f25729I0);
        }
        if (c6702b1.f25735O0) {
            UserInfo m6887v2 = C1466m0.f5627a.m6887v();
            if (m6887v2 == null || (m28987e = m6887v2.getMobile()) == null) {
                m28987e = "";
            }
        } else {
            C7559c1 c7559c12 = C7559c1.f27762a;
            m27758b0 = AbstractC7167u.m27758b0(((EditText) c6702b1.m26274N9(R$id.mEditPhoneNum)).getText().toString());
            m28987e = c7559c12.m28987e(m27758b0.toString(), c6702b1.f25728H0);
        }
        c6702b1.m26260U9().m23599E3(m28987e, c6702b1.f25729I0, "3");
        ((TextView) c6702b1.m26274N9(i10)).setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z9 */
    public static final void m26264Z9(C6702b1 c6702b1, View view) {
        AbstractC5868k.m23674f(c6702b1, "this$0");
        c6702b1.f25730J0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aa */
    public static final void m26265aa(C6702b1 c6702b1, View view) {
        AbstractC5868k.m23674f(c6702b1, "this$0");
        c6702b1.m26271ga();
    }

    /* renamed from: ba */
    private final void m26266ba(String str, boolean z10) {
        DialogBottomBar.EnumC2998a enumC2998a;
        DialogBottomBar dialogBottomBar = (DialogBottomBar) m26274N9(R$id.mBottomBar);
        if (z10) {
            enumC2998a = DialogBottomBar.EnumC2998a.SUCCESS;
        } else {
            enumC2998a = DialogBottomBar.EnumC2998a.FAIL;
        }
        dialogBottomBar.m12080g(str, enumC2998a);
    }

    /* renamed from: ca */
    private final void m26267ca(int i10) {
        C5876s c5876s = new C5876s();
        c5876s.f23410a = i10;
        Observable<Long> observeOn = Observable.interval(0L, 1L, TimeUnit.SECONDS).take(i10 + 1).observeOn(AndroidSchedulers.mainThread());
        final g gVar = new g(c5876s);
        Consumer<? super Long> consumer = new Consumer() { // from class: s8.y0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6702b1.m26268da(InterfaceC5660l.this, obj);
            }
        };
        final h hVar = h.f25745a;
        this.f25731K0 = observeOn.subscribe(consumer, new Consumer() { // from class: s8.z0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6702b1.m26269ea(InterfaceC5660l.this, obj);
            }
        }, new Action() { // from class: s8.a1
            @Override // io.reactivex.functions.Action
            public final void run() {
                C6702b1.m26270fa(C6702b1.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: da */
    public static final void m26268da(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ea */
    public static final void m26269ea(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fa */
    public static final void m26270fa(C6702b1 c6702b1) {
        String str;
        Resources resources;
        AbstractC5868k.m23674f(c6702b1, "this$0");
        TextView textView = (TextView) c6702b1.m26274N9(R$id.mTextGetCode);
        Context m3096J6 = c6702b1.m3096J6();
        if (m3096J6 != null && (resources = m3096J6.getResources()) != null) {
            str = resources.getString(R$string.dialog_get_verification_code);
        } else {
            str = null;
        }
        textView.setText(str);
    }

    /* renamed from: ga */
    private final void m26271ga() {
        CharSequence m27758b0;
        String m28987e;
        CharSequence m27758b02;
        if (this.f25735O0) {
            UserInfo m6887v = C1466m0.f5627a.m6887v();
            if (m6887v == null || (m28987e = m6887v.getMobile()) == null) {
                m28987e = "";
            }
        } else {
            C7559c1 c7559c1 = C7559c1.f27762a;
            m27758b0 = AbstractC7167u.m27758b0(((EditText) m26274N9(R$id.mEditPhoneNum)).getText().toString());
            m28987e = c7559c1.m28987e(m27758b0.toString(), this.f25728H0);
        }
        Editable text = ((EditText) m26274N9(R$id.mEditVerificationCode)).getText();
        AbstractC5868k.m23673e(text, "mEditVerificationCode.text");
        m27758b02 = AbstractC7167u.m27758b0(text);
        String obj = m27758b02.toString();
        if (TextUtils.isEmpty(m28987e)) {
            String m3172j7 = m3172j7(R$string.phone_please_input_number);
            AbstractC5868k.m23673e(m3172j7, "getString(R.string.phone_please_input_number)");
            m26266ba(m3172j7, false);
        } else if (!m26273ha()) {
            String m3172j72 = m3172j7(R$string.phone_mumber_invalid);
            AbstractC5868k.m23673e(m3172j72, "getString(R.string.phone_mumber_invalid)");
            m26266ba(m3172j72, false);
        } else {
            if (TextUtils.isEmpty(obj)) {
                String m3172j73 = m3172j7(R$string.phone_please_input_verifitation_code);
                AbstractC5868k.m23673e(m3172j73, "getString(R.string.phone…_input_verifitation_code)");
                m26266ba(m3172j73, false);
                return;
            }
            m26257R9(m28987e, obj);
        }
    }

    /* renamed from: h */
    private final void m26272h() {
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
                this.f25728H0 = (String) obj;
                Pair m18021a4 = c4300d.m18021a();
                AbstractC5868k.m23671c(m18021a4);
                Object obj2 = m18021a4.second;
                AbstractC5868k.m23673e(obj2, "Pref.areaInfo!!.second");
                this.f25729I0 = (String) obj2;
                ((NationSelectView) m26274N9(R$id.mNationSelectView)).setNationName(this.f25728H0);
                ((CustomImageTextView) m26274N9(R$id.mTextNationCode)).setViewText(this.f25729I0);
                return;
            }
        }
        m26259T9().m23594Y0();
    }

    /* renamed from: ha */
    private final boolean m26273ha() {
        CharSequence m27758b0;
        String obj;
        if (this.f25735O0) {
            UserInfo m6887v = C1466m0.f5627a.m6887v();
            if (m6887v == null || (obj = m6887v.getMobile()) == null) {
                obj = "";
            }
        } else {
            Editable text = ((EditText) m26274N9(R$id.mEditPhoneNum)).getText();
            AbstractC5868k.m23673e(text, "mEditPhoneNum.text");
            m27758b0 = AbstractC7167u.m27758b0(text);
            obj = m27758b0.toString();
        }
        if (TextUtils.isEmpty(obj)) {
            return false;
        }
        C7559c1 c7559c1 = C7559c1.f27762a;
        String m28987e = c7559c1.m28987e(obj, this.f25728H0);
        if (TextUtils.isEmpty(m28987e) || !c7559c1.m28991j(m28987e, this.f25728H0)) {
            return false;
        }
        return true;
    }

    @Override // la.InterfaceC5538f
    /* renamed from: C */
    public void mo22454C(String str) {
        AbstractC5868k.m23674f(str, Constants.KEY_ERROR_CODE);
        boolean z10 = true;
        ((TextView) m26274N9(R$id.mTextGetCode)).setEnabled(true);
        C7559c1 c7559c1 = C7559c1.f27762a;
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        String m28982c = C7559c1.m28982c(c7559c1, m3096J6, str, null, 4, null);
        if (m28982c.length() <= 0) {
            z10 = false;
        }
        if (z10) {
            m26266ba(m28982c, false);
        }
    }

    @Override // p301qb.InterfaceC6413p
    /* renamed from: F1 */
    public void mo25222F1() {
        CharSequence m27758b0;
        String m28987e;
        CharSequence m27758b02;
        if (this.f25735O0) {
            UserInfo m6887v = C1466m0.f5627a.m6887v();
            if (m6887v == null || (m28987e = m6887v.getMobile()) == null) {
                m28987e = "";
            }
        } else {
            C7559c1 c7559c1 = C7559c1.f27762a;
            m27758b0 = AbstractC7167u.m27758b0(((EditText) m26274N9(R$id.mEditPhoneNum)).getText().toString());
            m28987e = c7559c1.m28987e(m27758b0.toString(), this.f25728H0);
        }
        Editable text = ((EditText) m26274N9(R$id.mEditVerificationCode)).getText();
        AbstractC5868k.m23673e(text, "mEditVerificationCode.text");
        m27758b02 = AbstractC7167u.m27758b0(text);
        String obj = m27758b02.toString();
        C6926a c6926a = C6926a.f26260a;
        AbstractC0729o m3119R6 = m3119R6();
        AbstractC5868k.m23671c(m3119R6);
        c6926a.m26909u(m3119R6, m28987e, this.f25729I0, obj);
        mo3279p9();
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f25736P0.clear();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.InputPasswordDialog);
    }

    /* renamed from: N9 */
    public View m26274N9(int i10) {
        View findViewById;
        Map map = this.f25736P0;
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
        View inflate = layoutInflater.inflate(R$layout.dialog_phone_retrieve_pwd, viewGroup, false);
        this.f25727G0 = inflate;
        return inflate;
    }

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo16979F9();
    }

    @Override // p301qb.InterfaceC6413p
    /* renamed from: U4 */
    public void mo25223U4(String str) {
        boolean z10;
        AbstractC5868k.m23674f(str, Constants.KEY_ERROR_CODE);
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
            m26266ba(m28982c, false);
        }
    }

    /* renamed from: W9 */
    public final void m26275W9(boolean z10) {
        this.f25735O0 = z10;
    }

    @Override // la.InterfaceC5537e
    /* renamed from: a4 */
    public void mo22453a4(String str, String str2) {
        CharSequence m27758b0;
        AbstractC5868k.m23674f(str, "nationCode");
        AbstractC5868k.m23674f(str2, "nation");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !this.f25730J0) {
            m27758b0 = AbstractC7167u.m27758b0(((EditText) m26274N9(R$id.mEditPhoneNum)).getText().toString());
            if (TextUtils.isEmpty(m27758b0.toString())) {
                this.f25729I0 = str;
                this.f25728H0 = str2;
                ((NationSelectView) m26274N9(R$id.mNationSelectView)).setNationName(this.f25728H0);
                ((CustomImageTextView) m26274N9(R$id.mTextNationCode)).setViewText(this.f25729I0);
            }
        }
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

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        m26261V9();
        m26262X9();
        m26272h();
    }

    @Override // la.InterfaceC5538f
    /* renamed from: w */
    public void mo22455w() {
        CharSequence m27758b0;
        ((TextView) m26274N9(R$id.mTextGetCode)).setEnabled(true);
        C6926a.m26890h("key_verifycode_retrieve_pwd_time", System.currentTimeMillis());
        m26267ca(180);
        C5881x c5881x = C5881x.f23415a;
        String m3172j7 = m3172j7(R$string.phone_verifitation_code_send);
        AbstractC5868k.m23673e(m3172j7, "getString(R.string.phone_verifitation_code_send)");
        C7559c1 c7559c1 = C7559c1.f27762a;
        m27758b0 = AbstractC7167u.m27758b0(((EditText) m26274N9(R$id.mEditPhoneNum)).getText().toString());
        String format = String.format(m3172j7, Arrays.copyOf(new Object[]{c7559c1.m28989h(m27758b0.toString(), this.f25729I0)}, 1));
        AbstractC5868k.m23673e(format, "format(format, *args)");
        m26266ba(format, true);
    }
}
