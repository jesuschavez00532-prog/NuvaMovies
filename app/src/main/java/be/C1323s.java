package be;

import java.io.Serializable;
import me.InterfaceC5642a;
import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* renamed from: be.s */
/* loaded from: classes3.dex */
final class C1323s implements InterfaceC1312h, Serializable {

    /* renamed from: a */
    private InterfaceC5642a f4994a;

    /* renamed from: b */
    private volatile Object f4995b;

    /* renamed from: c */
    private final Object f4996c;

    public C1323s(InterfaceC5642a interfaceC5642a, Object obj) {
        AbstractC5868k.m23674f(interfaceC5642a, "initializer");
        this.f4994a = interfaceC5642a;
        this.f4995b = C1326v.f4997a;
        this.f4996c = obj == null ? this : obj;
    }

    /* renamed from: a */
    public boolean m5979a() {
        if (this.f4995b != C1326v.f4997a) {
            return true;
        }
        return false;
    }

    @Override // be.InterfaceC1312h
    public Object getValue() {
        Object obj;
        Object obj2 = this.f4995b;
        C1326v c1326v = C1326v.f4997a;
        if (obj2 != c1326v) {
            return obj2;
        }
        synchronized (this.f4996c) {
            obj = this.f4995b;
            if (obj == c1326v) {
                InterfaceC5642a interfaceC5642a = this.f4994a;
                AbstractC5868k.m23671c(interfaceC5642a);
                obj = interfaceC5642a.invoke();
                this.f4995b = obj;
                this.f4994a = null;
            }
        }
        return obj;
    }

    public String toString() {
        if (m5979a()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    public /* synthetic */ C1323s(InterfaceC5642a interfaceC5642a, Object obj, int i10, AbstractC5864g abstractC5864g) {
        this(interfaceC5642a, (i10 & 2) != 0 ? null : obj);
    }
}
