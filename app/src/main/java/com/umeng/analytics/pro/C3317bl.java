package com.umeng.analytics.pro;

import android.content.Context;
import org.repackage.com.meizu.flyme.openidsdk.OpenIdHelper;

/* renamed from: com.umeng.analytics.pro.bl */
/* loaded from: classes3.dex */
class C3317bl implements InterfaceC3310be {
    @Override // com.umeng.analytics.pro.InterfaceC3310be
    /* renamed from: a */
    public String mo13865a(Context context) {
        if (context == null) {
            return null;
        }
        boolean m24239a = OpenIdHelper.m24239a();
        C3324bs.m13896a("getOAID", "isSupported", Boolean.valueOf(m24239a));
        if (!m24239a) {
            return null;
        }
        return OpenIdHelper.m24240b(context);
    }
}
