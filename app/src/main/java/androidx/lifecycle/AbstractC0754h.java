package androidx.lifecycle;

import android.support.v4.media.session.AbstractC0272b;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.h */
/* loaded from: classes.dex */
public abstract class AbstractC0754h {

    /* renamed from: a */
    private static Map f3143a = new HashMap();

    /* renamed from: b */
    private static Map f3144b = new HashMap();

    /* renamed from: a */
    private static InterfaceC0748b m3724a(Constructor constructor, Object obj) {
        try {
            AbstractC0272b.m941a(constructor.newInstance(obj));
            return null;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private static Constructor m3725b(Class cls) {
        String str;
        try {
            Package r02 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            if (r02 != null) {
                str = r02.getName();
            } else {
                str = "";
            }
            if (!str.isEmpty()) {
                canonicalName = canonicalName.substring(str.length() + 1);
            }
            String m3726c = m3726c(canonicalName);
            if (!str.isEmpty()) {
                m3726c = str + "." + m3726c;
            }
            Constructor declaredConstructor = Class.forName(m3726c).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: c */
    public static String m3726c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: d */
    private static int m3727d(Class cls) {
        Integer num = (Integer) f3143a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int m3730g = m3730g(cls);
        f3143a.put(cls, Integer.valueOf(m3730g));
        return m3730g;
    }

    /* renamed from: e */
    private static boolean m3728e(Class cls) {
        if (cls != null && InterfaceC0751e.class.isAssignableFrom(cls)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static InterfaceC0750d m3729f(Object obj) {
        if (obj instanceof InterfaceC0750d) {
            return (InterfaceC0750d) obj;
        }
        Class<?> cls = obj.getClass();
        if (m3727d(cls) == 2) {
            List list = (List) f3144b.get(cls);
            if (list.size() == 1) {
                m3724a((Constructor) list.get(0), obj);
                return new SingleGeneratedAdapterObserver(null);
            }
            InterfaceC0748b[] interfaceC0748bArr = new InterfaceC0748b[list.size()];
            for (int i10 = 0; i10 < list.size(); i10++) {
                m3724a((Constructor) list.get(i10), obj);
                interfaceC0748bArr[i10] = null;
            }
            return new CompositeGeneratedAdaptersObserver(interfaceC0748bArr);
        }
        return new ReflectiveGenericLifecycleObserver(obj);
    }

    /* renamed from: g */
    private static int m3730g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor m3725b = m3725b(cls);
        if (m3725b != null) {
            f3144b.put(cls, Collections.singletonList(m3725b));
            return 2;
        }
        if (C0747a.f3117c.m3699d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (m3728e(superclass)) {
            if (m3727d(superclass) == 1) {
                return 1;
            }
            arrayList = new ArrayList((Collection) f3144b.get(superclass));
        } else {
            arrayList = null;
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (m3728e(cls2)) {
                if (m3727d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.addAll((Collection) f3144b.get(cls2));
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f3144b.put(cls, arrayList);
        return 2;
    }
}
