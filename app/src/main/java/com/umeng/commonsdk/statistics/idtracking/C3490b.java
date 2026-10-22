package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.b */
/* loaded from: classes3.dex */
public class C3490b extends AbstractC3489a {

    /* renamed from: a */
    private static final String f15451a = "android_id";

    /* renamed from: b */
    private Context f15452b;

    public C3490b(Context context) {
        super(f15451a);
        this.f15452b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3489a
    /* renamed from: f */
    public String mo14876f() {
        return DeviceConfig.getAndroidId(this.f15452b);
    }
}
