package p336t4;

import android.os.Looper;
import android.util.Log;

/* renamed from: t4.b */
/* loaded from: classes.dex */
public abstract class AbstractC6907b {

    /* renamed from: a */
    private static volatile ClassLoader f26231a;

    /* renamed from: b */
    private static volatile Thread f26232b;

    /* renamed from: a */
    public static synchronized ClassLoader m26845a() {
        ClassLoader classLoader;
        synchronized (AbstractC6907b.class) {
            if (f26231a == null) {
                f26231a = m26846b();
            }
            classLoader = f26231a;
        }
        return classLoader;
    }

    /* renamed from: b */
    private static synchronized ClassLoader m26846b() {
        synchronized (AbstractC6907b.class) {
            ClassLoader classLoader = null;
            if (f26232b == null) {
                f26232b = m26847c();
                if (f26232b == null) {
                    return null;
                }
            }
            synchronized (f26232b) {
                try {
                    classLoader = f26232b.getContextClassLoader();
                } catch (SecurityException e10) {
                    Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e10.getMessage());
                }
            }
            return classLoader;
        }
    }

    /* renamed from: c */
    private static synchronized Thread m26847c() {
        SecurityException e10 = null;
        Thread thread = null;
        Thread thread2 = null;
        ThreadGroup threadGroup = null;
        synchronized (AbstractC6907b.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 < activeGroupCount) {
                            threadGroup = threadGroupArr[i11];
                            if ("dynamiteLoader".equals(threadGroup.getName())) {
                                break;
                            }
                            i11++;
                        } else {
                            threadGroup = null;
                            break;
                        }
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i10 < activeCount) {
                            thread2 = threadArr[i10];
                            if ("GmsDynamite".equals(thread2.getName())) {
                                break;
                            }
                            i10++;
                        } else {
                            thread2 = null;
                            break;
                        }
                    }
                } catch (SecurityException e11) {
                    e10 = e11;
                    thread = null;
                }
                if (thread2 == null) {
                    try {
                        thread = new C6906a(threadGroup, "GmsDynamite");
                        try {
                            thread.setContextClassLoader(null);
                            thread.start();
                        } catch (SecurityException e12) {
                            e10 = e12;
                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e10.getMessage());
                            thread2 = thread;
                            return thread2;
                        }
                    } catch (SecurityException e13) {
                        e10 = e13;
                        thread = thread2;
                    }
                    thread2 = thread;
                }
            }
            return thread2;
        }
    }
}
