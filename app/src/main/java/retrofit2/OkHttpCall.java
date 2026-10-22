package retrofit2;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class OkHttpCall<T> implements Call<T> {

    /* renamed from: a */
    private final RequestFactory f25254a;

    /* renamed from: b */
    private final Object[] f25255b;

    /* renamed from: c */
    private final Call.Factory f25256c;

    /* renamed from: d */
    private final Converter f25257d;

    /* renamed from: e */
    private volatile boolean f25258e;

    /* renamed from: f */
    private okhttp3.Call f25259f;

    /* renamed from: g */
    private Throwable f25260g;

    /* renamed from: h */
    private boolean f25261h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class ExceptionCatchingResponseBody extends ResponseBody {

        /* renamed from: c */
        private final ResponseBody f25264c;

        /* renamed from: d */
        private final BufferedSource f25265d;

        /* renamed from: e */
        IOException f25266e;

        ExceptionCatchingResponseBody(ResponseBody responseBody) {
            this.f25264c = responseBody;
            this.f25265d = Okio.buffer(new ForwardingSource(responseBody.source()) { // from class: retrofit2.OkHttpCall.ExceptionCatchingResponseBody.1
                @Override // okio.ForwardingSource, okio.Source
                public long read(Buffer buffer, long j10) {
                    try {
                        return super.read(buffer, j10);
                    } catch (IOException e10) {
                        ExceptionCatchingResponseBody.this.f25266e = e10;
                        throw e10;
                    }
                }
            });
        }

        /* renamed from: a */
        void m25714a() {
            IOException iOException = this.f25266e;
            if (iOException == null) {
            } else {
                throw iOException;
            }
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f25264c.close();
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.f25264c.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.f25264c.contentType();
        }

        @Override // okhttp3.ResponseBody
        public BufferedSource source() {
            return this.f25265d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class NoContentResponseBody extends ResponseBody {

        /* renamed from: c */
        private final MediaType f25268c;

        /* renamed from: d */
        private final long f25269d;

        NoContentResponseBody(MediaType mediaType, long j10) {
            this.f25268c = mediaType;
            this.f25269d = j10;
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.f25269d;
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.f25268c;
        }

        @Override // okhttp3.ResponseBody
        public BufferedSource source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OkHttpCall(RequestFactory requestFactory, Object[] objArr, Call.Factory factory, Converter converter) {
        this.f25254a = requestFactory;
        this.f25255b = objArr;
        this.f25256c = factory;
        this.f25257d = converter;
    }

    /* renamed from: b */
    private okhttp3.Call m25710b() {
        okhttp3.Call newCall = this.f25256c.newCall(this.f25254a.m25748a(this.f25255b));
        if (newCall != null) {
            return newCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    @Override // retrofit2.Call
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public OkHttpCall clone() {
        return new OkHttpCall(this.f25254a, this.f25255b, this.f25256c, this.f25257d);
    }

    @Override // retrofit2.Call
    public void cancel() {
        okhttp3.Call call;
        this.f25258e = true;
        synchronized (this) {
            call = this.f25259f;
        }
        if (call != null) {
            call.cancel();
        }
    }

    /* renamed from: d */
    Response m25712d(okhttp3.Response response) {
        ResponseBody body = response.body();
        okhttp3.Response build = response.newBuilder().body(new NoContentResponseBody(body.contentType(), body.contentLength())).build();
        int code = build.code();
        if (code >= 200 && code < 300) {
            if (code != 204 && code != 205) {
                ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(body);
                try {
                    return Response.m25760f(this.f25257d.mo22520a(exceptionCatchingResponseBody), build);
                } catch (RuntimeException e10) {
                    exceptionCatchingResponseBody.m25714a();
                    throw e10;
                }
            }
            body.close();
            return Response.m25760f(null, build);
        }
        try {
            return Response.m25759c(Utils.m25784a(body), build);
        } finally {
            body.close();
        }
    }

    @Override // retrofit2.Call
    public Response execute() {
        okhttp3.Call call;
        synchronized (this) {
            if (!this.f25261h) {
                this.f25261h = true;
                Throwable th = this.f25260g;
                if (th != null) {
                    if (!(th instanceof IOException)) {
                        if (th instanceof RuntimeException) {
                            throw ((RuntimeException) th);
                        }
                        throw ((Error) th);
                    }
                    throw ((IOException) th);
                }
                call = this.f25259f;
                if (call == null) {
                    try {
                        call = m25710b();
                        this.f25259f = call;
                    } catch (IOException | Error | RuntimeException e10) {
                        Utils.m25803t(e10);
                        this.f25260g = e10;
                        throw e10;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.f25258e) {
            call.cancel();
        }
        return m25712d(call.execute());
    }

    @Override // retrofit2.Call
    public boolean isCanceled() {
        boolean z10 = true;
        if (this.f25258e) {
            return true;
        }
        synchronized (this) {
            okhttp3.Call call = this.f25259f;
            if (call == null || !call.isCanceled()) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // retrofit2.Call
    /* renamed from: n */
    public void mo25686n(final Callback callback) {
        okhttp3.Call call;
        Throwable th;
        Utils.m25785b(callback, "callback == null");
        synchronized (this) {
            if (!this.f25261h) {
                this.f25261h = true;
                call = this.f25259f;
                th = this.f25260g;
                if (call == null && th == null) {
                    try {
                        okhttp3.Call m25710b = m25710b();
                        this.f25259f = m25710b;
                        call = m25710b;
                    } catch (Throwable th2) {
                        th = th2;
                        Utils.m25803t(th);
                        this.f25260g = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            callback.mo21158a(this, th);
            return;
        }
        if (this.f25258e) {
            call.cancel();
        }
        call.enqueue(new okhttp3.Callback() { // from class: retrofit2.OkHttpCall.1
            /* renamed from: a */
            private void m25713a(Throwable th3) {
                try {
                    callback.mo21158a(OkHttpCall.this, th3);
                } catch (Throwable th4) {
                    Utils.m25803t(th4);
                    th4.printStackTrace();
                }
            }

            @Override // okhttp3.Callback
            public void onFailure(okhttp3.Call call2, IOException iOException) {
                m25713a(iOException);
            }

            @Override // okhttp3.Callback
            public void onResponse(okhttp3.Call call2, okhttp3.Response response) {
                try {
                    try {
                        callback.mo21159b(OkHttpCall.this, OkHttpCall.this.m25712d(response));
                    } catch (Throwable th3) {
                        Utils.m25803t(th3);
                        th3.printStackTrace();
                    }
                } catch (Throwable th4) {
                    Utils.m25803t(th4);
                    m25713a(th4);
                }
            }
        });
    }

    @Override // retrofit2.Call
    public synchronized Request request() {
        okhttp3.Call call = this.f25259f;
        if (call != null) {
            return call.request();
        }
        Throwable th = this.f25260g;
        if (th != null) {
            if (!(th instanceof IOException)) {
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                throw ((Error) th);
            }
            throw new RuntimeException("Unable to create request.", this.f25260g);
        }
        try {
            okhttp3.Call m25710b = m25710b();
            this.f25259f = m25710b;
            return m25710b.request();
        } catch (IOException e10) {
            this.f25260g = e10;
            throw new RuntimeException("Unable to create request.", e10);
        } catch (Error e11) {
            e = e11;
            Utils.m25803t(e);
            this.f25260g = e;
            throw e;
        } catch (RuntimeException e12) {
            e = e12;
            Utils.m25803t(e);
            this.f25260g = e;
            throw e;
        }
    }
}
