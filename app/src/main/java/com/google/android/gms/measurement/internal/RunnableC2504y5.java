package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.lzy.okgo.cookie.SerializableCookie;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.y5 */
/* loaded from: classes.dex */
public final class RunnableC2504y5 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Bundle f9233a;

    /* renamed from: b */
    final /* synthetic */ C2406p6 f9234b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2504y5(C2406p6 c2406p6, Bundle bundle) {
        this.f9234b = c2406p6;
        this.f9233a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2406p6 c2406p6 = this.f9234b;
        Bundle bundle = this.f9233a;
        c2406p6.mo9428h();
        c2406p6.m10105i();
        AbstractC5391n.m21783i(bundle);
        String string = bundle.getString(SerializableCookie.NAME);
        String string2 = bundle.getString("origin");
        AbstractC5391n.m21779e(string);
        AbstractC5391n.m21779e(string2);
        AbstractC5391n.m21783i(bundle.get("value"));
        if (!c2406p6.f8714a.m10044o()) {
            c2406p6.f8714a.mo9577b().m9804v().m9699a("Conditional property not set since app measurement is disabled");
            return;
        }
        C2354k9 c2354k9 = new C2354k9(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            C2465v m9956w0 = c2406p6.f8714a.m10031N().m9956w0(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            c2406p6.f8714a.m10029L().m9505s(new C2267d(bundle.getString("app_id"), string2, c2354k9, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), c2406p6.f8714a.m10031N().m9956w0(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), m9956w0, bundle.getLong("time_to_live"), c2406p6.f8714a.m10031N().m9956w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
