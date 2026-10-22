package p161ha;

import ac.C0196q1;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0729o;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import cc.C1466m0;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$string;
import com.module.R$style;
import com.module.view.DialogBottomBar;
import com.module.view.LoadingView;
import com.request.result.BaseResult;
import com.request.result.UserInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import mc.C5634i;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.android.agoo.message.MessageService;
import p101da.ViewOnClickListenerC4018d;
import p101da.ViewOnClickListenerC4019e;
import p117ea.AbstractC4161e;
import p117ea.C4160d;
import p170i2.C4842a;
import p301qb.InterfaceC6379d1;
import p359ue.AbstractC7167u;
import p400xa.AbstractC7557c;
import p400xa.AbstractC7598p1;
import p400xa.C7559c1;
import p430z9.C7767e;
import p433zd.AbstractC7786b;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;
import va.InterfaceC7251a;

/* renamed from: ha.h */
/* loaded from: classes2.dex */
public final class C4772h extends C7767e implements InterfaceC6379d1 {

    /* renamed from: F0 */
    private View f20133F0;

    /* renamed from: G0 */
    private ViewOnClickListenerC4018d.a f20134G0;

    /* renamed from: H0 */
    private final InterfaceC1312h f20135H0;

    /* renamed from: I0 */
    public Map f20136I0 = new LinkedHashMap();

    /* renamed from: ha.h$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0196q1 invoke() {
            return new C0196q1(C4772h.this);
        }
    }

    /* renamed from: ha.h$b */
    /* loaded from: classes2.dex */
    public static final class b implements ViewOnClickListenerC4019e.a {
        b() {
        }

        @Override // p101da.ViewOnClickListenerC4019e.a
        /* renamed from: Z2 */
        public void mo17006Z2() {
            ViewOnClickListenerC4018d.a aVar = C4772h.this.f20134G0;
            if (aVar != null) {
                aVar.mo11611x();
            }
        }

        @Override // p101da.ViewOnClickListenerC4019e.a
        /* renamed from: b2 */
        public void mo17007b2() {
            ViewOnClickListenerC4018d.a aVar = C4772h.this.f20134G0;
            if (aVar != null) {
                aVar.cancel();
            }
        }

        @Override // p101da.ViewOnClickListenerC4019e.a
        /* renamed from: n2 */
        public void mo17008n2() {
            ViewOnClickListenerC4018d.a aVar = C4772h.this.f20134G0;
            if (aVar != null) {
                aVar.mo11610r0();
            }
        }

        @Override // p101da.ViewOnClickListenerC4019e.a
        /* renamed from: q0 */
        public void mo17009q0() {
            ViewOnClickListenerC4019e.a.C7837a.m17010a(this);
        }
    }

