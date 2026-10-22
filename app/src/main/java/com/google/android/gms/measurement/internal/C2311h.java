package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.youth.banner.BannerConfig;
import java.lang.reflect.InvocationTargetException;
import p219l4.AbstractC5391n;
import p281p4.AbstractC6208l;
import p310r4.C6534e;

/* renamed from: com.google.android.gms.measurement.internal.h */
/* loaded from: classes.dex */
public final class C2311h extends AbstractC2339j5 {

    /* renamed from: b */
    private Boolean f8653b;

    /* renamed from: c */
    private InterfaceC2300g f8654c;

    /* renamed from: d */
    private Boolean f8655d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2311h(C2415q4 c2415q4) {
        super(c2415q4);
        this.f8654c = new InterfaceC2300g() { // from class: com.google.android.gms.measurement.internal.f
            @Override // com.google.android.gms.measurement.internal.InterfaceC2300g
            /* renamed from: e */
            public final String mo9535e(String str, String str2) {
                return null;
            }
        };
    }

    /* renamed from: I */
    public static final long m9610I() {
        return ((Long) AbstractC2260c3.f8454e.m9456a(null)).longValue();
    }

    /* renamed from: i */
    public static final long m9611i() {
        return ((Long) AbstractC2260c3.f8424E.m9456a(null)).longValue();
    }

