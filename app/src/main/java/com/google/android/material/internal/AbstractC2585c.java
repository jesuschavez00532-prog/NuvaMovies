package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.AbstractC0631u;
import com.google.android.material.R$styleable;

/* renamed from: com.google.android.material.internal.c */
/* loaded from: classes.dex */
public abstract class AbstractC2585c extends ViewGroup {

    /* renamed from: a */
    private int f9802a;

    /* renamed from: b */
    private int f9803b;

    /* renamed from: c */
    private boolean f9804c;

    public AbstractC2585c(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f9804c = false;
        m10639c(context, attributeSet);
    }

    /* renamed from: a */
    private static int m10638a(int i10, int i11, int i12) {
        if (i11 != Integer.MIN_VALUE) {
            if (i11 != 1073741824) {
                return i12;
            }
            return i10;
        }
        return Math.min(i12, i10);
    }

    /* renamed from: c */
    private void m10639c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.f9306L, 0, 0);
        this.f9802a = obtainStyledAttributes.getDimensionPixelSize(R$styleable.FlowLayout_lineSpacing, 0);
        this.f9803b = obtainStyledAttributes.getDimensionPixelSize(R$styleable.FlowLayout_itemSpacing, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public boolean mo10304b() {
        return this.f9804c;
    }

    protected int getItemSpacing() {
        return this.f9803b;
    }

    protected int getLineSpacing() {
        return this.f9802a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft;
        int paddingRight;
        int i14;
        int i15;
        if (getChildCount() == 0) {
            return;
        }
        boolean z11 = true;
        if (AbstractC0616q0.m2579B(this) != 1) {
            z11 = false;
        }
        if (z11) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (z11) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i16 = (i12 - i10) - paddingRight;
        int i17 = paddingLeft;
        int i18 = paddingTop;
        for (int i19 = 0; i19 < getChildCount(); i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i15 = AbstractC0631u.m2818b(marginLayoutParams);
                    i14 = AbstractC0631u.m2817a(marginLayoutParams);
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                int measuredWidth = i17 + i15 + childAt.getMeasuredWidth();
                if (!this.f9804c && measuredWidth > i16) {
                    i18 = this.f9802a + paddingTop;
                    i17 = paddingLeft;
                }
                int i20 = i17 + i15;
                int measuredWidth2 = childAt.getMeasuredWidth() + i20;
                int measuredHeight = childAt.getMeasuredHeight() + i18;
                if (z11) {
                    childAt.layout(i16 - measuredWidth2, i18, (i16 - i17) - i15, measuredHeight);
                } else {
                    childAt.layout(i20, i18, measuredWidth2, measuredHeight);
                }
                i17 += i15 + i14 + childAt.getMeasuredWidth() + this.f9803b;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            i12 = Integer.MAX_VALUE;
        } else {
            i12 = size;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i12 - getPaddingRight();
        int i16 = paddingTop;
        int i17 = 0;
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i10, i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i13 = marginLayoutParams.leftMargin + 0;
                    i14 = marginLayoutParams.rightMargin + 0;
                } else {
                    i13 = 0;
                    i14 = 0;
                }
                int i19 = paddingLeft;
                if (paddingLeft + i13 + childAt.getMeasuredWidth() > paddingRight && !mo10304b()) {
                    i15 = getPaddingLeft();
                    i16 = this.f9802a + paddingTop;
                } else {
                    i15 = i19;
                }
                int measuredWidth = i15 + i13 + childAt.getMeasuredWidth();
                int measuredHeight = i16 + childAt.getMeasuredHeight();
                if (measuredWidth > i17) {
                    i17 = measuredWidth;
                }
                paddingLeft = i15 + i13 + i14 + childAt.getMeasuredWidth() + this.f9803b;
                if (i18 == getChildCount() - 1) {
                    i17 += i14;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(m10638a(size, mode, i17 + getPaddingRight()), m10638a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setItemSpacing(int i10) {
        this.f9803b = i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setLineSpacing(int i10) {
        this.f9802a = i10;
    }

    public void setSingleLine(boolean z10) {
        this.f9804c = z10;
    }
}
