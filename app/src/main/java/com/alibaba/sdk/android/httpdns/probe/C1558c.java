package com.alibaba.sdk.android.httpdns.probe;

/* renamed from: com.alibaba.sdk.android.httpdns.probe.c */
/* loaded from: classes.dex */
class C1558c {
    private String hostName;
    private String[] ips;

    /* renamed from: k */
    private long f6003k;

    /* renamed from: l */
    private long f6004l;

    /* renamed from: r */
    private String f6005r;

    /* renamed from: s */
    private String f6006s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1558c(String str, String[] strArr, String str2, String str3, long j10, long j11) {
        this.hostName = str;
        this.ips = strArr;
        this.f6005r = str2;
        this.f6006s = str3;
        this.f6003k = j10;
        this.f6004l = j11;
    }

    /* renamed from: c */
    public long m7204c() {
        return this.f6003k;
    }

    /* renamed from: d */
    public long m7205d() {
        return this.f6004l;
    }

    public String getHostName() {
        return this.hostName;
    }

    public String[] getIps() {
        return this.ips;
    }

    /* renamed from: j */
    public String m7206j() {
        return this.f6005r;
    }

    /* renamed from: k */
    public String m7207k() {
        return this.f6006s;
    }
}
