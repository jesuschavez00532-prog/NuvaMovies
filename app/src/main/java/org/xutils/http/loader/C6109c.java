package org.xutils.http.loader;

import java.io.InputStream;
import org.xutils.cache.DiskCacheEntity;
import org.xutils.http.request.UriRequest;

/* renamed from: org.xutils.http.loader.c */
/* loaded from: classes3.dex */
class C6109c extends Loader {
    @Override // org.xutils.http.loader.Loader
    public InputStream loadFromCache(DiskCacheEntity diskCacheEntity) {
        return null;
    }

    @Override // org.xutils.http.loader.Loader
    public Loader<InputStream> newInstance() {
        return new C6109c();
    }

    @Override // org.xutils.http.loader.Loader
    public void save2Cache(UriRequest uriRequest) {
    }

    @Override // org.xutils.http.loader.Loader
    public InputStream load(UriRequest uriRequest) {
        uriRequest.sendRequest();
        return uriRequest.getInputStream();
    }
}
