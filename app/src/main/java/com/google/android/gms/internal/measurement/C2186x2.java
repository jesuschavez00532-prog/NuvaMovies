package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.x2 */
/* loaded from: classes.dex */
public final class C2186x2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    final /* synthetic */ C2201y2 f8251a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2186x2(C2201y2 c2201y2) {
        this.f8251a = c2201y2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f8251a.m9203l(new C2066p2(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f8251a.m9203l(new C2171w2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f8251a.m9203l(new C2111s2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f8251a.m9203l(new C2096r2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        BinderC1882d1 binderC1882d1 = new BinderC1882d1();
        this.f8251a.m9203l(new C2156v2(this, activity, binderC1882d1));
        Bundle m8201c = binderC1882d1.m8201c(50L);
        if (m8201c != null) {
            bundle.putAll(m8201c);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f8251a.m9203l(new C2081q2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f8251a.m9203l(new C2141u2(this, activity));
    }
}
