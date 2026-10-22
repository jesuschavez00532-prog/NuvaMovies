package p005a4;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import p024b4.InterfaceC1053c;
import p024b4.InterfaceC1055d;
import p036c4.InterfaceC1358b;
import p095d4.InterfaceC3935a;
import p335t3.InterfaceC6897e;
import p364v3.InterfaceC7199b;

/* renamed from: a4.m0 */
/* loaded from: classes.dex */
public final class C0042m0 implements InterfaceC7199b {

    /* renamed from: a */
    private final Provider f153a;

    /* renamed from: b */
    private final Provider f154b;

    /* renamed from: c */
    private final Provider f155c;

    /* renamed from: d */
    private final Provider f156d;

    /* renamed from: e */
    private final Provider f157e;

    /* renamed from: f */
    private final Provider f158f;

    /* renamed from: g */
    private final Provider f159g;

    /* renamed from: h */
    private final Provider f160h;

    /* renamed from: i */
    private final Provider f161i;

    public C0042m0(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        this.f153a = provider;
        this.f154b = provider2;
        this.f155c = provider3;
        this.f156d = provider4;
        this.f157e = provider5;
        this.f158f = provider6;
        this.f159g = provider7;
        this.f160h = provider8;
        this.f161i = provider9;
    }

    /* renamed from: a */
    public static C0042m0 m181a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9) {
        return new C0042m0(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    /* renamed from: c */
    public static C0040l0 m182c(Context context, InterfaceC6897e interfaceC6897e, InterfaceC1055d interfaceC1055d, InterfaceC0052r0 interfaceC0052r0, Executor executor, InterfaceC1358b interfaceC1358b, InterfaceC3935a interfaceC3935a, InterfaceC3935a interfaceC3935a2, InterfaceC1053c interfaceC1053c) {
        return new C0040l0(context, interfaceC6897e, interfaceC1055d, interfaceC0052r0, executor, interfaceC1358b, interfaceC3935a, interfaceC3935a2, interfaceC1053c);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0040l0 get() {
        return m182c((Context) this.f153a.get(), (InterfaceC6897e) this.f154b.get(), (InterfaceC1055d) this.f155c.get(), (InterfaceC0052r0) this.f156d.get(), (Executor) this.f157e.get(), (InterfaceC1358b) this.f158f.get(), (InterfaceC3935a) this.f159g.get(), (InterfaceC3935a) this.f160h.get(), (InterfaceC1053c) this.f161i.get());
    }
}
