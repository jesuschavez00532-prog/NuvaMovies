package p161ha;

import ac.C0151f0;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0729o;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.C1466m0;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$string;
import com.module.event.CloseDialogEvent;
import com.module.event.LoginSuccessRequestDataEvent;
import com.module.view.LoadingView;
import com.request.result.FreeDataBean;
import com.request.result.GetAuthInfoResult;
import com.request.result.GetAuthInfoResultData;
import com.request.result.LoginResult;
import com.swlauthnew.R$style;
import ga.C4417e;
import java.util.LinkedHashMap;
import java.util.Map;
import mc.C5634i;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.greenrobot.eventbus.ThreadMode;
import p149gc.DialogC4427d;
import p201k2.AbstractC5085b;
import p301qb.InterfaceC6369a0;
import p348u2.AbstractC7028e;
import p371vb.C7252a;
import p400xa.C7572h;
import p430z9.C7767e;
import p433zd.AbstractC7786b;
import va.InterfaceC7251a;
import ye.C7709c;
import ye.InterfaceC7719m;

/* renamed from: ha.x0 */
/* loaded from: classes.dex */
public final class C4807x0 extends C7767e implements InterfaceC6369a0 {

    /* renamed from: G0 */
    private View f20260G0;

    /* renamed from: H0 */
    private long f20261H0;

    /* renamed from: I0 */
    private Toast f20262I0;

    /* renamed from: J0 */
    private final InterfaceC1312h f20263J0;

    /* renamed from: K0 */
    public Map f20264K0 = new LinkedHashMap();

    /* renamed from: F0 */
    private String f20259F0 = C4807x0.class.getSimpleName();

    /* renamed from: ha.x0$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0151f0 invoke() {
            return new C0151f0(C4807x0.this);
        }
    }

    /* renamed from: ha.x0$b */
    /* loaded from: classes2.dex */
    public static final class b implements DialogInterface.OnKeyListener {
        b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
        
