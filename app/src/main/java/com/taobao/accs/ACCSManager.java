package com.taobao.accs;

import android.content.Context;
import android.text.TextUtils;
import com.lzy.okgo.cache.CacheEntity;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.internal.ACCSManagerImpl;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3209v;
import java.io.Serializable;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.android.agoo.message.MessageService;

@Deprecated
/* loaded from: classes.dex */
public final class ACCSManager {
    private static final String TAG = "ACCSManager";
    public static Map<String, InterfaceC3118b> mAccsInstances = new ConcurrentHashMap(2);
    public static Context mContext = null;
    public static String mDefaultAppkey = null;
    public static String mDefaultConfigTag = "default";
    public static int mEnv;

    private ACCSManager() {
    }

    @Deprecated
    public static void bindApp(Context context, String str, String str2, String str3, IAppReceiver iAppReceiver) {
        if (!TextUtils.isEmpty(mDefaultAppkey)) {
            C3209v.m13042a();
            getManagerImpl(context).mo12684a(context, mDefaultAppkey, str2, str3, iAppReceiver);
            return;
        }
        throw new RuntimeException("old interface!!, please AccsManager.setAppkey() first!");
    }

    @Deprecated
    public static void bindService(Context context, String str) {
        getManagerImpl(context).mo12696b(context, str);
    }

    @Deprecated
    public static void bindUser(Context context, String str) {
        bindUser(context, str, false);
    }

    @Deprecated
    public static void clearLoginInfoImpl(Context context) {
        getManagerImpl(context).mo12704e(context);
    }

    protected static InterfaceC3118b createAccsInstance(Context context, String str) {
        return new ACCSManagerImpl(context, str);
    }

    public static void forceDisableService(Context context) {
        getManagerImpl(context).mo12700c(context);
    }

    public static void forceEnableService(Context context) {
        getManagerImpl(context).mo12702d(context);
    }

    @Deprecated
    public static Map<String, Boolean> forceReConnectChannel(Context context) {
        return getManagerImpl(context).mo12699c();
    }

