package com.umeng.analytics.pro;

import android.content.Context;
import org.repackage.com.zui.opendeviceidlibrary.OpenDeviceId;

/* renamed from: com.umeng.analytics.pro.bk */
/* loaded from: classes3.dex */
public class C3316bk implements InterfaceC3310be {

    /* renamed from: a */
    private static final int f14144a = 1;

    /* renamed from: b */
    private OpenDeviceId f14145b;

    /* renamed from: c */
    private boolean f14146c = false;

    /* renamed from: d */
    private boolean f14147d = false;

    @Override // com.umeng.analytics.pro.InterfaceC3310be
    /* renamed from: a */
    public String mo13865a(Context context) {
        boolean z10;
        if (context == null) {
            return null;
        }
        if (!this.f14146c) {
            OpenDeviceId openDeviceId = new OpenDeviceId();
            this.f14145b = openDeviceId;
            if (openDeviceId.m24357a(context, (OpenDeviceId.CallBack<String>) null) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f14147d = z10;
            this.f14146c = true;
        }
        C3324bs.m13896a("getOAID", "isSupported", Boolean.valueOf(this.f14147d));
        if (!this.f14147d || !this.f14145b.m24361c()) {
            return null;
        }
        return this.f14145b.m24358a();
    }
}
