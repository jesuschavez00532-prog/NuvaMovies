package p289pd;

import ac.C0133a2;
import ac.C0134b;
import ac.C0142d;
import ac.C0195q0;
import ac.C0210u;
import ac.C0217w;
import ac.C0228z1;
import be.AbstractC1314j;
import be.InterfaceC1312h;
import com.lzy.okgo.cookie.SerializableCookie;
import com.request.result.AddSubscribeResult;
import com.request.result.AssetData;
import com.request.result.FavoriteList;
import com.request.result.GetItemDataResult;
import com.request.result.SearchByContentResultData;
import com.request.result.SubscribeData;
import java.util.List;
import me.InterfaceC5642a;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p043ce.AbstractC1500l;
import p135fd.C4307b;
import p253nd.InterfaceC5854n;
import p253nd.InterfaceC5855o;
import p301qb.InterfaceC6380e;
import p301qb.InterfaceC6383f;
import p301qb.InterfaceC6393i0;
import p301qb.InterfaceC6419r;
import p301qb.InterfaceC6425t;
import p301qb.InterfaceC6439x1;
import p301qb.InterfaceC6445z1;
import p430z9.AbstractActivityC7763a;

/* renamed from: pd.v */
/* loaded from: classes3.dex */
public final class C6284v implements InterfaceC5854n, InterfaceC6393i0, InterfaceC6445z1, InterfaceC6380e, InterfaceC6425t, InterfaceC6383f, InterfaceC6419r, InterfaceC6439x1 {

    /* renamed from: a */
    private AbstractActivityC7763a f24596a;

    /* renamed from: b */
    private InterfaceC5855o f24597b;

    /* renamed from: c */
    private final String f24598c;

    /* renamed from: d */
    private C0195q0 f24599d;

    /* renamed from: e */
    private C0133a2 f24600e;

    /* renamed from: f */
    private C0228z1 f24601f;

    /* renamed from: g */
    private boolean f24602g;

    /* renamed from: h */
    private boolean f24603h;

    /* renamed from: i */
    private final InterfaceC1312h f24604i;

    /* renamed from: j */
    private final InterfaceC1312h f24605j;

    /* renamed from: k */
    private final InterfaceC1312h f24606k;

    /* renamed from: l */
    private final InterfaceC1312h f24607l;

    /* renamed from: pd.v$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0134b invoke() {
            return new C0134b(C6284v.this);
        }
    }

    /* renamed from: pd.v$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0142d invoke() {
            return new C0142d(C6284v.this);
        }
    }

    /* renamed from: pd.v$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC5869l implements InterfaceC5642a {
        c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0217w invoke() {
            return new C0217w(C6284v.this);
        }
    }

    /* renamed from: pd.v$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC5869l implements InterfaceC5642a {
        d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0210u invoke() {
            return new C0210u(C6284v.this);
        }
    }

    public C6284v(AbstractActivityC7763a abstractActivityC7763a, InterfaceC5855o interfaceC5855o) {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        InterfaceC1312h m5965b3;
        InterfaceC1312h m5965b4;
        AbstractC5868k.m23674f(abstractActivityC7763a, "activity");
        AbstractC5868k.m23674f(interfaceC5855o, "view");
        this.f24596a = abstractActivityC7763a;
        this.f24597b = interfaceC5855o;
        this.f24598c = C6284v.class.getSimpleName();
        m5965b = AbstractC1314j.m5965b(new a());
        this.f24604i = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new c());
        this.f24605j = m5965b2;
        m5965b3 = AbstractC1314j.m5965b(new b());
        this.f24606k = m5965b3;
        m5965b4 = AbstractC1314j.m5965b(new d());
        this.f24607l = m5965b4;
    }

    /* renamed from: E3 */
    private final C0142d m25000E3() {
        return (C0142d) this.f24606k.getValue();
    }

    /* renamed from: F3 */
    private final C0217w m25001F3() {
        return (C0217w) this.f24605j.getValue();
    }

    /* renamed from: G3 */
    private final C0210u m25002G3() {
        return (C0210u) this.f24607l.getValue();
    }

    /* renamed from: Y0 */
    private final C0134b m25003Y0() {
        return (C0134b) this.f24604i.getValue();
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        this.f24597b.mo16488h();
    }

    @Override // p301qb.InterfaceC6383f
    /* renamed from: D */
    public void mo25004D(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f24603h = false;
        this.f24597b.mo16485d();
        this.f24597b.mo16478D(str);
    }

    @Override // p301qb.InterfaceC6419r
    /* renamed from: E */
    public void mo20411E(SubscribeData subscribeData) {
        this.f24603h = false;
        this.f24597b.mo16485d();
        this.f24597b.mo16486e3();
    }

    @Override // p301qb.InterfaceC6393i0
    /* renamed from: I3 */
    public void mo20718I3(GetItemDataResult getItemDataResult) {
        AbstractC5868k.m23674f(getItemDataResult, "itemDataResult");
        this.f24597b.mo16485d();
        InterfaceC5855o interfaceC5855o = this.f24597b;
        AssetData assetData = getItemDataResult.getData().getAssetData();
        AbstractC5868k.m23671c(assetData);
        interfaceC5855o.mo16494s3(assetData);
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f24596a.m19900N3();
    }

