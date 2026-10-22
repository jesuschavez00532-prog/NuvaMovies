package p424z3;

import javax.inject.Provider;
import p005a4.AbstractC0060z;
import p095d4.InterfaceC3935a;
import p364v3.AbstractC7201d;
import p364v3.InterfaceC7199b;

/* renamed from: z3.g */
/* loaded from: classes.dex */
public final class C7751g implements InterfaceC7199b {

    /* renamed from: a */
    private final Provider f28534a;

    public C7751g(Provider provider) {
        this.f28534a = provider;
    }

    /* renamed from: a */
    public static AbstractC0060z m29954a(InterfaceC3935a interfaceC3935a) {
        return (AbstractC0060z) AbstractC7201d.m27895c(AbstractC7750f.m29953a(interfaceC3935a), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C7751g m29955b(Provider provider) {
        return new C7751g(provider);
    }

    @Override // javax.inject.Provider
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC0060z get() {
        return m29954a((InterfaceC3935a) this.f28534a.get());
    }
}
