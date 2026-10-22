package p201k2;

import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import p170i2.C4842a;
import p194jb.AbstractC5047b;

/* renamed from: k2.b */
/* loaded from: classes.dex */
public abstract class AbstractC5085b {

    /* renamed from: a */
    private static String f20940a = "";

    /* renamed from: b */
    private static String f20941b = "";

    /* renamed from: c */
    private static StringBuilder f20942c = new StringBuilder();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable, java.lang.Exception] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0033 -> B:9:0x0042). Please report as a decompilation issue!!! */
    /* renamed from: a */
    public static void m20591a() {
        boolean z10 = !TextUtils.isEmpty(C5096m.f20979a.m20690a());
        if (Build.VERSION.SDK_INT == 19 && z10) {
            Process process = null;
            process = null;
            try {
                try {
                    try {
                        process = Runtime.getRuntime().exec("setprop sys.subtitleService.disable false");
                        process.waitFor();
                        process.destroy();
                        process = process;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        process = process;
                        if (process != null) {
                            process.destroy();
                            process = process;
                        }
                    }
                } catch (Throwable th) {
                    if (process != null) {
                        try {
                            process.destroy();
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e12) {
                e12.printStackTrace();
                process = e12;
            }
        }
    }

    /* renamed from: b */
    public static int m20592b(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: c */
    public static String m20593c(String str) {
        return (m20599i(str) + AbstractC5084a.m20589a(str)).trim();
    }

    /* renamed from: d */
    public static String m20594d() {
        return f20941b;
    }

    /* renamed from: e */
    public static String m20595e() {
        return C4842a.f20329a.m19920a().mo19958g();
    }

    /* renamed from: f */
    public static String m20596f() {
        try {
            Process exec = Runtime.getRuntime().exec("cat /proc/version");
            if (exec == null) {
                return "unknown";
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()), 8192);
            String str = "";
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                str = str + readLine;
            }
            if (str == "") {
                return "";
            }
            String substring = str.substring(str.indexOf("version ") + 8);
            return substring.substring(0, substring.indexOf(" "));
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: g */
    public static String m20597g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        String str = "";
        try {
            if (context.getPackageName() != null && (applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null) {
                str = bundle.getString("PORTAL_KEY");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return AbstractC5047b.m20499a(str, "*&@!6d5d-c483-4720-bb29-785b8f321c^%");
    }

    /* renamed from: h */
    public static String m20598h(Context context) {
        return context.getApplicationContext().getPackageName();
    }

    /* renamed from: i */
    public static String m20599i(String str) {
        return AbstractC5092i.m20666a(str + "ntFT65w6itH!lHCPw7D=@qnsFC5adD28");
    }

    /* renamed from: j */
    public static String m20600j(Context context) {
        String str;
        if (Build.VERSION.SDK_INT >= 28) {
            str = Application.getProcessName();
        } else {
            str = null;
        }
        if (str == null) {
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                str = (String) declaredMethod.invoke(null, new Object[0]);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        if (str == null) {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return null;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return str;
        }
        return str;
    }

    /* renamed from: k */
    public static String m20601k() {
        if (!TextUtils.isEmpty(f20940a)) {
            return f20940a;
        }
        try {
            if (!Locale.getDefault().getLanguage().equals("ar")) {
                long j10 = Build.TIME;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
                String format = simpleDateFormat.format(new Date(j10));
                f20940a = format;
                if (TextUtils.isEmpty(format)) {
                    f20940a = Build.DISPLAY;
                }
                f20940a += "_";
            }
            String str = f20940a + Build.VERSION.SDK_INT + "_" + Build.VERSION.RELEASE + "_" + m20596f();
            f20940a = str;
            return str;
        } catch (Exception e10) {
            e10.printStackTrace();
            if (TextUtils.isEmpty(f20940a)) {
                f20940a = "unknown";
            }
            return f20940a;
        }
    }

    /* renamed from: l */
    public static int m20602l(Context context) {
        return C4842a.f20329a.m19921b().mo19986i();
    }

    /* renamed from: m */
    public static String m20603m(Context context) {
        return C4842a.f20329a.m19921b().mo19979b();
    }

    /* renamed from: n */
    public static boolean m20604n() {
        return false;
    }

    /* renamed from: o */
    public static boolean m20605o(Context context) {
        if (context.getPackageName().equals(m20600j(context))) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static int m20606p(Context context, String str) {
        try {
            Bundle bundle = context.getPackageManager().getActivityInfo(new ComponentName(context, context.getClass()), 128).metaData;
            if (bundle != null) {
                return bundle.getInt(str);
            }
            return 0;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    /* renamed from: q */
    public static void m20607q(String str) {
        if (!TextUtils.isEmpty(str)) {
            f20941b = str;
        }
    }
}
