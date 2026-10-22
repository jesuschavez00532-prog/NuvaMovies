package anet.channel.strategy.dispatch;

import android.os.Build;
import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.utils.C1009d;
import anet.channel.util.ALog;
import anet.channel.util.C1018c;
import com.taobao.accs.antibrush.C3117b;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: anet.channel.strategy.dispatch.d */
/* loaded from: classes.dex */
class C0993d {
    public static final String TAG = "amdc.DispatchParamBuilder";

    C0993d() {
    }

    /* renamed from: a */
    public static Map m4755a(Map<String, Object> map) {
        IAmdcSign sign = AmdcRuntimeInfo.getSign();
        if (sign != null && !TextUtils.isEmpty(sign.getAppkey())) {
            NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
            if (!NetworkStatusHelper.isConnected()) {
                ALog.m4787e(TAG, "no network, don't send amdc request", null, new Object[0]);
                return null;
            }
            map.put("appkey", sign.getAppkey());
            map.put("v", DispatchConstants.VER_CODE);
            map.put(DispatchConstants.PLATFORM, DispatchConstants.ANDROID);
            map.put(DispatchConstants.PLATFORM_VERSION, Build.VERSION.RELEASE);
            if (!TextUtils.isEmpty(GlobalAppRuntimeInfo.getUserId())) {
                map.put("sid", GlobalAppRuntimeInfo.getUserId());
            }
            map.put(DispatchConstants.NET_TYPE, status.toString());
            map.put("carrier", NetworkStatusHelper.getCarrier());
            map.put(DispatchConstants.MNC, NetworkStatusHelper.getSimOp());
            if (AmdcRuntimeInfo.latitude != 0.0d) {
                map.put("lat", String.valueOf(AmdcRuntimeInfo.latitude));
            }
            if (AmdcRuntimeInfo.longitude != 0.0d) {
                map.put("lng", String.valueOf(AmdcRuntimeInfo.longitude));
            }
            map.putAll(AmdcRuntimeInfo.getParams());
            map.put("channel", AmdcRuntimeInfo.appChannel);
            map.put(DispatchConstants.APP_NAME, AmdcRuntimeInfo.appName);
            map.put("appVersion", AmdcRuntimeInfo.appVersion);
            map.put(DispatchConstants.STACK_TYPE, Integer.toString(m4753a()));
            map.put("domain", m4756b(map));
            map.put(DispatchConstants.SIGNTYPE, sign.useSecurityGuard() ? C3117b.KEY_SEC : "noSec");
            map.put("t", String.valueOf(System.currentTimeMillis()));
            String m4754a = m4754a(sign, map);
            if (TextUtils.isEmpty(m4754a)) {
                return null;
            }
            map.put("sign", m4754a);
            return map;
        }
        ALog.m4787e(TAG, "amdc sign is null or appkey is empty", null, new Object[0]);
        return null;
    }

    /* renamed from: b */
    private static String m4756b(Map map) {
        Set set = (Set) map.remove(DispatchConstants.HOSTS);
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            sb2.append(' ');
        }
        if (sb2.length() > 0) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString();
    }

    /* renamed from: a */
    private static int m4753a() {
        int m4799c = C1018c.m4799c();
        if (m4799c != 2) {
            return m4799c != 3 ? 4 : 1;
        }
        return 2;
    }

    /* renamed from: a */
    static String m4754a(IAmdcSign iAmdcSign, Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(C1009d.m4782d(map.get("appkey")));
        sb2.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
        sb2.append(C1009d.m4782d(map.get("domain")));
        sb2.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
        sb2.append(C1009d.m4782d(map.get(DispatchConstants.APP_NAME)));
        sb2.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
        sb2.append(C1009d.m4782d(map.get("appVersion")));
        sb2.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
        sb2.append(C1009d.m4782d(map.get(DispatchConstants.BSSID)));
        sb2.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
        sb2.append(C1009d.m4782d(map.get("channel")));
        sb2.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
        sb2.append(C1009d.m4782d(map.get("deviceId")));
        sb2.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
        sb2.append(C1009d.m4782d(map.get("lat")));
        sb2.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
        sb2.append(C1009d.m4782d(map.get("lng")));
        sb2.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
        sb2.append(C1009d.m4782d(map.get(DispatchConstants.MACHINE)));
        sb2.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
        sb2.append(C1009d.m4782d(map.get(DispatchConstants.NET_TYPE)));
        sb2.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
        sb2.append(C1009d.m4782d(map.get(DispatchConstants.OTHER)));
        sb2.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
        sb2.append(C1009d.m4782d(map.get(DispatchConstants.PLATFORM)));
        sb2.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
        sb2.append(C1009d.m4782d(map.get(DispatchConstants.PLATFORM_VERSION)));
        sb2.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
        sb2.append(C1009d.m4782d(map.get(DispatchConstants.PRE_IP)));
        sb2.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
        sb2.append(C1009d.m4782d(map.get("sid")));
        sb2.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
        sb2.append(C1009d.m4782d(map.get("t")));
        sb2.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
        sb2.append(C1009d.m4782d(map.get("v")));
        sb2.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
        sb2.append(C1009d.m4782d(map.get(DispatchConstants.SIGNTYPE)));
        try {
            return iAmdcSign.sign(sb2.toString());
        } catch (Exception e10) {
            ALog.m4786e(TAG, "get sign failed", null, e10, new Object[0]);
            return null;
        }
    }
}
