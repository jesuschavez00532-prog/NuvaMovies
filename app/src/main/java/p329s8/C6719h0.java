package p329s8;

import ac.C0196q1;
import ac.C0198r;
import ac.C0202s;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
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
import com.request.result.BaseResult;
import com.request.result.GetAuthInfoResult;
import com.request.result.GetAuthInfoResultData;
import com.request.result.UserInfo;
import com.taobao.accs.common.Constants;
import com.titans.entity.CdnType;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;
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
import p153h2.AbstractC4509b;
import p170i2.C4842a;
import p201k2.C5090g;
import p201k2.C5096m;
import p301qb.InterfaceC6379d1;
import p301qb.InterfaceC6410o;
import p301qb.InterfaceC6413p;
import p340t8.C6926a;
import p359ue.AbstractC7167u;
import p371vb.C7252a;
import p400xa.AbstractC7555b0;
import p400xa.AbstractC7557c;
import p400xa.C7559c1;
import p430z9.C7767e;
import p433zd.AbstractC7786b;
import ye.C7709c;

/* renamed from: s8.h0 */
/* loaded from: classes2.dex */
public final class C6719h0 extends C7767e implements InterfaceC5537e, InterfaceC5538f, InterfaceC6410o, InterfaceC6379d1, InterfaceC6413p {

    /* renamed from: G0 */
    private View f25805G0;

    /* renamed from: J0 */
    private boolean f25808J0;

    /* renamed from: N0 */
    private final InterfaceC1312h f25812N0;

    /* renamed from: O0 */
    private final InterfaceC1312h f25813O0;

    /* renamed from: P0 */
    private final InterfaceC1312h f25814P0;

    /* renamed from: Q0 */
    private final InterfaceC1312h f25815Q0;

    /* renamed from: R0 */
    private final InterfaceC1312h f25816R0;

    /* renamed from: S0 */
    private Disposable f25817S0;

    /* renamed from: T0 */
    public Map f25818T0 = new LinkedHashMap();

    /* renamed from: F0 */
    private final String f25804F0 = C6719h0.class.getSimpleName();

    /* renamed from: H0 */
    private String f25806H0 = "Brazil";

    /* renamed from: I0 */
    private String f25807I0 = "55";

    /* renamed from: K0 */
    private String f25809K0 = "";

    /* renamed from: L0 */
    private String f25810L0 = "";

    /* renamed from: M0 */
    private String f25811M0 = "";

    /* renamed from: s8.h0$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0198r invoke() {
            return new C0198r(C6719h0.this);
        }
    }

    /* renamed from: s8.h0$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0202s invoke() {
            return new C0202s(C6719h0.this);
        }
    }

    /* renamed from: s8.h0$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5642a {
        c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5833d invoke() {
            C6719h0 c6719h0 = C6719h0.this;
            Context m3096J6 = c6719h0.m3096J6();
            AbstractC5868k.m23671c(m3096J6);
            return new C5833d(c6719h0, m3096J6);
        }
    }

    /* renamed from: s8.h0$d */
    /* loaded from: classes2.dex */
    static final class d extends AbstractC5869l implements InterfaceC5642a {
        d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5834e invoke() {
            return new C5834e(C6719h0.this);
        }
    }

    /* renamed from: s8.h0$e */
    /* loaded from: classes2.dex */
    static final class e extends AbstractC5869l implements InterfaceC5642a {
        e() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0196q1 invoke() {
            return new C0196q1(C6719h0.this);
        }
    }

    /* renamed from: s8.h0$f */
    /* loaded from: classes2.dex */
    public static final class f implements NationSelectView.InterfaceC3018b {
        f() {
        }

        @Override // com.module.view.NationSelectView.InterfaceC3018b
        /* renamed from: a */
        public void mo12230a(int i10, String str, String str2) {
            AbstractC5868k.m23674f(str, "nation");
            AbstractC5868k.m23674f(str2, "nationCode");
            C6719h0.this.f25806H0 = str;
            C6719h0.this.f25807I0 = str2;
            ((CustomImageTextView) C6719h0.this.m26368P9(R$id.mTextNationCode)).setViewText(str2);
            C7559c1 c7559c1 = C7559c1.f27762a;
            EditText editText = (EditText) C6719h0.this.m26368P9(R$id.mEditPhoneNum);
            AbstractC5868k.m23673e(editText, "mEditPhoneNum");
            c7559c1.m28990i(editText, C6719h0.this.f25806H0);
        }
    }

