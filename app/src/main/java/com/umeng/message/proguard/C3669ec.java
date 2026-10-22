package com.umeng.message.proguard;

import android.text.TextUtils;
import java.lang.reflect.Method;

/* renamed from: com.umeng.message.proguard.ec */
/* loaded from: classes3.dex */
public class C3669ec {
    /* renamed from: a */
    private static Method m15726a(String str, String str2, Class<?>... clsArr) {
        Class<?> m15723a;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (m15723a = m15723a(str)) == null) {
            return null;
        }
        try {
            return m15723a.getDeclaredMethod(str2, clsArr);
        } catch (Throwable th) {
            C3615ce.m15511c("Reflect", "getMethod failed, cls:", str, " method:", str2, " msg:", th.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    private static Object m15725a(Method method, Object[] objArr) {
        if (method == null) {
            return null;
        }
        try {
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            return method.invoke(null, objArr);
        } catch (Throwable th) {
            C3615ce.m15511c("Reflect", "invoke failed:", th.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static Object m15724a(String str, String str2, Class<?>[] clsArr, Object[] objArr) {
        Method m15726a = m15726a(str, str2, clsArr);
        if (m15726a != null) {
            return m15725a(m15726a, objArr);
        }
        return null;
    }

    /* renamed from: a */
    private static Class<?> m15723a(String str) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            contextClassLoader = C3669ec.class.getClassLoader();
        }
        try {
            try {
                return Class.forName(str, true, contextClassLoader);
            } catch (Throwable unused) {
                return Class.forName(str, true, C3669ec.class.getClassLoader());
            }
        } catch (Throwable unused2) {
            return null;
        }
    }
}
