package anet.channel.util;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.NetTypeStat;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.security.InvalidParameterException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.android.netutil.UdpConnectType;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;

/* renamed from: anet.channel.util.c */
/* loaded from: classes.dex */
public class C1018c {
    public static final int IPV4_ONLY = 1;
    public static final int IPV6_ONLY = 2;
    public static final int IP_DUAL_STACK = 3;
    public static final int IP_STACK_UNKNOWN = 0;

    /* renamed from: b */
    static volatile String f4212b;

    /* renamed from: c */
    static C1021f f4213c;

    /* renamed from: a */
    static final byte[][] f4211a = {new byte[]{-64, 0, 0, -86}, new byte[]{-64, 0, 0, -85}};

    /* renamed from: d */
    static ConcurrentHashMap<String, C1021f> f4214d = new ConcurrentHashMap<>();

    /* renamed from: e */
    static ConcurrentHashMap<String, Integer> f4215e = new ConcurrentHashMap<>();

    static {
        f4212b = null;
        f4213c = null;
        try {
            f4213c = new C1021f((Inet6Address) InetAddress.getAllByName("64:ff9b::")[0], 96);
            f4212b = m4797b(NetworkStatusHelper.getStatus());
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static boolean m4795a() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static String m4797b(NetworkStatusHelper.NetworkStatus networkStatus) {
        if (networkStatus.isWifi()) {
            String wifiBSSID = NetworkStatusHelper.getWifiBSSID();
            if (TextUtils.isEmpty(wifiBSSID)) {
                wifiBSSID = "";
            }
            return "WIFI$" + wifiBSSID;
        }
        if (!networkStatus.isMobile()) {
            return "UnknownNetwork";
        }
        return networkStatus.getType() + "$" + NetworkStatusHelper.getApn();
    }

    /* renamed from: c */
    public static int m4799c() {
        Integer num = f4215e.get(f4212b);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: d */
    public static C1021f m4800d() {
        C1021f c1021f = f4214d.get(f4212b);
        if (c1021f == null) {
            return f4213c;
        }
        return c1021f;
    }

    /* renamed from: e */
    public static void m4801e() {
        if (!AwcnConfig.isIpv6Enable()) {
            ALog.m4787e("awcn.Inet64Util", "[startIpStackDetect]ipv6Enable=false", null, new Object[0]);
            return;
        }
        f4212b = m4797b(NetworkStatusHelper.getStatus());
        if (f4215e.putIfAbsent(f4212b, 0) != null) {
            return;
        }
        int m4806j = m4806j();
        f4215e.put(f4212b, Integer.valueOf(m4806j));
        NetTypeStat netTypeStat = new NetTypeStat();
        netTypeStat.ipStackType = m4806j;
        String str = f4212b;
        if (m4806j != 2 && m4806j != 3) {
            if (GlobalAppRuntimeInfo.isTargetProcess()) {
                AppMonitor.getInstance().commitStat(netTypeStat);
                return;
            }
            return;
        }
        ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC1019d(str, netTypeStat), 1500L, TimeUnit.MILLISECONDS);
    }

    /* renamed from: h */
    private static int m4804h() {
        String str;
        int i10;
        TreeMap treeMap = new TreeMap();
        Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
        while (true) {
            str = null;
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            NetworkInterface networkInterface = (NetworkInterface) it.next();
            if (!networkInterface.getInterfaceAddresses().isEmpty()) {
                String displayName = networkInterface.getDisplayName();
                ALog.m4788i("awcn.Inet64Util", "find NetworkInterface:" + displayName, null, new Object[0]);
                Iterator<InterfaceAddress> it2 = networkInterface.getInterfaceAddresses().iterator();
                int i11 = 0;
                while (it2.hasNext()) {
                    InetAddress address = it2.next().getAddress();
                    if (address instanceof Inet6Address) {
                        Inet6Address inet6Address = (Inet6Address) address;
                        if (!m4796a(inet6Address)) {
                            ALog.m4787e("awcn.Inet64Util", "Found IPv6 address:" + inet6Address.toString(), null, new Object[0]);
                            i11 |= 2;
                        }
                    } else if (address instanceof Inet4Address) {
                        Inet4Address inet4Address = (Inet4Address) address;
                        if (!m4796a((InetAddress) inet4Address) && !inet4Address.getHostAddress().startsWith("192.168.43.")) {
                            ALog.m4787e("awcn.Inet64Util", "Found IPv4 address:" + inet4Address.toString(), null, new Object[0]);
                            i11 |= 1;
                        }
                    }
                }
                if (i11 != 0) {
                    treeMap.put(displayName.toLowerCase(), Integer.valueOf(i11));
                }
            }
        }
        if (treeMap.isEmpty()) {
            return 0;
        }
        if (treeMap.size() == 1) {
            return ((Integer) treeMap.firstEntry().getValue()).intValue();
        }
        if (NetworkStatusHelper.getStatus().isWifi()) {
            str = "wlan";
        } else if (NetworkStatusHelper.getStatus().isMobile()) {
            str = "rmnet";
        }
        if (str != null) {
            Iterator it3 = treeMap.entrySet().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it3.next();
                if (((String) entry.getKey()).startsWith(str)) {
                    i10 = ((Integer) entry.getValue()).intValue();
                    break;
                }
            }
        }
        if (i10 == 2 && treeMap.containsKey("v4-wlan0")) {
            return i10 | ((Integer) treeMap.remove("v4-wlan0")).intValue();
        }
        return i10;
    }

    /* renamed from: i */
    private static int m4805i() {
        SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        boolean testUdpConnectIpv4 = UdpConnectType.testUdpConnectIpv4();
        if (UdpConnectType.testUdpConnectIpv6()) {
            return (testUdpConnectIpv4 ? 1 : 0) | 2;
        }
        return testUdpConnectIpv4 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object[]] */
    /* renamed from: j */
    public static int m4806j() {
        ?? r32;
        int i10;
        try {
            r32 = AwcnConfig.isIpStackDetectByUdpConnect();
            try {
                if (r32 != 0) {
                    String str = "udp_connect";
                    i10 = m4805i();
                    r32 = str;
                } else {
                    String str2 = "interfaces";
                    i10 = m4804h();
                    r32 = str2;
                }
            } catch (Throwable th) {
                th = th;
                ALog.m4786e("awcn.Inet64Util", "[detectIpStack]error.", null, th, new Object[0]);
                i10 = 0;
                ALog.m4787e("awcn.Inet64Util", "startIpStackDetect", null, new Object[]{"ip stack", Integer.valueOf(i10), "detectType", r32});
                return i10;
            }
        } catch (Throwable th2) {
            th = th2;
            r32 = 0;
        }
        ALog.m4787e("awcn.Inet64Util", "startIpStackDetect", null, new Object[]{"ip stack", Integer.valueOf(i10), "detectType", r32});
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static C1021f m4807k() {
        InetAddress inetAddress;
        boolean z10;
        try {
            inetAddress = InetAddress.getByName("ipv4only.arpa");
        } catch (Exception unused) {
            inetAddress = null;
        }
        if (inetAddress instanceof Inet6Address) {
            ALog.m4788i("awcn.Inet64Util", "Resolved AAAA: " + inetAddress.toString(), null, new Object[0]);
            byte[] address = inetAddress.getAddress();
            if (address.length != 16) {
                return null;
            }
            int i10 = 12;
            while (true) {
                if (i10 >= 0) {
                    byte b10 = address[i10];
                    byte[][] bArr = f4211a;
                    byte[] bArr2 = bArr[0];
                    if ((b10 & bArr2[0]) != 0 && address[i10 + 1] == 0 && address[i10 + 2] == 0) {
                        byte b11 = address[i10 + 3];
                        z10 = true;
                        if (b11 == bArr2[3] || b11 == bArr[1][3]) {
                            break;
                        }
                    }
                    i10--;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                address[i10 + 3] = 0;
                address[i10 + 2] = 0;
                address[i10 + 1] = 0;
                address[i10] = 0;
                return new C1021f(Inet6Address.getByAddress("ipv4only.arpa", address, 0), i10 * 8);
            }
        } else if (inetAddress instanceof Inet4Address) {
            ALog.m4788i("awcn.Inet64Util", "Resolved A: " + inetAddress.toString(), null, new Object[0]);
        }
        return null;
    }

    /* renamed from: a */
    public static String m4794a(Inet4Address inet4Address) {
        if (inet4Address != null) {
            C1021f m4800d = m4800d();
            if (m4800d != null) {
                byte[] address = inet4Address.getAddress();
                byte[] address2 = m4800d.f4220b.getAddress();
                int i10 = m4800d.f4219a / 8;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    int i13 = i11 + i10;
                    if (i13 > 15 || i12 >= 4) {
                        break;
                    }
                    if (i13 != 8) {
                        address2[i13] = (byte) (address[i12] | address2[i13]);
                        i12++;
                    }
                    i11++;
                }
                return InetAddress.getByAddress(address2).getHostAddress();
            }
            throw new Exception("cannot get nat64 prefix");
        }
        throw new InvalidParameterException("address in null");
    }

    /* renamed from: b */
    public static boolean m4798b() {
        Integer num = f4215e.get(f4212b);
        return num != null && num.intValue() == 1;
    }

    /* renamed from: a */
    public static String m4793a(String str) {
        return m4794a((Inet4Address) InetAddress.getByName(str));
    }

    /* renamed from: a */
    private static boolean m4796a(InetAddress inetAddress) {
        return inetAddress.isLoopbackAddress() || inetAddress.isLinkLocalAddress() || inetAddress.isAnyLocalAddress();
    }
}
