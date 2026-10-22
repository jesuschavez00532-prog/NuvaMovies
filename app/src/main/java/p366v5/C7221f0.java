package p366v5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p297q6.InterfaceC6348c;
import p338t6.InterfaceC6921a;
import p338t6.InterfaceC6922b;

/* renamed from: v5.f0 */
/* loaded from: classes.dex */
final class C7221f0 extends AbstractC7210a {

    /* renamed from: a */
    private final Set f26999a;

    /* renamed from: b */
    private final Set f27000b;

    /* renamed from: c */
    private final Set f27001c;

    /* renamed from: d */
    private final Set f27002d;

    /* renamed from: e */
    private final Set f27003e;

    /* renamed from: f */
    private final Set f27004f;

    /* renamed from: g */
    private final InterfaceC7218e f27005g;

    /* renamed from: v5.f0$a */
    /* loaded from: classes.dex */
    private static class a implements InterfaceC6348c {

        /* renamed from: a */
        private final Set f27006a;

        /* renamed from: b */
        private final InterfaceC6348c f27007b;

        public a(Set set, InterfaceC6348c interfaceC6348c) {
            this.f27006a = set;
            this.f27007b = interfaceC6348c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7221f0(C7216d c7216d, InterfaceC7218e interfaceC7218e) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C7233r c7233r : c7216d.m27916e()) {
            if (c7233r.m28000e()) {
                if (c7233r.m28002g()) {
                    hashSet4.add(c7233r.m27998c());
                } else {
                    hashSet.add(c7233r.m27998c());
                }
            } else if (c7233r.m27999d()) {
                hashSet3.add(c7233r.m27998c());
            } else if (c7233r.m28002g()) {
                hashSet5.add(c7233r.m27998c());
            } else {
                hashSet2.add(c7233r.m27998c());
            }
        }
        if (!c7216d.m27920i().isEmpty()) {
            hashSet.add(InterfaceC6348c.class);
        }
        this.f26999a = Collections.unmodifiableSet(hashSet);
        this.f27000b = Collections.unmodifiableSet(hashSet2);
        this.f27001c = Collections.unmodifiableSet(hashSet3);
        this.f27002d = Collections.unmodifiableSet(hashSet4);
        this.f27003e = Collections.unmodifiableSet(hashSet5);
        this.f27004f = c7216d.m27920i();
        this.f27005g = interfaceC7218e;
    }

    @Override // p366v5.AbstractC7210a, p366v5.InterfaceC7218e
    /* renamed from: a */
    public Object mo27905a(Class cls) {
        if (this.f26999a.contains(cls)) {
            Object mo27905a = this.f27005g.mo27905a(cls);
            if (!cls.equals(InterfaceC6348c.class)) {
                return mo27905a;
            }
            return new a(this.f27004f, (InterfaceC6348c) mo27905a);
        }
        throw new C7235t(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // p366v5.InterfaceC7218e
    /* renamed from: b */
    public InterfaceC6922b mo27943b(Class cls) {
        if (this.f27000b.contains(cls)) {
            return this.f27005g.mo27943b(cls);
        }
        throw new C7235t(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // p366v5.InterfaceC7218e
    /* renamed from: c */
    public InterfaceC6922b mo27944c(Class cls) {
        if (this.f27003e.contains(cls)) {
            return this.f27005g.mo27944c(cls);
        }
        throw new C7235t(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override // p366v5.AbstractC7210a, p366v5.InterfaceC7218e
    /* renamed from: d */
    public Set mo27906d(Class cls) {
        if (this.f27002d.contains(cls)) {
            return this.f27005g.mo27906d(cls);
        }
        throw new C7235t(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // p366v5.InterfaceC7218e
    /* renamed from: e */
    public InterfaceC6921a mo27945e(Class cls) {
        if (this.f27001c.contains(cls)) {
            return this.f27005g.mo27945e(cls);
        }
        throw new C7235t(String.format("Attempting to request an undeclared dependency Deferred<%s>.", cls));
    }
}
