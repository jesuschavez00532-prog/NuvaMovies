package com.widget.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import androidx.core.widget.C0684s;
import com.zhy.autolayout.AutoLinearLayout;

/* loaded from: classes3.dex */
public class SmoothScrollLinearLayout extends AutoLinearLayout {
    private int duration;
    public int mScrollAbsFinalY;
    public int mScrollDy;
    public int mScrollMarginLeft;
    private C0684s mScroller;
    private final Interpolator sQuinticInterpolator;

    public SmoothScrollLinearLayout(Context context) {
        super(context);
        this.duration = 500;
        this.sQuinticInterpolator = new Interpolator() { // from class: com.widget.custom.SmoothScrollLinearLayout.1
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f10) {
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            }
        };
        init();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.mScroller.m2988a()) {
            this.mScrollDy = this.mScrollAbsFinalY - this.mScroller.m2990d();
            scrollTo(this.mScroller.m2989c(), this.mScroller.m2990d());
            postInvalidate();
            return;
        }
        this.mScrollDy = 0;
    }

    public int getScrollDy() {
        return this.mScrollDy;
    }

    public int getScrollMarginLeft() {
        return this.mScrollMarginLeft;
    }

    public void init() {
        this.mScroller = C0684s.m2987b(getContext(), this.sQuinticInterpolator);
    }

    public void setScrollMarginLeft(int i10) {
        this.mScrollMarginLeft = i10;
    }

    public void smoothScrollBy(int i10, int i11, int i12) {
        if (i10 != 0 || i11 != 0) {
            C0684s c0684s = this.mScroller;
            c0684s.m2991e(c0684s.m2989c(), this.mScroller.m2990d(), i10, i11, i12);
            invalidate();
        }
    }

    public void smoothScrollByVertical(int i10, int i11) {
        if (i10 != 0) {
            C0684s c0684s = this.mScroller;
            c0684s.m2991e(c0684s.m2989c(), this.mScroller.m2990d(), 0, i10, i11);
            invalidate();
        }
    }

    public void smoothScrollTo(int i10, int i11) {
        this.mScrollAbsFinalY = i11;
        int m2989c = i10 - this.mScroller.m2989c();
        int m2990d = i11 - this.mScroller.m2990d();
        this.mScrollDy = m2990d;
        smoothScrollBy(m2989c, m2990d, this.duration);
    }

    public void smoothScrollToVertical(int i10) {
        this.mScrollAbsFinalY = i10;
        int m2990d = i10 - this.mScroller.m2990d();
        this.mScrollDy = m2990d;
        smoothScrollByVertical(m2990d, this.duration);
    }

    public SmoothScrollLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.duration = 500;
        this.sQuinticInterpolator = new Interpolator() { // from class: com.widget.custom.SmoothScrollLinearLayout.1
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f10) {
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            }
        };
        init();
    }

    public SmoothScrollLinearLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.duration = 500;
        this.sQuinticInterpolator = new Interpolator() { // from class: com.widget.custom.SmoothScrollLinearLayout.1
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f10) {
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            }
        };
        init();
    }
}
