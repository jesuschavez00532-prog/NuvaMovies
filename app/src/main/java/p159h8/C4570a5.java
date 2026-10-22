package p159h8;

import be.C1328x;
import ca.InterfaceC1439a;
import com.live.bean.NotifyChannel;
import com.live.p063db.ReservationList;
import com.module.event.HideContentFragmentEvent;
import com.module.event.ShowLiveInfoBarEvent;
import com.module.event.ToStartPlayEvent;
import com.request.bean.EpgProgram;
import com.request.result.Channel;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p040c8.C1407f;
import p040c8.C1427v;
import p040c8.InterfaceC1404d0;
import p040c8.InterfaceC1416k;
import p043ce.AbstractC1500l;
import p043ce.AbstractC1504p;
import p130f8.InterfaceC4295v;
import p132fa.AbstractC4298b;
import p185j2.C4982a;
import p237m8.AbstractC5607a;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7029f;
import p359ue.AbstractC7166t;
import p400xa.C7594o0;
import p430z9.AbstractActivityC7763a;
import ye.C7709c;

/* renamed from: h8.a5 */
/* loaded from: classes2.dex */
public final class C4570a5 implements InterfaceC1439a, InterfaceC1404d0, InterfaceC1416k {

    /* renamed from: a */
    private AbstractActivityC7763a f19675a;

    /* renamed from: b */
    private InterfaceC4295v f19676b;

    /* renamed from: c */
    private final String f19677c;

    /* renamed from: d */
    private int f19678d;

    /* renamed from: e */
    private Disposable f19679e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.a5$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ String f19681b;

