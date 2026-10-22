package p192j9;

import ac.C0171k0;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p135fd.C4307b;
import p160h9.InterfaceC4749y;
import p160h9.InterfaceC4750z;
import p301qb.InterfaceC6378d0;
import p430z9.AbstractC7765c;

/* renamed from: j9.b0 */
/* loaded from: classes2.dex */
public final class C5017b0 implements InterfaceC4749y, InterfaceC6378d0 {

    /* renamed from: a */
    private AbstractC7765c f20781a;

    /* renamed from: b */
    private InterfaceC4750z f20782b;

    /* renamed from: c */
    private final InterfaceC1312h f20783c;

    /* renamed from: j9.b0$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0171k0 invoke() {
            return new C0171k0(C5017b0.this);
        }
    }

    public C5017b0(AbstractC7765c abstractC7765c, InterfaceC4750z interfaceC4750z) {
        InterfaceC1312h m5965b;
        AbstractC5868k.m23674f(abstractC7765c, "fragment");
        AbstractC5868k.m23674f(interfaceC4750z, "view");
        this.f20781a = abstractC7765c;
        this.f20782b = interfaceC4750z;
        m5965b = AbstractC1314j.m5965b(new a());
        this.f20783c = m5965b;
    }

    /* renamed from: Y0 */
    private final C0171k0 m20407Y0() {
        return (C0171k0) this.f20783c.getValue();
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
    }

    @Override // p301qb.InterfaceC6378d0
    /* renamed from: L4 */
    public void mo20390L4(String str) {
        AbstractC5868k.m23674f(str, "bean");
        this.f20782b.mo19643c0(str);
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f20781a.m19902N3();
    }

    @Override // p160h9.InterfaceC4749y
    /* renamed from: c */
    public void mo19641c() {
        m20407Y0().m626d();
    }

    @Override // p301qb.InterfaceC6378d0
    /* renamed from: c3 */
    public void mo20393c3(int i10, String str) {
        this.f20782b.mo19642B(i10);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }
}
