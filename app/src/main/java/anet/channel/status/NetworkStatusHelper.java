package anet.channel.status;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.C1022g;
import anet.channel.util.StringUtils;
import com.taobao.accs.utl.BaseMonitor;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public class NetworkStatusHelper {
    private static final String TAG = "awcn.NetworkStatusHelper";
    static CopyOnWriteArraySet<INetworkStatusChangeListener> listeners = new CopyOnWriteArraySet<>();

    /* loaded from: classes.dex */
    public interface INetworkStatusChangeListener {
        void onNetworkStatusChanged(NetworkStatus networkStatus);
    }

    /* loaded from: classes.dex */
    public enum NetworkStatus {
        NONE,
        NO,
        G2,
        G3,
        G4,
        WIFI,
        G5;

        public String getType() {
            if (this == G2) {
                return "2G";
            }
            if (this == G3) {
                return "3G";
            }
            if (this == G4) {
                return "4G";
            }
            if (this == G5) {
                return "5G";
            }
            return toString();
        }

        public boolean isMobile() {
            if (this != G2 && this != G3 && this != G4 && this != G5) {
                return false;
            }
            return true;
        }

        public boolean isWifi() {
            if (this == WIFI) {
                return true;
            }
            return false;
        }
    }

    public static void addStatusChangeListener(INetworkStatusChangeListener iNetworkStatusChangeListener) {
        listeners.add(iNetworkStatusChangeListener);
    }

    public static String getApn() {
        return C0974b.f4055e;
    }

    public static String getCarrier() {
        return C0974b.f4058h;
    }

    public static String getDnsServerAddress() {
        if (!C0974b.f4062l.isEmpty()) {
            return C0974b.f4062l.get(0).getHostAddress();
        }
        return C0974b.m4684f();
    }

    public static String getNetworkSubType() {
        return C0974b.f4054d;
    }

    public static String getProxyType() {
        NetworkStatus networkStatus = C0974b.f4053c;
        if (networkStatus == NetworkStatus.WIFI && getWifiProxy() != null) {
            return "proxy";
        }
        if (networkStatus.isMobile() && C0974b.f4055e.contains("wap")) {
            return "wap";
        }
        if (networkStatus.isMobile() && C1022g.m4808a() != null) {
            return BaseMonitor.ALARM_POINT_AUTH;
        }
        return "";
    }

    public static int getRestrictBackgroundStatus() {
        return C0974b.m4685g();
    }

    public static String getSimOp() {
        return C0974b.f4059i;
    }

    public static NetworkStatus getStatus() {
        return C0974b.f4053c;
    }

    public static String getUniqueId(NetworkStatus networkStatus) {
        String str = "";
        if (networkStatus.isWifi()) {
            String md5ToHex = StringUtils.md5ToHex(getWifiBSSID());
            if (!TextUtils.isEmpty(md5ToHex)) {
                str = md5ToHex;
            }
            return "WIFI$" + str;
        }
        if (!networkStatus.isMobile()) {
            return "";
        }
        return networkStatus.getType() + "$" + getApn();
    }

    public static String getWifiBSSID() {
        return C0974b.f4057g;
    }

    public static Pair<String, Integer> getWifiProxy() {
        if (C0974b.f4053c != NetworkStatus.WIFI) {
            return null;
        }
        return C0974b.f4060j;
    }

    public static String getWifiSSID() {
        return C0974b.f4056f;
    }

    public static boolean isConnected() {
        if (Build.VERSION.SDK_INT >= 24) {
            if (C0974b.f4052b) {
                return true;
            }
        } else if (C0974b.f4053c != NetworkStatus.NO) {
            return true;
        }
        try {
            NetworkInfo m4683e = C0974b.m4683e();
            if (m4683e != null) {
                if (m4683e.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean isProxy() {
        NetworkStatus networkStatus = C0974b.f4053c;
        String str = C0974b.f4055e;
        if (networkStatus != NetworkStatus.WIFI || getWifiProxy() == null) {
            if (networkStatus.isMobile()) {
                if (str.contains("wap") || C1022g.m4808a() != null) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean isRoaming() {
        return C0974b.f4061k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void notifyStatusChanged(NetworkStatus networkStatus) {
        ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC0973a(networkStatus));
    }

    public static void printNetworkDetail() {
        try {
            NetworkStatus status = getStatus();
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("\nNetwork detail*******************************\n");
            sb2.append("Status: ");
            sb2.append(status.getType());
            sb2.append('\n');
            sb2.append("Subtype: ");
            sb2.append(getNetworkSubType());
            sb2.append('\n');
            if (status != NetworkStatus.NO) {
                if (status.isMobile()) {
                    sb2.append("Apn: ");
                    sb2.append(getApn());
                    sb2.append('\n');
                    sb2.append("Carrier: ");
                    sb2.append(getCarrier());
                    sb2.append('\n');
                } else {
                    sb2.append("BSSID: ");
                    sb2.append(getWifiBSSID());
                    sb2.append('\n');
                    sb2.append("SSID: ");
                    sb2.append(getWifiSSID());
                    sb2.append('\n');
                }
            }
            if (isProxy()) {
                sb2.append("Proxy: ");
                sb2.append(getProxyType());
                sb2.append('\n');
                Pair<String, Integer> wifiProxy = getWifiProxy();
                if (wifiProxy != null) {
                    sb2.append("ProxyHost: ");
                    sb2.append((String) wifiProxy.first);
                    sb2.append('\n');
                    sb2.append("ProxyPort: ");
                    sb2.append(wifiProxy.second);
                    sb2.append('\n');
                }
            }
            sb2.append("*********************************************");
            ALog.m4788i(TAG, sb2.toString(), null, new Object[0]);
        } catch (Exception unused) {
        }
    }

    public static void removeStatusChangeListener(INetworkStatusChangeListener iNetworkStatusChangeListener) {
        listeners.remove(iNetworkStatusChangeListener);
    }

    public static synchronized void startListener(Context context) {
        synchronized (NetworkStatusHelper.class) {
            if (context != null) {
                C0974b.f4051a = context;
                C0974b.m4677a();
                C0974b.m4681c();
            } else {
                throw new NullPointerException("context is null");
            }
        }
    }

    public void stopListener(Context context) {
        C0974b.m4679b();
    }
}
