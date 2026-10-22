package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.g */
/* loaded from: classes3.dex */
public class C3495g extends AbstractC3489a {

    /* renamed from: a */
    private static final String f15473a = "imei";

    /* renamed from: b */
    private Context f15474b;

    public C3495g(Context context) {
        super("imei");
        this.f15474b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3489a
    /* renamed from: f */
    public String mo14876f() {
        return DeviceConfig.getImeiNew(this.f15474b);
    }
}
