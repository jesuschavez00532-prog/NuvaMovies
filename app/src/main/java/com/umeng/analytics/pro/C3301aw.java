package com.umeng.analytics.pro;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.umeng.analytics.pro.aw */
/* loaded from: classes3.dex */
public class C3301aw {
    /* renamed from: a */
    public static Method m13815a(String str, String str2, Class<?>... clsArr) {
        Class<?> m13808a;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (m13808a = m13808a(str)) == null) {
            return null;
        }
        try {
            return m13808a.getDeclaredMethod(str2, clsArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Object m13813a(Method method, Object obj, Object[] objArr) {
        if (method == null) {
            return null;
        }
        try {
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            return method.invoke(obj, objArr);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static Object m13810a(String str, String str2, Class<?>[] clsArr, Object obj, Object[] objArr) {
        Method m13815a = m13815a(str, str2, clsArr);
        if (m13815a != null) {
            return m13813a(m13815a, obj, objArr);
        }
        return null;
    }

    /* renamed from: a */
    public static Field m13814a(String str, String str2) {
        Class<?> m13808a;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (m13808a = m13808a(str)) == null) {
            return null;
        }
        try {
            return m13808a.getField(str2);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Object m13809a(String str, String str2, Object obj) {
        return m13812a(m13814a(str, str2), obj);
    }

    /* renamed from: a */
    public static Object m13812a(Field field, Object obj) {
        if (field == null) {
            return null;
        }
        try {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return field.get(obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Object m13811a(String str, Class<?>[] clsArr, Object[] objArr) {
        Class<?> m13808a = m13808a(str);
        if (m13808a == null) {
            return null;
        }
        try {
            return m13808a.getConstructor(clsArr).newInstance(objArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Class<?> m13808a(String str) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            contextClassLoader = C3301aw.class.getClassLoader();
        }
        try {
            try {
                return Class.forName(str, true, contextClassLoader);
            } catch (Throwable unused) {
                return Class.forName(str, true, C3301aw.class.getClassLoader());
            }
        } catch (Throwable unused2) {
            return null;
        }
    }
}
