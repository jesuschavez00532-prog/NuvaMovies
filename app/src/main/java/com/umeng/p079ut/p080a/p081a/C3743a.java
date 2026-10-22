package com.umeng.p079ut.p080a.p081a;

import android.content.Context;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.p079ut.p080a.C3742a;
import com.umeng.p079ut.p084b.p085a.p086a.C3760d;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.umeng.ut.a.a.a */
/* loaded from: classes3.dex */
public class C3743a {
    /* renamed from: a */
    public static String m15931a(String str) {
        String str2;
        Context m15927a = C3742a.m15925a().m15927a();
        if (m15927a == null) {
            return "";
        }
        try {
            str2 = UMUtils.getAppkey(m15927a);
        } catch (Throwable unused) {
            str2 = "";
        }
        return C3760d.m15970d(String.format("{\"type\":\"%s\",\"timestamp\":%s,\"data\":%s}", "audid", C3742a.m15925a().m15928a(), m15932a(str, "", str2, m15927a.getPackageName())));
    }

    /* renamed from: a */
    private static String m15932a(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("audid", str2);
        hashMap.put("utdid", str);
        hashMap.put("appkey", str3);
        hashMap.put(DispatchConstants.APP_NAME, str4);
        return new JSONObject(C3760d.m15969a(hashMap)).toString();
    }
}
