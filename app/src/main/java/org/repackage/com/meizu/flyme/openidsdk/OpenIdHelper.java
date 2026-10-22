package org.repackage.com.meizu.flyme.openidsdk;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class OpenIdHelper {

    /* renamed from: a */
    private static final String f23855a = "OpenIdHelper";

    /* renamed from: b */
    private static Method f23856b;

    /* renamed from: a */
    public static String m24237a(Context context) {
        C6072b m24250a = C6072b.m24250a();
        return m24250a.m24257a(context.getApplicationContext(), m24250a.f23864a);
    }

    /* renamed from: b */
    public static String m24240b(Context context) {
        C6072b m24250a = C6072b.m24250a();
        return m24250a.m24257a(context.getApplicationContext(), m24250a.f23865b);
    }

    /* renamed from: c */
    public static String m24241c(Context context) {
        C6072b m24250a = C6072b.m24250a();
        return m24250a.m24257a(context.getApplicationContext(), m24250a.f23867d);
    }

    /* renamed from: d */
    public static String m24242d(Context context) {
        C6072b m24250a = C6072b.m24250a();
        return m24250a.m24257a(context.getApplicationContext(), m24250a.f23866c);
    }

    /* renamed from: a */
    public static void m24238a(boolean z10) {
        C6072b.m24250a();
        C6072b.m24252a(z10);
    }

    /* renamed from: a */
    public static final boolean m24239a() {
        Context context = null;
        try {
            if (f23856b == null) {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]);
                f23856b = method;
                method.setAccessible(true);
            }
            context = (Context) f23856b.invoke(null, new Object[0]);
        } catch (Exception e10) {
            Log.e(f23855a, "ActivityThread:currentApplication --> " + e10.toString());
        }
        if (context == null) {
            return false;
        }
        return C6072b.m24250a().m24258a(context, false);
    }
}
