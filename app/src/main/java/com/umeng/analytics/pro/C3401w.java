package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.C3272b;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.C3279aa;
import com.umeng.analytics.pro.C3385g;
import com.umeng.analytics.pro.C3389k;
import com.umeng.analytics.pro.C3395q;
import com.umeng.analytics.process.UMProcessDBDatasSender;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.C3520d;
import com.umeng.commonsdk.utils.UMUtils;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.w */
/* loaded from: classes3.dex */
public class C3401w implements C3279aa.a {

    /* renamed from: a */
    public static final String f14911a = "session_start_time";

    /* renamed from: b */
    public static final String f14912b = "session_end_time";

    /* renamed from: c */
    public static final String f14913c = "session_id";

    /* renamed from: d */
    public static final String f14914d = "pre_session_id";

    /* renamed from: e */
    public static final String f14915e = "a_start_time";

    /* renamed from: f */
    public static final String f14916f = "a_end_time";

    /* renamed from: g */
    public static final String f14917g = "fg_count";

    /* renamed from: h */
    private static String f14918h = null;

    /* renamed from: i */
    private static Context f14919i = null;

    /* renamed from: j */
    private static boolean f14920j = false;

    /* renamed from: k */
    private static long f14921k = 0;

    /* renamed from: l */
    private static boolean f14922l = true;

    /* renamed from: m */
    private static long f14923m;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.analytics.pro.w$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private static final C3401w f14924a = new C3401w();

