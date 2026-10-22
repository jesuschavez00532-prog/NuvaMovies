package org.xutils.http.loader;

import org.xutils.cache.DiskCacheEntity;
import org.xutils.http.request.UriRequest;

/* renamed from: org.xutils.http.loader.a */
/* loaded from: classes3.dex */
class C6107a extends Loader {
    @Override // org.xutils.http.loader.Loader
    public Boolean loadFromCache(DiskCacheEntity diskCacheEntity) {
        return null;
    }

    @Override // org.xutils.http.loader.Loader
    public Loader<Boolean> newInstance() {
        return new C6107a();
    }

    @Override // org.xutils.http.loader.Loader
    public void save2Cache(UriRequest uriRequest) {
    }

    @Override // org.xutils.http.loader.Loader
    public Boolean load(UriRequest uriRequest) {
        uriRequest.sendRequest();
        return Boolean.valueOf(uriRequest.getResponseCode() < 300);
    }
}
