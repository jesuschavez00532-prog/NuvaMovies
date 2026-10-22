package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bumptech.glide.manager.C1633p;
import com.bumptech.glide.manager.C1637t;
import com.bumptech.glide.manager.InterfaceC1619b;
import com.bumptech.glide.manager.InterfaceC1620c;
import com.bumptech.glide.manager.InterfaceC1627j;
import com.bumptech.glide.manager.InterfaceC1628k;
import com.bumptech.glide.manager.InterfaceC1632o;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p003a2.C0012h;
import p003a2.InterfaceC0008d;
import p022b2.AbstractC1036d;
import p022b2.InterfaceC1042j;
import p034c2.InterfaceC1344b;
import p109e2.AbstractC4122l;
import p216l1.AbstractC5323j;
import p375w1.C7346c;

/* renamed from: com.bumptech.glide.l */
/* loaded from: classes.dex */
public class ComponentCallbacks2C1597l implements ComponentCallbacks2, InterfaceC1628k {

    /* renamed from: m */
    private static final C0012h f6360m = (C0012h) C0012h.m105t0(Bitmap.class).mo39V();

    /* renamed from: n */
    private static final C0012h f6361n = (C0012h) C0012h.m105t0(C7346c.class).mo39V();

    /* renamed from: o */
    private static final C0012h f6362o = (C0012h) ((C0012h) C0012h.m106u0(AbstractC5323j.f21745c).mo51e0(EnumC1591h.LOW)).mo64m0(true);

    /* renamed from: a */
    protected final ComponentCallbacks2C1586c f6363a;

    /* renamed from: b */
    protected final Context f6364b;

    /* renamed from: c */
    final InterfaceC1627j f6365c;

    /* renamed from: d */
    private final C1633p f6366d;

    /* renamed from: e */
    private final InterfaceC1632o f6367e;

    /* renamed from: f */
    private final C1637t f6368f;

    /* renamed from: g */
    private final Runnable f6369g;

    /* renamed from: h */
    private final InterfaceC1619b f6370h;

    /* renamed from: i */
    private final CopyOnWriteArrayList f6371i;

    /* renamed from: j */
    private C0012h f6372j;

    /* renamed from: k */
    private boolean f6373k;

    /* renamed from: l */
    private boolean f6374l;

    /* renamed from: com.bumptech.glide.l$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentCallbacks2C1597l componentCallbacks2C1597l = ComponentCallbacks2C1597l.this;
            componentCallbacks2C1597l.f6365c.mo7458a(componentCallbacks2C1597l);
        }
    }

    /* renamed from: com.bumptech.glide.l$b */
    /* loaded from: classes.dex */
    private static class b extends AbstractC1036d {
        b(View view) {
            super(view);
        }

        @Override // p022b2.AbstractC1036d
        /* renamed from: d */
        protected void mo4843d(Drawable drawable) {
        }

        @Override // p022b2.InterfaceC1042j
        public void onLoadFailed(Drawable drawable) {
        }

        @Override // p022b2.InterfaceC1042j
        public void onResourceReady(Object obj, InterfaceC1344b interfaceC1344b) {
        }
    }

    /* renamed from: com.bumptech.glide.l$c */
    /* loaded from: classes.dex */
    private class c implements InterfaceC1619b.a {

        /* renamed from: a */
        private final C1633p f6376a;

        c(C1633p c1633p) {
            this.f6376a = c1633p;
        }

        @Override // com.bumptech.glide.manager.InterfaceC1619b.a
        /* renamed from: a */
        public void mo7395a(boolean z10) {
            if (z10) {
                synchronized (ComponentCallbacks2C1597l.this) {
                    this.f6376a.m7484e();
                }
            }
        }
    }

    public ComponentCallbacks2C1597l(ComponentCallbacks2C1586c componentCallbacks2C1586c, InterfaceC1627j interfaceC1627j, InterfaceC1632o interfaceC1632o, Context context) {
        this(componentCallbacks2C1586c, interfaceC1627j, interfaceC1632o, new C1633p(), componentCallbacks2C1586c.m7289h(), context);
    }

    /* renamed from: g */
    private synchronized void m7374g() {
        Iterator it = this.f6368f.m7502b().iterator();
        while (it.hasNext()) {
            m7381f((InterfaceC1042j) it.next());
        }
        this.f6368f.m7501a();
    }

    /* renamed from: u */
    private void m7375u(InterfaceC1042j interfaceC1042j) {
        boolean m7394t = m7394t(interfaceC1042j);
        InterfaceC0008d request = interfaceC1042j.getRequest();
        if (!m7394t && !this.f6363a.m7295q(interfaceC1042j) && request != null) {
            interfaceC1042j.setRequest(null);
            request.clear();
        }
    }

