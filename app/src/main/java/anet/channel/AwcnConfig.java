package anet.channel;

import android.text.TextUtils;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyTemplate;
import anet.channel.strategy.utils.C1009d;
import anet.channel.util.ALog;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AwcnConfig {
    public static final String HTTP3_ENABLE = "HTTP3_ENABLE";
    public static final String NEXT_LAUNCH_FORBID = "NEXT_LAUNCH_FORBID";

    /* renamed from: a */
    private static volatile boolean f3675a = false;

    /* renamed from: b */
    private static volatile boolean f3676b = true;

    /* renamed from: c */
    private static volatile boolean f3677c = true;

    /* renamed from: d */
    private static volatile boolean f3678d = true;

    /* renamed from: e */
    private static volatile boolean f3679e = false;

    /* renamed from: f */
    private static volatile boolean f3680f = true;

    /* renamed from: g */
    private static volatile long f3681g = 43200000;

    /* renamed from: h */
    private static volatile boolean f3682h = true;

    /* renamed from: i */
    private static volatile boolean f3683i = true;

    /* renamed from: j */
    private static boolean f3684j = true;

    /* renamed from: k */
    private static boolean f3685k = false;

    /* renamed from: l */
    private static volatile boolean f3686l = false;

    /* renamed from: m */
    private static volatile boolean f3687m = true;

    /* renamed from: n */
    private static volatile boolean f3688n = false;

    /* renamed from: o */
    private static volatile int f3689o = 10000;

    /* renamed from: p */
    private static volatile boolean f3690p = false;

    /* renamed from: q */
    private static volatile boolean f3691q = true;

    /* renamed from: r */
    private static volatile int f3692r = -1;

    /* renamed from: s */
    private static volatile boolean f3693s = true;

    /* renamed from: t */
    private static volatile boolean f3694t = true;

    /* renamed from: u */
    private static volatile boolean f3695u = false;

    /* renamed from: v */
    private static volatile boolean f3696v = true;

    /* renamed from: w */
    private static volatile CopyOnWriteArrayList<String> f3697w = null;

    /* renamed from: x */
    private static volatile boolean f3698x = true;

    /* renamed from: y */
    private static volatile boolean f3699y = true;

    public static int getAccsReconnectionDelayPeriod() {
        return f3689o;
    }

    public static long getIpv6BlackListTtl() {
        return f3681g;
    }

    public static int getXquicCongControl() {
        return f3692r;
    }

    public static boolean isAccsSessionCreateForbiddenInBg() {
        return f3675a;
    }

    public static boolean isAllowHttpDnsNotify(String str) {
        if (f3697w != null && !TextUtils.isEmpty(str)) {
            return f3697w.contains(str);
        }
        return false;
    }

    public static boolean isAppLifeCycleListenerEnable() {
        return f3684j;
    }

    public static boolean isAsyncLoadStrategyEnable() {
        return f3685k;
    }

    public static boolean isCarrierInfoEnable() {
        return f3699y;
    }

    public static boolean isCookieHeaderRedundantFix() {
        return f3694t;
    }

    public static boolean isHorseRaceEnable() {
        return f3677c;
    }

    public static boolean isHttp3Enable() {
        return f3690p;
    }

    public static boolean isHttp3OrangeEnable() {
        return f3691q;
    }

    public static boolean isHttpsSniEnable() {
        return f3676b;
    }

    public static boolean isIdleSessionCloseEnable() {
        return f3680f;
    }

    public static boolean isIpStackDetectByUdpConnect() {
        return f3693s;
    }

    public static boolean isIpv6BlackListEnable() {
        return f3683i;
    }

    public static boolean isIpv6Enable() {
        return f3682h;
    }

    public static boolean isNetworkDetectEnable() {
        return f3688n;
    }

    public static boolean isPing6Enable() {
        return f3687m;
    }

    public static boolean isQuicEnable() {
        return f3679e;
    }

    public static boolean isSendConnectInfoByBroadcast() {
        return f3695u;
    }

    public static boolean isSendConnectInfoByService() {
        return f3696v;
    }

    public static boolean isTbNextLaunch() {
        return f3686l;
    }

    public static boolean isTnetHeaderCacheEnable() {
        return f3678d;
    }

    public static boolean isWifiInfoEnable() {
        return f3698x;
    }

    public static void registerPresetSessions(String str) {
        if (!GlobalAppRuntimeInfo.isTargetProcess() || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                String string = jSONObject.getString("host");
                if (C1009d.m4781c(string)) {
                    StrategyTemplate.getInstance().registerConnProtocol(string, ConnProtocol.valueOf(jSONObject.getString("protocol"), jSONObject.getString("rtt"), jSONObject.getString("publicKey")));
                    if (jSONObject.getBoolean("isKeepAlive")) {
                        SessionCenter.getInstance().registerSessionInfo(SessionInfo.create(string, true, false, null, null, null));
                    }
                } else {
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void setAccsReconnectionDelayPeriod(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 > 10000) {
            i10 = 10000;
        }
        f3689o = i10;
    }

    public static void setAccsSessionCreateForbiddenInBg(boolean z10) {
        f3675a = z10;
    }

    public static void setAppLifeCycleListenerEnable(boolean z10) {
        f3684j = z10;
    }

    public static void setAsyncLoadStrategyEnable(boolean z10) {
        f3685k = z10;
    }

    public static void setCarrierInfoEnable(boolean z10) {
        f3699y = z10;
    }

    public static void setCookieHeaderRedundantFix(boolean z10) {
        f3694t = z10;
    }

    public static void setHorseRaceEnable(boolean z10) {
        f3677c = z10;
    }

    public static void setHttp3Enable(boolean z10) {
        f3690p = z10;
        ALog.m4787e("awcn.AwcnConfig", "[setHttp3Enable]", null, "enable", Boolean.valueOf(z10));
    }

    public static void setHttp3OrangeEnable(boolean z10) {
        f3691q = z10;
    }

    public static void setHttpDnsNotifyWhiteList(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string = jSONArray.getString(i10);
                if (!TextUtils.isEmpty(string)) {
                    copyOnWriteArrayList.add(string);
                }
            }
            f3697w = copyOnWriteArrayList;
        } catch (Exception e10) {
            ALog.m4786e("awcn.AwcnConfig", "[setHttpDnsNotifyWhiteList] error", null, e10, new Object[0]);
        }
    }

    public static void setHttpsSniEnable(boolean z10) {
        f3676b = z10;
    }

    public static void setIdleSessionCloseEnable(boolean z10) {
        f3680f = z10;
    }

    public static void setIpStackDetectByUdpConnect(boolean z10) {
        f3693s = z10;
    }

    public static void setIpv6BlackListEnable(boolean z10) {
        f3683i = z10;
    }

    public static void setIpv6BlackListTtl(long j10) {
        f3681g = j10;
    }

    public static void setIpv6Enable(boolean z10) {
        f3682h = z10;
    }

    public static void setNetworkDetectEnable(boolean z10) {
        f3688n = z10;
    }

    public static void setPing6Enable(boolean z10) {
        f3687m = z10;
    }

    public static void setQuicEnable(boolean z10) {
        f3679e = z10;
    }

    public static void setSendConnectInfoByBroadcast(boolean z10) {
        f3695u = z10;
    }

    public static void setSendConnectInfoByService(boolean z10) {
        f3696v = z10;
    }

    public static void setTbNextLaunch(boolean z10) {
        f3686l = z10;
    }

    public static void setTnetHeaderCacheEnable(boolean z10) {
        f3678d = z10;
    }

    public static void setWifiInfoEnable(boolean z10) {
        f3698x = z10;
    }

    public static void setXquicCongControl(int i10) {
        if (i10 < 0) {
            return;
        }
        f3692r = i10;
    }
}
