package p302qc;

import com.umeng.ccg.C3417a;
import me.InterfaceC5642a;
import ne.AbstractC5868k;

/* renamed from: qc.f */
/* loaded from: classes3.dex */
public final class C6451f {

    /* renamed from: a */
    private final C6448c f24819a;

    /* renamed from: b */
    private final InterfaceC5642a f24820b;

    public C6451f(C6448c c6448c, InterfaceC5642a interfaceC5642a) {
        AbstractC5868k.m23674f(c6448c, "navigator");
        AbstractC5868k.m23674f(interfaceC5642a, C3417a.f15001w);
        this.f24819a = c6448c;
        this.f24820b = interfaceC5642a;
    }

    /* renamed from: a */
    public final InterfaceC5642a m25272a() {
        return this.f24820b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6451f) {
            return AbstractC5868k.m23669a(((C6451f) obj).f24819a, this.f24819a);
        }
        return super.equals(obj);
    }

    public int hashCode() {
        return this.f24819a.hashCode() + 1;
    }
}
