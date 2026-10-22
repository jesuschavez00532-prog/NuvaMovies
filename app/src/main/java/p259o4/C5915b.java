package p259o4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p219l4.AbstractC5391n;
import p219l4.InterfaceC5381j1;
import p281p4.AbstractC6207k;
import p310r4.C6534e;

/* renamed from: o4.b */
/* loaded from: classes.dex */
public class C5915b {

    /* renamed from: b */
    private static final Object f23535b = new Object();

    /* renamed from: c */
    private static volatile C5915b f23536c;

    /* renamed from: a */
    public ConcurrentHashMap f23537a = new ConcurrentHashMap();

    private C5915b() {
    }

    /* renamed from: b */
    public static C5915b m23917b() {
        if (f23536c == null) {
            synchronized (f23535b) {
                if (f23536c == null) {
                    f23536c = new C5915b();
                }
            }
        }
        C5915b c5915b = f23536c;
        AbstractC5391n.m21783i(c5915b);
        return c5915b;
    }

    /* renamed from: e */
    private static void m23918e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    /* renamed from: f */
    private final boolean m23919f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, boolean z10, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C6534e.m25570a(context).m25565c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (m23920g(serviceConnection)) {
            ServiceConnection serviceConnection2 = (ServiceConnection) this.f23537a.putIfAbsent(serviceConnection, serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            try {
                boolean m23921h = m23921h(context, intent, serviceConnection, i10, executor);
                if (!m23921h) {
                    return false;
                }
                return m23921h;
            } finally {
                this.f23537a.remove(serviceConnection, serviceConnection);
            }
        }
        return m23921h(context, intent, serviceConnection, i10, executor);
    }

    /* renamed from: g */
    private static boolean m23920g(ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof InterfaceC5381j1)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private static final boolean m23921h(Context context, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        boolean bindService;
        if (AbstractC6207k.m24773j() && executor != null) {
            bindService = context.bindService(intent, i10, executor, serviceConnection);
            return bindService;
        }
        return context.bindService(intent, serviceConnection, i10);
    }

    /* renamed from: a */
    public boolean m23922a(Context context, Intent intent, ServiceConnection serviceConnection, int i10) {
        return m23919f(context, context.getClass().getName(), intent, serviceConnection, i10, true, null);
    }

    /* renamed from: c */
    public void m23923c(Context context, ServiceConnection serviceConnection) {
        if (m23920g(serviceConnection) && this.f23537a.containsKey(serviceConnection)) {
            try {
                m23918e(context, (ServiceConnection) this.f23537a.get(serviceConnection));
                return;
            } finally {
                this.f23537a.remove(serviceConnection);
            }
        }
        m23918e(context, serviceConnection);
    }

    /* renamed from: d */
    public final boolean m23924d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        return m23919f(context, str, intent, serviceConnection, i10, true, executor);
    }
}
