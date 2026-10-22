package anet.channel.status;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.AwcnConfig;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.C1018c;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.status.b */
/* loaded from: classes.dex */
public class C0974b {

    /* renamed from: t */
    private static Method f4070t;

    /* renamed from: m */
    private static String[] f4063m = {"net.dns1", "net.dns2", "net.dns3", "net.dns4"};

    /* renamed from: a */
    static volatile Context f4051a = null;

    /* renamed from: b */
    static volatile boolean f4052b = false;

    /* renamed from: c */
    static volatile NetworkStatusHelper.NetworkStatus f4053c = NetworkStatusHelper.NetworkStatus.NONE;

    /* renamed from: d */
    static volatile String f4054d = "unknown";

    /* renamed from: e */
    static volatile String f4055e = "";

    /* renamed from: f */
    static volatile String f4056f = "";

    /* renamed from: g */
    static volatile String f4057g = "";

    /* renamed from: h */
    static volatile String f4058h = "unknown";

    /* renamed from: i */
    static volatile String f4059i = "";

    /* renamed from: j */
    static volatile Pair<String, Integer> f4060j = null;

    /* renamed from: k */
    static volatile boolean f4061k = false;

    /* renamed from: l */
    static volatile List<InetAddress> f4062l = Collections.EMPTY_LIST;

    /* renamed from: n */
    private static volatile boolean f4064n = false;

    /* renamed from: o */
    private static volatile boolean f4065o = false;

    /* renamed from: p */
    private static ConnectivityManager f4066p = null;

    /* renamed from: q */
    private static TelephonyManager f4067q = null;

    /* renamed from: r */
    private static WifiManager f4068r = null;

    /* renamed from: s */
    private static SubscriptionManager f4069s = null;

