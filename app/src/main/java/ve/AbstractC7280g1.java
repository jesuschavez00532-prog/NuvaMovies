package ve;

/* renamed from: ve.g1 */
/* loaded from: classes3.dex */
public abstract class AbstractC7280g1 extends AbstractC7317t implements InterfaceC7300n0, InterfaceC7333y0 {

    /* renamed from: d */
    public final InterfaceC7271d1 f27167d;

    public AbstractC7280g1(InterfaceC7271d1 interfaceC7271d1) {
        this.f27167d = interfaceC7271d1;
    }

    @Override // ve.InterfaceC7333y0
    /* renamed from: a */
    public boolean mo28135a() {
        return true;
    }

    @Override // ve.InterfaceC7300n0
    public void dispose() {
        InterfaceC7271d1 interfaceC7271d1 = this.f27167d;
        if (interfaceC7271d1 != null) {
            ((C7283h1) interfaceC7271d1).m28179e0(this);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobSupport");
    }

    @Override // ve.InterfaceC7333y0
    /* renamed from: e */
    public C7295l1 mo28136e() {
        return null;
    }

    @Override // kotlinx.coroutines.internal.C5271j
    public String toString() {
        return AbstractC7273e0.m28127a(this) + '@' + AbstractC7273e0.m28128b(this) + "[job@" + AbstractC7273e0.m28128b(this.f27167d) + ']';
    }
}
