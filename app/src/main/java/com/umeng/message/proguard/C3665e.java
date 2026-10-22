package com.umeng.message.proguard;

import android.app.Application;
import android.os.Build;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.MsgConstant;
import com.umeng.message.PushAgent;
import org.json.JSONObject;

/* renamed from: com.umeng.message.proguard.e */
/* loaded from: classes3.dex */
public final class C3665e {
    /* renamed from: a */
    public static JSONObject m15718a() {
        JSONObject jSONObject = new JSONObject();
        try {
            Application m15840a = C3706y.m15840a();
            jSONObject.put("appkey", PushAgent.getInstance(m15840a).getMessageAppkey());
            jSONObject.put("channel", PushAgent.getInstance(m15840a).getMessageChannel());
            jSONObject.put(C3325bt.f14265g, C3637d.m15618k(m15840a));
            jSONObject.put("din", C3637d.m15602c(m15840a));
            jSONObject.put("device_id", C3637d.m15604d(m15840a));
            jSONObject.put(C3325bt.f14280v, C3637d.m15608f(m15840a));
            jSONObject.put(C3325bt.f14156A, C3637d.m15601c());
            if (C3637d.m15606e(m15840a) != null) {
                jSONObject.put("android_id", C3637d.m15606e(m15840a));
            }
            if (C3637d.m15599b() != null) {
                jSONObject.put("serial_number", C3637d.m15599b());
            }
            String m15624p = C3637d.m15624p(m15840a);
            if ("false".equals(m15624p)) {
                UMLog.m14562aq(C3557ac.f15878b, 0, "\\|");
            }
            jSONObject.put("push_switch", m15624p);
            jSONObject.put(C3325bt.f14279u, "Android");
            jSONObject.put("sdk_version", MsgConstant.SDK_VERSION);
            String[] m15610g = C3637d.m15610g(m15840a);
            jSONObject.put(C3325bt.f14172Q, m15610g[0]);
            jSONObject.put(C3325bt.f14173R, m15610g[1]);
            jSONObject.put("carrier", C3637d.m15621m(m15840a));
            jSONObject.put("device_model", C3637d.m15603d());
            jSONObject.put("os", "Android");
            jSONObject.put(C3325bt.f14283y, Build.VERSION.RELEASE);
            jSONObject.put("app_version", C3637d.m15600b(m15840a));
            jSONObject.put("version_code", C3637d.m15596a(m15840a));
            jSONObject.put(C3325bt.f14273o, m15840a.getPackageName());
            jSONObject.put(C3325bt.f14284z, C3637d.m15620l(m15840a));
            jSONObject.put(C3325bt.f14281w, C3637d.m15595a());
            jSONObject.put(C3325bt.f14168M, C3637d.m15613i(m15840a));
            String[] m15616j = C3637d.m15616j(m15840a);
            jSONObject.put(C3325bt.f14170O, m15616j[0]);
            jSONObject.put("language", m15616j[1]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }
}
