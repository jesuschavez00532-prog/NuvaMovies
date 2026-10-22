package com.umeng.analytics.pro;

import android.os.Build;
import android.text.TextUtils;

/* renamed from: com.umeng.analytics.pro.at */
/* loaded from: classes3.dex */
public class C3298at {

    /* renamed from: a */
    private static String f14017a = "";

    /* renamed from: b */
    private static String f14018b = "";

    /* renamed from: c */
    private static final String f14019c = "hw_sc.build.platform.version";

    /* renamed from: d */
    private static final String f14020d = "ro.build.version.emui";

    /* renamed from: e */
    private static final String f14021e = "ro.build.version.magic";

    /* renamed from: f */
    private static final String f14022f = "ro.miui.ui.version.name";

    /* renamed from: g */
    private static final String f14023g = "ro.build.version.opporom";

    /* renamed from: h */
    private static final String f14024h = "ro.vivo.os.name";

    /* renamed from: i */
    private static final String f14025i = "ro.vivo.os.version";

    /* renamed from: j */
    private static final String f14026j = "ro.build.version.oplusrom";

    /* renamed from: k */
    private static final String f14027k = "ro.rom.version";

    /* renamed from: a */
    private static boolean m13800a() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return !TextUtils.isEmpty((String) cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]));
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static String m13801b(String str) {
        if (TextUtils.isEmpty(f14017a)) {
            m13804e(str);
        }
        return f14018b;
    }

    /* renamed from: c */
    public static String m13802c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.replaceAll(" ", "").toUpperCase();
    }

    /* renamed from: d */
    private static String m13803d(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static void m13804e(String str) {
        char c10;
        try {
            String m13802c = m13802c(str);
            switch (m13802c.hashCode()) {
                case -1881642058:
                    if (m13802c.equals("REALME")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1706170181:
                    if (m13802c.equals("XIAOMI")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -602397472:
                    if (m13802c.equals("ONEPLUS")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2432928:
                    if (m13802c.equals("OPPO")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2634924:
                    if (m13802c.equals("VIVO")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 68924490:
                    if (m13802c.equals("HONOR")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 77852109:
                    if (m13802c.equals("REDMI")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2141820391:
                    if (m13802c.equals("HUAWEI")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    if (m13800a()) {
                        f14018b = m13803d(f14019c);
                        f14017a = "HarmonyOS";
                        return;
                    } else {
                        f14017a = "EMUI";
                        f14018b = m13803d(f14020d);
                        return;
                    }
                case 1:
                    if (!TextUtils.isEmpty(m13803d(f14021e))) {
                        f14017a = "MagicUI";
                        f14018b = m13803d(f14021e);
                        return;
                    } else {
                        f14017a = "EMUI";
                        f14018b = m13803d(f14020d);
                        return;
                    }
                case 2:
                case 3:
                    f14017a = "MIUI";
                    f14018b = m13803d(f14022f);
                    return;
                case 4:
                case 5:
                    f14017a = "ColorOS";
                    f14018b = m13803d(f14023g);
                    return;
                case 6:
                    f14017a = "Funtouch";
                    f14018b = m13803d(f14025i);
                    return;
                case 7:
                    f14017a = "HydrogenOS";
                    String m13803d = m13803d(f14027k);
                    if (TextUtils.isEmpty(m13803d)) {
                        f14017a = "ColorOS";
                        m13803d = m13803d(f14026j);
                    }
                    f14018b = m13803d;
                    return;
                default:
                    f14017a = "Android";
                    f14018b = Build.VERSION.RELEASE;
                    return;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static String m13799a(String str) {
        if (TextUtils.isEmpty(f14017a)) {
            m13804e(str);
        }
        return f14017a;
    }
}
