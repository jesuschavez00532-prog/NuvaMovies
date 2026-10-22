package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.C3272b;
import com.umeng.analytics.C3273c;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.process.UMProcessDBHelper;
import com.umeng.common.C3422b;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.C3482b;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ReportPolicy;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.noise.ABTest;
import com.umeng.commonsdk.statistics.noise.Defcon;
import com.umeng.commonsdk.utils.C3519c;
import com.umeng.commonsdk.utils.C3520d;
import com.umeng.commonsdk.utils.JSONArraySortUtil;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.umcrash.UMCrashUtils;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.android.agoo.message.MessageService;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.q */
/* loaded from: classes3.dex */
public class C3395q {

    /* renamed from: a */
    private static Context f14824a = null;

    /* renamed from: l */
    private static final String f14825l = "first_activate_time";

    /* renamed from: m */
    private static final String f14826m = "ana_is_f";

    /* renamed from: n */
    private static final String f14827n = "thtstart";

    /* renamed from: o */
    private static final String f14828o = "dstk_last_time";

    /* renamed from: p */
    private static final String f14829p = "dstk_cnt";

    /* renamed from: q */
    private static final String f14830q = "gkvc";

    /* renamed from: r */
    private static final String f14831r = "ekvc";

    /* renamed from: t */
    private static final String f14832t = "-1";

    /* renamed from: x */
    private static final String f14833x = "com.umeng.umcrash.UMCrashUtils";

    /* renamed from: y */
    private static Class<?> f14834y;

    /* renamed from: z */
    private static Method f14835z;

    /* renamed from: b */
    private c f14836b;

    /* renamed from: c */
    private SharedPreferences f14837c;

    /* renamed from: d */
    private String f14838d;

    /* renamed from: e */
    private String f14839e;

    /* renamed from: f */
    private int f14840f;

    /* renamed from: g */
    private JSONArray f14841g;

    /* renamed from: h */
    private final int f14842h;

    /* renamed from: i */
    private int f14843i;

    /* renamed from: j */
    private int f14844j;

    /* renamed from: k */
    private long f14845k;

    /* renamed from: s */
    private final long f14846s;

    /* renamed from: u */
    private boolean f14847u;

    /* renamed from: v */
    private boolean f14848v;

    /* renamed from: w */
    private Object f14849w;

    /* renamed from: com.umeng.analytics.pro.q$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: A */
        public static final int f14850A = 8209;

        /* renamed from: B */
        public static final int f14851B = 8210;

        /* renamed from: C */
        public static final int f14852C = 8211;

        /* renamed from: D */
        public static final int f14853D = 8212;

        /* renamed from: E */
        public static final int f14854E = 8213;

        /* renamed from: F */
        public static final int f14855F = 8214;

        /* renamed from: G */
        public static final int f14856G = 8215;

        /* renamed from: a */
        public static final int f14857a = 4097;

        /* renamed from: b */
        public static final int f14858b = 4098;

        /* renamed from: c */
        public static final int f14859c = 4099;

        /* renamed from: d */
        public static final int f14860d = 4100;

        /* renamed from: e */
        public static final int f14861e = 4101;

        /* renamed from: f */
        public static final int f14862f = 4102;

        /* renamed from: g */
        public static final int f14863g = 4103;

        /* renamed from: h */
        public static final int f14864h = 4104;

        /* renamed from: i */
        public static final int f14865i = 4105;

        /* renamed from: j */
        public static final int f14866j = 4106;

        /* renamed from: k */
        public static final int f14867k = 4352;

        /* renamed from: l */
        public static final int f14868l = 4353;

        /* renamed from: m */
        public static final int f14869m = 4354;

        /* renamed from: n */
        public static final int f14870n = 4355;

        /* renamed from: o */
        public static final int f14871o = 4356;

        /* renamed from: p */
        public static final int f14872p = 4357;

        /* renamed from: q */
        public static final int f14873q = 4358;

        /* renamed from: r */
        public static final int f14874r = 8193;

        /* renamed from: s */
        public static final int f14875s = 8194;

        /* renamed from: t */
        public static final int f14876t = 8195;

        /* renamed from: u */
        public static final int f14877u = 8196;

        /* renamed from: v */
        public static final int f14878v = 8197;

        /* renamed from: w */
        public static final int f14879w = 8199;

        /* renamed from: x */
        public static final int f14880x = 8200;

        /* renamed from: y */
        public static final int f14881y = 8201;

        /* renamed from: z */
        public static final int f14882z = 8208;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.analytics.pro.q$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        private static final C3395q f14883a = new C3395q();

