package p289pd;

import ac.C0134b;
import ac.C0217w;
import ac.C0227z0;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.request.result.FavoriteList;
import com.request.result.GetShelveResult;
import java.util.List;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p043ce.AbstractC1500l;
import p135fd.C4307b;
import p253nd.InterfaceC5849i;
import p253nd.InterfaceC5850j;
import p301qb.InterfaceC6380e;
import p301qb.InterfaceC6420r0;
import p301qb.InterfaceC6425t;
import p430z9.AbstractActivityC7763a;

/* renamed from: pd.r */
/* loaded from: classes3.dex */
public final class C6280r implements InterfaceC5849i, InterfaceC6420r0, InterfaceC6380e, InterfaceC6425t {

    /* renamed from: a */
    private AbstractActivityC7763a f24570a;

    /* renamed from: b */
    private InterfaceC5850j f24571b;

    /* renamed from: c */
    private boolean f24572c;

    /* renamed from: d */
    private final InterfaceC1312h f24573d;

    /* renamed from: e */
    private final InterfaceC1312h f24574e;

    /* renamed from: f */
    private final InterfaceC1312h f24575f;

    /* renamed from: pd.r$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0134b invoke() {
            return new C0134b(C6280r.this);
        }
    }

    /* renamed from: pd.r$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0217w invoke() {
            return new C0217w(C6280r.this);
        }
    }

    /* renamed from: pd.r$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC5869l implements InterfaceC5642a {
        c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0227z0 invoke() {
            return new C0227z0(C6280r.this);
        }
    }

    public C6280r(AbstractActivityC7763a abstractActivityC7763a, InterfaceC5850j interfaceC5850j) {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        InterfaceC1312h m5965b3;
        AbstractC5868k.m23674f(abstractActivityC7763a, "activity");
        AbstractC5868k.m23674f(interfaceC5850j, "view");
        this.f24570a = abstractActivityC7763a;
        this.f24571b = interfaceC5850j;
        m5965b = AbstractC1314j.m5965b(new c());
        this.f24573d = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new a());
        this.f24574e = m5965b2;
        m5965b3 = AbstractC1314j.m5965b(new b());
        this.f24575f = m5965b3;
    }

    /* renamed from: E3 */
    private final C0217w m24974E3() {
        return (C0217w) this.f24575f.getValue();
    }

    /* renamed from: F3 */
    private final C0227z0 m24975F3() {
        return (C0227z0) this.f24573d.getValue();
    }

    /* renamed from: Y0 */
    private final C0134b m24976Y0() {
        return (C0134b) this.f24574e.getValue();
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
    }

    @Override // p253nd.InterfaceC5849i
    /* renamed from: J0 */
    public void mo23645J0(int i10) {
        List m6989h;
        if (!this.f24572c) {
            this.f24571b.mo16321c();
            m6989h = AbstractC1500l.m6989h(Integer.valueOf(i10));
            m24974E3().m768b(m6989h, null);
            this.f24572c = true;
        }
    }

    @Override // p253nd.InterfaceC5849i
    /* renamed from: J2 */
    public void mo23646J2(String str) {
        AbstractC5868k.m23674f(str, "columnId");
        this.f24571b.mo16321c();
        m24975F3().m793c(Integer.parseInt(str), "2", 200, 1, null, 0);
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f24570a.m19900N3();
    }

    @Override // p301qb.InterfaceC6380e
    /* renamed from: n */
    public void mo20455n(List list) {
        AbstractC5868k.m23674f(list, "favId");
        this.f24571b.mo16322d();
        this.f24572c = false;
        this.f24571b.mo16325n(list);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p301qb.InterfaceC6425t
    /* renamed from: p */
    public void mo20456p(FavoriteList favoriteList) {
        this.f24572c = false;
        this.f24571b.mo16322d();
        this.f24571b.mo16320W0();
    }

    @Override // p301qb.InterfaceC6420r0
    /* renamed from: p0 */
    public void mo24951p0(GetShelveResult getShelveResult, int i10) {
        AbstractC5868k.m23674f(getShelveResult, "getShelveDataResult");
        this.f24571b.mo16322d();
        this.f24571b.mo16319L0(getShelveResult.getData());
    }

    @Override // p301qb.InterfaceC6420r0
    /* renamed from: q */
    public void mo24952q(String str, int i10) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f24571b.mo16322d();
        this.f24571b.mo16318F3(str);
    }

    @Override // p253nd.InterfaceC5849i
    /* renamed from: q0 */
    public void mo23647q0(String str) {
        List m6989h;
        AbstractC5868k.m23674f(str, "columnId");
        if (!this.f24572c) {
            this.f24571b.mo16321c();
            C0134b m24976Y0 = m24976Y0();
            m6989h = AbstractC1500l.m6989h(str);
            C0134b.m531c(m24976Y0, "3", m6989h, false, 4, null);
            this.f24572c = true;
        }
    }

    @Override // p301qb.InterfaceC6380e
    /* renamed from: s */
    public void mo20457s(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f24571b.mo16322d();
        this.f24572c = false;
        this.f24571b.mo16326s(str);
    }

    @Override // p301qb.InterfaceC6425t
    /* renamed from: x1 */
    public void mo20458x1(String str, int i10) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f24572c = false;
        this.f24571b.mo16322d();
        this.f24571b.mo16327u(str);
    }
}
