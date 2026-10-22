package p364v3;

import p349u3.InterfaceC7031a;

/* renamed from: v3.c */
/* loaded from: classes.dex */
public final class C7200c implements InterfaceC7199b, InterfaceC7031a {

    /* renamed from: b */
    private static final C7200c f26968b = new C7200c(null);

    /* renamed from: a */
    private final Object f26969a;

    private C7200c(Object obj) {
        this.f26969a = obj;
    }

    /* renamed from: a */
    public static InterfaceC7199b m27892a(Object obj) {
        return new C7200c(AbstractC7201d.m27895c(obj, "instance cannot be null"));
    }

    @Override // javax.inject.Provider
    public Object get() {
        return this.f26969a;
    }
}
