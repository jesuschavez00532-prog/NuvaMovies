package p159h8;

import android.content.Context;
import androidx.fragment.app.AbstractActivityC0712e;
import be.C1328x;
import cc.C1456h0;
import cc.C1473s;
import com.live.bean.InfoBarBean;
import com.module.basemvp.AbstractActivityC2972a;
import com.request.result.Channel;
import com.request.result.LiveAddress;
import com.titan.ranger.bean.Media;
import com.titan.ranger.bean.Program;
import com.titans.entity.RangerPlayTag;
import com.umeng.analytics.pro.C3303ay;
import com.umeng.analytics.pro.C3309bd;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5874q;
import ne.C5876s;
import org.android.agoo.message.MessageService;
import p040c8.C1407f;
import p040c8.C1427v;
import p130f8.InterfaceC4288o;
import p130f8.InterfaceC4289p;
import p201k2.AbstractC5086c;
import p237m8.AbstractC5607a;
import p263o8.InterfaceC5940r;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7029f;
import p363v2.C7197a;
import p400xa.C7565e1;
import p400xa.C7594o0;
import p400xa.C7617x;
import p421z0.C7729c;
import p430z9.AbstractC7765c;

/* renamed from: h8.v3 */
/* loaded from: classes2.dex */
public final class C4695v3 implements InterfaceC4288o {

    /* renamed from: a */
    private AbstractC7765c f19985a;

    /* renamed from: b */
    private InterfaceC4289p f19986b;

    /* renamed from: c */
    private final String f19987c;

    /* renamed from: d */
    private Disposable f19988d;

    /* renamed from: e */
    private String f19989e;

    /* renamed from: f */
    private Channel f19990f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.v3$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ C5874q f19992b;

