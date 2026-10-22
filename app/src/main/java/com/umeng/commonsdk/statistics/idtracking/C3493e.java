package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.e */
/* loaded from: classes3.dex */
public class C3493e extends AbstractC3489a {

    /* renamed from: a */
    private static final String f15459a = "idmd5";

    /* renamed from: b */
    private Context f15460b;

    public C3493e(Context context) {
        super("idmd5");
        this.f15460b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3489a
    /* renamed from: f */
    public String mo14876f() {
        return DeviceConfig.getDeviceIdUmengMD5(this.f15460b);
    }
}
