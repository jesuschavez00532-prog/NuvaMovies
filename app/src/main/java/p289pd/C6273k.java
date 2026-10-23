package p289pd;

import ac.C0131a0;
import ac.C0139c0;
import android.text.TextUtils;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.lzy.okgo.cache.CacheEntity;
import com.module.R$string;
import com.request.result.AssetList;
import com.request.result.FilterByContentResultData;
import com.request.result.FilterGenreResult;
import com.request.result.FilterGenreResultData;
import com.request.result.FilterInfo;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3325bt;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.AbstractC5882y;
import p135fd.C4307b;
import p201k2.AbstractC5086c;
import p253nd.C5843c;
import p253nd.InterfaceC5844d;
import p253nd.InterfaceC5845e;
import p301qb.InterfaceC6437x;
import p301qb.InterfaceC6442y1;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7029f;
import p400xa.C7577i1;
import p430z9.AbstractActivityC7763a;

/* renamed from: pd.k */
/* loaded from: classes3.dex */
public final class C6273k implements InterfaceC5844d, InterfaceC6437x, InterfaceC6442y1 {

    /* renamed from: a */
    private AbstractActivityC7763a f24517a;

    /* renamed from: b */
    private InterfaceC5845e f24518b;

    /* renamed from: c */
    private final String f24519c;

    /* renamed from: d */
    private int f24520d;

    /* renamed from: e */
    private String f24521e;

    /* renamed from: f */
    private String f24522f;

    /* renamed from: g */
    private String f24523g;

    /* renamed from: h */
    private String f24524h;

    /* renamed from: i */
    private int f24525i;

    /* renamed from: j */
    private final int f24526j;

    /* renamed from: k */
    private boolean f24527k;

    /* renamed from: l */
    private int f24528l;

    /* renamed from: m */
    private C5843c f24529m;

    /* renamed from: n */
    private C5843c f24530n;

    /* renamed from: o */
    private final InterfaceC1312h f24531o;

    /* renamed from: p */
    private final InterfaceC1312h f24532p;

    /* renamed from: pd.k$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0139c0 invoke() {
            return new C0139c0(C6273k.this);
        }
    }

    /* renamed from: pd.k$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0131a0 invoke() {
            return new C0131a0(C6273k.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pd.k$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f24535a = new c();

        c() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo542f(String str) {
            AbstractC5868k.m23674f(str, CacheEntity.KEY);
            return Boolean.valueOf(TextUtils.equals(AbstractC5086c.m20614g("yyyy-MM-dd"), (String) C7577i1.f27838b.m29084c().m29074f(str, "")));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pd.k$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {
        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m24939a(Boolean bool) {
            C6273k c6273k = C6273k.this;
            AbstractC5868k.m23673e(bool, "it");
            c6273k.f24527k = bool.booleanValue();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m24939a((Boolean) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pd.k$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final e f24537a = new e();

        e() {
            super(1);
        }

        /* renamed from: a */
        public final void m24940a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m24940a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pd.k$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final f f24538a = new f();

