package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: androidx.core.app.e */
/* loaded from: classes.dex */
abstract class AbstractC0503e {

    /* renamed from: a */
    protected static final Class f2193a;

    /* renamed from: b */
    protected static final Field f2194b;

    /* renamed from: c */
    protected static final Field f2195c;

    /* renamed from: d */
    protected static final Method f2196d;

    /* renamed from: e */
    protected static final Method f2197e;

    /* renamed from: f */
    protected static final Method f2198f;

    /* renamed from: g */
    private static final Handler f2199g = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.core.app.e$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ d f2200a;

        /* renamed from: b */
        final /* synthetic */ Object f2201b;

        a(d dVar, Object obj) {
            this.f2200a = dVar;
            this.f2201b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2200a.f2206a = this.f2201b;
        }
    }

    /* renamed from: androidx.core.app.e$b */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Application f2202a;

        /* renamed from: b */
        final /* synthetic */ d f2203b;

        b(Application application, d dVar) {
            this.f2202a = application;
            this.f2203b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2202a.unregisterActivityLifecycleCallbacks(this.f2203b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.e$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Object f2204a;

        /* renamed from: b */
        final /* synthetic */ Object f2205b;

        c(Object obj, Object obj2) {
            this.f2204a = obj;
            this.f2205b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = AbstractC0503e.f2196d;
                if (method != null) {
                    method.invoke(this.f2204a, this.f2205b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    AbstractC0503e.f2197e.invoke(this.f2204a, this.f2205b, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: androidx.core.app.e$d */
    /* loaded from: classes.dex */
    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        Object f2206a;

        /* renamed from: b */
        private Activity f2207b;

        /* renamed from: c */
        private final int f2208c;

        /* renamed from: d */
        private boolean f2209d = false;

        /* renamed from: e */
        private boolean f2210e = false;

        /* renamed from: f */
        private boolean f2211f = false;

        d(Activity activity) {
            this.f2207b = activity;
            this.f2208c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f2207b == activity) {
                this.f2207b = null;
                this.f2210e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (this.f2210e && !this.f2211f && !this.f2209d && AbstractC0503e.m2203h(this.f2206a, this.f2208c, activity)) {
                this.f2211f = true;
                this.f2206a = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f2207b == activity) {
                this.f2209d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class m2196a = m2196a();
        f2193a = m2196a;
        f2194b = m2197b();
        f2195c = m2201f();
        f2196d = m2199d(m2196a);
        f2197e = m2198c(m2196a);
        f2198f = m2200e(m2196a);
    }

    /* renamed from: a */
    private static Class m2196a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Field m2197b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m2198c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m2199d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Method m2200e(Class cls) {
        if (m2202g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    private static Field m2201f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m2202g() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 != 26 && i10 != 27) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    protected static boolean m2203h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f2195c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f2199g.postAtFrontOfQueue(new c(f2194b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static boolean m2204i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (m2202g() && f2198f == null) {
            return false;
        }
        if (f2197e == null && f2196d == null) {
            return false;
        }
        try {
            Object obj2 = f2195c.get(activity);
            if (obj2 == null || (obj = f2194b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            Handler handler = f2199g;
            handler.post(new a(dVar, obj2));
            try {
                if (m2202g()) {
                    Method method = f2198f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable th) {
                f2199g.post(new b(application, dVar));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
