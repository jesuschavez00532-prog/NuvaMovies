package com.umeng.message.proguard;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import com.umeng.message.proguard.AbstractC3627cq;
import com.umeng.message.proguard.C3653do;
import com.umeng.message.proguard.C3674eh;
import com.umeng.message.proguard.InterfaceC3606bx;
import com.umeng.message.push.C3708R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.umeng.message.proguard.dn */
/* loaded from: classes3.dex */
public final class C3652dn extends AbstractC3641dc {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.umeng.message.proguard.dn$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass2 extends C3674eh.a {

        /* renamed from: a */
        final /* synthetic */ C3653do f16371a;

        /* renamed from: b */
        final /* synthetic */ C3621ck f16372b;

        /* renamed from: c */
        final /* synthetic */ AbstractC3639da f16373c;

        AnonymousClass2(C3653do c3653do, C3621ck c3621ck, AbstractC3639da abstractC3639da) {
            this.f16371a = c3653do;
            this.f16372b = c3621ck;
            this.f16373c = abstractC3639da;
        }

        @Override // com.umeng.message.proguard.C3674eh.a
        /* renamed from: c */
        public final void mo15661c() {
            C3673eg c3673eg = this.f16371a.f16385a;
            if (c3673eg != null) {
                c3673eg.post(new Runnable() { // from class: com.umeng.message.proguard.dn.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            C3628cr.m15569a().mo15560a(AnonymousClass2.this.f16372b, new AbstractC3627cq.a() { // from class: com.umeng.message.proguard.dn.2.1.1
                                @Override // com.umeng.message.proguard.AbstractC3627cq.a
                                /* renamed from: a */
                                public final void mo15567a() {
                                    C3616cf c3616cf = AnonymousClass2.this.f16373c.f16287a;
                                    if (c3616cf != null) {
                                        c3616cf.mo15455a();
                                    }
                                }

                                @Override // com.umeng.message.proguard.AbstractC3627cq.a
                                /* renamed from: a */
                                public final void mo15568a(String str) {
                                    C3616cf c3616cf = AnonymousClass2.this.f16373c.f16287a;
                                    if (c3616cf != null) {
                                        c3616cf.mo15456a(2010, str);
                                    }
                                }
                            });
                            if (!AnonymousClass2.this.f16372b.f16166b.optBoolean("expose_verify", false)) {
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                C3673eg c3673eg2 = anonymousClass2.f16371a.f16385a;
                                anonymousClass2.f16372b.f16171g = c3673eg2.getWidth();
                                AnonymousClass2.this.f16372b.f16172h = c3673eg2.getHeight();
                                List<Integer> m15700a = C3661dw.m15700a(c3673eg2);
                                if (!m15700a.isEmpty()) {
                                    Iterator<Integer> it = m15700a.iterator();
                                    while (it.hasNext()) {
                                        C3628cr.m15569a().mo15566c(AnonymousClass2.this.f16372b, it.next().intValue());
                                    }
                                }
                                AnonymousClass2.this.f16372b.f16166b.put("expose_verify", true);
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

    public C3652dn(C3636cz c3636cz) {
        super(c3636cz);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static /* synthetic */ void m15668a(C3652dn c3652dn, Activity activity, final C3621ck c3621ck, final Bitmap bitmap, final AbstractC3639da abstractC3639da) {
        if (activity.isFinishing()) {
            C3615ce.m15510b("FloatingIcon", "activity has finished skip.");
            C3628cr.m15569a().mo15564b(c3621ck, 2021);
            return;
        }
        if (C3670ed.m15730a(activity)) {
            C3615ce.m15509a("FloatingIcon", "activity window not match skipped.");
            C3628cr.m15569a().mo15564b(c3621ck, 2024);
            return;
        }
        if (C3658dt.m15682a().m15687a((Class<? extends Activity>) activity.getClass())) {
            C3628cr.m15569a().mo15564b(c3621ck, 2022);
            C3615ce.m15509a("FloatingIcon", "current activity not allow show ad:", activity.getClass().getName());
            return;
        }
        final C3653do c3653do = new C3653do();
        final AnonymousClass2 anonymousClass2 = new AnonymousClass2(c3653do, c3621ck, abstractC3639da);
        View findViewById = activity.findViewById(C3708R.id.umeng_fi_close);
        if (findViewById != null) {
            Object tag = findViewById.getTag();
            if (tag instanceof View.OnClickListener) {
                ((View.OnClickListener) tag).onClick(findViewById);
            }
        }
        if (bitmap != null && c3621ck != null) {
            if (c3653do.f16385a == null) {
                c3653do.f16385a = new C3673eg(C3643de.m15638a());
            }
            c3653do.f16385a.setAdImage(bitmap);
            c3653do.f16385a.setIconClickListener(new View.OnClickListener() { // from class: com.umeng.message.proguard.do.1
                public AnonymousClass1() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a aVar = C3653do.this.f16386b;
                    if (aVar != null) {
                        aVar.mo15670a(view);
                    }
                }
            });
            c3653do.f16385a.setCloseClickListener(new View.OnClickListener() { // from class: com.umeng.message.proguard.do.2
                public AnonymousClass2() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a aVar = C3653do.this.f16386b;
                    if (aVar != null) {
                        aVar.mo15669a();
                    }
                }
            });
            c3653do.f16385a.setAdMarkVisibility(c3621ck.m15526f());
            c3653do.m15672a(activity);
            if (c3653do.f16387c == null) {
                c3653do.f16387c = new C3654dp(c3653do);
                C3608bz.m15464a().m15471a(c3653do.f16387c);
            }
        }
        C3673eg c3673eg = c3653do.f16385a;
        if (c3673eg != null) {
            c3673eg.setOnStatusListener(anonymousClass2);
        }
        c3653do.f16386b = new C3653do.a() { // from class: com.umeng.message.proguard.dn.3
            @Override // com.umeng.message.proguard.C3653do.a
            /* renamed from: a */
            public final void mo15669a() {
                try {
                    c3653do.m15674b();
                    c3621ck.f16166b.put("exposed_duration", anonymousClass2.m15733e());
                    C3628cr.m15569a().mo15558a(c3621ck, 2220);
                    C3616cf c3616cf = abstractC3639da.f16287a;
                    if (c3616cf != null) {
                        c3616cf.mo15458b();
                    }
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    bitmap.recycle();
                } catch (Throwable unused) {
                }
            }

            @Override // com.umeng.message.proguard.C3653do.a
            /* renamed from: a */
            public final void mo15670a(final View view) {
                try {
                    c3621ck.f16166b.put("clicked", true);
                    c3621ck.f16166b.put("exposed_duration", anonymousClass2.m15733e());
                    C3621ck c3621ck2 = c3621ck;
                    C3674eh.a aVar = anonymousClass2;
                    c3621ck2.f16177m = aVar.f16465g;
                    c3621ck2.f16178n = aVar.f16467i;
                    c3621ck2.f16179o = aVar.f16466h;
                    c3621ck2.f16180p = aVar.f16468j;
                    c3621ck2.f16181q = aVar.f16469k;
                    c3621ck2.f16182r = aVar.f16470l;
                    c3621ck2.f16183s = aVar.f16471m;
                    c3621ck2.f16184t = aVar.f16472n;
                    C3663dy.m15708a(C3643de.m15638a(), c3621ck, new AbstractC3627cq.a() { // from class: com.umeng.message.proguard.dn.3.1
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
                    c3653do.m15674b();
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    bitmap.recycle();
                } catch (Throwable unused) {
                }
            }
        };
    }

    @Override // com.umeng.message.proguard.AbstractC3641dc
    /* renamed from: b */
    public final C3621ck mo15636b() {
        C3621ck mo15513a = C3619ci.m15514a(this.f16290b).mo15513a(this.f16289a);
        if (mo15513a != null) {
            if (mo15513a.f16168d == 0) {
                return mo15513a;
            }
            throw new C3614cd(mo15513a.f16167c);
        }
        C3615ce.m15510b("FloatingIcon", "type:", this.f16290b, " request ad failed.");
        throw new C3614cd("request ad failed. code:2000");
    }

    @Override // com.umeng.message.proguard.AbstractC3641dc
    /* renamed from: b */
    public final InterfaceC3606bx.a mo15635b(final C3621ck c3621ck) {
        final Bitmap m15502a = C3613cc.m15502a(C3643de.m15638a(), c3621ck.m15522b());
        if (m15502a != null) {
            final AtomicReference atomicReference = new AtomicReference();
            AbstractC3639da abstractC3639da = new AbstractC3639da() { // from class: com.umeng.message.proguard.dn.1

                /* renamed from: f */
                private boolean f16366f = false;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.umeng.message.proguard.AbstractC3639da
                /* renamed from: a */
                public final void mo15630a(final Activity activity) {
                    final Activity activity2;
                    if (this.f16366f) {
                        C3615ce.m15512d("FloatingIcon", "already called show.");
                        C3616cf c3616cf = this.f16287a;
                        if (c3616cf != null) {
                            c3616cf.mo15456a(2010, "already called show.");
                            return;
                        }
                        return;
                    }
                    try {
                        if (C3652dn.this.f16289a.f16278c) {
                            if (!C3608bz.m15464a().f16112a) {
                                C3628cr.m15569a().mo15564b(c3621ck, 2020);
                                return;
                            }
                            activity = C3608bz.m15464a().m15472b();
                            if (activity != null && !activity.isFinishing()) {
                                if (C3658dt.m15682a().m15687a((Class<? extends Activity>) activity.getClass())) {
                                    C3628cr.m15569a().mo15564b(c3621ck, 2022);
                                    C3615ce.m15509a("FloatingIcon", "current activity not allow show ad:", activity.getClass().getName());
                                    return;
                                }
                            }
                            C3628cr.m15569a().mo15564b(c3621ck, 2021);
                            return;
                        }
                        if (C3652dn.this.m15634a(c3621ck)) {
                            try {
                                c3621ck.f16166b.put("exposed_timeout", true);
                            } catch (Exception unused) {
                            }
                            C3628cr.m15569a().mo15564b(c3621ck, 2023);
                            String str = "expose invalid timeout config:" + c3621ck.m15528h();
                            C3615ce.m15512d("FloatingIcon", str);
                            C3616cf c3616cf2 = this.f16287a;
                            if (c3616cf2 != null) {
                                c3616cf2.mo15456a(2010, str);
                            }
                            return;
                        }
                        WeakReference<Activity> weakReference = C3652dn.this.f16292d;
                        if (weakReference != null) {
                            activity2 = weakReference.get();
                        } else {
                            activity2 = null;
                        }
                        if (activity != null) {
                            if (activity.isFinishing()) {
                                C3615ce.m15510b("FloatingIcon", "activity has finished skip.");
                                C3628cr.m15569a().mo15564b(c3621ck, 2021);
                                return;
                            } else {
                                if (activity != activity2) {
                                    C3615ce.m15509a("FloatingIcon", "current activity not match request activity.");
                                }
                                activity.getWindow().getDecorView().post(new Runnable() { // from class: com.umeng.message.proguard.dn.1.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        try {
                                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                            C3652dn.m15668a(C3652dn.this, activity, c3621ck, m15502a, (AbstractC3639da) atomicReference.get());
                                        } catch (Throwable th) {
                                            C3615ce.m15509a("FloatingIcon", "show float action ad failed:", th.getMessage());
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        if (activity2 != null && !activity2.isFinishing()) {
                            activity2.getWindow().getDecorView().post(new Runnable() { // from class: com.umeng.message.proguard.dn.1.2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    try {
                                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                        C3652dn.m15668a(C3652dn.this, activity2, c3621ck, m15502a, (AbstractC3639da) atomicReference.get());
                                    } catch (Throwable th) {
                                        C3615ce.m15509a("FloatingIcon", "show float action ad failed:", th.getMessage());
                                    }
                                }
                            });
                            return;
                        }
                        C3615ce.m15510b("FloatingIcon", "activity has finished skip.");
                        C3628cr.m15569a().mo15564b(c3621ck, 2021);
                    } catch (Throwable th) {
                        try {
                            C3615ce.m15509a("FloatingIcon", "ad show error:", th.getMessage());
                        } finally {
                            this.f16366f = true;
                        }
                    }
                }
            };
            atomicReference.set(abstractC3639da);
            return abstractC3639da;
        }
        C3615ce.m15510b("FloatingIcon", "material download failed. sid:" + c3621ck.m15523c());
        C3628cr.m15569a().mo15564b(c3621ck, 2001);
        throw new C3614cd("material download failed.");
    }
}
