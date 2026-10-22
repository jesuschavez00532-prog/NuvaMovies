package ee;

import com.lzy.okgo.cache.CacheEntity;
import ee.InterfaceC4184g;
import java.io.Serializable;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import ne.AbstractC5869l;

/* renamed from: ee.c */
/* loaded from: classes3.dex */
public final class C4180c implements InterfaceC4184g, Serializable {

    /* renamed from: a */
    private final InterfaceC4184g f18293a;

    /* renamed from: b */
    private final InterfaceC4184g.b f18294b;

    /* renamed from: ee.c$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC5869l implements InterfaceC5664p {

        /* renamed from: a */
        public static final a f18295a = new a();

        a() {
            super(2);
        }

        @Override // me.InterfaceC5664p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo2391h(String str, InterfaceC4184g.b bVar) {
            boolean z10;
            AbstractC5868k.m23674f(str, "acc");
            AbstractC5868k.m23674f(bVar, "element");
            if (str.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public C4180c(InterfaceC4184g interfaceC4184g, InterfaceC4184g.b bVar) {
        AbstractC5868k.m23674f(interfaceC4184g, "left");
        AbstractC5868k.m23674f(bVar, "element");
        this.f18293a = interfaceC4184g;
        this.f18294b = bVar;
    }

    /* renamed from: d */
    private final boolean m17482d(InterfaceC4184g.b bVar) {
        return AbstractC5868k.m23669a(get(bVar.getKey()), bVar);
    }

    /* renamed from: e */
    private final boolean m17483e(C4180c c4180c) {
        while (m17482d(c4180c.f18294b)) {
            InterfaceC4184g interfaceC4184g = c4180c.f18293a;
            if (interfaceC4184g instanceof C4180c) {
                c4180c = (C4180c) interfaceC4184g;
            } else {
                AbstractC5868k.m23672d(interfaceC4184g, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return m17482d((InterfaceC4184g.b) interfaceC4184g);
            }
        }
        return false;
    }

    /* renamed from: g */
    private final int m17484g() {
        int i10 = 2;
        C4180c c4180c = this;
        while (true) {
            InterfaceC4184g interfaceC4184g = c4180c.f18293a;
            if (interfaceC4184g instanceof C4180c) {
                c4180c = (C4180c) interfaceC4184g;
            } else {
                c4180c = null;
            }
            if (c4180c == null) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4180c) {
                C4180c c4180c = (C4180c) obj;
                if (c4180c.m17484g() != m17484g() || !c4180c.m17483e(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // ee.InterfaceC4184g
    public Object fold(Object obj, InterfaceC5664p interfaceC5664p) {
        AbstractC5868k.m23674f(interfaceC5664p, "operation");
        return interfaceC5664p.mo2391h(this.f18293a.fold(obj, interfaceC5664p), this.f18294b);
    }

    @Override // ee.InterfaceC4184g
    public InterfaceC4184g.b get(InterfaceC4184g.c cVar) {
        AbstractC5868k.m23674f(cVar, CacheEntity.KEY);
        C4180c c4180c = this;
        while (true) {
            InterfaceC4184g.b bVar = c4180c.f18294b.get(cVar);
            if (bVar != null) {
                return bVar;
            }
            InterfaceC4184g interfaceC4184g = c4180c.f18293a;
            if (interfaceC4184g instanceof C4180c) {
                c4180c = (C4180c) interfaceC4184g;
            } else {
                return interfaceC4184g.get(cVar);
            }
        }
    }

    public int hashCode() {
        return this.f18293a.hashCode() + this.f18294b.hashCode();
    }

    @Override // ee.InterfaceC4184g
    public InterfaceC4184g minusKey(InterfaceC4184g.c cVar) {
        AbstractC5868k.m23674f(cVar, CacheEntity.KEY);
        if (this.f18294b.get(cVar) != null) {
            return this.f18293a;
        }
        InterfaceC4184g minusKey = this.f18293a.minusKey(cVar);
        if (minusKey == this.f18293a) {
            return this;
        }
        if (minusKey == C4185h.f18299a) {
            return this.f18294b;
        }
        return new C4180c(minusKey, this.f18294b);
    }

    @Override // ee.InterfaceC4184g
    public InterfaceC4184g plus(InterfaceC4184g interfaceC4184g) {
        return InterfaceC4184g.a.m17493a(this, interfaceC4184g);
    }

    public String toString() {
        return '[' + ((String) fold("", a.f18295a)) + ']';
    }
}
