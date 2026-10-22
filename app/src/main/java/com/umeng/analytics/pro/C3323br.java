package com.umeng.analytics.pro;

import android.os.Build;
import android.text.TextUtils;
import com.umeng.message.api.UPushThirdTokenCallback;

@Deprecated
/* renamed from: com.umeng.analytics.pro.br */
/* loaded from: classes3.dex */
public class C3323br {

    /* renamed from: a */
    private static final String f14152a = "ro.build.version.emui";

    /* renamed from: b */
    private static final String f14153b = "hw_sc.build.platform.version";

    /* renamed from: a */
    public static boolean m13888a() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return !TextUtils.isEmpty((String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.build.flyme.version", ""));
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m13889b() {
        if (m13891d() && !m13894g()) {
            return true;
        }
        return false;
    }

    @Deprecated
    /* renamed from: c */
    public static boolean m13890c() {
        if (m13891d() && m13894g()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m13891d() {
        return Build.MANUFACTURER.equalsIgnoreCase("HONOR");
    }

    /* renamed from: e */
    public static boolean m13892e() {
        String str = Build.BRAND;
        if (!str.equalsIgnoreCase("huawei") && !str.equalsIgnoreCase(UPushThirdTokenCallback.TYPE_HONOR) && !str.equalsIgnoreCase("华为")) {
            String m13887a = m13887a(f14152a);
            String m13887a2 = m13887a(f14153b);
            if (TextUtils.isEmpty(m13887a) && TextUtils.isEmpty(m13887a2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m13893f() {
        if (!TextUtils.isEmpty(m13887a("ro.coolos.version"))) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private static boolean m13894g() {
        if (!TextUtils.isEmpty(m13887a(f14152a))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static String m13887a(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
        } catch (Throwable unused) {
            return "";
        }
    }
}
