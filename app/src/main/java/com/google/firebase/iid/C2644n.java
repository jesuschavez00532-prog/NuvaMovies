package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import p281p4.AbstractC6207k;
import p337t5.C6913d;

/* renamed from: com.google.firebase.iid.n */
/* loaded from: classes.dex */
public class C2644n {

    /* renamed from: a */
    private final Context f10114a;

    /* renamed from: b */
    private String f10115b;

    /* renamed from: c */
    private String f10116c;

    /* renamed from: d */
    private int f10117d;

    /* renamed from: e */
    private int f10118e = 0;

    public C2644n(Context context) {
        this.f10114a = context;
    }

    /* renamed from: c */
    public static String m10961c(C6913d c6913d) {
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
    private PackageInfo m10962f(String str) {
        try {
            return this.f10114a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
            sb2.append("Failed to find package ");
            sb2.append(valueOf);
            Log.w("FirebaseInstanceId", sb2.toString());
            return null;
        }
    }

    /* renamed from: h */
    private synchronized void m10963h() {
        PackageInfo m10962f = m10962f(this.f10114a.getPackageName());
        if (m10962f != null) {
            this.f10115b = Integer.toString(m10962f.versionCode);
            this.f10116c = m10962f.versionName;
        }
    }

    /* renamed from: a */
    public synchronized String m10964a() {
        if (this.f10115b == null) {
            m10963h();
        }
        return this.f10115b;
    }

    /* renamed from: b */
    public synchronized String m10965b() {
        if (this.f10116c == null) {
            m10963h();
        }
        return this.f10116c;
    }

    /* renamed from: d */
    public synchronized int m10966d() {
        PackageInfo m10962f;
        if (this.f10117d == 0 && (m10962f = m10962f("com.google.android.gms")) != null) {
            this.f10117d = m10962f.versionCode;
        }
        return this.f10117d;
    }

    /* renamed from: e */
    public synchronized int m10967e() {
        int i10 = this.f10118e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f10114a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (!AbstractC6207k.m24771h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f10118e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f10118e = 2;
            return 2;
        }
        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
        if (AbstractC6207k.m24771h()) {
            this.f10118e = 2;
            i11 = 2;
        } else {
            this.f10118e = 1;
        }
        return i11;
    }

    /* renamed from: g */
    public boolean m10968g() {
        if (m10967e() != 0) {
            return true;
        }
        return false;
    }
}
