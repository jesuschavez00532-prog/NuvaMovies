package p147g8;

import ac.C0143d0;
import be.C1328x;
import ca.InterfaceC1439a;
import cc.C1464l0;
import com.live.bean.MatchDate;
import com.live.p064ui.activity.MatchScheduleActivity;
import com.lzy.okgo.model.Progress;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.request.result.Match;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import ne.C5878u;
import p040c8.C1402c0;
import p115e8.InterfaceC4155n;
import p135fd.C4307b;
import p201k2.AbstractC5086c;
import p301qb.InterfaceC6440y;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7029f;
import p359ue.AbstractC7166t;
import p359ue.AbstractC7167u;
import p430z9.AbstractActivityC7763a;

/* renamed from: g8.x0 */
/* loaded from: classes2.dex */
public final class C4402x0 implements InterfaceC1439a, InterfaceC6440y {

    /* renamed from: a */
    private AbstractActivityC7763a f19064a;

    /* renamed from: b */
    private InterfaceC4155n f19065b;

    /* renamed from: c */
    private final String f19066c;

    /* renamed from: d */
    private C0143d0 f19067d;

    /* renamed from: e */
    private boolean f19068e;

    /* renamed from: f */
    private Disposable f19069f;

    /* renamed from: g */
    private Disposable f19070g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.x0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final a f19071a = new a();