    /* renamed from: j */
    private final String m9612j(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            AbstractC5391n.m21783i(str3);
            return str3;
        } catch (ClassNotFoundException e10) {
            this.f8714a.mo9577b().m9800r().m9700b("Could not find SystemProperties class", e10);
            return "";
        } catch (IllegalAccessException e11) {
            this.f8714a.mo9577b().m9800r().m9700b("Could not access SystemProperties.get()", e11);
            return "";
        } catch (NoSuchMethodException e12) {
            this.f8714a.mo9577b().m9800r().m9700b("Could not find SystemProperties.get() method", e12);
            return "";
        } catch (InvocationTargetException e13) {
            this.f8714a.mo9577b().m9800r().m9700b("SystemProperties.get() threw an exception", e13);
            return "";
        }
    }

    /* renamed from: A */
    public final boolean m9613A() {
        Boolean m9630t = m9630t("google_analytics_adid_collection_enabled");
        if (m9630t != null && !m9630t.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    public final boolean m9614B(String str, C2249b3 c2249b3) {
        if (str == null) {
            return ((Boolean) c2249b3.m9456a(null)).booleanValue();
        }
        String mo9535e = this.f8654c.mo9535e(str, c2249b3.m9457b());
        if (TextUtils.isEmpty(mo9535e)) {
            return ((Boolean) c2249b3.m9456a(null)).booleanValue();
        }
        return ((Boolean) c2249b3.m9456a(Boolean.valueOf("1".equals(mo9535e)))).booleanValue();
    }

    /* renamed from: C */
    public final boolean m9615C(String str) {
        return "1".equals(this.f8654c.mo9535e(str, "gaia_collection_enabled"));
    }

    /* renamed from: D */
    public final boolean m9616D() {
        Boolean m9630t = m9630t("google_analytics_automatic_screen_reporting_enabled");
        if (m9630t != null && !m9630t.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public final boolean m9617E() {
        this.f8714a.mo9580d();
        Boolean m9630t = m9630t("firebase_analytics_collection_deactivated");
        if (m9630t != null && m9630t.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public final boolean m9618F(String str) {
        return "1".equals(this.f8654c.mo9535e(str, "measurement.event_sampling_enabled"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public final boolean m9619G() {
        if (this.f8653b == null) {
            Boolean m9630t = m9630t("app_measurement_lite");
            this.f8653b = m9630t;
            if (m9630t == null) {
                this.f8653b = Boolean.FALSE;
            }
        }
        if (!this.f8653b.booleanValue() && this.f8714a.m10048s()) {
            return false;
        }
        return true;
    }

    /* renamed from: H */
    public final boolean m9620H() {
        if (this.f8655d == null) {
            synchronized (this) {
                if (this.f8655d == null) {
                    ApplicationInfo applicationInfo = this.f8714a.mo9584f().getApplicationInfo();
                    String m24776a = AbstractC6208l.m24776a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z10 = false;
                        if (str != null && str.equals(m24776a)) {
                            z10 = true;
                        }
                        this.f8655d = Boolean.valueOf(z10);
                    }
                    if (this.f8655d == null) {
                        this.f8655d = Boolean.TRUE;
                        this.f8714a.mo9577b().m9800r().m9699a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f8655d.booleanValue();
    }

    /* renamed from: k */
    public final double m9621k(String str, C2249b3 c2249b3) {
        if (str == null) {
            return ((Double) c2249b3.m9456a(null)).doubleValue();
        }
        String mo9535e = this.f8654c.mo9535e(str, c2249b3.m9457b());
        if (TextUtils.isEmpty(mo9535e)) {
            return ((Double) c2249b3.m9456a(null)).doubleValue();
        }
        try {
            return ((Double) c2249b3.m9456a(Double.valueOf(Double.parseDouble(mo9535e)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c2249b3.m9456a(null)).doubleValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final int m9622l(String str) {
        return m9626p(str, AbstractC2260c3.f8428I, 500, BannerConfig.TIME);
    }

    /* renamed from: m */
    public final int m9623m() {
        C2398o9 m10031N = this.f8714a.m10031N();
        Boolean m9491J = m10031N.f8714a.m10029L().m9491J();
        if (m10031N.m9943o0() < 201500) {
            if (m9491J == null || m9491J.booleanValue()) {
                return 25;
            }
            return 100;
        }
        return 100;
    }

    /* renamed from: n */
    public final int m9624n(String str) {
        return m9626p(str, AbstractC2260c3.f8429J, 25, 100);
    }

    /* renamed from: o */
    public final int m9625o(String str, C2249b3 c2249b3) {
        if (str == null) {
            return ((Integer) c2249b3.m9456a(null)).intValue();
        }
        String mo9535e = this.f8654c.mo9535e(str, c2249b3.m9457b());
        if (TextUtils.isEmpty(mo9535e)) {
            return ((Integer) c2249b3.m9456a(null)).intValue();
        }
        try {
            return ((Integer) c2249b3.m9456a(Integer.valueOf(Integer.parseInt(mo9535e)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c2249b3.m9456a(null)).intValue();
        }
    }

    /* renamed from: p */
    public final int m9626p(String str, C2249b3 c2249b3, int i10, int i11) {
        return Math.max(Math.min(m9625o(str, c2249b3), i11), i10);
    }

    /* renamed from: q */
    public final long m9627q() {
        this.f8714a.mo9580d();
        return 73000L;
    }

    /* renamed from: r */
    public final long m9628r(String str, C2249b3 c2249b3) {
        if (str == null) {
            return ((Long) c2249b3.m9456a(null)).longValue();
        }
        String mo9535e = this.f8654c.mo9535e(str, c2249b3.m9457b());
        if (TextUtils.isEmpty(mo9535e)) {
            return ((Long) c2249b3.m9456a(null)).longValue();
        }
        try {
            return ((Long) c2249b3.m9456a(Long.valueOf(Long.parseLong(mo9535e)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c2249b3.m9456a(null)).longValue();
        }
    }

    /* renamed from: s */
    final Bundle m9629s() {
        try {
            if (this.f8714a.mo9584f().getPackageManager() == null) {
                this.f8714a.mo9577b().m9800r().m9699a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo m25565c = C6534e.m25570a(this.f8714a.mo9584f()).m25565c(this.f8714a.mo9584f().getPackageName(), 128);
            if (m25565c == null) {
                this.f8714a.mo9577b().m9800r().m9699a("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return m25565c.metaData;
        } catch (PackageManager.NameNotFoundException e10) {
            this.f8714a.mo9577b().m9800r().m9700b("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final Boolean m9630t(String str) {
        AbstractC5391n.m21779e(str);
        Bundle m9629s = m9629s();
        if (m9629s == null) {
            this.f8714a.mo9577b().m9800r().m9699a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (!m9629s.containsKey(str)) {
            return null;
        }
        return Boolean.valueOf(m9629s.getBoolean(str));
    }

    /* renamed from: u */
    public final String m9631u() {
        return m9612j("debug.firebase.analytics.app", "");
    }

    /* renamed from: v */
    public final String m9632v() {
        return m9612j("debug.deferred.deeplink", "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public final String m9633w() {
        this.f8714a.mo9580d();
        return "FA";
    }

    /* renamed from: x */
    public final String m9634x(String str, C2249b3 c2249b3) {
        if (str == null) {
            return (String) c2249b3.m9456a(null);
        }
        return (String) c2249b3.m9456a(this.f8654c.mo9535e(str, c2249b3.m9457b()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m9635y(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            p219l4.AbstractC5391n.m21779e(r4)
            android.os.Bundle r0 = r3.m9629s()
            r1 = 0
            if (r0 != 0) goto L1d
            com.google.android.gms.measurement.internal.q4 r4 = r3.f8714a
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo9577b()
            com.google.android.gms.measurement.internal.k3 r4 = r4.m9800r()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.m9699a(r0)
        L1b:
            r4 = r1
            goto L2c
        L1d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L24
            goto L1b
        L24:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L2c:
            if (r4 == 0) goto L58
            com.google.android.gms.measurement.internal.q4 r0 = r3.f8714a     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.Context r0 = r0.mo9584f()     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L48
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L48
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            if (r4 != 0) goto L43
            return r1
        L43:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            return r4
        L48:
            r4 = move-exception
            com.google.android.gms.measurement.internal.q4 r0 = r3.f8714a
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo9577b()
            com.google.android.gms.measurement.internal.k3 r0 = r0.m9800r()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.m9700b(r2, r4)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2311h.m9635y(java.lang.String):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public final void m9636z(InterfaceC2300g interfaceC2300g) {
        this.f8654c = interfaceC2300g;
    }
}
