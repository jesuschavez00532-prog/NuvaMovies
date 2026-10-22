package com.umeng.pagesdk;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import com.efs.sdk.base.EfsReporter;

/* loaded from: classes3.dex */
public class PageManger {
    public static final String TAG = "PageManger";

    /* renamed from: a */
    private static Context f16689a = null;

    /* renamed from: b */
    private static boolean f16690b = false;

    /* renamed from: c */
    private static EfsReporter f16691c = null;

    /* renamed from: d */
    private static PageConfigManger f16692d = null;

    /* renamed from: e */
    private static boolean f16693e = true;

    /* renamed from: f */
    private static float f16694f = 0.0f;
    public static boolean isDebug = true;

    public static Context getApplicationContext() {
        return f16689a;
    }

    public static PageConfigManger getPageConfigManger() {
        return f16692d;
    }

    public static float getRefreshRate() {
        return f16694f;
    }

    public static EfsReporter getReporter() {
        return f16691c;
    }

    public static void init(Context context, EfsReporter efsReporter) {
        if (context == null || efsReporter == null) {
            try {
                if (isDebug) {
                    Log.e(TAG, "init page manager error! parameter is null!");
                    return;
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (isInit()) {
            if (isDebug) {
                Log.e(TAG, "invalid init ！");
            }
        } else {
            f16689a = context.getApplicationContext();
            f16691c = efsReporter;
            f16692d = new PageConfigManger(context, efsReporter);
            f16690b = true;
        }
    }

    public static boolean isControlMainThread() {
        return f16693e;
    }

    public static boolean isInit() {
        return f16690b;
    }

    public static void onTracePageBegin(Activity activity, String str) {
        try {
            onTracePageBegin(activity, str, false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void onTracePageEnd(Activity activity, String str) {
        try {
            onTracePageEnd(activity, str, false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void setControlMainThread(boolean z10) {
        f16693e = z10;
    }

    public static void onTracePageBegin(Activity activity, String str, boolean z10) {
        float refreshRate;
        Display display;
        if (activity != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (!z10 && (str.equals("onCreate") || str.equals("onStart") || str.equals("onResume") || str.equals("onPause"))) {
                        if (isDebug) {
                            Log.e(TAG, "tracePageBegin. parameter illegality!");
                            return;
                        }
                        return;
                    }
                    if (str.length() > 10) {
                        if (isDebug) {
                            Log.e(TAG, "tracePageBegin. method name is " + str + "method name over length !");
                            return;
                        }
                        return;
                    }
                    if (f16693e && !C3717e.m15878a(activity.getApplicationContext()) && isDebug) {
                        Log.e(TAG, "tracePageBegin. Non main process !");
                    }
                    String name = activity.getClass().getName();
                    if (f16694f <= 0.0f) {
                        if (Build.VERSION.SDK_INT >= 30) {
                            display = activity.getDisplay();
                            refreshRate = display.getRefreshRate();
                        } else {
                            refreshRate = activity.getWindowManager().getDefaultDisplay().getRefreshRate();
                        }
                        f16694f = refreshRate;
                    }
                    C3716d.m15876a(name, str, z10);
                    return;
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (isDebug) {
            Log.e(TAG, "tracePageBegin. parameter null!");
        }
    }

    public static void onTracePageEnd(Activity activity, String str, boolean z10) {
        if (activity != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (!z10 && (str.equals("onCreate") || str.equals("onStart") || str.equals("onResume") || str.equals("onPause"))) {
                        if (isDebug) {
                            Log.e(TAG, "tracePageEnd. parameter illegality!");
                            return;
                        }
                        return;
                    } else {
                        if (str.length() <= 10) {
                            if (f16693e && !C3717e.m15878a(activity.getApplicationContext()) && isDebug) {
                                Log.e(TAG, "tracePageBegin. Non main process !");
                            }
                            C3716d.m15877b(activity.getClass().getName(), str, z10);
                            return;
                        }
                        if (isDebug) {
                            Log.e(TAG, "tracePageEnd. method name is " + str + "method name over length !");
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
            Log.e(TAG, "tracePageEnd. parameter null!");
        }
    }
}
