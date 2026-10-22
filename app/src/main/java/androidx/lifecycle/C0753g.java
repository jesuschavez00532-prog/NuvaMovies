package androidx.lifecycle;

import androidx.lifecycle.AbstractC0749c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p167i.C4836a;
import p182j.C4965a;
import p182j.C4966b;

/* renamed from: androidx.lifecycle.g */
/* loaded from: classes.dex */
public class C0753g extends AbstractC0749c {

    /* renamed from: b */
    private C4965a f3133b;

    /* renamed from: c */
    private AbstractC0749c.c f3134c;

    /* renamed from: d */
    private final WeakReference f3135d;

    /* renamed from: e */
    private int f3136e;

    /* renamed from: f */
    private boolean f3137f;

    /* renamed from: g */
    private boolean f3138g;

    /* renamed from: h */
    private ArrayList f3139h;

    /* renamed from: i */
    private final boolean f3140i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.g$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        AbstractC0749c.c f3141a;

        /* renamed from: b */
        InterfaceC0750d f3142b;

        a(InterfaceC0751e interfaceC0751e, AbstractC0749c.c cVar) {
            this.f3142b = AbstractC0754h.m3729f(interfaceC0751e);
            this.f3141a = cVar;
        }

        /* renamed from: a */
        void m3723a(InterfaceC0752f interfaceC0752f, AbstractC0749c.b bVar) {
            AbstractC0749c.c m3708b = bVar.m3708b();
            this.f3141a = C0753g.m3715k(this.f3141a, m3708b);
            this.f3142b.onStateChanged(interfaceC0752f, bVar);
            this.f3141a = m3708b;
        }
    }

    public C0753g(InterfaceC0752f interfaceC0752f) {
        this(interfaceC0752f, true);
    }

    /* renamed from: d */
    private void m3710d(InterfaceC0752f interfaceC0752f) {
        Iterator descendingIterator = this.f3133b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f3138g) {
            Map.Entry entry = (Map.Entry) descendingIterator.next();
            a aVar = (a) entry.getValue();
            while (aVar.f3141a.compareTo(this.f3134c) > 0 && !this.f3138g && this.f3133b.contains(entry.getKey())) {
                AbstractC0749c.b m3706a = AbstractC0749c.b.m3706a(aVar.f3141a);
                if (m3706a != null) {
                    m3718n(m3706a.m3708b());
                    aVar.m3723a(interfaceC0752f, m3706a);
                    m3717m();
                } else {
                    throw new IllegalStateException("no event down from " + aVar.f3141a);
                }
            }
        }
    }

    /* renamed from: e */
    private AbstractC0749c.c m3711e(InterfaceC0751e interfaceC0751e) {
        AbstractC0749c.c cVar;
        Map.Entry m20298p = this.f3133b.m20298p(interfaceC0751e);
        AbstractC0749c.c cVar2 = null;
        if (m20298p != null) {
            cVar = ((a) m20298p.getValue()).f3141a;
        } else {
            cVar = null;
        }
        if (!this.f3139h.isEmpty()) {
            cVar2 = (AbstractC0749c.c) this.f3139h.get(r0.size() - 1);
        }
        return m3715k(m3715k(this.f3134c, cVar), cVar2);
    }

    /* renamed from: f */
    private void m3712f(String str) {
        if (this.f3140i && !C4836a.m19914d().mo19916b()) {
            throw new IllegalStateException("Method " + str + " must be called on the main thread");
        }
    }

    /* renamed from: g */
    private void m3713g(InterfaceC0752f interfaceC0752f) {
        C4966b.d m20300i = this.f3133b.m20300i();
        while (m20300i.hasNext() && !this.f3138g) {
            Map.Entry entry = (Map.Entry) m20300i.next();
            a aVar = (a) entry.getValue();
            while (aVar.f3141a.compareTo(this.f3134c) < 0 && !this.f3138g && this.f3133b.contains(entry.getKey())) {
                m3718n(aVar.f3141a);
                AbstractC0749c.b m3707c = AbstractC0749c.b.m3707c(aVar.f3141a);
                if (m3707c != null) {
                    aVar.m3723a(interfaceC0752f, m3707c);
                    m3717m();
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f3141a);
                }
            }
        }
    }

    /* renamed from: i */
    private boolean m3714i() {
        if (this.f3133b.size() == 0) {
            return true;
        }
        AbstractC0749c.c cVar = ((a) this.f3133b.m20299c().getValue()).f3141a;
        AbstractC0749c.c cVar2 = ((a) this.f3133b.m20301j().getValue()).f3141a;
        if (cVar == cVar2 && this.f3134c == cVar2) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    static AbstractC0749c.c m3715k(AbstractC0749c.c cVar, AbstractC0749c.c cVar2) {
        if (cVar2 != null && cVar2.compareTo(cVar) < 0) {
            return cVar2;
        }
        return cVar;
    }

    /* renamed from: l */
    private void m3716l(AbstractC0749c.c cVar) {
        if (this.f3134c == cVar) {
            return;
        }
        this.f3134c = cVar;
        if (!this.f3137f && this.f3136e == 0) {
            this.f3137f = true;
            m3719p();
            this.f3137f = false;
            return;
        }
        this.f3138g = true;
    }

    /* renamed from: m */
    private void m3717m() {
        this.f3139h.remove(r0.size() - 1);
    }

    /* renamed from: n */
    private void m3718n(AbstractC0749c.c cVar) {
        this.f3139h.add(cVar);
    }

    /* renamed from: p */
    private void m3719p() {
        InterfaceC0752f interfaceC0752f = (InterfaceC0752f) this.f3135d.get();
        if (interfaceC0752f != null) {
            while (!m3714i()) {
                this.f3138g = false;
                if (this.f3134c.compareTo(((a) this.f3133b.m20299c().getValue()).f3141a) < 0) {
                    m3710d(interfaceC0752f);
                }
                Map.Entry m20301j = this.f3133b.m20301j();
                if (!this.f3138g && m20301j != null && this.f3134c.compareTo(((a) m20301j.getValue()).f3141a) > 0) {
                    m3713g(interfaceC0752f);
                }
            }
            this.f3138g = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    @Override // androidx.lifecycle.AbstractC0749c
    /* renamed from: a */
    public void mo3703a(InterfaceC0751e interfaceC0751e) {
        InterfaceC0752f interfaceC0752f;
        boolean z10;
        m3712f("addObserver");
        AbstractC0749c.c cVar = this.f3134c;
        AbstractC0749c.c cVar2 = AbstractC0749c.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = AbstractC0749c.c.INITIALIZED;
        }
        a aVar = new a(interfaceC0751e, cVar2);
        if (((a) this.f3133b.mo20296n(interfaceC0751e, aVar)) != null || (interfaceC0752f = (InterfaceC0752f) this.f3135d.get()) == null) {
            return;
        }
        if (this.f3136e == 0 && !this.f3137f) {
            z10 = false;
        } else {
            z10 = true;
        }
        AbstractC0749c.c m3711e = m3711e(interfaceC0751e);
        this.f3136e++;
        while (aVar.f3141a.compareTo(m3711e) < 0 && this.f3133b.contains(interfaceC0751e)) {
            m3718n(aVar.f3141a);
            AbstractC0749c.b m3707c = AbstractC0749c.b.m3707c(aVar.f3141a);
            if (m3707c != null) {
                aVar.m3723a(interfaceC0752f, m3707c);
                m3717m();
                m3711e = m3711e(interfaceC0751e);
            } else {
                throw new IllegalStateException("no event up from " + aVar.f3141a);
            }
        }
        if (!z10) {
            m3719p();
        }
        this.f3136e--;
    }

    @Override // androidx.lifecycle.AbstractC0749c
    /* renamed from: b */
    public AbstractC0749c.c mo3704b() {
        return this.f3134c;
    }

    @Override // androidx.lifecycle.AbstractC0749c
    /* renamed from: c */
    public void mo3705c(InterfaceC0751e interfaceC0751e) {
        m3712f("removeObserver");
        this.f3133b.mo20297o(interfaceC0751e);
    }

    /* renamed from: h */
    public void m3720h(AbstractC0749c.b bVar) {
        m3712f("handleLifecycleEvent");
        m3716l(bVar.m3708b());
    }

    /* renamed from: j */
    public void m3721j(AbstractC0749c.c cVar) {
        m3712f("markState");
        m3722o(cVar);
    }

    /* renamed from: o */
    public void m3722o(AbstractC0749c.c cVar) {
        m3712f("setCurrentState");
        m3716l(cVar);
    }

    private C0753g(InterfaceC0752f interfaceC0752f, boolean z10) {
        this.f3133b = new C4965a();
        this.f3136e = 0;
        this.f3137f = false;
        this.f3138g = false;
        this.f3139h = new ArrayList();
        this.f3135d = new WeakReference(interfaceC0752f);
        this.f3134c = AbstractC0749c.c.INITIALIZED;
        this.f3140i = z10;
    }
}
