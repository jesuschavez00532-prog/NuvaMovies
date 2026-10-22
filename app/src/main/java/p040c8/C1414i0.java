package p040c8;

import be.C1328x;
import com.live.p063db.ReservationList;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p201k2.AbstractC5086c;
import p317rb.AbstractC6567a;
import p348u2.AbstractC7029f;

/* renamed from: c8.i0 */
/* loaded from: classes2.dex */
public final class C1414i0 {

    /* renamed from: a */
    public static final C1414i0 f5493a;

    /* renamed from: b */
    private static final String f5494b;

    /* renamed from: c */
    private static InterfaceC1404d0 f5495c;

    /* renamed from: d */
    private static Disposable f5496d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c8.i0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final a f5497a = new a();

        a() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ObservableSource mo542f(ArrayList arrayList) {
            AbstractC5868k.m23674f(arrayList, "it");
            if (AbstractC6567a.m25635e(arrayList)) {
                return Observable.just(new ArrayList());
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(arrayList.get(0));
            long longValue = (AbstractC5086c.m20625r(((ReservationList) arrayList.get(0)).getDate() + ' ' + ((ReservationList) arrayList.get(0)).getStartTime(), "yyyy-MM-dd HH:mm").longValue() - System.currentTimeMillis()) / 1000;
            if (longValue <= 0) {
                longValue = 0;
            }
            return Observable.just(arrayList2).delay(longValue, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c8.i0$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final b f5498a = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m6557a(ArrayList arrayList) {
            if (AbstractC6567a.m25635e(arrayList)) {
                return;
            }
            ((ReservationList) arrayList.get(0)).setNotified(1);
            C1427v c1427v = C1427v.f5519a;
            Object obj = arrayList.get(0);
            AbstractC5868k.m23673e(obj, "it[0]");
            c1427v.m6620D0((ReservationList) obj);
            InterfaceC1404d0 interfaceC1404d0 = C1414i0.f5495c;
            if (interfaceC1404d0 != null) {
                Object obj2 = arrayList.get(0);
                AbstractC5868k.m23673e(obj2, "it[0]");
                interfaceC1404d0.mo6468a((ReservationList) obj2);
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m6557a((ArrayList) obj);
            return C1328x.f4998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c8.i0$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final c f5499a = new c();

        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m6558a(Throwable th) {
            th.printStackTrace();
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m6558a((Throwable) obj);
            return C1328x.f4998a;
        }
    }

    static {
        C1414i0 c1414i0 = new C1414i0();
        f5493a = c1414i0;
        f5494b = c1414i0.getClass().getSimpleName();
    }

    private C1414i0() {
    }

    /* renamed from: g */
    private final void m6548g() {
        Disposable disposable = f5496d;
        if (disposable != null) {
            AbstractC6567a.m25632b(disposable);
        }
        f5496d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m6549j(ObservableEmitter observableEmitter) {
        AbstractC5868k.m23674f(observableEmitter, "it");
        observableEmitter.onNext(C1427v.f5519a.m6643c0());
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final ObservableSource m6550k(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ObservableSource) interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m6551l(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m6552m(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: f */
    public final void m6553f() {
        f5495c = null;
    }

    /* renamed from: h */
    public final void m6554h(InterfaceC1404d0 interfaceC1404d0) {
        AbstractC5868k.m23674f(interfaceC1404d0, "callback");
        f5495c = interfaceC1404d0;
        if (C1407f.f5458a.m6481B()) {
            m6555i();
        }
    }

    /* renamed from: i */
    public final void m6555i() {
        m6548g();
        Observable create = Observable.create(new ObservableOnSubscribe() { // from class: c8.e0
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C1414i0.m6549j(observableEmitter);
            }
        });
        final a aVar = a.f5497a;
        Observable compose = create.flatMap(new Function() { // from class: c8.f0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource m6550k;
                m6550k = C1414i0.m6550k(InterfaceC5660l.this, obj);
                return m6550k;
            }
        }).compose(AbstractC7029f.m27121b());
        final b bVar = b.f5498a;
        Consumer consumer = new Consumer() { // from class: c8.g0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C1414i0.m6551l(InterfaceC5660l.this, obj);
            }
        };
        final c cVar = c.f5499a;
        f5496d = compose.subscribe(consumer, new Consumer() { // from class: c8.h0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C1414i0.m6552m(InterfaceC5660l.this, obj);
            }
        });
    }
}
