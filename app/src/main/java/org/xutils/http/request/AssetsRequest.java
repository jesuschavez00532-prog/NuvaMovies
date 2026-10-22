package org.xutils.http.request;

import java.io.InputStream;
import java.lang.reflect.Type;
import org.xutils.http.RequestParams;

/* loaded from: classes3.dex */
public class AssetsRequest extends ResRequest {
    public AssetsRequest(RequestParams requestParams, Type type) {
        super(requestParams, type);
    }

    @Override // org.xutils.http.request.ResRequest, org.xutils.http.request.UriRequest
    public InputStream getInputStream() {
        if (this.inputStream == null) {
            this.inputStream = this.params.getContext().getResources().getAssets().open(this.queryUrl.replace("assets://", ""));
            this.contentLength = r0.available();
        }
        return this.inputStream;
    }
}
