package p005a4;

import java.util.concurrent.Executor;
import javax.inject.Provider;
import p024b4.InterfaceC1055d;
import p036c4.InterfaceC1358b;
import p364v3.InterfaceC7199b;

/* renamed from: a4.q0 */
/* loaded from: classes.dex */
public final class C0050q0 implements InterfaceC7199b {

    /* renamed from: a */
    private final Provider f171a;

    /* renamed from: b */
    private final Provider f172b;

    /* renamed from: c */
    private final Provider f173c;

    /* renamed from: d */
    private final Provider f174d;

    public C0050q0(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f171a = provider;
        this.f172b = provider2;
        this.f173c = provider3;
        this.f174d = provider4;
    }

    /* renamed from: a */
    public static C0050q0 m194a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C0050q0(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static C0048p0 m195c(Executor executor, InterfaceC1055d interfaceC1055d, InterfaceC0052r0 interfaceC0052r0, InterfaceC1358b interfaceC1358b) {
        return new C0048p0(executor, interfaceC1055d, interfaceC0052r0, interfaceC1358b);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0048p0 get() {
        return m195c((Executor) this.f171a.get(), (InterfaceC1055d) this.f172b.get(), (InterfaceC0052r0) this.f173c.get(), (InterfaceC1358b) this.f174d.get());
    }
}
