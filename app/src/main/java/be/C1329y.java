package be;

import java.io.Serializable;
import me.InterfaceC5642a;
import ne.AbstractC5868k;

/* renamed from: be.y */
/* loaded from: classes3.dex */
public final class C1329y implements InterfaceC1312h, Serializable {

    /* renamed from: a */
    private InterfaceC5642a f4999a;

    /* renamed from: b */
    private Object f5000b;

    public C1329y(InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(interfaceC5642a, "initializer");
        this.f4999a = interfaceC5642a;
        this.f5000b = C1326v.f4997a;
    }

    /* renamed from: a */
    public boolean m5981a() {
        if (this.f5000b != C1326v.f4997a) {
            return true;
        }
        return false;
    }

    @Override // be.InterfaceC1312h
    public Object getValue() {
        if (this.f5000b == C1326v.f4997a) {
            InterfaceC5642a interfaceC5642a = this.f4999a;
            AbstractC5868k.m23671c(interfaceC5642a);
            this.f5000b = interfaceC5642a.invoke();
            this.f4999a = null;
        }
        return this.f5000b;
    }

    public String toString() {
        if (m5981a()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