    /* renamed from: a */
    public C1596k mo7376a(Class cls) {
        return new C1596k(this.f6363a, this, cls, this.f6364b);
    }

    /* renamed from: b */
    public C1596k mo7377b() {
        return mo7376a(Bitmap.class).mo43a(f6360m);
    }

    /* renamed from: c */
    public C1596k mo7378c() {
        return mo7376a(Drawable.class);
    }

    /* renamed from: d */
    public C1596k mo7379d() {
        return mo7376a(C7346c.class).mo43a(f6361n);
    }

    /* renamed from: e */
    public void m7380e(View view) {
        m7381f(new b(view));
    }

    /* renamed from: f */
    public void m7381f(InterfaceC1042j interfaceC1042j) {
        if (interfaceC1042j == null) {
            return;
        }
        m7375u(interfaceC1042j);
    }

    /* renamed from: h */
    public C1596k mo7382h() {
        return mo7376a(File.class).mo43a(f6362o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public List m7383i() {
        return this.f6371i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public synchronized C0012h m7384j() {
        return this.f6372j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public AbstractC1617m m7385k(Class cls) {
        return this.f6363a.m7291j().m7311e(cls);
    }

    /* renamed from: l */
    public C1596k mo7386l(File file) {
        return mo7378c().mo7366G0(file);
    }

    /* renamed from: m */
    public C1596k mo7387m(Object obj) {
        return mo7378c().mo7367H0(obj);
    }

    /* renamed from: n */
    public synchronized void m7388n() {
        this.f6366d.m7482c();
    }

    /* renamed from: o */
    public synchronized void m7389o() {
        m7388n();
        Iterator it = this.f6367e.mo7464a().iterator();
        while (it.hasNext()) {
            ((ComponentCallbacks2C1597l) it.next()).m7388n();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bumptech.glide.manager.InterfaceC1628k
    public synchronized void onDestroy() {
        this.f6368f.onDestroy();
        m7374g();
        this.f6366d.m7481b();
        this.f6365c.mo7459b(this);
        this.f6365c.mo7459b(this.f6370h);
        AbstractC4122l.m17251x(this.f6369g);
        this.f6363a.m7297t(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // com.bumptech.glide.manager.InterfaceC1628k
    public synchronized void onStart() {
        m7391q();
        this.f6368f.onStart();
    }

    @Override // com.bumptech.glide.manager.InterfaceC1628k
    public synchronized void onStop() {
        this.f6368f.onStop();
        if (this.f6374l) {
            m7374g();
        } else {
            m7390p();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (i10 == 60 && this.f6373k) {
            m7389o();
        }
    }

    /* renamed from: p */
    public synchronized void m7390p() {
        this.f6366d.m7483d();
    }

    /* renamed from: q */
    public synchronized void m7391q() {
        this.f6366d.m7485f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public synchronized void mo7392r(C0012h c0012h) {
        this.f6372j = (C0012h) ((C0012h) c0012h.clone()).mo45b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public synchronized void m7393s(InterfaceC1042j interfaceC1042j, InterfaceC0008d interfaceC0008d) {
        this.f6368f.m7503c(interfaceC1042j);
        this.f6366d.m7486g(interfaceC0008d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public synchronized boolean m7394t(InterfaceC1042j interfaceC1042j) {
        InterfaceC0008d request = interfaceC1042j.getRequest();
        if (request == null) {
            return true;
        }
        if (this.f6366d.m7480a(request)) {
            this.f6368f.m7504d(interfaceC1042j);
            interfaceC1042j.setRequest(null);
            return true;
        }
        return false;
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f6366d + ", treeNode=" + this.f6367e + "}";
    }

    ComponentCallbacks2C1597l(ComponentCallbacks2C1586c componentCallbacks2C1586c, InterfaceC1627j interfaceC1627j, InterfaceC1632o interfaceC1632o, C1633p c1633p, InterfaceC1620c interfaceC1620c, Context context) {
        this.f6368f = new C1637t();
        a aVar = new a();
        this.f6369g = aVar;
        this.f6363a = componentCallbacks2C1586c;
        this.f6365c = interfaceC1627j;
        this.f6367e = interfaceC1632o;
        this.f6366d = c1633p;
        this.f6364b = context;
        InterfaceC1619b mo7460a = interfaceC1620c.mo7460a(context.getApplicationContext(), new c(c1633p));
        this.f6370h = mo7460a;
        componentCallbacks2C1586c.m7294p(this);
        if (AbstractC4122l.m17246s()) {
            AbstractC4122l.m17250w(aVar);
        } else {
            interfaceC1627j.mo7458a(this);
        }
        interfaceC1627j.mo7458a(mo7460a);
        this.f6371i = new CopyOnWriteArrayList(componentCallbacks2C1586c.m7291j().m7309c());
        mo7392r(componentCallbacks2C1586c.m7291j().m7310d());
    }
}
