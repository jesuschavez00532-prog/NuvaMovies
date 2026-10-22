package com.umeng.umcrash.customlog;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.lzy.okgo.model.Progress;
import com.umeng.umcrash.UMCrashUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class UAPMCustomLogManager {
    private static final int MAX_CACHE_SIZE = 100;
    private static final int MAX_MSG_LENGTH = 2048;
    private static final int MAX_TAG_LENGTH = 64;
    private static final String TAG = "UAPMCustomLogManager";
    private static final JSONArray jsonObjects = new JSONArray();
    private static int sCacheSize = 100;

    private static void addCustomLogs(String str, String str2, int i10) {
        synchronized (UAPMCustomLogManager.class) {
            try {
                if (str.length() > 64) {
                    str = UMCrashUtils.splitByByte(str, 64);
                }
                if (str2.length() > 2048) {
                    str2 = UMCrashUtils.splitByByte(str2, 2048);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Progress.TAG, str);
                jSONObject.put("msg", str2);
                jSONObject.put("l", i10);
                jSONObject.put("t", System.currentTimeMillis());
                jSONObject.put("pid", Process.myPid());
                jSONObject.put("tid", Process.myTid());
                JSONArray jSONArray = jsonObjects;
                if (jSONArray.length() >= sCacheSize) {
                    jSONArray.remove(0);
                    jSONArray.put(jSONObject);
                } else {
                    jSONArray.put(jSONObject);
                }
            } finally {
            }
        }
    }

    private static boolean checkParams(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return true;
        }
        Log.e(TAG, "tag or msg is empty");
        return false;
    }

    /* renamed from: d */
    public static void m15892d(String str, String str2) {
        if (checkParams(str, str2)) {
            Log.d(str, str2);
            addCustomLogs(str, str2, 1);
        }
    }

    /* renamed from: e */
    public static void m15893e(String str, String str2) {
        if (checkParams(str, str2)) {
            Log.e(str, str2);
            addCustomLogs(str, str2, 4);
        }
    }

    public static String getCustomLogs() {
        String jSONArray;
        synchronized (UAPMCustomLogManager.class) {
            try {
                jSONArray = jsonObjects.toString();
            } catch (Throwable th) {
                th.printStackTrace();
                return "";
            }
        }
        return jSONArray;
    }

    /* renamed from: i */
    public static void m15894i(String str, String str2) {
        if (checkParams(str, str2)) {
            Log.i(str, str2);
            addCustomLogs(str, str2, 2);
        }
    }

    public static void setCache(int i10) {
        if (i10 > 100) {
            Log.e(TAG, "size should be less than 100");
        }
        sCacheSize = Math.min(i10, 100);
    }

    /* renamed from: v */
    public static void m15895v(String str, String str2) {
        if (checkParams(str, str2)) {
            Log.v(str, str2);
            addCustomLogs(str, str2, 0);
        }
    }

    /* renamed from: w */
    public static void m15896w(String str, String str2) {
        if (checkParams(str, str2)) {
            Log.w(str, str2);
            addCustomLogs(str, str2, 3);
        }
    }
}
