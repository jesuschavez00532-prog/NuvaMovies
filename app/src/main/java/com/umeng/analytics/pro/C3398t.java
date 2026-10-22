package com.umeng.analytics.pro;

import android.content.Context;
import com.lzy.okgo.OkGo;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.service.UMGlobalContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.t */
/* loaded from: classes3.dex */
public class C3398t {

    /* renamed from: a */
    private static final int f14896a = 0;

    /* renamed from: b */
    private static final int f14897b = 1;

    /* renamed from: c */
    private static final int f14898c = 2;

    /* renamed from: d */
    private static final int f14899d = 3;

    /* renamed from: e */
    private final long f14900e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.analytics.pro.t$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public static final C3398t f14901a = new C3398t();

        private a() {
        }
    }

    /* renamed from: a */
    public static C3398t m14395a() {
        return a.f14901a;
    }

    /* renamed from: c */
    private JSONArray m14398c() {
        JSONArray jSONArray = new JSONArray();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", C3279aa.m13712a().m13727d(UMGlobalContext.getAppContext(null)));
            jSONObject.put(C3384f.f14621p, currentTimeMillis);
            jSONArray.put(jSONObject);
        } catch (JSONException unused) {
        }
        return jSONArray;
    }

    /* renamed from: b */
    public void m14401b(JSONObject jSONObject, Context context) {
        int m14399a = m14399a(context);
        if (m14399a == 1) {
            if (jSONObject.has(C3384f.f14551L)) {
                jSONObject.remove(C3384f.f14551L);
            }
            if (jSONObject.has(C3384f.f14619n)) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray(C3384f.f14619n);
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                        if (jSONObject2.has(C3384f.f14567aA)) {
                            jSONObject2.remove(C3384f.f14567aA);
                        }
                        if (jSONObject2.has(C3384f.f14568aB)) {
                            jSONObject2.remove(C3384f.f14568aB);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            C3389k.m14262a(context).m14279a(false, true);
            return;
        }
        if (m14399a == 2) {
            if (jSONObject.has(C3384f.f14551L)) {
                jSONObject.remove(C3384f.f14551L);
            }
            if (jSONObject.has(C3384f.f14619n)) {
                jSONObject.remove(C3384f.f14619n);
            }
            try {
                jSONObject.put(C3384f.f14619n, m14398c());
            } catch (Exception unused2) {
            }
            C3389k.m14262a(context).m14279a(false, true);
            return;
        }
        if (m14399a == 3) {
            if (jSONObject.has(C3384f.f14551L)) {
                jSONObject.remove(C3384f.f14551L);
            }
            jSONObject.remove(C3384f.f14619n);
            C3389k.m14262a(context).m14279a(false, true);
        }
    }

    private C3398t() {
        this.f14900e = OkGo.DEFAULT_MILLISECONDS;
    }

    /* renamed from: a */
    public int m14399a(Context context) {
        return Integer.valueOf(UMEnvelopeBuild.imprintProperty(context, "defcon", String.valueOf(0))).intValue();
    }

    /* renamed from: a */
    private void m14396a(JSONObject jSONObject, boolean z10) {
        if (!z10 && jSONObject.has(C3384f.f14619n)) {
            jSONObject.remove(C3384f.f14619n);
        }
        if (jSONObject.has(C3384f.f14551L)) {
            jSONObject.remove(C3384f.f14551L);
        }
        if (jSONObject.has("error")) {
            jSONObject.remove("error");
        }
        if (jSONObject.has("ekv")) {
            jSONObject.remove("ekv");
        }
        if (jSONObject.has(C3384f.f14565Z)) {
            jSONObject.remove(C3384f.f14565Z);
        }
        if (jSONObject.has(C3384f.f14551L)) {
            jSONObject.remove(C3384f.f14551L);
        }
        if (jSONObject.has("userlevel")) {
            jSONObject.remove("userlevel");
        }
    }

    /* renamed from: a */
    public void m14400a(JSONObject jSONObject, Context context) {
        int m14399a = m14399a(context);
        if (m14399a == 1) {
            m14396a(jSONObject, true);
            C3389k.m14262a(context).m14285b(false, true);
        } else {
            if (m14399a == 2) {
                jSONObject.remove(C3384f.f14619n);
                try {
                    jSONObject.put(C3384f.f14619n, m14397b());
                } catch (Exception unused) {
                }
                m14396a(jSONObject, true);
                C3389k.m14262a(context).m14285b(false, true);
                return;
            }
            if (m14399a == 3) {
                m14396a(jSONObject, false);
                C3389k.m14262a(context).m14285b(false, true);
            }
        }
    }

    /* renamed from: b */
    private JSONArray m14397b() {
        JSONArray jSONArray = new JSONArray();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", C3279aa.m13712a().m13719a(UMGlobalContext.getAppContext(null)));
            jSONObject.put(C3384f.f14621p, currentTimeMillis);
            jSONObject.put(C3384f.f14622q, currentTimeMillis + OkGo.DEFAULT_MILLISECONDS);
            jSONObject.put("duration", OkGo.DEFAULT_MILLISECONDS);
            jSONArray.put(jSONObject);
        } catch (JSONException unused) {
        }
        return jSONArray;
    }
}
