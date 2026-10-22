package com.efs.sdk.base.core.config;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.efs.sdk.base.BuildConfig;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.p050a.C1666a;
import com.efs.sdk.base.core.util.C1719c;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.efs.sdk.base.core.util.PackageUtil;
import com.efs.sdk.base.core.util.ProcessUtil;
import com.efs.sdk.base.core.util.secure.EncodeUtil;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.taobao.accs.common.Constants;
import com.umeng.ccg.C3417a;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.umcrash.UMCrash;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class GlobalInfoManager {

    /* renamed from: a */
    private GlobalInfo f7106a;

    /* renamed from: b */
    private Context f7107b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.efs.sdk.base.core.config.GlobalInfoManager$a */
    /* loaded from: classes.dex */
    public static class C1696a {

        /* renamed from: a */
        private static final GlobalInfoManager f7108a = new GlobalInfoManager(0);
    }

    /* synthetic */ GlobalInfoManager(byte b10) {
        this();
    }

    /* renamed from: a */
    private static String m7670a(Context context) {
        Class<DeviceConfig> cls;
        Method method;
        if (context == null) {
            return null;
        }
        try {
            cls = DeviceConfig.class;
            String str = DeviceConfig.UNKNOW;
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            method = cls.getMethod("getSid", Context.class);
        } catch (NoSuchMethodException unused2) {
            method = null;
        }
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, context);
            if (invoke == null) {
                return null;
            }
            return invoke.toString();
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }

    public static GlobalInfoManager getInstance() {
        return C1696a.f7108a;
    }

    public GlobalInfo getGlobalInfo() {
        try {
            String m7670a = m7670a(this.f7107b);
            if (!TextUtils.isEmpty(m7670a)) {
                this.f7106a.m7668a(UMCrash.KEY_CALLBACK_SESSION_ID, m7670a);
            }
        } catch (Throwable th) {
            Log.m7722d("efs.info.manager", "refreshSessionId caused error: " + th.getMessage());
        }
        return this.f7106a;
    }

    public String getNetStatus() {
        return this.f7106a.m7669b("net", NetworkUtil.NETWORK_CLASS_DISCONNECTED).toString();
    }

    public void initGlobalInfo() {
        String lowerCase;
        Log.m7726e("ballack", "initGlobalInfo called once.");
        GlobalInfo globalInfo = new GlobalInfo();
        this.f7106a = globalInfo;
        globalInfo.m7668a("appid", ControllerCenter.getGlobalEnvStruct().getAppid());
        int myPid = ProcessUtil.myPid();
        this.f7106a.m7668a("pid", Integer.valueOf(myPid));
        this.f7106a.m7668a("ps", ProcessUtil.getProcessName(myPid));
        String m7766a = C1719c.m7766a(this.f7107b);
        this.f7106a.m7668a("wid", m7766a);
        if (TextUtils.isEmpty(ControllerCenter.getGlobalEnvStruct().getUid())) {
            this.f7106a.m7668a("uid", m7766a);
        } else {
            this.f7106a.m7668a("uid", ControllerCenter.getGlobalEnvStruct().getUid());
        }
        GlobalInfo globalInfo2 = this.f7106a;
        C1666a.m7610a();
        globalInfo2.m7668a("stime", Long.valueOf(C1666a.m7613b() - Process.getElapsedCpuTime()));
        this.f7106a.m7668a("pkg", PackageUtil.getPackageName(this.f7107b));
        this.f7106a.m7668a("ver", PackageUtil.getAppVersionName(this.f7107b));
        this.f7106a.m7668a("vcode", PackageUtil.getAppVersionCode(this.f7107b));
        this.f7106a.m7668a("sdk_ver", BuildConfig.VERSION_NAME);
        this.f7106a.m7668a(Constants.KEY_BRAND, Build.BRAND.toLowerCase());
        GlobalInfo globalInfo3 = this.f7106a;
        String str = Build.MODEL;
        if (str == null) {
            lowerCase = "unknown";
        } else {
            lowerCase = str.replace(" ", Operator.Operation.MINUS).replace("_", Operator.Operation.MINUS).toLowerCase();
        }
        globalInfo3.m7668a(Constants.KEY_MODEL, lowerCase);
        this.f7106a.m7668a("build_model", str);
        DisplayMetrics displayMetrics = this.f7107b.getResources().getDisplayMetrics();
        this.f7106a.m7668a("dsp_w", Integer.valueOf(displayMetrics.widthPixels));
        this.f7106a.m7668a("dsp_h", Integer.valueOf(displayMetrics.heightPixels));
        this.f7106a.m7668a("fr", DispatchConstants.ANDROID);
        this.f7106a.m7668a("rom", Build.VERSION.RELEASE);
        this.f7106a.m7668a(C3417a.f14999u, Integer.valueOf(Build.VERSION.SDK_INT));
        this.f7106a.m7668a("lang", Locale.getDefault().getLanguage());
        this.f7106a.m7668a("tzone", TimeZone.getDefault().getID());
        this.f7106a.m7668a("net", NetworkUtil.getNetworkType(this.f7107b));
        try {
            String[] networkAccessMode = NetworkUtil.getNetworkAccessMode(this.f7107b);
            if ("Wi-Fi".equals(networkAccessMode[0])) {
                this.f7106a.m7668a(UMCrash.KEY_HEADER_ACCESS, "wifi");
            } else if ("2G/3G".equals(networkAccessMode[0])) {
                this.f7106a.m7668a(UMCrash.KEY_HEADER_ACCESS, "2G/3G");
            } else {
                this.f7106a.m7668a(UMCrash.KEY_HEADER_ACCESS, "unknow");
            }
            if (!"".equals(networkAccessMode[1])) {
                this.f7106a.m7668a(UMCrash.KEY_HEADER_ACCESS_SUBTYPE, networkAccessMode[1]);
            }
            this.f7106a.m7668a(UMCrash.KEY_HEADER_NETWORK_TYPE, Integer.valueOf(NetworkUtil.getNetworkTypeUmeng(this.f7107b)));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            this.f7106a.m7668a("log_uid", EncodeUtil.base64DecodeToStr(ControllerCenter.getGlobalEnvStruct().getLogUid().getBytes()));
            this.f7106a.m7668a("log_did", ControllerCenter.getGlobalEnvStruct().getLogDid());
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void refreshNetStatus() {
        String networkType = NetworkUtil.getNetworkType(ControllerCenter.getGlobalEnvStruct().mAppContext);
        Log.m7738w("efs.info.manager", "network change: ".concat(String.valueOf(networkType)));
        this.f7106a.m7668a("net", networkType);
    }

    private GlobalInfoManager() {
        this.f7107b = ControllerCenter.getGlobalEnvStruct().mAppContext;
    }
}
