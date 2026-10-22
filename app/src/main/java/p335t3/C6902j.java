package p335t3;

import android.content.Context;
import javax.inject.Provider;
import p095d4.InterfaceC3935a;
import p364v3.InterfaceC7199b;

/* renamed from: t3.j */
/* loaded from: classes.dex */
public final class C6902j implements InterfaceC7199b {

    /* renamed from: a */
    private final Provider f26221a;

    /* renamed from: b */
    private final Provider f26222b;

    /* renamed from: c */
    private final Provider f26223c;

    public C6902j(Provider provider, Provider provider2, Provider provider3) {
        this.f26221a = provider;
        this.f26222b = provider2;
        this.f26223c = provider3;
    }

    /* renamed from: a */
    public static C6902j m26835a(Provider provider, Provider provider2, Provider provider3) {
        return new C6902j(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C6901i m26836c(Context context, InterfaceC3935a interfaceC3935a, InterfaceC3935a interfaceC3935a2) {
        return new C6901i(context, interfaceC3935a, interfaceC3935a2);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6901i get() {
        return m26836c((Context) this.f26221a.get(), (InterfaceC3935a) this.f26222b.get(), (InterfaceC3935a) this.f26223c.get());
    }
}
