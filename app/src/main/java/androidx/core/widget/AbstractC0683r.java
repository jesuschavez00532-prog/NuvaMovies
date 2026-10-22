package androidx.core.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: androidx.core.widget.r */
/* loaded from: classes.dex */
public abstract class AbstractC0683r {

    /* renamed from: a */
    private static Method f2502a;

    /* renamed from: b */
    private static boolean f2503b;

    /* renamed from: c */
    private static Field f2504c;

    /* renamed from: d */
    private static boolean f2505d;

    /* renamed from: androidx.core.widget.r$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static void m2982a(PopupWindow popupWindow, View view, int i10, int i11, int i12) {
            popupWindow.showAsDropDown(view, i10, i11, i12);
        }
    }

    /* renamed from: androidx.core.widget.r$b */
    /* loaded from: classes.dex */
    static class b {
        /* renamed from: a */
        static boolean m2983a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        /* renamed from: b */
        static int m2984b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        /* renamed from: c */
        static void m2985c(PopupWindow popupWindow, boolean z10) {
            popupWindow.setOverlapAnchor(z10);
        }

        /* renamed from: d */
        static void m2986d(PopupWindow popupWindow, int i10) {
            popupWindow.setWindowLayoutType(i10);
        }
    }

    /* renamed from: a */
    public static void m2979a(PopupWindow popupWindow, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            b.m2985c(popupWindow, z10);
            return;
        }
        if (i10 >= 21) {
            if (!f2505d) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f2504c = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e10) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e10);
                }
                f2505d = true;
            }
            Field field = f2504c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z10));
                } catch (IllegalAccessException e11) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e11);
                }
            }
        }
    }

    /* renamed from: b */
    public static void m2980b(PopupWindow popupWindow, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.m2986d(popupWindow, i10);
            return;
        }
        if (!f2503b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f2502a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f2503b = true;
        }
        Method method = f2502a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i10));
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: c */
    public static void m2981c(PopupWindow popupWindow, View view, int i10, int i11, int i12) {
        a.m2982a(popupWindow, view, i10, i11, i12);
    }
}
