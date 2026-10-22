package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import okhttp3.Request;
import retrofit2.CallAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DefaultCallAdapterFactory extends CallAdapter.Factory {

    /* renamed from: a */
    private final Executor f25219a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class ExecutorCallbackCall<T> implements Call<T> {

        /* renamed from: a */
        final Executor f25223a;

        /* renamed from: b */
        final Call f25224b;

        ExecutorCallbackCall(Executor executor, Call call) {
            this.f25223a = executor;
            this.f25224b = call;
        }

        @Override // retrofit2.Call
        public void cancel() {
            this.f25224b.cancel();
        }

        @Override // retrofit2.Call
        public Response execute() {
            return this.f25224b.execute();
        }

        @Override // retrofit2.Call
        public boolean isCanceled() {
            return this.f25224b.isCanceled();
        }

        @Override // retrofit2.Call
        /* renamed from: n */
        public void mo25686n(final Callback callback) {
            Utils.m25785b(callback, "callback == null");
            this.f25224b.mo25686n(new Callback<T>() { // from class: retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall.1
                @Override // retrofit2.Callback
                /* renamed from: a */
                public void mo21158a(Call call, final Throwable th) {
                    ExecutorCallbackCall.this.f25223a.execute(new Runnable() { // from class: retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            C65841 c65841 = C65841.this;
                            callback.mo21158a(ExecutorCallbackCall.this, th);
                        }
                    });
                }

                @Override // retrofit2.Callback
                /* renamed from: b */
                public void mo21159b(Call call, final Response response) {
                    ExecutorCallbackCall.this.f25223a.execute(new Runnable() { // from class: retrofit2.DefaultCallAdapterFactory.ExecutorCallbackCall.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (ExecutorCallbackCall.this.f25224b.isCanceled()) {
                                C65841 c65841 = C65841.this;
                                callback.mo21158a(ExecutorCallbackCall.this, new IOException("Canceled"));
                            } else {
                                C65841 c658412 = C65841.this;
                                callback.mo21159b(ExecutorCallbackCall.this, response);
                            }
                        }
                    });
                }
            });
        }

        @Override // retrofit2.Call
        public Request request() {
            return this.f25224b.request();
        }

        @Override // retrofit2.Call
        public Call clone() {
            return new ExecutorCallbackCall(this.f25223a, this.f25224b.clone());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DefaultCallAdapterFactory(Executor executor) {
        this.f25219a = executor;
    }

    @Override // retrofit2.CallAdapter.Factory
    /* renamed from: a */
    public CallAdapter mo21167a(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        final Executor executor = null;
        if (CallAdapter.Factory.m25688c(type) != Call.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            final Type m25791h = Utils.m25791h(0, (ParameterizedType) type);
            if (!Utils.m25796m(annotationArr, SkipCallbackExecutor.class)) {
                executor = this.f25219a;
            }
            return new CallAdapter<Object, Call<?>>() { // from class: retrofit2.DefaultCallAdapterFactory.1
                @Override // retrofit2.CallAdapter
                /* renamed from: a */
                public Type mo21163a() {
                    return m25791h;
                }

                @Override // retrofit2.CallAdapter
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public Call mo21164b(Call call) {
                    Executor executor2 = executor;
                    if (executor2 != null) {
                        return new ExecutorCallbackCall(executor2, call);
                    }
                    return call;
                }
            };
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
