package org.xutils.http.loader;

import android.text.TextUtils;
import anet.channel.request.Request;
import org.xutils.cache.DiskCacheEntity;
import org.xutils.common.util.IOUtil;
import org.xutils.http.RequestParams;
import org.xutils.http.request.UriRequest;

/* renamed from: org.xutils.http.loader.h */
/* loaded from: classes3.dex */
class C6114h extends Loader {

    /* renamed from: a */
    private String f24056a = Request.DEFAULT_CHARSET;

    /* renamed from: b */
    private String f24057b = null;

    @Override // org.xutils.http.loader.Loader
    public Loader<String> newInstance() {
        return new C6114h();
    }

    @Override // org.xutils.http.loader.Loader
    public void save2Cache(UriRequest uriRequest) {
        saveStringCache(uriRequest, this.f24057b);
    }

    @Override // org.xutils.http.loader.Loader
    public void setParams(RequestParams requestParams) {
        if (requestParams != null) {
            String charset = requestParams.getCharset();
            if (!TextUtils.isEmpty(charset)) {
                this.f24056a = charset;
            }
        }
    }

    @Override // org.xutils.http.loader.Loader
    public String load(UriRequest uriRequest) {
        uriRequest.sendRequest();
        String readStr = IOUtil.readStr(uriRequest.getInputStream(), this.f24056a);
        this.f24057b = readStr;
        return readStr;
    }

    @Override // org.xutils.http.loader.Loader
    public String loadFromCache(DiskCacheEntity diskCacheEntity) {
        if (diskCacheEntity != null) {
            return diskCacheEntity.getTextContent();
        }
        return null;
    }
}
