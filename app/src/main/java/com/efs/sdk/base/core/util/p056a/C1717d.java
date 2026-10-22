package com.efs.sdk.base.core.util.p056a;

import com.efs.sdk.base.core.util.concurrent.InterfaceC1721b;
import com.efs.sdk.base.http.AbsHttpListener;
import com.efs.sdk.base.http.HttpEnv;
import com.efs.sdk.base.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.efs.sdk.base.core.util.a.d */
/* loaded from: classes.dex */
public final class C1717d {

    /* renamed from: a */
    public C1715b f7202a;

    /* renamed from: b */
    private List<InterfaceC1721b<HttpResponse>> f7203b;

    public C1717d(String str) {
        C1715b c1715b = new C1715b();
        this.f7202a = c1715b;
        c1715b.f7194a = str;
    }

    /* renamed from: a */
    public final C1717d m7764a(Map<String, String> map) {
        this.f7202a.f7195b = map;
        return this;
    }

    /* renamed from: a */
    public final C1717d m7763a(String str, String str2) {
        C1715b c1715b = this.f7202a;
        if (c1715b.f7199f == null) {
            c1715b.f7199f = new HashMap(5);
        }
        this.f7202a.f7199f.put(str, str2);
        return this;
    }

    /* renamed from: a */
    public final C1717d m7762a(AbsHttpListener absHttpListener) {
        if (this.f7203b == null) {
            this.f7203b = new ArrayList(5);
        }
        this.f7203b.add(absHttpListener);
        return this;
    }

    /* renamed from: a */
    public final C1716c m7761a() {
        C1716c c1716c = new C1716c(this.f7202a);
        List<InterfaceC1721b<HttpResponse>> list = this.f7203b;
        if (list != null && list.size() > 0) {
            c1716c.m7770a(this.f7203b);
        }
        List<InterfaceC1721b<HttpResponse>> httpListenerList = HttpEnv.getInstance().getHttpListenerList();
        if (httpListenerList != null && httpListenerList.size() > 0) {
            c1716c.m7770a(httpListenerList);
        }
        return c1716c;
    }
}
