package com.widget.customBridge;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import com.widget.bridge.BaseEffectBridgeWrapper;
import com.widget.bridge.EffectNoDrawBridge;
import com.widget.custom.SmoothScrollLinearLayout;
import com.widget.view.MainUpView;

/* loaded from: classes3.dex */
public class VerticalScrollBridge extends EffectNoDrawBridge {
    private AnimatorSet mAnimatorSet;
    private boolean mIsHideBorder = false;
    private boolean mIsHideAnimationProcess = false;
    private int duration = 300;

    @Override // com.widget.bridge.EffectNoDrawBridge, com.widget.bridge.OpenEffectBridge, com.widget.bridge.BaseEffectBridgeWrapper
    public void flyWhiteBorder(View view, View view2, float f10, float f11) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int scrollMarginLeft;
        RectF drawUpRect = getDrawUpRect();
        AnimatorSet animatorSet = ((EffectNoDrawBridge) this).mCurrentAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
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
            ViewParent parent = view.getParent();
            if (parent != null) {
                if (parent.getParent() instanceof SmoothScrollLinearLayout) {
                    i14 -= ((SmoothScrollLinearLayout) parent.getParent()).getScrollDy();
                    scrollMarginLeft = ((SmoothScrollLinearLayout) parent.getParent()).getScrollMarginLeft();
                } else if (parent.getParent().getParent() instanceof SmoothScrollLinearLayout) {
                    i14 -= ((SmoothScrollLinearLayout) parent.getParent().getParent()).getScrollDy();
                    scrollMarginLeft = ((SmoothScrollLinearLayout) parent.getParent().getParent()).getScrollMarginLeft();
                }
                i15 += scrollMarginLeft;
            }
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
        ObjectAnimator ofInt = ObjectAnimator.ofInt(new BaseEffectBridgeWrapper.ScaleView(view2), "width", i12, i10);
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(new BaseEffectBridgeWrapper.ScaleView(view2), "height", i13, i11);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ofFloat, ofFloat2, ofInt, ofInt2);
        animatorSet2.setInterpolator(new DecelerateInterpolator(1.0f));
        animatorSet2.setDuration(this.duration);
        animatorSet2.addListener(new Animator.AnimatorListener() { // from class: com.widget.customBridge.VerticalScrollBridge.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                int i16;
                MainUpView mainUpView = VerticalScrollBridge.this.getMainUpView();
                if (VerticalScrollBridge.this.isVisibleWidget()) {
                    i16 = 8;
                } else {
                    i16 = 0;
                }
                mainUpView.setVisibility(i16);
                VerticalScrollBridge.this.alignBorderEveryTime();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (VerticalScrollBridge.this.mIsHideAnimationProcess) {
                    VerticalScrollBridge.this.getMainUpView().setVisibility(8);
                }
            }
        });
        animatorSet2.start();
        ((EffectNoDrawBridge) this).mCurrentAnimatorSet = animatorSet2;
    }

    @Override // com.widget.bridge.OpenEffectBridge
    public boolean isVisibleWidget() {
        return this.mIsHideBorder;
    }

    @Override // com.widget.bridge.EffectNoDrawBridge, com.widget.bridge.OpenEffectBridge, com.widget.bridge.BaseEffectBridgeWrapper, com.widget.bridge.BaseEffectBridge
    public void onFocusView(View view, float f10, float f11) {
        if (isAnimEnabled() && view != null) {
            runTranslateAnimation(view, f10, f11);
            runScaleAnimation(view, f10, f11);
        }
    }

    @Override // com.widget.bridge.EffectNoDrawBridge, com.widget.bridge.OpenEffectBridge, com.widget.bridge.BaseEffectBridgeWrapper, com.widget.bridge.BaseEffectBridge
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
        animatorSet.setDuration(this.duration);
        animatorSet.start();
    }

    public void runScaleAnimation(View view, float f10, float f11) {
        AnimatorSet animatorSet = this.mAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, f10);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, f11);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ofFloat, ofFloat2);
        animatorSet2.setDuration(this.duration);
        animatorSet2.start();
        this.mAnimatorSet = animatorSet2;
    }

    @Override // com.widget.bridge.OpenEffectBridge
    public void setHideAnimationProcess(boolean z10) {
        this.mIsHideAnimationProcess = z10;
    }

    @Override // com.widget.bridge.OpenEffectBridge
    public void setVisibleWidget(boolean z10) {
        int i10;
        this.mIsHideBorder = z10;
        MainUpView mainUpView = getMainUpView();
        if (this.mIsHideBorder) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        mainUpView.setVisibility(i10);
    }
}
