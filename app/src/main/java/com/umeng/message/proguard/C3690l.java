package com.umeng.message.proguard;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: com.umeng.message.proguard.l */
/* loaded from: classes3.dex */
final class C3690l {

    /* renamed from: a */
    final String f16534a;

    /* renamed from: b */
    final String f16535b;

    /* renamed from: c */
    final String f16536c;

    /* renamed from: d */
    final long f16537d;

    /* renamed from: e */
    final int f16538e;

    public C3690l(Object obj, Object obj2) {
        int i10;
        String str;
        PackageManager packageManager = (PackageManager) obj;
        PackageInfo packageInfo = (PackageInfo) obj2;
        this.f16534a = packageInfo.packageName;
        this.f16536c = packageInfo.versionName;
        this.f16537d = packageInfo.lastUpdateTime;
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if (applicationInfo == null) {
            i10 = -1;
        } else {
            int i11 = applicationInfo.flags;
            if ((i11 & 1) != 0 || (i11 & 128) != 0) {
                i10 = 0;
            } else {
                i10 = 1;
            }
        }
        this.f16538e = i10;
        try {
            str = String.valueOf(packageManager.getApplicationLabel(applicationInfo));
        } catch (Throwable unused) {
            str = "";
        }
        this.f16535b = str;
    }
}
