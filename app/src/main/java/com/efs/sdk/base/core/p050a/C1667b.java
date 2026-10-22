package com.efs.sdk.base.core.p050a;

import android.text.TextUtils;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.p055d.C1704b;
import com.efs.sdk.base.core.p055d.C1708f;
import com.efs.sdk.base.core.util.concurrent.InterfaceC1722c;
import com.efs.sdk.base.http.AbsHttpListener;
import com.efs.sdk.base.http.HttpResponse;
import java.util.Map;

/* renamed from: com.efs.sdk.base.core.a.b */
/* loaded from: classes.dex */
public final class C1667b extends AbsHttpListener {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.efs.sdk.base.core.a.b$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private static final C1667b f7016a = new C1667b(0);
    }

    /* synthetic */ C1667b(byte b10) {
        this();
    }

    @Override // com.efs.sdk.base.core.util.concurrent.InterfaceC1721b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo7619a(InterfaceC1722c<HttpResponse> interfaceC1722c, HttpResponse httpResponse) {
        HttpResponse httpResponse2 = httpResponse;
        if (httpResponse2 != null) {
            C1666a.m7610a();
            C1666a.m7612a(httpResponse2);
        }
    }

    @Override // com.efs.sdk.base.http.AbsHttpListener
    public final void onError(HttpResponse httpResponse) {
        if (httpResponse == null) {
            return;
        }
        m7618a(httpResponse);
    }

    @Override // com.efs.sdk.base.http.AbsHttpListener
    public final void onSuccess(HttpResponse httpResponse) {
        C1708f c1708f;
        m7618a(httpResponse);
        if (((Map) httpResponse.extra).containsKey("cver")) {
            String str = (String) ((Map) httpResponse.extra).get("cver");
            if (!TextUtils.isEmpty(str)) {
                int parseInt = Integer.parseInt(str);
                c1708f = C1708f.a.f7163a;
                if (c1708f.f7160b != null && ControllerCenter.getGlobalEnvStruct().isEnableWaStat()) {
                    C1704b c1704b = new C1704b("efs_core", "config_coverage", c1708f.f7159a.f7153c);
                    c1704b.put("cver", Integer.valueOf(parseInt));
                    c1708f.f7160b.send(c1704b);
                }
            }
        }
    }

    private C1667b() {
    }

    /* renamed from: a */
    public static C1667b m7617a() {
        return a.f7016a;
    }

    /* renamed from: a */
    private static void m7618a(HttpResponse httpResponse) {
        C1708f c1708f;
        c1708f = C1708f.a.f7163a;
        c1708f.m7717a(String.valueOf(httpResponse.getHttpCode()), httpResponse.getBizCode(), httpResponse.getReqUrl());
    }
}
