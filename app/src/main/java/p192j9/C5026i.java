package p192j9;

import ac.C0201r2;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.lzy.okgo.model.Progress;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p135fd.C4307b;
import p160h9.InterfaceC4731g;
import p160h9.InterfaceC4732h;
import p301qb.InterfaceC6421r1;
import p430z9.AbstractC7765c;

/* renamed from: j9.i */
/* loaded from: classes2.dex */
public final class C5026i implements InterfaceC4731g, InterfaceC6421r1 {

    /* renamed from: a */
    private AbstractC7765c f20808a;

    /* renamed from: b */
    private InterfaceC4732h f20809b;

    /* renamed from: c */
    private final InterfaceC1312h f20810c;

    /* renamed from: j9.i$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0201r2 invoke() {
            return new C0201r2(C5026i.this);
        }
    }

    public C5026i(AbstractC7765c abstractC7765c, InterfaceC4732h interfaceC4732h) {
        InterfaceC1312h m5965b;
        AbstractC5868k.m23674f(abstractC7765c, "fragment");
        AbstractC5868k.m23674f(interfaceC4732h, "view");
        this.f20808a = abstractC7765c;
        this.f20809b = interfaceC4732h;
        m5965b = AbstractC1314j.m5965b(new a());
        this.f20810c = m5965b;
    }

    /* renamed from: Y0 */
    private final C0201r2 m20438Y0() {
        return (C0201r2) this.f20810c.getValue();
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
    }

    @Override // p301qb.InterfaceC6421r1
    /* renamed from: H3 */
    public void mo16980H3(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f20809b.mo19602A1();
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f20808a.m19902N3();
    }

    @Override // p160h9.InterfaceC4731g
    /* renamed from: b3 */
    public void mo19601b3(String str) {
        AbstractC5868k.m23674f(str, Progress.STATUS);
        m20438Y0().m721c(str);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p301qb.InterfaceC6421r1
    /* renamed from: z1 */
    public void mo16991z1() {
        this.f20809b.mo19603Q1();
    }
}
