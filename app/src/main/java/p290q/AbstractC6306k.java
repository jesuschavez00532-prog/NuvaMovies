package p290q;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: q.k */
/* loaded from: classes.dex */
public abstract class AbstractC6306k {

    /* renamed from: a */
    private static Method f24646a;

    /* renamed from: b */
    private static boolean f24647b;

    /* renamed from: c */
    private static Method f24648c;

    /* renamed from: d */
    private static boolean f24649d;

    /* renamed from: a */
    public static void m25055a(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    /* renamed from: b */
    public static boolean m25056b(Drawable drawable) {
        boolean canApplyTheme;
        if (Build.VERSION.SDK_INT >= 21) {
            canApplyTheme = drawable.canApplyTheme();
            return canApplyTheme;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static void m25057c(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            drawable.clearColorFilter();
            return;
        }
        if (i10 >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                m25057c(((InsetDrawable) drawable).getDrawable());
                return;
            }
            if (drawable instanceof InterfaceC6321z) {
                m25057c(((InterfaceC6321z) drawable).mo25041b());
                return;
            }
            if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
                int childCount = drawableContainerState.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    Drawable child = drawableContainerState.getChild(i11);
                    if (child != null) {
                        m25057c(child);
                    }
                }
                return;
            }
            return;
        }
        drawable.clearColorFilter();
    }

    /* renamed from: d */
    public static int m25058d(Drawable drawable) {
        return drawable.getAlpha();
    }

    /* renamed from: e */
    public static ColorFilter m25059e(Drawable drawable) {
        ColorFilter colorFilter;
        if (Build.VERSION.SDK_INT >= 21) {
            colorFilter = drawable.getColorFilter();
            return colorFilter;
        }
        return null;
    }

    /* renamed from: f */
    public static int m25060f(Drawable drawable) {
        int layoutDirection;
        if (Build.VERSION.SDK_INT >= 23) {
            layoutDirection = drawable.getLayoutDirection();
            return layoutDirection;
        }
        if (!f24649d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f24648c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e10);
            }
            f24649d = true;
        }
        Method method = f24648c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e11) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e11);
                f24648c = null;
            }
        }
        return 0;
    }

    /* renamed from: g */
    public static void m25061g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    /* renamed from: h */
    public static boolean m25062h(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    /* renamed from: i */
    public static void m25063i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: j */
    public static void m25064j(Drawable drawable, boolean z10) {
        drawable.setAutoMirrored(z10);
    }

    /* renamed from: k */
    public static void m25065k(Drawable drawable, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f10, f11);
        }
    }

    /* renamed from: l */
    public static void m25066l(Drawable drawable, int i10, int i11, int i12, int i13) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }
    }

    /* renamed from: m */
    public static boolean m25067m(Drawable drawable, int i10) {
        boolean layoutDirection;
        if (Build.VERSION.SDK_INT >= 23) {
            layoutDirection = drawable.setLayoutDirection(i10);
            return layoutDirection;
        }
        if (!f24647b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f24646a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e10);
            }
            f24647b = true;
        }
        Method method = f24646a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i10));
                return true;
            } catch (Exception e11) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e11);
                f24646a = null;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public static void m25068n(Drawable drawable, int i10) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i10);
        } else if (drawable instanceof InterfaceC6320y) {
            ((InterfaceC6320y) drawable).setTint(i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public static void m25069o(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof InterfaceC6320y) {
            ((InterfaceC6320y) drawable).setTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static void m25070p(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof InterfaceC6320y) {
            ((InterfaceC6320y) drawable).setTintMode(mode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public static Drawable m25071q(Drawable drawable) {
        if (drawable instanceof InterfaceC6321z) {
            return ((InterfaceC6321z) drawable).mo25041b();
        }
        return drawable;
    }

    /* renamed from: r */
    public static Drawable m25072r(Drawable drawable) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            return drawable;
        }
        if (i10 >= 21) {
            if (!(drawable instanceof InterfaceC6320y)) {
                return new C6297c0(drawable);
            }
            return drawable;
        }
        if (!(drawable instanceof InterfaceC6320y)) {
            return new C6293a0(drawable);
        }
        return drawable;
    }
}
