package com.lzy.okgo.request;

import anet.channel.request.Request;
import com.lzy.okgo.model.HttpMethod;
import com.lzy.okgo.request.base.BodyRequest;
import okhttp3.Request;
import okhttp3.RequestBody;

/* loaded from: classes2.dex */
public class OptionsRequest<T> extends BodyRequest<T, OptionsRequest<T>> {
    public OptionsRequest(String str) {
        super(str);
    }

    @Override // com.lzy.okgo.request.base.Request
    public Request generateRequest(RequestBody requestBody) {
        return generateRequestBuilder(requestBody).method(Request.Method.OPTION, requestBody).url(this.url).tag(this.tag).build();
    }

    @Override // com.lzy.okgo.request.base.Request
    public HttpMethod getMethod() {
        return HttpMethod.OPTIONS;
    }
}
