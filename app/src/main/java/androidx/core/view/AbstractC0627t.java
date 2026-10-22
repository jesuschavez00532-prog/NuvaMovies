package androidx.core.view;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* renamed from: androidx.core.view.t */
/* loaded from: classes.dex */
public abstract class AbstractC0627t {

    /* renamed from: a */
    private static Field f2420a;

    /* renamed from: b */
    private static boolean f2421b;

    /* renamed from: a */
    private static void m2812a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f2421b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f2420a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e10);
            }
            f2421b = true;
        }
        Field field = f2420a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e11) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e11);
            }
        }
    }

    /* renamed from: b */
    public static void m2813b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                m2812a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                m2812a(layoutInflater, factory2);
            }
        }
    }
}
