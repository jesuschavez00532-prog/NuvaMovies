package p424z3;

import java.util.concurrent.Executor;
import javax.inject.Provider;
import p005a4.InterfaceC0052r0;
import p024b4.InterfaceC1055d;
import p036c4.InterfaceC1358b;
import p335t3.InterfaceC6897e;
import p364v3.InterfaceC7199b;

/* renamed from: z3.d */
/* loaded from: classes.dex */
public final class C7748d implements InterfaceC7199b {

    /* renamed from: a */
    private final Provider f28529a;

    /* renamed from: b */
    private final Provider f28530b;

    /* renamed from: c */
    private final Provider f28531c;

    /* renamed from: d */
    private final Provider f28532d;

    /* renamed from: e */
    private final Provider f28533e;

    public C7748d(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f28529a = provider;
        this.f28530b = provider2;
        this.f28531c = provider3;
        this.f28532d = provider4;
        this.f28533e = provider5;
    }

    /* renamed from: a */
    public static C7748d m29950a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new C7748d(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static C7747c m29951c(Executor executor, InterfaceC6897e interfaceC6897e, InterfaceC0052r0 interfaceC0052r0, InterfaceC1055d interfaceC1055d, InterfaceC1358b interfaceC1358b) {
        return new C7747c(executor, interfaceC6897e, interfaceC0052r0, interfaceC1055d, interfaceC1358b);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C7747c get() {
        return m29951c((Executor) this.f28529a.get(), (InterfaceC6897e) this.f28530b.get(), (InterfaceC0052r0) this.f28531c.get(), (InterfaceC1055d) this.f28532d.get(), (InterfaceC1358b) this.f28533e.get());
    }
}