        a() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Match mo542f(Match match) {
            AbstractC5868k.m23674f(match, "it");
            match.setGameTime(C1464l0.f5622a.m6826e(match.getGameTime(), "yyyy-MM-dd HH:mm"));
            return match;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.x0$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ String f19072a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f19072a = str;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo542f(Match match) {
            String m27728o = null;
            CharSequence m27758b0;
            AbstractC5868k.m23674f(match, "it");
            String substring = match.getGameTime().substring(0, 10);
            AbstractC5868k.m23673e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            m27728o = AbstractC7166t.m27728o(substring, Operator.Operation.MINUS, "", false, 4, null);
            m27758b0 = AbstractC7167u.m27758b0(m27728o);
            return Boolean.valueOf(AbstractC5868k.m23669a(m27758b0.toString(), this.f19072a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.x0$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f19073a = new c();

        c() {
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
    /* renamed from: g8.x0$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ C5878u f19074a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C5878u c5878u) {
            super(1);
            this.f19074a = c5878u;
        }

        /* renamed from: a */
        public final void m18424a(Match match) {
            ((ArrayList) this.f19074a.f23412a).add(match);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m18424a((Match) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.x0$e */
    /* loaded from: classes2.dex */
    public static final class e extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final e f19075a = new e();

        e() {
            super(1);
        }

        /* renamed from: a */
        public final void m18425a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m18425a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.x0$f */
    /* loaded from: classes2.dex */
    public static final class f extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ String f19076a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str) {
            super(1);
            this.f19076a = str;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo542f(Match match) {
            AbstractC5868k.m23674f(match, "it");
            return Boolean.valueOf(AbstractC5868k.m23669a(match.getMatchId(), this.f19076a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.x0$g */
    /* loaded from: classes2.dex */
    public static final class g extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final g f19077a = new g();

        g() {
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
    /* renamed from: g8.x0$h */
    /* loaded from: classes2.dex */
    public static final class h extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ C5878u f19078a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C5878u c5878u) {
            super(1);
            this.f19078a = c5878u;
        }

        /* renamed from: a */
        public final void m18428a(Match match) {
            ((ArrayList) this.f19078a.f23412a).add(match);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m18428a((Match) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.x0$i */
    /* loaded from: classes2.dex */
    public static final class i extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final i f19079a = new i();

        i() {
            super(1);
        }

        /* renamed from: a */
        public final void m18429a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m18429a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.x0$j */
    /* loaded from: classes2.dex */
    public static final class j extends AbstractC5869l implements InterfaceC5660l {
        j() {
            super(1);
        }

        /* renamed from: a */
        public final void m18430a(ArrayList arrayList) {
            InterfaceC4155n m18419o5 = C4402x0.this.m18419o5();
            AbstractC5868k.m23673e(arrayList, "it");
            m18419o5.mo11571v3(arrayList);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m18430a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.x0$k */
    /* loaded from: classes2.dex */
    public static final class k extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final k f19081a = new k();

        k() {
            super(1);
        }

        /* renamed from: a */
        public final void m18431a(Throwable th) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m18431a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.x0$l */
    /* loaded from: classes2.dex */
    public static final class l extends AbstractC5869l implements InterfaceC5660l {
        l() {
            super(1);
        }

        /* renamed from: a */
        public final void m18432a(Integer num) {
            InterfaceC4155n m18419o5 = C4402x0.this.m18419o5();
            AbstractC5868k.m23673e(num, "it");
            m18419o5.mo11564Y1(num.intValue());
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m18432a((Integer) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.x0$m */
    /* loaded from: classes2.dex */
    public static final class m extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final m f19083a = new m();

        m() {
            super(1);
        }

        /* renamed from: a */
        public final void m18433a(Throwable th) {
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m18433a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.x0$n */
    /* loaded from: classes2.dex */
    public static final class n extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final n f19084a = new n();

        n() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList mo542f(ArrayList arrayList) {
            AbstractC5868k.m23674f(arrayList, "matchs");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Match match = (Match) it.next();
                C1402c0 c1402c0 = C1402c0.f5445a;
                AbstractC5868k.m23673e(match, "match");
                match.setSubscribed(c1402c0.m6460l(match));
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.x0$o */
    /* loaded from: classes2.dex */
    public static final class o extends AbstractC5869l implements InterfaceC5660l {
        o() {
            super(1);
        }

        /* renamed from: a */
        public final void m18435a(ArrayList arrayList) {
            C4402x0.this.m18419o5().mo11568l3();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m18435a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g8.x0$p */
    /* loaded from: classes2.dex */
    public static final class p extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final p f19086a = new p();

        p() {
            super(1);
        }

        /* renamed from: a */
        public final void m18436a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m18436a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    public C4402x0(AbstractActivityC7763a abstractActivityC7763a, InterfaceC4155n interfaceC4155n) {
        AbstractC5868k.m23674f(abstractActivityC7763a, "activity");
        AbstractC5868k.m23674f(interfaceC4155n, "view");
        this.f19064a = abstractActivityC7763a;
        this.f19065b = interfaceC4155n;
        this.f19066c = "MatchSchedulePresenter";
        this.f19067d = new C0143d0(this);
        this.f19068e = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C4 */
    public static final void m18371C4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D4 */
    public static final void m18372D4(C5878u c5878u, String str, C4402x0 c4402x0, String str2) {
        AbstractC5868k.m23674f(c5878u, "$filterMatchList");
        AbstractC5868k.m23674f(str, "$date");
        AbstractC5868k.m23674f(c4402x0, "this$0");
        AbstractC5868k.m23674f(str2, "$matchId");
        if (((ArrayList) c5878u.f23412a).isEmpty()) {
            MatchScheduleActivity.f10889N.m11573a().put(str, new ArrayList());
            c4402x0.f19065b.mo11563P1(str, str2);
        } else {
            c4402x0.m18376I4((ArrayList) c5878u.f23412a, str, str2);
            MatchScheduleActivity.f10889N.m11573a().put(str, c5878u.f23412a);
        }
    }

    /* renamed from: I4 */
    private final void m18376I4(ArrayList arrayList, final String str, final String str2) {
        Disposable disposable;
        Disposable disposable2 = this.f19069f;
        boolean z10 = false;
        if (disposable2 != null && disposable2.isDisposed()) {
            z10 = true;
        }
        if (z10 && (disposable = this.f19069f) != null) {
            disposable.dispose();
        }
        if (AbstractC5868k.m23669a(str2, "all")) {
            this.f19065b.mo11561H2(arrayList, str, str2);
            return;
        }
        final C5878u c5878u = new C5878u();
        c5878u.f23412a = new ArrayList();
        Observable fromIterable = Observable.fromIterable(arrayList);
        final f fVar = new f(str2);
        Observable filter = fromIterable.filter(new Predicate() { // from class: g8.j0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean m18378K4;
                m18378K4 = C4402x0.m18378K4(InterfaceC5660l.this, obj);
                return m18378K4;
            }
        });
        final g gVar = g.f19077a;
        Observable compose = filter.map(new Function() { // from class: g8.k0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Match m18379M4;
                m18379M4 = C4402x0.m18379M4(InterfaceC5660l.this, obj);
                return m18379M4;
            }
        }).compose(AbstractC7029f.m27120a());
        final h hVar = new h(c5878u);
        Consumer consumer = new Consumer() { // from class: g8.l0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4402x0.m18380N4(InterfaceC5660l.this, obj);
            }
        };
        final i iVar = i.f19079a;
        this.f19069f = compose.subscribe(consumer, new Consumer() { // from class: g8.m0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4402x0.m18382O4(InterfaceC5660l.this, obj);
            }
        }, new Action() { // from class: g8.n0
            @Override // io.reactivex.functions.Action
            public final void run() {
                C4402x0.m18384P4(C5878u.this, this, str, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K4 */
    public static final boolean m18378K4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return ((Boolean) interfaceC5660l.mo542f(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M4 */
    public static final Match m18379M4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Match) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N4 */
    public static final void m18380N4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O4 */
    public static final void m18382O4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P4 */
    public static final void m18384P4(C5878u c5878u, C4402x0 c4402x0, String str, String str2) {
        AbstractC5868k.m23674f(c5878u, "$filterMatchList");
        AbstractC5868k.m23674f(c4402x0, "this$0");
        AbstractC5868k.m23674f(str, "$date");
        AbstractC5868k.m23674f(str2, "$matchId");
        if (((ArrayList) c5878u.f23412a).isEmpty()) {
            c4402x0.f19065b.mo11563P1(str, str2);
        } else {
            c4402x0.f19065b.mo11561H2((ArrayList) c5878u.f23412a, str, str2);
        }
    }

    /* renamed from: Q4 */
    private final void m18386Q4() {
        Observable compose = Observable.create(new ObservableOnSubscribe() { // from class: g8.d0
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C4402x0.m18387S4(C4402x0.this, observableEmitter);
            }
        }).compose(AbstractC7029f.m27120a());
        final j jVar = new j();
        Consumer consumer = new Consumer() { // from class: g8.o0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4402x0.m18390X4(InterfaceC5660l.this, obj);
            }
        };
        final k kVar = k.f19081a;
        compose.subscribe(consumer, new Consumer() { // from class: g8.p0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4402x0.m18393Y4(InterfaceC5660l.this, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S4 */
    public static final void m18387S4(C4402x0 c4402x0, ObservableEmitter observableEmitter) {
        AbstractC5868k.m23674f(c4402x0, "this$0");
        AbstractC5868k.m23674f(observableEmitter, "it");
        observableEmitter.onNext(c4402x0.m18406r5());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X4 */
    public static final void m18390X4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y4 */
    public static final void m18393Y4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g5 */
    public static final void m18399g5(ArrayList arrayList, C5878u c5878u, int i10, ObservableEmitter observableEmitter) {
        AbstractC5868k.m23674f(arrayList, "$matchList");
        AbstractC5868k.m23674f(c5878u, "$currentTime");
        AbstractC5868k.m23674f(observableEmitter, "it");
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            String gameTime = ((Match) it.next()).getGameTime();
            Object obj = c5878u.f23412a;
            AbstractC5868k.m23673e(obj, "currentTime");
            if (gameTime.compareTo((String) obj) > 0) {
                observableEmitter.onNext(0);
            } else if (i10 < 0) {
                observableEmitter.onNext(0);
            } else {
                observableEmitter.onNext(Integer.valueOf(i10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i5 */
    public static final void m18401i5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k5 */
    public static final void m18403k5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: r5 */
    private final ArrayList m18406r5() {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        for (int i10 = -14; i10 < 16; i10++) {
            String format = simpleDateFormat.format(new Date((i10 * 24 * 3600000) + currentTimeMillis));
            AbstractC5868k.m23673e(format, "yearInfo");
            String substring = format.substring(5);
            AbstractC5868k.m23673e(substring, "this as java.lang.String).substring(startIndex)");
            arrayList.add(new MatchDate(substring, format));
        }
        return arrayList;
    }

    /* renamed from: s4 */
    private final void m18407s4(List list, final String str, final String str2) {
        final C5878u c5878u = new C5878u();
        c5878u.f23412a = new ArrayList();
        Observable fromIterable = Observable.fromIterable(list);
        final a aVar = a.f19071a;
        Observable map = fromIterable.map(new Function() { // from class: g8.q0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Match m18409u4;
                m18409u4 = C4402x0.m18409u4(InterfaceC5660l.this, obj);
                return m18409u4;
            }
        });
        final b bVar = new b(str);
        Observable filter = map.filter(new Predicate() { // from class: g8.r0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean m18410v4;
                m18410v4 = C4402x0.m18410v4(InterfaceC5660l.this, obj);
                return m18410v4;
            }
        });
        final c cVar = c.f19073a;
        Observable compose = filter.map(new Function() { // from class: g8.s0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Match m18411w4;
                m18411w4 = C4402x0.m18411w4(InterfaceC5660l.this, obj);
                return m18411w4;
            }
        }).compose(AbstractC7029f.m27120a());
        final d dVar = new d(c5878u);
        Consumer consumer = new Consumer() { // from class: g8.t0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4402x0.m18413x4(InterfaceC5660l.this, obj);
            }
        };
        final e eVar = e.f19075a;
        compose.subscribe(consumer, new Consumer() { // from class: g8.u0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4402x0.m18371C4(InterfaceC5660l.this, obj);
            }
        }, new Action() { // from class: g8.v0
            @Override // io.reactivex.functions.Action
            public final void run() {
                C4402x0.m18372D4(C5878u.this, str, this, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t5 */
    public static final ArrayList m18408t5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ArrayList) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u4 */
    public static final Match m18409u4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Match) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v4 */
    public static final boolean m18410v4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return ((Boolean) interfaceC5660l.mo542f(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w4 */
    public static final Match m18411w4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (Match) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w5 */
    public static final void m18412w5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x4 */
    public static final void m18413x4(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z5 */
    public static final void m18414z5(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: B0 */
    public void mo6701B0() {
        m18386Q4();
    }

    @Override // p301qb.InterfaceC6440y
    /* renamed from: G1 */
    public void mo18415G1(List list, String str, String str2) {
        AbstractC5868k.m23674f(list, "matchList");
        AbstractC5868k.m23674f(str, Progress.DATE);
        AbstractC5868k.m23674f(str2, "matchId");
        if (list.isEmpty()) {
            MatchScheduleActivity.f10889N.m11573a().put(str, new ArrayList());
            this.f19065b.mo11563P1(str, str2);
        } else {
            m18407s4(list, str, str2);
        }
    }

    @Override // p301qb.InterfaceC6433v1
    /* renamed from: N3 */
    public C4307b mo523N3() {
        return this.f19064a.m19900N3();
    }

    @Override // p301qb.InterfaceC6440y
    /* renamed from: a5 */
    public void mo18416a5(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "errCode");
        AbstractC5868k.m23674f(str2, Progress.DATE);
        AbstractC5868k.m23674f(str3, "matchId");
        if (MatchScheduleActivity.f10889N.m11573a().containsKey(str2)) {
            return;
        }
        this.f19065b.mo11562K0(str2, str3);
    }

    /* renamed from: b5 */
    public void m18417b5(MatchDate matchDate, String str) {
        String m27728o = null;
        CharSequence m27758b0;
        AbstractC5868k.m23674f(matchDate, "matchDate");
        AbstractC5868k.m23674f(str, "selectedMatchId");
        m27728o = AbstractC7166t.m27728o(matchDate.getYearInfo(), Operator.Operation.MINUS, "", false, 4, null);
        m27758b0 = AbstractC7167u.m27758b0(m27728o);
        String obj = m27758b0.toString();
        boolean z10 = false;
        if (AbstractC5086c.m20622o(matchDate.getYearInfo(), "yyyy-MM-dd") && this.f19068e) {
            this.f19067d.m548b("all", obj, str, null);
            this.f19068e = false;
            return;
        }
        MatchScheduleActivity.C2868a c2868a = MatchScheduleActivity.f10889N;
        if (!c2868a.m11573a().containsKey(obj)) {
            this.f19067d.m548b("all", obj, str, null);
            return;
        }
        Collection collection = (Collection) c2868a.m11573a().get(obj);
        if (collection == null || collection.isEmpty()) {
            z10 = true;
        }
        if (z10) {
            this.f19065b.mo11563P1(obj, str);
            return;
        }
        Object obj2 = c2868a.m11573a().get(obj);
        AbstractC5868k.m23671c(obj2);
        m18376I4((ArrayList) obj2, obj, str);
    }

    /* renamed from: e5 */
    public void m18418e5(final ArrayList arrayList, final int i10) {
        Disposable disposable;
        AbstractC5868k.m23674f(arrayList, "matchList");
        Disposable disposable2 = this.f19070g;
        boolean z10 = false;
        if (disposable2 != null && disposable2.isDisposed()) {
            z10 = true;
        }
        if (z10 && (disposable = this.f19070g) != null) {
            disposable.dispose();
        }
        final C5878u c5878u = new C5878u();
        c5878u.f23412a = AbstractC5086c.m20616i("yyyy-MM-dd HH:mm");
        Observable compose = Observable.create(new ObservableOnSubscribe() { // from class: g8.g0
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C4402x0.m18399g5(arrayList, c5878u, i10, observableEmitter);
            }
        }).compose(AbstractC7029f.m27120a());
        final l lVar = new l();
        Consumer consumer = new Consumer() { // from class: g8.h0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4402x0.m18401i5(InterfaceC5660l.this, obj);
            }
        };
        final m mVar = m.f19083a;
        this.f19070g = compose.subscribe(consumer, new Consumer() { // from class: g8.i0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4402x0.m18403k5(InterfaceC5660l.this, obj);
            }
        });
    }

    @Override // ca.InterfaceC1439a
    /* renamed from: n2 */
    public void mo6702n2() {
    }

    /* renamed from: o5 */
    public final InterfaceC4155n m18419o5() {
        return this.f19065b;
    }

    /* renamed from: s5 */
    public void m18420s5(ArrayList arrayList) {
        if (AbstractC6567a.m25635e(arrayList)) {
            return;
        }
        Observable just = Observable.just(arrayList);
        final n nVar = n.f19084a;
        Observable compose = just.map(new Function() { // from class: g8.w0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ArrayList m18408t5;
                m18408t5 = C4402x0.m18408t5(InterfaceC5660l.this, obj);
                return m18408t5;
            }
        }).compose(AbstractC7029f.m27121b());
        final o oVar = new o();
        Consumer consumer = new Consumer() { // from class: g8.e0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4402x0.m18412w5(InterfaceC5660l.this, obj);
            }
        };
        final p pVar = p.f19086a;
        compose.subscribe(consumer, new Consumer() { // from class: g8.f0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4402x0.m18414z5(InterfaceC5660l.this, obj);
            }
        });
    }
}
