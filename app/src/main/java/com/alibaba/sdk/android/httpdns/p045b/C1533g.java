package com.alibaba.sdk.android.httpdns.p045b;

/* renamed from: com.alibaba.sdk.android.httpdns.b.g */
/* loaded from: classes.dex */
public class C1533g {

    /* renamed from: i */
    public long f5891i;

    /* renamed from: id */
    public long f5892id;

    /* renamed from: o */
    public String f5893o;

    /* renamed from: p */
    public String f5894p;

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("[IpRecord] ");
        sb2.append("id:");
        sb2.append(this.f5892id);
        sb2.append("|");
        sb2.append("host_id:");
        sb2.append(this.f5891i);
        sb2.append("|");
        sb2.append("ip:");
        sb2.append(this.f5893o);
        sb2.append("|");
        sb2.append("ttl:");
        sb2.append(this.f5894p);
        sb2.append("|");
        return sb2.toString();
    }
}
