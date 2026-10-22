package com.module.previewseekbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: com.module.previewseekbar.b */
/* loaded from: classes2.dex */
class C2982b extends AbstractC2981a {

    /* renamed from: f */
    private AnimatorListenerAdapter f12088f;

    /* renamed from: com.module.previewseekbar.b$a */
    /* loaded from: classes2.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C2982b.this.f12085c.setVisibility(4);
        }
    }

    public C2982b(ViewGroup viewGroup, InterfaceC2985e interfaceC2985e, View view, FrameLayout frameLayout, View view2) {
        super(viewGroup, interfaceC2985e, view, frameLayout, view2);
        this.f12088f = new a();
    }

    @Override // com.module.previewseekbar.AbstractC2981a
    /* renamed from: e */
    public void mo12010e() {
        this.f12085c.setAlpha(1.0f);
        this.f12085c.animate().cancel();
        this.f12085c.animate().setDuration(200L).alpha(0.0f).setListener(this.f12088f);
    }

    @Override // com.module.previewseekbar.AbstractC2981a
    /* renamed from: f */
    public void mo12011f() {
        this.f12085c.setX(m12006a());
    }

    @Override // com.module.previewseekbar.AbstractC2981a
    /* renamed from: g */
    public void mo12012g() {
        mo12011f();
        this.f12085c.setVisibility(0);
        this.f12085c.setAlpha(0.0f);
        this.f12085c.animate().cancel();
        this.f12085c.animate().setDuration(200L).alpha(1.0f).setListener(null);
    }
}
