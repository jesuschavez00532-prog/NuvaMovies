package p395x5;

import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import p038c6.AbstractC1370c0;
import p338t6.InterfaceC6921a;
import p338t6.InterfaceC6922b;

/* renamed from: x5.d */
/* loaded from: classes.dex */
public final class C7501d implements InterfaceC7498a {

    /* renamed from: c */
    private static final InterfaceC7504g f27573c = new b();

    /* renamed from: a */
    private final InterfaceC6921a f27574a;

    /* renamed from: b */
    private final AtomicReference f27575b = new AtomicReference(null);

    /* renamed from: x5.d$b */
    /* loaded from: classes.dex */
    private static final class b implements InterfaceC7504g {
        private b() {
        }

        @Override // p395x5.InterfaceC7504g
        /* renamed from: a */
        public File mo10897a() {
            return null;
        }

        @Override // p395x5.InterfaceC7504g
        /* renamed from: b */
        public File mo10898b() {
            return null;
        }

        @Override // p395x5.InterfaceC7504g
        /* renamed from: c */
        public File mo10899c() {
            return null;
        }

        @Override // p395x5.InterfaceC7504g
        /* renamed from: d */
        public File mo10900d() {
            return null;
        }

        @Override // p395x5.InterfaceC7504g
        /* renamed from: e */
        public File mo10901e() {
            return null;
        }

        @Override // p395x5.InterfaceC7504g
        /* renamed from: f */
        public File mo10902f() {
            return null;
        }
    }

    public C7501d(InterfaceC6921a interfaceC6921a) {
        this.f27574a = interfaceC6921a;
        interfaceC6921a.mo26884a(new InterfaceC6921a.a() { // from class: x5.b
            @Override // p338t6.InterfaceC6921a.a
            /* renamed from: a */
            public final void mo26885a(InterfaceC6922b interfaceC6922b) {
                C7501d.this.m28704g(interfaceC6922b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m28704g(InterfaceC6922b interfaceC6922b) {
        C7503f.m28716f().m28717b("Crashlytics native component now available.");
        this.f27575b.set((InterfaceC7498a) interfaceC6922b.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m28705h(String str, String str2, long j10, AbstractC1370c0 abstractC1370c0, InterfaceC6922b interfaceC6922b) {
        ((InterfaceC7498a) interfaceC6922b.get()).mo10882d(str, str2, j10, abstractC1370c0);
    }

    @Override // p395x5.InterfaceC7498a
    /* renamed from: a */
    public InterfaceC7504g mo10879a(String str) {
        InterfaceC7498a interfaceC7498a = (InterfaceC7498a) this.f27575b.get();
        if (interfaceC7498a == null) {
            return f27573c;
        }
        return interfaceC7498a.mo10879a(str);
    }

    @Override // p395x5.InterfaceC7498a
    /* renamed from: b */
    public boolean mo10880b() {
        InterfaceC7498a interfaceC7498a = (InterfaceC7498a) this.f27575b.get();
        if (interfaceC7498a != null && interfaceC7498a.mo10880b()) {
            return true;
        }
        return false;
    }

    @Override // p395x5.InterfaceC7498a
    /* renamed from: c */
    public boolean mo10881c(String str) {
        InterfaceC7498a interfaceC7498a = (InterfaceC7498a) this.f27575b.get();
        if (interfaceC7498a != null && interfaceC7498a.mo10881c(str)) {
            return true;
        }
        return false;
    }

    @Override // p395x5.InterfaceC7498a
    /* renamed from: d */
    public void mo10882d(final String str, final String str2, final long j10, final AbstractC1370c0 abstractC1370c0) {
        C7503f.m28716f().m28723i("Deferring native open session: " + str);
        this.f27574a.mo26884a(new InterfaceC6921a.a() { // from class: x5.c
            @Override // p338t6.InterfaceC6921a.a
            /* renamed from: a */
            public final void mo26885a(InterfaceC6922b interfaceC6922b) {
                C7501d.m28705h(str, str2, j10, abstractC1370c0, interfaceC6922b);
            }
        });
    }
}
