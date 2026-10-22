package p024b4;

import p364v3.AbstractC7201d;
import p364v3.InterfaceC7199b;

/* renamed from: b4.g */
/* loaded from: classes.dex */
public final class C1061g implements InterfaceC7199b {

    /* renamed from: b4.g$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        private static final C1061g f4338a = new C1061g();
    }

    /* renamed from: a */
    public static C1061g m4933a() {
        return a.f4338a;
    }

    /* renamed from: b */
    public static String m4934b() {
        return (String) AbstractC7201d.m27895c(AbstractC1059f.m4929a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return m4934b();
    }
}
