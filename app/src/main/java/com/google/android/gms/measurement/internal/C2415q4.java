package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.entity.ConnType;
import com.google.android.gms.internal.measurement.AbstractC2220z6;
import com.google.android.gms.internal.measurement.C1861bc;
import com.google.android.gms.internal.measurement.C2080q1;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import p025b5.C1098b;
import p025b5.C1116n;
import p025b5.EnumC1096a;
import p219l4.AbstractC5391n;
import p281p4.C6203g;
import p281p4.InterfaceC6200d;
import p310r4.C6534e;

/* renamed from: com.google.android.gms.measurement.internal.q4 */
/* loaded from: classes.dex */
public final class C2415q4 implements InterfaceC2361l5 {

    /* renamed from: H */
    private static volatile C2415q4 f8965H;

    /* renamed from: A */
    private volatile Boolean f8966A;

    /* renamed from: B */
    protected Boolean f8967B;

    /* renamed from: C */
    protected Boolean f8968C;

    /* renamed from: D */
    private volatile boolean f8969D;

    /* renamed from: E */
    private int f8970E;

    /* renamed from: G */
    final long f8972G;

    /* renamed from: a */
    private final Context f8973a;

    /* renamed from: b */
    private final String f8974b;

    /* renamed from: c */
    private final String f8975c;

    /* renamed from: d */
    private final String f8976d;

    /* renamed from: e */
    private final boolean f8977e;

    /* renamed from: f */
    private final C2256c f8978f;

    /* renamed from: g */
    private final C2311h f8979g;

    /* renamed from: h */
    private final C2238a4 f8980h;

    /* renamed from: i */
    private final C2370m3 f8981i;

    /* renamed from: j */
    private final C2393o4 f8982j;

    /* renamed from: k */
    private final C2430r8 f8983k;

    /* renamed from: l */
    private final C2398o9 f8984l;

    /* renamed from: m */
    private final C2315h3 f8985m;

    /* renamed from: n */
    private final InterfaceC6200d f8986n;

    /* renamed from: o */
    private final C2253b7 f8987o;

    /* renamed from: p */
    private final C2406p6 f8988p;

    /* renamed from: q */
    private final C2236a2 f8989q;

    /* renamed from: r */
    private final C2439s6 f8990r;

    /* renamed from: s */
    private final String f8991s;

    /* renamed from: t */
    private C2304g3 f8992t;

    /* renamed from: u */
    private C2254b8 f8993u;

    /* renamed from: v */
    private C2399p f8994v;

    /* renamed from: w */
    private C2282e3 f8995w;

    /* renamed from: y */
    private Boolean f8997y;

    /* renamed from: z */
    private long f8998z;

    /* renamed from: x */
    private boolean f8996x = false;

    /* renamed from: F */
    private final AtomicInteger f8971F = new AtomicInteger(0);

