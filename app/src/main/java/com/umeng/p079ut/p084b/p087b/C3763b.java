package com.umeng.p079ut.p084b.p087b;

import com.taobao.accs.common.Constants;
import com.umeng.p079ut.p080a.C3742a;
import com.umeng.p079ut.p080a.p083c.C3756e;
import org.json.JSONObject;

/* renamed from: com.umeng.ut.b.b.b */
/* loaded from: classes3.dex */
class C3763b {

    /* renamed from: d */
    int f16812d = -1;

    C3763b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m15976a(int i10) {
        return i10 >= 0 && i10 != 10012;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C3763b m15975a(String str) {
        JSONObject jSONObject;
        C3763b c3763b = new C3763b();
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            if (jSONObject2.has(Constants.KEY_HTTP_CODE)) {
                c3763b.f16812d = jSONObject2.getInt(Constants.KEY_HTTP_CODE);
            }
            if (jSONObject2.has("data") && (jSONObject = jSONObject2.getJSONObject("data")) != null && jSONObject.has("id") && jSONObject.has("d_ts")) {
                C3765d.m15978a(C3742a.m15925a().m15927a()).m15990a(jSONObject.getString("id"), jSONObject.getLong("d_ts"));
            }
            C3756e.m15954a("BizResponse", "content", str);
        } catch (Throwable th) {
            C3756e.m15954a("", th.toString());
        }
        return c3763b;
    }
}
