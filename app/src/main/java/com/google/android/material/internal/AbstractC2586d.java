package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.AbstractC0445s1;
import com.google.android.material.R$styleable;

/* renamed from: com.google.android.material.internal.d */
/* loaded from: classes.dex */
public abstract class AbstractC2586d extends AbstractC0445s1 {

    /* renamed from: p */
    private Drawable f9805p;

    /* renamed from: q */
    private final Rect f9806q;

    /* renamed from: r */
    private final Rect f9807r;

    /* renamed from: s */
    private int f9808s;

    /* renamed from: t */
    protected boolean f9809t;

    /* renamed from: u */
    boolean f9810u;

    public AbstractC2586d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f9806q = new Rect();
        this.f9807r = new Rect();
        this.f9808s = 119;
        this.f9809t = true;
        this.f9810u = false;
        TypedArray m10660k = AbstractC2588f.m10660k(context, attributeSet, R$styleable.f9309O, i10, 0, new int[0]);
        this.f9808s = m10660k.getInt(R$styleable.ForegroundLinearLayout_android_foregroundGravity, this.f9808s);
        Drawable drawable = m10660k.getDrawable(R$styleable.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f9809t = m10660k.getBoolean(R$styleable.ForegroundLinearLayout_foregroundInsidePadding, true);
        m10660k.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f9805p;
        if (drawable != null) {
            if (this.f9810u) {
                this.f9810u = false;
                Rect rect = this.f9806q;
                Rect rect2 = this.f9807r;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f9809t) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f9808s, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f9805p;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f9805p;
        if (drawable != null && drawable.isStateful()) {
            this.f9805p.setState(getDrawableState());
        }
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f9805p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f9808s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f9805p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AbstractC0445s1, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f9810u = z10 | this.f9810u;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f9810u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f9805p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f9805p);
            }
            this.f9805p = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f9808s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f9808s != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f9808s = i10;
            if (i10 == 119 && this.f9805p != null) {
                this.f9805p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f9805p) {
            return false;
        }
        return true;
    }
}
