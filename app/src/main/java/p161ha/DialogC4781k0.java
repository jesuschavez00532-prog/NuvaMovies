package p161ha;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.module.R$id;
import com.module.R$layout;
import com.module.R$style;
import com.module.event.CloseForceBindEvent;
import com.umeng.analytics.pro.C3384f;
import ga.C4417e;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import org.greenrobot.eventbus.ThreadMode;
import p201k2.AbstractC5085b;
import p348u2.AbstractC7028e;
import p400xa.C7572h;
import ye.C7709c;
import ye.InterfaceC7719m;

/* renamed from: ha.k0 */
/* loaded from: classes.dex */
public final class DialogC4781k0 extends Dialog {

    /* renamed from: a */
    private final Context f20173a;

    /* renamed from: b */
    private final InterfaceC5642a f20174b;

    /* renamed from: c */
    private final InterfaceC5642a f20175c;

    /* renamed from: d */
    private final InterfaceC5642a f20176d;

    /* renamed from: e */
    private long f20177e;

    /* renamed from: f */
    private Toast f20178f;

    /* renamed from: ha.k0$a */
    /* loaded from: classes2.dex */
    public static final class a implements DialogInterface.OnKeyListener {
        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
        
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
                if (r6 != r5) goto L97
                r5 = 1
                if (r7 == 0) goto Lf
                int r6 = r7.getAction()
                if (r6 != 0) goto Lf
                r6 = 1
                goto L10
            Lf:
                r6 = 0
            L10:
                if (r6 == 0) goto L96
                long r6 = java.lang.System.currentTimeMillis()
                ha.k0 r1 = p161ha.DialogC4781k0.this
                long r1 = p161ha.DialogC4781k0.m19771e(r1)
                long r6 = r6 - r1
                r1 = 2000(0x7d0, double:9.88E-321)
                int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r3 <= 0) goto L86
                ha.k0 r6 = p161ha.DialogC4781k0.this
                android.widget.Toast r6 = p161ha.DialogC4781k0.m19770d(r6)
                if (r6 == 0) goto L2e
                r6.cancel()
            L2e:
                ha.k0 r6 = p161ha.DialogC4781k0.this
                android.content.Context r7 = r6.m19778i()
                ha.k0 r1 = p161ha.DialogC4781k0.this
                android.content.Context r1 = r1.m19778i()
                android.content.res.Resources r1 = r1.getResources()
                int r2 = com.module.R$string.press_again_to_exits
                java.lang.String r1 = r1.getString(r2)
                android.widget.Toast r7 = android.widget.Toast.makeText(r7, r1, r0)
                p161ha.DialogC4781k0.m19772f(r6, r7)
                ha.k0 r6 = p161ha.DialogC4781k0.this
                android.widget.Toast r6 = p161ha.DialogC4781k0.m19770d(r6)
                p323s2.AbstractC6652a.m25971a(r6)
                ha.k0 r6 = p161ha.DialogC4781k0.this
                android.content.Context r6 = r6.getContext()
                boolean r6 = r6 instanceof android.app.Activity
                if (r6 == 0) goto L71
                ha.k0 r6 = p161ha.DialogC4781k0.this
                android.content.Context r6 = r6.getContext()
                java.lang.String r7 = "null cannot be cast to non-null type android.app.Activity"
                ne.AbstractC5868k.m23672d(r6, r7)
                android.app.Activity r6 = (android.app.Activity) r6
                boolean r6 = r6.isFinishing()
                if (r6 != 0) goto L7c
            L71:
                ha.k0 r6 = p161ha.DialogC4781k0.this
                android.widget.Toast r6 = p161ha.DialogC4781k0.m19770d(r6)
                if (r6 == 0) goto L7c
                r6.show()
            L7c:
                ha.k0 r6 = p161ha.DialogC4781k0.this
                long r0 = java.lang.System.currentTimeMillis()
                p161ha.DialogC4781k0.m19773g(r6, r0)
                goto L96
            L86:
                ha.k0 r6 = p161ha.DialogC4781k0.this
                android.widget.Toast r6 = p161ha.DialogC4781k0.m19770d(r6)
                if (r6 == 0) goto L91
                r6.cancel()
            L91:
                ha.k0 r6 = p161ha.DialogC4781k0.this
                p161ha.DialogC4781k0.m19769c(r6)
            L96:
                return r5
            L97:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p161ha.DialogC4781k0.a.onKey(android.content.DialogInterface, int, android.view.KeyEvent):boolean");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC4781k0(Context context, InterfaceC5642a interfaceC5642a, InterfaceC5642a interfaceC5642a2, InterfaceC5642a interfaceC5642a3) {
        super(context, R$style.InputPasswordDialog);
        AbstractC5868k.m23674f(context, "mContext");
        AbstractC5868k.m23674f(interfaceC5642a, "loginOtherCallBack");
        AbstractC5868k.m23674f(interfaceC5642a2, "bindCallBack");
        AbstractC5868k.m23674f(interfaceC5642a3, "closeCallBack");
        this.f20173a = context;
        this.f20174b = interfaceC5642a;
        this.f20175c = interfaceC5642a2;
        this.f20176d = interfaceC5642a3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m19774h() {
        C7572h.f27809j.m29056a().m29054w();
        AbstractC7028e.m27115a("nuf");
        C4417e c4417e = C4417e.f19115a;
        Context context = getContext();
        AbstractC5868k.m23673e(context, C3384f.f14563X);
        String m20598h = AbstractC5085b.m20598h(getContext());
        AbstractC5868k.m23673e(m20598h, "getPackageName(context)");
        C4417e.m18497f(c4417e, context, m20598h, false, false, 12, null);
    }

    /* renamed from: j */
    private final void m19775j() {
        setCancelable(false);
        setOnKeyListener(new a());
        int i10 = R$id.mBtnBind;
        ((TextView) findViewById(i10)).requestFocus();
        ((TextView) findViewById(R$id.mBtnLoginOther)).setOnClickListener(new View.OnClickListener() { // from class: ha.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC4781k0.m19776k(DialogC4781k0.this, view);
            }
        });
        ((TextView) findViewById(i10)).setOnClickListener(new View.OnClickListener() { // from class: ha.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC4781k0.m19777l(DialogC4781k0.this, view);
            }
        });
        C7709c.m29787d().m29803r(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m19776k(DialogC4781k0 dialogC4781k0, View view) {
        AbstractC5868k.m23674f(dialogC4781k0, "this$0");
        dialogC4781k0.f20174b.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m19777l(DialogC4781k0 dialogC4781k0, View view) {
        AbstractC5868k.m23674f(dialogC4781k0, "this$0");
        dialogC4781k0.f20175c.invoke();
    }

    @InterfaceC7719m(threadMode = ThreadMode.MAIN)
    public final void CloseForceBindEvent(CloseForceBindEvent closeForceBindEvent) {
        AbstractC5868k.m23674f(closeForceBindEvent, "event");
        this.f20176d.invoke();
        dismiss();
    }

    /* renamed from: i */
    public final Context m19778i() {
        return this.f20173a;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.dialog_force_bind);
        m19775j();
    }
}
