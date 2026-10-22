package p030bc;

import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import ne.AbstractC5868k;
import p348u2.AbstractC7029f;

/* renamed from: bc.a2 */
/* loaded from: classes.dex */
public final class C1207a2 {

    /* renamed from: a */
    public static final C1207a2 f4775a = new C1207a2();

    private C1207a2() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* renamed from: d */
    private final ObservableTransformer m5505d(String str) {
        switch (str.hashCode()) {
            case -1160964220:
                if (str.equals("computation2main")) {
                    ObservableTransformer m27120a = AbstractC7029f.m27120a();
                    AbstractC5868k.m23673e(m27120a, "{\n                RxSche…tion2main()\n            }");
                    return m27120a;
                }
                ObservableTransformer m27123d = AbstractC7029f.m27123d();
                AbstractC5868k.m23673e(m27123d, "{\n                RxSche…r.nothing()\n            }");
                return m27123d;
            case -190711692:
                if (str.equals("observeOnMain")) {
                    ObservableTransformer m27125f = AbstractC7029f.m27125f();
                    AbstractC5868k.m23673e(m27125f, "{\n                RxSche…rveOnMain()\n            }");
                    return m27125f;
                }
                ObservableTransformer m27123d2 = AbstractC7029f.m27123d();
                AbstractC5868k.m23673e(m27123d2, "{\n                RxSche…r.nothing()\n            }");
                return m27123d2;
            case 82086110:
                if (str.equals("ioSchedulers")) {
                    ObservableTransformer m27122c = AbstractC7029f.m27122c();
                    AbstractC5868k.m23673e(m27122c, "{\n                RxSche…chedulers()\n            }");
                    return m27122c;
                }
                ObservableTransformer m27123d22 = AbstractC7029f.m27123d();
                AbstractC5868k.m23673e(m27123d22, "{\n                RxSche…r.nothing()\n            }");
                return m27123d22;
            case 124940961:
                if (str.equals("observeOnIo")) {
                    ObservableTransformer m27124e = AbstractC7029f.m27124e();
                    AbstractC5868k.m23673e(m27124e, "{\n                RxSche…serveOnIo()\n            }");
                    return m27124e;
                }
                ObservableTransformer m27123d222 = AbstractC7029f.m27123d();
                AbstractC5868k.m23673e(m27123d222, "{\n                RxSche…r.nothing()\n            }");
                return m27123d222;
            case 635692825:
                if (str.equals("syncIoSchedulers")) {
                    ObservableTransformer m27126g = AbstractC7029f.m27126g();
                    AbstractC5868k.m23673e(m27126g, "{\n                RxSche…chedulers()\n            }");
                    return m27126g;
                }
                ObservableTransformer m27123d2222 = AbstractC7029f.m27123d();
                AbstractC5868k.m23673e(m27123d2222, "{\n                RxSche…r.nothing()\n            }");
                return m27123d2222;
            case 1925961605:
                if (str.equals("io2main")) {
                    ObservableTransformer m27121b = AbstractC7029f.m27121b();
                    AbstractC5868k.m23673e(m27121b, "{\n                RxSche…r.io2main()\n            }");
                    return m27121b;
                }
                ObservableTransformer m27123d22222 = AbstractC7029f.m27123d();
                AbstractC5868k.m23673e(m27123d22222, "{\n                RxSche…r.nothing()\n            }");
                return m27123d22222;
            default:
                ObservableTransformer m27123d222222 = AbstractC7029f.m27123d();
                AbstractC5868k.m23673e(m27123d222222, "{\n                RxSche…r.nothing()\n            }");
                return m27123d222222;
        }
    }

    /* renamed from: a */
    public final Observable m5506a(Object obj, Function function) {
        AbstractC5868k.m23674f(function, "func");
        Observable flatMap = Observable.just(obj).flatMap(function);
        AbstractC5868k.m23673e(flatMap, "just(bean)\n                .flatMap(func)");
        return flatMap;
    }

    /* renamed from: b */
    public final Observable m5507b(Object obj, Function function, String str) {
        AbstractC5868k.m23674f(function, "func");
        AbstractC5868k.m23674f(str, "schedulerType");
        Observable compose = Observable.just(obj).flatMap(function).compose(m5505d(str));
        AbstractC5868k.m23673e(compose, "just(bean)\n            .…tSchedule(schedulerType))");
        return compose;
    }

    /* renamed from: c */
    public final Observable m5508c(Object obj, Function function) {
        AbstractC5868k.m23674f(function, "func");
        Observable compose = Observable.just(obj).flatMap(function).compose(AbstractC7029f.m27121b());
        AbstractC5868k.m23673e(compose, "just(bean)\n             …chedulerHelper.io2main())");
        return compose;
    }
}
