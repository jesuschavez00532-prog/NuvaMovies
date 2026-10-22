package com.widget.custom.scaleView;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.widget.C3890R;
import com.zhy.autolayout.AutoRelativeLayout;

/* loaded from: classes3.dex */
public class ZoomRelativeLayout extends AutoRelativeLayout {
    private Animation mAnimFocus;
    private Animation mAnimUnFocus;

    public ZoomRelativeLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (z10) {
            bringToFront();
            getRootView().requestLayout();
            getRootView().invalidate();
            startAnimation(this.mAnimFocus);
            return;
        }
        startAnimation(this.mAnimUnFocus);
    }

    public ZoomRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ZoomRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.mAnimFocus = AnimationUtils.loadAnimation(context, C3890R.anim.scale_big);
        this.mAnimUnFocus = AnimationUtils.loadAnimation(context, C3890R.anim.scale_normal);
        this.mAnimFocus.setFillAfter(true);
        this.mAnimUnFocus.setFillAfter(true);
    }
}
