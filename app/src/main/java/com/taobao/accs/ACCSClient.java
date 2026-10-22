package com.taobao.accs;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.SessionCenter;
import anet.channel.entity.ENV;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3209v;
import com.umeng.analytics.pro.C3309bd;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class ACCSClient {
    private static String TAG = "ACCSClient";
    public static Map<String, ACCSClient> mACCSClients = new ConcurrentHashMap(2);
    private static Context mContext;
    private String OTAG = TAG;
    protected InterfaceC3118b mAccsManager;
    private AccsClientConfig mConfig;

    public ACCSClient(AccsClientConfig accsClientConfig) {
        this.mConfig = accsClientConfig;
        this.OTAG += accsClientConfig.getTag();
        if (mContext == null) {
            mContext = GlobalClientInfo.f12843a;
        }
        this.mAccsManager = ACCSManager.getAccsInstance(mContext, accsClientConfig.getAppKey(), accsClientConfig.getTag());
    }

    public static ACCSClient getAccsClient() {
        return getAccsClient(null);
    }

    public static synchronized String init(Context context, String str) {
        String init;
        synchronized (ACCSClient.class) {
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
                    if (!AccsClientConfig.loadedStaticConfig) {
                        configByTag = new AccsClientConfig.Builder().setAppKey(str).build();
                        ALog.m12941i(TAG, "init", "create config, appkey as tag");
                    }
                    init = init(context, configByTag);
                }
            }
            throw new AccsException("params error");
        }
        return init;
    }

    public static synchronized void setEnvironment(Context context, @AccsClientConfig.ENV int i10) {
        synchronized (ACCSClient.class) {
            if (i10 < 0 || i10 > 2) {
                try {
                    ALog.m12940e(TAG, "env error", C3309bd.f14094a, Integer.valueOf(i10));
                    i10 = 0;
                } finally {
                    try {
                    } finally {
                    }
                }
            }
            int i11 = AccsClientConfig.mEnv;
            AccsClientConfig.mEnv = i10;
            if (i11 != i10 && C3209v.m13049e(context)) {
                ALog.m12941i(TAG, "setEnvironment", "preEnv", Integer.valueOf(i11), "toEnv", Integer.valueOf(i10));
                C3209v.m13047c(context);
                C3209v.m13050f(context);
                C3209v.m13048d(context);
                if (i10 == 2) {
                    SessionCenter.switchEnvironment(ENV.TEST);
                } else if (i10 == 1) {
                    SessionCenter.switchEnvironment(ENV.PREPARE);
                }
                Iterator<Map.Entry<String, ACCSClient>> it = mACCSClients.entrySet().iterator();
                while (it.hasNext()) {
                    try {
                        getAccsClient(it.next().getKey());
                    } catch (AccsException e10) {
                        ALog.m12939e(TAG, "setEnvironment update client", e10, new Object[0]);
                    }
                }
            }
        }
    }

    private void updateConfig(AccsClientConfig accsClientConfig) {
        this.mConfig = accsClientConfig;
        InterfaceC3118b accsInstance = ACCSManager.getAccsInstance(mContext, accsClientConfig.getAppKey(), accsClientConfig.getTag());
        this.mAccsManager = accsInstance;
        if (accsInstance != null) {
            accsInstance.mo12686a(accsClientConfig);
        }
    }

    public void bindApp(String str, IAppReceiver iAppReceiver) {
        InterfaceC3118b interfaceC3118b = this.mAccsManager;
        if (interfaceC3118b == null) {
            ALog.m12940e(this.OTAG, "bindApp mAccsManager null", new Object[0]);
        } else {
            interfaceC3118b.mo12684a(mContext, this.mConfig.getAppKey(), this.mConfig.getAppSecret(), str, iAppReceiver);
        }
    }

    public void bindService(String str) {
        InterfaceC3118b interfaceC3118b = this.mAccsManager;
        if (interfaceC3118b == null) {
            ALog.m12940e(this.OTAG, "bindService mAccsManager null", new Object[0]);
        } else {
            interfaceC3118b.mo12696b(mContext, str);
        }
    }

    public void bindUser(String str) {
        InterfaceC3118b interfaceC3118b = this.mAccsManager;
        if (interfaceC3118b == null) {
            ALog.m12940e(this.OTAG, "bindUser mAccsManager null", new Object[0]);
        } else {
            interfaceC3118b.mo12679a(mContext, str);
        }
    }

    public boolean cancel(String str) {
        InterfaceC3118b interfaceC3118b = this.mAccsManager;
        if (interfaceC3118b == null) {
            ALog.m12940e(this.OTAG, "cancel mAccsManager null", new Object[0]);
            return false;
        }
        return interfaceC3118b.mo12691a(str);
    }

    public void clearLoginInfo() {
        InterfaceC3118b interfaceC3118b = this.mAccsManager;
        if (interfaceC3118b == null) {
            ALog.m12940e(this.OTAG, "clearLoginInfo mAccsManager null", new Object[0]);
        } else {
            interfaceC3118b.mo12704e(mContext);
        }
    }

    public void forceDisableService() {
        InterfaceC3118b interfaceC3118b = this.mAccsManager;
        if (interfaceC3118b == null) {
            ALog.m12940e(this.OTAG, "forceDisableService mAccsManager null", new Object[0]);
        } else {
            interfaceC3118b.mo12700c(mContext);
        }
    }

    public void forceEnableService() {
        InterfaceC3118b interfaceC3118b = this.mAccsManager;
        if (interfaceC3118b == null) {
            ALog.m12940e(this.OTAG, "forceEnableService mAccsManager null", new Object[0]);
        } else {
            interfaceC3118b.mo12702d(mContext);
        }
    }

    public Map<String, Boolean> forceReConnectChannel() {
        InterfaceC3118b interfaceC3118b = this.mAccsManager;
        if (interfaceC3118b == null) {
            ALog.m12940e(this.OTAG, "forceReConnectChannel mAccsManager null", new Object[0]);
            return null;
        }
        return interfaceC3118b.mo12699c();
    }

    public Map<String, Boolean> getChannelState() {
        InterfaceC3118b interfaceC3118b = this.mAccsManager;
        if (interfaceC3118b == null) {
            ALog.m12940e(this.OTAG, "getChannelState mAccsManager null", new Object[0]);
            return null;
        }
        return interfaceC3118b.mo12695b();
    }

    @Deprecated
    public String getUserUnit() {
        return null;
    }

    public boolean isAccsConnected() {
        InterfaceC3118b interfaceC3118b = this.mAccsManager;
        if (interfaceC3118b != null && interfaceC3118b.mo12689a()) {
            return true;
        }
        return false;
    }

    public boolean isChannelError(int i10) {
        InterfaceC3118b interfaceC3118b = this.mAccsManager;
        if (interfaceC3118b == null) {
            ALog.m12940e(this.OTAG, "isChannelError mAccsManager null", new Object[0]);
            return true;
        }
        return interfaceC3118b.mo12690a(i10);
    }

    public boolean isNetworkReachable() {
        InterfaceC3118b interfaceC3118b = this.mAccsManager;
        if (interfaceC3118b == null) {
            ALog.m12940e(this.OTAG, "isNetworkReachable mAccsManager null", new Object[0]);
            return false;
        }
        return interfaceC3118b.mo12698b(mContext);
    }

    public void registerConnectStateListener(AccsConnectStateListener accsConnectStateListener) {
        InterfaceC3118b interfaceC3118b = this.mAccsManager;
        if (interfaceC3118b == null) {
            ALog.m12940e(this.OTAG, "registerConnectStateListener mAccsManager null", new Object[0]);
        } else {
            interfaceC3118b.mo12687a(accsConnectStateListener);
        }
    }

    public void registerDataListener(String str, AccsAbstractDataListener accsAbstractDataListener) {
        InterfaceC3118b interfaceC3118b = this.mAccsManager;
        if (interfaceC3118b == null) {
            ALog.m12940e(this.OTAG, "registerDataListener mAccsManager null", new Object[0]);
        } else {
            interfaceC3118b.mo12681a(mContext, str, accsAbstractDataListener);
        }
    }

    public void registerSerivce(String str, String str2) {
        InterfaceC3118b interfaceC3118b = this.mAccsManager;
        if (interfaceC3118b == null) {
            ALog.m12940e(this.OTAG, "registerSerivce mAccsManager null", new Object[0]);
        } else {
            interfaceC3118b.mo12682a(mContext, str, str2);
        }
    }

    public void sendBusinessAck(String str, String str2, String str3, short s10, String str4, Map<Integer, String> map) {
        InterfaceC3118b interfaceC3118b = this.mAccsManager;
        if (interfaceC3118b == null) {
            ALog.m12940e(this.OTAG, "sendBusinessAck mAccsManager null", new Object[0]);
        } else {
            interfaceC3118b.mo12688a(str, str2, str3, s10, str4, map);
        }
    }

    public String sendData(ACCSManager.AccsRequest accsRequest) {
        InterfaceC3118b interfaceC3118b = this.mAccsManager;
        if (interfaceC3118b == null) {
            ALog.m12940e(this.OTAG, "sendData mAccsManager null", new Object[0]);
            return null;
        }
        return interfaceC3118b.mo12670a(mContext, accsRequest);
    }

    public String sendPushResponse(ACCSManager.AccsRequest accsRequest, TaoBaseService.ExtraInfo extraInfo) {
        InterfaceC3118b interfaceC3118b = this.mAccsManager;
        if (interfaceC3118b == null) {
            ALog.m12940e(this.OTAG, "sendPushResponse mAccsManager null", new Object[0]);
            return null;
        }
        return interfaceC3118b.mo12671a(mContext, accsRequest, extraInfo);
    }

    public String sendRequest(ACCSManager.AccsRequest accsRequest) {
        InterfaceC3118b interfaceC3118b = this.mAccsManager;
        if (interfaceC3118b == null) {
            ALog.m12940e(this.OTAG, "sendRequest mAccsManager null", new Object[0]);
            return null;
        }
        return interfaceC3118b.mo12692b(mContext, accsRequest);
    }

    public void setLoginInfo(ILoginInfo iLoginInfo) {
        InterfaceC3118b interfaceC3118b = this.mAccsManager;
        if (interfaceC3118b == null) {
            ALog.m12940e(this.OTAG, "setLoginInfo mAccsManager null", new Object[0]);
        } else {
            interfaceC3118b.mo12678a(mContext, iLoginInfo);
        }
    }

    public void startInAppConnection(String str, IAppReceiver iAppReceiver) {
        InterfaceC3118b interfaceC3118b = this.mAccsManager;
        if (interfaceC3118b == null) {
            ALog.m12940e(this.OTAG, "startInAppConnection mAccsManager null", new Object[0]);
            return;
        }
        Context context = mContext;
        String appKey = this.mConfig.getAppKey();
        this.mConfig.getAppSecret();
        interfaceC3118b.mo12683a(context, appKey, str, iAppReceiver);
    }

    public void unRegisterConnectStateListener(AccsConnectStateListener accsConnectStateListener) {
        InterfaceC3118b interfaceC3118b = this.mAccsManager;
        if (interfaceC3118b == null) {
            ALog.m12940e(this.OTAG, "unRegisterConnectStateListener mAccsManager null", new Object[0]);
        } else {
            interfaceC3118b.mo12697b(accsConnectStateListener);
        }
    }

    public void unRegisterDataListener(String str) {
        InterfaceC3118b interfaceC3118b = this.mAccsManager;
        if (interfaceC3118b == null) {
            ALog.m12940e(this.OTAG, "unRegisterDataListener mAccsManager null", new Object[0]);
        } else {
            interfaceC3118b.mo12705e(mContext, str);
        }
    }

    public void unRegisterSerivce(String str) {
        InterfaceC3118b interfaceC3118b = this.mAccsManager;
        if (interfaceC3118b == null) {
            ALog.m12940e(this.OTAG, "unRegisterSerivce mAccsManager null", new Object[0]);
        } else {
            interfaceC3118b.mo12703d(mContext, str);
        }
    }

    public void unbindService(String str) {
        InterfaceC3118b interfaceC3118b = this.mAccsManager;
        if (interfaceC3118b == null) {
            ALog.m12940e(this.OTAG, "unbindService mAccsManager null", new Object[0]);
        } else {
            interfaceC3118b.mo12701c(mContext, str);
        }
    }

    public void unbindUser() {
        InterfaceC3118b interfaceC3118b = this.mAccsManager;
        if (interfaceC3118b == null) {
            ALog.m12940e(this.OTAG, "unbindUser mAccsManager null", new Object[0]);
        } else {
            interfaceC3118b.mo12676a(mContext);
        }
    }

    public static synchronized ACCSClient getAccsClient(String str) {
        synchronized (ACCSClient.class) {
            if (TextUtils.isEmpty(str)) {
                str = "default";
                ALog.m12944w(TAG, "getAccsClient", "configTag is null, use default!");
            }
            ALog.m12941i(TAG, "getAccsClient", Constants.KEY_CONFIG_TAG, str);
            AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
            if (configByTag != null) {
                ACCSClient aCCSClient = mACCSClients.get(str);
                if (aCCSClient == null) {
                    ALog.m12938d(TAG, "getAccsClient create client", new Object[0]);
                    ACCSClient aCCSClient2 = new ACCSClient(configByTag);
                    mACCSClients.put(str, aCCSClient2);
                    aCCSClient2.updateConfig(configByTag);
                    return aCCSClient2;
                }
                if (configByTag.equals(aCCSClient.mConfig)) {
                    ALog.m12941i(TAG, "getAccsClient exists", new Object[0]);
                } else {
                    ALog.m12941i(TAG, "getAccsClient update config", "old config", aCCSClient.mConfig.getTag(), "new config", configByTag.getTag());
                    aCCSClient.updateConfig(configByTag);
                }
                return aCCSClient;
            }
            ALog.m12940e(TAG, "getAccsClient", "configTag not exist, please init first!!");
            throw new AccsException("configTag not exist");
        }
    }

    public void bindUser(String str, boolean z10) {
        InterfaceC3118b interfaceC3118b = this.mAccsManager;
        if (interfaceC3118b == null) {
            ALog.m12940e(this.OTAG, "bindUser mAccsManager null", new Object[0]);
        } else {
            interfaceC3118b.mo12685a(mContext, str, z10);
        }
    }

    public static synchronized String init(Context context, AccsClientConfig accsClientConfig) {
        String tag;
        synchronized (ACCSClient.class) {
            if (context != null && accsClientConfig != null) {
                mContext = context.getApplicationContext();
                GlobalClientInfo.f12843a = context.getApplicationContext();
                ALog.m12938d(TAG, "init", "config", accsClientConfig);
                tag = accsClientConfig.getTag();
            } else {
                throw new AccsException("init AccsClient params error");
            }
        }
        return tag;
    }
}
