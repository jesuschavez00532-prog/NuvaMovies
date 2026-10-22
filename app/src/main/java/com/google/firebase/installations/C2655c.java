package com.google.firebase.installations;

import android.support.v4.media.session.AbstractC0272b;
import android.text.TextUtils;
import com.google.firebase.installations.C2655c;
import com.google.firebase.installations.C2656d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p127f5.AbstractC4245i;
import p127f5.AbstractC4250l;
import p127f5.C4247j;
import p219l4.AbstractC5391n;
import p337t5.C6913d;
import p338t6.InterfaceC6922b;
import p352u6.C7050f;
import p352u6.InterfaceC7048d;
import p367v6.AbstractC7245d;
import p367v6.C7243b;
import p367v6.C7244c;
import p380w6.AbstractC7377d;
import p380w6.AbstractC7379f;
import p380w6.C7376c;

/* renamed from: com.google.firebase.installations.c */
/* loaded from: classes.dex */
public class C2655c implements InterfaceC7048d {

    /* renamed from: m */
    private static final Object f10156m = new Object();

    /* renamed from: n */
    private static final ThreadFactory f10157n = new a();

    /* renamed from: a */
    private final C6913d f10158a;

    /* renamed from: b */
    private final C7376c f10159b;

    /* renamed from: c */
    private final C7244c f10160c;

    /* renamed from: d */
    private final C2661i f10161d;

    /* renamed from: e */
    private final C7243b f10162e;

    /* renamed from: f */
    private final C7050f f10163f;

    /* renamed from: g */
    private final Object f10164g;

    /* renamed from: h */
    private final ExecutorService f10165h;

    /* renamed from: i */
    private final ExecutorService f10166i;

    /* renamed from: j */
    private String f10167j;

    /* renamed from: k */
    private Set f10168k;

    /* renamed from: l */
    private final List f10169l;

