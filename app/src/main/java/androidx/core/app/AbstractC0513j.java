package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* renamed from: androidx.core.app.j */
/* loaded from: classes.dex */
public abstract class AbstractC0513j {
    /* renamed from: a */
    public static Intent m2218a(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String m2220c = m2220c(activity);
        if (m2220c == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, m2220c);
        try {
            if (m2221d(activity, componentName) == null) {
                return Intent.makeMainActivity(componentName);
            }
            return new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + m2220c + "' in manifest");
            return null;
        }
    }

    /* renamed from: b */
    public static Intent m2219b(Context context, ComponentName componentName) {
        String m2221d = m2221d(context, componentName);
        if (m2221d == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), m2221d);
        if (m2221d(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    /* renamed from: c */
    public static String m2220c(Activity activity) {
        try {
            return m2221d(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* renamed from: d */
    public static String m2221d(Context context, ComponentName componentName) {
        int i10;
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            i10 = 269222528;
        } else if (i11 >= 24) {
            i10 = 787072;
        } else {
            i10 = 640;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i10);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }

    /* renamed from: e */
    public static void m2222e(Activity activity, Intent intent) {
        activity.navigateUpTo(intent);
    }

    /* renamed from: f */
    public static boolean m2223f(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }
}
