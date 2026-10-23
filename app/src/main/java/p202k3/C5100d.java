package p202k3;

import ac.C0136b1;
import ac.C0185n2;
import ac.C0195q0;
import android.content.Context;
import android.os.Build;
import antlr.Version;
import be.AbstractC1314j;
import be.AbstractC1320p;
import be.C1328x;
import be.InterfaceC1312h;
import cc.C1456h0;
import com.download.R$string;
import com.download.bean.UDiskBean;
import com.lzy.okgo.cookie.SerializableCookie;
import com.module.bean.AudioInfoBean;
import com.module.bean.DefinitionBean;
import com.module.bean.SourceBean;
import com.request.bean.SubTitleItemData;
import com.request.bean.SubTitleResult;
import com.request.result.AssetData;
import com.request.result.CdnListBeanResult;
import com.request.result.GetItemDataResult;
import com.request.result.LicenseData;
import com.request.result.MovieList;
import com.request.result.SameSeasonSeriesBean;
import com.request.result.SimpleProgramList;
import com.request.result.StartPlayVODResult;
import com.request.result.StartPlayVODResultData;
import com.request.result.StartPlayVODResultDataItem;
import com.request.result.TotalMovieListItem;
import com.request.result.UrlListBeanResult;
import com.umeng.analytics.pro.C3303ay;
import com.umeng.analytics.pro.C3384f;
import ee.InterfaceC4181d;
import ge.AbstractC4445l;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import me.InterfaceC5642a;
import me.InterfaceC5664p;
import me.InterfaceC5665q;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.android.agoo.message.MessageService;
import p030bc.C1251l2;
import p043ce.AbstractC1504p;
import p125f3.C4224c;
import p135fd.C4307b;
import p136fe.AbstractC4313d;
import p142g3.C4343e;
import p142g3.RunnableC4341c;
import p170i2.C4842a;
import p171i3.InterfaceC4848c;
import p171i3.InterfaceC4849d;
import p201k2.AbstractC5085b;
import p258o3.C5911g;
import p258o3.C5913i;
import p265oa.C5956n;
import p301qb.InterfaceC6393i0;
import p301qb.InterfaceC6412o1;
import p301qb.InterfaceC6426t0;
import p317rb.AbstractC6567a;
import p359ue.AbstractC7167u;
import p400xa.C7565e1;
import p400xa.C7577i1;
import p400xa.C7589m1;
import p400xa.C7597p0;
import ve.AbstractC7269d;
import ve.AbstractC7272e;
import ve.AbstractC7285i0;
import ve.AbstractC7329x;
import ve.C7297m0;
import ve.C7327w0;
import ve.InterfaceC7261a0;

/* renamed from: k3.d */
/* loaded from: classes.dex */
public final class C5100d implements InterfaceC4848c, InterfaceC6393i0, InterfaceC6426t0, InterfaceC6412o1 {

    /* renamed from: a */
    private final Context f20985a;

    /* renamed from: b */
    private InterfaceC4849d f20986b;

    /* renamed from: c */
    private final String f20987c;

    /* renamed from: d */
    private final InterfaceC1312h f20988d;

    /* renamed from: e */
    private final Context f20989e;

    /* renamed from: f */
    private boolean f20990f;

    /* renamed from: g */
    private AssetData f20991g;

    /* renamed from: h */
    private String f20992h;

    /* renamed from: i */
    private int f20993i;

    /* renamed from: j */
    private SimpleProgramList f20994j;

    /* renamed from: k */
    private List f20995k;

    /* renamed from: l */
    private DefinitionBean f20996l;

    /* renamed from: m */
    private SourceBean f20997m;

    /* renamed from: n */
    private int f20998n;

    /* renamed from: o */
    private List f20999o;

    /* renamed from: p */
    private long f21000p;

    /* renamed from: q */
    private final InterfaceC1312h f21001q;

    /* renamed from: r */
    private final InterfaceC1312h f21002r;

    /* renamed from: s */
    private final InterfaceC1312h f21003s;

    /* renamed from: t */
    private final InterfaceC1312h f21004t;

    /* renamed from: k3.d$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC4445l implements InterfaceC5664p {

        /* renamed from: e */
        int f21005e;

        a(InterfaceC4181d interfaceC4181d) {
            super(2, interfaceC4181d);
        }

        @Override // ge.AbstractC4434a
        /* renamed from: a */
        public final InterfaceC4181d mo2390a(Object obj, InterfaceC4181d interfaceC4181d) {
            return new a(interfaceC4181d);
        }

