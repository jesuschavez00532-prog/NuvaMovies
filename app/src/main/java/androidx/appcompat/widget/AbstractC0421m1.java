package androidx.appcompat.widget;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import p121f.AbstractC4204e;
import p290q.InterfaceC6321z;

/* renamed from: androidx.appcompat.widget.m1 */
/* loaded from: classes.dex */
public abstract class AbstractC0421m1 {

    /* renamed from: a */
    private static final int[] f1820a = {R.attr.state_checked};

    /* renamed from: b */
    private static final int[] f1821b = new int[0];

    /* renamed from: c */
    public static final Rect f1822c = new Rect();

    /* renamed from: d */
    private static Class f1823d;

    static {
        try {
            f1823d = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static boolean m1828a(Drawable drawable) {
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState instanceof DrawableContainer.DrawableContainerState) {
                for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                    if (!m1828a(drawable2)) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        if (drawable instanceof InterfaceC6321z) {
            return m1828a(((InterfaceC6321z) drawable).mo25041b());
        }
        if (drawable instanceof AbstractC4204e) {
            return m1828a(((AbstractC4204e) drawable).m17575a());
        }
        if (drawable instanceof ScaleDrawable) {
            return m1828a(((ScaleDrawable) drawable).getDrawable());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m1829b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            m1830c(drawable);
        }
    }

    /* renamed from: c */
    private static void m1830c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state != null && state.length != 0) {
            drawable.setState(f1821b);
        } else {
            drawable.setState(f1820a);
        }
        drawable.setState(state);
    }

    /* renamed from: d */
    public static PorterDuff.Mode m1831d(int i10, PorterDuff.Mode mode) {
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 9) {
                    switch (i10) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
