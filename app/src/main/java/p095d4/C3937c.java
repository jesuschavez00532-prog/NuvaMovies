package p095d4;

import p364v3.AbstractC7201d;
import p364v3.InterfaceC7199b;

/* renamed from: d4.c */
/* loaded from: classes.dex */
public final class C3937c implements InterfaceC7199b {

    /* renamed from: d4.c$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        private static final C3937c f17614a = new C3937c();
    }

    /* renamed from: a */
    public static C3937c m16765a() {
        return a.f17614a;
    }

    /* renamed from: b */
    public static InterfaceC3935a m16766b() {
        return (InterfaceC3935a) AbstractC7201d.m27895c(AbstractC3936b.m16763a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC3935a get() {
        return m16766b();
    }
}
