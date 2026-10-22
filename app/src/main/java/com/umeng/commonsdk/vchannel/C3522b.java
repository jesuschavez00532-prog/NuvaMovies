package com.umeng.commonsdk.vchannel;

import android.content.Context;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.vchannel.b */
/* loaded from: classes3.dex */
public class C3522b {

    /* renamed from: b */
    private String f15716b;

    /* renamed from: a */
    private String f15715a = "_$unknown";

    /* renamed from: c */
    private long f15717c = 0;

    /* renamed from: d */
    private long f15718d = 0;

    /* renamed from: e */
    private String f15719e = C3521a.f15714j;

    /* renamed from: f */
    private Map<String, Object> f15720f = null;

    public C3522b(Context context) {
        this.f15716b = UMGlobalContext.getInstance(context).getProcessName(context);
    }

    /* renamed from: a */
    public String m15128a() {
        return this.f15715a;
    }

    /* renamed from: b */
    public long m15132b() {
        return this.f15717c;
    }

    /* renamed from: c */
    public Map<String, Object> m15133c() {
        return this.f15720f;
    }

    /* renamed from: d */
    public JSONObject m15134d() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.f15715a);
            jSONObject.put("pn", this.f15716b);
            jSONObject.put("ds", this.f15718d);
            jSONObject.put("ts", this.f15717c);
            Map<String, Object> map = this.f15720f;
            if (map != null && map.size() > 0) {
                for (String str : this.f15720f.keySet()) {
                    jSONObject.put(str, this.f15720f.get(str));
                }
            }
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(this.f15719e, jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("ekv", jSONArray2);
            return jSONObject3;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append("id:" + this.f15715a + ",");
        sb2.append("pn:" + this.f15716b + ",");
        sb2.append("ts:" + this.f15717c + ",");
        Map<String, Object> map = this.f15720f;
        if (map != null && map.size() > 0) {
            for (String str2 : this.f15720f.keySet()) {
                Object obj = this.f15720f.get(str2);
                if (obj == null) {
                    str = str2 + ": null,";
                } else {
                    str = str2 + ": " + obj.toString() + ",";
                }
                sb2.append(str);
            }
        }
        sb2.append("ds:" + this.f15718d + "]");
        return sb2.toString();
    }

    /* renamed from: a */
    public void m15130a(String str) {
        this.f15715a = str;
    }

    /* renamed from: a */
    public void m15129a(long j10) {
        this.f15717c = j10;
    }

    /* renamed from: a */
    public void m15131a(Map<String, Object> map) {
        this.f15720f = map;
    }
}
