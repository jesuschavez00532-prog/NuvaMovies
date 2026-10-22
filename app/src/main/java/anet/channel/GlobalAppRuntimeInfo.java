package anet.channel;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.entity.ENV;
import anet.channel.fulltrace.C0938a;
import anet.channel.fulltrace.C0939b;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.ALog;
import anet.channel.util.Utils;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class GlobalAppRuntimeInfo {

    /* renamed from: a */
    private static Context f3710a;

    /* renamed from: e */
    private static String f3714e;

    /* renamed from: f */
    private static String f3715f;

    /* renamed from: g */
    private static String f3716g;

    /* renamed from: k */
    private static volatile long f3720k;

    /* renamed from: l */
    private static String f3721l;

    /* renamed from: b */
    private static ENV f3711b = ENV.ONLINE;

    /* renamed from: c */
    private static String f3712c = "";

    /* renamed from: d */
    private static String f3713d = "";

    /* renamed from: h */
    private static volatile boolean f3717h = true;

    /* renamed from: i */
    private static SharedPreferences f3718i = null;

    /* renamed from: j */
    private static volatile CopyOnWriteArrayList<String> f3719j = null;

    public static void addBucketInfo(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && str.length() <= 32 && str2.length() <= 32) {
            synchronized (GlobalAppRuntimeInfo.class) {
                if (f3719j == null) {
                    f3719j = new CopyOnWriteArrayList<>();
                }
                f3719j.add(str);
                f3719j.add(str2);
            }
        }
    }

    public static CopyOnWriteArrayList<String> getBucketInfo() {
        return f3719j;
    }

    public static Context getContext() {
        return f3710a;
    }

    public static String getCurrentProcess() {
        return f3713d;
    }

    public static ENV getEnv() {
        return f3711b;
    }

    @Deprecated
    public static long getInitTime() {
        return f3720k;
    }

    @Deprecated
    public static int getStartType() {
        C0939b sceneInfo = C0938a.m4580a().getSceneInfo();
        if (sceneInfo != null) {
            return sceneInfo.f3892a;
        }
        return -1;
    }

    public static String getTtid() {
        return f3714e;
    }

    public static String getUserId() {
        return f3715f;
    }

    public static String getUtdid() {
        Context context;
        if (f3716g == null && (context = f3710a) != null) {
            f3716g = Utils.getDeviceId(context);
        }
        return f3716g;
    }

    public static boolean isAppBackground() {
        if (f3710a == null) {
            return true;
        }
        return f3717h;
    }

    public static boolean isTargetProcess() {
        if (TextUtils.isEmpty(f3712c) || TextUtils.isEmpty(f3713d)) {
            return true;
        }
        return f3712c.equalsIgnoreCase(f3713d);
    }

    public static void setBackground(boolean z10) {
        f3717h = z10;
    }

    public static void setContext(Context context) {
        f3710a = context;
        if (context != null) {
            if (TextUtils.isEmpty(f3713d)) {
                f3713d = Utils.getProcessName(context, Process.myPid());
            }
            if (TextUtils.isEmpty(f3712c)) {
                f3712c = Utils.getMainProcessName(context);
            }
            if (f3718i == null) {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                f3718i = defaultSharedPreferences;
                f3715f = defaultSharedPreferences.getString("UserId", null);
            }
            ALog.m4787e("awcn.GlobalAppRuntimeInfo", "", null, "CurrentProcess", f3713d, "TargetProcess", f3712c);
        }
    }

    public static void setCurrentProcess(String str) {
        f3713d = str;
    }

    public static void setEnv(ENV env) {
        f3711b = env;
    }

    @Deprecated
    public static void setInitTime(long j10) {
        f3720k = j10;
    }

    public static void setTargetProcess(String str) {
        f3712c = str;
    }

    public static void setTtid(String str) {
        String str2;
        f3714e = str;
        try {
            if (!TextUtils.isEmpty(str)) {
                int indexOf = str.indexOf("@");
                String str3 = null;
                if (indexOf != -1) {
                    str2 = str.substring(0, indexOf);
                } else {
                    str2 = null;
                }
                String substring = str.substring(indexOf + 1);
                int lastIndexOf = substring.lastIndexOf("_");
                if (lastIndexOf != -1) {
                    String substring2 = substring.substring(0, lastIndexOf);
                    str3 = substring.substring(lastIndexOf + 1);
                    substring = substring2;
                }
                f3721l = str3;
                AmdcRuntimeInfo.setAppInfo(substring, str3, str2);
            }
        } catch (Exception unused) {
        }
    }

    public static void setUserId(String str) {
        String str2 = f3715f;
        if (str2 == null || !str2.equals(str)) {
            f3715f = str;
            StrategyCenter.getInstance().forceRefreshStrategy(DispatchConstants.getAmdcServerDomain());
            SharedPreferences sharedPreferences = f3718i;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString("UserId", str).apply();
            }
        }
    }

    public static void setUtdid(String str) {
        String str2 = f3716g;
        if (str2 == null || !str2.equals(str)) {
            f3716g = str;
        }
    }

    public static boolean isTargetProcess(String str) {
        if (TextUtils.isEmpty(f3712c) || TextUtils.isEmpty(str)) {
            return true;
        }
        return f3712c.equalsIgnoreCase(str);
    }
}
