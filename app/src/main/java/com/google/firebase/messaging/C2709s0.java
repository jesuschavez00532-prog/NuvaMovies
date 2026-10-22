package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.firebase.messaging.s0 */
/* loaded from: classes.dex */
public class C2709s0 {

    /* renamed from: e */
    private static C2709s0 f10370e;

    /* renamed from: a */
    private String f10371a = null;

    /* renamed from: b */
    private Boolean f10372b = null;

    /* renamed from: c */
    private Boolean f10373c = null;

    /* renamed from: d */
    private final Queue f10374d = new ArrayDeque();

    private C2709s0() {
    }

    /* renamed from: a */
    private int m11310a(Context context, Intent intent) {
        ComponentName startService;
        String m11312f = m11312f(context, intent);
        if (m11312f != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + m11312f);
            }
            intent.setClassName(context.getPackageName(), m11312f);
        }
        try {
            if (m11315e(context)) {
                startService = AbstractC2674d1.m11172h(context, intent);
            } else {
                startService = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (startService == null) {
                Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                return 404;
            }
            return -1;
        } catch (IllegalStateException e10) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e10);
            return 402;
        } catch (SecurityException e11) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
            return 401;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static synchronized C2709s0 m11311b() {
        C2709s0 c2709s0;
        synchronized (C2709s0.class) {
            if (f10370e == null) {
                f10370e = new C2709s0();
            }
            c2709s0 = f10370e;
        }
        return c2709s0;
    }

    /* renamed from: f */
    private synchronized String m11312f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        String str2 = this.f10371a;
        if (str2 != null) {
            return str2;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
            if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                if (str.startsWith(".")) {
                    this.f10371a = context.getPackageName() + serviceInfo.name;
                } else {
                    this.f10371a = serviceInfo.name;
                }
                return this.f10371a;
            }
            Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + Operator.Operation.DIVISION + serviceInfo.name);
            return null;
        }
        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Intent m11313c() {
        return (Intent) this.f10374d.poll();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m11314d(Context context) {
        boolean z10;
        if (this.f10373c == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f10373c = Boolean.valueOf(z10);
        }
        if (!this.f10372b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f10373c.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m11315e(Context context) {
        boolean z10;
        if (this.f10372b == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f10372b = Boolean.valueOf(z10);
        }
        if (!this.f10372b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f10372b.booleanValue();
    }

    /* renamed from: g */
    public int m11316g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f10374d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return m11310a(context, intent2);
    }
}
