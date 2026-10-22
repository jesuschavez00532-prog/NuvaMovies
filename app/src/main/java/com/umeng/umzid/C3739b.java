package com.umeng.umzid;

import android.text.TextUtils;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* renamed from: com.umeng.umzid.b */
/* loaded from: classes3.dex */
public final class C3739b implements HostnameVerifier {

    /* renamed from: a */
    public final /* synthetic */ String f16771a;

    public C3739b(String str) {
        this.f16771a = str;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f16771a.equalsIgnoreCase(str) || "pre-aaid.umeng.com".equalsIgnoreCase(str);
    }
}
