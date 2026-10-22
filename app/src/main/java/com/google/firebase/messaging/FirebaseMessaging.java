package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.messaging.C2705q0;
import com.google.firebase.messaging.C2715v0;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p127f5.AbstractC4245i;
import p127f5.AbstractC4250l;
import p127f5.InterfaceC4239f;
import p127f5.InterfaceC4243h;
import p219l4.AbstractC5391n;
import p294q3.InterfaceC6340g;
import p295q4.ThreadFactoryC6342a;
import p297q6.AbstractC6346a;
import p297q6.InterfaceC6347b;
import p297q6.InterfaceC6349d;
import p327s6.InterfaceC6694a;
import p337t5.AbstractC6910a;
import p337t5.C6913d;
import p338t6.InterfaceC6922b;
import p352u6.InterfaceC7048d;

/* loaded from: classes.dex */
public class FirebaseMessaging {

    /* renamed from: o */
    private static final long f10192o = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: p */
    private static C2715v0 f10193p;

    /* renamed from: q */
    static InterfaceC6340g f10194q;

    /* renamed from: r */
    static ScheduledExecutorService f10195r;

    /* renamed from: a */
    private final C6913d f10196a;

    /* renamed from: b */
    private final InterfaceC6694a f10197b;

    /* renamed from: c */
    private final InterfaceC7048d f10198c;

    /* renamed from: d */
    private final Context f10199d;

    /* renamed from: e */
    private final C2664a0 f10200e;

    /* renamed from: f */
    private final C2705q0 f10201f;

    /* renamed from: g */
    private final C2662a f10202g;

    /* renamed from: h */
    private final Executor f10203h;

    /* renamed from: i */
    private final Executor f10204i;

    /* renamed from: j */
    private final Executor f10205j;

    /* renamed from: k */
    private final AbstractC4245i f10206k;

    /* renamed from: l */
    private final C2679f0 f10207l;

    /* renamed from: m */
    private boolean f10208m;

    /* renamed from: n */
    private final Application.ActivityLifecycleCallbacks f10209n;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.firebase.messaging.FirebaseMessaging$a */
    /* loaded from: classes.dex */
    public class C2662a {

        /* renamed from: a */
        private final InterfaceC6349d f10210a;

        /* renamed from: b */
        private boolean f10211b;

        /* renamed from: c */
        private InterfaceC6347b f10212c;

        /* renamed from: d */
        private Boolean f10213d;

