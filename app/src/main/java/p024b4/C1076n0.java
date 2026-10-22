package p024b4;

import javax.inject.Provider;
import p095d4.InterfaceC3935a;
import p349u3.InterfaceC7031a;
import p364v3.C7198a;
import p364v3.InterfaceC7199b;

/* renamed from: b4.n0 */
/* loaded from: classes.dex */
public final class C1076n0 implements InterfaceC7199b {

    /* renamed from: a */
    private final Provider f4361a;

    /* renamed from: b */
    private final Provider f4362b;

    /* renamed from: c */
    private final Provider f4363c;

    /* renamed from: d */
    private final Provider f4364d;

    /* renamed from: e */
    private final Provider f4365e;

    public C1076n0(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f4361a = provider;
        this.f4362b = provider2;
        this.f4363c = provider3;
        this.f4364d = provider4;
        this.f4365e = provider5;
    }

    /* renamed from: a */
    public static C1076n0 m5023a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new C1076n0(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static C1074m0 m5024c(InterfaceC3935a interfaceC3935a, InterfaceC3935a interfaceC3935a2, Object obj, Object obj2, InterfaceC7031a interfaceC7031a) {
        return new C1074m0(interfaceC3935a, interfaceC3935a2, (AbstractC1057e) obj, (C1088t0) obj2, interfaceC7031a);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1074m0 get() {
        return m5024c((InterfaceC3935a) this.f4361a.get(), (InterfaceC3935a) this.f4362b.get(), this.f4363c.get(), this.f4364d.get(), C7198a.m27889a(this.f4365e));
    }
}
