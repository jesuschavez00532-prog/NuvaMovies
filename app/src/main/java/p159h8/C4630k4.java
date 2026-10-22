package p159h8;

import androidx.fragment.app.Fragment;
import be.C1328x;
import ca.InterfaceC1439a;
import com.module.event.HideContentFragmentEvent;
import com.module.event.ToStartPlayEvent;
import com.request.result.Channel;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5876s;
import p040c8.C1407f;
import p130f8.InterfaceC4294u;
import p132fa.AbstractC4298b;
import p223l8.C5442e1;
import p223l8.C5498s1;
import p223l8.ViewOnClickListenerC5519x2;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7029f;
import p430z9.AbstractC7765c;
import ye.C7709c;

/* renamed from: h8.k4 */
/* loaded from: classes2.dex */
public final class C4630k4 implements InterfaceC1439a {

    /* renamed from: a */
    private AbstractC7765c f19894a;

    /* renamed from: b */
    private InterfaceC4294u f19895b;

    /* renamed from: c */
    private final String f19896c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.k4$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final a f19897a = new a();

        a() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo542f(ArrayList arrayList) {
            AbstractC5868k.m23674f(arrayList, "it");
            C1407f.f5458a.m6516k(arrayList);
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.k4$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {
        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m19380a(ArrayList arrayList) {
            C4630k4.this.m19378v().mo17962s3();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19380a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.k4$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f19899a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m19381a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19381a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.k4$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final d f19900a = new d();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: h8.k4$d$a */
        /* loaded from: classes2.dex */
        public static final class a extends AbstractC5869l implements InterfaceC5642a {

            /* renamed from: a */
            public static final a f19901a = new a();

            a() {
                super(0);
            }

            @Override // me.InterfaceC5642a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                C1407f c1407f = C1407f.f5458a;
                return c1407f.m6509g(c1407f.m6523o());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: h8.k4$d$b */
        /* loaded from: classes2.dex */
        public static final class b extends AbstractC5869l implements InterfaceC5660l {

            /* renamed from: a */
            final /* synthetic */ C5876s f19902a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C5876s c5876s) {
                super(1);
                this.f19902a = c5876s;
            }

            /* renamed from: a */
            public final void m19384a(int i10) {
                this.f19902a.f23410a = i10;
            }

            @Override // me.InterfaceC5660l
            /* renamed from: f */
            public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
                m19384a(((Number) obj).intValue());
                return C1328x.f4998a;
            }
        }

        d() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo542f(String str) {
            AbstractC5868k.m23674f(str, "it");
            C1407f c1407f = C1407f.f5458a;
            List m6509g = c1407f.m6509g(c1407f.m6523o());
            if (AbstractC6567a.m25635e(m6509g)) {
                return Boolean.FALSE;
            }
            C5876s c5876s = new C5876s();
            c5876s.f23410a = -1;
            c1407f.m6512h0(AbstractC4298b.m17990b("last_sort", 0), str, m6509g, a.f19901a, new b(c5876s));
            if (c5876s.f23410a != -1) {
                c1407f.m6488M();
                c1407f.m6508f0(m6509g);
                c1407f.m6506e0(c5876s.f23410a);
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.k4$e */
    /* loaded from: classes2.dex */
    public static final class e extends AbstractC5869l implements InterfaceC5660l {
        e() {
            super(1);
        }

        /* renamed from: a */
        public final void m19385a(Boolean bool) {
            C5498s1.f22305l1.m22286c(true);
            C7709c.m29787d().m29801m(new HideContentFragmentEvent());
            C7709c m29787d = C7709c.m29787d();
            AbstractC7765c m19377s = C4630k4.this.m19377s();
            AbstractC5868k.m23672d(m19377s, "null cannot be cast to non-null type com.live.ui.fragment.SearchLiveFragment");
            Fragment m3133W6 = ((ViewOnClickListenerC5519x2) m19377s).m3133W6();
            AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
            m29787d.m29801m(new ToStartPlayEvent(((C5442e1) m3133W6).m21939Ia()));
            C1407f c1407f = C1407f.f5458a;
            c1407f.m6501Z(c1407f.m6523o());
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19385a((Boolean) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.k4$f */
    /* loaded from: classes2.dex */
    public static final class f extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final f f19904a = new f();

        f() {
            super(1);
        }

        /* renamed from: a */
        public final void m19386a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19386a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.k4$g */
    /* loaded from: classes2.dex */
    public static final class g extends AbstractC5869l implements InterfaceC5660l {
        g() {
            super(1);
        }

        /* renamed from: a */
        public final void m19387a(Boolean bool) {
            C5498s1.f22305l1.m22286c(true);
            C7709c.m29787d().m29801m(new HideContentFragmentEvent());
            C7709c m29787d = C7709c.m29787d();
            AbstractC7765c m19377s = C4630k4.this.m19377s();
            AbstractC5868k.m23672d(m19377s, "null cannot be cast to non-null type com.live.ui.fragment.SearchLiveFragment");
            Fragment m3133W6 = ((ViewOnClickListenerC5519x2) m19377s).m3133W6();
            AbstractC5868k.m23672d(m3133W6, "null cannot be cast to non-null type com.live.ui.fragment.LiveContentFrag");
            m29787d.m29801m(new ToStartPlayEvent(((C5442e1) m3133W6).m21939Ia()));
            C1407f c1407f = C1407f.f5458a;
            c1407f.m6501Z(c1407f.m6525q());
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19387a((Boolean) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.k4$h */
    /* loaded from: classes2.dex */
    public static final class h extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final h f19906a = new h();

        h() {
            super(1);
        }

        /* renamed from: a */
        public final void m19388a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19388a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    public C4630k4(AbstractC7765c abstractC7765c, InterfaceC4294u interfaceC4294u) {
        AbstractC5868k.m23674f(abstractC7765c, "fragment");
        AbstractC5868k.m23674f(interfaceC4294u, "view");
        this.f19894a = abstractC7765c;
        this.f19895b = interfaceC4294u;
        this.f19896c = C4630k4.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static final void m19355A(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static final void m19356C(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: D */
    private final void m19357D(Channel channel) {
        Observable just = Observable.just(channel.getChannelCode());
        final d dVar = d.f19900a;
        Observable compose = just.map(new Function() { // from class: h8.h4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Boolean m19358E;
                m19358E = C4630k4.m19358E(InterfaceC5660l.this, obj);
                return m19358E;
            }
        }).compose(AbstractC7029f.m27121b());
        final e eVar = new e();
        Consumer consumer = new Consumer() { // from class: h8.i4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4630k4.m19359I(InterfaceC5660l.this, obj);
            }
        };
        final f fVar = f.f19904a;
        compose.subscribe(consumer, new Consumer() { // from class: h8.j4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4630k4.m19360L(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public static final Boolean m19358E(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Boolean) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static final void m19359I(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static final void m19360L(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: N */
    private final void m19361N(final ArrayList arrayList, final Channel channel) {
        Observable compose = Observable.create(new ObservableOnSubscribe() { // from class: h8.e4
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C4630k4.m19362O(arrayList, channel, observableEmitter);
            }
        }).compose(AbstractC7029f.m27121b());
        final g gVar = new g();
        Consumer consumer = new Consumer() { // from class: h8.f4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4630k4.m19363R(InterfaceC5660l.this, obj);
            }
        };
        final h hVar = h.f19906a;
        compose.subscribe(consumer, new Consumer() { // from class: h8.g4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4630k4.m19364V(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static final void m19362O(ArrayList arrayList, Channel channel, ObservableEmitter observableEmitter) {
        AbstractC5868k.m23674f(arrayList, "$freeChannels");
        AbstractC5868k.m23674f(channel, "$channel");
        AbstractC5868k.m23674f(observableEmitter, "it");
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (AbstractC5868k.m23669a(((Channel) arrayList.get(i10)).getChannelCode(), channel.getChannelCode())) {
                    break;
                } else {
                    i10++;
                }
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 != -1) {
            C1407f c1407f = C1407f.f5458a;
            c1407f.m6488M();
            c1407f.m6508f0(arrayList);
            c1407f.m6506e0(i10);
            observableEmitter.onNext(Boolean.TRUE);
        } else {
            observableEmitter.onNext(Boolean.FALSE);
        }
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public static final void m19363R(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public static final void m19364V(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: w */
    private final void m19374w() {
        Observable just = Observable.just(this.f19895b.mo17961K4());
        final a aVar = a.f19897a;
        Observable compose = just.map(new Function() { // from class: h8.b4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ArrayList m19375y;
                m19375y = C4630k4.m19375y(InterfaceC5660l.this, obj);
                return m19375y;
            }
        }).compose(AbstractC7029f.m27121b());
        final b bVar = new b();
        Consumer consumer = new Consumer() { // from class: h8.c4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4630k4.m19355A(InterfaceC5660l.this, obj);
            }
        };
        final c cVar = c.f19899a;
        compose.subscribe(consumer, new Consumer() { // from class: h8.d4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4630k4.m19356C(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static final ArrayList m19375y(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ArrayList) interfaceC5660l.mo542f(obj);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        m19374w();
    }

    /* renamed from: W */
    public void m19376W(boolean z10, ArrayList arrayList, Channel channel) {
        AbstractC5868k.m23674f(arrayList, "freeChannels");
        AbstractC5868k.m23674f(channel, "channel");
        if (C1407f.m6469G(C1407f.f5458a, channel.getChannelCode(), false, 2, null)) {
            return;
        }
        if (z10) {
            m19361N(arrayList, channel);
        } else {
            m19357D(channel);
        }
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    /* renamed from: s */
    public final AbstractC7765c m19377s() {
        return this.f19894a;
    }

    /* renamed from: v */
    public final InterfaceC4294u m19378v() {
        return this.f19895b;
    }
}
