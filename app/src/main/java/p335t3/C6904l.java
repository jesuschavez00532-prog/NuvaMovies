package p335t3;

import android.content.Context;
import javax.inject.Provider;
import p364v3.InterfaceC7199b;

/* renamed from: t3.l */
/* loaded from: classes.dex */
public final class C6904l implements InterfaceC7199b {

    /* renamed from: a */
    private final Provider f26229a;

    /* renamed from: b */
    private final Provider f26230b;

    public C6904l(Provider provider, Provider provider2) {
        this.f26229a = provider;
        this.f26230b = provider2;
    }

    /* renamed from: a */
    public static C6904l m26842a(Provider provider, Provider provider2) {
        return new C6904l(provider, provider2);
    }

    /* renamed from: c */
    public static C6903k m26843c(Context context, Object obj) {
        return new C6903k(context, (C6901i) obj);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6903k get() {
        return m26843c((Context) this.f26229a.get(), this.f26230b.get());
    }
}
