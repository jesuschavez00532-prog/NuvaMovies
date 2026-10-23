package ac;

import cc.C1466m0;
import com.request.converterFactory.bean.ResultException;
import com.request.result.HearBeatResultData;
import com.request.result.HeartBeatResult;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.concurrent.TimeUnit;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p030bc.C1224f;
import p185j2.C4982a;
import p287pb.AbstractApplicationC6253c;
import p301qb.InterfaceC6432v0;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;

/* renamed from: ac.f1 */
/* loaded from: classes2.dex */
public final class C0152f1 extends AbstractC0166j {

    /* renamed from: b */
    private final String f436b;

    /* renamed from: c */
    private long f437c;

    /* renamed from: d */
    private Disposable f438d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ac.f1$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ boolean f439a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10) {
            super(1);
            this.f439a = z10;
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo542f(Long l10) {
            boolean z10 = false;
            AbstractC5868k.m23674f(l10, "it");
            if (l10.longValue() == 0 && this.f439a) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ac.f1$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        public static final b f440a = new b();

        b() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ObservableSource mo542f(Long l10) {
            AbstractC5868k.m23674f(l10, "it");
            return C1224f.f4816e.m5631a().m5596j0();
        }
    }

    /* renamed from: ac.f1$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC6929a {
        c() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(HeartBeatResult heartBeatResult) {
            boolean z10 = false;
            String userToken = null;
            AbstractC5868k.m23674f(heartBeatResult, "t");
            super.onNext(heartBeatResult);
            C1466m0 c1466m0 = C1466m0.f5627a;
            int i10 = 0;
            c1466m0.m6849V(false);
            HearBeatResultData data = heartBeatResult.getData();
            if (data != null && (userToken = data.getUserToken()) != null && !AbstractC6567a.m25634d(userToken)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                HearBeatResultData data2 = heartBeatResult.getData();
                AbstractC5868k.m23671c(data2);
                String userToken2 = data2.getUserToken();
                AbstractC5868k.m23671c(userToken2);
                c1466m0.m6852Y(userToken2);
                HearBeatResultData data3 = heartBeatResult.getData();
                if (data3 != null) {
                    i10 = data3.getAvailableTime();
                }
                if (i10 > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    AbstractC5868k.m23671c(heartBeatResult.getData());
                    c1466m0.m6853Z(currentTimeMillis + (r6.getAvailableTime() * 1000));
                }
            }
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            if (AbstractC6570d.m25646c(th)) {
                String returnCode = ((ResultException) th).getReturnCode();
                InterfaceC6432v0 interfaceC6432v0 = (InterfaceC6432v0) C0152f1.this.m618a();
                AbstractC5868k.m23673e(returnCode, "errCode");
                interfaceC6432v0.mo11978c(returnCode);
                int hashCode = returnCode.hashCode();
                if (hashCode != -338366851) {
                    if (hashCode != -338366693) {
                        switch (hashCode) {
                            case -338366875:
                                if (!returnCode.equals("aaa100027")) {
                                    return;
                                }
                                break;
                            case -338366874:
                                if (!returnCode.equals("aaa100028")) {
                                    return;
                                }
                                break;
                            case -338366873:
                                if (!returnCode.equals("aaa100029")) {
                                    return;
                                }
                                break;
                            default:
                                return;
                        }
                    } else if (!returnCode.equals("aaa100083")) {
                        return;
                    }
                } else if (!returnCode.equals("aaa100030")) {
                    return;
                }
                C1466m0.f5627a.m6849V(true);
                Disposable m26922a = m26922a();
                if (m26922a != null) {
                    m26922a.dispose();
                    return;
                }
                return;
            }
            ((InterfaceC6432v0) C0152f1.this.m618a()).mo11978c("");
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            AbstractC5868k.m23674f(disposable, "d");
            super.onSubscribe(disposable);
            C0152f1.this.f438d = m26922a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0152f1(InterfaceC6432v0 interfaceC6432v0) {
        super(interfaceC6432v0);
        AbstractC5868k.m23674f(interfaceC6432v0, "view");
        this.f436b = C0152f1.class.getSimpleName();
        this.f437c = 7200L;
    }

    /* renamed from: f */
    public static /* synthetic */ void m579f(C0152f1 c0152f1, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        c0152f1.m582e(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final boolean m580g(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return ((Boolean) interfaceC5660l.mo542f(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final ObservableSource m581h(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        return (ObservableSource) interfaceC5660l.mo542f(obj);
    }

    /* renamed from: e */
    public final void m582e(boolean z10) {
        long j10;
        Disposable disposable = this.f438d;
        if (disposable != null) {
            disposable.dispose();
        }
        int intValue = ((Number) C4982a.f20721a.m20333a(AbstractApplicationC6253c.f24484b.m24887a(), "heartbeat_cache_time", 0)).intValue();
        if (intValue != 0) {
            this.f437c = intValue * 60;
        }
        if (z10) {
            j10 = 0;
        } else {
            j10 = this.f437c;
        }
        Observable<Long> interval = Observable.interval(j10, this.f437c, TimeUnit.SECONDS);
        final a aVar = new a(z10);
        Observable<Long> takeUntil = interval.takeUntil(new Predicate() { // from class: ac.d1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean m580g;
                m580g = C0152f1.m580g(InterfaceC5660l.this, obj);
                return m580g;
            }
        });
        final b bVar = b.f440a;
        takeUntil.flatMap(new Function() { // from class: ac.e1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource m581h;
                m581h = C0152f1.m581h(InterfaceC5660l.this, obj);
                return m581h;
            }
        }).subscribe(new c());
    }
}
