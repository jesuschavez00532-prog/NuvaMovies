package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import anet.channel.entity.ConnType;
import com.google.android.gms.internal.measurement.C1861bc;
import com.google.android.gms.internal.measurement.C1942gd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.q8 */
/* loaded from: classes.dex */
public final class C2419q8 {

    /* renamed from: a */
    final /* synthetic */ C2430r8 f9011a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2419q8(C2430r8 c2430r8) {
        this.f9011a = c2430r8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m10052a() {
        this.f9011a.mo9428h();
        if (this.f9011a.f8714a.m10024F().m9438v(this.f9011a.f8714a.mo9578c().mo24747a())) {
            this.f9011a.f8714a.m10024F().f8345l.m10081a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f9011a.f8714a.mo9577b().m9804v().m9699a("Detected application was in foreground");
                m10054c(this.f9011a.f8714a.mo9578c().mo24747a(), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m10053b(long j10, boolean z10) {
        this.f9011a.mo9428h();
        this.f9011a.m10065s();
        if (this.f9011a.f8714a.m10024F().m9438v(j10)) {
            this.f9011a.f8714a.m10024F().f8345l.m10081a(true);
            C1942gd.m8472c();
            if (this.f9011a.f8714a.m10051z().m9614B(null, AbstractC2260c3.f8487u0)) {
                this.f9011a.f8714a.m10020B().m9531v();
            }
        }
        this.f9011a.f8714a.m10024F().f8348o.m10098b(j10);
        if (this.f9011a.f8714a.m10024F().f8345l.m10082b()) {
            m10054c(j10, z10);
        }
    }

    /* renamed from: c */
    final void m10054c(long j10, boolean z10) {
        this.f9011a.mo9428h();
        if (!this.f9011a.f8714a.m10044o()) {
            return;
        }
        this.f9011a.f8714a.m10024F().f8348o.m10098b(j10);
        this.f9011a.f8714a.mo9577b().m9804v().m9700b("Session started, time", Long.valueOf(this.f9011a.f8714a.mo9578c().mo24748b()));
        Long valueOf = Long.valueOf(j10 / 1000);
        this.f9011a.f8714a.m10026I().m9982M(ConnType.PK_AUTO, "_sid", valueOf, j10);
        this.f9011a.f8714a.m10024F().f8345l.m10081a(false);
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", valueOf.longValue());
        if (this.f9011a.f8714a.m10051z().m9614B(null, AbstractC2260c3.f8449b0) && z10) {
            bundle.putLong("_aib", 1L);
        }
        this.f9011a.f8714a.m10026I().m10003v(ConnType.PK_AUTO, "_s", j10, bundle);
        C1861bc.m8149c();
        if (this.f9011a.f8714a.m10051z().m9614B(null, AbstractC2260c3.f8455e0)) {
            String m10115a = this.f9011a.f8714a.m10024F().f8353t.m10115a();
            if (!TextUtils.isEmpty(m10115a)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", m10115a);
                this.f9011a.f8714a.m10026I().m10003v(ConnType.PK_AUTO, "_ssr", j10, bundle2);
            }
        }
    }
}
