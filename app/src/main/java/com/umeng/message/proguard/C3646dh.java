package com.umeng.message.proguard;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import com.umeng.analytics.pro.C3389k;
import com.umeng.message.proguard.AbstractC3627cq;
import com.umeng.message.proguard.C3674eh;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.umeng.message.proguard.dh */
/* loaded from: classes3.dex */
public final class C3646dh {

    /* renamed from: a */
    private static long f16318a;

    /* renamed from: b */
    private static WeakReference<Activity> f16319b;

    /* renamed from: c */
    private static WeakReference<AbstractC3639da> f16320c;

    /* renamed from: d */
    private static final Callable<Void> f16321d = new Callable<Void>() { // from class: com.umeng.message.proguard.dh.1
        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            try {
                C3646dh.m15651b(2051);
                C3612cb.m15501c(new Runnable() { // from class: com.umeng.message.proguard.dh.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC3639da abstractC3639da;
                        C3616cf c3616cf;
                        AbstractC3639da abstractC3639da2;
                        C3616cf c3616cf2;
                        AbstractC3639da abstractC3639da3;
                        C3616cf c3616cf3;
                        AbstractC3639da abstractC3639da4;
                        C3616cf c3616cf4;
                        try {
                            WeakReference weakReference = C3646dh.f16319b;
                            if (weakReference == null) {
                                C3615ce.m15509a("Banner", "floating banner timeout!");
                                WeakReference weakReference2 = C3646dh.f16320c;
                                if (weakReference2 != null && (abstractC3639da4 = (AbstractC3639da) weakReference2.get()) != null && (c3616cf4 = abstractC3639da4.f16287a) != null) {
                                    c3616cf4.mo15458b();
                                    return;
                                }
                                return;
                            }
                            Activity activity = (Activity) weakReference.get();
                            if (activity != null && !activity.isFinishing()) {
                                C3646dh.f16322e.m15664a(activity);
                                C3615ce.m15509a("Banner", "floating banner timeout!");
                                WeakReference weakReference3 = C3646dh.f16320c;
                                if (weakReference3 != null && (abstractC3639da3 = (AbstractC3639da) weakReference3.get()) != null && (c3616cf3 = abstractC3639da3.f16287a) != null) {
                                    c3616cf3.mo15458b();
                                    return;
                                }
                                return;
                            }
                            C3615ce.m15509a("Banner", "floating banner timeout!");
                            WeakReference weakReference4 = C3646dh.f16320c;
                            if (weakReference4 != null && (abstractC3639da2 = (AbstractC3639da) weakReference4.get()) != null && (c3616cf2 = abstractC3639da2.f16287a) != null) {
                                c3616cf2.mo15458b();
                            }
                        } catch (Throwable th) {
                            C3615ce.m15509a("Banner", "floating banner timeout!");
                            WeakReference weakReference5 = C3646dh.f16320c;
                            if (weakReference5 != null && (abstractC3639da = (AbstractC3639da) weakReference5.get()) != null && (c3616cf = abstractC3639da.f16287a) != null) {
                                c3616cf.mo15458b();
                            }
                            throw th;
                        }
                    }
                });
                return null;
            } catch (Throwable th) {
                C3615ce.m15512d("Banner", "floating banner timeout error:", th.getMessage());
                return null;
            }
        }
    };

    /* renamed from: e */
    private static final C3647di f16322e = new C3647di();

    /* renamed from: f */
    private static volatile Future<Void> f16323f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.umeng.message.proguard.dh$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass2 extends C3674eh.a {

        /* renamed from: a */
        final /* synthetic */ long f16325a;

        /* renamed from: b */
        final /* synthetic */ C3650dl f16326b;

        /* renamed from: c */
        final /* synthetic */ C3621ck f16327c;

        /* renamed from: d */
        final /* synthetic */ AbstractC3639da f16328d;

        /* renamed from: e */
        final /* synthetic */ C3648dj f16329e;

        AnonymousClass2(long j10, C3650dl c3650dl, C3621ck c3621ck, AbstractC3639da abstractC3639da, C3648dj c3648dj) {
            this.f16325a = j10;
            this.f16326b = c3650dl;
            this.f16327c = c3621ck;
            this.f16328d = abstractC3639da;
            this.f16329e = c3648dj;
        }

        @Override // com.umeng.message.proguard.C3674eh.a
        /* renamed from: a */
        public final void mo15659a() {
            C3646dh.m15657f();
            long m15733e = this.f16325a - m15733e();
            if (m15733e < 0) {
                m15733e = 0;
            }
            Future unused = C3646dh.f16323f = C3612cb.m15497a(C3646dh.f16321d, m15733e, TimeUnit.MILLISECONDS);
        }

        @Override // com.umeng.message.proguard.C3674eh.a
        /* renamed from: b */
        public final void mo15660b() {
            C3646dh.m15657f();
        }

        @Override // com.umeng.message.proguard.C3674eh.a
        /* renamed from: c */
        public final void mo15661c() {
            this.f16326b.f16351c.post(new Runnable() { // from class: com.umeng.message.proguard.dh.2.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        C3628cr.m15569a().mo15560a(AnonymousClass2.this.f16327c, new AbstractC3627cq.a() { // from class: com.umeng.message.proguard.dh.2.1.1
                            @Override // com.umeng.message.proguard.AbstractC3627cq.a
                            /* renamed from: a */
                            public final void mo15567a() {
                                C3616cf c3616cf = AnonymousClass2.this.f16328d.f16287a;
                                if (c3616cf != null) {
                                    c3616cf.mo15455a();
                                }
                            }

                            @Override // com.umeng.message.proguard.AbstractC3627cq.a
                            /* renamed from: a */
                            public final void mo15568a(String str) {
                                C3616cf c3616cf = AnonymousClass2.this.f16328d.f16287a;
                                if (c3616cf != null) {
                                    c3616cf.mo15456a(2010, str);
                                }
                            }
                        });
                        if (!AnonymousClass2.this.f16327c.f16166b.optBoolean("expose_verify", false)) {
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            C3672ef c3672ef = anonymousClass2.f16326b.f16351c;
                            anonymousClass2.f16327c.f16171g = c3672ef.getWidth();
                            AnonymousClass2.this.f16327c.f16172h = c3672ef.getHeight();
                            List<Integer> m15700a = C3661dw.m15700a(c3672ef);
                            if (!m15700a.isEmpty()) {
                                Iterator<Integer> it = m15700a.iterator();
                                while (it.hasNext()) {
                                    C3628cr.m15569a().mo15566c(AnonymousClass2.this.f16327c, it.next().intValue());
                                }
                            }
                            AnonymousClass2.this.f16327c.f16166b.put("expose_verify", true);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }

        @Override // com.umeng.message.proguard.C3674eh.a
        /* renamed from: d */
        public final void mo15662d() {
            C3608bz.m15464a().m15473b(this.f16329e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static void m15657f() {
        Future<Void> future = f16323f;
        if (future != null && !future.isDone() && !future.isCancelled()) {
            future.cancel(false);
        }
        f16323f = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m15651b(int i10) {
        WeakReference<C3650dl> weakReference = f16322e.f16343a;
        C3650dl c3650dl = weakReference == null ? null : weakReference.get();
        if (c3650dl != null) {
            C3674eh.a onStatusListener = c3650dl.f16351c.getOnStatusListener();
            C3621ck c3621ck = c3650dl.f16349a.f16346a;
            if (onStatusListener == null || c3621ck == null) {
                return;
            }
            try {
                c3621ck.f16166b.put("exposed_duration", onStatusListener.m15733e());
                C3628cr.m15569a().mo15558a(c3621ck, i10);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m15649a(Activity activity) {
        Activity activity2;
        WeakReference<Activity> weakReference = f16319b;
        if (weakReference == null || (activity2 = weakReference.get()) == null || activity2 != activity) {
            return false;
        }
        return f16322e.m15665a();
    }

    /* renamed from: a */
    public static void m15648a(C3649dk c3649dk, long j10, AbstractC3639da abstractC3639da) {
        if (!C3608bz.m15464a().f16112a) {
            C3628cr.m15569a().mo15564b(c3649dk.f16346a, 2003);
            return;
        }
        Activity m15472b = C3608bz.m15464a().m15472b();
        if (m15472b != null && !m15472b.isFinishing()) {
            m15647a(m15472b, c3649dk, j10, abstractC3639da);
        } else {
            C3628cr.m15569a().mo15564b(c3649dk.f16346a, 2005);
        }
    }

    /* renamed from: b */
    public static void m15652b(Activity activity) {
        try {
            C3647di c3647di = f16322e;
            if (c3647di.m15665a()) {
                m15651b(2053);
                c3647di.m15664a(activity);
            }
            m15657f();
        } catch (Throwable th) {
            C3615ce.m15509a("Banner", "floating banner dismiss err:" + th.getMessage());
        }
        f16319b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m15647a(final Activity activity, final C3649dk c3649dk, final long j10, final AbstractC3639da abstractC3639da) {
        if (C3658dt.m15682a().m15687a((Class<? extends Activity>) activity.getClass())) {
            C3628cr.m15569a().mo15564b(c3649dk.f16346a, 2006);
            C3615ce.m15509a("Banner", "current activity not allow show ad:", activity.getClass().getName());
        } else {
            activity.getWindow().getDecorView().post(new Runnable() { // from class: com.umeng.message.proguard.dh.6
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        Activity m15472b = C3608bz.m15464a().m15472b();
                        if (m15472b != null && activity != m15472b) {
                            C3615ce.m15510b("Banner", "activity not top skip.");
                            C3628cr.m15569a().mo15564b(c3649dk.f16346a, 2004);
                        } else {
                            C3646dh.m15653b(activity, c3649dk, j10, abstractC3639da);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m15653b(Activity activity, C3649dk c3649dk, long j10, final AbstractC3639da abstractC3639da) {
        if (activity == null || c3649dk == null || abstractC3639da == null) {
            return;
        }
        final C3621ck c3621ck = c3649dk.f16346a;
        if (C3670ed.m15730a(activity)) {
            C3615ce.m15509a("Banner", "floating banner: activity window not match skipped.");
            C3628cr.m15569a().mo15564b(c3621ck, 2010);
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - f16318a;
        if (elapsedRealtime < 1000) {
            C3615ce.m15510b("Banner", "skipped floating banner show interval:", Long.valueOf(elapsedRealtime));
            C3628cr.m15569a().mo15564b(c3621ck, 2007);
            return;
        }
        f16318a = SystemClock.elapsedRealtime();
        m15657f();
        C3647di c3647di = f16322e;
        if (c3647di.m15665a()) {
            m15651b(2052);
            c3647di.m15664a(activity);
        }
        C3650dl c3650dl = new C3650dl(activity, c3649dk);
        f16320c = new WeakReference<>(abstractC3639da);
        f16319b = new WeakReference<>(activity);
        C3648dj c3648dj = new C3648dj();
        final AnonymousClass2 anonymousClass2 = new AnonymousClass2(j10, c3650dl, c3621ck, abstractC3639da, c3648dj);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.umeng.message.proguard.dh.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    C3615ce.m15509a("Banner", "floating banner closed!");
                    Activity activity2 = (Activity) view.getContext();
                    if (activity2 != null) {
                        C3646dh.m15657f();
                        C3646dh.m15651b(C3389k.f14708b);
                        C3646dh.f16322e.m15664a(activity2);
                        C3616cf c3616cf = AbstractC3639da.this.f16287a;
                        if (c3616cf != null) {
                            c3616cf.mo15458b();
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
        c3650dl.f16351c.setDismissListener(onClickListener);
        c3650dl.f16350b.setOnClickListener(onClickListener);
        c3650dl.f16351c.setOnClickListener(new View.OnClickListener() { // from class: com.umeng.message.proguard.dh.4
            @Override // android.view.View.OnClickListener
            public final void onClick(final View view) {
                try {
                    C3615ce.m15509a("Banner", "floating banner clicked.");
                    Activity activity2 = (Activity) view.getContext();
                    if (activity2 != null) {
                        C3646dh.m15657f();
                        C3646dh.f16322e.m15664a(activity2);
                        C3621ck.this.f16166b.put("clicked", true);
                        C3621ck.this.f16166b.put("exposed_duration", anonymousClass2.m15733e());
                        C3621ck c3621ck2 = C3621ck.this;
                        C3674eh.a aVar = anonymousClass2;
                        c3621ck2.f16177m = aVar.f16465g;
                        c3621ck2.f16178n = aVar.f16467i;
                        c3621ck2.f16179o = aVar.f16466h;
                        c3621ck2.f16180p = aVar.f16468j;
                        c3621ck2.f16181q = aVar.f16469k;
                        c3621ck2.f16182r = aVar.f16470l;
                        c3621ck2.f16183s = aVar.f16471m;
                        c3621ck2.f16184t = aVar.f16472n;
                        C3663dy.m15708a(C3643de.m15638a(), C3621ck.this, new AbstractC3627cq.a() { // from class: com.umeng.message.proguard.dh.4.1
                            @Override // com.umeng.message.proguard.AbstractC3627cq.a
                            /* renamed from: a */
                            public final void mo15567a() {
                                C3616cf c3616cf = abstractC3639da.f16287a;
                                if (c3616cf != null) {
                                    c3616cf.mo15457a(view);
                                }
                            }

                            @Override // com.umeng.message.proguard.AbstractC3627cq.a
                            /* renamed from: a */
                            public final void mo15568a(String str) {
                                C3616cf c3616cf = abstractC3639da.f16287a;
                                if (c3616cf != null) {
                                    c3616cf.mo15456a(2020, str);
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
        c3650dl.f16351c.setOnStatusListener(anonymousClass2);
        c3650dl.f16352d = new View.OnClickListener() { // from class: com.umeng.message.proguard.dh.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    C3615ce.m15509a("Banner", "floating banner closed.");
                    Activity activity2 = (Activity) view.getContext();
                    if (activity2 != null) {
                        C3646dh.m15657f();
                        C3646dh.m15651b(2054);
                        C3646dh.f16322e.m15664a(activity2);
                        C3616cf c3616cf = AbstractC3639da.this.f16287a;
                        if (c3616cf != null) {
                            c3616cf.mo15458b();
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
        if (c3647di.m15666a(c3650dl, activity)) {
            C3608bz.m15464a().m15471a(c3648dj);
            C3672ef c3672ef = c3650dl.f16351c;
            c3672ef.setAlpha(0.0f);
            c3672ef.measure(-2, -2);
            c3672ef.animate().translationX(0.0f).translationY(c3672ef.getMeasuredHeight() * (-1)).setDuration(1L).setListener(new AnimatorListenerAdapter() { // from class: com.umeng.message.proguard.dv.1

                /* renamed from: a */
                final /* synthetic */ View f16445a;

                public AnonymousClass1(View c3672ef2) {
                    r1 = c3672ef2;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    try {
                        r1.animate().translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration(500L).setListener(null);
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
