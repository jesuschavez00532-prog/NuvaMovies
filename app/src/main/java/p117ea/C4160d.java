package p117ea;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.AbstractC0729o;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.module.R$id;
import com.module.R$layout;
import com.umeng.analytics.pro.C3384f;
import me.InterfaceC5642a;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p101da.ViewOnClickListenerC4015a;
import p101da.ViewOnClickListenerC4018d;
import p101da.ViewOnClickListenerC4019e;
import p323s2.AbstractC6652a;

/* renamed from: ea.d */
/* loaded from: classes2.dex */
public final class C4160d {

    /* renamed from: d */
    public static final b f18217d = new b(null);

    /* renamed from: e */
    private static final InterfaceC1312h f18218e;

    /* renamed from: f */
    private static long f18219f;

    /* renamed from: g */
    private static String f18220g;

    /* renamed from: a */
    private ViewOnClickListenerC4019e f18221a;

    /* renamed from: b */
    private ViewOnClickListenerC4018d f18222b;

    /* renamed from: c */
    private ViewOnClickListenerC4015a f18223c;

    /* renamed from: ea.d$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final a f18224a = new a();

        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a */
        public final C4160d invoke() {
            return new C4160d(null);
        }
    }

    /* renamed from: ea.d$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: b */
        private final C4160d m17388b() {
            return (C4160d) C4160d.f18218e.getValue();
        }

        /* renamed from: f */
        public static /* synthetic */ void m17389f(b bVar, Context context, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            bVar.m17393e(context, str, z10);
        }

        /* renamed from: a */
        public final C4160d m17390a() {
            return m17388b();
        }

        /* renamed from: c */
        public final boolean m17391c() {
            double currentTimeMillis = System.currentTimeMillis() - AbstractC4161e.f18225a.m17401d();
            Double.isNaN(currentTimeMillis);
            double d10 = 60000;
            Double.isNaN(d10);
            if ((currentTimeMillis * 1.0d) / d10 <= 5.0d) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public final boolean m17392d() {
            double currentTimeMillis = System.currentTimeMillis() - AbstractC4161e.f18225a.m17400c();
            Double.isNaN(currentTimeMillis);
            double d10 = 3600000;
            Double.isNaN(d10);
            if ((currentTimeMillis * 1.0d) / d10 >= 2.0d) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public final void m17393e(Context context, String str, boolean z10) {
            AbstractC5868k.m23674f(context, C3384f.f14563X);
            AbstractC5868k.m23674f(str, "text");
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - C4160d.f18219f >= 1000 || !AbstractC5868k.m23669a(str, C4160d.f18220g)) {
                C4160d.f18219f = currentTimeMillis;
                View inflate = LayoutInflater.from(context).inflate(R$layout.layout_childlock_toast, (ViewGroup) null);
                View findViewById = inflate.findViewById(R$id.tv_toast);
                AbstractC5868k.m23673e(findViewById, "view.findViewById(R.id.tv_toast)");
                TextView textView = (TextView) findViewById;
                if (z10) {
                    textView.setText(Html.fromHtml(str));
                } else {
                    textView.setText(str);
                }
                Toast toast = new Toast(context);
                AbstractC6652a.m25971a(toast);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                inflate.setLayoutParams(layoutParams);
                toast.setView(inflate);
                toast.setDuration(1);
                if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                    toast.show();
                }
                C4160d.f18220g = str;
            }
        }
    }

    static {
        InterfaceC1312h m5965b;
        m5965b = AbstractC1314j.m5965b(a.f18224a);
        f18218e = m5965b;
        f18220g = "";
    }

    private C4160d() {
    }

    public /* synthetic */ C4160d(AbstractC5864g abstractC5864g) {
        this();
    }

    /* renamed from: k */
    public static final void m17378k(C4160d c4160d, DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(c4160d, "this$0");
        c4160d.f18223c = null;
    }

    /* renamed from: m */
    public static /* synthetic */ void m17379m(C4160d c4160d, AbstractC0729o abstractC0729o, ViewOnClickListenerC4018d.a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        c4160d.m17385l(abstractC0729o, aVar, z10);
    }

    /* renamed from: n */
    public static final void m17380n(C4160d c4160d, DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(c4160d, "this$0");
        c4160d.f18222b = null;
    }

    /* renamed from: p */
    public static /* synthetic */ void m17381p(C4160d c4160d, AbstractC0729o abstractC0729o, ViewOnClickListenerC4019e.a aVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        c4160d.m17386o(abstractC0729o, aVar, z10, z11);
    }

    /* renamed from: q */
    public static final void m17382q(C4160d c4160d, DialogInterface dialogInterface) {
        AbstractC5868k.m23674f(c4160d, "this$0");
        c4160d.f18221a = null;
    }

    /* renamed from: i */
    public final void m17383i() {
        Dialog m3280r9;
        ViewOnClickListenerC4018d viewOnClickListenerC4018d = this.f18222b;
        boolean z10 = false;
        if (viewOnClickListenerC4018d != null && (m3280r9 = viewOnClickListenerC4018d.m3280r9()) != null && m3280r9.isShowing()) {
            z10 = true;
        }
        if (z10) {
            ViewOnClickListenerC4018d viewOnClickListenerC4018d2 = this.f18222b;
            if (viewOnClickListenerC4018d2 != null) {
                viewOnClickListenerC4018d2.m16983P9();
            }
            ViewOnClickListenerC4018d viewOnClickListenerC4018d3 = this.f18222b;
            if (viewOnClickListenerC4018d3 != null) {
                viewOnClickListenerC4018d3.mo3279p9();
            }
            this.f18222b = null;
        }
    }

    /* renamed from: j */
    public final void m17384j(AbstractC0729o abstractC0729o, ViewOnClickListenerC4019e.a aVar) {
        Dialog m3280r9;
        AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
        AbstractC5868k.m23674f(aVar, "passwordCallback");
        ViewOnClickListenerC4015a viewOnClickListenerC4015a = this.f18223c;
        boolean z10 = false;
        if (viewOnClickListenerC4015a != null && (m3280r9 = viewOnClickListenerC4015a.m3280r9()) != null && m3280r9.isShowing()) {
            z10 = true;
        }
        if (z10) {
            ViewOnClickListenerC4015a viewOnClickListenerC4015a2 = this.f18223c;
            if (viewOnClickListenerC4015a2 != null) {
                viewOnClickListenerC4015a2.mo3279p9();
            }
            this.f18223c = null;
        }
        ViewOnClickListenerC4015a viewOnClickListenerC4015a3 = new ViewOnClickListenerC4015a();
        this.f18223c = viewOnClickListenerC4015a3;
        viewOnClickListenerC4015a3.mo3277E9(abstractC0729o, "AttentionDialog");
        ViewOnClickListenerC4015a viewOnClickListenerC4015a4 = this.f18223c;
        if (viewOnClickListenerC4015a4 != null) {
            viewOnClickListenerC4015a4.m16966J9(aVar);
        }
        ViewOnClickListenerC4015a viewOnClickListenerC4015a5 = this.f18223c;
        if (viewOnClickListenerC4015a5 != null) {
            viewOnClickListenerC4015a5.m16965I9(new DialogInterface.OnDismissListener() { // from class: ea.c
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C4160d.m17378k(C4160d.this, dialogInterface);
                }
            });
        }
    }

    /* renamed from: l */
    public final void m17385l(AbstractC0729o abstractC0729o, ViewOnClickListenerC4018d.a aVar, boolean z10) {
        ViewOnClickListenerC4018d viewOnClickListenerC4018d;
        AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
        m17383i();
        ViewOnClickListenerC4018d viewOnClickListenerC4018d2 = new ViewOnClickListenerC4018d();
        this.f18222b = viewOnClickListenerC4018d2;
        viewOnClickListenerC4018d2.mo3277E9(abstractC0729o, "InputPasswordDialog");
        ViewOnClickListenerC4018d viewOnClickListenerC4018d3 = this.f18222b;
        if (viewOnClickListenerC4018d3 != null) {
            viewOnClickListenerC4018d3.m16990Z9(aVar);
        }
        ViewOnClickListenerC4018d viewOnClickListenerC4018d4 = this.f18222b;
        if (viewOnClickListenerC4018d4 != null) {
            viewOnClickListenerC4018d4.m16989Y9(new DialogInterface.OnDismissListener() { // from class: ea.a
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C4160d.m17380n(C4160d.this, dialogInterface);
                }
            });
        }
        if (z10 && (viewOnClickListenerC4018d = this.f18222b) != null) {
            viewOnClickListenerC4018d.m16986T9();
        }
    }

    /* renamed from: o */
    public final void m17386o(AbstractC0729o abstractC0729o, ViewOnClickListenerC4019e.a aVar, boolean z10, boolean z11) {
        Dialog m3280r9;
        AbstractC5868k.m23674f(abstractC0729o, "fragmentManager");
        ViewOnClickListenerC4019e viewOnClickListenerC4019e = this.f18221a;
        boolean z12 = false;
        if (viewOnClickListenerC4019e != null && (m3280r9 = viewOnClickListenerC4019e.m3280r9()) != null && m3280r9.isShowing()) {
            z12 = true;
        }
        if (z12) {
            ViewOnClickListenerC4019e viewOnClickListenerC4019e2 = this.f18221a;
            if (viewOnClickListenerC4019e2 != null) {
                viewOnClickListenerC4019e2.m16999I9();
            }
            ViewOnClickListenerC4019e viewOnClickListenerC4019e3 = this.f18221a;
            if (viewOnClickListenerC4019e3 != null) {
                viewOnClickListenerC4019e3.mo3279p9();
            }
            this.f18221a = null;
        }
        ViewOnClickListenerC4019e viewOnClickListenerC4019e4 = new ViewOnClickListenerC4019e();
        viewOnClickListenerC4019e4.mo3277E9(abstractC0729o, "SetPasswordDialog");
        if (z10) {
            viewOnClickListenerC4019e4.m17005R9();
        }
        if (z11) {
            viewOnClickListenerC4019e4.m17000K9();
        }
        viewOnClickListenerC4019e4.m17004Q9(aVar);
        viewOnClickListenerC4019e4.m17003O9(new DialogInterface.OnDismissListener() { // from class: ea.b
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C4160d.m17382q(C4160d.this, dialogInterface);
            }
        });
        this.f18221a = viewOnClickListenerC4019e4;
    }
}
