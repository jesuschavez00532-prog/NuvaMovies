package com.umeng.analytics.pro;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.umeng.commonsdk.debug.UMRTLog;
import java.util.ArrayList;

@TargetApi(14)
/* renamed from: com.umeng.analytics.pro.o */
/* loaded from: classes3.dex */
public class C3393o implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static C3393o f14816a = new C3393o();

    /* renamed from: b */
    private final int f14817b = 3000;

    /* renamed from: c */
    private boolean f14818c = false;

    /* renamed from: d */
    private boolean f14819d = true;

    /* renamed from: e */
    private Handler f14820e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    private ArrayList<InterfaceC3394p> f14821f = new ArrayList<>();

    /* renamed from: g */
    private a f14822g = new a();

    /* renamed from: com.umeng.analytics.pro.o$a */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C3393o.this.f14818c && C3393o.this.f14819d) {
                C3393o.this.f14818c = false;
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> went background.");
                for (int i10 = 0; i10 < C3393o.this.f14821f.size(); i10++) {
                    ((InterfaceC3394p) C3393o.this.f14821f.get(i10)).mo13684n();
                }
                return;
            }
            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> still foreground.");
        }
    }

    private C3393o() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f14819d = true;
        a aVar = this.f14822g;
        if (aVar != null) {
            this.f14820e.removeCallbacks(aVar);
            this.f14820e.postDelayed(this.f14822g, 3000L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f14819d = false;
        this.f14818c = true;
        a aVar = this.f14822g;
        if (aVar != null) {
            this.f14820e.removeCallbacks(aVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    /* renamed from: b */
    public synchronized void m14329b(InterfaceC3394p interfaceC3394p) {
        if (interfaceC3394p != null) {
            for (int i10 = 0; i10 < this.f14821f.size(); i10++) {
                if (this.f14821f.get(i10) == interfaceC3394p) {
                    this.f14821f.remove(i10);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m14323a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(f14816a);
        }
    }

    /* renamed from: a */
    public static C3393o m14322a() {
        return f14816a;
    }

    /* renamed from: a */
    public synchronized void m14328a(InterfaceC3394p interfaceC3394p) {
        if (interfaceC3394p != null) {
            this.f14821f.add(interfaceC3394p);
        }
    }
}
