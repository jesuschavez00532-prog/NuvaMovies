package com.uyumao;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.uyumao.t */
/* loaded from: classes3.dex */
public class C3790t {
    /* renamed from: a */
    public static Method m16058a(String str, String str2, Class<?>... clsArr) {
        Class<?> m16052a;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (m16052a = m16052a(str)) == null) {
            return null;
        }
        try {
            return m16052a.getDeclaredMethod(str2, clsArr);
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    /* renamed from: a */
    public static Object m16056a(Method method, Object obj, Object[] objArr) {
        try {
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            return method.invoke(obj, objArr);
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    /* renamed from: a */
    public static Object m16053a(String str, String str2, Class<?>[] clsArr, Object obj, Object[] objArr) {
        Method m16058a = m16058a(str, str2, clsArr);
        if (m16058a != null) {
            return m16056a(m16058a, obj, objArr);
        }
        return null;
    }

    /* renamed from: a */
    public static Field m16057a(String str, String str2) {
        Class<?> m16052a;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (m16052a = m16052a(str)) == null) {
            return null;
        }
        try {
            return m16052a.getField(str2);
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    /* renamed from: a */
    public static Object m16055a(Field field, Object obj) {
        if (field == null) {
            return null;
        }
        try {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return field.get(obj);
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    /* renamed from: a */
    public static Object m16054a(String str, Class<?>[] clsArr, Object[] objArr) {
        Class<?> m16052a = m16052a(str);
        if (m16052a == null) {
            return null;
        }
        try {
            return m16052a.getConstructor(clsArr).newInstance(objArr);
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    /* renamed from: a */
    public static Class<?> m16052a(String str) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            contextClassLoader = C3790t.class.getClassLoader();
        }
        try {
            try {
                return Class.forName(str, true, contextClassLoader);
            } catch (Throwable unused) {
                return Class.forName(str, true, C3790t.class.getClassLoader());
            }
        } catch (Throwable unused2) {
            return null;
        }
    }
}
