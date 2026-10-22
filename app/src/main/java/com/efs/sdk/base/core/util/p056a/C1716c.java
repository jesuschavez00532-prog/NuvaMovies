package com.efs.sdk.base.core.util.p056a;

import com.efs.sdk.base.core.util.concurrent.RunnableC1723d;
import com.efs.sdk.base.http.HttpResponse;

/* renamed from: com.efs.sdk.base.core.util.a.c */
/* loaded from: classes.dex */
public final class C1716c extends RunnableC1723d<HttpResponse> {

    /* renamed from: a */
    public C1715b f7201a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1716c(C1715b c1715b) {
        super(c1715b);
        this.f7201a = c1715b;
    }

    /* renamed from: b */
    public final HttpResponse m7760b() {
        this.f7201a.f7198e = "post";
        return m7769a();
    }
}
