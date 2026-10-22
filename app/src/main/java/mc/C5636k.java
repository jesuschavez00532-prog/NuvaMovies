package mc;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.lzy.okgo.cache.CacheEntity;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import me.InterfaceC5660l;
import nc.AbstractC5840d;
import ne.AbstractC5868k;

/* renamed from: mc.k */
/* loaded from: classes.dex */
public final class C5636k implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public static final C5636k f22705a = new C5636k();

    /* renamed from: b */
    private static HashMap f22706b = new HashMap();

    /* renamed from: c */
    private static boolean f22707c;

    private C5636k() {
    }

    /* renamed from: a */
    public final void m22866a(String str, InterfaceC5660l interfaceC5660l) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        f22706b.put(str, new WeakReference(interfaceC5660l));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        InterfaceC5660l interfaceC5660l;
        AbstractC5868k.m23674f(activity, "activity");
        if (!f22707c) {
            f22707c = true;
            AbstractC5840d.m23635b();
        }
        WeakReference weakReference = (WeakReference) f22706b.get(activity.getClass().getName());
        if (weakReference != null && (interfaceC5660l = (InterfaceC5660l) weakReference.get()) != null) {
            interfaceC5660l.mo542f(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        AbstractC5868k.m23674f(activity, "activity");
        f22706b.remove(activity.getClass().getName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC5868k.m23674f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        AbstractC5868k.m23674f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        AbstractC5868k.m23674f(activity, "activity");
        AbstractC5868k.m23674f(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC5868k.m23674f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC5868k.m23674f(activity, "activity");
    }
}
