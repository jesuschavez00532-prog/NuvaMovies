package p219l4;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: l4.h */
/* loaded from: classes.dex */
public abstract class AbstractC5373h {

    /* renamed from: a */
    private static int f21984a = 4225;

    /* renamed from: b */
    private static final Object f21985b = new Object();

    /* renamed from: c */
    private static C5378i1 f21986c;

    /* renamed from: d */
    static HandlerThread f21987d;

    /* renamed from: e */
    private static boolean f21988e;

    /* renamed from: a */
    public static int m21740a() {
        return f21984a;
    }

    /* renamed from: b */
    public static AbstractC5373h m21741b(Context context) {
        Looper mainLooper;
        synchronized (f21985b) {
            if (f21986c == null) {
                Context applicationContext = context.getApplicationContext();
                if (f21988e) {
                    mainLooper = m21742c().getLooper();
                } else {
                    mainLooper = context.getMainLooper();
                }
                f21986c = new C5378i1(applicationContext, mainLooper);
            }
        }
        return f21986c;
    }

    /* renamed from: c */
    public static HandlerThread m21742c() {
        synchronized (f21985b) {
            HandlerThread handlerThread = f21987d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f21987d = handlerThread2;
            handlerThread2.start();
            return f21987d;
        }
    }

    /* renamed from: d */
    protected abstract void mo21743d(C5363d1 c5363d1, ServiceConnection serviceConnection, String str);

    /* renamed from: e */
    public final void m21744e(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        mo21743d(new C5363d1(str, str2, i10, z10), serviceConnection, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo21745f(C5363d1 c5363d1, ServiceConnection serviceConnection, String str, Executor executor);
}
