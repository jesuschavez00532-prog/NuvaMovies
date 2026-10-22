package p366v5;

import p338t6.InterfaceC6922b;

/* renamed from: v5.x */
/* loaded from: classes.dex */
public class C7239x implements InterfaceC6922b {

    /* renamed from: c */
    private static final Object f27044c = new Object();

    /* renamed from: a */
    private volatile Object f27045a = f27044c;

    /* renamed from: b */
    private volatile InterfaceC6922b f27046b;

    public C7239x(InterfaceC6922b interfaceC6922b) {
        this.f27046b = interfaceC6922b;
    }

    @Override // p338t6.InterfaceC6922b
    public Object get() {
        Object obj = this.f27045a;
        Object obj2 = f27044c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f27045a;
                if (obj == obj2) {
                    obj = this.f27046b.get();
                    this.f27045a = obj;
                    this.f27046b = null;
                }
            }
        }
        return obj;
    }
}
