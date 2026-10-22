package p192j9;

import ac.C0171k0;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p135fd.C4307b;
import p160h9.InterfaceC4735k;
import p160h9.InterfaceC4736l;
import p301qb.InterfaceC6378d0;
import p430z9.AbstractC7765c;

/* renamed from: j9.o */
/* loaded from: classes2.dex */
public final class C5032o implements InterfaceC4735k, InterfaceC6378d0 {

    /* renamed from: a */
    private AbstractC7765c f20831a;

    /* renamed from: b */
    private InterfaceC4736l f20832b;

    /* renamed from: c */
    private final InterfaceC1312h f20833c;

    /* renamed from: j9.o$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0171k0 invoke() {
            return new C0171k0(C5032o.this);
        }
    }

    public C5032o(AbstractC7765c abstractC7765c, InterfaceC4736l interfaceC4736l) {
        InterfaceC1312h m5965b;
        AbstractC5868k.m23674f(abstractC7765c, "fragment");
        AbstractC5868k.m23674f(interfaceC4736l, "view");
        this.f20831a = abstractC7765c;
        this.f20832b = interfaceC4736l;
        m5965b = AbstractC1314j.m5965b(new a());
        this.f20833c = m5965b;
    }

    /* renamed from: Y0 */
    private final C0171k0 m20467Y0() {
        return (C0171k0) this.f20833c.getValue();
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
    }

    @Override // p301qb.InterfaceC6378d0
    /* renamed from: L4 */
    public void mo20390L4(String str) {
        AbstractC5868k.m23674f(str, "bean");
        this.f20832b.mo19617c0(str);
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f20831a.m19902N3();
    }

    @Override // p160h9.InterfaceC4735k
    /* renamed from: c */
    public void mo19615c() {
        m20467Y0().m626d();
    }

    @Override // p301qb.InterfaceC6378d0
    /* renamed from: c3 */
    public void mo20393c3(int i10, String str) {
        this.f20832b.mo19616B(i10);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }
}