            if (((android.app.Activity) r6).isFinishing() == false) goto L20;
         */
        @Override // android.content.DialogInterface.OnKeyListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onKey(android.content.DialogInterface r5, int r6, android.view.KeyEvent r7) {
            /*
                r4 = this;
                r5 = 4
                r0 = 0
                if (r6 != r5) goto L9a
                r5 = 1
                if (r7 == 0) goto Lf
                int r6 = r7.getAction()
                if (r6 != 0) goto Lf
                r6 = 1
                goto L10
            Lf:
                r6 = 0
            L10:
                if (r6 == 0) goto L99
                long r6 = java.lang.System.currentTimeMillis()
                ha.x0 r1 = p161ha.C4807x0.this
                long r1 = p161ha.C4807x0.m19868M9(r1)
                long r6 = r6 - r1
                r1 = 2000(0x7d0, double:9.88E-321)
                int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r3 <= 0) goto L7e
                ha.x0 r6 = p161ha.C4807x0.this
                android.widget.Toast r6 = p161ha.C4807x0.m19867L9(r6)
                if (r6 == 0) goto L2e
                r6.cancel()
            L2e:
                ha.x0 r6 = p161ha.C4807x0.this
                androidx.fragment.app.e r7 = r6.m3075C6()
                ha.x0 r1 = p161ha.C4807x0.this
                int r2 = com.module.R$string.press_again_to_exits
                java.lang.String r1 = r1.m3172j7(r2)
                android.widget.Toast r7 = android.widget.Toast.makeText(r7, r1, r0)
                p161ha.C4807x0.m19869N9(r6, r7)
                ha.x0 r6 = p161ha.C4807x0.this
                android.widget.Toast r6 = p161ha.C4807x0.m19867L9(r6)
                p323s2.AbstractC6652a.m25971a(r6)
                ha.x0 r6 = p161ha.C4807x0.this
                android.content.Context r6 = r6.m3096J6()
                boolean r6 = r6 instanceof android.app.Activity
                if (r6 == 0) goto L69
                ha.x0 r6 = p161ha.C4807x0.this
                android.content.Context r6 = r6.m3096J6()
                java.lang.String r7 = "null cannot be cast to non-null type android.app.Activity"
                ne.AbstractC5868k.m23672d(r6, r7)
                android.app.Activity r6 = (android.app.Activity) r6
                boolean r6 = r6.isFinishing()
                if (r6 != 0) goto L74
            L69:
                ha.x0 r6 = p161ha.C4807x0.this
                android.widget.Toast r6 = p161ha.C4807x0.m19867L9(r6)
                if (r6 == 0) goto L74
                r6.show()
            L74:
                ha.x0 r6 = p161ha.C4807x0.this
                long r0 = java.lang.System.currentTimeMillis()
                p161ha.C4807x0.m19870O9(r6, r0)
                goto L99
            L7e:
                ha.x0 r6 = p161ha.C4807x0.this
                android.widget.Toast r6 = p161ha.C4807x0.m19867L9(r6)
                if (r6 == 0) goto L89
                r6.cancel()
            L89:
                ha.x0 r6 = p161ha.C4807x0.this
                r6.m19880P9()
                ha.x0 r6 = p161ha.C4807x0.this
                androidx.fragment.app.e r6 = r6.m3075C6()
                if (r6 == 0) goto L99
                r6.finish()
            L99:
                return r5
            L9a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p161ha.C4807x0.b.onKey(android.content.DialogInterface, int, android.view.KeyEvent):boolean");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ha.x0$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f20267a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m19883a(LoginResult loginResult) {
            C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(true, false, null, 6, null));
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19883a((LoginResult) obj);
            return C1328x.f4998a;
        }
    }

    public C4807x0() {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(new a());
        this.f20263J0 = m5965b;
    }

    /* renamed from: Q9 */
    private final C0151f0 m19871Q9() {
        return (C0151f0) this.f20263J0.getValue();
    }

