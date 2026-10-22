package org.xutils.http.request;

import java.io.Closeable;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import org.xutils.C6127x;
import org.xutils.common.util.LogUtil;
import org.xutils.http.ProgressHandler;
import org.xutils.http.RequestParams;
import org.xutils.http.app.RequestInterceptListener;
import org.xutils.http.app.ResponseParser;
import org.xutils.http.loader.Loader;
import org.xutils.http.loader.LoaderFactory;

/* loaded from: classes3.dex */
public abstract class UriRequest implements Closeable {
    protected final Loader<?> loader;
    protected final RequestParams params;
    protected final String queryUrl;
    protected ProgressHandler progressHandler = null;
    protected ResponseParser responseParser = null;
    protected RequestInterceptListener requestInterceptListener = null;

    /* renamed from: org.xutils.http.request.UriRequest$a */
    /* loaded from: classes3.dex */
    class RunnableC6115a implements Runnable {
        RunnableC6115a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                UriRequest uriRequest = UriRequest.this;
                uriRequest.loader.save2Cache(uriRequest);
            } catch (Throwable th) {
                LogUtil.m24376e(th.getMessage(), th);
            }
        }
    }

    public UriRequest(RequestParams requestParams, Type type) {
        this.params = requestParams;
        this.queryUrl = buildQueryUrl(requestParams);
        Loader<?> loader = LoaderFactory.getLoader(type);
        this.loader = loader;
        loader.setParams(requestParams);
    }

    protected String buildQueryUrl(RequestParams requestParams) {
        return requestParams.getUri();
    }

    public abstract void clearCacheHeader();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public abstract String getCacheKey();

    public abstract long getContentLength();

    public abstract String getETag();

    public abstract long getExpiration();

    public abstract long getHeaderFieldDate(String str, long j10);

    public abstract InputStream getInputStream();

    public abstract long getLastModified();

    public RequestParams getParams() {
        return this.params;
    }

    public String getRequestUri() {
        return this.queryUrl;
    }

    public abstract int getResponseCode();

    public abstract String getResponseHeader(String str);

    public abstract Map<String, List<String>> getResponseHeaders();

    public abstract String getResponseMessage();

    public abstract boolean isLoading();

    public Object loadResult() {
        return this.loader.load(this);
    }

    public abstract Object loadResultFromCache();

    public void save2Cache() {
        C6127x.task().run(new RunnableC6115a());
    }

    public abstract void sendRequest();

    public void setProgressHandler(ProgressHandler progressHandler) {
        this.progressHandler = progressHandler;
        this.loader.setProgressHandler(progressHandler);
    }

    public void setRequestInterceptListener(RequestInterceptListener requestInterceptListener) {
        this.requestInterceptListener = requestInterceptListener;
    }

    public void setResponseParser(ResponseParser responseParser) {
        this.responseParser = responseParser;
    }

    public String toString() {
        return getRequestUri();
    }
}
