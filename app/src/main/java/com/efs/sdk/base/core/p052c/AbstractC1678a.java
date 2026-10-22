package com.efs.sdk.base.core.p052c;

import com.efs.sdk.base.core.model.LogDto;
import com.efs.sdk.base.core.p052c.p053a.AbstractC1679a;
import com.efs.sdk.base.core.util.Log;

/* renamed from: com.efs.sdk.base.core.c.a */
/* loaded from: classes.dex */
public abstract class AbstractC1678a {

    /* renamed from: a */
    private AbstractC1679a f7064a;

    /* renamed from: a */
    public abstract AbstractC1679a mo7646a();

    /* renamed from: a */
    public final void m7647a(LogDto logDto) {
        try {
            if (this.f7064a == null) {
                synchronized (this) {
                    if (this.f7064a == null) {
                        AbstractC1679a mo7646a = mo7646a();
                        this.f7064a = mo7646a;
                        if (mo7646a == null) {
                            return;
                        }
                    }
                }
            }
            this.f7064a.mo7648a(logDto);
        } catch (Throwable th) {
            Log.m7727e("efs.processor", "log handle error", th);
        }
    }
}
