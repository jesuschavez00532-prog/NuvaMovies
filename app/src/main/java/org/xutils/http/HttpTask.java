package org.xutils.http;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.xutils.C6127x;
import org.xutils.common.Callback;
import org.xutils.common.task.AbsTask;
import org.xutils.common.task.Priority;
import org.xutils.common.task.PriorityExecutor;
import org.xutils.common.util.IOUtil;
import org.xutils.common.util.ParameterizedTypeUtil;
import org.xutils.http.app.RedirectHandler;
import org.xutils.http.app.RequestInterceptListener;
import org.xutils.http.app.RequestTracker;
import org.xutils.http.request.UriRequest;
import org.xutils.http.request.UriRequestFactory;
import org.xutils.p275ex.HttpException;
import org.xutils.p275ex.HttpRedirectException;

/* loaded from: classes3.dex */
public class HttpTask<ResultType> extends AbsTask<ResultType> implements ProgressHandler {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int FLAG_CACHE = 2;
    private static final int FLAG_PROGRESS = 3;
    private static final int FLAG_REQUEST_CREATED = 1;
    private Callback.CacheCallback<ResultType> cacheCallback;
    private final Object cacheLock;
    private final Callback.CommonCallback<ResultType> callback;
    private final Executor executor;
    private volatile boolean hasException;
    private long lastUpdateTime;
    private Type loadType;
    private long loadingUpdateMaxTimeSpan;
    private RequestParams params;
    private Callback.PrepareCallback prepareCallback;
    private Callback.ProgressCallback progressCallback;
    private Object rawResult;
    private UriRequest request;
    private RequestInterceptListener requestInterceptListener;
    private RequestTracker tracker;
    private volatile Boolean trustCache;
    private static final AtomicInteger sCurrFileLoadCount = new AtomicInteger(0);
    private static final HashMap<String, WeakReference<HttpTask<?>>> DOWNLOAD_TASK = new HashMap<>(1);
    private static final PriorityExecutor HTTP_EXECUTOR = new PriorityExecutor(5, true);
    private static final PriorityExecutor CACHE_EXECUTOR = new PriorityExecutor(5, true);

