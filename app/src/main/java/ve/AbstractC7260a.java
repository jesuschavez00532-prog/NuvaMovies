package ve;

import ee.InterfaceC4181d;
import ee.InterfaceC4184g;
import me.InterfaceC5664p;

/* renamed from: ve.a */
/* loaded from: classes3.dex */
public abstract class AbstractC7260a extends C7283h1 implements InterfaceC4181d, InterfaceC7261a0 {

    /* renamed from: b */
    private final InterfaceC4184g f27146b;

    /* renamed from: c */
    protected final InterfaceC4184g f27147c;

    public AbstractC7260a(InterfaceC4184g interfaceC4184g, boolean z10) {
        super(z10);
        this.f27147c = interfaceC4184g;
        this.f27146b = interfaceC4184g.plus(this);
    }

    @Override // ve.C7283h1
    /* renamed from: O */
    public final void mo28094O(Throwable th) {
        AbstractC7334z.m28314a(this.f27146b, th);
    }

    @Override // ve.C7283h1
    /* renamed from: V */
    public String mo28095V() {
        String m28309b = AbstractC7326w.m28309b(this.f27146b);
        if (m28309b != null) {
            return '\"' + m28309b + "\":" + super.mo28095V();
        }
        return super.mo28095V();
    }

    @Override // ve.C7283h1, ve.InterfaceC7271d1
    /* renamed from: a */
    public boolean mo28096a() {
        return super.mo28096a();
    }

    @Override // ve.C7283h1
    /* renamed from: a0 */
    protected final void mo28097a0(Object obj) {
        if (obj instanceof C7311r) {
            C7311r c7311r = (C7311r) obj;
            m28101s0(c7311r.f27215a, c7311r.m28274a());
        } else {
            m28102t0(obj);
        }
    }

    @Override // ve.C7283h1
    /* renamed from: b0 */
    public final void mo28098b0() {
        mo28103u0();
    }

    @Override // ee.InterfaceC4181d
    /* renamed from: d */
    public final void mo17486d(Object obj) {
        Object m28176T = m28176T(AbstractC7323v.m28306d(obj, null, 1, null));
        if (m28176T == AbstractC7286i1.f27182b) {
            return;
        }
        mo21244q0(m28176T);
    }

    @Override // ee.InterfaceC4181d
    /* renamed from: e */
    public final InterfaceC4184g mo17487e() {
        return this.f27146b;
    }

    @Override // ve.InterfaceC7261a0
    /* renamed from: i */
    public InterfaceC4184g mo28099i() {
        return this.f27146b;
    }

    /* renamed from: q0 */
    protected void mo21244q0(Object obj) {
        mo21245u(obj);
    }

    /* renamed from: r0 */
    public final void m28100r0() {
        m28174P((InterfaceC7271d1) this.f27147c.get(InterfaceC7271d1.f27161f0));
    }

    /* renamed from: s0 */
    protected void m28101s0(Throwable th, boolean z10) {
    }

    /* renamed from: t0 */
    protected void m28102t0(Object obj) {
    }

    /* renamed from: u0 */
    protected void mo28103u0() {
    }

    /* renamed from: v0 */
    public final void m28104v0(EnumC7267c0 enumC7267c0, Object obj, InterfaceC5664p interfaceC5664p) {
        m28100r0();
        enumC7267c0.m28109a(interfaceC5664p, obj, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ve.C7283h1
    /* renamed from: z */
    public String mo28105z() {
        return AbstractC7273e0.m28127a(this) + " was cancelled";
    }
}
