package org.repackage.com.heytap.openid.sdk;

import android.content.Context;
import org.repackage.p270a.p271a.p272a.p273a.C6068a;
import org.repackage.p270a.p271a.p272a.p273a.C6070c;

/* loaded from: classes3.dex */
public class OpenIDSDK {
    /* renamed from: a */
    public static void m24226a(Context context) {
        C6068a.f23842b = C6070c.a.f23850a.m24224a(context.getApplicationContext());
        C6068a.f23841a = true;
    }

    /* renamed from: b */
    public static String m24228b(Context context) {
        if (C6068a.f23841a) {
            return C6070c.a.f23850a.m24223a(context.getApplicationContext(), "GUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    /* renamed from: c */
    public static String m24229c(Context context) {
        if (C6068a.f23841a) {
            return C6070c.a.f23850a.m24223a(context.getApplicationContext(), "OUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    /* renamed from: d */
    public static String m24230d(Context context) {
        if (C6068a.f23841a) {
            return C6070c.a.f23850a.m24223a(context.getApplicationContext(), "DUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    /* renamed from: e */
    public static String m24231e(Context context) {
        if (C6068a.f23841a) {
            return C6070c.a.f23850a.m24223a(context.getApplicationContext(), "AUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    /* renamed from: a */
    public static boolean m24227a() {
        if (C6068a.f23841a) {
            return C6068a.f23842b;
        }
        throw new RuntimeException("SDK Need Init First!");
    }
}
