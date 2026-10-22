package com.module.previewseekbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;

/* renamed from: com.module.previewseekbar.c */
/* loaded from: classes2.dex */
class C2983c extends AbstractC2981a {

    /* renamed from: f */
    private Animator.AnimatorListener f12090f;

    /* renamed from: g */
    private Animator.AnimatorListener f12091g;

    /* renamed from: h */
    private boolean f12092h;

    /* renamed from: com.module.previewseekbar.c$a */
    /* loaded from: classes2.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C2983c.this.f12083a.animate().setListener(null);
            C2983c.this.m12026u();
            C2983c.this.f12092h = false;
        }
    }

    /* renamed from: com.module.previewseekbar.c$b */
    /* loaded from: classes2.dex */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C2983c.this.f12083a.setVisibility(4);
            C2983c.this.f12083a.animate().setListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.module.previewseekbar.c$c */
    /* loaded from: classes2.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C2983c.this.f12085c.animate().setListener(null);
            C2983c.this.f12084b.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            C2983c.this.f12084b.setAlpha(1.0f);
            C2983c.this.f12085c.setVisibility(0);
            C2983c.this.f12084b.setVisibility(0);
            C2983c.this.f12083a.setVisibility(4);
            C2983c.this.f12084b.animate().alpha(0.0f).setDuration(150L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.module.previewseekbar.c$d */
    /* loaded from: classes2.dex */
    public class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C2983c.this.f12085c.animate().setListener(null);
            C2983c.this.f12084b.setVisibility(4);
            C2983c.this.f12085c.setVisibility(4);
            C2983c.this.f12083a.setVisibility(0);
            C2983c c2983c = C2983c.this;
            c2983c.f12083a.setX(c2983c.m12021p());
            C2983c.this.f12083a.animate().x(C2983c.this.m12023r()).y(C2983c.this.m12024s()).scaleY(0.0f).scaleX(0.0f).setDuration(200L).setInterpolator(new AccelerateInterpolator()).setListener(C2983c.this.f12091g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2983c(ViewGroup viewGroup, InterfaceC2985e interfaceC2985e, View view, FrameLayout frameLayout, View view2) {
        super(viewGroup, interfaceC2985e, view, frameLayout, view2);
        this.f12090f = new a();
        this.f12091g = new b();
    }

    /* renamed from: n */
    private int m12019n(View view) {
        return view.getWidth() / 2;
    }

    /* renamed from: o */
    private int m12020o(View view) {
        return view.getHeight() / 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public float m12021p() {
        return (m12006a() + (this.f12085c.getWidth() / 2.0f)) - this.f12086d.getThumbOffset();
    }

    /* renamed from: q */
    private float m12022q() {
        return (int) (this.f12085c.getY() + (this.f12085c.getHeight() / 2.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public float m12023r() {
        float m12008c = m12008c() + this.f12086d.getThumbOffset();
        return ((((m12007b() - this.f12086d.getThumbOffset()) - m12008c) * m12009d(this.f12086d.getProgress())) + m12008c) - this.f12086d.getThumbOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public float m12024s() {
        return ((View) this.f12086d).getY() + this.f12086d.getThumbOffset();
    }

    /* renamed from: t */
    private int m12025t(View view) {
        return (int) Math.hypot(view.getWidth() / 2, view.getHeight() / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m12026u() {
        Animator createCircularReveal;
        FrameLayout frameLayout = this.f12085c;
        createCircularReveal = ViewAnimationUtils.createCircularReveal(frameLayout, m12019n(frameLayout), m12020o(this.f12085c), this.f12083a.getWidth() * 2, m12025t(this.f12085c));
        createCircularReveal.setTarget(this.f12085c);
        createCircularReveal.setDuration(150L);
        createCircularReveal.setInterpolator(new AccelerateInterpolator());
        createCircularReveal.addListener(new c());
        createCircularReveal.start();
    }

    /* renamed from: v */
    private void m12027v() {
        Animator createCircularReveal;
        FrameLayout frameLayout = this.f12085c;
        createCircularReveal = ViewAnimationUtils.createCircularReveal(frameLayout, m12019n(frameLayout), m12020o(this.f12085c), m12025t(this.f12085c), this.f12083a.getWidth() * 2);
        createCircularReveal.setTarget(this.f12085c);
        createCircularReveal.addListener(new d());
        this.f12084b.animate().alpha(1.0f).setDuration(150L).setInterpolator(new AccelerateInterpolator());
        createCircularReveal.setDuration(150L).setInterpolator(new AccelerateInterpolator());
        createCircularReveal.start();
    }

    @Override // com.module.previewseekbar.AbstractC2981a
    /* renamed from: e */
    public void mo12010e() {
        this.f12092h = false;
        this.f12084b.setVisibility(0);
        this.f12085c.setVisibility(0);
        this.f12083a.setX(m12021p());
        this.f12083a.setY(m12022q());
        this.f12083a.setScaleX(4.0f);
        this.f12083a.setScaleY(4.0f);
        this.f12083a.setVisibility(4);
        this.f12083a.animate().cancel();
        this.f12085c.animate().cancel();
        m12027v();
    }

    @Override // com.module.previewseekbar.AbstractC2981a
    /* renamed from: f */
    public void mo12011f() {
        float m12023r;
        this.f12085c.setX(m12006a());
        ViewPropertyAnimator animate = this.f12083a.animate();
        if (this.f12092h) {
            m12023r = m12021p();
        } else {
            m12023r = m12023r();
        }
        animate.x(m12023r);
    }

    @Override // com.module.previewseekbar.AbstractC2981a
    /* renamed from: g */
    public void mo12012g() {
        this.f12092h = true;
        mo12011f();
        this.f12085c.setVisibility(4);
        this.f12084b.setVisibility(4);
        this.f12083a.setY(((View) this.f12086d).getY());
        this.f12083a.setX(m12023r());
        this.f12083a.setScaleX(0.0f);
        this.f12083a.setScaleY(0.0f);
        this.f12083a.setVisibility(0);
        this.f12083a.animate().x(m12021p()).y(m12022q()).scaleY(4.0f).scaleX(4.0f).setDuration(200L).setInterpolator(new AccelerateDecelerateInterpolator()).setListener(this.f12090f);
    }
}
