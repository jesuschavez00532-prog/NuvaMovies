package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.R$styleable;
import p276p.AbstractC6128a;

/* renamed from: androidx.appcompat.widget.m2 */
/* loaded from: classes.dex */
public abstract class AbstractC0422m2 {

    /* renamed from: a */
    private static final ThreadLocal f1824a = new ThreadLocal();

    /* renamed from: b */
    static final int[] f1825b = {-16842910};

    /* renamed from: c */
    static final int[] f1826c = {R.attr.state_focused};

    /* renamed from: d */
    static final int[] f1827d = {R.attr.state_activated};

    /* renamed from: e */
    static final int[] f1828e = {R.attr.state_pressed};

    /* renamed from: f */
    static final int[] f1829f = {R.attr.state_checked};

    /* renamed from: g */
    static final int[] f1830g = {R.attr.state_selected};

    /* renamed from: h */
    static final int[] f1831h = {-16842919, -16842908};

    /* renamed from: i */
    static final int[] f1832i = new int[0];

    /* renamed from: j */
    private static final int[] f1833j = new int[1];

    /* renamed from: a */
    public static void m1832a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R$styleable.f918o);
        try {
            if (!obtainStyledAttributes.hasValue(R$styleable.AppCompatTheme_windowActionBar)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m1833b(Context context, int i10) {
        ColorStateList m1836e = m1836e(context, i10);
        if (m1836e != null && m1836e.isStateful()) {
            return m1836e.getColorForState(f1825b, m1836e.getDefaultColor());
        }
        TypedValue m1837f = m1837f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, m1837f, true);
        return m1835d(context, i10, m1837f.getFloat());
    }

    /* renamed from: c */
    public static int m1834c(Context context, int i10) {
        int[] iArr = f1833j;
        iArr[0] = i10;
        C0438q2 m1873u = C0438q2.m1873u(context, null, iArr);
        try {
            return m1873u.m1876b(0, 0);
        } finally {
            m1873u.m1894w();
        }
    }

    /* renamed from: d */
    static int m1835d(Context context, int i10, float f10) {
        return AbstractC6128a.m24427f(m1834c(context, i10), Math.round(Color.alpha(r0) * f10));
    }

    /* renamed from: e */
    public static ColorStateList m1836e(Context context, int i10) {
        int[] iArr = f1833j;
        iArr[0] = i10;
        C0438q2 m1873u = C0438q2.m1873u(context, null, iArr);
        try {
            return m1873u.m1877c(0);
        } finally {
            m1873u.m1894w();
        }
    }

    /* renamed from: f */
    private static TypedValue m1837f() {
        ThreadLocal threadLocal = f1824a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }
}
