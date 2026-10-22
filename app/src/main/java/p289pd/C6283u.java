package p289pd;

import ac.C0159h0;
import ac.C0221x0;
import ac.C0227z0;
import android.text.Html;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import ca.InterfaceC1439a;
import com.request.result.AssetList;
import com.request.result.ChildColumn;
import com.request.result.GetColumnContentsResult;
import com.request.result.GetColumnContentsResultData;
import com.request.result.GetShelveResult;
import com.request.result.RecommendColumnContentDataBean;
import com.vod.R$string;
import gd.EnumC4431a;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Arrays;
import java.util.List;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5881x;
import org.android.agoo.message.MessageService;
import p135fd.C4307b;
import p170i2.C4842a;
import p193ja.C5044a;
import p201k2.AbstractC5091h;
import p211kc.AbstractC5147b;
import p253nd.InterfaceC5853m;
import p301qb.InterfaceC6375c0;
import p301qb.InterfaceC6414p0;
import p301qb.InterfaceC6420r0;
import p348u2.AbstractC7029f;
import p400xa.AbstractC7598p1;
import p400xa.C7594o0;
import p430z9.AbstractActivityC7763a;

/* renamed from: pd.u */
/* loaded from: classes3.dex */
public final class C6283u implements InterfaceC1439a, InterfaceC6420r0, InterfaceC6414p0, InterfaceC6375c0 {

    /* renamed from: a */
    private AbstractActivityC7763a f24581a;

    /* renamed from: b */
    private InterfaceC5853m f24582b;

    /* renamed from: c */
    private final String f24583c;

    /* renamed from: d */
    private final InterfaceC1312h f24584d;

    /* renamed from: e */
    private final InterfaceC1312h f24585e;

    /* renamed from: f */
    private final InterfaceC1312h f24586f;

    /* renamed from: g */
    private String f24587g;

    /* renamed from: h */
    private final InterfaceC1312h f24588h;

    /* renamed from: pd.u$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0159h0 invoke() {
            return new C0159h0(C6283u.this, null, 2, null);
        }
    }

    /* renamed from: pd.u$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0221x0 invoke() {
            return new C0221x0(C6283u.this);
        }
    }

    /* renamed from: pd.u$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC5869l implements InterfaceC5642a {
        c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0227z0 invoke() {
            return new C0227z0(C6283u.this);
        }
    }

    /* renamed from: pd.u$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final d f24592a = new d();

        d() {
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

    /* renamed from: pd.u$e */
    /* loaded from: classes3.dex */
    static final class e extends AbstractC5869l implements InterfaceC5660l {
        e() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GetShelveResult mo542f(GetShelveResult getShelveResult) {
            AbstractC5868k.m23674f(getShelveResult, "it");
            List<AssetList> assetList = getShelveResult.getData().getAssetList();
            if (assetList != null) {
                C6283u c6283u = C6283u.this;
                for (AssetList assetList2 : assetList) {
                    assetList2.setMIconPosterUrl(C7594o0.f27942a.m29220i(assetList2.getPosterList(), C7594o0.a.Icon));
                    C5881x c5881x = C5881x.f23415a;
                    String string = c6283u.m24989G3().getString(R$string.program_score);
                    AbstractC5868k.m23673e(string, "activity.getString(R.string.program_score)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(((int) assetList2.getScore()) % 10), Integer.valueOf(((int) (assetList2.getScore() * 10)) % 10)}, 2));
                    AbstractC5868k.m23673e(format, "format(format, *args)");
                    assetList2.setMScoreStr(Html.fromHtml(format));
                    assetList2.setMShowName(AbstractC5091h.m20660c(assetList2.getName(), assetList2.getAlias()));
                }
            }
            return getShelveResult;
        }
    }

    /* renamed from: pd.u$f */
    /* loaded from: classes3.dex */
    static final class f extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ int f24595b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i10) {
            super(1);
            this.f24595b = i10;
        }

