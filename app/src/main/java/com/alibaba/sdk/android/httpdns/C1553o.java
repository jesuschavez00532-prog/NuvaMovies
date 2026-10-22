package com.alibaba.sdk.android.httpdns;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.alibaba.sdk.android.httpdns.o */
/* loaded from: classes.dex */
public class C1553o {

    /* renamed from: d */
    private String[] f5993d;
    private boolean enabled;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1553o(String str) {
        this.enabled = true;
        try {
            JSONObject jSONObject = new JSONObject(str);
            C1545i.m7165d("StartIp Schedule center response:" + jSONObject.toString());
            if (jSONObject.has("service_status")) {
                this.enabled = jSONObject.getString("service_status").equals("disable") ? false : true;
            }
            if (jSONObject.has("service_ip")) {
                JSONArray jSONArray = jSONObject.getJSONArray("service_ip");
                this.f5993d = new String[jSONArray.length()];
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    this.f5993d[i10] = (String) jSONArray.get(i10);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: b */
    public String[] m7197b() {
        return this.f5993d;
    }

    public boolean isEnabled() {
        return this.enabled;
    }
}
