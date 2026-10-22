package com.umeng.message.proguard;

import android.os.Build;

/* renamed from: com.umeng.message.proguard.az */
/* loaded from: classes3.dex */
public final class C3580az {
    /* renamed from: a */
    public static void m15370a(C3558ad c3558ad) {
        if (Build.VERSION.SDK_INT < 23 || c3558ad == null || c3558ad.f15880b == null) {
            return;
        }
        Object obj = c3558ad.f15881c;
        if (obj instanceof AbstractRunnableC3609c) {
            ((AbstractRunnableC3609c) obj).m15484c();
        }
        c3558ad.f15881c = null;
    }
}
