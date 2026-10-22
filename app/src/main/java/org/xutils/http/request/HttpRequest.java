package org.xutils.http.request;

import android.annotation.TargetApi;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.lzy.okgo.model.HttpHeaders;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TimeZone;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.xutils.cache.DiskCacheEntity;
import org.xutils.cache.LruDiskCache;
import org.xutils.common.util.IOUtil;
import org.xutils.common.util.KeyValue;
import org.xutils.common.util.LogUtil;
import org.xutils.http.BaseParams;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;
import org.xutils.http.app.RequestInterceptListener;
import org.xutils.http.app.ResponseParser;
import org.xutils.http.body.ProgressBody;
import org.xutils.http.body.RequestBody;
import org.xutils.http.cookie.DbCookieStore;
import org.xutils.p275ex.HttpException;

/* loaded from: classes3.dex */
public class HttpRequest extends UriRequest {
    private static final CookieManager COOKIE_MANAGER = new CookieManager(DbCookieStore.INSTANCE, CookiePolicy.ACCEPT_ALL);
    private String cacheKey;
    private HttpURLConnection connection;
    private InputStream inputStream;
    private boolean isLoading;
    private int responseCode;

    public HttpRequest(RequestParams requestParams, Type type) {
        super(requestParams, type);
        this.cacheKey = null;
        this.isLoading = false;
        this.inputStream = null;
        this.connection = null;
        this.responseCode = 0;
    }

    private static String toGMTString(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(HttpHeaders.FORMAT_HTTP_DATA, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(date);
    }

    @Override // org.xutils.http.request.UriRequest
    protected String buildQueryUrl(RequestParams requestParams) {
        String uri = requestParams.getUri();
        StringBuilder sb2 = new StringBuilder(uri);
        if (!uri.contains(Operator.Operation.EMPTY_PARAM)) {
            sb2.append(Operator.Operation.EMPTY_PARAM);
        } else if (!uri.endsWith(Operator.Operation.EMPTY_PARAM)) {
            sb2.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
        }
        List<KeyValue> queryStringParams = requestParams.getQueryStringParams();
        if (queryStringParams != null) {
            for (KeyValue keyValue : queryStringParams) {
                String str = keyValue.key;
                String valueStrOrNull = keyValue.getValueStrOrNull();
                if (!TextUtils.isEmpty(str) && valueStrOrNull != null) {
                    sb2.append(URLEncoder.encode(str, requestParams.getCharset()).replaceAll("\\+", "%20"));
                    sb2.append(Operator.Operation.EQUALS);
                    sb2.append(URLEncoder.encode(valueStrOrNull, requestParams.getCharset()).replaceAll("\\+", "%20"));
                    sb2.append(DispatchConstants.SIGN_SPLIT_SYMBOL);
                }
            }
        }
        if (sb2.charAt(sb2.length() - 1) == '&') {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        if (sb2.charAt(sb2.length() - 1) == '?') {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString();
    }

    @Override // org.xutils.http.request.UriRequest
    public void clearCacheHeader() {
        this.params.setHeader(HttpHeaders.HEAD_KEY_IF_MODIFIED_SINCE, null);
        this.params.setHeader(HttpHeaders.HEAD_KEY_IF_NONE_MATCH, null);
    }

    @Override // org.xutils.http.request.UriRequest, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InputStream inputStream = this.inputStream;
        if (inputStream != null) {
            IOUtil.closeQuietly(inputStream);
            this.inputStream = null;
        }
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // org.xutils.http.request.UriRequest
    public String getCacheKey() {
        if (this.cacheKey == null) {
            String cacheKey = this.params.getCacheKey();
            this.cacheKey = cacheKey;
            if (TextUtils.isEmpty(cacheKey)) {
                this.cacheKey = this.params.toString();
            }
        }
        return this.cacheKey;
    }

    @Override // org.xutils.http.request.UriRequest
    public long getContentLength() {
        HttpURLConnection httpURLConnection = this.connection;
        long j10 = -1;
        if (httpURLConnection != null) {
            try {
                String headerField = httpURLConnection.getHeaderField("content-length");
                if (headerField != null) {
                    j10 = Long.parseLong(headerField);
                }
            } catch (Throwable th) {
                LogUtil.m24376e(th.getMessage(), th);
            }
        }
        if (j10 < 1) {
            try {
                return getInputStream().available();
            } catch (Throwable unused) {
                return j10;
            }
        }
        return j10;
    }

    @Override // org.xutils.http.request.UriRequest
    public String getETag() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderField(HttpHeaders.HEAD_KEY_E_TAG);
    }

    @Override // org.xutils.http.request.UriRequest
    public long getExpiration() {
        HttpURLConnection httpURLConnection = this.connection;
        long j10 = -1;
        if (httpURLConnection == null) {
            return -1L;
        }
        String headerField = httpURLConnection.getHeaderField("Cache-Control");
        if (!TextUtils.isEmpty(headerField)) {
            StringTokenizer stringTokenizer = new StringTokenizer(headerField, ",");
            while (true) {
                if (!stringTokenizer.hasMoreTokens()) {
                    break;
                }
                String lowerCase = stringTokenizer.nextToken().trim().toLowerCase();
                if (lowerCase.startsWith("max-age")) {
                    int indexOf = lowerCase.indexOf(61);
                    if (indexOf > 0) {
                        try {
                            long parseLong = Long.parseLong(lowerCase.substring(indexOf + 1).trim());
                            if (parseLong > 0) {
                                j10 = System.currentTimeMillis() + (parseLong * 1000);
                            }
                        } catch (Throwable th) {
                            LogUtil.m24376e(th.getMessage(), th);
                        }
                    }
                }
            }
        }
        if (j10 <= 0) {
            j10 = this.connection.getExpiration();
        }
        if (j10 <= 0 && this.params.getCacheMaxAge() > 0) {
            j10 = System.currentTimeMillis() + this.params.getCacheMaxAge();
        }
        if (j10 <= 0) {
            return Long.MAX_VALUE;
        }
        return j10;
    }

    @Override // org.xutils.http.request.UriRequest
    public long getHeaderFieldDate(String str, long j10) {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection == null) {
            return j10;
        }
        return httpURLConnection.getHeaderFieldDate(str, j10);
    }

    @Override // org.xutils.http.request.UriRequest
    public InputStream getInputStream() {
        InputStream inputStream;
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection != null && this.inputStream == null) {
            if (httpURLConnection.getResponseCode() >= 400) {
                inputStream = this.connection.getErrorStream();
            } else {
                inputStream = this.connection.getInputStream();
            }
            this.inputStream = inputStream;
        }
        return this.inputStream;
    }

