package com.umeng.message.proguard;

import android.app.Application;
import android.content.Context;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.message.common.UPLog;

/* renamed from: com.umeng.message.proguard.y */
/* loaded from: classes3.dex */
public final class C3706y {

    /* renamed from: a */
    private static Application f16645a;

    /* renamed from: a */
    public static void m15841a(Context context) {
        if (f16645a != null || context == null) {
            return;
        }
        f16645a = (Application) context.getApplicationContext();
        C3702u.m15814a();
    }

    /* renamed from: a */
    public static Application m15840a() {
        Application application = f16645a;
        if (application != null) {
            return application;
        }
        try {
            Context appContext = UMGlobalContext.getAppContext();
            if (appContext != null) {
                Application application2 = (Application) appContext.getApplicationContext();
                f16645a = application2;
                if (application2 != null) {
                    return application2;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Application application3 = (Application) cls.getMethod("getApplication", new Class[0]).invoke(cls.getMethod("currentActivityThread", new Class[0]).invoke(cls, new Object[0]), new Object[0]);
            f16645a = application3;
            if (application3 != null) {
                return application3;
            }
        } catch (Exception unused2) {
        }
        UPLog.m15197e("Core", "context null! make sure PushAgent.setup(...) be called in Application.onCreate().");
        throw new IllegalStateException("context null! make sure PushAgent.setup(...) be called in Application.onCreate().");
    }
}
