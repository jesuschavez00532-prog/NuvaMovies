package p003a2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.C1587d;
import com.bumptech.glide.C1588e;
import com.bumptech.glide.EnumC1591h;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p022b2.InterfaceC1041i;
import p022b2.InterfaceC1042j;
import p034c2.InterfaceC1345c;
import p109e2.AbstractC4117g;
import p109e2.AbstractC4122l;
import p124f2.AbstractC4220b;
import p124f2.AbstractC4221c;
import p184j1.EnumC4970a;
import p216l1.C5324k;
import p216l1.C5330q;
import p216l1.InterfaceC5335v;
import p347u1.AbstractC7019i;

/* renamed from: a2.j */
/* loaded from: classes.dex */
public final class C0014j implements InterfaceC0008d, InterfaceC1041i, InterfaceC0013i {

    /* renamed from: E */
    private static final boolean f61E = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A */
    private int f62A;

    /* renamed from: B */
    private int f63B;

    /* renamed from: C */
    private boolean f64C;

    /* renamed from: D */
    private RuntimeException f65D;

    /* renamed from: a */
    private int f66a;

    /* renamed from: b */
    private final String f67b;

    /* renamed from: c */
    private final AbstractC4221c f68c;

    /* renamed from: d */
    private final Object f69d;

    /* renamed from: e */
    private final InterfaceC0011g f70e;

    /* renamed from: f */
    private final InterfaceC0009e f71f;

    /* renamed from: g */
    private final Context f72g;

    /* renamed from: h */
    private final C1588e f73h;

    /* renamed from: i */
    private final Object f74i;

    /* renamed from: j */
    private final Class f75j;

    /* renamed from: k */
    private final AbstractC0005a f76k;

    /* renamed from: l */
    private final int f77l;

    /* renamed from: m */
    private final int f78m;

    /* renamed from: n */
    private final EnumC1591h f79n;

    /* renamed from: o */
    private final InterfaceC1042j f80o;

    /* renamed from: p */
    private final List f81p;

    /* renamed from: q */
    private final InterfaceC1345c f82q;

    /* renamed from: r */
    private final Executor f83r;

    /* renamed from: s */
    private InterfaceC5335v f84s;

    /* renamed from: t */
    private C5324k.d f85t;

    /* renamed from: u */
    private long f86u;

    /* renamed from: v */
    private volatile C5324k f87v;

    /* renamed from: w */
    private a f88w;

    /* renamed from: x */
    private Drawable f89x;

    /* renamed from: y */
    private Drawable f90y;

    /* renamed from: z */
    private Drawable f91z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a2.j$a */
    /* loaded from: classes.dex */
    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private C0014j(Context context, C1588e c1588e, Object obj, Object obj2, Class cls, AbstractC0005a abstractC0005a, int i10, int i11, EnumC1591h enumC1591h, InterfaceC1042j interfaceC1042j, InterfaceC0011g interfaceC0011g, List list, InterfaceC0009e interfaceC0009e, C5324k c5324k, InterfaceC1345c interfaceC1345c, Executor executor) {
        String str;
        if (f61E) {
            str = String.valueOf(super.hashCode());
        } else {
            str = null;
        }
        this.f67b = str;
        this.f68c = AbstractC4221c.m17647a();
        this.f69d = obj;
        this.f72g = context;
        this.f73h = c1588e;
        this.f74i = obj2;
        this.f75j = cls;
        this.f76k = abstractC0005a;
        this.f77l = i10;
        this.f78m = i11;
        this.f79n = enumC1591h;
        this.f80o = interfaceC1042j;
        this.f70e = interfaceC0011g;
        this.f81p = list;
        this.f71f = interfaceC0009e;
        this.f87v = c5324k;
        this.f82q = interfaceC1345c;
        this.f83r = executor;
        this.f88w = a.PENDING;
        if (this.f65D == null && c1588e.m7313g().m7316a(C1587d.d.class)) {
            this.f65D = new RuntimeException("Glide request origin trace");
        }
    }