    C2415q4(C2394o5 c2394o5) {
        long mo24747a;
        Bundle bundle;
        AbstractC5391n.m21783i(c2394o5);
        Context context = c2394o5.f8887a;
        C2256c c2256c = new C2256c(context);
        this.f8978f = c2256c;
        AbstractC2512z2.f9246a = c2256c;
        this.f8973a = context;
        this.f8974b = c2394o5.f8888b;
        this.f8975c = c2394o5.f8889c;
        this.f8976d = c2394o5.f8890d;
        this.f8977e = c2394o5.f8894h;
        this.f8966A = c2394o5.f8891e;
        this.f8991s = c2394o5.f8896j;
        this.f8969D = true;
        C2080q1 c2080q1 = c2394o5.f8893g;
        if (c2080q1 != null && (bundle = c2080q1.f8017g) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f8967B = (Boolean) obj;
            }
            Object obj2 = c2080q1.f8017g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f8968C = (Boolean) obj2;
            }
        }
        AbstractC2220z6.m9395e(context);
        InterfaceC6200d m24754d = C6203g.m24754d();
        this.f8986n = m24754d;
        Long l10 = c2394o5.f8895i;
        if (l10 != null) {
            mo24747a = l10.longValue();
        } else {
            mo24747a = m24754d.mo24747a();
        }
        this.f8972G = mo24747a;
        this.f8979g = new C2311h(this);
        C2238a4 c2238a4 = new C2238a4(this);
        c2238a4.m9732l();
        this.f8980h = c2238a4;
        C2370m3 c2370m3 = new C2370m3(this);
        c2370m3.m9732l();
        this.f8981i = c2370m3;
        C2398o9 c2398o9 = new C2398o9(this);
        c2398o9.m9732l();
        this.f8984l = c2398o9;
        this.f8985m = new C2315h3(new C2383n5(c2394o5, this));
        this.f8989q = new C2236a2(this);
        C2253b7 c2253b7 = new C2253b7(this);
        c2253b7.m10106j();
        this.f8987o = c2253b7;
        C2406p6 c2406p6 = new C2406p6(this);
        c2406p6.m10106j();
        this.f8988p = c2406p6;
        C2430r8 c2430r8 = new C2430r8(this);
        c2430r8.m10106j();
        this.f8983k = c2430r8;
        C2439s6 c2439s6 = new C2439s6(this);
        c2439s6.m9732l();
        this.f8990r = c2439s6;
        C2393o4 c2393o4 = new C2393o4(this);
        c2393o4.m9732l();
        this.f8982j = c2393o4;
        C2080q1 c2080q12 = c2394o5.f8893g;
        boolean z10 = c2080q12 == null || c2080q12.f8012b == 0;
        if (context.getApplicationContext() instanceof Application) {
            C2406p6 m10026I = m10026I();
            if (m10026I.f8714a.f8973a.getApplicationContext() instanceof Application) {
                Application application = (Application) m10026I.f8714a.f8973a.getApplicationContext();
                if (m10026I.f8926c == null) {
                    m10026I.f8926c = new C2395o6(m10026I, null);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(m10026I.f8926c);
                    application.registerActivityLifecycleCallbacks(m10026I.f8926c);
                    m10026I.f8714a.mo9577b().m9804v().m9699a("Registered activity lifecycle callback");
                }
            }
        } else {
            mo9577b().m9805w().m9699a("Application context is not an Application");
        }
        c2393o4.m9897z(new RunnableC2404p4(this, c2394o5));
    }

    /* renamed from: H */
    public static C2415q4 m10013H(Context context, C2080q1 c2080q1, Long l10) {
        Bundle bundle;
        if (c2080q1 != null && (c2080q1.f8015e == null || c2080q1.f8016f == null)) {
            c2080q1 = new C2080q1(c2080q1.f8011a, c2080q1.f8012b, c2080q1.f8013c, c2080q1.f8014d, null, null, c2080q1.f8017g, null);
        }
        AbstractC5391n.m21783i(context);
        AbstractC5391n.m21783i(context.getApplicationContext());
        if (f8965H == null) {
            synchronized (C2415q4.class) {
                if (f8965H == null) {
                    f8965H = new C2415q4(new C2394o5(context, c2080q1, l10));
                }
            }
        } else if (c2080q1 != null && (bundle = c2080q1.f8017g) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            AbstractC5391n.m21783i(f8965H);
            f8965H.f8966A = Boolean.valueOf(c2080q1.f8017g.getBoolean("dataCollectionDefaultEnabled"));
        }
        AbstractC5391n.m21783i(f8965H);
        return f8965H;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* bridge */ /* synthetic */ void m10014e(C2415q4 c2415q4, C2394o5 c2394o5) {
        c2415q4.mo9575a().mo9428h();
        c2415q4.f8979g.m9633w();
        C2399p c2399p = new C2399p(c2415q4);
        c2399p.m9732l();
        c2415q4.f8994v = c2399p;
        C2282e3 c2282e3 = new C2282e3(c2415q4, c2394o5.f8892f);
        c2282e3.m10106j();
        c2415q4.f8995w = c2282e3;
        C2304g3 c2304g3 = new C2304g3(c2415q4);
        c2304g3.m10106j();
        c2415q4.f8992t = c2304g3;
        C2254b8 c2254b8 = new C2254b8(c2415q4);
        c2254b8.m10106j();
        c2415q4.f8993u = c2254b8;
        c2415q4.f8984l.m9733m();
        c2415q4.f8980h.m9733m();
        c2415q4.f8995w.m10107k();
        C2348k3 m9803u = c2415q4.mo9577b().m9803u();
        c2415q4.f8979g.m9627q();
        m9803u.m9700b("App measurement initialized, version", 73000L);
        c2415q4.mo9577b().m9803u().m9699a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String m9528s = c2282e3.m9528s();
        if (TextUtils.isEmpty(c2415q4.f8974b)) {
            if (c2415q4.m10031N().m9932T(m9528s)) {
                c2415q4.mo9577b().m9803u().m9699a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                c2415q4.mo9577b().m9803u().m9699a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(m9528s)));
            }
        }
        c2415q4.mo9577b().m9799q().m9699a("Debug-level message logging enabled");
        if (c2415q4.f8970E != c2415q4.f8971F.get()) {
            c2415q4.mo9577b().m9800r().m9701c("Not all components initialized", Integer.valueOf(c2415q4.f8970E), Integer.valueOf(c2415q4.f8971F.get()));
        }
        c2415q4.f8996x = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static final void m10015t() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* renamed from: u */
    private static final void m10016u(AbstractC2339j5 abstractC2339j5) {
        if (abstractC2339j5 != null) {
        } else {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: v */
    private static final void m10017v(AbstractC2491x3 abstractC2491x3) {
        if (abstractC2491x3 != null) {
            if (abstractC2491x3.m10108m()) {
                return;
            } else {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC2491x3.getClass())));
            }
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: w */
    private static final void m10018w(AbstractC2350k5 abstractC2350k5) {
        if (abstractC2350k5 != null) {
            if (abstractC2350k5.m9734n()) {
                return;
            } else {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC2350k5.getClass())));
            }
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: A */
    public final C2399p m10019A() {
        m10018w(this.f8994v);
        return this.f8994v;
    }

    /* renamed from: B */
    public final C2282e3 m10020B() {
        m10017v(this.f8995w);
        return this.f8995w;
    }

    /* renamed from: C */
    public final C2304g3 m10021C() {
        m10017v(this.f8992t);
        return this.f8992t;
    }

    /* renamed from: D */
    public final C2315h3 m10022D() {
        return this.f8985m;
    }

    /* renamed from: E */
    public final C2370m3 m10023E() {
        C2370m3 c2370m3 = this.f8981i;
        if (c2370m3 == null || !c2370m3.m9734n()) {
            return null;
        }
        return c2370m3;
    }

    /* renamed from: F */
    public final C2238a4 m10024F() {
        m10016u(this.f8980h);
        return this.f8980h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public final C2393o4 m10025G() {
        return this.f8982j;
    }

    /* renamed from: I */
    public final C2406p6 m10026I() {
        m10017v(this.f8988p);
        return this.f8988p;
    }

    /* renamed from: J */
    public final C2439s6 m10027J() {
        m10018w(this.f8990r);
        return this.f8990r;
    }

    /* renamed from: K */
    public final C2253b7 m10028K() {
        m10017v(this.f8987o);
        return this.f8987o;
    }

    /* renamed from: L */
    public final C2254b8 m10029L() {
        m10017v(this.f8993u);
        return this.f8993u;
    }

    /* renamed from: M */
    public final C2430r8 m10030M() {
        m10017v(this.f8983k);
        return this.f8983k;
    }

    /* renamed from: N */
    public final C2398o9 m10031N() {
        m10016u(this.f8984l);
        return this.f8984l;
    }

    /* renamed from: O */
    public final String m10032O() {
        return this.f8974b;
    }

    /* renamed from: P */
    public final String m10033P() {
        return this.f8975c;
    }

    /* renamed from: Q */
    public final String m10034Q() {
        return this.f8976d;
    }

    /* renamed from: R */
    public final String m10035R() {
        return this.f8991s;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2361l5
    /* renamed from: a */
    public final C2393o4 mo9575a() {
        m10018w(this.f8982j);
        return this.f8982j;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2361l5
    /* renamed from: b */
    public final C2370m3 mo9577b() {
        m10018w(this.f8981i);
        return this.f8981i;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2361l5
    /* renamed from: c */
    public final InterfaceC6200d mo9578c() {
        return this.f8986n;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2361l5
    /* renamed from: d */
    public final C2256c mo9580d() {
        return this.f8978f;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2361l5
    /* renamed from: f */
    public final Context mo9584f() {
        return this.f8973a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m10036g() {
        this.f8971F.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void m10037h(String str, int i10, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        if (i10 != 200 && i10 != 204) {
            if (i10 == 304) {
                i10 = 304;
            }
            mo9577b().m9805w().m9701c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th);
        }
        if (th == null) {
            m10024F().f8351r.m10081a(true);
            if (bArr != null && bArr.length != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String optString = jSONObject.optString("deeplink", "");
                    String optString2 = jSONObject.optString("gclid", "");
                    double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                    if (TextUtils.isEmpty(optString)) {
                        mo9577b().m9799q().m9699a("Deferred Deep Link is empty.");
                        return;
                    }
                    C2398o9 m10031N = m10031N();
                    C2415q4 c2415q4 = m10031N.f8714a;
                    if (!TextUtils.isEmpty(optString) && (queryIntentActivities = m10031N.f8714a.f8973a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.f8988p.m10002u(ConnType.PK_AUTO, "_cmp", bundle);
                        C2398o9 m10031N2 = m10031N();
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = m10031N2.f8714a.f8973a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    m10031N2.f8714a.f8973a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (RuntimeException e10) {
                                m10031N2.f8714a.mo9577b().m9800r().m9700b("Failed to persist Deferred Deep Link. exception", e10);
                                return;
                            }
                        }
                        return;
                    }
                    mo9577b().m9805w().m9701c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                    return;
                } catch (JSONException e11) {
                    mo9577b().m9800r().m9700b("Failed to parse the Deferred Deep Link response. exception", e11);
                    return;
                }
            }
            mo9577b().m9799q().m9699a("Deferred Deep Link response empty.");
            return;
        }
        mo9577b().m9805w().m9701c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final void m10038i() {
        this.f8970E++;
    }

    /* renamed from: j */
    public final void m10039j() {
        mo9575a().mo9428h();
        m10018w(m10027J());
        String m9528s = m10020B().m9528s();
        Pair m9432p = m10024F().m9432p(m9528s);
        if (this.f8979g.m9613A() && !((Boolean) m9432p.second).booleanValue() && !TextUtils.isEmpty((CharSequence) m9432p.first)) {
            C2439s6 m10027J = m10027J();
            m10027J.m9731k();
            ConnectivityManager connectivityManager = (ConnectivityManager) m10027J.f8714a.f8973a.getSystemService("connectivity");
            NetworkInfo networkInfo = null;
            if (connectivityManager != null) {
                try {
                    networkInfo = connectivityManager.getActiveNetworkInfo();
                } catch (SecurityException unused) {
                }
            }
            if (networkInfo != null && networkInfo.isConnected()) {
                C2398o9 m10031N = m10031N();
                m10020B().f8714a.f8979g.m9627q();
                URL m9949s = m10031N.m9949s(73000L, m9528s, (String) m9432p.first, m10024F().f8352s.m10097a() - 1);
                if (m9949s != null) {
                    C2439s6 m10027J2 = m10027J();
                    C1116n c1116n = new C1116n(this);
                    m10027J2.mo9428h();
                    m10027J2.m9731k();
                    AbstractC5391n.m21783i(m9949s);
                    AbstractC5391n.m21783i(c1116n);
                    m10027J2.f8714a.mo9575a().m9896y(new RunnableC2428r6(m10027J2, m9528s, m9949s, null, null, c1116n, null));
                    return;
                }
                return;
            }
            mo9577b().m9805w().m9699a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        mo9577b().m9799q().m9699a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final void m10040k(boolean z10) {
        this.f8966A = Boolean.valueOf(z10);
    }

    /* renamed from: l */
    public final void m10041l(boolean z10) {
        mo9575a().mo9428h();
        this.f8969D = z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public final void m10042m(C2080q1 c2080q1) {
        C1098b c1098b;
        mo9575a().mo9428h();
        C1098b m9433q = m10024F().m9433q();
        C2238a4 m10024F = m10024F();
        C2415q4 c2415q4 = m10024F.f8714a;
        m10024F.mo9428h();
        int i10 = 100;
        int i11 = m10024F.m9431o().getInt("consent_source", 100);
        C2311h c2311h = this.f8979g;
        C2415q4 c2415q42 = c2311h.f8714a;
        Boolean m9630t = c2311h.m9630t("google_analytics_default_allow_ad_storage");
        C2311h c2311h2 = this.f8979g;
        C2415q4 c2415q43 = c2311h2.f8714a;
        Boolean m9630t2 = c2311h2.m9630t("google_analytics_default_allow_analytics_storage");
        if ((m9630t != null || m9630t2 != null) && m10024F().m9439w(-10)) {
            c1098b = new C1098b(m9630t, m9630t2);
            i10 = -10;
        } else {
            if (!TextUtils.isEmpty(m10020B().m9529t()) && (i11 == 0 || i11 == 30 || i11 == 10 || i11 == 30 || i11 == 30 || i11 == 40)) {
                m10026I().m9976G(C1098b.f4403b, -10, this.f8972G);
            } else if (TextUtils.isEmpty(m10020B().m9529t()) && c2080q1 != null && c2080q1.f8017g != null && m10024F().m9439w(30)) {
                c1098b = C1098b.m5044a(c2080q1.f8017g);
                if (!c1098b.equals(C1098b.f4403b)) {
                    i10 = 30;
                }
            }
            c1098b = null;
        }
        if (c1098b != null) {
            m10026I().m9976G(c1098b, i10, this.f8972G);
            m9433q = c1098b;
        }
        m10026I().m9979J(m9433q);
        if (m10024F().f8338e.m10097a() == 0) {
            mo9577b().m9804v().m9700b("Persisting first open", Long.valueOf(this.f8972G));
            m10024F().f8338e.m10098b(this.f8972G);
        }
        m10026I().f8937n.m10093c();
        if (!m10047r()) {
            if (m10044o()) {
                if (!m10031N().m9931S("android.permission.INTERNET")) {
                    mo9577b().m9800r().m9699a("App is missing INTERNET permission");
                }
                if (!m10031N().m9931S("android.permission.ACCESS_NETWORK_STATE")) {
                    mo9577b().m9800r().m9699a("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!C6534e.m25570a(this.f8973a).m25568f() && !this.f8979g.m9619G()) {
                    if (!C2398o9.m9900Y(this.f8973a)) {
                        mo9577b().m9800r().m9699a("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!C2398o9.m9901Z(this.f8973a, false)) {
                        mo9577b().m9800r().m9699a("AppMeasurementService not registered/enabled");
                    }
                }
                mo9577b().m9800r().m9699a("Uploading is not possible. App measurement disabled");
            }
        } else {
            if (!TextUtils.isEmpty(m10020B().m9529t()) || !TextUtils.isEmpty(m10020B().m9527r())) {
                C2398o9 m10031N = m10031N();
                String m9529t = m10020B().m9529t();
                C2238a4 m10024F2 = m10024F();
                m10024F2.mo9428h();
                String string = m10024F2.m9431o().getString("gmp_app_id", null);
                String m9527r = m10020B().m9527r();
                C2238a4 m10024F3 = m10024F();
                m10024F3.mo9428h();
                if (m10031N.m9935b0(m9529t, string, m9527r, m10024F3.m9431o().getString("admob_app_id", null))) {
                    mo9577b().m9803u().m9699a("Rechecking which service to use due to a GMP App Id change");
                    C2238a4 m10024F4 = m10024F();
                    m10024F4.mo9428h();
                    Boolean m9434r = m10024F4.m9434r();
                    SharedPreferences.Editor edit = m10024F4.m9431o().edit();
                    edit.clear();
                    edit.apply();
                    if (m9434r != null) {
                        m10024F4.m9435s(m9434r);
                    }
                    m10021C().m9539q();
                    this.f8993u.m9494Q();
                    this.f8993u.m9493P();
                    m10024F().f8338e.m10098b(this.f8972G);
                    m10024F().f8340g.m10116b(null);
                }
                C2238a4 m10024F5 = m10024F();
                String m9529t2 = m10020B().m9529t();
                m10024F5.mo9428h();
                SharedPreferences.Editor edit2 = m10024F5.m9431o().edit();
                edit2.putString("gmp_app_id", m9529t2);
                edit2.apply();
                C2238a4 m10024F6 = m10024F();
                String m9527r2 = m10020B().m9527r();
                m10024F6.mo9428h();
                SharedPreferences.Editor edit3 = m10024F6.m9431o().edit();
                edit3.putString("admob_app_id", m9527r2);
                edit3.apply();
            }
            if (!m10024F().m9433q().m5055i(EnumC1096a.ANALYTICS_STORAGE)) {
                m10024F().f8340g.m10116b(null);
            }
            m10026I().m9972C(m10024F().f8340g.m10115a());
            C1861bc.m8149c();
            if (this.f8979g.m9614B(null, AbstractC2260c3.f8455e0)) {
                try {
                    m10031N().f8714a.f8973a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(m10024F().f8353t.m10115a())) {
                        mo9577b().m9805w().m9699a("Remote config removed with active feature rollouts");
                        m10024F().f8353t.m10116b(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(m10020B().m9529t()) || !TextUtils.isEmpty(m10020B().m9527r())) {
                boolean m10044o = m10044o();
                if (!m10024F().m9437u() && !this.f8979g.m9617E()) {
                    m10024F().m9436t(!m10044o);
                }
                if (m10044o) {
                    m10026I().m9995f0();
                }
                m10030M().f9043d.m10052a();
                m10029L().m9496S(new AtomicReference());
                m10029L().m9508v(m10024F().f8356w.m10089a());
            }
        }
        m10024F().f8347n.m10081a(true);
    }

    /* renamed from: n */
    public final boolean m10043n() {
        if (this.f8966A != null && this.f8966A.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean m10044o() {
        if (m10049x() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final boolean m10045p() {
        mo9575a().mo9428h();
        return this.f8969D;
    }

    /* renamed from: q */
    public final boolean m10046q() {
        return TextUtils.isEmpty(this.f8974b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean m10047r() {
        boolean z10;
        if (this.f8996x) {
            mo9575a().mo9428h();
            Boolean bool = this.f8997y;
            if (bool == null || this.f8998z == 0 || (!bool.booleanValue() && Math.abs(this.f8986n.mo24748b() - this.f8998z) > 1000)) {
                this.f8998z = this.f8986n.mo24748b();
                boolean z11 = true;
                if (m10031N().m9931S("android.permission.INTERNET") && m10031N().m9931S("android.permission.ACCESS_NETWORK_STATE") && (C6534e.m25570a(this.f8973a).m25568f() || this.f8979g.m9619G() || (C2398o9.m9900Y(this.f8973a) && C2398o9.m9901Z(this.f8973a, false)))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean valueOf = Boolean.valueOf(z10);
                this.f8997y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!m10031N().m9924L(m10020B().m9529t(), m10020B().m9527r()) && TextUtils.isEmpty(m10020B().m9527r())) {
                        z11 = false;
                    }
                    this.f8997y = Boolean.valueOf(z11);
                }
            }
            return this.f8997y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    /* renamed from: s */
    public final boolean m10048s() {
        return this.f8977e;
    }

    /* renamed from: x */
    public final int m10049x() {
        mo9575a().mo9428h();
        if (this.f8979g.m9617E()) {
            return 1;
        }
        Boolean bool = this.f8968C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        mo9575a().mo9428h();
        if (!this.f8969D) {
            return 8;
        }
        Boolean m9434r = m10024F().m9434r();
        if (m9434r != null) {
            if (m9434r.booleanValue()) {
                return 0;
            }
            return 3;
        }
        C2311h c2311h = this.f8979g;
        C2256c c2256c = c2311h.f8714a.f8978f;
        Boolean m9630t = c2311h.m9630t("firebase_analytics_collection_enabled");
        if (m9630t != null) {
            if (m9630t.booleanValue()) {
                return 0;
            }
            return 4;
        }
        Boolean bool2 = this.f8967B;
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                return 0;
            }
            return 5;
        }
        if (this.f8966A == null || this.f8966A.booleanValue()) {
            return 0;
        }
        return 7;
    }

    /* renamed from: y */
    public final C2236a2 m10050y() {
        C2236a2 c2236a2 = this.f8989q;
        if (c2236a2 != null) {
            return c2236a2;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: z */
    public final C2311h m10051z() {
        return this.f8979g;
    }
}