        private b() {
        }
    }

    static {
        m14349h();
    }

    /* renamed from: a */
    public static C3395q m14330a(Context context) {
        if (f14824a == null && context != null) {
            f14824a = context.getApplicationContext();
        }
        return b.f14883a;
    }

    /* renamed from: e */
    private void m14342e(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (2050 == jSONObject.getInt("__t")) {
                if (!m14333a(this.f14845k, this.f14843i)) {
                    return;
                } else {
                    this.f14843i++;
                }
            } else if (2049 == jSONObject.getInt("__t")) {
                if (!m14333a(this.f14845k, this.f14844j)) {
                    return;
                } else {
                    this.f14844j++;
                }
            }
            if (AnalyticsConfig.isRealTimeDebugMode()) {
                if (this.f14841g == null) {
                    this.f14841g = new JSONArray();
                }
                this.f14841g.put(jSONObject);
                C3389k.m14262a(f14824a).m14277a(this.f14841g);
                this.f14841g = new JSONArray();
                return;
            }
            if (this.f14841g.length() >= this.f14840f) {
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>>*** 超过10个事件，事件落库。");
                C3389k.m14262a(f14824a).m14277a(this.f14841g);
                this.f14841g = new JSONArray();
            }
            if (this.f14845k == 0) {
                this.f14845k = System.currentTimeMillis();
            }
            this.f14841g.put(jSONObject);
        } catch (Throwable th) {
            MLog.m14769e(th);
        }
    }

    /* renamed from: f */
    private void m14345f(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        try {
            if (jSONObject.getJSONObject(C3482b.m14744a("header")).has(C3384f.f14574aH)) {
                if (jSONObject.has("content")) {
                    jSONObject = jSONObject.getJSONObject("content");
                }
                if (jSONObject.has(C3482b.m14744a("analytics"))) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(C3482b.m14744a("analytics"));
                    if (jSONObject2.has(C3384f.f14619n) && (optJSONObject2 = jSONObject2.getJSONArray(C3384f.f14619n).optJSONObject(0)) != null) {
                        String optString = optJSONObject2.optString("id");
                        if (!TextUtils.isEmpty(optString)) {
                            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> removeAllInstantData: really delete instant session data");
                            C3389k.m14262a(f14824a).m14284b(optString);
                        }
                    }
                }
                C3389k.m14262a(f14824a).m14283b();
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> removeAllInstantData: send INSTANT_SESSION_START_CONTINUE event because OVERSIZE.");
                Context context = f14824a;
                UMWorkDispatch.sendEvent(context, a.f14868l, CoreProtocol.getInstance(context), null);
                return;
            }
            if (jSONObject.has("content")) {
                jSONObject = jSONObject.getJSONObject("content");
            }
            if (jSONObject.has(C3482b.m14744a("analytics")) && (optJSONObject = jSONObject.optJSONObject(C3482b.m14744a("analytics"))) != null && optJSONObject.length() > 0 && optJSONObject.has(C3384f.f14619n)) {
                C3389k.m14262a(f14824a).m14279a(true, false);
            }
            C3389k.m14262a(f14824a).m14283b();
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    private static void m14349h() {
        try {
            f14834y = UMCrashUtils.class;
            Method declaredMethod = UMCrashUtils.class.getDeclaredMethod("setPuidAndProvider", String.class, String.class);
            if (declaredMethod != null) {
                f14835z = declaredMethod;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: i */
    private void m14351i() {
        JSONObject m14368b = m14368b(UMEnvelopeBuild.maxDataSpace(f14824a));
        if (m14368b != null && m14368b.length() >= 1) {
            JSONObject jSONObject = (JSONObject) m14368b.opt("header");
            JSONObject jSONObject2 = (JSONObject) m14368b.opt("content");
            if (f14824a != null && jSONObject != null && jSONObject2 != null) {
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> constructInstantMessage: request build envelope.");
                JSONObject buildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(f14824a, jSONObject, jSONObject2);
                if (buildEnvelopeWithExtHeader != null) {
                    try {
                        if (buildEnvelopeWithExtHeader.has("exception")) {
                            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "Build envelope error code: " + buildEnvelopeWithExtHeader.getInt("exception"));
                        }
                    } catch (Throwable unused) {
                    }
                    if (UMConfigure.isDebugLog()) {
                        m14343e(buildEnvelopeWithExtHeader);
                    }
                    m14372b((Object) buildEnvelopeWithExtHeader);
                }
            }
        }
    }

    /* renamed from: j */
    private void m14352j() {
        JSONObject buildEnvelopeWithExtHeader;
        JSONObject m14362a = m14362a(UMEnvelopeBuild.maxDataSpace(f14824a));
        if (m14362a != null && m14362a.length() >= 1) {
            JSONObject jSONObject = (JSONObject) m14362a.opt("header");
            JSONObject jSONObject2 = (JSONObject) m14362a.opt("content");
            Context context = f14824a;
            if (context != null && jSONObject != null && jSONObject2 != null && (buildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(context, jSONObject, jSONObject2)) != null) {
                try {
                    if (buildEnvelopeWithExtHeader.has("exception")) {
                        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "Build envelope error code: " + buildEnvelopeWithExtHeader.getInt("exception"));
                    }
                } catch (Throwable unused) {
                }
                if (UMConfigure.isDebugLog()) {
                    m14340d(buildEnvelopeWithExtHeader);
                }
                m14364a((Object) buildEnvelopeWithExtHeader);
            }
        }
    }

    /* renamed from: k */
    private JSONObject m14353k() {
        JSONObject m14354l = m14354l();
        if (m14354l != null) {
            try {
                m14354l.put("st", "1");
            } catch (Throwable unused) {
            }
        }
        return m14354l;
    }

    /* renamed from: l */
    private JSONObject m14354l() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (AnalyticsConfig.mWrapperType != null && AnalyticsConfig.mWrapperVersion != null) {
                jSONObject.put(C3482b.m14744a("wrapper_version"), AnalyticsConfig.mWrapperVersion);
                jSONObject.put(C3482b.m14744a("wrapper_type"), AnalyticsConfig.mWrapperType);
            }
            int verticalType = AnalyticsConfig.getVerticalType(f14824a);
            jSONObject.put(C3482b.m14744a(C3384f.f14614i), verticalType);
            String str = "9.7.9";
            if (verticalType == 1) {
                String gameSdkVersion = AnalyticsConfig.getGameSdkVersion(f14824a);
                if (!TextUtils.isEmpty(gameSdkVersion)) {
                    str = gameSdkVersion;
                }
                jSONObject.put(C3482b.m14744a("sdk_version"), str);
            } else {
                jSONObject.put(C3482b.m14744a("sdk_version"), "9.7.9");
            }
            String MD5 = HelperUtils.MD5(AnalyticsConfig.getSecretKey(f14824a));
            if (!TextUtils.isEmpty(MD5)) {
                jSONObject.put(C3482b.m14744a("secret"), MD5);
            }
            String imprintProperty = UMEnvelopeBuild.imprintProperty(f14824a, "pr_ve", null);
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f14824a);
            String imprintProperty2 = UMEnvelopeBuild.imprintProperty(f14824a, C3384f.f14600at, "");
            if (!TextUtils.isEmpty(imprintProperty2)) {
                if (AnalyticsConfig.CLEAR_EKV_BL) {
                    jSONObject.put(C3482b.m14744a(C3384f.f14602av), "");
                } else {
                    jSONObject.put(C3482b.m14744a(C3384f.f14602av), imprintProperty2);
                }
            }
            String imprintProperty3 = UMEnvelopeBuild.imprintProperty(f14824a, C3384f.f14601au, "");
            if (!TextUtils.isEmpty(imprintProperty3)) {
                if (AnalyticsConfig.CLEAR_EKV_WL) {
                    jSONObject.put(C3482b.m14744a(C3384f.f14603aw), "");
                } else {
                    jSONObject.put(C3482b.m14744a(C3384f.f14603aw), imprintProperty3);
                }
            }
            jSONObject.put(C3482b.m14744a(C3384f.f14594an), "1.0.0");
            if (m14361s()) {
                jSONObject.put(C3482b.m14744a(C3384f.f14596ap), "1");
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putLong(f14826m, 0L).commit();
                }
            }
            jSONObject.put(C3482b.m14744a(C3384f.f14617l), m14355m());
            jSONObject.put(C3482b.m14744a(C3384f.f14618m), m14356n());
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString("vers_name", "");
                if (!TextUtils.isEmpty(string)) {
                    String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    if (TextUtils.isEmpty(imprintProperty)) {
                        jSONObject.put(C3482b.m14744a(C3384f.f14617l), sharedPreferences.getString("vers_pre_version", MessageService.MSG_DB_READY_REPORT));
                        jSONObject.put(C3482b.m14744a(C3384f.f14618m), sharedPreferences.getString("vers_date", format));
                    }
                    sharedPreferences.edit().putString("pre_version", string).putString("cur_version", DeviceConfig.getAppVersionName(f14824a)).putString("pre_date", format).remove("vers_name").remove("vers_code").remove("vers_date").remove("vers_pre_version").commit();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: m */
    private String m14355m() {
        String str = MessageService.MSG_DB_READY_REPORT;
        String str2 = null;
        try {
            str2 = UMEnvelopeBuild.imprintProperty(f14824a, "pr_ve", null);
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(this.f14838d)) {
                return this.f14838d;
            }
            if (this.f14837c == null) {
                this.f14837c = PreferenceWrapper.getDefault(f14824a);
            }
            String string = this.f14837c.getString("pre_version", "");
            String appVersionName = DeviceConfig.getAppVersionName(f14824a);
            if (TextUtils.isEmpty(string)) {
                this.f14837c.edit().putString("pre_version", MessageService.MSG_DB_READY_REPORT).putString("cur_version", appVersionName).commit();
            } else {
                str = this.f14837c.getString("cur_version", "");
                if (!appVersionName.equals(str)) {
                    this.f14837c.edit().putString("pre_version", str).putString("cur_version", appVersionName).commit();
                } else {
                    str = string;
                }
            }
            this.f14838d = str;
            return str;
        }
        str = str2;
        this.f14838d = str;
        return str;
    }

    /* renamed from: n */
    private String m14356n() {
        String str = null;
        try {
            str = UMEnvelopeBuild.imprintProperty(f14824a, "ud_da", null);
            if (TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(this.f14839e)) {
                    return this.f14839e;
                }
                if (this.f14837c == null) {
                    this.f14837c = PreferenceWrapper.getDefault(f14824a);
                }
                String string = this.f14837c.getString("pre_date", "");
                if (TextUtils.isEmpty(string)) {
                    string = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    this.f14837c.edit().putString("pre_date", string).commit();
                } else {
                    String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    if (!string.equals(format)) {
                        this.f14837c.edit().putString("pre_date", format).commit();
                        str = format;
                    }
                }
                str = string;
            }
        } catch (Throwable unused) {
        }
        this.f14839e = str;
        return str;
    }

    /* renamed from: o */
    private void m14357o() {
        try {
            this.f14843i = 0;
            this.f14844j = 0;
            this.f14845k = System.currentTimeMillis();
            PreferenceWrapper.getDefault(f14824a).edit().putLong(f14828o, System.currentTimeMillis()).putInt(f14829p, 0).commit();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: p */
    private boolean m14358p() {
        try {
            if (!TextUtils.isEmpty(C3401w.m14419a().m14429b())) {
                m14371b(f14824a);
            }
            if (this.f14841g.length() <= 0) {
                return false;
            }
            for (int i10 = 0; i10 < this.f14841g.length(); i10++) {
                JSONObject optJSONObject = this.f14841g.optJSONObject(i10);
                if (optJSONObject != null && optJSONObject.length() > 0) {
                    String optString = optJSONObject.optString("__i");
                    if (TextUtils.isEmpty(optString) || f14832t.equals(optString)) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: q */
    private void m14359q() {
        if (this.f14841g.length() > 0) {
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < this.f14841g.length(); i10++) {
                try {
                    JSONObject jSONObject = this.f14841g.getJSONObject(i10);
                    if (jSONObject != null && jSONObject.length() > 0) {
                        String optString = jSONObject.optString("__i");
                        boolean isEmpty = TextUtils.isEmpty(optString);
                        String str = f14832t;
                        if (isEmpty || f14832t.equals(optString)) {
                            String m14429b = C3401w.m14419a().m14429b();
                            if (!TextUtils.isEmpty(m14429b)) {
                                str = m14429b;
                            }
                            jSONObject.put("__i", str);
                        }
                        jSONArray.put(jSONObject);
                    } else {
                        jSONArray.put(jSONObject);
                    }
                } catch (Throwable unused) {
                }
            }
            this.f14841g = jSONArray;
        }
    }

    /* renamed from: r */
    private void m14360r() {
        Context context;
        SharedPreferences sharedPreferences;
        try {
            if (m14361s() && (context = f14824a) != null && (sharedPreferences = PreferenceWrapper.getDefault(context)) != null && sharedPreferences.getLong(f14825l, 0L) == 0) {
                sharedPreferences.edit().putLong(f14825l, System.currentTimeMillis()).commit();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: s */
    private boolean m14361s() {
        SharedPreferences sharedPreferences;
        try {
            Context context = f14824a;
            if (context != null && (sharedPreferences = PreferenceWrapper.getDefault(context)) != null) {
                if (sharedPreferences.getLong(f14826m, -1L) != 0) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public void m14370b() {
    }

    /* renamed from: c */
    public void m14373c() {
        m14371b(f14824a);
        m14375d();
        m14367a(true);
    }

    /* renamed from: d */
    public void m14375d() {
        try {
            if (this.f14841g.length() > 0) {
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>>*** flushMemoryData: 事件落库。");
                C3389k.m14262a(f14824a).m14277a(this.f14841g);
                this.f14841g = new JSONArray();
            }
            PreferenceWrapper.getDefault(f14824a).edit().putLong(f14827n, this.f14845k).putInt(f14830q, this.f14843i).putInt(f14831r, this.f14844j).commit();
        } catch (Throwable unused) {
        }
    }

    private C3395q() {
        this.f14836b = null;
        this.f14837c = null;
        this.f14838d = null;
        this.f14839e = null;
        this.f14840f = 10;
        this.f14841g = new JSONArray();
        this.f14842h = 5000;
        this.f14843i = 0;
        this.f14844j = 0;
        this.f14845k = 0L;
        this.f14846s = 28800000L;
        this.f14847u = false;
        this.f14848v = false;
        this.f14849w = new Object();
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f14824a);
            this.f14845k = sharedPreferences.getLong(f14827n, 0L);
            this.f14843i = sharedPreferences.getInt(f14830q, 0);
            this.f14844j = sharedPreferences.getInt(f14831r, 0);
            this.f14836b = new c();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private void m14337b(JSONObject jSONObject) {
        JSONObject m14291f;
        if (C3389k.m14262a(UMGlobalContext.getAppContext(f14824a)).m14287c() || (m14291f = C3389k.m14262a(UMGlobalContext.getAppContext(f14824a)).m14291f()) == null) {
            return;
        }
        String optString = m14291f.optString("__av");
        String optString2 = m14291f.optString("__vc");
        try {
            if (TextUtils.isEmpty(optString)) {
                jSONObject.put(C3482b.m14744a("app_version"), UMUtils.getAppVersionName(f14824a));
            } else {
                jSONObject.put(C3482b.m14744a("app_version"), optString);
            }
            if (TextUtils.isEmpty(optString2)) {
                jSONObject.put(C3482b.m14744a("version_code"), UMUtils.getAppVersionCode(f14824a));
            } else {
                jSONObject.put(C3482b.m14744a("version_code"), optString2);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: g */
    private void m14348g(JSONObject jSONObject) {
        JSONObject optJSONObject;
        try {
            if (jSONObject.getJSONObject(C3482b.m14744a("header")).has(C3384f.f14574aH)) {
                if (jSONObject.has("content")) {
                    jSONObject = jSONObject.getJSONObject("content");
                }
                if (jSONObject.has(C3482b.m14744a("analytics"))) {
                    if (jSONObject.getJSONObject(C3482b.m14744a("analytics")).has(C3384f.f14619n)) {
                        C3389k.m14262a(f14824a).m14294i();
                        C3389k.m14262a(f14824a).m14293h();
                        C3389k.m14262a(f14824a).m14285b(true, false);
                        C3389k.m14262a(f14824a).m14276a();
                        return;
                    }
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> Error, Should not go to this branch.");
                    return;
                }
                return;
            }
            if (jSONObject.has("content")) {
                jSONObject = jSONObject.getJSONObject("content");
            }
            if (jSONObject.has(C3482b.m14744a("analytics")) && (optJSONObject = jSONObject.optJSONObject(C3482b.m14744a("analytics"))) != null && optJSONObject.length() > 0) {
                if (optJSONObject.has(C3384f.f14619n)) {
                    C3389k.m14262a(f14824a).m14285b(true, false);
                }
                if (optJSONObject.has("ekv") || optJSONObject.has(C3384f.f14565Z)) {
                    C3389k.m14262a(f14824a).m14293h();
                }
                if (optJSONObject.has("error")) {
                    C3389k.m14262a(f14824a).m14294i();
                }
            }
            C3389k.m14262a(f14824a).m14276a();
        } catch (Exception unused) {
        }
    }

    /* renamed from: com.umeng.analytics.pro.q$c */
    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a */
        private ReportPolicy.ReportStrategy f14884a = null;

        /* renamed from: b */
        private int f14885b = -1;

        /* renamed from: c */
        private int f14886c = -1;

        /* renamed from: d */
        private int f14887d = -1;

        /* renamed from: e */
        private int f14888e = -1;

        /* renamed from: f */
        private ABTest f14889f;

        public c() {
            this.f14889f = null;
            this.f14889f = ABTest.getService(C3395q.f14824a);
        }

        /* renamed from: a */
        public void m14382a() {
            try {
                int[] m14383a = m14383a(-1, -1);
                this.f14885b = m14383a[0];
                this.f14886c = m14383a[1];
            } catch (Throwable unused) {
            }
        }

        /* renamed from: b */
        protected void m14384b() {
            int i10;
            ReportPolicy.ReportStrategy defconPolicy;
            Defcon service = Defcon.getService(C3395q.f14824a);
            if (!service.isOpen()) {
                boolean z10 = Integer.valueOf(UMEnvelopeBuild.imprintProperty(C3395q.f14824a, "integrated_test", C3395q.f14832t)).intValue() == 1;
                if (UMConfigure.isDebugLog() && z10 && !MLog.DEBUG) {
                    UMLog.mutlInfo(C3390l.f14737K, 3, "\\|", null, null);
                }
                if (MLog.DEBUG && z10) {
                    this.f14884a = new ReportPolicy.DebugPolicy(StatTracer.getInstance(C3395q.f14824a));
                } else if (this.f14889f.isInTest() && "RPT".equals(this.f14889f.getTestName())) {
                    if (this.f14889f.getTestPolicy() == 6) {
                        if (Integer.valueOf(UMEnvelopeBuild.imprintProperty(C3395q.f14824a, "test_report_interval", C3395q.f14832t)).intValue() != -1) {
                            i10 = m14381a(90000);
                        } else {
                            i10 = this.f14886c;
                            if (i10 <= 0) {
                                i10 = this.f14888e;
                            }
                        }
                    } else {
                        i10 = 0;
                    }
                    this.f14884a = m14380b(this.f14889f.getTestPolicy(), i10);
                } else {
                    int i11 = this.f14887d;
                    int i12 = this.f14888e;
                    int i13 = this.f14885b;
                    if (i13 != -1) {
                        i12 = this.f14886c;
                        i11 = i13;
                    }
                    this.f14884a = m14380b(i11, i12);
                }
            } else {
                ReportPolicy.ReportStrategy reportStrategy = this.f14884a;
                if (!((reportStrategy instanceof ReportPolicy.DefconPolicy) && reportStrategy.isValid())) {
                    defconPolicy = new ReportPolicy.DefconPolicy(StatTracer.getInstance(C3395q.f14824a), service);
                } else {
                    defconPolicy = this.f14884a;
                }
                this.f14884a = defconPolicy;
            }
            if (UMConfigure.isDebugLog()) {
                try {
                    ReportPolicy.ReportStrategy reportStrategy2 = this.f14884a;
                    if (reportStrategy2 instanceof ReportPolicy.ReportAtLaunch) {
                        UMLog.mutlInfo(C3390l.f14735I, 3, "", null, null);
                    } else if (reportStrategy2 instanceof ReportPolicy.ReportByInterval) {
                        UMLog.mutlInfo(C3390l.f14736J, 3, "", new String[]{"@"}, new String[]{String.valueOf(((ReportPolicy.ReportByInterval) reportStrategy2).getReportInterval() / 1000)});
                    } else if (reportStrategy2 instanceof ReportPolicy.DebugPolicy) {
                        UMLog.mutlInfo(C3390l.f14738L, 3, "", null, null);
                    } else if (reportStrategy2 instanceof ReportPolicy.ReportQuasiRealtime) {
                        UMLog.mutlInfo(C3390l.f14739M, 3, "", new String[]{"@"}, new String[]{String.valueOf(((ReportPolicy.ReportQuasiRealtime) reportStrategy2).getReportInterval() / 1000)});
                    } else {
                        boolean z11 = reportStrategy2 instanceof ReportPolicy.DefconPolicy;
                    }
                } catch (Throwable unused) {
                }
            }
        }

        /* renamed from: c */
        public ReportPolicy.ReportStrategy m14385c() {
            m14384b();
            return this.f14884a;
        }

        /* renamed from: a */
        public int[] m14383a(int i10, int i11) {
            int intValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(C3395q.f14824a, "report_policy", C3395q.f14832t)).intValue();
            int intValue2 = Integer.valueOf(UMEnvelopeBuild.imprintProperty(C3395q.f14824a, "report_interval", C3395q.f14832t)).intValue();
            if (intValue == -1 || !ReportPolicy.isValid(intValue)) {
                return new int[]{i10, i11};
            }
            if (6 == intValue) {
                if (intValue2 == -1 || intValue2 < 90 || intValue2 > 86400) {
                    intValue2 = 90;
                }
                return new int[]{intValue, intValue2 * 1000};
            }
            if (11 == intValue) {
                if (intValue2 == -1 || intValue2 < 15 || intValue2 > 3600) {
                    intValue2 = 15;
                }
                return new int[]{intValue, intValue2 * 1000};
            }
            return new int[]{i10, i11};
        }

        /* renamed from: a */
        public int m14381a(int i10) {
            int intValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(C3395q.f14824a, "test_report_interval", C3395q.f14832t)).intValue();
            return (intValue == -1 || intValue < 90 || intValue > 86400) ? i10 : intValue * 1000;
        }

        /* renamed from: b */
        private ReportPolicy.ReportStrategy m14380b(int i10, int i11) {
            if (i10 == 0) {
                ReportPolicy.ReportStrategy reportStrategy = this.f14884a;
                return reportStrategy instanceof ReportPolicy.ReportRealtime ? reportStrategy : new ReportPolicy.ReportRealtime();
            }
            if (i10 == 1) {
                ReportPolicy.ReportStrategy reportStrategy2 = this.f14884a;
                return reportStrategy2 instanceof ReportPolicy.ReportAtLaunch ? reportStrategy2 : new ReportPolicy.ReportAtLaunch();
            }
            if (i10 == 4) {
                ReportPolicy.ReportStrategy reportStrategy3 = this.f14884a;
                return reportStrategy3 instanceof ReportPolicy.ReportDaily ? reportStrategy3 : new ReportPolicy.ReportDaily(StatTracer.getInstance(C3395q.f14824a));
            }
            if (i10 == 5) {
                ReportPolicy.ReportStrategy reportStrategy4 = this.f14884a;
                return reportStrategy4 instanceof ReportPolicy.ReportWifiOnly ? reportStrategy4 : new ReportPolicy.ReportWifiOnly(C3395q.f14824a);
            }
            if (i10 == 6) {
                ReportPolicy.ReportStrategy reportStrategy5 = this.f14884a;
                if (reportStrategy5 instanceof ReportPolicy.ReportByInterval) {
                    ((ReportPolicy.ReportByInterval) reportStrategy5).setReportInterval(i11);
                    return reportStrategy5;
                }
                return new ReportPolicy.ReportByInterval(StatTracer.getInstance(C3395q.f14824a), i11);
            }
            if (i10 == 8) {
                ReportPolicy.ReportStrategy reportStrategy6 = this.f14884a;
                return reportStrategy6 instanceof ReportPolicy.SmartPolicy ? reportStrategy6 : new ReportPolicy.SmartPolicy(StatTracer.getInstance(C3395q.f14824a));
            }
            if (i10 != 11) {
                ReportPolicy.ReportStrategy reportStrategy7 = this.f14884a;
                return reportStrategy7 instanceof ReportPolicy.ReportAtLaunch ? reportStrategy7 : new ReportPolicy.ReportAtLaunch();
            }
            ReportPolicy.ReportStrategy reportStrategy8 = this.f14884a;
            if (reportStrategy8 instanceof ReportPolicy.ReportQuasiRealtime) {
                ((ReportPolicy.ReportQuasiRealtime) reportStrategy8).setReportInterval(i11);
                return reportStrategy8;
            }
            ReportPolicy.ReportQuasiRealtime reportQuasiRealtime = new ReportPolicy.ReportQuasiRealtime();
            reportQuasiRealtime.setReportInterval(i11);
            return reportQuasiRealtime;
        }
    }

    /* renamed from: c */
    private void m14338c(JSONObject jSONObject) {
        try {
            if (!C3389k.m14262a(f14824a).m14290e()) {
                JSONObject m14292g = C3389k.m14262a(f14824a).m14292g();
                if (m14292g != null) {
                    String optString = m14292g.optString("__av");
                    String optString2 = m14292g.optString("__vc");
                    if (TextUtils.isEmpty(optString)) {
                        jSONObject.put(C3482b.m14744a("app_version"), UMUtils.getAppVersionName(f14824a));
                    } else {
                        jSONObject.put(C3482b.m14744a("app_version"), optString);
                    }
                    if (TextUtils.isEmpty(optString2)) {
                        jSONObject.put(C3482b.m14744a("version_code"), UMUtils.getAppVersionCode(f14824a));
                        return;
                    } else {
                        jSONObject.put(C3482b.m14744a("version_code"), optString2);
                        return;
                    }
                }
                return;
            }
            jSONObject.put(C3482b.m14744a("app_version"), UMUtils.getAppVersionName(f14824a));
            jSONObject.put(C3482b.m14744a("version_code"), UMUtils.getAppVersionCode(f14824a));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void m14363a() {
        if (f14824a != null) {
            synchronized (this.f14849w) {
                if (this.f14847u) {
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> network is now available, rebuild instant session data packet.");
                    Context context = f14824a;
                    UMWorkDispatch.sendEvent(context, a.f14868l, CoreProtocol.getInstance(context), null);
                }
            }
            synchronized (this.f14849w) {
                if (this.f14848v) {
                    Context context2 = f14824a;
                    UMWorkDispatch.sendEvent(context2, a.f14869m, CoreProtocol.getInstance(context2), null);
                }
            }
        }
    }

    /* renamed from: com.umeng.analytics.pro.q$d */
    /* loaded from: classes3.dex */
    public static class d {

        /* renamed from: a */
        private Map<String, Object> f14890a;

        /* renamed from: b */
        private String f14891b;

        /* renamed from: c */
        private String f14892c;

        /* renamed from: d */
        private long f14893d;

        private d() {
            this.f14890a = null;
            this.f14891b = null;
            this.f14892c = null;
            this.f14893d = 0L;
        }

        /* renamed from: a */
        public Map<String, Object> m14386a() {
            return this.f14890a;
        }

        /* renamed from: b */
        public String m14387b() {
            return this.f14892c;
        }

        /* renamed from: c */
        public String m14388c() {
            return this.f14891b;
        }

        /* renamed from: d */
        public long m14389d() {
            return this.f14893d;
        }

        public d(String str, Map<String, Object> map, String str2, long j10) {
            this.f14890a = map;
            this.f14891b = str;
            this.f14893d = j10;
            this.f14892c = str2;
        }
    }

    /* renamed from: h */
    private void m14350h(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject == null || jSONObject.length() <= 0 || !jSONObject.has("__ii")) {
                return;
            }
            String optString = jSONObject.optString("__ii");
            jSONObject.remove("__ii");
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            C3389k.m14262a(f14824a).m14280a(optString, obj.toString(), 2);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    private void m14340d(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.length() <= 0) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has(C3482b.m14744a("analytics"))) {
                JSONObject jSONObject4 = jSONObject.getJSONObject(C3482b.m14744a("analytics"));
                if (jSONObject4.has("ekv")) {
                    jSONObject3.put("ekv", jSONObject4.getJSONArray("ekv"));
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.m14759d("[埋点验证模式]事件:" + jSONObject3.toString());
                        } else {
                            MLog.m14759d("事件:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(C3384f.f14565Z)) {
                    jSONObject3.put(C3384f.f14565Z, jSONObject4.getJSONArray(C3384f.f14565Z));
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.m14759d("[埋点验证模式]游戏事件:" + jSONObject3.toString());
                        } else {
                            MLog.m14759d("游戏事件:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has("error")) {
                    jSONObject3.put("error", jSONObject4.getJSONArray("error"));
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.m14759d("[埋点验证模式]错误:" + jSONObject3.toString());
                        } else {
                            MLog.m14759d("错误:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(C3384f.f14619n)) {
                    JSONArray jSONArray = jSONObject4.getJSONArray(C3384f.f14619n);
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject5 = jSONArray.getJSONObject(i10);
                        if (jSONObject5 != null && jSONObject5.length() > 0) {
                            if (jSONObject5.has(C3384f.f14626u)) {
                                jSONObject5.remove(C3384f.f14626u);
                            }
                            jSONArray2.put(jSONObject5);
                        }
                    }
                    jSONObject3.put(C3384f.f14619n, jSONArray2);
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.m14759d("[埋点验证模式]会话:" + jSONObject3.toString());
                        } else {
                            MLog.m14759d("会话:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(C3384f.f14548I)) {
                    jSONObject3.put(C3384f.f14548I, jSONObject4.getJSONObject(C3384f.f14548I));
                }
                if (jSONObject4.has(C3384f.f14551L)) {
                    jSONObject3.put(C3384f.f14551L, jSONObject4.getJSONObject(C3384f.f14551L));
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.m14759d("[埋点验证模式]账号:" + jSONObject3.toString());
                        } else {
                            MLog.m14759d("账号:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                }
            }
            if (jSONObject.has("dplus")) {
                jSONObject3.put("dplus", jSONObject.getJSONObject("dplus"));
            }
            if (jSONObject.has(C3482b.m14744a("header")) && (jSONObject2 = jSONObject.getJSONObject(C3482b.m14744a("header"))) != null && jSONObject2.length() > 0) {
                if (jSONObject2.has(C3482b.m14744a("sdk_version"))) {
                    jSONObject3.put("sdk_version", jSONObject2.getString(C3482b.m14744a("sdk_version")));
                }
                if (jSONObject2.has(C3482b.m14744a("device_id"))) {
                    jSONObject3.put("device_id", jSONObject2.getString(C3482b.m14744a("device_id")));
                }
                if (jSONObject2.has(C3482b.m14744a("device_model"))) {
                    jSONObject3.put("device_model", jSONObject2.getString(C3482b.m14744a("device_model")));
                }
                if (jSONObject2.has(C3482b.m14744a("version_code"))) {
                    jSONObject3.put("version", jSONObject2.getInt(C3482b.m14744a("version_code")));
                }
                if (jSONObject2.has(C3482b.m14744a("appkey"))) {
                    jSONObject3.put("appkey", jSONObject2.getString(C3482b.m14744a("appkey")));
                }
                if (jSONObject2.has(C3482b.m14744a("channel"))) {
                    jSONObject3.put("channel", jSONObject2.getString(C3482b.m14744a("channel")));
                }
                if (jSONObject3.length() > 0) {
                    MLog.m14759d("基础信息:" + jSONObject3.toString());
                    jSONObject3 = new JSONObject();
                }
            }
            jSONObject3.length();
        } catch (Throwable th) {
            MLog.m14769e(th);
        }
    }

    /* renamed from: b */
    public JSONObject m14368b(long j10) {
        if (TextUtils.isEmpty(C3279aa.m13712a().m13727d(UMGlobalContext.getAppContext(f14824a)))) {
            return null;
        }
        JSONObject m14282b = C3389k.m14262a(UMGlobalContext.getAppContext(f14824a)).m14282b(false);
        String[] m13691a = C3273c.m13691a(f14824a);
        if (m13691a != null && !TextUtils.isEmpty(m13691a[0]) && !TextUtils.isEmpty(m13691a[1])) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(C3384f.f14552M, m13691a[0]);
                jSONObject.put(C3384f.f14553N, m13691a[1]);
                if (jSONObject.length() > 0) {
                    m14282b.put(C3384f.f14551L, jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
        int m14399a = C3398t.m14395a().m14399a(f14824a);
        if (m14282b.length() == 1 && m14282b.optJSONObject(C3384f.f14551L) != null && m14399a != 3) {
            return null;
        }
        C3398t.m14395a().m14401b(m14282b, f14824a);
        if (m14282b.length() <= 0 && m14399a != 3) {
            return null;
        }
        JSONObject m14353k = m14353k();
        if (m14353k != null) {
            m14337b(m14353k);
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            if (m14399a == 3) {
                jSONObject3.put("analytics", new JSONObject());
            } else if (m14282b.length() > 0) {
                jSONObject3.put("analytics", m14282b);
            }
            if (m14353k != null && m14353k.length() > 0) {
                jSONObject2.put("header", m14353k);
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("content", jSONObject3);
            }
            return m14336b(jSONObject2, j10);
        } catch (Throwable unused2) {
            return jSONObject2;
        }
    }

    /* renamed from: c */
    private boolean m14339c(boolean z10) {
        if (m14361s() || AnalyticsConfig.isRealTimeDebugMode()) {
            return true;
        }
        if (this.f14836b == null) {
            this.f14836b = new c();
        }
        this.f14836b.m14382a();
        ReportPolicy.ReportStrategy m14385c = this.f14836b.m14385c();
        boolean shouldSendMessage = m14385c.shouldSendMessage(z10);
        if (shouldSendMessage) {
            if (((m14385c instanceof ReportPolicy.ReportByInterval) || (m14385c instanceof ReportPolicy.DebugPolicy) || (m14385c instanceof ReportPolicy.ReportQuasiRealtime)) && m14358p()) {
                m14375d();
            }
            if ((m14385c instanceof ReportPolicy.DefconPolicy) && m14358p()) {
                m14375d();
            }
            if (UMConfigure.isDebugLog()) {
                MLog.m14759d("数据发送策略 : " + m14385c.getClass().getSimpleName());
            }
        }
        return shouldSendMessage;
    }

    /* renamed from: a */
    private void m14332a(String str, String str2) {
        Method method;
        Class<?> cls = f14834y;
        if (cls == null || (method = f14835z) == null) {
            return;
        }
        try {
            method.invoke(cls, str, str2);
        } catch (Throwable unused) {
            UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>> reflect call setPuidAndProvider method of crash lib failed.");
        }
    }

    /* renamed from: e */
    private void m14343e(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.length() <= 0) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has(C3482b.m14744a("analytics"))) {
                JSONObject jSONObject4 = jSONObject.getJSONObject(C3482b.m14744a("analytics"));
                if (jSONObject4.has(C3384f.f14619n)) {
                    JSONArray jSONArray = jSONObject4.getJSONArray(C3384f.f14619n);
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject5 = jSONArray.getJSONObject(i10);
                        if (jSONObject5 != null && jSONObject5.length() > 0) {
                            jSONArray2.put(jSONObject5);
                        }
                    }
                    jSONObject3.put(C3384f.f14619n, jSONArray2);
                    if (jSONObject3.length() > 0) {
                        MLog.m14759d("本次启动会话:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(C3384f.f14551L)) {
                    jSONObject3.put(C3384f.f14551L, jSONObject4.getJSONObject(C3384f.f14551L));
                    if (jSONObject3.length() > 0) {
                        MLog.m14759d("本次启动账号:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                }
            }
            if (jSONObject.has(C3482b.m14744a("header")) && jSONObject.has(C3482b.m14744a("header")) && (jSONObject2 = jSONObject.getJSONObject(C3482b.m14744a("header"))) != null && jSONObject2.length() > 0) {
                if (jSONObject2.has(C3482b.m14744a("sdk_version"))) {
                    jSONObject3.put("sdk_version", jSONObject2.getString(C3482b.m14744a("sdk_version")));
                }
                if (jSONObject2.has(C3482b.m14744a("device_id"))) {
                    jSONObject3.put("device_id", jSONObject2.getString(C3482b.m14744a("device_id")));
                }
                if (jSONObject2.has(C3482b.m14744a("device_model"))) {
                    jSONObject3.put("device_model", jSONObject2.getString(C3482b.m14744a("device_model")));
                }
                if (jSONObject2.has(C3482b.m14744a("version_code"))) {
                    jSONObject3.put("version", jSONObject2.getInt(C3482b.m14744a("version_code")));
                }
                if (jSONObject2.has(C3482b.m14744a("appkey"))) {
                    jSONObject3.put("appkey", jSONObject2.getString(C3482b.m14744a("appkey")));
                }
                if (jSONObject2.has(C3482b.m14744a("channel"))) {
                    jSONObject3.put("channel", jSONObject2.getString(C3482b.m14744a("channel")));
                }
                if (jSONObject3.length() > 0) {
                    MLog.m14759d("本次启动基础信息:" + jSONObject3.toString());
                    jSONObject3 = new JSONObject();
                }
            }
            jSONObject3.length();
        } catch (Throwable th) {
            MLog.m14769e(th);
        }
    }

    /* renamed from: a */
    public void m14365a(Object obj, int i10) {
        if (C3519c.m15122a()) {
            if (i10 != 4357) {
                return;
            }
            try {
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> clean db in silent mode.");
                C3388j.m14254a(f14824a);
                C3519c.m15125c(f14824a);
            } catch (Throwable unused) {
            }
        }
        if (AnalyticsConfig.enable) {
            try {
                if (i10 != 4358) {
                    switch (i10) {
                        case a.f14857a /* 4097 */:
                            if (UMUtils.isMainProgress(f14824a)) {
                                if (obj != null) {
                                    m14342e(obj);
                                }
                                if (f14832t.equals(((JSONObject) obj).optString("__i"))) {
                                    return;
                                }
                                m14367a(false);
                                return;
                            }
                            UMProcessDBHelper.getInstance(f14824a).insertEventsInSubProcess(UMFrUtils.getSubProcessName(f14824a), new JSONArray().put(obj));
                            return;
                        case a.f14858b /* 4098 */:
                            if (obj != null) {
                                m14342e(obj);
                            }
                            if (f14832t.equals(((JSONObject) obj).optString("__i"))) {
                                return;
                            }
                            m14367a(false);
                            return;
                        case a.f14859c /* 4099 */:
                            C3402x.m14437a(f14824a);
                            return;
                        case a.f14860d /* 4100 */:
                            C3392n.m14309c(f14824a);
                            return;
                        case a.f14861e /* 4101 */:
                            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> PROFILE_SIGNIN");
                            m14366a((Object) null, true);
                            m14347g(obj);
                            return;
                        case a.f14862f /* 4102 */:
                            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> PROFILE_SIGNOFF");
                            m14366a((Object) null, true);
                            m14344f(obj);
                            return;
                        case a.f14863g /* 4103 */:
                            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> START_SESSION");
                            C3401w.m14419a().m14428a(f14824a, obj);
                            synchronized (this.f14849w) {
                                this.f14848v = true;
                            }
                            return;
                        case a.f14864h /* 4104 */:
                            C3401w.m14419a().m14435c(f14824a, obj);
                            return;
                        case a.f14865i /* 4105 */:
                            m14375d();
                            return;
                        case a.f14866j /* 4106 */:
                            m14350h(obj);
                            return;
                        default:
                            switch (i10) {
                                case 4352:
                                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> INSTANT_SESSION_START");
                                    C3401w.m14419a().m14431b(f14824a, obj);
                                    synchronized (this.f14849w) {
                                        this.f14847u = true;
                                    }
                                    return;
                                case a.f14868l /* 4353 */:
                                    m14366a(obj, true);
                                    return;
                                case a.f14869m /* 4354 */:
                                    m14373c();
                                    return;
                                case a.f14870n /* 4355 */:
                                    if (!UMUtils.isMainProgress(f14824a)) {
                                        UMProcessDBHelper.getInstance(f14824a).insertEventsInSubProcess(UMFrUtils.getSubProcessName(f14824a), new JSONArray().put(obj));
                                        return;
                                    } else {
                                        if (obj != null) {
                                            m14342e(obj);
                                            m14375d();
                                            return;
                                        }
                                        return;
                                    }
                                case a.f14871o /* 4356 */:
                                    if (obj == null || f14834y == null || f14835z == null) {
                                        return;
                                    }
                                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> PROFILE_CHANGE_NOTIFY");
                                    String str = "";
                                    String str2 = "";
                                    if (obj instanceof JSONObject) {
                                        JSONObject jSONObject = (JSONObject) obj;
                                        if (jSONObject.has("uid") && jSONObject.has(C3384f.f14552M)) {
                                            str = jSONObject.getString(C3384f.f14552M);
                                            str2 = jSONObject.getString("uid");
                                        }
                                        m14332a(str2, str);
                                        return;
                                    }
                                    return;
                                default:
                                    switch (i10) {
                                        case a.f14876t /* 8195 */:
                                            C3272b.m13626a().m13649a(obj);
                                            return;
                                        case a.f14877u /* 8196 */:
                                            C3272b.m13626a().m13683m();
                                            return;
                                        case a.f14878v /* 8197 */:
                                            C3272b.m13626a().m13681k();
                                            return;
                                        default:
                                            switch (i10) {
                                                case a.f14879w /* 8199 */:
                                                case a.f14880x /* 8200 */:
                                                    C3272b.m13626a().m13659b(obj);
                                                    return;
                                                case a.f14881y /* 8201 */:
                                                    C3272b.m13626a().m13659b((Object) null);
                                                    return;
                                                default:
                                                    switch (i10) {
                                                        case a.f14882z /* 8208 */:
                                                            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> receive DELAY_BUILD_ENVELOPE event.");
                                                            Context context = f14824a;
                                                            UMWorkDispatch.sendEvent(context, a.f14850A, CoreProtocol.getInstance(context), null);
                                                            Context context2 = f14824a;
                                                            UMWorkDispatch.sendEvent(context2, a.f14869m, CoreProtocol.getInstance(context2), null);
                                                            return;
                                                        case a.f14850A /* 8209 */:
                                                            m14366a(obj, false);
                                                            return;
                                                        case a.f14851B /* 8210 */:
                                                            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> recv BUILD_ENVELOPE_IMMEDIATELY.");
                                                            if (!UMUtils.isMainProgress(f14824a) || (this.f14836b.m14385c() instanceof ReportPolicy.ReportQuasiRealtime)) {
                                                                return;
                                                            }
                                                            m14367a(true);
                                                            return;
                                                        default:
                                                            switch (i10) {
                                                                case a.f14854E /* 8213 */:
                                                                    if (FieldManager.allow(C3520d.f15634E)) {
                                                                        if (DeviceConfig.getGlobleActivity(f14824a) != null) {
                                                                            C3401w.m14422b(f14824a);
                                                                        }
                                                                        Context context3 = f14824a;
                                                                        UMWorkDispatch.sendEventEx(context3, a.f14854E, CoreProtocol.getInstance(context3), null, 5000L);
                                                                        return;
                                                                    }
                                                                    return;
                                                                case a.f14855F /* 8214 */:
                                                                    if (obj != null && (obj instanceof JSONObject)) {
                                                                        String optString = ((JSONObject) obj).optString(AnalyticsConfig.RTD_START_TIME);
                                                                        String optString2 = ((JSONObject) obj).optString(AnalyticsConfig.RTD_PERIOD);
                                                                        String optString3 = ((JSONObject) obj).optString("debugkey");
                                                                        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString3)) {
                                                                            return;
                                                                        }
                                                                        Context context4 = f14824a;
                                                                        String str3 = AnalyticsConfig.RTD_SP_FILE;
                                                                        C3422b.m14519a(context4, str3, AnalyticsConfig.RTD_START_TIME, optString);
                                                                        C3422b.m14519a(f14824a, str3, AnalyticsConfig.RTD_PERIOD, optString2);
                                                                        C3422b.m14519a(f14824a, str3, "debugkey", optString3);
                                                                        return;
                                                                    }
                                                                    return;
                                                                case a.f14856G /* 8215 */:
                                                                    C3422b.m14518a(f14824a, AnalyticsConfig.RTD_SP_FILE);
                                                                    return;
                                                                default:
                                                                    return;
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                }
                if (obj != null && (obj instanceof JSONObject)) {
                    String optString4 = ((JSONObject) obj).optString(C3384f.f14558S);
                    Object opt = ((JSONObject) obj).opt(C3384f.f14559T);
                    if (TextUtils.isEmpty(optString4)) {
                        return;
                    }
                    String[] m13691a = C3273c.m13691a(f14824a);
                    if (m13691a != null && !TextUtils.isEmpty(m13691a[0]) && !TextUtils.isEmpty(m13691a[1])) {
                        if (C3384f.f14554O.equals(optString4)) {
                            C3273c.m13689a((String) opt);
                            return;
                        } else if (C3384f.f14555P.equals(optString4)) {
                            C3273c.m13694b((String) opt);
                            return;
                        } else {
                            C3273c.m13690a(optString4, opt);
                            return;
                        }
                    }
                    MLog.m14765e("Please call MobclickAgent.onProfileSignIn() function before set user profile property.");
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: g */
    private void m14347g(Object obj) {
        try {
            m14371b(f14824a);
            m14375d();
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null && jSONObject.length() > 0) {
                String string = jSONObject.getString(C3384f.f14552M);
                String string2 = jSONObject.getString("uid");
                long j10 = jSONObject.getLong("ts");
                String[] m13691a = C3273c.m13691a(f14824a);
                if (m13691a != null && string.equals(m13691a[0]) && string2.equals(m13691a[1])) {
                    return;
                }
                C3401w.m14419a().m14427a(f14824a, j10);
                String m13726c = C3279aa.m13712a().m13726c(f14824a);
                boolean m14432b = C3401w.m14419a().m14432b(f14824a, j10, false);
                C3273c.m13687a(f14824a, string, string2);
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> onProfileSignIn: force generate new session: session id = " + m13726c);
                C3401w.m14419a().m14426a(f14824a, j10, true);
                if (m14432b) {
                    C3401w.m14419a().m14430b(f14824a, j10);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: f */
    public long m14378f() {
        SharedPreferences sharedPreferences;
        long j10 = 0;
        try {
            Context context = f14824a;
            if (context == null || (sharedPreferences = PreferenceWrapper.getDefault(context)) == null) {
                return 0L;
            }
            long j11 = sharedPreferences.getLong(f14825l, 0L);
            if (j11 == 0) {
                try {
                    j10 = System.currentTimeMillis();
                    sharedPreferences.edit().putLong(f14825l, j10).commit();
                    return j10;
                } catch (Throwable unused) {
                }
            }
            return j11;
        } catch (Throwable unused2) {
            return j10;
        }
    }

    /* renamed from: c */
    public void m14374c(Object obj) {
        m14371b(f14824a);
        m14375d();
        if (m14341d(false)) {
            m14352j();
        }
    }

    /* renamed from: f */
    private void m14344f(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null && jSONObject.length() > 0) {
                long j10 = jSONObject.getLong("ts");
                m14371b(f14824a);
                m14375d();
                String[] m13691a = C3273c.m13691a(f14824a);
                if (m13691a == null || TextUtils.isEmpty(m13691a[0]) || TextUtils.isEmpty(m13691a[1])) {
                    return;
                }
                C3401w.m14419a().m14427a(f14824a, j10);
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> onProfileSignIn: force generate new session: session id = " + C3279aa.m13712a().m13726c(f14824a));
                boolean m14432b = C3401w.m14419a().m14432b(f14824a, j10, false);
                C3273c.m13693b(f14824a);
                C3401w.m14419a().m14426a(f14824a, j10, true);
                if (m14432b) {
                    C3401w.m14419a().m14430b(f14824a, j10);
                }
            }
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m14767e(" Excepthon  in  onProfileSignOff", th);
            }
        }
    }

    /* renamed from: b */
    private JSONObject m14336b(JSONObject jSONObject, long j10) {
        try {
            if (C3397s.m14393a(jSONObject) <= j10) {
                return jSONObject;
            }
            jSONObject = null;
            C3389k.m14262a(f14824a).m14279a(true, false);
            C3389k.m14262a(f14824a).m14283b();
            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> Instant session packet overload !!! ");
            return null;
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    /* renamed from: b */
    public JSONObject m14369b(boolean z10) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject = null;
        try {
            jSONObject = C3389k.m14262a(f14824a).m14275a(z10);
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            } else {
                try {
                    boolean has = jSONObject.has(C3384f.f14619n);
                    jSONObject = jSONObject;
                    if (has) {
                        JSONArray jSONArray3 = jSONObject.getJSONArray(C3384f.f14619n);
                        JSONArray jSONArray4 = new JSONArray();
                        int i10 = 0;
                        while (i10 < jSONArray3.length()) {
                            JSONObject jSONObject2 = (JSONObject) jSONArray3.get(i10);
                            JSONArray optJSONArray = jSONObject2.optJSONArray(C3384f.f14625t);
                            JSONArray optJSONArray2 = jSONObject2.optJSONArray(C3384f.f14626u);
                            if (optJSONArray == null && optJSONArray2 != null) {
                                jSONObject2.put(C3384f.f14625t, optJSONArray2);
                                jSONObject2.remove(C3384f.f14626u);
                            }
                            if (optJSONArray != null && optJSONArray2 != null) {
                                ArrayList arrayList = new ArrayList();
                                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                                    arrayList.add((JSONObject) optJSONArray.get(i11));
                                }
                                for (int i12 = 0; i12 < optJSONArray2.length(); i12++) {
                                    arrayList.add((JSONObject) optJSONArray2.get(i12));
                                }
                                JSONArraySortUtil jSONArraySortUtil = new JSONArraySortUtil();
                                jSONArraySortUtil.setCompareKey(C3384f.f14629x);
                                Collections.sort(arrayList, jSONArraySortUtil);
                                JSONArray jSONArray5 = new JSONArray();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    jSONArray5.put((JSONObject) it.next());
                                }
                                jSONObject2.put(C3384f.f14625t, jSONArray5);
                                jSONObject2.remove(C3384f.f14626u);
                            }
                            if (jSONObject2.has(C3384f.f14625t)) {
                                JSONArray optJSONArray3 = jSONObject2.optJSONArray(C3384f.f14625t);
                                int i13 = 0;
                                while (i13 < optJSONArray3.length()) {
                                    JSONObject jSONObject3 = optJSONArray3.getJSONObject(i13);
                                    if (jSONObject3.has(C3384f.f14629x)) {
                                        jSONArray2 = jSONArray3;
                                        jSONObject3.put("ts", jSONObject3.getLong(C3384f.f14629x));
                                        jSONObject3.remove(C3384f.f14629x);
                                    } else {
                                        jSONArray2 = jSONArray3;
                                    }
                                    i13++;
                                    jSONArray3 = jSONArray2;
                                }
                                jSONArray = jSONArray3;
                                jSONObject2.put(C3384f.f14625t, optJSONArray3);
                                jSONObject2.put(C3384f.f14631z, optJSONArray3.length());
                            } else {
                                jSONArray = jSONArray3;
                                jSONObject2.put(C3384f.f14631z, 0);
                            }
                            jSONArray4.put(jSONObject2);
                            i10++;
                            jSONArray3 = jSONArray;
                        }
                        jSONObject.put(C3384f.f14619n, jSONArray4);
                        jSONObject = jSONObject;
                    }
                } catch (Exception e10) {
                    MLog.m14765e("merge pages error");
                    e10.printStackTrace();
                    jSONObject = jSONObject;
                }
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f14824a);
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString("userlevel", "");
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put("userlevel", string);
                }
            }
            String[] m13691a = C3273c.m13691a(f14824a);
            if (m13691a != null && !TextUtils.isEmpty(m13691a[0]) && !TextUtils.isEmpty(m13691a[1])) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(C3384f.f14552M, m13691a[0]);
                jSONObject4.put(C3384f.f14553N, m13691a[1]);
                if (jSONObject4.length() > 0) {
                    JSONObject jSONObject5 = new JSONObject();
                    String m13686a = C3273c.m13686a();
                    if (m13686a != null) {
                        jSONObject5.put(C3384f.f14554O, m13686a);
                    }
                    String m13692b = C3273c.m13692b();
                    if (m13692b != null) {
                        jSONObject5.put(C3384f.f14555P, m13692b);
                    }
                    Map<String, Object> m13695c = C3273c.m13695c(f14824a);
                    if (m13695c != null && m13695c.size() > 0) {
                        for (String str : m13695c.keySet()) {
                            jSONObject5.put(str, m13695c.get(str));
                        }
                    }
                    if (jSONObject5.length() > 0) {
                        jSONObject4.put(C3384f.f14557R, jSONObject5);
                    }
                    jSONObject.put(C3384f.f14551L, jSONObject4);
                }
            }
            if (ABTest.getService(f14824a).isInTest()) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put(ABTest.getService(f14824a).getTestName(), ABTest.getService(f14824a).getGroupInfo());
                jSONObject.put(C3384f.f14550K, jSONObject6);
            }
            C3398t.m14395a().m14400a(jSONObject, f14824a);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: e */
    public void m14377e() {
        if (m14341d(false)) {
            m14352j();
        }
    }

    /* renamed from: d */
    public void m14376d(Object obj) {
        m14360r();
        m14355m();
        m14356n();
        m14367a(true);
    }

    /* renamed from: d */
    private boolean m14341d(boolean z10) {
        if (this.f14836b == null) {
            this.f14836b = new c();
        }
        ReportPolicy.ReportStrategy m14385c = this.f14836b.m14385c();
        if (!(m14385c instanceof ReportPolicy.DefconPolicy)) {
            return true;
        }
        if (z10) {
            return ((ReportPolicy.DefconPolicy) m14385c).shouldSendMessageByInstant();
        }
        return m14385c.shouldSendMessage(false);
    }

    /* renamed from: b */
    public void m14372b(Object obj) {
        if (obj != null) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.length() > 0) {
                    if (jSONObject.has("exception")) {
                        if (101 != jSONObject.getInt("exception")) {
                            m14345f(jSONObject);
                        }
                    } else {
                        m14345f(jSONObject);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public void m14371b(Context context) {
        try {
            C3389k.m14262a(context).m14289d();
            m14359q();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void m14367a(boolean z10) {
        if (m14339c(z10)) {
            if (!(this.f14836b.m14385c() instanceof ReportPolicy.ReportQuasiRealtime)) {
                if (UMEnvelopeBuild.isReadyBuild(f14824a, UMLogDataProtocol.UMBusinessType.U_APP)) {
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> constructMessage()");
                    m14352j();
                    return;
                }
                return;
            }
            if (z10) {
                if (UMEnvelopeBuild.isOnline(f14824a)) {
                    UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> send session start in policy ReportQuasiRealtime.");
                    m14352j();
                    return;
                }
                return;
            }
            if (UMEnvelopeBuild.isReadyBuild(f14824a, UMLogDataProtocol.UMBusinessType.U_APP)) {
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> send normal data in policy ReportQuasiRealtime.");
                m14352j();
            }
        }
    }

    /* renamed from: a */
    private boolean m14334a(JSONArray jSONArray) {
        int length = jSONArray.length();
        List asList = Arrays.asList("$$_onUMengEnterForeground", "$$_onUMengEnterBackground", "$$_onUMengEnterForegroundInitError");
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            try {
                JSONObject optJSONObject = jSONArray.optJSONObject(i11);
                if (optJSONObject != null && asList.contains(optJSONObject.optString("id"))) {
                    i10++;
                }
            } catch (Throwable unused) {
            }
        }
        return i10 >= length;
    }

    /* renamed from: a */
    private boolean m14335a(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("ekv");
        int length = optJSONArray.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            try {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i11);
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray(keys.next());
                    if (optJSONArray2 != null && m14334a(optJSONArray2)) {
                        i10++;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return i10 >= length;
    }

    /* renamed from: a */
    public JSONObject m14362a(long j10) {
        if (TextUtils.isEmpty(C3279aa.m13712a().m13727d(f14824a))) {
            return null;
        }
        JSONObject m14369b = m14369b(false);
        int m14399a = C3398t.m14395a().m14399a(f14824a);
        if (m14369b.length() > 0) {
            if (m14369b.length() == 1) {
                if (m14369b.optJSONObject(C3384f.f14551L) != null && m14399a != 3) {
                    return null;
                }
                if (!TextUtils.isEmpty(m14369b.optString("userlevel")) && m14399a != 3) {
                    return null;
                }
            } else if (m14369b.length() == 2 && m14369b.optJSONObject(C3384f.f14551L) != null && !TextUtils.isEmpty(m14369b.optString("userlevel")) && m14399a != 3) {
                return null;
            }
            String optString = m14369b.optString(C3384f.f14619n);
            String optString2 = m14369b.optString(C3384f.f14565Z);
            String optString3 = m14369b.optString("ekv");
            if (TextUtils.isEmpty(optString) && TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3) && m14335a(m14369b)) {
                return null;
            }
        } else if (m14399a != 3) {
            return null;
        }
        JSONObject m14354l = m14354l();
        if (m14354l != null) {
            m14338c(m14354l);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (m14399a == 3) {
                jSONObject2.put("analytics", new JSONObject());
            } else if (m14369b.length() > 0) {
                jSONObject2.put("analytics", m14369b);
            }
            if (m14354l != null && m14354l.length() > 0) {
                jSONObject.put("header", m14354l);
            }
            if (jSONObject2.length() > 0) {
                jSONObject.put("content", jSONObject2);
            }
            return m14331a(jSONObject, j10);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    /* renamed from: a */
    private JSONObject m14331a(JSONObject jSONObject, long j10) {
        try {
            if (C3397s.m14393a(jSONObject) <= j10) {
                return jSONObject;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("header");
            jSONObject2.put(C3384f.f14574aH, C3397s.m14393a(jSONObject));
            jSONObject.put("header", jSONObject2);
            return C3397s.m14394a(f14824a, j10, jSONObject);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    /* renamed from: a */
    private boolean m14333a(long j10, int i10) {
        if (j10 == 0) {
            return true;
        }
        if (System.currentTimeMillis() - j10 <= 28800000) {
            return i10 < 5000;
        }
        m14357o();
        return true;
    }

    /* renamed from: a */
    public void m14364a(Object obj) {
        if (obj != null) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.length() > 0) {
                    if (jSONObject.has("exception")) {
                        if (101 != jSONObject.getInt("exception")) {
                            m14348g(jSONObject);
                        }
                    } else {
                        m14348g(jSONObject);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public void m14366a(Object obj, boolean z10) {
        if (z10) {
            if (m14341d(true)) {
                m14351i();
            }
        } else if (UMEnvelopeBuild.isOnline(f14824a) && m14341d(true)) {
            m14351i();
        }
    }
}
