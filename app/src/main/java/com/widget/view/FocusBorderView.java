package com.widget.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.widget.C3890R;
import com.widget.utils.FocusUtils;
import p433zd.AbstractC7786b;

/* loaded from: classes3.dex */
public class FocusBorderView extends AppCompatTextView {
    public static int FOCUS_BORDER_SCALE_X_KEY = 100;
    public static int FOCUS_BORDER_SCALE_Y_KEY = 101;
    public static int TRAN_DUR_ANIM = 200;
    private static int X_BORDER_SIZE;
    private static int Y_BORDER_SIZE;
    private AnimatorSet animSet;

    @SuppressLint({"NewApi"})
    private Animator.AnimatorListener flyListener;
    private int height;
    private int offsetX;
    private int tranDurAnim;
    private int width;

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

    public FocusBorderView(Context context) {
        super(context);
        this.tranDurAnim = TRAN_DUR_ANIM;
        this.flyListener = new Animator.AnimatorListener() { // from class: com.widget.view.FocusBorderView.4
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ViewGroup.LayoutParams layoutParams = FocusBorderView.this.getLayoutParams();
                layoutParams.width = FocusBorderView.this.width;
                layoutParams.height = FocusBorderView.this.height;
                FocusBorderView.this.setLayoutParams(layoutParams);
            }
        };
        initFocusBorderView();
    }

    @SuppressLint({"NewApi"})
    private void flyWhiteBorder(final View view, float f10, int i10, final int i11, final int i12, float f11, float f12) {
        int width = getWidth();
        int height = getHeight();
        float f13 = width;
        float f14 = i11 / f13;
        float f15 = height;
        float f16 = i12 / f15;
        if (f10 == 0.0f) {
            f16 = 5.0f / f15;
            f14 = 5.0f / f13;
        }
        if (f14 != 0.0f && f16 != 0.0f) {
            ObjectAnimator ofInt = ObjectAnimator.ofInt(new ScaleView(this), "width", width, i11);
            ObjectAnimator ofInt2 = ObjectAnimator.ofInt(new ScaleView(this), "height", height, i12);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationX", f11 + ((width - i11) / 2));
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "translationY", (f12 + ((height - i12) / 2)) - i10);
            ofInt.addListener(new Animator.AnimatorListener() { // from class: com.widget.view.FocusBorderView.3
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    Object tag = view.getTag(C3890R.id.focus_boder_bg);
                    if (tag != null) {
                        FocusBorderView.this.setBackgroundResource(((Integer) tag).intValue());
                    }
                    ViewGroup.LayoutParams layoutParams = FocusBorderView.this.getLayoutParams();
                    int i13 = layoutParams.width;
                    int i14 = i11;
                    if (i13 != i14 || layoutParams.height != i12) {
                        layoutParams.width = i14;
                        layoutParams.height = i12;
                        FocusBorderView.this.requestLayout();
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    if (view.getTag(C3890R.id.focus_boder_bg) == null) {
                        FocusBorderView.this.setBackgroundResource(C3890R.drawable.poster_focus);
                    }
                }
            });
            AnimatorSet animatorSet = this.animSet;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, "alpha", f10);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.animSet = animatorSet2;
            animatorSet2.playTogether(ofFloat, ofFloat2, ofInt, ofInt2, ofFloat3);
            this.animSet.setDuration(this.tranDurAnim);
            this.animSet.start();
        }
    }

    private void initFocusBorderView() {
    }

    public Rect findLocationWithView(View view) {
        ViewGroup viewGroup = (ViewGroup) getParent();
        Rect rect = new Rect();
        try {
            viewGroup.offsetDescendantRectToMyCoords(view, rect);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return rect;
    }

    public void initOnGlobalFocusChangeListener() {
        getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: com.widget.view.FocusBorderView.1
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public void onGlobalFocusChanged(View view, View view2) {
                FocusBorderView.this.runTranslateAnimation(view2);
            }
        });
    }

    public void resetTranDurAnim() {
        this.tranDurAnim = TRAN_DUR_ANIM;
    }

    public void runTranslateAnimation(View view) {
        if (view == null) {
            return;
        }
        View curFocusView = FocusUtils.getCurFocusView(view);
        Object tag = curFocusView.getTag(C3890R.id.focus_boder_scale_x);
        Object tag2 = curFocusView.getTag(C3890R.id.focus_boder_scale_y);
        runTranslateAnimation(curFocusView, tag != null ? ((Float) tag).floatValue() : 1.0f, tag2 != null ? ((Float) tag2).floatValue() : 1.0f);
    }

    public void setBorderSize(int i10, int i11) {
        X_BORDER_SIZE = i10;
        Y_BORDER_SIZE = i11;
    }

    public void setOffsetX(int i10) {
        this.offsetX = i10;
    }

    public void setTranDurAnim(int i10) {
        this.tranDurAnim = i10;
    }

    public FocusBorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tranDurAnim = TRAN_DUR_ANIM;
        this.flyListener = new Animator.AnimatorListener() { // from class: com.widget.view.FocusBorderView.4
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ViewGroup.LayoutParams layoutParams = FocusBorderView.this.getLayoutParams();
                layoutParams.width = FocusBorderView.this.width;
                layoutParams.height = FocusBorderView.this.height;
                FocusBorderView.this.setLayoutParams(layoutParams);
            }
        };
        initFocusBorderView();
    }

    public void runTranslateAnimation(final View view, final float f10, final float f11) {
        int i10;
        int i11;
        float m30166j;
        float f12;
        int m30166j2;
        if (getWidth() != 0 && getHeight() != 0) {
            if (view.getWidth() == 0 || view.getHeight() == 0) {
                return;
            }
            Object tag = view.getTag(C3890R.id.focus_boder_no_trans);
            if (tag == null || !((Boolean) tag).booleanValue()) {
                Object tag2 = view.getTag(C3890R.id.focus_boder_decrease_y);
                int intValue = tag2 != null ? ((Integer) tag2).intValue() : 0;
                Object tag3 = view.getTag(C3890R.id.focus_boder_aphla);
                float floatValue = tag3 != null ? ((Float) tag3).floatValue() : 1.0f;
                int i12 = this.tranDurAnim;
                Object tag4 = view.getTag(C3890R.id.focus_boder_durtion);
                if (tag4 != null) {
                    i12 = ((Integer) tag4).intValue();
                }
                setTranDurAnim(i12);
                Rect findLocationWithView = findLocationWithView(this);
                Rect findLocationWithView2 = findLocationWithView(view);
                int width = view.getWidth();
                int height = view.getHeight();
                if (width == 0 || height == 0) {
                    return;
                }
                Object tag5 = view.getTag(C3890R.id.focus_boder_next_rect);
                if (tag5 != null) {
                    findLocationWithView2 = (Rect) tag5;
                    width = findLocationWithView2.right - findLocationWithView2.left;
                    height = findLocationWithView2.bottom - findLocationWithView2.top;
                }
                int i13 = findLocationWithView2.right;
                int i14 = this.offsetX;
                findLocationWithView2.right = i13 - i14;
                findLocationWithView2.left -= i14;
                if (view.getTag(C3890R.id.focus_boder_regular) == null) {
                    i10 = (findLocationWithView2.left - findLocationWithView.left) + AbstractC7786b.m30166j(6);
                    i11 = (findLocationWithView2.top - findLocationWithView.top) - AbstractC7786b.m30163g(3);
                    m30166j = (width * f10) + AbstractC7786b.m30166j(13);
                    f12 = (height * f11) - intValue;
                    m30166j2 = AbstractC7786b.m30166j(10);
                } else {
                    i10 = findLocationWithView2.left - findLocationWithView.left;
                    i11 = findLocationWithView2.top - findLocationWithView.top;
                    m30166j = (width * f10) + AbstractC7786b.m30166j(48);
                    f12 = (height * f11) - intValue;
                    m30166j2 = AbstractC7786b.m30166j(46);
                }
                float f13 = f12 + m30166j2;
                int width2 = i10 + ((width - getWidth()) / 2);
                int height2 = i11 + ((height - getHeight()) / 2);
                if (m30166j == 0.0f || height == 0) {
                    return;
                }
                int i15 = (int) m30166j;
                this.width = i15;
                int i16 = (int) f13;
                this.height = i16;
                flyWhiteBorder(view, floatValue, intValue / 2, i15, i16, width2, height2);
                return;
            }
            return;
        }
        setWidth(10);
        setHeight(10);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
        layoutParams.width = 20;
        layoutParams.height = 20;
        setLayoutParams(layoutParams);
        new Handler().postDelayed(new Runnable() { // from class: com.widget.view.FocusBorderView.2
            @Override // java.lang.Runnable
            public void run() {
                FocusBorderView.this.setTranDurAnim(0);
                FocusBorderView.this.runTranslateAnimation(view, f10, f11);
                FocusBorderView.this.resetTranDurAnim();
            }
        }, 200L);
    }

    public FocusBorderView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.tranDurAnim = TRAN_DUR_ANIM;
        this.flyListener = new Animator.AnimatorListener() { // from class: com.widget.view.FocusBorderView.4
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ViewGroup.LayoutParams layoutParams = FocusBorderView.this.getLayoutParams();
                layoutParams.width = FocusBorderView.this.width;
                layoutParams.height = FocusBorderView.this.height;
                FocusBorderView.this.setLayoutParams(layoutParams);
            }
        };
        initFocusBorderView();
    }
}
