package com.efs.sdk.base.core.p051b;

import com.efs.sdk.base.core.model.LogDto;
import com.efs.sdk.base.http.HttpResponse;

/* renamed from: com.efs.sdk.base.core.b.f */
/* loaded from: classes.dex */
public final class RunnableC1675f implements Runnable {

    /* renamed from: a */
    private LogDto f7053a;

    /* renamed from: b */
    private InterfaceC1673d f7054b;

    /* renamed from: c */
    private String f7055c;

    public RunnableC1675f(LogDto logDto, InterfaceC1673d interfaceC1673d, String str) {
        this.f7053a = logDto;
        this.f7054b = interfaceC1673d;
        this.f7055c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpResponse httpResponse;
        int httpCode;
        InterfaceC1673d interfaceC1673d;
        LogDto logDto = this.f7053a;
        if (logDto != null && (interfaceC1673d = this.f7054b) != null) {
            httpResponse = interfaceC1673d.mo7629a(logDto, true);
        } else {
            httpResponse = new HttpResponse();
        }
        HandlerC1674e m7639a = HandlerC1674e.m7639a();
        String str = this.f7055c;
        if (httpResponse.succ) {
            httpCode = 0;
        } else {
            httpCode = httpResponse.getHttpCode();
        }
        m7639a.m7640a(str, httpCode);
        this.f7055c = null;
        this.f7054b = null;
    }
}
