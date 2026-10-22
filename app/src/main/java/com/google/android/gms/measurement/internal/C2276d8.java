package com.google.android.gms.measurement.internal;

import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p025b5.C1098b;
import p025b5.EnumC1096a;
import p126f4.C4225a;

/* renamed from: com.google.android.gms.measurement.internal.d8 */
/* loaded from: classes.dex */
public final class C2276d8 extends AbstractC2485w8 {

    /* renamed from: d */
    private final Map f8544d;

    /* renamed from: e */
    public final C2480w3 f8545e;

    /* renamed from: f */
    public final C2480w3 f8546f;

    /* renamed from: g */
    public final C2480w3 f8547g;

    /* renamed from: h */
    public final C2480w3 f8548h;

    /* renamed from: i */
    public final C2480w3 f8549i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2276d8(C2310g9 c2310g9) {
        super(c2310g9);
        this.f8544d = new HashMap();
        C2238a4 m10024F = this.f8714a.m10024F();
        m10024F.getClass();
        this.f8545e = new C2480w3(m10024F, "last_delete_stale", 0L);
        C2238a4 m10024F2 = this.f8714a.m10024F();
        m10024F2.getClass();
        this.f8546f = new C2480w3(m10024F2, "backoff", 0L);
        C2238a4 m10024F3 = this.f8714a.m10024F();
        m10024F3.getClass();
        this.f8547g = new C2480w3(m10024F3, "last_upload", 0L);
        C2238a4 m10024F4 = this.f8714a.m10024F();
        m10024F4.getClass();
        this.f8548h = new C2480w3(m10024F4, "last_upload_attempt", 0L);
        C2238a4 m10024F5 = this.f8714a.m10024F();
        m10024F5.getClass();
        this.f8549i = new C2480w3(m10024F5, "midnight_offset", 0L);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2485w8
    /* renamed from: l */
    protected final boolean mo9454l() {
        return false;
    }

    /* renamed from: m */
    final Pair m9520m(String str) {
        C2265c8 c2265c8;
        C4225a.a m17679a;
        mo9428h();
        long mo24748b = this.f8714a.mo9578c().mo24748b();
        C2265c8 c2265c82 = (C2265c8) this.f8544d.get(str);
        if (c2265c82 != null && mo24748b < c2265c82.f8516c) {
            return new Pair(c2265c82.f8514a, Boolean.valueOf(c2265c82.f8515b));
        }
        C4225a.m17680b(true);
        long m9628r = mo24748b + this.f8714a.m10051z().m9628r(str, AbstractC2260c3.f8450c);
        try {
            m17679a = C4225a.m17679a(this.f8714a.mo9584f());
        } catch (Exception e10) {
            this.f8714a.mo9577b().m9799q().m9700b("Unable to get advertising id", e10);
            c2265c8 = new C2265c8("", false, m9628r);
        }
        if (m17679a == null) {
            return new Pair("", Boolean.FALSE);
        }
        String m17686a = m17679a.m17686a();
        if (m17686a != null) {
            c2265c8 = new C2265c8(m17686a, m17679a.m17687b(), m9628r);
        } else {
            c2265c8 = new C2265c8("", m17679a.m17687b(), m9628r);
        }
        this.f8544d.put(str, c2265c8);
        C4225a.m17680b(false);
        return new Pair(c2265c8.f8514a, Boolean.valueOf(c2265c8.f8515b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final Pair m9521n(String str, C1098b c1098b) {
        if (c1098b.m5055i(EnumC1096a.AD_STORAGE)) {
            return m9520m(str);
        }
        return new Pair("", Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final String m9522o(String str, boolean z10) {
        String str2;
        mo9428h();
        if (z10) {
            str2 = (String) m9520m(str).first;
        } else {
            str2 = "00000000-0000-0000-0000-000000000000";
        }
        MessageDigest m9910t = C2398o9.m9910t();
        if (m9910t == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, m9910t.digest(str2.getBytes())));
    }
}
