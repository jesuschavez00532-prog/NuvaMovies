package com.umeng.message.proguard;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.umeng.message.proguard.bz */
/* loaded from: classes3.dex */
public final class C3608bz {

    /* renamed from: b */
    private static final C3608bz f16111b = new C3608bz();

    /* renamed from: a */
    public boolean f16112a;

    /* renamed from: c */
    private WeakReference<Activity> f16113c;

    /* renamed from: d */
    private boolean f16114d;

    /* renamed from: e */
    private volatile a f16115e;

    /* renamed from: f */
    private final ComponentCallbacks2 f16116f = new ComponentCallbacks2() { // from class: com.umeng.message.proguard.bz.1
        @Override // android.content.ComponentCallbacks
        public final void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public final void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public final void onTrimMemory(int i10) {
            if (i10 == 20) {
                C3608bz.m15467a(C3608bz.this);
            }
        }
    };

    /* renamed from: g */
    private final Application.ActivityLifecycleCallbacks f16117g = new Application.ActivityLifecycleCallbacks() { // from class: com.umeng.message.proguard.bz.2
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            try {
                a aVar = C3608bz.this.f16115e;
                if (aVar != null) {
                    aVar.m15477d(activity);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            try {
                a aVar = C3608bz.this.f16115e;
                if (aVar != null && !aVar.f16120a.isEmpty()) {
                    Iterator<b> it = aVar.f16120a.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            try {
                C3608bz.this.f16113c = new WeakReference(activity);
                C3608bz.m15470c(C3608bz.this);
                a aVar = C3608bz.this.f16115e;
                if (aVar != null) {
                    aVar.m15476c(activity);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            try {
                a aVar = C3608bz.this.f16115e;
                if (aVar != null) {
                    aVar.m15474a(activity);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            try {
                a aVar = C3608bz.this.f16115e;
                if (aVar != null) {
                    aVar.m15475b(activity);
                }
            } catch (Throwable unused) {
            }
        }
    };

    /* renamed from: com.umeng.message.proguard.bz$b */
    /* loaded from: classes3.dex */
    public static abstract class b {
        /* renamed from: a */
        protected abstract String mo15478a();

        /* renamed from: a */
        protected void mo15479a(Activity activity) {
        }

        /* renamed from: b */
        protected void mo15480b(Activity activity) {
        }

        /* renamed from: c */
        protected void mo15481c(Activity activity) {
        }

        /* renamed from: d */
        protected void mo15482d(Activity activity) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && mo15478a().equals(((b) obj).mo15478a())) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return mo15478a().hashCode();
        }
    }

    private C3608bz() {
    }

    /* renamed from: c */
    private a m15469c() {
        if (this.f16115e == null) {
            synchronized (a.class) {
                if (this.f16115e == null) {
                    this.f16115e = new a((byte) 0);
                }
            }
        }
        return this.f16115e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.umeng.message.proguard.bz$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        final CopyOnWriteArraySet<b> f16120a;

        private a() {
            this.f16120a = new CopyOnWriteArraySet<>();
        }

        /* renamed from: a */
        protected final void m15474a(Activity activity) {
            if (this.f16120a.isEmpty()) {
                return;
            }
            Iterator<b> it = this.f16120a.iterator();
            while (it.hasNext()) {
                it.next().mo15479a(activity);
            }
        }

        /* renamed from: b */
        protected final void m15475b(Activity activity) {
            if (this.f16120a.isEmpty()) {
                return;
            }
            Iterator<b> it = this.f16120a.iterator();
            while (it.hasNext()) {
                it.next().mo15480b(activity);
            }
        }

        /* renamed from: c */
        protected final void m15476c(Activity activity) {
            if (this.f16120a.isEmpty()) {
                return;
            }
            Iterator<b> it = this.f16120a.iterator();
            while (it.hasNext()) {
                it.next().mo15481c(activity);
            }
        }

        /* renamed from: d */
        protected final void m15477d(Activity activity) {
            if (this.f16120a.isEmpty()) {
                return;
            }
            Iterator<b> it = this.f16120a.iterator();
            while (it.hasNext()) {
                it.next().mo15482d(activity);
            }
        }

        /* synthetic */ a(byte b10) {
            this();
        }
    }

    /* renamed from: a */
    public static void m15466a(Context context) {
        if (context != null) {
            C3608bz c3608bz = f16111b;
            Application application = (Application) context.getApplicationContext();
            synchronized (c3608bz) {
                if (application != null) {
                    if (!c3608bz.f16114d) {
                        application.registerActivityLifecycleCallbacks(c3608bz.f16117g);
                        application.registerComponentCallbacks(c3608bz.f16116f);
                        c3608bz.f16114d = true;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final Activity m15472b() {
        WeakReference<Activity> weakReference = this.f16113c;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: b */
    public final void m15473b(b bVar) {
        a m15469c = m15469c();
        if (bVar != null) {
            m15469c.f16120a.remove(bVar);
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m15470c(C3608bz c3608bz) {
        if (c3608bz.f16112a) {
            return;
        }
        c3608bz.f16112a = true;
    }

    /* renamed from: a */
    public static C3608bz m15464a() {
        return f16111b;
    }

    /* renamed from: a */
    public final void m15471a(b bVar) {
        a m15469c = m15469c();
        if (bVar != null) {
            m15469c.f16120a.add(bVar);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m15467a(C3608bz c3608bz) {
        if (c3608bz.f16112a) {
            c3608bz.f16112a = false;
        }
    }
}
