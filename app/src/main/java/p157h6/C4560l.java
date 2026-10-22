package p157h6;

import com.umeng.analytics.pro.C3384f;
import org.json.JSONObject;
import p007a6.InterfaceC0096r;
import p157h6.C4552d;

/* renamed from: h6.l */
/* loaded from: classes.dex */
class C4560l implements InterfaceC4556h {
    /* renamed from: b */
    private static C4552d.a m18981b(JSONObject jSONObject) {
        return new C4552d.a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false));
    }

    /* renamed from: c */
    private static C4552d.b m18982c(JSONObject jSONObject) {
        return new C4552d.b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    /* renamed from: d */
    private static long m18983d(InterfaceC0096r interfaceC0096r, long j10, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return (j10 * 1000) + interfaceC0096r.mo435a();
    }

    @Override // p157h6.InterfaceC4556h
    /* renamed from: a */
    public C4552d mo18950a(InterfaceC0096r interfaceC0096r, JSONObject jSONObject) {
        C4552d.b m18982c;
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt3 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has(C3384f.f14569aC)) {
            m18982c = m18982c(jSONObject.getJSONObject(C3384f.f14569aC));
        } else {
            m18982c = m18982c(new JSONObject());
        }
        return new C4552d(m18983d(interfaceC0096r, optInt2, jSONObject), m18982c, m18981b(jSONObject.getJSONObject("features")), optInt, optInt2, optDouble, optDouble2, optInt3);
    }
}
