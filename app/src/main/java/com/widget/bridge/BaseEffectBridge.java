package com.widget.bridge;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.widget.view.MainUpView;

/* loaded from: classes3.dex */
public abstract class BaseEffectBridge extends BaseEffectHelper {
    public void alignBorderEveryTime() {
        ViewGroup.LayoutParams layoutParams = getMainUpView().getLayoutParams();
        int i10 = layoutParams.width;
        int i11 = this.mFinalWidth;
        if (i10 != i11 || layoutParams.height != this.mFinalHeight) {
            layoutParams.width = i11;
            layoutParams.height = this.mFinalHeight;
            getMainUpView().requestLayout();
        }
    }

    @Override // com.widget.bridge.BaseEffectHelper
    public void calibrationBorder() {
        if (this.isCalibration) {
            this.isCalibration = false;
            MainUpView mainUpView = getMainUpView();
            mainUpView.getLayoutParams().width = this.mFinalWidth;
            mainUpView.getLayoutParams().height = this.mFinalHeight;
            getMainUpView().requestLayout();
        }
    }

    public RectF getDrawShadowRect() {
        return null;
    }

    public RectF getDrawUpRect() {
        return null;
    }

    public MainUpView getMainUpView() {
        return null;
    }

    public Drawable getShadowDrawable() {
        return null;
    }

    public Drawable getUpRectDrawable() {
        return null;
    }

    public abstract boolean onDrawMainUpView(Canvas canvas);

    public abstract void onFocusView(View view, float f10, float f11);

    public abstract void onInitBridge(MainUpView mainUpView);

    public abstract void onOldFocusView(View view, float f10, float f11);

    public void setDrawShadowRectPadding(Rect rect) {
    }

    public void setDrawUpRectPadding(Rect rect) {
    }

    public void setMainUpView(MainUpView mainUpView) {
    }

    public void setShadowDrawable(Drawable drawable) {
    }

    public void setShadowResource(int i10) {
    }

    public void setUpRectDrawable(Drawable drawable) {
    }

    public void setUpRectResource(int i10) {
    }

    public void setDrawShadowRectPadding(RectF rectF) {
    }

    public void setDrawUpRectPadding(RectF rectF) {
    }
}
