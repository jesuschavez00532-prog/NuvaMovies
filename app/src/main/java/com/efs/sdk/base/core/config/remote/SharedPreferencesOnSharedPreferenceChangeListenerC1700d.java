package com.efs.sdk.base.core.config.remote;

import android.content.SharedPreferences;
import com.efs.sdk.base.core.config.GlobalEnvStruct;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.p051b.C1677h;
import com.efs.sdk.base.core.p051b.HandlerC1672c;
import com.efs.sdk.base.core.util.C1713a;
import com.efs.sdk.base.core.util.FileUtil;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.secure.EncodeUtil;
import com.efs.sdk.base.newsharedpreferences.SharedPreferencesUtils;
import java.io.File;
import java.util.Map;

/* renamed from: com.efs.sdk.base.core.config.remote.d */
/* loaded from: classes.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC1700d implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    volatile SharedPreferences f7131a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m7702b() {
        File m7742a = C1713a.m7742a(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        if (m7742a.exists()) {
            m7742a.delete();
        }
    }

    /* renamed from: d */
    private void m7703d() {
        if (this.f7131a == null) {
            synchronized (HandlerC1672c.class) {
                if (this.f7131a == null) {
                    this.f7131a = SharedPreferencesUtils.getSharedPreferences(ControllerCenter.getGlobalEnvStruct().mAppContext, EncodeUtil.base64EncodeToStr(("config_" + ControllerCenter.getGlobalEnvStruct().getAppid().toLowerCase()).getBytes()));
                    this.f7131a.registerOnSharedPreferenceChangeListener(this);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m7704a(RemoteConfig remoteConfig) {
        m7705c();
        if (this.f7131a == null) {
            return false;
        }
        SharedPreferences.Editor edit = this.f7131a.edit();
        edit.clear();
        edit.putInt("cver", remoteConfig.mConfigVersion);
        edit.putLong("last_refresh_time", System.currentTimeMillis());
        for (Map.Entry<String, String> entry : remoteConfig.mSDKConfigMap.entrySet()) {
            edit.putString(entry.getKey(), entry.getValue());
        }
        edit.putString("sign", remoteConfig.f7109a);
        edit.apply();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m7705c() {
        try {
            m7703d();
        } catch (Throwable th) {
            Log.m7727e("efs.config", "init sharedpreferences error", th);
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        C1677h c1677h;
        c1677h = C1677h.a.f7063a;
        if (c1677h.m7644a()) {
            return;
        }
        C1698b.m7679a().m7695b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m7701a() {
        GlobalEnvStruct globalEnvStruct = ControllerCenter.getGlobalEnvStruct();
        File m7744b = C1713a.m7744b(globalEnvStruct.mAppContext, globalEnvStruct.getAppid());
        if (!m7744b.exists()) {
            return false;
        }
        FileUtil.delete(m7744b);
        return true;
    }
}
