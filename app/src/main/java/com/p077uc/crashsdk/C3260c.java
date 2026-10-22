package com.p077uc.crashsdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.p077uc.crashsdk.p078a.C3251a;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.uc.crashsdk.c */
/* loaded from: classes3.dex */
public final class C3260c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private boolean f13764a = false;

    /* renamed from: b */
    private boolean f13765b = false;

    /* renamed from: a */
    private void m13370a(Activity activity, int i10) {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        if (1 == i10) {
            String unused = C3259b.f13731ad = activity.getComponentName().flattenToShortString();
        } else {
            String unused2 = C3259b.f13731ad = "";
        }
        C3259b.m13299D();
        if (C3264g.m13567M()) {
            C3259b.m13310O();
            weakHashMap = C3259b.f13729ab;
            synchronized (weakHashMap) {
                weakHashMap2 = C3259b.f13729ab;
                weakHashMap2.put(activity, Integer.valueOf(i10));
                m13369a(i10);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m13370a(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        if (C3264g.m13567M()) {
            C3259b.m13310O();
            weakHashMap = C3259b.f13729ab;
            synchronized (weakHashMap) {
                weakHashMap2 = C3259b.f13729ab;
                weakHashMap2.remove(activity);
                m13369a(2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m13370a(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m13370a(activity, 1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m13370a(activity, 1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m13370a(activity, 2);
    }

    /* renamed from: a */
    private void m13369a(int i10) {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        if (C3262e.m13506u()) {
            C3251a.m13168a("crashsdk", "[LifeCycle] ignore state change while crashing");
            return;
        }
        boolean z10 = true;
        boolean z11 = 1 == i10;
        if (!z11) {
            weakHashMap2 = C3259b.f13729ab;
            Iterator it = weakHashMap2.entrySet().iterator();
            while (it.hasNext()) {
                Object value = ((Map.Entry) it.next()).getValue();
                if (value != null && ((Integer) value).intValue() == 1) {
                    break;
                }
            }
        }
        z10 = z11;
        if (this.f13764a != z10) {
            C3259b.m13339b(z10);
            this.f13764a = z10;
        }
        weakHashMap = C3259b.f13729ab;
        boolean isEmpty = weakHashMap.isEmpty();
        if (this.f13765b != isEmpty) {
            if (isEmpty) {
                C3259b.m13365w();
            }
            this.f13765b = isEmpty;
        }
    }
}
