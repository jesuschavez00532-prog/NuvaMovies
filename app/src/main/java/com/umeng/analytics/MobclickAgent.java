package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.efs.sdk.base.EfsReporter;
import com.umeng.analytics.pro.C3304az;
import com.umeng.analytics.pro.C3306ba;
import com.umeng.analytics.pro.C3307bb;
import com.umeng.analytics.pro.C3390l;
import com.umeng.common.ISysListener;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.umcrash.UMCrash;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MobclickAgent {

    /* loaded from: classes3.dex */
    public enum EScenarioType {
        E_UM_NORMAL(0),
        E_UM_GAME(1);


        /* renamed from: a */
        private int f13877a;

        EScenarioType(int i10) {
            this.f13877a = i10;
        }

        public int toValue() {
            return this.f13877a;
        }
    }

    /* loaded from: classes.dex */
    public enum PageMode {
        AUTO,
        MANUAL,
        LEGACY_AUTO,
        LEGACY_MANUAL
    }

    public static void clearPreProperties(Context context) {
        getAgent().m13676g(context);
    }

    public static void disable() {
        AnalyticsConfig.enable = false;
    }

    private static void disableExceptionCatch() {
        C3272b.m13626a().m13655a(false);
        AnalyticsConfig.CHANGE_CATCH_EXCEPTION_NOTALLOW = true;
    }

    @Deprecated
    public static void enableEncrypt(boolean z10) {
    }

    public static C3272b getAgent() {
        return C3272b.m13626a();
    }

    public static JSONObject getPreProperties(Context context) {
        return getAgent().m13677h(context);
    }

    private static void init(Context context) {
        C3272b.m13626a().m13636a(context);
    }

    public static void onEvent(Context context, String str) {
        try {
            C3307bb c3307bb = new C3307bb();
            c3307bb.m13846a(C3307bb.a.ID).m13847a(str);
            C3304az.m13821a(context, 101, C3306ba.m13832a(), c3307bb);
        } catch (Throwable unused) {
        }
        C3272b.m13626a().m13641a(context, str, (String) null, -1L, 1);
    }

    public static void onEventObject(Context context, String str, Map<String, Object> map) {
        HashMap hashMap;
        try {
            C3307bb c3307bb = new C3307bb();
            if (map != null) {
                hashMap = new HashMap();
                for (String str2 : map.keySet()) {
                    hashMap.put(str2, map.get(str2));
                }
            } else {
                hashMap = null;
            }
            c3307bb.m13846a(C3307bb.a.OBJECT_MAP).m13847a(str).m13851b(hashMap);
            C3304az.m13821a(context, 101, C3306ba.m13832a(), c3307bb);
        } catch (Throwable unused) {
        }
        if (map == null) {
            UMLog.m14562aq(C3390l.f14753a, 0, "\\|");
        } else {
            C3272b.m13626a().m13644a(context, str, map, -1L);
        }
    }

    public static void onEventValue(Context context, String str, Map<String, String> map, int i10) {
        HashMap hashMap;
        HashMap hashMap2;
        try {
            C3307bb c3307bb = new C3307bb();
            if (map != null) {
                hashMap2 = new HashMap();
                for (String str2 : map.keySet()) {
                    hashMap2.put(str2, map.get(str2));
                }
            } else {
                hashMap2 = null;
            }
            c3307bb.m13846a(C3307bb.a.STRING_MAP).m13847a(str).m13848a(hashMap2).m13849a(true);
            C3304az.m13821a(context, 101, C3306ba.m13832a(), c3307bb);
        } catch (Throwable unused) {
        }
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        hashMap.put("__ct__", Integer.valueOf(i10));
        C3272b.m13626a().m13644a(context, str, hashMap, -1L);
    }

    private static void onGKVEvent(Context context, String str, HashMap<String, Object> hashMap) {
        C3272b.m13626a().m13642a(context, str, hashMap);
    }

    public static void onKillProcess(Context context) {
        C3272b.m13626a().m13666d(context);
    }

    public static void onPageEnd(String str) {
        if (!TextUtils.isEmpty(str)) {
            C3272b.m13626a().m13660b(str);
        } else {
            UMLog.m14562aq(C3390l.f14730D, 0, "\\|");
        }
    }

    public static void onPageStart(String str) {
        if (!TextUtils.isEmpty(str)) {
            C3272b.m13626a().m13650a(str);
        } else {
            UMLog.m14562aq(C3390l.f14729C, 0, "\\|");
        }
    }

    public static void onPause(Context context) {
        C3272b.m13626a().m13662c(context);
    }

    public static void onProfileSignIn(String str) {
        onProfileSignIn("_adhoc", str);
    }

    public static void onProfileSignOff() {
        C3272b.m13626a().m13680j();
    }

    public static void onResume(Context context) {
        if (context == null) {
            UMLog.m14562aq(C3390l.f14784n, 0, "\\|");
        } else {
            C3272b.m13626a().m13657b(context);
        }
    }

    public static void registerPreProperties(Context context, JSONObject jSONObject) {
        getAgent().m13647a(context, jSONObject);
    }

    public static void reportError(Context context, String str) {
        try {
            EfsReporter efsReporter = UMCrash.sReporter;
            Method declaredMethod = UMCrash.class.getDeclaredMethod("generateCustomLog", String.class, String.class);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(UMCrash.class, str, "DEFAULT");
            }
        } catch (Throwable unused) {
        }
    }

    public static void setCatchUncaughtExceptions(boolean z10) {
        C3272b.m13626a().m13655a(z10);
    }

    @Deprecated
    public static void setCheckDevice(boolean z10) {
    }

    @Deprecated
    public static void setDebugMode(boolean z10) {
    }

    public static void setFirstLaunchEvent(Context context, List<String> list) {
        getAgent().m13646a(context, list);
    }

    private static void setGameScenarioType(Context context) {
        C3272b.m13626a().m13638a(context, EScenarioType.E_UM_GAME);
    }

    @Deprecated
    public static void setLatencyWindow(long j10) {
    }

    public static void setLocation(double d10, double d11) {
        C3272b.m13626a().m13634a(d10, d11);
    }

    public static void setOpenGLContext(GL10 gl10) {
        C3272b.m13626a().m13654a(gl10);
    }

    public static void setPageCollectionMode(PageMode pageMode) {
        UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION = pageMode;
    }

    @Deprecated
    public static void setScenarioType(Context context, EScenarioType eScenarioType) {
    }

    public static void setSecret(Context context, String str) {
        C3272b.m13626a().m13663c(context, str);
    }

    public static void setSessionContinueMillis(long j10) {
        if (j10 <= 30000) {
            j10 = 30000;
        }
        C3272b.m13626a().m13635a(j10);
    }

    private static void setSysListener(ISysListener iSysListener) {
        C3272b.m13626a().m13648a(iSysListener);
    }

    public static void unregisterPreProperty(Context context, String str) {
        getAgent().m13674f(context, str);
    }

    public static void userProfile(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            MLog.m14765e("userProfile: key is null or empty, please check!");
            return;
        }
        if (str.startsWith("_")) {
            MLog.m14765e("userProfile: The user-defined key cannot start with an underscore, please check!");
            return;
        }
        boolean z10 = false;
        if (Character.isDigit(str.charAt(0))) {
            MLog.m14765e("userProfile: The user-defined key cannot start with an number, please check!");
            return;
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char c10 = charArray[i10];
            if ((c10 >= 'a' && c10 <= 'z') || ((c10 >= 'A' && c10 <= 'Z') || Character.isDigit(c10) || c10 == '_')) {
                i10++;
            } else {
                z10 = true;
                break;
            }
        }
        if (z10) {
            MLog.m14765e("userProfile: The user-defined key contains invalid characters, please check!");
        } else if (obj == null) {
            MLog.m14765e("userProfile: value is null, please check!");
        } else {
            C3272b.m13626a().m13651a(str, obj);
        }
    }

    public static void userProfileEMail(String str) {
        if (str == null) {
            MLog.m14765e("userProfileEMail: email value is null, please check!");
        } else {
            C3272b.m13626a().m13668d(str);
        }
    }

    public static void userProfileMobile(String str) {
        if (str == null) {
            MLog.m14765e("userProfileMobile: mobile value is null, please check!");
        } else {
            C3272b.m13626a().m13664c(str);
        }
    }

    public static void onProfileSignIn(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            UMLog.m14562aq(C3390l.f14790t, 0, "\\|");
            return;
        }
        if (str2.length() > 64) {
            UMLog.m14562aq(C3390l.f14791u, 0, "\\|");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            C3272b.m13626a().m13652a("_adhoc", str2);
        } else if (str.length() > 32) {
            UMLog.m14562aq(C3390l.f14792v, 0, "\\|");
        } else {
            C3272b.m13626a().m13652a(str, str2);
        }
    }

    public static void reportError(Context context, Throwable th) {
        try {
            EfsReporter efsReporter = UMCrash.sReporter;
            Method declaredMethod = UMCrash.class.getDeclaredMethod("generateCustomLog", Throwable.class, String.class);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(UMCrash.class, th, "DEFAULT");
            }
        } catch (Throwable unused) {
        }
    }

    public static void onEvent(Context context, String str, String str2) {
        try {
            C3307bb c3307bb = new C3307bb();
            c3307bb.m13846a(C3307bb.a.LABEL).m13847a(str).m13850b(str2);
            C3304az.m13821a(context, 101, C3306ba.m13832a(), c3307bb);
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(str2)) {
            UMLog.m14562aq(C3390l.f14781k, 0, "\\|");
        } else {
            C3272b.m13626a().m13641a(context, str, str2, -1L, 1);
        }
    }

    public static void onEvent(Context context, String str, Map<String, String> map) {
        HashMap hashMap;
        try {
            C3307bb c3307bb = new C3307bb();
            if (map != null) {
                hashMap = new HashMap();
                for (String str2 : map.keySet()) {
                    hashMap.put(str2, map.get(str2));
                }
            } else {
                hashMap = null;
            }
            c3307bb.m13846a(C3307bb.a.STRING_MAP).m13847a(str).m13848a(hashMap);
            C3304az.m13821a(context, 101, C3306ba.m13832a(), c3307bb);
        } catch (Throwable unused) {
        }
        if (map == null) {
            UMLog.m14562aq(C3390l.f14753a, 0, "\\|");
        } else {
            C3272b.m13626a().m13644a(context, str, new HashMap(map), -1L);
        }
    }
}
