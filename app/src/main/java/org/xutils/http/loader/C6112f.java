package org.xutils.http.loader;

import android.text.TextUtils;
import anet.channel.request.Request;
import org.json.JSONObject;
import org.xutils.cache.DiskCacheEntity;
import org.xutils.common.util.IOUtil;
import org.xutils.http.RequestParams;
import org.xutils.http.request.UriRequest;

/* renamed from: org.xutils.http.loader.f */
/* loaded from: classes3.dex */
class C6112f extends Loader {

    /* renamed from: a */
    private String f24050a = Request.DEFAULT_CHARSET;

    /* renamed from: b */
    private String f24051b = null;

    @Override // org.xutils.http.loader.Loader
    public Loader<JSONObject> newInstance() {
        return new C6112f();
    }

    @Override // org.xutils.http.loader.Loader
    public void save2Cache(UriRequest uriRequest) {
        saveStringCache(uriRequest, this.f24051b);
    }

    @Override // org.xutils.http.loader.Loader
    public void setParams(RequestParams requestParams) {
        if (requestParams != null) {
            String charset = requestParams.getCharset();
            if (!TextUtils.isEmpty(charset)) {
                this.f24050a = charset;
            }
        }
    }

    @Override // org.xutils.http.loader.Loader
    public JSONObject load(UriRequest uriRequest) {
        uriRequest.sendRequest();
        this.f24051b = IOUtil.readStr(uriRequest.getInputStream(), this.f24050a);
        return new JSONObject(this.f24051b);
    }

    @Override // org.xutils.http.loader.Loader
    public JSONObject loadFromCache(DiskCacheEntity diskCacheEntity) {
        if (diskCacheEntity == null) {
            return null;
        }
        String textContent = diskCacheEntity.getTextContent();
        if (TextUtils.isEmpty(textContent)) {
            return null;
        }
        return new JSONObject(textContent);
    }
}
