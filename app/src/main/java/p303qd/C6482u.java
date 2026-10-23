package p303qd;

import ac.C0203s0;
import ac.C0224y0;
import android.os.SystemClock;
import android.text.TextUtils;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.C1466m0;
import com.request.result.AssetList;
import com.request.result.ChildColumn;
import com.request.result.GetNextColumnData;
import com.request.result.GetNextColumnResult;
import com.request.result.GetRecommendsResult;
import com.request.result.GetRecommendsResultData;
import com.request.result.HomeRecommend;
import com.request.result.RecommendList;
import gd.EnumC4432b;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5881x;
import org.android.agoo.message.MessageService;
import p043ce.AbstractC1500l;
import p123f1.C4216h;
import p135fd.C4307b;
import p153h2.AbstractC4509b;
import p164hd.AbstractC4817b;
import p170i2.C4842a;
import p185j2.C4982a;
import p193ja.C5044a;
import p193ja.InterfaceC5045b;
import p201k2.AbstractC5091h;
import p225ld.AbstractC5551e;
import p225ld.C5549c;
import p225ld.C5550d;
import p268od.InterfaceC5965a;
import p268od.InterfaceC5966b;
import p287pb.AbstractApplicationC6253c;
import p301qb.InterfaceC6399k0;
import p301qb.InterfaceC6417q0;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7027d;
import p348u2.AbstractC7029f;
import p400xa.C7581k;
import p400xa.C7594o0;
import p400xa.C7607s1;
import p400xa.C7612u0;

/* renamed from: qd.u */
/* loaded from: classes3.dex */
public final class C6482u implements InterfaceC5965a, InterfaceC5045b, InterfaceC6399k0 {

    /* renamed from: a */
    private AbstractC4817b f24874a;

    /* renamed from: b */
    private InterfaceC5966b f24875b;

    /* renamed from: c */
    private final String f24876c;

    /* renamed from: d */
    private final String f24877d;

    /* renamed from: e */
    private final String f24878e;

    /* renamed from: f */
    private String f24879f;

    /* renamed from: g */
    private int f24880g;

    /* renamed from: h */
    private final int f24881h;

    /* renamed from: i */
    private final String f24882i;

    /* renamed from: j */
    private Disposable f24883j;

    /* renamed from: k */
    private Disposable f24884k;

    /* renamed from: l */
    private Disposable f24885l;

    /* renamed from: m */
    private ChildColumn f24886m;

    /* renamed from: n */
    private final InterfaceC1312h f24887n;

    /* renamed from: o */
    private final ArrayList f24888o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qd.u$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ int f24890b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(1);
            this.f24890b = i10;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo542f(List list) {
            int i10 = 0;
            AbstractC5868k.m23674f(list, "recommends");
            C6482u.this.m25369W5().mo24135u4(list.size());
            ArrayList arrayList = new ArrayList();
            C6482u c6482u = C6482u.this;
            int i11 = this.f24890b;
            Iterator it = list.iterator();
            while (true) {
                C5550d c5550d = null;
                while (it.hasNext()) {
                    HomeRecommend homeRecommend = (HomeRecommend) it.next();
                    if (AbstractC6567a.m25638h(homeRecommend.getAggregationList())) {
                        List<HomeRecommend> aggregationList = homeRecommend.getAggregationList();
                        AbstractC5868k.m23671c(aggregationList);
                        for (HomeRecommend homeRecommend2 : aggregationList) {
                            if (TextUtils.equals(homeRecommend2.getStyle(), c6482u.f24878e)) {
                                if (c5550d != null) {
                                    List m22499b = c5550d.m22499b();
                                    if (m22499b != null) {
                                        i10 = m22499b.size();
                                    } else {
                                        i10 = 0;
                                    }
                                    if (i10 < 6) {
                                        C5549c c5549c = new C5549c(homeRecommend2.getColumnId(), Integer.valueOf(i11), homeRecommend2.getName(), homeRecommend2.getCode(), homeRecommend2.getAlias(), homeRecommend2.getPosterList());
                                        List m22499b2 = c5550d.m22499b();
                                        AbstractC5868k.m23672d(m22499b2, "null cannot be cast to non-null type java.util.ArrayList<com.vod.bean.HomeVodColumn>{ kotlin.collections.TypeAliasesKt.ArrayList<com.vod.bean.HomeVodColumn> }");
                                        ((ArrayList) m22499b2).add(c5549c);
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(new C5549c(homeRecommend2.getColumnId(), Integer.valueOf(i11), homeRecommend2.getName(), homeRecommend2.getCode(), homeRecommend2.getAlias(), homeRecommend2.getPosterList()));
                                c5550d = new C5550d(arrayList.size(), AbstractC5551e.m22508b(), null, arrayList2, homeRecommend2.getAssetList(), false);
                                arrayList.add(c5550d);
                            }
                        }
                    } else if (TextUtils.equals(homeRecommend.getStyle(), c6482u.f24877d)) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(new C5549c(homeRecommend.getColumnId(), Integer.valueOf(i11), homeRecommend.getName(), homeRecommend.getCode(), homeRecommend.getAlias(), homeRecommend.getPosterList()));
                        arrayList.add(new C5550d(arrayList.size(), AbstractC5551e.m22507a(), null, arrayList3, homeRecommend.getAssetList(), false, 32, null));
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(new C5549c(homeRecommend.getColumnId(), Integer.valueOf(i11), homeRecommend.getName(), homeRecommend.getCode(), homeRecommend.getAlias(), homeRecommend.getPosterList()));
                        arrayList.add(new C5550d(arrayList.size(), AbstractC5551e.m22512f(), null, arrayList4, homeRecommend.getAssetList(), false, 32, null));
                    }
                }
                return arrayList;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qd.u$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {
        b() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ObservableSource mo542f(Integer num) {
            boolean z10;
            AbstractC5868k.m23674f(num, "it");
            int intValue = num.intValue();
            if (4 <= intValue && intValue < 7) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return Observable.concatArrayDelayError(C6482u.this.m25355o5(), C6482u.this.m25361s5(), C6482u.this.m25366w5(num.intValue()));
            }
            return Observable.empty();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qd.u$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ int f24892a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10) {
            super(1);
            this.f24892a = i10;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5550d mo542f(List list) {
            int m22509c;
            AbstractC5868k.m23674f(list, "recommendList");
            int i10 = this.f24892a;
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 == 6) {
                        m22509c = AbstractC5551e.m22511e();
                    } else {
                        throw new IllegalArgumentException("recommend num(" + this.f24892a + ") is ilegal argument");
                    }
                } else {
                    m22509c = AbstractC5551e.m22510d();
                }
            } else {
                m22509c = AbstractC5551e.m22509c();
            }
            return new C5550d(0, m22509c, list, null, null, false, 16, null);
        }
    }

