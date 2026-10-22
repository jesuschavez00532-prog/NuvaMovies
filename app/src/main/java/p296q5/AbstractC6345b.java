package p296q5;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* renamed from: q5.b */
/* loaded from: classes.dex */
public abstract class AbstractC6345b {

    /* renamed from: a */
    public static final boolean f24692a;

    /* renamed from: b */
    private static final int[] f24693b;

    /* renamed from: c */
    private static final int[] f24694c;

    /* renamed from: d */
    private static final int[] f24695d;

    /* renamed from: e */
    private static final int[] f24696e;

    /* renamed from: f */
    private static final int[] f24697f;

    /* renamed from: g */
    private static final int[] f24698g;

    /* renamed from: h */
    private static final int[] f24699h;

    /* renamed from: i */
    private static final int[] f24700i;

    /* renamed from: j */
    private static final int[] f24701j;

    /* renamed from: k */
    private static final int[] f24702k;

    /* renamed from: l */
    static final String f24703l;

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        f24692a = z10;
        f24693b = new int[]{R.attr.state_pressed};
        f24694c = new int[]{R.attr.state_hovered, R.attr.state_focused};
        f24695d = new int[]{R.attr.state_focused};
        f24696e = new int[]{R.attr.state_hovered};
        f24697f = new int[]{R.attr.state_selected, R.attr.state_pressed};
        f24698g = new int[]{R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};
        f24699h = new int[]{R.attr.state_selected, R.attr.state_focused};
        f24700i = new int[]{R.attr.state_selected, R.attr.state_hovered};
        f24701j = new int[]{R.attr.state_selected};
        f24702k = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        f24703l = AbstractC6345b.class.getSimpleName();
    }

    /* renamed from: a */
    public static ColorStateList m25126a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 22 && i10 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f24702k, 0)) != 0) {
                Log.w(f24703l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    /* renamed from: b */
    public static boolean m25127b(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        if (!z10 || !z11) {
            return false;
        }
        return true;
    }
}
