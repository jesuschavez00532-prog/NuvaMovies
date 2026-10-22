package com.umeng.analytics.pro;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.taobao.accs.common.Constants;
import com.umeng.ccg.C3417a;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.umcrash.custommapping.UAPMCustomMapping;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.ao */
/* loaded from: classes3.dex */
public class C3293ao {

    /* renamed from: a */
    private static JSONObject f14005a;

    /* renamed from: a */
    public static JSONObject m13786a(Context context, JSONArray jSONArray, String str) {
        JSONObject jSONObject = f14005a;
        if (jSONObject != null && jSONObject.length() > 0) {
            return f14005a;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("os", "Android");
            jSONObject2.put("dm", Build.MODEL);
            jSONObject2.put("av", DeviceConfig.getAppVersionName(context));
            jSONObject2.put(C3325bt.f14265g, UMUtils.getUMId(context));
            jSONObject2.put("ov", Build.VERSION.RELEASE);
            jSONObject2.put("chn", UMUtils.getChannel(context));
            jSONObject2.put(C3325bt.f14220al, UMUtils.getZid(context));
            jSONObject2.put("sv", "9.7.9");
            jSONObject2.put("ak", UMUtils.getAppkey(context));
            String idfa = DeviceConfig.getIdfa(context);
            if (!TextUtils.isEmpty(idfa)) {
                jSONObject2.put("tk_idfa", idfa);
            }
            jSONObject2.put("db", Build.BRAND);
            jSONObject2.put("tk_aid", DeviceConfig.getAndroidId(context));
            String oaid = DeviceConfig.getOaid(context);
            if (!TextUtils.isEmpty(oaid)) {
                jSONObject2.put("tk_oaid", oaid);
            }
            String imeiNew = DeviceConfig.getImeiNew(context);
            if (!TextUtils.isEmpty(imeiNew)) {
                jSONObject2.put("tk_imei", imeiNew);
            }
            jSONObject2.put("boa", Build.BOARD);
            jSONObject2.put("mant", Build.TIME);
            String[] localeInfo = DeviceConfig.getLocaleInfo(context);
            jSONObject2.put("ct", localeInfo[0]);
            jSONObject2.put("lang", localeInfo[1]);
            jSONObject2.put("tz", DeviceConfig.getTimeZone(context));
            jSONObject2.put("pkg", DeviceConfig.getPackageName(context));
            jSONObject2.put("disn", DeviceConfig.getAppName(context));
            String[] networkAccessMode = DeviceConfig.getNetworkAccessMode(context);
            if ("Wi-Fi".equals(networkAccessMode[0])) {
                jSONObject2.put("ac", "wifi");
            } else if ("2G/3G".equals(networkAccessMode[0])) {
                jSONObject2.put("ac", "2G/3G");
            } else {
                jSONObject2.put("ac", "unknown");
            }
            if (!"".equals(networkAccessMode[1])) {
                jSONObject2.put("ast", networkAccessMode[1]);
            }
            jSONObject2.put("nt", DeviceConfig.getNetworkType(context));
            String deviceToken = UMUtils.getDeviceToken(context);
            if (!TextUtils.isEmpty(deviceToken)) {
                jSONObject2.put(C3325bt.f14182a, deviceToken);
            }
            int[] resolutionArray = DeviceConfig.getResolutionArray(context);
            if (resolutionArray != null) {
                jSONObject2.put("rl", resolutionArray[1] + Operator.Operation.MULTIPLY + resolutionArray[0]);
            }
            jSONObject2.put("car", DeviceConfig.getNetworkOperatorName(context));
            jSONObject2.put(C3325bt.f14235b, "9.7.9");
            if (DeviceConfig.isHarmony(context)) {
                jSONObject2.put("oos", "harmony");
            } else {
                jSONObject2.put("oos", "Android");
            }
            jSONObject2.put(C3417a.f14996r, str);
            jSONObject2.put(C3417a.f14999u, jSONArray);
            f14005a = jSONObject2;
        } catch (Throwable unused) {
        }
        return f14005a;
    }

