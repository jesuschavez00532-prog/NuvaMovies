package com.umeng.message.proguard;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;

/* renamed from: com.umeng.message.proguard.ek */
/* loaded from: classes3.dex */
public final class ViewOnTouchListenerC3677ek implements View.OnTouchListener {

    /* renamed from: a */
    private final int f16485a;

    /* renamed from: b */
    private final int f16486b;

    /* renamed from: c */
    private final int f16487c;

    /* renamed from: d */
    private final long f16488d;

    /* renamed from: e */
    private final View f16489e;

    /* renamed from: f */
    private final View.OnClickListener f16490f;

    /* renamed from: g */
    private int f16491g = 1;

    /* renamed from: h */
    private float f16492h;

    /* renamed from: i */
    private float f16493i;

    /* renamed from: j */
    private boolean f16494j;

    /* renamed from: k */
    private int f16495k;

    /* renamed from: l */
    private VelocityTracker f16496l;

    /* renamed from: m */
    private float f16497m;

    public ViewOnTouchListenerC3677ek(View view, View.OnClickListener onClickListener) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.f16485a = viewConfiguration.getScaledTouchSlop();
        this.f16486b = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.f16487c = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f16488d = view.getContext().getResources().getInteger(R.integer.config_shortAnimTime);
        this.f16489e = view;
        this.f16490f = onClickListener;
    }

    /* renamed from: a */
    protected final void m15738a(float f10) {
        this.f16489e.setTranslationY(f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x010a, code lost:
    
        if (r13.f16494j != false) goto L57;
     */
    @Override // android.view.View.OnTouchListener
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.proguard.ViewOnTouchListenerC3677ek.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private void m15734a(float f10, float f11, AnimatorListenerAdapter animatorListenerAdapter) {
        final float translationY = this.f16489e.getTranslationY();
        final float f12 = f10 - translationY;
        final float alpha = this.f16489e.getAlpha();
        final float f13 = f11 - alpha;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(this.f16488d);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.umeng.message.proguard.ek.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = translationY + (valueAnimator.getAnimatedFraction() * f12);
                float animatedFraction2 = alpha + (valueAnimator.getAnimatedFraction() * f13);
                ViewOnTouchListenerC3677ek.this.m15738a(animatedFraction);
                ViewOnTouchListenerC3677ek.this.m15739b(animatedFraction2);
            }
        });
        if (animatorListenerAdapter != null) {
            ofFloat.addListener(animatorListenerAdapter);
        }
        ofFloat.start();
    }

    /* renamed from: b */
    protected final void m15739b(float f10) {
        this.f16489e.setAlpha(f10);
    }

    /* renamed from: a */
    static /* synthetic */ void m15735a(ViewOnTouchListenerC3677ek viewOnTouchListenerC3677ek) {
        final ViewGroup.LayoutParams layoutParams = viewOnTouchListenerC3677ek.f16489e.getLayoutParams();
        final int width = viewOnTouchListenerC3677ek.f16489e.getWidth();
        ValueAnimator duration = ValueAnimator.ofInt(width, 1).setDuration(viewOnTouchListenerC3677ek.f16488d);
        duration.addListener(new AnimatorListenerAdapter() { // from class: com.umeng.message.proguard.ek.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ViewOnTouchListenerC3677ek.this.f16490f.onClick(ViewOnTouchListenerC3677ek.this.f16489e);
                ViewOnTouchListenerC3677ek.this.f16489e.setAlpha(1.0f);
                ViewOnTouchListenerC3677ek.this.f16489e.setTranslationY(0.0f);
                layoutParams.width = width;
                ViewOnTouchListenerC3677ek.this.f16489e.setLayoutParams(layoutParams);
            }
        });
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.umeng.message.proguard.ek.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewOnTouchListenerC3677ek.this.f16489e.setLayoutParams(layoutParams);
            }
        });
        duration.start();
    }
}