    /* renamed from: R9 */
    private final void m19872R9() {
        ((Button) m19879K9(R$id.start_to_use)).setOnClickListener(new View.OnClickListener() { // from class: ha.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4807x0.m19873S9(C4807x0.this, view);
            }
        });
        ((Button) m19879K9(R$id.use_redeem_code)).setOnClickListener(new View.OnClickListener() { // from class: ha.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4807x0.m19874T9(C4807x0.this, view);
            }
        });
        ((Button) m19879K9(R$id.login_with_account)).setOnClickListener(new View.OnClickListener() { // from class: ha.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4807x0.m19875U9(C4807x0.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S9 */
    public static final void m19873S9(C4807x0 c4807x0, View view) {
        AbstractC5868k.m23674f(c4807x0, "this$0");
        c4807x0.m19876a();
        c4807x0.m19871Q9().m574b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T9 */
    public static final void m19874T9(C4807x0 c4807x0, View view) {
        AbstractC5868k.m23674f(c4807x0, "this$0");
        new DialogC4427d(c4807x0.m3075C6(), R$style.dialog, C1466m0.f5627a.m6878m()).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U9 */
    public static final void m19875U9(C4807x0 c4807x0, View view) {
        AbstractC5868k.m23674f(c4807x0, "this$0");
        InterfaceC7251a interfaceC7251a = (InterfaceC7251a) C5634i.m22844e(InterfaceC7251a.class, new Object[0]);
        if (interfaceC7251a != null) {
            AbstractActivityC0712e m3075C6 = c4807x0.m3075C6();
            AbstractC5868k.m23671c(m3075C6);
            AbstractC0729o m3294d4 = m3075C6.m3294d4();
            AbstractC5868k.m23673e(m3294d4, "activity!!.supportFragmentManager");
            InterfaceC7251a.a.m28064a(interfaceC7251a, m3294d4, true, null, c.f20267a, 4, null);
        }
    }

    /* renamed from: a */
    private final void m19876a() {
        ((LoadingView) m19879K9(R$id.mLoadingView)).setVisibility(0);
    }

    /* renamed from: b */
    private final void m19877b() {
        ((LoadingView) m19879K9(R$id.mLoadingView)).setVisibility(8);
    }

    @Override // p430z9.C7767e, p430z9.C7764b
    /* renamed from: F9 */
    public void mo16979F9() {
        this.f20264K0.clear();
    }

    @Override // p301qb.InterfaceC6369a0
    /* renamed from: G4 */
    public void mo19878G4(FreeDataBean freeDataBean) {
        m19877b();
        C7709c.m29787d().m29801m(new LoginSuccessRequestDataEvent(true, false, null, 6, null));
        mo3278o9();
    }

    /* renamed from: K9 */
    public View m19879K9(int i10) {
        View findViewById;
        Map map = this.f20264K0;
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
        m3274B9(1, com.module.R$style.InputPasswordDialog);
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null) {
            m3280r9.requestWindowFeature(1);
        }
    }

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final void OnEventCloseDialog(CloseDialogEvent closeDialogEvent) {
        AbstractC5868k.m23674f(closeDialogEvent, "event");
        mo3278o9();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: P7 */
    public View mo3115P7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC5868k.m23674f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.dialog_new_user_first, viewGroup, false);
        this.f20260G0 = inflate;
        return inflate;
    }

    /* renamed from: P9 */
    public final void m19880P9() {
        C7572h.f27809j.m29056a().m29054w();
        AbstractActivityC0712e m3075C6 = m3075C6();
        if (m3075C6 != null) {
            AbstractC7028e.m27115a("nuf");
            C4417e c4417e = C4417e.f19115a;
            String m20598h = AbstractC5085b.m20598h(m3096J6());
            AbstractC5868k.m23673e(m20598h, "getPackageName(context)");
            C4417e.m18497f(c4417e, m3075C6, m20598h, false, false, 12, null);
        }
    }

    @Override // p430z9.C7767e, androidx.fragment.app.Fragment
    /* renamed from: Q7 */
    public void mo3118Q7() {
        super.mo3118Q7();
        C7709c.m29787d().m29806v(this);
    }

    @Override // p430z9.C7767e, p430z9.C7764b, androidx.fragment.app.DialogInterfaceOnCancelListenerC0710d, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo16979F9();
    }

    @Override // p301qb.InterfaceC6369a0
    /* renamed from: X1 */
    public void mo19881X1(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        m19877b();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: g8 */
    public void mo3164g8() {
        Window window;
        super.mo3164g8();
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null && (window = m3280r9.getWindow()) != null) {
            window.setLayout(AbstractC7786b.m30166j(980), AbstractC7786b.m30163g(620));
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: k8 */
    public void mo3176k8(View view, Bundle bundle) {
        GetAuthInfoResultData data;
        AbstractC5868k.m23674f(view, "view");
        super.mo3176k8(view, bundle);
        TextView textView = (TextView) m19879K9(R$id.tx_free_trial);
        AbstractActivityC0712e m3075C6 = m3075C6();
        String str = null;
        if (m3075C6 != null) {
            int i10 = R$string.dialog_free_experience;
            Object[] objArr = new Object[1];
            GetAuthInfoResult m28073h = C7252a.f27087a.m28073h();
            if (m28073h != null && (data = m28073h.getData()) != null) {
                str = data.getGetFreeAuthDays();
            }
            objArr[0] = str;
            str = m3075C6.getString(i10, objArr);
        }
        textView.setText(str);
        Dialog m3280r9 = m3280r9();
        if (m3280r9 != null) {
            m3280r9.setOnKeyListener(new b());
        }
        m3287z9(false);
        m19872R9();
        C7709c.m29787d().m29803r(this);
    }
}
