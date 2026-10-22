package org.xutils.http.request;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import org.xutils.common.util.IOUtil;
import org.xutils.http.RequestParams;
import org.xutils.http.loader.FileLoader;
import org.xutils.http.loader.Loader;

/* loaded from: classes3.dex */
public class LocalFileRequest extends UriRequest {
    private InputStream inputStream;

    public LocalFileRequest(RequestParams requestParams, Type type) {
        super(requestParams, type);
    }

    private File getFile() {
        String str;
        if (this.queryUrl.startsWith("file:")) {
            str = this.queryUrl.substring(5);
        } else {
            str = this.queryUrl;
        }
        return new File(str);
    }

    @Override // org.xutils.http.request.UriRequest
    public void clearCacheHeader() {
    }

    @Override // org.xutils.http.request.UriRequest, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IOUtil.closeQuietly(this.inputStream);
        this.inputStream = null;
    }

    @Override // org.xutils.http.request.UriRequest
    public String getCacheKey() {
        return this.queryUrl;
    }

    @Override // org.xutils.http.request.UriRequest
    public long getContentLength() {
        return getFile().length();
    }

    @Override // org.xutils.http.request.UriRequest
    public String getETag() {
        return null;
    }

    @Override // org.xutils.http.request.UriRequest
    public long getExpiration() {
        return -1L;
    }

    @Override // org.xutils.http.request.UriRequest
    public long getHeaderFieldDate(String str, long j10) {
        return j10;
    }

    @Override // org.xutils.http.request.UriRequest
    public InputStream getInputStream() {
        if (this.inputStream == null) {
            this.inputStream = new FileInputStream(getFile());
        }
        return this.inputStream;
    }

    @Override // org.xutils.http.request.UriRequest
    public long getLastModified() {
        return getFile().lastModified();
    }

    @Override // org.xutils.http.request.UriRequest
    public int getResponseCode() {
        if (getFile().exists()) {
            return 200;
        }
        return 404;
    }

    @Override // org.xutils.http.request.UriRequest
    public String getResponseHeader(String str) {
        return null;
    }

    @Override // org.xutils.http.request.UriRequest
    public Map<String, List<String>> getResponseHeaders() {
        return null;
    }

    @Override // org.xutils.http.request.UriRequest
    public String getResponseMessage() {
        return null;
    }

    @Override // org.xutils.http.request.UriRequest
    public boolean isLoading() {
        return true;
    }

    @Override // org.xutils.http.request.UriRequest
    public Object loadResult() {
        Loader<?> loader = this.loader;
        if (loader instanceof FileLoader) {
            return getFile();
        }
        return loader.load(this);
    }

    @Override // org.xutils.http.request.UriRequest
    public Object loadResultFromCache() {
        return null;
    }

    @Override // org.xutils.http.request.UriRequest
    public void save2Cache() {
    }

    @Override // org.xutils.http.request.UriRequest
    public void sendRequest() {
    }
}
