package com.efs.sdk.base.core.p055d;

import com.efs.sdk.base.core.controller.ControllerCenter;
import com.taobao.accs.common.Constants;

/* renamed from: com.efs.sdk.base.core.d.f */
/* loaded from: classes.dex */
public final class C1708f {

    /* renamed from: a */
    public C1705c f7159a;

    /* renamed from: b */
    public ControllerCenter f7160b;

    /* renamed from: c */
    public HandlerC1706d f7161c;

    /* renamed from: d */
    public HandlerC1709g f7162d;

    /* renamed from: com.efs.sdk.base.core.d.f$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private static final C1708f f7163a = new C1708f(0);

        /* renamed from: a */
        public static /* synthetic */ C1708f m7718a() {
            return f7163a;
        }
    }

    /* synthetic */ C1708f(byte b10) {
        this();
    }

    /* renamed from: a */
    public final void m7717a(String str, String str2, String str3) {
        this.f7162d.m7719a(str, str2, str3);
    }

    private C1708f() {
        this.f7159a = new C1705c();
        this.f7161c = new HandlerC1706d();
        this.f7162d = new HandlerC1709g();
    }

    /* renamed from: a */
    public final void m7715a(int i10) {
        ControllerCenter controllerCenter = this.f7160b;
        if (controllerCenter != null) {
            controllerCenter.send(m7714a("flow_limit", i10));
        }
    }

    /* renamed from: a */
    public final void m7716a(int i10, String str) {
        if (this.f7160b != null || ControllerCenter.getGlobalEnvStruct().isEnableWaStat()) {
            C1704b m7714a = m7714a("flow_limit_type", i10);
            m7714a.put(Constants.KEY_HTTP_CODE, str);
            this.f7160b.send(m7714a);
        }
    }

    /* renamed from: a */
    public final C1704b m7714a(String str, int i10) {
        C1704b c1704b = new C1704b("efs_core", str, this.f7159a.f7153c);
        c1704b.put("cver", Integer.valueOf(i10));
        return c1704b;
    }
}
