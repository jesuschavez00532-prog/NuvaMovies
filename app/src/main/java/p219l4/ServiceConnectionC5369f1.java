package p219l4;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import p259o4.C5915b;
import p281p4.AbstractC6207k;

/* renamed from: l4.f1 */
/* loaded from: classes.dex */
final class ServiceConnectionC5369f1 implements ServiceConnection, InterfaceC5381j1 {

    /* renamed from: a */
    private final Map f21970a = new HashMap();

    /* renamed from: b */
    private int f21971b = 2;

    /* renamed from: c */
    private boolean f21972c;

    /* renamed from: d */
    private IBinder f21973d;

    /* renamed from: e */
    private final C5363d1 f21974e;

    /* renamed from: f */
    private ComponentName f21975f;

    /* renamed from: g */
    final /* synthetic */ C5378i1 f21976g;

    public ServiceConnectionC5369f1(C5378i1 c5378i1, C5363d1 c5363d1) {
        this.f21976g = c5378i1;
        this.f21974e = c5363d1;
    }

    /* renamed from: a */
    public final int m21728a() {
        return this.f21971b;
    }

    /* renamed from: b */
    public final ComponentName m21729b() {
        return this.f21975f;
    }

    /* renamed from: c */
    public final IBinder m21730c() {
        return this.f21973d;
    }

    /* renamed from: d */
    public final void m21731d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f21970a.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: e */
    public final void m21732e(String str, Executor executor) {
        C5915b c5915b;
        Context context;
        Context context2;
        C5915b c5915b2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j10;
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f21971b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (AbstractC6207k.m24775l()) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            C5378i1 c5378i1 = this.f21976g;
            c5915b = c5378i1.f21999j;
            context = c5378i1.f21996g;
            C5363d1 c5363d1 = this.f21974e;
            context2 = c5378i1.f21996g;
            boolean m23924d = c5915b.m23924d(context, str, c5363d1.m21715c(context2), this, this.f21974e.m21713a(), executor);
            this.f21972c = m23924d;
            if (m23924d) {
                handler = this.f21976g.f21997h;
                Message obtainMessage = handler.obtainMessage(1, this.f21974e);
                handler2 = this.f21976g.f21997h;
                j10 = this.f21976g.f22001l;
                handler2.sendMessageDelayed(obtainMessage, j10);
            } else {
                this.f21971b = 2;
                try {
                    C5378i1 c5378i12 = this.f21976g;
                    c5915b2 = c5378i12.f21999j;
                    context3 = c5378i12.f21996g;
                    c5915b2.m23923c(context3, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    /* renamed from: f */
    public final void m21733f(ServiceConnection serviceConnection, String str) {
        this.f21970a.remove(serviceConnection);
    }

    /* renamed from: g */
    public final void m21734g(String str) {
        Handler handler;
        C5915b c5915b;
        Context context;
        handler = this.f21976g.f21997h;
        handler.removeMessages(1, this.f21974e);
        C5378i1 c5378i1 = this.f21976g;
        c5915b = c5378i1.f21999j;
        context = c5378i1.f21996g;
        c5915b.m23923c(context, this);
        this.f21972c = false;
        this.f21971b = 2;
    }

    /* renamed from: h */
    public final boolean m21735h(ServiceConnection serviceConnection) {
        return this.f21970a.containsKey(serviceConnection);
    }

    /* renamed from: i */
    public final boolean m21736i() {
        return this.f21970a.isEmpty();
    }

    /* renamed from: j */
    public final boolean m21737j() {
        return this.f21972c;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f21976g.f21995f;
        synchronized (hashMap) {
            handler = this.f21976g.f21997h;
            handler.removeMessages(1, this.f21974e);
            this.f21973d = iBinder;
            this.f21975f = componentName;
            Iterator it = this.f21970a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.f21971b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f21976g.f21995f;
        synchronized (hashMap) {
            handler = this.f21976g.f21997h;
            handler.removeMessages(1, this.f21974e);
            this.f21973d = null;
            this.f21975f = componentName;
            Iterator it = this.f21970a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.f21971b = 2;
        }
    }
}
