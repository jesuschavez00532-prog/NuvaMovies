package com.alibaba.sdk.android.httpdns.net64;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.alibaba.sdk.android.httpdns.net64.a */
/* loaded from: classes.dex */
public class C1551a implements Net64Service {

    /* renamed from: a */
    private C1552b f5988a;

    /* renamed from: a */
    private ConcurrentHashMap<String, List<String>> f5989a;

    /* renamed from: o */
    private boolean f5990o;

    /* renamed from: p */
    private volatile boolean f5991p;

    /* renamed from: com.alibaba.sdk.android.httpdns.net64.a$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        private static final C1551a f5992a = new C1551a();
    }

    private C1551a() {
        this.f5988a = new C1552b();
        this.f5989a = new ConcurrentHashMap<>();
    }

    /* renamed from: a */
    public static C1551a m7191a() {
        return a.f5992a;
    }

    @Override // com.alibaba.sdk.android.httpdns.net64.Net64Service
    public void enableIPv6(boolean z10) {
        this.f5990o = z10;
    }

    @Override // com.alibaba.sdk.android.httpdns.net64.Net64Service
    public String getIPv6ByHostAsync(String str) {
        List<String> list;
        if (this.f5990o && (list = this.f5989a.get(str)) != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    /* renamed from: i */
    public boolean m7195i() {
        return this.f5991p;
    }

    /* renamed from: a */
    public List<String> m7192a(String str) {
        return this.f5989a.get(str);
    }

    /* renamed from: a */
    public void m7193a(String str, List<String> list) {
        this.f5989a.put(str, list);
    }

    /* renamed from: a */
    public boolean m7194a() {
        return this.f5990o;
    }
}
