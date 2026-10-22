package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import p281p4.AbstractC6207k;
import p337t5.C6913d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.f0 */
/* loaded from: classes.dex */
public class C2679f0 {

    /* renamed from: a */
    private final Context f10291a;

    /* renamed from: b */
    private String f10292b;

    /* renamed from: c */
    private String f10293c;

    /* renamed from: d */
    private int f10294d;

    /* renamed from: e */
    private int f10295e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2679f0(Context context) {
        this.f10291a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m11207c(C6913d c6913d) {
        String m26882d = c6913d.m26869m().m26882d();
        if (m26882d != null) {
            return m26882d;
        }
        String m26881c = c6913d.m26869m().m26881c();
        if (!m26881c.startsWith("1:")) {
            return m26881c;
        }
        String[] split = m26881c.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: f */
    private PackageInfo m11208f(String str) {
        try {
            return this.f10291a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Failed to find package " + e10);
            return null;
        }
    }

    /* renamed from: h */
    private synchronized void m11209h() {
        PackageInfo m11208f = m11208f(this.f10291a.getPackageName());
        if (m11208f != null) {
            this.f10292b = Integer.toString(m11208f.versionCode);
            this.f10293c = m11208f.versionName;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized String m11210a() {
        if (this.f10292b == null) {
            m11209h();
        }
        return this.f10292b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized String m11211b() {
        if (this.f10293c == null) {
            m11209h();
        }
        return this.f10293c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized int m11212d() {
        PackageInfo m11208f;
        if (this.f10294d == 0 && (m11208f = m11208f("com.google.android.gms")) != null) {
            this.f10294d = m11208f.versionCode;
        }
        return this.f10294d;
    }

    /* renamed from: e */
    synchronized int m11213e() {
        int i10 = this.f10295e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f10291a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!AbstractC6207k.m24771h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f10295e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f10295e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (AbstractC6207k.m24771h()) {
            this.f10295e = 2;
        } else {
            this.f10295e = 1;
        }
        return this.f10295e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m11214g() {
        if (m11213e() != 0) {
            return true;
        }
        return false;
    }
}
