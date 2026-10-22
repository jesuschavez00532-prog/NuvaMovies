package p289pd;

import ac.C0159h0;
import ac.C0227z0;
import android.graphics.Bitmap;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.request.result.AssetList;
import com.request.result.ChildColumn;
import com.request.result.GetColumnContentsResult;
import com.request.result.GetColumnContentsResultData;
import com.request.result.GetShelveResult;
import gd.EnumC4431a;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.AbstractC5882y;
import org.android.agoo.message.MessageService;
import p043ce.AbstractC1508t;
import p132fa.C4300d;
import p135fd.C4307b;
import p170i2.C4842a;
import p193ja.C5044a;
import p201k2.AbstractC5095l;
import p253nd.InterfaceC5856p;
import p253nd.InterfaceC5857q;
import p301qb.InterfaceC6375c0;
import p301qb.InterfaceC6420r0;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7029f;
import p430z9.AbstractActivityC7763a;
import p433zd.AbstractC7786b;

/* renamed from: pd.z */
/* loaded from: classes3.dex */
public final class C6288z implements InterfaceC5856p, InterfaceC6420r0, InterfaceC6375c0 {

    /* renamed from: a */
    private AbstractActivityC7763a f24615a;

    /* renamed from: b */
    private InterfaceC5857q f24616b;

    /* renamed from: c */
    private final String f24617c;

    /* renamed from: d */
    private final int f24618d;

    /* renamed from: e */
    private final int f24619e;

    /* renamed from: f */
    private int f24620f;

    /* renamed from: g */
    private List f24621g;

    /* renamed from: h */
    private final InterfaceC1312h f24622h;

    /* renamed from: i */
    private final InterfaceC1312h f24623i;

    /* renamed from: j */
    private final InterfaceC1312h f24624j;

    /* renamed from: pd.z$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final a f24625a = new a();

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

    /* renamed from: pd.z$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC5869l implements InterfaceC5660l {
        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m25026a(Bitmap bitmap) {
            C6288z.this.m25024W3().mo16550f(bitmap);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m25026a((Bitmap) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: pd.z$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC5869l implements InterfaceC5660l {
        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m25027a(Throwable th) {
            th.printStackTrace();
            C6288z.this.m25024W3().mo16550f(null);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m25027a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: pd.z$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC5869l implements InterfaceC5642a {
        d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0227z0 invoke() {
            return new C0227z0(C6288z.this);
        }
    }

    /* renamed from: pd.z$e */
    /* loaded from: classes3.dex */
    static final class e extends AbstractC5869l implements InterfaceC5642a {
        e() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0159h0 invoke() {
            return new C0159h0(C6288z.this, null, 2, null);
        }
    }

    /* renamed from: pd.z$f */
    /* loaded from: classes3.dex */
    static final class f extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final f f24630a = new f();

