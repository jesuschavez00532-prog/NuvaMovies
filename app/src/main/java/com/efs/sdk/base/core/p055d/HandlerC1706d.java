package com.efs.sdk.base.core.p055d;

import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.p055d.C1708f;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.efs.sdk.base.core.d.d */
/* loaded from: classes.dex */
public final class HandlerC1706d extends AbstractHandlerC1703a {

    /* renamed from: d */
    private AtomicInteger f7156d = new AtomicInteger(0);

    /* renamed from: e */
    private AtomicInteger f7157e = new AtomicInteger(0);

    /* renamed from: b */
    public AtomicInteger f7154b = new AtomicInteger(0);

    /* renamed from: f */
    private AtomicInteger f7158f = new AtomicInteger(0);

    /* renamed from: c */
    public AtomicInteger f7155c = new AtomicInteger(0);

    @Override // com.efs.sdk.base.core.p055d.AbstractHandlerC1703a
    /* renamed from: a */
    public final void mo7709a() {
        C1708f c1708f;
        if ((this.f7156d.get() != 0 || this.f7157e.get() != 0 || this.f7154b.get() != 0 || this.f7155c.get() != 0 || this.f7158f.get() != 0) && this.f7144a != null && ControllerCenter.getGlobalEnvStruct().isEnableWaStat()) {
            ControllerCenter controllerCenter = this.f7144a;
            int i10 = this.f7156d.get();
            int i11 = this.f7157e.get();
            int i12 = this.f7154b.get();
            int i13 = this.f7155c.get();
            int i14 = this.f7158f.get();
            c1708f = C1708f.a.f7163a;
            C1704b c1704b = new C1704b("efs_core", "lf_st", c1708f.f7159a.f7153c);
            c1704b.put("create_cnt", Integer.valueOf(i10));
            c1704b.put("cache_cnt", Integer.valueOf(i11));
            c1704b.put("req_cnt", Integer.valueOf(i12));
            c1704b.put("err_cnt", Integer.valueOf(i13));
            c1704b.put("expire_cnt", Integer.valueOf(i14));
            this.f7156d.addAndGet(i10 * (-1));
            this.f7157e.addAndGet(i11 * (-1));
            this.f7154b.addAndGet(i12 * (-1));
            this.f7155c.addAndGet(i13 * (-1));
            this.f7158f.addAndGet(i14 * (-1));
            controllerCenter.send(c1704b);
        }
    }

    /* renamed from: b */
    public final void m7710b() {
        this.f7156d.incrementAndGet();
    }

    /* renamed from: c */
    public final void m7711c() {
        this.f7157e.incrementAndGet();
    }

    /* renamed from: d */
    public final void m7712d() {
        this.f7158f.incrementAndGet();
    }
}
