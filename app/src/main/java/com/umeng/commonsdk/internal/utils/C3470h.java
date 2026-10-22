package com.umeng.commonsdk.internal.utils;

import android.os.Build;
import com.umeng.commonsdk.internal.utils.C3467e;
import java.io.File;

/* renamed from: com.umeng.commonsdk.internal.utils.h */
/* loaded from: classes3.dex */
public class C3470h {
    /* renamed from: a */
    public static boolean m14679a() {
        if (m14680b() || m14681c() || m14682d() || m14683e()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m14680b() {
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m14681c() {
        try {
            if (new File("/system/app/Superuser.apk").exists()) {
                return true;
            }
        } catch (Exception unused) {
        }
        try {
            if (new File("/system/app/Kinguser.apk").exists()) {
                return true;
            }
            return false;
        } catch (Exception unused2) {
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m14682d() {
        if (new C3467e().m14676a(C3467e.a.check_su_binary) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m14683e() {
        String[] strArr = {"/bin", "/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/", "/su/bin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
        for (int i10 = 0; i10 < 12; i10++) {
            if (new File(strArr[i10] + "su").exists()) {
                return true;
            }
        }
        return false;
    }
}
