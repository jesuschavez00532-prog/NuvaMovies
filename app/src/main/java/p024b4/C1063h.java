package p024b4;

import android.content.Context;
import javax.inject.Provider;
import p364v3.AbstractC7201d;
import p364v3.InterfaceC7199b;

/* renamed from: b4.h */
/* loaded from: classes.dex */
public final class C1063h implements InterfaceC7199b {

    /* renamed from: a */
    private final Provider f4340a;

    public C1063h(Provider provider) {
        this.f4340a = provider;
    }

    /* renamed from: a */
    public static C1063h m4938a(Provider provider) {
        return new C1063h(provider);
    }

    /* renamed from: c */
    public static String m4939c(Context context) {
        return (String) AbstractC7201d.m27895c(AbstractC1059f.m4930b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return m4939c((Context) this.f4340a.get());
    }
}
