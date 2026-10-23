package p147g8;

import ac.C0143d0;
import ac.C0223y;
import be.AbstractC1314j;
import be.C1328x;
import be.InterfaceC1312h;
import cc.C1464l0;
import cc.C1466m0;
import com.live.bean.EpgDate;
import com.lzy.okgo.model.Progress;
import com.request.bean.EpgProgram;
import com.request.result.Channel;
import com.request.result.EpgData;
import com.request.result.Match;
import com.request.result.MatchChannel;
import com.request.result.Team;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import me.InterfaceC5642a;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p040c8.C1402c0;
import p040c8.C1407f;
import p040c8.C1427v;
import p043ce.AbstractC1500l;
import p115e8.InterfaceC4151j;
import p115e8.InterfaceC4152k;
import p135fd.C4307b;
import p201k2.AbstractC5086c;
import p223l8.C5435c2;
import p301qb.InterfaceC6431v;
import p301qb.InterfaceC6440y;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7029f;
import p359ue.AbstractC7167u;
import p400xa.C7589m1;
import p430z9.AbstractActivityC7763a;

/* renamed from: g8.y */
/* loaded from: classes2.dex */
public final class C4403y implements InterfaceC4151j, InterfaceC6440y, InterfaceC6431v {

    /* renamed from: a */
    private AbstractActivityC7763a f19087a;

    /* renamed from: b */
    private InterfaceC4152k f19088b;

    /* renamed from: c */
    private final String f19089c;

    /* renamed from: d */
    private final List f19090d;

    /* renamed from: e */
    private Match f19091e;

    /* renamed from: f */
    private C0143d0 f19092f;

    /* renamed from: g */
    private Disposable f19093g;

    /* renamed from: h */
    private final InterfaceC1312h f19094h;

