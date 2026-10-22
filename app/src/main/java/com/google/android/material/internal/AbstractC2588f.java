package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C0438q2;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;
import p138g.C4320d;

/* renamed from: com.google.android.material.internal.f */
/* loaded from: classes.dex */
public abstract class AbstractC2588f {

    /* renamed from: a */
    private static final int[] f9818a = {R$attr.colorPrimary};

    /* renamed from: b */
    private static final int[] f9819b = {R$attr.colorPrimaryVariant};

    /* renamed from: c */
    private static final int[] f9820c = {R.attr.theme, R$attr.theme};

    /* renamed from: d */
    private static final int[] f9821d = {R$attr.materialThemeOverlay};

    /* renamed from: a */
    public static void m10650a(Context context) {
        m10654e(context, f9818a, "Theme.AppCompat");
    }

    /* renamed from: b */
    private static void m10651b(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f9293D0, i10, i11);
        boolean z10 = obtainStyledAttributes.getBoolean(R$styleable.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z10) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R$attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m10652c(context);
            }
        }
        m10650a(context);
    }

    /* renamed from: c */
    public static void m10652c(Context context) {
        m10654e(context, f9819b, "Theme.MaterialComponents");
    }

    /* renamed from: d */
    private static void m10653d(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        boolean z10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f9293D0, i10, i11);
        boolean z11 = false;
        if (!obtainStyledAttributes.getBoolean(R$styleable.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 != null && iArr2.length != 0) {
            z10 = m10656g(context, attributeSet, iArr, i10, i11, iArr2);
        } else {
            if (obtainStyledAttributes.getResourceId(R$styleable.ThemeEnforcement_android_textAppearance, -1) != -1) {
                z11 = true;
            }
            z10 = z11;
        }
        obtainStyledAttributes.recycle();
        if (z10) {
        } else {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: e */
    private static void m10654e(Context context, int[] iArr, String str) {
        if (m10657h(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    /* renamed from: f */
    public static Context m10655f(Context context, AttributeSet attributeSet, int i10, int i11) {
        int m10659j = m10659j(context, attributeSet, i10, i11);
        if (m10659j != 0) {
            if (!(context instanceof C4320d) || ((C4320d) context).m18112c() != m10659j) {
                C4320d c4320d = new C4320d(context, m10659j);
                int m10658i = m10658i(c4320d, attributeSet);
                if (m10658i != 0) {
                    return new C4320d(c4320d, m10658i);
                }
                return c4320d;
            }
            return context;
        }
        return context;
    }

    /* renamed from: g */
    private static boolean m10656g(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
        for (int i12 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i12, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: h */
    private static boolean m10657h(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (!obtainStyledAttributes.hasValue(i10)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: i */
    private static int m10658i(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9820c);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return resourceId;
        }
        return resourceId2;
    }

    /* renamed from: j */
    private static int m10659j(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9821d, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: k */
    public static TypedArray m10660k(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        m10651b(context, attributeSet, i10, i11);
        m10653d(context, attributeSet, iArr, i10, i11, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
    }

    /* renamed from: l */
    public static C0438q2 m10661l(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        m10651b(context, attributeSet, i10, i11);
        m10653d(context, attributeSet, iArr, i10, i11, iArr2);
        return C0438q2.m1874v(context, attributeSet, iArr, i10, i11);
    }
}
