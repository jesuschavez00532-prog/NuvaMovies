package p282p5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.C0438q2;
import p106e.AbstractC4105b;

/* renamed from: p5.c */
/* loaded from: classes.dex */
public abstract class AbstractC6216c {
    /* renamed from: a */
    public static ColorStateList m24791a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList m17169c;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (m17169c = AbstractC4105b.m17169c(context, resourceId)) != null) {
            return m17169c;
        }
        return typedArray.getColorStateList(i10);
    }

    /* renamed from: b */
    public static ColorStateList m24792b(Context context, C0438q2 c0438q2, int i10) {
        int m1888n;
        ColorStateList m17169c;
        if (c0438q2.m1893s(i10) && (m1888n = c0438q2.m1888n(i10, 0)) != 0 && (m17169c = AbstractC4105b.m17169c(context, m1888n)) != null) {
            return m17169c;
        }
        return c0438q2.m1877c(i10);
    }

    /* renamed from: c */
    public static int m24793c(Context context, TypedArray typedArray, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i10, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i11);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i10, i11);
    }

    /* renamed from: d */
    public static Drawable m24794d(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable m17170d;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (m17170d = AbstractC4105b.m17170d(context, resourceId)) != null) {
            return m17170d;
        }
        return typedArray.getDrawable(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m24795e(TypedArray typedArray, int i10, int i11) {
        if (typedArray.hasValue(i10)) {
            return i10;
        }
        return i11;
    }

    /* renamed from: f */
    public static C6217d m24796f(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0) {
            return new C6217d(context, resourceId);
        }
        return null;
    }
}