    /* renamed from: g8.y$a */
    /* loaded from: classes2.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final a f19095a = new a();

        a() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo542f(Match match) {
            AbstractC5868k.m23674f(match, "it");
            if (match.isSubscribed()) {
                C1402c0.f5445a.m6464x(match);
                match.setSubscribed(false);
            } else {
                C1402c0 c1402c0 = C1402c0.f5445a;
                c1402c0.m6463u(match);
                match.setInFifteenMinutes(match.calcInFifteenMinutes());
                if (match.isInFifteenMinutes()) {
                    c1402c0.m6461s(match.getGameId());
                }
                match.setSubscribed(true);
            }
            return Boolean.valueOf(match.isSubscribed());
        }
    }

    /* renamed from: g8.y$b */
    /* loaded from: classes2.dex */
    static final class b extends AbstractC5869l implements InterfaceC5660l {
        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m18480a(Boolean bool) {
            boolean z10 = false;
            InterfaceC4152k m18477s4 = C4403y.this.m18477s4();
            AbstractC5868k.m23673e(bool, "it");
            m18477s4.mo11511V0(bool.booleanValue());
            InterfaceC4152k m18477s42 = C4403y.this.m18477s4();
            boolean booleanValue = bool.booleanValue();
            Match match = C4403y.this.f19091e;
            if (match != null) {
                z10 = match.isInFifteenMinutes();
            } else {
                z10 = false;
            }
            m18477s42.mo11512V2(booleanValue, z10);
            C7589m1.f27886a.m29127J(bool.booleanValue());
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m18480a((Boolean) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: g8.y$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f19097a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m18481a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m18481a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.y$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ Match f19099b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Match match) {
            super(1);
            this.f19099b = match;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4377l mo542f(C4377l c4377l) {
            AbstractC5868k.m23674f(c4377l, "it");
            C4403y.this.m18446N4(c4377l, this.f19099b);
            C4403y.this.m18444K4(c4377l, this.f19099b);
            return c4377l;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.y$e */
    /* loaded from: classes2.dex */
    public static final class e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ Match f19101b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Match match) {
            super(1);
            this.f19101b = match;
        }

        /* renamed from: a */
        public final void m18483a(C4377l c4377l) {
            C4403y.this.m18477s4().mo11518m1();
            InterfaceC4152k m18477s4 = C4403y.this.m18477s4();
            AbstractC5868k.m23673e(c4377l, "it");
            m18477s4.mo11513X2(c4377l);
            C4403y.this.m18477s4().mo11515Z0(c4377l, this.f19101b);
            C4403y.this.m18445M4(c4377l, this.f19101b);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m18483a((C4377l) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.y$f */
    /* loaded from: classes2.dex */
    public static final class f extends AbstractC5869l implements InterfaceC5660l {
        f() {
            super(1);
        }

        /* renamed from: a */
        public final void m18484a(Throwable th) {
            C4403y.this.m18477s4().mo11518m1();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m18484a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.y$g */
    /* loaded from: classes2.dex */
    public static final class g extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final g f19103a = new g();

        g() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo542f(List list) {
            AbstractC5868k.m23674f(list, "it");
            return C1427v.f5519a.m6653q(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.y$h */
    /* loaded from: classes2.dex */
    public static final class h extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final h f19104a = new h();

        h() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo542f(ArrayList arrayList) {
            AbstractC5868k.m23674f(arrayList, "it");
            C1427v.f5519a.m6657t0(arrayList);
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.y$i */
    /* loaded from: classes2.dex */
    public static final class i extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ String f19105a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str) {
            super(1);
            this.f19105a = str;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo542f(ArrayList arrayList) {
            AbstractC5868k.m23674f(arrayList, "it");
            C1427v.f5519a.m6641a0(arrayList, this.f19105a);
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.y$j */
    /* loaded from: classes2.dex */
    public static final class j extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: b */
        final /* synthetic */ String f19107b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str) {
            super(1);
            this.f19107b = str;
        }

        /* renamed from: a */
        public final void m18488a(ArrayList arrayList) {
            MatchChannel matchChannel;
            C1427v c1427v = C1427v.f5519a;
            String str = this.f19107b;
            AbstractC5868k.m23673e(arrayList, "it");
            c1427v.m6652p0(str, arrayList);
            Match match = C4403y.this.f19091e;
            if (match != null) {
                matchChannel = match.getFirstChannel();
            } else {
                matchChannel = null;
            }
            if (matchChannel != null) {
                C4403y c4403y = C4403y.this;
                Match match2 = c4403y.f19091e;
                AbstractC5868k.m23671c(match2);
                if (!c4403y.m18469q4(match2)) {
                    C4403y.this.m18477s4().mo11525y1();
                    C4403y.this.m18477s4().mo11517d3();
                }
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m18488a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.y$k */
    /* loaded from: classes2.dex */
    public static final class k extends AbstractC5869l implements InterfaceC5660l {
        k() {
            super(1);
        }

        /* renamed from: a */
        public final void m18489a(Throwable th) {
            C4403y.this.m18477s4().mo11525y1();
            C4403y.this.m18477s4().mo11517d3();
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m18489a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: g8.y$l */
    /* loaded from: classes2.dex */
    static final class l extends AbstractC5869l implements InterfaceC5642a {
        l() {
            super(0);
        }

        @Override // me.InterfaceC5642a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0223y invoke() {
            return new C0223y(C4403y.this);
        }
    }

    public C4403y(AbstractActivityC7763a abstractActivityC7763a, InterfaceC4152k interfaceC4152k) {
        List m6988g;
        InterfaceC1312h m5965b;
        AbstractC5868k.m23674f(abstractActivityC7763a, "activity");
        AbstractC5868k.m23674f(interfaceC4152k, "view");
        this.f19087a = abstractActivityC7763a;
        this.f19088b = interfaceC4152k;
        this.f19089c = C4403y.class.getSimpleName();
        m6988g = AbstractC1500l.m6988g("Brazilian Campeonato Paulista", "Brazilian Campeonato Gaucho", "Brazilian Campeonato Mineiro", "Copa Do Brasil");
        this.f19090d = m6988g;
        this.f19092f = new C0143d0(this);
        m5965b = AbstractC1314j.m5965b(new l());
        this.f19094h = m5965b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C4 */
    public static final C4377l m18437C4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (C4377l) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D4 */
    public static final void m18438D4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I4 */
    public static final void m18442I4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K4 */
    public final void m18444K4(C4377l c4377l, Match match) {
        boolean z10 = false;
        if (match.findFirstChannel() && match.compareToGameTime()) {
            z10 = true;
        } else {
            z10 = false;
        }
        c4377l.m18367s(z10);
        c4377l.m18368t(C1402c0.f5445a.m6460l(match));
        Match match2 = this.f19091e;
        if (match2 != null) {
            match2.setSubscribed(c4377l.m18359k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M4 */
    public final void m18445M4(C4377l c4377l, Match match) {
        if (C1466m0.f5627a.m6835H()) {
            this.f19088b.mo11519n3();
            return;
        }
        if (match.isGameEnd()) {
            m18448O4(match);
            return;
        }
        if (!match.findFirstChannel()) {
            if (this.f19090d.contains(match.getMatchName()) && match.isGameOnGoing()) {
                this.f19088b.mo11505E3();
                return;
            } else {
                this.f19088b.mo11522t3();
                return;
            }
        }
        if (match.isGameOnGoing()) {
            if (this.f19090d.contains(match.getMatchName())) {
                this.f19088b.mo11505E3();
                return;
            } else {
                m18476Q4(match);
                return;
            }
        }
        Long m20625r = AbstractC5086c.m20625r(match.getGameTime(), "yyyy-MM-dd HH:mm");
        if ((m20625r.longValue() - System.currentTimeMillis()) / 1000 < 60) {
            m18476Q4(match);
        } else {
            this.f19088b.mo11504B2(m20625r.longValue() / 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N4 */
    public final void m18446N4(C4377l c4377l, Match match) {
        Team team_a = match.getTeam_a();
        String teamLogo = team_a.getTeamLogo();
        String str = "";
        if (teamLogo == null) {
            teamLogo = "";
        }
        c4377l.m18369u(teamLogo);
        c4377l.m18370v(team_a.getTeamName());
        Team team_b = match.getTeam_b();
        String teamLogo2 = team_b.getTeamLogo();
        if (teamLogo2 == null) {
            teamLogo2 = "";
        }
        c4377l.m18362n(teamLogo2);
        c4377l.m18363o(team_b.getTeamName());
        String matchName = match.getMatchName();
        if (matchName != null) {
            str = matchName;
        }
        c4377l.m18365q(str);
        c4377l.m18361m(match.isGameOnGoing());
        c4377l.m18360l(match.isGameEnd());
        String gameTime = match.getGameTime();
        if (match.isGameEnd()) {
            c4377l.m18366r(match.getScore());
            StringBuilder sb2 = new StringBuilder();
            String substring = gameTime.substring(0, 4);
            AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(substring);
            sb2.append('/');
            String substring2 = gameTime.substring(5, 7);
            AbstractC5868k.m23673e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(substring2);
            sb2.append('/');
            String substring3 = gameTime.substring(8, 10);
            AbstractC5868k.m23673e(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(substring3);
            sb2.append(' ');
            String substring4 = gameTime.substring(11);
            AbstractC5868k.m23673e(substring4, "this as java.lang.String).substring(startIndex)");
            sb2.append(substring4);
            c4377l.m18364p(sb2.toString());
            return;
        }
        String substring5 = match.getGameTime().substring(11);
        AbstractC5868k.m23673e(substring5, "this as java.lang.String).substring(startIndex)");
        c4377l.m18366r(substring5);
        StringBuilder sb3 = new StringBuilder();
        String substring6 = gameTime.substring(0, 4);
        AbstractC5868k.m23673e(substring6, "this as java.lang.String…ing(startIndex, endIndex)");
        sb3.append(substring6);
        sb3.append('/');
        String substring7 = gameTime.substring(5, 7);
        AbstractC5868k.m23673e(substring7, "this as java.lang.String…ing(startIndex, endIndex)");
        sb3.append(substring7);
        sb3.append('/');
        String substring8 = gameTime.substring(8, 10);
        AbstractC5868k.m23673e(substring8, "this as java.lang.String…ing(startIndex, endIndex)");
        sb3.append(substring8);
        c4377l.m18364p(sb3.toString());
    }

    /* renamed from: O4 */
    private final void m18448O4(final Match match) {
        final MatchChannel firstChannel = match.getFirstChannel();
        if (AbstractC6567a.m25637g(match.getPlayBackUrl())) {
            this.f19088b.mo11524x3(match.getPlayBackUrl());
        } else if (firstChannel == null) {
            this.f19088b.mo11517d3();
        } else {
            this.f19088b.mo11507J3();
            Observable.fromCallable(new Callable() { // from class: g8.u
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String m18450P4 = null;
                    m18450P4 = C4403y.m18450P4(C4403y.this, match, firstChannel);
                    return m18450P4;
                }
            }).subscribeOn(Schedulers.m20294io()).subscribe();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P4 */
    public static final String m18450P4(C4403y c4403y, Match match, MatchChannel matchChannel) {
        AbstractC5868k.m23674f(c4403y, "this$0");
        AbstractC5868k.m23674f(match, "$match");
        if (!c4403y.m18469q4(match)) {
            c4403y.m18470r4().m784b(matchChannel.getChannelCode(), C1407f.f5458a.m6523o(), match.getGameId());
            return "";
        }
        return "";
    }

    /* renamed from: S4 */
    private final void m18452S4(List list, String str) {
        Disposable disposable;
        Disposable disposable2 = this.f19093g;
        boolean z10 = false;
        if (disposable2 != null && !disposable2.isDisposed()) {
            z10 = true;
        }
        if (z10 && (disposable = this.f19093g) != null) {
            disposable.dispose();
        }
        Observable just = Observable.just(list);
        final g gVar = g.f19103a;
        Observable map = just.map(new Function() { // from class: g8.v
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ArrayList m18460b5;
                m18460b5 = C4403y.m18460b5(InterfaceC5660l.this, obj);
                return m18460b5;
            }
        });
        final h hVar = h.f19104a;
        Observable map2 = map.map(new Function() { // from class: g8.w
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ArrayList m18464e5;
                m18464e5 = C4403y.m18464e5(InterfaceC5660l.this, obj);
                return m18464e5;
            }
        });
        final i iVar = new i(str);
        Observable subscribeOn = map2.map(new Function() { // from class: g8.x
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ArrayList m18466g5;
                m18466g5 = C4403y.m18466g5(InterfaceC5660l.this, obj);
                return m18466g5;
            }
        }).subscribeOn(Schedulers.m20294io());
        final j jVar = new j(str);
        Consumer consumer = new Consumer() { // from class: g8.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4403y.m18455X4(InterfaceC5660l.this, obj);
            }
        };
        final k kVar = new k();
        this.f19093g = subscribeOn.subscribe(consumer, new Consumer() { // from class: g8.o
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4403y.m18458Y4(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X4 */
    public static final void m18455X4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y4 */
    public static final void m18458Y4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b5 */
    public static final ArrayList m18460b5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ArrayList) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e5 */
    public static final ArrayList m18464e5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ArrayList) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g5 */
    public static final ArrayList m18466g5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ArrayList) interfaceC5660l.mo542f(obj);
    }

    /* renamed from: k4 */
    private final boolean m18468k4(ArrayList arrayList, MatchChannel matchChannel, String str) {
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                EpgProgram epgProgram = (EpgProgram) it.next();
                if (AbstractC5868k.m23669a(matchChannel.getEpgName(), epgProgram.getProgramName())) {
                    arrayList2.add(epgProgram);
                    z10 = true;
                } else if (z10) {
                    break;
                }
            }
            if (z10) {
                C1407f c1407f = C1407f.f5458a;
                List<Channel> m6515j = c1407f.m6515j(c1407f.m6523o());
                if (m6515j == null) {
                    return false;
                }
                for (Channel channel : m6515j) {
                    if (AbstractC5868k.m23669a(channel.getChannelCode(), matchChannel.getChannelCode())) {
                        C5435c2.a aVar = C5435c2.f22079P0;
                        aVar.m21862c(channel);
                        aVar.m21863d(arrayList2);
                        InterfaceC4152k.a.m17366a(this.f19088b, null, 1, null);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q4 */
    public final boolean m18469q4(Match match) {
        boolean z10 = false;
        String m20614g = null;
        List m27748R;
        MatchChannel firstChannel = match.getFirstChannel();
        if (firstChannel == null) {
            return false;
        }
        String gameId = match.getGameId();
        C1427v c1427v = C1427v.f5519a;
        ArrayList m6626L = c1427v.m6626L(firstChannel.getChannelCode());
        if (AbstractC6567a.m25635e(m6626L)) {
            return false;
        }
        if (match.getGameTime().length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            m27748R = AbstractC7167u.m27748R(match.getGameTime(), new String[]{" "}, false, 0, 6, null);
            m20614g = (String) m27748R.get(0);
        } else {
            m20614g = AbstractC5086c.m20614g("yyyy-MM-dd");
        }
        C1464l0 c1464l0 = C1464l0.f5622a;
        AbstractC5868k.m23673e(m20614g, "currDay");
        String m6825d = c1464l0.m6825d(m20614g, 1, "yyyy-MM-dd");
        if (!m18468k4(c1427v.m6629O(new EpgDate("", m20614g), m6626L), firstChannel, gameId) && !m18468k4(c1427v.m6629O(new EpgDate("", m6825d), m6626L), firstChannel, gameId)) {
            return false;
        }
        return true;
    }

    /* renamed from: r4 */
    private final C0223y m18470r4() {
        return (C0223y) this.f19094h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u4 */
    public static final Boolean m18471u4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Boolean) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v4 */
    public static final void m18472v4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w4 */
    public static final void m18473w4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: x4 */
    private final void m18474x4(Match match) {
        Observable just = Observable.just(new C4377l());
        final d dVar = new d(match);
        Observable map = just.map(new Function() { // from class: g8.r
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                C4377l m18437C4;
                m18437C4 = C4403y.m18437C4(InterfaceC5660l.this, obj);
                return m18437C4;
            }
        });
        final e eVar = new e(match);
        Consumer consumer = new Consumer() { // from class: g8.s
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4403y.m18438D4(InterfaceC5660l.this, obj);
            }
        };
        final f fVar = new f();
        map.subscribe(consumer, new Consumer() { // from class: g8.t
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4403y.m18442I4(InterfaceC5660l.this, obj);
            }
        });
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
    }

    @Override // p301qb.InterfaceC6440y
    /* renamed from: G1 */
    public void mo18415G1(List list, String str, String str2) {
        AbstractC5868k.m23674f(list, "matchList");
        AbstractC5868k.m23674f(str, Progress.DATE);
        AbstractC5868k.m23674f(str2, "matchId");
        if (AbstractC6567a.m25635e(list)) {
            this.f19088b.mo11518m1();
            this.f19088b.mo11509Q2();
        } else {
            Match match = (Match) list.get(0);
            this.f19091e = match;
            match.setGameTime(C1464l0.f5622a.m6826e(match.getGameTime(), "yyyy-MM-dd HH:mm"));
            m18474x4(match);
        }
    }

    @Override // p301qb.InterfaceC6431v
    /* renamed from: N1 */
    public void mo18475N1(EpgData epgData, String str) {
        if (epgData != null && !AbstractC6567a.m25635e(epgData.getProgramList())) {
            List<EpgProgram> programList = epgData.getProgramList();
            AbstractC5868k.m23671c(programList);
            String channelCode = epgData.getChannelCode();
            AbstractC5868k.m23671c(channelCode);
            m18452S4(programList, channelCode);
            return;
        }
        this.f19088b.mo11525y1();
        this.f19088b.mo11517d3();
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f19087a.m19900N3();
    }

    /* renamed from: Q4 */
    public final void m18476Q4(Match match) {
        MatchChannel matchChannel;
        if (match != null) {
            matchChannel = match.getFirstChannel();
        } else {
            matchChannel = null;
        }
        if (matchChannel != null && AbstractC6567a.m25637g(matchChannel.getChannelCode()) && AbstractC6567a.m25637g(matchChannel.getChannelName())) {
            this.f19088b.mo11521s2(matchChannel.getChannelCode());
        } else {
            this.f19088b.mo11522t3();
        }
    }

    @Override // p115e8.InterfaceC4151j
    /* renamed from: V0 */
    public void mo17363V0() {
        Match match = this.f19091e;
        if (match != null) {
            AbstractC5868k.m23671c(match);
            if (match.findFirstChannel()) {
                Match match2 = this.f19091e;
                AbstractC5868k.m23671c(match2);
                if (match2.compareToGameTime()) {
                    Match match3 = this.f19091e;
                    AbstractC5868k.m23671c(match3);
                    Observable just = Observable.just(match3);
                    final a aVar = a.f19095a;
                    Observable map = just.map(new Function() { // from class: g8.m
                        @Override // io.reactivex.functions.Function
                        public final Object apply(Object obj) {
                            Boolean m18471u4;
                            m18471u4 = C4403y.m18471u4(InterfaceC5660l.this, obj);
                            return m18471u4;
                        }
                    });
                    AbstractC5868k.m23673e(map, "just(mMatch!!)\n         …scribed\n                }");
                    Observable compose = AbstractC6567a.m25631a(map, this.f19087a.m19900N3()).compose(AbstractC7029f.m27121b());
                    final b bVar = new b();
                    Consumer consumer = new Consumer() { // from class: g8.p
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            C4403y.m18472v4(InterfaceC5660l.this, obj);
                        }
                    };
                    final c cVar = c.f19097a;
                    compose.subscribe(consumer, new Consumer() { // from class: g8.q
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            C4403y.m18473w4(InterfaceC5660l.this, obj);
                        }
                    });
                }
            }
        }
    }

    @Override // p115e8.InterfaceC4151j
    /* renamed from: V1 */
    public void mo17364V1() {
        this.f19088b.mo11516c();
        String stringExtra = this.f19087a.getIntent().getStringExtra("extra_game_id");
        String stringExtra2 = this.f19087a.getIntent().getStringExtra("extra_date");
        if (stringExtra2 != null) {
            this.f19092f.m548b("all", stringExtra2, "", stringExtra);
        }
    }

    @Override // p301qb.InterfaceC6440y
    /* renamed from: a5 */
    public void mo18416a5(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "errCode");
        AbstractC5868k.m23674f(str2, Progress.DATE);
        AbstractC5868k.m23674f(str3, "matchId");
        this.f19088b.mo11518m1();
        this.f19088b.mo11509Q2();
    }

    @Override // p115e8.InterfaceC4151j
    /* renamed from: i1 */
    public void mo17365i1() {
        m18476Q4(this.f19091e);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    /* renamed from: s4 */
    public final InterfaceC4152k m18477s4() {
        return this.f19088b;
    }

    @Override // p301qb.InterfaceC6431v
    /* renamed from: w2 */
    public void mo18478w2(String str, String str2) {
        AbstractC5868k.m23674f(str, "errCode");
        this.f19088b.mo11525y1();
        this.f19088b.mo11517d3();
    }
}
