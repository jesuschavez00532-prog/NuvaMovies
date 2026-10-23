package p147g8;

import ac.C0150f;
import ac.C0165i2;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import com.request.result.Match;
import com.request.result.ShelveMatch;
import com.request.result.ShelveMatchList;
import io.reactivex.Observable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p040c8.C1402c0;
import p115e8.InterfaceC4147f;
import p115e8.InterfaceC4148g;
import p135fd.C4307b;
import p301qb.InterfaceC6386g;
import p301qb.InterfaceC6400k1;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7029f;
import p430z9.AbstractActivityC7763a;

/* renamed from: g8.k */
/* loaded from: classes2.dex */
public final class C4375k implements InterfaceC4147f, InterfaceC6400k1, InterfaceC6386g {

    /* renamed from: a */
    private AbstractActivityC7763a f18997a;

    /* renamed from: b */
    private InterfaceC4148g f18998b;

    /* renamed from: c */
    private final int f18999c;

    /* renamed from: d */
    private final int f19000d;

    /* renamed from: e */
    private final int f19001e;

    /* renamed from: f */
    private int f19002f;

    /* renamed from: g */
    private int f19003g;

    /* renamed from: h */
    private int f19004h;

    /* renamed from: i */
    private boolean f19005i;

    /* renamed from: j */
    private boolean f19006j;

    /* renamed from: k */
    private int f19007k;

    /* renamed from: l */
    private String f19008l;

    /* renamed from: m */
    private final InterfaceC1312h f19009m;

    /* renamed from: n */
    private final InterfaceC1312h f19010n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.k$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final a f19011a = new a();

        a() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Match mo542f(Match match) {
            AbstractC5868k.m23674f(match, "it");
            match.setSubscribed(C1402c0.f5445a.m6460l(match));
            return match;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.k$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final b f19012a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m18342a(Match match) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m18342a((Match) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.k$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f19013a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m18343a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m18343a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: g8.k$d */
    /* loaded from: classes2.dex */
    static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final d f19014a = new d();

        d() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Match mo542f(Match match) {
            AbstractC5868k.m23674f(match, "it");
            match.setSubscribed(C1402c0.f5445a.m6460l(match));
            return match;
        }
    }

    /* renamed from: g8.k$e */
    /* loaded from: classes2.dex */
    static final class e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ Match f19016b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Match match) {
            super(1);
            this.f19016b = match;
        }

