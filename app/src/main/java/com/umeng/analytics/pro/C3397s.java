package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMRTLog;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.s */
/* loaded from: classes3.dex */
public class C3397s {
    /* renamed from: a */
    public static JSONObject m14394a(Context context, long j10, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (!jSONObject.has("content")) {
                return jSONObject2;
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("content");
            if (jSONObject3.has("analytics")) {
                JSONObject jSONObject4 = jSONObject3.getJSONObject("analytics");
                if (jSONObject4.has("ekv")) {
                    jSONObject4.remove("ekv");
                }
                if (jSONObject4.has(C3384f.f14565Z)) {
                    jSONObject4.remove(C3384f.f14565Z);
                }
                if (jSONObject4.has("error")) {
                    jSONObject4.remove("error");
                }
                jSONObject3.put("analytics", jSONObject4);
            }
            jSONObject2.put("content", jSONObject3);
            if (jSONObject.has("header")) {
                jSONObject2.put("header", jSONObject.getJSONObject("header"));
            }
            if (m14393a(jSONObject2) <= j10) {
                return jSONObject2;
            }
            jSONObject2 = null;
            C3389k.m14262a(context).m14294i();
            C3389k.m14262a(context).m14293h();
            C3389k.m14262a(context).m14285b(true, false);
            C3389k.m14262a(context).m14276a();
            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> u-app packet overload !!! ");
            return null;
        } catch (Throwable unused) {
            return jSONObject2;
        }
    }

    /* renamed from: a */
    public static long m14393a(JSONObject jSONObject) {
        return jSONObject.toString().getBytes().length;
    }

    /* renamed from: a */
    public static long m14392a(JSONArray jSONArray) {
        return jSONArray.toString().getBytes().length;
    }
}
