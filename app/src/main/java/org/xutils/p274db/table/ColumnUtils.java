package org.xutils.p274db.table;

import com.umeng.analytics.pro.C3325bt;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import org.xutils.common.util.LogUtil;
import org.xutils.p274db.converter.ColumnConverter;
import org.xutils.p274db.converter.ColumnConverterFactory;
import org.xutils.p274db.sqlite.ColumnDbType;

/* loaded from: classes3.dex */
public final class ColumnUtils {
    private static final HashSet<Class<?>> AUTO_INCREMENT_TYPES;
    private static final HashSet<Class<?>> BOOLEAN_TYPES;
    private static final HashSet<Class<?>> INTEGER_TYPES;

    static {
        HashSet<Class<?>> hashSet = new HashSet<>(2);
        BOOLEAN_TYPES = hashSet;
        HashSet<Class<?>> hashSet2 = new HashSet<>(2);
        INTEGER_TYPES = hashSet2;
        HashSet<Class<?>> hashSet3 = new HashSet<>(4);
        AUTO_INCREMENT_TYPES = hashSet3;
        hashSet.add(Boolean.TYPE);
        hashSet.add(Boolean.class);
        hashSet2.add(Integer.TYPE);
        hashSet2.add(Integer.class);
        hashSet3.addAll(hashSet2);
        hashSet3.add(Long.TYPE);
        hashSet3.add(Long.class);
    }

    private ColumnUtils() {
    }

    public static Object convert2DbValueIfNeeded(Object obj) {
        if (obj != null) {
            return ColumnConverterFactory.getColumnConverter(obj.getClass()).fieldValue2DbValue(obj);
        }
        return obj;
    }

    public static String convert2SafeExpr(Object obj) {
        String valueOf = String.valueOf(obj);
        if (valueOf.indexOf(39) != -1) {
            return valueOf.replace("'", "''");
        }
        return valueOf;
    }

    private static Method findBooleanGetMethod(Class<?> cls, String str) {
        if (!str.startsWith(C3325bt.f14213ae)) {
            String str2 = C3325bt.f14213ae + str.substring(0, 1).toUpperCase();
            if (str.length() > 1) {
                str = str2 + str.substring(1);
            } else {
                str = str2;
            }
        }
        try {
            return cls.getDeclaredMethod(str, new Class[0]);
        } catch (NoSuchMethodException unused) {
            LogUtil.m24373d(cls.getName() + "#" + str + " not exist");
            return null;
        }
    }

    private static Method findBooleanSetMethod(Class<?> cls, String str, Class<?> cls2) {
        String str2;
        if (str.startsWith(C3325bt.f14213ae) && str.length() > 2) {
            str2 = "set" + str.substring(2, 3).toUpperCase();
            if (str.length() > 3) {
                str2 = str2 + str.substring(3);
            }
        } else {
            str2 = "set" + str.substring(0, 1).toUpperCase();
            if (str.length() > 1) {
                str2 = str2 + str.substring(1);
            }
        }
        try {
            return cls.getDeclaredMethod(str2, cls2);
        } catch (NoSuchMethodException unused) {
            LogUtil.m24373d(cls.getName() + "#" + str2 + " not exist");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Method findGetMethod(Class<?> cls, Field field) {
        Method method = null;
        if (Object.class.equals(cls)) {
            return null;
        }
        String name = field.getName();
        if (isBoolean(field.getType())) {
            method = findBooleanGetMethod(cls, name);
        }
        if (method == null) {
            String str = "get" + name.substring(0, 1).toUpperCase();
            if (name.length() > 1) {
                str = str + name.substring(1);
            }
            try {
                method = cls.getDeclaredMethod(str, new Class[0]);
            } catch (NoSuchMethodException unused) {
                LogUtil.m24373d(cls.getName() + "#" + str + " not exist");
            }
        }
        if (method == null) {
            return findGetMethod(cls.getSuperclass(), field);
        }
        return method;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Method findSetMethod(Class<?> cls, Field field) {
        Method method = null;
        if (Object.class.equals(cls)) {
            return null;
        }
        String name = field.getName();
        Class<?> type = field.getType();
        if (isBoolean(type)) {
            method = findBooleanSetMethod(cls, name, type);
        }
        if (method == null) {
            String str = "set" + name.substring(0, 1).toUpperCase();
            if (name.length() > 1) {
                str = str + name.substring(1);
            }
            try {
                method = cls.getDeclaredMethod(str, type);
            } catch (NoSuchMethodException unused) {
                LogUtil.m24373d(cls.getName() + "#" + str + " not exist");
            }
        }
        if (method == null) {
            return findSetMethod(cls.getSuperclass(), field);
        }
        return method;
    }

    public static boolean isAutoIdType(Class<?> cls) {
        return AUTO_INCREMENT_TYPES.contains(cls);
    }

    public static boolean isBoolean(Class<?> cls) {
        return BOOLEAN_TYPES.contains(cls);
    }

    public static boolean isInteger(Class<?> cls) {
        return INTEGER_TYPES.contains(cls);
    }

    public static boolean isTextColumnDbType(Object obj) {
        ColumnConverter columnConverter;
        if (obj == null || (columnConverter = ColumnConverterFactory.getColumnConverter(obj.getClass())) == null || !ColumnDbType.TEXT.equals(columnConverter.getColumnDbType())) {
            return false;
        }
        return true;
    }
}
