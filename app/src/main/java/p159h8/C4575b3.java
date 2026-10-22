package p159h8;

import ba.AbstractC1196d;
import be.C1328x;
import com.live.p063db.ReservationList;
import com.module.event.HideContentFragmentEvent;
import com.module.event.ToStartPlayEvent;
import com.request.result.Channel;
import io.reactivex.Observable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p040c8.C1407f;
import p040c8.C1427v;
import p130f8.InterfaceC4280g;
import p130f8.InterfaceC4281h;
import p132fa.AbstractC4298b;
import p223l8.C5525z1;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7029f;
import ye.C7709c;

/* renamed from: h8.b3 */
/* loaded from: classes2.dex */
public final class C4575b3 implements InterfaceC4280g {

    /* renamed from: a */
    private AbstractC1196d f19701a;

    /* renamed from: b */
    private InterfaceC4281h f19702b;

    /* renamed from: c */
    private final String f19703c;

    /* renamed from: d */
    private ArrayList f19704d;

    /* renamed from: h8.b3$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final a f19705a = new a();

        a() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ReservationList mo542f(ReservationList reservationList) {
            AbstractC5868k.m23674f(reservationList, "it");
            C1427v.f5519a.m6660z(reservationList);
            return reservationList;
        }
    }

    /* renamed from: h8.b3$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5660l {
        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m19109a(ReservationList reservationList) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19109a((ReservationList) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.b3$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f19707a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m19110a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19110a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.b3$d */
    /* loaded from: classes2.dex */
    static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final d f19708a = new d();

