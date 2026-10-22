package com.titan.ranger;

import com.lzy.okgo.cookie.SerializableCookie;
import com.umeng.analytics.pro.C3309bd;
import org.json.JSONException;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* renamed from: com.titan.ranger.a */
/* loaded from: classes3.dex */
public abstract class AbstractC3247a {
    /* renamed from: a */
    public static String m13117a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("entries", str);
            return jSONObject.toString();
        } catch (JSONException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: b */
    public static String m13118b(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3309bd.f14094a, str);
            return jSONObject.toString();
        } catch (JSONException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: c */
    public static String m13119c(int i10, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("instance", i10);
            jSONObject.put(SerializableCookie.NAME, str);
            jSONObject.put("data", str2);
            return jSONObject.toString();
        } catch (JSONException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: d */
    public static String m13120d(int i10, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("instance", i10);
            jSONObject.put("event", str);
            jSONObject.put("data", str2);
            return jSONObject.toString();
        } catch (JSONException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: e */
    public static String m13121e(int i10, long j10, long j11) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("instance", i10);
            jSONObject.put("progress", j10);
            jSONObject.put("buffer", j11);
            return jSONObject.toString();
        } catch (JSONException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: f */
    public static String m13122f(int i10, String str, int i11, int i12, long j10, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("instance", i10);
            jSONObject.put("event", str);
            jSONObject.put("err", i11);
            jSONObject.put("extra", i12);
            jSONObject.put("data", j10);
            jSONObject.put("reason", str2);
            return jSONObject.toString();
        } catch (JSONException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: g */
    public static String m13123g(int i10, String str, String str2, int i11) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("instance", i10);
            jSONObject.put("operation", str);
            jSONObject.put("data", str2);
            jSONObject.put("err", i11);
            return jSONObject.toString();
        } catch (JSONException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: h */
    public static String m13124h(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("object", str);
            jSONObject.put("type", str2);
            jSONObject.put("event", str3);
            return jSONObject.toString();
        } catch (JSONException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: i */
    public static String m13125i(int i10, String str, int i11) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("instance", i10);
            jSONObject.put("player", str);
            jSONObject.put("err", i11);
            return jSONObject.toString();
        } catch (JSONException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: j */
    public static String m13126j(int i10, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("instance", i10);
            jSONObject.put(SerializableCookie.NAME, str);
            return jSONObject.toString();
        } catch (JSONException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: k */
    public static String m13127k(int i10, String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("instance", i10);
            jSONObject.put(SerializableCookie.NAME, str);
            jSONObject.put("program", str2);
            jSONObject.put("extra", str3);
            return jSONObject.toString();
        } catch (JSONException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: l */
    public static String m13128l(int i10, String str, long j10, long j11) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("instance", i10);
            jSONObject.put(SerializableCookie.NAME, str);
            jSONObject.put("moment", j10);
            jSONObject.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, j11);
            return jSONObject.toString();
        } catch (JSONException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: m */
    public static String m13129m(int i10, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("instance", i10);
            jSONObject.put(SerializableCookie.NAME, str);
            jSONObject.put("media", str2);
            return jSONObject.toString();
        } catch (JSONException e10) {
            e10.printStackTrace();
            return "";
        }
    }
}
