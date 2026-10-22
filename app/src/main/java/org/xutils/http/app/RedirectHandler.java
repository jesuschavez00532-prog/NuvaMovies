package org.xutils.http.app;

import org.xutils.http.RequestParams;
import org.xutils.http.request.UriRequest;

/* loaded from: classes3.dex */
public interface RedirectHandler {
    RequestParams getRedirectParams(UriRequest uriRequest);
}
