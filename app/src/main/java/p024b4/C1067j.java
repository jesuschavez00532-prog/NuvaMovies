package p024b4;

import p364v3.AbstractC7201d;
import p364v3.InterfaceC7199b;

/* renamed from: b4.j */
/* loaded from: classes.dex */
public final class C1067j implements InterfaceC7199b {

    /* renamed from: b4.j$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        private static final C1067j f4344a = new C1067j();
    }

    /* renamed from: a */
    public static C1067j m4945a() {
        return a.f4344a;
    }

    /* renamed from: c */
    public static AbstractC1057e m4946c() {
        return (AbstractC1057e) AbstractC7201d.m27895c(AbstractC1059f.m4932d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC1057e get() {
        return m4946c();
    }
}
