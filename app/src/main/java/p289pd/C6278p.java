package p289pd;

import ac.C0190p;
import android.graphics.Bitmap;
import android.text.TextUtils;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p135fd.C4307b;
import p201k2.AbstractC5095l;
import p253nd.InterfaceC5847g;
import p253nd.InterfaceC5848h;
import p301qb.InterfaceC6404m;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7029f;
import p400xa.C7589m1;
import p430z9.AbstractActivityC7763a;
import p433zd.AbstractC7786b;

/* renamed from: pd.p */
/* loaded from: classes3.dex */
public final class C6278p implements InterfaceC5847g, InterfaceC6404m {

    /* renamed from: a */
    private AbstractActivityC7763a f24553a;

    /* renamed from: b */
    private InterfaceC5848h f24554b;

    /* renamed from: c */
    private final String f24555c;

    /* renamed from: d */
    private String f24556d;

    /* renamed from: e */
    private int f24557e;

    /* renamed from: f */
    private final int f24558f;

    /* renamed from: g */
    private final InterfaceC1312h f24559g;

    /* renamed from: pd.p$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final a f24560a = new a();

        a() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bitmap mo542f(String str) {
            AbstractC5868k.m23674f(str, "it");
            return AbstractC5095l.m20689c(str, AbstractC7786b.m30166j(320), AbstractC7786b.m30166j(320));
        }
    }

    /* renamed from: pd.p$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC5869l implements InterfaceC5660l {
        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m24967a(Bitmap bitmap) {
            C6278p.this.m24964Q3().mo16297f(bitmap);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m24967a((Bitmap) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: pd.p$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC5869l implements InterfaceC5660l {
        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m24968a(Throwable th) {
            th.printStackTrace();
            C6278p.this.m24964Q3().mo16297f(null);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m24968a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: pd.p$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC5869l implements InterfaceC5642a {
        d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0190p invoke() {
            return new C0190p(C6278p.this);
        }
    }

    public C6278p(AbstractActivityC7763a abstractActivityC7763a, InterfaceC5848h interfaceC5848h) {
        InterfaceC1312h m5965b;
        AbstractC5868k.m23674f(abstractActivityC7763a, "activity");
        AbstractC5868k.m23674f(interfaceC5848h, "view");
        this.f24553a = abstractActivityC7763a;
        this.f24554b = interfaceC5848h;
        this.f24555c = "RestrictLevelSearchPresenter";
        this.f24556d = "";
        this.f24558f = 20;
        m5965b = AbstractC1314j.m5965b(new d());
        this.f24559g = m5965b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G3 */
    public static final Bitmap m24959G3(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Bitmap) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J3 */
    public static final void m24960J3(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O3 */
    public static final void m24961O3(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: P3 */
    private final C0190p m24962P3() {
        return (C0190p) this.f24559g.getValue();
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f24553a.m19900N3();
    }

    /* renamed from: Q3 */
    public final InterfaceC5848h m24964Q3() {
        return this.f24554b;
    }

    @Override // p301qb.InterfaceC6385f1
    /* renamed from: W2 */
    public void mo23605W2(List list, int i10, String str) {
        AbstractC5868k.m23674f(list, "assetLists");
        AbstractC5868k.m23674f(str, "searchStr");
        this.f24554b.mo16296b();
        if (this.f24557e <= 1) {
            if (i10 > 0 && !AbstractC6567a.m25635e(list)) {
                this.f24554b.mo16302r(list, i10);
                return;
            } else {
                this.f24554b.mo16300m();
                return;
            }
        }
        this.f24554b.mo16301o(list);
    }

    @Override // p253nd.InterfaceC5847g
    /* renamed from: c2 */
    public void mo23642c2() {
        this.f24557e++;
        this.f24554b.mo16295a();
        m24962P3().m689d(null, this.f24556d, "1", this.f24558f, this.f24557e, null);
    }

    @Override // p253nd.InterfaceC5847g
    /* renamed from: d */
    public void mo23643d(String str) {
        if (!AbstractC6567a.m25634d(str) && !TextUtils.equals(str, this.f24556d)) {
            this.f24557e = 1;
            AbstractC5868k.m23671c(str);
            this.f24556d = str;
            this.f24554b.mo16295a();
            m24962P3().m689d(null, this.f24556d, "1", this.f24558f, this.f24557e, null);
            C7589m1.f27886a.m29151t("EVENT_SEARCH_BL", this.f24556d, 1);
        }
    }

    @Override // p301qb.InterfaceC6404m
    /* renamed from: l4 */
    public void mo24965l4() {
        this.f24554b.mo16296b();
        if (this.f24557e <= 1) {
            this.f24554b.mo16300m();
        }
    }

    @Override // p301qb.InterfaceC6385f1
    /* renamed from: m3 */
    public void mo23608m3(String str, String str2) {
        AbstractC5868k.m23674f(str, "errCode");
        AbstractC5868k.m23674f(str2, "searchStr");
        int i10 = this.f24557e;
        if (i10 <= 1) {
            this.f24556d = "";
        }
        this.f24557e = i10 - 1;
        this.f24554b.mo16296b();
        this.f24554b.mo16299j(str);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p253nd.InterfaceC5847g
    /* renamed from: u */
    public void mo23644u(String str) {
        AbstractC5868k.m23674f(str, "url");
        Observable just = Observable.just(str);
        final a aVar = a.f24560a;
        Observable compose = just.map(new Function() { // from class: pd.m
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Bitmap m24959G3;
                m24959G3 = C6278p.m24959G3(InterfaceC5660l.this, obj);
                return m24959G3;
            }
        }).compose(this.f24553a.m19900N3()).compose(AbstractC7029f.m27120a());
        final b bVar = new b();
        Consumer consumer = new Consumer() { // from class: pd.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6278p.m24960J3(InterfaceC5660l.this, obj);
            }
        };
        final c cVar = new c();
        compose.subscribe(consumer, new Consumer() { // from class: pd.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6278p.m24961O3(InterfaceC5660l.this, obj);
            }
        });
    }
}
