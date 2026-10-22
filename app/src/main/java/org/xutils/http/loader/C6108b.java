package org.xutils.http.loader;

import org.xutils.cache.DiskCacheEntity;
import org.xutils.common.util.IOUtil;
import org.xutils.http.request.UriRequest;

/* renamed from: org.xutils.http.loader.b */
/* loaded from: classes3.dex */
class C6108b extends Loader {

    /* renamed from: a */
    private byte[] f24047a;

    @Override // org.xutils.http.loader.Loader
    public Loader<byte[]> newInstance() {
        return new C6108b();
    }

    @Override // org.xutils.http.loader.Loader
    public void save2Cache(UriRequest uriRequest) {
        saveByteArrayCache(uriRequest, this.f24047a);
    }

    @Override // org.xutils.http.loader.Loader
    public byte[] load(UriRequest uriRequest) {
        uriRequest.sendRequest();
        byte[] readBytes = IOUtil.readBytes(uriRequest.getInputStream());
        this.f24047a = readBytes;
        return readBytes;
    }

    @Override // org.xutils.http.loader.Loader
    public byte[] loadFromCache(DiskCacheEntity diskCacheEntity) {
        byte[] bytesContent;
        if (diskCacheEntity == null || (bytesContent = diskCacheEntity.getBytesContent()) == null || bytesContent.length <= 0) {
            return null;
        }
        return bytesContent;
    }
}