        /* renamed from: c */
        final /* synthetic */ Channel f19993c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C5874q c5874q, Channel channel) {
            super(1);
            this.f19992b = c5874q;
            this.f19993c = channel;
        }

        /* renamed from: a */
        public final void m19422a(ArrayList arrayList) {
            if (arrayList.isEmpty()) {
                if (this.f19992b.f23408a) {
                    C4695v3.this.m19420L().mo17946z(21);
                }
            } else {
                String channelCode = this.f19993c.getChannelCode();
                String value = RangerPlayTag.LIVE.getValue();
                String name = this.f19993c.getName();
                AbstractC5868k.m23673e(arrayList, "mediaList");
                C4695v3.this.m19420L().mo17944K(new Program(channelCode, value, name, "-1", "match", C3309bd.f14106m, arrayList, ((Media) arrayList.get(0)).getName(), 0L), this.f19993c.getChannelCode());
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19422a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.v3$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final b f19994a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m19423a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19423a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.v3$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ Channel f19995a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Channel channel) {
            super(1);
            this.f19995a = channel;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InfoBarBean mo542f(InfoBarBean infoBarBean) {
            AbstractC5868k.m23674f(infoBarBean, "it");
            String quality = this.f19995a.getQuality();
            String str = "HD";
            if (quality != null) {
                switch (quality.hashCode()) {
                    case 49:
                        quality.equals("1");
                        break;
                    case 50:
                        if (quality.equals("2")) {
                            str = "HD+";
                            break;
                        }
                        break;
                    case 51:
                        if (quality.equals("3")) {
                            str = "UHD";
                            break;
                        }
                        break;
                }
            }
            infoBarBean.setVideoQuality(str);
            return infoBarBean;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.v3$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ InfoBarBean f19996a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InfoBarBean infoBarBean) {
            super(1);
            this.f19996a = infoBarBean;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InfoBarBean mo542f(InfoBarBean infoBarBean) {
            AbstractC5868k.m23674f(infoBarBean, "it");
            infoBarBean.getInfoBarEpgs().clear();
            infoBarBean.getInfoBarEpgs().addAll(C1427v.f5519a.m6638Y(this.f19996a.getChannelCode()));
            return infoBarBean;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.v3$e */
    /* loaded from: classes2.dex */
    public static final class e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final e f19997a = new e();

        e() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InfoBarBean mo542f(InfoBarBean infoBarBean) {
            AbstractC5868k.m23674f(infoBarBean, "it");
            if (AbstractC6567a.m25635e(infoBarBean.getInfoBarEpgs())) {
                return infoBarBean;
            }
            long m20619l = AbstractC5086c.m20619l(infoBarBean.getInfoBarEpgs().get(0).getStartTime(), "yyyyMMddHHmmss");
            long m20619l2 = AbstractC5086c.m20619l(infoBarBean.getInfoBarEpgs().get(0).getEndTime(), "yyyyMMddHHmmss");
            long currentTimeMillis = System.currentTimeMillis();
            if (m20619l <= currentTimeMillis) {
                infoBarBean.setProcess((int) ((100 * (currentTimeMillis - m20619l)) / (m20619l2 - m20619l)));
            }
            return infoBarBean;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.v3$f */
    /* loaded from: classes2.dex */
    public static final class f extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5940r f19998a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC5940r interfaceC5940r) {
            super(1);
            this.f19998a = interfaceC5940r;
        }

        /* renamed from: a */
        public final void m19427a(InfoBarBean infoBarBean) {
            InterfaceC5940r interfaceC5940r = this.f19998a;
            if (interfaceC5940r != null) {
                AbstractC5868k.m23673e(infoBarBean, "it");
                interfaceC5940r.mo23994d(infoBarBean);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19427a((InfoBarBean) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.v3$g */
    /* loaded from: classes2.dex */
    public static final class g extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5940r f19999a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(InterfaceC5940r interfaceC5940r) {
            super(1);
            this.f19999a = interfaceC5940r;
        }

        /* renamed from: a */
        public final void m19428a(Throwable th) {
            InterfaceC5940r interfaceC5940r = this.f19999a;
            if (interfaceC5940r != null) {
                interfaceC5940r.mo23993b();
            }
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m19428a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h8.v3$h */
    /* loaded from: classes2.dex */
    public static final class h extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final h f20000a = new h();

        h() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo542f(Long l10) {
            AbstractC5868k.m23674f(l10, "it");
            return Boolean.valueOf(C1456h0.f5574a.m6779o());
        }
    }

    /* renamed from: h8.v3$i */
    /* loaded from: classes2.dex */
    public static final class i implements Observer {
        i() {
        }

        /* renamed from: a */
        public void m19430a(long j10) {
            Disposable disposable = C4695v3.this.f19988d;
            if (disposable != null) {
                disposable.dispose();
            }
            C4695v3.this.m19421w();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            C1473s.f5656a.m6918b(32600);
            C1456h0.f5574a.m6781q(true);
            C4695v3.this.m19421w();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
        }

        @Override // io.reactivex.Observer
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            m19430a(((Number) obj).longValue());
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            AbstractC5868k.m23674f(disposable, "d");
            C4695v3.this.f19988d = disposable;
        }
    }

    public C4695v3(AbstractC7765c abstractC7765c, InterfaceC4289p interfaceC4289p) {
        AbstractC5868k.m23674f(abstractC7765c, "fragment");
        AbstractC5868k.m23674f(interfaceC4289p, "view");
        this.f19985a = abstractC7765c;
        this.f19986b = interfaceC4289p;
        this.f19987c = C4695v3.class.getSimpleName();
        this.f19989e = "";
    }

    /* renamed from: A */
    private final Channel m19391A(String str) {
        C1407f c1407f = C1407f.f5458a;
        List<Channel> m6509g = c1407f.m6509g(c1407f.m6523o());
        if (AbstractC6567a.m25635e(m6509g)) {
            return null;
        }
        for (Channel channel : m6509g) {
            if (AbstractC5868k.m23669a(str, channel.getChannelCode())) {
                return channel;
            }
        }
        return null;
    }

    /* renamed from: C */
    private final void m19392C(final Channel channel) {
        boolean z10;
        C1456h0 c1456h0 = C1456h0.f5574a;
        C1456h0.a aVar = C1456h0.a.LIVE;
        List m6773i = c1456h0.m6773i(aVar);
        final List m6774j = c1456h0.m6774j(aVar);
        boolean z11 = false;
        int i10 = 1;
        if (m6773i != null && !m6773i.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && !AbstractC6567a.m25635e(channel.getLiveAddressList())) {
            if (m6774j == null || m6774j.isEmpty()) {
                z11 = true;
            }
            if (!z11) {
                final C5876s c5876s = new C5876s();
                String quality = channel.getQuality();
                if (quality != null) {
                    i10 = Integer.parseInt(quality);
                }
                c5876s.f23410a = i10;
                final C5874q c5874q = new C5874q();
                Observable create = Observable.create(new ObservableOnSubscribe() { // from class: h8.n3
                    @Override // io.reactivex.ObservableOnSubscribe
                    public final void subscribe(ObservableEmitter observableEmitter) {
                        C4695v3.m19394E(Channel.this, this, c5876s, c5874q, m6774j, observableEmitter);
                    }
                });
                AbstractC5868k.m23673e(create, "create<ArrayList<Media>>…Next(mediaList)\n        }");
                Observable compose = AbstractC6567a.m25631a(create, this.f19985a.m19902N3()).compose(AbstractC7029f.m27120a());
                final a aVar2 = new a(c5874q, channel);
                Consumer consumer = new Consumer() { // from class: h8.o3
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C4695v3.m19395I(InterfaceC5660l.this, obj);
                    }
                };
                final b bVar = b.f19994a;
                compose.subscribe(consumer, new Consumer() { // from class: h8.p3
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C4695v3.m19393D(InterfaceC5660l.this, obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public static final void m19393D(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public static final void m19394E(Channel channel, C4695v3 c4695v3, C5876s c5876s, C5874q c5874q, List list, ObservableEmitter observableEmitter) {
        int i10;
        String str;
        String str2;
        AbstractC5868k.m23674f(channel, "$playChannel");
        AbstractC5868k.m23674f(c4695v3, "this$0");
        AbstractC5868k.m23674f(c5876s, "$defaultQuality");
        AbstractC5868k.m23674f(c5874q, "$isHadTagEquals");
        AbstractC5868k.m23674f(list, "$cdnTagList");
        AbstractC5868k.m23674f(observableEmitter, "it");
        ArrayList arrayList = new ArrayList();
        List<LiveAddress> liveAddressList = channel.getLiveAddressList();
        if (liveAddressList != null) {
            for (LiveAddress liveAddress : liveAddressList) {
                int i11 = c5876s.f23410a;
                String quality = liveAddress.getQuality();
                int i12 = 1;
                if (quality != null) {
                    i10 = Integer.parseInt(quality);
                } else {
                    i10 = 1;
                }
                if (i11 == i10) {
                    if (!c5874q.f23408a && list.contains(liveAddress.getTag())) {
                        c5874q.f23408a = true;
                    }
                    if (AbstractC6567a.m25637g(liveAddress.getPlayCode()) && list.contains(liveAddress.getTag())) {
                        String quality2 = liveAddress.getQuality();
                        if (quality2 != null) {
                            i12 = Integer.parseInt(quality2);
                        }
                        String license = liveAddress.getLicense();
                        if (AbstractC6567a.m25637g(license)) {
                            String playCode = liveAddress.getPlayCode();
                            AbstractC5868k.m23671c(playCode);
                            String m28997b = C7565e1.f27773a.m28997b(i12);
                            String supportVideoType = channel.getSupportVideoType();
                            if (supportVideoType == null) {
                                str = "";
                            } else {
                                str = supportVideoType;
                            }
                            String aVFormat = liveAddress.getAVFormat();
                            if (aVFormat == null) {
                                str2 = "";
                            } else {
                                str2 = aVFormat;
                            }
                            arrayList.add(new Media(playCode, license, "", m28997b, str, str2));
                        }
                    }
                }
            }
        }
        observableEmitter.onNext(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static final void m19395I(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (r6 != false) goto L20;
     */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m19396N(com.request.result.Channel r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L46
            java.lang.String r1 = r6.getSupportVideoType()
            r2 = 1
            if (r1 == 0) goto L13
            int r1 = r1.length()
            if (r1 != 0) goto L11
            goto L13
        L11:
            r1 = 0
            goto L14
        L13:
            r1 = 1
        L14:
            if (r1 != 0) goto L1e
            java.lang.String r1 = r6.getSupportVideoType()
            ne.AbstractC5868k.m23671c(r1)
            goto L20
        L1e:
            java.lang.String r1 = ""
        L20:
            boolean r3 = p201k2.AbstractC5085b.m20604n()
            if (r3 == 0) goto L46
            fa.d r3 = p132fa.C4300d.f18678a
            java.lang.String r4 = r3.m18061u()
            boolean r1 = p359ue.AbstractC7157k.m27705j(r4, r1, r2)
            if (r1 != 0) goto L42
            java.lang.String r6 = r6.getName()
            java.lang.String r1 = r3.m18070y0()
            r3 = 2
            r4 = 0
            boolean r6 = p359ue.AbstractC7157k.m27713v(r6, r1, r0, r3, r4)
            if (r6 == 0) goto L46
        L42:
            r5.m19406f0()
            return r2
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p159h8.C4695v3.m19396N(com.request.result.Channel):boolean");
    }

    /* renamed from: O */
    private final void m19397O(InterfaceC5940r interfaceC5940r, InfoBarBean infoBarBean, Channel channel) {
        Observable just = Observable.just(infoBarBean);
        final c cVar = new c(channel);
        Observable map = just.map(new Function() { // from class: h8.q3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                InfoBarBean m19398R;
                m19398R = C4695v3.m19398R(InterfaceC5660l.this, obj);
                return m19398R;
            }
        });
        final d dVar = new d(infoBarBean);
        Observable map2 = map.map(new Function() { // from class: h8.r3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                InfoBarBean m19399V;
                m19399V = C4695v3.m19399V(InterfaceC5660l.this, obj);
                return m19399V;
            }
        });
        final e eVar = e.f19997a;
        Observable compose = map2.map(new Function() { // from class: h8.s3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                InfoBarBean m19400W;
                m19400W = C4695v3.m19400W(InterfaceC5660l.this, obj);
                return m19400W;
            }
        }).compose(AbstractC7029f.m27121b());
        final f fVar = new f(interfaceC5940r);
        Consumer consumer = new Consumer() { // from class: h8.t3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4695v3.m19402a0(InterfaceC5660l.this, obj);
            }
        };
        final g gVar = new g(interfaceC5940r);
        compose.subscribe(consumer, new Consumer() { // from class: h8.u3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4695v3.m19404d0(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public static final InfoBarBean m19398R(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (InfoBarBean) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public static final InfoBarBean m19399V(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (InfoBarBean) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public static final InfoBarBean m19400W(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (InfoBarBean) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public static final void m19402a0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public static final void m19404d0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: f0 */
    private final void m19406f0() {
        AbstractActivityC0712e m3075C6 = this.f19985a.m3075C6();
        AbstractC5868k.m23672d(m3075C6, "null cannot be cast to non-null type com.module.basemvp.BaseMVPActivity<*>");
        AbstractActivityC2972a.m11957W5((AbstractActivityC2972a) m3075C6, C3303ay.f14041a, false, null, null, null, null, null, 126, null);
    }

    /* renamed from: g0 */
    private final void m19407g0() {
        AbstractActivityC0712e m3075C6 = this.f19985a.m3075C6();
        boolean z10 = false;
        if (m3075C6 != null && !m3075C6.isFinishing()) {
            z10 = true;
        }
        if (z10) {
            int m6917a = C1473s.f5656a.m6917a();
            if (m6917a == 0) {
                m6917a = 20900;
            }
            this.f19986b.mo17946z(5);
            C7617x c7617x = C7617x.f28030a;
            Context m3107M8 = this.f19985a.m3107M8();
            AbstractC5868k.m23673e(m3107M8, "fragment.requireContext()");
            C7729c.f28423a.m29853g("", "", C7197a.f26917a.m27847d(), "match", "", c7617x.m29330d(m3107M8, 5), String.valueOf(m6917a), "/getSlbInfo");
        }
    }

    /* renamed from: h0 */
    private final void m19408h0() {
        m19419y();
        Observable<Long> intervalRange = Observable.intervalRange(0L, 45L, 0L, 2L, TimeUnit.SECONDS);
        final h hVar = h.f20000a;
        Observable<Long> filter = intervalRange.filter(new Predicate() { // from class: h8.m3
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean m19410i0;
                m19410i0 = C4695v3.m19410i0(InterfaceC5660l.this, obj);
                return m19410i0;
            }
        });
        AbstractC5868k.m23673e(filter, "intervalRange(0, 45, 0, …bFinish\n                }");
        AbstractC6567a.m25631a(filter, this.f19985a.m19902N3()).compose(AbstractC7029f.m27120a()).subscribe(new i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public static final boolean m19410i0(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return ((Boolean) interfaceC5660l.mo542f(obj)).booleanValue();
    }

    /* renamed from: m0 */
    private final void m19413m0() {
        Channel channel;
        Channel m19391A = m19391A(this.f19989e);
        this.f19990f = m19391A;
        if (!m19396N(m19391A) && (channel = this.f19990f) != null) {
            m19392C(channel);
        }
    }

    /* renamed from: y */
    private final void m19419y() {
        Disposable disposable;
        Disposable disposable2 = this.f19988d;
        boolean z10 = false;
        if (disposable2 != null && !disposable2.isDisposed()) {
            z10 = true;
        }
        if (z10 && (disposable = this.f19988d) != null) {
            disposable.dispose();
        }
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
    }

    @Override // p130f8.InterfaceC4288o
    /* renamed from: E1 */
    public void mo17941E1(String str) {
        AbstractC5868k.m23674f(str, "channelCode");
        this.f19989e = str;
        if (C1456h0.f5574a.m6779o()) {
            m19421w();
        } else {
            m19408h0();
        }
    }

    /* renamed from: L */
    public final InterfaceC4289p m19420L() {
        return this.f19986b;
    }

    @Override // p130f8.InterfaceC4288o
    /* renamed from: M */
    public Channel mo17942M() {
        return this.f19990f;
    }

    @Override // p130f8.InterfaceC4288o
    /* renamed from: f */
    public void mo17943f(InterfaceC5940r interfaceC5940r) {
        Channel channel = this.f19990f;
        if (channel == null) {
            if (interfaceC5940r != null) {
                interfaceC5940r.mo23993b();
            }
        } else {
            String m22776a = AbstractC5607a.m22776a(channel);
            if (m22776a == null) {
                m22776a = "";
            }
            m19397O(interfaceC5940r, new InfoBarBean(MessageService.MSG_DB_READY_REPORT, m22776a, channel.getChannelCode(), C7594o0.f27942a.m29220i(channel.getPosterList(), C7594o0.a.Icon), channel.isFav(), channel.isLock(), 0, null, null, null, channel.getSupportVideoType(), 960, null), channel);
        }
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
        m19419y();
    }

    /* renamed from: w */
    public final void m19421w() {
        if (C1456h0.f5574a.m6778n(C1456h0.a.LIVE)) {
            m19413m0();
            this.f19986b.mo17945s5();
        } else {
            m19407g0();
        }
    }
}