        f() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            if (C4842a.f20329a.m19920a().m19932I()) {
                return "1";
            }
            return MessageService.MSG_DB_READY_REPORT;
        }
    }

    public C6288z(AbstractActivityC7763a abstractActivityC7763a, InterfaceC5857q interfaceC5857q) {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        InterfaceC1312h m5965b3;
        AbstractC5868k.m23674f(abstractActivityC7763a, "activity");
        AbstractC5868k.m23674f(interfaceC5857q, "view");
        this.f24615a = abstractActivityC7763a;
        this.f24616b = interfaceC5857q;
        this.f24617c = "VodSearchPresenter";
        this.f24618d = 30;
        this.f24619e = 10;
        m5965b = AbstractC1314j.m5965b(new e());
        this.f24622h = m5965b;
        m5965b2 = AbstractC1314j.m5965b(f.f24630a);
        this.f24623i = m5965b2;
        m5965b3 = AbstractC1314j.m5965b(new d());
        this.f24624j = m5965b3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G3 */
    public static final Bitmap m25016G3(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Bitmap) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J3 */
    public static final void m25017J3(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O3 */
    public static final void m25018O3(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: P3 */
    private final C0227z0 m25019P3() {
        return (C0227z0) this.f24624j.getValue();
    }

    /* renamed from: Q3 */
    private final C0159h0 m25020Q3() {
        return (C0159h0) this.f24622h.getValue();
    }

    /* renamed from: T3 */
    private final String m25021T3() {
        return (String) this.f24623i.getValue();
    }

    /* renamed from: Y3 */
    private final void m25023Y3() {
        int i10;
        int i11;
        if (AbstractC6567a.m25635e(this.f24621g)) {
            return;
        }
        int i12 = this.f24620f * this.f24619e;
        List list = this.f24621g;
        int i13 = 0;
        if (list != null) {
            i10 = list.size();
        } else {
            i10 = 0;
        }
        if (i12 >= i10) {
            this.f24620f = 0;
            i12 = 0;
        }
        int i14 = this.f24619e + i12;
        List list2 = this.f24621g;
        if (list2 != null) {
            i11 = list2.size();
        } else {
            i11 = 0;
        }
        if (i14 > i11) {
            List list3 = this.f24621g;
            if (list3 != null) {
                i13 = list3.size();
            }
            i14 = i13;
        }
        ArrayList arrayList = new ArrayList();
        while (i12 < i14) {
            List list4 = this.f24621g;
            AbstractC5868k.m23671c(list4);
            arrayList.add(list4.get(i12));
            i12++;
        }
        this.f24616b.mo16558q3(arrayList);
        this.f24620f++;
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        mo23655D0();
    }

    @Override // p253nd.InterfaceC5856p
    /* renamed from: D0 */
    public void mo23655D0() {
        ChildColumn childColumn;
        int i10;
        Object m20485a = C5044a.f20862a.m20485a(C4300d.f18678a.m18031f());
        Integer num = null;
        if (m20485a instanceof ChildColumn) {
            childColumn = (ChildColumn) m20485a;
        } else {
            childColumn = null;
        }
        if (childColumn != null) {
            i10 = childColumn.getId();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            if (AbstractC6567a.m25635e(this.f24621g)) {
                this.f24616b.mo16547c();
                C0159h0 m25020Q3 = m25020Q3();
                if (childColumn != null) {
                    num = Integer.valueOf(childColumn.getId());
                }
                m25020Q3.m607b(num, MessageService.MSG_DB_READY_REPORT, 1, 10, null, 0, m25021T3());
                return;
            }
            m25023Y3();
        }
    }

    @Override // p301qb.InterfaceC6375c0
    /* renamed from: L2 */
    public void mo23209L2(GetColumnContentsResult getColumnContentsResult, int i10) {
        ChildColumn childColumn;
        List<ChildColumn> childColumnList;
        Object m7008t;
        AbstractC5868k.m23674f(getColumnContentsResult, "result");
        GetColumnContentsResultData data = getColumnContentsResult.getData();
        int i11 = 0;
        if (data != null && (childColumnList = data.getChildColumnList()) != null) {
            m7008t = AbstractC1508t.m7008t(childColumnList, 0);
            childColumn = (ChildColumn) m7008t;
        } else {
            childColumn = null;
        }
        if (childColumn != null) {
            i11 = childColumn.getId();
        }
        if (i11 > 0) {
            C0227z0 m25019P3 = m25019P3();
            AbstractC5868k.m23671c(childColumn);
            m25019P3.m793c(childColumn.getId(), "2", this.f24618d, 1, null, 0);
        }
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f24615a.m19901Q4(EnumC4431a.DESTROY);
    }

    @Override // p301qb.InterfaceC6375c0
    /* renamed from: S5 */
    public void mo23211S5(String str, int i10, boolean z10) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f24616b.mo16549d();
        if (AbstractC5868k.m23669a(str, "aaa100027") || AbstractC5868k.m23669a(str, "aaa100028")) {
            this.f24616b.mo16553j0(str);
        }
    }

    /* renamed from: W3 */
    public final InterfaceC5857q m25024W3() {
        return this.f24616b;
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p301qb.InterfaceC6420r0
    /* renamed from: p0 */
    public void mo24951p0(GetShelveResult getShelveResult, int i10) {
        AbstractC5868k.m23674f(getShelveResult, "getShelveDataResult");
        List<AssetList> assetList = getShelveResult.getData().getAssetList();
        if (!AbstractC5882y.m23710j(assetList)) {
            assetList = null;
        }
        this.f24621g = assetList;
        this.f24616b.mo16549d();
        m25023Y3();
    }

    @Override // p301qb.InterfaceC6420r0
    /* renamed from: q */
    public void mo24952q(String str, int i10) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f24616b.mo16549d();
        this.f24616b.mo16557q(str, i10);
    }

    @Override // p253nd.InterfaceC5856p
    /* renamed from: u */
    public void mo23656u(String str) {
        AbstractC5868k.m23674f(str, "url");
        Observable just = Observable.just(str);
        final a aVar = a.f24625a;
        Observable compose = just.map(new Function() { // from class: pd.w
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Bitmap m25016G3;
                m25016G3 = C6288z.m25016G3(InterfaceC5660l.this, obj);
                return m25016G3;
            }
        }).compose(this.f24615a.m19900N3()).compose(AbstractC7029f.m27121b());
        final b bVar = new b();
        Consumer consumer = new Consumer() { // from class: pd.x
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6288z.m25017J3(InterfaceC5660l.this, obj);
            }
        };
        final c cVar = new c();
        compose.subscribe(consumer, new Consumer() { // from class: pd.y
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6288z.m25018O3(InterfaceC5660l.this, obj);
            }
        });
    }
}
