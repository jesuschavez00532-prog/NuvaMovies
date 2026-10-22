package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.t3 */
/* loaded from: classes.dex */
public final class C2447t3 extends BroadcastReceiver {

    /* renamed from: a */
    private final C2310g9 f9072a;

    /* renamed from: b */
    private boolean f9073b;

    /* renamed from: c */
    private boolean f9074c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2447t3(C2310g9 c2310g9) {
        AbstractC5391n.m21783i(c2310g9);
        this.f9072a = c2310g9;
    }

    /* renamed from: b */
    public final void m10078b() {
        this.f9072a.m9585g();
        this.f9072a.mo9575a().mo9428h();
        if (this.f9073b) {
            return;
        }
        this.f9072a.mo9584f().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f9074c = this.f9072a.m9573Y().m10058m();
        this.f9072a.mo9577b().m9804v().m9700b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f9074c));
        this.f9073b = true;
    }

    /* renamed from: c */
    public final void m10079c() {
        this.f9072a.m9585g();
        this.f9072a.mo9575a().mo9428h();
        this.f9072a.mo9575a().mo9428h();
        if (this.f9073b) {
            this.f9072a.mo9577b().m9804v().m9699a("Unregistering connectivity change receiver");
            this.f9073b = false;
            this.f9074c = false;
            try {
                this.f9072a.mo9584f().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.f9072a.mo9577b().m9800r().m9700b("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f9072a.m9585g();
        String action = intent.getAction();
        this.f9072a.mo9577b().m9804v().m9700b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean m10058m = this.f9072a.m9573Y().m10058m();
            if (this.f9074c != m10058m) {
                this.f9074c = m10058m;
                this.f9072a.mo9575a().m9897z(new RunnableC2436s3(this, m10058m));
                return;
            }
            return;
        }
        this.f9072a.mo9577b().m9805w().m9700b("NetworkBroadcastReceiver received unknown action", action);
    }
}
