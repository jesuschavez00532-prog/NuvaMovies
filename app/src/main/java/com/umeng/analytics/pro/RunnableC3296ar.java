package com.umeng.analytics.pro;

import com.umeng.ccg.C3419c;
import com.umeng.ccg.C3420d;
import com.umeng.commonsdk.service.UMGlobalContext;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.ar */
/* loaded from: classes3.dex */
public class RunnableC3296ar implements Runnable {

    /* renamed from: a */
    public static final String f14013a = "https://ucc.umeng.com/v2/inn/fetch";

    /* renamed from: b */
    private String f14014b;

    /* renamed from: c */
    private String f14015c;

    /* renamed from: d */
    private String f14016d;

    public RunnableC3296ar(String str, JSONObject jSONObject, String str2) {
        this.f14014b = str;
        this.f14015c = jSONObject.toString();
        this.f14016d = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONObject jSONObject = null;
        try {
            byte[] m13792a = C3294ap.m13792a(this.f14014b, this.f14015c);
            if (m13792a != null) {
                JSONObject jSONObject2 = new JSONObject(new String(m13792a));
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("sourceIucc", this.f14016d);
                    jSONObject3.put("config", jSONObject2);
                } catch (Throwable unused) {
                }
                jSONObject = jSONObject3;
            }
        } catch (Throwable unused2) {
        }
        C3419c.m14470a(UMGlobalContext.getAppContext(), 102, C3420d.m14476a(), jSONObject);
    }
}
