package p192j9;

import ac.C0134b;
import ac.C0183n0;
import ac.C0217w;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.module.bean.Album;
import com.request.result.FavIdDataItem;
import com.request.result.FavoriteList;
import com.request.result.GetFavoritesResultData;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import org.android.agoo.message.MessageService;
import p131f9.C4296a;
import p135fd.C4307b;
import p160h9.InterfaceC4733i;
import p160h9.InterfaceC4734j;
import p170i2.C4842a;
import p301qb.InterfaceC6380e;
import p301qb.InterfaceC6387g0;
import p301qb.InterfaceC6425t;
import p348u2.AbstractC7029f;
import p430z9.AbstractC7765c;

/* renamed from: j9.n */
/* loaded from: classes2.dex */
public final class C5031n implements InterfaceC4733i, InterfaceC6387g0, InterfaceC6425t, InterfaceC6380e {

    /* renamed from: a */
    private AbstractC7765c f20816a;

    /* renamed from: b */
    private InterfaceC4734j f20817b;

    /* renamed from: c */
    private Map f20818c;

    /* renamed from: d */
    private final InterfaceC1312h f20819d;

    /* renamed from: e */
    private final InterfaceC1312h f20820e;

    /* renamed from: f */
    private final InterfaceC1312h f20821f;

    /* renamed from: g */
    private final InterfaceC1312h f20822g;

    /* renamed from: j9.n$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5642a {
        a() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0134b invoke() {
            return new C0134b(C5031n.this);
        }
    }

    /* renamed from: j9.n$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5642a {
        b() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0217w invoke() {
            return new C0217w(C5031n.this);
        }
    }

    /* renamed from: j9.n$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5642a {
        c() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0183n0 invoke() {
            return new C0183n0(C5031n.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j9.n$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final d f20826a = new d();

        d() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap mo542f(List list) {
            AbstractC5868k.m23674f(list, "list");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Album album = (Album) it.next();
                if (AbstractC5868k.m23669a(album.getAlbumType(), "topic")) {
                    arrayList3.add(album.getContentId());
                } else if (AbstractC5868k.m23669a(album.getShelveType(), MessageService.MSG_DB_READY_REPORT)) {
                    arrayList2.add(album.getContentId());
                } else if (AbstractC5868k.m23669a(album.getShelveType(), "1")) {
                    arrayList.add(album.getContentId());
                }
            }
            HashMap hashMap = new HashMap();
            if (!arrayList2.isEmpty()) {
                hashMap.put(MessageService.MSG_DB_READY_REPORT, arrayList2);
            }
            if (!arrayList.isEmpty()) {
                hashMap.put("1", arrayList);
            }
            if (!arrayList3.isEmpty()) {
                hashMap.put("3", arrayList3);
            }
            return hashMap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j9.n$e */
    /* loaded from: classes2.dex */
    public static final class e extends AbstractC5869l implements InterfaceC5660l {
        e() {
            super(1);
        }

