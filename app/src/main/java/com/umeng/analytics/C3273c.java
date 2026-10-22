package com.umeng.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.pro.C3302ax;
import com.umeng.analytics.pro.C3384f;
import com.umeng.common.C3422b;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.MLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.json.JSONTokener;

/* renamed from: com.umeng.analytics.c */
/* loaded from: classes3.dex */
public class C3273c {

    /* renamed from: a */
    private static final int f13918a = 20;

    /* renamed from: b */
    private static final String f13919b = "umeng_pcp";

    /* renamed from: c */
    private static final String f13920c = "mob";

    /* renamed from: d */
    private static final String f13921d = "em";

    /* renamed from: e */
    private static final String f13922e = "cp";

    /* renamed from: f */
    private static final String f13923f = "pk";

    /* renamed from: g */
    private static final String f13924g = "pv";

    /* renamed from: h */
    private static String[] f13925h = new String[2];

    /* renamed from: i */
    private static Object f13926i = new Object();

    /* renamed from: j */
    private static Map<String, Object> f13927j = new HashMap();

    /* renamed from: a */
    public static void m13687a(Context context, String str, String str2) {
        String[] strArr = f13925h;
        strArr[0] = str;
        strArr[1] = str2;
        if (context != null) {
            C3422b.m14516a(context).m14523a(str, str2);
        }
    }

    /* renamed from: b */
    public static void m13693b(Context context) {
        String[] strArr = f13925h;
        strArr[0] = null;
        strArr[1] = null;
        if (context != null) {
            C3422b.m14516a(context).m14525b();
        }
    }

    /* renamed from: c */
    public static Map<String, Object> m13695c(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(f13919b, 0);
        String string = sharedPreferences.getString(f13922e, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            String str = new String(C3302ax.m13817a(Base64.decode(string, 0), UMConfigure.sAppkey.getBytes()));
            if (str.length() <= 0) {
                return null;
            }
            HashMap hashMap = new HashMap();
            try {
                JSONArray jSONArray = (JSONArray) new JSONTokener(str).nextValue();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    hashMap.put(jSONObject.getString("pk"), jSONObject.get("pv"));
                }
                sharedPreferences.edit().putString(f13922e, "").apply();
                return hashMap;
            } catch (Throwable unused) {
                return hashMap;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public static String[] m13691a(Context context) {
        String[] m14524a;
        if (!TextUtils.isEmpty(f13925h[0]) && !TextUtils.isEmpty(f13925h[1])) {
            return f13925h;
        }
        if (context == null || (m14524a = C3422b.m14516a(context).m14524a()) == null) {
            return null;
        }
        String[] strArr = f13925h;
        strArr[0] = m14524a[0];
        strArr[1] = m14524a[1];
        return strArr;
    }

    /* renamed from: b */
    public static void m13694b(String str) {
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext != null) {
            try {
                SharedPreferences sharedPreferences = appContext.getSharedPreferences(f13919b, 0);
                byte[] m13817a = C3302ax.m13817a(str.getBytes(), UMConfigure.sAppkey.getBytes());
                sharedPreferences.edit().putString(f13921d, m13817a.length == 0 ? C3384f.f14556Q : Base64.encodeToString(m13817a, 0)).apply();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m13689a(String str) {
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext != null) {
            try {
                SharedPreferences sharedPreferences = appContext.getSharedPreferences(f13919b, 0);
                byte[] m13817a = C3302ax.m13817a(str.getBytes(), UMConfigure.sAppkey.getBytes());
                sharedPreferences.edit().putString(f13920c, m13817a.length == 0 ? C3384f.f14556Q : Base64.encodeToString(m13817a, 0)).apply();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static String m13692b() {
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext == null) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = appContext.getSharedPreferences(f13919b, 0);
            String string = sharedPreferences.getString(f13921d, "");
            if (C3384f.f14556Q.equals(string)) {
                sharedPreferences.edit().putString(f13921d, "").apply();
                return "";
            }
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            sharedPreferences.edit().putString(f13921d, "").apply();
            return new String(C3302ax.m13817a(Base64.decode(string, 0), UMConfigure.sAppkey.getBytes()));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m13686a() {
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext == null) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = appContext.getSharedPreferences(f13919b, 0);
            String string = sharedPreferences.getString(f13920c, "");
            if (C3384f.f14556Q.equals(string)) {
                sharedPreferences.edit().putString(f13920c, "").apply();
                return "";
            }
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            sharedPreferences.edit().putString(f13920c, "").apply();
            return new String(C3302ax.m13817a(Base64.decode(string, 0), UMConfigure.sAppkey.getBytes()));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m13688a(Context context, Map<String, Object> map) {
        if (map != null) {
            JSONStringer jSONStringer = new JSONStringer();
            try {
                synchronized (f13926i) {
                    jSONStringer.array();
                    for (String str : map.keySet()) {
                        jSONStringer.object();
                        jSONStringer.key("pk");
                        jSONStringer.value(str);
                        jSONStringer.key("pv");
                        jSONStringer.value(map.get(str));
                        jSONStringer.endObject();
                    }
                    jSONStringer.endArray();
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences(f13919b, 0);
                sharedPreferences.edit().putString(f13922e, Base64.encodeToString(C3302ax.m13817a(jSONStringer.toString().getBytes(), UMConfigure.sAppkey.getBytes()), 0)).apply();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m13690a(String str, Object obj) {
        synchronized (f13926i) {
            if (f13927j.containsKey(str)) {
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "更新账号自定义KV: key=" + str + "; val=" + obj);
                f13927j.put(str, obj);
                m13688a(UMGlobalContext.getAppContext(), f13927j);
            } else {
                if (f13927j.size() >= 20) {
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "设置账号自定义KV: 已经设置20个KV键值对，忽略设置请求。");
                    MLog.m14765e("userProfile: Only 20 user-defined key-value pairs can be configured, please check!");
                    return;
                }
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "设置账号自定义KV: key=" + str + "; val=" + obj);
                f13927j.put(str, obj);
                m13688a(UMGlobalContext.getAppContext(), f13927j);
            }
        }
    }
}
