package p192j9;

import ac.C0140c1;
import ac.C0210u;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.request.result.SubscribeData;
import com.request.result.SubscribeListData;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p135fd.C4307b;
import p160h9.InterfaceC4722a0;
import p160h9.InterfaceC4724b0;
import p301qb.InterfaceC6419r;
import p301qb.InterfaceC6429u0;
import p430z9.AbstractC7765c;

/* renamed from: j9.c0 */
/* loaded from: classes2.dex */
public final class C5019c0 implements InterfaceC4722a0, InterfaceC6429u0, InterfaceC6419r {

    /* renamed from: a */
    private AbstractC7765c f20787a;

    /* renamed from: b */
    private InterfaceC4724b0 f20788b;

    /* renamed from: c */
    private Map f20789c;

    /* renamed from: d */
    private final InterfaceC1312h f20790d;

    /* renamed from: e */
    private final InterfaceC1312h f20791e;

    /* renamed from: j9.c0$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0210u invoke() {
            return new C0210u(C5019c0.this);
        }
    }

    /* renamed from: j9.c0$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0140c1 invoke() {
            return new C0140c1(C5019c0.this);
        }
    }

    public C5019c0(AbstractC7765c abstractC7765c, InterfaceC4724b0 interfaceC4724b0) {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        AbstractC5868k.m23674f(abstractC7765c, "fragment");
        AbstractC5868k.m23674f(interfaceC4724b0, "view");
        this.f20787a = abstractC7765c;
        this.f20788b = interfaceC4724b0;
        this.f20789c = new LinkedHashMap();
        m5965b = AbstractC1314j.m5965b(new b());
        this.f20790d = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new a());
        this.f20791e = m5965b2;
    }

    /* renamed from: E3 */
    private final C0140c1 m20409E3() {
        return (C0140c1) this.f20790d.getValue();
    }

    /* renamed from: Y0 */
    private final C0210u m20410Y0() {
        return (C0210u) this.f20791e.getValue();
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        mo19577Q0();
    }

    @Override // p160h9.InterfaceC4722a0
    /* renamed from: D2 */
    public void mo19576D2(List list, SubscribeData subscribeData) {
        int i10 = 0;
        AbstractC5868k.m23674f(list, "ids");
        if (subscribeData != null) {
            i10 = subscribeData.getSubscribeId();
        } else {
            i10 = -1;
        }
        Object obj = this.f20789c.get(Integer.valueOf(i10));
        Boolean bool = Boolean.TRUE;
        if (AbstractC5868k.m23669a(obj, bool)) {
            return;
        }
        this.f20788b.mo19581c();
        m20410Y0().m738b(list, subscribeData);
        this.f20789c.put(Integer.valueOf(i10), bool);
    }

    @Override // p301qb.InterfaceC6419r
    /* renamed from: E */
    public void mo20411E(SubscribeData subscribeData) {
        int i10 = 0;
        if (subscribeData != null) {
            i10 = subscribeData.getSubscribeId();
        } else {
            i10 = -1;
        }
        this.f20789c.put(Integer.valueOf(i10), Boolean.FALSE);
        this.f20788b.mo19582d();
        this.f20788b.mo19578E(subscribeData);
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f20787a.m19902N3();
    }

    @Override // p160h9.InterfaceC4722a0
    /* renamed from: Q0 */
    public void mo19577Q0() {
        this.f20788b.mo19581c();
        m20409E3().m544b(null);
    }

    @Override // p301qb.InterfaceC6429u0
    /* renamed from: W */
    public void mo20412W(SubscribeListData subscribeListData) {
        AbstractC5868k.m23674f(subscribeListData, "bean");
        this.f20788b.mo19582d();
        this.f20788b.mo19579W(subscribeListData);
    }

    @Override // p301qb.InterfaceC6419r
    /* renamed from: X5 */
    public void mo20413X5(String str, int i10) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f20789c.put(Integer.valueOf(i10), Boolean.FALSE);
        this.f20788b.mo19582d();
        this.f20788b.mo19580b0(str);
    }

    @Override // p301qb.InterfaceC6429u0
    /* renamed from: g0 */
    public void mo20414g0(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f20788b.mo19582d();
        this.f20788b.mo19583g0(str);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }
}
