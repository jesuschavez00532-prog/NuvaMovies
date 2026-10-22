package com.efs.sdk.base.http;

import com.efs.sdk.base.core.util.concurrent.InterfaceC1721b;

/* loaded from: classes.dex */
public abstract class AbsHttpListener implements InterfaceC1721b<HttpResponse> {
    public abstract void onError(HttpResponse httpResponse);

    public abstract void onSuccess(HttpResponse httpResponse);

    @Override // com.efs.sdk.base.core.util.concurrent.InterfaceC1721b
    public void result(HttpResponse httpResponse) {
        if (httpResponse != null && httpResponse.succ) {
            onSuccess(httpResponse);
        } else {
            onError(httpResponse);
        }
    }
}
