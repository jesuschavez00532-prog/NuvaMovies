package org.xutils.http.request;

import android.text.TextUtils;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.xutils.cache.DiskCacheEntity;
import org.xutils.cache.LruDiskCache;
import org.xutils.common.util.IOUtil;
import org.xutils.common.util.LogUtil;
import org.xutils.http.RequestParams;

/* loaded from: classes3.dex */
public class ResRequest extends UriRequest {
    private static long lastModifiedTime;
    protected long contentLength;
    protected InputStream inputStream;

    public ResRequest(RequestParams requestParams, Type type) {
        super(requestParams, type);
        this.contentLength = 0L;
    }

    private int getResId() {
        int i10;
        String replace = this.queryUrl.substring(4).replace(Operator.Operation.DIVISION, "");
        if (TextUtils.isDigitsOnly(replace)) {
            i10 = Integer.parseInt(replace);
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            return i10;
        }
        throw new IllegalArgumentException("resId not found in url:" + this.queryUrl);
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
        try {
            getInputStream();
            return this.contentLength;
        } catch (Throwable th) {
            LogUtil.m24376e(th.getMessage(), th);
            return -1L;
        }
    }

    @Override // org.xutils.http.request.UriRequest
    public String getETag() {
        return null;
    }

    @Override // org.xutils.http.request.UriRequest
    public long getExpiration() {
        return Long.MAX_VALUE;
    }

    @Override // org.xutils.http.request.UriRequest
    public long getHeaderFieldDate(String str, long j10) {
        return j10;
    }

    @Override // org.xutils.http.request.UriRequest
    public InputStream getInputStream() {
        if (this.inputStream == null) {
            this.inputStream = this.params.getContext().getResources().openRawResource(getResId());
            this.contentLength = r0.available();
        }
        return this.inputStream;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (org.xutils.http.request.ResRequest.lastModifiedTime == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        org.xutils.http.request.ResRequest.lastModifiedTime = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (0 != 0) goto L20;
     */
    @Override // org.xutils.http.request.UriRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long getLastModified() {
        /*
            r6 = this;
            long r0 = org.xutils.http.request.ResRequest.lastModifiedTime
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L4f
            org.xutils.http.RequestParams r0 = r6.params     // Catch: java.lang.Throwable -> L2c
            android.content.Context r0 = r0.getContext()     // Catch: java.lang.Throwable -> L2c
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch: java.lang.Throwable -> L2c
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = r0.sourceDir     // Catch: java.lang.Throwable -> L2c
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L25
            long r0 = r1.lastModified()     // Catch: java.lang.Throwable -> L2c
            org.xutils.http.request.ResRequest.lastModifiedTime = r0     // Catch: java.lang.Throwable -> L2c
        L25:
            long r0 = org.xutils.http.request.ResRequest.lastModifiedTime
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L4f
            goto L3a
        L2c:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()     // Catch: java.lang.Throwable -> L41
            org.xutils.common.util.LogUtil.m24382w(r1, r0)     // Catch: java.lang.Throwable -> L41
            org.xutils.http.request.ResRequest.lastModifiedTime = r2     // Catch: java.lang.Throwable -> L41
            int r0 = (r2 > r2 ? 1 : (r2 == r2 ? 0 : -1))
            if (r0 != 0) goto L4f
        L3a:
            long r0 = java.lang.System.currentTimeMillis()
            org.xutils.http.request.ResRequest.lastModifiedTime = r0
            goto L4f
        L41:
            r0 = move-exception
            long r4 = org.xutils.http.request.ResRequest.lastModifiedTime
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L4e
            long r1 = java.lang.System.currentTimeMillis()
            org.xutils.http.request.ResRequest.lastModifiedTime = r1
        L4e:
            throw r0
        L4f:
            long r0 = org.xutils.http.request.ResRequest.lastModifiedTime
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.http.request.ResRequest.getLastModified():long");
    }

    @Override // org.xutils.http.request.UriRequest
    public int getResponseCode() {
        if (getInputStream() != null) {
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
        return this.loader.load(this);
    }

    @Override // org.xutils.http.request.UriRequest
    public Object loadResultFromCache() {
        Date lastModify;
        DiskCacheEntity diskCacheEntity = LruDiskCache.getDiskCache(this.params.getCacheDirName()).setMaxSize(this.params.getCacheSize()).get(getCacheKey());
        if (diskCacheEntity == null || (lastModify = diskCacheEntity.getLastModify()) == null || lastModify.getTime() < getLastModified()) {
            return null;
        }
        return this.loader.loadFromCache(diskCacheEntity);
    }

    @Override // org.xutils.http.request.UriRequest
    public void sendRequest() {
    }
}
