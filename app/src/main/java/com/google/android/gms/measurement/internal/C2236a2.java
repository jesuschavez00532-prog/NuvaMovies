package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import p214l.C5303a;
import p219l4.AbstractC5391n;

/* renamed from: com.google.android.gms.measurement.internal.a2 */
/* loaded from: classes.dex */
public final class C2236a2 extends AbstractC2237a3 {

    /* renamed from: b */
    private final Map f8332b;

    /* renamed from: c */
    private final Map f8333c;

    /* renamed from: d */
    private long f8334d;

    public C2236a2(C2415q4 c2415q4) {
        super(c2415q4);
        this.f8333c = new C5303a();
        this.f8332b = new C5303a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static /* synthetic */ void m9419i(C2236a2 c2236a2, String str, long j10) {
        c2236a2.mo9428h();
        AbstractC5391n.m21779e(str);
        if (c2236a2.f8333c.isEmpty()) {
            c2236a2.f8334d = j10;
        }
        Integer num = (Integer) c2236a2.f8333c.get(str);
        if (num != null) {
            c2236a2.f8333c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (c2236a2.f8333c.size() >= 100) {
            c2236a2.f8714a.mo9577b().m9805w().m9699a("Too many ads visible");
        } else {
            c2236a2.f8333c.put(str, 1);
            c2236a2.f8332b.put(str, Long.valueOf(j10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static /* synthetic */ void m9420j(C2236a2 c2236a2, String str, long j10) {
        c2236a2.mo9428h();
        AbstractC5391n.m21779e(str);
        Integer num = (Integer) c2236a2.f8333c.get(str);
        if (num != null) {
            C2461u6 m9474s = c2236a2.f8714a.m10028K().m9474s(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                c2236a2.f8333c.remove(str);
                Long l10 = (Long) c2236a2.f8332b.get(str);
                if (l10 == null) {
                    c2236a2.f8714a.mo9577b().m9800r().m9699a("First ad unit exposure time was never set");
                } else {
                    long longValue = l10.longValue();
                    c2236a2.f8332b.remove(str);
                    c2236a2.m9423p(str, j10 - longValue, m9474s);
                }
                if (c2236a2.f8333c.isEmpty()) {
                    long j11 = c2236a2.f8334d;
                    if (j11 == 0) {
                        c2236a2.f8714a.mo9577b().m9800r().m9699a("First ad exposure time was never set");
                        return;
                    } else {
                        c2236a2.m9422o(j10 - j11, m9474s);
                        c2236a2.f8334d = 0L;
                        return;
                    }
                }
                return;
            }
            c2236a2.f8333c.put(str, Integer.valueOf(intValue));
            return;
        }
        c2236a2.f8714a.mo9577b().m9800r().m9700b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    /* renamed from: o */
    private final void m9422o(long j10, C2461u6 c2461u6) {
        if (c2461u6 == null) {
            this.f8714a.mo9577b().m9804v().m9699a("Not logging ad exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.f8714a.mo9577b().m9804v().m9700b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j10);
        C2398o9.m9912y(c2461u6, bundle, true);
        this.f8714a.m10026I().m10002u("am", "_xa", bundle);
    }

    /* renamed from: p */
    private final void m9423p(String str, long j10, C2461u6 c2461u6) {
        if (c2461u6 == null) {
            this.f8714a.mo9577b().m9804v().m9699a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.f8714a.mo9577b().m9804v().m9700b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j10);
        C2398o9.m9912y(c2461u6, bundle, true);
        this.f8714a.m10026I().m10002u("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final void m9424q(long j10) {
        Iterator it = this.f8332b.keySet().iterator();
        while (it.hasNext()) {
            this.f8332b.put((String) it.next(), Long.valueOf(j10));
        }
        if (!this.f8332b.isEmpty()) {
            this.f8334d = j10;
        }
    }

    /* renamed from: l */
    public final void m9425l(String str, long j10) {
        if (str != null && str.length() != 0) {
            this.f8714a.mo9575a().m9897z(new RunnableC2233a(this, str, j10));
        } else {
            this.f8714a.mo9577b().m9800r().m9699a("Ad unit id must be a non-empty string");
        }
    }

    /* renamed from: m */
    public final void m9426m(String str, long j10) {
        if (str != null && str.length() != 0) {
            this.f8714a.mo9575a().m9897z(new RunnableC2498y(this, str, j10));
        } else {
            this.f8714a.mo9577b().m9800r().m9699a("Ad unit id must be a non-empty string");
        }
    }

    /* renamed from: n */
    public final void m9427n(long j10) {
        C2461u6 m9474s = this.f8714a.m10028K().m9474s(false);
        for (String str : this.f8332b.keySet()) {
            m9423p(str, j10 - ((Long) this.f8332b.get(str)).longValue(), m9474s);
        }
        if (!this.f8332b.isEmpty()) {
            m9422o(j10 - this.f8334d, m9474s);
        }
        m9424q(j10);
    }
}
