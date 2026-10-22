package p192j9;

import ac.C0179m0;
import ac.C0207t0;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.request.result.GetExchangeOrderInfoResult;
import com.request.result.GetOrderInfoResult;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.android.agoo.message.MessageService;
import p135fd.C4307b;
import p160h9.InterfaceC4743s;
import p160h9.InterfaceC4744t;
import p301qb.InterfaceC6384f0;
import p301qb.InterfaceC6402l0;
import p430z9.AbstractC7765c;

/* renamed from: j9.v */
/* loaded from: classes2.dex */
public final class C5039v implements InterfaceC4743s, InterfaceC6402l0, InterfaceC6384f0 {

    /* renamed from: a */
    private AbstractC7765c f20847a;

    /* renamed from: b */
    private InterfaceC4744t f20848b;

    /* renamed from: c */
    private GetOrderInfoResult f20849c;

    /* renamed from: d */
    private GetExchangeOrderInfoResult f20850d;

    /* renamed from: e */
    private final InterfaceC1312h f20851e;

    /* renamed from: f */
    private final InterfaceC1312h f20852f;

    /* renamed from: j9.v$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0179m0 invoke() {
            return new C0179m0(C5039v.this);
        }
    }

    /* renamed from: j9.v$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0207t0 invoke() {
            return new C0207t0(C5039v.this);
        }
    }

    public C5039v(AbstractC7765c abstractC7765c, InterfaceC4744t interfaceC4744t) {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        AbstractC5868k.m23674f(abstractC7765c, "fragment");
        AbstractC5868k.m23674f(interfaceC4744t, "view");
        this.f20847a = abstractC7765c;
        this.f20848b = interfaceC4744t;
        m5965b = AbstractC1314j.m5965b(new b());
        this.f20851e = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new a());
        this.f20852f = m5965b2;
    }

    /* renamed from: E3 */
    private final C0207t0 m20477E3() {
        return (C0207t0) this.f20851e.getValue();
    }

    /* renamed from: Y0 */
    private final C0179m0 m20478Y0() {
        return (C0179m0) this.f20852f.getValue();
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
    }

    @Override // p160h9.InterfaceC4743s
    /* renamed from: H */
    public void mo19621H() {
        this.f20849c = null;
        this.f20850d = null;
    }

    @Override // p301qb.InterfaceC6402l0
    /* renamed from: L */
    public void mo20479L(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f20848b.mo19627d();
        this.f20848b.mo19625L(str);
    }

    @Override // p160h9.InterfaceC4743s
    /* renamed from: L1 */
    public void mo19622L1() {
        this.f20848b.mo19626c();
        if (this.f20849c == null) {
            m20477E3().m734b();
            return;
        }
        this.f20848b.mo19627d();
        InterfaceC4744t interfaceC4744t = this.f20848b;
        GetOrderInfoResult getOrderInfoResult = this.f20849c;
        AbstractC5868k.m23671c(getOrderInfoResult);
        interfaceC4744t.mo19628i0(getOrderInfoResult);
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f20847a.m19902N3();
    }

    @Override // p160h9.InterfaceC4743s
    public void getRequest() {
        if (MessageService.MSG_DB_READY_REPORT.equals(this.f20848b.mo19624B1())) {
            mo19622L1();
        } else if ("1".equals(this.f20848b.mo19624B1())) {
            mo19623p2();
        }
    }

    @Override // p301qb.InterfaceC6402l0
    /* renamed from: i0 */
    public void mo20480i0(GetOrderInfoResult getOrderInfoResult) {
        AbstractC5868k.m23674f(getOrderInfoResult, "data");
        this.f20849c = getOrderInfoResult;
        this.f20848b.mo19627d();
        this.f20848b.mo19628i0(getOrderInfoResult);
    }

    @Override // p301qb.InterfaceC6384f0
    /* renamed from: n0 */
    public void mo20481n0(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f20848b.mo19627d();
        this.f20848b.mo19629n0(str);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p160h9.InterfaceC4743s
    /* renamed from: p2 */
    public void mo19623p2() {
        this.f20848b.mo19626c();
        if (this.f20850d == null) {
            m20478Y0().m650b();
            return;
        }
        this.f20848b.mo19627d();
        InterfaceC4744t interfaceC4744t = this.f20848b;
        GetExchangeOrderInfoResult getExchangeOrderInfoResult = this.f20850d;
        AbstractC5868k.m23671c(getExchangeOrderInfoResult);
        interfaceC4744t.mo19630y(getExchangeOrderInfoResult);
    }

    @Override // p301qb.InterfaceC6384f0
    /* renamed from: y */
    public void mo20482y(GetExchangeOrderInfoResult getExchangeOrderInfoResult) {
        AbstractC5868k.m23674f(getExchangeOrderInfoResult, "data");
        this.f20850d = getExchangeOrderInfoResult;
        this.f20848b.mo19627d();
        this.f20848b.mo19630y(getExchangeOrderInfoResult);
    }
}
