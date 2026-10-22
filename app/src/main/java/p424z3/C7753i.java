package p424z3;

import android.content.Context;
import javax.inject.Provider;
import p005a4.AbstractC0060z;
import p005a4.InterfaceC0052r0;
import p024b4.InterfaceC1055d;
import p095d4.InterfaceC3935a;
import p364v3.AbstractC7201d;
import p364v3.InterfaceC7199b;

/* renamed from: z3.i */
/* loaded from: classes.dex */
public final class C7753i implements InterfaceC7199b {

    /* renamed from: a */
    private final Provider f28535a;

    /* renamed from: b */
    private final Provider f28536b;

    /* renamed from: c */
    private final Provider f28537c;

    /* renamed from: d */
    private final Provider f28538d;

    public C7753i(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f28535a = provider;
        this.f28536b = provider2;
        this.f28537c = provider3;
        this.f28538d = provider4;
    }

    /* renamed from: a */
    public static C7753i m29958a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C7753i(provider, provider2, provider3, provider4);
    }

    /* renamed from: c */
    public static InterfaceC0052r0 m29959c(Context context, InterfaceC1055d interfaceC1055d, AbstractC0060z abstractC0060z, InterfaceC3935a interfaceC3935a) {
        return (InterfaceC0052r0) AbstractC7201d.m27895c(AbstractC7752h.m29957a(context, interfaceC1055d, abstractC0060z, interfaceC3935a), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC0052r0 get() {
        return m29959c((Context) this.f28535a.get(), (InterfaceC1055d) this.f28536b.get(), (AbstractC0060z) this.f28537c.get(), (InterfaceC3935a) this.f28538d.get());
    }
}
