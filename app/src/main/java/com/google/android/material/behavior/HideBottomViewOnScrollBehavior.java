package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p144g5.AbstractC4346a;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.AbstractC0482b {

    /* renamed from: a */
    private int f9407a;

    /* renamed from: b */
    private int f9408b;

    /* renamed from: c */
    private int f9409c;

    /* renamed from: d */
    private ViewPropertyAnimator f9410d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    /* loaded from: classes.dex */
    public class C2525a extends AnimatorListenerAdapter {
        C2525a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f9410d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f9407a = 0;
        this.f9408b = 2;
        this.f9409c = 0;
    }

    /* renamed from: F */
    private void m10173F(View view, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f9410d = view.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new C2525a());
    }

    /* renamed from: G */
    public void m10174G(View view) {
        if (this.f9408b == 1) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f9410d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f9408b = 1;
        m10173F(view, this.f9407a + this.f9409c, 175L, AbstractC4346a.f18926c);
    }

    /* renamed from: H */
    public void m10175H(View view) {
        if (this.f9408b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f9410d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f9408b = 2;
        m10173F(view, 0, 225L, AbstractC4346a.f18927d);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
    /* renamed from: l */
    public boolean mo2122l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f9407a = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return super.mo2122l(coordinatorLayout, view, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
    /* renamed from: r */
    public void mo2128r(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13) {
        if (i11 > 0) {
            m10174G(view);
        } else if (i11 < 0) {
            m10175H(view);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0482b
    /* renamed from: z */
    public boolean mo2136z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
        return i10 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9407a = 0;
        this.f9408b = 2;
        this.f9409c = 0;
    }
}
