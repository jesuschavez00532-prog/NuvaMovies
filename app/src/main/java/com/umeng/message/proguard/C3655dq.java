package com.umeng.message.proguard;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.umeng.message.proguard.AbstractC3627cq;
import com.umeng.message.proguard.C3630ct;
import com.umeng.message.proguard.C3674eh;
import com.umeng.message.proguard.InterfaceC3606bx;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.umeng.message.proguard.dq */
/* loaded from: classes3.dex */
public final class C3655dq extends AbstractC3641dc {

    /* renamed from: h */
    static WeakReference<DialogC3656dr> f16393h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.umeng.message.proguard.dq$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass3 extends C3674eh.a {

        /* renamed from: a */
        final /* synthetic */ DialogC3656dr f16406a;

        /* renamed from: b */
        final /* synthetic */ C3621ck f16407b;

        /* renamed from: c */
        final /* synthetic */ AbstractC3639da f16408c;

        AnonymousClass3(DialogC3656dr dialogC3656dr, C3621ck c3621ck, AbstractC3639da abstractC3639da) {
            this.f16406a = dialogC3656dr;
            this.f16407b = c3621ck;
            this.f16408c = abstractC3639da;
        }

        @Override // com.umeng.message.proguard.C3674eh.a
        /* renamed from: a */
        public final void mo15676a(Configuration configuration) {
            int i10;
            DialogC3656dr dialogC3656dr = this.f16406a;
            int i11 = dialogC3656dr.f16432e;
            if (i11 != -1 && (i10 = configuration.orientation) != i11) {
                dialogC3656dr.f16432e = i10;
                try {
                    dialogC3656dr.f16430c.m15534b();
                    dialogC3656dr.f16431d.getLayoutParams().width = dialogC3656dr.f16430c.m15533a().getLayoutParams().width;
                    dialogC3656dr.f16431d.requestLayout();
                    dialogC3656dr.f16431d.invalidate();
                } catch (Throwable th) {
                    C3615ce.m15512d("Interstitial", "onConfigurationChanged:", th.getMessage());
                }
            }
        }

        @Override // com.umeng.message.proguard.C3674eh.a
        /* renamed from: c */
        public final void mo15661c() {
            C3674eh c3674eh = this.f16406a.f16428a;
            if (c3674eh != null) {
                c3674eh.post(new Runnable() { // from class: com.umeng.message.proguard.dq.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            C3628cr.m15569a().mo15560a(AnonymousClass3.this.f16407b, new AbstractC3627cq.a() { // from class: com.umeng.message.proguard.dq.3.1.1
                                @Override // com.umeng.message.proguard.AbstractC3627cq.a
                                /* renamed from: a */
                                public final void mo15567a() {
                                    C3616cf c3616cf = AnonymousClass3.this.f16408c.f16287a;
                                    if (c3616cf != null) {
                                        c3616cf.mo15455a();
                                    }
                                }

                                @Override // com.umeng.message.proguard.AbstractC3627cq.a
                                /* renamed from: a */
                                public final void mo15568a(String str) {
                                    C3616cf c3616cf = AnonymousClass3.this.f16408c.f16287a;
                                    if (c3616cf != null) {
                                        c3616cf.mo15456a(2010, str);
                                    }
                                }
                            });
                            if (!AnonymousClass3.this.f16407b.f16166b.optBoolean("expose_verify", false)) {
                                AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                C3674eh c3674eh2 = anonymousClass3.f16406a.f16428a;
                                anonymousClass3.f16407b.f16171g = c3674eh2.getWidth();
                                AnonymousClass3.this.f16407b.f16172h = c3674eh2.getHeight();
                                List<Integer> m15700a = C3661dw.m15700a(c3674eh2);
                                if (!m15700a.isEmpty()) {
                                    Iterator<Integer> it = m15700a.iterator();
                                    while (it.hasNext()) {
                                        C3628cr.m15569a().mo15566c(AnonymousClass3.this.f16407b, it.next().intValue());
                                    }
                                }
                                AnonymousClass3.this.f16407b.f16166b.put("expose_verify", true);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                });
            }
        }

