package com.umeng.analytics.pro;

import android.content.Context;
import org.repackage.com.heytap.openid.sdk.OpenIDSDK;

/* renamed from: com.umeng.analytics.pro.bn */
/* loaded from: classes3.dex */
public class C3319bn implements InterfaceC3310be {

    /* renamed from: a */
    private boolean f14149a = false;

    @Override // com.umeng.analytics.pro.InterfaceC3310be
    /* renamed from: a */
    public String mo13865a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.f14149a) {
            OpenIDSDK.m24226a(context);
            this.f14149a = true;
        }
        boolean m24227a = OpenIDSDK.m24227a();
        C3324bs.m13896a("getOAID", "isSupported", Boolean.valueOf(m24227a));
        if (!m24227a) {
            return null;
        }
        return OpenIDSDK.m24229c(context);
    }
}
