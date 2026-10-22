package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.d */
/* loaded from: classes3.dex */
public class C3492d extends AbstractC3489a {

    /* renamed from: a */
    private static final String f15457a = "idfa";

    /* renamed from: b */
    private Context f15458b;

    public C3492d(Context context) {
        super(f15457a);
        this.f15458b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3489a
    /* renamed from: f */
    public String mo14876f() {
        return DeviceConfig.getIdfa(this.f15458b);
    }
}