    public C4772h() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(new a());
        this.f20135H0 = m5965b;
    }

    /* renamed from: J */
    private final void m19710J() {
        ((LoadingView) m19722L9(R$id.mLoadingView)).setVisibility(8);
    }

    /* renamed from: N9 */
    private final C0196q1 m19714N9() {
        return (C0196q1) this.f20135H0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O9 */
    public static final void m19715O9(C4772h c4772h, View view, boolean z10) {
        AbstractC5868k.m23674f(c4772h, "this$0");
        if (z10) {
            ((DialogBottomBar) c4772h.m19722L9(R$id.mBottomBar)).m12079e();
        }
    }

    /* renamed from: Q9 */
    private final void m19716Q9() {
        ((Button) m19722L9(R$id.mButtonConfirm)).setOnClickListener(new View.OnClickListener() { // from class: ha.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4772h.m19717R9(C4772h.this, view);
            }
        });
        ((Button) m19722L9(R$id.mButtonCancel)).setOnClickListener(new View.OnClickListener() { // from class: ha.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4772h.m19718S9(C4772h.this, view);
            }
        });
        ((TextView) m19722L9(R$id.mTvForget)).setOnClickListener(new View.OnClickListener() { // from class: ha.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4772h.m19719T9(C4772h.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R9 */
    public static final void m19717R9(C4772h c4772h, View view) {
        CharSequence m27758b0;
        AbstractC5868k.m23674f(c4772h, "this$0");
        m27758b0 = AbstractC7167u.m27758b0(((EditText) c4772h.m19722L9(R$id.mEtInput)).getText().toString());
        String obj = m27758b0.toString();
        if (!AbstractC7557c.m28976d(obj)) {
            String m3172j7 = c4772h.m3172j7(R$string.password_format_wrong);
            AbstractC5868k.m23673e(m3172j7, "getString(R.string.password_format_wrong)");
            c4772h.m19720U9(m3172j7, false);
        } else {
            c4772h.m19721a();
            c4772h.m19714N9().m710b(C4842a.f20329a.m19920a().mo19949Z(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S9 */
    public static final void m19718S9(C4772h c4772h, View view) {
        AbstractC5868k.m23674f(c4772h, "this$0");
        c4772h.mo3278o9();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T9 */
    public static final void m19719T9(C4772h c4772h, View view) {
        String str;
        String str2;
        AbstractC5868k.m23674f(c4772h, "this$0");
        C1466m0 c1466m0 = C1466m0.f5627a;
        UserInfo m6887v = c1466m0.m6887v();
        if (m6887v != null) {
            str = m6887v.getBindMail();
        } else {
            str = null;
        }
        if (AbstractC5868k.m23669a(str, MessageService.MSG_DB_READY_REPORT)) {
            UserInfo m6887v2 = c1466m0.m6887v();
            if (m6887v2 != null) {
                str2 = m6887v2.getBindMobile();
            } else {
                str2 = null;
            }
            if (AbstractC5868k.m23669a(str2, MessageService.MSG_DB_READY_REPORT)) {
                AbstractC7598p1.m29244h(c4772h.m3096J6(), c4772h.m3172j7(R$string.personal_please_link_email), new int[0]);
                return;
            }
        }
        InterfaceC7251a interfaceC7251a = (InterfaceC7251a) C5634i.m22844e(InterfaceC7251a.class, new Object[0]);
        if (interfaceC7251a != null) {
            AbstractC0729o m3119R6 = c4772h.m3119R6();
            AbstractC5868k.m23671c(m3119R6);
            InterfaceC7251a.a.m28065b(interfaceC7251a, m3119R6, false, 2, null);
        }
        c4772h.mo3278o9();
    }

    /* renamed from: U9 */
    private final void m19720U9(String str, boolean z10) {
        DialogBottomBar.EnumC2998a enumC2998a;
        DialogBottomBar dialogBottomBar = (DialogBottomBar) m19722L9(R$id.mBottomBar);
        if (z10) {
            enumC2998a = DialogBottomBar.EnumC2998a.SUCCESS;
        } else {
            enumC2998a = DialogBottomBar.EnumC2998a.FAIL;
        }
        dialogBottomBar.m12080g(str, enumC2998a);
    }

    /* renamed from: a */
    private final void m19721a() {
        ((LoadingView) m19722L9(R$id.mLoadingView)).setVisibility(0);
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f20136I0.clear();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: L7 */
    public void mo3103L7(Bundle bundle) {
        super.mo3103L7(bundle);
        m3274B9(1, R$style.InputPasswordDialog);
    }

    /* renamed from: L9 */
    public View m19722L9(int i10) {
        View findViewById;
        Map map = this.f20136I0;
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
        View inflate = layoutInflater.inflate(R$layout.dialog_check_login_pwd, viewGroup, false);
        this.f20133F0 = inflate;
        return inflate;
    }

    /* renamed from: P9 */
    public final void m19723P9(ViewOnClickListenerC4018d.a aVar) {
        this.f20134G0 = aVar;
    }

    @Override // p301qb.InterfaceC6379d1
    /* renamed from: S0 */
    public void mo19724S0(String str) {
        String m28982c;
        boolean z10;
        AbstractC5868k.m23674f(str, "errCode");
        m19710J();
        if (AbstractC5868k.m23669a(str, "aaa100012")) {
            m28982c = m3172j7(R$string.personal_incorrect_password);
        } else {
            C7559c1 c7559c1 = C7559c1.f27762a;
            Context m3096J6 = m3096J6();
            AbstractC5868k.m23671c(m3096J6);
            m28982c = C7559c1.m28982c(c7559c1, m3096J6, str, null, 4, null);
        }
        AbstractC5868k.m23673e(m28982c, "if (errCode == PortalErr…ext!!, errCode)\n        }");
        if (m28982c.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            m19720U9(m28982c, false);
        }
    }

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo16979F9();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        Window window;
        super.mo3164g8();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setLayout(AbstractC7786b.m30166j(980), AbstractC7786b.m30163g(IjkMediaCodecInfo.RANK_LAST_CHANCE));
        }
    }

    @Override // p301qb.InterfaceC6379d1
    /* renamed from: h3 */
    public void mo19725h3(BaseResult baseResult) {
        AbstractC5868k.m23674f(baseResult, "bean");
        m19710J();
        AbstractC4161e.f18225a.m17402e("");
        C4160d m17390a = C4160d.f18217d.m17390a();
        AbstractC0729o m3119R6 = m3119R6();
        AbstractC5868k.m23671c(m3119R6);
        C4160d.m17381p(m17390a, m3119R6, new b(), false, false, 12, null);
        mo3279p9();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        Window window;
        AbstractC5868k.m23674f(view, "view");
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setSoftInputMode(2);
        }
        super.mo3176k8(view, bundle);
        int i10 = R$id.mEtInput;
        ((EditText) m19722L9(i10)).requestFocus();
        ((EditText) m19722L9(i10)).setTransformationMethod(new PasswordTransformationMethod());
        ((EditText) m19722L9(i10)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: ha.d
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z10) {
                C4772h.m19715O9(C4772h.this, view2, z10);
            }
        });
        m19716Q9();
    }
}