    /* renamed from: com.google.firebase.installations.c$a */
    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f10170a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f10170a.getAndIncrement())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.installations.c$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f10171a;

        /* renamed from: b */
        static final /* synthetic */ int[] f10172b;

        static {
            int[] iArr = new int[AbstractC7379f.b.values().length];
            f10172b = iArr;
            try {
                iArr[AbstractC7379f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10172b[AbstractC7379f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10172b[AbstractC7379f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC7377d.b.values().length];
            f10171a = iArr2;
            try {
                iArr2[AbstractC7377d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10171a[AbstractC7377d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2655c(C6913d c6913d, InterfaceC6922b interfaceC6922b) {
        this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f10157n), c6913d, new C7376c(c6913d.m26867j(), interfaceC6922b), new C7244c(c6913d), C2661i.m11036c(), new C7243b(c6913d), new C7050f());
    }

    /* renamed from: A */
    private void m11003A(Exception exc) {
        synchronized (this.f10164g) {
            Iterator it = this.f10169l.iterator();
            while (it.hasNext()) {
                if (((InterfaceC2660h) it.next()).mo11034b(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: B */
    private void m11004B(AbstractC7245d abstractC7245d) {
        synchronized (this.f10164g) {
            Iterator it = this.f10169l.iterator();
            while (it.hasNext()) {
                if (((InterfaceC2660h) it.next()).mo11033a(abstractC7245d)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: C */
    private synchronized void m11005C(String str) {
        this.f10167j = str;
    }

    /* renamed from: D */
    private synchronized void m11006D(AbstractC7245d abstractC7245d, AbstractC7245d abstractC7245d2) {
        if (this.f10168k.size() != 0 && !TextUtils.equals(abstractC7245d.mo28014d(), abstractC7245d2.mo28014d())) {
            Iterator it = this.f10168k.iterator();
            if (it.hasNext()) {
                AbstractC0272b.m941a(it.next());
                abstractC7245d2.mo28014d();
                throw null;
            }
        }
    }

    /* renamed from: f */
    private AbstractC4245i m11010f() {
        C4247j c4247j = new C4247j();
        m11012h(new C2657e(this.f10161d, c4247j));
        return c4247j.m17724a();
    }

    /* renamed from: g */
    private AbstractC4245i m11011g() {
        C4247j c4247j = new C4247j();
        m11012h(new C2658f(c4247j));
        return c4247j.m17724a();
    }

    /* renamed from: h */
    private void m11012h(InterfaceC2660h interfaceC2660h) {
        synchronized (this.f10164g) {
            this.f10169l.add(interfaceC2660h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m11022u(boolean r3) {
        /*
            r2 = this;
            v6.d r0 = r2.m11019q()
            boolean r1 = r0.m28042i()     // Catch: com.google.firebase.installations.C2656d -> L5f
            if (r1 != 0) goto L22
            boolean r1 = r0.m28045l()     // Catch: com.google.firebase.installations.C2656d -> L5f
            if (r1 == 0) goto L11
            goto L22
        L11:
            if (r3 != 0) goto L1d
            com.google.firebase.installations.i r3 = r2.f10161d     // Catch: com.google.firebase.installations.C2656d -> L5f
            boolean r3 = r3.m11043f(r0)     // Catch: com.google.firebase.installations.C2656d -> L5f
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            return
        L1d:
            v6.d r3 = r2.m11015k(r0)     // Catch: com.google.firebase.installations.C2656d -> L5f
            goto L26
        L22:
            v6.d r3 = r2.m11027z(r0)     // Catch: com.google.firebase.installations.C2656d -> L5f
        L26:
            r2.m11021t(r3)
            r2.m11006D(r0, r3)
            boolean r0 = r3.m28044k()
            if (r0 == 0) goto L39
            java.lang.String r0 = r3.mo28014d()
            r2.m11005C(r0)
        L39:
            boolean r0 = r3.m28042i()
            if (r0 == 0) goto L4a
            com.google.firebase.installations.d r3 = new com.google.firebase.installations.d
            com.google.firebase.installations.d$a r0 = com.google.firebase.installations.C2656d.a.BAD_CONFIG
            r3.<init>(r0)
            r2.m11003A(r3)
            goto L5e
        L4a:
            boolean r0 = r3.m28043j()
            if (r0 == 0) goto L5b
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.m11003A(r3)
            goto L5e
        L5b:
            r2.m11004B(r3)
        L5e:
            return
        L5f:
            r3 = move-exception
            r2.m11003A(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C2655c.m11022u(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void m11024w(final boolean z10) {
        AbstractC7245d m11020r = m11020r();
        if (z10) {
            m11020r = m11020r.m28048p();
        }
        m11004B(m11020r);
        this.f10166i.execute(new Runnable() { // from class: u6.b
            @Override // java.lang.Runnable
            public final void run() {
                C2655c.this.m11022u(z10);
            }
        });
    }

    /* renamed from: k */
    private AbstractC7245d m11015k(AbstractC7245d abstractC7245d) {
        AbstractC7379f m28478e = this.f10159b.m28478e(m11030l(), abstractC7245d.mo28014d(), m11032s(), abstractC7245d.mo28016f());
        int i10 = b.f10172b[m28478e.mo28453b().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    m11005C(null);
                    return abstractC7245d.m28050r();
                }
                throw new C2656d("Firebase Installations Service is unavailable. Please try again later.", C2656d.a.UNAVAILABLE);
            }
            return abstractC7245d.m28049q("BAD CONFIG");
        }
        return abstractC7245d.m28047o(m28478e.mo28454c(), m28478e.mo28455d(), this.f10161d.m11041b());
    }

    /* renamed from: n */
    private synchronized String m11016n() {
        return this.f10167j;
    }

    /* renamed from: o */
    public static C2655c m11017o() {
        return m11018p(C6913d.m26856k());
    }

    /* renamed from: p */
    public static C2655c m11018p(C6913d c6913d) {
        boolean z10;
        if (c6913d != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC5391n.m21776b(z10, "Null is not a valid value of FirebaseApp.");
        return (C2655c) c6913d.m26866i(InterfaceC7048d.class);
    }

    /* renamed from: q */
    private AbstractC7245d m11019q() {
        AbstractC7245d m28040d;
        synchronized (f10156m) {
            C2654b m11001a = C2654b.m11001a(this.f10158a.m26867j(), "generatefid.lock");
            try {
                m28040d = this.f10160c.m28040d();
            } finally {
                if (m11001a != null) {
                    m11001a.m11002b();
                }
            }
        }
        return m28040d;
    }

    /* renamed from: r */
    private AbstractC7245d m11020r() {
        AbstractC7245d m28040d;
        synchronized (f10156m) {
            C2654b m11001a = C2654b.m11001a(this.f10158a.m26867j(), "generatefid.lock");
            try {
                m28040d = this.f10160c.m28040d();
                if (m28040d.m28043j()) {
                    m28040d = this.f10160c.m28039b(m28040d.m28052t(m11026y(m28040d)));
                }
            } finally {
                if (m11001a != null) {
                    m11001a.m11002b();
                }
            }
        }
        return m28040d;
    }

    /* renamed from: t */
    private void m11021t(AbstractC7245d abstractC7245d) {
        synchronized (f10156m) {
            C2654b m11001a = C2654b.m11001a(this.f10158a.m26867j(), "generatefid.lock");
            try {
                this.f10160c.m28039b(abstractC7245d);
            } finally {
                if (m11001a != null) {
                    m11001a.m11002b();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m11023v() {
        m11024w(false);
    }

    /* renamed from: x */
    private void m11025x() {
        AbstractC5391n.m21780f(m11031m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC5391n.m21780f(m11032s(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC5391n.m21780f(m11030l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC5391n.m21776b(C2661i.m11039h(m11031m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC5391n.m21776b(C2661i.m11038g(m11030l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* renamed from: y */
    private String m11026y(AbstractC7245d abstractC7245d) {
        if ((!this.f10158a.m26868l().equals("CHIME_ANDROID_SDK") && !this.f10158a.m26872t()) || !abstractC7245d.m28046m()) {
            return this.f10163f.m27149a();
        }
        String m28035f = this.f10162e.m28035f();
        if (TextUtils.isEmpty(m28035f)) {
            return this.f10163f.m27149a();
        }
        return m28035f;
    }

    /* renamed from: z */
    private AbstractC7245d m11027z(AbstractC7245d abstractC7245d) {
        String str;
        if (abstractC7245d.mo28014d() != null && abstractC7245d.mo28014d().length() == 11) {
            str = this.f10162e.m28036i();
        } else {
            str = null;
        }
        AbstractC7377d m28477d = this.f10159b.m28477d(m11030l(), abstractC7245d.mo28014d(), m11032s(), m11031m(), str);
        int i10 = b.f10171a[m28477d.mo28445e().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return abstractC7245d.m28049q("BAD CONFIG");
            }
            throw new C2656d("Firebase Installations Service is unavailable. Please try again later.", C2656d.a.UNAVAILABLE);
        }
        return abstractC7245d.m28051s(m28477d.mo28443c(), m28477d.mo28444d(), this.f10161d.m11041b(), m28477d.mo28442b().mo28454c(), m28477d.mo28442b().mo28455d());
    }

    @Override // p352u6.InterfaceC7048d
    /* renamed from: a */
    public AbstractC4245i mo11028a() {
        m11025x();
        String m11016n = m11016n();
        if (m11016n != null) {
            return AbstractC4250l.m17733e(m11016n);
        }
        AbstractC4245i m11011g = m11011g();
        this.f10165h.execute(new Runnable() { // from class: u6.a
            @Override // java.lang.Runnable
            public final void run() {
                C2655c.this.m11023v();
            }
        });
        return m11011g;
    }

    @Override // p352u6.InterfaceC7048d
    /* renamed from: b */
    public AbstractC4245i mo11029b(final boolean z10) {
        m11025x();
        AbstractC4245i m11010f = m11010f();
        this.f10165h.execute(new Runnable() { // from class: u6.c
            @Override // java.lang.Runnable
            public final void run() {
                C2655c.this.m11024w(z10);
            }
        });
        return m11010f;
    }

    /* renamed from: l */
    String m11030l() {
        return this.f10158a.m26869m().m26880b();
    }

    /* renamed from: m */
    String m11031m() {
        return this.f10158a.m26869m().m26881c();
    }

    /* renamed from: s */
    String m11032s() {
        return this.f10158a.m26869m().m26883e();
    }

    C2655c(ExecutorService executorService, C6913d c6913d, C7376c c7376c, C7244c c7244c, C2661i c2661i, C7243b c7243b, C7050f c7050f) {
        this.f10164g = new Object();
        this.f10168k = new HashSet();
        this.f10169l = new ArrayList();
        this.f10158a = c6913d;
        this.f10159b = c7376c;
        this.f10160c = c7244c;
        this.f10161d = c2661i;
        this.f10162e = c7243b;
        this.f10163f = c7050f;
        this.f10165h = executorService;
        this.f10166i = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f10157n);
    }
}
