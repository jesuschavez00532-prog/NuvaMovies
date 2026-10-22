package com.umeng.commonsdk.statistics;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.pro.C3298at;
import com.umeng.analytics.pro.C3323br;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.analytics.pro.C3349cq;
import com.umeng.analytics.pro.C3384f;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.internal.C3454c;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.stateless.C3477a;
import com.umeng.commonsdk.stateless.C3478b;
import com.umeng.commonsdk.stateless.C3480d;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.C3494f;
import com.umeng.commonsdk.statistics.idtracking.Envelope;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.C3519c;
import com.umeng.commonsdk.utils.C3520d;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.statistics.b */
/* loaded from: classes3.dex */
public class C3482b {

    /* renamed from: a */
    public static String f15388a = null;

    /* renamed from: b */
    public static String f15389b = "";

    /* renamed from: c */
    private static final String f15390c = "EnvelopeManager";

    /* renamed from: d */
    private static final String f15391d = "debug.umeng.umTaskId";

    /* renamed from: e */
    private static final String f15392e = "debug.umeng.umCaseId";

    /* renamed from: f */
    private static final String f15393f = "empty";

    /* renamed from: g */
    private static String f15394g = "";

    /* renamed from: h */
    private static String f15395h = "";

    /* renamed from: i */
    private static String f15396i;

    /* renamed from: j */
    private static Map<String, String> f15397j;

    /* renamed from: l */
    private static boolean f15398l;

    /* renamed from: k */
    private int f15399k = 0;

    static {
        HashMap hashMap = new HashMap();
        f15397j = hashMap;
        hashMap.put("header", "#h");
        f15397j.put(C3325bt.f14279u, "#sdt");
        f15397j.put(C3325bt.f14172Q, "#ac");
        f15397j.put("device_model", "#dm");
        f15397j.put(C3325bt.f14265g, "#umid");
        f15397j.put("os", "os");
        f15397j.put("language", "#lang");
        f15397j.put(C3325bt.f14217ai, "#dt");
        f15397j.put(C3325bt.f14284z, "#rl");
        f15397j.put(C3325bt.f14163H, "#dmf");
        f15397j.put(C3325bt.f14165J, "#dn");
        f15397j.put("platform_version", "#pv");
        f15397j.put("font_size_setting", "#fss");
        f15397j.put(C3325bt.f14283y, "#ov");
        f15397j.put(C3325bt.f14164I, "#did");
        f15397j.put("platform_sdk_version", "#psv");
        f15397j.put(C3325bt.f14161F, "#db");
        f15397j.put("appkey", "#ak");
        f15397j.put(C3325bt.f14180Y, "#itr");
        f15397j.put("id_type", "#it");
        f15397j.put("uuid", "#ud");
        f15397j.put("device_id", "#dd");
        f15397j.put(C3325bt.f14179X, "#imp");
        f15397j.put("sdk_version", "#sv");
        f15397j.put("st", "#st");
        f15397j.put("analytics", "#a");
        f15397j.put(C3325bt.f14273o, "#pkg");
        f15397j.put(C3325bt.f14274p, "#sig");
        f15397j.put(C3325bt.f14275q, "#sis1");
        f15397j.put(C3325bt.f14276r, "#sis");
        f15397j.put("app_version", "#av");
        f15397j.put("version_code", "#vc");
        f15397j.put(C3325bt.f14280v, "#imd");
        f15397j.put(C3325bt.f14157B, "#mnc");
        f15397j.put(C3325bt.f14160E, "#boa");
        f15397j.put(C3325bt.f14162G, "#mant");
        f15397j.put(C3325bt.f14168M, "#tz");
        f15397j.put(C3325bt.f14170O, "#ct");
        f15397j.put("carrier", "#car");
        f15397j.put(C3325bt.f14277s, "#disn");
        f15397j.put(C3325bt.f14175T, "#nt");
        f15397j.put(C3325bt.f14235b, "#cv");
        f15397j.put(C3325bt.f14262d, "#mv");
        f15397j.put(C3325bt.f14261c, "#cot");
        f15397j.put(C3325bt.f14263e, "#mod");
        f15397j.put(C3325bt.f14218aj, "#al");
        f15397j.put("session_id", "#sid");
        f15397j.put(C3325bt.f14174S, "#ip");
        f15397j.put(C3325bt.f14176U, "#sre");
        f15397j.put(C3325bt.f14177V, "#fre");
        f15397j.put(C3325bt.f14178W, "#ret");
        f15397j.put("channel", "#chn");
        f15397j.put("wrapper_type", "#wt");
        f15397j.put("wrapper_version", "#wv");
        f15397j.put(C3325bt.f14237bb, "#tsv");
        f15397j.put(C3325bt.f14238bc, "#rps");
        f15397j.put(C3325bt.f14243bh, "#mov");
        f15397j.put(C3384f.f14614i, "#vt");
        f15397j.put("secret", "#sec");
        f15397j.put(C3384f.f14594an, "#prv");
        f15397j.put(C3384f.f14617l, "#$prv");
        f15397j.put(C3384f.f14618m, "#uda");
        f15397j.put(C3325bt.f14182a, "#tok");
        f15397j.put(C3325bt.f14202aT, "#iv");
        f15397j.put(C3325bt.f14173R, "#ast");
        f15397j.put("backstate", "#bst");
        f15397j.put("zdata_ver", "#zv");
        f15397j.put("zdata_req_ts", "#zrt");
        f15397j.put("app_b_v", "#bv");
        f15397j.put("zdata", "#zta");
        f15397j.put(C3325bt.f14224ap, "#mt");
        f15397j.put(C3325bt.f14221am, "#zsv");
        f15397j.put("others_OS", "#oos");
    }

