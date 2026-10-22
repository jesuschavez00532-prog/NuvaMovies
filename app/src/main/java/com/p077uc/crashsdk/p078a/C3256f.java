package com.p077uc.crashsdk.p078a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* renamed from: com.uc.crashsdk.a.f */
/* loaded from: classes3.dex */
public class C3256f {

    /* renamed from: a */
    static final /* synthetic */ boolean f13664a = true;

    /* renamed from: b */
    private static volatile HandlerThread f13665b;

    /* renamed from: c */
    private static volatile HandlerThread f13666c;

    /* renamed from: d */
    private static volatile HandlerThread f13667d;

    /* renamed from: e */
    private static Handler f13668e;

    /* renamed from: f */
    private static Handler f13669f;

    /* renamed from: g */
    private static Handler f13670g;

    /* renamed from: h */
    private static Handler f13671h;

    /* renamed from: i */
    private static final HashMap<Object, Object[]> f13672i = new HashMap<>();

    /* renamed from: a */
    public static Handler m13202a(int i10) {
        if (i10 == 0) {
            if (f13665b == null) {
                m13203a();
            }
            return f13668e;
        }
        if (i10 == 1) {
            if (f13666c == null) {
                m13208b();
            }
            return f13669f;
        }
        if (i10 == 2) {
            if (f13670g == null) {
                f13670g = new Handler(Looper.getMainLooper());
            }
            return f13670g;
        }
        if (i10 == 3) {
            if (f13671h == null) {
                m13210c();
            }
            return f13671h;
        }
        throw new RuntimeException("unknown thread type: " + i10);
    }

    /* renamed from: b */
    public static boolean m13209b(Runnable runnable) {
        Object[] objArr;
        if (runnable == null) {
            return false;
        }
        HashMap<Object, Object[]> hashMap = f13672i;
        synchronized (hashMap) {
            objArr = hashMap.get(runnable);
        }
        return objArr != null;
    }

    /* renamed from: c */
    private static synchronized void m13210c() {
        synchronized (C3256f.class) {
            if (f13667d == null) {
                HandlerThread handlerThread = new HandlerThread("CrashSDKAnrHandler", 0);
                f13667d = handlerThread;
                handlerThread.start();
                f13671h = new Handler(f13667d.getLooper());
            }
        }
    }

    /* renamed from: b */
    private static synchronized void m13208b() {
        synchronized (C3256f.class) {
            if (f13666c == null) {
                HandlerThread handlerThread = new HandlerThread("CrashSDKNormalHandler", 0);
                f13666c = handlerThread;
                handlerThread.start();
                f13669f = new Handler(f13666c.getLooper());
            }
        }
    }

    /* renamed from: a */
    public static boolean m13207a(int i10, Runnable runnable, long j10) {
        Handler m13202a;
        if (runnable == null || (m13202a = m13202a(i10)) == null) {
            return false;
        }
        RunnableC3255e runnableC3255e = new RunnableC3255e(10, new Object[]{runnable});
        HashMap<Object, Object[]> hashMap = f13672i;
        synchronized (hashMap) {
            hashMap.put(runnable, new Object[]{runnableC3255e, Integer.valueOf(i10)});
        }
        return m13202a.postDelayed(runnableC3255e, j10);
    }

    /* renamed from: a */
    public static void m13204a(int i10, Object[] objArr) {
        if (i10 != 10) {
            if (!f13664a) {
                throw new AssertionError();
            }
        } else {
            if (!f13664a && objArr == null) {
                throw new AssertionError();
            }
            Runnable runnable = (Runnable) objArr[0];
            HashMap<Object, Object[]> hashMap = f13672i;
            synchronized (hashMap) {
                if (hashMap.get(runnable) != null) {
                    hashMap.remove(runnable);
                }
            }
            runnable.run();
        }
    }

    /* renamed from: a */
    public static boolean m13206a(int i10, Runnable runnable) {
        return m13207a(i10, runnable, 0L);
    }

    /* renamed from: a */
    public static void m13205a(Runnable runnable) {
        Object[] objArr;
        Handler handler;
        if (runnable == null) {
            return;
        }
        HashMap<Object, Object[]> hashMap = f13672i;
        synchronized (hashMap) {
            objArr = hashMap.get(runnable);
        }
        if (objArr == null) {
            return;
        }
        int intValue = ((Integer) objArr[1]).intValue();
        if (intValue == 0) {
            handler = f13668e;
        } else if (intValue != 1) {
            handler = intValue != 2 ? null : f13670g;
        } else {
            handler = f13669f;
        }
        if (handler != null) {
            handler.removeCallbacks((Runnable) objArr[0]);
        }
        synchronized (hashMap) {
            if (hashMap.get(runnable) != null) {
                hashMap.remove(runnable);
            }
        }
    }

    /* renamed from: a */
    private static synchronized void m13203a() {
        synchronized (C3256f.class) {
            if (f13665b == null) {
                HandlerThread handlerThread = new HandlerThread("CrashSDKBkgdHandler", 10);
                f13665b = handlerThread;
                handlerThread.start();
                f13668e = new Handler(f13665b.getLooper());
            }
        }
    }
}
