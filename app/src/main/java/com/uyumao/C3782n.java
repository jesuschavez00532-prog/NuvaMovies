package com.uyumao;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.uyumao.n */
/* loaded from: classes3.dex */
public class C3782n {

    /* renamed from: a */
    public static String f16972a = null;

    /* renamed from: b */
    public static String f16973b = null;

    /* renamed from: c */
    public static String f16974c = null;

    /* renamed from: d */
    public static String f16975d = "";

    /* renamed from: a */
    public static String m16033a() {
        if (TextUtils.isEmpty(f16974c)) {
            f16974c = Build.BOARD;
        }
        return f16974c;
    }

    /* renamed from: b */
    public static String m16037b() {
        if (TextUtils.isEmpty(f16972a)) {
            String str = Build.BRAND;
            f16972a = str;
            if (TextUtils.isEmpty(str)) {
                f16972a = Build.MANUFACTURER;
            }
        }
        return f16972a;
    }

    /* renamed from: c */
    public static String m16039c() {
        if (TextUtils.isEmpty(f16973b)) {
            f16973b = Build.MODEL;
        }
        return f16973b;
    }

    /* renamed from: a */
    public static void m16035a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    public static boolean m16040c(Context context) {
        try {
            String m16038b = m16038b(context);
            String packageName = context.getApplicationContext().getPackageName();
            if (!TextUtils.isEmpty(m16038b) && !TextUtils.isEmpty(packageName)) {
                if (m16038b.equals(packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: a */
    public static Object m16032a(Object obj, String str, int i10) {
        try {
            return ((PackageManager) obj).getPackageInfo(str, i10);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m16038b(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (TextUtils.isEmpty(f16975d)) {
            try {
                String processName = Build.VERSION.SDK_INT >= 28 ? Application.getProcessName() : "";
                if (TextUtils.isEmpty(processName)) {
                    int myPid = Process.myPid();
                    String m16034a = m16034a(myPid);
                    if (!TextUtils.isEmpty(m16034a)) {
                        f16975d = m16034a;
                    } else {
                        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && runningAppProcesses.size() > 0) {
                            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                ActivityManager.RunningAppProcessInfo next = it.next();
                                if (next.pid == myPid) {
                                    f16975d = next.processName;
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    f16975d = processName;
                }
            } catch (Throwable unused) {
            }
        }
        return f16975d;
    }

    /* renamed from: a */
    public static String m16034a(int i10) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/" + i10 + "/cmdline"));
            try {
                String readLine = bufferedReader.readLine();
                if (!TextUtils.isEmpty(readLine)) {
                    readLine = readLine.trim();
                }
                try {
                    bufferedReader.close();
                } catch (Throwable unused) {
                }
                return readLine;
            } catch (Throwable unused2) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused3) {
                    }
                }
                return null;
            }
        } catch (Throwable unused4) {
            bufferedReader = null;
        }
    }

    /* renamed from: a */
    public static boolean m16036a(Context context) {
        return UMUtils.checkPermission(context, "android.permission.QUERY_ALL_PACKAGES");
    }
}
