package p400xa;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import anet.channel.entity.ConnType;
import anet.channel.entity.EventType;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.lzy.okgo.OkGo;
import com.module.view.NetConnectStatusView;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3384f;
import java.util.ArrayList;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p102db.DialogC4072r0;
import p201k2.AbstractC5094k;
import p287pb.AbstractApplicationC6253c;
import p317rb.AbstractC6567a;

/* renamed from: xa.x0 */
/* loaded from: classes2.dex */
public final class C7618x0 {

    /* renamed from: a */
    public static final C7618x0 f28031a = null;

    /* renamed from: b */
    private static final String f28032b;

    /* renamed from: c */
    private static DialogC4072r0 f28033c;

    /* renamed from: d */
    private static ArrayList f28034d;

    /* renamed from: e */
    private static ArrayList f28035e;

    /* renamed from: f */
    private static long f28036f;

    /* renamed from: g */
    private static final InterfaceC1312h f28037g;

    /* renamed from: h */
    private static boolean f28038h;

    /* renamed from: i */
    private static String f28039i;

    /* renamed from: j */
    private static String f28040j;

    /* renamed from: k */
    private static String f28041k;

    /* renamed from: l */
    private static String f28042l;

    /* renamed from: m */
    private static String f28043m;

    /* renamed from: n */
    private static String f28044n;

    /* renamed from: o */
    private static String f28045o;

    /* renamed from: p */
    private static final InterfaceC1312h f28046p;

    /* renamed from: q */
    private static a f28047q;

    /* renamed from: r */
    private static boolean f28048r;

    /* renamed from: s */
    private static int f28049s;

    /* renamed from: t */
    private static String f28050t;

    /* renamed from: u */
    private static e f28051u;

    /* renamed from: v */
    private static final Runnable f28052v;

    /* renamed from: w */
    private static b f28053w;

    /* renamed from: xa.x0$a */
    /* loaded from: classes2.dex */
    public class a {
        /* renamed from: a */
        void mo11883a(int i10, KeyEvent keyEvent);

        /* renamed from: b */
        void mo11884b(boolean z10, boolean z11, String str);
    }

    /* renamed from: xa.x0$b */
    /* loaded from: classes2.dex */
    public static final class b implements DialogC4072r0.b {
        b() {
        }

        @Override // p102db.DialogC4072r0.b
        /* renamed from: a */
        public void mo17107a(int i10, KeyEvent keyEvent) {
            a aVar;
            AbstractC5868k.m23674f(keyEvent, "event");
            if (!C7618x0.f28038h && (aVar = C7618x0.f28047q) != null) {
                aVar.mo11883a(i10, keyEvent);
            }
        }

        @Override // p102db.DialogC4072r0.b
        /* renamed from: b */
        public void mo17108b() {
            C7618x0 c7618x0 = C7618x0.f28031a;
            c7618x0.m29357w().m29024u(null);
            DialogC4072r0 dialogC4072r0 = C7618x0.f28033c;
            if (dialogC4072r0 != null) {
                DialogC4072r0.m17098e(dialogC4072r0, DialogC4072r0.a.ExtraNet, NetConnectStatusView.EnumC3019a.Default, C7618x0.f28040j, 0L, false, 24, null);
            }
            DialogC4072r0 dialogC4072r02 = C7618x0.f28033c;
            if (dialogC4072r02 != null) {
                DialogC4072r0.m17098e(dialogC4072r02, DialogC4072r0.a.Server, NetConnectStatusView.EnumC3019a.Default, C7618x0.f28040j, 0L, false, 24, null);
            }
            c7618x0.m29353s(AbstractApplicationC6253c.f24484b.m24887a());
        }
    }

    /* renamed from: xa.x0$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final c f28054a = new c();

        c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            return new Handler();
        }
    }

    /* renamed from: xa.x0$d */
    /* loaded from: classes2.dex */
    static final class d extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final d f28055a = new d();

