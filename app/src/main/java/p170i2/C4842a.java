package p170i2;

import ne.AbstractC5868k;

/* renamed from: i2.a */
/* loaded from: classes.dex */
public final class C4842a {

    /* renamed from: a */
    public static final C4842a f20329a = new C4842a();

    /* renamed from: b */
    private static InterfaceC4845d f20330b;

    /* renamed from: c */
    private static InterfaceC4844c f20331c;

    private C4842a() {
    }

    /* renamed from: a */
    public final AbstractC4843b m19920a() {
        InterfaceC4845d interfaceC4845d = f20330b;
        if (interfaceC4845d != null) {
            AbstractC5868k.m23671c(interfaceC4845d);
            return interfaceC4845d.mo19991a();
        }
        throw new NullPointerException("请设置： ProductAdapterFactory");
    }

    /* renamed from: b */
    public final InterfaceC4844c m19921b() {
        return f20331c;
    }

    /* renamed from: c */
    public final void m19922c(InterfaceC4844c interfaceC4844c) {
        AbstractC5868k.m23674f(interfaceC4844c, "moduleBridging");
        f20331c = interfaceC4844c;
    }

    /* renamed from: d */
    public final void m19923d(InterfaceC4845d interfaceC4845d) {
        AbstractC5868k.m23674f(interfaceC4845d, "factory");
        f20330b = interfaceC4845d;
    }
}
