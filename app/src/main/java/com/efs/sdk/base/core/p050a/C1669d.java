package com.efs.sdk.base.core.p050a;

import android.os.Message;
import android.text.TextUtils;
import com.efs.sdk.base.core.config.remote.C1698b;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.p051b.HandlerC1672c;
import com.efs.sdk.base.core.p055d.C1708f;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.concurrent.InterfaceC1722c;
import com.efs.sdk.base.core.util.p056a.C1715b;
import com.efs.sdk.base.http.AbsHttpListener;
import com.efs.sdk.base.http.HttpResponse;
import java.util.Map;

/* renamed from: com.efs.sdk.base.core.a.d */
/* loaded from: classes.dex */
public final class C1669d extends AbsHttpListener {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.efs.sdk.base.core.a.d$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private static final C1669d f7032a = new C1669d(0);
    }

    /* synthetic */ C1669d(byte b10) {
        this();
    }

    /* renamed from: b */
    private static void m7626b(HttpResponse httpResponse) {
        C1708f.a.m7718a().m7717a(String.valueOf(httpResponse.getHttpCode()), httpResponse.getBizCode(), httpResponse.getReqUrl());
    }

    /* renamed from: c */
    private static void m7627c(HttpResponse httpResponse) {
        int parseInt;
        if (!((Map) httpResponse.extra).containsKey("cver")) {
            return;
        }
        String str = (String) ((Map) httpResponse.extra).get("cver");
        if (!TextUtils.isEmpty(str) && (parseInt = Integer.parseInt(str)) > C1698b.m7679a().f7118d.mConfigVersion) {
            C1698b.m7679a().m7693a(parseInt);
        }
    }

    @Override // com.efs.sdk.base.core.util.concurrent.InterfaceC1721b
    /* renamed from: a */
    public final /* synthetic */ void mo7619a(InterfaceC1722c<HttpResponse> interfaceC1722c, HttpResponse httpResponse) {
        HttpResponse httpResponse2 = httpResponse;
        if (httpResponse2 != null) {
            C1715b c1715b = (C1715b) interfaceC1722c;
            ((Map) httpResponse2.extra).putAll(c1715b.f7199f);
            c1715b.f7199f.clear();
            C1666a.m7610a();
            C1666a.m7612a(httpResponse2);
        }
    }

    @Override // com.efs.sdk.base.http.AbsHttpListener
    public final void onError(HttpResponse httpResponse) {
        m7625a(httpResponse);
        if (httpResponse == null) {
            return;
        }
        m7626b(httpResponse);
        m7627c(httpResponse);
    }

    @Override // com.efs.sdk.base.http.AbsHttpListener
    public final void onSuccess(HttpResponse httpResponse) {
        String str;
        int i10;
        if (!((Map) httpResponse.extra).containsKey("flow_limit") || !Boolean.FALSE.toString().equals(((Map) httpResponse.extra).get("flow_limit"))) {
            if (((Map) httpResponse.extra).containsKey("type")) {
                str = (String) ((Map) httpResponse.extra).get("type");
            } else {
                str = "";
            }
            if (((Map) httpResponse.extra).containsKey("size")) {
                String str2 = (String) ((Map) httpResponse.extra).get("size");
                if (!TextUtils.isEmpty(str2)) {
                    i10 = Integer.parseInt(str2);
                    HandlerC1672c m7631a = HandlerC1672c.m7631a();
                    Message obtain = Message.obtain();
                    obtain.what = 0;
                    obtain.obj = str;
                    obtain.arg1 = i10;
                    m7631a.sendMessage(obtain);
                }
            }
            i10 = 0;
            HandlerC1672c m7631a2 = HandlerC1672c.m7631a();
            Message obtain2 = Message.obtain();
            obtain2.what = 0;
            obtain2.obj = str;
            obtain2.arg1 = i10;
            m7631a2.sendMessage(obtain2);
        }
        m7626b(httpResponse);
        C1708f.a.m7718a().f7161c.f7154b.incrementAndGet();
        m7627c(httpResponse);
        m7625a(httpResponse);
    }

    private C1669d() {
    }

    /* renamed from: a */
    public static C1669d m7624a() {
        return a.f7032a;
    }

    /* renamed from: a */
    private static void m7625a(HttpResponse httpResponse) {
        String str;
        if (ControllerCenter.getGlobalEnvStruct().isDebug()) {
            if (httpResponse == null) {
                str = "upload result : false";
            } else {
                str = "upload result : " + httpResponse.succ + ", resp is " + httpResponse.toString();
            }
            Log.m7730i("efs.px.api", str);
        }
    }
}