        /* renamed from: a */
        public final void m20463a(HashMap hashMap) {
            AbstractC5868k.m23673e(hashMap, "it");
            for (Map.Entry entry : hashMap.entrySet()) {
                C5031n.this.m20453O3((String) entry.getKey(), (ArrayList) entry.getValue());
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m20463a((HashMap) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: j9.n$f */
    /* loaded from: classes2.dex */
    static final class f extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final f f20828a = new f();

        f() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4296a invoke() {
            return new C4296a();
        }
    }

    /* renamed from: j9.n$g */
    /* loaded from: classes2.dex */
    static final class g extends AbstractC5869l implements InterfaceC5660l {
        g() {
            super(1);
        }

        /* renamed from: a */
        public final void m20465a(List list) {
            AbstractC5868k.m23674f(list, "it");
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String contentId = ((FavIdDataItem) it.next()).getContentId();
                AbstractC5868k.m23671c(contentId);
                arrayList.add(contentId);
            }
            C5031n.this.m20450c4().m17978i(3, arrayList);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m20465a((List) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: j9.n$h */
    /* loaded from: classes2.dex */
    static final class h extends AbstractC5869l implements InterfaceC5660l {
        h() {
            super(1);
        }

        /* renamed from: a */
        public final void m20466a(C1328x c1328x) {
            C5031n.this.mo19604A3();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m20466a((C1328x) obj);
            return C1328x.f4998a;
        }
    }

    public C5031n(AbstractC7765c abstractC7765c, InterfaceC4734j interfaceC4734j) {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        InterfaceC1312h m5965b3;
        InterfaceC1312h m5965b4;
        AbstractC5868k.m23674f(abstractC7765c, "fragment");
        AbstractC5868k.m23674f(interfaceC4734j, "view");
        this.f20816a = abstractC7765c;
        this.f20817b = interfaceC4734j;
        this.f20818c = new LinkedHashMap();
        m5965b = AbstractC1314j.m5965b(f.f20828a);
        this.f20819d = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new c());
        this.f20820e = m5965b2;
        m5965b3 = AbstractC1314j.m5965b(new b());
        this.f20821f = m5965b3;
        m5965b4 = AbstractC1314j.m5965b(new a());
        this.f20822g = m5965b4;
    }

    /* renamed from: P3 */
    private final C0134b m20444P3() {
        return (C0134b) this.f20822g.getValue();
    }

    /* renamed from: Q3 */
    private final C0217w m20445Q3() {
        return (C0217w) this.f20821f.getValue();
    }

    /* renamed from: T3 */
    private final C0183n0 m20446T3() {
        return (C0183n0) this.f20820e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y3 */
    public static final HashMap m20448Y3(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (HashMap) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b4 */
    public static final void m20449b4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c4 */
    public final C4296a m20450c4() {
        return (C4296a) this.f20819d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d4 */
    public static final C1328x m20451d4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (C1328x) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e4 */
    public static final void m20452e4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    @Override // p301qb.InterfaceC6387g0
    /* renamed from: A */
    public void mo19219A(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f20817b.mo19611d();
        this.f20817b.mo19607A(str);
    }

    @Override // p160h9.InterfaceC4733i
    /* renamed from: A3 */
    public void mo19604A3() {
        boolean mo19608G2 = this.f20817b.mo19608G2();
        this.f20817b.mo19610c();
        m20446T3().m674b("vodAndColumn", mo19608G2);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        this.f20817b.mo19612e4(false);
    }

    @Override // p301qb.InterfaceC6387g0
    /* renamed from: I */
    public void mo19222I(GetFavoritesResultData getFavoritesResultData) {
        this.f20817b.mo19611d();
        this.f20817b.mo19609I(getFavoritesResultData);
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f20816a.m19902N3();
    }

    /* renamed from: O3 */
    public void m20453O3(String str, List list) {
        AbstractC5868k.m23674f(str, "type");
        AbstractC5868k.m23674f(list, "contentIds");
        this.f20817b.mo19610c();
        C0134b.m531c(m20444P3(), str, list, false, 4, null);
    }

    /* renamed from: W3 */
    public void m20454W3() {
        boolean z10;
        List m17981l = m20450c4().m17981l(3);
        if (m17981l != null && !m17981l.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            mo19604A3();
            return;
        }
        Observable fromArray = Observable.fromArray(m17981l);
        final d dVar = d.f20826a;
        Observable compose = fromArray.map(new Function() { // from class: j9.l
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                HashMap m20448Y3;
                m20448Y3 = C5031n.m20448Y3(InterfaceC5660l.this, obj);
                return m20448Y3;
            }
        }).compose(AbstractC7029f.m27121b());
        final e eVar = new e();
        compose.subscribe(new Consumer() { // from class: j9.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5031n.m20449b4(InterfaceC5660l.this, obj);
            }
        });
    }

    @Override // p160h9.InterfaceC4733i
    /* renamed from: m1 */
    public void mo19605m1(List list, FavoriteList favoriteList) {
        int i10;
        AbstractC5868k.m23674f(list, "ids");
        if (favoriteList != null) {
            i10 = favoriteList.getId();
        } else {
            i10 = -1;
        }
        Object obj = this.f20818c.get(Integer.valueOf(i10));
        Boolean bool = Boolean.TRUE;
        if (AbstractC5868k.m23669a(obj, bool)) {
            return;
        }
        this.f20817b.mo19610c();
        m20445Q3().m768b(list, favoriteList);
        this.f20818c.put(Integer.valueOf(i10), bool);
    }

    @Override // p301qb.InterfaceC6380e
    /* renamed from: n */
    public void mo20455n(List list) {
        AbstractC5868k.m23674f(list, "favId");
        if (!list.isEmpty()) {
            Observable fromArray = Observable.fromArray(list);
            final g gVar = new g();
            Observable compose = fromArray.map(new Function() { // from class: j9.j
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    C1328x m20451d4;
                    m20451d4 = C5031n.m20451d4(InterfaceC5660l.this, obj);
                    return m20451d4;
                }
            }).compose(AbstractC7029f.m27121b());
            final h hVar = new h();
            compose.subscribe(new Consumer() { // from class: j9.k
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C5031n.m20452e4(InterfaceC5660l.this, obj);
                }
            });
        }
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p301qb.InterfaceC6425t
    /* renamed from: p */
    public void mo20456p(FavoriteList favoriteList) {
        int i10;
        if (favoriteList != null) {
            i10 = favoriteList.getId();
        } else {
            i10 = -1;
        }
        this.f20818c.put(Integer.valueOf(i10), Boolean.FALSE);
        this.f20817b.mo19611d();
        this.f20817b.mo19613p(favoriteList);
    }

    @Override // p160h9.InterfaceC4733i
    /* renamed from: r */
    public void mo19606r() {
        if (C4842a.f20329a.m19920a().mo19971t()) {
            m20454W3();
        } else {
            mo19604A3();
        }
    }

    @Override // p301qb.InterfaceC6380e
    /* renamed from: s */
    public void mo20457s(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        if (AbstractC5868k.m23669a(str, "portal100061")) {
            m20450c4().m17974e();
        }
        mo19604A3();
    }

    @Override // p301qb.InterfaceC6425t
    /* renamed from: x1 */
    public void mo20458x1(String str, int i10) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f20818c.put(Integer.valueOf(i10), Boolean.FALSE);
        this.f20817b.mo19611d();
        this.f20817b.mo19614u(str);
    }
}
