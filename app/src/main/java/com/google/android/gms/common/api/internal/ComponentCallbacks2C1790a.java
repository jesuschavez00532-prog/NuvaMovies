package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p281p4.AbstractC6207k;

/* renamed from: com.google.android.gms.common.api.internal.a */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C1790a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e */
    private static final ComponentCallbacks2C1790a f7533e = new ComponentCallbacks2C1790a();

    /* renamed from: a */
    private final AtomicBoolean f7534a = new AtomicBoolean();

    /* renamed from: b */
    private final AtomicBoolean f7535b = new AtomicBoolean();

    /* renamed from: c */
    private final ArrayList f7536c = new ArrayList();

    /* renamed from: d */
    private boolean f7537d = false;

    /* renamed from: com.google.android.gms.common.api.internal.a$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo7934a(boolean z10);
    }

    private ComponentCallbacks2C1790a() {
    }

    /* renamed from: b */
    public static ComponentCallbacks2C1790a m7928b() {
        return f7533e;
    }

    /* renamed from: c */
    public static void m7929c(Application application) {
        ComponentCallbacks2C1790a componentCallbacks2C1790a = f7533e;
        synchronized (componentCallbacks2C1790a) {
            if (!componentCallbacks2C1790a.f7537d) {
                application.registerActivityLifecycleCallbacks(componentCallbacks2C1790a);
                application.registerComponentCallbacks(componentCallbacks2C1790a);
                componentCallbacks2C1790a.f7537d = true;
            }
        }
    }

    /* renamed from: f */
    private final void m7930f(boolean z10) {
        synchronized (f7533e) {
            Iterator it = this.f7536c.iterator();
            while (it.hasNext()) {
                ((a) it.next()).mo7934a(z10);
            }
        }
    }

    /* renamed from: a */
    public void m7931a(a aVar) {
        synchronized (f7533e) {
            this.f7536c.add(aVar);
        }
    }

    /* renamed from: d */
    public boolean m7932d() {
        return this.f7534a.get();
    }

    /* renamed from: e */
    public boolean m7933e(boolean z10) {
        if (!this.f7535b.get()) {
            if (AbstractC6207k.m24765b()) {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                if (!this.f7535b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                    this.f7534a.set(true);
                }
            } else {
                return z10;
            }
        }
        return m7932d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f7534a.compareAndSet(true, false);
        this.f7535b.set(true);
        if (compareAndSet) {
            m7930f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f7534a.compareAndSet(true, false);
        this.f7535b.set(true);
        if (compareAndSet) {
            m7930f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f7534a.compareAndSet(false, true)) {
            this.f7535b.set(true);
            m7930f(true);
        }
    }
}
