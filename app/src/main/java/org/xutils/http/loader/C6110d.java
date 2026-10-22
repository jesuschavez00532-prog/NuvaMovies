package org.xutils.http.loader;

import org.xutils.cache.DiskCacheEntity;
import org.xutils.http.request.UriRequest;

/* renamed from: org.xutils.http.loader.d */
/* loaded from: classes3.dex */
class C6110d extends Loader {
    @Override // org.xutils.http.loader.Loader
    public Integer loadFromCache(DiskCacheEntity diskCacheEntity) {
        return null;
    }

    @Override // org.xutils.http.loader.Loader
    public Loader<Integer> newInstance() {
        return new C6110d();
    }

    @Override // org.xutils.http.loader.Loader
    public void save2Cache(UriRequest uriRequest) {
    }

    @Override // org.xutils.http.loader.Loader
    public Integer load(UriRequest uriRequest) {
        uriRequest.sendRequest();
        return Integer.valueOf(uriRequest.getResponseCode());
    }
}
