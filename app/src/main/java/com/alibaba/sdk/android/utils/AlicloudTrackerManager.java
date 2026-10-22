package com.alibaba.sdk.android.utils;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.sdk.android.utils.crashdefend.C1570b;
import com.alibaba.sdk.android.utils.crashdefend.C1571c;
import com.alibaba.sdk.android.utils.crashdefend.SDKMessageCallback;
import com.taobao.accs.common.Constants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class AlicloudTrackerManager {

    /* renamed from: a */
    private static AlicloudTrackerManager f6050a;

    /* renamed from: a */
    private C1567a f6051a = new C1567a();

    /* renamed from: a */
    private C1570b f6052a;

    /* renamed from: b */
    private Map<String, AlicloudTracker> f6053b;

    private AlicloudTrackerManager(Application application) {
        this.f6052a = null;
        HashMap hashMap = new HashMap(4);
        hashMap.put("kVersion", "2.0.0");
        hashMap.put(Constants.KEY_PACKAGE_NAME, application.getPackageName());
        this.f6051a.m7240a(application, hashMap);
        this.f6053b = new HashMap();
        this.f6052a = C1570b.m7244a(application, this.f6051a);
    }

    public static synchronized AlicloudTrackerManager getInstance(Application application) {
        synchronized (AlicloudTrackerManager.class) {
            if (application == null) {
                return null;
            }
            if (f6050a == null) {
                f6050a = new AlicloudTrackerManager(application);
            }
            return f6050a;
        }
    }

    public AlicloudTracker getTracker(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String str3 = str + str2;
            if (this.f6053b.containsKey(str3)) {
                return this.f6053b.get(str3);
            }
            AlicloudTracker alicloudTracker = new AlicloudTracker(this.f6051a, str, str2);
            this.f6053b.put(str3, alicloudTracker);
            return alicloudTracker;
        }
        Log.e("AlicloudTrackerManager", "sdkId or sdkVersion is null");
        return null;
    }

    public boolean registerCrashDefend(String str, String str2, int i10, int i11, SDKMessageCallback sDKMessageCallback) {
        if (this.f6052a != null) {
            C1571c c1571c = new C1571c();
            c1571c.f6074a = str;
            c1571c.f6077b = str2;
            c1571c.f6071a = i10;
            c1571c.f6075b = i11;
            return this.f6052a.m7256a(c1571c, sDKMessageCallback);
        }
        return false;
    }

    public void unregisterCrashDefend(String str, String str2) {
        this.f6052a.m7257b(str, str2);
    }
}
