package p095d4;

import p364v3.AbstractC7201d;
import p364v3.InterfaceC7199b;

/* renamed from: d4.d */
/* loaded from: classes.dex */
public final class C3938d implements InterfaceC7199b {

    /* renamed from: d4.d$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        private static final C3938d f17615a = new C3938d();
    }

    /* renamed from: a */
    public static C3938d m16769a() {
        return a.f17615a;
    }

    /* renamed from: c */
    public static InterfaceC3935a m16770c() {
        return (InterfaceC3935a) AbstractC7201d.m27895c(AbstractC3936b.m16764b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC3935a get() {
        return m16770c();
    }
}
