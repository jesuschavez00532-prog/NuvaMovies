package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* renamed from: androidx.core.app.h */
/* loaded from: classes.dex */
public abstract class AbstractC0509h {

    /* renamed from: androidx.core.app.h$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static int m2213a(AppOpsManager appOpsManager, String str, int i10, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i10, str2);
        }

        /* renamed from: b */
        static String m2214b(Context context) {
            return context.getOpPackageName();
        }

        /* renamed from: c */
        static AppOpsManager m2215c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    /* renamed from: a */
    public static int m2210a(Context context, int i10, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager m2215c = a.m2215c(context);
            int m2213a = a.m2213a(m2215c, str, Binder.getCallingUid(), str2);
            if (m2213a != 0) {
                return m2213a;
            }
            return a.m2213a(m2215c, str, i10, a.m2214b(context));
        }
        return m2211b(context, str, str2);
    }

    /* renamed from: b */
    public static int m2211b(Context context, String str, String str2) {
        Object systemService;
        int noteProxyOpNoThrow;
        if (Build.VERSION.SDK_INT >= 23) {
            systemService = context.getSystemService((Class<Object>) AppOpsManager.class);
            noteProxyOpNoThrow = ((AppOpsManager) systemService).noteProxyOpNoThrow(str, str2);
            return noteProxyOpNoThrow;
        }
        return 1;
    }

    /* renamed from: c */
    public static String m2212c(String str) {
        String permissionToOp;
        if (Build.VERSION.SDK_INT >= 23) {
            permissionToOp = AppOpsManager.permissionToOp(str);
            return permissionToOp;
        }
        return null;
    }
}
