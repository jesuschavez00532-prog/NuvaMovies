package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.view.AbstractC0616q0;
import com.google.android.material.R$styleable;
import p282p5.AbstractC6216c;
import p326s5.C6686i;
import p326s5.C6690m;
import p373w.AbstractC7342g;

/* renamed from: com.google.android.material.datepicker.b */
/* loaded from: classes.dex */
final class C2557b {

    /* renamed from: a */
    private final Rect f9628a;

    /* renamed from: b */
    private final ColorStateList f9629b;

    /* renamed from: c */
    private final ColorStateList f9630c;

    /* renamed from: d */
    private final ColorStateList f9631d;

    /* renamed from: e */
    private final int f9632e;

    /* renamed from: f */
    private final C6690m f9633f;

    private C2557b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, C6690m c6690m, Rect rect) {
        AbstractC7342g.m28324d(rect.left);
        AbstractC7342g.m28324d(rect.top);
        AbstractC7342g.m28324d(rect.right);
        AbstractC7342g.m28324d(rect.bottom);
        this.f9628a = rect;
        this.f9629b = colorStateList2;
        this.f9630c = colorStateList;
        this.f9631d = colorStateList3;
        this.f9632e = i10;
        this.f9633f = c6690m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2557b m10465a(Context context, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC7342g.m28322b(z10, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, R$styleable.f9320Z);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(R$styleable.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(R$styleable.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(R$styleable.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(R$styleable.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList m24791a = AbstractC6216c.m24791a(context, obtainStyledAttributes, R$styleable.MaterialCalendarItem_itemFillColor);
        ColorStateList m24791a2 = AbstractC6216c.m24791a(context, obtainStyledAttributes, R$styleable.MaterialCalendarItem_itemTextColor);
        ColorStateList m24791a3 = AbstractC6216c.m24791a(context, obtainStyledAttributes, R$styleable.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.MaterialCalendarItem_itemStrokeWidth, 0);
        C6690m m26165m = C6690m.m26124b(context, obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).m26165m();
        obtainStyledAttributes.recycle();
        return new C2557b(m24791a, m24791a2, m24791a3, dimensionPixelSize, m26165m, rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m10466b(TextView textView) {
        Drawable drawable;
        C6686i c6686i = new C6686i();
        C6686i c6686i2 = new C6686i();
        c6686i.setShapeAppearanceModel(this.f9633f);
        c6686i2.setShapeAppearanceModel(this.f9633f);
        c6686i.m26096R(this.f9630c);
        c6686i.m26101W(this.f9632e, this.f9631d);
        textView.setTextColor(this.f9629b);
        if (Build.VERSION.SDK_INT >= 21) {
            drawable = new RippleDrawable(this.f9629b.withAlpha(30), c6686i, c6686i2);
        } else {
            drawable = c6686i;
        }
        Rect rect = this.f9628a;
        AbstractC0616q0.m2642q0(textView, new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
