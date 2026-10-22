package com.efs.sdk.base.core.p052c.p053a;

import com.efs.sdk.base.core.model.LogDto;
import com.efs.sdk.base.core.util.C1718b;
import com.efs.sdk.base.core.util.Log;

/* renamed from: com.efs.sdk.base.core.c.a.c */
/* loaded from: classes.dex */
public final class C1681c extends AbstractC1679a {
    /* renamed from: c */
    private static boolean m7650c(LogDto logDto) {
        if (logDto.isCp() || ((1 == logDto.getLogProtocol() && !logDto.isSendImediately()) || 1 == logDto.getLogBodyType())) {
            return true;
        }
        return false;
    }

    @Override // com.efs.sdk.base.core.p052c.p053a.AbstractC1679a
    /* renamed from: a */
    public final void mo7648a(LogDto logDto) {
        if (m7650c(logDto)) {
            m7649b(logDto);
            return;
        }
        byte[] m7765a = C1718b.m7765a(logDto.getData());
        if (m7765a == null) {
            Log.m7738w("efs.base", "gzip error");
            m7649b(logDto);
        } else {
            logDto.setData(m7765a);
            logDto.setCp("gzip");
            m7649b(logDto);
        }
    }
}
