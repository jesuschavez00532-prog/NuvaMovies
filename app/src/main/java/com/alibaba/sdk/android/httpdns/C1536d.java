package com.alibaba.sdk.android.httpdns;

import com.alibaba.sdk.android.httpdns.p045b.C1528b;
import com.alibaba.sdk.android.httpdns.p045b.C1529c;
import com.alibaba.sdk.android.httpdns.p045b.C1531e;
import com.alibaba.sdk.android.httpdns.p045b.C1533g;
import com.alibaba.sdk.android.httpdns.probe.C1559d;
import com.alibaba.sdk.android.httpdns.probe.IPProbeItem;
import com.alibaba.sdk.android.httpdns.probe.IPProbeService;
import com.alibaba.sdk.android.httpdns.probe.InterfaceC1557b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.alibaba.sdk.android.httpdns.d */
/* loaded from: classes.dex */
public class C1536d {

    /* renamed from: a */
    private static C1536d f5901a = new C1536d();

    /* renamed from: a */
    private static IPProbeService f5902a = C1559d.m7208a(new InterfaceC1557b() { // from class: com.alibaba.sdk.android.httpdns.d.1
        @Override // com.alibaba.sdk.android.httpdns.probe.InterfaceC1557b
        /* renamed from: a */
        public void mo7124a(String str, String[] strArr) {
            C1540e c1540e;
            if (str == null || strArr == null || strArr.length == 0 || (c1540e = (C1540e) C1536d.f5903a.get(str)) == null) {
                return;
            }
            C1540e c1540e2 = new C1540e(str, strArr, c1540e.m7149a(), c1540e.m7153b(), c1540e.m7151a(), c1540e.getCacheKey());
            C1536d.f5903a.put(str, c1540e2);
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < c1540e2.getIps().length; i10++) {
                sb2.append(c1540e2.getIps()[i10] + ",");
            }
            C1545i.m7167f("optimized host:" + str + ", ip:" + sb2.toString());
        }
    });

    /* renamed from: a */
    private static ConcurrentMap<String, C1540e> f5903a;

    /* renamed from: a */
    private static ConcurrentSkipListSet<String> f5904a;

    private C1536d() {
        f5903a = new ConcurrentHashMap();
        f5904a = new ConcurrentSkipListSet<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1536d m7110a() {
        return f5901a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m7116b() {
        List<C1531e> m7073a = C1528b.m7073a();
        String m7082i = C1528b.m7082i();
        for (C1531e c1531e : m7073a) {
            if (m7114a(c1531e)) {
                C1528b.m7080b(c1531e);
            } else if (m7082i.equals(c1531e.f5889m)) {
                c1531e.f5890n = String.valueOf(System.currentTimeMillis() / 1000);
                C1540e c1540e = new C1540e(c1531e);
                f5903a.put(c1531e.host, c1540e);
                if (C1528b.m7081g()) {
                    C1528b.m7080b(c1531e);
                }
                m7115a(c1531e.host, c1540e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clear() {
        f5903a.clear();
        f5904a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int count() {
        return f5903a.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C1540e m7117a(String str) {
        return f5903a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m7123b(String str) {
        f5904a.remove(str);
    }

    /* renamed from: a */
    private IPProbeItem m7111a(String str) {
        List<IPProbeItem> list = C1542f.f5949a;
        if (list == null) {
            return null;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (str.equals(list.get(i10).getHostName())) {
                return list.get(i10);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<String> m7118a() {
        return new ArrayList<>(f5903a.keySet());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m7119a() {
        if (C1528b.m7078a()) {
            C1534c.m7102a().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C1536d.this.m7116b();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m7120a(String str) {
        f5904a.add(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m7121a(String str, C1540e c1540e) {
        ArrayList<C1533g> arrayList;
        f5903a.put(str, c1540e);
        if (C1528b.m7078a()) {
            C1531e m7150a = c1540e.m7150a();
            ArrayList<C1533g> arrayList2 = m7150a.f5885a;
            if ((arrayList2 == null || arrayList2.size() <= 0) && ((arrayList = m7150a.f5887b) == null || arrayList.size() <= 0)) {
                C1528b.m7080b(m7150a);
            } else {
                C1528b.m7076a(m7150a);
            }
        }
        m7115a(str, c1540e);
    }

    /* renamed from: a */
    private boolean m7114a(C1531e c1531e) {
        return (System.currentTimeMillis() / 1000) - C1529c.m7083a(c1531e.f5890n) > 604800;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m7122a(String str) {
        return f5904a.contains(str);
    }

    /* renamed from: a */
    private boolean m7115a(String str, C1540e c1540e) {
        IPProbeItem m7111a;
        if (c1540e == null || c1540e.getIps() == null || c1540e.getIps().length <= 1 || f5902a == null || (m7111a = m7111a(str)) == null) {
            return false;
        }
        if (f5902a.getProbeStatus(str) == IPProbeService.EnumC1555a.PROBING) {
            f5902a.stopIPProbeTask(str);
        }
        C1545i.m7167f("START PROBE");
        f5902a.launchIPProbeTask(str, m7111a.getPort(), c1540e.getIps());
        return true;
    }
}
