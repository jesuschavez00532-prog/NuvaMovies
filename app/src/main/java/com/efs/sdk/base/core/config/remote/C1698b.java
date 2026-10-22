package com.efs.sdk.base.core.config.remote;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.efs.sdk.base.IConfigRefreshAction;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.p051b.C1677h;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.concurrent.C1720a;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.observer.IEfsReporterObserver;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.efs.sdk.base.core.config.remote.b */
/* loaded from: classes.dex */
public final class C1698b implements Handler.Callback {

    /* renamed from: a */
    public static final Random f7115a = new Random();

    /* renamed from: b */
    public IConfigRefreshAction f7116b;

    /* renamed from: c */
    public boolean f7117c;

    /* renamed from: d */
    public RemoteConfig f7118d;

    /* renamed from: e */
    public Map<IConfigCallback, String[]> f7119e;

    /* renamed from: f */
    public Map<IConfigCallback, String[]> f7120f;

    /* renamed from: g */
    private Handler f7121g;

    /* renamed from: h */
    private SharedPreferencesOnSharedPreferenceChangeListenerC1700d f7122h;

    /* renamed from: i */
    private long f7123i;

    /* renamed from: j */
    private boolean f7124j;

    /* renamed from: k */
    private int f7125k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.efs.sdk.base.core.config.remote.b$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private static final C1698b f7129a = new C1698b(0);
    }

    /* synthetic */ C1698b(byte b10) {
        this();
    }

    /* renamed from: f */
    private void m7686f() {
        boolean z10;
        try {
            z10 = this.f7122h.m7704a(this.f7118d);
        } catch (Throwable unused) {
            z10 = false;
        }
        if (!z10) {
            this.f7121g.sendEmptyMessageDelayed(3, 3000L);
        }
    }

    /* renamed from: g */
    private IConfigRefreshAction m7687g() {
        IConfigRefreshAction iConfigRefreshAction = this.f7116b;
        if (iConfigRefreshAction == null) {
            return C1697a.m7675a();
        }
        return iConfigRefreshAction;
    }

    /* renamed from: h */
    private boolean m7688h() {
        boolean z10;
        SharedPreferencesOnSharedPreferenceChangeListenerC1700d.m7702b();
        long j10 = 0;
        try {
            SharedPreferencesOnSharedPreferenceChangeListenerC1700d sharedPreferencesOnSharedPreferenceChangeListenerC1700d = this.f7122h;
            sharedPreferencesOnSharedPreferenceChangeListenerC1700d.m7705c();
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1700d.f7131a != null) {
                j10 = sharedPreferencesOnSharedPreferenceChangeListenerC1700d.f7131a.getLong("last_refresh_time", 0L);
            }
        } catch (Throwable unused) {
        }
        if (System.currentTimeMillis() - j10 >= this.f7118d.f7112d * 60 * 1000) {
            z10 = true;
        } else {
            z10 = false;
        }
        Log.m7730i("efs.config", "isUpdate ".concat(String.valueOf(z10)));
        return z10;
    }

    /* renamed from: i */
    private void m7689i() {
        try {
            for (ValueCallback<Pair<Message, Message>> valueCallback : ControllerCenter.getGlobalEnvStruct().getCallback(1)) {
                Message obtain = Message.obtain(null, 1, new JSONObject(this.f7118d.mSDKConfigMap).toString());
                Message obtain2 = Message.obtain();
                valueCallback.onReceiveValue(new Pair<>(obtain, obtain2));
                obtain.recycle();
                obtain2.recycle();
            }
            Iterator<IEfsReporterObserver> it = ControllerCenter.getGlobalEnvStruct().getEfsReporterObservers().iterator();
            while (it.hasNext()) {
                it.next().onConfigChange();
            }
        } catch (Throwable th) {
            Log.m7728e("efs.config", th);
        }
    }

    /* renamed from: j */
    private void m7690j() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.efs.sdk.base.core.config.remote.b.3
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    for (IConfigCallback iConfigCallback : C1698b.this.f7120f.keySet()) {
                        String[] strArr = (String[]) C1698b.this.f7120f.get(iConfigCallback);
                        HashMap hashMap = new HashMap();
                        if (strArr != null && strArr.length != 0) {
                            for (String str : strArr) {
                                if (C1698b.this.f7118d.mSDKConfigMap.containsKey(str)) {
                                    hashMap.put(str, C1698b.this.m7696c().get(str));
                                    Log.m7730i("efs.config.register", "[from server] configCallback key is " + str + " ## value is " + C1698b.this.m7696c().get(str));
                                }
                            }
                        }
                        iConfigCallback.onChange(hashMap);
                    }
                    C1698b.this.f7120f.clear();
                } catch (Throwable unused) {
                }
            }
        });
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        RemoteConfig remoteConfig;
        C1677h c1677h;
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    try {
                        c1677h = C1677h.a.f7063a;
                        if (c1677h.m7644a()) {
                            if (!m7688h()) {
                                Log.m7730i("efs.config", "No update is required, less than 8h since the last update");
                                try {
                                    int parseInt = Integer.parseInt(UMEnvelopeBuild.imprintProperty(ControllerCenter.getGlobalEnvStruct().mAppContext, "apm_setting_cver", "-1"));
                                    Log.m7722d("efs.config", "APM_CVER_FROM_COMMON from UMEnvelopeBuild.imprintProperty is " + parseInt + " and mRemoteConfig.getConfigVersion() is " + this.f7118d.mConfigVersion);
                                    if (parseInt > this.f7118d.mConfigVersion) {
                                        this.f7121g.sendEmptyMessage(4);
                                    }
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                            } else {
                                Log.m7730i("efs.config", "update config");
                                m7685e();
                            }
                            ImprintHandler.getImprintService(ControllerCenter.getGlobalEnvStruct().mAppContext).registImprintCallback("apm_setting_cver", new UMImprintChangeCallback() { // from class: com.efs.sdk.base.core.config.remote.b.1
                                @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
                                public final void onImprintValueChanged(String str, String str2) {
                                    try {
                                        int parseInt2 = Integer.parseInt(str2);
                                        if (C1698b.this.f7125k != parseInt2) {
                                            C1698b.this.f7125k = parseInt2;
                                            Log.m7722d("efs.config", "APM_CVER_FROM_COMMON from onImprintValueChanged is " + parseInt2 + " and mRemoteConfig.getConfigVersion() is " + C1698b.this.f7118d.mConfigVersion);
                                            if (parseInt2 > C1698b.this.f7118d.mConfigVersion) {
                                                C1698b.this.f7121g.sendEmptyMessage(4);
                                                return;
                                            }
                                            return;
                                        }
                                        Log.m7722d("efs.config", "APM_CVER_FROM_COMMON from onImprintValueChanged is equals to mCverFromCommonListener");
                                    } catch (Throwable th2) {
                                        th2.printStackTrace();
                                    }
                                }
                            });
                        }
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                } else if (i10 != 3) {
                    if (i10 == 4) {
                        m7685e();
                    }
                } else {
                    m7686f();
                }
            } else {
                int i11 = message.arg1;
                if (i11 <= this.f7118d.mConfigVersion) {
                    Log.m7730i("efs.config", "current config version is " + i11 + ", no need to refresh");
                    Log.m7730i("efs.config", "current config version(" + this.f7118d.mConfigVersion + ") is " + i11 + ", no need to refresh");
                } else {
                    m7685e();
                }
            }
        } else {
            boolean m7701a = SharedPreferencesOnSharedPreferenceChangeListenerC1700d.m7701a();
            Log.m7730i("efs.config", "delete old config is ".concat(String.valueOf(m7701a)));
            if (m7701a) {
                this.f7121g.sendEmptyMessage(1);
            } else {
                SharedPreferencesOnSharedPreferenceChangeListenerC1700d sharedPreferencesOnSharedPreferenceChangeListenerC1700d = this.f7122h;
                sharedPreferencesOnSharedPreferenceChangeListenerC1700d.m7705c();
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1700d.f7131a == null) {
                    remoteConfig = null;
                } else {
                    RemoteConfig m7672a = RemoteConfig.m7672a();
                    m7672a.mConfigVersion = sharedPreferencesOnSharedPreferenceChangeListenerC1700d.f7131a.getInt("cver", -1);
                    Set<String> keySet = sharedPreferencesOnSharedPreferenceChangeListenerC1700d.f7131a.getAll().keySet();
                    HashMap hashMap = new HashMap();
                    for (String str : keySet) {
                        String string = sharedPreferencesOnSharedPreferenceChangeListenerC1700d.f7131a.getString(str, "");
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(str, string);
                        }
                    }
                    m7672a.m7674a(hashMap);
                    m7672a.m7673a(sharedPreferencesOnSharedPreferenceChangeListenerC1700d.f7131a.getString("sign", ""));
                    remoteConfig = m7672a;
                }
                if (remoteConfig == null) {
                    Log.m7730i("efs.config", "first load local config false.");
                } else if (m7680a(remoteConfig)) {
                    Log.m7730i("efs.config", "current config to same.");
                } else {
                    this.f7118d = remoteConfig;
                    String str2 = "load config from storage";
                    if (-1 != remoteConfig.mConfigVersion) {
                        m7689i();
                        Log.m7730i("efs.config.register", "call back");
                        m7697d();
                        m7690j();
                        str2 = "load config from storage and notify observer";
                    }
                    Log.m7730i("efs.config", str2);
                }
            }
        }
        return true;
    }

    private C1698b() {
        this.f7117c = true;
        this.f7119e = new HashMap();
        this.f7120f = new HashMap();
        this.f7124j = false;
        this.f7125k = -1;
        this.f7121g = new Handler(C1720a.f7206a.getLooper(), this);
        this.f7122h = new SharedPreferencesOnSharedPreferenceChangeListenerC1700d();
        this.f7118d = RemoteConfig.m7672a();
        this.f7123i = ControllerCenter.getGlobalEnvStruct().configRefreshDelayMills;
        this.f7124j = ControllerCenter.getGlobalEnvStruct().isOpenCodeLog();
    }

    /* renamed from: e */
    private void m7685e() {
        C1677h c1677h;
        c1677h = C1677h.a.f7063a;
        if (!c1677h.m7644a()) {
            Log.m7730i("efs.config", "has no permission to refresh config from remote");
            return;
        }
        if (!this.f7117c) {
            Log.m7730i("efs.config", "disable refresh config from remote");
            return;
        }
        String refresh = m7687g().refresh();
        Log.m7730i("efs.config", "from server. efs config is ".concat(String.valueOf(refresh)));
        if (TextUtils.isEmpty(refresh)) {
            Log.m7726e("efs.config", "config is empty");
        } else {
            m7694a(refresh);
        }
    }

    /* renamed from: b */
    public final void m7695b() {
        this.f7121g.sendEmptyMessage(0);
        this.f7121g.sendEmptyMessageDelayed(2, this.f7123i);
    }

    /* renamed from: c */
    public final Map<String, String> m7696c() {
        return new HashMap(this.f7118d.mSDKConfigMap);
    }

    /* renamed from: d */
    public final void m7697d() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.efs.sdk.base.core.config.remote.b.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    for (IConfigCallback iConfigCallback : C1698b.this.f7119e.keySet()) {
                        String[] strArr = (String[]) C1698b.this.f7119e.get(iConfigCallback);
                        HashMap hashMap = new HashMap();
                        if (strArr != null && strArr.length != 0) {
                            for (String str : strArr) {
                                if (C1698b.this.f7118d.mSDKConfigMap.containsKey(str)) {
                                    hashMap.put(str, C1698b.this.m7696c().get(str));
                                    Log.m7730i("efs.config.register", "configCallback key is " + str + " ## value is " + C1698b.this.m7696c().get(str));
                                }
                            }
                        }
                        iConfigCallback.onChange(hashMap);
                    }
                    C1698b.this.f7119e.clear();
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* renamed from: a */
    public static C1698b m7679a() {
        return a.f7129a;
    }

    /* renamed from: a */
    public final void m7693a(int i10) {
        if (i10 <= this.f7118d.mConfigVersion) {
            Log.m7730i("efs.config", "current config version is " + i10 + ", no need to refresh");
            return;
        }
        Message obtain = Message.obtain();
        obtain.arg1 = i10;
        obtain.what = 1;
        this.f7121g.sendMessage(obtain);
    }

    /* renamed from: a */
    public final String m7691a(String str, String str2) {
        String str3 = this.f7118d.mSDKConfigMap.containsKey(str) ? this.f7118d.mSDKConfigMap.get(str) : str2;
        return TextUtils.isEmpty(str3) ? str2 : str3;
    }

    /* renamed from: a */
    public final String m7692a(boolean z10) {
        if (z10) {
            return "https://" + this.f7118d.f7111c;
        }
        return this.f7118d.f7110b + this.f7118d.f7111c;
    }

    /* renamed from: a */
    public final void m7694a(String str) {
        RemoteConfig m7672a = RemoteConfig.m7672a();
        if (C1699c.m7700a(str, m7672a)) {
            if (m7680a(m7672a)) {
                return;
            }
            this.f7118d = m7672a;
            m7686f();
            m7689i();
            m7697d();
            m7690j();
            return;
        }
        this.f7121g.sendEmptyMessageDelayed(1, 3000L);
    }

    /* renamed from: a */
    private boolean m7680a(RemoteConfig remoteConfig) {
        if (this.f7124j) {
            return false;
        }
        if (this.f7118d.mConfigVersion >= remoteConfig.mConfigVersion) {
            return true;
        }
        Log.m7730i("efs.config", "current config version (" + this.f7118d.mConfigVersion + ") is older than another (" + remoteConfig.mConfigVersion + ")");
        return false;
    }
}
