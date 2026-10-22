package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import p025b5.InterfaceC1106f;
import p172i4.C4854b;
import p219l4.AbstractC5358c;
import p219l4.AbstractC5391n;
import p259o4.C5915b;

/* renamed from: com.google.android.gms.measurement.internal.a8 */
/* loaded from: classes.dex */
public final class ServiceConnectionC2242a8 implements ServiceConnection, AbstractC5358c.a, AbstractC5358c.b {

    /* renamed from: a */
    private volatile boolean f8364a;

    /* renamed from: b */
    private volatile C2326i3 f8365b;

    /* renamed from: c */
    final /* synthetic */ C2254b8 f8366c;

    /* JADX INFO: Access modifiers changed from: protected */
    public ServiceConnectionC2242a8(C2254b8 c2254b8) {
        this.f8366c = c2254b8;
    }

    @Override // p219l4.AbstractC5358c.b
    /* renamed from: a */
    public final void mo9441a(C4854b c4854b) {
        AbstractC5391n.m21778d("MeasurementServiceConnection.onConnectionFailed");
        C2370m3 m10023E = this.f8366c.f8714a.m10023E();
        if (m10023E != null) {
            m10023E.m9805w().m9700b("Service connection failed", c4854b);
        }
        synchronized (this) {
            this.f8364a = false;
            this.f8365b = null;
        }
        this.f8366c.f8714a.mo9575a().m9897z(new RunnableC2517z7(this));
    }

    @Override // p219l4.AbstractC5358c.a
    /* renamed from: c */
    public final void mo9442c(int i10) {
        AbstractC5391n.m21778d("MeasurementServiceConnection.onConnectionSuspended");
        this.f8366c.f8714a.mo9577b().m9799q().m9699a("Service connection suspended");
        this.f8366c.f8714a.mo9575a().m9897z(new RunnableC2506y7(this));
    }

    @Override // p219l4.AbstractC5358c.a
    /* renamed from: d */
    public final void mo9443d(Bundle bundle) {
        AbstractC5391n.m21778d("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                AbstractC5391n.m21783i(this.f8365b);
                this.f8366c.f8714a.mo9575a().m9897z(new RunnableC2495x7(this, (InterfaceC1106f) this.f8365b.m21663C()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f8365b = null;
                this.f8364a = false;
            }
        }
    }

    /* renamed from: e */
    public final void m9444e(Intent intent) {
        ServiceConnectionC2242a8 serviceConnectionC2242a8;
        this.f8366c.mo9428h();
        Context mo9584f = this.f8366c.f8714a.mo9584f();
        C5915b m23917b = C5915b.m23917b();
        synchronized (this) {
            if (this.f8364a) {
                this.f8366c.f8714a.mo9577b().m9804v().m9699a("Connection attempt already in progress");
                return;
            }
            this.f8366c.f8714a.mo9577b().m9804v().m9699a("Using local app measurement service");
            this.f8364a = true;
            serviceConnectionC2242a8 = this.f8366c.f8404c;
            m23917b.m23922a(mo9584f, intent, serviceConnectionC2242a8, 129);
        }
    }

    /* renamed from: f */
    public final void m9445f() {
        this.f8366c.mo9428h();
        Context mo9584f = this.f8366c.f8714a.mo9584f();
        synchronized (this) {
            if (this.f8364a) {
                this.f8366c.f8714a.mo9577b().m9804v().m9699a("Connection attempt already in progress");
                return;
            }
            if (this.f8365b != null && (this.f8365b.m21679c() || this.f8365b.isConnected())) {
                this.f8366c.f8714a.mo9577b().m9804v().m9699a("Already awaiting connection attempt");
                return;
            }
            this.f8365b = new C2326i3(mo9584f, Looper.getMainLooper(), this, this);
            this.f8366c.f8714a.mo9577b().m9804v().m9699a("Connecting to remote service");
            this.f8364a = true;
            AbstractC5391n.m21783i(this.f8365b);
            this.f8365b.m21689p();
        }
    }

    /* renamed from: g */
    public final void m9446g() {
        if (this.f8365b != null && (this.f8365b.isConnected() || this.f8365b.m21679c())) {
            this.f8365b.m21683f();
        }
        this.f8365b = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ServiceConnectionC2242a8 serviceConnectionC2242a8;
        InterfaceC1106f c2271d3;
        AbstractC5391n.m21778d("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f8364a = false;
                this.f8366c.f8714a.mo9577b().m9800r().m9699a("Service connected with null binder");
                return;
            }
            InterfaceC1106f interfaceC1106f = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (queryLocalInterface instanceof InterfaceC1106f) {
                        c2271d3 = (InterfaceC1106f) queryLocalInterface;
                    } else {
                        c2271d3 = new C2271d3(iBinder);
                    }
                    interfaceC1106f = c2271d3;
                    this.f8366c.f8714a.mo9577b().m9804v().m9699a("Bound to IMeasurementService interface");
                } else {
                    this.f8366c.f8714a.mo9577b().m9800r().m9700b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f8366c.f8714a.mo9577b().m9800r().m9699a("Service connect failed to get IMeasurementService");
            }
            if (interfaceC1106f == null) {
                this.f8364a = false;
                try {
                    C5915b m23917b = C5915b.m23917b();
                    Context mo9584f = this.f8366c.f8714a.mo9584f();
                    serviceConnectionC2242a8 = this.f8366c.f8404c;
                    m23917b.m23923c(mo9584f, serviceConnectionC2242a8);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f8366c.f8714a.mo9575a().m9897z(new RunnableC2473v7(this, interfaceC1106f));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC5391n.m21778d("MeasurementServiceConnection.onServiceDisconnected");
        this.f8366c.f8714a.mo9577b().m9799q().m9699a("Service disconnected");
        this.f8366c.f8714a.mo9575a().m9897z(new RunnableC2484w7(this, componentName));
    }
}
