package com.efs.sdk.base.core.p052c.p053a;

import com.efs.sdk.base.Constants;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.model.LogDto;
import com.efs.sdk.base.core.p052c.C1685b;
import com.efs.sdk.base.processor.action.ILogEncryptAction;

/* renamed from: com.efs.sdk.base.core.c.a.d */
/* loaded from: classes.dex */
public final class C1682d extends AbstractC1679a {

    /* renamed from: b */
    private ILogEncryptAction f7066b;

    public C1682d() {
        if (ControllerCenter.getGlobalEnvStruct().getLogEncryptAction() == null) {
            this.f7066b = new C1685b();
        } else {
            this.f7066b = ControllerCenter.getGlobalEnvStruct().getLogEncryptAction();
        }
    }

    @Override // com.efs.sdk.base.core.p052c.p053a.AbstractC1679a
    /* renamed from: a */
    public final void mo7648a(LogDto logDto) {
        boolean z10 = true;
        if (!logDto.isDe() && !"wa".equals(logDto.getLogType()) && Constants.LOG_TYPE_CODELOGPERF.equals(logDto.getLogType()) && 1 != logDto.getLogBodyType()) {
            z10 = false;
        }
        if (z10) {
            m7649b(logDto);
            return;
        }
        byte[] encrypt = this.f7066b.encrypt(ControllerCenter.getGlobalEnvStruct().getSecret(), logDto.getData());
        if (encrypt != null) {
            logDto.setData(encrypt);
            logDto.setDe(this.f7066b.getDeVal());
        }
        m7649b(logDto);
    }
}
