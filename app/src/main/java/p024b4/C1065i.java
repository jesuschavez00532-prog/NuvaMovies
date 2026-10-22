package p024b4;

import p364v3.InterfaceC7199b;

/* renamed from: b4.i */
/* loaded from: classes.dex */
public final class C1065i implements InterfaceC7199b {

    /* renamed from: b4.i$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        private static final C1065i f4341a = new C1065i();
    }

    /* renamed from: a */
    public static C1065i m4941a() {
        return a.f4341a;
    }

    /* renamed from: c */
    public static int m4942c() {
        return AbstractC1059f.m4931c();
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer get() {
        return Integer.valueOf(m4942c());
    }
}