        @Override // com.umeng.message.proguard.C3674eh.a
        /* renamed from: d */
        public final void mo15662d() {
        }
    }

    public C3655dq(C3636cz c3636cz) {
        super(c3636cz);
    }

    /* renamed from: a */
    static /* synthetic */ void m15675a(C3655dq c3655dq, Activity activity, final C3621ck c3621ck, final AbstractC3639da abstractC3639da, final C3622cl c3622cl) {
        if (activity.isFinishing()) {
            C3615ce.m15510b("Interstitial", "activity has finished skip.");
            C3628cr.m15569a().mo15564b(c3621ck, 2013);
            return;
        }
        if (C3670ed.m15730a(activity)) {
            C3615ce.m15510b("Interstitial", "activity window not match skipped.");
            C3628cr.m15569a().mo15564b(c3621ck, 2011);
            return;
        }
        final DialogC3656dr dialogC3656dr = new DialogC3656dr(activity, c3622cl);
        final AnonymousClass3 anonymousClass3 = new AnonymousClass3(dialogC3656dr, c3621ck, abstractC3639da);
        C3674eh c3674eh = dialogC3656dr.f16428a;
        if (c3674eh != null) {
            c3674eh.setOnStatusListener(anonymousClass3);
        }
        dialogC3656dr.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.umeng.message.proguard.dq.4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                abstractC3639da.mo15631b();
                AbstractC3624cn abstractC3624cn = c3622cl.f16186b;
                if (abstractC3624cn != null) {
                    abstractC3624cn.mo15539d();
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.umeng.message.proguard.dq.5
            @Override // android.view.View.OnClickListener
            public final void onClick(final View view) {
                try {
                    c3621ck.f16166b.put("clicked", true);
                    c3621ck.f16166b.put("exposed_duration", anonymousClass3.m15733e());
                    AbstractC3624cn abstractC3624cn = c3622cl.f16186b;
                    if (abstractC3624cn != null) {
                        abstractC3624cn.mo15540e();
                    }
                    AbstractC3624cn abstractC3624cn2 = c3622cl.f16186b;
                    if (abstractC3624cn2 != null) {
                        abstractC3624cn2.mo15541f();
                    }
                    C3621ck c3621ck2 = c3621ck;
                    C3674eh.a aVar = anonymousClass3;
                    c3621ck2.f16177m = aVar.f16465g;
                    c3621ck2.f16178n = aVar.f16467i;
                    c3621ck2.f16179o = aVar.f16466h;
                    c3621ck2.f16180p = aVar.f16468j;
                    c3621ck2.f16181q = aVar.f16469k;
                    c3621ck2.f16182r = aVar.f16470l;
                    c3621ck2.f16183s = aVar.f16471m;
                    c3621ck2.f16184t = aVar.f16472n;
                    C3663dy.m15708a(C3643de.m15638a(), c3621ck, new AbstractC3627cq.a() { // from class: com.umeng.message.proguard.dq.5.1
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
                    C3655dq.f16393h = null;
                    dialogC3656dr.dismiss();
                } catch (Throwable unused) {
                }
            }
        };
        LinearLayout linearLayout = dialogC3656dr.f16431d;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(onClickListener);
        }
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: com.umeng.message.proguard.dq.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    C3655dq.f16393h = null;
                    dialogC3656dr.dismiss();
                    c3621ck.f16166b.put("exposed_duration", anonymousClass3.m15733e());
                    C3628cr.m15569a().mo15558a(c3621ck, 2210);
                    C3616cf c3616cf = abstractC3639da.f16287a;
                    if (c3616cf != null) {
                        c3616cf.mo15458b();
                    }
                } catch (Throwable unused) {
                }
            }
        };
        ImageView imageView = dialogC3656dr.f16429b;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener2);
        }
        dialogC3656dr.f16433f = onClickListener2;
        if (f16393h != null) {
            C3615ce.m15510b("Interstitial", "sDialogRef not null");
            DialogC3656dr dialogC3656dr2 = f16393h.get();
            if (dialogC3656dr2 != null && dialogC3656dr2.isShowing()) {
                C3615ce.m15510b("Interstitial", "dismiss last");
                View.OnClickListener onClickListener3 = dialogC3656dr2.f16433f;
                if (onClickListener3 != null) {
                    onClickListener3.onClick(null);
                }
            }
        }
        dialogC3656dr.show();
        f16393h = new WeakReference<>(dialogC3656dr);
    }

    @Override // com.umeng.message.proguard.AbstractC3641dc
    /* renamed from: b */
    public final C3621ck mo15636b() {
        C3621ck mo15513a = C3619ci.m15514a(this.f16290b).mo15513a(this.f16289a);
        if (mo15513a != null) {
            if (mo15513a.f16168d == 0) {
                if (!mo15513a.f16169e || C3601bs.m15446a(mo15513a.m15521a()) == C3601bs.f16097f) {
                    return mo15513a;
                }
                throw new C3614cd("interstitial style error:" + mo15513a.m15521a());
            }
            throw new C3614cd(mo15513a.f16167c);
        }
        C3615ce.m15510b("Interstitial", "type:", this.f16290b, " request failed.");
        throw new C3614cd("request failed. code:2000");
    }

    @Override // com.umeng.message.proguard.AbstractC3641dc
    /* renamed from: b */
    public final InterfaceC3606bx.a mo15635b(final C3621ck c3621ck) {
        Bitmap m15502a;
        Context m15638a = C3643de.m15638a();
        if (c3621ck.f16169e) {
            String m15532l = c3621ck.m15532l();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            C3630ct.m15572a(true, m15532l, new C3630ct.a() { // from class: com.umeng.message.proguard.dq.1
                @Override // com.umeng.message.proguard.C3630ct.a
                /* renamed from: a */
                public final void mo15545a(String str) {
                }

                @Override // com.umeng.message.proguard.C3630ct.a
                /* renamed from: a */
                public final void mo15544a() {
                    atomicBoolean.set(false);
                }
            });
            if (!atomicBoolean.get()) {
                C3615ce.m15510b("Interstitial", "video download failed. sid:" + c3621ck.m15523c());
                C3628cr.m15569a().mo15564b(c3621ck, 2001);
                throw new C3614cd("video download failed.");
            }
            m15502a = null;
        } else {
            m15502a = C3613cc.m15502a(m15638a, c3621ck.m15522b());
            if (m15502a == null) {
                C3615ce.m15510b("Interstitial", "image download failed. sid:" + c3621ck.m15523c());
                C3628cr.m15569a().mo15564b(c3621ck, 2001);
                throw new C3614cd("image download failed.");
            }
        }
        final C3622cl c3622cl = new C3622cl(c3621ck);
        if (c3621ck.f16169e) {
            c3622cl.f16186b = new C3625co(m15638a, c3622cl);
        } else {
            c3622cl.f16186b = new C3623cm(m15638a, c3622cl);
        }
        AbstractC3624cn abstractC3624cn = c3622cl.f16186b;
        if (abstractC3624cn != null) {
            abstractC3624cn.mo15536a(m15502a);
        }
        AbstractC3624cn abstractC3624cn2 = c3622cl.f16186b;
        if (abstractC3624cn2 != null) {
            abstractC3624cn2.mo15537b();
        }
        return new AbstractC3639da() { // from class: com.umeng.message.proguard.dq.2

            /* renamed from: e */
            private boolean f16399e = false;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.umeng.message.proguard.AbstractC3639da
            /* renamed from: a */
            public final void mo15630a(final Activity activity) {
                final Activity activity2;
                if (this.f16399e) {
                    C3615ce.m15512d("Interstitial", "already called show.");
                    C3616cf c3616cf = this.f16287a;
                    if (c3616cf != null) {
                        c3616cf.mo15456a(2010, "already called show.");
                        return;
                    }
                    return;
                }
                try {
                    if (C3655dq.this.f16289a.f16278c) {
                        if (!C3608bz.m15464a().f16112a) {
                            C3628cr.m15569a().mo15564b(c3621ck, 2014);
                            return;
                        }
                        activity = C3608bz.m15464a().m15472b();
                        if (activity != null && !activity.isFinishing()) {
                            if (C3658dt.m15682a().m15687a((Class<? extends Activity>) activity.getClass())) {
                                C3628cr.m15569a().mo15564b(c3621ck, 2015);
                                C3615ce.m15509a("Interstitial", "current activity not allow show ad:", activity.getClass().getName());
                                return;
                            }
                        }
                        C3628cr.m15569a().mo15564b(c3621ck, 2013);
                        return;
                    }
                    if (C3655dq.this.m15634a(c3621ck)) {
                        try {
                            c3621ck.f16166b.put("exposed_timeout", true);
                        } catch (Exception unused) {
                        }
                        C3628cr.m15569a().mo15564b(c3621ck, 2012);
                        String str = "expose invalid! timeout config:" + c3621ck.m15528h();
                        C3615ce.m15512d("Interstitial", str);
                        C3616cf c3616cf2 = this.f16287a;
                        if (c3616cf2 != null) {
                            c3616cf2.mo15456a(2010, str);
                        }
                        return;
                    }
                    WeakReference<Activity> weakReference = C3655dq.this.f16292d;
                    if (weakReference != null) {
                        activity2 = weakReference.get();
                    } else {
                        activity2 = null;
                    }
                    if (activity != null) {
                        if (activity.isFinishing()) {
                            C3615ce.m15510b("Interstitial", "activity has finished skip.");
                            C3628cr.m15569a().mo15564b(c3621ck, 2013);
                            return;
                        } else {
                            activity.getWindow().getDecorView().post(new Runnable() { // from class: com.umeng.message.proguard.dq.2.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    try {
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        C3655dq.m15675a(C3655dq.this, activity, c3621ck, this, c3622cl);
                                    } catch (Throwable th) {
                                        C3615ce.m15509a("Interstitial", "show interstitial dialog failed:", th.getMessage());
                                    }
                                }
                            });
                            return;
                        }
                    }
                    if (activity2 != null && !activity2.isFinishing()) {
                        activity2.getWindow().getDecorView().post(new Runnable() { // from class: com.umeng.message.proguard.dq.2.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    C3655dq.m15675a(C3655dq.this, activity2, c3621ck, this, c3622cl);
                                } catch (Throwable th) {
                                    C3615ce.m15509a("Interstitial", "show interstitial dialog failed:", th.getMessage());
                                }
                            }
                        });
                        return;
                    }
                    C3615ce.m15510b("Interstitial", "activity has finished skip.");
                    C3628cr.m15569a().mo15564b(c3621ck, 2013);
                } catch (Throwable th) {
                    try {
                        C3615ce.m15509a("Interstitial", "show error:", th.getMessage());
                    } finally {
                        this.f16399e = true;
                    }
                }
            }
        };
    }
}
