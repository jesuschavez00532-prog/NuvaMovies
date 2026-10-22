package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.CallAdapter;

@IgnoreJRERequirement
/* loaded from: classes3.dex */
final class CompletableFutureCallAdapterFactory extends CallAdapter.Factory {

    /* renamed from: a */
    static final CallAdapter.Factory f25208a = new CompletableFutureCallAdapterFactory();

    @IgnoreJRERequirement
    /* loaded from: classes3.dex */
    private static final class BodyCallAdapter<R> implements CallAdapter<R, CompletableFuture<R>> {

        /* renamed from: a */
        private final Type f25209a;

        BodyCallAdapter(Type type) {
            this.f25209a = type;
        }

        @Override // retrofit2.CallAdapter
        /* renamed from: a */
        public Type mo21163a() {
            return this.f25209a;
        }

        @Override // retrofit2.CallAdapter
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture mo21164b(final Call call) {
            final CompletableFuture<R> completableFuture = new CompletableFuture<R>() { // from class: retrofit2.CompletableFutureCallAdapterFactory.BodyCallAdapter.1
                @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
                public boolean cancel(boolean z10) {
                    if (z10) {
                        call.cancel();
                    }
                    return super.cancel(z10);
                }
            };
            call.mo25686n(new Callback<R>() { // from class: retrofit2.CompletableFutureCallAdapterFactory.BodyCallAdapter.2
                @Override // retrofit2.Callback
                /* renamed from: a */
                public void mo21158a(Call call2, Throwable th) {
                    completableFuture.completeExceptionally(th);
                }

                @Override // retrofit2.Callback
                /* renamed from: b */
                public void mo21159b(Call call2, Response response) {
                    if (response.m25763d()) {
                        completableFuture.complete(response.m25761a());
                    } else {
                        completableFuture.completeExceptionally(new HttpException(response));
                    }
                }
            });
            return completableFuture;
        }
    }

    @IgnoreJRERequirement
    /* loaded from: classes3.dex */
    private static final class ResponseCallAdapter<R> implements CallAdapter<R, CompletableFuture<Response<R>>> {

        /* renamed from: a */
        private final Type f25214a;

        ResponseCallAdapter(Type type) {
            this.f25214a = type;
        }

        @Override // retrofit2.CallAdapter
        /* renamed from: a */
        public Type mo21163a() {
            return this.f25214a;
        }

        @Override // retrofit2.CallAdapter
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture mo21164b(final Call call) {
            final CompletableFuture<Response<R>> completableFuture = new CompletableFuture<Response<R>>() { // from class: retrofit2.CompletableFutureCallAdapterFactory.ResponseCallAdapter.1
                @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
                public boolean cancel(boolean z10) {
                    if (z10) {
                        call.cancel();
                    }
                    return super.cancel(z10);
                }
            };
            call.mo25686n(new Callback<R>() { // from class: retrofit2.CompletableFutureCallAdapterFactory.ResponseCallAdapter.2
                @Override // retrofit2.Callback
                /* renamed from: a */
                public void mo21158a(Call call2, Throwable th) {
                    completableFuture.completeExceptionally(th);
                }

                @Override // retrofit2.Callback
                /* renamed from: b */
                public void mo21159b(Call call2, Response response) {
                    completableFuture.complete(response);
                }
            });
            return completableFuture;
        }
    }

    CompletableFutureCallAdapterFactory() {
    }

    @Override // retrofit2.CallAdapter.Factory
    /* renamed from: a */
    public CallAdapter mo21167a(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (CallAdapter.Factory.m25688c(type) != AbstractC6594a.m25806a()) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type m25687b = CallAdapter.Factory.m25687b(0, (ParameterizedType) type);
            if (CallAdapter.Factory.m25688c(m25687b) != Response.class) {
                return new BodyCallAdapter(m25687b);
            }
            if (m25687b instanceof ParameterizedType) {
                return new ResponseCallAdapter(CallAdapter.Factory.m25687b(0, (ParameterizedType) m25687b));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
