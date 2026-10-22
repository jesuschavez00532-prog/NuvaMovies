package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.google.android.gms.internal.measurement.C1835a2;
import com.google.android.gms.internal.measurement.C1847ae;
import com.google.android.gms.internal.measurement.C1885d4;
import com.google.android.gms.internal.measurement.C1894dd;
import com.google.android.gms.internal.measurement.C1898e1;
import com.google.android.gms.internal.measurement.C1955hb;
import com.google.android.gms.internal.measurement.C1968i9;
import com.google.android.gms.internal.measurement.C2024m5;
import com.google.android.gms.internal.measurement.C2054o5;
import com.google.android.gms.internal.measurement.C2157v3;
import com.google.android.gms.internal.measurement.C2172w3;
import com.google.android.gms.internal.measurement.C2202y3;
import com.google.android.gms.internal.measurement.C2217z3;
import com.google.android.gms.internal.measurement.C2227zd;
import com.google.android.gms.internal.measurement.InterfaceC2197xd;
import com.google.android.gms.measurement.internal.C2349k4;
import com.umeng.analytics.pro.C3325bt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import p025b5.AbstractC1119q;
import p214l.C5303a;
import p214l.C5309g;
import p219l4.AbstractC5391n;

/* renamed from: com.google.android.gms.measurement.internal.k4 */
/* loaded from: classes.dex */
public final class C2349k4 extends AbstractC2485w8 implements InterfaceC2300g {

    /* renamed from: d */
    private final Map f8734d;

    /* renamed from: e */
    final Map f8735e;

    /* renamed from: f */
    final Map f8736f;

    /* renamed from: g */
    final Map f8737g;

    /* renamed from: h */
    private final Map f8738h;

    /* renamed from: i */
    private final Map f8739i;

    /* renamed from: j */
    final C5309g f8740j;

    /* renamed from: k */
    final InterfaceC2197xd f8741k;

    /* renamed from: l */
    private final Map f8742l;

    /* renamed from: m */
    private final Map f8743m;

    /* renamed from: n */
    private final Map f8744n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2349k4(C2310g9 c2310g9) {
        super(c2310g9);
        this.f8734d = new C5303a();
        this.f8735e = new C5303a();
        this.f8736f = new C5303a();
        this.f8737g = new C5303a();
        this.f8738h = new C5303a();
        this.f8742l = new C5303a();
        this.f8743m = new C5303a();
        this.f8744n = new C5303a();
        this.f8739i = new C5303a();
        this.f8740j = new C2316h4(this, 20);
        this.f8741k = new C2327i4(this);
    }

    /* renamed from: m */
    private final C2217z3 m9703m(String str, byte[] bArr) {
        Long l10;
        if (bArr == null) {
            return C2217z3.m9377D();
        }
        try {
            C2217z3 c2217z3 = (C2217z3) ((C2202y3) C2343j9.m9669C(C2217z3.m9375B(), bArr)).m9176o();
            C2348k3 m9804v = this.f8714a.mo9577b().m9804v();
            String str2 = null;
            if (c2217z3.m9389O()) {
                l10 = Long.valueOf(c2217z3.m9392z());
            } else {
                l10 = null;
            }
            if (c2217z3.m9388N()) {
                str2 = c2217z3.m9381E();
            }
            m9804v.m9701c("Parsed config. version, gmp_app_id", l10, str2);
            return c2217z3;
        } catch (C1968i9 e10) {
            this.f8714a.mo9577b().m9805w().m9701c("Unable to merge remote config. appId", C2370m3.m9796z(str), e10);
            return C2217z3.m9377D();
        } catch (RuntimeException e11) {
            this.f8714a.mo9577b().m9805w().m9701c("Unable to merge remote config. appId", C2370m3.m9796z(str), e11);
            return C2217z3.m9377D();
        }
    }