    /* renamed from: qd.u$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC6417q0 {

        /* renamed from: b */
        final /* synthetic */ ObservableEmitter f24894b;

        d(ObservableEmitter observableEmitter) {
            this.f24894b = observableEmitter;
        }

        @Override // p301qb.InterfaceC6417q0
        /* renamed from: E5 */
        public void mo25224E5(GetRecommendsResult getRecommendsResult) {
            List<RecommendList> list;
            AbstractC5868k.m23674f(getRecommendsResult, "result");
            String m25317O5 = C6482u.this.m25317O5();
            GetRecommendsResultData data = getRecommendsResult.getData();
            if (data != null) {
                list = data.getRecommendList();
            } else {
                list = null;
            }
            if (list != null) {
                C6482u c6482u = C6482u.this;
                ObservableEmitter observableEmitter = this.f24894b;
                C4982a.f20721a.m20335c(AbstractApplicationC6253c.f24484b.m24887a(), c6482u.m25326U5(), Long.valueOf(c6482u.m25330Y4()));
                C5044a c5044a = C5044a.f20862a;
                c5044a.m20490f(m25317O5, list);
                c5044a.m20492h(m25317O5, list);
                observableEmitter.onNext(list);
                observableEmitter.onComplete();
            }
        }

        @Override // p301qb.InterfaceC6433v1
        /* renamed from: N3 */
        public C4307b mo523N3() {
            return C6482u.this.mo523N3();
        }