    /* renamed from: a */
    public static JSONObject m13787a(Context context, JSONObject jSONObject) {
        JSONObject jSONObject2 = null;
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("ekv", jSONArray);
                return jSONObject3;
            } catch (Throwable unused) {
                jSONObject2 = jSONObject3;
                return jSONObject2;
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    public static JSONObject m13788a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("header", jSONObject);
            jSONObject3.put("analytics", jSONObject2);
        } catch (Throwable unused) {
        }
        return jSONObject3;
    }

    /* renamed from: a */
    public static JSONObject m13785a(Context context, String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            C3292an c3292an = new C3292an();
            String uMId = UMUtils.getUMId(context);
            if (TextUtils.isEmpty(uMId)) {
                return null;
            }
            c3292an.m13760a(uMId);
            String appkey = UMUtils.getAppkey(context);
            if (TextUtils.isEmpty(appkey)) {
                return null;
            }
            c3292an.m13763b(appkey);
            c3292an.m13765c(UMUtils.getAppVersionName(context));
            c3292an.m13767d("9.7.9");
            c3292an.m13769e(UMUtils.getChannel(context));
            c3292an.m13771f(Build.VERSION.SDK_INT + "");
            c3292an.m13773g(Build.BRAND);
            c3292an.m13775h(Build.MODEL);
            String[] localeInfo = DeviceConfig.getLocaleInfo(context);
            c3292an.m13777i(localeInfo[1]);
            c3292an.m13779j(localeInfo[0]);
            int[] resolutionArray = DeviceConfig.getResolutionArray(context);
            c3292an.m13762b(Integer.valueOf(resolutionArray[1]));
            c3292an.m13759a(Integer.valueOf(resolutionArray[0]));
            c3292an.m13781k(C3297as.m13794a(context, "install_datetime", ""));
            try {
                jSONObject = new JSONObject();
            } catch (JSONException e10) {
                e = e10;
            }
            try {
                jSONObject.put(C3292an.f13977a, c3292an.m13758a());
                jSONObject.put(C3292an.f13979c, c3292an.m13764c());
                jSONObject.put(C3292an.f13978b, c3292an.m13761b());
                jSONObject.put(C3292an.f13980d, c3292an.m13766d());
                jSONObject.put(C3292an.f13981e, c3292an.m13768e());
                jSONObject.put(C3292an.f13982f, c3292an.m13770f());
                jSONObject.put(C3292an.f13983g, c3292an.m13772g());
                jSONObject.put(C3292an.f13984h, c3292an.m13774h());
                jSONObject.put(C3292an.f13987k, c3292an.m13780k());
                jSONObject.put(C3292an.f13986j, c3292an.m13778j());
                jSONObject.put(C3292an.f13988l, c3292an.m13782l());
                jSONObject.put(C3292an.f13985i, c3292an.m13776i());
                jSONObject.put(C3292an.f13989m, c3292an.m13783m());
                jSONObject.put(C3325bt.f14220al, UMUtils.getZid(context));
                jSONObject.put(DispatchConstants.PLATFORM, DispatchConstants.ANDROID);
                jSONObject.put("optional", new JSONObject(C3297as.m13795a()));
                String[] split = str.split("@");
                if (split.length == 4) {
                    try {
                        long parseLong = Long.parseLong(split[0]);
                        String str2 = split[1];
                        jSONObject.put(UAPMCustomMapping.STRING_PARAM_1, parseLong);
                        jSONObject.put(UAPMCustomMapping.STRING_PARAM_2, str2);
                    } catch (Throwable unused) {
                    }
                }
                try {
                    String str3 = Build.BRAND;
                    String m13799a = C3298at.m13799a(str3);
                    String m13801b = C3298at.m13801b(str3);
                    if (!TextUtils.isEmpty(m13799a) && !TextUtils.isEmpty(m13801b)) {
                        jSONObject.put(C3292an.f13990n, m13799a);
                        jSONObject.put(C3292an.f13991o, m13801b);
                    } else {
                        jSONObject.put(C3292an.f13990n, "Android");
                        jSONObject.put(C3292an.f13991o, Build.VERSION.RELEASE);
                    }
                } catch (Throwable unused2) {
                }
                return jSONObject;
            } catch (JSONException e11) {
                e = e11;
                jSONObject2 = jSONObject;
                UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "[getCloudConfigParam] error " + e.getMessage());
                return jSONObject2;
            } catch (Throwable th) {
                th = th;
                jSONObject2 = jSONObject;
                UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "[getCloudConfigParam] error " + th.getMessage());
                return jSONObject2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public static JSONObject m13784a(Context context, int i10, JSONArray jSONArray, String str) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                String zid = UMUtils.getZid(context);
                if (TextUtils.isEmpty(zid)) {
                    return jSONObject2;
                }
                jSONObject2.put("atoken", zid);
                String deviceToken = UMUtils.getDeviceToken(context);
                if (!TextUtils.isEmpty(deviceToken)) {
                    jSONObject2.put("device_token", deviceToken);
                }
                jSONObject2.put(Constants.KEY_MODEL, Build.MODEL);
                jSONObject2.put("os", DispatchConstants.ANDROID);
                jSONObject2.put(C3325bt.f14283y, Build.VERSION.RELEASE);
                jSONObject2.put(C3417a.f14996r, str);
                jSONObject2.put(C3417a.f14999u, jSONArray);
                jSONObject2.put("e", i10);
                return jSONObject2;
            } catch (Throwable unused) {
                jSONObject = jSONObject2;
                return jSONObject;
            }
        } catch (Throwable unused2) {
        }
    }
}