    /* renamed from: n */
    private final void m9704n(String str, C2202y3 c2202y3) {
        HashSet hashSet = new HashSet();
        C5303a c5303a = new C5303a();
        C5303a c5303a2 = new C5303a();
        C5303a c5303a3 = new C5303a();
        if (c2202y3 != null) {
            C1894dd.m8261c();
            if (this.f8714a.m10051z().m9614B(null, AbstractC2260c3.f8473n0)) {
                Iterator it = c2202y3.m9235y().iterator();
                while (it.hasNext()) {
                    hashSet.add(((C2157v3) it.next()).m9025y());
                }
            }
            for (int i10 = 0; i10 < c2202y3.m9229s(); i10++) {
                C2172w3 c2172w3 = (C2172w3) c2202y3.m9230t(i10).m9408u();
                if (c2172w3.m9060u().isEmpty()) {
                    this.f8714a.mo9577b().m9805w().m9699a("EventConfig contained null event name");
                } else {
                    String m9060u = c2172w3.m9060u();
                    String m5088b = AbstractC1119q.m5088b(c2172w3.m9060u());
                    if (!TextUtils.isEmpty(m5088b)) {
                        c2172w3.m9059t(m5088b);
                        c2202y3.m9232v(i10, c2172w3);
                    }
                    if (c2172w3.m9063x() && c2172w3.m9061v()) {
                        c5303a.put(m9060u, Boolean.TRUE);
                    }
                    if (c2172w3.m9064y() && c2172w3.m9062w()) {
                        c5303a2.put(c2172w3.m9060u(), Boolean.TRUE);
                    }
                    if (c2172w3.m9065z()) {
                        if (c2172w3.m9058s() >= 2 && c2172w3.m9058s() <= 65535) {
                            c5303a3.put(c2172w3.m9060u(), Integer.valueOf(c2172w3.m9058s()));
                        } else {
                            this.f8714a.mo9577b().m9805w().m9701c("Invalid sampling rate. Event name, sample rate", c2172w3.m9060u(), Integer.valueOf(c2172w3.m9058s()));
                        }
                    }
                }
            }
        }
        this.f8735e.put(str, hashSet);
        this.f8736f.put(str, c5303a);
        this.f8737g.put(str, c5303a2);
        this.f8739i.put(str, c5303a3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
    
        if (r2 == null) goto L29;
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x012a: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:299), block:B:35:0x012a */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012d  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m9705o(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2349k4.m9705o(java.lang.String):void");
    }

    /* renamed from: p */
    private final void m9706p(final String str, C2217z3 c2217z3) {
        if (c2217z3.m9390x() != 0) {
            this.f8714a.mo9577b().m9804v().m9700b("EES programs found", Integer.valueOf(c2217z3.m9390x()));
            C2054o5 c2054o5 = (C2054o5) c2217z3.m9385I().get(0);
            try {
                C1898e1 c1898e1 = new C1898e1();
                c1898e1.m8280d("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.f4
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new C1955hb("internal.remoteConfig", new C2338j4(C2349k4.this, str));
                    }
                });
                c1898e1.m8280d("internal.appMetadata", new Callable() { // from class: b5.l
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final C2349k4 c2349k4 = C2349k4.this;
                        final String str2 = str;
                        return new C1847ae("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.e4
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                C2349k4 c2349k42 = C2349k4.this;
                                String str3 = str2;
                                C2372m5 m9756R = c2349k42.f9168b.m9571W().m9756R(str3);
                                HashMap hashMap = new HashMap();
                                hashMap.put(DispatchConstants.PLATFORM, DispatchConstants.ANDROID);
                                hashMap.put(C3325bt.f14273o, str3);
                                c2349k42.f8714a.m10051z().m9627q();
                                hashMap.put("gmp_version", 73000L);
                                if (m9756R != null) {
                                    String m9847g0 = m9756R.m9847g0();
                                    if (m9847g0 != null) {
                                        hashMap.put("app_version", m9847g0);
                                    }
                                    hashMap.put("app_version_int", Long.valueOf(m9756R.m9819L()));
                                    hashMap.put("dynamite_version", Long.valueOf(m9756R.m9828U()));
                                }
                                return hashMap;
                            }
                        });
                    }
                });
                c1898e1.m8280d("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.g4
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new C2227zd(C2349k4.this.f8741k);
                    }
                });
                c1898e1.m8279c(c2054o5);
                this.f8740j.m21409f(str, c1898e1);
                this.f8714a.mo9577b().m9804v().m9701c("EES program loaded for appId, activities", str, Integer.valueOf(c2054o5.m8752x().m8581x()));
                Iterator it = c2054o5.m8752x().m8580A().iterator();
                while (it.hasNext()) {
                    this.f8714a.mo9577b().m9804v().m9700b("EES program activity", ((C2024m5) it.next()).m8698y());
                }
                return;
            } catch (C1835a2 unused) {
                this.f8714a.mo9577b().m9800r().m9700b("Failed to load EES program. appId", str);
                return;
            }
        }
        this.f8740j.m21410g(str);
    }

    /* renamed from: q */
    private static final Map m9707q(C2217z3 c2217z3) {
        C5303a c5303a = new C5303a();
        if (c2217z3 != null) {
            for (C1885d4 c1885d4 : c2217z3.m9386J()) {
                c5303a.put(c1885d4.m8220y(), c1885d4.m8221z());
            }
        }
        return c5303a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static /* bridge */ /* synthetic */ C1898e1 m9708s(C2349k4 c2349k4, String str) {
        c2349k4.m10099i();
        AbstractC5391n.m21779e(str);
        if (!c2349k4.m9712C(str)) {
            return null;
        }
        if (c2349k4.f8738h.containsKey(str) && c2349k4.f8738h.get(str) != null) {
            c2349k4.m9706p(str, (C2217z3) c2349k4.f8738h.get(str));
        } else {
            c2349k4.m9705o(str);
        }
        return (C1898e1) c2349k4.f8740j.m21413k().get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public final void m9710A(String str) {
        mo9428h();
        this.f8738h.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public final boolean m9711B(String str) {
        mo9428h();
        C2217z3 m9725t = m9725t(str);
        if (m9725t == null) {
            return false;
        }
        return m9725t.m9387M();
    }

    /* renamed from: C */
    public final boolean m9712C(String str) {
        C2217z3 c2217z3;
        if (TextUtils.isEmpty(str) || (c2217z3 = (C2217z3) this.f8738h.get(str)) == null || c2217z3.m9390x() == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public final boolean m9713D(String str) {
        return "1".equals(mo9535e(str, "measurement.upload.blacklist_internal"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public final boolean m9714E(String str, String str2) {
        Boolean bool;
        mo9428h();
        m9705o(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f8737g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public final boolean m9715F(String str, String str2) {
        Boolean bool;
        mo9428h();
        m9705o(str);
        if (m9713D(str) && C2398o9.m9898W(str2)) {
            return true;
        }
        if (m9716G(str) && C2398o9.m9899X(str2)) {
            return true;
        }
        Map map = (Map) this.f8736f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public final boolean m9716G(String str) {
        return "1".equals(mo9535e(str, "measurement.upload.blacklist_public"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: H */
    public final boolean m9717H(String str, byte[] bArr, String str2, String str3) {
        m10099i();
        mo9428h();
        AbstractC5391n.m21779e(str);
        C2202y3 c2202y3 = (C2202y3) m9703m(str, bArr).m9408u();
        if (c2202y3 == null) {
            return false;
        }
        m9704n(str, c2202y3);
        m9706p(str, (C2217z3) c2202y3.m9176o());
        this.f8738h.put(str, (C2217z3) c2202y3.m9176o());
        this.f8742l.put(str, c2202y3.m9233w());
        this.f8743m.put(str, str2);
        this.f8744n.put(str, str3);
        this.f8734d.put(str, m9707q((C2217z3) c2202y3.m9176o()));
        this.f9168b.m9571W().m9773n(str, new ArrayList(c2202y3.m9234x()));
        try {
            c2202y3.m9231u();
            bArr = ((C2217z3) c2202y3.m9176o()).m8704j();
        } catch (RuntimeException e10) {
            this.f8714a.mo9577b().m9805w().m9701c("Unable to serialize reduced-size config. Storing full config instead. appId", C2370m3.m9796z(str), e10);
        }
        C2355l m9571W = this.f9168b.m9571W();
        AbstractC5391n.m21779e(str);
        m9571W.mo9428h();
        m9571W.m10099i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        if (m9571W.f8714a.m10051z().m9614B(null, AbstractC2260c3.f8495y0)) {
            contentValues.put("e_tag", str3);
        }
        try {
            if (m9571W.m9754P().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                m9571W.f8714a.mo9577b().m9800r().m9700b("Failed to update remote config (got 0). appId", C2370m3.m9796z(str));
            }
        } catch (SQLiteException e11) {
            m9571W.f8714a.mo9577b().m9800r().m9701c("Error storing remote config. appId", C2370m3.m9796z(str), e11);
        }
        this.f8738h.put(str, (C2217z3) c2202y3.m9176o());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public final boolean m9718I(String str) {
        mo9428h();
        m9705o(str);
        if (this.f8735e.get(str) != null && ((Set) this.f8735e.get(str)).contains("app_instance_id")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public final boolean m9719J(String str) {
        mo9428h();
        m9705o(str);
        if (this.f8735e.get(str) == null) {
            return false;
        }
        if (!((Set) this.f8735e.get(str)).contains("device_model") && !((Set) this.f8735e.get(str)).contains("device_info")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public final boolean m9720K(String str) {
        mo9428h();
        m9705o(str);
        if (this.f8735e.get(str) != null && ((Set) this.f8735e.get(str)).contains("enhanced_user_id")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public final boolean m9721L(String str) {
        mo9428h();
        m9705o(str);
        if (this.f8735e.get(str) != null && ((Set) this.f8735e.get(str)).contains("google_signals")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public final boolean m9722M(String str) {
        mo9428h();
        m9705o(str);
        if (this.f8735e.get(str) == null) {
            return false;
        }
        if (!((Set) this.f8735e.get(str)).contains(C3325bt.f14283y) && !((Set) this.f8735e.get(str)).contains("device_info")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public final boolean m9723N(String str) {
        mo9428h();
        m9705o(str);
        if (this.f8735e.get(str) != null && ((Set) this.f8735e.get(str)).contains("user_id")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2300g
    /* renamed from: e */
    public final String mo9535e(String str, String str2) {
        mo9428h();
        m9705o(str);
        Map map = (Map) this.f8734d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2485w8
    /* renamed from: l */
    protected final boolean mo9454l() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final int m9724r(String str, String str2) {
        Integer num;
        mo9428h();
        m9705o(str);
        Map map = (Map) this.f8739i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public final C2217z3 m9725t(String str) {
        m10099i();
        mo9428h();
        AbstractC5391n.m21779e(str);
        m9705o(str);
        return (C2217z3) this.f8738h.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public final String m9726u(String str) {
        mo9428h();
        return (String) this.f8744n.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public final String m9727v(String str) {
        mo9428h();
        return (String) this.f8743m.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public final String m9728w(String str) {
        mo9428h();
        m9705o(str);
        return (String) this.f8742l.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public final Set m9729y(String str) {
        mo9428h();
        m9705o(str);
        return (Set) this.f8735e.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public final void m9730z(String str) {
        mo9428h();
        this.f8743m.put(str, null);
    }
}