    /* renamed from: u */
    private static BroadcastReceiver f4071u = new BroadcastReceiver() { // from class: anet.channel.status.NetworkStatusMonitor$2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (ALog.isPrintLog(1)) {
                ALog.m4785d("awcn.NetworkStatusMonitor", "receiver:" + intent.getAction(), null, new Object[0]);
            }
            ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC0976d(this));
        }
    };

    C0974b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m4677a() {
        if (f4064n || f4051a == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                f4051a.registerReceiver(f4071u, intentFilter, 2);
            } else {
                f4051a.registerReceiver(f4071u, intentFilter);
            }
        } catch (Exception unused) {
            ALog.m4787e("awcn.NetworkStatusMonitor", "registerReceiver failed", null, new Object[0]);
        }
        m4682d();
        f4064n = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m4679b() {
        if (f4051a != null) {
            f4051a.unregisterReceiver(f4071u);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m4681c() {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 24 && !f4065o) {
            NetworkInfo m4683e = m4683e();
            if (m4683e != null && m4683e.isConnected()) {
                z10 = true;
            } else {
                z10 = false;
            }
            f4052b = z10;
            f4066p.registerDefaultNetworkCallback(new C0975c());
            f4065o = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r2v4, types: [int, java.lang.String] */
    /* renamed from: d */
    public static void m4682d() {
        NetworkInfo networkInfo;
        boolean z10;
        WifiInfo m4687i;
        ALog.m4785d("awcn.NetworkStatusMonitor", "[checkNetworkStatus]", null, new Object[0]);
        NetworkStatusHelper.NetworkStatus networkStatus = f4053c;
        String str = f4055e;
        String str2 = f4056f;
        try {
            try {
                networkInfo = m4683e();
                z10 = false;
            } catch (Exception e10) {
                ALog.m4786e("awcn.NetworkStatusMonitor", "getNetworkInfo exception", null, e10, new Object[0]);
                m4678a(NetworkStatusHelper.NetworkStatus.NONE, "unknown");
                networkInfo = null;
                z10 = true;
            }
            if (!z10) {
                if (networkInfo != null && networkInfo.isConnected()) {
                    ALog.m4788i("awcn.NetworkStatusMonitor", "checkNetworkStatus", null, "info.isConnected", Boolean.valueOf(networkInfo.isConnected()), "info.isAvailable", Boolean.valueOf(networkInfo.isAvailable()), "info.getType", Integer.valueOf(networkInfo.getType()));
                    if (networkInfo.getType() == 0) {
                        String subtypeName = networkInfo.getSubtypeName();
                        String str3 = "";
                        if (!TextUtils.isEmpty(subtypeName)) {
                            str3 = subtypeName.replace(" ", "");
                        }
                        m4678a(m4675a(networkInfo.getSubtype(), str3), str3);
                        f4055e = m4676a(networkInfo.getExtraInfo());
                        m4686h();
                    } else {
                        ?? type = networkInfo.getType();
                        if (type == 1) {
                            m4678a(NetworkStatusHelper.NetworkStatus.WIFI, "wifi");
                            if (AwcnConfig.isWifiInfoEnable() && (m4687i = m4687i()) != null && m4680b(type)) {
                                f4057g = m4687i.getBSSID();
                                f4056f = m4687i.getSSID();
                            }
                            f4058h = "wifi";
                            f4059i = "wifi";
                            f4060j = m4688j();
                        } else {
                            m4678a(NetworkStatusHelper.NetworkStatus.NONE, "unknown");
                        }
                    }
                    f4061k = networkInfo.isRoaming();
                    C1018c.m4801e();
                }
                m4678a(NetworkStatusHelper.NetworkStatus.NO, "no network");
                ALog.m4788i("awcn.NetworkStatusMonitor", "checkNetworkStatus", null, "no network");
            }
            if (f4053c != networkStatus || !f4055e.equalsIgnoreCase(str) || !f4056f.equalsIgnoreCase(str2)) {
                if (ALog.isPrintLog(2)) {
                    NetworkStatusHelper.printNetworkDetail();
                }
                NetworkStatusHelper.notifyStatusChanged(f4053c);
            }
        } catch (Exception e11) {
            ALog.m4786e("awcn.NetworkStatusMonitor", "checkNetworkStatus", null, e11, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static NetworkInfo m4683e() {
        if (f4066p == null) {
            f4066p = (ConnectivityManager) f4051a.getSystemService("connectivity");
        }
        return f4066p.getActiveNetworkInfo();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static String m4684f() {
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
            for (String str : f4063m) {
                String str2 = (String) method.invoke(null, str);
                if (!TextUtils.isEmpty(str2)) {
                    return str2;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m4685g() {
        int restrictBackgroundStatus;
        if (f4066p != null && Build.VERSION.SDK_INT >= 24) {
            restrictBackgroundStatus = f4066p.getRestrictBackgroundStatus();
            return restrictBackgroundStatus;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.telephony.TelephonyManager, java.lang.String] */
    /* renamed from: h */
    private static void m4686h() {
        CharSequence carrierName;
        SubscriptionManager from;
        try {
            if (!AwcnConfig.isCarrierInfoEnable() || !m4680b("android.permission.READ_PHONE_STATE")) {
                return;
            }
            if (f4067q == null) {
                f4067q = (TelephonyManager) f4051a.getSystemService("phone");
            }
            f4059i = f4067q;
            if (Build.VERSION.SDK_INT >= 22) {
                if (f4069s == null) {
                    from = SubscriptionManager.from(f4051a);
                    f4069s = from;
                    f4070t = from.getClass().getDeclaredMethod("getDefaultDataSubscriptionInfo", new Class[0]);
                }
                Method method = f4070t;
                if (method != null) {
                    carrierName = AbstractC0981i.m4693a(method.invoke(f4069s, new Object[0])).getCarrierName();
                    f4058h = carrierName.toString();
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: i */
    private static WifiInfo m4687i() {
        try {
            if (f4068r == null) {
                f4068r = (WifiManager) f4051a.getSystemService("wifi");
            }
            return f4068r.getConnectionInfo();
        } catch (Throwable th) {
            ALog.m4786e("awcn.NetworkStatusMonitor", "getWifiInfo", null, th, new Object[0]);
            return null;
        }
    }

    /* renamed from: j */
    private static Pair<String, Integer> m4688j() {
        try {
            String property = System.getProperty("http.proxyHost");
            if (!TextUtils.isEmpty(property)) {
                return Pair.create(property, Integer.valueOf(Integer.parseInt(System.getProperty("http.proxyPort"))));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static boolean m4680b(String str) {
        int checkSelfPermission;
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        checkSelfPermission = f4051a.checkSelfPermission(str);
        return checkSelfPermission == 0;
    }

    /* renamed from: a */
    private static void m4678a(NetworkStatusHelper.NetworkStatus networkStatus, String str) {
        f4053c = networkStatus;
        f4054d = str;
        f4055e = "";
        f4056f = "";
        f4057g = "";
        f4060j = null;
        f4058h = "";
        f4059i = "";
    }

    /* renamed from: a */
    private static NetworkStatusHelper.NetworkStatus m4675a(int i10, String str) {
        switch (i10) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return NetworkStatusHelper.NetworkStatus.G2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return NetworkStatusHelper.NetworkStatus.G3;
            case 13:
            case 18:
            case 19:
                return NetworkStatusHelper.NetworkStatus.G4;
            case 20:
                return NetworkStatusHelper.NetworkStatus.G5;
            default:
                if (!str.equalsIgnoreCase("TD-SCDMA") && !str.equalsIgnoreCase("WCDMA") && !str.equalsIgnoreCase("CDMA2000")) {
                    return NetworkStatusHelper.NetworkStatus.NONE;
                }
                return NetworkStatusHelper.NetworkStatus.G3;
        }
    }

    /* renamed from: a */
    private static String m4676a(String str) {
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.contains("cmwap")) {
                return "cmwap";
            }
            if (lowerCase.contains("uniwap")) {
                return "uniwap";
            }
            if (lowerCase.contains("3gwap")) {
                return "3gwap";
            }
            if (lowerCase.contains("ctwap")) {
                return "ctwap";
            }
            if (lowerCase.contains("cmnet")) {
                return "cmnet";
            }
            if (lowerCase.contains("uninet")) {
                return "uninet";
            }
            if (lowerCase.contains("3gnet")) {
                return "3gnet";
            }
            if (lowerCase.contains("ctnet")) {
                return "ctnet";
            }
        }
        return "unknown";
    }
}
