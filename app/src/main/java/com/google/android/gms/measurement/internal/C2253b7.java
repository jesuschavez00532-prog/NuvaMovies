package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import anet.channel.entity.ConnType;
import com.lzy.okgo.cookie.SerializableCookie;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p025b5.AbstractC1127y;
import p219l4.AbstractC5391n;

/* renamed from: com.google.android.gms.measurement.internal.b7 */
/* loaded from: classes.dex */
public final class C2253b7 extends AbstractC2491x3 {

    /* renamed from: c */
    private volatile C2461u6 f8394c;

    /* renamed from: d */
    private volatile C2461u6 f8395d;

    /* renamed from: e */
    protected C2461u6 f8396e;

    /* renamed from: f */
    private final Map f8397f;

    /* renamed from: g */
    private Activity f8398g;

    /* renamed from: h */
    private volatile boolean f8399h;

    /* renamed from: i */
    private volatile C2461u6 f8400i;

    /* renamed from: j */
    private C2461u6 f8401j;

    /* renamed from: k */
    private boolean f8402k;

    /* renamed from: l */
    private final Object f8403l;

    public C2253b7(C2415q4 c2415q4) {
        super(c2415q4);
        this.f8403l = new Object();
        this.f8397f = new ConcurrentHashMap();
    }

    /* renamed from: F */
    private final C2461u6 m9458F(Activity activity) {
        AbstractC5391n.m21783i(activity);
        C2461u6 c2461u6 = (C2461u6) this.f8397f.get(activity);
        if (c2461u6 == null) {
            C2461u6 c2461u62 = new C2461u6(null, m9475t(activity.getClass(), "Activity"), this.f8714a.m10031N().m9948r0());
            this.f8397f.put(activity, c2461u62);
            c2461u6 = c2461u62;
        }
        if (this.f8400i != null) {
            return this.f8400i;
        }
        return c2461u6;
    }