        /* renamed from: a */
        public final void m24999a(GetShelveResult getShelveResult) {
            InterfaceC5853m m24993b4 = C6283u.this.m24993b4();
            AbstractC5868k.m23673e(getShelveResult, "it");
            m24993b4.mo16416X(getShelveResult, this.f24595b);
            C6283u.this.m24993b4().mo16409F();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m24999a((GetShelveResult) obj);
            return C1328x.f4998a;
        }
    }

    public C6283u(AbstractActivityC7763a abstractActivityC7763a, InterfaceC5853m interfaceC5853m) {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        InterfaceC1312h m5965b3;
        InterfaceC1312h m5965b4;
        AbstractC5868k.m23674f(abstractActivityC7763a, "activity");
        AbstractC5868k.m23674f(interfaceC5853m, "view");
        this.f24581a = abstractActivityC7763a;
        this.f24582b = interfaceC5853m;
        this.f24583c = C6283u.class.getSimpleName();
        m5965b = AbstractC1314j.m5965b(new b());
        this.f24584d = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new a());
        this.f24585e = m5965b2;
        m5965b3 = AbstractC1314j.m5965b(new c());
        this.f24586f = m5965b3;
        this.f24587g = "";
        m5965b4 = AbstractC1314j.m5965b(d.f24592a);
        this.f24588h = m5965b4;
    }

    /* renamed from: O3 */
    private final C0159h0 m24981O3() {
        return (C0159h0) this.f24585e.getValue();
    }

    /* renamed from: P3 */
    private final C0221x0 m24982P3() {
        return (C0221x0) this.f24584d.getValue();
    }

    /* renamed from: Q3 */
    private final C0227z0 m24983Q3() {
        return (C0227z0) this.f24586f.getValue();
    }

    /* renamed from: T3 */
    private final String m24984T3() {
        return (String) this.f24588h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c4 */
    public static final GetShelveResult m24986c4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (GetShelveResult) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d4 */
    public static final void m24987d4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        this.f24582b.mo16417h();
    }

    /* renamed from: F3 */
    public void m24988F3() {
        Disposable m792b = m24983Q3().m792b();
        boolean z10 = false;
        if (m792b != null && !m792b.isDisposed()) {
            z10 = true;
        }
        if (z10) {
            Disposable m792b2 = m24983Q3().m792b();
            if (m792b2 != null) {
                m792b2.dispose();
            }
            m24983Q3().m794d(null);
        }
    }

    /* renamed from: G3 */
    public final AbstractActivityC7763a m24989G3() {
        return this.f24581a;
    }

    /* renamed from: J3 */
    public void m24990J3(Integer num, String str, int i10) {
        if (AbstractC5147b.m20813b(this.f24581a)) {
            this.f24582b.mo16418x();
            m24982P3().m776b(num, str, 1, 100, null, m24984T3());
        } else {
            AbstractActivityC7763a abstractActivityC7763a = this.f24581a;
            AbstractC7598p1.m29244h(abstractActivityC7763a, abstractActivityC7763a.getString(R$string.net_state_tip_new), 0);
        }
    }

    @Override // p301qb.InterfaceC6375c0
    /* renamed from: L2 */
    public void mo23209L2(GetColumnContentsResult getColumnContentsResult, int i10) {
        List<ChildColumn> list;
        AbstractC5868k.m23674f(getColumnContentsResult, "result");
        GetColumnContentsResultData data = getColumnContentsResult.getData();
        if (data != null) {
            list = data.getChildColumnList();
        } else {
            list = null;
        }
        if (list != null) {
            for (ChildColumn childColumn : list) {
                if (AbstractC5868k.m23669a(childColumn.getCode(), this.f24587g)) {
                    this.f24582b.mo16413Q0(childColumn.getId());
                    C5044a.f20862a.m20489e(this.f24587g, childColumn);
                    m24990J3(Integer.valueOf(childColumn.getId()), null, 1);
                    return;
                }
            }
        }
        this.f24582b.mo16414T("portal100006", false);
        this.f24582b.mo16409F();
    }

    @Override // p301qb.InterfaceC6414p0
    /* renamed from: L3 */
    public void mo24948L3(RecommendColumnContentDataBean recommendColumnContentDataBean) {
        AbstractC5868k.m23674f(recommendColumnContentDataBean, "data");
        this.f24582b.mo16412Q(recommendColumnContentDataBean);
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f24581a.m19901Q4(EnumC4431a.DESTROY);
    }

    @Override // p301qb.InterfaceC6375c0
    /* renamed from: S5 */
    public void mo23211S5(String str, int i10, boolean z10) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f24582b.mo16414T(str, false);
        this.f24582b.mo16409F();
    }

    /* renamed from: W3 */
    public void m24991W3(Integer num, String str, int i10, String str2) {
        ChildColumn childColumn;
        if (str2 == null) {
            return;
        }
        this.f24587g = str2;
        Object m20485a = C5044a.f20862a.m20485a(str2);
        if (m20485a instanceof ChildColumn) {
            childColumn = (ChildColumn) m20485a;
        } else {
            childColumn = null;
        }
        if (childColumn != null) {
            m24990J3(Integer.valueOf(childColumn.getId()), str, i10);
        } else if (AbstractC5147b.m20813b(this.f24581a)) {
            this.f24582b.mo16418x();
            m24981O3().m607b(num, str, 1, 100, null, i10, m24984T3());
        } else {
            AbstractActivityC7763a abstractActivityC7763a = this.f24581a;
            AbstractC7598p1.m29244h(abstractActivityC7763a, abstractActivityC7763a.getString(R$string.net_state_tip_new), 0);
        }
    }

    /* renamed from: Y3 */
    public void m24992Y3(int i10, int i11, int i12, Integer num) {
        if (AbstractC5147b.m20813b(this.f24581a)) {
            this.f24582b.mo16418x();
            m24983Q3().m793c(i10, "2", i11, i12, num, 0);
        } else {
            AbstractActivityC7763a abstractActivityC7763a = this.f24581a;
            AbstractC7598p1.m29244h(abstractActivityC7763a, abstractActivityC7763a.getString(R$string.net_state_tip_new), 0);
        }
    }

    /* renamed from: b4 */
    public final InterfaceC5853m m24993b4() {
        return this.f24582b;
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
        this.f24582b.mo16410H();
    }

    @Override // p301qb.InterfaceC6420r0
    /* renamed from: p0 */
    public void mo24951p0(GetShelveResult getShelveResult, int i10) {
        AbstractC5868k.m23674f(getShelveResult, "getShelveDataResult");
        Observable just = Observable.just(getShelveResult);
        final e eVar = new e();
        Observable compose = just.map(new Function() { // from class: pd.s
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                GetShelveResult m24986c4;
                m24986c4 = C6283u.m24986c4(InterfaceC5660l.this, obj);
                return m24986c4;
            }
        }).compose(AbstractC7029f.m27121b());
        final f fVar = new f(i10);
        compose.subscribe(new Consumer() { // from class: pd.t
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6283u.m24987d4(InterfaceC5660l.this, obj);
            }
        });
    }

    @Override // p301qb.InterfaceC6420r0
    /* renamed from: q */
    public void mo24952q(String str, int i10) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f24582b.mo16411P(str, i10);
        this.f24582b.mo16409F();
    }

    @Override // p301qb.InterfaceC6414p0
    /* renamed from: y3 */
    public void mo24953y3(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f24582b.mo16414T(str, false);
        this.f24582b.mo16409F();
    }
}