        C2662a(InterfaceC6349d interfaceC6349d) {
            this.f10210a = interfaceC6349d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m11074d(AbstractC6346a abstractC6346a) {
            if (m11077c()) {
                FirebaseMessaging.this.m11044A();
            }
        }

        /* renamed from: e */
        private Boolean m11075e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context m26867j = FirebaseMessaging.this.f10196a.m26867j();
            SharedPreferences sharedPreferences = m26867j.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = m26867j.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(m26867j.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                }
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: b */
        synchronized void m11076b() {
            if (this.f10211b) {
                return;
            }
            Boolean m11075e = m11075e();
            this.f10213d = m11075e;
            if (m11075e == null) {
                InterfaceC6347b interfaceC6347b = new InterfaceC6347b() { // from class: com.google.firebase.messaging.x
                    @Override // p297q6.InterfaceC6347b
                    /* renamed from: a */
                    public final void mo11341a(AbstractC6346a abstractC6346a) {
                        FirebaseMessaging.C2662a.this.m11074d(abstractC6346a);
                    }
                };
                this.f10212c = interfaceC6347b;
                this.f10210a.mo25129b(AbstractC6910a.class, interfaceC6347b);
            }
            this.f10211b = true;
        }

        /* renamed from: c */
        synchronized boolean m11077c() {
            boolean m26871s;
            m11076b();
            Boolean bool = this.f10213d;
            if (bool != null) {
                m26871s = bool.booleanValue();
            } else {
                m26871s = FirebaseMessaging.this.f10196a.m26871s();
            }
            return m26871s;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebaseMessaging(C6913d c6913d, InterfaceC6694a interfaceC6694a, InterfaceC6922b interfaceC6922b, InterfaceC6922b interfaceC6922b2, InterfaceC7048d interfaceC7048d, InterfaceC6340g interfaceC6340g, InterfaceC6349d interfaceC6349d) {
        this(c6913d, interfaceC6694a, interfaceC6922b, interfaceC6922b2, interfaceC7048d, interfaceC6340g, interfaceC6349d, new C2679f0(c6913d.m26867j()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public void m11044A() {
        InterfaceC6694a interfaceC6694a = this.f10197b;
        if (interfaceC6694a != null) {
            interfaceC6694a.mo10946b();
        } else if (m11065C(m11069n())) {
            m11063z();
        }
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(C6913d c6913d) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) c6913d.m26866i(FirebaseMessaging.class);
            AbstractC5391n.m21784j(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    /* renamed from: l */
    private static synchronized C2715v0 m11053l(Context context) {
        C2715v0 c2715v0;
        synchronized (FirebaseMessaging.class) {
            if (f10193p == null) {
                f10193p = new C2715v0(context);
            }
            c2715v0 = f10193p;
        }
        return c2715v0;
    }

    /* renamed from: m */
    private String m11054m() {
        if ("[DEFAULT]".equals(this.f10196a.m26868l())) {
            return "";
        }
        return this.f10196a.m26870n();
    }

    /* renamed from: o */
    public static InterfaceC6340g m11055o() {
        return f10194q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m11059u(String str) {
        if ("[DEFAULT]".equals(this.f10196a.m26868l())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f10196a.m26868l());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C2698n(this.f10199d).m11285i(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ AbstractC4245i m11057s(final String str, final C2715v0.a aVar) {
        return this.f10200e.m11103e().mo17714p(this.f10205j, new InterfaceC4243h() { // from class: com.google.firebase.messaging.w
            @Override // p127f5.InterfaceC4243h
            /* renamed from: a */
            public final AbstractC4245i mo346a(Object obj) {
                AbstractC4245i m11058t;
                m11058t = FirebaseMessaging.this.m11058t(str, aVar, (String) obj);
                return m11058t;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ AbstractC4245i m11058t(String str, C2715v0.a aVar, String str2) {
        m11053l(this.f10199d).m11331f(m11054m(), str, str2, this.f10207l.m11210a());
        if (aVar == null || !str2.equals(aVar.f10389a)) {
            m11059u(str2);
        }
        return AbstractC4250l.m17733e(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m11060v() {
        if (m11070q()) {
            m11044A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m11061w(C2665a1 c2665a1) {
        if (m11070q()) {
            c2665a1.m11120o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m11062x() {
        AbstractC2695l0.m11270c(this.f10199d);
    }

    /* renamed from: z */
    private synchronized void m11063z() {
        if (!this.f10208m) {
            m11064B(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public synchronized void m11064B(long j10) {
        m11067j(new RunnableC2717w0(this, Math.min(Math.max(30L, 2 * j10), f10192o)), j10);
        this.f10208m = true;
    }

    /* renamed from: C */
    boolean m11065C(C2715v0.a aVar) {
        if (aVar != null && !aVar.m11334b(this.f10207l.m11210a())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public String m11066i() {
        InterfaceC6694a interfaceC6694a = this.f10197b;
        if (interfaceC6694a != null) {
            try {
                return (String) AbstractC4250l.m17729a(interfaceC6694a.mo10947c());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        }
        final C2715v0.a m11069n = m11069n();
        if (!m11065C(m11069n)) {
            return m11069n.f10389a;
        }
        final String m11207c = C2679f0.m11207c(this.f10196a);
        try {
            return (String) AbstractC4250l.m17729a(this.f10201f.m11307b(m11207c, new C2705q0.a() { // from class: com.google.firebase.messaging.v
                @Override // com.google.firebase.messaging.C2705q0.a
                public final AbstractC4245i start() {
                    AbstractC4245i m11057s;
                    m11057s = FirebaseMessaging.this.m11057s(m11207c, m11069n);
                    return m11057s;
                }
            }));
        } catch (InterruptedException | ExecutionException e11) {
            throw new IOException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m11067j(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            if (f10195r == null) {
                f10195r = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC6342a("TAG"));
            }
            f10195r.schedule(runnable, j10, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public Context m11068k() {
        return this.f10199d;
    }

    /* renamed from: n */
    C2715v0.a m11069n() {
        return m11053l(this.f10199d).m11329d(m11054m(), C2679f0.m11207c(this.f10196a));
    }

    /* renamed from: q */
    public boolean m11070q() {
        return this.f10202g.m11077c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean m11071r() {
        return this.f10207l.m11214g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public synchronized void m11072y(boolean z10) {
        this.f10208m = z10;
    }

    FirebaseMessaging(C6913d c6913d, InterfaceC6694a interfaceC6694a, InterfaceC6922b interfaceC6922b, InterfaceC6922b interfaceC6922b2, InterfaceC7048d interfaceC7048d, InterfaceC6340g interfaceC6340g, InterfaceC6349d interfaceC6349d, C2679f0 c2679f0) {
        this(c6913d, interfaceC6694a, interfaceC7048d, interfaceC6340g, interfaceC6349d, c2679f0, new C2664a0(c6913d, c2679f0, interfaceC6922b, interfaceC6922b2, interfaceC7048d), AbstractC2700o.m11297f(), AbstractC2700o.m11294c(), AbstractC2700o.m11293b());
    }

    FirebaseMessaging(C6913d c6913d, InterfaceC6694a interfaceC6694a, InterfaceC7048d interfaceC7048d, InterfaceC6340g interfaceC6340g, InterfaceC6349d interfaceC6349d, C2679f0 c2679f0, C2664a0 c2664a0, Executor executor, Executor executor2, Executor executor3) {
        this.f10208m = false;
        f10194q = interfaceC6340g;
        this.f10196a = c6913d;
        this.f10197b = interfaceC6694a;
        this.f10198c = interfaceC7048d;
        this.f10202g = new C2662a(interfaceC6349d);
        Context m26867j = c6913d.m26867j();
        this.f10199d = m26867j;
        C2704q c2704q = new C2704q();
        this.f10209n = c2704q;
        this.f10207l = c2679f0;
        this.f10204i = executor;
        this.f10200e = c2664a0;
        this.f10201f = new C2705q0(executor);
        this.f10203h = executor2;
        this.f10205j = executor3;
        Context m26867j2 = c6913d.m26867j();
        if (m26867j2 instanceof Application) {
            ((Application) m26867j2).registerActivityLifecycleCallbacks(c2704q);
        } else {
            Log.w("FirebaseMessaging", "Context " + m26867j2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (interfaceC6694a != null) {
            interfaceC6694a.mo10945a(new InterfaceC6694a.a() { // from class: com.google.firebase.messaging.r
                @Override // p327s6.InterfaceC6694a.a
                /* renamed from: a */
                public final void mo11308a(String str) {
                    FirebaseMessaging.this.m11059u(str);
                }
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.s
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.m11060v();
            }
        });
        AbstractC4245i m11110e = C2665a1.m11110e(this, c2679f0, c2664a0, m26867j, AbstractC2700o.m11298g());
        this.f10206k = m11110e;
        m11110e.mo17703e(executor2, new InterfaceC4239f() { // from class: com.google.firebase.messaging.t
            @Override // p127f5.InterfaceC4239f
            public final void onSuccess(Object obj) {
                FirebaseMessaging.this.m11061w((C2665a1) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.u
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.m11062x();
            }
        });
    }
}