    @Override // p253nd.InterfaceC5854n
    /* renamed from: P1 */
    public void mo23648P1(String str, String str2, int i10, int i11) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "contentId");
        C0133a2 c0133a2 = new C0133a2(this);
        this.f24600e = c0133a2;
        c0133a2.m529b(str, str2, i10, 50, i11);
    }

    @Override // p301qb.InterfaceC6439x1
    /* renamed from: R3 */
    public void mo25005R3(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f24597b.mo16497u1(str);
    }

    @Override // p253nd.InterfaceC5854n
    /* renamed from: W1 */
    public void mo23649W1(int i10) {
        List m6989h;
        if (!this.f24603h) {
            this.f24603h = true;
            this.f24597b.mo16484c();
            C0210u m25002G3 = m25002G3();
            m6989h = AbstractC1500l.m6989h(Integer.valueOf(i10));
            m25002G3.m738b(m6989h, null);
        }
    }

    @Override // p253nd.InterfaceC5854n
    /* renamed from: X */
    public void mo23650X(String str, String str2, String str3, boolean z10) {
        List m6989h;
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, SerializableCookie.NAME);
        AbstractC5868k.m23674f(str3, "contentId");
        if (!this.f24602g) {
            this.f24602g = true;
            this.f24597b.mo16484c();
            C0134b m25003Y0 = m25003Y0();
            m6989h = AbstractC1500l.m6989h(str3);
            m25003Y0.m532b(str, m6989h, z10);
        }
    }

    @Override // p301qb.InterfaceC6419r
    /* renamed from: X5 */
    public void mo20413X5(String str, int i10) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f24603h = false;
        this.f24597b.mo16485d();
        this.f24597b.mo16483b0(str);
    }

    @Override // p301qb.InterfaceC6439x1
    /* renamed from: Z1 */
    public void mo25006Z1(SearchByContentResultData searchByContentResultData) {
        AbstractC5868k.m23674f(searchByContentResultData, "result");
        this.f24597b.mo16490l0(searchByContentResultData);
    }

    @Override // p253nd.InterfaceC5854n
    /* renamed from: Z2 */
    public void mo23651Z2(String str, String str2) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(str2, "rows");
        C0228z1 c0228z1 = new C0228z1(this);
        this.f24601f = c0228z1;
        c0228z1.m796b(str, str2);
    }

    @Override // p253nd.InterfaceC5854n
    /* renamed from: b2 */
    public void mo23652b2(String str, String str2) {
        AbstractC5868k.m23674f(str, "mType");
        AbstractC5868k.m23674f(str2, "contentId");
        if (!this.f24603h) {
            this.f24603h = true;
            this.f24597b.mo16484c();
            m25000E3().m546b(str, str2);
        }
    }

    @Override // p301qb.InterfaceC6445z1
    /* renamed from: c6 */
    public void mo25007c6(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f24597b.mo16497u1(str);
    }

    @Override // p253nd.InterfaceC5854n
    /* renamed from: e3 */
    public void mo23653e3(int i10) {
        List m6989h;
        if (!this.f24602g) {
            this.f24602g = true;
            this.f24597b.mo16484c();
            C0217w m25001F3 = m25001F3();
            m6989h = AbstractC1500l.m6989h(Integer.valueOf(i10));
            m25001F3.m768b(m6989h, null);
        }
    }

    @Override // p301qb.InterfaceC6383f
    /* renamed from: k2 */
    public void mo25008k2(AddSubscribeResult addSubscribeResult) {
        AbstractC5868k.m23674f(addSubscribeResult, "bean");
        this.f24603h = false;
        this.f24597b.mo16485d();
        this.f24597b.mo16480S1(addSubscribeResult.getData());
    }

    @Override // p253nd.InterfaceC5854n
    /* renamed from: m */
    public void mo23654m(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "contentId");
        AbstractC5868k.m23674f(str2, "type");
        C0195q0 c0195q0 = new C0195q0(this);
        this.f24599d = c0195q0;
        c0195q0.m707e(str, str2, str3);
        this.f24597b.mo16484c();
    }

    @Override // p301qb.InterfaceC6380e
    /* renamed from: n */
    public void mo20455n(List list) {
        AbstractC5868k.m23674f(list, "favId");
        this.f24602g = false;
        this.f24597b.mo16485d();
        this.f24597b.mo16491n(list);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p301qb.InterfaceC6425t
    /* renamed from: p */
    public void mo20456p(FavoriteList favoriteList) {
        this.f24602g = false;
        this.f24597b.mo16485d();
        this.f24597b.mo16492p(favoriteList);
    }

    @Override // p301qb.InterfaceC6445z1
    /* renamed from: q5 */
    public void mo25009q5(SearchByContentResultData searchByContentResultData) {
        AbstractC5868k.m23674f(searchByContentResultData, "result");
        this.f24597b.mo16490l0(searchByContentResultData);
    }

    @Override // p301qb.InterfaceC6393i0
    /* renamed from: r1 */
    public void mo20726r1(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f24597b.mo16485d();
        this.f24597b.mo16482a1(str);
    }

    @Override // p301qb.InterfaceC6380e
    /* renamed from: s */
    public void mo20457s(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f24602g = false;
        this.f24597b.mo16485d();
        this.f24597b.mo16493s(str);
    }

    @Override // p301qb.InterfaceC6425t
    /* renamed from: x1 */
    public void mo20458x1(String str, int i10) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f24602g = false;
        this.f24597b.mo16485d();
        this.f24597b.mo16496u(str);
    }
}
