package com.widget.bridge;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.widget.view.MainUpView;

/* loaded from: classes3.dex */
public class BaseEffectBridgeWrapper extends BaseEffectBridge {
    private static final float DEFAULT_SCALE = 1.0f;
    private static final int DEFAULT_TRAN_DUR_ANIM = 250;
    private Context mContext;
    private Drawable mDrawableShadow;
    private Drawable mDrawableUpRect;
    private MainUpView mMainUpView;
    private RectF mUpPaddingRect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    private RectF mShadowPaddingRect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);

    /* loaded from: classes3.dex */
    public class ScaleView {
        private int height;
        private View view;
        private int width;

        public ScaleView(View view) {
            this.view = view;
        }

        public int getHeight() {
            return this.view.getLayoutParams().height;
        }

        public int getWidth() {
            return this.view.getLayoutParams().width;
        }

        public void setHeight(int i10) {
            this.height = i10;
            this.view.getLayoutParams().height = i10;
            this.view.requestLayout();
        }

        public void setWidth(int i10) {
            this.width = i10;
            this.view.getLayoutParams().width = i10;
            this.view.requestLayout();
        }
    }

    public Rect findLocationWithView(View view) {
        ViewGroup viewGroup = (ViewGroup) getMainUpView().getParent();
        Rect rect = new Rect();
        viewGroup.offsetDescendantRectToMyCoords(view, rect);
        return rect;
    }

    public void flyWhiteBorder(View view, View view2, float f10, float f11) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (view != null) {
            i10 = (int) Math.rint(view.getMeasuredWidth() * f10);
            i11 = (int) Math.rint(view.getMeasuredHeight() * f11);
            i12 = view2.getMeasuredWidth();
            i13 = view2.getMeasuredHeight();
            Rect findLocationWithView = findLocationWithView(view2);
            Rect findLocationWithView2 = findLocationWithView(view);
            int i16 = findLocationWithView2.left - findLocationWithView.left;
            int i17 = findLocationWithView2.top - findLocationWithView.top;
            i15 = i16 - (Math.abs(view.getMeasuredWidth() - i10) / 2);
            i14 = i17 - (Math.abs(view.getMeasuredHeight() - i11) / 2);
        } else {
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "translationX", i15);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "translationY", i14);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(new ScaleView(view2), "width", i12, i10);
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(new ScaleView(view2), "height", i13, i11);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofInt, ofInt2);
        animatorSet.setInterpolator(new DecelerateInterpolator(DEFAULT_SCALE));
        animatorSet.setDuration(250L);
        animatorSet.start();
    }

    @Override // com.widget.bridge.BaseEffectBridge
    public RectF getDrawShadowRect() {
        return this.mShadowPaddingRect;
    }

    @Override // com.widget.bridge.BaseEffectBridge
    public RectF getDrawUpRect() {
        return this.mUpPaddingRect;
    }

    @Override // com.widget.bridge.BaseEffectBridge
    public MainUpView getMainUpView() {
        return this.mMainUpView;
    }

    @Override // com.widget.bridge.BaseEffectBridge
    public Drawable getShadowDrawable() {
        return this.mDrawableShadow;
    }

    @Override // com.widget.bridge.BaseEffectBridge
    public Drawable getUpRectDrawable() {
        return this.mDrawableUpRect;
    }

    public int[] getViewLocationScreen(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    @Override // com.widget.bridge.BaseEffectBridge
    public boolean onDrawMainUpView(Canvas canvas) {
        canvas.save();
        onDrawShadow(canvas);
        onDrawUpRect(canvas);
        canvas.restore();
        return true;
    }

    public void onDrawShadow(Canvas canvas) {
        Drawable shadowDrawable = getShadowDrawable();
        if (shadowDrawable != null) {
            RectF drawShadowRect = getDrawShadowRect();
            int width = getMainUpView().getWidth();
            int height = getMainUpView().getHeight();
            Rect rect = new Rect();
            shadowDrawable.getPadding(rect);
            shadowDrawable.setBounds((-rect.left) - ((int) Math.rint(drawShadowRect.left)), (-rect.top) - ((int) Math.rint(drawShadowRect.top)), width + rect.right + ((int) Math.rint(drawShadowRect.right)), height + rect.bottom + ((int) Math.rint(drawShadowRect.bottom)));
            shadowDrawable.draw(canvas);
        }
    }

    public void onDrawUpRect(Canvas canvas) {
        Drawable upRectDrawable = getUpRectDrawable();
        if (upRectDrawable != null) {
            RectF drawUpRect = getDrawUpRect();
            int width = getMainUpView().getWidth();
            int height = getMainUpView().getHeight();
            Rect rect = new Rect();
            upRectDrawable.getPadding(rect);
            upRectDrawable.setBounds((-rect.left) - ((int) Math.rint(drawUpRect.left)), (-rect.top) - ((int) Math.rint(drawUpRect.top)), width + rect.right + ((int) Math.rint(drawUpRect.right)), height + rect.bottom + ((int) Math.rint(drawUpRect.bottom)));
            upRectDrawable.draw(canvas);
        }
    }

    @Override // com.widget.bridge.BaseEffectBridge
    public void onFocusView(View view, float f10, float f11) {
        if (view != null) {
            view.animate().scaleX(f10).scaleY(f11).setDuration(250L).start();
            runTranslateAnimation(view, f10, f11);
        }
    }

    @Override // com.widget.bridge.BaseEffectBridge
    public void onInitBridge(MainUpView mainUpView) {
        this.mContext = mainUpView.getContext();
    }

    @Override // com.widget.bridge.BaseEffectBridge
    public void onOldFocusView(View view, float f10, float f11) {
        if (view != null) {
            view.animate().scaleX(f10).scaleY(f11).setDuration(250L).start();
        }
    }

    public void runTranslateAnimation(View view, float f10, float f11) {
        try {
            flyWhiteBorder(view, getMainUpView(), f10, f11);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void setDrawShadowPadding(int i10) {
        setDrawShadowRectPadding(new Rect(i10, i10, i10, i10));
    }

    @Override // com.widget.bridge.BaseEffectBridge
    public void setDrawShadowRectPadding(Rect rect) {
        this.mShadowPaddingRect.set(rect);
    }

    public void setDrawUpRectPadding(int i10) {
        setDrawUpRectPadding(new Rect(i10, i10, i10, i10));
    }

    public void setFocusView(View view, View view2, float f10) {
        setFocusView(view, f10);
        setUnFocusView(view2);
    }

    @Override // com.widget.bridge.BaseEffectBridge
    public void setMainUpView(MainUpView mainUpView) {
        this.mMainUpView = mainUpView;
    }

    @Override // com.widget.bridge.BaseEffectBridge
    public void setShadowDrawable(Drawable drawable) {
        this.mDrawableShadow = drawable;
    }

    @Override // com.widget.bridge.BaseEffectBridge
    public void setShadowResource(int i10) {
        try {
            this.mDrawableShadow = this.mContext.getResources().getDrawable(i10);
        } catch (Exception e10) {
            this.mDrawableShadow = null;
            e10.printStackTrace();
        }
    }

    public void setUnFocusView(View view) {
        setUnFocusView(view, DEFAULT_SCALE, DEFAULT_SCALE);
    }

    @Override // com.widget.bridge.BaseEffectBridge
    public void setUpRectDrawable(Drawable drawable) {
        this.mDrawableUpRect = drawable;
    }

    @Override // com.widget.bridge.BaseEffectBridge
    public void setUpRectResource(int i10) {
        try {
            this.mDrawableUpRect = this.mContext.getResources().getDrawable(i10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.widget.bridge.BaseEffectBridge
    public void setDrawShadowRectPadding(RectF rectF) {
        this.mShadowPaddingRect.set(rectF);
    }

    @Override // com.widget.bridge.BaseEffectBridge
    public void setDrawUpRectPadding(Rect rect) {
        this.mUpPaddingRect.set(rect);
    }

    public void setUnFocusView(View view, float f10, float f11) {
        onOldFocusView(view, f10, f11);
    }

    @Override // com.widget.bridge.BaseEffectBridge
    public void setDrawUpRectPadding(RectF rectF) {
        this.mUpPaddingRect.set(rectF);
    }

    public void setFocusView(View view, float f10) {
        setFocusView(view, f10, f10);
    }

    public void setFocusView(View view, float f10, float f11) {
        onFocusView(view, f10, f11);
    }
}
