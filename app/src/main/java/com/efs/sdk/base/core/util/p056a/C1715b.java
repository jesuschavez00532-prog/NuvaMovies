package com.efs.sdk.base.core.util.p056a;

import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.concurrent.InterfaceC1722c;
import com.efs.sdk.base.http.HttpEnv;
import com.efs.sdk.base.http.HttpResponse;
import java.io.File;
import java.util.Map;

/* renamed from: com.efs.sdk.base.core.util.a.b */
/* loaded from: classes.dex */
public final class C1715b implements InterfaceC1722c<HttpResponse> {

    /* renamed from: a */
    String f7194a;

    /* renamed from: b */
    Map<String, String> f7195b;

    /* renamed from: c */
    public byte[] f7196c;

    /* renamed from: d */
    public File f7197d;

    /* renamed from: e */
    public String f7198e;

    /* renamed from: f */
    public Map<String, String> f7199f;

    /* renamed from: g */
    public boolean f7200g = false;

    @Override // com.efs.sdk.base.core.util.concurrent.InterfaceC1722c
    /* renamed from: a */
    public final /* synthetic */ HttpResponse mo7759a() {
        String str = this.f7198e;
        str.hashCode();
        if (!str.equals("get")) {
            if (!str.equals("post")) {
                Log.m7726e("efs.util.http", "request not support method '" + this.f7198e + "'");
                return null;
            }
            byte[] bArr = this.f7196c;
            if (bArr != null && bArr.length > 0) {
                if (this.f7200g) {
                    return HttpEnv.getInstance().getHttpUtil().postAsFile(this.f7194a, this.f7195b, this.f7196c);
                }
                return HttpEnv.getInstance().getHttpUtil().post(this.f7194a, this.f7195b, this.f7196c);
            }
            return HttpEnv.getInstance().getHttpUtil().post(this.f7194a, this.f7195b, this.f7197d);
        }
        return HttpEnv.getInstance().getHttpUtil().get(this.f7194a, this.f7195b);
    }
}
