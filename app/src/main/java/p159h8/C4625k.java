package p159h8;

import ac.C0138c;
import ac.C0160h1;
import ac.C0183n0;
import android.content.Context;
import ba.AbstractC1196d;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.live.R$string;
import com.module.event.GetLiveFavoriteSucEvent;
import com.module.event.LockChannelEvent;
import com.module.event.ToStartPlayEvent;
import com.request.result.Channel;
import com.request.result.FavIdDataItem;
import com.request.result.FavoriteList;
import com.request.result.GetFavoritesResultData;
import com.request.result.MosaicChannelBean;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
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
import ne.AbstractC5867j;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5876s;
import ne.C5878u;
import org.android.agoo.common.AgooConstants;
import p040c8.C1407f;
import p040c8.C1415j;
import p040c8.C1427v;
import p040c8.C1428w;
import p040c8.InterfaceC1416k;
import p043ce.AbstractC1508t;
import p130f8.InterfaceC4274a;
import p130f8.InterfaceC4275b;
import p132fa.AbstractC4298b;
import p135fd.C4307b;
import p223l8.C5465k0;
import p237m8.AbstractC5607a;
import p301qb.InterfaceC6387g0;
import p301qb.InterfaceC6438x0;
import p301qb.InterfaceC6441y0;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7029f;
import p400xa.AbstractC7598p1;
import p400xa.C7589m1;
import p400xa.C7594o0;
import ye.C7709c;

/* renamed from: h8.k */
/* loaded from: classes2.dex */
public final class C4625k implements InterfaceC4274a, InterfaceC1416k, InterfaceC6387g0, InterfaceC6438x0, InterfaceC6441y0 {

    /* renamed from: a */
    private AbstractC1196d f19857a;

    /* renamed from: b */
    private InterfaceC4275b f19858b;

    /* renamed from: c */
    private final String f19859c;

    /* renamed from: d */
    private int f19860d;

    /* renamed from: e */
    private int f19861e;

    /* renamed from: f */
    private boolean f19862f;

    /* renamed from: g */
    private ArrayList f19863g;

    /* renamed from: h */
    private int f19864h;

    /* renamed from: i */
    private Map f19865i;

    /* renamed from: j */
    private final InterfaceC1312h f19866j;

    /* renamed from: k */
    private final InterfaceC1312h f19867k;

    /* renamed from: l */
    private final InterfaceC1312h f19868l;

