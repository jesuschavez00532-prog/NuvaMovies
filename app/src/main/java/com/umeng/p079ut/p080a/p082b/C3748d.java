package com.umeng.p079ut.p080a.p082b;

import android.text.TextUtils;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* renamed from: com.umeng.ut.a.b.d */
/* loaded from: classes3.dex */
class C3748d implements HostnameVerifier {

    /* renamed from: a */
    public String f16784a;

    public C3748d(String str) {
        this.f16784a = str;
    }

    public boolean equals(Object obj) {
        if (TextUtils.isEmpty(this.f16784a) || !(obj instanceof C3748d)) {
            return false;
        }
        String str = ((C3748d) obj).f16784a;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f16784a.equals(str);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        return HttpsURLConnection.getDefaultHostnameVerifier().verify(this.f16784a, sSLSession);
    }
}
