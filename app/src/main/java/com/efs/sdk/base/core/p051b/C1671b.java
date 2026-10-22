package com.efs.sdk.base.core.p051b;

import com.efs.sdk.base.core.config.remote.C1698b;
import com.efs.sdk.base.core.model.LogDto;
import com.efs.sdk.base.core.p050a.C1666a;
import com.efs.sdk.base.core.p050a.C1668c;
import com.efs.sdk.base.core.util.FileUtil;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.http.HttpResponse;

/* renamed from: com.efs.sdk.base.core.b.b */
/* loaded from: classes.dex */
public final class C1671b implements InterfaceC1673d {
    @Override // com.efs.sdk.base.core.p051b.InterfaceC1673d
    /* renamed from: a */
    public final HttpResponse mo7629a(LogDto logDto, boolean z10) {
        HttpResponse httpResponse;
        C1668c m7621a = C1668c.m7621a();
        m7621a.f7020d = logDto.getCp();
        m7621a.f7021e = logDto.getDe();
        m7621a.f7023g = logDto.getLogProtocol();
        m7621a.f7024h = logDto.getLogType();
        m7621a.f7031o = logDto.getBodySize();
        String m7692a = C1698b.m7679a().m7692a(false);
        Log.m7730i("efs.LogSendAction.Codelog", "send data url is ".concat(String.valueOf(m7692a)));
        if (logDto.getLogBodyType() == 0) {
            httpResponse = C1666a.m7610a().m7615a(m7692a, m7621a, logDto.getData(), logDto.isLimitByFlow());
        } else if (1 == logDto.getLogBodyType()) {
            httpResponse = C1666a.m7610a().m7614a(m7692a, m7621a, logDto.getFile(), logDto.isLimitByFlow());
        } else {
            httpResponse = new HttpResponse();
        }
        if (httpResponse.succ && z10) {
            FileUtil.delete(logDto.getFile());
        }
        return httpResponse;
    }
}
