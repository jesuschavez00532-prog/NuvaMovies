package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executor;
import p127f5.AbstractC4245i;
import p127f5.AbstractC4250l;
import p127f5.C4247j;
import p281p4.AbstractC6207k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.l0 */
/* loaded from: classes.dex */
public abstract class AbstractC2695l0 {
    /* renamed from: b */
    private static boolean m11269b(Context context) {
        if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m11270c(Context context) {
        if (AbstractC2697m0.m11275b(context)) {
            return;
        }
        m11272e(new ExecutorC2681g(), context, m11273f(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m11271d(Context context, boolean z10, C4247j c4247j) {
        Object systemService;
        String notificationDelegate;
        try {
            if (!m11269b(context)) {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                return;
            }
            AbstractC2697m0.m11276c(context, true);
            systemService = context.getSystemService((Class<Object>) NotificationManager.class);
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (z10) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else {
                notificationDelegate = notificationManager.getNotificationDelegate();
                if ("com.google.android.gms".equals(notificationDelegate)) {
                    notificationManager.setNotificationDelegate(null);
                }
            }
        } finally {
            c4247j.m17728e(null);
        }
    }

    /* renamed from: e */
    static AbstractC4245i m11272e(Executor executor, final Context context, final boolean z10) {
        if (!AbstractC6207k.m24773j()) {
            return AbstractC4250l.m17733e(null);
        }
        final C4247j c4247j = new C4247j();
        executor.execute(new Runnable() { // from class: com.google.firebase.messaging.k0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2695l0.m11271d(context, z10, c4247j);
            }
        });
        return c4247j.m17724a();
    }

    /* renamed from: f */
    private static boolean m11273f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
