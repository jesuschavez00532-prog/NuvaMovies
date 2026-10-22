package com.efs.sdk.base.core.p051b;

import com.efs.sdk.base.core.model.LogDto;
import com.efs.sdk.base.http.HttpResponse;

/* renamed from: com.efs.sdk.base.core.b.g */
/* loaded from: classes.dex */
public final class RunnableC1676g implements Runnable {

    /* renamed from: a */
    private LogDto f7056a;

    /* renamed from: b */
    private InterfaceC1673d f7057b;

    /* renamed from: c */
    private String f7058c;

    public RunnableC1676g(LogDto logDto, InterfaceC1673d interfaceC1673d, String str) {
        this.f7056a = logDto;
        this.f7057b = interfaceC1673d;
        this.f7058c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpResponse httpResponse;
        int httpCode;
        InterfaceC1673d interfaceC1673d;
        LogDto logDto = this.f7056a;
        if (logDto != null && (interfaceC1673d = this.f7057b) != null) {
            httpResponse = interfaceC1673d.mo7629a(logDto, true);
        } else {
            httpResponse = new HttpResponse();
        }
        HandlerC1674e m7639a = HandlerC1674e.m7639a();
        String str = this.f7058c;
        if (httpResponse.succ) {
            httpCode = 0;
        } else {
            httpCode = httpResponse.getHttpCode();
        }
        m7639a.m7641b(str, httpCode);
        this.f7058c = null;
        this.f7057b = null;
    }
}
