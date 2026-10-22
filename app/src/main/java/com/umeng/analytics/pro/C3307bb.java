package com.umeng.analytics.pro;

import android.text.TextUtils;
import com.taobao.accs.common.Constants;
import com.umeng.commonsdk.debug.UMRTLog;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.bb */
/* loaded from: classes3.dex */
public class C3307bb {

    /* renamed from: a */
    public static final String[] f14069a = {"um_plus_game_level", "um_plus_game_pay", "um_plus_game_buy", "um_plus_game_use", "um_plus_game_bonus"};

    /* renamed from: b */
    public static final String[] f14070b = {"id", "ts", C3384f.f14583ac, "__ct__", "pn", "ds"};

    /* renamed from: c */
    public static final String f14071c = "^(?!\\d)[a-zA-Z0-9_\\-\\+\\.]{1,}$";

    /* renamed from: d */
    public static final int f14072d = 128;

    /* renamed from: e */
    public static final int f14073e = 256;

    /* renamed from: f */
    public static final int f14074f = 100;

    /* renamed from: h */
    private a f14076h;

    /* renamed from: i */
    private String f14077i;

    /* renamed from: j */
    private String f14078j;

    /* renamed from: k */
    private boolean f14079k;

    /* renamed from: l */
    private Map<String, String> f14080l = null;

    /* renamed from: m */
    private Map<String, Object> f14081m = null;

    /* renamed from: g */
    JSONObject f14075g = null;

    /* renamed from: com.umeng.analytics.pro.bb$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a */
        static final /* synthetic */ int[] f14082a;

        static {
            int[] iArr = new int[a.values().length];
            f14082a = iArr;
            try {
                iArr[a.ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14082a[a.LABEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14082a[a.STRING_MAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14082a[a.OBJECT_MAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.umeng.analytics.pro.bb$a */
    /* loaded from: classes3.dex */
    public enum a {
        ID,
        LABEL,
        STRING_MAP,
        OBJECT_MAP
    }

    /* renamed from: h */
    private void m13841h() {
        boolean z10;
        String str;
        try {
            JSONArray jSONArray = new JSONArray();
            String str2 = this.f14077i;
            String str3 = "";
            if (str2 == null) {
                jSONArray.put(C3303ay.f14041a);
            } else if (TextUtils.isEmpty(str2.trim())) {
                jSONArray.put(C3303ay.f14042b);
            } else {
                if (this.f14077i.trim().getBytes().length > 128) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (Arrays.asList(f14069a).contains(this.f14077i)) {
                    jSONArray.put(C3303ay.f14043c);
                    str = this.f14077i;
                } else {
                    str = null;
                }
                if (!Pattern.matches(f14071c, this.f14077i)) {
                    jSONArray.put(C3303ay.f14045e);
                    str = this.f14077i;
                }
                if (z10) {
                    jSONArray.put(C3303ay.f14044d);
                    str3 = this.f14077i.length() > 128 ? this.f14077i.substring(0, 128) : this.f14077i;
                } else {
                    str3 = str;
                }
            }
            if (str3 != null) {
                this.f14075g.put("eID", str3);
                if (jSONArray.length() > 0) {
                    this.f14075g.put(Constants.KEY_HTTP_CODE, jSONArray);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: i */
    private void m13842i() {
        try {
            m13841h();
            JSONObject m13835a = m13835a(this.f14077i, this.f14078j, true);
            if (m13835a.length() > 0) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(m13835a);
                if (this.f14075g == null) {
                    this.f14075g = new JSONObject();
                }
                if (!this.f14075g.has("eID")) {
                    this.f14075g.put("eID", this.f14077i);
                }
                this.f14075g.put("epps", jSONArray);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: j */
    private void m13843j() {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            m13841h();
            if (this.f14080l == null) {
                this.f14081m = null;
            } else {
                this.f14081m = new HashMap(this.f14080l);
            }
            m13836a(this.f14081m, jSONObject, jSONArray);
            m13837a(jSONObject, jSONArray);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: k */
    private void m13844k() {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            m13841h();
            m13836a(this.f14081m, jSONObject, jSONArray);
            m13837a(jSONObject, jSONArray);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public a m13845a() {
        return this.f14076h;
    }

    /* renamed from: b */
    public String m13852b() {
        return this.f14077i;
    }

    /* renamed from: c */
    public String m13853c() {
        return this.f14078j;
    }

    /* renamed from: d */
    public boolean m13854d() {
        return this.f14079k;
    }

    /* renamed from: e */
    public Map<String, String> m13855e() {
        return this.f14080l;
    }

    /* renamed from: f */
    public Map<String, Object> m13856f() {
        return this.f14081m;
    }

    /* renamed from: g */
    public JSONObject m13857g() {
        this.f14075g = new JSONObject();
        int i10 = AnonymousClass1.f14082a[this.f14076h.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "unknown CkItem type!");
                    } else {
                        m13844k();
                        JSONObject jSONObject = this.f14075g;
                        if (jSONObject != null && jSONObject.length() > 0) {
                            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "result: " + this.f14075g);
                        } else {
                            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "未检查到错误。 ");
                        }
                    }
                } else {
                    m13843j();
                    JSONObject jSONObject2 = this.f14075g;
                    if (jSONObject2 != null && jSONObject2.length() > 0) {
                        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "result: " + this.f14075g);
                    } else {
                        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "未检查到错误。 ");
                    }
                }
            } else {
                m13842i();
                JSONObject jSONObject3 = this.f14075g;
                if (jSONObject3 != null && jSONObject3.length() > 0) {
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "result: " + this.f14075g);
                } else {
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "未检查到错误。 ");
                }
            }
        } else {
            m13841h();
            JSONObject jSONObject4 = this.f14075g;
            if (jSONObject4 != null && jSONObject4.length() > 0) {
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "result: " + this.f14075g);
            } else {
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "未检查到错误。 ");
            }
        }
        return this.f14075g;
    }

    /* renamed from: c */
    private JSONObject m13840c(String str, Object obj) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (obj instanceof String) {
                jSONObject = m13835a(str, (String) obj, false);
            } else if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof Float) && !(obj instanceof Double)) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(C3303ay.f14057q);
                jSONObject.put(Constants.KEY_HTTP_CODE, jSONArray);
                jSONObject.put("pid", obj.getClass().getName());
                jSONObject.put("msg", str);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public C3307bb m13846a(a aVar) {
        this.f14076h = aVar;
        return this;
    }

