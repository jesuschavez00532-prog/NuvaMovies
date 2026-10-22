package com.umeng.commonsdk.statistics.idtracking;

import android.annotation.TargetApi;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* renamed from: com.umeng.commonsdk.statistics.idtracking.j */
/* loaded from: classes3.dex */
public class C3498j extends AbstractC3489a {

    /* renamed from: a */
    private static final String f15482a = "serial";

    public C3498j() {
        super(f15482a);
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC3489a
    @TargetApi(9)
    /* renamed from: f */
    public String mo14876f() {
        return DeviceConfig.getSerial();
    }
}
