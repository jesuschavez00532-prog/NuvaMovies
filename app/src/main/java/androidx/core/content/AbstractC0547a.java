package androidx.core.content;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;
import p254o.AbstractC5894i;
import p373w.AbstractC7338c;

/* renamed from: androidx.core.content.a */
/* loaded from: classes.dex */
public abstract class AbstractC0547a {

    /* renamed from: a */
    private static final Object f2292a = new Object();

    /* renamed from: b */
    private static final Object f2293b = new Object();

    /* renamed from: androidx.core.content.a$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static void m2330a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* renamed from: b */
        static void m2331b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* renamed from: androidx.core.content.a$b */
    /* loaded from: classes.dex */
    static class b {
        /* renamed from: a */
        static File[] m2332a(Context context) {
            return context.getExternalCacheDirs();
        }

        /* renamed from: b */
        static File[] m2333b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        /* renamed from: c */
        static File[] m2334c(Context context) {
            return context.getObbDirs();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.a$c */
    /* loaded from: classes.dex */
    public static class c {
        /* renamed from: a */
        static File m2335a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        static Drawable m2336b(Context context, int i10) {
            return context.getDrawable(i10);
        }

        /* renamed from: c */
        static File m2337c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* renamed from: androidx.core.content.a$d */
    /* loaded from: classes.dex */
    static class d {
        /* renamed from: a */
        static int m2338a(Context context, int i10) {
            return context.getColor(i10);
        }

        /* renamed from: b */
        static <T> T m2339b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* renamed from: c */
        static String m2340c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* renamed from: androidx.core.content.a$e */
    /* loaded from: classes.dex */
    static class e {
        /* renamed from: a */
        static Context m2341a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        /* renamed from: b */
        static File m2342b(Context context) {
            return context.getDataDir();
        }

        /* renamed from: c */
        static boolean m2343c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* renamed from: a */
    public static int m2319a(Context context, String str) {
        AbstractC7338c.m28319c(str, "permission must be non-null");
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    /* renamed from: b */
    public static Context m2320b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.m2341a(context);
        }
        return null;
    }

    /* renamed from: c */
    private static File m2321c(File file) {
        synchronized (f2293b) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                Log.w("ContextCompat", "Unable to create files subdir " + file.getPath());
            }
            return file;
        }
    }

    /* renamed from: d */
    public static int m2322d(Context context, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            return d.m2338a(context, i10);
        }
        return context.getResources().getColor(i10);
    }

    /* renamed from: e */
    public static ColorStateList m2323e(Context context, int i10) {
        return AbstractC5894i.m23795c(context.getResources(), i10, context.getTheme());
    }

    /* renamed from: f */
    public static Drawable m2324f(Context context, int i10) {
        if (Build.VERSION.SDK_INT >= 21) {
            return c.m2336b(context, i10);
        }
        return context.getResources().getDrawable(i10);
    }

    /* renamed from: g */
    public static File[] m2325g(Context context) {
        return b.m2332a(context);
    }

    /* renamed from: h */
    public static File[] m2326h(Context context, String str) {
        return b.m2333b(context, str);
    }

    /* renamed from: i */
    public static File m2327i(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return c.m2337c(context);
        }
        return m2321c(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    /* renamed from: j */
    public static boolean m2328j(Context context, Intent[] intentArr, Bundle bundle) {
        a.m2330a(context, intentArr, bundle);
        return true;
    }

    /* renamed from: k */
    public static void m2329k(Context context, Intent intent, Bundle bundle) {
        a.m2331b(context, intent, bundle);
    }
}
