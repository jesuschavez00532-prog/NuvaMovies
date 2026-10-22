package com.umeng.message.proguard;

import com.lzy.okgo.model.HttpHeaders;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.message.proguard.an */
/* loaded from: classes3.dex */
public final class C3568an {

    /* renamed from: a */
    long f15949a;

    /* renamed from: b */
    int f15950b;

    /* renamed from: c */
    long f15951c;

    /* renamed from: d */
    long f15952d;

    /* renamed from: e */
    long f15953e;

    /* renamed from: f */
    boolean f15954f;

    /* renamed from: g */
    public boolean f15955g;

    /* renamed from: h */
    String[] f15956h;

    /* renamed from: i */
    private volatile boolean f15957i;

    /* renamed from: a */
    public final boolean m15332a() {
        return !this.f15957i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void m15331a(JSONObject jSONObject) {
        this.f15949a = jSONObject.optLong("duration") * 1000;
        this.f15950b = jSONObject.optInt("count");
        this.f15951c = jSONObject.optLong("delay") * 1000;
        this.f15952d = jSONObject.optLong("ttl") * 60 * 1000;
        this.f15953e = jSONObject.optLong("valid") * 60 * 1000;
        this.f15954f = jSONObject.optInt(HttpHeaders.HEAD_VALUE_CONNECTION_CLOSE, 0) == 1;
        this.f15955g = jSONObject.optInt("swipe", 1) == 1;
        JSONArray optJSONArray = jSONObject.optJSONArray("activity");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            this.f15956h = new String[optJSONArray.length()];
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                this.f15956h[i10] = optJSONArray.optString(i10);
            }
        }
        this.f15957i = true;
    }
}
