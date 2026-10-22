package com.umeng.commonsdk.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.umeng.commonsdk.debug.UMRTLog;
import java.util.HashMap;

/* renamed from: com.umeng.commonsdk.utils.b */
/* loaded from: classes3.dex */
public class C3518b {

    /* renamed from: a */
    private static HashMap<String, PackageInfo> f15616a = new HashMap<>();

    /* renamed from: b */
    private static Object f15617b = new Object();

    /* renamed from: com.umeng.commonsdk.utils.b$a */
    /* loaded from: classes3.dex */
    private static class a {

        /* renamed from: a */
        private static final C3518b f15618a = new C3518b();

        private a() {
        }
    }

    /* renamed from: a */
    public static C3518b m15116a() {
        return a.f15618a;
    }

    private C3518b() {
    }

    /* renamed from: a */
    public PackageInfo m15117a(Context context, String str, int i10) {
        PackageInfo packageInfo;
        synchronized (f15617b) {
            if (f15616a.containsKey(str)) {
                UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> pkg： " + str + ", pkgInfo缓存命中，直接返回");
                packageInfo = f15616a.get(str);
            } else {
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(str, i10);
                    UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> pkg： " + str + ", 获取pkgInfo并缓存");
                    f15616a.put(str, packageInfo);
                } catch (PackageManager.NameNotFoundException unused) {
                    f15616a.put(str, null);
                    UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> pkg: " + str + "，目标包未安装。");
                    packageInfo = null;
                }
            }
        }
        return packageInfo;
    }
}
