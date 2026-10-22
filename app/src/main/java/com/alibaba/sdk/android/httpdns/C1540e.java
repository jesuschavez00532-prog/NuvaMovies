package com.alibaba.sdk.android.httpdns;

import android.text.Html;
import com.alibaba.sdk.android.httpdns.net64.C1551a;
import com.alibaba.sdk.android.httpdns.p045b.C1528b;
import com.alibaba.sdk.android.httpdns.p045b.C1529c;
import com.alibaba.sdk.android.httpdns.p045b.C1531e;
import com.alibaba.sdk.android.httpdns.p045b.C1533g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.alibaba.sdk.android.httpdns.e */
/* loaded from: classes.dex */
public class C1540e {

    /* renamed from: a */
    private String f5942a;

    /* renamed from: b */
    private long f5943b;

    /* renamed from: b */
    private String f5944b;

    /* renamed from: c */
    private long f5945c;
    private String hostName;
    private String[] ips;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1540e(C1531e c1531e) {
        this.hostName = c1531e.host;
        this.f5945c = C1529c.m7083a(c1531e.f5890n);
        this.f5943b = -1000L;
        ArrayList<C1533g> arrayList = c1531e.f5885a;
        if (arrayList != null && arrayList.size() > 0) {
            int size = c1531e.f5885a.size();
            this.ips = new String[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.ips[i10] = c1531e.f5885a.get(i10).f5893o;
            }
        }
        if (C1551a.m7191a().m7194a()) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList<C1533g> arrayList3 = c1531e.f5887b;
            if (arrayList3 != null && arrayList3.size() > 0) {
                for (int i11 = 0; i11 < c1531e.f5887b.size(); i11++) {
                    arrayList2.add(c1531e.f5887b.get(i11).f5893o);
                }
            }
            C1551a.m7191a().m7193a(this.hostName, arrayList2);
        }
        this.f5942a = c1531e.f5884a;
        this.f5944b = c1531e.f5886b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public long m7149a() {
        return this.f5943b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public long m7153b() {
        return this.f5945c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m7155c() {
        return m7149a() == -1000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getCacheKey() {
        return this.f5944b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String[] getIps() {
        return this.ips;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCacheKey(String str) {
        this.f5944b = str;
    }

    public String toString() {
        String str = "host: " + this.hostName + " ip cnt: " + this.ips.length + " ttl: " + this.f5943b;
        for (int i10 = 0; i10 < this.ips.length; i10++) {
            str = str + "\n ip: " + this.ips[i10];
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1540e(String str) {
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject(str);
        this.hostName = jSONObject.getString("host");
        try {
            if (jSONObject.has("ips")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("ips");
                int length = jSONArray2.length();
                this.ips = new String[length];
                for (int i10 = 0; i10 < length; i10++) {
                    this.ips[i10] = jSONArray2.getString(i10);
                }
            }
            if (C1551a.m7191a().m7194a() && jSONObject.has("ipsv6") && (jSONArray = jSONObject.getJSONArray("ipsv6")) != null) {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    arrayList.add(jSONArray.getString(i11));
                }
                C1551a.m7191a().m7193a(this.hostName, arrayList);
            }
            if (jSONObject.has("extra")) {
                this.f5942a = jSONObject.getString("extra");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f5943b = jSONObject.getLong("ttl");
        this.f5945c = System.currentTimeMillis() / 1000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C1531e m7150a() {
        List<String> m7192a;
        C1531e c1531e = new C1531e();
        c1531e.host = this.hostName;
        c1531e.f5890n = String.valueOf(this.f5945c);
        c1531e.f5889m = C1528b.m7082i();
        String[] strArr = this.ips;
        if (strArr != null && strArr.length > 0) {
            c1531e.f5885a = new ArrayList<>();
            for (String str : this.ips) {
                C1533g c1533g = new C1533g();
                c1533g.f5893o = str;
                c1533g.f5894p = String.valueOf(this.f5943b);
                c1531e.f5885a.add(c1533g);
            }
        }
        if (C1551a.m7191a().m7194a() && (m7192a = C1551a.m7191a().m7192a(this.hostName)) != null && m7192a.size() > 0) {
            c1531e.f5887b = new ArrayList<>();
            for (String str2 : m7192a) {
                C1533g c1533g2 = new C1533g();
                c1533g2.f5893o = str2;
                c1533g2.f5894p = String.valueOf(this.f5943b);
                c1531e.f5887b.add(c1533g2);
            }
        }
        c1531e.f5884a = this.f5942a;
        c1531e.f5886b = this.f5944b;
        return c1531e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m7154b() {
        return m7153b() + m7149a() < System.currentTimeMillis() / 1000 || m7155c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1540e(String str, String[] strArr, long j10, long j11, String str2, String str3) {
        this.hostName = str;
        this.ips = strArr;
        this.f5943b = j10;
        this.f5945c = j11;
        this.f5942a = str2;
        this.f5944b = str3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m7151a() {
        return this.f5942a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Map<String, String> m7152a() {
        HashMap hashMap = new HashMap();
        if (this.f5942a != null) {
            try {
                JSONObject jSONObject = new JSONObject(Html.fromHtml(Html.fromHtml(this.f5942a).toString()).toString());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.get(next) == null ? null : jSONObject.get(next).toString());
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return hashMap;
    }
}
