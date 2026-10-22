package com.umeng.analytics.pro;

import android.text.TextUtils;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* renamed from: com.umeng.analytics.pro.ca */
/* loaded from: classes3.dex */
public class C3333ca {

    /* renamed from: a */
    private static final String f14377a = "HttpClient";

    /* renamed from: f */
    private static HostnameVerifier f14378f;

    /* renamed from: b */
    private String f14379b;

    /* renamed from: c */
    private a f14380c;

    /* renamed from: d */
    private Map<String, String> f14381d;

    /* renamed from: e */
    private InterfaceC3334cb f14382e;

    /* renamed from: com.umeng.analytics.pro.ca$a */
    /* loaded from: classes3.dex */
    public enum a {
        POST,
        GET
    }

    public C3333ca(String str, a aVar, Map<String, String> map, InterfaceC3334cb interfaceC3334cb) {
        this.f14379b = str;
        this.f14380c = aVar;
        this.f14381d = map;
        this.f14382e = interfaceC3334cb;
    }

    /* renamed from: a */
    private static HostnameVerifier m14013a() {
        if (f14378f == null) {
            f14378f = new HostnameVerifier() { // from class: com.umeng.analytics.pro.ca.1
                @Override // javax.net.ssl.HostnameVerifier
                public boolean verify(String str, SSLSession sSLSession) {
                    if (!TextUtils.isEmpty(str) && C3330by.f14354a.equalsIgnoreCase(str)) {
                        return true;
                    }
                    return false;
                }
            };
        }
        return f14378f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ef, code lost:
    
        if (r1 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ea, code lost:
    
        if (r1 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e5, code lost:
    
        if (r1 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e0, code lost:
    
        if (r1 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00db, code lost:
    
        if (r1 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d6, code lost:
    
        if (r1 == null) goto L62;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m14014a(int r6, java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3333ca.m14014a(int, java.lang.String):java.lang.String");
    }
}
