package ve;

import be.C1328x;

/* renamed from: ve.o0 */
/* loaded from: classes3.dex */
final class C7303o0 extends AbstractC7275f {

    /* renamed from: a */
    private final InterfaceC7300n0 f27199a;

    public C7303o0(InterfaceC7300n0 interfaceC7300n0) {
        this.f27199a = interfaceC7300n0;
    }

    @Override // ve.AbstractC7278g
    /* renamed from: a */
    public void mo28106a(Throwable th) {
        this.f27199a.dispose();
    }

    @Override // me.InterfaceC5660l
    /* renamed from: f */
    public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
        mo28106a((Throwable) obj);
        return C1328x.f4998a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f27199a + ']';
    }
}
