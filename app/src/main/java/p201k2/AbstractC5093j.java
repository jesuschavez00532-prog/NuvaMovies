package p201k2;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.taobao.accs.common.Constants;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.Reader;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import org.android.agoo.message.MessageService;
import p170i2.C4842a;

/* renamed from: k2.j */
/* loaded from: classes.dex */
public abstract class AbstractC5093j {

    /* renamed from: a */
    public static String f20977a;

    /* renamed from: b */
    private static volatile String f20978b;

    /* renamed from: a */
    private static String m20669a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer(bArr.length);
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            String hexString = Integer.toHexString(bArr[i10] & 255);
            if (i10 != 0) {
                stringBuffer.append(":");
            }
            if (hexString.length() == 1) {
                stringBuffer.append(MessageService.MSG_DB_READY_REPORT);
                stringBuffer.append(hexString);
            } else {
                stringBuffer.append(hexString);
            }
        }
        return String.valueOf(stringBuffer);
    }

    /* renamed from: b */
    private static String m20670b(String str, String str2) {
        String readLine = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(str).getInputStream()));
            do {
                readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return readLine;
                }
            } while (!readLine.contains(str2));
            return readLine;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: c */
    private static String m20671c() {
        String str = null;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (true) {
                    if (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (!(nextElement instanceof Inet6Address) && !"127.0.0.1".equals(nextElement.getHostAddress())) {
                            str = nextElement.getHostAddress();
                            break;
                        }
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return str;
    }

    /* renamed from: d */
    private static String m20672d() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress() && !nextElement.isLinkLocalAddress()) {
                        return nextElement.getHostAddress().toString();
                    }
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static String m20673e() {
        try {
            return m20669a(NetworkInterface.getByInetAddress(InetAddress.getByName(m20672d())).getHardwareAddress());
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: f */
    private static String m20674f(Context context) {
        try {
            return ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: g */
    private static String m20675g() {
        try {
            LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(Runtime.getRuntime().exec("cat /sys/class/net/wlan0/address ").getInputStream()));
            String str = "";
            while (str != null) {
                str = lineNumberReader.readLine();
                if (str != null) {
                    return str.trim();
                }
            }
            return "";
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: h */
    public static String m20676h(Context context) {
        if (TextUtils.isEmpty(f20977a)) {
            f20977a = m20679k(context);
        }
        return f20977a;
    }

    /* renamed from: i */
    private static String m20677i() {
        String m20670b = m20670b("busybox ifconfig", "HWaddr");
        if (m20670b == null) {
            return "";
        }
        if (m20670b.length() > 0 && m20670b.contains("HWaddr")) {
            String substring = m20670b.substring(m20670b.indexOf("HWaddr") + 6, m20670b.length() - 1);
            if (substring.length() > 1) {
                m20670b = substring.toLowerCase();
            }
        }
        return m20670b.trim();
    }

    /* renamed from: j */
    public static String m20678j() {
        if (f20978b == null) {
            synchronized (AbstractC5093j.class) {
                if (f20978b == null) {
                    f20978b = "000000000000";
                    m20683o();
                }
            }
        }
        return f20978b;
    }

    /* renamed from: k */
    public static String m20679k(Context context) {
        String str = "";
        if (TextUtils.isEmpty("")) {
            try {
                str = m20680l("/sys/class/net/eth0/address").toUpperCase().substring(0, 17);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = m20673e();
        }
        if (TextUtils.isEmpty(str)) {
            str = m20677i();
        }
        if (TextUtils.isEmpty(str)) {
            str = m20674f(context);
        }
        if (TextUtils.isEmpty(str)) {
            return m20675g();
        }
        return str;
    }

    /* renamed from: l */
    private static String m20680l(String str) throws java.io.IOException {
        FileReader fileReader = new FileReader(str);
        String m20681m = m20681m(fileReader);
        fileReader.close();
        return m20681m;
    }

    /* renamed from: m */
    private static String m20681m(Reader reader) {
        StringBuilder sb2 = new StringBuilder();
        char[] cArr = new char[4096];
        int read = reader.read(cArr);
        while (read >= 0) {
            sb2.append(cArr, 0, read);
            read = reader.read(cArr);
        }
        return sb2.toString();
    }

    /* renamed from: n */
    private static void m20682n(String str, String str2) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/net/arp"));
            StringBuilder sb2 = new StringBuilder();
            boolean z10 = false;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                try {
                    String trim = readLine.trim();
                    if (trim.length() >= 63 && !trim.toUpperCase(Locale.US).contains("IP")) {
                        String trim2 = trim.substring(0, 17).trim();
                        trim.substring(29, 32).trim();
                        String trim3 = trim.substring(41, 63).trim();
                        if (!trim3.contains("00:00:00:00:00:00") && !TextUtils.isEmpty(trim3)) {
                            sb2.append(trim3);
                            sb2.append(",");
                            if (!z10 && ((!TextUtils.isEmpty(str) && str.equals(trim2)) || (!TextUtils.isEmpty(str2) && str2.equals(trim2)))) {
                                f20978b = trim3.replaceAll(":", "");
                                z10 = true;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (sb2.length() > 0) {
                String substring = sb2.substring(0, sb2.length() - 1);
                C4842a c4842a = C4842a.f20329a;
                String mo19980c = c4842a.m19921b().mo19980c(substring, c4842a.m19921b().mo19989l());
                HashMap hashMap = new HashMap();
                hashMap.put(Constants.SEND_TYPE_RES, mo19980c);
                c4842a.m19921b().mo19983f(hashMap);
            }
            bufferedReader.close();
        } catch (Exception unused2) {
        }
    }

    /* renamed from: o */
    public static void m20683o() {
        String m20671c = m20671c();
        if (m20671c != null) {
            String[] split = m20671c.split("\\.");
            if (split.length >= 4) {
                split[3] = "1";
                String str = split[0] + "." + split[1] + "." + split[2] + "." + split[3];
                split[3] = "254";
                m20682n(str, split[0] + "." + split[1] + "." + split[2] + "." + split[3]);
            }
        }
    }
}
