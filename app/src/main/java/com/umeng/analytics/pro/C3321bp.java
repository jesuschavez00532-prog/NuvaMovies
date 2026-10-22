package com.umeng.analytics.pro;

import android.content.Context;
import org.repackage.com.vivo.identifier.IdentifierManager;

/* renamed from: com.umeng.analytics.pro.bp */
/* loaded from: classes3.dex */
public class C3321bp implements InterfaceC3310be {
    @Override // com.umeng.analytics.pro.InterfaceC3310be
    /* renamed from: a */
    public String mo13865a(Context context) {
        if (context == null) {
            return null;
        }
        boolean m24331a = IdentifierManager.m24331a(context);
        C3324bs.m13896a("getOAID", "isSupported", Boolean.valueOf(m24331a));
        if (!m24331a) {
            return null;
        }
        return IdentifierManager.m24333b(context);
    }
}
