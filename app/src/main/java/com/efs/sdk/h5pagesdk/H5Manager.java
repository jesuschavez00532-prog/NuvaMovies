package com.efs.sdk.h5pagesdk;

import android.content.Context;
import android.view.View;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.integrationtesting.IntegrationTestingUtil;

/* loaded from: classes.dex */
public class H5Manager {
    public static final String TAG = "H5Manager";

    /* renamed from: g */
    private static EfsReporter f7233g = null;

    /* renamed from: h */
    private static H5ConfigMananger f7234h = null;
    public static boolean isDebug = true;

    public static H5ConfigMananger getH5ConfigMananger() {
        return f7234h;
    }

    public static EfsReporter getReporter() {
        return f7233g;
    }

    public static void init(Context context, EfsReporter efsReporter) {
        if (context != null && efsReporter != null) {
            f7233g = efsReporter;
            f7234h = new H5ConfigMananger(context, efsReporter);
        } else {
            Log.m7726e(TAG, "init H5 manager error! parameter is null!");
        }
    }

    public static void setWebView(View view) {
        H5ConfigMananger h5ConfigMananger;
        if (view != null && (h5ConfigMananger = f7234h) != null) {
            if (!h5ConfigMananger.isH5TracerEnable() && !IntegrationTestingUtil.isIntegrationTestingInPeriod()) {
                if (isDebug) {
                    Log.m7722d(TAG, "未注入JavascriptInterface：H5命中状态=" + f7234h.isH5TracerEnable() + "; 集成测试状态=" + IntegrationTestingUtil.isIntegrationTestingInPeriod());
                    return;
                }
                return;
            }
            UApmJSBridge uApmJSBridge = new UApmJSBridge();
            try {
                Class<?> cls = view.getClass();
                try {
                    Object invoke = cls.getMethod("getSettings", new Class[0]).invoke(view, new Object[0]);
                    if (invoke != null) {
                        invoke.getClass().getMethod("setJavaScriptEnabled", Boolean.TYPE).invoke(invoke, Boolean.TRUE);
                    }
                } catch (Throwable unused) {
                }
                cls.getMethod("addJavascriptInterface", Object.class, String.class).invoke(view, uApmJSBridge, "UAPM_JSBridge");
                return;
            } catch (Throwable unused2) {
                return;
            }
        }
        if (isDebug) {
            Log.m7726e(TAG, "webView为null，或H5功能未初始化完成");
        }
    }
}