    /* renamed from: h8.k$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {
        a() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo542f(List list) {
            AbstractC5868k.m23674f(list, "it");
            if (C4625k.this.f19862f) {
                return list;
            }
            C1428w.f5539a.m6673f(list);
            return list;
        }
    }

    /* renamed from: h8.k$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final b f19870a = new b();

        b() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo542f(List list) {
            AbstractC5868k.m23674f(list, "it");
            C1407f.f5458a.m6520m0(list);
            return list;
        }
    }

    /* renamed from: h8.k$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f19871a = new c();

        c() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo542f(List list) {
            AbstractC5868k.m23674f(list, "it");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Channel channel = (Channel) it.next();
                channel.setShowChannelName(AbstractC5607a.m22776a(channel));
                C7594o0.f27942a.m29219h(channel);
            }
            return list;
        }
    }

    /* renamed from: h8.k$d */
    /* loaded from: classes2.dex */
    static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: h8.k$d$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class a extends AbstractC5867j implements InterfaceC5642a {
            a(Object obj) {
                super(0, obj, C4625k.class, "getOriginPlayList", "getOriginPlayList()Ljava/util/List;", 0);
            }

            @Override // me.InterfaceC5642a
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return ((C4625k) this.f23390b).m19329r4();
            }
        }

        d() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo542f(List list) {
            AbstractC5868k.m23674f(list, "it");
            if (!AbstractC6567a.m25635e(list)) {
                if (C1407f.f5458a.m6514i0(AbstractC4298b.m17990b("last_sort", 0), list, new a(C4625k.this))) {
                    return list;
                }
            }
            return new ArrayList();
        }
    }

    /* renamed from: h8.k$e */
    /* loaded from: classes2.dex */
    static final class e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ boolean f19874b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z10) {
            super(1);
            this.f19874b = z10;
        }

        /* renamed from: a */
        public final void m19341a(List list) {
            C4625k.this.f19863g.clear();
            C4625k.this.f19863g.addAll(list);
            if (AbstractC6567a.m25635e(list)) {
                if (C4625k.this.f19862f) {
                    InterfaceC4275b m19335s4 = C4625k.this.m19335s4();
                    AbstractC5868k.m23672d(list, "null cannot be cast to non-null type java.util.ArrayList<com.request.result.Channel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.request.result.Channel> }");
                    InterfaceC4275b.a.m17843a(m19335s4, (ArrayList) list, false, 2, null);
                    return;
                }
                return;
            }
            InterfaceC4275b m19335s42 = C4625k.this.m19335s4();
            AbstractC5868k.m23672d(list, "null cannot be cast to non-null type java.util.ArrayList<com.request.result.Channel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.request.result.Channel> }");
            m19335s42.mo17838F5((ArrayList) list, this.f19874b);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19341a((List) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.k$f */
    /* loaded from: classes2.dex */
    static final class f extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final f f19875a = new f();

        f() {
            super(1);
        }

        /* renamed from: a */
        public final void m19342a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19342a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.k$g */
    /* loaded from: classes2.dex */
    static final class g extends AbstractC5869l implements InterfaceC5642a {
        g() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0138c invoke() {
            return new C0138c(C4625k.this);
        }
    }

    /* renamed from: h8.k$h */
    /* loaded from: classes2.dex */
    static final class h extends AbstractC5869l implements InterfaceC5642a {
        h() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0183n0 invoke() {
            return new C0183n0(C4625k.this);
        }
    }

    /* renamed from: h8.k$i */
    /* loaded from: classes2.dex */
    static final class i extends AbstractC5869l implements InterfaceC5642a {
        i() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0160h1 invoke() {
            return new C0160h1(C4625k.this);
        }
    }

    /* renamed from: h8.k$j */
    /* loaded from: classes2.dex */
    static final class j extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ C5878u f19880b;

        /* renamed from: c */
        final /* synthetic */ C5876s f19881c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: h8.k$j$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class a extends AbstractC5867j implements InterfaceC5642a {
            a(Object obj) {
                super(0, obj, C4625k.class, "getOriginPlayList", "getOriginPlayList()Ljava/util/List;", 0);
            }

            @Override // me.InterfaceC5642a
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return ((C4625k) this.f23390b).m19329r4();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: h8.k$j$b */
        /* loaded from: classes2.dex */
        public /* synthetic */ class b extends AbstractC5867j implements InterfaceC5660l {
            b(Object obj) {
                super(1, obj, C4625k.class, "updateCurChannelIndex", "updateCurChannelIndex(I)V", 0);
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m19348l(((Number) obj).intValue());
                return C1328x.f4998a;
            }

            /* renamed from: l */
            public final void m19348l(int i10) {
                ((C4625k) this.f23390b).m19317Q4(i10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(C5878u c5878u, C5876s c5876s) {
            super(1);
            this.f19880b = c5878u;
            this.f19881c = c5876s;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo542f(Integer num) {
            AbstractC5868k.m23674f(num, "it");
            boolean z10 = true;
            if (C1407f.f5458a.m6512h0((num.intValue() + 1) % 3, "", C4625k.this.f19863g, new a(C4625k.this), new b(C4625k.this))) {
                C4625k.this.m19315P4(num.intValue());
                int i10 = 0;
                if (((CharSequence) this.f19880b.f23412a).length() <= 0) {
                    z10 = false;
                }
                if (z10) {
                    int size = C4625k.this.f19863g.size();
                    while (true) {
                        if (i10 >= size) {
                            break;
                        }
                        if (AbstractC5868k.m23669a(((Channel) C4625k.this.f19863g.get(i10)).getChannelCode(), this.f19880b.f23412a)) {
                            this.f19881c.f23410a = i10;
                            break;
                        }
                        i10++;
                    }
                }
                return C4625k.this.f19863g;
            }
            return new ArrayList();
        }
    }

    /* renamed from: h8.k$k */
    /* loaded from: classes2.dex */
    static final class k extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ C5876s f19883b;

        /* renamed from: c */
        final /* synthetic */ int f19884c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(C5876s c5876s, int i10) {
            super(1);
            this.f19883b = c5876s;
            this.f19884c = i10;
        }

        /* renamed from: a */
        public final void m19349a(ArrayList arrayList) {
            if (AbstractC6567a.m25635e(arrayList)) {
                return;
            }
            InterfaceC4275b m19335s4 = C4625k.this.m19335s4();
            AbstractC5868k.m23673e(arrayList, "it");
            InterfaceC4275b.a.m17843a(m19335s4, arrayList, false, 2, null);
            C4625k.this.m19335s4().mo17837C3(this.f19883b.f23410a);
            int i10 = (this.f19884c + 1) % 3;
            AbstractC4298b.m17992d("last_sort", i10);
            C4625k.this.m19335s4().mo17840U1(i10);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19349a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.k$l */
    /* loaded from: classes2.dex */
    static final class l extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final l f19885a = new l();

        l() {
            super(1);
        }

        /* renamed from: a */
        public final void m19350a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19350a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.k$m */
    /* loaded from: classes2.dex */
    public static final class m extends AbstractC5869l implements InterfaceC5642a {

        /* renamed from: a */
        public static final m f19886a = new m();

        m() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke() {
            C1407f c1407f = C1407f.f5458a;
            if (c1407f.m6528t() == -1) {
                return C1428w.f5539a.m6671d();
            }
            if (c1407f.m6528t() == c1407f.m6525q()) {
                ArrayList arrayList = new ArrayList();
                c1407f.m6516k(arrayList);
                return arrayList;
            }
            return c1407f.m6515j(c1407f.m6528t());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.k$n */
    /* loaded from: classes2.dex */
    public static final class n extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final n f19887a = new n();

        n() {
            super(1);
        }

        /* renamed from: a */
        public final void m19352a(int i10) {
            C1407f.f5458a.m6506e0(i10);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19352a(((Number) obj).intValue());
            return C1328x.f4998a;
        }
    }

    public C4625k(AbstractC1196d abstractC1196d, InterfaceC4275b interfaceC4275b) {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        InterfaceC1312h m5965b3;
        AbstractC5868k.m23674f(abstractC1196d, "frag");
        AbstractC5868k.m23674f(interfaceC4275b, "view");
        this.f19857a = abstractC1196d;
        this.f19858b = interfaceC4275b;
        this.f19859c = C4625k.class.getSimpleName();
        this.f19860d = -1;
        this.f19861e = -1;
        this.f19863g = new ArrayList();
        this.f19864h = -1;
        this.f19865i = new LinkedHashMap();
        m5965b = AbstractC1314j.m5965b(new h());
        this.f19866j = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new g());
        this.f19867k = m5965b2;
        m5965b3 = AbstractC1314j.m5965b(new i());
        this.f19868l = m5965b3;
    }

    /* renamed from: A1 */
    private final void m19302A1() {
        C1428w c1428w = C1428w.f5539a;
        if (c1428w.m6672e() == 2) {
            c1428w.m6677j(3);
            C0183n0.m673c(m19327k4(), "live", false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C4 */
    public static final List m19303C4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (List) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D4 */
    public static final void m19304D4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I4 */
    public static final void m19308I4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M4 */
    public static final void m19310M4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N4 */
    public static final ArrayList m19311N4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ArrayList) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O4 */
    public static final void m19313O4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P4 */
    public final void m19315P4(int i10) {
        C1407f c1407f = C1407f.f5458a;
        c1407f.m6512h0((i10 + 1) % 3, "", c1407f.m6533y(), m.f19886a, n.f19887a);
        c1407f.m6480A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q4 */
    public final void m19317Q4(int i10) {
    }

    /* renamed from: h4 */
    private final C0138c m19326h4() {
        return (C0138c) this.f19867k.getValue();
    }

    /* renamed from: k4 */
    private final C0183n0 m19327k4() {
        return (C0183n0) this.f19866j.getValue();
    }

    /* renamed from: q4 */
    private final C0160h1 m19328q4() {
        return (C0160h1) this.f19868l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r4 */
    public final List m19329r4() {
        if (this.f19862f) {
            return C1428w.f5539a.m6671d();
        }
        return C1407f.f5458a.m6515j(this.f19861e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u4 */
    public static final void m19330u4(C4625k c4625k, int i10, ObservableEmitter observableEmitter) {
        List m6509g;
        AbstractC5868k.m23674f(c4625k, "this$0");
        AbstractC5868k.m23674f(observableEmitter, "it");
        if (c4625k.f19862f) {
            m6509g = C1428w.f5539a.m6671d();
        } else {
            m6509g = C1407f.f5458a.m6509g(i10);
        }
        observableEmitter.onNext(m6509g);
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v4 */
    public static final List m19331v4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (List) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w4 */
    public static final List m19332w4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (List) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x4 */
    public static final List m19333x4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (List) interfaceC5660l.mo542f(obj);
    }

    @Override // p301qb.InterfaceC6387g0
    /* renamed from: A */
    public void mo19219A(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        C1428w.f5539a.m6677j(2);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
    }

    @Override // p130f8.InterfaceC4274a
    /* renamed from: B1 */
    public Channel mo17824B1(int i10) {
        if (!AbstractC6567a.m25635e(this.f19863g) && i10 >= 0 && i10 <= this.f19863g.size() - 1) {
            return (Channel) this.f19863g.get(i10);
        }
        return null;
    }

    @Override // p130f8.InterfaceC4274a
    /* renamed from: B2 */
    public void mo17825B2(int i10) {
        if (!mo17828U1(i10) && !AbstractC6567a.m25635e(this.f19863g) && i10 >= 0 && i10 < this.f19863g.size()) {
            Object obj = this.f19863g.get(i10);
            AbstractC5868k.m23673e(obj, "mCurChannels[selectedPos]");
            Channel channel = (Channel) obj;
            if (AbstractC5868k.m23669a("1", channel.getRestricted()) || AbstractC5868k.m23669a(this.f19865i.get(channel.getChannelCode()), Boolean.TRUE)) {
                return;
            }
            FavoriteList m6670c = C1428w.f5539a.m6670c(channel);
            if (m6670c != null) {
                m19328q4().m609b(m6670c.getId(), channel, i10);
            } else {
                m19326h4().m536b("2", channel, i10);
            }
        }
    }

    @Override // p130f8.InterfaceC4274a
    /* renamed from: C3 */
    public void mo17826C3(int i10, boolean z10) {
        if (AbstractC6567a.m25635e(this.f19863g)) {
            return;
        }
        Object obj = this.f19863g.get(i10);
        AbstractC5868k.m23673e(obj, "mCurChannels[selectedPos]");
        ((Channel) obj).setLock(z10);
        this.f19858b.mo17839K2(i10, z10);
    }

    @Override // p301qb.InterfaceC6441y0
    /* renamed from: E2 */
    public void mo19220E2(Channel channel, int i10) {
        Object m7008t;
        AbstractC5868k.m23674f(channel, "channel");
        this.f19865i.put(channel.getChannelCode(), Boolean.FALSE);
        channel.setFav(false);
        C1428w.f5539a.m6669b(channel.getChannelCode());
        m7008t = AbstractC1508t.m7008t(this.f19863g, i10);
        if (!AbstractC5868k.m23669a(channel, m7008t)) {
            int size = this.f19863g.size();
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    if (AbstractC5868k.m23669a(((Channel) this.f19863g.get(i11)).getChannelCode(), channel.getChannelCode())) {
                        i10 = i11;
                        break;
                    }
                    i11++;
                } else {
                    i10 = -1;
                    break;
                }
            }
        }
        if (i10 == -1) {
            return;
        }
        if (this.f19862f) {
            this.f19863g.remove(i10);
            this.f19858b.mo17835A2(this.f19863g);
        } else {
            this.f19858b.mo17841c2(i10, false);
        }
    }

    @Override // p301qb.InterfaceC6387g0
    /* renamed from: I */
    public void mo19222I(GetFavoritesResultData getFavoritesResultData) {
        List<FavoriteList> list;
        C1428w c1428w = C1428w.f5539a;
        c1428w.m6677j(1);
        if (getFavoritesResultData != null) {
            list = getFavoritesResultData.getFavoriteList();
        } else {
            list = null;
        }
        c1428w.m6676i(list);
        C7709c.m29787d().m29801m(new GetLiveFavoriteSucEvent());
    }

    @Override // p301qb.InterfaceC6441y0
    /* renamed from: K1 */
    public void mo19223K1(String str, String str2) {
        String str3;
        AbstractC5868k.m23674f(str, "errCode");
        AbstractC5868k.m23674f(str2, "channelCode");
        this.f19865i.put(str2, Boolean.FALSE);
        Context m3096J6 = this.f19857a.m3096J6();
        Context m3096J62 = this.f19857a.m3096J6();
        if (m3096J62 == null || (str3 = m3096J62.getString(R$string.rm_favorite_failed)) == null) {
            str3 = "";
        }
        AbstractC7598p1.m29245i(m3096J6, str3, new int[0]);
    }

    @Override // p040c8.InterfaceC1416k
    /* renamed from: K4, reason: merged with bridge method [inline-methods] */
    public void mo6577Y0(HashMap hashMap) {
        AbstractC5868k.m23674f(hashMap, "t");
        this.f19858b.mo17842j6(hashMap);
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f19857a.m19902N3();
    }

    @Override // p130f8.InterfaceC4274a
    /* renamed from: Q2 */
    public void mo17827Q2(int i10) {
        if (mo17828U1(i10) || AbstractC6567a.m25635e(this.f19863g) || i10 == -1) {
            return;
        }
        Object obj = this.f19863g.get(i10);
        AbstractC5868k.m23673e(obj, "mCurChannels[selectedPos]");
        C7709c.m29787d().m29801m(new LockChannelEvent((Channel) obj));
    }

    @Override // p301qb.InterfaceC6438x0
    /* renamed from: R4 */
    public void mo19227R4(String str, String str2) {
        String str3;
        AbstractC5868k.m23674f(str, "errCode");
        AbstractC5868k.m23674f(str2, "channelCode");
        this.f19865i.put(str2, Boolean.FALSE);
        if (AbstractC5868k.m23669a(str, "portal100061")) {
            Context m3096J6 = this.f19857a.m3096J6();
            if (m3096J6 != null) {
                AbstractC7598p1.m29245i(m3096J6, m3096J6.getString(com.module.R$string.error_code_user_type) + AgooConstants.ACK_BODY_NULL + m3096J6.getString(com.module.R$string.user_ef11), new int[0]);
                return;
            }
            return;
        }
        Context m3096J62 = this.f19857a.m3096J6();
        Context m3096J63 = this.f19857a.m3096J6();
        if (m3096J63 == null || (str3 = m3096J63.getString(R$string.favorite_failed)) == null) {
            str3 = "";
        }
        AbstractC7598p1.m29245i(m3096J62, str3, new int[0]);
    }

    @Override // p130f8.InterfaceC4274a
    /* renamed from: U1 */
    public boolean mo17828U1(int i10) {
        Object m7008t;
        List<MosaicChannelBean> mosaicChannes;
        if (AbstractC6567a.m25638h(this.f19863g)) {
            m7008t = AbstractC1508t.m7008t(this.f19863g, i10);
            Channel channel = (Channel) m7008t;
            if (channel == null || (mosaicChannes = channel.getMosaicChannes()) == null || mosaicChannes.size() != 4) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // p130f8.InterfaceC4274a
    /* renamed from: Z0 */
    public void mo17829Z0(int i10) {
        if (AbstractC6567a.m25635e(this.f19863g)) {
            return;
        }
        C5878u c5878u = new C5878u();
        c5878u.f23412a = "";
        C5876s c5876s = new C5876s();
        AbstractC1196d abstractC1196d = this.f19857a;
        AbstractC5868k.m23672d(abstractC1196d, "null cannot be cast to non-null type com.live.ui.fragment.LiveChannelFrag");
        int m22106sa = ((C5465k0) abstractC1196d).m22106sa();
        c5876s.f23410a = m22106sa;
        if (m22106sa > -1) {
            c5878u.f23412a = ((Channel) this.f19863g.get(m22106sa)).getChannelCode();
        }
        int m17990b = AbstractC4298b.m17990b("last_sort", 0);
        Observable just = Observable.just(Integer.valueOf(m17990b));
        final j jVar = new j(c5878u, c5876s);
        Observable compose = just.map(new Function() { // from class: h8.h
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ArrayList m19311N4;
                m19311N4 = C4625k.m19311N4(InterfaceC5660l.this, obj);
                return m19311N4;
            }
        }).compose(AbstractC7029f.m27121b());
        final k kVar = new k(c5876s, m17990b);
        Consumer consumer = new Consumer() { // from class: h8.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4625k.m19313O4(InterfaceC5660l.this, obj);
            }
        };
        final l lVar = l.f19885a;
        compose.subscribe(consumer, new Consumer() { // from class: h8.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4625k.m19310M4(InterfaceC5660l.this, obj);
            }
        });
    }

    @Override // p301qb.InterfaceC6438x0
    /* renamed from: e2 */
    public void mo19229e2(String str) {
        AbstractC5868k.m23674f(str, "channelCode");
        this.f19865i.put(str, Boolean.TRUE);
    }

    @Override // p130f8.InterfaceC4274a
    /* renamed from: j3 */
    public void mo17830j3() {
        C1427v.f5519a.m6616B0(this);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p130f8.InterfaceC4274a
    /* renamed from: n3 */
    public void mo17831n3(int i10, String str) {
        AbstractC5868k.m23674f(str, "parentType");
        if ((!this.f19863g.isEmpty()) && i10 < this.f19863g.size()) {
            Object obj = this.f19863g.get(i10);
            AbstractC5868k.m23673e(obj, "mCurChannels[position]");
            Channel channel = (Channel) obj;
            C1407f c1407f = C1407f.f5458a;
            String str2 = null;
            if (C1407f.m6469G(c1407f, channel.getChannelCode(), false, 2, null)) {
                int m6528t = c1407f.m6528t();
                int i11 = this.f19861e;
                if ((m6528t == i11 || i11 != c1407f.m6525q()) && !C1415j.m6561d(C1415j.f5500a, channel, null, null, 4, null)) {
                    return;
                }
            }
            c1407f.m6488M();
            c1407f.m6508f0(this.f19863g);
            c1407f.m6506e0(i10);
            c1407f.m6502a0(this.f19864h);
            if (this.f19862f) {
                c1407f.m6501Z(-1);
            } else {
                c1407f.m6501Z(this.f19861e);
            }
            if (c1407f.m6484E()) {
                Channel m6531w = c1407f.m6531w();
                C7589m1 c7589m1 = C7589m1.f27886a;
                if (m6531w != null) {
                    str2 = m6531w.getChannelCode();
                }
                c7589m1.m29119B(str2);
            }
            C7709c.m29787d().m29801m(new ToStartPlayEvent(str));
        }
    }

    @Override // p301qb.InterfaceC6441y0
    /* renamed from: o6 */
    public void mo19232o6(String str) {
        AbstractC5868k.m23674f(str, "channelCode");
        this.f19865i.put(str, Boolean.TRUE);
    }

    @Override // p130f8.InterfaceC4274a
    /* renamed from: s2 */
    public void mo17832s2() {
        C1427v c1427v = C1427v.f5519a;
        c1427v.m6616B0(this);
        c1427v.m6646f0(this);
    }

    /* renamed from: s4 */
    public final InterfaceC4275b m19335s4() {
        return this.f19858b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 == false) goto L22;
     */
    @Override // p130f8.InterfaceC4274a
    /* renamed from: z0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo17833z0(final int r2, boolean r3, int r4, int r5, boolean r6, boolean r7) {
        /*
            r1 = this;
            if (r3 == 0) goto L5
            r1.f19860d = r2
            goto L8
        L5:
            r3 = -1
            r1.f19860d = r3
        L8:
            r1.m19302A1()
            r3 = 2
            r0 = 4
            if (r4 != r3) goto L11
            if (r6 != 0) goto L1c
        L11:
            r3 = 3
            if (r4 != r3) goto L18
            int r3 = r1.f19860d
            if (r2 == r3) goto L1c
        L18:
            if (r4 != r0) goto L92
            if (r5 != r2) goto L92
        L1c:
            r1.f19864h = r4
            r1.f19861e = r2
            r1.f19862f = r6
            if (r4 != r0) goto L36
            c8.f r3 = p040c8.C1407f.f5458a
            com.request.result.ChildColumn r3 = r3.m6519m()
            r4 = 0
            if (r3 == 0) goto L34
            int r3 = r3.getId()
            if (r2 != r3) goto L34
            r4 = 1
        L34:
            if (r4 != 0) goto L3b
        L36:
            f8.b r3 = r1.f19858b
            r3.mo17836B2()
        L3b:
            h8.a r3 = new h8.a
            r3.<init>()
            io.reactivex.Observable r2 = io.reactivex.Observable.create(r3)
            h8.k$a r3 = new h8.k$a
            r3.<init>()
            h8.b r4 = new h8.b
            r4.<init>()
            io.reactivex.Observable r2 = r2.map(r4)
            h8.k$b r3 = p159h8.C4625k.b.f19870a
            h8.c r4 = new h8.c
            r4.<init>()
            io.reactivex.Observable r2 = r2.map(r4)
            h8.k$c r3 = p159h8.C4625k.c.f19871a
            h8.d r4 = new h8.d
            r4.<init>()
            io.reactivex.Observable r2 = r2.map(r4)
            h8.k$d r3 = new h8.k$d
            r3.<init>()
            h8.e r4 = new h8.e
            r4.<init>()
            io.reactivex.Observable r2 = r2.map(r4)
            io.reactivex.ObservableTransformer r3 = p348u2.AbstractC7029f.m27121b()
            io.reactivex.Observable r2 = r2.compose(r3)
            h8.k$e r3 = new h8.k$e
            r3.<init>(r7)
            h8.f r4 = new h8.f
            r4.<init>()
            h8.k$f r3 = p159h8.C4625k.f.f19875a
            h8.g r5 = new h8.g
            r5.<init>()
            r2.subscribe(r4, r5)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p159h8.C4625k.mo17833z0(int, boolean, int, int, boolean, boolean):void");
    }

    @Override // p301qb.InterfaceC6438x0
    /* renamed from: z3 */
    public void mo19235z3(List list, Channel channel, int i10) {
        Object m7008t;
        Object m7008t2;
        AbstractC5868k.m23674f(list, "favId");
        AbstractC5868k.m23674f(channel, "channel");
        this.f19865i.put(channel.getChannelCode(), Boolean.FALSE);
        C7589m1.f27886a.m29135d(C7589m1.b.f27896a.m29160a(), channel.getChannelCode(), channel.getName(), 0L);
        channel.setFav(true);
        m7008t = AbstractC1508t.m7008t(this.f19863g, i10);
        if (!AbstractC5868k.m23669a(channel, m7008t)) {
            int size = this.f19863g.size();
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    if (AbstractC5868k.m23669a(((Channel) this.f19863g.get(i11)).getChannelCode(), channel.getChannelCode())) {
                        i10 = i11;
                        break;
                    }
                    i11++;
                } else {
                    i10 = -1;
                    break;
                }
            }
        }
        if (i10 == -1) {
            return;
        }
        this.f19858b.mo17841c2(i10, true);
        C1428w c1428w = C1428w.f5539a;
        m7008t2 = AbstractC1508t.m7008t(list, 0);
        c1428w.m6668a((FavIdDataItem) m7008t2, channel.getSupportVideoType());
    }
}
