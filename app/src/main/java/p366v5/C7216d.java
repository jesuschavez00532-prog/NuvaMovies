package p366v5;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: v5.d */
/* loaded from: classes.dex */
public final class C7216d {

    /* renamed from: a */
    private final String f26980a;

    /* renamed from: b */
    private final Set f26981b;

    /* renamed from: c */
    private final Set f26982c;

    /* renamed from: d */
    private final int f26983d;

    /* renamed from: e */
    private final int f26984e;

    /* renamed from: f */
    private final InterfaceC7223h f26985f;

    /* renamed from: g */
    private final Set f26986g;

    /* renamed from: v5.d$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private String f26987a;

        /* renamed from: b */
        private final Set f26988b;

        /* renamed from: c */
        private final Set f26989c;

        /* renamed from: d */
        private int f26990d;

        /* renamed from: e */
        private int f26991e;

        /* renamed from: f */
        private InterfaceC7223h f26992f;

        /* renamed from: g */
        private Set f26993g;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public b m27926g() {
            this.f26991e = 1;
            return this;
        }

        /* renamed from: h */
        private b m27927h(int i10) {
            boolean z10 = false;
            if (this.f26990d == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            AbstractC7219e0.m27949d(z10, "Instantiation type has already been set.");
            this.f26990d = i10;
            return this;
        }

        /* renamed from: i */
        private void m27928i(Class cls) {
            AbstractC7219e0.m27946a(!this.f26988b.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* renamed from: b */
        public b m27929b(C7233r c7233r) {
            AbstractC7219e0.m27948c(c7233r, "Null dependency");
            m27928i(c7233r.m27998c());
            this.f26989c.add(c7233r);
            return this;
        }

        /* renamed from: c */
        public b m27930c() {
            return m27927h(1);
        }

        /* renamed from: d */
        public C7216d m27931d() {
            boolean z10 = false;
            if (this.f26992f != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            AbstractC7219e0.m27949d(z10, "Missing required property: factory.");
            return new C7216d(this.f26987a, new HashSet(this.f26988b), new HashSet(this.f26989c), this.f26990d, this.f26991e, this.f26992f, this.f26993g);
        }

        /* renamed from: e */
        public b m27932e() {
            return m27927h(2);
        }

        /* renamed from: f */
        public b m27933f(InterfaceC7223h interfaceC7223h) {
            this.f26992f = (InterfaceC7223h) AbstractC7219e0.m27948c(interfaceC7223h, "Null factory");
            return this;
        }

        private b(Class cls, Class... clsArr) {
            this.f26987a = null;
            HashSet hashSet = new HashSet();
            this.f26988b = hashSet;
            this.f26989c = new HashSet();
            this.f26990d = 0;
            this.f26991e = 0;
            this.f26993g = new HashSet();
            AbstractC7219e0.m27948c(cls, "Null interface");
            hashSet.add(cls);
            for (Class cls2 : clsArr) {
                AbstractC7219e0.m27948c(cls2, "Null interface");
            }
            Collections.addAll(this.f26988b, clsArr);
        }
    }

    /* renamed from: c */
    public static b m27909c(Class cls) {
        return new b(cls, new Class[0]);
    }

    /* renamed from: d */
    public static b m27910d(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    /* renamed from: j */
    public static C7216d m27911j(final Object obj, Class cls) {
        return m27912k(cls).m27933f(new InterfaceC7223h() { // from class: v5.b
            @Override // p366v5.InterfaceC7223h
            /* renamed from: a */
            public final Object mo5191a(InterfaceC7218e interfaceC7218e) {
                Object m27913o = null;
                m27913o = C7216d.m27913o(obj, interfaceC7218e);
                return m27913o;
            }
        }).m27931d();
    }

    /* renamed from: k */
    public static b m27912k(Class cls) {
        return m27909c(cls).m27926g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ Object m27913o(Object obj, InterfaceC7218e interfaceC7218e) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ Object m27914p(Object obj, InterfaceC7218e interfaceC7218e) {
        return obj;
    }

    /* renamed from: q */
    public static C7216d m27915q(final Object obj, Class cls, Class... clsArr) {
        return m27910d(cls, clsArr).m27933f(new InterfaceC7223h() { // from class: v5.c
            @Override // p366v5.InterfaceC7223h
            /* renamed from: a */
            public final Object mo5191a(InterfaceC7218e interfaceC7218e) {
                Object m27914p = null;
                m27914p = C7216d.m27914p(obj, interfaceC7218e);
                return m27914p;
            }
        }).m27931d();
    }

    /* renamed from: e */
    public Set m27916e() {
        return this.f26982c;
    }

    /* renamed from: f */
    public InterfaceC7223h m27917f() {
        return this.f26985f;
    }

    /* renamed from: g */
    public String m27918g() {
        return this.f26980a;
    }

    /* renamed from: h */
    public Set m27919h() {
        return this.f26981b;
    }

    /* renamed from: i */
    public Set m27920i() {
        return this.f26986g;
    }

    /* renamed from: l */
    public boolean m27921l() {
        if (this.f26983d == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean m27922m() {
        if (this.f26983d == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public boolean m27923n() {
        if (this.f26984e == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public C7216d m27924r(InterfaceC7223h interfaceC7223h) {
        return new C7216d(this.f26980a, this.f26981b, this.f26982c, this.f26983d, this.f26984e, interfaceC7223h, this.f26986g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f26981b.toArray()) + ">{" + this.f26983d + ", type=" + this.f26984e + ", deps=" + Arrays.toString(this.f26982c.toArray()) + "}";
    }

    private C7216d(String str, Set set, Set set2, int i10, int i11, InterfaceC7223h interfaceC7223h, Set set3) {
        this.f26980a = str;
        this.f26981b = Collections.unmodifiableSet(set);
        this.f26982c = Collections.unmodifiableSet(set2);
        this.f26983d = i10;
        this.f26984e = i11;
        this.f26985f = interfaceC7223h;
        this.f26986g = Collections.unmodifiableSet(set3);
    }
}
