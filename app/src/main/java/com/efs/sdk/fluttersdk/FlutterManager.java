package com.efs.sdk.fluttersdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.util.Log;
import java.util.Map;

/* loaded from: classes.dex */
public class FlutterManager {
    public static final String TAG = "FlutterManager";

    /* renamed from: a */
    private static EfsReporter f7223a = null;

    /* renamed from: b */
    private static FlutterConfigManager f7224b = null;

    /* renamed from: c */
    private static Context f7225c = null;
    public static boolean isDebug = true;

    public static Map<String, Object> getCloudConfig() {
        FlutterConfigManager flutterConfigManager = f7224b;
        if (flutterConfigManager != null) {
            return flutterConfigManager.getCloudConfig();
        }
        return null;
    }

    public static FlutterConfigManager getFlutterConfigManager() {
        return f7224b;
    }

    public static long getLongValue(String str) {
        Context context = f7225c;
        if (context == null) {
            Log.m7726e(TAG, "Flutter Manager not init!");
            return 0L;
        }
        try {
            return context.getSharedPreferences("efs_flutter_bridge", 0).getLong(str, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static Map<String, Object> getNativeParams() {
        FlutterConfigManager flutterConfigManager = f7224b;
        if (flutterConfigManager != null) {
            return flutterConfigManager.getNativeParams();
        }
        return null;
    }

    public static EfsReporter getReporter() {
        return f7223a;
    }

    public static void init(Context context, EfsReporter efsReporter) {
        if (context == null || efsReporter == null) {
            Log.m7726e(TAG, "init Flutter manager error! parameter is null!");
            return;
        }
        f7225c = context;
        f7223a = efsReporter;
        f7224b = new FlutterConfigManager(context, efsReporter);
    }

    public static boolean putLongValue(String str, long j10) {
        Context context = f7225c;
        if (context == null) {
            Log.m7726e(TAG, "Flutter Manager not init!");
            return false;
        }
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("efs_flutter_bridge", 0).edit();
            edit.putLong(str, j10);
            edit.apply();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
