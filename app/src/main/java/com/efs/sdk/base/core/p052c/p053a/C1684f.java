package com.efs.sdk.base.core.p052c.p053a;

import com.efs.sdk.base.core.config.remote.C1698b;
import com.efs.sdk.base.core.config.remote.RemoteConfig;
import com.efs.sdk.base.core.model.LogDto;

/* renamed from: com.efs.sdk.base.core.c.a.f */
/* loaded from: classes.dex */
public final class C1684f extends AbstractC1679a {
    @Override // com.efs.sdk.base.core.p052c.p053a.AbstractC1679a
    /* renamed from: a */
    public final void mo7648a(LogDto logDto) {
        double d10;
        boolean z10;
        Double d11;
        C1698b m7679a = C1698b.m7679a();
        String logType = logDto.getLogType();
        RemoteConfig remoteConfig = m7679a.f7118d;
        if (remoteConfig.mUploadSampleRateMap.containsKey(logType) && (d11 = remoteConfig.mUploadSampleRateMap.get(logType)) != null) {
            d10 = d11.doubleValue();
        } else {
            d10 = 100.0d;
        }
        if (C1698b.f7115a.nextDouble() * 100.0d <= d10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        m7649b(logDto);
    }
}
