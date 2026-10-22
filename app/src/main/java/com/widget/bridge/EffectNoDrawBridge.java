package com.widget.bridge;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.widget.bridge.BaseEffectBridgeWrapper;
import com.widget.view.MainUpView;

/* loaded from: classes3.dex */
public class EffectNoDrawBridge extends OpenEffectBridge {
    protected AnimatorSet mCurrentAnimatorSet;

    @Override // com.widget.bridge.OpenEffectBridge
    public void clearAnimator() {
        AnimatorSet animatorSet = this.mCurrentAnimatorSet;
        if (animatorSet != null) {
            animatorSet.end();
        }
    }

    @Override // com.widget.bridge.OpenEffectBridge, com.widget.bridge.BaseEffectBridgeWrapper
    public void flyWhiteBorder(final View view, View view2, float f10, float f11) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        RectF drawUpRect = getDrawUpRect();
        if (view != null) {
            int measuredWidth = (int) (view.getMeasuredWidth() * f10);
            int measuredHeight = (int) (view.getMeasuredHeight() * f11);
            i12 = view2.getMeasuredWidth();
            i13 = view2.getMeasuredHeight();
            Rect findLocationWithView = findLocationWithView(view2);
            Rect findLocationWithView2 = findLocationWithView(view);
            int rint = (findLocationWithView2.left - findLocationWithView.left) - ((int) Math.rint(drawUpRect.left));
            int rint2 = (findLocationWithView2.top - findLocationWithView.top) - ((int) Math.rint(drawUpRect.top));
            i15 = rint - (Math.abs(view.getMeasuredWidth() - measuredWidth) / 2);
            i14 = rint2 - (Math.abs(view.getMeasuredHeight() - measuredHeight) / 2);
            i10 = measuredWidth + ((int) Math.rint(drawUpRect.right)) + ((int) Math.rint(drawUpRect.left));
            this.mFinalWidth = i10;
            i11 = measuredHeight + ((int) Math.rint(drawUpRect.bottom)) + ((int) Math.rint(drawUpRect.top));
            this.mFinalHeight = i11;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
        }
        AnimatorSet animatorSet = this.mCurrentAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "translationX", i15);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "translationY", i14);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(new BaseEffectBridgeWrapper.ScaleView(view2), "width", i12, i10);
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(new BaseEffectBridgeWrapper.ScaleView(view2), "height", i13, i11);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ofFloat, ofFloat2, ofInt, ofInt2);
        animatorSet2.setInterpolator(new DecelerateInterpolator(1.0f));
        animatorSet2.setDuration(getTranDurAnimTime());
        animatorSet2.addListener(new Animator.AnimatorListener() { // from class: com.widget.bridge.EffectNoDrawBridge.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                int i16;
                MainUpView mainUpView = EffectNoDrawBridge.this.getMainUpView();
                if (EffectNoDrawBridge.this.isVisibleWidget()) {
                    i16 = 8;
                } else {
                    i16 = 0;
                }
                mainUpView.setVisibility(i16);
                if (EffectNoDrawBridge.this.getNewAnimatorListener() != null) {
                    EffectNoDrawBridge.this.getNewAnimatorListener().onAnimationEnd(EffectNoDrawBridge.this, view, animator);
                }
                EffectNoDrawBridge.this.calibrationBorder();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (EffectNoDrawBridge.this.isVisibleWidget()) {
                    EffectNoDrawBridge.this.getMainUpView().setVisibility(8);
                }
                EffectNoDrawBridge effectNoDrawBridge = EffectNoDrawBridge.this;
                if (effectNoDrawBridge.isHideFirstBridge) {
                    effectNoDrawBridge.isHideFirstBridge = false;
                    effectNoDrawBridge.getMainUpView().setVisibility(8);
                }
                if (EffectNoDrawBridge.this.getNewAnimatorListener() != null) {
                    EffectNoDrawBridge.this.getNewAnimatorListener().onAnimationStart(EffectNoDrawBridge.this, view, animator);
                }
            }
        });
        animatorSet2.start();
        this.mCurrentAnimatorSet = animatorSet2;
    }

    @Override // com.widget.bridge.OpenEffectBridge, com.widget.bridge.BaseEffectBridgeWrapper, com.widget.bridge.BaseEffectBridge
    public boolean onDrawMainUpView(Canvas canvas) {
        return false;
    }

    @Override // com.widget.bridge.OpenEffectBridge, com.widget.bridge.BaseEffectBridgeWrapper, com.widget.bridge.BaseEffectBridge
    public void onFocusView(View view, float f10, float f11) {
        if (isAnimEnabled() && view != null) {
            runTranslateAnimation(view, f10, f11);
            view.animate().scaleX(f10).scaleY(f11).setDuration(getTranDurAnimTime()).start();
        }
    }

    @Override // com.widget.bridge.OpenEffectBridge, com.widget.bridge.BaseEffectBridgeWrapper, com.widget.bridge.BaseEffectBridge
    public void onOldFocusView(View view, float f10, float f11) {
        if (isAnimEnabled() && view != null) {
            view.animate().scaleX(f10).scaleY(f11).setDuration(getTranDurAnimTime()).start();
        }
    }

    @Override // com.widget.bridge.BaseEffectBridgeWrapper, com.widget.bridge.BaseEffectBridge
    public void setUpRectDrawable(Drawable drawable) {
        getMainUpView().setBackgroundDrawable(drawable);
    }

    @Override // com.widget.bridge.BaseEffectBridgeWrapper, com.widget.bridge.BaseEffectBridge
    public void setUpRectResource(int i10) {
        getMainUpView().setBackgroundResource(i10);
    }
}
