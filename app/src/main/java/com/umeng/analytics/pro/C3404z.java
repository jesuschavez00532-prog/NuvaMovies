package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.umeng.analytics.pro.z */
/* loaded from: classes3.dex */
public class C3404z implements InterfaceC3403y {

    /* renamed from: a */
    private long f14931a = AnalyticsConfig.kContinueSessionMillis;

    @Override // com.umeng.analytics.pro.InterfaceC3403y
    /* renamed from: a */
    public void mo14443a(long j10) {
        this.f14931a = j10;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3403y
    /* renamed from: a */
    public long mo14441a() {
        return this.f14931a;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3403y
    /* renamed from: a */
    public String mo14442a(Context context) {
        String appkey = UMUtils.getAppkey(context);
        long currentTimeMillis = System.currentTimeMillis();
        if (appkey != null) {
            return UMUtils.MD5(currentTimeMillis + appkey + "02:00:00:00:00:00");
        }
        throw new RuntimeException("Appkey is null or empty, Please check!");
    }

    @Override // com.umeng.analytics.pro.InterfaceC3403y
    /* renamed from: a */
    public boolean mo14445a(long j10, long j11) {
        long currentTimeMillis = System.currentTimeMillis();
        return (j10 == 0 || currentTimeMillis - j10 >= this.f14931a) && j11 > 0 && currentTimeMillis - j11 > this.f14931a;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3403y
    /* renamed from: a */
    public void mo14444a(Context context, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            SharedPreferences.Editor edit = PreferenceWrapper.getDefault(context).edit();
            edit.putString("session_id", str);
            edit.putLong(C3401w.f14912b, 0L);
            edit.putLong(C3401w.f14915e, currentTimeMillis);
            edit.putLong(C3401w.f14916f, 0L);
            edit.commit();
        } catch (Exception unused) {
        }
    }
}
