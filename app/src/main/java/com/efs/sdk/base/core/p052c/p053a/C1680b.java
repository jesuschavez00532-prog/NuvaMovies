package com.efs.sdk.base.core.p052c.p053a;

import com.efs.sdk.base.core.cache.CacheManager;
import com.efs.sdk.base.core.model.LogDto;

/* renamed from: com.efs.sdk.base.core.c.a.b */
/* loaded from: classes.dex */
public final class C1680b extends AbstractC1679a {
    @Override // com.efs.sdk.base.core.p052c.p053a.AbstractC1679a
    /* renamed from: a */
    public final void mo7648a(LogDto logDto) {
        if (logDto.isSendImediately()) {
            m7649b(logDto);
        } else {
            CacheManager.getInstance().put(logDto);
        }
    }
}
