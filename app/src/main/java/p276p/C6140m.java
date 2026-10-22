package p276p;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: p.m */
/* loaded from: classes.dex */
public class C6140m extends C6139l {
    @Override // p276p.C6139l
    /* renamed from: l */
    protected Typeface mo24482l(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f24138g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f24144m.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // p276p.C6139l
    /* renamed from: x */
    protected Method mo24486x(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
