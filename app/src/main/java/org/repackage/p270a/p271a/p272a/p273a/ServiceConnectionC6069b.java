package org.repackage.p270a.p271a.p272a.p273a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import org.repackage.p270a.p271a.p272a.InterfaceC6067a;

/* renamed from: org.repackage.a.a.a.a.b */
/* loaded from: classes3.dex */
public class ServiceConnectionC6069b implements ServiceConnection {

    /* renamed from: a */
    public final /* synthetic */ C6070c f23844a;

    public ServiceConnectionC6069b(C6070c c6070c) {
        this.f23844a = c6070c;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f23844a.f23845a = InterfaceC6067a.a.m24221a(iBinder);
        synchronized (this.f23844a.f23848d) {
            this.f23844a.f23848d.notify();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f23844a.f23845a = null;
    }
}
