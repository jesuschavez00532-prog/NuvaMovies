package com.umeng.message.proguard;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;

/* renamed from: com.umeng.message.proguard.ca */
/* loaded from: classes3.dex */
public final class C3611ca {

    /* renamed from: a */
    public static String f16122a;

    /* renamed from: b */
    public static String f16123b;

    /* renamed from: c */
    public static String f16124c;

    /* renamed from: d */
    private static String f16125d;

    /* renamed from: a */
    private static String m15489a(String str) {
        try {
            return (String) C3669ec.m15724a("android.os.SystemProperties", "get", new Class[]{String.class}, new Object[]{str});
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static String m15491b(Context context) {
        return DeviceConfig.getAndroidId(context);
    }

    /* renamed from: c */
    public static String m15493c(Context context) {
        return DeviceConfig.getOaid(context);
    }

    /* renamed from: d */
    public static String m15494d(Context context) {
        String uMId = UMUtils.getUMId(context);
        if (uMId == null) {
            return "";
        }
        return uMId;
    }

    /* renamed from: e */
    public static String m15495e(Context context) {
        return DeviceConfig.getImeiNew(context);
    }

    /* renamed from: f */
    public static String m15496f(Context context) {
        String imeiNew = DeviceConfig.getImeiNew(context);
        if (TextUtils.isEmpty(imeiNew)) {
            return null;
        }
        return UMUtils.MD5(imeiNew);
    }

    /* renamed from: a */
    public static String m15487a() {
        String str = f16125d;
        if (str != null) {
            return str;
        }
        if (!"vivo".equalsIgnoreCase(m15492c())) {
            f16125d = "";
            return "";
        }
        String m15489a = m15489a("ro.vivo.os.build.display.id");
        f16125d = m15489a;
        if (!TextUtils.isEmpty(m15489a)) {
            return f16125d;
        }
        String m15489a2 = m15489a("ro.iqoo.os.build.display.id");
        f16125d = m15489a2;
        if (!TextUtils.isEmpty(m15489a2)) {
            return f16125d;
        }
        f16125d = "";
        return "";
    }

    /* renamed from: b */
    public static String m15490b() {
        if (TextUtils.isEmpty(f16122a)) {
            f16122a = Build.MODEL;
        }
        return f16122a;
    }

    /* renamed from: c */
    public static String m15492c() {
        if (TextUtils.isEmpty(f16123b)) {
            String str = Build.BRAND;
            f16123b = str;
            if (TextUtils.isEmpty(str)) {
                f16123b = Build.MANUFACTURER;
            }
        }
        return f16123b;
    }

    /* renamed from: a */
    public static String m15488a(Context context) {
        return DeviceConfig.getIdfa(context);
    }
}
