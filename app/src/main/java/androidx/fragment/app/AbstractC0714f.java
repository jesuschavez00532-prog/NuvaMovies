package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0600m0;
import androidx.fragment.R$animator;
import androidx.fragment.R$id;
import androidx.fragment.app.AbstractC0739y;
import p331t.C6871b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.f */
/* loaded from: classes.dex */
public abstract class AbstractC0714f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.f$a */
    /* loaded from: classes.dex */
    public class a implements C6871b.a {

        /* renamed from: a */
        final /* synthetic */ Fragment f2807a;

        a(Fragment fragment) {
            this.f2807a = fragment;
        }

        @Override // p331t.C6871b.a
        /* renamed from: a */
        public void mo3255a() {
            if (this.f2807a.m3084F6() != null) {
                View m3084F6 = this.f2807a.m3084F6();
                this.f2807a.m3124S8(null);
                m3084F6.clearAnimation();
            }
            this.f2807a.m3129U8(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.f$b */
    /* loaded from: classes.dex */
    public class b implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2808a;

        /* renamed from: b */
        final /* synthetic */ Fragment f2809b;

        /* renamed from: c */
        final /* synthetic */ AbstractC0739y.g f2810c;

        /* renamed from: d */
        final /* synthetic */ C6871b f2811d;

        /* renamed from: androidx.fragment.app.f$b$a */
        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f2809b.m3084F6() != null) {
                    b.this.f2809b.m3124S8(null);
                    b bVar = b.this;
                    bVar.f2810c.mo3559a(bVar.f2809b, bVar.f2811d);
                }
            }
        }

        b(ViewGroup viewGroup, Fragment fragment, AbstractC0739y.g gVar, C6871b c6871b) {
            this.f2808a = viewGroup;
            this.f2809b = fragment;
            this.f2810c = gVar;
            this.f2811d = c6871b;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f2808a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.f$c */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2813a;

        /* renamed from: b */
        final /* synthetic */ View f2814b;

        /* renamed from: c */
        final /* synthetic */ Fragment f2815c;

        /* renamed from: d */
        final /* synthetic */ AbstractC0739y.g f2816d;

        /* renamed from: e */
        final /* synthetic */ C6871b f2817e;

        c(ViewGroup viewGroup, View view, Fragment fragment, AbstractC0739y.g gVar, C6871b c6871b) {
            this.f2813a = viewGroup;
            this.f2814b = view;
            this.f2815c = fragment;
            this.f2816d = gVar;
            this.f2817e = c6871b;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2813a.endViewTransition(this.f2814b);
            Animator m3087G6 = this.f2815c.m3087G6();
            this.f2815c.m3129U8(null);
            if (m3087G6 != null && this.f2813a.indexOfChild(this.f2814b) < 0) {
                this.f2816d.mo3559a(this.f2815c, this.f2817e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m3325a(Fragment fragment, d dVar, AbstractC0739y.g gVar) {
        View view = fragment.f2625H;
        ViewGroup viewGroup = fragment.f2624G;
        viewGroup.startViewTransition(view);
        C6871b c6871b = new C6871b();
        c6871b.m26781c(new a(fragment));
        gVar.mo3560b(fragment, c6871b);
        if (dVar.f2818a != null) {
            e eVar = new e(dVar.f2818a, viewGroup, view);
            fragment.m3124S8(fragment.f2625H);
            eVar.setAnimationListener(new b(viewGroup, fragment, gVar, c6871b));
            fragment.f2625H.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.f2819b;
        fragment.m3129U8(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, c6871b));
        animator.setTarget(fragment.f2625H);
        animator.start();
    }

    /* renamed from: b */
    private static int m3326b(Fragment fragment, boolean z10, boolean z11) {
        if (z11) {
            if (z10) {
                return fragment.m3142Z6();
            }
            return fragment.m3145a7();
        }
        if (z10) {
            return fragment.m3099K6();
        }
        return fragment.m3108N6();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static d m3327c(Context context, Fragment fragment, boolean z10, boolean z11) {
        int m3130V6 = fragment.m3130V6();
        int m3326b = m3326b(fragment, z10, z11);
        boolean z12 = false;
        fragment.m3127T8(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.f2624G;
        if (viewGroup != null) {
            int i10 = R$id.visible_removing_fragment_view_tag;
            if (viewGroup.getTag(i10) != null) {
                fragment.f2624G.setTag(i10, null);
            }
        }
        ViewGroup viewGroup2 = fragment.f2624G;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation m3106M7 = fragment.m3106M7(m3130V6, z10, m3326b);
        if (m3106M7 != null) {
            return new d(m3106M7);
        }
        Animator m3109N7 = fragment.m3109N7(m3130V6, z10, m3326b);
        if (m3109N7 != null) {
            return new d(m3109N7);
        }
        if (m3326b == 0 && m3130V6 != 0) {
            m3326b = m3328d(m3130V6, z10);
        }
        if (m3326b != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(m3326b));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, m3326b);
                    if (loadAnimation != null) {
                        return new d(loadAnimation);
                    }
                    z12 = true;
                } catch (Resources.NotFoundException e10) {
                    throw e10;
                } catch (RuntimeException unused) {
                }
            }
            if (!z12) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, m3326b);
                    if (loadAnimator != null) {
                        return new d(loadAnimator);
                    }
                } catch (RuntimeException e11) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, m3326b);
                        if (loadAnimation2 != null) {
                            return new d(loadAnimation2);
                        }
                    } else {
                        throw e11;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    private static int m3328d(int i10, boolean z10) {
        if (i10 != 4097) {
            if (i10 != 4099) {
                if (i10 != 8194) {
                    return -1;
                }
                if (z10) {
                    return R$animator.fragment_close_enter;
                }
                return R$animator.fragment_close_exit;
            }
            if (z10) {
                return R$animator.fragment_fade_enter;
            }
            return R$animator.fragment_fade_exit;
        }
        if (z10) {
            return R$animator.fragment_open_enter;
        }
        return R$animator.fragment_open_exit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.f$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public final Animation f2818a;

        /* renamed from: b */
        public final Animator f2819b;

        d(Animation animation) {
            this.f2818a = animation;
            this.f2819b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        d(Animator animator) {
            this.f2818a = null;
            this.f2819b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.f$e */
    /* loaded from: classes.dex */
    public static class e extends AnimationSet implements Runnable {

        /* renamed from: a */
        private final ViewGroup f2820a;

        /* renamed from: b */
        private final View f2821b;

        /* renamed from: c */
        private boolean f2822c;

        /* renamed from: d */
        private boolean f2823d;

        /* renamed from: e */
        private boolean f2824e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f2824e = true;
            this.f2820a = viewGroup;
            this.f2821b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation) {
            this.f2824e = true;
            if (this.f2822c) {
                return !this.f2823d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f2822c = true;
                ViewTreeObserverOnPreDrawListenerC0600m0.m2500a(this.f2820a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f2822c && this.f2824e) {
                this.f2824e = false;
                this.f2820a.post(this);
            } else {
                this.f2820a.endViewTransition(this.f2821b);
                this.f2823d = true;
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f2824e = true;
            if (this.f2822c) {
                return !this.f2823d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f2822c = true;
                ViewTreeObserverOnPreDrawListenerC0600m0.m2500a(this.f2820a, this);
            }
            return true;
        }
    }
}
