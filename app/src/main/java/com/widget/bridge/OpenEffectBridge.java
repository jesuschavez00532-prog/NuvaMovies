package com.widget.bridge;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.widget.bridge.BaseEffectBridgeWrapper;
import com.widget.view.MainUpView;

/* loaded from: classes3.dex */
public class OpenEffectBridge extends BaseEffectBridgeWrapper {
    public static final int DEFAULT_TRAN_DUR_ANIM = 250;
    private AnimatorSet mCurrentAnimatorSet;
    private View mFocusView;
    private NewAnimatorListener mNewAnimatorListener;
    private int mTranDurAnimTime = DEFAULT_TRAN_DUR_ANIM;
    private boolean isInDraw = false;
    private boolean mIsHide = false;
    private boolean mIsHideAnimationProcess = false;
    private boolean mAnimEnabled = true;
    private boolean isDrawUpRect = true;

    /* loaded from: classes3.dex */
    public interface NewAnimatorListener {
        void onAnimationEnd(OpenEffectBridge openEffectBridge, View view, Animator animator);

        void onAnimationStart(OpenEffectBridge openEffectBridge, View view, Animator animator);
    }

    public void clearAnimator() {
        this.mCurrentAnimatorSet.end();
    }

    @Override // com.widget.bridge.BaseEffectBridgeWrapper
    public void flyWhiteBorder(final View view, View view2, float f10, float f11) {
        float f12;
        int i10;
        int i11;
        int i12;
        int i13;
        float f13;
        if (view != null) {
            i10 = (int) Math.rint(view.getMeasuredWidth() * f10);
            this.mFinalWidth = i10;
            i11 = (int) Math.rint(view.getMeasuredHeight() * f11);
            this.mFinalHeight = i11;
            i12 = view2.getMeasuredWidth();
            i13 = view2.getMeasuredHeight();
            Rect findLocationWithView = findLocationWithView(view2);
            Rect findLocationWithView2 = findLocationWithView(view);
            int i14 = findLocationWithView2.left - findLocationWithView.left;
            int i15 = findLocationWithView2.top - findLocationWithView.top;
            if (view.getParent() != null) {
                View view3 = (View) view.getParent();
                i14 = (int) (i14 + view3.getTranslationX());
                i15 = (int) (i15 + view3.getTranslationY());
            }
            f12 = i14 - (Math.abs(view.getMeasuredWidth() - i10) / 2);
            f13 = i15 - (Math.abs(view.getMeasuredHeight() - i11) / 2);
        } else {
            f12 = 0.0f;
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
            f13 = 0.0f;
        }
        AnimatorSet animatorSet = this.mCurrentAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "translationX", f12);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "translationY", f13);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(new BaseEffectBridgeWrapper.ScaleView(view2), "width", i12, i10);
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(new BaseEffectBridgeWrapper.ScaleView(view2), "height", i13, i11);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ofFloat, ofFloat2, ofInt, ofInt2);
        animatorSet2.setInterpolator(new DecelerateInterpolator(1.0f));
        animatorSet2.setDuration(getTranDurAnimTime());
        animatorSet2.addListener(new Animator.AnimatorListener() { // from class: com.widget.bridge.OpenEffectBridge.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                if (!OpenEffectBridge.this.isDrawUpRect) {
                    OpenEffectBridge.this.isInDraw = false;
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                int i16;
                if (!OpenEffectBridge.this.isDrawUpRect) {
                    OpenEffectBridge.this.isInDraw = true;
                }
                MainUpView mainUpView = OpenEffectBridge.this.getMainUpView();
                if (OpenEffectBridge.this.mIsHide) {
                    i16 = 4;
                } else {
                    i16 = 0;
                }
                mainUpView.setVisibility(i16);
                if (OpenEffectBridge.this.mNewAnimatorListener != null) {
                    OpenEffectBridge.this.mNewAnimatorListener.onAnimationEnd(OpenEffectBridge.this, view, animator);
                }
                OpenEffectBridge.this.calibrationBorder();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (!OpenEffectBridge.this.isDrawUpRect) {
                    OpenEffectBridge.this.isInDraw = false;
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (!OpenEffectBridge.this.isDrawUpRect) {
                    OpenEffectBridge.this.isInDraw = false;
                }
                if (OpenEffectBridge.this.mIsHide) {
                    OpenEffectBridge.this.getMainUpView().setVisibility(4);
                }
                OpenEffectBridge openEffectBridge = OpenEffectBridge.this;
                if (openEffectBridge.isHideFirstBridge) {
                    openEffectBridge.isHideFirstBridge = false;
                    openEffectBridge.getMainUpView().setVisibility(8);
                }
                if (OpenEffectBridge.this.mIsHideAnimationProcess) {
                    OpenEffectBridge.this.getMainUpView().setVisibility(4);
                }
                if (OpenEffectBridge.this.mNewAnimatorListener != null) {
                    OpenEffectBridge.this.mNewAnimatorListener.onAnimationStart(OpenEffectBridge.this, view, animator);
                }
            }
        });
        animatorSet2.start();
        this.mCurrentAnimatorSet = animatorSet2;
    }

    public NewAnimatorListener getNewAnimatorListener() {
        return this.mNewAnimatorListener;
    }

    public int getTranDurAnimTime() {
        return this.mTranDurAnimTime;
    }

    public boolean isAnimEnabled() {
        return this.mAnimEnabled;
    }

    public boolean isVisibleWidget() {
        return this.mIsHide;
    }

    public void onDrawFocusView(Canvas canvas) {
        View view = this.mFocusView;
        canvas.save();
        canvas.scale(getMainUpView().getWidth() / view.getWidth(), getMainUpView().getHeight() / view.getHeight());
        view.draw(canvas);
        canvas.restore();
    }

    @Override // com.widget.bridge.BaseEffectBridgeWrapper, com.widget.bridge.BaseEffectBridge
    public boolean onDrawMainUpView(Canvas canvas) {
        canvas.save();
        if (!this.isDrawUpRect) {
            onDrawShadow(canvas);
            onDrawUpRect(canvas);
        }
        if (this.mFocusView != null && !this.isDrawUpRect && this.isInDraw) {
            onDrawFocusView(canvas);
        }
        if (this.isDrawUpRect) {
            onDrawShadow(canvas);
            onDrawUpRect(canvas);
        }
        canvas.restore();
        return true;
    }

    @Override // com.widget.bridge.BaseEffectBridgeWrapper, com.widget.bridge.BaseEffectBridge
    public void onFocusView(View view, float f10, float f11) {
        this.mFocusView = view;
        if (this.mAnimEnabled && view != null) {
            view.animate().scaleX(f10).scaleY(f11).setDuration(this.mTranDurAnimTime).start();
            runTranslateAnimation(view, f10, f11);
        }
    }

    @Override // com.widget.bridge.BaseEffectBridgeWrapper, com.widget.bridge.BaseEffectBridge
    public void onInitBridge(MainUpView mainUpView) {
        super.onInitBridge(mainUpView);
        mainUpView.setVisibility(4);
    }

    @Override // com.widget.bridge.BaseEffectBridgeWrapper, com.widget.bridge.BaseEffectBridge
    public void onOldFocusView(View view, float f10, float f11) {
        if (this.mAnimEnabled && view != null) {
            view.animate().scaleX(f10).scaleY(f11).setDuration(this.mTranDurAnimTime).start();
        }
    }

    public void setAnimEnabled(boolean z10) {
        this.mAnimEnabled = z10;
    }

    public void setDrawUpRectEnabled(boolean z10) {
        this.isDrawUpRect = z10;
        getMainUpView().invalidate();
    }

    public void setHideAnimationProcess(boolean z10) {
        this.mIsHideAnimationProcess = z10;
    }

    public void setOnAnimatorListener(NewAnimatorListener newAnimatorListener) {
        this.mNewAnimatorListener = newAnimatorListener;
    }

    public void setTranDurAnimTime(int i10) {
        this.mTranDurAnimTime = i10;
    }

    public void setVisibleWidget(boolean z10) {
        int i10;
        this.mIsHide = z10;
        MainUpView mainUpView = getMainUpView();
        if (this.mIsHide) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        mainUpView.setVisibility(i10);
    }
}
