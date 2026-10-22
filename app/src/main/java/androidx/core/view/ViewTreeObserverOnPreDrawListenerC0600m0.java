package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: androidx.core.view.m0 */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0600m0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    private final View f2357a;

    /* renamed from: b */
    private ViewTreeObserver f2358b;

    /* renamed from: c */
    private final Runnable f2359c;

    private ViewTreeObserverOnPreDrawListenerC0600m0(View view, Runnable runnable) {
        this.f2357a = view;
        this.f2358b = view.getViewTreeObserver();
        this.f2359c = runnable;
    }

    /* renamed from: a */
    public static ViewTreeObserverOnPreDrawListenerC0600m0 m2500a(View view, Runnable runnable) {
        if (view != null) {
            if (runnable != null) {
                ViewTreeObserverOnPreDrawListenerC0600m0 viewTreeObserverOnPreDrawListenerC0600m0 = new ViewTreeObserverOnPreDrawListenerC0600m0(view, runnable);
                view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0600m0);
                view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0600m0);
                return viewTreeObserverOnPreDrawListenerC0600m0;
            }
            throw new NullPointerException("runnable == null");
        }
        throw new NullPointerException("view == null");
    }

    /* renamed from: b */
    public void m2501b() {
        if (this.f2358b.isAlive()) {
            this.f2358b.removeOnPreDrawListener(this);
        } else {
            this.f2357a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f2357a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m2501b();
        this.f2359c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f2358b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m2501b();
    }
}
