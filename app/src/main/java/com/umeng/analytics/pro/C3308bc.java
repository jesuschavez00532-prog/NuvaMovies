package com.umeng.analytics.pro;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.taobao.accs.common.Constants;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.bc */
/* loaded from: classes3.dex */
public class C3308bc {

    /* renamed from: a */
    private static String f14088a;

    /* renamed from: a */
    public static JSONObject m13858a(Context context) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            if (!TextUtils.isEmpty(f14088a)) {
                try {
                    jSONObject = new JSONObject(f14088a);
                } catch (Exception unused) {
                }
            } else {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("appkey", UMUtils.getAppkey(context));
                jSONObject3.put("channel", UMUtils.getChannel(context));
                jSONObject3.put(Constants.KEY_BRAND, Build.BRAND);
                jSONObject3.put("osVersion", Build.VERSION.RELEASE);
                jSONObject3.put(C3325bt.f14265g, UMUtils.getUMId(context));
                jSONObject3.put(C3325bt.f14220al, UMUtils.getZid(context));
                jSONObject3.put("deviceModel", Build.MODEL);
                jSONObject3.put(DispatchConstants.PLATFORM, "Android");
                jSONObject3.put("appVersion", DeviceConfig.getAppVersionName(context));
                jSONObject3.put(Constants.KEY_SDK_VERSION, "9.7.9");
                f14088a = jSONObject3.toString();
                jSONObject = new JSONObject(f14088a);
            }
            jSONObject2 = jSONObject;
            jSONObject2.put("sessionid", DeviceConfig.getSid(context));
            jSONObject2.put("ts", System.currentTimeMillis());
        } catch (Throwable unused2) {
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public static void m13859a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null) {
            try {
                jSONObject.put("ekverr", jSONObject2);
            } catch (Throwable unused) {
            }
        }
    }
}