        f() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo542f(String str) {
            AbstractC5868k.m23674f(str, CacheEntity.KEY);
            C7577i1.f27838b.m29084c().m29076h(str, AbstractC5086c.m20614g("yyyy-MM-dd"));
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pd.k$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC5869l implements InterfaceC5660l {
        g() {
            super(1);
        }

        /* renamed from: a */
        public final void m24942a(Boolean bool) {
            C6273k c6273k = C6273k.this;
            AbstractC5868k.m23673e(bool, "it");
            c6273k.f24527k = bool.booleanValue();
            C6273k.this.m24919T3();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m24942a((Boolean) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: pd.k$h */
    /* loaded from: classes3.dex */
    public static final class h extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final h f24540a = new h();

        h() {
            super(1);
        }

        /* renamed from: a */
        public final void m24943a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m24943a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    public C6273k(AbstractActivityC7763a abstractActivityC7763a, InterfaceC5845e interfaceC5845e) {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        AbstractC5868k.m23674f(abstractActivityC7763a, "activity");
        AbstractC5868k.m23674f(interfaceC5845e, "view");
        this.f24517a = abstractActivityC7763a;
        this.f24518b = interfaceC5845e;
        this.f24519c = C6273k.class.getSimpleName();
        this.f24521e = "";
        this.f24522f = "";
        this.f24523g = "";
        this.f24524h = "";
        this.f24526j = 48;
        this.f24527k = true;
        m5965b = AbstractC1314j.m5965b(new a());
        this.f24531o = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new b());
        this.f24532p = m5965b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T3 */
    public final void m24919T3() {
        this.f24529m = null;
        this.f24530n = null;
        this.f24528l = 0;
    }

    /* renamed from: W3 */
    private final C0139c0 m24920W3() {
        return (C0139c0) this.f24531o.getValue();
    }

    /* renamed from: Y3 */
    private final C0131a0 m24922Y3() {
        return (C0131a0) this.f24532p.getValue();
    }

    /* renamed from: b4 */
    private final void m24923b4() {
        Observable just = Observable.just("filter_toast_date");
        final c cVar = c.f24535a;
        Observable compose = just.map(new Function() { // from class: pd.e
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Boolean m24924c4;
                m24924c4 = C6273k.m24924c4(InterfaceC5660l.this, obj);
                return m24924c4;
            }
        }).compose(AbstractC7029f.m27121b());
        final d dVar = new d();
        Consumer consumer = new Consumer() { // from class: pd.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6273k.m24925d4(InterfaceC5660l.this, obj);
            }
        };
        final e eVar = e.f24537a;
        compose.subscribe(consumer, new Consumer() { // from class: pd.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6273k.m24926e4(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c4 */
    public static final Boolean m24924c4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Boolean) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d4 */
    public static final void m24925d4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e4 */
    public static final void m24926e4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: g4 */
    private final void m24927g4() {
        this.f24527k = true;
        m24919T3();
        Observable just = Observable.just("filter_toast_date");
        final f fVar = f.f24538a;
        Observable compose = just.map(new Function() { // from class: pd.h
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Boolean m24928h4;
                m24928h4 = C6273k.m24928h4(InterfaceC5660l.this, obj);
                return m24928h4;
            }
        }).compose(AbstractC7029f.m27121b());
        final g gVar = new g();
        Consumer consumer = new Consumer() { // from class: pd.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6273k.m24929k4(InterfaceC5660l.this, obj);
            }
        };
        final h hVar = h.f24540a;
        compose.subscribe(consumer, new Consumer() { // from class: pd.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6273k.m24930q4(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h4 */
    public static final Boolean m24928h4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Boolean) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k4 */
    public static final void m24929k4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q4 */
    public static final void m24930q4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        this.f24518b.mo16198a();
        m24923b4();
        C0139c0 m24920W3 = m24920W3();
        String string = this.f24517a.getString(R$string.filter_earlier_year);
        AbstractC5868k.m23673e(string, "activity.getString(R.string.filter_earlier_year)");
        m24920W3.m540c(string);
    }

    @Override // p301qb.InterfaceC6442y1
    /* renamed from: B4 */
    public void mo24931B4(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f24525i--;
        this.f24518b.mo16199b();
        this.f24518b.mo16194T1("portal100022");
    }

    @Override // p301qb.InterfaceC6442y1
    /* renamed from: F2 */
    public void mo24932F2(FilterByContentResultData filterByContentResultData) {
        int i10 = 0;
        AbstractC5868k.m23674f(filterByContentResultData, "result");
        this.f24518b.mo16199b();
        if (this.f24525i <= 1) {
            Integer totalSize = filterByContentResultData.getTotalSize();
            if (totalSize != null) {
                i10 = totalSize.intValue();
            } else {
                i10 = 0;
            }
            if (i10 > 0 && !AbstractC6567a.m25635e(filterByContentResultData.getAssetList())) {
                InterfaceC5845e interfaceC5845e = this.f24518b;
                List<AssetList> assetList = filterByContentResultData.getAssetList();
                AbstractC5868k.m23672d(assetList, "null cannot be cast to non-null type kotlin.collections.MutableList<com.request.result.AssetList>");
                interfaceC5845e.mo16192D2(AbstractC5882y.m23702b(assetList), i10);
                return;
            }
            this.f24525i--;
            this.f24518b.mo16196Y0(true);
            return;
        }
        if (AbstractC6567a.m25635e(filterByContentResultData.getAssetList())) {
            this.f24525i--;
            this.f24518b.mo16196Y0(true);
        } else {
            InterfaceC5845e interfaceC5845e2 = this.f24518b;
            List<AssetList> assetList2 = filterByContentResultData.getAssetList();
            AbstractC5868k.m23672d(assetList2, "null cannot be cast to non-null type kotlin.collections.MutableList<com.request.result.AssetList>");
            interfaceC5845e2.mo16197Z2(AbstractC5882y.m23702b(assetList2));
        }
    }

    @Override // p253nd.InterfaceC5844d
    /* renamed from: G0 */
    public void mo23639G0(int i10, String str, String str2, String str3, String str4) {
        AbstractC5868k.m23674f(str, "genre");
        AbstractC5868k.m23674f(str2, "year");
        AbstractC5868k.m23674f(str3, C3325bt.f14170O);
        AbstractC5868k.m23674f(str4, "audio");
        this.f24520d = i10;
        this.f24521e = str;
        this.f24522f = str2;
        this.f24523g = str3;
        this.f24524h = str4;
        this.f24525i = 1;
        this.f24518b.mo16198a();
        m24922Y3().m525b(str3, str, str2, str4, i10, this.f24526j, this.f24525i);
    }

    @Override // p253nd.InterfaceC5844d
    /* renamed from: J1 */
    public void mo23640J1() {
        this.f24525i++;
        this.f24518b.mo16198a();
        m24922Y3().m525b(this.f24523g, this.f24521e, this.f24522f, this.f24524h, this.f24520d, this.f24526j, this.f24525i);
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f24517a.m19900N3();
    }

    @Override // p301qb.InterfaceC6442y1
    /* renamed from: P0 */
    public void mo24933P0() {
        this.f24525i--;
        this.f24518b.mo16199b();
        InterfaceC5845e interfaceC5845e = this.f24518b;
        boolean z10 = true;
        if (this.f24525i > 1) {
            z10 = false;
        }
        interfaceC5845e.mo16196Y0(z10);
    }

    @Override // p301qb.InterfaceC6437x
    /* renamed from: m5 */
    public void mo24934m5(FilterGenreResult filterGenreResult) {
        List<String> list;
        List<FilterInfo> list2;
        List<String> list3;
        AbstractC5868k.m23674f(filterGenreResult, "filterGenreResult");
        this.f24518b.mo16199b();
        FilterGenreResultData data = filterGenreResult.getData();
        InterfaceC5845e interfaceC5845e = this.f24518b;
        List<FilterInfo> list4 = null;
        if (data != null) {
            list = data.getTags();
        } else {
            list = null;
        }
        if (data != null) {
            list2 = data.getFixYear();
        } else {
            list2 = null;
        }
        if (data != null) {
            list3 = data.getOriginalCountry();
        } else {
            list3 = null;
        }
        if (data != null) {
            list4 = data.getAudio();
        }
        interfaceC5845e.mo16195T2(list, list2, list3, list4);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p301qb.InterfaceC6437x
    /* renamed from: t4 */
    public void mo24935t4(String str) {
        AbstractC5868k.m23674f(str, Constants.KEY_ERROR_CODE);
        this.f24518b.mo16199b();
        this.f24518b.mo16202s1(str);
    }

    @Override // p253nd.InterfaceC5844d
    /* renamed from: y2 */
    public void mo23641y2(int i10, int i11) {
        if (this.f24527k) {
            return;
        }
        if (i10 != 19) {
            m24919T3();
            return;
        }
        if (this.f24529m == null) {
            if (i11 < 54) {
                m24919T3();
                return;
            }
            C5843c c5843c = new C5843c();
            this.f24529m = c5843c;
            this.f24530n = c5843c;
            this.f24528l++;
            return;
        }
        if (this.f24528l < 2) {
            C5843c c5843c2 = new C5843c();
            C5843c c5843c3 = this.f24530n;
            AbstractC5868k.m23671c(c5843c3);
            c5843c3.m23638a(c5843c2);
            this.f24530n = c5843c2;
            this.f24528l++;
            return;
        }
        m24927g4();
        this.f24518b.mo16201r3();
    }
}
