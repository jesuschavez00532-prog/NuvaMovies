package org.xutils.http;

import org.xutils.common.util.LogUtil;
import org.xutils.http.app.RequestTracker;
import org.xutils.http.request.UriRequest;

/* renamed from: org.xutils.http.b */
/* loaded from: classes3.dex */
final class C6102b implements RequestTracker {

    /* renamed from: a */
    private final RequestTracker f24040a;

    public C6102b(RequestTracker requestTracker) {
        this.f24040a = requestTracker;
    }

    @Override // org.xutils.http.app.RequestTracker
    public void onCache(UriRequest uriRequest, Object obj) {
        try {
            this.f24040a.onCache(uriRequest, obj);
        } catch (Throwable th) {
            LogUtil.m24376e(th.getMessage(), th);
        }
    }

    @Override // org.xutils.http.app.RequestTracker
    public void onCancelled(UriRequest uriRequest) {
        try {
            this.f24040a.onCancelled(uriRequest);
        } catch (Throwable th) {
            LogUtil.m24376e(th.getMessage(), th);
        }
    }

    @Override // org.xutils.http.app.RequestTracker
    public void onError(UriRequest uriRequest, Throwable th, boolean z10) {
        try {
            this.f24040a.onError(uriRequest, th, z10);
        } catch (Throwable th2) {
            LogUtil.m24376e(th2.getMessage(), th2);
        }
    }

    @Override // org.xutils.http.app.RequestTracker
    public void onFinished(UriRequest uriRequest) {
        try {
            this.f24040a.onFinished(uriRequest);
        } catch (Throwable th) {
            LogUtil.m24376e(th.getMessage(), th);
        }
    }

    @Override // org.xutils.http.app.RequestTracker
    public void onRequestCreated(UriRequest uriRequest) {
        try {
            this.f24040a.onRequestCreated(uriRequest);
        } catch (Throwable th) {
            LogUtil.m24376e(th.getMessage(), th);
        }
    }

    @Override // org.xutils.http.app.RequestTracker
    public void onStart(RequestParams requestParams) {
        try {
            this.f24040a.onStart(requestParams);
        } catch (Throwable th) {
            LogUtil.m24376e(th.getMessage(), th);
        }
    }

    @Override // org.xutils.http.app.RequestTracker
    public void onSuccess(UriRequest uriRequest, Object obj) {
        try {
            this.f24040a.onSuccess(uriRequest, obj);
        } catch (Throwable th) {
            LogUtil.m24376e(th.getMessage(), th);
        }
    }

    @Override // org.xutils.http.app.RequestTracker
    public void onWaiting(RequestParams requestParams) {
        try {
            this.f24040a.onWaiting(requestParams);
        } catch (Throwable th) {
            LogUtil.m24376e(th.getMessage(), th);
        }
    }
}
