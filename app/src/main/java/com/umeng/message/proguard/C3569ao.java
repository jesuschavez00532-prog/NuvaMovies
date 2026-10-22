package com.umeng.message.proguard;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import com.umeng.message.common.UPLog;
import com.umeng.message.proguard.C3569ao;
import com.umeng.message.proguard.ViewOnTouchListenerC3576av;
import java.lang.ref.WeakReference;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.umeng.message.proguard.ao */
/* loaded from: classes3.dex */
public final class C3569ao {

    /* renamed from: a */
    private static final C3573as f15958a = new C3573as();

    /* renamed from: b */
    private static WeakReference<Activity> f15959b;

    /* renamed from: c */
    private static Future<?> f15960c;

    /* renamed from: com.umeng.message.proguard.ao$a */
    /* loaded from: classes3.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract void mo15324a(C3570ap c3570ap, boolean z10);
    }

    /* renamed from: b */
    static /* synthetic */ Future m15337b() {
        f15960c = null;
        return null;
    }

    /* renamed from: c */
    private static void m15338c() {
        Future<?> future = f15960c;
        if (future != null && !future.isDone() && !future.isCancelled()) {
            future.cancel(false);
        }
        f15960c = null;
    }

    /* renamed from: a */
    public static void m15335a(final Activity activity, C3570ap c3570ap, final a aVar) {
        m15338c();
        f15959b = new WeakReference<>(activity);
        final C3571aq c3571aq = new C3571aq(activity, c3570ap);
        final C3573as c3573as = f15958a;
        activity.runOnUiThread(new Runnable() { // from class: com.umeng.message.proguard.as.1

            /* renamed from: a */
            final /* synthetic */ Activity f15976a;

            /* renamed from: b */
            final /* synthetic */ C3571aq f15977b;

            /* renamed from: c */
            final /* synthetic */ C3569ao.a f15978c;

            public AnonymousClass1(final Activity activity2, final C3571aq c3571aq2, final C3569ao.a aVar2) {
                r2 = activity2;
                r3 = c3571aq2;
                r4 = aVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z10;
                View.OnClickListener onClickListener;
                try {
                    if (r2.isFinishing()) {
                        UPLog.m15197e("Pop", "Activity finish. cannot show");
                        try {
                            r4.mo15324a(r3.m15342b(), false);
                            return;
                        } catch (Throwable th) {
                            UPLog.m15197e("Pop", "callback fail", th.getMessage());
                            return;
                        }
                    }
                    if (C3573as.this.m15345a()) {
                        C3573as.this.m15344a(r2);
                    }
                    WindowManager m15343a = C3573as.m15343a((Context) r2);
                    C3574at c3574at = r3.f15965b;
                    if (C3565ak.m15312a().mo15323c().f15955g) {
                        C3573as c3573as2 = C3573as.this;
                        C3571aq c3571aq2 = r3;
                        ViewOnTouchListenerC3576av viewOnTouchListenerC3576av = null;
                        if (c3571aq2 != null && (onClickListener = c3571aq2.f15966c) != null) {
                            viewOnTouchListenerC3576av = new ViewOnTouchListenerC3576av(c3571aq2.f15965b, new ViewOnTouchListenerC3576av.a() { // from class: com.umeng.message.proguard.as.4

                                /* renamed from: a */
                                final /* synthetic */ View.OnClickListener f15985a;

                                AnonymousClass4(View.OnClickListener onClickListener2) {
                                    r2 = onClickListener2;
                                }

                                @Override // com.umeng.message.proguard.ViewOnTouchListenerC3576av.a
                                /* renamed from: a */
                                public final void mo15346a(View view) {
                                    r2.onClick(view);
                                }
                            });
                        }
                        r3.f15965b.setOnTouchListener(viewOnTouchListenerC3576av);
                    }
                    Activity activity2 = r2;
                    int i10 = r3.f15967d;
                    Point point = new Point();
                    C3573as.m15343a((Context) activity2).getDefaultDisplay().getRealSize(point);
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(Math.min(point.x, point.y) - C3597bo.m15440a(32.0f), i10, 1003, 327968, -3);
                    Rect rect = new Rect();
                    activity2.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                    layoutParams.y = Math.min(rect.top, C3597bo.m15440a(56.0f)) + C3597bo.m15440a(4.0f);
                    layoutParams.dimAmount = 0.3f;
                    layoutParams.gravity = 49;
                    layoutParams.windowAnimations = 0;
                    m15343a.addView(c3574at, layoutParams);
                    C3573as c3573as3 = C3573as.this;
                    c3573as3.f15975a = r3;
                    try {
                        c3574at.setAlpha(0.0f);
                        c3574at.measure(-2, -2);
                        c3574at.animate().translationX(0.0f).translationY(c3574at.getMeasuredHeight() * (-1)).setDuration(1L).setListener(new AnimatorListenerAdapter() { // from class: com.umeng.message.proguard.as.2

                            /* renamed from: a */
                            final /* synthetic */ View f15980a;

                            AnonymousClass2(View c3574at2) {
                                r2 = c3574at2;
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                super.onAnimationEnd(animator);
                                r2.animate().translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(500L).setListener(null);
                            }
                        });
                        try {
                            r4.mo15324a(r3.m15342b(), true);
                        } catch (Throwable th2) {
                            UPLog.m15197e("Pop", "callback fail", th2.getMessage());
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z10 = true;
                        try {
                            UPLog.m15197e("Pop", "show fail", th.getMessage());
                            try {
                                r4.mo15324a(r3.m15342b(), z10);
                            } catch (Throwable th4) {
                                UPLog.m15197e("Pop", "callback fail", th4.getMessage());
                            }
                        } catch (Throwable th5) {
                            try {
                                r4.mo15324a(r3.m15342b(), z10);
                            } catch (Throwable th6) {
                                UPLog.m15197e("Pop", "callback fail", th6.getMessage());
                            }
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    z10 = false;
                }
            }
        });
        f15960c = C3581b.m15371a(new Runnable() { // from class: com.umeng.message.proguard.ao.1
            @Override // java.lang.Runnable
            public final void run() {
                Activity activity2;
                WeakReference weakReference = C3569ao.f15959b;
                if (weakReference == null || (activity2 = (Activity) weakReference.get()) == null) {
                    return;
                }
                C3569ao.m15337b();
                C3569ao.m15334a(activity2);
            }
        }, C3565ak.m15312a().mo15323c().f15949a, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public static void m15334a(Activity activity) {
        try {
            m15338c();
            f15958a.m15344a(activity);
        } catch (Throwable unused) {
        }
        f15959b = null;
    }

    /* renamed from: a */
    public static void m15336a(String str) {
        Activity activity;
        WeakReference<Activity> weakReference = f15959b;
        if (weakReference == null || (activity = weakReference.get()) == null || activity.isFinishing()) {
            return;
        }
        C3571aq c3571aq = f15958a.f15975a;
        boolean z10 = false;
        if (c3571aq != null && TextUtils.equals(str, c3571aq.m15341a())) {
            z10 = c3571aq.f15965b.isShown();
        }
        if (z10) {
            m15334a(activity);
        }
    }
}
