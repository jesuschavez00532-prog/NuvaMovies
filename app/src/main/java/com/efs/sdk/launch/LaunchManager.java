package com.efs.sdk.launch;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;

/* loaded from: classes.dex */
public class LaunchManager {
    public static final String APP_ATTACH_BASE_CONTEXT = "app_attachBaseContext";
    public static final String APP_CONSTRUCT = "app_<init>";
    public static final String APP_ON_CREATE = "app_onCreate";
    public static final String PAGE_ON_CREATE = "page_onCreate";
    public static final String PAGE_ON_RESUME = "page_onResume";
    public static final String PAGE_ON_RE_START = "page_onReStart";
    public static final String PAGE_ON_START = "page_onStart";
    public static final String PAGE_ON_STOP = "page_onStop";
    public static final String PAGE_ON_WINDOW = "page_on_window";

    /* renamed from: a */
    private static LaunchConfigManager f7246a = null;

    /* renamed from: b */
    private static Context f7247b = null;

    /* renamed from: c */
    private static EfsReporter f7248c = null;

    /* renamed from: d */
    private static boolean f7249d = false;
    public static boolean isDebug = true;

    public static LaunchConfigManager getLaunchConfigManager() {
        return f7246a;
    }

    public static EfsReporter getReporter() {
        return f7248c;
    }

    public static void init(Context context, final EfsReporter efsReporter) {
        if (context == null || efsReporter == null) {
            try {
                if (isDebug) {
                    Log.e("LaunchManager", "init launch manager error! parameter is null!");
                    return;
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        final Context applicationContext = context.getApplicationContext();
        if (!C1740c.m7807e(applicationContext)) {
            if (isDebug) {
                Log.e("LaunchManager", "Non main process !");
            }
        } else if (isInit()) {
            if (isDebug) {
                Log.e("LaunchManager", "invalid init ！");
            }
        } else {
            f7247b = context.getApplicationContext();
            f7248c = efsReporter;
            C1738a.m7794a(new Runnable() { // from class: com.efs.sdk.launch.LaunchManager.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        LaunchConfigManager unused = LaunchManager.f7246a = new LaunchConfigManager(applicationContext, efsReporter);
                        LaunchManager.m7792a();
                        C1739b.m7797a(applicationContext, (String) null);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            });
        }
    }

    public static boolean isInit() {
        return f7249d;
    }

    public static void onTraceApp(Application application, String str, boolean z10) {
        if (application != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (str.equals(APP_ATTACH_BASE_CONTEXT) || Looper.getMainLooper() == Looper.myLooper()) {
                        C1739b.m7799a(str, z10);
                        return;
                    } else {
                        if (isDebug) {
                            Log.e("LaunchManager", "Non main thread ！");
                            return;
                        }
                        return;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (isDebug) {
            Log.e("LaunchManager", "--->>> onTrace parameter is Illegal !");
        }
    }

    public static void onTraceBegin(Context context, String str, long j10) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    context.getApplicationContext();
                    if (Looper.getMainLooper() != Looper.myLooper()) {
                        if (isDebug) {
                            Log.e("LaunchManager", "Non main thread ！");
                            return;
                        }
                        return;
                    } else if (str.length() <= 10) {
                        C1739b.m7798a(str, j10);
                        return;
                    } else {
                        if (isDebug) {
                            Log.e("LaunchManager", "--->>> method name over length !");
                            return;
                        }
                        return;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (isDebug) {
            Log.e("LaunchManager", "--->>> onTraceBegin parameter is Illegal !");
        }
    }

    public static void onTraceEnd(Context context, String str, long j10) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    context.getApplicationContext();
                    if (Looper.getMainLooper() != Looper.myLooper()) {
                        if (isDebug) {
                            Log.e("LaunchManager", "Non main thread ！");
                            return;
                        }
                        return;
                    } else if (str.length() <= 10) {
                        C1739b.m7801b(str, j10);
                        return;
                    } else {
                        if (isDebug) {
                            Log.e("LaunchManager", "--->>> method name over length !");
                            return;
                        }
                        return;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (isDebug) {
            Log.e("LaunchManager", "--->>> onTraceBegin parameter is Illegal !");
        }
    }

    public static void onTracePage(Activity activity, String str, boolean z10) {
        if (activity != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    activity.getApplicationContext();
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        C1739b.m7795a(activity, str, z10);
                        return;
                    } else {
                        if (isDebug) {
                            Log.e("LaunchManager", "Non main thread ！");
                            return;
                        }
                        return;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (isDebug) {
            Log.e("LaunchManager", "--->>> onTrace parameter is Illegal !");
        }
    }

    public static void sendLaunchCache(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C1739b.m7797a(context, str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    static /* synthetic */ boolean m7792a() {
        f7249d = true;
        return true;
    }
}