        private a() {
        }
    }

    /* renamed from: a */
    public static C3401w m14419a() {
        return a.f14924a;
    }

    /* renamed from: b */
    public static void m14422b(Context context) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f14919i);
        if (sharedPreferences != null) {
            long j10 = sharedPreferences.getLong(f14917g, 0L);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (edit != null) {
                edit.putLong(f14917g, j10 + 1);
                edit.commit();
            }
        }
    }

    /* renamed from: d */
    private void m14423d(Context context) {
        try {
            SharedPreferences.Editor edit = PreferenceWrapper.getDefault(context).edit();
            edit.putLong(f14917g, 0L);
            edit.commit();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    private String m14424e(Context context) {
        if (f14919i == null && context != null) {
            f14919i = context.getApplicationContext();
        }
        String m13727d = C3279aa.m13712a().m13727d(f14919i);
        try {
            m14425f(context);
            C3395q.m14330a(f14919i).m14376d((Object) null);
        } catch (Throwable unused) {
        }
        return m13727d;
    }

    /* renamed from: f */
    private void m14425f(Context context) {
        C3395q.m14330a(context).m14371b(context);
        C3395q.m14330a(context).m14375d();
    }

    /* renamed from: c */
    public void m14435c(Context context, Object obj) {
        try {
            if (f14919i == null && context != null) {
                f14919i = context.getApplicationContext();
            }
            long longValue = ((Long) obj).longValue();
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (sharedPreferences == null) {
                return;
            }
            if (sharedPreferences.getLong(f14915e, 0L) == 0) {
                MLog.m14765e("onPause called before onResume");
                return;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> onEndSessionInternal: write activity end time = " + longValue);
            edit.putLong(f14916f, longValue);
            edit.putLong(f14912b, longValue);
            edit.commit();
        } catch (Throwable unused) {
        }
    }

    private C3401w() {
        C3279aa.m13712a().m13722a(this);
    }

    /* renamed from: a */
    public static long m14418a(Context context) {
        try {
            return PreferenceWrapper.getDefault(context).getLong(f14917g, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* renamed from: a */
    public void m14427a(Context context, long j10) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f14919i);
        if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
            return;
        }
        edit.putLong(f14911a, j10);
        edit.commit();
    }

    /* renamed from: b */
    public void m14431b(Context context, Object obj) {
        long longValue;
        try {
            if (f14919i == null) {
                f14919i = UMGlobalContext.getAppContext(context);
            }
            if (obj == null) {
                longValue = System.currentTimeMillis();
            } else {
                longValue = ((Long) obj).longValue();
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f14919i);
            if (sharedPreferences == null) {
                return;
            }
            f14921k = sharedPreferences.getLong(f14916f, 0L);
            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "------>>> lastActivityEndTime: " + f14921k);
            String string = sharedPreferences.getString(C3384f.f14572aF, "");
            String appVersionName = UMUtils.getAppVersionName(f14919i);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (edit == null) {
                return;
            }
            if (!TextUtils.isEmpty(string) && !string.equals(appVersionName)) {
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> requestNewInstantSessionIf: version upgrade");
                edit.putLong(f14911a, longValue);
                edit.commit();
                C3395q.m14330a(f14919i).m14366a((Object) null, true);
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> force generate new session: session id = " + C3279aa.m13712a().m13726c(f14919i));
                f14920j = true;
                m14426a(f14919i, longValue, true);
                return;
            }
            if (C3279aa.m13712a().m13728e(f14919i)) {
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> More then 30 sec from last session.");
                f14920j = true;
                edit.putLong(f14911a, longValue);
                edit.commit();
                m14426a(f14919i, longValue, false);
                return;
            }
            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> less then 30 sec from last session, do nothing.");
            f14920j = false;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void m14428a(Context context, Object obj) {
        SharedPreferences.Editor edit;
        try {
            if (f14919i == null && context != null) {
                f14919i = context.getApplicationContext();
            }
            long longValue = ((Long) obj).longValue();
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f14919i);
            if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null) {
                return;
            }
            String string = sharedPreferences.getString(C3384f.f14572aF, "");
            String appVersionName = UMUtils.getAppVersionName(f14919i);
            if (TextUtils.isEmpty(string)) {
                edit.putInt("versioncode", Integer.parseInt(UMUtils.getAppVersionCode(context)));
                edit.putString(C3384f.f14572aF, appVersionName);
                edit.commit();
            } else if (!string.equals(appVersionName)) {
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> onStartSessionInternal: upgrade version: " + string + "-> " + appVersionName);
                int i10 = sharedPreferences.getInt("versioncode", 0);
                String string2 = sharedPreferences.getString("pre_date", "");
                String string3 = sharedPreferences.getString("pre_version", "");
                String string4 = sharedPreferences.getString(C3384f.f14572aF, "");
                edit.putInt("versioncode", Integer.parseInt(UMUtils.getAppVersionCode(context)));
                edit.putString(C3384f.f14572aF, appVersionName);
                edit.putString("vers_date", string2);
                edit.putString("vers_pre_version", string3);
                edit.putString("cur_version", string4);
                edit.putInt("vers_code", i10);
                edit.putString("vers_name", string);
                edit.commit();
                if (f14922l) {
                    f14922l = false;
                }
                if (f14920j) {
                    f14920j = false;
                    m14432b(f14919i, longValue, true);
                    m14430b(f14919i, longValue);
                    return;
                }
                return;
            }
            if (f14920j) {
                f14920j = false;
                if (f14922l) {
                    f14922l = false;
                }
                f14918h = m14424e(context);
                MLog.m14759d("创建新会话: " + f14918h);
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "mSessionChanged flag has been set, Start new session: " + f14918h);
                return;
            }
            f14918h = sharedPreferences.getString("session_id", null);
            edit.putLong(f14915e, longValue);
            edit.putLong(f14916f, 0L);
            edit.commit();
            MLog.m14759d("延续上一个会话: " + f14918h);
            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "Extend current session: " + f14918h);
            if (f14922l) {
                f14922l = false;
                if (FieldManager.allow(C3520d.f15634E)) {
                    Context context2 = f14919i;
                    UMWorkDispatch.sendEventEx(context2, C3395q.a.f14854E, CoreProtocol.getInstance(context2), null, 0L);
                }
            }
            m14425f(context);
            C3395q.m14330a(f14919i).m14367a(false);
        } catch (Throwable unused) {
        }
    }

    @Deprecated
    /* renamed from: c */
    public String m14434c(Context context) {
        try {
            if (f14918h == null) {
                return PreferenceWrapper.getDefault(context).getString("session_id", null);
            }
        } catch (Throwable unused) {
        }
        return f14918h;
    }

    @Deprecated
    /* renamed from: c */
    public String m14433c() {
        return m14434c(f14919i);
    }

    /* renamed from: b */
    public boolean m14432b(Context context, long j10, boolean z10) {
        String m13719a;
        long j11;
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (sharedPreferences == null || (m13719a = C3279aa.m13712a().m13719a(f14919i)) == null) {
                return false;
            }
            long j12 = sharedPreferences.getLong(f14915e, 0L);
            long j13 = sharedPreferences.getLong(f14916f, 0L);
            if (j12 <= 0 || j13 != 0) {
                return false;
            }
            try {
                if (z10) {
                    j11 = f14921k;
                    if (j11 == 0) {
                        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "------>>> lastActivityEndTime = 0, In-app upgrade, use currentTime: = " + j10);
                        j11 = j10;
                    } else {
                        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "------>>> lastActivityEndTime != 0, app upgrade, use lastActivityEndTime: = " + f14921k);
                    }
                    m14435c(f14919i, Long.valueOf(j11));
                } else {
                    m14435c(f14919i, Long.valueOf(j10));
                    j11 = j10;
                }
                JSONObject jSONObject = new JSONObject();
                if (z10) {
                    jSONObject.put(C3385g.d.a.f14681g, j11);
                } else {
                    jSONObject.put(C3385g.d.a.f14681g, j10);
                }
                JSONObject m13656b = C3272b.m13626a().m13656b();
                if (m13656b != null && m13656b.length() > 0) {
                    jSONObject.put("__sp", m13656b);
                }
                JSONObject m13661c = C3272b.m13626a().m13661c();
                if (m13661c != null && m13661c.length() > 0) {
                    jSONObject.put("__pp", m13661c);
                }
                if (FieldManager.allow(C3520d.f15634E)) {
                    UMRTLog.m14568e(UMRTLog.RTLOG_TAG, "--->>>*** foregroundCount = " + f14923m);
                    jSONObject.put(C3385g.d.a.f14682h, f14923m);
                    f14923m = 0L;
                } else {
                    jSONObject.put(C3385g.d.a.f14682h, 0L);
                }
                C3389k.m14262a(context).m14281a(m13719a, jSONObject, C3389k.a.END);
                C3395q.m14330a(f14919i).m14377e();
            } catch (Throwable unused) {
            }
            return true;
        } catch (Throwable unused2) {
            return false;
        }
    }

    /* renamed from: b */
    public void m14430b(Context context, long j10) {
        if (PreferenceWrapper.getDefault(context) == null) {
            return;
        }
        try {
            C3395q.m14330a(f14919i).m14374c((Object) null);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public String m14426a(Context context, long j10, boolean z10) {
        String m13724b = C3279aa.m13712a().m13724b(context);
        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> onInstantSessionInternal: current session id = " + m13724b);
        if (TextUtils.isEmpty(m13724b)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__e", j10);
            JSONObject m13656b = C3272b.m13626a().m13656b();
            if (m13656b != null && m13656b.length() > 0) {
                jSONObject.put("__sp", m13656b);
            }
            JSONObject m13661c = C3272b.m13626a().m13661c();
            if (m13661c != null && m13661c.length() > 0) {
                jSONObject.put("__pp", m13661c);
            }
            C3389k.m14262a(context).m14281a(m13724b, jSONObject, C3389k.a.INSTANTSESSIONBEGIN);
            C3395q.m14330a(context).m14366a(jSONObject, z10);
        } catch (Throwable unused) {
        }
        return m13724b;
    }

    @Deprecated
    /* renamed from: b */
    public String m14429b() {
        return f14918h;
    }

    @Override // com.umeng.analytics.pro.C3279aa.a
    /* renamed from: a */
    public void mo13730a(String str, String str2, long j10, long j11, long j12) {
        m14420a(f14919i, str2, j10, j11, j12);
        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "saveSessionToDB: complete");
        if (AnalyticsConstants.SUB_PROCESS_EVENT) {
            Context context = f14919i;
            UMWorkDispatch.sendEvent(context, UMProcessDBDatasSender.UM_PROCESS_EVENT_KEY, UMProcessDBDatasSender.getInstance(context), Long.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // com.umeng.analytics.pro.C3279aa.a
    /* renamed from: a */
    public void mo13729a(String str, long j10, long j11, long j12) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m14421a(str, j10);
    }

    /* renamed from: a */
    private void m14420a(Context context, String str, long j10, long j11, long j12) {
        if (TextUtils.isEmpty(f14918h)) {
            f14918h = C3279aa.m13712a().m13719a(f14919i);
        }
        if (TextUtils.isEmpty(str) || str.equals(f14918h)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3385g.d.a.f14681g, j11);
            jSONObject.put(C3385g.d.a.f14682h, j12);
            JSONObject m13656b = C3272b.m13626a().m13656b();
            if (m13656b != null && m13656b.length() > 0) {
                jSONObject.put("__sp", m13656b);
            }
            JSONObject m13661c = C3272b.m13626a().m13661c();
            if (m13661c != null && m13661c.length() > 0) {
                jSONObject.put("__pp", m13661c);
            }
            C3389k.m14262a(context).m14281a(f14918h, jSONObject, C3389k.a.END);
        } catch (Exception unused) {
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__e", j10);
            C3389k.m14262a(context).m14281a(str, jSONObject2, C3389k.a.BEGIN);
            if (FieldManager.allow(C3520d.f15634E)) {
                f14923m = j12;
                m14423d(context);
                Context context2 = f14919i;
                UMWorkDispatch.sendEventEx(context2, C3395q.a.f14854E, CoreProtocol.getInstance(context2), null, 0L);
            }
        } catch (Exception unused2) {
        }
        f14918h = str;
    }

    /* renamed from: a */
    private void m14421a(String str, long j10) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f14919i);
        if (sharedPreferences == null) {
            return;
        }
        long j11 = sharedPreferences.getLong(f14912b, 0L);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__ii", str);
            jSONObject.put("__e", j10);
            jSONObject.put(C3385g.d.a.f14681g, j11);
            double[] location = AnalyticsConfig.getLocation();
            if (location != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("lat", location[0]);
                jSONObject2.put("lng", location[1]);
                jSONObject2.put("ts", System.currentTimeMillis());
                jSONObject.put(C3385g.d.a.f14679e, jSONObject2);
            }
            Class<?> cls = Class.forName("android.net.TrafficStats");
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("getUidRxBytes", cls2);
            Method method2 = cls.getMethod("getUidTxBytes", cls2);
            int i10 = f14919i.getApplicationInfo().uid;
            if (i10 == -1) {
                return;
            }
            long longValue = ((Long) method.invoke(null, Integer.valueOf(i10))).longValue();
            long longValue2 = ((Long) method2.invoke(null, Integer.valueOf(i10))).longValue();
            if (longValue > 0 && longValue2 > 0) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(C3384f.f14547H, longValue);
                jSONObject3.put(C3384f.f14546G, longValue2);
                jSONObject.put(C3385g.d.a.f14678d, jSONObject3);
            }
            C3389k.m14262a(f14919i).m14281a(str, jSONObject, C3389k.a.NEWSESSION);
            C3402x.m14437a(f14919i);
            C3392n.m14309c(f14919i);
        } catch (Throwable unused) {
        }
    }
}
