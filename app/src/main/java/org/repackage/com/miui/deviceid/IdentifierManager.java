package org.repackage.com.miui.deviceid;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class IdentifierManager {

    /* renamed from: a */
    private static final String f23876a = "IdentifierManager";

    /* renamed from: b */
    private static Object f23877b;

    /* renamed from: c */
    private static Class<?> f23878c;

    /* renamed from: d */
    private static Method f23879d;

    /* renamed from: e */
    private static Method f23880e;

    /* renamed from: f */
    private static Method f23881f;

    /* renamed from: g */
    private static Method f23882g;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f23878c = cls;
            f23877b = cls.newInstance();
            f23879d = f23878c.getMethod("getUDID", Context.class);
            f23880e = f23878c.getMethod("getOAID", Context.class);
            f23881f = f23878c.getMethod("getVAID", Context.class);
            f23882g = f23878c.getMethod("getAAID", Context.class);
        } catch (Exception e10) {
            Log.e(f23876a, "reflect exception!", e10);
        }
    }

    /* renamed from: a */
    public static boolean m24261a() {
        return (f23878c == null || f23877b == null) ? false : true;
    }

    /* renamed from: b */
    public static String m24262b(Context context) {
        return m24260a(context, f23880e);
    }

    /* renamed from: c */
    public static String m24263c(Context context) {
        return m24260a(context, f23881f);
    }

    /* renamed from: d */
    public static String m24264d(Context context) {
        return m24260a(context, f23882g);
    }

    /* renamed from: a */
    public static String m24259a(Context context) {
        return m24260a(context, f23879d);
    }

    /* renamed from: a */
    private static String m24260a(Context context, Method method) {
        Object obj = f23877b;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(obj, context);
            if (invoke != null) {
                return (String) invoke;
            }
            return null;
        } catch (Exception e10) {
            Log.e(f23876a, "invoke exception!", e10);
            return null;
        }
    }
}
