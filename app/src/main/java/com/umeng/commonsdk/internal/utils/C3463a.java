package com.umeng.commonsdk.internal.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.utils.C3518b;
import java.io.File;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: com.umeng.commonsdk.internal.utils.a */
/* loaded from: classes3.dex */
public class C3463a {

    /* renamed from: com.umeng.commonsdk.internal.utils.a$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public String f15311a;

        /* renamed from: b */
        public String f15312b;
    }

    /* renamed from: a */
    public static long m14649a(Context context, String str) {
        if (context == null) {
            return 0L;
        }
        try {
            PackageInfo m15117a = C3518b.m15116a().m15117a(context, str, 64);
            if (m15117a != null) {
                return m15117a.firstInstallTime;
            }
            return 0L;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            ULog.m14795e("getAppFirstInstallTime" + th.getMessage());
            return 0L;
        }
    }

    /* renamed from: b */
    public static void m14653b(Context context) {
    }

    /* renamed from: c */
    public static String m14656c(Context context, String str) {
        try {
            return context.getPackageManager().getInstallerPackageName(str);
        } catch (Exception e10) {
            UMCrashManager.reportCrash(context, e10);
            ULog.m14795e("getAppInstaller:" + e10.getMessage());
            return null;
        }
    }

    /* renamed from: d */
    public static int m14658d(Context context, String str) {
        ApplicationInfo applicationInfo;
        if (context == null) {
            return 0;
        }
        try {
            PackageInfo m15117a = C3518b.m15116a().m15117a(context, str, 64);
            if (m15117a == null || (applicationInfo = m15117a.applicationInfo) == null) {
                return 0;
            }
            return applicationInfo.uid;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            ULog.m14795e("getAppUid:" + th.getMessage());
            return 0;
        }
    }

    /* renamed from: e */
    public static DisplayMetrics m14660e(Context context) {
        if (context == null) {
            return null;
        }
        return context.getResources().getDisplayMetrics();
    }

    /* renamed from: f */
    public static List<a> m14662f(Context context) {
        String[] list;
        if (context == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(Environment.getExternalStorageDirectory() + "/Android/data/");
            if (file.isDirectory() && (list = file.list()) != null && list.length > 0) {
                for (String str : list) {
                    if (str != null && !str.startsWith(".")) {
                        a aVar = new a();
                        aVar.f15311a = str;
                        aVar.f15312b = m14661e(context, str);
                        arrayList.add(aVar);
                    }
                }
            }
        } catch (Exception e10) {
            ULog.m14795e("getAppList:" + e10.getMessage());
        }
        return arrayList;
    }

    /* renamed from: g */
    public static ActivityManager.MemoryInfo m14663g(Context context) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    /* renamed from: h */
    public static String m14664h(Context context) {
        return null;
    }

    /* renamed from: i */
    public static String m14665i(Context context) {
        return null;
    }

    /* renamed from: b */
    public static long m14651b(Context context, String str) {
        if (context == null) {
            return 0L;
        }
        try {
            PackageInfo m15117a = C3518b.m15116a().m15117a(context, str, 64);
            if (m15117a != null) {
                return m15117a.lastUpdateTime;
            }
            return 0L;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            ULog.m14795e("getAppLastUpdateTime:" + th.getMessage());
            return 0L;
        }
    }

    /* renamed from: e */
    private static String m14661e(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                return (String) applicationInfo.loadLabel(context.getPackageManager());
            }
            return null;
        } catch (Exception e10) {
            ULog.m14795e("getLabel:" + e10.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public static int m14654c(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", DispatchConstants.ANDROID));
    }

    /* renamed from: a */
    public static boolean m14650a() {
        return C3470h.m14679a();
    }

    /* renamed from: a */
    public static float m14648a(Context context) {
        if (context == null) {
            return 0.0f;
        }
        Configuration configuration = new Configuration();
        try {
            configuration.updateFrom(context.getResources().getConfiguration());
            return configuration.fontScale;
        } catch (Exception e10) {
            ULog.m14795e("getFontSize:" + e10.getMessage());
            return 0.0f;
        }
    }

    /* renamed from: b */
    public static String m14652b() {
        return new SimpleDateFormat().format(new Date());
    }

    /* renamed from: d */
    public static int m14657d(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", DispatchConstants.ANDROID));
    }

    /* renamed from: c */
    public static long m14655c() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    /* renamed from: d */
    public static String m14659d() {
        try {
            Method declaredMethod = Build.class.getDeclaredMethod("getString", String.class);
            declaredMethod.setAccessible(true);
            String obj = declaredMethod.invoke(null, "net.hostname").toString();
            return (obj == null || obj.equalsIgnoreCase("")) ? obj : HelperUtils.getUmengMD5(obj);
        } catch (Exception e10) {
            ULog.m14795e("getHostName:" + e10.getMessage());
            return null;
        }
    }
}
