package com.umeng.analytics.pro;

import com.umeng.ccg.C3417a;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.ad */
/* loaded from: classes3.dex */
public class C3282ad extends C3280ab {

    /* renamed from: a */
    private String f13958a;

    /* renamed from: b */
    private String f13959b;

    public C3282ad(String str, ArrayList<InterfaceC3281ac> arrayList) {
        super(str, arrayList);
        this.f13958a = "";
        this.f13959b = "";
    }

    @Override // com.umeng.analytics.pro.C3280ab, com.umeng.analytics.pro.InterfaceC3288aj
    /* renamed from: a */
    public JSONObject mo13733a(String str, JSONObject jSONObject) {
        JSONObject mo13733a = super.mo13733a(str, jSONObject);
        if (mo13733a != null) {
            try {
                mo13733a.put(C3417a.f15000v, this.f13958a);
                mo13733a.put(C3417a.f15001w, this.f13959b);
            } catch (Throwable unused) {
            }
        }
        return mo13733a;
    }

    @Override // com.umeng.analytics.pro.C3280ab, com.umeng.analytics.pro.InterfaceC3288aj
    /* renamed from: b */
    public void mo13737b(String str, JSONObject jSONObject) {
        super.mo13737b(str, jSONObject);
        if (jSONObject.has(C3417a.f15001w)) {
            m13744d(jSONObject.optString(C3417a.f15001w));
        }
        if (jSONObject.has(C3417a.f15000v)) {
            m13742c(jSONObject.optString(C3417a.f15000v));
        }
    }

    /* renamed from: c */
    public void m13742c(String str) {
        this.f13958a = str;
    }

    /* renamed from: d */
    public String m13743d() {
        return this.f13958a;
    }

    /* renamed from: e */
    public String m13745e() {
        return this.f13959b;
    }

    /* renamed from: d */
    public void m13744d(String str) {
        this.f13959b = str;
    }
}
