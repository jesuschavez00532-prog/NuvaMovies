package org.xutils.http.loader;

import android.text.TextUtils;
import anet.channel.request.Request;
import org.json.JSONArray;
import org.xutils.cache.DiskCacheEntity;
import org.xutils.common.util.IOUtil;
import org.xutils.http.RequestParams;
import org.xutils.http.request.UriRequest;

/* renamed from: org.xutils.http.loader.e */
/* loaded from: classes3.dex */
class C6111e extends Loader {

    /* renamed from: a */
    private String f24048a = Request.DEFAULT_CHARSET;

    /* renamed from: b */
    private String f24049b = null;

    @Override // org.xutils.http.loader.Loader
    public Loader<JSONArray> newInstance() {
        return new C6111e();
    }

    @Override // org.xutils.http.loader.Loader
    public void save2Cache(UriRequest uriRequest) {
        saveStringCache(uriRequest, this.f24049b);
    }

    @Override // org.xutils.http.loader.Loader
    public void setParams(RequestParams requestParams) {
        if (requestParams != null) {
            String charset = requestParams.getCharset();
            if (!TextUtils.isEmpty(charset)) {
                this.f24048a = charset;
            }
        }
    }

    @Override // org.xutils.http.loader.Loader
    public JSONArray load(UriRequest uriRequest) {
        uriRequest.sendRequest();
        this.f24049b = IOUtil.readStr(uriRequest.getInputStream(), this.f24048a);
        return new JSONArray(this.f24049b);
    }

    @Override // org.xutils.http.loader.Loader
    public JSONArray loadFromCache(DiskCacheEntity diskCacheEntity) {
        if (diskCacheEntity == null) {
            return null;
        }
        String textContent = diskCacheEntity.getTextContent();
        if (TextUtils.isEmpty(textContent)) {
            return null;
        }
        return new JSONArray(textContent);
    }
}
