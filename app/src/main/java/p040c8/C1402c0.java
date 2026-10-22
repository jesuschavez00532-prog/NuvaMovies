package p040c8;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import be.C1328x;
import com.live.p063db.LiveReserveDao;
import com.live.p063db.ReserveChannel;
import com.live.p063db.ReserveMatch;
import com.live.p063db.ReserveTeam;
import com.request.result.Match;
import com.request.result.MatchChannel;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p201k2.AbstractC5086c;
import p207k8.C5135c;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7029f;

/* renamed from: c8.c0 */
/* loaded from: classes2.dex */
public final class C1402c0 {

    /* renamed from: a */
    public static final C1402c0 f5445a;

    /* renamed from: b */
    private static final String f5446b;

    /* renamed from: c */
    private static boolean f5447c;

    /* renamed from: d */
    private static Activity f5448d;

    /* renamed from: e */
    private static Disposable f5449e;

    /* renamed from: f */
    private static LinkedList f5450f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c8.c0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final a f5451a = new a();

        a() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ObservableSource mo542f(ReserveMatch reserveMatch) {
            AbstractC5868k.m23674f(reserveMatch, "it");
            long longValue = ((AbstractC5086c.m20625r(reserveMatch.getGameTime(), "yyyy-MM-dd HH:mm").longValue() - System.currentTimeMillis()) - 600000) / 1000;
            if (longValue <= 0) {
                longValue = 0;
            }
            return Observable.just(reserveMatch).delay(longValue, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c8.c0$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final b f5452a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m6466a(ReserveMatch reserveMatch) {
            Activity activity = C1402c0.f5448d;
            if (activity != null) {
                C5135c.a aVar = C5135c.f21073F0;
                AbstractC5868k.m23673e(reserveMatch, "reserveMatch");
                aVar.m20771a(activity, reserveMatch);
            }
            C1402c0 c1402c0 = C1402c0.f5445a;
            c1402c0.m6461s(reserveMatch.getGameId());
            c1402c0.m6452m();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m6466a((ReserveMatch) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c8.c0$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f5453a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m6467a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m6467a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: c8.c0$d */
    /* loaded from: classes2.dex */
    public static final class d implements Application.ActivityLifecycleCallbacks {
        d() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC5868k.m23674f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            AbstractC5868k.m23674f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC5868k.m23674f(activity, "activity");
            C1402c0.f5445a.m6450j();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC5868k.m23674f(activity, "activity");
            C1402c0.f5448d = activity;
            C1402c0.f5445a.m6452m();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            AbstractC5868k.m23674f(activity, "activity");
            AbstractC5868k.m23674f(bundle, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC5868k.m23674f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC5868k.m23674f(activity, "activity");
        }
    }

    static {
        C1402c0 c1402c0 = new C1402c0();
        f5445a = c1402c0;
        f5446b = c1402c0.getClass().getSimpleName();
        f5447c = true;
        f5450f = new LinkedList();
    }

    private C1402c0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final void m6450j() {
        Disposable disposable = f5449e;
        boolean z10 = false;
        if (disposable != null && !disposable.isDisposed()) {
            z10 = true;
        }
        if (z10) {
            Disposable disposable2 = f5449e;
            if (disposable2 != null) {
                disposable2.dispose();
            }
            f5449e = null;
        }
    }

    /* renamed from: k */
    private final void m6451k() {
        if (!f5447c) {
            return;
        }
        LiveReserveDao.INSTANCE.deleteReserveMatchByPastTime(AbstractC5086c.m20616i("yyyy-MM-dd HH:mm"));
        f5447c = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final void m6452m() {
        m6450j();
        Observable create = Observable.create(new ObservableOnSubscribe() { // from class: c8.x
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C1402c0.m6453n(observableEmitter);
            }
        });
        final a aVar = a.f5451a;
        Observable compose = create.flatMap(new Function() { // from class: c8.y
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource m6454o;
                m6454o = C1402c0.m6454o(InterfaceC5660l.this, obj);
                return m6454o;
            }
        }).compose(AbstractC7029f.m27121b());
        final b bVar = b.f5452a;
        Consumer consumer = new Consumer() { // from class: c8.z
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C1402c0.m6455p(InterfaceC5660l.this, obj);
            }
        };
        final c cVar = c.f5453a;
        f5449e = compose.subscribe(consumer, new Consumer() { // from class: c8.a0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C1402c0.m6456q(InterfaceC5660l.this, obj);
            }
        }, new Action() { // from class: c8.b0
            @Override // io.reactivex.functions.Action
            public final void run() {
                C1402c0.m6457r();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m6453n(ObservableEmitter observableEmitter) {
        AbstractC5868k.m23674f(observableEmitter, "emitter");
        f5445a.m6451k();
        List<ReserveMatch> queryReserveMatchRecently = LiveReserveDao.INSTANCE.queryReserveMatchRecently(AbstractC5086c.m20616i("yyyy-MM-dd HH:mm"));
        if (AbstractC6567a.m25638h(queryReserveMatchRecently)) {
            Iterator<ReserveMatch> it = queryReserveMatchRecently.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ReserveMatch next = it.next();
                if (!f5450f.contains(next.getGameId())) {
                    observableEmitter.onNext(next);
                    break;
                }
            }
        }
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final ObservableSource m6454o(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ObservableSource) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m6455p(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m6456q(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m6457r() {
    }

    /* renamed from: v */
    private final ReserveMatch m6458v(Match match) {
        ReserveMatch reserveMatch = new ReserveMatch();
        reserveMatch.setGameId(match.getGameId());
        reserveMatch.setGameTime(match.getGameTime());
        reserveMatch.setMatchId(match.getMatchId());
        reserveMatch.setMatchName(match.getMatchName());
        reserveMatch.setMatchAlias(match.getMatchAlias());
        ReserveTeam reserveTeam = new ReserveTeam();
        reserveTeam.setGid(match.getGameId());
        reserveTeam.setTeamId(match.getTeam_b().getTeamId());
        reserveTeam.setName(match.getTeam_b().getTeamName());
        reserveTeam.setAlias(match.getTeam_b().getTeamAlias());
        String teamLogo = match.getTeam_b().getTeamLogo();
        String str = "";
        if (teamLogo == null) {
            teamLogo = "";
        }
        reserveTeam.setLogo(teamLogo);
        reserveMatch.setHomeTeam(reserveTeam);
        ReserveTeam reserveTeam2 = new ReserveTeam();
        reserveTeam2.setGid(match.getGameId());
        reserveTeam2.setTeamId(match.getTeam_a().getTeamId());
        reserveTeam2.setName(match.getTeam_a().getTeamName());
        reserveTeam2.setAlias(match.getTeam_a().getTeamAlias());
        String teamLogo2 = match.getTeam_a().getTeamLogo();
        if (teamLogo2 != null) {
            str = teamLogo2;
        }
        reserveTeam2.setLogo(str);
        reserveMatch.setVisitTeam(reserveTeam2);
        ArrayList<ReserveChannel> arrayList = new ArrayList<>();
        ArrayList<MatchChannel> channelInfoList = match.getChannelInfoList();
        if (channelInfoList != null) {
            for (MatchChannel matchChannel : channelInfoList) {
                ReserveChannel reserveChannel = new ReserveChannel();
                reserveChannel.setGid(match.getGameId());
                reserveChannel.setCode(matchChannel.getChannelCode());
                reserveChannel.setName(matchChannel.getChannelName());
                arrayList.add(reserveChannel);
            }
        }
        reserveMatch.setChannels(arrayList);
        return reserveMatch;
    }

    /* renamed from: w */
    private final void m6459w(boolean z10, String str) {
        f5450f.remove(str);
        m6452m();
    }

    /* renamed from: l */
    public final boolean m6460l(Match match) {
        AbstractC5868k.m23674f(match, "match");
        return LiveReserveDao.INSTANCE.findReserveMatch(match.getGameId());
    }

    /* renamed from: s */
    public final void m6461s(String str) {
        AbstractC5868k.m23674f(str, "gameId");
        f5450f.add(str);
    }

    /* renamed from: t */
    public final void m6462t(Activity activity) {
        AbstractC5868k.m23674f(activity, "activity");
        f5448d = activity;
        activity.getApplication().registerActivityLifecycleCallbacks(new d());
        m6452m();
    }

    /* renamed from: u */
    public final void m6463u(Match match) {
        AbstractC5868k.m23674f(match, "match");
        if (LiveReserveDao.INSTANCE.insertReserveMatch(m6458v(match))) {
            m6459w(true, match.getGameId());
        }
    }

    /* renamed from: x */
    public final void m6464x(Match match) {
        AbstractC5868k.m23674f(match, "match");
        if (LiveReserveDao.INSTANCE.deleteReserveMatch(match.getGameId())) {
            m6459w(false, match.getGameId());
        }
    }
}