    /* renamed from: A */
    private void m111A(InterfaceC5335v interfaceC5335v, Object obj, EnumC4970a enumC4970a, boolean z10) {
        boolean z11;
        boolean m122s = m122s();
        this.f88w = a.COMPLETE;
        this.f84s = interfaceC5335v;
        if (this.f73h.m7314h() <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + enumC4970a + " for " + this.f74i + " with size [" + this.f62A + "x" + this.f63B + "] in " + AbstractC4117g.m17209a(this.f86u) + " ms");
        }
        m127x();
        boolean z12 = true;
        this.f64C = true;
        try {
            List list = this.f81p;
            if (list != null) {
                Iterator it = list.iterator();
                z11 = false;
                while (it.hasNext()) {
                    z11 |= ((InterfaceC0011g) it.next()).mo102b(obj, this.f74i, this.f80o, enumC4970a, m122s);
                }
            } else {
                z11 = false;
            }
            InterfaceC0011g interfaceC0011g = this.f70e;
            if (interfaceC0011g == null || !interfaceC0011g.mo102b(obj, this.f74i, this.f80o, enumC4970a, m122s)) {
                z12 = false;
            }
            if (!(z12 | z11)) {
                this.f80o.onResourceReady(obj, this.f82q.mo6111a(enumC4970a, m122s));
            }
            this.f64C = false;
            AbstractC4220b.m17646f("GlideRequest", this.f66a);
        } catch (Throwable th) {
            this.f64C = false;
            throw th;
        }
    }

    /* renamed from: B */
    private void m112B() {
        Drawable drawable;
        if (!m115l()) {
            return;
        }
        if (this.f74i == null) {
            drawable = m120q();
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = m119p();
        }
        if (drawable == null) {
            drawable = m121r();
        }
        this.f80o.onLoadFailed(drawable);
    }

    /* renamed from: i */
    private void m113i() {
        if (!this.f64C) {
        } else {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* renamed from: k */
    private boolean m114k() {
        InterfaceC0009e interfaceC0009e = this.f71f;
        if (interfaceC0009e != null && !interfaceC0009e.mo94i(this)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private boolean m115l() {
        InterfaceC0009e interfaceC0009e = this.f71f;
        if (interfaceC0009e != null && !interfaceC0009e.mo88c(this)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private boolean m116m() {
        InterfaceC0009e interfaceC0009e = this.f71f;
        if (interfaceC0009e != null && !interfaceC0009e.mo91f(this)) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private void m117n() {
        m113i();
        this.f68c.mo17649c();
        this.f80o.removeCallback(this);
        C5324k.d dVar = this.f85t;
        if (dVar != null) {
            dVar.m21552a();
            this.f85t = null;
        }
    }

    /* renamed from: o */
    private void m118o(Object obj) {
        List<InterfaceC0011g> list = this.f81p;
        if (list == null) {
            return;
        }
        for (InterfaceC0011g interfaceC0011g : list) {
        }
    }

    /* renamed from: p */
    private Drawable m119p() {
        if (this.f89x == null) {
            Drawable m71r = this.f76k.m71r();
            this.f89x = m71r;
            if (m71r == null && this.f76k.m68p() > 0) {
                this.f89x = m123t(this.f76k.m68p());
            }
        }
        return this.f89x;
    }

    /* renamed from: q */
    private Drawable m120q() {
        if (this.f91z == null) {
            Drawable m73s = this.f76k.m73s();
            this.f91z = m73s;
            if (m73s == null && this.f76k.m75t() > 0) {
                this.f91z = m123t(this.f76k.m75t());
            }
        }
        return this.f91z;
    }

    /* renamed from: r */
    private Drawable m121r() {
        if (this.f90y == null) {
            Drawable m80y = this.f76k.m80y();
            this.f90y = m80y;
            if (m80y == null && this.f76k.m81z() > 0) {
                this.f90y = m123t(this.f76k.m81z());
            }
        }
        return this.f90y;
    }

    /* renamed from: s */
    private boolean m122s() {
        InterfaceC0009e interfaceC0009e = this.f71f;
        if (interfaceC0009e != null && interfaceC0009e.mo86a().mo87b()) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    private Drawable m123t(int i10) {
        Resources.Theme theme;
        if (this.f76k.m26E() != null) {
            theme = this.f76k.m26E();
        } else {
            theme = this.f72g.getTheme();
        }
        return AbstractC7019i.m27093a(this.f72g, i10, theme);
    }

    /* renamed from: u */
    private void m124u(String str) {
        Log.v("GlideRequest", str + " this: " + this.f67b);
    }

    /* renamed from: v */
    private static int m125v(int i10, float f10) {
        if (i10 != Integer.MIN_VALUE) {
            return Math.round(f10 * i10);
        }
        return i10;
    }

    /* renamed from: w */
    private void m126w() {
        InterfaceC0009e interfaceC0009e = this.f71f;
        if (interfaceC0009e != null) {
            interfaceC0009e.mo90e(this);
        }
    }

    /* renamed from: x */
    private void m127x() {
        InterfaceC0009e interfaceC0009e = this.f71f;
        if (interfaceC0009e != null) {
            interfaceC0009e.mo96k(this);
        }
    }

    /* renamed from: y */
    public static C0014j m128y(Context context, C1588e c1588e, Object obj, Object obj2, Class cls, AbstractC0005a abstractC0005a, int i10, int i11, EnumC1591h enumC1591h, InterfaceC1042j interfaceC1042j, InterfaceC0011g interfaceC0011g, List list, InterfaceC0009e interfaceC0009e, C5324k c5324k, InterfaceC1345c interfaceC1345c, Executor executor) {
        return new C0014j(context, c1588e, obj, obj2, cls, abstractC0005a, i10, i11, enumC1591h, interfaceC1042j, interfaceC0011g, list, interfaceC0009e, c5324k, interfaceC1345c, executor);
    }

    /* renamed from: z */
    private void m129z(C5330q c5330q, int i10) {
        boolean z10;
        this.f68c.mo17649c();
        synchronized (this.f69d) {
            c5330q.m21591k(this.f65D);
            int m7314h = this.f73h.m7314h();
            if (m7314h <= i10) {
                Log.w("Glide", "Load failed for [" + this.f74i + "] with dimensions [" + this.f62A + "x" + this.f63B + "]", c5330q);
                if (m7314h <= 4) {
                    c5330q.m21588g("Glide");
                }
            }
            this.f85t = null;
            this.f88w = a.FAILED;
            m126w();
            boolean z11 = true;
            this.f64C = true;
            try {
                List list = this.f81p;
                if (list != null) {
                    Iterator it = list.iterator();
                    z10 = false;
                    while (it.hasNext()) {
                        z10 |= ((InterfaceC0011g) it.next()).mo101a(c5330q, this.f74i, this.f80o, m122s());
                    }
                } else {
                    z10 = false;
                }
                InterfaceC0011g interfaceC0011g = this.f70e;
                if (interfaceC0011g == null || !interfaceC0011g.mo101a(c5330q, this.f74i, this.f80o, m122s())) {
                    z11 = false;
                }
                if (!(z10 | z11)) {
                    m112B();
                }
                this.f64C = false;
                AbstractC4220b.m17646f("GlideRequest", this.f66a);
            } catch (Throwable th) {
                this.f64C = false;
                throw th;
            }
        }
    }

    @Override // p003a2.InterfaceC0013i
    /* renamed from: a */
    public void mo108a(C5330q c5330q) {
        m129z(c5330q, 5);
    }

    @Override // p003a2.InterfaceC0008d
    /* renamed from: b */
    public boolean mo87b() {
        boolean z10;
        synchronized (this.f69d) {
            if (this.f88w == a.COMPLETE) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // p003a2.InterfaceC0013i
    /* renamed from: c */
    public void mo109c(InterfaceC5335v interfaceC5335v, EnumC4970a enumC4970a, boolean z10) {
        Object obj;
        String str;
        this.f68c.mo17649c();
        InterfaceC5335v interfaceC5335v2 = null;
        try {
            synchronized (this.f69d) {
                try {
                    this.f85t = null;
                    if (interfaceC5335v == null) {
                        mo108a(new C5330q("Expected to receive a Resource<R> with an object of " + this.f75j + " inside, but instead got null."));
                        return;
                    }
                    Object obj2 = interfaceC5335v.get();
                    try {
                        if (obj2 != null && this.f75j.isAssignableFrom(obj2.getClass())) {
                            if (!m116m()) {
                                this.f84s = null;
                                this.f88w = a.COMPLETE;
                                AbstractC4220b.m17646f("GlideRequest", this.f66a);
                                this.f87v.m21547l(interfaceC5335v);
                                return;
                            }
                            m111A(interfaceC5335v, obj2, enumC4970a, z10);
                            return;
                        }
                        this.f84s = null;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected to receive an object of ");
                        sb2.append(this.f75j);
                        sb2.append(" but instead got ");
                        if (obj2 != null) {
                            obj = obj2.getClass();
                        } else {
                            obj = "";
                        }
                        sb2.append(obj);
                        sb2.append("{");
                        sb2.append(obj2);
                        sb2.append("} inside Resource{");
                        sb2.append(interfaceC5335v);
                        sb2.append("}.");
                        if (obj2 != null) {
                            str = "";
                        } else {
                            str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                        }
                        sb2.append(str);
                        mo108a(new C5330q(sb2.toString()));
                        this.f87v.m21547l(interfaceC5335v);
                    } catch (Throwable th) {
                        interfaceC5335v2 = interfaceC5335v;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (interfaceC5335v2 != null) {
                this.f87v.m21547l(interfaceC5335v2);
            }
            throw th3;
        }
    }

    @Override // p003a2.InterfaceC0008d
    public void clear() {
        synchronized (this.f69d) {
            m113i();
            this.f68c.mo17649c();
            a aVar = this.f88w;
            a aVar2 = a.CLEARED;
            if (aVar == aVar2) {
                return;
            }
            m117n();
            InterfaceC5335v interfaceC5335v = this.f84s;
            if (interfaceC5335v != null) {
                this.f84s = null;
            } else {
                interfaceC5335v = null;
            }
            if (m114k()) {
                this.f80o.onLoadCleared(m121r());
            }
            AbstractC4220b.m17646f("GlideRequest", this.f66a);
            this.f88w = aVar2;
            if (interfaceC5335v != null) {
                this.f87v.m21547l(interfaceC5335v);
            }
        }
    }

    @Override // p003a2.InterfaceC0008d
    /* renamed from: d */
    public boolean mo89d(InterfaceC0008d interfaceC0008d) {
        int i10 = 0;
        int i11 = 0;
        Object obj;
        Class cls;
        AbstractC0005a abstractC0005a;
        EnumC1591h enumC1591h;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        Object obj2;
        Class cls2;
        AbstractC0005a abstractC0005a2;
        EnumC1591h enumC1591h2;
        int i15 = 0;
        if (!(interfaceC0008d instanceof C0014j)) {
            return false;
        }
        synchronized (this.f69d) {
            i10 = this.f77l;
            i11 = this.f78m;
            obj = this.f74i;
            cls = this.f75j;
            abstractC0005a = this.f76k;
            enumC1591h = this.f79n;
            List list = this.f81p;
            if (list != null) {
                i12 = list.size();
            } else {
                i12 = 0;
            }
        }
        C0014j c0014j = (C0014j) interfaceC0008d;
        synchronized (c0014j.f69d) {
            i13 = c0014j.f77l;
            i14 = c0014j.f78m;
            obj2 = c0014j.f74i;
            cls2 = c0014j.f75j;
            abstractC0005a2 = c0014j.f76k;
            enumC1591h2 = c0014j.f79n;
            List list2 = c0014j.f81p;
            if (list2 != null) {
                i15 = list2.size();
            } else {
                i15 = 0;
            }
        }
        if (i10 == i13 && i11 == i14 && AbstractC4122l.m17231d(obj, obj2) && cls.equals(cls2) && AbstractC4122l.m17230c(abstractC0005a, abstractC0005a2) && enumC1591h == enumC1591h2 && i12 == i15) {
            return true;
        }
        return false;
    }

    @Override // p022b2.InterfaceC1041i
    /* renamed from: e */
    public void mo130e(int i10, int i11) {
        Object obj;
        this.f68c.mo17649c();
        Object obj2 = this.f69d;
        synchronized (obj2) {
            try {
                try {
                    boolean z10 = f61E;
                    if (z10) {
                        m124u("Got onSizeReady in " + AbstractC4117g.m17209a(this.f86u));
                    }
                    if (this.f88w == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        this.f88w = aVar;
                        float m25D = this.f76k.m25D();
                        this.f62A = m125v(i10, m25D);
                        this.f63B = m125v(i11, m25D);
                        if (z10) {
                            m124u("finished setup for calling load in " + AbstractC4117g.m17209a(this.f86u));
                        }
                        obj = obj2;
                        try {
                            this.f85t = this.f87v.m21546g(this.f73h, this.f74i, this.f76k.m24C(), this.f62A, this.f63B, this.f76k.m23B(), this.f75j, this.f79n, this.f76k.m66o(), this.f76k.m27F(), this.f76k.m36Q(), this.f76k.m34M(), this.f76k.m77v(), this.f76k.m32K(), this.f76k.m29H(), this.f76k.m28G(), this.f76k.m76u(), this, this.f83r);
                            if (this.f88w != aVar) {
                                this.f85t = null;
                            }
                            if (z10) {
                                m124u("finished onSizeReady in " + AbstractC4117g.m17209a(this.f86u));
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
            }
        }
    }

    @Override // p003a2.InterfaceC0013i
    /* renamed from: f */
    public Object mo110f() {
        this.f68c.mo17649c();
        return this.f69d;
    }

    @Override // p003a2.InterfaceC0008d
    /* renamed from: g */
    public boolean mo92g() {
        boolean z10;
        synchronized (this.f69d) {
            if (this.f88w == a.CLEARED) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // p003a2.InterfaceC0008d
    /* renamed from: h */
    public void mo93h() {
        int i10 = 0;
        synchronized (this.f69d) {
            m113i();
            this.f68c.mo17649c();
            this.f86u = AbstractC4117g.m17210b();
            Object obj = this.f74i;
            if (obj == null) {
                if (AbstractC4122l.m17249v(this.f77l, this.f78m)) {
                    this.f62A = this.f77l;
                    this.f63B = this.f78m;
                }
                if (m120q() == null) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                m129z(new C5330q("Received null model"), i10);
                return;
            }
            a aVar = this.f88w;
            a aVar2 = a.RUNNING;
            if (aVar != aVar2) {
                if (aVar == a.COMPLETE) {
                    mo109c(this.f84s, EnumC4970a.MEMORY_CACHE, false);
                    return;
                }
                m118o(obj);
                this.f66a = AbstractC4220b.m17642b("GlideRequest");
                a aVar3 = a.WAITING_FOR_SIZE;
                this.f88w = aVar3;
                if (AbstractC4122l.m17249v(this.f77l, this.f78m)) {
                    mo130e(this.f77l, this.f78m);
                } else {
                    this.f80o.getSize(this);
                }
                a aVar4 = this.f88w;
                if ((aVar4 == aVar2 || aVar4 == aVar3) && m115l()) {
                    this.f80o.onLoadStarted(m121r());
                }
                if (f61E) {
                    m124u("finished run method in " + AbstractC4117g.m17209a(this.f86u));
                }
                return;
            }
            throw new IllegalArgumentException("Cannot restart a running request");
        }
    }

    @Override // p003a2.InterfaceC0008d
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f69d) {
            a aVar = this.f88w;
            if (aVar != a.RUNNING && aVar != a.WAITING_FOR_SIZE) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    @Override // p003a2.InterfaceC0008d
    /* renamed from: j */
    public boolean mo95j() {
        boolean z10;
        synchronized (this.f69d) {
            if (this.f88w == a.COMPLETE) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // p003a2.InterfaceC0008d
    public void pause() {
        synchronized (this.f69d) {
            if (isRunning()) {
                clear();
            }
        }
    }

    public String toString() {
        Object obj;
        Class cls;
        synchronized (this.f69d) {
            obj = this.f74i;
            cls = this.f75j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