        @Override // p301qb.InterfaceC6417q0
        /* renamed from: V4 */
        public void mo25225V4(String str) {
            AbstractC5868k.m23674f(str, "errCode");
            this.f24894b.onError(new RuntimeException("errCode:" + str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qd.u$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC5869l implements InterfaceC5660l {
        e() {
            super(1);
        }

        /* renamed from: a */
        public final void m25373a(C5550d c5550d) {
            if (AbstractC6567a.m25638h(c5550d.m22498a())) {
                InterfaceC5966b m25369W5 = C6482u.this.m25369W5();
                AbstractC5868k.m23673e(c5550d, "it");
                m25369W5.mo24136w1(c5550d);
            } else {
                InterfaceC5966b m25369W52 = C6482u.this.m25369W5();
                AbstractC5868k.m23673e(c5550d, "it");
                m25369W52.mo24132i5(c5550d);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m25373a((C5550d) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qd.u$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final f f24896a = new f();

        f() {
            super(1);
        }

        /* renamed from: a */
        public final void m25374a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m25374a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qd.u$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC5869l implements InterfaceC5660l {
        g() {
            super(1);
        }

        /* renamed from: a */
        public final void m25375a(ArrayList arrayList) {
            AbstractC4509b.m18871d(C6482u.this.f24876c, "query pageNub" + C6482u.this.f24880g + " column data : " + arrayList, new Object[0]);
            C6482u.this.m25369W5().mo24130g(false);
            InterfaceC5966b m25369W5 = C6482u.this.m25369W5();
            AbstractC5868k.m23673e(arrayList, "it");
            m25369W5.mo24129e3(arrayList);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m25375a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qd.u$h */
    /* loaded from: classes3.dex */
    public static final class h extends AbstractC5869l implements InterfaceC5660l {
        h() {
            super(1);
        }

        /* renamed from: a */
        public final void m25376a(Throwable th) {
            C6482u c6482u = C6482u.this;
            c6482u.f24880g--;
            AbstractC4509b.m18871d(C6482u.this.f24876c, "query pageNub" + C6482u.this.f24880g + " column data error", new Object[0]);
            C6482u.this.m25369W5().mo24130g(false);
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m25376a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: qd.u$i */
    /* loaded from: classes3.dex */
    public static final class i implements InterfaceC6399k0 {

        /* renamed from: b */
        final /* synthetic */ ObservableEmitter f24900b;

        /* renamed from: c */
        final /* synthetic */ int f24901c;

        /* renamed from: d */
        final /* synthetic */ String f24902d;

        /* renamed from: e */
        final /* synthetic */ int f24903e;

        i(ObservableEmitter observableEmitter, int i10, String str, int i11) {
            this.f24900b = observableEmitter;
            this.f24901c = i10;
            this.f24902d = str;
            this.f24903e = i11;
        }

        @Override // p301qb.InterfaceC6433v1
        /* renamed from: N3 */
        public C4307b mo523N3() {
            return C6482u.this.mo523N3();
        }

        @Override // p301qb.InterfaceC6399k0
        /* renamed from: P2 */
        public void mo25214P2(String str) {
            AbstractC5868k.m23674f(str, "errCode");
            if (!AbstractC5868k.m23669a(str, "aaa100027") && !AbstractC5868k.m23669a(str, "aaa100028")) {
                this.f24900b.onError(new RuntimeException("errCode:" + str));
                return;
            }
            this.f24900b.onError(new C7612u0());
        }

        @Override // p301qb.InterfaceC6399k0
        /* renamed from: n4 */
        public void mo25215n4(GetNextColumnResult getNextColumnResult, String str) {
            GetNextColumnData getNextColumnData;
            ArrayList<HomeRecommend> arrayList;
            Integer totalSize;
            AbstractC5868k.m23674f(getNextColumnResult, "result");
            AbstractC5868k.m23674f(str, "pageAndCodKey");
            boolean z10 = true;
            int i10 = 0;
            ArrayList<HomeRecommend> arrayList2 = null;
            if (AbstractC5868k.m23669a(getNextColumnResult.getReturnCode(), "304")) {
                String m29097f = C7581k.f27855a.m29097f(str);
                if (m29097f != null && m29097f.length() != 0) {
                    z10 = false;
                }
                if (!z10) {
                    getNextColumnData = (GetNextColumnData) AbstractC7027d.m27114a().fromJson(m29097f, GetNextColumnData.class);
                } else {
                    getNextColumnData = null;
                }
                if (getNextColumnData != null) {
                    arrayList = getNextColumnData.getRecommendList();
                } else {
                    arrayList = null;
                }
                if (AbstractC6567a.m25638h(arrayList)) {
                    InterfaceC5966b m25369W5 = C6482u.this.m25369W5();
                    if (getNextColumnData != null && (totalSize = getNextColumnData.getTotalSize()) != null) {
                        i10 = totalSize.intValue();
                    }
                    m25369W5.mo24134u2(i10);
                    ObservableEmitter observableEmitter = this.f24900b;
                    if (getNextColumnData != null) {
                        arrayList2 = getNextColumnData.getRecommendList();
                    }
                    AbstractC5868k.m23671c(arrayList2);
                    observableEmitter.onNext(arrayList2);
                } else {
                    C4982a.f20721a.m20335c(AbstractApplicationC6253c.f24484b.m24887a(), str, "");
                    if (!C6482u.this.f24888o.contains(str)) {
                        C6482u.this.m25341e6(this.f24901c, this.f24903e, this.f24902d, this.f24900b);
                        C6482u.this.f24888o.add(str);
                        return;
                    }
                }
            } else {
                String json = AbstractC7027d.m27114a().toJson(getNextColumnResult.getData());
                if (json != null && json.length() != 0) {
                    z10 = false;
                }
                if (!z10) {
                    C7581k c7581k = C7581k.f27855a;
                    AbstractC5868k.m23673e(json, "strJson");
                    c7581k.m29098g(str, json);
                }
                InterfaceC5966b m25369W52 = C6482u.this.m25369W5();
                GetNextColumnData data = getNextColumnResult.getData();
                AbstractC5868k.m23671c(data);
                Integer totalSize2 = data.getTotalSize();
                if (totalSize2 != null) {
                    i10 = totalSize2.intValue();
                }
                m25369W52.mo24134u2(i10);
                ObservableEmitter observableEmitter2 = this.f24900b;
                GetNextColumnData data2 = getNextColumnResult.getData();
                if (data2 != null) {
                    arrayList2 = data2.getRecommendList();
                }
                AbstractC5868k.m23671c(arrayList2);
                observableEmitter2.onNext(arrayList2);
            }
            this.f24900b.onComplete();
        }
    }

    /* renamed from: qd.u$j */
    /* loaded from: classes3.dex */
    static final class j extends AbstractC5869l implements InterfaceC5642a {
        j() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0203s0 invoke() {
            return new C0203s0(C6482u.this);
        }
    }

    /* renamed from: qd.u$k */
    /* loaded from: classes3.dex */
    static final class k extends AbstractC5869l implements InterfaceC5660l {
        k() {
            super(1);
        }

        /* renamed from: a */
        public final void m25378a(String str) {
            C6482u.this.m25369W5().mo24128d6();
            C6482u.this.m25369W5().mo24130g(false);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m25378a((String) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: qd.u$l */
    /* loaded from: classes3.dex */
    static final class l extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final l f24906a = new l();

        l() {
            super(1);
        }

        /* renamed from: a */
        public final void m25379a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m25379a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: qd.u$m */
    /* loaded from: classes3.dex */
    static final class m extends AbstractC5869l implements InterfaceC5664p {

        /* renamed from: a */
        public static final m f24907a = new m();

        m() {
            super(2);
        }

        /* renamed from: a */
        public final void m25380a(ArrayList arrayList, Object obj) {
            if (obj instanceof C5550d) {
                arrayList.add(0, obj);
            } else if (obj instanceof List) {
                arrayList.addAll((List) obj);
            }
        }

        @Override // me.InterfaceC5664p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
            m25380a((ArrayList) obj, obj2);
            return C1328x.f4998a;
        }
    }

    /* renamed from: qd.u$n */
    /* loaded from: classes3.dex */
    static final class n extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final n f24908a = new n();

        n() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo542f(ArrayList arrayList) {
            AbstractC5868k.m23674f(arrayList, "homeVodExtras");
            int i10 = 0;
            for (Object obj : arrayList) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC1500l.m6991j();
                }
                ((C5550d) obj).m22505h(i10);
                i10 = i11;
            }
            return arrayList;
        }
    }

    /* renamed from: qd.u$o */
    /* loaded from: classes3.dex */
    static final class o extends AbstractC5869l implements InterfaceC5660l {
        o() {
            super(1);
        }

        /* renamed from: a */
        public final void m25382a(ArrayList arrayList) {
            C6482u.this.m25369W5().mo24130g(false);
            InterfaceC5966b m25369W5 = C6482u.this.m25369W5();
            AbstractC5868k.m23673e(arrayList, "it");
            m25369W5.mo24131h6(arrayList);
            C6482u.this.m25299A5(arrayList);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m25382a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: qd.u$p */
    /* loaded from: classes3.dex */
    static final class p extends AbstractC5869l implements InterfaceC5660l {
        p() {
            super(1);
        }

        /* renamed from: a */
        public final void m25383a(Throwable th) {
            if (!(th instanceof C7612u0)) {
                C6482u c6482u = C6482u.this;
                AbstractC5868k.m23673e(th, "it");
                if (!c6482u.m25342f6(th)) {
                    C6482u.this.m25369W5().mo24137y0();
                    C6482u.this.m25369W5().mo24130g(false);
                    th.printStackTrace();
                }
            }
            C6482u.this.m25369W5().mo24127S4();
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m25383a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    public C6482u(AbstractC4817b abstractC4817b, InterfaceC5966b interfaceC5966b) {
        String str;
        InterfaceC1312h m5965b;
        AbstractC5868k.m23674f(abstractC4817b, "fragment");
        AbstractC5868k.m23674f(interfaceC5966b, "view");
        this.f24874a = abstractC4817b;
        this.f24875b = interfaceC5966b;
        this.f24876c = "HomeVodPresenter";
        this.f24877d = "normal";
        this.f24878e = "person";
        this.f24879f = "";
        this.f24881h = 10;
        if (C4842a.f20329a.m19920a().m19932I()) {
            str = "1";
        } else {
            str = MessageService.MSG_DB_READY_REPORT;
        }
        this.f24882i = str;
        m5965b = AbstractC1314j.m5965b(new j());
        this.f24887n = m5965b;
        this.f24888o = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A5 */
    public final void m25299A5(final List list) {
        if (AbstractC6567a.m25635e(list)) {
            return;
        }
        Observable compose = Observable.create(new ObservableOnSubscribe() { // from class: qd.c
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C6482u.m25300B5(list, this, observableEmitter);
            }
        }).compose(AbstractC7029f.m27121b());
        final e eVar = new e();
        Consumer consumer = new Consumer() { // from class: qd.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6482u.m25303D5(InterfaceC5660l.this, obj);
            }
        };
        final f fVar = f.f24896a;
        this.f24884k = compose.subscribe(consumer, new Consumer() { // from class: qd.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6482u.m25306F5(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B5 */
    public static final void m25300B5(List list, C6482u c6482u, ObservableEmitter observableEmitter) {
        C7594o0.a aVar;
        AbstractC5868k.m23674f(list, "$homeVodExtras");
        AbstractC5868k.m23674f(c6482u, "this$0");
        AbstractC5868k.m23674f(observableEmitter, "emitter");
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5550d c5550d = (C5550d) it.next();
            if (c5550d.m22500c() == AbstractC5551e.m22507a() || c5550d.m22500c() == AbstractC5551e.m22512f()) {
                List<AssetList> m22498a = c5550d.m22498a();
                if (AbstractC6567a.m25638h(m22498a)) {
                    AbstractC5868k.m23671c(m22498a);
                    for (AssetList assetList : m22498a) {
                        if (c5550d.m22500c() == AbstractC5551e.m22507a()) {
                            aVar = C7594o0.a.Poster;
                        } else {
                            aVar = C7594o0.a.Icon;
                        }
                        assetList.setMIconPosterUrl(C7594o0.f27942a.m29220i(assetList.getPosterList(), aVar));
                        String m20660c = AbstractC5091h.m20660c(assetList.getName(), assetList.getAlias());
                        if (AbstractC6567a.m25634d(m20660c)) {
                            assetList.setMShowName("");
                        } else {
                            C7607s1 c7607s1 = new C7607s1();
                            AbstractC5868k.m23673e(m20660c, "showName");
                            assetList.setMShowName(c7607s1.m29251a(m20660c).getName());
                        }
                    }
                    c5550d.m22504g(m22498a);
                    observableEmitter.onNext(c5550d);
                } else {
                    AbstractC4509b.m18869b(c6482u.f24876c, "request asset list is empty(" + c6482u.f24879f + ')', new Object[0]);
                    observableEmitter.onNext(c5550d);
                }
            }
            countDownLatch.countDown();
        }
        countDownLatch.await();
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D5 */
    public static final void m25303D5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F5 */
    public static final void m25306F5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: H5 */
    private final Observable m25308H5(final int i10, final int i11, final String str) {
        Observable create = Observable.create(new ObservableOnSubscribe() { // from class: qd.h
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C6482u.m25312K5(C6482u.this, i10, i11, str, observableEmitter);
            }
        });
        AbstractC5868k.m23673e(create, "create { emitter ->\n    …nCode, emitter)\n        }");
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K5 */
    public static final void m25312K5(C6482u c6482u, int i10, int i11, String str, ObservableEmitter observableEmitter) {
        AbstractC5868k.m23674f(c6482u, "this$0");
        AbstractC5868k.m23674f(str, "$columnCode");
        AbstractC5868k.m23674f(observableEmitter, "emitter");
        c6482u.m25341e6(i10, i11, str, observableEmitter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O5 */
    public final String m25317O5() {
        C5881x c5881x = C5881x.f23415a;
        String format = String.format("recommend_%s", Arrays.copyOf(new Object[]{this.f24879f}, 1));
        AbstractC5868k.m23673e(format, "format(format, *args)");
        return format;
    }

    /* renamed from: P5 */
    private final String m25320P5() {
        C5881x c5881x = C5881x.f23415a;
        String format = String.format("%s_%s", Arrays.copyOf(new Object[]{C1466m0.f5627a.m6882q(), this.f24879f}, 2));
        AbstractC5868k.m23673e(format, "format(format, *args)");
        return format;
    }

    /* renamed from: R5 */
    private final C0203s0 m25323R5() {
        return (C0203s0) this.f24887n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U5 */
    public final String m25326U5() {
        C5881x c5881x = C5881x.f23415a;
        String format = String.format("%s_%s", Arrays.copyOf(new Object[]{"service_time_recommends", this.f24879f}, 2));
        AbstractC5868k.m23673e(format, "format(format, *args)");
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y4 */
    public final long m25330Y4() {
        return (C4216h.f18482a.m17618a() + SystemClock.elapsedRealtime()) - ((Number) C4982a.f20721a.m20333a(AbstractApplicationC6253c.f24484b.m24887a(), "dcs_realtime", 0L)).longValue();
    }

    /* renamed from: Y5 */
    private final void m25331Y5(final ArrayList arrayList, final int i10) {
        this.f24875b.mo24135u4(arrayList.size());
        Observable compose = Observable.create(new ObservableOnSubscribe() { // from class: qd.r
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C6482u.m25332Z5(arrayList, this, i10, observableEmitter);
            }
        }).compose(AbstractC7029f.m27121b());
        final g gVar = new g();
        Consumer consumer = new Consumer() { // from class: qd.s
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6482u.m25335b6(InterfaceC5660l.this, obj);
            }
        };
        final h hVar = new h();
        compose.subscribe(consumer, new Consumer() { // from class: qd.t
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6482u.m25338d6(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z5 */
    public static final void m25332Z5(ArrayList arrayList, C6482u c6482u, int i10, ObservableEmitter observableEmitter) {
        AbstractC5868k.m23674f(arrayList, "$recommend");
        AbstractC5868k.m23674f(c6482u, "this$0");
        AbstractC5868k.m23674f(observableEmitter, "emitter");
        ArrayList<C5550d> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            C5550d c5550d = null;
            while (it.hasNext()) {
                HomeRecommend homeRecommend = (HomeRecommend) it.next();
                if (AbstractC6567a.m25638h(homeRecommend.getAggregationList())) {
                    List<HomeRecommend> aggregationList = homeRecommend.getAggregationList();
                    AbstractC5868k.m23671c(aggregationList);
                    for (HomeRecommend homeRecommend2 : aggregationList) {
                        if (TextUtils.equals(homeRecommend2.getStyle(), c6482u.f24878e)) {
                            if (c5550d != null) {
                                List m22499b = c5550d.m22499b();
                                if ((m22499b != null ? m22499b.size() : 0) < 6) {
                                    C5549c c5549c = new C5549c(homeRecommend2.getColumnId(), Integer.valueOf(i10), homeRecommend2.getName(), homeRecommend2.getCode(), homeRecommend2.getAlias(), homeRecommend2.getPosterList());
                                    List m22499b2 = c5550d.m22499b();
                                    AbstractC5868k.m23672d(m22499b2, "null cannot be cast to non-null type java.util.ArrayList<com.vod.bean.HomeVodColumn>{ kotlin.collections.TypeAliasesKt.ArrayList<com.vod.bean.HomeVodColumn> }");
                                    ((ArrayList) m22499b2).add(c5549c);
                                }
                            }
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(new C5549c(homeRecommend2.getColumnId(), Integer.valueOf(i10), homeRecommend2.getName(), homeRecommend2.getCode(), homeRecommend2.getAlias(), homeRecommend2.getPosterList()));
                            c5550d = new C5550d(arrayList2.size(), AbstractC5551e.m22508b(), null, arrayList4, homeRecommend2.getAssetList(), false);
                            arrayList2.add(c5550d);
                        }
                    }
                } else if (TextUtils.equals(homeRecommend.getStyle(), c6482u.f24877d)) {
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(new C5549c(homeRecommend.getColumnId(), Integer.valueOf(i10), homeRecommend.getName(), homeRecommend.getCode(), homeRecommend.getAlias(), homeRecommend.getPosterList()));
                    arrayList2.add(new C5550d(arrayList2.size(), AbstractC5551e.m22507a(), null, arrayList5, homeRecommend.getAssetList(), false, 32, null));
                } else {
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.add(new C5549c(homeRecommend.getColumnId(), Integer.valueOf(i10), homeRecommend.getName(), homeRecommend.getCode(), homeRecommend.getAlias(), homeRecommend.getPosterList()));
                    arrayList2.add(new C5550d(arrayList2.size(), AbstractC5551e.m22512f(), null, arrayList6, homeRecommend.getAssetList(), false, 32, null));
                }
            }
            break loop0;
        }
        for (C5550d c5550d2 : arrayList2) {
            if (c5550d2.m22500c() == AbstractC5551e.m22507a() || c5550d2.m22500c() == AbstractC5551e.m22512f()) {
                List<AssetList> m22498a = c5550d2.m22498a();
                if (AbstractC6567a.m25638h(m22498a)) {
                    AbstractC5868k.m23671c(m22498a);
                    for (AssetList assetList : m22498a) {
                        assetList.setMIconPosterUrl(C7594o0.f27942a.m29220i(assetList.getPosterList(), c5550d2.m22500c() == AbstractC5551e.m22507a() ? C7594o0.a.Poster : C7594o0.a.Icon));
                        String m20660c = AbstractC5091h.m20660c(assetList.getName(), assetList.getAlias());
                        if (AbstractC6567a.m25634d(m20660c)) {
                            assetList.setMShowName("");
                        } else {
                            C7607s1 c7607s1 = new C7607s1();
                            AbstractC5868k.m23673e(m20660c, "showName");
                            assetList.setMShowName(c7607s1.m29251a(m20660c).getName());
                        }
                    }
                    c5550d2.m22504g(m22498a);
                    c5550d2.m22506i(false);
                    arrayList3.add(c5550d2);
                } else {
                    AbstractC4509b.m18869b(c6482u.f24876c, "request asset list is empty(" + c6482u.f24879f + ')', new Object[0]);
                }
            }
        }
        observableEmitter.onNext(arrayList3);
        observableEmitter.onComplete();
    }

    /* renamed from: b5 */
    private final Maybe m25334b5(String str, int i10) {
        Maybe firstElement = Observable.concatArray(m25308H5(this.f24880g, this.f24881h, str)).firstElement();
        final a aVar = new a(i10);
        Maybe map = firstElement.map(new Function() { // from class: qd.b
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List m25340e5;
                m25340e5 = C6482u.m25340e5(InterfaceC5660l.this, obj);
                return m25340e5;
            }
        });
        AbstractC5868k.m23673e(map, "private fun createColumn…xtras\n            }\n    }");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b6 */
    public static final void m25335b6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d6 */
    public static final void m25338d6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e5 */
    public static final List m25340e5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (List) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e6 */
    public final void m25341e6(int i10, int i11, String str, ObservableEmitter observableEmitter) {
        new C0203s0(new i(observableEmitter, i10, str, i11)).m726b(i10, i11, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f6 */
    public final boolean m25342f6(Throwable th) {
        CompositeException compositeException;
        if (th instanceof CompositeException) {
            compositeException = (CompositeException) th;
        } else {
            compositeException = null;
        }
        if (compositeException != null) {
            List<Throwable> exceptions = compositeException.getExceptions();
            AbstractC5868k.m23673e(exceptions, "it.exceptions");
            Iterator<T> it = exceptions.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof C7612u0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: g5 */
    private final Maybe m25344g5(int i10) {
        Observable just = Observable.just(Integer.valueOf(i10));
        final b bVar = new b();
        Maybe firstElement = just.flatMap(new Function() { // from class: qd.f
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource m25348i5;
                m25348i5 = C6482u.m25348i5(InterfaceC5660l.this, obj);
                return m25348i5;
            }
        }).firstElement();
        final c cVar = new c(i10);
        Maybe map = firstElement.map(new Function() { // from class: qd.g
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                C5550d m25352k5;
                m25352k5 = C6482u.m25352k5(InterfaceC5660l.this, obj);
                return m25352k5;
            }
        });
        AbstractC5868k.m23673e(map, "private fun createRecomm…    )\n            }\n    }");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g6 */
    public static final void m25345g6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h6 */
    public static final void m25347h6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i5 */
    public static final ObservableSource m25348i5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ObservableSource) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i6 */
    public static final ArrayList m25349i6() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j6 */
    public static final void m25350j6(InterfaceC5664p interfaceC5664p, Object obj, Object obj2) {
        AbstractC5868k.m23674f(interfaceC5664p, "$tmp0");
        interfaceC5664p.mo2391h(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k5 */
    public static final C5550d m25352k5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (C5550d) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k6 */
    public static final ArrayList m25353k6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ArrayList) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l6 */
    public static final void m25354l6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o5 */
    public final Observable m25355o5() {
        Observable create = Observable.create(new ObservableOnSubscribe() { // from class: qd.j
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C6482u.m25359r5(C6482u.this, observableEmitter);
            }
        });
        AbstractC5868k.m23673e(create, "create {\n            if …it.onComplete()\n        }");
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p6 */
    public static final void m25356p6(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r5 */
    public static final void m25359r5(C6482u c6482u, ObservableEmitter observableEmitter) {
        AbstractC5868k.m23674f(c6482u, "this$0");
        AbstractC5868k.m23674f(observableEmitter, "it");
        List m20486b = C5044a.f20862a.m20486b(c6482u.m25317O5());
        if (AbstractC6567a.m25635e(m20486b)) {
            observableEmitter.onComplete();
            return;
        }
        AbstractC5868k.m23671c(m20486b);
        observableEmitter.onNext(m20486b);
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s5 */
    public final Observable m25361s5() {
        Observable create = Observable.create(new ObservableOnSubscribe() { // from class: qd.k
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C6482u.m25362t5(C6482u.this, observableEmitter);
            }
        });
        AbstractC5868k.m23673e(create, "create {\n            if …it.onComplete()\n        }");
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t5 */
    public static final void m25362t5(C6482u c6482u, ObservableEmitter observableEmitter) {
        AbstractC5868k.m23674f(c6482u, "this$0");
        AbstractC5868k.m23674f(observableEmitter, "it");
        List m20487c = C5044a.f20862a.m20487c(c6482u.m25317O5());
        if (AbstractC6567a.m25635e(m20487c)) {
            observableEmitter.onComplete();
            return;
        }
        C4982a c4982a = C4982a.f20721a;
        AbstractApplicationC6253c.a aVar = AbstractApplicationC6253c.f24484b;
        long longValue = ((Number) c4982a.m20333a(aVar.m24887a(), c6482u.m25326U5(), 0L)).longValue();
        int intValue = ((Number) c4982a.m20333a(aVar.m24887a(), "recommends_cache_time", 0)).intValue();
        long m25330Y4 = c6482u.m25330Y4();
        long j10 = (intValue * 60 * 1000) + longValue;
        if (longValue != 0 && intValue != 0 && m25330Y4 < j10) {
            AbstractC5868k.m23671c(m20487c);
            observableEmitter.onNext(m20487c);
        }
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w5 */
    public final Observable m25366w5(final int i10) {
        Observable create = Observable.create(new ObservableOnSubscribe() { // from class: qd.i
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C6482u.m25368z5(C6482u.this, i10, observableEmitter);
            }
        });
        AbstractC5868k.m23673e(create, "create { emitter ->\n    …recommendArray)\n        }");
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z5 */
    public static final void m25368z5(C6482u c6482u, int i10, ObservableEmitter observableEmitter) {
        AbstractC5868k.m23674f(c6482u, "this$0");
        AbstractC5868k.m23674f(observableEmitter, "emitter");
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "";
        }
        int i12 = 2;
        if (1 <= i10) {
            int i13 = 1;
            while (true) {
                C5881x c5881x = C5881x.f23415a;
                String format = String.format("%s_%s%02d", Arrays.copyOf(new Object[]{C1466m0.f5627a.m6882q(), c6482u.f24879f, Integer.valueOf(i13)}, 3));
                AbstractC5868k.m23673e(format, "format(format, *args)");
                strArr[i13 - 1] = format;
                if (i13 == i10) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        new C0224y0(new d(observableEmitter), null, i12, 0 == true ? 1 : 0).m786b(strArr);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
    }

    @Override // p268od.InterfaceC5965a
    /* renamed from: H0 */
    public void mo24123H0() {
        this.f24875b.mo24130g(true);
        C5044a.f20862a.m20491g(this);
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        C4307b m19903l9 = this.f24874a.m19903l9(EnumC4432b.DESTROY_VIEW);
        AbstractC5868k.m23673e(m19903l9, "fragment.bindUntilEvent(…agmentEvent.DESTROY_VIEW)");
        return m19903l9;
    }

    @Override // p301qb.InterfaceC6399k0
    /* renamed from: P2 */
    public void mo25214P2(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        if (!AbstractC5868k.m23669a(str, "aaa100027") && !AbstractC5868k.m23669a(str, "aaa100028")) {
            this.f24880g--;
            this.f24875b.mo24130g(false);
            this.f24875b.mo24126B5(false);
            return;
        }
        this.f24875b.mo24127S4();
    }

    /* renamed from: W5 */
    public final InterfaceC5966b m25369W5() {
        return this.f24875b;
    }

    @Override // p193ja.InterfaceC5045b
    /* renamed from: Y0 */
    public void mo16595Y0() {
        ChildColumn childColumn;
        C5044a c5044a = C5044a.f20862a;
        c5044a.m20493i(this);
        Object m20485a = c5044a.m20485a(m25320P5());
        if (m20485a instanceof ChildColumn) {
            childColumn = (ChildColumn) m20485a;
        } else {
            childColumn = null;
        }
        if (childColumn == null) {
            Observable compose = Observable.just("child column(" + m25320P5() + ") is null").compose(AbstractC7029f.m27121b());
            AbstractC5868k.m23673e(compose, "just(\"child column(${get…chedulerHelper.io2main())");
            Observable m25631a = AbstractC6567a.m25631a(compose, mo523N3());
            final k kVar = new k();
            Consumer consumer = new Consumer() { // from class: qd.a
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C6482u.m25345g6(InterfaceC5660l.this, obj);
                }
            };
            final l lVar = l.f24906a;
            m25631a.subscribe(consumer, new Consumer() { // from class: qd.l
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C6482u.m25347h6(InterfaceC5660l.this, obj);
                }
            });
            return;
        }
        this.f24880g = 1;
        this.f24886m = childColumn;
        this.f24875b.mo24133i6();
        Flowable mergeArrayDelayError = Maybe.mergeArrayDelayError(m25344g5(childColumn.getRecommendNum()), m25334b5(childColumn.getCode(), childColumn.getId()));
        Callable callable = new Callable() { // from class: qd.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ArrayList m25349i6;
                m25349i6 = C6482u.m25349i6();
                return m25349i6;
            }
        };
        final m mVar = m.f24907a;
        Single collect = mergeArrayDelayError.collect(callable, new BiConsumer() { // from class: qd.n
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C6482u.m25350j6(InterfaceC5664p.this, obj, obj2);
            }
        });
        final n nVar = n.f24908a;
        Single observeOn = collect.map(new Function() { // from class: qd.o
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ArrayList m25353k6;
                m25353k6 = C6482u.m25353k6(InterfaceC5660l.this, obj);
                return m25353k6;
            }
        }).subscribeOn(Schedulers.m20294io()).observeOn(AndroidSchedulers.mainThread());
        final o oVar = new o();
        Consumer consumer2 = new Consumer() { // from class: qd.p
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6482u.m25354l6(InterfaceC5660l.this, obj);
            }
        };
        final p pVar = new p();
        this.f24883j = observeOn.subscribe(consumer2, new Consumer() { // from class: qd.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C6482u.m25356p6(InterfaceC5660l.this, obj);
            }
        });
    }

    @Override // p268od.InterfaceC5965a
    /* renamed from: Z */
    public void mo24124Z() {
        ChildColumn childColumn;
        if (this.f24886m == null) {
            Object m20485a = C5044a.f20862a.m20485a(m25320P5());
            if (m20485a instanceof ChildColumn) {
                childColumn = (ChildColumn) m20485a;
            } else {
                childColumn = null;
            }
            this.f24886m = childColumn;
        }
        if (this.f24886m == null) {
            return;
        }
        this.f24880g++;
        this.f24875b.mo24130g(true);
        C0203s0 m25323R5 = m25323R5();
        int i10 = this.f24880g;
        int i11 = this.f24881h;
        ChildColumn childColumn2 = this.f24886m;
        AbstractC5868k.m23671c(childColumn2);
        m25323R5.m726b(i10, i11, childColumn2.getCode());
    }

    @Override // p268od.InterfaceC5965a
    /* renamed from: l3 */
    public void mo24125l3(String str) {
        AbstractC5868k.m23674f(str, "concreteColumnCode");
        this.f24879f = str;
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
        boolean z10;
        boolean z11;
        Disposable disposable = this.f24883j;
        boolean z12 = true;
        if (disposable != null && !disposable.isDisposed()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Disposable disposable2 = this.f24883j;
            AbstractC5868k.m23671c(disposable2);
            disposable2.dispose();
        }
        this.f24883j = null;
        Disposable disposable3 = this.f24884k;
        if (disposable3 != null && !disposable3.isDisposed()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            Disposable disposable4 = this.f24884k;
            AbstractC5868k.m23671c(disposable4);
            disposable4.dispose();
        }
        this.f24884k = null;
        Disposable disposable5 = this.f24885l;
        if (disposable5 == null || disposable5.isDisposed()) {
            z12 = false;
        }
        if (z12) {
            Disposable disposable6 = this.f24885l;
            AbstractC5868k.m23671c(disposable6);
            disposable6.dispose();
        }
        this.f24885l = null;
        C5044a.f20862a.m20493i(this);
    }

    @Override // p301qb.InterfaceC6399k0
    /* renamed from: n4 */
    public void mo25215n4(GetNextColumnResult getNextColumnResult, String str) {
        int i10 = 0;
        GetNextColumnData getNextColumnData;
        ArrayList<HomeRecommend> arrayList;
        AbstractC5868k.m23674f(getNextColumnResult, "result");
        AbstractC5868k.m23674f(str, "pageAndCodKey");
        boolean z10 = true;
        ArrayList<HomeRecommend> arrayList2 = null;
        if (AbstractC5868k.m23669a(getNextColumnResult.getReturnCode(), "304")) {
            String m29097f = C7581k.f27855a.m29097f(str);
            if (m29097f != null && m29097f.length() != 0) {
                z10 = false;
            }
            if (!z10) {
                getNextColumnData = (GetNextColumnData) AbstractC7027d.m27114a().fromJson(m29097f, GetNextColumnData.class);
            } else {
                getNextColumnData = null;
            }
            if (getNextColumnData != null) {
                arrayList = getNextColumnData.getRecommendList();
            } else {
                arrayList = null;
            }
            if (AbstractC6567a.m25638h(arrayList)) {
                if (getNextColumnData != null) {
                    arrayList2 = getNextColumnData.getRecommendList();
                }
                AbstractC5868k.m23671c(arrayList2);
                ChildColumn childColumn = this.f24886m;
                AbstractC5868k.m23671c(childColumn);
                m25331Y5(arrayList2, childColumn.getId());
            } else {
                this.f24880g--;
                C4982a.f20721a.m20335c(AbstractApplicationC6253c.f24484b.m24887a(), str, "");
                if (!this.f24888o.contains(str)) {
                    mo24124Z();
                    this.f24888o.add(str);
                }
            }
        } else {
            String json = AbstractC7027d.m27114a().toJson(getNextColumnResult.getData());
            if (json != null && json.length() != 0) {
                z10 = false;
            }
            if (!z10) {
                C7581k c7581k = C7581k.f27855a;
                AbstractC5868k.m23673e(json, "strJson");
                c7581k.m29098g(str, json);
            }
            InterfaceC5966b interfaceC5966b = this.f24875b;
            GetNextColumnData data = getNextColumnResult.getData();
            AbstractC5868k.m23671c(data);
            Integer totalSize = data.getTotalSize();
            if (totalSize != null) {
                i10 = totalSize.intValue();
            } else {
                i10 = 0;
            }
            interfaceC5966b.mo24134u2(i10);
            GetNextColumnData data2 = getNextColumnResult.getData();
            if (data2 != null) {
                arrayList2 = data2.getRecommendList();
            }
            AbstractC5868k.m23671c(arrayList2);
            ChildColumn childColumn2 = this.f24886m;
            AbstractC5868k.m23671c(childColumn2);
            m25331Y5(arrayList2, childColumn2.getId());
        }
        this.f24875b.mo24126B5(false);
    }
}
