package com.taobao.accs.client;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.taobao.accs.IAgooAppReceiver;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.ILoginInfo;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.android.agoo.common.AgooConstants;

@Keep
/* loaded from: classes.dex */
public class GlobalClientInfo {
    public static final String AGOO_SERVICE_ID = "agooSend";

    /* renamed from: a */
    public static Context f12843a = null;

    /* renamed from: b */
    public static IAgooAppReceiver f12844b = null;

    /* renamed from: c */
    public static String f12845c = null;

    /* renamed from: d */
    public static boolean f12846d = false;

    /* renamed from: e */
    private static final String f12847e = "com.taobao.accs.client.GlobalClientInfo";

    /* renamed from: f */
    private static volatile GlobalClientInfo f12848f;

    /* renamed from: l */
    private static Map<String, String> f12849l = new ConcurrentHashMap();

    /* renamed from: m */
    private static Map<String, Map<String, String>> f12850m = new ConcurrentHashMap();

    /* renamed from: g */
    private ConcurrentHashMap<String, ILoginInfo> f12851g;

    /* renamed from: h */
    private ConcurrentHashMap<String, IAppReceiver> f12852h;

    /* renamed from: i */
    private ActivityManager f12853i;

    /* renamed from: j */
    private ConnectivityManager f12854j;

    /* renamed from: k */
    private PackageInfo f12855k;

    /* renamed from: n */
    private Map<String, AccsDataListener> f12856n = new ConcurrentHashMap();

    static {
        f12849l.put(AGOO_SERVICE_ID, "org.android.agoo.accs.AgooService");
        f12849l.put(AgooConstants.AGOO_SERVICE_AGOOACK, "org.android.agoo.accs.AgooService");
        f12849l.put("agooTokenReport", "org.android.agoo.accs.AgooService");
    }

    private GlobalClientInfo(Context context) {
        Context context2 = getContext();
        f12843a = context2;
        if (context2 == null && context != null) {
            f12843a = context.getApplicationContext();
        }
        ThreadPoolExecutorFactory.execute(new RunnableC3133c(this));
    }

    /* renamed from: a */
    private void m12731a(String str, Map<String, String> map) {
        if (map == null) {
            return;
        }
        if (f12850m.get(str) == null) {
            f12850m.put(str, new ConcurrentHashMap());
        }
        f12850m.get(str).putAll(map);
    }

    public static Context getContext() {
        return f12843a;
    }

    @Keep
    public static GlobalClientInfo getInstance(Context context) {
        if (f12848f == null) {
            synchronized (GlobalClientInfo.class) {
                if (f12848f == null) {
                    f12848f = new GlobalClientInfo(context);
                }
            }
        }
        return f12848f;
    }

    public void clearLoginInfoImpl() {
        this.f12851g = null;
    }

    public ActivityManager getActivityManager() {
        if (this.f12853i == null) {
            this.f12853i = (ActivityManager) f12843a.getSystemService("activity");
        }
        return this.f12853i;
    }

    public Map<String, String> getAllService(String str) {
        if (f12850m.get(str) != null && !f12850m.get(str).isEmpty()) {
            return f12850m.get(str);
        }
        return null;
    }

    public Map<String, IAppReceiver> getAppReceiver() {
        return this.f12852h;
    }

    public ConnectivityManager getConnectivityManager() {
        if (this.f12854j == null) {
            this.f12854j = (ConnectivityManager) f12843a.getSystemService("connectivity");
        }
        return this.f12854j;
    }

    public AccsDataListener getListener(String str) {
        return this.f12856n.get(str);
    }

    public String getNick(String str) {
        ILoginInfo iLoginInfo;
        ConcurrentHashMap<String, ILoginInfo> concurrentHashMap = this.f12851g;
        if (concurrentHashMap == null || (iLoginInfo = concurrentHashMap.get(str)) == null) {
            return null;
        }
        return iLoginInfo.getNick();
    }