    /* renamed from: G */
    private final void m9459G(Activity activity, C2461u6 c2461u6, boolean z10) {
        C2461u6 c2461u62;
        C2461u6 c2461u63;
        String str;
        if (this.f8394c == null) {
            c2461u62 = this.f8395d;
        } else {
            c2461u62 = this.f8394c;
        }
        C2461u6 c2461u64 = c2461u62;
        if (c2461u6.f9123b == null) {
            if (activity != null) {
                str = m9475t(activity.getClass(), "Activity");
            } else {
                str = null;
            }
            c2461u63 = new C2461u6(c2461u6.f9122a, str, c2461u6.f9124c, c2461u6.f9126e, c2461u6.f9127f);
        } else {
            c2461u63 = c2461u6;
        }
        this.f8395d = this.f8394c;
        this.f8394c = c2461u63;
        this.f8714a.mo9575a().m9897z(new RunnableC2483w6(this, c2461u63, c2461u64, this.f8714a.mo9578c().mo24748b(), z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final void m9460o(C2461u6 c2461u6, C2461u6 c2461u62, long j10, boolean z10, Bundle bundle) {
        boolean z11;
        Bundle bundle2;
        String str;
        long j11;
        long j12;
        mo9428h();
        boolean z12 = false;
        if (c2461u62 != null && c2461u62.f9124c == c2461u6.f9124c && AbstractC1127y.m5106a(c2461u62.f9123b, c2461u6.f9123b) && AbstractC1127y.m5106a(c2461u62.f9122a, c2461u6.f9122a)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 && this.f8396e != null) {
            z12 = true;
        }
        if (z11) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            C2398o9.m9912y(c2461u6, bundle3, true);
            if (c2461u62 != null) {
                String str2 = c2461u62.f9122a;
                if (str2 != null) {
                    bundle3.putString("_pn", str2);
                }
                String str3 = c2461u62.f9123b;
                if (str3 != null) {
                    bundle3.putString("_pc", str3);
                }
                bundle3.putLong("_pi", c2461u62.f9124c);
            }
            if (z12) {
                C2408p8 c2408p8 = this.f8714a.m10030M().f9044e;
                long j13 = j10 - c2408p8.f8943b;
                c2408p8.f8943b = j10;
                if (j13 > 0) {
                    this.f8714a.m10031N().m9955w(bundle3, j13);
                }
            }
            if (!this.f8714a.m10051z().m9616D()) {
                bundle3.putLong("_mst", 1L);
            }
            if (true != c2461u6.f9126e) {
                str = ConnType.PK_AUTO;
            } else {
                str = "app";
            }
            String str4 = str;
            long mo24747a = this.f8714a.mo9578c().mo24747a();
            if (c2461u6.f9126e) {
                j11 = mo24747a;
                long j14 = c2461u6.f9127f;
                if (j14 != 0) {
                    j12 = j14;
                    this.f8714a.m10026I().m10003v(str4, "_vs", j12, bundle3);
                }
            } else {
                j11 = mo24747a;
            }
            j12 = j11;
            this.f8714a.m10026I().m10003v(str4, "_vs", j12, bundle3);
        }
        if (z12) {
            m9461p(this.f8396e, true, j10);
        }
        this.f8396e = c2461u6;
        if (c2461u6.f9126e) {
            this.f8401j = c2461u6;
        }
        this.f8714a.m10029L().m9507u(c2461u6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public final void m9461p(C2461u6 c2461u6, boolean z10, long j10) {
        boolean z11;
        this.f8714a.m10050y().m9427n(this.f8714a.mo9578c().mo24748b());
        if (c2461u6 != null && c2461u6.f9125d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f8714a.m10030M().f9044e.m10011d(z11, z10, j10) && c2461u6 != null) {
            c2461u6.f9125d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static /* bridge */ /* synthetic */ void m9465w(C2253b7 c2253b7, Bundle bundle, C2461u6 c2461u6, C2461u6 c2461u62, long j10) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        c2253b7.m9460o(c2461u6, c2461u62, j10, true, c2253b7.f8714a.m10031N().m9954v0(null, "screen_view", bundle, null, false));
    }

    /* renamed from: A */
    public final void m9467A(Activity activity) {
        synchronized (this.f8403l) {
            this.f8402k = false;
            this.f8399h = true;
        }
        long mo24748b = this.f8714a.mo9578c().mo24748b();
        if (!this.f8714a.m10051z().m9616D()) {
            this.f8394c = null;
            this.f8714a.mo9575a().m9897z(new RunnableC2505y6(this, mo24748b));
        } else {
            C2461u6 m9458F = m9458F(activity);
            this.f8395d = this.f8394c;
            this.f8394c = null;
            this.f8714a.mo9575a().m9897z(new RunnableC2516z6(this, m9458F, mo24748b));
        }
    }

    /* renamed from: B */
    public final void m9468B(Activity activity) {
        synchronized (this.f8403l) {
            this.f8402k = true;
            if (activity != this.f8398g) {
                synchronized (this.f8403l) {
                    this.f8398g = activity;
                    this.f8399h = false;
                }
                if (this.f8714a.m10051z().m9616D()) {
                    this.f8400i = null;
                    this.f8714a.mo9575a().m9897z(new RunnableC2241a7(this));
                }
            }
        }
        if (!this.f8714a.m10051z().m9616D()) {
            this.f8394c = this.f8400i;
            this.f8714a.mo9575a().m9897z(new RunnableC2494x6(this));
        } else {
            m9459G(activity, m9458F(activity), false);
            C2236a2 m10050y = this.f8714a.m10050y();
            m10050y.f8714a.mo9575a().m9897z(new RunnableC2510z0(m10050y, m10050y.f8714a.mo9578c().mo24748b()));
        }
    }

    /* renamed from: C */
    public final void m9469C(Activity activity, Bundle bundle) {
        C2461u6 c2461u6;
        if (!this.f8714a.m10051z().m9616D() || bundle == null || (c2461u6 = (C2461u6) this.f8397f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c2461u6.f9124c);
        bundle2.putString(SerializableCookie.NAME, c2461u6.f9122a);
        bundle2.putString("referrer_name", c2461u6.f9123b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r5.length() <= 100) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b4, code lost:
    
        if (r6.length() <= 100) goto L39;
     */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9470D(android.app.Activity r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.q4 r0 = r3.f8714a
            com.google.android.gms.measurement.internal.h r0 = r0.m10051z()
            boolean r0 = r0.m9616D()
            if (r0 != 0) goto L1c
            com.google.android.gms.measurement.internal.q4 r4 = r3.f8714a
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo9577b()
            com.google.android.gms.measurement.internal.k3 r4 = r4.m9806x()
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.m9699a(r5)
            return
        L1c:
            com.google.android.gms.measurement.internal.u6 r0 = r3.f8394c
            if (r0 != 0) goto L30
            com.google.android.gms.measurement.internal.q4 r4 = r3.f8714a
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo9577b()
            com.google.android.gms.measurement.internal.k3 r4 = r4.m9806x()
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.m9699a(r5)
            return
        L30:
            java.util.Map r1 = r3.f8397f
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L48
            com.google.android.gms.measurement.internal.q4 r4 = r3.f8714a
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo9577b()
            com.google.android.gms.measurement.internal.k3 r4 = r4.m9806x()
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.m9699a(r5)
            return
        L48:
            if (r6 != 0) goto L54
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.m9475t(r6, r1)
        L54:
            java.lang.String r1 = r0.f9123b
            boolean r1 = p025b5.AbstractC1127y.m5106a(r1, r6)
            java.lang.String r0 = r0.f9122a
            boolean r0 = p025b5.AbstractC1127y.m5106a(r0, r5)
            if (r1 == 0) goto L75
            if (r0 != 0) goto L65
            goto L75
        L65:
            com.google.android.gms.measurement.internal.q4 r4 = r3.f8714a
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo9577b()
            com.google.android.gms.measurement.internal.k3 r4 = r4.m9806x()
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.m9699a(r5)
            return
        L75:
            r0 = 100
            if (r5 == 0) goto La3
            int r1 = r5.length()
            if (r1 <= 0) goto L8b
            com.google.android.gms.measurement.internal.q4 r1 = r3.f8714a
            r1.m10051z()
            int r1 = r5.length()
            if (r1 > r0) goto L8b
            goto La3
        L8b:
            com.google.android.gms.measurement.internal.q4 r4 = r3.f8714a
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo9577b()
            com.google.android.gms.measurement.internal.k3 r4 = r4.m9806x()
            int r5 = r5.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            r4.m9700b(r6, r5)
            return
        La3:
            if (r6 == 0) goto Lcf
            int r1 = r6.length()
            if (r1 <= 0) goto Lb7
            com.google.android.gms.measurement.internal.q4 r1 = r3.f8714a
            r1.m10051z()
            int r1 = r6.length()
            if (r1 > r0) goto Lb7
            goto Lcf
        Lb7:
            com.google.android.gms.measurement.internal.q4 r4 = r3.f8714a
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo9577b()
            com.google.android.gms.measurement.internal.k3 r4 = r4.m9806x()
            int r5 = r6.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            r4.m9700b(r6, r5)
            return
        Lcf:
            com.google.android.gms.measurement.internal.q4 r0 = r3.f8714a
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo9577b()
            com.google.android.gms.measurement.internal.k3 r0 = r0.m9804v()
            if (r5 != 0) goto Lde
            java.lang.String r1 = "null"
            goto Ldf
        Lde:
            r1 = r5
        Ldf:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.m9701c(r2, r1, r6)
            com.google.android.gms.measurement.internal.u6 r0 = new com.google.android.gms.measurement.internal.u6
            com.google.android.gms.measurement.internal.q4 r1 = r3.f8714a
            com.google.android.gms.measurement.internal.o9 r1 = r1.m10031N()
            long r1 = r1.m9948r0()
            r0.<init>(r5, r6, r1)
            java.util.Map r5 = r3.f8397f
            r5.put(r4, r0)
            r5 = 1
            r3.m9459G(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2253b7.m9470D(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r2 > 100) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r4 > 100) goto L24;
     */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9471E(android.os.Bundle r13, long r14) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2253b7.m9471E(android.os.Bundle, long):void");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2491x3
    /* renamed from: n */
    protected final boolean mo9472n() {
        return false;
    }

    /* renamed from: r */
    public final C2461u6 m9473r() {
        return this.f8394c;
    }

    /* renamed from: s */
    public final C2461u6 m9474s(boolean z10) {
        m10105i();
        mo9428h();
        if (!z10) {
            return this.f8396e;
        }
        C2461u6 c2461u6 = this.f8396e;
        if (c2461u6 != null) {
            return c2461u6;
        }
        return this.f8401j;
    }

    /* renamed from: t */
    final String m9475t(Class cls, String str) {
        String str2;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        if (length > 0) {
            str2 = split[length - 1];
        } else {
            str2 = "";
        }
        int length2 = str2.length();
        this.f8714a.m10051z();
        if (length2 > 100) {
            this.f8714a.m10051z();
            return str2.substring(0, 100);
        }
        return str2;
    }

    /* renamed from: y */
    public final void m9476y(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.f8714a.m10051z().m9616D() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f8397f.put(activity, new C2461u6(bundle2.getString(SerializableCookie.NAME), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    /* renamed from: z */
    public final void m9477z(Activity activity) {
        synchronized (this.f8403l) {
            if (activity == this.f8398g) {
                this.f8398g = null;
            }
        }
        if (!this.f8714a.m10051z().m9616D()) {
            return;
        }
        this.f8397f.remove(activity);
    }
}