        @Override // ge.AbstractC4434a
        /* renamed from: l */
        public final Object mo2392l(Object obj) {
            Object m18094c = null;
            m18094c = AbstractC4313d.m18094c();
            int i10 = this.f21005e;
            if (i10 != 0) {
                if (i10 == 1) {
                    AbstractC1320p.m5976b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC1320p.m5976b(obj);
                this.f21005e = 1;
                if (AbstractC7285i0.m28228a(3000L, this) == m18094c) {
                    return m18094c;
                }
            }
            if (C5100d.this.f20990f) {
                C5100d.this.f20986b.mo20004G(false, "");
            }
            return C1328x.f4998a;
        }

        @Override // me.InterfaceC5664p
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object mo2391h(InterfaceC7261a0 interfaceC7261a0, InterfaceC4181d interfaceC4181d) {
            return ((a) mo2390a(interfaceC7261a0, interfaceC4181d)).mo2392l(C1328x.f4998a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k3.d$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC4445l implements InterfaceC5664p {

        /* renamed from: e */
        int f21007e;

        /* renamed from: g */
        final /* synthetic */ List f21009g;

        /* renamed from: h */
        final /* synthetic */ boolean f21010h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: k3.d$b$a */
        /* loaded from: classes.dex */
        public static final class a extends AbstractC4445l implements InterfaceC5664p {

            /* renamed from: e */
            int f21011e;

            /* renamed from: f */
            final /* synthetic */ List f21012f;

            /* renamed from: g */
            final /* synthetic */ C5100d f21013g;

            /* renamed from: h */
            final /* synthetic */ boolean f21014h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list, C5100d c5100d, boolean z10, InterfaceC4181d interfaceC4181d) {
                super(2, interfaceC4181d);
                this.f21012f = list;
                this.f21013g = c5100d;
                this.f21014h = z10;
            }

            @Override // ge.AbstractC4434a
            /* renamed from: a */
            public final InterfaceC4181d mo2390a(Object obj, InterfaceC4181d interfaceC4181d) {
                return new a(this.f21012f, this.f21013g, this.f21014h, interfaceC4181d);
            }

            @Override // ge.AbstractC4434a
            /* renamed from: l */
            public final Object mo2392l(Object obj) {
                boolean z10 = false;
                AbstractC4313d.m18094c();
                if (this.f21011e == 0) {
                    AbstractC1320p.m5976b(obj);
                    List<SimpleProgramList> list = this.f21012f;
                    C5100d c5100d = this.f21013g;
                    boolean z11 = this.f21014h;
                    for (SimpleProgramList simpleProgramList : list) {
                        StringBuilder sb2 = new StringBuilder();
                        String contentId = simpleProgramList.getContentId();
                        if (contentId == null) {
                            contentId = "";
                        }
                        sb2.append(contentId);
                        sb2.append('_');
                        sb2.append(c5100d.f20998n);
                        RunnableC4341c m18230b = C4343e.m18227a().m18230b(sb2.toString());
                        if (m18230b == null) {
                            simpleProgramList.setFraction(0.0f);
                            simpleProgramList.setDownloaded(false);
                            simpleProgramList.setDownloading(false);
                        } else {
                            simpleProgramList.setFraction(m18230b.f18886a.fraction);
                            if (m18230b.f18886a.status == 5) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            simpleProgramList.setDownloaded(z10);
                            simpleProgramList.setDownloading(!simpleProgramList.isDownloaded());
                        }
                        if (!z11) {
                            simpleProgramList.setSelected(false);
                        }
                    }
                    return C1328x.f4998a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // me.InterfaceC5664p
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object mo2391h(InterfaceC7261a0 interfaceC7261a0, InterfaceC4181d interfaceC4181d) {
                return ((a) mo2390a(interfaceC7261a0, interfaceC4181d)).mo2392l(C1328x.f4998a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list, boolean z10, InterfaceC4181d interfaceC4181d) {
            super(2, interfaceC4181d);
            this.f21009g = list;
            this.f21010h = z10;
        }

        @Override // ge.AbstractC4434a
        /* renamed from: a */
        public final InterfaceC4181d mo2390a(Object obj, InterfaceC4181d interfaceC4181d) {
            return new b(this.f21009g, this.f21010h, interfaceC4181d);
        }

        @Override // ge.AbstractC4434a
        /* renamed from: l */
        public final Object mo2392l(Object obj) {
            Object m18094c = null;
            m18094c = AbstractC4313d.m18094c();
            int i10 = this.f21007e;
            if (i10 != 0) {
                if (i10 == 1) {
                    AbstractC1320p.m5976b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC1320p.m5976b(obj);
                AbstractC7329x m28252b = C7297m0.m28252b();
                a aVar = new a(this.f21009g, C5100d.this, this.f21010h, null);
                this.f21007e = 1;
                if (AbstractC7269d.m28113c(m28252b, aVar, this) == m18094c) {
                    return m18094c;
                }
            }
            C5100d.this.f20986b.mo20005H(0, this.f21009g);
            if (!this.f21010h) {
                C5100d.this.mo19992J(true, (SimpleProgramList) this.f21009g.get(0));
            }
            return C1328x.f4998a;
        }

        @Override // me.InterfaceC5664p
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object mo2391h(InterfaceC7261a0 interfaceC7261a0, InterfaceC4181d interfaceC4181d) {
            return ((b) mo2390a(interfaceC7261a0, interfaceC4181d)).mo2392l(C1328x.f4998a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k3.d$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC4445l implements InterfaceC5664p {

        /* renamed from: e */
        int f21015e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: k3.d$c$a */
        /* loaded from: classes.dex */
        public static final class a extends AbstractC4445l implements InterfaceC5664p {

            /* renamed from: e */
            int f21017e;

            a(InterfaceC4181d interfaceC4181d) {
                super(2, interfaceC4181d);
            }

            @Override // ge.AbstractC4434a
            /* renamed from: a */
            public final InterfaceC4181d mo2390a(Object obj, InterfaceC4181d interfaceC4181d) {
                return new a(interfaceC4181d);
            }

            @Override // ge.AbstractC4434a
            /* renamed from: l */
            public final Object mo2392l(Object obj) {
                AbstractC4313d.m18094c();
                if (this.f21017e == 0) {
                    AbstractC1320p.m5976b(obj);
                    return C4343e.m18229h(C4224c.m17666u().m17671q());
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // me.InterfaceC5664p
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object mo2391h(InterfaceC7261a0 interfaceC7261a0, InterfaceC4181d interfaceC4181d) {
                return ((a) mo2390a(interfaceC7261a0, interfaceC4181d)).mo2392l(C1328x.f4998a);
            }
        }

        c(InterfaceC4181d interfaceC4181d) {
            super(2, interfaceC4181d);
        }

        @Override // ge.AbstractC4434a
        /* renamed from: a */
        public final InterfaceC4181d mo2390a(Object obj, InterfaceC4181d interfaceC4181d) {
            return new c(interfaceC4181d);
        }

        @Override // ge.AbstractC4434a
        /* renamed from: l */
        public final Object mo2392l(Object obj) {
            Object m18094c = null;
            m18094c = AbstractC4313d.m18094c();
            int i10 = this.f21015e;
            if (i10 != 0) {
                if (i10 == 1) {
                    AbstractC1320p.m5976b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC1320p.m5976b(obj);
                AbstractC7329x m28252b = C7297m0.m28252b();
                a aVar = new a(null);
                this.f21015e = 1;
                if (AbstractC7269d.m28113c(m28252b, aVar, this) == m18094c) {
                    return m18094c;
                }
            }
            AssetData assetData = C5100d.this.f20991g;
            if (assetData != null) {
                C5100d c5100d = C5100d.this;
                c5100d.mo19996f2(assetData, c5100d.f20992h);
            }
            return C1328x.f4998a;
        }

        @Override // me.InterfaceC5664p
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object mo2391h(InterfaceC7261a0 interfaceC7261a0, InterfaceC4181d interfaceC4181d) {
            return ((c) mo2390a(interfaceC7261a0, interfaceC4181d)).mo2392l(C1328x.f4998a);
        }
    }

    /* renamed from: k3.d$d */
    /* loaded from: classes.dex */
    static final class d extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final d f21018a = new d();

        d() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5911g invoke() {
            return C5911g.f23514h.m23905a();
        }
    }

    /* renamed from: k3.d$e */
    /* loaded from: classes.dex */
    static final class e extends AbstractC5869l implements InterfaceC5642a {
        e() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0195q0 invoke() {
            return new C0195q0(C5100d.this);
        }
    }

    /* renamed from: k3.d$f */
    /* loaded from: classes.dex */
    static final class f extends AbstractC5869l implements InterfaceC5642a {
        f() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0136b1 invoke() {
            return new C0136b1(C5100d.this);
        }
    }

    /* renamed from: k3.d$g */
    /* loaded from: classes.dex */
    static final class g extends AbstractC5869l implements InterfaceC5642a {
        g() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0185n2 invoke() {
            return new C0185n2(C5100d.this);
        }
    }

    /* renamed from: k3.d$h */
    /* loaded from: classes.dex */
    static final class h extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final h f21022a = new h();

        h() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1251l2 invoke() {
            return new C1251l2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k3.d$i */
    /* loaded from: classes.dex */
    public static final class i extends AbstractC5869l implements InterfaceC5665q {
        i() {
            super(3);
        }

        /* renamed from: a */
        public final void m20739a(boolean z10, String str, String str2) {
            AbstractC5868k.m23674f(str, SerializableCookie.NAME);
            AbstractC5868k.m23674f(str2, "path");
            if (z10) {
                C5100d.this.f20986b.mo20011N(str);
            } else {
                C5100d.this.f20986b.mo20003F();
            }
        }

        @Override // me.InterfaceC5665q
        /* renamed from: b */
        public /* bridge */ /* synthetic */ Object mo12281b(Object obj, Object obj2, Object obj3) {
            m20739a(((Boolean) obj).booleanValue(), (String) obj2, (String) obj3);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k3.d$j */
    /* loaded from: classes.dex */
    public static final class j extends AbstractC5869l implements InterfaceC5642a {
        j() {
            super(0);
        }

        /* renamed from: a */
        public final void m20740a() {
            C5100d.this.f20986b.mo20010M();
        }

        @Override // me.InterfaceC5642a
        public /* bridge */ /* synthetic */ Object invoke() {
            m20740a();
            return C1328x.f4998a;
        }
    }

    public C5100d(Context context, InterfaceC4849d interfaceC4849d) {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        InterfaceC1312h m5965b3;
        InterfaceC1312h m5965b4;
        InterfaceC1312h m5965b5;
        AbstractC5868k.m23674f(context, C3384f.f14563X);
        AbstractC5868k.m23674f(interfaceC4849d, "view");
        this.f20985a = context;
        this.f20986b = interfaceC4849d;
        this.f20987c = C5100d.class.getSimpleName();
        m5965b = AbstractC1314j.m5965b(d.f21018a);
        this.f20988d = m5965b;
        this.f20989e = context;
        this.f20992h = MessageService.MSG_DB_READY_REPORT;
        this.f20995k = new ArrayList();
        this.f21000p = -1L;
        m5965b2 = AbstractC1314j.m5965b(new e());
        this.f21001q = m5965b2;
        m5965b3 = AbstractC1314j.m5965b(new f());
        this.f21002r = m5965b3;
        m5965b4 = AbstractC1314j.m5965b(new g());
        this.f21003s = m5965b4;
        m5965b5 = AbstractC1314j.m5965b(h.f21022a);
        this.f21004t = m5965b5;
    }

    /* renamed from: Q3 */
    private final C5911g m20705Q3() {
        return (C5911g) this.f20988d.getValue();
    }

    /* renamed from: T3 */
    private final C0195q0 m20706T3() {
        return (C0195q0) this.f21001q.getValue();
    }

    /* renamed from: W3 */
    private final C0136b1 m20707W3() {
        return (C0136b1) this.f21002r.getValue();
    }

    /* renamed from: Y3 */
    private final C0185n2 m20709Y3() {
        return (C0185n2) this.f21003s.getValue();
    }

    /* renamed from: c4 */
    private final void m20710c4(StartPlayVODResultData startPlayVODResultData) {
        List<TotalMovieListItem> list;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        List<String> list2;
        boolean z12 = false;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str = null;
        boolean z13 = false;
        String str2 = null;
        String str3 = null;
        int i11 = 0;
        String str4 = null;
        MovieList movieList;
        int i12 = 0;
        String str5 = null;
        MovieList movieList2;
        StartPlayVODResultDataItem startPlayVODResultDataItem;
        if (!AbstractC6567a.m25635e(startPlayVODResultData.getEpisodeList())) {
            List<StartPlayVODResultDataItem> episodeList = startPlayVODResultData.getEpisodeList();
            if (episodeList != null && (startPlayVODResultDataItem = episodeList.get(0)) != null) {
                list = startPlayVODResultDataItem.getTotalMovieList();
            } else {
                list = null;
            }
            if (!AbstractC6567a.m25635e(list)) {
                List<StartPlayVODResultDataItem> episodeList2 = startPlayVODResultData.getEpisodeList();
                AbstractC5868k.m23671c(episodeList2);
                StartPlayVODResultDataItem startPlayVODResultDataItem2 = episodeList2.get(0);
                List<TotalMovieListItem> totalMovieList = startPlayVODResultDataItem2.getTotalMovieList();
                if (totalMovieList != null) {
                    i10 = totalMovieList.size();
                } else {
                    i10 = 0;
                }
                if (i10 > 1) {
                    List<TotalMovieListItem> totalMovieList2 = startPlayVODResultDataItem2.getTotalMovieList();
                    AbstractC5868k.m23671c(totalMovieList2);
                    AbstractC1504p.m6994m(totalMovieList2, new Comparator() { // from class: k3.b
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            int m20711d4;
                            m20711d4 = C5100d.m20711d4((TotalMovieListItem) obj, (TotalMovieListItem) obj2);
                            return m20711d4;
                        }
                    });
                }
                List<TotalMovieListItem> totalMovieList3 = startPlayVODResultDataItem2.getTotalMovieList();
                AbstractC5868k.m23671c(totalMovieList3);
                TotalMovieListItem totalMovieListItem = totalMovieList3.get(0);
                if (Build.VERSION.SDK_INT < 21) {
                    List<MovieList> movieList3 = totalMovieListItem.getMovieList();
                    if (movieList3 != null) {
                        i12 = movieList3.size();
                    } else {
                        i12 = 0;
                    }
                    if (i12 > 0) {
                        List<MovieList> movieList4 = totalMovieListItem.getMovieList();
                        if (movieList4 != null && (movieList2 = movieList4.get(0)) != null) {
                            str5 = movieList2.getVideoType();
                        } else {
                            str5 = null;
                        }
                        if (AbstractC5868k.m23669a(str5, MessageService.MSG_ACCS_NOTIFY_DISMISS)) {
                            this.f20986b.mo19999B(C3303ay.f14042b);
                            return;
                        }
                    }
                }
                if (AbstractC5085b.m20604n()) {
                    List<MovieList> movieList5 = totalMovieListItem.getMovieList();
                    if (movieList5 != null) {
                        i11 = movieList5.size();
                    } else {
                        i11 = 0;
                    }
                    if (i11 > 0) {
                        List<MovieList> movieList6 = totalMovieListItem.getMovieList();
                        if (movieList6 != null && (movieList = movieList6.get(0)) != null) {
                            str4 = movieList.getEncodeFormat();
                        } else {
                            str4 = null;
                        }
                        if (AbstractC5868k.m23669a(str4, Version.subversion)) {
                            this.f20986b.mo19999B(C3303ay.f14041a);
                            return;
                        }
                    }
                }
                List<CdnListBeanResult> m6773i = C1456h0.f5574a.m6773i(C1456h0.a.VOD);
                if (m6773i != null && !m6773i.isEmpty()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    InterfaceC4849d interfaceC4849d = this.f20986b;
                    String string = this.f20989e.getString(R$string.download_failed_unavailable);
                    AbstractC5868k.m23673e(string, "mContext.getString(R.str…nload_failed_unavailable)");
                    interfaceC4849d.mo20004G(true, string);
                    return;
                }
                this.f20995k.clear();
                List<TotalMovieListItem> totalMovieList4 = startPlayVODResultDataItem2.getTotalMovieList();
                AbstractC5868k.m23671c(totalMovieList4);
                for (TotalMovieListItem totalMovieListItem2 : totalMovieList4) {
                    List<MovieList> movieList7 = totalMovieListItem2.getMovieList();
                    if (movieList7 != null && !movieList7.isEmpty()) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!z11) {
                        String quality = totalMovieListItem2.getQuality();
                        if (quality == null) {
                            quality = "";
                        }
                        ArrayList arrayList3 = new ArrayList();
                        List<MovieList> movieList8 = totalMovieListItem2.getMovieList();
                        AbstractC5868k.m23671c(movieList8);
                        for (MovieList movieList9 : movieList8) {
                            String audioInfo = movieList9.getAudioInfo();
                            if (audioInfo != null) {
                                list2 = AbstractC7167u.m27748R(audioInfo, new String[]{","}, false, 0, 6, null);
                            } else {
                                list2 = null;
                            }
                            ArrayList arrayList4 = new ArrayList();
                            if (list2 != null && !list2.isEmpty()) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            String str6 = "unkown";
                            if (z12) {
                                String contentId = movieList9.getContentId();
                                if (contentId == null) {
                                    str3 = "";
                                } else {
                                    str3 = contentId;
                                }
                                arrayList = arrayList4;
                                arrayList2 = arrayList3;
                                arrayList.add(new AudioInfoBean(str3, quality, "unkown", null, 8, null));
                            } else {
                                arrayList = arrayList4;
                                arrayList2 = arrayList3;
                                String audioInfo2 = movieList9.getAudioInfo();
                                if (audioInfo2 != null) {
                                    str6 = audioInfo2;
                                }
                                for (String str7 : list2) {
                                    String contentId2 = movieList9.getContentId();
                                    if (contentId2 == null) {
                                        str = "";
                                    } else {
                                        str = contentId2;
                                    }
                                    arrayList.add(new AudioInfoBean(str, quality, str7, null, 8, null));
                                }
                            }
                            String str8 = str6;
                            AbstractC1504p.m6993l(arrayList);
                            List<LicenseData> licenseList = movieList9.getLicenseList();
                            if (licenseList != null && !licenseList.isEmpty()) {
                                z13 = false;
                            } else {
                                z13 = true;
                            }
                            boolean z14 = !z13;
                            String contentId3 = movieList9.getContentId();
                            if (contentId3 == null) {
                                str2 = "";
                            } else {
                                str2 = contentId3;
                            }
                            SourceBean sourceBean = new SourceBean(str2, str8, arrayList, z14, 0, 16, null);
                            ArrayList arrayList5 = arrayList2;
                            arrayList5.add(sourceBean);
                            if (z14) {
                                List<LicenseData> licenseList2 = movieList9.getLicenseList();
                                AbstractC5868k.m23671c(licenseList2);
                                LicenseData licenseData = licenseList2.get(0);
                                C7597p0.f27965b.m29236a().m29234b(licenseData.getLicense(), "media_code");
                                for (CdnListBeanResult cdnListBeanResult : m6773i) {
                                    if (!AbstractC6567a.m25635e(cdnListBeanResult.getUrl_list()) && AbstractC5868k.m23669a(cdnListBeanResult.getCdn_type(), "1")) {
                                        List<UrlListBeanResult> url_list = cdnListBeanResult.getUrl_list();
                                        AbstractC5868k.m23671c(url_list);
                                        Iterator<UrlListBeanResult> it = url_list.iterator();
                                        while (it.hasNext()) {
                                            AbstractC5868k.m23669a(it.next().getTag(), licenseData.getTag());
                                        }
                                    }
                                }
                                if (AbstractC6567a.m25638h(arrayList5)) {
                                    this.f20995k.add(new DefinitionBean(quality, arrayList5, 0, 4, null));
                                }
                            }
                            arrayList3 = arrayList5;
                        }
                    }
                }
                DefinitionBean definitionBean = (DefinitionBean) this.f20995k.get(0);
                this.f20996l = definitionBean;
                if (definitionBean != null) {
                    if (definitionBean.getSourceList().size() > 0) {
                        this.f20998n = 0;
                        this.f20997m = definitionBean.getSourceList().get(0);
                    }
                    this.f20986b.mo20008K(definitionBean);
                    return;
                }
                return;
            }
        }
        InterfaceC4849d interfaceC4849d2 = this.f20986b;
        String string2 = this.f20989e.getString(R$string.download_failed_unavailable);
        AbstractC5868k.m23673e(string2, "mContext.getString(R.str…nload_failed_unavailable)");
        interfaceC4849d2.mo20004G(true, string2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d4 */
    public static final int m20711d4(TotalMovieListItem totalMovieListItem, TotalMovieListItem totalMovieListItem2) {
        C7565e1 c7565e1 = C7565e1.f27773a;
        return c7565e1.m28996a(totalMovieListItem2.getQuality()) - c7565e1.m28996a(totalMovieListItem.getQuality());
    }

    /* renamed from: e4 */
    private final void m20712e4(List list, boolean z10) {
        AbstractC7272e.m28125b(C7327w0.f27234a, C7297m0.m28253c(), null, new b(list, z10, null), 2, null);
    }

    /* renamed from: q4 */
    private final void m20713q4() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0049, code lost:
    
        if (r0 > 1) goto L14;
     */
    /* renamed from: r4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m20714r4(com.request.result.AssetData r11) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p202k3.C5100d.m20714r4(com.request.result.AssetData):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s4 */
    public static final int m20715s4(SameSeasonSeriesBean sameSeasonSeriesBean, SameSeasonSeriesBean sameSeasonSeriesBean2) {
        return sameSeasonSeriesBean2.getSeasonNumber() - sameSeasonSeriesBean.getSeasonNumber();
    }

    /* renamed from: u4 */
    private final void m20716u4(List list, String str) {
        SubTitleItemData subTitleItemData;
        boolean m27763v;
        if (list != null && list.size() > 0) {
            C5956n.f23662f.m24114a(0);
            String str2 = (String) C7577i1.f27838b.m29085d().m29074f("key_setting_subtitle", C4842a.f20329a.m19920a().mo19962k());
            Iterator it = list.iterator();
            while (true) {
                subTitleItemData = null;
                if (!it.hasNext()) {
                    break;
                }
                SubTitleItemData subTitleItemData2 = (SubTitleItemData) it.next();
                String language = subTitleItemData2.getLanguage();
                if (language == null) {
                    language = "";
                }
                m27763v = AbstractC7167u.m27763v(str2, language, false, 2, null);
                if (m27763v) {
                    subTitleItemData = subTitleItemData2;
                    break;
                }
            }
            if (subTitleItemData != null) {
                list.remove(subTitleItemData);
                list.add(0, subTitleItemData);
            }
        }
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        this.f20990f = true;
        m20723h();
        m20725k4();
        m20722g4();
    }

    @Override // p301qb.InterfaceC6426t0
    /* renamed from: C5 */
    public void mo20717C5(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f20986b.mo20013g(false);
    }

    @Override // p301qb.InterfaceC6393i0
    /* renamed from: I3 */
    public void mo20718I3(GetItemDataResult getItemDataResult) {
        AbstractC5868k.m23674f(getItemDataResult, "itemDataResult");
        this.f20986b.mo20013g(false);
        AssetData assetData = getItemDataResult.getData().getAssetData();
        if (assetData != null) {
            mo19996f2(assetData, this.f20992h);
        }
    }

    @Override // p171i3.InterfaceC4848c
    /* renamed from: J */
    public void mo19992J(boolean z10, SimpleProgramList simpleProgramList) {
        String str = null;
        AbstractC5868k.m23674f(simpleProgramList, "simpleProgramList");
        if (z10 || !AbstractC5868k.m23669a(this.f20994j, simpleProgramList)) {
            this.f20994j = simpleProgramList;
            this.f20999o = null;
            this.f20986b.mo20009L();
            this.f20986b.mo20000C();
            SimpleProgramList simpleProgramList2 = this.f20994j;
            if (simpleProgramList2 == null || (str = simpleProgramList2.getContentId()) == null) {
                str = "";
            }
            m20721b4(str);
            m20724h4();
        }
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return null;
    }

    @Override // p171i3.InterfaceC4848c
    /* renamed from: Q1 */
    public void mo19993Q1() {
        String string = null;
        boolean z10 = false;
        C7589m1.f27886a.m29154w();
        SimpleProgramList simpleProgramList = this.f20994j;
        if (simpleProgramList == null) {
            string = this.f20989e.getString(R$string.download_select_episode_first);
        } else {
            AbstractC5868k.m23671c(simpleProgramList);
            if (!simpleProgramList.isDownloading()) {
                SimpleProgramList simpleProgramList2 = this.f20994j;
                AbstractC5868k.m23671c(simpleProgramList2);
                if (!simpleProgramList2.isDownloaded()) {
                    if (this.f20997m == null) {
                        string = this.f20989e.getString(R$string.download_select_audio_first);
                    } else {
                        string = "";
                    }
                }
            }
            string = this.f20989e.getString(R$string.download_repeatedly);
        }
        AbstractC5868k.m23673e(string, "if (mCurrentEpisode == n…\n            \"\"\n        }");
        if (string.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f20986b.mo20004G(true, string);
        } else {
            m20713q4();
        }
    }

    @Override // p171i3.InterfaceC4848c
    /* renamed from: S */
    public void mo19994S() {
        AssetData assetData = this.f20991g;
        if (assetData != null) {
            InterfaceC4849d interfaceC4849d = this.f20986b;
            AbstractC5868k.m23671c(assetData);
            List<SameSeasonSeriesBean> sameSeasonSeriesList = assetData.getSameSeasonSeriesList();
            AbstractC5868k.m23671c(sameSeasonSeriesList);
            interfaceC4849d.mo20002E(sameSeasonSeriesList, this.f20993i);
        }
    }

    @Override // p301qb.InterfaceC6426t0
    /* renamed from: S3 */
    public void mo20719S3(SubTitleResult subTitleResult, String str) {
        String str2 = null;
        AbstractC5868k.m23674f(subTitleResult, "result");
        AbstractC5868k.m23674f(str, "programId");
        int i10 = 0;
        this.f20986b.mo20013g(false);
        SimpleProgramList simpleProgramList = this.f20994j;
        if (simpleProgramList != null) {
            str2 = simpleProgramList.getContentId();
        } else {
            str2 = null;
        }
        if (AbstractC5868k.m23669a(str, str2)) {
            List<SubTitleItemData> data = subTitleResult.getData();
            if (data != null) {
                i10 = data.size();
            }
            if (i10 > 0) {
                m20716u4(subTitleResult.getData(), str);
                StringBuilder sb2 = new StringBuilder();
                List<SubTitleItemData> data2 = subTitleResult.getData();
                if (data2 != null) {
                    for (SubTitleItemData subTitleItemData : data2) {
                        C5913i c5913i = C5913i.f23534a;
                        String language = subTitleItemData.getLanguage();
                        if (language == null) {
                            language = "";
                        }
                        sb2.append(c5913i.m23915c(language));
                        sb2.append("  ");
                    }
                }
                InterfaceC4849d interfaceC4849d = this.f20986b;
                String sb3 = sb2.toString();
                AbstractC5868k.m23673e(sb3, "sb.toString()");
                interfaceC4849d.mo20007J(sb3);
                this.f20999o = subTitleResult.getData();
            }
        }
    }

    @Override // p301qb.InterfaceC6412o1
    /* renamed from: V */
    public void mo20720V(String str, int i10) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f20986b.mo20013g(false);
        this.f20986b.mo19999B(str);
    }

    @Override // p171i3.InterfaceC4848c
    /* renamed from: a3 */
    public void mo19995a3() {
        AbstractC7272e.m28125b(C7327w0.f27234a, C7297m0.m28253c(), null, new a(null), 2, null);
    }

    /* renamed from: b4 */
    public void m20721b4(String str) {
        AbstractC5868k.m23674f(str, "programId");
        this.f20986b.mo20013g(true);
        m20707W3().m534b(str);
    }

    @Override // p171i3.InterfaceC4848c
    /* renamed from: f2 */
    public void mo19996f2(AssetData assetData, String str) {
        AbstractC5868k.m23674f(assetData, "detail");
        AbstractC5868k.m23674f(str, "type");
        this.f20991g = assetData;
        this.f20992h = str;
        if (this.f20990f) {
            m20714r4(assetData);
        }
    }

    /* renamed from: g4 */
    public void m20722g4() {
        AbstractC7272e.m28125b(C7327w0.f27234a, C7297m0.m28253c(), null, new c(null), 2, null);
    }

    /* renamed from: h */
    public void m20723h() {
        String str = null;
        if (m20705Q3().m23900q()) {
            InterfaceC4849d interfaceC4849d = this.f20986b;
            UDiskBean m23893h = m20705Q3().m23893h();
            if (m23893h == null || (str = m23893h.getName()) == null) {
                str = "";
            }
            interfaceC4849d.mo20011N(str);
            return;
        }
        this.f20986b.mo20003F();
    }

    /* renamed from: h4 */
    public void m20724h4() {
        String str = null;
        AssetData assetData;
        C1456h0 c1456h0 = C1456h0.f5574a;
        if (c1456h0.m6777m() != null && c1456h0.m6778n(C1456h0.a.VOD)) {
            this.f20986b.mo20013g(true);
            String str2 = null;
            if (AbstractC5868k.m23669a(this.f20992h, MessageService.MSG_DB_READY_REPORT) && (assetData = this.f20991g) != null) {
                str2 = assetData.getContentId();
            }
            String str3 = str2;
            C0185n2 m20709Y3 = m20709Y3();
            SimpleProgramList simpleProgramList = this.f20994j;
            if (simpleProgramList == null || (str = simpleProgramList.getContentId()) == null) {
                str = "";
            }
            m20709Y3.m678b(-1, str, str3, "1", 0, null, null);
            return;
        }
        InterfaceC4849d interfaceC4849d = this.f20986b;
        String string = this.f20989e.getString(R$string.download_failed_unavailable);
        AbstractC5868k.m23673e(string, "mContext.getString(R.str…nload_failed_unavailable)");
        interfaceC4849d.mo20004G(true, string);
    }

    @Override // p171i3.InterfaceC4848c
    /* renamed from: i3 */
    public void mo19997i3(String str) {
        AbstractC5868k.m23674f(str, "contentId");
        this.f20986b.mo20013g(true);
        m20706T3().m707e(str, this.f20992h, MessageService.MSG_DB_READY_REPORT);
    }

    @Override // p171i3.InterfaceC4848c
    /* renamed from: k0 */
    public void mo19998k0(int i10) {
        List<SimpleProgramList> simpleProgramList;
        DefinitionBean definitionBean = this.f20996l;
        if (definitionBean != null && i10 < definitionBean.getSourceList().size()) {
            this.f20998n = i10;
            this.f20997m = definitionBean.getSourceList().get(i10);
            AssetData assetData = this.f20991g;
            if (assetData != null && (simpleProgramList = assetData.getSimpleProgramList()) != null && simpleProgramList.size() > 1) {
                m20712e4(simpleProgramList, true);
            }
        }
    }

    /* renamed from: k4 */
    public void m20725k4() {
        C5911g.a aVar = C5911g.f23514h;
        aVar.m23905a().m23904w(new i());
        aVar.m23905a().m23903v(new j());
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
        this.f20990f = false;
        m20727v4();
    }

    @Override // p301qb.InterfaceC6393i0
    /* renamed from: r1 */
    public void mo20726r1(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f20986b.mo20013g(false);
        this.f20986b.mo19999B(str);
    }

    /* renamed from: v4 */
    public void m20727v4() {
        C5911g.a aVar = C5911g.f23514h;
        aVar.m23905a().m23904w(null);
        aVar.m23905a().m23903v(null);
    }

    @Override // p301qb.InterfaceC6412o1
    /* renamed from: z4 */
    public void mo20728z4(StartPlayVODResult startPlayVODResult, int i10) {
        AbstractC5868k.m23674f(startPlayVODResult, "result");
        this.f20986b.mo20013g(false);
        m20710c4(startPlayVODResult.getData());
    }
}