    /* renamed from: b */
    public C3307bb m13850b(String str) {
        this.f14078j = str;
        return this;
    }

    /* renamed from: a */
    public C3307bb m13847a(String str) {
        this.f14077i = str;
        return this;
    }

    /* renamed from: b */
    public C3307bb m13851b(Map<String, Object> map) {
        this.f14081m = map;
        return this;
    }

    /* renamed from: b */
    private void m13839b(Map<String, Object> map, JSONObject jSONObject, JSONArray jSONArray) {
        try {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                JSONArray m13834a = m13834a(str, obj);
                if (m13834a != null && m13834a.length() > 0) {
                    for (int i10 = 0; i10 < m13834a.length(); i10++) {
                        jSONArray.put(m13834a.get(i10));
                    }
                } else {
                    jSONObject.put(str, obj);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public C3307bb m13849a(boolean z10) {
        this.f14079k = z10;
        return this;
    }

    /* renamed from: a */
    public C3307bb m13848a(Map<String, String> map) {
        this.f14080l = map;
        return this;
    }

    /* renamed from: a */
    private void m13837a(JSONObject jSONObject, JSONArray jSONArray) {
        if (this.f14075g == null) {
            this.f14075g = new JSONObject();
        }
        if (jSONArray.length() > 0) {
            this.f14075g.put("epps", jSONArray);
            if (jSONObject.length() > 0) {
                this.f14075g.put("pps", jSONObject);
            }
        }
        if (!this.f14075g.has("epps") || this.f14075g.has(Constants.KEY_HTTP_CODE)) {
            return;
        }
        this.f14075g.put("eID", this.f14077i);
    }

    /* renamed from: b */
    private JSONObject m13838b(String str, Object obj) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            if (str == null) {
                jSONArray.put(C3303ay.f14055o);
                jSONObject.put("pid", "");
            } else if (TextUtils.isEmpty(str.trim())) {
                jSONArray.put(C3303ay.f14052l);
                jSONObject.put("pid", "");
            } else {
                boolean z10 = str.trim().getBytes().length > 128;
                if (Arrays.asList(f14070b).contains(str)) {
                    jSONArray.put(C3303ay.f14047g);
                    jSONObject.put("pid", str);
                }
                if (!Pattern.matches(f14071c, str)) {
                    jSONArray.put(C3303ay.f14056p);
                    jSONObject.put("pid", str);
                }
                if (z10) {
                    jSONArray.put(C3303ay.f14048h);
                    if (str.length() > 128) {
                        str = str.substring(0, 128);
                    }
                    jSONObject.put("pid", str);
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put(Constants.KEY_HTTP_CODE, jSONArray);
                jSONObject.put("msg", obj);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    private void m13836a(Map<String, Object> map, JSONObject jSONObject, JSONArray jSONArray) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray2 = new JSONArray();
            if (map == null) {
                jSONArray2.put(C3303ay.f14054n);
            } else if (map.isEmpty()) {
                jSONArray2.put(C3303ay.f14051k);
            } else if (map.size() > 100) {
                jSONArray2.put(C3303ay.f14046f);
            }
            if (jSONArray2.length() > 0) {
                jSONObject2.put(Constants.KEY_HTTP_CODE, jSONArray2);
                jSONArray.put(jSONObject2);
            } else {
                m13839b(map, jSONObject, jSONArray);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private JSONArray m13834a(String str, Object obj) {
        JSONArray jSONArray = null;
        try {
            JSONObject m13838b = m13838b(str, obj);
            if (m13838b.length() > 0) {
                JSONArray jSONArray2 = new JSONArray();
                try {
                    jSONArray2.put(m13838b);
                    jSONArray = jSONArray2;
                } catch (Throwable unused) {
                    return jSONArray2;
                }
            }
            JSONObject m13840c = m13840c(str, obj);
            if (m13840c.length() <= 0) {
                return jSONArray;
            }
            if (jSONArray == null) {
                jSONArray = new JSONArray();
            }
            jSONArray.put(m13840c);
            return jSONArray;
        } catch (Throwable unused2) {
            return jSONArray;
        }
    }

    /* renamed from: a */
    private JSONObject m13835a(String str, String str2, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            if (str2 == null) {
                jSONArray.put(C3303ay.f14049i);
                jSONObject.put(Constants.KEY_HTTP_CODE, jSONArray);
                jSONObject.put("pid", "");
                jSONObject.put("msg", str);
            } else if (str2.getBytes().length > 256) {
                if (z10) {
                    jSONArray.put(C3303ay.f14053m);
                } else {
                    jSONArray.put(C3303ay.f14050j);
                }
                jSONObject.put(Constants.KEY_HTTP_CODE, jSONArray);
                if (str2.length() > 256) {
                    str2 = str2.substring(0, 256);
                }
                jSONObject.put("pid", str2);
                jSONObject.put("msg", str);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
