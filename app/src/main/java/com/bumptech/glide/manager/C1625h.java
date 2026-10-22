package com.bumptech.glide.manager;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p109e2.AbstractC4122l;
import p322s1.C6651z;

/* renamed from: com.bumptech.glide.manager.h */
/* loaded from: classes.dex */
final class C1625h implements InterfaceC1626i {

    /* renamed from: a */
    final Set f6425a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    volatile boolean f6426b;

    /* renamed from: com.bumptech.glide.manager.h$a */
    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a */
        final /* synthetic */ View f6427a;

        /* renamed from: com.bumptech.glide.manager.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC7818a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ViewTreeObserver.OnDrawListener f6429a;

            RunnableC7818a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f6429a = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                C6651z.m25964b().m25970h();
                C1625h.this.f6426b = true;
                C1625h.m7465b(a.this.f6427a, this.f6429a);
                C1625h.this.f6425a.clear();
            }
        }

        a(View view) {
            this.f6427a = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            AbstractC4122l.m17250w(new RunnableC7818a(this));
        }
    }

    /* renamed from: b */
    static void m7465b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // com.bumptech.glide.manager.InterfaceC1626i
    /* renamed from: a */
    public void mo7463a(Activity activity) {
        if (this.f6426b || !this.f6425a.add(activity)) {
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
    }
}
