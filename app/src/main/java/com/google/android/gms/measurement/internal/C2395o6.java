package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import anet.channel.entity.ConnType;
import p025b5.AbstractC1124v;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.o6 */
/* loaded from: classes.dex */
public final class C2395o6 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    final /* synthetic */ C2406p6 f8897a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2395o6(C2406p6 c2406p6, AbstractC1124v abstractC1124v) {
        this.f8897a = c2406p6;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C2415q4 c2415q4;
        boolean z10;
        String str;
        try {
            try {
                this.f8897a.f8714a.mo9577b().m9804v().m9699a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    c2415q4 = this.f8897a.f8714a;
                } else {
                    Uri data = intent.getData();
                    if (data != null && data.isHierarchical()) {
                        this.f8897a.f8714a.m10031N();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        boolean z11 = true;
                        if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) && !"https://www.google.com".equals(stringExtra) && !"android-app://com.google.appcrawler".equals(stringExtra)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (true != z10) {
                            str = ConnType.PK_AUTO;
                        } else {
                            str = "gs";
                        }
                        String str2 = str;
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle != null) {
                            z11 = false;
                        }
                        this.f8897a.f8714a.mo9575a().m9897z(new RunnableC2384n6(this, z11, data, str2, queryParameter));
                        c2415q4 = this.f8897a.f8714a;
                    }
                    c2415q4 = this.f8897a.f8714a;
                }
            } catch (RuntimeException e10) {
                this.f8897a.f8714a.mo9577b().m9800r().m9700b("Throwable caught in onActivityCreated", e10);
                c2415q4 = this.f8897a.f8714a;
            }
            c2415q4.m10028K().m9476y(activity, bundle);
        } catch (Throwable th) {
            this.f8897a.f8714a.m10028K().m9476y(activity, bundle);
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f8897a.f8714a.m10028K().m9477z(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f8897a.f8714a.m10028K().m9467A(activity);
        C2430r8 m10030M = this.f8897a.f8714a.m10030M();
        m10030M.f8714a.mo9575a().m9897z(new RunnableC2353k8(m10030M, m10030M.f8714a.mo9578c().mo24748b()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C2430r8 m10030M = this.f8897a.f8714a.m10030M();
        m10030M.f8714a.mo9575a().m9897z(new RunnableC2342j8(m10030M, m10030M.f8714a.mo9578c().mo24748b()));
        this.f8897a.f8714a.m10028K().m9468B(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f8897a.f8714a.m10028K().m9469C(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