        d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7570g0 invoke() {
            return new C7570g0();
        }
    }

    /* renamed from: xa.x0$e */
    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC7620y0 {
        e() {
        }

        @Override // p400xa.InterfaceC7620y0
        /* renamed from: a */
        public void mo29366a(boolean z10, boolean z11, int i10) {
            if (z11) {
                C7618x0.f28048r = z10;
                C7618x0.f28049s = i10;
                if (!C7618x0.f28038h) {
                    long elapsedRealtime = OkGo.DEFAULT_MILLISECONDS - (SystemClock.elapsedRealtime() - C7618x0.f28036f);
                    if (elapsedRealtime <= 0) {
                        elapsedRealtime = 0;
                    }
                    C7618x0 c7618x0 = C7618x0.f28031a;
                    c7618x0.m29356v().removeCallbacks(C7618x0.f28052v);
                    c7618x0.m29356v().postDelayed(C7618x0.f28052v, elapsedRealtime);
                    return;
                }
                if (z10) {
                    DialogC4072r0 dialogC4072r0 = C7618x0.f28033c;
                    if (dialogC4072r0 != null) {
                        dialogC4072r0.m17104d(DialogC4072r0.a.Server, NetConnectStatusView.EnumC3019a.Connected, C7618x0.f28040j, i10, C7618x0.f28038h);
                    }
                } else {
                    DialogC4072r0 dialogC4072r02 = C7618x0.f28033c;
                    if (dialogC4072r02 != null) {
                        dialogC4072r02.m17104d(DialogC4072r0.a.Server, NetConnectStatusView.EnumC3019a.Error, C7618x0.f28040j, 0L, C7618x0.f28038h);
                    }
                }
                C7618x0.f28031a.m29332A();
                a aVar = C7618x0.f28047q;
                if (aVar != null) {
                    aVar.mo11884b(z10, C7618x0.f28038h, C7618x0.f28040j);
                    return;
                }
                return;
            }
            if (z10) {
                DialogC4072r0 dialogC4072r03 = C7618x0.f28033c;
                if (dialogC4072r03 != null) {
                    dialogC4072r03.m17104d(DialogC4072r0.a.ExtraNet, NetConnectStatusView.EnumC3019a.Connected, C7618x0.f28040j, i10, C7618x0.f28038h);
                }
                C7618x0.f28031a.m29355u(C7618x0.f28035e, C7618x0.f28039i, C7618x0.f28038h, true);
                return;
            }
            DialogC4072r0 dialogC4072r04 = C7618x0.f28033c;
            if (dialogC4072r04 != null) {
                dialogC4072r04.m17104d(DialogC4072r0.a.ExtraNet, NetConnectStatusView.EnumC3019a.Error, C7618x0.f28040j, 0L, C7618x0.f28038h);
            }
            C7618x0.f28031a.m29332A();
        }
    }

    static {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        C7618x0 c7618x0 = new C7618x0();
        f28031a = c7618x0;
        f28032b = c7618x0.getClass().getSimpleName();
        f28034d = new ArrayList();
        f28035e = new ArrayList();
        m5965b = AbstractC1314j.m5965b(c.f28054a);
        f28037g = m5965b;
        f28038h = true;
        f28039i = "";
        f28040j = "";
        f28041k = "";
        f28042l = "";
        f28043m = "";
        f28044n = "";
        f28045o = "";
        m5965b2 = AbstractC1314j.m5965b(d.f28055a);
        f28046p = m5965b2;
        f28050t = "";
        f28051u = new e();
        f28052v = new Runnable() { // from class: xa.v0
            @Override // java.lang.Runnable
            public final void run() {
                C7618x0.m29333B();
            }
        };
        f28053w = new b();
    }

    private C7618x0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public final void m29332A() {
        boolean z10;
        Context context;
        DialogC4072r0 dialogC4072r0;
        DialogC4072r0 dialogC4072r02 = f28033c;
        boolean z11 = true;
        if (dialogC4072r02 != null && !dialogC4072r02.isShowing()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            DialogC4072r0 dialogC4072r03 = f28033c;
            Activity activity = null;
            if (dialogC4072r03 != null) {
                context = dialogC4072r03.m17103b();
            } else {
                context = null;
            }
            if (context instanceof Activity) {
                activity = (Activity) context;
            }
            if (activity == null || activity.isFinishing()) {
                z11 = false;
            }
            if (z11 && (dialogC4072r0 = f28033c) != null) {
                dialogC4072r0.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static final void m29333B() {
        if (f28048r) {
            DialogC4072r0 dialogC4072r0 = f28033c;
            if (dialogC4072r0 != null) {
                dialogC4072r0.m17104d(DialogC4072r0.a.Server, NetConnectStatusView.EnumC3019a.Connected, f28040j, f28049s, f28038h);
            }
        } else {
            DialogC4072r0 dialogC4072r02 = f28033c;
            if (dialogC4072r02 != null) {
                dialogC4072r02.m17104d(DialogC4072r0.a.Server, NetConnectStatusView.EnumC3019a.Error, f28040j, 0L, f28038h);
            }
        }
        f28031a.m29332A();
        a aVar = f28047q;
        if (aVar != null) {
            aVar.mo11884b(f28048r, f28038h, f28040j);
        }
        DialogC4072r0 dialogC4072r03 = f28033c;
        if (dialogC4072r03 != null) {
            dialogC4072r03.dismiss();
        }
    }

    /* renamed from: r */
    private final void m29352r() {
        DialogC4072r0 dialogC4072r0 = f28033c;
        if (dialogC4072r0 != null) {
            DialogC4072r0.m17098e(dialogC4072r0, DialogC4072r0.a.ExtraNet, NetConnectStatusView.EnumC3019a.Checking, f28040j, 0L, false, 24, null);
        }
        m29357w().m29024u(f28051u);
        m29357w().m29022o(f28034d, f28039i, f28038h, false, (r29 & 16) != 0 ? "" : f28041k, (r29 & 32) != 0 ? "" : f28043m, (r29 & 64) != 0 ? "" : f28044n, (r29 & 128) != 0 ? "" : f28045o, (r29 & 256) != 0 ? "" : f28042l, (r29 & 512) != 0 ? "" : f28050t, (r29 & EventType.AUTH_FAIL) != 0 ? 4 : 0, (r29 & 2048) != 0 ? 6 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final void m29353s(Context context) {
        double d10;
        double d11;
        String str;
        f28048r = false;
        f28049s = 0;
        f28036f = SystemClock.elapsedRealtime();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        DialogC4072r0 dialogC4072r0 = f28033c;
        if (dialogC4072r0 != null) {
            DialogC4072r0.m17098e(dialogC4072r0, DialogC4072r0.a.Route, NetConnectStatusView.EnumC3019a.Checking, f28040j, 0L, false, 24, null);
        }
        if (AbstractC5094k.m20685b(context)) {
            final long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            m29356v().postDelayed(new Runnable() { // from class: xa.w0
                @Override // java.lang.Runnable
                public final void run() {
                    C7618x0.m29354t(elapsedRealtime2);
                }
            }, 1000L);
            d10 = elapsedRealtime2;
            d11 = 1.0d;
        } else {
            DialogC4072r0 dialogC4072r02 = f28033c;
            if (dialogC4072r02 != null) {
                DialogC4072r0.m17098e(dialogC4072r02, DialogC4072r0.a.Route, NetConnectStatusView.EnumC3019a.Error, f28040j, 0L, false, 24, null);
            }
            m29332A();
            d10 = 0.0d;
            d11 = 0.0d;
        }
        if (f28038h) {
            str = "portal";
        } else {
            str = ConnType.PK_CDN;
        }
        C7575i.f27835a.m29065a(d10, d10, d10, d11, str, "route", f28050t, f28041k, f28043m, "", "", "", f28044n, f28045o, f28042l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m29354t(long j10) {
        DialogC4072r0 dialogC4072r0 = f28033c;
        if (dialogC4072r0 != null) {
            DialogC4072r0.m17098e(dialogC4072r0, DialogC4072r0.a.Route, NetConnectStatusView.EnumC3019a.Connected, f28040j, j10, false, 16, null);
        }
        f28031a.m29352r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final void m29355u(ArrayList arrayList, String str, boolean z10, boolean z11) {
        boolean z12;
        m29356v().removeCallbacks(f28052v);
        DialogC4072r0 dialogC4072r0 = f28033c;
        if (dialogC4072r0 != null) {
            DialogC4072r0.m17098e(dialogC4072r0, DialogC4072r0.a.Server, NetConnectStatusView.EnumC3019a.Checking, f28040j, 0L, false, 24, null);
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z12 || !z11) {
            m29357w().m29022o(arrayList, str, z10, z11, (r29 & 16) != 0 ? "" : f28041k, (r29 & 32) != 0 ? "" : f28043m, (r29 & 64) != 0 ? "" : f28044n, (r29 & 128) != 0 ? "" : f28045o, (r29 & 256) != 0 ? "" : f28042l, (r29 & 512) != 0 ? "" : f28050t, (r29 & EventType.AUTH_FAIL) != 0 ? 4 : 0, (r29 & 2048) != 0 ? 6 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public final Handler m29356v() {
        return (Handler) f28037g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public final C7570g0 m29357w() {
        return (C7570g0) f28046p.getValue();
    }

    /* renamed from: y */
    public static /* synthetic */ void m29358y(C7618x0 c7618x0, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        c7618x0.m29362x(z10);
    }

    /* renamed from: C */
    public final void m29359C(ArrayList arrayList, ArrayList arrayList2, boolean z10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        AbstractC5868k.m23674f(arrayList2, "serverList");
        AbstractC5868k.m23674f(str2, Constants.KEY_ERROR_CODE);
        AbstractC5868k.m23674f(str3, "eCode");
        AbstractC5868k.m23674f(str4, "title");
        AbstractC5868k.m23674f(str5, Constants.KEY_HTTP_CODE);
        AbstractC5868k.m23674f(str6, "bussType");
        AbstractC5868k.m23674f(str7, "cdnType");
        AbstractC5868k.m23674f(str8, "transId");
        f28034d.clear();
        if (AbstractC6567a.m25638h(arrayList)) {
            ArrayList arrayList3 = f28034d;
            AbstractC5868k.m23671c(arrayList);
            arrayList3.addAll(arrayList);
        }
        f28035e.clear();
        f28035e.addAll(arrayList2);
        f28038h = z10;
        if (str == null) {
            str = "";
        }
        f28039i = str;
        f28040j = str2;
        f28043m = str4;
        f28041k = str5;
        f28044n = str6;
        f28045o = str7;
        f28042l = str8;
        f28050t = str3;
    }

    /* renamed from: E */
    public final void m29360E(a aVar) {
        AbstractC5868k.m23674f(aVar, "listener");
        f28047q = aVar;
    }

    /* renamed from: F */
    public final void m29361F(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        DialogC4072r0 dialogC4072r0 = f28033c;
        boolean z10 = false;
        if (dialogC4072r0 != null && dialogC4072r0.isShowing()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        DialogC4072r0 dialogC4072r02 = new DialogC4072r0(context);
        f28033c = dialogC4072r02;
        dialogC4072r02.m17105i(f28053w);
        try {
            DialogC4072r0 dialogC4072r03 = f28033c;
            if (dialogC4072r03 != null) {
                dialogC4072r03.show();
            }
        } catch (RuntimeException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: x */
    public final void m29362x(boolean z10) {
        C7570g0 m29357w;
        DialogC4072r0 dialogC4072r0;
        DialogC4072r0 dialogC4072r02 = f28033c;
        boolean z11 = false;
        if (dialogC4072r02 != null && dialogC4072r02.isShowing()) {
            z11 = true;
        }
        if (z11 && (dialogC4072r0 = f28033c) != null) {
            dialogC4072r0.dismiss();
        }
        f28033c = null;
        m29356v().removeCallbacks(f28052v);
        if (z10 && (m29357w = m29357w()) != null) {
            m29357w.m29023q();
        }
        m29357w().m29024u(null);
    }

    /* renamed from: z */
    public final boolean m29363z() {
        boolean z10;
        DialogC4072r0 dialogC4072r0 = f28033c;
        if (dialogC4072r0 != null && dialogC4072r0.isShowing()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return false;
    }
}