    /* renamed from: org.xutils.http.HttpTask$a */
    /* loaded from: classes3.dex */
    class RunnableC6096a implements Runnable {
        RunnableC6096a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpTask.this.closeRequestSync();
        }
    }

    /* renamed from: org.xutils.http.HttpTask$b */
    /* loaded from: classes3.dex */
    class RunnableC6097b implements Runnable {
        RunnableC6097b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HttpTask.this.closeRequestSync();
        }
    }

    /* renamed from: org.xutils.http.HttpTask$c */
    /* loaded from: classes3.dex */
    private final class C6098c {

        /* renamed from: a */
        Object f24034a;

        /* renamed from: b */
        Throwable f24035b;

        /* synthetic */ C6098c(HttpTask httpTask, RunnableC6096a runnableC6096a) {
            this();
        }

        /* renamed from: a */
        public void m24396a() {
            HttpException httpException;
            int code;
            RedirectHandler redirectHandler;
            String str;
            try {
                boolean z10 = false;
                if (File.class == HttpTask.this.loadType) {
                    synchronized (HttpTask.sCurrFileLoadCount) {
                        while (HttpTask.sCurrFileLoadCount.get() >= 10 && !HttpTask.this.isCancelled()) {
                            try {
                                HttpTask.sCurrFileLoadCount.wait(10L);
                            } catch (InterruptedException unused) {
                                z10 = true;
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                    HttpTask.sCurrFileLoadCount.incrementAndGet();
                }
                if (!z10 && !HttpTask.this.isCancelled()) {
                    try {
                        HttpTask.this.request.setRequestInterceptListener(HttpTask.this.requestInterceptListener);
                        this.f24034a = HttpTask.this.request.loadResult();
                    } catch (Throwable th) {
                        this.f24035b = th;
                    }
                    Throwable th2 = this.f24035b;
                    if (th2 == null) {
                        if (File.class == HttpTask.this.loadType) {
                            synchronized (HttpTask.sCurrFileLoadCount) {
                                HttpTask.sCurrFileLoadCount.decrementAndGet();
                                HttpTask.sCurrFileLoadCount.notifyAll();
                            }
                            return;
                        }
                        return;
                    }
                    throw th2;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("cancelled before request");
                if (z10) {
                    str = "(interrupted)";
                } else {
                    str = "";
                }
                sb2.append(str);
                throw new Callback.CancelledException(sb2.toString());
            } catch (Throwable th3) {
                try {
                    this.f24035b = th3;
                    if ((th3 instanceof HttpException) && (((code = (httpException = th3).getCode()) == 301 || code == 302) && (redirectHandler = HttpTask.this.params.getRedirectHandler()) != null)) {
                        try {
                            RequestParams redirectParams = redirectHandler.getRedirectParams(HttpTask.this.request);
                            if (redirectParams != null) {
                                if (redirectParams.getMethod() == null) {
                                    redirectParams.setMethod(HttpTask.this.params.getMethod());
                                }
                                HttpTask.this.params = redirectParams;
                                HttpTask httpTask = HttpTask.this;
                                httpTask.request = httpTask.createNewRequest();
                                this.f24035b = new HttpRedirectException(code, httpException.getMessage(), httpException.getResult());
                            }
                        } catch (Throwable unused3) {
                            this.f24035b = th3;
                        }
                    }
                    if (File.class == HttpTask.this.loadType) {
                        synchronized (HttpTask.sCurrFileLoadCount) {
                            HttpTask.sCurrFileLoadCount.decrementAndGet();
                            HttpTask.sCurrFileLoadCount.notifyAll();
                        }
                    }
                } catch (Throwable th4) {
                    if (File.class == HttpTask.this.loadType) {
                        synchronized (HttpTask.sCurrFileLoadCount) {
                            HttpTask.sCurrFileLoadCount.decrementAndGet();
                            HttpTask.sCurrFileLoadCount.notifyAll();
                        }
                    }
                    throw th4;
                }
            }
        }

        private C6098c() {
        }
    }

    public HttpTask(RequestParams requestParams, Callback.Cancelable cancelable, Callback.CommonCallback<ResultType> commonCallback) {
        super(cancelable);
        this.hasException = false;
        this.rawResult = null;
        this.trustCache = null;
        this.cacheLock = new Object();
        this.loadingUpdateMaxTimeSpan = 300L;
        this.params = requestParams;
        this.callback = commonCallback;
        if (commonCallback instanceof Callback.CacheCallback) {
            this.cacheCallback = (Callback.CacheCallback) commonCallback;
        }
        if (commonCallback instanceof Callback.PrepareCallback) {
            this.prepareCallback = (Callback.PrepareCallback) commonCallback;
        }
        if (commonCallback instanceof Callback.ProgressCallback) {
            this.progressCallback = (Callback.ProgressCallback) commonCallback;
        }
        if (commonCallback instanceof RequestInterceptListener) {
            this.requestInterceptListener = (RequestInterceptListener) commonCallback;
        }
        RequestTracker requestTracker = requestParams.getRequestTracker();
        if (requestTracker == null) {
            if (commonCallback instanceof RequestTracker) {
                requestTracker = (RequestTracker) commonCallback;
            } else {
                requestTracker = UriRequestFactory.getDefaultTracker();
            }
        }
        if (requestTracker != null) {
            this.tracker = new C6102b(requestTracker);
        }
        if (requestParams.getExecutor() != null) {
            this.executor = requestParams.getExecutor();
        } else if (this.cacheCallback != null) {
            this.executor = CACHE_EXECUTOR;
        } else {
            this.executor = HTTP_EXECUTOR;
        }
    }

    private void checkDownloadTask() {
        if (File.class == this.loadType) {
            HashMap<String, WeakReference<HttpTask<?>>> hashMap = DOWNLOAD_TASK;
            synchronized (hashMap) {
                String saveFilePath = this.params.getSaveFilePath();
                if (!TextUtils.isEmpty(saveFilePath)) {
                    WeakReference<HttpTask<?>> weakReference = hashMap.get(saveFilePath);
                    if (weakReference != null) {
                        HttpTask<?> httpTask = weakReference.get();
                        if (httpTask != null) {
                            httpTask.cancel();
                            httpTask.closeRequestSync();
                        }
                        hashMap.remove(saveFilePath);
                    }
                    hashMap.put(saveFilePath, new WeakReference<>(this));
                }
                if (hashMap.size() > 10) {
                    Iterator<Map.Entry<String, WeakReference<HttpTask<?>>>> it = hashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        WeakReference<HttpTask<?>> value = it.next().getValue();
                        if (value == null || value.get() == null) {
                            it.remove();
                        }
                    }
                }
            }
        }
    }

    private void clearRawResult() {
        Object obj = this.rawResult;
        if (obj instanceof Closeable) {
            IOUtil.closeQuietly((Closeable) obj);
        }
        this.rawResult = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeRequestSync() {
        if (File.class == this.loadType) {
            AtomicInteger atomicInteger = sCurrFileLoadCount;
            synchronized (atomicInteger) {
                atomicInteger.notifyAll();
            }
        }
        clearRawResult();
        IOUtil.closeQuietly(this.request);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public UriRequest createNewRequest() {
        this.params.init();
        UriRequest uriRequest = UriRequestFactory.getUriRequest(this.params, this.loadType);
        uriRequest.setProgressHandler(this);
        this.loadingUpdateMaxTimeSpan = this.params.getLoadingUpdateMaxTimeSpan();
        update(1, uriRequest);
        return uriRequest;
    }

    private void resolveLoadType() {
        Class<?> cls = this.callback.getClass();
        Callback.CommonCallback<ResultType> commonCallback = this.callback;
        if (commonCallback instanceof Callback.TypedCallback) {
            this.loadType = ((Callback.TypedCallback) commonCallback).getLoadType();
        } else if (commonCallback instanceof Callback.PrepareCallback) {
            this.loadType = ParameterizedTypeUtil.getParameterizedType(cls, Callback.PrepareCallback.class, 0);
        } else {
            this.loadType = ParameterizedTypeUtil.getParameterizedType(cls, Callback.CommonCallback.class, 0);
        }
    }

    @Override // org.xutils.common.task.AbsTask
    protected void cancelWorks() {
        C6127x.task().run(new RunnableC6097b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.xutils.common.task.AbsTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ResultType doBackground() {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.http.HttpTask.doBackground():java.lang.Object");
    }

    @Override // org.xutils.common.task.AbsTask
    public Executor getExecutor() {
        return this.executor;
    }

    @Override // org.xutils.common.task.AbsTask
    public Priority getPriority() {
        return this.params.getPriority();
    }

    @Override // org.xutils.common.task.AbsTask
    protected boolean isCancelFast() {
        return this.params.isCancelFast();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.xutils.common.task.AbsTask
    public void onCancelled(Callback.CancelledException cancelledException) {
        RequestTracker requestTracker = this.tracker;
        if (requestTracker != null) {
            requestTracker.onCancelled(this.request);
        }
        this.callback.onCancelled(cancelledException);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.xutils.common.task.AbsTask
    public void onError(Throwable th, boolean z10) {
        RequestTracker requestTracker = this.tracker;
        if (requestTracker != null) {
            requestTracker.onError(this.request, th, z10);
        }
        this.callback.onError(th, z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.xutils.common.task.AbsTask
    public void onFinished() {
        RequestTracker requestTracker = this.tracker;
        if (requestTracker != null) {
            requestTracker.onFinished(this.request);
        }
        C6127x.task().run(new RunnableC6096a());
        this.callback.onFinished();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.xutils.common.task.AbsTask
    public void onStarted() {
        RequestTracker requestTracker = this.tracker;
        if (requestTracker != null) {
            requestTracker.onStart(this.params);
        }
        Callback.ProgressCallback progressCallback = this.progressCallback;
        if (progressCallback != null) {
            progressCallback.onStarted();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.xutils.common.task.AbsTask
    public void onSuccess(ResultType resulttype) {
        if (this.hasException) {
            return;
        }
        RequestTracker requestTracker = this.tracker;
        if (requestTracker != null) {
            requestTracker.onSuccess(this.request, resulttype);
        }
        this.callback.onSuccess(resulttype);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.xutils.common.task.AbsTask
    public void onUpdate(int i10, Object... objArr) {
        Object obj;
        Callback.ProgressCallback progressCallback;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3 && (progressCallback = this.progressCallback) != null && objArr.length == 3) {
                    try {
                        progressCallback.onLoading(((Number) objArr[0]).longValue(), ((Number) objArr[1]).longValue(), ((Boolean) objArr[2]).booleanValue());
                        return;
                    } catch (Throwable th) {
                        this.callback.onError(th, true);
                        return;
                    }
                }
                return;
            }
            synchronized (this.cacheLock) {
                try {
                    Object obj2 = objArr[0];
                    RequestTracker requestTracker = this.tracker;
                    if (requestTracker != null) {
                        requestTracker.onCache(this.request, obj2);
                    }
                    this.trustCache = Boolean.valueOf(this.cacheCallback.onCache(obj2));
                    obj = this.cacheLock;
                } catch (Throwable th2) {
                    try {
                        this.trustCache = Boolean.FALSE;
                        this.callback.onError(th2, true);
                        obj = this.cacheLock;
                    } catch (Throwable th3) {
                        this.cacheLock.notifyAll();
                        throw th3;
                    }
                }
                obj.notifyAll();
            }
            return;
        }
        RequestTracker requestTracker2 = this.tracker;
        if (requestTracker2 != null) {
            requestTracker2.onRequestCreated((UriRequest) objArr[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.xutils.common.task.AbsTask
    public void onWaiting() {
        RequestTracker requestTracker = this.tracker;
        if (requestTracker != null) {
            requestTracker.onWaiting(this.params);
        }
        Callback.ProgressCallback progressCallback = this.progressCallback;
        if (progressCallback != null) {
            progressCallback.onWaiting();
        }
    }

    public String toString() {
        return this.params.toString();
    }

    @Override // org.xutils.http.ProgressHandler
    public boolean updateProgress(long j10, long j11, boolean z10) {
        if (isCancelled() || isFinished()) {
            return false;
        }
        if (this.progressCallback != null && this.request != null && j11 > 0) {
            if (j10 < 0) {
                j10 = -1;
            } else if (j10 < j11) {
                j10 = j11;
            }
            if (z10) {
                this.lastUpdateTime = System.currentTimeMillis();
                update(3, Long.valueOf(j10), Long.valueOf(j11), Boolean.valueOf(this.request.isLoading()));
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.lastUpdateTime >= this.loadingUpdateMaxTimeSpan) {
                    this.lastUpdateTime = currentTimeMillis;
                    update(3, Long.valueOf(j10), Long.valueOf(j11), Boolean.valueOf(this.request.isLoading()));
                }
            }
        }
        if (isCancelled() || isFinished()) {
            return false;
        }
        return true;
    }
}
