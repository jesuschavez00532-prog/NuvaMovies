package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import p214l.C5311i;

/* renamed from: androidx.fragment.app.k */
/* loaded from: classes.dex */
public abstract class AbstractC0724k {

    /* renamed from: a */
    private static final C5311i f2877a = new C5311i();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m3407b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m3408c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static Class m3408c(ClassLoader classLoader, String str) {
        C5311i c5311i = f2877a;
        C5311i c5311i2 = (C5311i) c5311i.get(classLoader);
        if (c5311i2 == null) {
            c5311i2 = new C5311i();
            c5311i.put(classLoader, c5311i2);
        }
        Class cls = (Class) c5311i2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            c5311i2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    /* renamed from: d */
    public static Class m3409d(ClassLoader classLoader, String str) {
        try {
            return m3408c(classLoader, str);
        } catch (ClassCastException e10) {
            throw new Fragment.C0701f("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e10);
        } catch (ClassNotFoundException e11) {
            throw new Fragment.C0701f("Unable to instantiate fragment " + str + ": make sure class name exists", e11);
        }
    }

    /* renamed from: a */
    public abstract Fragment mo3410a(ClassLoader classLoader, String str);
}
