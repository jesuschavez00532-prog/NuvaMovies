package com.widget.bridge;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes3.dex */
public class EffectNoBorderBridge extends OpenEffectBridge {
    protected AnimatorSet mCurrentAnimatorSet;

    @Override // com.widget.bridge.OpenEffectBridge
    public void clearAnimator() {
    }

    @Override // com.widget.bridge.OpenEffectBridge, com.widget.bridge.BaseEffectBridgeWrapper, com.widget.bridge.BaseEffectBridge
    public boolean onDrawMainUpView(Canvas canvas) {
        return false;
    }

    @Override // com.widget.bridge.OpenEffectBridge, com.widget.bridge.BaseEffectBridgeWrapper, com.widget.bridge.BaseEffectBridge
    public void onFocusView(View view, float f10, float f11) {
        if (isAnimEnabled() && view != null) {
            runScaleAnimation(view, f10, f11);
        }
    }

    @Override // com.widget.bridge.OpenEffectBridge, com.widget.bridge.BaseEffectBridgeWrapper, com.widget.bridge.BaseEffectBridge
    public void onOldFocusView(View view, float f10, float f11) {
        if (isAnimEnabled() && view != null) {
            recoverScaleAnimation(view, f10, f11);
        }
    }

    public void recoverScaleAnimation(View view, float f10, float f11) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", f10);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", f11);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    public void runScaleAnimation(View view, float f10, float f11) {
        AnimatorSet animatorSet = this.mCurrentAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, f10);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, f11);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ofFloat, ofFloat2);
        animatorSet2.setDuration(300L);
        animatorSet2.start();
        this.mCurrentAnimatorSet = animatorSet2;
    }

    @Override // com.widget.bridge.BaseEffectBridgeWrapper, com.widget.bridge.BaseEffectBridge
    public void setUpRectDrawable(Drawable drawable) {
    }

    @Override // com.widget.bridge.BaseEffectBridgeWrapper, com.widget.bridge.BaseEffectBridge
    public void setUpRectResource(int i10) {
    }
}
