package p366v5;

import p338t6.InterfaceC6921a;
import p338t6.InterfaceC6922b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: v5.d0 */
/* loaded from: classes.dex */
public class C7217d0 implements InterfaceC6922b, InterfaceC6921a {

    /* renamed from: c */
    private static final InterfaceC6921a.a f26994c = new InterfaceC6921a.a() { // from class: v5.a0
        @Override // p338t6.InterfaceC6921a.a
        /* renamed from: a */
        public final void mo26885a(InterfaceC6922b interfaceC6922b) {
            C7217d0.m27938f(interfaceC6922b);
        }
    };

    /* renamed from: d */
    private static final InterfaceC6922b f26995d = new InterfaceC6922b() { // from class: v5.b0
        @Override // p338t6.InterfaceC6922b
        public final Object get() {
            Object m27939g;
            m27939g = C7217d0.m27939g();
            return m27939g;
        }
    };

    /* renamed from: a */
    private InterfaceC6921a.a f26996a;

    /* renamed from: b */
    private volatile InterfaceC6922b f26997b;

    private C7217d0(InterfaceC6921a.a aVar, InterfaceC6922b interfaceC6922b) {
        this.f26996a = aVar;
        this.f26997b = interfaceC6922b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C7217d0 m27937e() {
        return new C7217d0(f26994c, f26995d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m27938f(InterfaceC6922b interfaceC6922b) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ Object m27939g() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m27940h(InterfaceC6921a.a aVar, InterfaceC6921a.a aVar2, InterfaceC6922b interfaceC6922b) {
        aVar.mo26885a(interfaceC6922b);
        aVar2.mo26885a(interfaceC6922b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static C7217d0 m27941i(InterfaceC6922b interfaceC6922b) {
        return new C7217d0(null, interfaceC6922b);
    }

    @Override // p338t6.InterfaceC6921a
    /* renamed from: a */
    public void mo26884a(final InterfaceC6921a.a aVar) {
        InterfaceC6922b interfaceC6922b;
        InterfaceC6922b interfaceC6922b2;
        InterfaceC6922b interfaceC6922b3 = this.f26997b;
        InterfaceC6922b interfaceC6922b4 = f26995d;
        if (interfaceC6922b3 != interfaceC6922b4) {
            aVar.mo26885a(interfaceC6922b3);
            return;
        }
        synchronized (this) {
            interfaceC6922b = this.f26997b;
            if (interfaceC6922b != interfaceC6922b4) {
                interfaceC6922b2 = interfaceC6922b;
            } else {
                final InterfaceC6921a.a aVar2 = this.f26996a;
                this.f26996a = new InterfaceC6921a.a() { // from class: v5.c0
                    @Override // p338t6.InterfaceC6921a.a
                    /* renamed from: a */
                    public final void mo26885a(InterfaceC6922b interfaceC6922b5) {
                        C7217d0.m27940h(InterfaceC6921a.a.this, aVar, interfaceC6922b5);
                    }
                };
                interfaceC6922b2 = null;
            }
        }
        if (interfaceC6922b2 != null) {
            aVar.mo26885a(interfaceC6922b);
        }
    }

    @Override // p338t6.InterfaceC6922b
    public Object get() {
        return this.f26997b.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m27942j(InterfaceC6922b interfaceC6922b) {
        InterfaceC6921a.a aVar;
        if (this.f26997b == f26995d) {
            synchronized (this) {
                aVar = this.f26996a;
                this.f26996a = null;
                this.f26997b = interfaceC6922b;
            }
            aVar.mo26885a(interfaceC6922b);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }
}
