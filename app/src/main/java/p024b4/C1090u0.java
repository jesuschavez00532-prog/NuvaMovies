package p024b4;

import android.content.Context;
import javax.inject.Provider;
import p364v3.InterfaceC7199b;

/* renamed from: b4.u0 */
/* loaded from: classes.dex */
public final class C1090u0 implements InterfaceC7199b {

    /* renamed from: a */
    private final Provider f4390a;

    /* renamed from: b */
    private final Provider f4391b;

    /* renamed from: c */
    private final Provider f4392c;

    public C1090u0(Provider provider, Provider provider2, Provider provider3) {
        this.f4390a = provider;
        this.f4391b = provider2;
        this.f4392c = provider3;
    }

    /* renamed from: a */
    public static C1090u0 m5040a(Provider provider, Provider provider2, Provider provider3) {
        return new C1090u0(provider, provider2, provider3);
    }

    /* renamed from: c */
    public static C1088t0 m5041c(Context context, String str, int i10) {
        return new C1088t0(context, str, i10);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1088t0 get() {
        return m5041c((Context) this.f4390a.get(), (String) this.f4391b.get(), ((Integer) this.f4392c.get()).intValue());
    }
}
