package com.umeng.commonsdk.service;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.utils.UMUtils;

/* loaded from: classes3.dex */
public class UMGlobalContext {
    private static final String TAG = "UMGlobalContext";
    private String mAppVersion;
    private String mAppkey;
    private Context mApplicationContext;
    private String mChannel;
    private String mProcessName;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.commonsdk.service.UMGlobalContext$a */
    /* loaded from: classes3.dex */
    public static class C3475a {

        /* renamed from: a */
        private static final UMGlobalContext f15352a = new UMGlobalContext();

        private C3475a() {
        }
    }

    public static Context getAppContext(Context context) {
        if (C3475a.f15352a.mApplicationContext == null && context != null) {
            C3475a.f15352a.mApplicationContext = context.getApplicationContext();
        }
        return C3475a.f15352a.mApplicationContext;
    }

    public static UMGlobalContext getInstance(Context context) {
        if (C3475a.f15352a.mApplicationContext == null && context != null) {
            C3475a.f15352a.mApplicationContext = context;
        }
        return C3475a.f15352a;
    }

    public String getAppVersion() {
        if (TextUtils.isEmpty(this.mAppVersion)) {
            this.mAppVersion = UMUtils.getAppVersionName(this.mApplicationContext);
        }
        return this.mAppVersion;
    }

    public String getAppkey() {
        if (TextUtils.isEmpty(this.mAppkey)) {
            this.mAppkey = UMConfigure.sAppkey;
        }
        return this.mAppkey;
    }

    public String getChannel() {
        if (TextUtils.isEmpty(this.mChannel)) {
            this.mChannel = UMConfigure.sChannel;
        }
        return this.mChannel;
    }

    public String getProcessName(Context context) {
        if (TextUtils.isEmpty(this.mProcessName)) {
            if (context != null) {
                Context context2 = C3475a.f15352a.mApplicationContext;
                if (context2 != null) {
                    this.mProcessName = UMFrUtils.getCurrentProcessName(context2);
                } else {
                    this.mProcessName = UMFrUtils.getCurrentProcessName(context);
                }
            } else {
                this.mProcessName = UMFrUtils.getCurrentProcessName(C3475a.f15352a.mApplicationContext);
            }
        }
        return this.mProcessName;
    }

    public boolean isMainProcess(Context context) {
        return UMUtils.isMainProgress(context);
    }

    public String toString() {
        if (C3475a.f15352a.mApplicationContext != null) {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append("appkey:" + this.mAppkey + ",");
            sb2.append("channel:" + this.mChannel + ",");
            sb2.append("procName:" + this.mProcessName + "]");
            return sb2.toString();
        }
        return "uninitialized.";
    }

    private UMGlobalContext() {
        this.mProcessName = "";
    }

    public static Context getAppContext() {
        return C3475a.f15352a.mApplicationContext;
    }
}