    public static InterfaceC3118b getAccsInstance(Context context, String str, String str2) {
        InterfaceC3118b interfaceC3118b;
        if (context != null && !TextUtils.isEmpty(str2)) {
            String str3 = str2 + "|" + AccsClientConfig.mEnv;
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.m12938d(TAG, "getAccsInstance", CacheEntity.KEY, str3);
            }
            synchronized (ACCSManager.class) {
                interfaceC3118b = mAccsInstances.get(str3);
                if (interfaceC3118b == null) {
                    try {
                        interfaceC3118b = createAccsInstance(context, str2);
                    } catch (Exception e10) {
                        ALog.m12940e(TAG, "createAccsInstance error", e10.getMessage());
                    }
                    if (interfaceC3118b != null) {
                        mAccsInstances.put(str3, interfaceC3118b);
                    }
                }
            }
            return interfaceC3118b;
        }
        ALog.m12940e(TAG, "getAccsInstance param null", Constants.KEY_CONFIG_TAG, str2);
        return null;
    }

    @Deprecated
    public static Map<String, Boolean> getChannelState(Context context) {
        return getManagerImpl(context).mo12695b();
    }

    @Deprecated
    public static String getDefaultAppkey(Context context) {
        if (TextUtils.isEmpty(mDefaultAppkey)) {
            ALog.m12940e(TAG, "old interface!!, please AccsManager.setAppkey() first!", new Object[0]);
            String m13041a = C3209v.m13041a(context, Constants.SP_KEY_DEFAULT_APPKEY, null);
            mDefaultAppkey = m13041a;
            if (TextUtils.isEmpty(m13041a)) {
                mDefaultAppkey = MessageService.MSG_DB_READY_REPORT;
            }
        }
        return mDefaultAppkey;
    }

    public static String getDefaultConfig(Context context) {
        return mDefaultConfigTag;
    }

    private static synchronized InterfaceC3118b getManagerImpl(Context context) {
        InterfaceC3118b accsInstance;
        synchronized (ACCSManager.class) {
            accsInstance = getAccsInstance(context, null, getDefaultConfig(context));
        }
        return accsInstance;
    }

    @Deprecated
    public static String getUserUnit(Context context) {
        return null;
    }

    @Deprecated
    public static boolean isAccsConnected(Context context) {
        return getManagerImpl(context).mo12689a();
    }

    @Deprecated
    public static boolean isChannelError(Context context, int i10) {
        return getManagerImpl(context).mo12690a(i10);
    }

    @Deprecated
    public static boolean isNetworkReachable(Context context) {
        return getManagerImpl(context).mo12698b(context);
    }

    @Deprecated
    public static void registerDataListener(Context context, String str, AccsAbstractDataListener accsAbstractDataListener) {
        GlobalClientInfo.getInstance(context).registerListener(str, accsAbstractDataListener);
    }

    @Deprecated
    public static void registerSerivce(Context context, String str, String str2) {
        GlobalClientInfo.getInstance(context).registerService(str, str2);
    }

    @Deprecated
    public static String sendData(Context context, String str, String str2, byte[] bArr, String str3) {
        return getManagerImpl(context).mo12673a(context, str, str2, bArr, str3);
    }

    @Deprecated
    public static String sendPushResponse(Context context, AccsRequest accsRequest, TaoBaseService.ExtraInfo extraInfo) {
        return getManagerImpl(context).mo12671a(context, accsRequest, extraInfo);
    }

    @Deprecated
    public static String sendRequest(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url) {
        return getManagerImpl(context).mo12694b(context, str, str2, bArr, str3, str4, url);
    }

    @Deprecated
    public static void setAppkey(Context context, String str, @AccsClientConfig.ENV int i10) {
    }

    @Deprecated
    public static void setDefaultConfig(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            ALog.m12941i(TAG, "setDefaultConfig", Constants.KEY_CONFIG_TAG, str);
            mDefaultConfigTag = str;
        }
    }

    @Deprecated
    public static void setLoginInfoImpl(Context context, ILoginInfo iLoginInfo) {
        getManagerImpl(context).mo12678a(context, iLoginInfo);
    }

    @Deprecated
    public static void setMode(Context context, int i10) {
        mEnv = i10;
        getManagerImpl(context).mo12677a(context, i10);
    }

    @Deprecated
    public static void setProxy(Context context, String str, int i10) {
        getManagerImpl(context).mo12680a(context, str, i10);
    }

    @Deprecated
    public static void setServiceListener(Context context, String str, IServiceReceiver iServiceReceiver) {
    }

    @Deprecated
    public static void startInAppConnection(Context context, String str, String str2, String str3, IAppReceiver iAppReceiver) {
        C3209v.m13042a();
        getManagerImpl(context).mo12683a(context, mDefaultAppkey, str3, iAppReceiver);
    }

    @Deprecated
    public static void unRegisterDataListener(Context context, String str) {
        GlobalClientInfo.getInstance(context).unregisterListener(str);
    }

    @Deprecated
    public static void unbindApp(Context context) {
    }

    @Deprecated
    public static void unbindService(Context context, String str) {
        getManagerImpl(context).mo12701c(context, str);
    }

    @Deprecated
    public static void unbindUser(Context context) {
        getManagerImpl(context).mo12676a(context);
    }

    @Deprecated
    public static void unregisterService(Context context, String str) {
        GlobalClientInfo.getInstance(context).unRegisterService(str);
    }

    @Deprecated
    public static void bindUser(Context context, String str, boolean z10) {
        if (!TextUtils.isEmpty(mDefaultAppkey)) {
            getManagerImpl(context).mo12685a(context, str, z10);
            return;
        }
        throw new RuntimeException("old interface!!, please AccsManager.setAppkey() first!");
    }

    @Deprecated
    public static String sendData(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url) {
        return getManagerImpl(context).mo12675a(context, str, str2, bArr, str3, str4, url);
    }

    @Deprecated
    public static String sendRequest(Context context, String str, String str2, byte[] bArr, String str3) {
        return sendRequest(context, str, str2, bArr, str3, null);
    }

    @Deprecated
    public static String sendData(Context context, String str, String str2, byte[] bArr, String str3, String str4) {
        return getManagerImpl(context).mo12674a(context, str, str2, bArr, str3, str4);
    }

    @Deprecated
    public static String sendRequest(Context context, String str, String str2, byte[] bArr, String str3, String str4) {
        return getManagerImpl(context).mo12693b(context, str, str2, bArr, str3, str4);
    }

    @Deprecated
    public static void startInAppConnection(Context context, String str, String str2, IAppReceiver iAppReceiver) {
        startInAppConnection(context, mDefaultAppkey, "", str2, iAppReceiver);
    }

    @Deprecated
    public static String sendData(Context context, AccsRequest accsRequest) {
        return getManagerImpl(context).mo12670a(context, accsRequest);
    }

    @Deprecated
    public static String sendRequest(Context context, AccsRequest accsRequest) {
        return getManagerImpl(context).mo12692b(context, accsRequest);
    }

    @Deprecated
    public static void bindApp(Context context, String str, String str2, IAppReceiver iAppReceiver) {
        bindApp(context, mDefaultAppkey, "", str2, iAppReceiver);
    }

    /* loaded from: classes.dex */
    public static class AccsRequest implements Serializable {
        public String businessId;
        public byte[] data;
        public String dataId;
        public URL host;
        public boolean isUnitBusiness = false;
        public String serviceId;
        public String tag;
        public String target;
        public String targetServiceName;
        public int timeout;
        public String userId;

        public AccsRequest(String str, String str2, byte[] bArr, String str3, String str4, URL url, String str5) {
            this.userId = str;
            this.serviceId = str2;
            this.data = bArr;
            this.dataId = str3;
            this.target = str4;
            this.host = url;
            this.businessId = str5;
        }

        public void setBusinessId(String str) {
            this.businessId = str;
        }

        public void setHost(URL url) {
            this.host = url;
        }

        public void setIsUnitBusiness(boolean z10) {
            this.isUnitBusiness = z10;
        }

        public void setTag(String str) {
            this.tag = str;
        }

        public void setTarget(String str) {
            this.target = str;
        }

        public void setTargetServiceName(String str) {
            this.targetServiceName = str;
        }

        public void setTimeOut(int i10) {
            this.timeout = i10;
        }

        public AccsRequest(String str, String str2, byte[] bArr, String str3) {
            this.userId = str;
            this.serviceId = str2;
            this.data = bArr;
            this.dataId = str3;
        }
    }
}
