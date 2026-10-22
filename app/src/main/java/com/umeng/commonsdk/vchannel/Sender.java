package com.umeng.commonsdk.vchannel;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.C3452a;
import com.umeng.commonsdk.internal.C3453b;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class Sender {
    private static long INTERVAL_THRESHOLD = 500;
    public static final String VCHANNEL_VERSION = "1.0.0";
    private static Map<String, String> customHeader;
    private static long lastTriggerTime;

    public static void handleEvent(Context context, C3522b c3522b) {
        if (context == null) {
            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> Sender:handleEvent: context is null.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(C3325bt.f14204aV, "1.0.0");
                Map<String, String> map = customHeader;
                if (map != null && map.size() > 0) {
                    for (String str : customHeader.keySet()) {
                        jSONObject.put(str, customHeader.get(str));
                    }
                }
            } catch (Throwable unused) {
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("analytics", c3522b.m15134d());
            UMEnvelopeBuild.buildEnvelopeWithExtHeader(context, jSONObject, jSONObject2, C3521a.f15707c, "v", "1.0.0");
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
    }

    public static void onEvent(Context context, String str, Map<String, Object> map) {
        if (context == null) {
            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> Sender: onEvent: context is null.");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> Sender: onEvent: eventID is null or an empty string.");
            return;
        }
        if (map == null) {
            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> Sender: onEvent: map is null.");
            return;
        }
        if (!UMFrUtils.isOnline(context)) {
            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> Sender: onEvent: Network unavailable.");
            return;
        }
        if (System.currentTimeMillis() - lastTriggerTime < INTERVAL_THRESHOLD) {
            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> Sender: onEvent: The interval between events is less than 500 milliseconds.");
            return;
        }
        C3522b c3522b = new C3522b(context);
        c3522b.m15130a(str);
        c3522b.m15129a(System.currentTimeMillis());
        c3522b.m15131a(map);
        try {
            UMWorkDispatch.sendEvent(context, C3452a.f15275o, C3453b.m14605a(context).m14606a(), c3522b);
        } catch (Throwable unused) {
        }
        lastTriggerTime = System.currentTimeMillis();
    }

    public static void setCustomHeader(Map<String, String> map) {
        if (map != null) {
            customHeader = map;
        }
    }
}