        /* renamed from: c */
        final /* synthetic */ String f19682c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2) {
            super(1);
            this.f19681b = str;
            this.f19682c = str2;
        }

        /* renamed from: a */
        public final void m19047a(Long l10) {
            InterfaceC4295v m19041h0 = C4570a5.this.m19041h0();
            AbstractC5868k.m23673e(l10, "it");
            m19041h0.mo17965K5(60 - l10.longValue(), this.f19681b, this.f19682c);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19047a((Long) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.a5$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final b f19683a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m19048a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19048a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.a5$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ ArrayList f19684a;

        /* renamed from: b */
        final /* synthetic */ String f19685b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ArrayList arrayList, String str) {
            super(1);
            this.f19684a = arrayList;
            this.f19685b = str;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NotifyChannel mo542f(String str) {
            AbstractC5868k.m23674f(str, "it");
            ArrayList arrayList = this.f19684a;
            String str2 = this.f19685b;
            int i10 = 0;
            int i11 = -1;
            for (Object obj : arrayList) {
                int i12 = i10 + 1;
                if (i10 < 0) {
                    AbstractC1500l.m6991j();
                }
                Channel channel = (Channel) obj;
                if (i11 == -1 && AbstractC5868k.m23669a(str2, channel.getChannelCode())) {
                    i11 = i10;
                }
                channel.setShowChannelName(AbstractC5607a.m22776a(channel));
                C7594o0.f27942a.m29219h(channel);
                i10 = i12;
            }
            return new NotifyChannel(i11, this.f19684a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.a5$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {
        d() {
            super(1);
        }

        /* renamed from: a */
        public final void m19050a(ArrayList arrayList) {
            if (AbstractC6567a.m25635e(arrayList)) {
                return;
            }
            InterfaceC4295v m19041h0 = C4570a5.this.m19041h0();
            String programName = ((EpgProgram) arrayList.get(0)).getProgramName();
            if (programName == null) {
                programName = "";
            }
            m19041h0.mo17969y1(programName, ((EpgProgram) arrayList.get(0)).getStart() + '-' + ((EpgProgram) arrayList.get(0)).getStop());
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19050a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.a5$e */
    /* loaded from: classes2.dex */
    public static final class e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final e f19687a = new e();

        e() {
            super(1);
        }

        /* renamed from: a */
        public final void m19051a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19051a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.a5$f */
    /* loaded from: classes2.dex */
    public static final class f extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final f f19688a = new f();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: h8.a5$f$a */
        /* loaded from: classes2.dex */
        public static final class a extends AbstractC5869l implements InterfaceC5642a {

            /* renamed from: a */
            final /* synthetic */ List f19689a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list) {
                super(0);
                this.f19689a = list;
            }

            @Override // me.InterfaceC5642a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return this.f19689a;
            }
        }

        f() {
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
            int i10 = 0;
            c1407f.m6514i0(AbstractC4298b.m17990b("last_sort", 0), m6509g, new a(m6509g));
            int size = m6509g.size();
            while (true) {
                if (i10 < size) {
                    if (AbstractC5868k.m23669a(((Channel) m6509g.get(i10)).getChannelCode(), str)) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 != -1) {
                C1407f c1407f2 = C1407f.f5458a;
                c1407f2.m6488M();
                c1407f2.m6508f0(m6509g);
                c1407f2.m6506e0(i10);
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.a5$g */
    /* loaded from: classes2.dex */
    public static final class g extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ boolean f19690a;

        /* renamed from: b */
        final /* synthetic */ C4570a5 f19691b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean z10, C4570a5 c4570a5) {
            super(1);
            this.f19690a = z10;
            this.f19691b = c4570a5;
        }

        /* renamed from: a */
        public final void m19054a(Boolean bool) {
            C7709c.m29787d().m29801m(new ToStartPlayEvent("HomeLive"));
            if (this.f19690a) {
                C7709c.m29787d().m29801m(new HideContentFragmentEvent());
                C7709c.m29787d().m29801m(new ShowLiveInfoBarEvent());
            }
            C1407f c1407f = C1407f.f5458a;
            c1407f.m6501Z(c1407f.m6523o());
            this.f19691b.m19041h0().mo17967T2();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19054a((Boolean) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.a5$h */
    /* loaded from: classes2.dex */
    public static final class h extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final h f19692a = new h();

        h() {
            super(1);
        }

        /* renamed from: a */
        public final void m19055a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19055a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.a5$i */
    /* loaded from: classes2.dex */
    public static final class i extends AbstractC5869l implements InterfaceC5660l {
        i() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ObservableSource mo542f(ArrayList arrayList) {
            AbstractC5868k.m23674f(arrayList, "it");
            return C4570a5.this.m19020d0(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.a5$j */
    /* loaded from: classes2.dex */
    public static final class j extends AbstractC5869l implements InterfaceC5660l {
        j() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ObservableSource mo542f(ArrayList arrayList) {
            AbstractC5868k.m23674f(arrayList, "it");
            return C4570a5.this.m19017W(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.a5$k */
    /* loaded from: classes2.dex */
    public static final class k extends AbstractC5869l implements InterfaceC5660l {
        k() {
            super(1);
        }

        /* renamed from: a */
        public final void m19058a(NotifyChannel notifyChannel) {
            if (notifyChannel.getPlayIndex() == -1) {
                InterfaceC4295v m19041h0 = C4570a5.this.m19041h0();
                AbstractC5868k.m23673e(notifyChannel, "it");
                m19041h0.mo17966T1(notifyChannel);
            } else {
                InterfaceC4295v m19041h02 = C4570a5.this.m19041h0();
                AbstractC5868k.m23673e(notifyChannel, "it");
                m19041h02.mo17963D4(notifyChannel);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19058a((NotifyChannel) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.a5$l */
    /* loaded from: classes2.dex */
    public static final class l extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final l f19696a = new l();

        l() {
            super(1);
        }

        /* renamed from: a */
        public final void m19059a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19059a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    public C4570a5(AbstractActivityC7763a abstractActivityC7763a, InterfaceC4295v interfaceC4295v) {
        AbstractC5868k.m23674f(abstractActivityC7763a, "activity");
        AbstractC5868k.m23674f(interfaceC4295v, "view");
        this.f19675a = abstractActivityC7763a;
        this.f19676b = interfaceC4295v;
        this.f19677c = C4570a5.class.getSimpleName();
        this.f19678d = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0 */
    public static final void m19004A0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C0 */
    public static final void m19006C0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E0 */
    public static final Boolean m19009E0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Boolean) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P0 */
    public static final ObservableSource m19011P0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ObservableSource) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public static final void m19012R(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R0 */
    public static final ObservableSource m19013R0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ObservableSource) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S0 */
    public static final void m19014S0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T0 */
    public static final void m19015T0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public static final void m19016V(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public final Observable m19017W(ArrayList arrayList) {
        if (AbstractC6567a.m25635e(arrayList)) {
            Observable never = Observable.never();
            AbstractC5868k.m23673e(never, "never()");
            return never;
        }
        String str = (String) C4982a.f20721a.m20333a(this.f19675a, "live_last_channel_code", ((Channel) arrayList.get(0)).getChannelCode());
        Observable just = Observable.just(str);
        final c cVar = new c(arrayList, str);
        Observable map = just.map(new Function() { // from class: h8.x4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                NotifyChannel m19018a0;
                m19018a0 = C4570a5.m19018a0(InterfaceC5660l.this, obj);
                return m19018a0;
            }
        });
        AbstractC5868k.m23673e(map, "channelList: ArrayList<C…elList)\n                }");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public static final NotifyChannel m19018a0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (NotifyChannel) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public final Observable m19020d0(ArrayList arrayList) {
        int m17989a = AbstractC4298b.m17989a("last_sort");
        if (this.f19678d != m17989a) {
            C1407f c1407f = C1407f.f5458a;
            if (!c1407f.m6486H()) {
                this.f19678d = m17989a;
            }
            if (m17989a != 0) {
                if (m17989a == 1) {
                    AbstractC1504p.m6994m(arrayList, new Comparator() { // from class: h8.y4
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            int m19022f0;
                            m19022f0 = C4570a5.m19022f0((Channel) obj, (Channel) obj2);
                            return m19022f0;
                        }
                    });
                } else if (m17989a == 2) {
                    AbstractC1504p.m6994m(arrayList, new Comparator() { // from class: h8.z4
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            int m19023g0;
                            m19023g0 = C4570a5.m19023g0((Channel) obj, (Channel) obj2);
                            return m19023g0;
                        }
                    });
                }
            } else {
                arrayList.clear();
                arrayList.addAll(c1407f.m6513i());
            }
            Observable just = Observable.just(arrayList);
            AbstractC5868k.m23673e(just, "just(channelList)");
            return just;
        }
        Observable never = Observable.never();
        AbstractC5868k.m23673e(never, "never()");
        return never;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public static final int m19022f0(Channel channel, Channel channel2) {
        int m27720g;
        m27720g = AbstractC7166t.m27720g(channel.getName(), channel2.getName(), true);
        return m27720g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public static final int m19023g0(Channel channel, Channel channel2) {
        int m27720g;
        m27720g = AbstractC7166t.m27720g(channel2.getName(), channel.getName(), true);
        return m27720g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public static final void m19028n0(ObservableEmitter observableEmitter) {
        String str;
        AbstractC5868k.m23674f(observableEmitter, "it");
        C1427v c1427v = C1427v.f5519a;
        Channel m6531w = C1407f.f5458a.m6531w();
        if (m6531w != null) {
            str = m6531w.getChannelCode();
        } else {
            str = null;
        }
        observableEmitter.onNext(c1427v.m6638Y(str));
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public static final void m19030p0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public static final void m19032r0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        m19042i0();
    }

    /* renamed from: L */
    public void m19037L() {
        Disposable disposable = this.f19679e;
        if (disposable != null) {
            AbstractC6567a.m25632b(disposable);
        }
        this.f19679e = null;
    }

    /* renamed from: M0 */
    public void m19038M0(ArrayList arrayList) {
        AbstractC5868k.m23674f(arrayList, "channelList");
        if (AbstractC6567a.m25635e(arrayList)) {
            return;
        }
        Observable just = Observable.just(arrayList);
        final i iVar = new i();
        Observable flatMap = just.flatMap(new Function() { // from class: h8.t4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource m19011P0;
                m19011P0 = C4570a5.m19011P0(InterfaceC5660l.this, obj);
                return m19011P0;
            }
        });
        final j jVar = new j();
        Observable compose = flatMap.flatMap(new Function() { // from class: h8.u4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource m19013R0;
                m19013R0 = C4570a5.m19013R0(InterfaceC5660l.this, obj);
                return m19013R0;
            }
        }).compose(AbstractC7029f.m27120a());
        final k kVar = new k();
        Consumer consumer = new Consumer() { // from class: h8.v4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4570a5.m19014S0(InterfaceC5660l.this, obj);
            }
        };
        final l lVar = l.f19696a;
        compose.subscribe(consumer, new Consumer() { // from class: h8.w4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4570a5.m19015T0(InterfaceC5660l.this, obj);
            }
        });
    }

    /* renamed from: N */
    public void m19039N() {
        C1427v.f5519a.m6658v();
    }

    /* renamed from: O */
    public void m19040O(String str, String str2) {
        m19037L();
        Observable<R> compose = Observable.interval(1L, 1L, TimeUnit.SECONDS).take(61L).compose(AbstractC7029f.m27121b());
        final a aVar = new a(str, str2);
        Consumer consumer = new Consumer() { // from class: h8.p4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4570a5.m19012R(InterfaceC5660l.this, obj);
            }
        };
        final b bVar = b.f19683a;
        this.f19679e = compose.subscribe(consumer, new Consumer() { // from class: h8.q4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4570a5.m19016V(InterfaceC5660l.this, obj);
            }
        });
    }

    @Override // p040c8.InterfaceC1404d0
    /* renamed from: a */
    public void mo6468a(ReservationList reservationList) {
        AbstractC5868k.m23674f(reservationList, "reserve");
        this.f19676b.mo17968a1(reservationList);
    }

    /* renamed from: h0 */
    public final InterfaceC4295v m19041h0() {
        return this.f19676b;
    }

    /* renamed from: i0 */
    public void m19042i0() {
        C1427v.f5519a.m6637X(this);
    }

    /* renamed from: m0 */
    public void m19043m0() {
        C1427v c1427v = C1427v.f5519a;
        if (!c1427v.m6634U()) {
            c1427v.m6616B0(this);
            c1427v.m6646f0(this);
            return;
        }
        Observable create = Observable.create(new ObservableOnSubscribe() { // from class: h8.l4
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C4570a5.m19028n0(observableEmitter);
            }
        });
        AbstractC5868k.m23673e(create, "create<ArrayList<EpgProg…it.onComplete()\n        }");
        Observable compose = AbstractC6567a.m25631a(create, this.f19675a.m19900N3()).compose(AbstractC7029f.m27121b());
        final d dVar = new d();
        Consumer consumer = new Consumer() { // from class: h8.r4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4570a5.m19030p0(InterfaceC5660l.this, obj);
            }
        };
        final e eVar = e.f19687a;
        compose.subscribe(consumer, new Consumer() { // from class: h8.s4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4570a5.m19032r0(InterfaceC5660l.this, obj);
            }
        });
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    /* renamed from: s0 */
    public void m19044s0(int i10) {
        List m6515j = C1407f.f5458a.m6515j(i10);
        if (!AbstractC6567a.m25635e(m6515j)) {
            AbstractC5868k.m23671c(m6515j);
            ArrayList arrayList = new ArrayList(m6515j.size());
            arrayList.addAll(m6515j);
            this.f19676b.mo17964F3(arrayList);
        }
    }

    @Override // p040c8.InterfaceC1416k
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public void mo6577Y0(HashMap hashMap) {
        AbstractC5868k.m23674f(hashMap, "t");
        m19043m0();
    }

    /* renamed from: x0 */
    public void m19046x0(ReservationList reservationList, boolean z10) {
        AbstractC5868k.m23674f(reservationList, "reserve");
        if (C1407f.m6469G(C1407f.f5458a, reservationList.getChannelCode(), false, 2, null)) {
            return;
        }
        Observable just = Observable.just(reservationList.getChannelCode());
        final f fVar = f.f19688a;
        Observable compose = just.map(new Function() { // from class: h8.m4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Boolean m19009E0;
                m19009E0 = C4570a5.m19009E0(InterfaceC5660l.this, obj);
                return m19009E0;
            }
        }).compose(AbstractC7029f.m27121b());
        final g gVar = new g(z10, this);
        Consumer consumer = new Consumer() { // from class: h8.n4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4570a5.m19004A0(InterfaceC5660l.this, obj);
            }
        };
        final h hVar = h.f19692a;
        compose.subscribe(consumer, new Consumer() { // from class: h8.o4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4570a5.m19006C0(InterfaceC5660l.this, obj);
            }
        });
    }
}
