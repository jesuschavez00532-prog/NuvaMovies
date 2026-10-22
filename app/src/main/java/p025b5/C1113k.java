package p025b5;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C2370m3;
import com.google.android.gms.measurement.internal.C2415q4;
import p219l4.AbstractC5391n;

/* renamed from: b5.k */
/* loaded from: classes.dex */
public final class C1113k {

    /* renamed from: a */
    private final InterfaceC1112j f4406a;

    public C1113k(InterfaceC1112j interfaceC1112j) {
        AbstractC5391n.m21783i(interfaceC1112j);
        this.f4406a = interfaceC1112j;
    }

    /* renamed from: a */
    public final void m5081a(Context context, Intent intent) {
        C2415q4 m10013H = C2415q4.m10013H(context, null, null);
        C2370m3 mo9577b = m10013H.mo9577b();
        if (intent == null) {
            mo9577b.m9805w().m9699a("Receiver called with null intent");
            return;
        }
        m10013H.mo9580d();
        String action = intent.getAction();
        mo9577b.m9804v().m9700b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            mo9577b.m9804v().m9699a("Starting wakeful intent.");
            this.f4406a.mo5080a(context, className);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            mo9577b.m9805w().m9699a("Install Referrer Broadcasts are deprecated");
        }
    }
}
