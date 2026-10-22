package com.alibaba.sdk.android.httpdns;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.sdk.android.httpdns.net64.C1551a;
import com.alibaba.sdk.android.httpdns.p044a.C1525a;
import com.alibaba.sdk.android.httpdns.p045b.C1528b;
import com.alibaba.sdk.android.httpdns.p047d.C1538b;
import com.alibaba.sdk.android.httpdns.p047d.C1539c;
import com.alibaba.sdk.android.httpdns.p048e.C1541a;
import com.alibaba.sdk.android.httpdns.probe.IPProbeItem;
import com.alibaba.sdk.android.utils.AMSConfigUtils;
import com.alibaba.sdk.android.utils.AMSDevReporter;
import com.alibaba.sdk.android.utils.crashdefend.SDKMessageCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class HttpDns implements HttpDnsService {

    /* renamed from: a */
    public static final /* synthetic */ int f5864a = 0;
    private boolean isExpiredIPEnabled = false;
    private static C1536d hostManager = C1536d.m7110a();
    private static DegradationFilter degradationFilter = null;
    static HttpDns instance = null;
    private static boolean inited = false;
    private static String sAccountId = null;
    private static String sSecretKey = null;
    private static Context sContext = null;

    private HttpDns(Context context, String str) {
        C1542f.m7161c(str);
        C1525a.m7056a().m7064c(context, str);
        C1525a.m7056a().m7063a(C1538b.m7127a(context));
    }

    private static void disableReport() {
        C1538b.m7126a().m7143k();
    }

    private static String getAccountId() {
        if (!TextUtils.isEmpty(sAccountId)) {
            return sAccountId;
        }
        String accountId = AMSConfigUtils.getAccountId(sContext);
        sAccountId = accountId;
        return accountId;
    }

    private String getIpByHost(String str) {
        if (!C1526b.m7068a()) {
            C1545i.m7167f("HttpDns service turned off");
            return null;
        }
        String[] ipsByHost = getIpsByHost(str);
        if (ipsByHost != null && ipsByHost.length > 0) {
            return ipsByHost[0];
        }
        return null;
    }

    private String[] getIpsByHost(String str) {
        if (!C1526b.m7068a()) {
            C1545i.m7167f("HttpDns service turned off");
        } else {
            if (!C1548l.m7171b(str)) {
                return C1542f.f5953c;
            }
            if (C1548l.m7172c(str)) {
                return new String[]{str};
            }
            DegradationFilter degradationFilter2 = degradationFilter;
            if (degradationFilter2 != null && degradationFilter2.shouldDegradeHttpDNS(str)) {
                return C1542f.f5953c;
            }
            if (C1566u.m7235e()) {
                return getIpsByHostAsync(str);
            }
            C1540e m7117a = hostManager.m7117a(str);
            if (m7117a != null && m7117a.m7154b() && this.isExpiredIPEnabled) {
                if (!hostManager.m7122a(str)) {
                    C1545i.m7165d("refresh host async: " + str);
                    C1534c.m7102a().submit(new CallableC1563q(str, EnumC1564s.QUERY_HOST));
                }
                return m7117a.getIps();
            }
            if (m7117a != null && !m7117a.m7154b()) {
                return m7117a.getIps();
            }
            C1545i.m7165d("refresh host sync: " + str);
            try {
                return (String[]) C1534c.m7102a().submit(new CallableC1563q(str, EnumC1564s.QUERY_HOST)).get();
            } catch (Exception e10) {
                C1545i.m7163a(e10);
            }
        }
        return C1542f.f5953c;
    }

    private static String getSecretKey() {
        if (!TextUtils.isEmpty(sSecretKey)) {
            return sSecretKey;
        }
        String httpdnsSecretKey = AMSConfigUtils.getHttpdnsSecretKey(sContext);
        sSecretKey = httpdnsSecretKey;
        return httpdnsSecretKey;
    }

    public static synchronized HttpDnsService getService(Context context) {
        HttpDns httpDns;
        synchronized (HttpDns.class) {
            if (instance == null && context != null) {
                Context applicationContext = context.getApplicationContext();
                sContext = applicationContext;
                C1526b.m7066a(applicationContext);
                C1538b.m7127a(sContext).m7135a(new SDKMessageCallback() { // from class: com.alibaba.sdk.android.httpdns.HttpDns.3
                    @Override // com.alibaba.sdk.android.utils.crashdefend.SDKMessageCallback
                    public void crashDefendMessage(int i10, int i11) {
                        boolean unused = HttpDns.inited = true;
                        if (i10 > i11) {
                            C1526b.m7069b(true);
                        } else {
                            C1545i.m7167f("crash limit exceeds, httpdns disabled");
                            C1526b.m7069b(false);
                        }
                    }
                });
                if (!inited) {
                    C1545i.m7167f("sdk crash defend not returned");
                }
                if (C1526b.m7068a()) {
                    initHttpDns(sContext, getAccountId(), getSecretKey());
                } else {
                    instance = new HttpDns(sContext, getAccountId());
                }
            }
            httpDns = instance;
        }
        return httpDns;
    }

    private static void initHttpDns(Context context, String str, String str2) {
        if (instance == null) {
            HashMap hashMap = new HashMap();
            hashMap.put(AMSDevReporter.AMSSdkExtInfoKeyEnum.AMS_EXTINFO_KEY_VERSION.toString(), "1.3.2.3-no-bssid-ssid");
            AMSDevReporter.asyncReport(context, AMSDevReporter.AMSSdkTypeEnum.AMS_HTTPDNS, hashMap);
            C1554p.setContext(context);
            CallableC1563q.setContext(context);
            C1528b.m7074a(context);
            C1528b.m7079b(context);
            C1566u.m7227a(context);
            C1550n.m7176a().m7184a(context, str);
            if (!TextUtils.isEmpty(str2)) {
                C1524a.setSecretKey(str2);
            }
            reportActive(context, str);
            instance = new HttpDns(context, str);
        }
    }

    private static void reportActive(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            C1545i.m7167f("report active failed due to missing context or accountid");
        } else {
            C1538b.m7127a(context).setAccountId(str);
            C1538b.m7127a(context).m7145l();
        }
    }

    private static void reportHttpDnsSuccess(String str, int i10) {
        C1538b m7126a = C1538b.m7126a();
        if (m7126a != null) {
            m7126a.m7129a(str, i10, C1539c.m7146a(), C1528b.m7078a() ? 1 : 0);
        }
    }

    private static void reportUserGetIP(String str, int i10) {
        C1538b m7126a = C1538b.m7126a();
        if (m7126a != null) {
            m7126a.m7136b(str, i10, C1539c.m7146a(), C1528b.m7078a() ? 1 : 0);
        }
    }

    private static void setAccountId(String str) {
        sAccountId = str;
    }

    private static void setSecretKey(String str) {
        sSecretKey = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void switchDnsService(boolean z10) {
        synchronized (HttpDns.class) {
            C1526b.m7067a(z10);
            if (!C1526b.m7068a()) {
                C1545i.m7167f("httpdns service disabled");
            }
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void clearSdnsGlobalParams() {
        C1542f.clearSdnsGlobalParams();
    }

    @Override // com.alibaba.sdk.android.httpdns.net64.Net64Service
    public void enableIPv6(boolean z10) {
        C1551a.m7191a().enableIPv6(z10);
        try {
            C1538b m7126a = C1538b.m7126a();
            if (m7126a != null) {
                m7126a.m7141e(z10 ? 1 : 0);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.net64.Net64Service
    public String getIPv6ByHostAsync(String str) {
        try {
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (!C1526b.m7068a()) {
            C1545i.m7167f("HttpDns service turned off");
            return null;
        }
        if (C1551a.m7191a().m7194a()) {
            getIpsByHostAsync(str);
            C1540e m7117a = hostManager.m7117a(str);
            if (m7117a != null) {
                String iPv6ByHostAsync = C1551a.m7191a().getIPv6ByHostAsync(str);
                if (this.isExpiredIPEnabled) {
                    C1545i.m7165d("ipv6 is expired enable, hostName: " + str + " ipv6: " + iPv6ByHostAsync);
                    return iPv6ByHostAsync;
                }
                if (!m7117a.m7154b()) {
                    C1545i.m7165d("ipv6 is not expired, hostName: " + str + " ipv6: " + iPv6ByHostAsync);
                    return iPv6ByHostAsync;
                }
                if (!m7117a.m7155c()) {
                    C1545i.m7165d("ipv6 is expired.");
                    return null;
                }
                C1545i.m7165d("ipv6 is from cache, hostName: " + str + " ipv6: " + iPv6ByHostAsync);
                return iPv6ByHostAsync;
            }
        }
        return null;
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public String getIpByHostAsync(String str) {
        try {
            if (!C1526b.m7068a()) {
                C1545i.m7167f("HttpDns service turned off");
                return null;
            }
            String[] ipsByHostAsync = getIpsByHostAsync(str);
            if (ipsByHostAsync != null && ipsByHostAsync.length > 0) {
                return ipsByHostAsync[0];
            }
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (r3 != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.alibaba.sdk.android.httpdns.HTTPDNSResult getIpsByHostAsync(java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.httpdns.HttpDns.getIpsByHostAsync(java.lang.String, java.util.Map, java.lang.String):com.alibaba.sdk.android.httpdns.HTTPDNSResult");
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public String getSessionId() {
        return C1541a.m7156a().getSessionId();
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setAuthCurrentTime(long j10) {
        if (C1526b.m7068a()) {
            C1524a.setAuthCurrentTime(j10);
        } else {
            C1545i.m7167f("HttpDns service turned off");
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setCachedIPEnabled(boolean z10) {
        setCachedIPEnabled(z10, true);
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setDegradationFilter(DegradationFilter degradationFilter2) {
        if (C1526b.m7068a()) {
            degradationFilter = degradationFilter2;
        } else {
            C1545i.m7167f("HttpDns service turned off");
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setExpiredIPEnabled(boolean z10) {
        if (!C1526b.m7068a()) {
            C1545i.m7167f("HttpDns service turned off");
            return;
        }
        this.isExpiredIPEnabled = z10;
        C1538b m7126a = C1538b.m7126a();
        if (m7126a != null) {
            m7126a.m7140d(z10 ? 1 : 0);
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setHTTPSRequestEnabled(boolean z10) {
        if (C1526b.m7068a()) {
            C1542f.setHTTPSRequestEnabled(z10);
        } else {
            C1545i.m7167f("HttpDns service turned off");
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setIPProbeList(List<IPProbeItem> list) {
        if (C1526b.m7068a()) {
            C1542f.m7159a(list);
        } else {
            C1545i.m7167f("HttpDns service turned off");
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setLogEnabled(boolean z10) {
        C1545i.setLogEnabled(z10);
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setLogger(ILogger iLogger) {
        C1545i.setLogger(iLogger);
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setPreResolveAfterNetworkChanged(boolean z10) {
        if (C1526b.m7068a()) {
            C1554p.f5995i = z10;
        } else {
            C1545i.m7167f("HttpDns service turned off");
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setPreResolveHosts(ArrayList<String> arrayList) {
        if (!C1526b.m7068a()) {
            C1545i.m7167f("HttpDns service turned off");
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            String str = arrayList.get(i10);
            if (C1548l.m7171b(str) && !hostManager.m7122a(str)) {
                C1534c.m7102a().submit(new CallableC1563q(str, EnumC1564s.QUERY_HOST));
            }
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setRegion(String str) {
        if (!C1526b.m7068a()) {
            C1545i.m7167f("HttpDns service turned off");
        } else if (TextUtils.isEmpty(str)) {
            C1545i.m7167f("region cannot be empty");
        } else {
            C1550n.m7176a().m7187b(sContext, str);
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setSdnsGlobalParams(Map<String, String> map) {
        C1542f.setSdnsGlobalParams(map);
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setTimeoutInterval(int i10) {
        if (C1526b.m7068a()) {
            C1542f.setTimeoutInterval(i10);
        } else {
            C1545i.m7167f("HttpDns service turned off");
        }
    }

    public static synchronized HttpDnsService getService(Context context, String str) {
        HttpDns httpDns;
        synchronized (HttpDns.class) {
            if (instance == null && context != null) {
                sContext = context.getApplicationContext();
                setAccountId(str);
                C1526b.m7066a(sContext);
                C1538b.m7127a(sContext).m7135a(new SDKMessageCallback() { // from class: com.alibaba.sdk.android.httpdns.HttpDns.1
                    @Override // com.alibaba.sdk.android.utils.crashdefend.SDKMessageCallback
                    public void crashDefendMessage(int i10, int i11) {
                        boolean unused = HttpDns.inited = true;
                        if (i10 > i11) {
                            C1526b.m7069b(true);
                        } else {
                            C1545i.m7167f("crash limit exceeds, httpdns disabled");
                            C1526b.m7069b(false);
                        }
                    }
                });
                if (!inited) {
                    C1545i.m7167f("sdk crash defend not returned");
                }
                if (C1526b.m7068a()) {
                    initHttpDns(sContext, getAccountId(), getSecretKey());
                } else {
                    instance = new HttpDns(sContext, getAccountId());
                }
            }
            httpDns = instance;
        }
        return httpDns;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if (r3 != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String[] getIpsByHostAsync(java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.httpdns.HttpDns.getIpsByHostAsync(java.lang.String):java.lang.String[]");
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setCachedIPEnabled(boolean z10, boolean z11) {
        try {
            if (!C1526b.m7068a()) {
                C1545i.m7167f("HttpDns service turned off");
                return;
            }
            C1545i.m7167f("Httpdns DB cache enable = " + z10 + ". autoCleanCacheAfterLoad = " + z11);
            C1528b.m7077a(z10, z11);
            C1536d.m7110a().m7119a();
            C1538b m7126a = C1538b.m7126a();
            if (m7126a != null) {
                m7126a.m7139c(z10 ? 1 : 0);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static synchronized HttpDnsService getService(Context context, String str, String str2) {
        HttpDns httpDns;
        synchronized (HttpDns.class) {
            if (instance == null && context != null) {
                sContext = context.getApplicationContext();
                setAccountId(str);
                setSecretKey(str2);
                C1526b.m7066a(sContext);
                C1538b.m7127a(sContext).m7135a(new SDKMessageCallback() { // from class: com.alibaba.sdk.android.httpdns.HttpDns.2
                    @Override // com.alibaba.sdk.android.utils.crashdefend.SDKMessageCallback
                    public void crashDefendMessage(int i10, int i11) {
                        boolean unused = HttpDns.inited = true;
                        if (i10 > i11) {
                            C1526b.m7069b(true);
                        } else {
                            C1545i.m7167f("crash limit exceeds, httpdns disabled");
                            C1526b.m7069b(false);
                        }
                    }
                });
                if (!inited) {
                    C1545i.m7167f("sdk crash defend not returned");
                }
                if (C1526b.m7068a()) {
                    initHttpDns(sContext, getAccountId(), getSecretKey());
                } else {
                    instance = new HttpDns(sContext, getAccountId());
                }
            }
            httpDns = instance;
        }
        return httpDns;
    }
}
