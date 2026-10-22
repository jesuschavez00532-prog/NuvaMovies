package com.umeng.message.proguard;

import android.text.TextUtils;
import com.umeng.message.common.UPLog;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.umeng.message.proguard.bn */
/* loaded from: classes3.dex */
public class C3596bn {
    /* renamed from: a */
    public static Method m15438a(String str, String str2, Class<?>... clsArr) {
        Class<?> m15432a;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (m15432a = m15432a(str)) == null) {
            return null;
        }
        try {
            return m15432a.getDeclaredMethod(str2, clsArr);
        } catch (Throwable th) {
            UPLog.m15200w("Reflect", "getMethod failed, cls:", str, "method:", str2, "msg:", th.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static Object m15436a(Method method, Object obj, Object[] objArr) {
        if (method == null) {
            return null;
        }
        try {
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            return method.invoke(obj, objArr);
        } catch (Throwable th) {
            UPLog.m15200w("Reflect", "invoke failed:", th.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static Object m15433a(String str, String str2, Class<?>[] clsArr, Object obj, Object[] objArr) {
        Method m15438a = m15438a(str, str2, clsArr);
        if (m15438a != null) {
            return m15436a(m15438a, obj, objArr);
        }
        return null;
    }

    /* renamed from: a */
    public static Field m15437a(String str, String str2) {
        Class<?> m15432a;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (m15432a = m15432a(str)) == null) {
            return null;
        }
        try {
            return m15432a.getField(str2);
        } catch (Throwable th) {
            UPLog.m15200w("Reflect", "getField failed, cls:", str, "field:", str2, "msg:", th.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static Object m15435a(Field field, Object obj) {
        if (field == null) {
            return null;
        }
        try {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            return field.get(obj);
        } catch (Throwable th) {
            UPLog.m15197e("Reflect", "getFieldValue failed:", th.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static Object m15434a(String str, Class<?>[] clsArr, Object[] objArr) {
        Class<?> m15432a = m15432a(str);
        if (m15432a == null) {
            return null;
        }
        try {
            return m15432a.getConstructor(clsArr).newInstance(objArr);
        } catch (Throwable th) {
            UPLog.m15200w("Reflect", "newInstance failed, cls:", str, "msg:", th.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static Class<?> m15432a(String str) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            contextClassLoader = C3596bn.class.getClassLoader();
        }
        try {
            try {
                return Class.forName(str, true, contextClassLoader);
            } catch (Throwable unused) {
                return Class.forName(str, true, C3596bn.class.getClassLoader());
            }
        } catch (Throwable unused2) {
            return null;
        }
    }
}
