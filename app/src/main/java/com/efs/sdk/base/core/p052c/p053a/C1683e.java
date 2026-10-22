package com.efs.sdk.base.core.p052c.p053a;

import com.efs.sdk.base.core.model.LogDto;
import com.efs.sdk.base.core.p051b.HandlerC1672c;
import com.efs.sdk.base.core.p051b.HandlerC1674e;
import com.efs.sdk.base.core.p055d.C1708f;
import com.efs.sdk.base.http.HttpResponse;

/* renamed from: com.efs.sdk.base.core.c.a.e */
/* loaded from: classes.dex */
public final class C1683e extends AbstractC1679a {
    @Override // com.efs.sdk.base.core.p052c.p053a.AbstractC1679a
    /* renamed from: a */
    public final void mo7648a(LogDto logDto) {
        C1708f c1708f;
        C1708f c1708f2;
        HttpResponse mo7629a;
        if (!logDto.isSendImediately()) {
            m7649b(logDto);
            return;
        }
        HandlerC1674e m7639a = HandlerC1674e.m7639a();
        if (!logDto.isLimitByFlow() || HandlerC1672c.m7631a().m7637a(logDto.getLogType(), logDto.getBodySize())) {
            c1708f = C1708f.a.f7163a;
            c1708f.f7161c.m7710b();
            c1708f2 = C1708f.a.f7163a;
            c1708f2.f7161c.m7711c();
            mo7629a = m7639a.f7043c.mo7629a(logDto, false);
        } else {
            mo7629a = new HttpResponse();
            mo7629a.data = "flow_limit";
        }
        logDto.setResponseDto(mo7629a);
        m7649b(logDto);
    }
}
