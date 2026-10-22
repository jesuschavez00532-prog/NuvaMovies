package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: androidx.core.widget.g */
/* loaded from: classes.dex */
public abstract class AbstractC0670g {

    /* renamed from: a */
    private static Field f2499a;

    /* renamed from: b */
    private static boolean f2500b;

    /* renamed from: a */
    public static Drawable m2957a(CompoundButton compoundButton) {
        Drawable buttonDrawable;
        if (Build.VERSION.SDK_INT >= 23) {
            buttonDrawable = compoundButton.getButtonDrawable();
            return buttonDrawable;
        }
        if (!f2500b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f2499a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e10);
            }
            f2500b = true;
        }
        Field field = f2499a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e11) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e11);
                f2499a = null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static ColorStateList m2958b(CompoundButton compoundButton) {
        ColorStateList buttonTintList;
        if (Build.VERSION.SDK_INT >= 21) {
            buttonTintList = compoundButton.getButtonTintList();
            return buttonTintList;
        }
        if (compoundButton instanceof InterfaceC0669f0) {
            return ((InterfaceC0669f0) compoundButton).getSupportButtonTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static void m2959c(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
        } else if (compoundButton instanceof InterfaceC0669f0) {
            ((InterfaceC0669f0) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static void m2960d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintMode(mode);
        } else if (compoundButton instanceof InterfaceC0669f0) {
            ((InterfaceC0669f0) compoundButton).setSupportButtonTintMode(mode);
        }
    }
}
