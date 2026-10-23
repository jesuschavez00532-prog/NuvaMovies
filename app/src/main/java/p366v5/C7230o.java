package p366v5;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p203k4.AbstractC5127x;
import p221l6.InterfaceC5421a;
import p297q6.InterfaceC6348c;
import p297q6.InterfaceC6349d;
import p338t6.InterfaceC6921a;
import p338t6.InterfaceC6922b;
import p366v5.C7230o;

/* renamed from: v5.o */
/* loaded from: classes.dex */
public class C7230o extends AbstractC7210a implements InterfaceC5421a {

    /* renamed from: h */
    private static final InterfaceC6922b f27018h = new InterfaceC6922b() { // from class: v5.l
        @Override // p338t6.InterfaceC6922b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a */
    private final Map f27019a;

    /* renamed from: b */
    private final Map f27020b;

    /* renamed from: c */
    private final Map f27021c;

    /* renamed from: d */
    private final List f27022d;

    /* renamed from: e */
    private final C7237v f27023e;

    /* renamed from: f */
    private final AtomicReference f27024f;

    /* renamed from: g */
    private final InterfaceC7225j f27025g;

    /* renamed from: v5.o$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final Executor f27026a;

        /* renamed from: b */
        private final List f27027b = new ArrayList();

        /* renamed from: c */
        private final List f27028c = new ArrayList();

        /* renamed from: d */
        private InterfaceC7225j f27029d = InterfaceC7225j.f27011a;

        b(Executor executor) {
            this.f27026a = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ ComponentRegistrar m27974f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        /* renamed from: b */
        public b m27975b(C7216d c7216d) {
            this.f27028c.add(c7216d);
            return this;
        }

        /* renamed from: c */
        public b m27976c(final ComponentRegistrar componentRegistrar) {
            this.f27027b.add(new InterfaceC6922b() { // from class: v5.p
                @Override // p338t6.InterfaceC6922b
                public final Object get() {
                    ComponentRegistrar m27974f;
                    m27974f = C7230o.b.m27974f(ComponentRegistrar.this);
                    return m27974f;
                }
            });
            return this;
        }

        /* renamed from: d */
        public b m27977d(Collection collection) {
            this.f27027b.addAll(collection);
            return this;
        }

        /* renamed from: e */
        public C7230o m27978e() {
            return new C7230o(this.f27026a, this.f27027b, this.f27028c, this.f27029d);
        }

        /* renamed from: g */
        public b m27979g(InterfaceC7225j interfaceC7225j) {
            this.f27029d = interfaceC7225j;
            return this;
        }
    }

    /* renamed from: i */
    public static b m27961i(Executor executor) {
        return new b(executor);
    }

    /* renamed from: j */
    private void m27962j(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f27022d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC6922b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f27025g.mo6438a(componentRegistrar));
                        it.remove();
                    }
                } catch (C7238w e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            if (this.f27019a.isEmpty()) {
                AbstractC7232q.m27980a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f27019a.keySet());
                arrayList2.addAll(list);
                AbstractC7232q.m27980a(arrayList2);
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                final C7216d c7216d = (C7216d) it2.next();
                this.f27019a.put(c7216d, new C7239x(new InterfaceC6922b() { // from class: v5.k
                    @Override // p338t6.InterfaceC6922b
                    public final Object get() {
                        Object m27965n = null;
                        m27965n = C7230o.this.m27965n(c7216d);
                        return m27965n;
                    }
                }));
            }
            arrayList.addAll(m27970s(list));
            arrayList.addAll(m27971t());
            m27969r();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        m27968q();
    }

    /* renamed from: k */
    private void m27963k(Map map, boolean z10) {
        for (Map.Entry entry : map.entrySet()) {
            C7216d c7216d = (C7216d) entry.getKey();
            InterfaceC6922b interfaceC6922b = (InterfaceC6922b) entry.getValue();
            if (c7216d.m27921l() || (c7216d.m27922m() && z10)) {
                interfaceC6922b.get();
            }
        }
        this.f27023e.m28006d();
    }

    /* renamed from: m */
    private static List m27964m(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m27965n(C7216d c7216d) {
        return c7216d.m27917f().mo5191a(new C7221f0(c7216d, this));
    }

    /* renamed from: q */
    private void m27968q() {
        Boolean bool = (Boolean) this.f27024f.get();
        if (bool != null) {
            m27963k(this.f27019a, bool.booleanValue());
        }
    }

    /* renamed from: r */
    private void m27969r() {
        for (C7216d c7216d : this.f27019a.keySet()) {
            for (C7233r c7233r : c7216d.m27916e()) {
                if (c7233r.m28002g() && !this.f27021c.containsKey(c7233r.m27998c())) {
                    this.f27021c.put(c7233r.m27998c(), C7240y.m28008b(Collections.emptySet()));
                } else if (this.f27020b.containsKey(c7233r.m27998c())) {
                    continue;
                } else if (!c7233r.m28001f()) {
                    if (!c7233r.m28002g()) {
                        this.f27020b.put(c7233r.m27998c(), C7217d0.m27937e());
                    }
                } else {
                    throw new C7241z(String.format("Unsatisfied dependency for component %s: %s", c7216d, c7233r.m27998c()));
                }
            }
        }
    }

    /* renamed from: s */
    private List m27970s(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7216d c7216d = (C7216d) it.next();
            if (c7216d.m27923n()) {
                final InterfaceC6922b interfaceC6922b = (InterfaceC6922b) this.f27019a.get(c7216d);
                for (Class cls : c7216d.m27919h()) {
                    if (!this.f27020b.containsKey(cls)) {
                        this.f27020b.put(cls, interfaceC6922b);
                    } else {
                        final C7217d0 c7217d0 = (C7217d0) ((InterfaceC6922b) this.f27020b.get(cls));
                        arrayList.add(new Runnable() { // from class: v5.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                C7217d0.this.m27942j(interfaceC6922b);
                            }
                        });
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: t */
    private List m27971t() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f27019a.entrySet()) {
            C7216d c7216d = (C7216d) entry.getKey();
            if (!c7216d.m27923n()) {
                InterfaceC6922b interfaceC6922b = (InterfaceC6922b) entry.getValue();
                for (Class cls : c7216d.m27919h()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(interfaceC6922b);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.f27021c.containsKey(entry2.getKey())) {
                this.f27021c.put((Class) entry2.getKey(), C7240y.m28008b((Collection) entry2.getValue()));
            } else {
                final C7240y c7240y = (C7240y) this.f27021c.get(entry2.getKey());
                for (final InterfaceC6922b interfaceC6922b2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: v5.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            C7240y.this.m28010a(interfaceC6922b2);
                        }
                    });
                }
            }
        }
        return arrayList;
    }

    @Override // p366v5.AbstractC7210a, p366v5.InterfaceC7218e
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo27905a(Class cls) {
        return super.mo27905a(cls);
    }

    @Override // p366v5.InterfaceC7218e
    /* renamed from: b */
    public synchronized InterfaceC6922b mo27943b(Class cls) {
        AbstractC7219e0.m27948c(cls, "Null interface requested.");
        return (InterfaceC6922b) this.f27020b.get(cls);
    }

    @Override // p366v5.InterfaceC7218e
    /* renamed from: c */
    public synchronized InterfaceC6922b mo27944c(Class cls) {
        C7240y c7240y = (C7240y) this.f27021c.get(cls);
        if (c7240y != null) {
            return c7240y;
        }
        return f27018h;
    }

    @Override // p366v5.AbstractC7210a, p366v5.InterfaceC7218e
    /* renamed from: d */
    public /* bridge */ /* synthetic */ Set mo27906d(Class cls) {
        return super.mo27906d(cls);
    }

    @Override // p366v5.InterfaceC7218e
    /* renamed from: e */
    public InterfaceC6921a mo27945e(Class cls) {
        InterfaceC6922b mo27943b = mo27943b(cls);
        if (mo27943b == null) {
            return C7217d0.m27937e();
        }
        if (mo27943b instanceof C7217d0) {
            return (C7217d0) mo27943b;
        }
        return C7217d0.m27941i(mo27943b);
    }

    /* renamed from: l */
    public void m27972l(boolean z10) {
        HashMap hashMap;
        if (!AbstractC5127x.m20760a(this.f27024f, null, Boolean.valueOf(z10))) {
            return;
        }
        synchronized (this) {
            hashMap = new HashMap(this.f27019a);
        }
        m27963k(hashMap, z10);
    }

    private C7230o(Executor executor, Iterable iterable, Collection collection, InterfaceC7225j interfaceC7225j) {
        this.f27019a = new HashMap();
        this.f27020b = new HashMap();
        this.f27021c = new HashMap();
        this.f27024f = new AtomicReference();
        C7237v c7237v = new C7237v(executor);
        this.f27023e = c7237v;
        this.f27025g = interfaceC7225j;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C7216d.m27915q(c7237v, C7237v.class, InterfaceC6349d.class, InterfaceC6348c.class));
        arrayList.add(C7216d.m27915q(this, InterfaceC5421a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C7216d c7216d = (C7216d) it.next();
            if (c7216d != null) {
                arrayList.add(c7216d);
            }
        }
        this.f27022d = m27964m(iterable);
        m27962j(arrayList);
    }
}
