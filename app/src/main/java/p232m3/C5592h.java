package p232m3;

import android.app.AppOpsManager;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.view.Window;
import com.download.R$style;
import com.umeng.analytics.pro.C3384f;
import java.lang.reflect.Method;
import ne.AbstractC5868k;

/* renamed from: m3.h */
/* loaded from: classes.dex */
public final class C5592h {

    /* renamed from: a */
    public static final C5592h f22623a = new C5592h();

    private C5592h() {
    }

    /* renamed from: b */
    private final AppOpsManager m22703b(Context context) {
        Object systemService = context.getSystemService("appops");
        AbstractC5868k.m23672d(systemService, "null cannot be cast to non-null type android.app.AppOpsManager");
        return (AppOpsManager) systemService;
    }

    /* renamed from: f */
    private final boolean m22704f(String str, Context context) {
        int i10 = context.getApplicationInfo().uid;
        try {
            Class cls = Integer.TYPE;
            Method method = AppOpsManager.class.getMethod("checkOpNoThrow", cls, cls, String.class);
            Object obj = AppOpsManager.class.getDeclaredField(str).get(cls);
            AbstractC5868k.m23672d(obj, "null cannot be cast to non-null type kotlin.Int");
            Object invoke = method.invoke(m22703b(context), Integer.valueOf(((Integer) obj).intValue()), Integer.valueOf(i10), m22706c(context));
            AbstractC5868k.m23672d(invoke, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) invoke).intValue();
            if (intValue == 0 || intValue == 4 || intValue == 5) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: a */
    public final boolean m22705a(Context context) {
        boolean canDrawOverlays;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        if (Build.VERSION.SDK_INT >= 23) {
            if (m22708e(context) >= 23) {
                canDrawOverlays = Settings.canDrawOverlays(context);
                return canDrawOverlays;
            }
            return m22704f("OP_SYSTEM_ALERT_WINDOW", context);
        }
        return true;
    }

    /* renamed from: c */
    public final String m22706c(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        return context.getApplicationContext().getPackageName();
    }

    /* renamed from: d */
    public final AbstractC5586b m22707d(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        if (Build.VERSION.SDK_INT >= 23) {
            return new C5589e(context);
        }
        return new C5587c(context);
    }

    /* renamed from: e */
    public final int m22708e(Context context) {
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        return context.getApplicationInfo().targetSdkVersion;
    }

    /* renamed from: g */
    public final boolean m22709g(Context context) {
        Dialog dialog;
        Window window = null;
        if (context != null) {
            dialog = new Dialog(context, R$style.PermissionTransparent);
        } else {
            dialog = null;
        }
        if (dialog != null) {
            window = dialog.getWindow();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (window != null) {
                window.setType(2038);
            }
        } else if (window != null) {
            window.setType(2003);
        }
        boolean z10 = false;
        boolean z11 = true;
        if (dialog != null) {
            try {
                dialog.show();
            } catch (Exception unused) {
                if (!dialog.isShowing()) {
                    z11 = false;
                }
                if (z11) {
                    dialog.dismiss();
                }
                return false;
            } catch (Throwable th) {
                if (dialog.isShowing()) {
                    z10 = true;
                }
                if (z10) {
                    dialog.dismiss();
                }
                throw th;
            }
        }
        if (dialog != null && dialog.isShowing()) {
            z10 = true;
        }
        if (z10 && dialog != null) {
            dialog.dismiss();
        }
        return true;
    }
}
