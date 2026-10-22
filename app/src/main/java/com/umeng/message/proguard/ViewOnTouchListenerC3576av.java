package com.umeng.message.proguard;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;

/* renamed from: com.umeng.message.proguard.av */
/* loaded from: classes3.dex */
final class ViewOnTouchListenerC3576av implements View.OnTouchListener {

    /* renamed from: a */
    private final int f15999a;

    /* renamed from: b */
    private final int f16000b;

    /* renamed from: c */
    private final int f16001c;

    /* renamed from: d */
    private final long f16002d;

    /* renamed from: e */
    private final View f16003e;

    /* renamed from: f */
    private final a f16004f;

    /* renamed from: g */
    private int f16005g = 1;

    /* renamed from: h */
    private float f16006h;

    /* renamed from: i */
    private float f16007i;

    /* renamed from: j */
    private boolean f16008j;

    /* renamed from: k */
    private int f16009k;

    /* renamed from: l */
    private VelocityTracker f16010l;

    /* renamed from: m */
    private float f16011m;

    /* renamed from: com.umeng.message.proguard.av$a */
    /* loaded from: classes3.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract void mo15346a(View view);
    }

    public ViewOnTouchListenerC3576av(View view, a aVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.f15999a = viewConfiguration.getScaledTouchSlop();
        this.f16000b = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.f16001c = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f16002d = view.getContext().getResources().getInteger(R.integer.config_shortAnimTime);
        this.f16003e = view;
        this.f16004f = aVar;
    }

    /* renamed from: a */
    protected final void m15351a(float f10) {
        this.f16003e.setTranslationY(f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x010c, code lost:
    
        if (r13.f16008j != false) goto L57;
     */
    @Override // android.view.View.OnTouchListener
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.proguard.ViewOnTouchListenerC3576av.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private void m15347a(float f10, float f11, AnimatorListenerAdapter animatorListenerAdapter) {
        final float translationY = this.f16003e.getTranslationY();
        final float f12 = f10 - translationY;
        final float alpha = this.f16003e.getAlpha();
        final float f13 = f11 - alpha;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(this.f16002d);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.umeng.message.proguard.av.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = translationY + (valueAnimator.getAnimatedFraction() * f12);
                float animatedFraction2 = alpha + (valueAnimator.getAnimatedFraction() * f13);
                ViewOnTouchListenerC3576av.this.m15351a(animatedFraction);
                ViewOnTouchListenerC3576av.this.m15352b(animatedFraction2);
            }
        });
        if (animatorListenerAdapter != null) {
            ofFloat.addListener(animatorListenerAdapter);
        }
        ofFloat.start();
    }

    /* renamed from: b */
    protected final void m15352b(float f10) {
        this.f16003e.setAlpha(f10);
    }

    /* renamed from: a */
    static /* synthetic */ void m15348a(ViewOnTouchListenerC3576av viewOnTouchListenerC3576av) {
        final ViewGroup.LayoutParams layoutParams = viewOnTouchListenerC3576av.f16003e.getLayoutParams();
        final int width = viewOnTouchListenerC3576av.f16003e.getWidth();
        ValueAnimator duration = ValueAnimator.ofInt(width, 1).setDuration(viewOnTouchListenerC3576av.f16002d);
        duration.addListener(new AnimatorListenerAdapter() { // from class: com.umeng.message.proguard.av.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ViewOnTouchListenerC3576av.this.f16004f.mo15346a(ViewOnTouchListenerC3576av.this.f16003e);
                ViewOnTouchListenerC3576av.this.f16003e.setAlpha(1.0f);
                ViewOnTouchListenerC3576av.this.f16003e.setTranslationY(0.0f);
                layoutParams.width = width;
                ViewOnTouchListenerC3576av.this.f16003e.setLayoutParams(layoutParams);
            }
        });
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.umeng.message.proguard.av.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewOnTouchListenerC3576av.this.f16003e.setLayoutParams(layoutParams);
            }
        });
        duration.start();
    }
}
