package p344te;

import be.AbstractC1319o;
import be.AbstractC1320p;
import be.C1328x;
import ee.C4185h;
import ee.InterfaceC4181d;
import ee.InterfaceC4184g;
import ge.AbstractC4441h;
import java.util.Iterator;
import java.util.NoSuchElementException;
import ne.AbstractC5868k;
import p136fe.AbstractC4313d;
import p269oe.InterfaceC5974a;

/* renamed from: te.c */
/* loaded from: classes3.dex */
final class C6943c extends AbstractC6944d implements Iterator, InterfaceC4181d, InterfaceC5974a {

    /* renamed from: a */
    private int f26312a;

    /* renamed from: b */
    private Object f26313b;

    /* renamed from: c */
    private Iterator f26314c;

    /* renamed from: d */
    private InterfaceC4181d f26315d;

    /* renamed from: h */
    private final Throwable m26976h() {
        int i10 = this.f26312a;
        if (i10 != 4) {
            if (i10 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f26312a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    /* renamed from: i */
    private final Object m26977i() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // p344te.AbstractC6944d
    /* renamed from: b */
    public Object mo26978b(Object obj, InterfaceC4181d interfaceC4181d) {
        Object m18094c;
        Object m18094c2;
        Object m18094c3;
        this.f26313b = obj;
        this.f26312a = 3;
        this.f26315d = interfaceC4181d;
        m18094c = AbstractC4313d.m18094c();
        m18094c2 = AbstractC4313d.m18094c();
        if (m18094c == m18094c2) {
            AbstractC4441h.m18639c(interfaceC4181d);
        }
        m18094c3 = AbstractC4313d.m18094c();
        if (m18094c == m18094c3) {
            return m18094c;
        }
        return C1328x.f4998a;
    }

    @Override // p344te.AbstractC6944d
    /* renamed from: c */
    public Object mo26979c(Iterator it, InterfaceC4181d interfaceC4181d) {
        Object m18094c;
        Object m18094c2;
        Object m18094c3;
        if (!it.hasNext()) {
            return C1328x.f4998a;
        }
        this.f26314c = it;
        this.f26312a = 2;
        this.f26315d = interfaceC4181d;
        m18094c = AbstractC4313d.m18094c();
        m18094c2 = AbstractC4313d.m18094c();
        if (m18094c == m18094c2) {
            AbstractC4441h.m18639c(interfaceC4181d);
        }
        m18094c3 = AbstractC4313d.m18094c();
        if (m18094c == m18094c3) {
            return m18094c;
        }
        return C1328x.f4998a;
    }

    @Override // ee.InterfaceC4181d
    /* renamed from: d */
    public void mo17486d(Object obj) {
        AbstractC1320p.m5976b(obj);
        this.f26312a = 4;
    }

    @Override // ee.InterfaceC4181d
    /* renamed from: e */
    public InterfaceC4184g mo17487e() {
        return C4185h.f18299a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i10 = this.f26312a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw m26976h();
                }
                Iterator it = this.f26314c;
                AbstractC5868k.m23671c(it);
                if (it.hasNext()) {
                    this.f26312a = 2;
                    return true;
                }
                this.f26314c = null;
            }
            this.f26312a = 5;
            InterfaceC4181d interfaceC4181d = this.f26315d;
            AbstractC5868k.m23671c(interfaceC4181d);
            this.f26315d = null;
            AbstractC1319o.a aVar = AbstractC1319o.f4987a;
            interfaceC4181d.mo17486d(AbstractC1319o.m5971a(C1328x.f4998a));
        }
    }

    /* renamed from: k */
    public final void m26980k(InterfaceC4181d interfaceC4181d) {
        this.f26315d = interfaceC4181d;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i10 = this.f26312a;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f26312a = 0;
                    Object obj = this.f26313b;
                    this.f26313b = null;
                    return obj;
                }
                throw m26976h();
            }
            this.f26312a = 1;
            Iterator it = this.f26314c;
            AbstractC5868k.m23671c(it);
            return it.next();
        }
        return m26977i();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
