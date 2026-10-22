package nf;

import android.os.IBinder;
import android.os.ServiceManager;

/* renamed from: nf.c */
/* loaded from: classes3.dex */
public class C5885c {

    /* renamed from: a */
    private static IBinder f23418a;

    /* renamed from: b */
    private static C5885c f23419b;

    /* renamed from: a */
    public static C5885c m23720a() {
        if (f23419b == null) {
            f23419b = new C5885c();
            f23418a = ServiceManager.getService("SwlNativeService");
        }
        IBinder iBinder = f23418a;
        if (iBinder == null || !iBinder.pingBinder()) {
            f23418a = ServiceManager.getService("SwlNativeService");
        }
        return f23419b;
    }

    /* renamed from: b */
    public IBinder m23721b() {
        if (f23418a == null) {
            f23418a = ServiceManager.getService("SwlNativeService");
        }
        IBinder iBinder = f23418a;
        if (iBinder == null || !iBinder.pingBinder()) {
            f23418a = ServiceManager.getService("SwlNativeService");
        }
        return f23418a;
    }
}
