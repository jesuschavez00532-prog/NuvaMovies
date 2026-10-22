package com.taobao.accs.utl;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.taobao.accs.utl.p */
/* loaded from: classes.dex */
public class C3203p {

    /* renamed from: com.taobao.accs.utl.p$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        JSONObject f13219a = new JSONObject();

        /* renamed from: a */
        public a m13022a(String str, String str2) {
            if (str2 != null && str != null) {
                try {
                    this.f13219a.put(str, str2);
                } catch (JSONException unused) {
                }
            }
            return this;
        }

        /* renamed from: a */
        public a m13020a(String str, Integer num) {
            if (num == null) {
                return this;
            }
            try {
                this.f13219a.put(str, num);
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: a */
        public a m13021a(String str, Long l10) {
            if (l10 == null) {
                return this;
            }
            try {
                this.f13219a.put(str, l10);
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: a */
        public JSONObject m13023a() {
            return this.f13219a;
        }
    }

    /* renamed from: a */
    public static String m13019a(JSONObject jSONObject, String str, String str2) {
        if (jSONObject == null) {
            return str2;
        }
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return str2;
    }
}
