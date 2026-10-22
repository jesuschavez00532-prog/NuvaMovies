package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: androidx.core.view.j1 */
/* loaded from: classes.dex */
public final class C0589j1 {

    /* renamed from: a */
    private WeakReference f2347a;

    /* renamed from: b */
    Runnable f2348b = null;

    /* renamed from: c */
    Runnable f2349c = null;

    /* renamed from: d */
    int f2350d = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.j1$a */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ InterfaceC0593k1 f2351a;

        /* renamed from: b */
        final /* synthetic */ View f2352b;

        a(InterfaceC0593k1 interfaceC0593k1, View view) {
            this.f2351a = interfaceC0593k1;
            this.f2352b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2351a.mo1593a(this.f2352b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2351a.mo1160b(this.f2352b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f2351a.mo1161c(this.f2352b);
        }
    }

    /* renamed from: androidx.core.view.j1$b */
    /* loaded from: classes.dex */
    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ InterfaceC0601m1 f2354a;

        /* renamed from: b */
        final /* synthetic */ View f2355b;

        b(InterfaceC0601m1 interfaceC0601m1, View view) {
            this.f2354a = interfaceC0601m1;
            this.f2355b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f2354a.mo1243a(this.f2355b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0589j1(View view) {
        this.f2347a = new WeakReference(view);
    }

    /* renamed from: g */
    private void m2482g(View view, InterfaceC0593k1 interfaceC0593k1) {
        if (interfaceC0593k1 != null) {
            view.animate().setListener(new a(interfaceC0593k1, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: a */
    public C0589j1 m2483a(float f10) {
        View view = (View) this.f2347a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    /* renamed from: b */
    public void m2484b() {
        View view = (View) this.f2347a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public long m2485c() {
        View view = (View) this.f2347a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* renamed from: d */
    public C0589j1 m2486d(long j10) {
        View view = (View) this.f2347a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    /* renamed from: e */
    public C0589j1 m2487e(Interpolator interpolator) {
        View view = (View) this.f2347a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: f */
    public C0589j1 m2488f(InterfaceC0593k1 interfaceC0593k1) {
        View view = (View) this.f2347a.get();
        if (view != null) {
            m2482g(view, interfaceC0593k1);
        }
        return this;
    }

    /* renamed from: h */
    public C0589j1 m2489h(long j10) {
        View view = (View) this.f2347a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    /* renamed from: i */
    public C0589j1 m2490i(InterfaceC0601m1 interfaceC0601m1) {
        b bVar;
        View view = (View) this.f2347a.get();
        if (view != null) {
            if (interfaceC0601m1 != null) {
                bVar = new b(interfaceC0601m1, view);
            } else {
                bVar = null;
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    /* renamed from: j */
    public void m2491j() {
        View view = (View) this.f2347a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: k */
    public C0589j1 m2492k(float f10) {
        View view = (View) this.f2347a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
