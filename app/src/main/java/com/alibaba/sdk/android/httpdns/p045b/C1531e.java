package com.alibaba.sdk.android.httpdns.p045b;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.alibaba.sdk.android.httpdns.b.e */
/* loaded from: classes.dex */
public class C1531e {

    /* renamed from: a */
    public String f5884a;

    /* renamed from: a */
    public ArrayList<C1533g> f5885a;

    /* renamed from: b */
    public String f5886b;

    /* renamed from: b */
    public ArrayList<C1533g> f5887b;
    public String host;

    /* renamed from: id */
    public long f5888id;

    /* renamed from: m */
    public String f5889m;

    /* renamed from: n */
    public String f5890n;

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("[HostRecord] ");
        sb2.append("id:");
        sb2.append(this.f5888id);
        sb2.append("|");
        sb2.append("host:");
        sb2.append(this.host);
        sb2.append("|");
        sb2.append("sp:");
        sb2.append(this.f5889m);
        sb2.append("|");
        sb2.append("time:");
        sb2.append(this.f5890n);
        sb2.append("|");
        sb2.append("ips:");
        ArrayList<C1533g> arrayList = this.f5885a;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<C1533g> it = this.f5885a.iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
            }
        }
        sb2.append("|");
        sb2.append("ipsv6:");
        ArrayList<C1533g> arrayList2 = this.f5887b;
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator<C1533g> it2 = this.f5887b.iterator();
            while (it2.hasNext()) {
                sb2.append(it2.next());
            }
        }
        sb2.append("|");
        sb2.append("extra:");
        sb2.append(this.f5884a);
        sb2.append("|");
        sb2.append("cacheKey:");
        sb2.append(this.f5886b);
        sb2.append("|");
        return sb2.toString();
    }
}
