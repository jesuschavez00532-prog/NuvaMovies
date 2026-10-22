package p324s3;

import javax.inject.Provider;
import p005a4.C0040l0;
import p005a4.C0048p0;
import p095d4.InterfaceC3935a;
import p364v3.InterfaceC7199b;
import p424z3.InterfaceC7749e;

/* renamed from: s3.v */
/* loaded from: classes.dex */
public final class C6674v implements InterfaceC7199b {

    /* renamed from: a */
    private final Provider f25591a;

    /* renamed from: b */
    private final Provider f25592b;

    /* renamed from: c */
    private final Provider f25593c;

    /* renamed from: d */
    private final Provider f25594d;

    /* renamed from: e */
    private final Provider f25595e;

    public C6674v(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f25591a = provider;
        this.f25592b = provider2;
        this.f25593c = provider3;
        this.f25594d = provider4;
        this.f25595e = provider5;
    }

    /* renamed from: a */
    public static C6674v m26049a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new C6674v(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static C6672t m26050c(InterfaceC3935a interfaceC3935a, InterfaceC3935a interfaceC3935a2, InterfaceC7749e interfaceC7749e, C0040l0 c0040l0, C0048p0 c0048p0) {
        return new C6672t(interfaceC3935a, interfaceC3935a2, interfaceC7749e, c0040l0, c0048p0);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6672t get() {
        return m26050c((InterfaceC3935a) this.f25591a.get(), (InterfaceC3935a) this.f25592b.get(), (InterfaceC7749e) this.f25593c.get(), (C0040l0) this.f25594d.get(), (C0048p0) this.f25595e.get());
    }
}