    public PackageInfo getPackageInfo() {
        try {
            if (this.f12855k == null) {
                this.f12855k = f12843a.getPackageManager().getPackageInfo(f12843a.getPackageName(), 0);
            }
        } catch (Throwable th) {
            ALog.m12939e("GlobalClientInfo", "getPackageInfo", th, new Object[0]);
        }
        return this.f12855k;
    }

    public String getService(String str) {
        return f12849l.get(str);
    }

    public String getSid(String str) {
        ILoginInfo iLoginInfo;
        ConcurrentHashMap<String, ILoginInfo> concurrentHashMap = this.f12851g;
        if (concurrentHashMap == null || (iLoginInfo = concurrentHashMap.get(str)) == null) {
            return null;
        }
        return iLoginInfo.getSid();
    }

    public String getUserId(String str) {
        ILoginInfo iLoginInfo;
        ConcurrentHashMap<String, ILoginInfo> concurrentHashMap = this.f12851g;
        if (concurrentHashMap == null || (iLoginInfo = concurrentHashMap.get(str)) == null) {
            return null;
        }
        return iLoginInfo.getUserId();
    }

    public void registerAllRemoteService(String str, Map<String, String> map) {
        if (f12850m.get(str) == null) {
            f12850m.put(str, new ConcurrentHashMap());
        }
        f12850m.get(str).putAll(map);
    }

    public void registerListener(String str, AccsAbstractDataListener accsAbstractDataListener) {
        registerListener(str, (AccsDataListener) accsAbstractDataListener);
    }

    @Keep
    public void registerRemoteListener(String str, AccsDataListener accsDataListener) {
        this.f12856n.put(str, accsDataListener);
    }

    public void registerRemoteService(String str, String str2) {
        f12849l.put(str, str2);
    }

    public void registerService(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            f12849l.put(str, str2);
        }
    }

    public void setAppReceiver(String str, IAppReceiver iAppReceiver) {
        if (iAppReceiver != null) {
            if (iAppReceiver instanceof IAgooAppReceiver) {
                f12844b = (IAgooAppReceiver) iAppReceiver;
                return;
            }
            if (this.f12852h == null) {
                this.f12852h = new ConcurrentHashMap<>(2);
            }
            this.f12852h.put(str, iAppReceiver);
            m12731a(str, iAppReceiver.getAllServices());
        }
    }

    public void setLoginInfoImpl(String str, ILoginInfo iLoginInfo) {
        if (this.f12851g == null) {
            this.f12851g = new ConcurrentHashMap<>(1);
        }
        if (iLoginInfo != null) {
            this.f12851g.put(str, iLoginInfo);
        }
    }

    @Keep
    public void setRemoteAgooAppReceiver(IAgooAppReceiver iAgooAppReceiver) {
        f12844b = iAgooAppReceiver;
    }

    @Keep
    public void setRemoteAppReceiver(String str, IAppReceiver iAppReceiver) {
        if (this.f12852h == null) {
            this.f12852h = new ConcurrentHashMap<>(2);
        }
        this.f12852h.put(str, iAppReceiver);
        m12731a(str, iAppReceiver.getAllServices());
    }

    public void unRegisterService(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f12849l.remove(str);
    }

    public void unregisterListener(String str) {
        this.f12856n.remove(str);
    }

    public void unregisterRemoteListener(String str) {
        this.f12856n.remove(str);
    }

    public void unregisterRemoteService(String str) {
        f12849l.remove(str);
    }

    public String getService(String str, String str2) {
        if (f12850m.get(str) != null) {
            return f12850m.get(str).get(str2);
        }
        return null;
    }

    public void registerListener(String str, AccsDataListener accsDataListener) {
        if (TextUtils.isEmpty(str) || accsDataListener == null) {
            return;
        }
        this.f12856n.put(str, accsDataListener);
    }
}
