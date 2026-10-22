package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.AbstractBinderC2109s0;
import com.google.android.gms.internal.measurement.InterfaceC2124t0;

/* renamed from: com.google.android.gms.measurement.internal.c4 */
/* loaded from: classes.dex */
public final class ServiceConnectionC2261c4 implements ServiceConnection {

    /* renamed from: a */
    private final String f8498a;

    /* renamed from: b */
    final /* synthetic */ C2272d4 f8499b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ServiceConnectionC2261c4(C2272d4 c2272d4, String str) {
        this.f8499b = c2272d4;
        this.f8498a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                InterfaceC2124t0 m8910c = AbstractBinderC2109s0.m8910c(iBinder);
                if (m8910c == null) {
                    this.f8499b.f8535a.mo9577b().m9805w().m9699a("Install Referrer Service implementation was not found");
                    return;
                } else {
                    this.f8499b.f8535a.mo9577b().m9804v().m9699a("Install Referrer Service connected");
                    this.f8499b.f8535a.mo9575a().m9897z(new RunnableC2250b4(this, m8910c, this));
                    return;
                }
            } catch (RuntimeException e10) {
                this.f8499b.f8535a.mo9577b().m9805w().m9700b("Exception occurred while calling Install Referrer API", e10);
                return;
            }
        }
        this.f8499b.f8535a.mo9577b().m9805w().m9699a("Install Referrer connection returned with null binder");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f8499b.f8535a.mo9577b().m9804v().m9699a("Install Referrer Service disconnected");
    }
}