        /* renamed from: a */
        public final void m18345a(Match match) {
            C4375k.this.m18338b4().mo11464G2(this.f19016b);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m18345a((Match) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: g8.k$f */
    /* loaded from: classes2.dex */
    static final class f extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final f f19017a = new f();

        f() {
            super(1);
        }

        /* renamed from: a */
        public final void m18346a(Throwable th) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m18346a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: g8.k$g */
    /* loaded from: classes2.dex */
    static final class g extends AbstractC5869l implements InterfaceC5642a {
        g() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0150f invoke() {
            return new C0150f(C4375k.this);
        }
    }

    /* renamed from: g8.k$h */
    /* loaded from: classes2.dex */
    static final class h extends AbstractC5869l implements InterfaceC5642a {
        h() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0165i2 invoke() {
            return new C0165i2(C4375k.this);
        }
    }

    public C4375k(AbstractActivityC7763a abstractActivityC7763a, InterfaceC4148g interfaceC4148g) {
        InterfaceC1312h m5965b;
        InterfaceC1312h m5965b2;
        AbstractC5868k.m23674f(abstractActivityC7763a, "act");
        AbstractC5868k.m23674f(interfaceC4148g, "view");
        this.f18997a = abstractActivityC7763a;
        this.f18998b = interfaceC4148g;
        this.f19000d = 1;
        this.f19001e = 2;
        this.f19005i = true;
        this.f19006j = true;
        this.f19007k = this.f18999c;
        this.f19008l = "";
        m5965b = AbstractC1314j.m5965b(new h());
        this.f19009m = m5965b;
        m5965b2 = AbstractC1314j.m5965b(new g());
        this.f19010n = m5965b2;
    }

    /* renamed from: Q3 */
    private final void m18325Q3(String str, String str2, int i10) {
        this.f18998b.mo11467c0(true);
        m18326T3().m571d(str, str2, i10);
    }

    /* renamed from: T3 */
    private final C0150f m18326T3() {
        return (C0150f) this.f19010n.getValue();
    }

    /* renamed from: W3 */
    private final C0165i2 m18327W3() {
        return (C0165i2) this.f19009m.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d4 */
    public static final Match m18329d4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Match) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e4 */
    public static final void m18330e4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g4 */
    public static final void m18331g4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h4 */
    public static final void m18332h4(C4375k c4375k, ArrayList arrayList, int i10) {
        AbstractC5868k.m23674f(c4375k, "this$0");
        AbstractC5868k.m23674f(arrayList, "$matchList");
        c4375k.f18998b.mo11467c0(false);
        c4375k.f18998b.mo11466b2(arrayList, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k4 */
    public static final Match m18333k4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Match) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q4 */
    public static final void m18334q4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r4 */
    public static final void m18335r4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    @Override // p115e8.InterfaceC4147f
    /* renamed from: A2 */
    public void mo17355A2(String str, String str2) {
        AbstractC5868k.m23674f(str, "match");
        AbstractC5868k.m23674f(str2, "gameId");
        this.f19008l = str;
        m18325Q3(str, str2, 0);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        m18337Y3();
    }

    @Override // p301qb.InterfaceC6386g
    /* renamed from: G5 */
    public void mo18336G5(List list, int i10) {
        AbstractC5868k.m23674f(list, "matchList");
        this.f19007k = this.f18999c;
        if (i10 == 0) {
            if (AbstractC6567a.m25638h(list)) {
                m18339c4((ArrayList) list, i10);
                return;
            } else {
                this.f18998b.mo11468g();
                return;
            }
        }
        if (i10 < 0) {
            if (list.size() < 10) {
                this.f19005i = false;
            }
            this.f19003g = i10;
            m18339c4((ArrayList) list, i10);
            return;
        }
        if (list.size() < 10) {
            this.f19006j = false;
        }
        this.f19004h = i10;
        m18339c4((ArrayList) list, i10);
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f18997a.m19900N3();
    }

    @Override // p301qb.InterfaceC6400k1
    /* renamed from: V5 */
    public void mo18310V5(String str) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f18998b.mo11470t();
    }

    /* renamed from: Y3 */
    public void m18337Y3() {
        this.f18998b.mo11467c0(true);
        m18327W3().m616b();
    }

    /* renamed from: b4 */
    public final InterfaceC4148g m18338b4() {
        return this.f18998b;
    }

    /* renamed from: c4 */
    public void m18339c4(final ArrayList arrayList, final int i10) {
        AbstractC5868k.m23674f(arrayList, "matchList");
        if (arrayList.isEmpty()) {
            this.f18998b.mo11467c0(false);
            return;
        }
        Observable fromIterable = Observable.fromIterable(arrayList);
        final a aVar = a.f19011a;
        Observable compose = fromIterable.map(new Function() { // from class: g8.g
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Match m18329d4;
                m18329d4 = C4375k.m18329d4(InterfaceC5660l.this, obj);
                return m18329d4;
            }
        }).compose(AbstractC7029f.m27120a());
        final b bVar = b.f19012a;
        Consumer consumer = new Consumer() { // from class: g8.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4375k.m18330e4(InterfaceC5660l.this, obj);
            }
        };
        final c cVar = c.f19013a;
        compose.subscribe(consumer, new Consumer() { // from class: g8.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4375k.m18331g4(InterfaceC5660l.this, obj);
            }
        }, new Action() { // from class: g8.j
            @Override // io.reactivex.functions.Action
            public final void run() {
                C4375k.m18332h4(C4375k.this, arrayList, i10);
            }
        });
    }

    @Override // p115e8.InterfaceC4147f
    /* renamed from: d2 */
    public boolean mo17356d2() {
        return this.f19005i;
    }

    @Override // p301qb.InterfaceC6386g
    /* renamed from: e1 */
    public void mo18340e1(String str, int i10) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f19007k = this.f18999c;
        if (i10 == 0) {
            this.f18998b.mo11470t();
        } else {
            this.f18998b.mo11467c0(false);
        }
    }

    @Override // p115e8.InterfaceC4147f
    /* renamed from: i2 */
    public void mo17357i2() {
        if (this.f19007k != this.f19000d && mo17356d2()) {
            this.f19007k = this.f19000d;
            int i10 = this.f19003g - 10;
            this.f19002f = i10;
            m18325Q3(this.f19008l, "", i10);
        }
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p115e8.InterfaceC4147f
    /* renamed from: o3 */
    public void mo17358o3(Match match) {
        AbstractC5868k.m23674f(match, "match");
        Observable just = Observable.just(match);
        final d dVar = d.f19014a;
        Observable compose = just.map(new Function() { // from class: g8.d
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Match m18333k4;
                m18333k4 = C4375k.m18333k4(InterfaceC5660l.this, obj);
                return m18333k4;
            }
        }).compose(AbstractC7029f.m27120a());
        final e eVar = new e(match);
        Consumer consumer = new Consumer() { // from class: g8.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4375k.m18334q4(InterfaceC5660l.this, obj);
            }
        };
        final f fVar = f.f19017a;
        compose.subscribe(consumer, new Consumer() { // from class: g8.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4375k.m18335r4(InterfaceC5660l.this, obj);
            }
        });
    }

    @Override // p301qb.InterfaceC6400k1
    /* renamed from: q2 */
    public void mo18314q2(ShelveMatchList shelveMatchList) {
        int i10 = 0;
        List<ShelveMatch> matchList;
        if (shelveMatchList != null && (matchList = shelveMatchList.getMatchList()) != null) {
            i10 = matchList.size();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            InterfaceC4148g interfaceC4148g = this.f18998b;
            AbstractC5868k.m23671c(shelveMatchList);
            List<ShelveMatch> matchList2 = shelveMatchList.getMatchList();
            AbstractC5868k.m23671c(matchList2);
            interfaceC4148g.mo11465K(matchList2);
            return;
        }
        this.f18998b.mo11468g();
    }

    @Override // p115e8.InterfaceC4147f
    /* renamed from: q3 */
    public void mo17359q3() {
        this.f19003g = 0;
        this.f19004h = 0;
        this.f19005i = true;
        this.f19006j = true;
        this.f19002f = 0;
        this.f19007k = this.f18999c;
    }

    @Override // p115e8.InterfaceC4147f
    /* renamed from: v3 */
    public boolean mo17360v3() {
        return this.f19006j;
    }

    @Override // p115e8.InterfaceC4147f
    /* renamed from: x3 */
    public void mo17361x3() {
        if (this.f19007k != this.f19001e && mo17360v3()) {
            this.f19007k = this.f19001e;
            int i10 = this.f19004h + 10;
            this.f19002f = i10;
            m18325Q3(this.f19008l, "", i10);
        }
    }
}
