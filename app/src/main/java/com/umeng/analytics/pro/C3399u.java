package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.entity.EventType;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.C3395q;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.u */
/* loaded from: classes3.dex */
public class C3399u {

    /* renamed from: a */
    private static final String f14902a = "fs_lc_tl_uapp";

    /* renamed from: f */
    private static final String f14903f = "-1";

    /* renamed from: g */
    private static Context f14904g;

    /* renamed from: b */
    private final int f14905b;

    /* renamed from: c */
    private final int f14906c;

    /* renamed from: d */
    private final int f14907d;

    /* renamed from: e */
    private final int f14908e;

    /* renamed from: h */
    private JSONObject f14909h;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.analytics.pro.u$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private static final C3399u f14910a = new C3399u();

        private a() {
        }
    }

    /* renamed from: a */
    public static C3399u m14402a(Context context) {
        if (f14904g == null && context != null) {
            f14904g = context.getApplicationContext();
        }
        return a.f14910a;
    }

    /* renamed from: b */
    private void m14408b(Context context) {
        try {
            String string = PreferenceWrapper.getDefault(context).getString(f14902a, null);
            if (!TextUtils.isEmpty(string)) {
                this.f14909h = new JSONObject(string);
            }
            m14404a();
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    private void m14411c(Context context) {
        try {
            if (this.f14909h != null) {
                PreferenceWrapper.getDefault(f14904g).edit().putString(f14902a, this.f14909h.toString()).commit();
            }
        } catch (Throwable unused) {
        }
    }

    private C3399u() {
        this.f14905b = 128;
        this.f14906c = 256;
        this.f14907d = EventType.AUTH_FAIL;
        this.f14908e = 10;
        this.f14909h = null;
        try {
            m14408b(f14904g);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private boolean m14412c(String str) {
        if (str == null) {
            return true;
        }
        try {
            return str.trim().getBytes().length <= 1024;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void m14413a(String str, String str2, long j10, int i10, String str3) {
        String m13720a;
        try {
            if (m14407a(str) && m14409b(str2)) {
                if (Arrays.asList(C3384f.f14579aM).contains(str)) {
                    MLog.m14765e("key is " + str + ", please check key, illegal");
                    UMLog.m14562aq(C3390l.f14783m, 0, "\\|");
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("ts", currentTimeMillis);
                if (j10 > 0) {
                    jSONObject.put(C3384f.f14583ac, j10);
                }
                jSONObject.put("__t", C3389k.f14707a);
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put(str, str2);
                }
                if (UMUtils.isMainProgress(f14904g)) {
                    m13720a = C3279aa.m13712a().m13727d(UMGlobalContext.getAppContext(f14904g));
                } else {
                    m13720a = C3279aa.m13712a().m13720a(UMGlobalContext.getAppContext(f14904g), currentTimeMillis);
                }
                if (TextUtils.isEmpty(m13720a)) {
                    m13720a = f14903f;
                }
                jSONObject.put("__i", m13720a);
                if (!TextUtils.isEmpty(str3)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(str3);
                        if (jSONObject2.length() > 0) {
                            jSONObject.put(C3384f.f14567aA, jSONObject2);
                        }
                    } catch (JSONException unused) {
                    }
                }
                jSONObject.put("ds", 0);
                jSONObject.put("pn", UMGlobalContext.getInstance(f14904g).getProcessName(f14904g));
                m14404a();
                JSONObject jSONObject3 = this.f14909h;
                if (jSONObject3 != null && jSONObject3.has(str) && !((Boolean) this.f14909h.get(str)).booleanValue()) {
                    jSONObject.put(C3384f.f14585ae, 1);
                    this.f14909h.put(str, true);
                    m14411c(f14904g);
                }
                Context context = f14904g;
                UMWorkDispatch.sendEvent(context, C3395q.a.f14857a, CoreProtocol.getInstance(context), jSONObject);
                return;
            }
            UMLog.m14562aq(C3390l.f14782l, 0, "\\|");
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: b */
    private boolean m14409b(String str) {
        if (str == null) {
            return true;
        }
        try {
            if (str.trim().getBytes().length <= 256) {
                return true;
            }
        } catch (Exception unused) {
        }
        MLog.m14765e("value is " + str + ", please check value, illegal");
        return false;
    }

    /* renamed from: b */
    private boolean m14410b(Map<String, Object> map) {
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        if (!m14407a(entry.getKey())) {
                            UMLog.m14562aq(C3390l.f14778h, 0, "\\|");
                            return false;
                        }
                        if (entry.getValue() == null) {
                            UMLog.m14562aq(C3390l.f14779i, 0, "\\|");
                            return false;
                        }
                        if (entry.getValue() instanceof String) {
                            if (C3384f.f14577aK.equals(entry.getKey())) {
                                if (!m14412c(entry.getValue().toString())) {
                                    UMLog.m14562aq(C3390l.f14742P, 0, "\\|");
                                    return false;
                                }
                            } else if ("_$!url".equals(entry.getKey())) {
                                if (!m14412c(entry.getValue().toString())) {
                                    UMLog.m14562aq("url参数长度超过限制。|参数url长度不能超过1024字符。", 0, "\\|");
                                    return false;
                                }
                            } else if (!m14409b(entry.getValue().toString())) {
                                UMLog.m14562aq(C3390l.f14780j, 0, "\\|");
                                return false;
                            }
                        }
                    }
                    return true;
                }
            } catch (Exception unused) {
                return true;
            }
        }
        UMLog.m14562aq(C3390l.f14777g, 0, "\\|");
        return false;
    }

    /* renamed from: a */
    public void m14414a(String str, Map<String, Object> map, long j10, String str2, boolean z10) {
        String m13720a;
        try {
            if (!m14407a(str)) {
                UMLog.m14562aq(C3390l.f14776f, 0, "\\|");
                return;
            }
            if (m14410b(map)) {
                if (map.size() > 100) {
                    MLog.m14765e("map size is " + map.size() + ", please check");
                    return;
                }
                if (Arrays.asList(C3384f.f14579aM).contains(str)) {
                    MLog.m14765e("key is " + str + ", please check key, illegal");
                    UMLog.m14562aq(C3390l.f14772b, 0, "\\|");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("ts", System.currentTimeMillis());
                if (j10 > 0) {
                    jSONObject.put(C3384f.f14583ac, j10);
                }
                jSONObject.put("__t", C3389k.f14707a);
                ULog.m14801i("befort ekv map, event is " + jSONObject.toString());
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (!Arrays.asList(C3384f.f14579aM).contains(entry.getKey())) {
                        Object value = entry.getValue();
                        if (!(value instanceof String) && !(value instanceof Integer) && !(value instanceof Long) && !(value instanceof Short) && !(value instanceof Float) && !(value instanceof Double)) {
                            if (value.getClass().isArray()) {
                                if (value instanceof int[]) {
                                    int[] iArr = (int[]) value;
                                    if (iArr.length > 10) {
                                        MLog.m14765e("please check key or value, size overlength!");
                                        return;
                                    }
                                    JSONArray jSONArray = new JSONArray();
                                    for (int i10 : iArr) {
                                        jSONArray.put(i10);
                                    }
                                    jSONObject.put(entry.getKey(), jSONArray);
                                } else if (value instanceof double[]) {
                                    double[] dArr = (double[]) value;
                                    if (dArr.length > 10) {
                                        MLog.m14765e("please check key or value, size overlength!");
                                        return;
                                    }
                                    JSONArray jSONArray2 = new JSONArray();
                                    for (double d10 : dArr) {
                                        jSONArray2.put(d10);
                                    }
                                    jSONObject.put(entry.getKey(), jSONArray2);
                                } else if (value instanceof long[]) {
                                    long[] jArr = (long[]) value;
                                    if (jArr.length > 10) {
                                        MLog.m14765e("please check key or value, size overlength!");
                                        return;
                                    }
                                    JSONArray jSONArray3 = new JSONArray();
                                    for (long j11 : jArr) {
                                        jSONArray3.put(j11);
                                    }
                                    jSONObject.put(entry.getKey(), jSONArray3);
                                } else if (value instanceof float[]) {
                                    float[] fArr = (float[]) value;
                                    if (fArr.length > 10) {
                                        MLog.m14765e("please check key or value, size overlength!");
                                        return;
                                    }
                                    JSONArray jSONArray4 = new JSONArray();
                                    for (float f10 : fArr) {
                                        jSONArray4.put(f10);
                                    }
                                    jSONObject.put(entry.getKey(), jSONArray4);
                                } else if (value instanceof short[]) {
                                    short[] sArr = (short[]) value;
                                    if (sArr.length > 10) {
                                        MLog.m14765e("please check key or value, size overlength!");
                                        return;
                                    }
                                    JSONArray jSONArray5 = new JSONArray();
                                    for (short s10 : sArr) {
                                        jSONArray5.put((int) s10);
                                    }
                                    jSONObject.put(entry.getKey(), jSONArray5);
                                } else if (value instanceof String[]) {
                                    String[] strArr = (String[]) value;
                                    if (strArr.length > 10) {
                                        MLog.m14765e("please check key or value, size overlength!");
                                        return;
                                    }
                                    JSONArray jSONArray6 = new JSONArray();
                                    for (int i11 = 0; i11 < strArr.length; i11++) {
                                        String str3 = strArr[i11];
                                        if (str3 == null) {
                                            MLog.m14765e("please check array, null item!");
                                            return;
                                        } else {
                                            if (!m14409b(str3)) {
                                                return;
                                            }
                                            jSONArray6.put(strArr[i11]);
                                        }
                                    }
                                    jSONObject.put(entry.getKey(), jSONArray6);
                                } else {
                                    MLog.m14765e("please check key or value, illegal type!");
                                    return;
                                }
                            } else {
                                MLog.m14765e("please check key or value, illegal type!");
                                return;
                            }
                        }
                        jSONObject.put(entry.getKey(), value);
                    } else {
                        UMLog.m14562aq(C3390l.f14775e, 0, "\\|");
                        return;
                    }
                }
                if (UMUtils.isMainProgress(f14904g)) {
                    m13720a = C3279aa.m13712a().m13727d(UMGlobalContext.getAppContext(f14904g));
                } else {
                    m13720a = C3279aa.m13712a().m13720a(UMGlobalContext.getAppContext(f14904g), jSONObject.getLong("ts"));
                }
                if (TextUtils.isEmpty(m13720a)) {
                    m13720a = f14903f;
                }
                jSONObject.put("__i", m13720a);
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(str2);
                        if (jSONObject2.length() > 0) {
                            jSONObject.put(C3384f.f14567aA, jSONObject2);
                        }
                    } catch (JSONException unused) {
                    }
                }
                jSONObject.put("ds", 0);
                jSONObject.put("pn", UMGlobalContext.getInstance(f14904g).getProcessName(f14904g));
                m14404a();
                JSONObject jSONObject3 = this.f14909h;
                if (jSONObject3 != null && jSONObject3.has(str) && !((Boolean) this.f14909h.get(str)).booleanValue()) {
                    jSONObject.put(C3384f.f14585ae, 1);
                    this.f14909h.put(str, true);
                    m14411c(f14904g);
                }
                ULog.m14801i("----->>>>>ekv event json is " + jSONObject.toString());
                if (!z10) {
                    Context context = f14904g;
                    UMWorkDispatch.sendEvent(context, C3395q.a.f14857a, CoreProtocol.getInstance(context), jSONObject);
                } else {
                    Context context2 = f14904g;
                    UMWorkDispatch.sendEvent(context2, C3395q.a.f14870n, CoreProtocol.getInstance(context2), jSONObject);
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    public void m14415a(String str, Map<String, Object> map, String str2) {
        try {
            if (m14407a(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("ts", System.currentTimeMillis());
                jSONObject.put(C3384f.f14583ac, 0);
                jSONObject.put("__t", C3389k.f14708b);
                ULog.m14801i("befort gkv map, event is " + jSONObject.toString());
                Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
                for (int i10 = 0; i10 < 10 && it.hasNext(); i10++) {
                    Map.Entry<String, Object> next = it.next();
                    if (!C3384f.f14585ae.equals(next.getKey()) && !C3384f.f14583ac.equals(next.getKey()) && !"id".equals(next.getKey()) && !"ts".equals(next.getKey())) {
                        Object value = next.getValue();
                        if ((value instanceof String) || (value instanceof Integer) || (value instanceof Long)) {
                            jSONObject.put(next.getKey(), value);
                        }
                    }
                }
                String m13727d = C3279aa.m13712a().m13727d(UMGlobalContext.getAppContext(f14904g));
                if (TextUtils.isEmpty(m13727d)) {
                    m13727d = f14903f;
                }
                jSONObject.put("__i", m13727d);
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(str2);
                        if (jSONObject2.length() > 0) {
                            jSONObject.put(C3384f.f14567aA, jSONObject2);
                        }
                    } catch (JSONException unused) {
                    }
                }
                jSONObject.put("ds", 0);
                jSONObject.put("pn", UMGlobalContext.getInstance(f14904g).getProcessName(f14904g));
                ULog.m14801i("----->>>>>gkv event json is " + jSONObject.toString());
                Context context = f14904g;
                UMWorkDispatch.sendEvent(context, C3395q.a.f14858b, CoreProtocol.getInstance(context), jSONObject);
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    private void m14404a() {
        try {
            String imprintProperty = UMEnvelopeBuild.imprintProperty(f14904g, "track_list", "");
            if (TextUtils.isEmpty(imprintProperty)) {
                return;
            }
            String[] split = imprintProperty.split("!");
            JSONObject jSONObject = new JSONObject();
            int i10 = 0;
            if (this.f14909h != null) {
                for (String str : split) {
                    String subStr = HelperUtils.subStr(str, 128);
                    if (this.f14909h.has(subStr)) {
                        jSONObject.put(subStr, this.f14909h.get(subStr));
                    }
                }
            }
            this.f14909h = new JSONObject();
            if (split.length >= 10) {
                while (i10 < 10) {
                    m14405a(split[i10], jSONObject);
                    i10++;
                }
            } else {
                while (i10 < split.length) {
                    m14405a(split[i10], jSONObject);
                    i10++;
                }
            }
            m14411c(f14904g);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m14405a(String str, JSONObject jSONObject) {
        String subStr = HelperUtils.subStr(str, 128);
        if (jSONObject.has(subStr)) {
            m14406a(subStr, ((Boolean) jSONObject.get(subStr)).booleanValue());
        } else {
            m14406a(subStr, false);
        }
    }

    /* renamed from: a */
    private void m14406a(String str, boolean z10) {
        try {
            if (C3384f.f14585ae.equals(str) || C3384f.f14583ac.equals(str) || "id".equals(str) || "ts".equals(str) || this.f14909h.has(str)) {
                return;
            }
            this.f14909h.put(str, z10);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void m14416a(List<String> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    m14404a();
                    JSONObject jSONObject = this.f14909h;
                    if (jSONObject == null) {
                        this.f14909h = new JSONObject();
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            JSONObject jSONObject2 = this.f14909h;
                            if (jSONObject2 == null) {
                                this.f14909h = new JSONObject();
                            } else if (jSONObject2.length() >= 5) {
                                break;
                            }
                            String str = list.get(i10);
                            if (!TextUtils.isEmpty(str)) {
                                m14406a(HelperUtils.subStr(str, 128), false);
                            }
                        }
                        m14411c(f14904g);
                        return;
                    }
                    if (jSONObject.length() >= 5) {
                        MLog.m14759d("already setFistLaunchEvent, igone.");
                        return;
                    }
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (this.f14909h.length() >= 5) {
                            MLog.m14759d(" add setFistLaunchEvent over.");
                            return;
                        }
                        m14406a(HelperUtils.subStr(list.get(i11), 128), false);
                    }
                    m14411c(f14904g);
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        UMLog.m14562aq(C3390l.f14764ak, 0, "\\|");
    }

    /* renamed from: a */
    private JSONObject m14403a(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                try {
                    String key = entry.getKey();
                    if (key != null) {
                        String subStr = HelperUtils.subStr(key, 128);
                        Object value = entry.getValue();
                        if (value != null) {
                            int i10 = 0;
                            if (value.getClass().isArray()) {
                                if (value instanceof int[]) {
                                    int[] iArr = (int[]) value;
                                    JSONArray jSONArray = new JSONArray();
                                    while (i10 < iArr.length) {
                                        jSONArray.put(iArr[i10]);
                                        i10++;
                                    }
                                    jSONObject.put(subStr, jSONArray);
                                } else if (value instanceof double[]) {
                                    double[] dArr = (double[]) value;
                                    JSONArray jSONArray2 = new JSONArray();
                                    while (i10 < dArr.length) {
                                        jSONArray2.put(dArr[i10]);
                                        i10++;
                                    }
                                    jSONObject.put(subStr, jSONArray2);
                                } else if (value instanceof long[]) {
                                    long[] jArr = (long[]) value;
                                    JSONArray jSONArray3 = new JSONArray();
                                    while (i10 < jArr.length) {
                                        jSONArray3.put(jArr[i10]);
                                        i10++;
                                    }
                                    jSONObject.put(subStr, jSONArray3);
                                } else if (value instanceof float[]) {
                                    float[] fArr = (float[]) value;
                                    JSONArray jSONArray4 = new JSONArray();
                                    while (i10 < fArr.length) {
                                        jSONArray4.put(fArr[i10]);
                                        i10++;
                                    }
                                    jSONObject.put(subStr, jSONArray4);
                                } else if (value instanceof short[]) {
                                    short[] sArr = (short[]) value;
                                    JSONArray jSONArray5 = new JSONArray();
                                    while (i10 < sArr.length) {
                                        jSONArray5.put((int) sArr[i10]);
                                        i10++;
                                    }
                                    jSONObject.put(subStr, jSONArray5);
                                }
                            } else if (value instanceof List) {
                                List list = (List) value;
                                JSONArray jSONArray6 = new JSONArray();
                                while (i10 < list.size()) {
                                    Object obj = list.get(i10);
                                    if ((obj instanceof String) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Short)) {
                                        jSONArray6.put(list.get(i10));
                                    }
                                    i10++;
                                }
                                if (jSONArray6.length() > 0) {
                                    jSONObject.put(subStr, jSONArray6);
                                }
                            } else if (value instanceof String) {
                                jSONObject.put(subStr, HelperUtils.subStr(value.toString(), 256));
                            } else {
                                if (!(value instanceof Long) && !(value instanceof Integer) && !(value instanceof Float) && !(value instanceof Double) && !(value instanceof Short)) {
                                    MLog.m14765e("The param has not support type. please check !");
                                }
                                jSONObject.put(subStr, value);
                            }
                        }
                    }
                } catch (Exception e10) {
                    MLog.m14769e(e10);
                }
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    private boolean m14407a(String str) {
        if (str != null) {
            try {
                int length = str.trim().getBytes().length;
                if (length > 0 && length <= 128) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        MLog.m14765e("key is " + str + ", please check key, illegal");
        return false;
    }
}
