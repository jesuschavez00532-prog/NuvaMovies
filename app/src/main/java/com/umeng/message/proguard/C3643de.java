package com.umeng.message.proguard;

import android.app.Application;
import android.content.Context;
import com.umeng.analytics.pro.C3325bt;

/* renamed from: com.umeng.message.proguard.de */
/* loaded from: classes3.dex */
public final class C3643de {

    /* renamed from: a */
    private static Application f16303a;

    /* renamed from: a */
    public static void m15639a(Context context) {
        if (context != null) {
            if (f16303a == null) {
                f16303a = (Application) context.getApplicationContext();
                C3663dy.m15710a(C3325bt.f14196aN, "2.0.0");
                C3608bz.m15466a(context);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("context can't be null");
    }

    /* renamed from: a */
    public static Context m15638a() {
        Application application = f16303a;
        if (application != null) {
            return application;
        }
        throw new IllegalStateException("context is null! make sure UMUnionSdk.init(...) be called");
    }
}
