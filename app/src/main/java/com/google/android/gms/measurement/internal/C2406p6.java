package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import anet.channel.entity.ConnType;
import com.google.android.gms.internal.measurement.C1861bc;
import com.google.android.gms.internal.measurement.C1942gd;
import com.google.android.gms.internal.measurement.C2016lc;
import com.lzy.okgo.cookie.SerializableCookie;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p025b5.AbstractC1105e0;
import p025b5.AbstractC1118p;
import p025b5.AbstractC1119q;
import p025b5.AbstractC1121s;
import p025b5.C1098b;
import p025b5.EnumC1096a;
import p025b5.InterfaceC1122t;
import p025b5.InterfaceC1123u;
import p214l.C5303a;
import p219l4.AbstractC5391n;
import p281p4.AbstractC6201e;
import p281p4.AbstractC6209m;

/* renamed from: com.google.android.gms.measurement.internal.p6 */
/* loaded from: classes.dex */
public final class C2406p6 extends AbstractC2491x3 {

    /* renamed from: c */
    protected C2395o6 f8926c;

    /* renamed from: d */
    private InterfaceC1122t f8927d;

    /* renamed from: e */
    private final Set f8928e;

    /* renamed from: f */
    private boolean f8929f;

    /* renamed from: g */
    private final AtomicReference f8930g;

    /* renamed from: h */
    private final Object f8931h;

    /* renamed from: i */
    private C1098b f8932i;

    /* renamed from: j */
    private int f8933j;

    /* renamed from: k */
    private final AtomicLong f8934k;

    /* renamed from: l */
    private long f8935l;

    /* renamed from: m */
    private int f8936m;

    /* renamed from: n */
    final C2475v9 f8937n;

    /* renamed from: o */
    protected boolean f8938o;

    /* renamed from: p */
    private final InterfaceC2387n9 f8939p;

