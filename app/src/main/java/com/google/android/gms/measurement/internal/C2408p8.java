package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import anet.channel.entity.ConnType;
import com.google.android.gms.internal.measurement.C2016lc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.p8 */
/* loaded from: classes.dex */
public final class C2408p8 {

    /* renamed from: a */
    protected long f8942a;

    /* renamed from: b */
    protected long f8943b;

    /* renamed from: c */
    private final AbstractC2388o f8944c;

    /* renamed from: d */
    final /* synthetic */ C2430r8 f8945d;

    public C2408p8(C2430r8 c2430r8) {
        this.f8945d = c2430r8;
        this.f8944c = new C2397o8(this, c2430r8.f8714a);
        long mo24748b = c2430r8.f8714a.mo9578c().mo24748b();
        this.f8942a = mo24748b;
        this.f8943b = mo24748b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m10008a() {
        this.f8944c.m9879b();
        this.f8942a = 0L;
        this.f8943b = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m10009b(long j10) {
        this.f8944c.m9879b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m10010c(long j10) {
        this.f8945d.mo9428h();
        this.f8944c.m9879b();
        this.f8942a = j10;
        this.f8943b = j10;
    }

    /* renamed from: d */
    public final boolean m10011d(boolean z10, boolean z11, long j10) {
        this.f8945d.mo9428h();
        this.f8945d.m10105i();
        C2016lc.m8665c();
        if (this.f8945d.f8714a.m10051z().m9614B(null, AbstractC2260c3.f8457f0)) {
            if (this.f8945d.f8714a.m10044o()) {
                this.f8945d.f8714a.m10024F().f8348o.m10098b(this.f8945d.f8714a.mo9578c().mo24747a());
            }
        } else {
            this.f8945d.f8714a.m10024F().f8348o.m10098b(this.f8945d.f8714a.mo9578c().mo24747a());
        }
        long j11 = j10 - this.f8942a;
        if (!z10 && j11 < 1000) {
            this.f8945d.f8714a.mo9577b().m9804v().m9700b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
            return false;
        }
        if (!z11) {
            j11 = j10 - this.f8943b;
            this.f8943b = j10;
        }
        this.f8945d.f8714a.mo9577b().m9804v().m9700b("Recording user engagement, ms", Long.valueOf(j11));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        C2398o9.m9912y(this.f8945d.f8714a.m10028K().m9474s(!this.f8945d.f8714a.m10051z().m9616D()), bundle, true);
        if (!z11) {
            this.f8945d.f8714a.m10026I().m10002u(ConnType.PK_AUTO, "_e", bundle);
        }
        this.f8942a = j10;
        this.f8944c.m9879b();
        this.f8944c.m9880d(3600000L);
        return true;
    }
}
