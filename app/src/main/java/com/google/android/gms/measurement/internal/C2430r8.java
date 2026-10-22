package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.HandlerC1866c1;

/* renamed from: com.google.android.gms.measurement.internal.r8 */
/* loaded from: classes.dex */
public final class C2430r8 extends AbstractC2491x3 {

    /* renamed from: c */
    private Handler f9042c;

    /* renamed from: d */
    protected final C2419q8 f9043d;

    /* renamed from: e */
    protected final C2408p8 f9044e;

    /* renamed from: f */
    protected final C2386n8 f9045f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2430r8(C2415q4 c2415q4) {
        super(c2415q4);
        this.f9043d = new C2419q8(this);
        this.f9044e = new C2408p8(this);
        this.f9045f = new C2386n8(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static /* bridge */ /* synthetic */ void m10063q(C2430r8 c2430r8, long j10) {
        c2430r8.mo9428h();
        c2430r8.m10065s();
        c2430r8.f8714a.mo9577b().m9804v().m9700b("Activity paused, time", Long.valueOf(j10));
        c2430r8.f9045f.m9875a(j10);
        if (c2430r8.f8714a.m10051z().m9616D()) {
            c2430r8.f9044e.m10009b(j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static /* bridge */ /* synthetic */ void m10064r(C2430r8 c2430r8, long j10) {
        c2430r8.mo9428h();
        c2430r8.m10065s();
        c2430r8.f8714a.mo9577b().m9804v().m9700b("Activity resumed, time", Long.valueOf(j10));
        if (c2430r8.f8714a.m10051z().m9616D() || c2430r8.f8714a.m10024F().f8350q.m10082b()) {
            c2430r8.f9044e.m10010c(j10);
        }
        c2430r8.f9045f.m9876b();
        C2419q8 c2419q8 = c2430r8.f9043d;
        c2419q8.f9011a.mo9428h();
        if (!c2419q8.f9011a.f8714a.m10044o()) {
            return;
        }
        c2419q8.m10053b(c2419q8.f9011a.f8714a.mo9578c().mo24747a(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final void m10065s() {
        mo9428h();
        if (this.f9042c == null) {
            this.f9042c = new HandlerC1866c1(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2491x3
    /* renamed from: n */
    protected final boolean mo9472n() {
        return false;
    }
}