    /* JADX INFO: Access modifiers changed from: protected */
    public C2406p6(C2415q4 c2415q4) {
        super(c2415q4);
        this.f8928e = new CopyOnWriteArraySet();
        this.f8931h = new Object();
        this.f8938o = true;
        this.f8939p = new C2274d6(this);
        this.f8930g = new AtomicReference();
        this.f8932i = new C1098b(null, null);
        this.f8933j = 100;
        this.f8935l = -1L;
        this.f8936m = 100;
        this.f8934k = new AtomicLong(0L);
        this.f8937n = new C2475v9(c2415q4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public final void m9964O(Boolean bool, boolean z10) {
        mo9428h();
        m10105i();
        this.f8714a.mo9577b().m9799q().m9700b("Setting app measurement enabled (FE)", bool);
        this.f8714a.m10024F().m9435s(bool);
        if (z10) {
            C2238a4 m10024F = this.f8714a.m10024F();
            C2415q4 c2415q4 = m10024F.f8714a;
            m10024F.mo9428h();
            SharedPreferences.Editor edit = m10024F.m9431o().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (!this.f8714a.m10045p() && (bool == null || bool.booleanValue())) {
            return;
        }
        m9965P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public final void m9965P() {
        long j10;
        mo9428h();
        String m10115a = this.f8714a.m10024F().f8346m.m10115a();
        if (m10115a != null) {
            if ("unset".equals(m10115a)) {
                m9982M("app", "_npa", null, this.f8714a.mo9578c().mo24747a());
            } else {
                if (true != "true".equals(m10115a)) {
                    j10 = 0;
                } else {
                    j10 = 1;
                }
                m9982M("app", "_npa", Long.valueOf(j10), this.f8714a.mo9578c().mo24747a());
            }
        }
        if (this.f8714a.m10044o() && this.f8938o) {
            this.f8714a.mo9577b().m9799q().m9699a("Recording app launch after enabling measurement for the first time (FE)");
            m9995f0();
            C2016lc.m8665c();
            if (this.f8714a.m10051z().m9614B(null, AbstractC2260c3.f8457f0)) {
                this.f8714a.m10030M().f9043d.m10052a();
            }
            this.f8714a.mo9575a().m9897z(new RunnableC2449t5(this));
            return;
        }
        this.f8714a.mo9577b().m9799q().m9699a("Updating Scion state (FE)");
        this.f8714a.m10029L().m9509w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public static /* bridge */ /* synthetic */ void m9966b0(C2406p6 c2406p6, C1098b c1098b, C1098b c1098b2) {
        boolean z10;
        EnumC1096a[] enumC1096aArr = {EnumC1096a.ANALYTICS_STORAGE, EnumC1096a.AD_STORAGE};
        int i10 = 0;
        while (true) {
            if (i10 < 2) {
                EnumC1096a enumC1096a = enumC1096aArr[i10];
                if (!c1098b2.m5055i(enumC1096a) && c1098b.m5055i(enumC1096a)) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        boolean m5057l = c1098b.m5057l(c1098b2, EnumC1096a.ANALYTICS_STORAGE, EnumC1096a.AD_STORAGE);
        if (!z10 && !m5057l) {
            return;
        }
        c2406p6.f8714a.m10020B().m9531v();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public static /* synthetic */ void m9967c0(C2406p6 c2406p6, C1098b c1098b, int i10, long j10, boolean z10, boolean z11) {
        c2406p6.mo9428h();
        c2406p6.m10105i();
        if (j10 <= c2406p6.f8935l && C1098b.m5047j(c2406p6.f8936m, i10)) {
            c2406p6.f8714a.mo9577b().m9803u().m9700b("Dropped out-of-date consent setting, proposed settings", c1098b);
            return;
        }
        C2238a4 m10024F = c2406p6.f8714a.m10024F();
        C2415q4 c2415q4 = m10024F.f8714a;
        m10024F.mo9428h();
        if (m10024F.m9439w(i10)) {
            SharedPreferences.Editor edit = m10024F.m9431o().edit();
            edit.putString("consent_settings", c1098b.m5054h());
            edit.putInt("consent_source", i10);
            edit.apply();
            c2406p6.f8935l = j10;
            c2406p6.f8936m = i10;
            c2406p6.f8714a.m10029L().m9506t(z10);
            if (z11) {
                c2406p6.f8714a.m10029L().m9496S(new AtomicReference());
                return;
            }
            return;
        }
        c2406p6.f8714a.mo9577b().m9803u().m9700b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i10));
    }

    /* renamed from: A */
    protected final void m9970A(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i10 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i10 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i10];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelable);
                        }
                        i10++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i10 < list.size()) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                        i10++;
                    }
                }
            }
        }
        this.f8714a.mo9575a().m9897z(new RunnableC2471v5(this, str, str2, j10, bundle2, z10, z11, z12, str3));
    }

    /* renamed from: B */
    final void m9971B(String str, String str2, long j10, Object obj) {
        this.f8714a.mo9575a().m9897z(new RunnableC2482w5(this, str, str2, obj, j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public final void m9972C(String str) {
        this.f8930g.set(str);
    }

    /* renamed from: D */
    public final void m9973D(Bundle bundle) {
        m9974E(bundle, this.f8714a.mo9578c().mo24747a());
    }

    /* renamed from: E */
    public final void m9974E(Bundle bundle, long j10) {
        AbstractC5391n.m21783i(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f8714a.mo9577b().m9805w().m9699a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        AbstractC5391n.m21783i(bundle2);
        AbstractC1118p.m5085a(bundle2, "app_id", String.class, null);
        AbstractC1118p.m5085a(bundle2, "origin", String.class, null);
        AbstractC1118p.m5085a(bundle2, SerializableCookie.NAME, String.class, null);
        AbstractC1118p.m5085a(bundle2, "value", Object.class, null);
        AbstractC1118p.m5085a(bundle2, "trigger_event_name", String.class, null);
        AbstractC1118p.m5085a(bundle2, "trigger_timeout", Long.class, 0L);
        AbstractC1118p.m5085a(bundle2, "timed_out_event_name", String.class, null);
        AbstractC1118p.m5085a(bundle2, "timed_out_event_params", Bundle.class, null);
        AbstractC1118p.m5085a(bundle2, "triggered_event_name", String.class, null);
        AbstractC1118p.m5085a(bundle2, "triggered_event_params", Bundle.class, null);
        AbstractC1118p.m5085a(bundle2, "time_to_live", Long.class, 0L);
        AbstractC1118p.m5085a(bundle2, "expired_event_name", String.class, null);
        AbstractC1118p.m5085a(bundle2, "expired_event_params", Bundle.class, null);
        AbstractC5391n.m21779e(bundle2.getString(SerializableCookie.NAME));
        AbstractC5391n.m21779e(bundle2.getString("origin"));
        AbstractC5391n.m21783i(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString(SerializableCookie.NAME);
        Object obj = bundle2.get("value");
        if (this.f8714a.m10031N().m9941n0(string) == 0) {
            if (this.f8714a.m10031N().m9937j0(string, obj) == 0) {
                Object m9944p = this.f8714a.m10031N().m9944p(string, obj);
                if (m9944p == null) {
                    this.f8714a.mo9577b().m9800r().m9701c("Unable to normalize conditional user property value", this.f8714a.m10022D().m9643f(string), obj);
                    return;
                }
                AbstractC1118p.m5086b(bundle2, m9944p);
                long j11 = bundle2.getLong("trigger_timeout");
                if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                    this.f8714a.m10051z();
                    if (j11 > 15552000000L || j11 < 1) {
                        this.f8714a.mo9577b().m9800r().m9701c("Invalid conditional user property timeout", this.f8714a.m10022D().m9643f(string), Long.valueOf(j11));
                        return;
                    }
                }
                long j12 = bundle2.getLong("time_to_live");
                this.f8714a.m10051z();
                if (j12 <= 15552000000L && j12 >= 1) {
                    this.f8714a.mo9575a().m9897z(new RunnableC2504y5(this, bundle2));
                    return;
                } else {
                    this.f8714a.mo9577b().m9800r().m9701c("Invalid conditional user property time to live", this.f8714a.m10022D().m9643f(string), Long.valueOf(j12));
                    return;
                }
            }
            this.f8714a.mo9577b().m9800r().m9701c("Invalid conditional user property value", this.f8714a.m10022D().m9643f(string), obj);
            return;
        }
        this.f8714a.mo9577b().m9800r().m9700b("Invalid conditional user property name", this.f8714a.m10022D().m9643f(string));
    }

    /* renamed from: F */
    public final void m9975F(Bundle bundle, int i10, long j10) {
        m10105i();
        String m5046g = C1098b.m5046g(bundle);
        if (m5046g != null) {
            this.f8714a.mo9577b().m9806x().m9700b("Ignoring invalid consent setting", m5046g);
            this.f8714a.mo9577b().m9806x().m9699a("Valid consent values are 'granted', 'denied'");
        }
        m9976G(C1098b.m5044a(bundle), i10, j10);
    }

    /* renamed from: G */
    public final void m9976G(C1098b c1098b, int i10, long j10) {
        C1098b c1098b2;
        boolean z10;
        boolean z11;
        boolean z12;
        C1098b c1098b3 = c1098b;
        m10105i();
        if (i10 != -10 && c1098b.m5052e() == null && c1098b.m5053f() == null) {
            this.f8714a.mo9577b().m9806x().m9699a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f8931h) {
            c1098b2 = this.f8932i;
            z10 = false;
            if (C1098b.m5047j(i10, this.f8933j)) {
                z11 = c1098b3.m5056k(this.f8932i);
                EnumC1096a enumC1096a = EnumC1096a.ANALYTICS_STORAGE;
                if (c1098b3.m5055i(enumC1096a) && !this.f8932i.m5055i(enumC1096a)) {
                    z10 = true;
                }
                c1098b3 = c1098b3.m5051d(this.f8932i);
                this.f8932i = c1098b3;
                this.f8933j = i10;
                z12 = z10;
                z10 = true;
            } else {
                z11 = false;
                z12 = false;
            }
        }
        if (!z10) {
            this.f8714a.mo9577b().m9803u().m9700b("Ignoring lower-priority consent settings, proposed settings", c1098b3);
            return;
        }
        long andIncrement = this.f8934k.getAndIncrement();
        if (z11) {
            this.f8930g.set(null);
            this.f8714a.mo9575a().m9891A(new RunnableC2340j6(this, c1098b3, j10, i10, andIncrement, z12, c1098b2));
            return;
        }
        RunnableC2351k6 runnableC2351k6 = new RunnableC2351k6(this, c1098b3, i10, andIncrement, z12, c1098b2);
        if (i10 != 30 && i10 != -10) {
            this.f8714a.mo9575a().m9897z(runnableC2351k6);
        } else {
            this.f8714a.mo9575a().m9891A(runnableC2351k6);
        }
    }

    /* renamed from: H */
    public final void m9977H(InterfaceC1122t interfaceC1122t) {
        InterfaceC1122t interfaceC1122t2;
        boolean z10;
        mo9428h();
        m10105i();
        if (interfaceC1122t != null && interfaceC1122t != (interfaceC1122t2 = this.f8927d)) {
            if (interfaceC1122t2 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            AbstractC5391n.m21787m(z10, "EventInterceptor already set.");
        }
        this.f8927d = interfaceC1122t;
    }

    /* renamed from: I */
    public final void m9978I(Boolean bool) {
        m10105i();
        this.f8714a.mo9575a().m9897z(new RunnableC2329i6(this, bool));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public final void m9979J(C1098b c1098b) {
        boolean z10;
        Boolean bool;
        mo9428h();
        if ((c1098b.m5055i(EnumC1096a.ANALYTICS_STORAGE) && c1098b.m5055i(EnumC1096a.AD_STORAGE)) || this.f8714a.m10029L().m9489A()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f8714a.m10045p()) {
            this.f8714a.m10041l(z10);
            C2238a4 m10024F = this.f8714a.m10024F();
            C2415q4 c2415q4 = m10024F.f8714a;
            m10024F.mo9428h();
            if (m10024F.m9431o().contains("measurement_enabled_from_api")) {
                bool = Boolean.valueOf(m10024F.m9431o().getBoolean("measurement_enabled_from_api", true));
            } else {
                bool = null;
            }
            if (!z10 || bool == null || bool.booleanValue()) {
                m9964O(Boolean.valueOf(z10), false);
            }
        }
    }

    /* renamed from: K */
    public final void m9980K(String str, String str2, Object obj, boolean z10) {
        m9981L(ConnType.PK_AUTO, "_ldl", obj, true, this.f8714a.mo9578c().mo24747a());
    }

    /* renamed from: L */
    public final void m9981L(String str, String str2, Object obj, boolean z10, long j10) {
        String str3;
        int i10;
        int length;
        int i11;
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        if (z10) {
            i10 = this.f8714a.m10031N().m9941n0(str2);
        } else {
            C2398o9 m10031N = this.f8714a.m10031N();
            if (m10031N.m9930R("user property", str2)) {
                if (!m10031N.m9926N("user property", AbstractC1121s.f4418a, null, str2)) {
                    i10 = 15;
                } else {
                    m10031N.f8714a.m10051z();
                    if (m10031N.m9925M("user property", 24, str2)) {
                        i10 = 0;
                    }
                }
            }
            i10 = 6;
        }
        if (i10 != 0) {
            C2398o9 m10031N2 = this.f8714a.m10031N();
            this.f8714a.m10051z();
            String m9947r = m10031N2.m9947r(str2, 24, true);
            if (str2 != null) {
                i11 = str2.length();
            } else {
                i11 = 0;
            }
            this.f8714a.m10031N().m9914B(this.f8939p, null, i10, "_ev", m9947r, i11);
            return;
        }
        if (obj != null) {
            int m9937j0 = this.f8714a.m10031N().m9937j0(str2, obj);
            if (m9937j0 != 0) {
                C2398o9 m10031N3 = this.f8714a.m10031N();
                this.f8714a.m10051z();
                String m9947r2 = m10031N3.m9947r(str2, 24, true);
                if (!(obj instanceof String) && !(obj instanceof CharSequence)) {
                    length = 0;
                } else {
                    length = obj.toString().length();
                }
                this.f8714a.m10031N().m9914B(this.f8939p, null, m9937j0, "_ev", m9947r2, length);
                return;
            }
            Object m9944p = this.f8714a.m10031N().m9944p(str2, obj);
            if (m9944p != null) {
                m9971B(str3, str2, j10, m9944p);
                return;
            }
            return;
        }
        m9971B(str3, str2, j10, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9982M(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            p219l4.AbstractC5391n.m21779e(r9)
            p219l4.AbstractC5391n.m21779e(r10)
            r8.mo9428h()
            r8.m10105i()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L65
            boolean r0 = r11 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L53
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L53
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            r0 = 1
            if (r0 == r10) goto L37
            r4 = 0
            goto L38
        L37:
            r4 = r2
        L38:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.q4 r0 = r8.f8714a
            com.google.android.gms.measurement.internal.a4 r0 = r0.m10024F()
            com.google.android.gms.measurement.internal.z3 r0 = r0.f8346m
            long r4 = r10.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L4e
            java.lang.String r11 = "true"
        L4e:
            r0.m10116b(r11)
            r6 = r10
            goto L63
        L53:
            if (r11 != 0) goto L65
            com.google.android.gms.measurement.internal.q4 r10 = r8.f8714a
            com.google.android.gms.measurement.internal.a4 r10 = r10.m10024F()
            com.google.android.gms.measurement.internal.z3 r10 = r10.f8346m
            java.lang.String r0 = "unset"
            r10.m10116b(r0)
            r6 = r11
        L63:
            r3 = r1
            goto L67
        L65:
            r3 = r10
            r6 = r11
        L67:
            com.google.android.gms.measurement.internal.q4 r10 = r8.f8714a
            boolean r10 = r10.m10044o()
            if (r10 != 0) goto L7f
            com.google.android.gms.measurement.internal.q4 r9 = r8.f8714a
            com.google.android.gms.measurement.internal.m3 r9 = r9.mo9577b()
            com.google.android.gms.measurement.internal.k3 r9 = r9.m9804v()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.m9699a(r10)
            return
        L7f:
            com.google.android.gms.measurement.internal.q4 r10 = r8.f8714a
            boolean r10 = r10.m10047r()
            if (r10 != 0) goto L88
            return
        L88:
            com.google.android.gms.measurement.internal.k9 r10 = new com.google.android.gms.measurement.internal.k9
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.q4 r9 = r8.f8714a
            com.google.android.gms.measurement.internal.b8 r9 = r9.m10029L()
            r9.m9511y(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2406p6.m9982M(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* renamed from: N */
    public final void m9983N(InterfaceC1123u interfaceC1123u) {
        m10105i();
        AbstractC5391n.m21783i(interfaceC1123u);
        if (!this.f8928e.remove(interfaceC1123u)) {
            this.f8714a.mo9577b().m9805w().m9699a("OnEventListener had not been registered");
        }
    }

    /* renamed from: Q */
    public final int m9984Q(String str) {
        AbstractC5391n.m21779e(str);
        this.f8714a.m10051z();
        return 25;
    }

    /* renamed from: R */
    public final Boolean m9985R() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f8714a.mo9575a().m9893r(atomicReference, 15000L, "boolean test flag value", new RunnableC2252b6(this, atomicReference));
    }

    /* renamed from: S */
    public final Double m9986S() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f8714a.mo9575a().m9893r(atomicReference, 15000L, "double test flag value", new RunnableC2318h6(this, atomicReference));
    }

    /* renamed from: T */
    public final Integer m9987T() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f8714a.mo9575a().m9893r(atomicReference, 15000L, "int test flag value", new RunnableC2307g6(this, atomicReference));
    }

    /* renamed from: U */
    public final Long m9988U() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f8714a.mo9575a().m9893r(atomicReference, 15000L, "long test flag value", new RunnableC2296f6(this, atomicReference));
    }

    /* renamed from: V */
    public final String m9989V() {
        return (String) this.f8930g.get();
    }

    /* renamed from: W */
    public final String m9990W() {
        C2461u6 m9473r = this.f8714a.m10028K().m9473r();
        if (m9473r != null) {
            return m9473r.f9123b;
        }
        return null;
    }

    /* renamed from: X */
    public final String m9991X() {
        C2461u6 m9473r = this.f8714a.m10028K().m9473r();
        if (m9473r != null) {
            return m9473r.f9122a;
        }
        return null;
    }

    /* renamed from: Y */
    public final String m9992Y() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f8714a.mo9575a().m9893r(atomicReference, 15000L, "String test flag value", new RunnableC2285e6(this, atomicReference));
    }

    /* renamed from: Z */
    public final ArrayList m9993Z(String str, String str2) {
        if (this.f8714a.mo9575a().m9892C()) {
            this.f8714a.mo9577b().m9800r().m9699a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.f8714a.mo9580d();
        if (C2256c.m9513a()) {
            this.f8714a.mo9577b().m9800r().m9699a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f8714a.mo9575a().m9893r(atomicReference, 5000L, "get conditional user properties", new RunnableC2240a6(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            this.f8714a.mo9577b().m9800r().m9700b("Timed out waiting for get conditional user properties", null);
            return new ArrayList();
        }
        return C2398o9.m9911v(list);
    }

    /* renamed from: a0 */
    public final Map m9994a0(String str, String str2, boolean z10) {
        if (this.f8714a.mo9575a().m9892C()) {
            this.f8714a.mo9577b().m9800r().m9699a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.f8714a.mo9580d();
        if (C2256c.m9513a()) {
            this.f8714a.mo9577b().m9800r().m9699a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f8714a.mo9575a().m9893r(atomicReference, 5000L, "get user properties", new RunnableC2263c6(this, atomicReference, null, str, str2, z10));
        List<C2354k9> list = (List) atomicReference.get();
        if (list == null) {
            this.f8714a.mo9577b().m9800r().m9700b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
            return Collections.emptyMap();
        }
        C5303a c5303a = new C5303a(list.size());
        for (C2354k9 c2354k9 : list) {
            Object m9735g = c2354k9.m9735g();
            if (m9735g != null) {
                c5303a.put(c2354k9.f8758b, m9735g);
            }
        }
        return c5303a;
    }

    /* renamed from: f0 */
    public final void m9995f0() {
        mo9428h();
        m10105i();
        if (this.f8714a.m10047r()) {
            if (this.f8714a.m10051z().m9614B(null, AbstractC2260c3.f8445Z)) {
                C2311h m10051z = this.f8714a.m10051z();
                m10051z.f8714a.mo9580d();
                Boolean m9630t = m10051z.m9630t("google_analytics_deferred_deep_link_enabled");
                if (m9630t != null && m9630t.booleanValue()) {
                    this.f8714a.mo9577b().m9799q().m9699a("Deferred Deep Link feature enabled.");
                    this.f8714a.mo9575a().m9897z(new Runnable() { // from class: com.google.android.gms.measurement.internal.s5
                        @Override // java.lang.Runnable
                        public final void run() {
                            C2406p6 c2406p6 = C2406p6.this;
                            c2406p6.mo9428h();
                            if (!c2406p6.f8714a.m10024F().f8351r.m10082b()) {
                                long m10097a = c2406p6.f8714a.m10024F().f8352s.m10097a();
                                c2406p6.f8714a.m10024F().f8352s.m10098b(1 + m10097a);
                                c2406p6.f8714a.m10051z();
                                if (m10097a >= 5) {
                                    c2406p6.f8714a.mo9577b().m9805w().m9699a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                    c2406p6.f8714a.m10024F().f8351r.m10081a(true);
                                    return;
                                } else {
                                    c2406p6.f8714a.m10039j();
                                    return;
                                }
                            }
                            c2406p6.f8714a.mo9577b().m9799q().m9699a("Deferred Deep Link already retrieved. Not fetching again.");
                        }
                    });
                }
            }
            this.f8714a.m10029L().m9492O();
            this.f8938o = false;
            C2238a4 m10024F = this.f8714a.m10024F();
            m10024F.mo9428h();
            String string = m10024F.m9431o().getString("previous_os_version", null);
            m10024F.f8714a.m10019A().m9731k();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = m10024F.m9431o().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                this.f8714a.m10019A().m9731k();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    m10002u(ConnType.PK_AUTO, "_ou", bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2491x3
    /* renamed from: n */
    protected final boolean mo9472n() {
        return false;
    }

    /* renamed from: o */
    public final void m9996o(String str, String str2, Bundle bundle) {
        long mo24747a = this.f8714a.mo9578c().mo24747a();
        AbstractC5391n.m21779e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(SerializableCookie.NAME, str);
        bundle2.putLong("creation_timestamp", mo24747a);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.f8714a.mo9575a().m9897z(new RunnableC2515z5(this, bundle2));
    }

    /* renamed from: p */
    public final void m9997p() {
        if ((this.f8714a.mo9584f().getApplicationContext() instanceof Application) && this.f8926c != null) {
            ((Application) this.f8714a.mo9584f().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f8926c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void m9998q(Bundle bundle) {
        if (bundle == null) {
            this.f8714a.m10024F().f8356w.m10090b(new Bundle());
            return;
        }
        Bundle m10089a = this.f8714a.m10024F().f8356w.m10089a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.f8714a.m10031N().m9933U(obj)) {
                    this.f8714a.m10031N().m9914B(this.f8939p, null, 27, null, null, 0);
                }
                this.f8714a.mo9577b().m9806x().m9701c("Invalid default event parameter type. Name, value", str, obj);
            } else if (C2398o9.m9898W(str)) {
                this.f8714a.mo9577b().m9806x().m9700b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                m10089a.remove(str);
            } else {
                C2398o9 m10031N = this.f8714a.m10031N();
                this.f8714a.m10051z();
                if (m10031N.m9928P("param", str, 100, obj)) {
                    this.f8714a.m10031N().m9915C(m10089a, str, obj);
                }
            }
        }
        this.f8714a.m10031N();
        int m9623m = this.f8714a.m10051z().m9623m();
        if (m10089a.size() > m9623m) {
            int i10 = 0;
            for (String str2 : new TreeSet(m10089a.keySet())) {
                i10++;
                if (i10 > m9623m) {
                    m10089a.remove(str2);
                }
            }
            this.f8714a.m10031N().m9914B(this.f8939p, null, 26, null, null, 0);
            this.f8714a.mo9577b().m9806x().m9699a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.f8714a.m10024F().f8356w.m10090b(m10089a);
        this.f8714a.m10029L().m9508v(m10089a);
    }

    /* renamed from: r */
    public final void m9999r(String str, String str2, Bundle bundle) {
        m10000s(str, str2, bundle, true, true, this.f8714a.mo9578c().mo24747a());
    }

    /* renamed from: s */
    public final void m10000s(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        String str3;
        Bundle bundle2;
        boolean z12;
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        if (str2 != "screen_view" && (str2 == null || !str2.equals("screen_view"))) {
            if (z11 && this.f8927d != null && !C2398o9.m9898W(str2)) {
                z12 = false;
            } else {
                z12 = true;
            }
            m9970A(str3, str2, j10, bundle2, z11, z12, z10, null);
            return;
        }
        this.f8714a.m10028K().m9471E(bundle2, j10);
    }

    /* renamed from: t */
    public final void m10001t(String str, String str2, Bundle bundle, String str3) {
        C2415q4.m10015t();
        m9970A(ConnType.PK_AUTO, str2, this.f8714a.mo9578c().mo24747a(), bundle, false, true, true, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final void m10002u(String str, String str2, Bundle bundle) {
        mo9428h();
        m10003v(str, str2, this.f8714a.mo9578c().mo24747a(), bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public final void m10003v(String str, String str2, long j10, Bundle bundle) {
        boolean z10;
        mo9428h();
        if (this.f8927d != null && !C2398o9.m9898W(str2)) {
            z10 = false;
        } else {
            z10 = true;
        }
        m10004w(str, str2, j10, bundle, true, z10, true, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public final void m10004w(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        boolean z13;
        String str4;
        long j11;
        String str5;
        String str6;
        Bundle[] bundleArr;
        Class<?> cls;
        AbstractC5391n.m21779e(str);
        AbstractC5391n.m21783i(bundle);
        mo9428h();
        m10105i();
        if (this.f8714a.m10044o()) {
            List m9530u = this.f8714a.m10020B().m9530u();
            if (m9530u != null && !m9530u.contains(str2)) {
                this.f8714a.mo9577b().m9799q().m9701c("Dropping non-safelisted event. event name, origin", str2, str);
                return;
            }
            if (!this.f8929f) {
                this.f8929f = true;
                try {
                    if (!this.f8714a.m10048s()) {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.f8714a.mo9584f().getClassLoader());
                    } else {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                    }
                    try {
                        cls.getDeclaredMethod("initialize", Context.class).invoke(null, this.f8714a.mo9584f());
                    } catch (Exception e10) {
                        this.f8714a.mo9577b().m9805w().m9700b("Failed to invoke Tag Manager's initialize() method", e10);
                    }
                } catch (ClassNotFoundException unused) {
                    this.f8714a.mo9577b().m9803u().m9699a("Tag Manager is not found and thus will not be used");
                }
            }
            if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
                this.f8714a.mo9580d();
                m9982M(ConnType.PK_AUTO, "_lgclid", bundle.getString("gclid"), this.f8714a.mo9578c().mo24747a());
            }
            this.f8714a.mo9580d();
            if (z10 && C2398o9.m9902a0(str2)) {
                this.f8714a.m10031N().m9958z(bundle, this.f8714a.m10024F().f8356w.m10089a());
            }
            if (!z12) {
                this.f8714a.mo9580d();
                if (!"_iap".equals(str2)) {
                    C2398o9 m10031N = this.f8714a.m10031N();
                    int i10 = 2;
                    if (m10031N.m9930R("event", str2)) {
                        if (m10031N.m9926N("event", AbstractC1119q.f4410a, AbstractC1119q.f4411b, str2)) {
                            m10031N.f8714a.m10051z();
                            if (m10031N.m9925M("event", 40, str2)) {
                                i10 = 0;
                            }
                        } else {
                            i10 = 13;
                        }
                    }
                    if (i10 != 0) {
                        this.f8714a.mo9577b().m9801s().m9700b("Invalid public event name. Event will not be logged (FE)", this.f8714a.m10022D().m9641d(str2));
                        C2398o9 m10031N2 = this.f8714a.m10031N();
                        this.f8714a.m10051z();
                        this.f8714a.m10031N().m9914B(this.f8939p, null, i10, "_ev", m10031N2.m9947r(str2, 40, true), str2 != null ? str2.length() : 0);
                        return;
                    }
                }
            }
            this.f8714a.mo9580d();
            C2461u6 m9474s = this.f8714a.m10028K().m9474s(false);
            if (m9474s != null && !bundle.containsKey("_sc")) {
                m9474s.f9125d = true;
            }
            C2398o9.m9912y(m9474s, bundle, z10 && !z12);
            boolean equals = "am".equals(str);
            boolean m9898W = C2398o9.m9898W(str2);
            if (!z10 || this.f8927d == null || m9898W) {
                z13 = equals;
            } else {
                if (!equals) {
                    this.f8714a.mo9577b().m9799q().m9701c("Passing event to registered event handler (FE)", this.f8714a.m10022D().m9641d(str2), this.f8714a.m10022D().m9639b(bundle));
                    AbstractC5391n.m21783i(this.f8927d);
                    this.f8927d.mo5089a(str, str2, bundle, j10);
                    return;
                }
                z13 = true;
            }
            if (this.f8714a.m10047r()) {
                int m9938k0 = this.f8714a.m10031N().m9938k0(str2);
                if (m9938k0 != 0) {
                    this.f8714a.mo9577b().m9801s().m9700b("Invalid event name. Event will not be logged (FE)", this.f8714a.m10022D().m9641d(str2));
                    C2398o9 m10031N3 = this.f8714a.m10031N();
                    this.f8714a.m10051z();
                    this.f8714a.m10031N().m9914B(this.f8939p, str3, m9938k0, "_ev", m10031N3.m9947r(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
                Bundle m9954v0 = this.f8714a.m10031N().m9954v0(str3, str2, bundle, AbstractC6201e.m24752c("_o", "_sn", "_sc", "_si"), z12);
                AbstractC5391n.m21783i(m9954v0);
                this.f8714a.mo9580d();
                if (this.f8714a.m10028K().m9474s(false) != null && "_ae".equals(str2)) {
                    C2408p8 c2408p8 = this.f8714a.m10030M().f9044e;
                    long mo24748b = c2408p8.f8945d.f8714a.mo9578c().mo24748b();
                    long j12 = mo24748b - c2408p8.f8943b;
                    c2408p8.f8943b = mo24748b;
                    if (j12 > 0) {
                        this.f8714a.m10031N().m9955w(m9954v0, j12);
                    }
                }
                C1861bc.m8149c();
                if (this.f8714a.m10051z().m9614B(null, AbstractC2260c3.f8455e0)) {
                    if (!ConnType.PK_AUTO.equals(str) && "_ssr".equals(str2)) {
                        C2398o9 m10031N4 = this.f8714a.m10031N();
                        String string = m9954v0.getString("_ffr");
                        if (AbstractC6209m.m24777a(string)) {
                            string = null;
                        } else if (string != null) {
                            string = string.trim();
                        }
                        if (!AbstractC1105e0.m5060a(string, m10031N4.f8714a.m10024F().f8353t.m10115a())) {
                            m10031N4.f8714a.m10024F().f8353t.m10116b(string);
                        } else {
                            m10031N4.f8714a.mo9577b().m9799q().m9699a("Not logging duplicate session_start_with_rollout event");
                            return;
                        }
                    } else if ("_ae".equals(str2)) {
                        String m10115a = this.f8714a.m10031N().f8714a.m10024F().f8353t.m10115a();
                        if (!TextUtils.isEmpty(m10115a)) {
                            m9954v0.putString("_ffr", m10115a);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(m9954v0);
                if (this.f8714a.m10024F().f8348o.m10097a() > 0 && this.f8714a.m10024F().m9438v(j10) && this.f8714a.m10024F().f8350q.m10082b()) {
                    this.f8714a.mo9577b().m9804v().m9699a("Current session is expired, remove the session number, ID, and engagement time");
                    str4 = "_ae";
                    j11 = 0;
                    m9982M(ConnType.PK_AUTO, "_sid", null, this.f8714a.mo9578c().mo24747a());
                    m9982M(ConnType.PK_AUTO, "_sno", null, this.f8714a.mo9578c().mo24747a());
                    m9982M(ConnType.PK_AUTO, "_se", null, this.f8714a.mo9578c().mo24747a());
                } else {
                    str4 = "_ae";
                    j11 = 0;
                }
                if (m9954v0.getLong("extend_session", j11) == 1) {
                    this.f8714a.mo9577b().m9804v().m9699a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    this.f8714a.m10030M().f9043d.m10053b(j10, true);
                }
                ArrayList arrayList2 = new ArrayList(m9954v0.keySet());
                Collections.sort(arrayList2);
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    String str7 = (String) arrayList2.get(i11);
                    if (str7 != null) {
                        this.f8714a.m10031N();
                        Object obj = m9954v0.get(str7);
                        if (obj instanceof Bundle) {
                            bundleArr = new Bundle[]{(Bundle) obj};
                        } else if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList3 = (ArrayList) obj;
                            bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                        } else {
                            bundleArr = null;
                        }
                        if (bundleArr != null) {
                            m9954v0.putParcelableArray(str7, bundleArr);
                        }
                    }
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    Bundle bundle2 = (Bundle) arrayList.get(i12);
                    if (i12 != 0) {
                        str6 = "_ep";
                        str5 = str;
                    } else {
                        str5 = str;
                        str6 = str2;
                    }
                    bundle2.putString("_o", str5);
                    if (z11) {
                        bundle2 = this.f8714a.m10031N().m9953u0(bundle2);
                    }
                    Bundle bundle3 = bundle2;
                    this.f8714a.m10029L().m9501o(new C2465v(str6, new C2443t(bundle3), str, j10), str3);
                    if (!z13) {
                        Iterator it = this.f8928e.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC1123u) it.next()).mo5090a(str, str2, new Bundle(bundle3), j10);
                        }
                    }
                }
                this.f8714a.mo9580d();
                if (this.f8714a.m10028K().m9474s(false) == null || !str4.equals(str2)) {
                    return;
                }
                this.f8714a.m10030M().f9044e.m10011d(true, true, this.f8714a.mo9578c().mo24748b());
                return;
            }
            return;
        }
        this.f8714a.mo9577b().m9799q().m9699a("Event not sent since app measurement is disabled");
    }

    /* renamed from: x */
    public final void m10005x(InterfaceC1123u interfaceC1123u) {
        m10105i();
        AbstractC5391n.m21783i(interfaceC1123u);
        if (!this.f8928e.add(interfaceC1123u)) {
            this.f8714a.mo9577b().m9805w().m9699a("OnEventListener already registered");
        }
    }

    /* renamed from: y */
    public final void m10006y(long j10) {
        this.f8930g.set(null);
        this.f8714a.mo9575a().m9897z(new RunnableC2493x5(this, j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public final void m10007z(long j10, boolean z10) {
        mo9428h();
        m10105i();
        this.f8714a.mo9577b().m9799q().m9699a("Resetting analytics data (FE)");
        C2430r8 m10030M = this.f8714a.m10030M();
        m10030M.mo9428h();
        m10030M.f9044e.m10008a();
        C1942gd.m8472c();
        if (this.f8714a.m10051z().m9614B(null, AbstractC2260c3.f8487u0)) {
            this.f8714a.m10020B().m9531v();
        }
        boolean m10044o = this.f8714a.m10044o();
        C2238a4 m10024F = this.f8714a.m10024F();
        m10024F.f8338e.m10098b(j10);
        if (!TextUtils.isEmpty(m10024F.f8714a.m10024F().f8353t.m10115a())) {
            m10024F.f8353t.m10116b(null);
        }
        C2016lc.m8665c();
        C2311h m10051z = m10024F.f8714a.m10051z();
        C2249b3 c2249b3 = AbstractC2260c3.f8457f0;
        if (m10051z.m9614B(null, c2249b3)) {
            m10024F.f8348o.m10098b(0L);
        }
        if (!m10024F.f8714a.m10051z().m9617E()) {
            m10024F.m9436t(!m10044o);
        }
        m10024F.f8354u.m10116b(null);
        m10024F.f8355v.m10098b(0L);
        m10024F.f8356w.m10090b(null);
        if (z10) {
            this.f8714a.m10029L().m9503q();
        }
        C2016lc.m8665c();
        if (this.f8714a.m10051z().m9614B(null, c2249b3)) {
            this.f8714a.m10030M().f9043d.m10052a();
        }
        this.f8938o = !m10044o;
    }
}
