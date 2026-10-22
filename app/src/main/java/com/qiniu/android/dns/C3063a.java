package com.qiniu.android.dns;

/* renamed from: com.qiniu.android.dns.a */
/* loaded from: classes2.dex */
public final class C3063a {

    /* renamed from: c */
    public static final C3063a f12568c = new C3063a(a.NO_NETWORK, 0);

    /* renamed from: d */
    public static final C3063a f12569d = new C3063a(a.WIFI, 0);

    /* renamed from: a */
    public final int f12570a;

    /* renamed from: b */
    public final a f12571b;

    /* renamed from: com.qiniu.android.dns.a$a */
    /* loaded from: classes2.dex */
    public enum a {
        NO_NETWORK,
        WIFI,
        MOBILE
    }

    public C3063a(a aVar, int i10) {
        this.f12571b = aVar;
        this.f12570a = i10;
    }
}
