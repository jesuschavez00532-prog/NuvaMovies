package com.umeng.analytics.pro;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.aq */
/* loaded from: classes3.dex */
public class RunnableC3295aq implements Runnable {

    /* renamed from: a */
    public static final String f14007a = "https://aspect-upush.umeng.com/occa/v1/event/report";

    /* renamed from: b */
    public static final String f14008b = "https://cnlogs.umeng.com/ext_event";

    /* renamed from: c */
    public static final String f14009c = "https://cnlogs.umeng.com/uapp_ekverr_logs";

    /* renamed from: d */
    private String f14010d;

    /* renamed from: e */
    private String f14011e;

    /* renamed from: f */
    private String f14012f;

    public RunnableC3295aq(String str, JSONObject jSONObject) {
        this.f14012f = null;
        this.f14010d = str;
        this.f14011e = jSONObject.toString();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!TextUtils.isEmpty(this.f14011e)) {
                C3294ap.m13791a(this.f14010d, this.f14011e.getBytes(), this.f14012f);
            }
        } catch (Throwable unused) {
        }
    }

    public RunnableC3295aq(String str, JSONObject jSONObject, String str2) {
        this.f14012f = null;
        this.f14010d = str;
        this.f14011e = jSONObject.toString();
        this.f14012f = str2;
    }
}