    /* renamed from: s8.h0$g */
    /* loaded from: classes2.dex */
    public static final class g implements TextWatcher {
        g() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C7559c1 c7559c1 = C7559c1.f27762a;
            EditText editText = (EditText) C6719h0.this.m26368P9(R$id.mEditPhoneNum);
            AbstractC5868k.m23673e(editText, "mEditPhoneNum");
            c7559c1.m28984a(editText, this, C6719h0.this.f25806H0);
            ((DialogBottomBar) C6719h0.this.m26368P9(R$id.mBottomBar)).m12079e();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* renamed from: s8.h0$h */
    /* loaded from: classes2.dex */
    public static final class h implements TextWatcher {
        h() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((DialogBottomBar) C6719h0.this.m26368P9(R$id.mBottomBar)).m12079e();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s8.h0$i */
    /* loaded from: classes2.dex */
    public static final class i extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ C5876s f25828b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C5876s c5876s) {
            super(1);
            this.f25828b = c5876s;
        }

        /* renamed from: a */
        public final void m26377a(Long l10) {
            TextView textView = (TextView) C6719h0.this.m26368P9(R$id.mTextGetCode);
            C5881x c5881x = C5881x.f23415a;
            String m3172j7 = C6719h0.this.m3172j7(R$string.dialog_verification_send_time);
            AbstractC5868k.m23673e(m3172j7, "getString(R.string.dialog_verification_send_time)");
            String format = String.format(m3172j7, Arrays.copyOf(new Object[]{Integer.valueOf(this.f25828b.f23410a)}, 1));
            AbstractC5868k.m23673e(format, "format(format, *args)");
            textView.setText(format);
            C5876s c5876s = this.f25828b;
            c5876s.f23410a--;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26377a((Long) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s8.h0$j */
    /* loaded from: classes2.dex */
    public static final class j extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final j f25829a = new j();

        j() {
            super(1);
        }

        /* renamed from: a */
        public final void m26378a(Throwable th) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m26378a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    public C6719h0() {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        InterfaceC1312h m5965b3;
        InterfaceC1312h m5965b4;
        InterfaceC1312h m5965b5;
        m5965b = AbstractC1314j.m5965b(new d());
        this.f25812N0 = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new a());
        this.f25813O0 = m5965b2;
        m5965b3 = AbstractC1314j.m5965b(new b());
        this.f25814P0 = m5965b3;
        m5965b4 = AbstractC1314j.m5965b(new c());
        this.f25815Q0 = m5965b4;
        m5965b5 = AbstractC1314j.m5965b(new e());
        this.f25816R0 = m5965b5;
    }

    /* renamed from: T9 */
    private final void m26348T9(String str, String str2, String str3) {
        this.f25809K0 = str2;
        this.f25810L0 = str3;
        this.f25811M0 = C4842a.f20329a.m19920a().mo19949Z(str);
        m26354aa().m710b(this.f25811M0);
    }

    /* renamed from: U9 */
    private final void m26349U9(String str, String str2, String str3) {
        m26351X9().m724b(str, this.f25807I0, str2, "2", str3);
    }

    /* renamed from: W9 */
    private final C0198r m26350W9() {
        return (C0198r) this.f25813O0.getValue();
    }

    /* renamed from: X9 */
    private final C0202s m26351X9() {
        return (C0202s) this.f25814P0.getValue();
    }

    /* renamed from: Y9 */
    private final C5833d m26352Y9() {
        return (C5833d) this.f25815Q0.getValue();
    }

    /* renamed from: Z9 */
    private final C5834e m26353Z9() {
        return (C5834e) this.f25812N0.getValue();
    }

    /* renamed from: aa */
    private final C0196q1 m26354aa() {
        return (C0196q1) this.f25816R0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ca */
    public static final void m26355ca(C6719h0 c6719h0, View view) {
        AbstractC5868k.m23674f(c6719h0, "this$0");
        c6719h0.f25808J0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: da */
    public static final void m26356da(C6719h0 c6719h0, View view) {
        String str = null;
        CharSequence m27758b0;
        Resources resources;
        AbstractC5868k.m23674f(c6719h0, "this$0");
        int i10 = R$id.mTextGetCode;
        CharSequence text = ((TextView) c6719h0.m26368P9(i10)).getText();
        Context m3096J6 = c6719h0.m3096J6();
        if (m3096J6 != null && (resources = m3096J6.getResources()) != null) {
            str = resources.getString(R$string.dialog_get_verification_code);
        } else {
            str = null;
        }
        if (!AbstractC5868k.m23669a(text, str)) {
            return;
        }
        if (c6719h0.m26366ma()) {
            C7559c1 c7559c1 = C7559c1.f27762a;
            m27758b0 = AbstractC7167u.m27758b0(((EditText) c6719h0.m26368P9(R$id.mEditPhoneNum)).getText().toString());
            String m28987e = c7559c1.m28987e(m27758b0.toString(), c6719h0.f25806H0);
            c6719h0.m26370a();
            c6719h0.m26353Z9().m23599E3(m28987e, c6719h0.f25807I0, "2");
            ((TextView) c6719h0.m26368P9(i10)).setEnabled(false);
            return;
        }
        String m3172j7 = c6719h0.m3172j7(R$string.phone_mumber_invalid);
        AbstractC5868k.m23673e(m3172j7, "getString(R.string.phone_mumber_invalid)");
        c6719h0.m26361ha(m3172j7, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ea */
    public static final void m26357ea(C6719h0 c6719h0, View view) {
        AbstractC5868k.m23674f(c6719h0, "this$0");
        c6719h0.m26367na();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fa */
    public static final void m26358fa(C6719h0 c6719h0, View view) {
        AbstractC5868k.m23674f(c6719h0, "this$0");
        c6719h0.mo3278o9();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ga */
    public static final void m26359ga(C6719h0 c6719h0, View view) {
        AbstractC5868k.m23674f(c6719h0, "this$0");
        c6719h0.mo3278o9();
    }

    /* renamed from: h */
    private final void m26360h() {
        String str = null;
        boolean z10 = false;
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
                this.f25806H0 = (String) obj;
                Pair m18021a4 = c4300d.m18021a();
                AbstractC5868k.m23671c(m18021a4);
                Object obj2 = m18021a4.second;
                AbstractC5868k.m23673e(obj2, "Pref.areaInfo!!.second");
                this.f25807I0 = (String) obj2;
                ((NationSelectView) m26368P9(R$id.mNationSelectView)).setNationName(this.f25806H0);
                ((CustomImageTextView) m26368P9(R$id.mTextNationCode)).setViewText(this.f25807I0);
                return;
            }
        }
        m26352Y9().m23594Y0();
    }

    /* renamed from: ha */
    private final void m26361ha(String str, boolean z10) {
        DialogBottomBar.EnumC2998a enumC2998a;
        Log.d(this.f25804F0, "setNotifyView,MSG : " + str);
        DialogBottomBar dialogBottomBar = (DialogBottomBar) m26368P9(R$id.mBottomBar);
        if (z10) {
            enumC2998a = DialogBottomBar.EnumC2998a.SUCCESS;
        } else {
            enumC2998a = DialogBottomBar.EnumC2998a.FAIL;
        }
        dialogBottomBar.m12080g(str, enumC2998a);
    }

    /* renamed from: ia */
    private final void m26362ia(int i10) {
        C5876s c5876s = new C5876s();
        c5876s.f23410a = i10;
        Observable<Long> observeOn = Observable.interval(0L, 1L, TimeUnit.SECONDS).take(i10 + 1).observeOn(AndroidSchedulers.mainThread());
        final i iVar = new i(c5876s);
        Consumer<? super Long> consumer = new Consumer() { // from class: s8.e0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6719h0.m26363ja(InterfaceC5660l.this, obj);
            }
        };
        final j jVar = j.f25829a;
        this.f25817S0 = observeOn.subscribe(consumer, new Consumer() { // from class: s8.f0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6719h0.m26364ka(InterfaceC5660l.this, obj);
            }
        }, new Action() { // from class: s8.g0
            @Override // io.reactivex.functions.Action
            public final void run() {
                C6719h0.m26365la(C6719h0.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ja */
    public static final void m26363ja(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ka */
    public static final void m26364ka(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: la */
    public static final void m26365la(C6719h0 c6719h0) {
        String str = null;
        Resources resources;
        AbstractC5868k.m23674f(c6719h0, "this$0");
        TextView textView = (TextView) c6719h0.m26368P9(R$id.mTextGetCode);
        Context m3096J6 = c6719h0.m3096J6();
        if (m3096J6 != null && (resources = m3096J6.getResources()) != null) {
            str = resources.getString(R$string.dialog_get_verification_code);
        } else {
            str = null;
        }
        textView.setText(str);
    }

    /* renamed from: ma */
    private final boolean m26366ma() {
        CharSequence m27758b0;
        CharSequence m27758b02;
        int i10 = R$id.mEditPhoneNum;
        m27758b0 = AbstractC7167u.m27758b0(((EditText) m26368P9(i10)).getText().toString());
        if (TextUtils.isEmpty(m27758b0.toString())) {
            return false;
        }
        C7559c1 c7559c1 = C7559c1.f27762a;
        m27758b02 = AbstractC7167u.m27758b0(((EditText) m26368P9(i10)).getText().toString());
        String m28987e = c7559c1.m28987e(m27758b02.toString(), this.f25806H0);
        if (TextUtils.isEmpty(m28987e) || !c7559c1.m28991j(m28987e, this.f25806H0)) {
            return false;
        }
        return true;
    }

    /* renamed from: na */
    private final void m26367na() {
        CharSequence m27758b0;
        CharSequence m27758b02;
        CharSequence m27758b03;
        Editable text = ((EditText) m26368P9(R$id.mEditPhoneNum)).getText();
        AbstractC5868k.m23673e(text, "mEditPhoneNum.text");
        m27758b0 = AbstractC7167u.m27758b0(text);
        String obj = m27758b0.toString();
        Editable text2 = ((EditText) m26368P9(R$id.mChangeEditVerificationCode)).getText();
        AbstractC5868k.m23673e(text2, "mChangeEditVerificationCode.text");
        m27758b02 = AbstractC7167u.m27758b0(text2);
        String obj2 = m27758b02.toString();
        m27758b03 = AbstractC7167u.m27758b0(((EditText) m26368P9(R$id.mEditPassword)).getText().toString());
        String obj3 = m27758b03.toString();
        if (TextUtils.isEmpty(obj)) {
            String m3172j7 = m3172j7(R$string.phone_please_input_number);
            AbstractC5868k.m23673e(m3172j7, "getString(R.string.phone_please_input_number)");
            m26361ha(m3172j7, false);
            return;
        }
        if (!m26366ma()) {
            String m3172j72 = m3172j7(R$string.phone_mumber_invalid);
            AbstractC5868k.m23673e(m3172j72, "getString(R.string.phone_mumber_invalid)");
            m26361ha(m3172j72, false);
        } else if (TextUtils.isEmpty(obj2)) {
            String m3172j73 = m3172j7(R$string.phone_please_input_verifitation_code);
            AbstractC5868k.m23673e(m3172j73, "getString(R.string.phone…_input_verifitation_code)");
            m26361ha(m3172j73, false);
        } else {
            if (!AbstractC7557c.m28976d(obj3)) {
                String m3172j74 = m3172j7(R$string.personal_password_format_incorrect);
                AbstractC5868k.m23673e(m3172j74, "getString(R.string.perso…assword_format_incorrect)");
                m26361ha(m3172j74, false);
                return;
            }
            m26348T9(obj3, C7559c1.f27762a.m28987e(obj, this.f25806H0), obj2);
        }
    }

    @Override // la.InterfaceC5538f
    /* renamed from: C */
    public void mo22454C(String str) {
        AbstractC5868k.m23674f(str, Constants.KEY_ERROR_CODE);
        m26369V9();
        AbstractC4509b.m18869b(this.f25804F0, "requestGetVerifiCodeFail " + str, new Object[0]);
        boolean z10 = true;
        ((TextView) m26368P9(R$id.mTextGetCode)).setEnabled(true);
        ((EditText) m26368P9(R$id.mChangeEditVerificationCode)).requestFocus();
        C7559c1 c7559c1 = C7559c1.f27762a;
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        String m28982c = C7559c1.m28982c(c7559c1, m3096J6, str, null, 4, null);
        if (m28982c.length() <= 0) {
            z10 = false;
        }
        if (z10) {
            m26361ha(m28982c, false);
        }
    }

    @Override // p301qb.InterfaceC6413p
    /* renamed from: F1 */
    public void mo25222F1() {
        String str = null;
        if (C5096m.f20979a.m20692c()) {
            str = "2";
        } else {
            str = "1";
        }
        m26350W9().m715b(this.f25809K0, this.f25807I0, this.f25810L0, str);
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f25818T0.clear();
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
        View inflate = layoutInflater.inflate(R$layout.dialog_change_phone, viewGroup, false);
        this.f25805G0 = inflate;
        return inflate;
    }

    /* renamed from: P9 */
    public View m26368P9(int i10) {
        View findViewById;
        Map map = this.f25818T0;
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

    @Override // p301qb.InterfaceC6379d1
    /* renamed from: S0 */
    public void mo19724S0(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        boolean z10 = true;
        ((TextView) m26368P9(R$id.mTextGetCode)).setEnabled(true);
        C7559c1 c7559c1 = C7559c1.f27762a;
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        String m28982c = C7559c1.m28982c(c7559c1, m3096J6, str, null, 4, null);
        Log.d(this.f25804F0, "MSG :" + m28982c + " ; errCode :" + str);
        if (m28982c.length() <= 0) {
            z10 = false;
        }
        if (z10) {
            m26361ha(m28982c, false);
        }
    }

    @Override // p301qb.InterfaceC6410o
    /* renamed from: S2 */
    public void mo25220S2(String str) {
        GetAuthInfoResultData getAuthInfoResultData;
        AbstractC5868k.m23674f(str, "phone");
        ((Button) m26368P9(R$id.mBtnConfirm)).setEnabled(true);
        ((AutoRelativeLayout) m26368P9(R$id.mLayoutSuccess)).setVisibility(0);
        ((AutoLinearLayout) m26368P9(R$id.mLayoutChangePhone)).setVisibility(4);
        GetAuthInfoResult m28073h = C7252a.f27087a.m28073h();
        if (m28073h != null) {
            getAuthInfoResultData = m28073h.getData();
        } else {
            getAuthInfoResultData = null;
        }
        if (getAuthInfoResultData != null) {
            getAuthInfoResultData.setBindMobile("1");
        }
        C1466m0 c1466m0 = C1466m0.f5627a;
        UserInfo m6887v = c1466m0.m6887v();
        if (m6887v != null) {
            m6887v.setBindMobile("1");
        }
        UserInfo m6887v2 = c1466m0.m6887v();
        if (m6887v2 != null) {
            m6887v2.setMobile(str);
        }
        UserInfo m6887v3 = c1466m0.m6887v();
        if (m6887v3 != null) {
            m6887v3.setAreaCode(this.f25807I0);
        }
        if (TextUtils.equals(c1466m0.m6860d(), "3") || TextUtils.equals(c1466m0.m6860d(), "4") || TextUtils.equals(c1466m0.m6860d(), CdnType.DIGITAL_TYPE_PCDN)) {
            c1466m0.m6873j0(str);
            if (C4842a.f20329a.m19920a().m19976y()) {
                C5090g c5090g = C5090g.f20948a;
                c5090g.m20656x(c5090g.m20641f(), str);
            }
        }
        C7709c.m29787d().m29801m(new RefreshUerInfoDisplayEvent(false, 1, null));
    }

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public void mo3123S7() {
        Disposable disposable = this.f25817S0;
        if (disposable != null) {
            AbstractC5868k.m23671c(disposable);
            if (!disposable.isDisposed()) {
                Disposable disposable2 = this.f25817S0;
                AbstractC5868k.m23671c(disposable2);
                disposable2.dispose();
            }
        }
        super.mo3123S7();
        mo16979F9();
    }

    @Override // p301qb.InterfaceC6413p
    /* renamed from: U4 */
    public void mo25223U4(String str) {
        boolean z10 = false;
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
            m26361ha(m28982c, false);
        }
    }

    /* renamed from: V9 */
    public final void m26369V9() {
        ((LoadingView) m26368P9(R$id.mLoadingView)).setVisibility(8);
    }

    /* renamed from: a */
    public final void m26370a() {
        ((LoadingView) m26368P9(R$id.mLoadingView)).setVisibility(0);
    }

    @Override // la.InterfaceC5537e
    /* renamed from: a4 */
    public void mo22453a4(String str, String str2) {
        CharSequence m27758b0;
        AbstractC5868k.m23674f(str, "nationCode");
        AbstractC5868k.m23674f(str2, "nation");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !this.f25808J0) {
            m27758b0 = AbstractC7167u.m27758b0(((EditText) m26368P9(R$id.mEditPhoneNum)).getText().toString());
            if (TextUtils.isEmpty(m27758b0.toString())) {
                this.f25807I0 = str;
                this.f25806H0 = str2;
                ((NationSelectView) m26368P9(R$id.mNationSelectView)).setNationName(this.f25806H0);
                ((CustomImageTextView) m26368P9(R$id.mTextNationCode)).setViewText(this.f25807I0);
            }
        }
    }

    /* renamed from: ba */
    public final void m26371ba() {
        long currentTimeMillis = 180 - ((System.currentTimeMillis() - C6926a.f26260a.m26898e("key_verifycode_bind_time")) / 1000);
        if (currentTimeMillis > 0) {
            m26362ia((int) currentTimeMillis);
        }
        int i10 = R$id.mNationSelectView;
        ((NationSelectView) m26368P9(i10)).setOnClickCallback(new View.OnClickListener() { // from class: s8.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6719h0.m26355ca(C6719h0.this, view);
            }
        });
        ((NationSelectView) m26368P9(i10)).setOnItemClickListener(new f());
        TextView textView = (TextView) m26368P9(R$id.mTextGetCode);
        AbstractC5868k.m23673e(textView, "mTextGetCode");
        AbstractC7555b0.m28955i(textView, new View.OnClickListener() { // from class: s8.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6719h0.m26356da(C6719h0.this, view);
            }
        });
        ((Button) m26368P9(R$id.mBtnConfirm)).setOnClickListener(new View.OnClickListener() { // from class: s8.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6719h0.m26357ea(C6719h0.this, view);
            }
        });
        ((Button) m26368P9(R$id.mBtnCancel)).setOnClickListener(new View.OnClickListener() { // from class: s8.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6719h0.m26358fa(C6719h0.this, view);
            }
        });
        ((Button) m26368P9(R$id.mBtnClose)).setOnClickListener(new View.OnClickListener() { // from class: s8.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6719h0.m26359ga(C6719h0.this, view);
            }
        });
        ((EditText) m26368P9(R$id.mEditPhoneNum)).addTextChangedListener(new g());
        ((EditText) m26368P9(R$id.mChangeEditVerificationCode)).addTextChangedListener(new h());
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

    @Override // p301qb.InterfaceC6379d1
    /* renamed from: h3 */
    public void mo19725h3(BaseResult baseResult) {
        AbstractC5868k.m23674f(baseResult, "bean");
        m26349U9(this.f25809K0, this.f25810L0, this.f25811M0);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        Window window;
        AbstractC5868k.m23674f(view, "view");
        m26371ba();
        m26360h();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setSoftInputMode(2);
        }
        super.mo3176k8(view, bundle);
        ((EditText) m26368P9(R$id.mEditPassword)).setTransformationMethod(new PasswordTransformationMethod());
    }

    @Override // p301qb.InterfaceC6410o
    /* renamed from: l2 */
    public void mo25221l2(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        ((Button) m26368P9(R$id.mBtnConfirm)).setEnabled(true);
        C7559c1 c7559c1 = C7559c1.f27762a;
        Context m3096J6 = m3096J6();
        AbstractC5868k.m23671c(m3096J6);
        String m3172j7 = m3172j7(R$string.phone_bind_failed);
        AbstractC5868k.m23673e(m3172j7, "getString(R.string.phone_bind_failed)");
        m26361ha(c7559c1.m28985b(m3096J6, str, m3172j7), false);
    }

    @Override // la.InterfaceC5538f
    /* renamed from: w */
    public void mo22455w() {
        CharSequence m27758b0;
        m26369V9();
        ((TextView) m26368P9(R$id.mTextGetCode)).setEnabled(true);
        ((EditText) m26368P9(R$id.mChangeEditVerificationCode)).requestFocus();
        C6926a.m26890h("key_verifycode_bind_time", System.currentTimeMillis());
        m26362ia(180);
        C5881x c5881x = C5881x.f23415a;
        String m3172j7 = m3172j7(R$string.phone_verifitation_code_send);
        AbstractC5868k.m23673e(m3172j7, "getString(R.string.phone_verifitation_code_send)");
        C7559c1 c7559c1 = C7559c1.f27762a;
        m27758b0 = AbstractC7167u.m27758b0(((EditText) m26368P9(R$id.mEditPhoneNum)).getText().toString());
        String format = String.format(m3172j7, Arrays.copyOf(new Object[]{c7559c1.m28989h(m27758b0.toString(), this.f25807I0)}, 1));
        AbstractC5868k.m23673e(format, "format(format, *args)");
        m26361ha(format, true);
    }
}