    @Override // org.xutils.http.request.UriRequest
    public long getLastModified() {
        return getHeaderFieldDate(HttpHeaders.HEAD_KEY_LAST_MODIFIED, System.currentTimeMillis());
    }

    @Override // org.xutils.http.request.UriRequest
    public String getRequestUri() {
        URL url;
        String str = this.queryUrl;
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection != null && (url = httpURLConnection.getURL()) != null) {
            return url.toString();
        }
        return str;
    }

    @Override // org.xutils.http.request.UriRequest
    public int getResponseCode() {
        if (this.connection != null) {
            return this.responseCode;
        }
        if (getInputStream() != null) {
            return 200;
        }
        return 404;
    }

    @Override // org.xutils.http.request.UriRequest
    public String getResponseHeader(String str) {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderField(str);
    }

    @Override // org.xutils.http.request.UriRequest
    public Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // org.xutils.http.request.UriRequest
    public String getResponseMessage() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection != null) {
            return URLDecoder.decode(httpURLConnection.getResponseMessage(), this.params.getCharset());
        }
        return null;
    }

    @Override // org.xutils.http.request.UriRequest
    public boolean isLoading() {
        return this.isLoading;
    }

    @Override // org.xutils.http.request.UriRequest
    public Object loadResult() {
        this.isLoading = true;
        return super.loadResult();
    }

    @Override // org.xutils.http.request.UriRequest
    public Object loadResultFromCache() {
        this.isLoading = true;
        DiskCacheEntity diskCacheEntity = LruDiskCache.getDiskCache(this.params.getCacheDirName()).setMaxSize(this.params.getCacheSize()).get(getCacheKey());
        if (diskCacheEntity != null) {
            if (HttpMethod.permitsCache(this.params.getMethod())) {
                Date lastModify = diskCacheEntity.getLastModify();
                if (lastModify.getTime() > 0) {
                    this.params.setHeader(HttpHeaders.HEAD_KEY_IF_MODIFIED_SINCE, toGMTString(lastModify));
                }
                String etag = diskCacheEntity.getEtag();
                if (!TextUtils.isEmpty(etag)) {
                    this.params.setHeader(HttpHeaders.HEAD_KEY_IF_NONE_MATCH, etag);
                }
            }
            return this.loader.loadFromCache(diskCacheEntity);
        }
        return null;
    }

    @Override // org.xutils.http.request.UriRequest
    @TargetApi(19)
    public void sendRequest() {
        RequestBody requestBody;
        boolean z10 = false;
        this.isLoading = false;
        this.responseCode = 0;
        URL url = new URL(this.queryUrl);
        this.params.getProxy();
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("177.53.215.224", 999));
        if (proxy != null) {
            this.connection = (HttpURLConnection) url.openConnection(proxy);
        } else {
            this.connection = (HttpURLConnection) url.openConnection();
        }
        this.connection.setReadTimeout(this.params.getReadTimeout());
        this.connection.setConnectTimeout(this.params.getConnectTimeout());
        this.connection.setInstanceFollowRedirects(this.params.getRedirectHandler() == null);
        if (this.connection instanceof HttpsURLConnection) {
            SSLSocketFactory sslSocketFactory = this.params.getSslSocketFactory();
            if (sslSocketFactory != null) {
                ((HttpsURLConnection) this.connection).setSSLSocketFactory(sslSocketFactory);
            }
            HostnameVerifier hostnameVerifier = this.params.getHostnameVerifier();
            if (hostnameVerifier != null) {
                ((HttpsURLConnection) this.connection).setHostnameVerifier(hostnameVerifier);
            }
        }
        List<BaseParams.Header> headers = this.params.getHeaders();
        if (headers != null) {
            for (BaseParams.Header header : headers) {
                String str = header.key;
                String valueStrOrNull = header.getValueStrOrNull();
                if (!TextUtils.isEmpty(str)) {
                    if (header.setHeader) {
                        this.connection.setRequestProperty(str, valueStrOrNull);
                    } else {
                        this.connection.addRequestProperty(str, valueStrOrNull);
                    }
                }
            }
        }
        ResponseParser responseParser = this.responseParser;
        if (responseParser != null) {
            responseParser.beforeRequest(this);
        }
        RequestInterceptListener requestInterceptListener = this.requestInterceptListener;
        if (requestInterceptListener != null) {
            requestInterceptListener.beforeRequest(this);
        }
        HttpMethod method = this.params.getMethod();
        try {
            this.connection.setRequestMethod(method.toString());
        } catch (ProtocolException e10) {
            Field declaredField = HttpURLConnection.class.getDeclaredField("method");
            declaredField.setAccessible(true);
            declaredField.set(this.connection, method.toString());
        }
        if (HttpMethod.permitsRequestBody(method) && (requestBody = this.params.getRequestBody()) != null) {
            if (requestBody instanceof ProgressBody) {
                ((ProgressBody) requestBody).setProgressHandler(this.progressHandler);
            }
            String contentType = requestBody.getContentType();
            if (!TextUtils.isEmpty(contentType)) {
                this.connection.setRequestProperty("Content-Type", contentType);
            }
            long contentLength = requestBody.getContentLength();
            if (contentLength < 0) {
                this.connection.setChunkedStreamingMode(262144);
                z10 = true;
            } else if (contentLength < 2147483647L) {
                this.connection.setFixedLengthStreamingMode((int) contentLength);
            } else {
                this.connection.setFixedLengthStreamingMode(contentLength);
            }
            if (z10) {
                this.connection.setRequestProperty("Transfer-Encoding", "chunked");
            } else {
                this.connection.setRequestProperty("Content-Length", String.valueOf(contentLength));
            }
            this.connection.setDoOutput(true);
            requestBody.writeTo(this.connection.getOutputStream());
        }
        if (this.params.isUseCookie()) {
            try {
                Map<String, List<String>> headerFields = this.connection.getHeaderFields();
                if (headerFields != null) {
                    COOKIE_MANAGER.put(url.toURI(), headerFields);
                }
            } catch (Throwable th) {
                LogUtil.m24376e(th.getMessage(), th);
            }
        }
        this.responseCode = this.connection.getResponseCode();
        ResponseParser responseParser2 = this.responseParser;
        if (responseParser2 != null) {
            responseParser2.afterRequest(this);
        }
        RequestInterceptListener requestInterceptListener2 = this.requestInterceptListener;
        if (requestInterceptListener2 != null) {
            requestInterceptListener2.afterRequest(this);
        }
        int i10 = this.responseCode;
        if (i10 == 204 || i10 == 205) {
            throw new HttpException(this.responseCode, getResponseMessage());
        }
        if (i10 < 300) {
            this.isLoading = true;
            return;
        }
        HttpException httpException = new HttpException(this.responseCode, getResponseMessage());
        try {
            httpException.setResult(IOUtil.readStr(getInputStream(), this.params.getCharset()));
        } catch (Throwable th2) {
            LogUtil.m24382w(th2.getMessage(), th2);
        }
        LogUtil.m24375e(httpException.toString() + ", url: " + this.queryUrl);
        throw httpException;
    }
}
