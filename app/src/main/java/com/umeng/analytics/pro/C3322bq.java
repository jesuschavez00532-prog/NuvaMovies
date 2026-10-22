package com.umeng.analytics.pro;

import android.content.Context;
import org.repackage.com.miui.deviceid.IdentifierManager;

/* renamed from: com.umeng.analytics.pro.bq */
/* loaded from: classes3.dex */
class C3322bq implements InterfaceC3310be {
    @Override // com.umeng.analytics.pro.InterfaceC3310be
    /* renamed from: a */
    public String mo13865a(Context context) {
        if (context == null) {
            return null;
        }
        boolean m24261a = IdentifierManager.m24261a();
        C3324bs.m13896a("getOAID", "isSupported", Boolean.valueOf(m24261a));
        if (!m24261a) {
            return null;
        }
        return IdentifierManager.m24262b(context);
    }
}
