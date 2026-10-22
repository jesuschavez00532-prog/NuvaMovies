package p213kf;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import retrofit2.CallAdapter;
import retrofit2.Response;
import retrofit2.Retrofit;

/* renamed from: kf.h */
/* loaded from: classes3.dex */
public final class C5260h extends CallAdapter.Factory {

    /* renamed from: a */
    private final Scheduler f21458a;

    /* renamed from: b */
    private final boolean f21459b;

    private C5260h(Scheduler scheduler, boolean z10) {
        this.f21458a = scheduler;
        this.f21459b = z10;
    }

    /* renamed from: d */
    public static C5260h m21165d() {
        return new C5260h(null, false);
    }

    /* renamed from: e */
    public static C5260h m21166e() {
        return new C5260h(null, true);
    }

    @Override // retrofit2.CallAdapter.Factory
    /* renamed from: a */
    public CallAdapter mo21167a(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        boolean z10;
        boolean z11;
        boolean z12;
        Type type2;
        boolean z13;
        boolean z14;
        String str;
        Class m25688c = CallAdapter.Factory.m25688c(type);
        if (m25688c == Completable.class) {
            return new C5259g(Void.class, this.f21458a, this.f21459b, false, true, false, false, false, true);
        }
        if (m25688c == Flowable.class) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (m25688c == Single.class) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m25688c == Maybe.class) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (m25688c != Observable.class && !z10 && !z11 && !z12) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (!z10) {
                if (!z11) {
                    if (z12) {
                        str = "Maybe";
                    } else {
                        str = "Observable";
                    }
                } else {
                    str = "Single";
                }
            } else {
                str = "Flowable";
            }
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type m25687b = CallAdapter.Factory.m25687b(0, (ParameterizedType) type);
        Class m25688c2 = CallAdapter.Factory.m25688c(m25687b);
        if (m25688c2 == Response.class) {
            if (m25687b instanceof ParameterizedType) {
                type2 = CallAdapter.Factory.m25687b(0, (ParameterizedType) m25687b);
                z13 = false;
            } else {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
        } else if (m25688c2 == C5257e.class) {
            if (m25687b instanceof ParameterizedType) {
                type2 = CallAdapter.Factory.m25687b(0, (ParameterizedType) m25687b);
                z13 = true;
            } else {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
        } else {
            type2 = m25687b;
            z13 = false;
            z14 = true;
            return new C5259g(type2, this.f21458a, this.f21459b, z13, z14, z10, z11, z12, false);
        }
        z14 = false;
        return new C5259g(type2, this.f21458a, this.f21459b, z13, z14, z10, z11, z12, false);
    }
}
