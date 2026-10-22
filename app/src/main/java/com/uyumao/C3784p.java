package com.uyumao;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: com.uyumao.p */
/* loaded from: classes3.dex */
public class C3784p {

    /* renamed from: a */
    public final String f16980a;

    /* renamed from: b */
    public final String f16981b;

    /* renamed from: c */
    public final String f16982c;

    /* renamed from: d */
    public final long f16983d;

    /* renamed from: e */
    public final long f16984e;

    /* renamed from: f */
    public final int f16985f;

    public C3784p(Object obj, Object obj2) {
        String str;
        PackageManager packageManager = (PackageManager) obj;
        PackageInfo packageInfo = (PackageInfo) obj2;
        this.f16980a = packageInfo.packageName;
        this.f16982c = packageInfo.versionName;
        this.f16983d = packageInfo.firstInstallTime;
        this.f16984e = packageInfo.lastUpdateTime;
        this.f16985f = m16047a(packageInfo);
        try {
            str = String.valueOf(packageManager.getApplicationLabel(packageInfo.applicationInfo));
        } catch (Throwable unused) {
            str = "";
        }
        this.f16981b = str;
    }

    /* renamed from: a */
    public final int m16047a(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if (applicationInfo == null) {
            return -1;
        }
        int i10 = applicationInfo.flags;
        if ((i10 & 1) != 0 || (i10 & 128) != 0) {
            return 0;
        }
        return 1;
    }
}
