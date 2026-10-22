package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.h */
/* loaded from: classes3.dex */
public class C3496h extends AbstractC3489a {

    /* renamed from: a */
    private static final String f15475a = "mac";

    /* renamed from: b */
    private Context f15476b;

    public C3496h(Context context) {
        super(f15475a);
        this.f15476b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3489a
    /* renamed from: f */
    public String mo14876f() {
        try {
            return DeviceConfig.getMac(this.f15476b);
        } catch (Exception e10) {
            if (AnalyticsConstants.UM_DEBUG) {
                e10.printStackTrace();
            }
            UMCrashManager.reportCrash(this.f15476b, e10);
            return null;
        }
    }
}