    /* renamed from: a */
    public static String m14744a(String str) {
        return f15397j.containsKey(str) ? f15397j.get(str) : str;
    }

    /* renamed from: b */
    private static boolean m14750b() {
        f15394g = UMUtils.getSystemProperty(f15391d, "");
        f15395h = UMUtils.getSystemProperty(f15392e, "");
        return (!TextUtils.isEmpty(f15394g) && !f15393f.equals(f15394g)) && (!TextUtils.isEmpty(f15395h) && !f15393f.equals(f15395h));
    }

    /* renamed from: a */
    public static void m14748a() {
        if (f15396i != null) {
            f15396i = null;
            C3494f.m14878a();
        }
    }

    /* renamed from: b */
    public JSONObject m14754b(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        Envelope envelope;
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(m14744a("header"), new JSONObject());
            try {
                if (m14750b()) {
                    jSONObject.put("umTaskId", f15394g);
                    jSONObject.put("umCaseId", f15395h);
                }
            } catch (Throwable unused) {
            }
            if (jSONObject != null) {
                jSONObject3 = m14747a(jSONObject3, jSONObject);
            }
            if (jSONObject3 != null && jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next != null && (next instanceof String)) {
                        String str2 = next;
                        if (jSONObject2.opt(str2) != null) {
                            try {
                                jSONObject3.put(str2, jSONObject2.opt(str2));
                            } catch (Exception unused2) {
                            }
                        }
                    }
                }
            }
            if (jSONObject3 != null && DataHelper.largeThanMaxSize(jSONObject3.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putInt("serial", sharedPreferences.getInt("serial", 1) + 1).commit();
                }
                return m14745a(113, jSONObject3);
            }
            if (jSONObject3 != null) {
                envelope = m14743a(context, jSONObject3.toString().getBytes());
                if (envelope == null) {
                    return m14745a(111, jSONObject3);
                }
            } else {
                envelope = null;
            }
            Envelope envelope2 = envelope;
            if (envelope2 != null && DataHelper.largeThanMaxSize(envelope2.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                return m14745a(114, jSONObject3);
            }
            int m14741a = m14741a(context, envelope2, "z==1.2.0", DeviceConfig.getAppVersionName(context), str);
            if (m14741a != 0) {
                return m14745a(m14741a, jSONObject3);
            }
            if (ULog.DEBUG) {
                Log.i(f15390c, "constructHeader size is " + jSONObject3.toString().getBytes().length);
            }
            return jSONObject3;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return m14745a(110, new JSONObject());
        }
    }

    /* renamed from: a */
    public static long m14742a(Context context) {
        long j10 = DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX - DataHelper.ENVELOPE_EXTRA_LENGTH;
        if (ULog.DEBUG) {
            Log.i(f15390c, "free size is " + j10);
        }
        return j10;
    }

    /* renamed from: a */
    private JSONObject m14745a(int i10, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("exception", i10);
            } catch (Exception unused) {
            }
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("exception", i10);
        } catch (Exception unused2) {
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public JSONObject m14753a(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) {
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        String str4;
        boolean z10;
        String str5;
        Envelope envelope;
        JSONObject optJSONObject;
        if (ULog.DEBUG && jSONObject != null && jSONObject2 != null) {
            Log.i(f15390c, "headerJSONObject size is " + jSONObject.toString().getBytes().length);
            Log.i(f15390c, "bodyJSONObject size is " + jSONObject2.toString().getBytes().length);
        }
        if (context != null && jSONObject2 != null) {
            try {
                if (jSONObject2.has("analytics") && (optJSONObject = jSONObject2.optJSONObject("analytics")) != null && optJSONObject.has(C3384f.f14619n)) {
                    str4 = str2;
                    z10 = true;
                } else {
                    str4 = str2;
                    z10 = false;
                }
                JSONObject m14746a = m14746a(context, str4, z10);
                if (m14746a != null && jSONObject != null) {
                    m14746a = m14747a(m14746a, jSONObject);
                }
                JSONObject jSONObject5 = m14746a;
                if (jSONObject5 != null) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (next != null && (next instanceof String)) {
                            String str6 = next;
                            if (jSONObject2.opt(str6) != null) {
                                try {
                                    jSONObject5.put(m14744a(str6), jSONObject2.opt(str6));
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                }
                if (TextUtils.isEmpty(str2)) {
                    str4 = C3325bt.f14196aN;
                }
                String str7 = TextUtils.isEmpty(str3) ? "1.0.0" : str3;
                if (jSONObject5 != null) {
                    String str8 = str4 + "==" + str7 + "&=";
                    if (TextUtils.isEmpty(str8)) {
                        return m14745a(101, jSONObject5);
                    }
                    if (str8.endsWith("&=")) {
                        str8 = str8.substring(0, str8.length() - 2);
                    }
                    str5 = str8;
                } else {
                    str5 = null;
                }
                if (jSONObject5 != null) {
                    try {
                        C3494f m14877a = C3494f.m14877a(context);
                        if (m14877a != null) {
                            m14877a.m14885b();
                            String encodeToString = Base64.encodeToString(new C3349cq().m14096a(m14877a.m14886c()), 0);
                            if (!TextUtils.isEmpty(encodeToString)) {
                                JSONObject jSONObject6 = jSONObject5.getJSONObject(m14744a("header"));
                                jSONObject6.put(m14744a(C3325bt.f14180Y), encodeToString);
                                jSONObject5.put(m14744a("header"), jSONObject6);
                            }
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (jSONObject5 != null && DataHelper.largeThanMaxSize(jSONObject5.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                    SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putInt("serial", sharedPreferences.getInt("serial", 1) + 1).commit();
                    }
                    return m14745a(113, jSONObject5);
                }
                if (jSONObject5 != null) {
                    Envelope m14743a = m14743a(context, jSONObject5.toString().getBytes());
                    if (m14743a == null) {
                        return m14745a(111, jSONObject5);
                    }
                    envelope = m14743a;
                } else {
                    envelope = null;
                }
                if (envelope != null && DataHelper.largeThanMaxSize(envelope.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                    return m14745a(114, jSONObject5);
                }
                int m14741a = m14741a(context, envelope, str5, jSONObject5 != null ? jSONObject5.optJSONObject(m14744a("header")).optString(m14744a("app_version")) : null, str);
                if (m14741a != 0) {
                    return m14745a(m14741a, jSONObject5);
                }
                if (ULog.DEBUG) {
                    Log.i(f15390c, "constructHeader size is " + jSONObject5.toString().getBytes().length);
                }
                if (!str5.startsWith(C3325bt.f14192aJ) && !str5.startsWith(C3325bt.f14191aI) && !str5.startsWith("t") && !str5.startsWith("a") && !C3478b.m14698a()) {
                    new C3478b(context);
                    C3478b.m14699b();
                }
                return jSONObject5;
            } catch (Throwable th) {
                UMCrashManager.reportCrash(context, th);
                if (jSONObject != null) {
                    try {
                        jSONObject4 = new JSONObject();
                    } catch (Exception e10) {
                        e = e10;
                        jSONObject3 = null;
                    }
                    try {
                        jSONObject4.put("header", jSONObject);
                    } catch (JSONException unused3) {
                    } catch (Exception e11) {
                        e = e11;
                        jSONObject3 = jSONObject4;
                        UMCrashManager.reportCrash(context, e);
                        return m14745a(110, jSONObject3);
                    }
                    jSONObject3 = jSONObject4;
                } else {
                    jSONObject3 = null;
                }
                if (jSONObject3 == null) {
                    try {
                        jSONObject3 = new JSONObject();
                    } catch (Exception e12) {
                        e = e12;
                        UMCrashManager.reportCrash(context, e);
                        return m14745a(110, jSONObject3);
                    }
                }
                Iterator<String> keys2 = jSONObject2.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    if (next2 != null && (next2 instanceof String)) {
                        String str9 = next2;
                        if (jSONObject2.opt(str9) != null) {
                            try {
                                jSONObject3.put(str9, jSONObject2.opt(str9));
                            } catch (Exception unused4) {
                            }
                        }
                    }
                }
                return m14745a(110, jSONObject3);
            }
        }
        return m14745a(110, (JSONObject) null);
    }

    /* renamed from: b */
    private static int[] m14751b(Context context) {
        int[] iArr = new int[3];
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(C3454c.f15290a, 0);
            if (sharedPreferences != null) {
                iArr[0] = sharedPreferences.getInt(C3454c.f15291b, 0);
                iArr[1] = sharedPreferences.getInt(C3454c.f15292c, 0);
                iArr[2] = sharedPreferences.getInt("policyGrantResult", 0);
            }
        } catch (Throwable unused) {
        }
        return iArr;
    }

    /* renamed from: a */
    public JSONObject m14752a(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        Envelope envelope;
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(m14744a("header"), new JSONObject());
            if (jSONObject != null) {
                jSONObject3 = m14747a(jSONObject3, jSONObject);
            }
            if (jSONObject3 != null && jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next != null && (next instanceof String)) {
                        String str2 = next;
                        if (jSONObject2.opt(str2) != null) {
                            try {
                                jSONObject3.put(str2, jSONObject2.opt(str2));
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
            if (jSONObject3 != null && DataHelper.largeThanMaxSize(jSONObject3.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putInt("serial", sharedPreferences.getInt("serial", 1) + 1).commit();
                }
                return m14745a(113, jSONObject3);
            }
            if (jSONObject3 != null) {
                envelope = m14743a(context, jSONObject3.toString().getBytes());
                if (envelope == null) {
                    return m14745a(111, jSONObject3);
                }
            } else {
                envelope = null;
            }
            Envelope envelope2 = envelope;
            if (envelope2 != null && DataHelper.largeThanMaxSize(envelope2.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                return m14745a(114, jSONObject3);
            }
            int m14741a = m14741a(context, envelope2, "h==1.2.0", "", str);
            if (m14741a != 0) {
                return m14745a(m14741a, jSONObject3);
            }
            if (ULog.DEBUG) {
                Log.i(f15390c, "constructHeader size is " + jSONObject3.toString().getBytes().length);
            }
            return jSONObject3;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return m14745a(110, new JSONObject());
        }
    }

    /* renamed from: a */
    private static JSONObject m14746a(Context context, String str, boolean z10) {
        SharedPreferences sharedPreferences;
        JSONObject jSONObject;
        try {
            SharedPreferences sharedPreferences2 = PreferenceWrapper.getDefault(context);
            if (!TextUtils.isEmpty(f15396i)) {
                try {
                    jSONObject = new JSONObject(f15396i);
                    sharedPreferences = sharedPreferences2;
                } catch (Exception unused) {
                    sharedPreferences = sharedPreferences2;
                    jSONObject = null;
                }
            } else {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(m14744a(C3325bt.f14274p), DeviceConfig.getAppMD5Signature(context));
                jSONObject2.put(m14744a(C3325bt.f14275q), DeviceConfig.getAppSHA1Key(context));
                jSONObject2.put(m14744a(C3325bt.f14276r), DeviceConfig.getAppHashKey(context));
                jSONObject2.put(m14744a("app_version"), DeviceConfig.getAppVersionName(context));
                jSONObject2.put(m14744a("version_code"), Integer.parseInt(DeviceConfig.getAppVersionCode(context)));
                jSONObject2.put(m14744a(C3325bt.f14280v), DeviceConfig.getDeviceIdUmengMD5(context));
                jSONObject2.put(m14744a(C3325bt.f14281w), DeviceConfig.getCPU());
                String mccmnc = DeviceConfig.getMCCMNC(context);
                if (!TextUtils.isEmpty(mccmnc)) {
                    jSONObject2.put(m14744a(C3325bt.f14157B), mccmnc);
                    f15389b = mccmnc;
                } else {
                    jSONObject2.put(m14744a(C3325bt.f14157B), "");
                }
                if (FieldManager.allow(C3520d.f15638I)) {
                    String subOSName = DeviceConfig.getSubOSName(context);
                    if (!TextUtils.isEmpty(subOSName)) {
                        jSONObject2.put(m14744a(C3325bt.f14166K), subOSName);
                    }
                    String subOSVersion = DeviceConfig.getSubOSVersion(context);
                    if (!TextUtils.isEmpty(subOSVersion)) {
                        jSONObject2.put(m14744a(C3325bt.f14167L), subOSVersion);
                    }
                }
                String deviceType = DeviceConfig.getDeviceType(context);
                if (!TextUtils.isEmpty(deviceType)) {
                    jSONObject2.put(m14744a(C3325bt.f14217ai), deviceType);
                }
                jSONObject2.put(m14744a(C3325bt.f14273o), DeviceConfig.getPackageName(context));
                jSONObject2.put(m14744a(C3325bt.f14279u), "Android");
                jSONObject2.put(m14744a("device_id"), DeviceConfig.getDeviceId(context));
                jSONObject2.put(m14744a("device_model"), Build.MODEL);
                jSONObject2.put(m14744a(C3325bt.f14160E), Build.BOARD);
                jSONObject2.put(m14744a(C3325bt.f14161F), Build.BRAND);
                sharedPreferences = sharedPreferences2;
                jSONObject2.put(m14744a(C3325bt.f14162G), Build.TIME);
                jSONObject2.put(m14744a(C3325bt.f14163H), Build.MANUFACTURER);
                jSONObject2.put(m14744a(C3325bt.f14164I), Build.ID);
                jSONObject2.put(m14744a(C3325bt.f14165J), Build.DEVICE);
                jSONObject2.put(m14744a(C3325bt.f14283y), Build.VERSION.RELEASE);
                jSONObject2.put(m14744a("os"), "Android");
                int[] resolutionArray = DeviceConfig.getResolutionArray(context);
                if (resolutionArray != null) {
                    jSONObject2.put(m14744a(C3325bt.f14284z), resolutionArray[1] + Operator.Operation.MULTIPLY + resolutionArray[0]);
                }
                jSONObject2.put(m14744a(C3325bt.f14156A), DeviceConfig.getMac(context));
                jSONObject2.put(m14744a(C3325bt.f14168M), DeviceConfig.getTimeZone(context));
                String[] localeInfo = DeviceConfig.getLocaleInfo(context);
                jSONObject2.put(m14744a(C3325bt.f14170O), localeInfo[0]);
                jSONObject2.put(m14744a("language"), localeInfo[1]);
                jSONObject2.put(m14744a("carrier"), DeviceConfig.getNetworkOperatorName(context));
                jSONObject2.put(m14744a(C3325bt.f14277s), DeviceConfig.getAppName(context));
                String[] networkAccessMode = DeviceConfig.getNetworkAccessMode(context);
                if ("Wi-Fi".equals(networkAccessMode[0])) {
                    jSONObject2.put(m14744a(C3325bt.f14172Q), "wifi");
                } else if ("2G/3G".equals(networkAccessMode[0])) {
                    jSONObject2.put(m14744a(C3325bt.f14172Q), "2G/3G");
                } else {
                    jSONObject2.put(m14744a(C3325bt.f14172Q), "unknow");
                }
                if (!"".equals(networkAccessMode[1])) {
                    jSONObject2.put(m14744a(C3325bt.f14173R), networkAccessMode[1]);
                }
                if (DeviceConfig.isHarmony(context)) {
                    jSONObject2.put(m14744a("others_OS"), "harmony");
                } else {
                    jSONObject2.put(m14744a("others_OS"), "Android");
                }
                jSONObject2.put(m14744a(C3325bt.f14175T), DeviceConfig.getNetworkType(context));
                jSONObject2.put(m14744a(C3325bt.f14235b), "9.7.9");
                jSONObject2.put(m14744a(C3325bt.f14261c), SdkVersion.SDK_TYPE);
                jSONObject2.put(m14744a(C3325bt.f14262d), "1");
                if (!TextUtils.isEmpty(f15388a)) {
                    jSONObject2.put(m14744a(C3325bt.f14263e), f15388a);
                }
                jSONObject2.put(m14744a(C3325bt.f14218aj), Build.VERSION.SDK_INT);
                if (!TextUtils.isEmpty(UMUtils.VALUE_REC_VERSION_NAME)) {
                    jSONObject2.put(m14744a(C3325bt.f14214af), UMUtils.VALUE_REC_VERSION_NAME);
                }
                try {
                    String uUIDForZid = UMUtils.getUUIDForZid(context);
                    if (TextUtils.isEmpty(uUIDForZid)) {
                        UMUtils.setUUIDForZid(context);
                        uUIDForZid = UMUtils.getUUIDForZid(context);
                    }
                    jSONObject2.put(m14744a("session_id"), uUIDForZid);
                } catch (Throwable unused2) {
                }
                try {
                    if (DeviceConfig.hasRequestPermission(context, "android.permission.PACKAGE_USAGE_STATS")) {
                        jSONObject2.put(C3325bt.f14226ar, "1");
                        if (DeviceConfig.hasOpsPermission(context.getApplicationContext())) {
                            jSONObject2.put(C3325bt.f14227as, "1");
                        }
                    }
                    if (DeviceConfig.isSystemApp(context)) {
                        jSONObject2.put(C3325bt.f14225aq, "1");
                    }
                } catch (Throwable unused3) {
                }
                if (DeviceConfig.isHonorDevice()) {
                    try {
                        if (C3323br.m13890c()) {
                            jSONObject2.put(C3325bt.f14228at, 2);
                        }
                        if (C3323br.m13889b()) {
                            jSONObject2.put(C3325bt.f14228at, 3);
                        }
                    } catch (Throwable unused4) {
                    }
                }
                try {
                    jSONObject2.put(C3325bt.f14229au, DeviceConfig.getNotificationStatus(context));
                } catch (Throwable unused5) {
                }
                try {
                    jSONObject2.put(C3325bt.f14230av, DeviceConfig.getRingerMode(context));
                } catch (Throwable unused6) {
                }
                f15396i = jSONObject2.toString();
                jSONObject = jSONObject2;
            }
            if (jSONObject == null) {
                return null;
            }
            try {
                jSONObject.put(m14744a(C3325bt.f14219ak), UMUtils.getOaidRequiredTime(context));
            } catch (Exception unused7) {
            }
            try {
                SharedPreferences sharedPreferences3 = sharedPreferences;
                jSONObject.put(m14744a(C3325bt.f14176U), sharedPreferences3.getInt("successful_request", 0));
                jSONObject.put(m14744a(C3325bt.f14177V), sharedPreferences3.getInt(C3325bt.f14177V, 0));
                jSONObject.put(m14744a(C3325bt.f14178W), sharedPreferences3.getInt("last_request_spent_ms", 0));
                String zid = UMUtils.getZid(context);
                if (!TextUtils.isEmpty(zid)) {
                    jSONObject.put(m14744a(C3325bt.f14220al), zid);
                }
                if (!TextUtils.isEmpty(UMUtils.VALUE_ASMS_VERSION)) {
                    jSONObject.put(m14744a(C3325bt.f14221am), UMUtils.VALUE_ASMS_VERSION);
                }
            } catch (Exception unused8) {
            }
            jSONObject.put(m14744a("channel"), UMUtils.getChannel(context));
            jSONObject.put(m14744a("appkey"), UMUtils.getAppkey(context));
            try {
                String deviceToken = UMUtils.getDeviceToken(context);
                if (!TextUtils.isEmpty(deviceToken)) {
                    jSONObject.put(m14744a(C3325bt.f14182a), deviceToken);
                }
            } catch (Exception e10) {
                UMCrashManager.reportCrash(context, e10);
            }
            try {
                String imprintProperty = UMEnvelopeBuild.imprintProperty(context, C3325bt.f14265g, null);
                if (!TextUtils.isEmpty(imprintProperty)) {
                    jSONObject.put(m14744a(C3325bt.f14265g), imprintProperty);
                }
            } catch (Exception e11) {
                UMCrashManager.reportCrash(context, e11);
            }
            try {
                jSONObject.put(m14744a("wrapper_type"), C3481a.f15385a);
                jSONObject.put(m14744a("wrapper_version"), C3481a.f15386b);
            } catch (Exception unused9) {
            }
            try {
                int targetSdkVersion = UMUtils.getTargetSdkVersion(context);
                boolean checkPermission = UMUtils.checkPermission(context, "android.permission.READ_PHONE_STATE");
                jSONObject.put(m14744a(C3325bt.f14237bb), targetSdkVersion);
                if (checkPermission) {
                    jSONObject.put(m14744a(C3325bt.f14238bc), "yes");
                } else {
                    jSONObject.put(m14744a(C3325bt.f14238bc), "no");
                }
            } catch (Throwable unused10) {
            }
            try {
                if (m14750b()) {
                    jSONObject.put("umTaskId", f15394g);
                    jSONObject.put("umCaseId", f15395h);
                }
            } catch (Throwable unused11) {
            }
            if (("t".equals(str) || "a".equals(str)) && z10) {
                try {
                    int[] m14751b = m14751b(context);
                    jSONObject.put(m14744a(C3325bt.f14260by), String.valueOf(m14751b[0]) + String.valueOf(m14751b[1]) + String.valueOf(m14751b[2]));
                } catch (Throwable unused12) {
                }
            }
            try {
                Map<String, String> moduleTags = TagHelper.getModuleTags();
                if (moduleTags != null && moduleTags.size() > 0) {
                    JSONObject jSONObject3 = new JSONObject();
                    for (Map.Entry<String, String> entry : moduleTags.entrySet()) {
                        jSONObject3.put(entry.getKey(), entry.getValue());
                    }
                    jSONObject.put(m14744a(C3325bt.f14224ap), jSONObject3);
                }
            } catch (Throwable unused13) {
            }
            try {
                String realTimeDebugKey = AnalyticsConfig.getRealTimeDebugKey();
                if (!TextUtils.isEmpty(realTimeDebugKey)) {
                    jSONObject.put(m14744a(C3325bt.f14259bx), realTimeDebugKey);
                }
            } catch (Throwable unused14) {
            }
            try {
                JSONObject moduleVer = UMUtils.getModuleVer();
                if (moduleVer.length() > 0) {
                    jSONObject.put(m14744a(C3325bt.f14243bh), moduleVer);
                }
            } catch (Throwable unused15) {
            }
            try {
                String apmFlag = UMUtils.getApmFlag();
                if (!TextUtils.isEmpty(apmFlag)) {
                    jSONObject.put(m14744a(C3325bt.f14258bw), apmFlag);
                }
            } catch (Throwable unused16) {
            }
            try {
                String str2 = Build.BRAND;
                String m13799a = C3298at.m13799a(str2);
                String m13801b = C3298at.m13801b(str2);
                jSONObject.put(C3325bt.f14241bf, m13799a);
                jSONObject.put(C3325bt.f14242bg, m13801b);
            } catch (Throwable unused17) {
            }
            byte[] m14856a = ImprintHandler.getImprintService(context).m14856a();
            if (m14856a != null && m14856a.length > 0) {
                try {
                    jSONObject.put(m14744a(C3325bt.f14179X), Base64.encodeToString(m14856a, 0));
                } catch (JSONException e12) {
                    UMCrashManager.reportCrash(context, e12);
                }
            }
            if (jSONObject.length() > 0) {
                return new JSONObject().put(m14744a("header"), jSONObject);
            }
            return null;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return null;
        }
    }

    /* renamed from: a */
    private JSONObject m14747a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null && jSONObject.opt(m14744a("header")) != null && (jSONObject.opt(m14744a("header")) instanceof JSONObject)) {
            JSONObject jSONObject3 = (JSONObject) jSONObject.opt(m14744a("header"));
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && (next instanceof String)) {
                    String str = next;
                    if (jSONObject2.opt(str) != null) {
                        try {
                            jSONObject3.put(str, jSONObject2.opt(str));
                            if (str.equals(m14744a(C3384f.f14614i)) && (jSONObject2.opt(str) instanceof Integer)) {
                                this.f15399k = ((Integer) jSONObject2.opt(str)).intValue();
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private Envelope m14743a(Context context, byte[] bArr) {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(context, "codex", null);
        int i10 = -1;
        try {
            if (!TextUtils.isEmpty(imprintProperty)) {
                i10 = Integer.valueOf(imprintProperty).intValue();
            }
        } catch (NumberFormatException e10) {
            UMCrashManager.reportCrash(context, e10);
        }
        if (i10 == 0) {
            return Envelope.genEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        if (i10 == 1) {
            return Envelope.genEncryptEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        if (f15398l) {
            return Envelope.genEncryptEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        return Envelope.genEnvelope(context, UMUtils.getAppkey(context), bArr);
    }

    /* renamed from: a */
    private int m14741a(Context context, Envelope envelope, String str, String str2, String str3) {
        if (context == null || envelope == null || TextUtils.isEmpty(str)) {
            return 101;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = DeviceConfig.getAppVersionName(context);
        }
        String m14730b = C3480d.m14730b(str3);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("&&");
        sb2.append(str2);
        sb2.append("_");
        sb2.append(System.currentTimeMillis());
        sb2.append("_");
        sb2.append(m14730b);
        sb2.append(".log");
        byte[] binary = envelope.toBinary();
        if (C3519c.m15122a()) {
            if (str.startsWith(C3325bt.f14195aM)) {
                return UMFrUtils.saveEnvelopeFile(context, sb2.toString(), binary);
            }
            return 122;
        }
        if (str.startsWith(C3325bt.f14195aM)) {
            return 122;
        }
        if (!str.startsWith(C3325bt.f14192aJ) && !str.startsWith(C3325bt.f14191aI) && !str.startsWith("a") && !str.startsWith("t")) {
            return C3480d.m14720a(context, C3477a.f15360f, sb2.toString(), binary);
        }
        return UMFrUtils.saveEnvelopeFile(context, sb2.toString(), binary);
    }

    /* renamed from: a */
    public static void m14749a(boolean z10) {
        f15398l = z10;
    }
}
