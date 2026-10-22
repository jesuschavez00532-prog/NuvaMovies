package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import p025b5.C1098b;
import p126f4.C4225a;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.a4 */
/* loaded from: classes.dex */
public final class C2238a4 extends AbstractC2350k5 {

    /* renamed from: x */
    static final Pair f8335x = new Pair("", 0L);

    /* renamed from: c */
    private SharedPreferences f8336c;

    /* renamed from: d */
    public C2502y3 f8337d;

    /* renamed from: e */
    public final C2480w3 f8338e;

    /* renamed from: f */
    public final C2480w3 f8339f;

    /* renamed from: g */
    public final C2513z3 f8340g;

    /* renamed from: h */
    private String f8341h;

    /* renamed from: i */
    private boolean f8342i;

    /* renamed from: j */
    private long f8343j;

    /* renamed from: k */
    public final C2480w3 f8344k;

    /* renamed from: l */
    public final C2458u3 f8345l;

    /* renamed from: m */
    public final C2513z3 f8346m;

    /* renamed from: n */
    public final C2458u3 f8347n;

    /* renamed from: o */
    public final C2480w3 f8348o;

    /* renamed from: p */
    public boolean f8349p;

    /* renamed from: q */
    public final C2458u3 f8350q;

    /* renamed from: r */
    public final C2458u3 f8351r;

    /* renamed from: s */
    public final C2480w3 f8352s;

    /* renamed from: t */
    public final C2513z3 f8353t;

    /* renamed from: u */
    public final C2513z3 f8354u;

    /* renamed from: v */
    public final C2480w3 f8355v;

    /* renamed from: w */
    public final C2469v3 f8356w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2238a4(C2415q4 c2415q4) {
        super(c2415q4);
        this.f8344k = new C2480w3(this, "session_timeout", 1800000L);
        this.f8345l = new C2458u3(this, "start_new_session", true);
        this.f8348o = new C2480w3(this, "last_pause_time", 0L);
        this.f8346m = new C2513z3(this, "non_personalized_ads", null);
        this.f8347n = new C2458u3(this, "allow_remote_dynamite", false);
        this.f8338e = new C2480w3(this, "first_open_time", 0L);
        this.f8339f = new C2480w3(this, "app_install_time", 0L);
        this.f8340g = new C2513z3(this, "app_instance_id", null);
        this.f8350q = new C2458u3(this, "app_backgrounded", false);
        this.f8351r = new C2458u3(this, "deep_link_retrieval_complete", false);
        this.f8352s = new C2480w3(this, "deep_link_retrieval_attempts", 0L);
        this.f8353t = new C2513z3(this, "firebase_feature_rollouts", null);
        this.f8354u = new C2513z3(this, "deferred_attribution_cache", null);
        this.f8355v = new C2480w3(this, "deferred_attribution_cache_timestamp", 0L);
        this.f8356w = new C2469v3(this, "default_event_parameters", null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2350k5
    /* renamed from: i */
    protected final void mo9429i() {
        SharedPreferences sharedPreferences = this.f8714a.mo9584f().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f8336c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f8349p = z10;
        if (!z10) {
            SharedPreferences.Editor edit = this.f8336c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f8714a.m10051z();
        this.f8337d = new C2502y3(this, "health_monitor", Math.max(0L, ((Long) AbstractC2260c3.f8452d.m9456a(null)).longValue()), null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2350k5
    /* renamed from: j */
    protected final boolean mo9430j() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public final SharedPreferences m9431o() {
        mo9428h();
        m9731k();
        AbstractC5391n.m21783i(this.f8336c);
        return this.f8336c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final Pair m9432p(String str) {
        mo9428h();
        long mo24748b = this.f8714a.mo9578c().mo24748b();
        String str2 = this.f8341h;
        if (str2 != null && mo24748b < this.f8343j) {
            return new Pair(str2, Boolean.valueOf(this.f8342i));
        }
        this.f8343j = mo24748b + this.f8714a.m10051z().m9628r(str, AbstractC2260c3.f8450c);
        C4225a.m17680b(true);
        try {
            C4225a.a m17679a = C4225a.m17679a(this.f8714a.mo9584f());
            this.f8341h = "";
            String m17686a = m17679a.m17686a();
            if (m17686a != null) {
                this.f8341h = m17686a;
            }
            this.f8342i = m17679a.m17687b();
        } catch (Exception e10) {
            this.f8714a.mo9577b().m9799q().m9700b("Unable to get advertising id", e10);
            this.f8341h = "";
        }
        C4225a.m17680b(false);
        return new Pair(this.f8341h, Boolean.valueOf(this.f8342i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final C1098b m9433q() {
        mo9428h();
        return C1098b.m5045b(m9431o().getString("consent_settings", "G1"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final Boolean m9434r() {
        mo9428h();
        if (m9431o().contains("measurement_enabled")) {
            return Boolean.valueOf(m9431o().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public final void m9435s(Boolean bool) {
        mo9428h();
        SharedPreferences.Editor edit = m9431o().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final void m9436t(boolean z10) {
        mo9428h();
        this.f8714a.mo9577b().m9804v().m9700b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor edit = m9431o().edit();
        edit.putBoolean("deferred_analytics_collection", z10);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final boolean m9437u() {
        SharedPreferences sharedPreferences = this.f8336c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean m9438v(long j10) {
        if (j10 - this.f8344k.m10097a() > this.f8348o.m10097a()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public final boolean m9439w(int i10) {
        return C1098b.m5047j(i10, m9431o().getInt("consent_source", 100));
    }
}
