package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.lzy.okgo.cookie.SerializableCookie;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.z5 */
/* loaded from: classes.dex */
public final class RunnableC2515z5 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Bundle f9253a;

    /* renamed from: b */
    final /* synthetic */ C2406p6 f9254b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2515z5(C2406p6 c2406p6, Bundle bundle) {
        this.f9254b = c2406p6;
        this.f9253a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2406p6 c2406p6 = this.f9254b;
        Bundle bundle = this.f9253a;
        c2406p6.mo9428h();
        c2406p6.m10105i();
        AbstractC5391n.m21783i(bundle);
        String m21779e = AbstractC5391n.m21779e(bundle.getString(SerializableCookie.NAME));
        if (!c2406p6.f8714a.m10044o()) {
            c2406p6.f8714a.mo9577b().m9804v().m9699a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            c2406p6.f8714a.m10029L().m9505s(new C2267d(bundle.getString("app_id"), "", new C2354k9(m21779e, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), c2406p6.f8714a.m10031N().m9956w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