        d() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo542f(String str) {
            AbstractC5868k.m23674f(str, "it");
            return Boolean.valueOf(C1427v.f5519a.m6614A(str));
        }
    }

    /* renamed from: h8.b3$e */
    /* loaded from: classes2.dex */
    static final class e extends AbstractC5869l implements InterfaceC5660l {
        e() {
            super(1);
        }

        /* renamed from: a */
        public final void m19112a(Boolean bool) {
            AbstractC5868k.m23673e(bool, "it");
            if (bool.booleanValue()) {
                C4575b3.this.m19107x0().mo17920b6();
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19112a((Boolean) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.b3$f */
    /* loaded from: classes2.dex */
    static final class f extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final f f19710a = new f();

        f() {
            super(1);
        }

        /* renamed from: a */
        public final void m19113a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19113a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.b3$g */
    /* loaded from: classes2.dex */
    static final class g extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ ReservationList f19712b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ReservationList reservationList) {
            super(1);
            this.f19712b = reservationList;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ReservationList mo542f(ReservationList reservationList) {
            AbstractC5868k.m23674f(reservationList, "it");
            if (C4575b3.this.m19102s0(this.f19712b)) {
                C4575b3.this.f19704d.remove(this.f19712b);
                this.f19712b.setRestore(1);
                this.f19712b.setReserve(true);
            } else {
                C4575b3.this.f19704d.add(this.f19712b);
                this.f19712b.setRestore(0);
                this.f19712b.setReserve(false);
            }
            return reservationList;
        }
    }

    /* renamed from: h8.b3$h */
    /* loaded from: classes2.dex */
    static final class h extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ ReservationList f19713a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ReservationList reservationList) {
            super(1);
            this.f19713a = reservationList;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ReservationList mo542f(ReservationList reservationList) {
            AbstractC5868k.m23674f(reservationList, "it");
            C1427v.f5519a.m6618C0(this.f19713a);
            return reservationList;
        }
    }

    /* renamed from: h8.b3$i */
    /* loaded from: classes2.dex */
    static final class i extends AbstractC5869l implements InterfaceC5660l {
        i() {
            super(1);
        }

        /* renamed from: a */
        public final void m19116a(ReservationList reservationList) {
            C4575b3.this.m19107x0().mo17921p2();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19116a((ReservationList) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.b3$j */
    /* loaded from: classes2.dex */
    static final class j extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final j f19715a = new j();

        j() {
            super(1);
        }

        /* renamed from: a */
        public final void m19117a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19117a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.b3$k */
    /* loaded from: classes2.dex */
    public static final class k extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final k f19716a = new k();

        k() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo542f(Long l10) {
            AbstractC5868k.m23674f(l10, "nowTime");
            return C1427v.f5519a.m6644d0(l10.longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.b3$l */
    /* loaded from: classes2.dex */
    public static final class l extends AbstractC5869l implements InterfaceC5660l {
        l() {
            super(1);
        }

        /* renamed from: a */
        public final void m19119a(ArrayList arrayList) {
            InterfaceC4281h m19107x0 = C4575b3.this.m19107x0();
            AbstractC5868k.m23673e(arrayList, "it");
            m19107x0.mo17918F0(arrayList);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19119a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.b3$m */
    /* loaded from: classes2.dex */
    public static final class m extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final m f19718a = new m();

        m() {
            super(1);
        }

        /* renamed from: a */
        public final void m19120a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19120a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.b3$n */
    /* loaded from: classes2.dex */
    static final class n extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final n f19719a = new n();

        n() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo542f(String str) {
            AbstractC5868k.m23674f(str, "it");
            return C1427v.f5519a.m6645e0(str);
        }
    }

    /* renamed from: h8.b3$o */
    /* loaded from: classes2.dex */
    static final class o extends AbstractC5869l implements InterfaceC5660l {
        o() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo542f(ArrayList arrayList) {
            AbstractC5868k.m23674f(arrayList, "it");
            C4575b3 c4575b3 = C4575b3.this;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ReservationList reservationList = (ReservationList) it.next();
                if (c4575b3.m19102s0(reservationList)) {
                    reservationList.setRestore(0);
                    reservationList.setReserve(false);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: h8.b3$p */
    /* loaded from: classes2.dex */
    static final class p extends AbstractC5869l implements InterfaceC5660l {
        p() {
            super(1);
        }

        /* renamed from: a */
        public final void m19123a(ArrayList arrayList) {
            InterfaceC4281h m19107x0 = C4575b3.this.m19107x0();
            AbstractC5868k.m23673e(arrayList, "it");
            m19107x0.mo17919N4(arrayList);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19123a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: h8.b3$q */
    /* loaded from: classes2.dex */
    static final class q extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final q f19722a = new q();

        q() {
            super(1);
        }

        /* renamed from: a */
        public final void m19124a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19124a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.b3$r */
    /* loaded from: classes2.dex */
    public static final class r extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final r f19723a = new r();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: h8.b3$r$a */
        /* loaded from: classes2.dex */
        public static final class a extends AbstractC5869l implements InterfaceC5642a {

            /* renamed from: a */
            final /* synthetic */ List f19724a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List list) {
                super(0);
                this.f19724a = list;
            }

            @Override // me.InterfaceC5642a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                return this.f19724a;
            }
        }

        r() {
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
    /* renamed from: h8.b3$s */
    /* loaded from: classes2.dex */
    public static final class s extends AbstractC5869l implements InterfaceC5660l {
        s() {
            super(1);
        }

        /* renamed from: a */
        public final void m19127a(Boolean bool) {
            C7709c.m29787d().m29801m(new HideContentFragmentEvent());
            C7709c m29787d = C7709c.m29787d();
            AbstractC1196d m19106v0 = C4575b3.this.m19106v0();
            AbstractC5868k.m23672d(m19106v0, "null cannot be cast to non-null type com.live.ui.fragment.LiveReserveFragment");
            m29787d.m29801m(new ToStartPlayEvent(((C5525z1) m19106v0).m22421P9()));
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19127a((Boolean) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.b3$t */
    /* loaded from: classes2.dex */
    public static final class t extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final t f19726a = new t();

        t() {
            super(1);
        }

        /* renamed from: a */
        public final void m19128a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19128a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    public C4575b3(AbstractC1196d abstractC1196d, InterfaceC4281h interfaceC4281h) {
        AbstractC5868k.m23674f(abstractC1196d, "fragment");
        AbstractC5868k.m23674f(interfaceC4281h, "view");
        this.f19701a = abstractC1196d;
        this.f19702b = interfaceC4281h;
        this.f19703c = C4575b3.class.getSimpleName();
        this.f19704d = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0 */
    public static final ArrayList m19061A0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ArrayList) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C0 */
    public static final void m19063C0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E0 */
    public static final void m19066E0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M0 */
    public static final ArrayList m19069M0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ArrayList) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P0 */
    public static final ArrayList m19072P0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ArrayList) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R0 */
    public static final void m19074R0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S0 */
    public static final void m19075S0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: T0 */
    private final void m19076T0(ReservationList reservationList) {
        Observable just = Observable.just(reservationList.getChannelCode());
        final r rVar = r.f19723a;
        Observable compose = just.map(new Function() { // from class: h8.m2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Boolean m19077U0;
                m19077U0 = C4575b3.m19077U0(InterfaceC5660l.this, obj);
                return m19077U0;
            }
        }).compose(AbstractC7029f.m27121b());
        final s sVar = new s();
        Consumer consumer = new Consumer() { // from class: h8.n2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4575b3.m19080X0(InterfaceC5660l.this, obj);
            }
        };
        final t tVar = t.f19726a;
        compose.subscribe(consumer, new Consumer() { // from class: h8.o2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4575b3.m19081Y0(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U0 */
    public static final Boolean m19077U0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Boolean) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public static final ReservationList m19079W(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ReservationList) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X0 */
    public static final void m19080X0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y0 */
    public static final void m19081Y0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public static final void m19083a0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public static final void m19085d0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public static final void m19087f0(C4575b3 c4575b3) {
        AbstractC5868k.m23674f(c4575b3, "this$0");
        c4575b3.f19704d.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public static final Boolean m19088g0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Boolean) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public static final void m19089h0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public static final void m19091i0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public static final void m19094m0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public static final ReservationList m19096n0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ReservationList) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public static final ReservationList m19098p0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ReservationList) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public static final void m19100r0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public final boolean m19102s0(ReservationList reservationList) {
        boolean z10 = false;
        for (ReservationList reservationList2 : this.f19704d) {
            if (AbstractC5868k.m23669a(reservationList2.getChannelCode(), reservationList.getChannelCode()) && AbstractC5868k.m23669a(reservationList2.getContent(), reservationList.getContent()) && AbstractC5868k.m23669a(reservationList2.getDate(), reservationList.getDate()) && AbstractC5868k.m23669a(reservationList2.getTime(), reservationList.getTime())) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        mo17915j0();
    }

    @Override // p130f8.InterfaceC4280g
    /* renamed from: I2 */
    public void mo17913I2(String str) {
        if (AbstractC6567a.m25634d(str)) {
            return;
        }
        Observable just = Observable.just(str);
        final n nVar = n.f19719a;
        Observable map = just.map(new Function() { // from class: h8.v2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ArrayList m19069M0;
                m19069M0 = C4575b3.m19069M0(InterfaceC5660l.this, obj);
                return m19069M0;
            }
        });
        final o oVar = new o();
        Observable compose = map.map(new Function() { // from class: h8.w2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ArrayList m19072P0;
                m19072P0 = C4575b3.m19072P0(InterfaceC5660l.this, obj);
                return m19072P0;
            }
        }).compose(AbstractC7029f.m27121b());
        final p pVar = new p();
        Consumer consumer = new Consumer() { // from class: h8.x2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4575b3.m19074R0(InterfaceC5660l.this, obj);
            }
        };
        final q qVar = q.f19722a;
        compose.subscribe(consumer, new Consumer() { // from class: h8.y2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4575b3.m19075S0(InterfaceC5660l.this, obj);
            }
        });
    }

    @Override // p130f8.InterfaceC4280g
    /* renamed from: R1 */
    public void mo17914R1(String str) {
        if (AbstractC6567a.m25634d(str)) {
            return;
        }
        AbstractC5868k.m23671c(str);
        Observable just = Observable.just(str);
        final d dVar = d.f19708a;
        Observable compose = just.map(new Function() { // from class: h8.p2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Boolean m19088g0;
                m19088g0 = C4575b3.m19088g0(InterfaceC5660l.this, obj);
                return m19088g0;
            }
        }).compose(AbstractC7029f.m27121b());
        final e eVar = new e();
        Consumer consumer = new Consumer() { // from class: h8.q2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4575b3.m19089h0(InterfaceC5660l.this, obj);
            }
        };
        final f fVar = f.f19710a;
        compose.subscribe(consumer, new Consumer() { // from class: h8.s2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4575b3.m19091i0(InterfaceC5660l.this, obj);
            }
        });
    }

    @Override // p130f8.InterfaceC4280g
    /* renamed from: j0 */
    public void mo17915j0() {
        Observable just = Observable.just(Long.valueOf(System.currentTimeMillis()));
        final k kVar = k.f19716a;
        Observable compose = just.map(new Function() { // from class: h8.z2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ArrayList m19061A0;
                m19061A0 = C4575b3.m19061A0(InterfaceC5660l.this, obj);
                return m19061A0;
            }
        }).compose(AbstractC7029f.m27121b());
        final l lVar = new l();
        Consumer consumer = new Consumer() { // from class: h8.a3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4575b3.m19063C0(InterfaceC5660l.this, obj);
            }
        };
        final m mVar = m.f19718a;
        compose.subscribe(consumer, new Consumer() { // from class: h8.h2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4575b3.m19066E0(InterfaceC5660l.this, obj);
            }
        });
    }

    @Override // p130f8.InterfaceC4280g
    /* renamed from: k3 */
    public void mo17916k3() {
        Observable fromIterable = Observable.fromIterable(this.f19704d);
        final a aVar = a.f19705a;
        Observable compose = fromIterable.map(new Function() { // from class: h8.g2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ReservationList m19079W;
                m19079W = C4575b3.m19079W(InterfaceC5660l.this, obj);
                return m19079W;
            }
        }).compose(AbstractC7029f.m27121b());
        final b bVar = new b();
        Consumer consumer = new Consumer() { // from class: h8.r2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4575b3.m19083a0(InterfaceC5660l.this, obj);
            }
        };
        final c cVar = c.f19707a;
        compose.subscribe(consumer, new Consumer() { // from class: h8.t2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4575b3.m19085d0(InterfaceC5660l.this, obj);
            }
        }, new Action() { // from class: h8.u2
            @Override // io.reactivex.functions.Action
            public final void run() {
                C4575b3.m19087f0(C4575b3.this);
            }
        });
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    @Override // p130f8.InterfaceC4280g
    /* renamed from: s3 */
    public void mo17917s3(ReservationList reservationList) {
        if (reservationList == null) {
            return;
        }
        if (reservationList.isPlaying()) {
            if (!C1407f.m6469G(C1407f.f5458a, reservationList.getChannelCode(), false, 2, null)) {
                m19076T0(reservationList);
                return;
            }
            return;
        }
        Observable just = Observable.just(reservationList);
        final g gVar = new g(reservationList);
        Observable map = just.map(new Function() { // from class: h8.i2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ReservationList m19096n0;
                m19096n0 = C4575b3.m19096n0(InterfaceC5660l.this, obj);
                return m19096n0;
            }
        });
        final h hVar = new h(reservationList);
        Observable compose = map.map(new Function() { // from class: h8.j2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ReservationList m19098p0;
                m19098p0 = C4575b3.m19098p0(InterfaceC5660l.this, obj);
                return m19098p0;
            }
        }).compose(AbstractC7029f.m27121b());
        final i iVar = new i();
        Consumer consumer = new Consumer() { // from class: h8.k2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4575b3.m19100r0(InterfaceC5660l.this, obj);
            }
        };
        final j jVar = j.f19715a;
        compose.subscribe(consumer, new Consumer() { // from class: h8.l2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4575b3.m19094m0(InterfaceC5660l.this, obj);
            }
        });
    }

    /* renamed from: v0 */
    public final AbstractC1196d m19106v0() {
        return this.f19701a;
    }

    /* renamed from: x0 */
    public final InterfaceC4281h m19107x0() {
        return this.f19702b;
    }
}
