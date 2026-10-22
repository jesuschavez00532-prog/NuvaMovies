package com.titan.thumbnail;

import io.reactivex.Observable;
import p240mf.InterfaceC5677f;
import p240mf.InterfaceC5682k;
import p240mf.InterfaceC5696y;

/* loaded from: classes3.dex */
public interface ThumbnailApi {
    @InterfaceC5677f
    @InterfaceC5682k({"Cache-Control:no-store;Content-type:application/json;charset=utf-8"})
    Observable<ThumbnailResult> getThumbnail(@InterfaceC5696y String str);
}
