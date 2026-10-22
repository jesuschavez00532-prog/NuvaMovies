package ve;

import be.C1328x;
import me.InterfaceC5660l;

/* renamed from: ve.a1 */
/* loaded from: classes3.dex */
final class C7262a1 extends AbstractC7275f {

    /* renamed from: a */
    private final InterfaceC5660l f27148a;

    public C7262a1(InterfaceC5660l interfaceC5660l) {
        this.f27148a = interfaceC5660l;
    }

    @Override // ve.AbstractC7278g
    /* renamed from: a */
    public void mo28106a(Throwable th) {
        this.f27148a.mo542f(th);
    }

    @Override // me.InterfaceC5660l
    /* renamed from: f */
    public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
        mo28106a((Throwable) obj);
        return C1328x.f4998a;
    }

    public String toString() {
        return "InvokeOnCancel[" + AbstractC7273e0.m28127a(this.f27148a) + '@' + AbstractC7273e0.m28128b(this) + ']';
    }
}
