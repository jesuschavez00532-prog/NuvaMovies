package com.alibaba.sdk.android.httpdns;

import com.alibaba.sdk.android.httpdns.probe.IPProbeItem;
import com.umeng.analytics.pro.C3330by;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.alibaba.sdk.android.httpdns.f */
/* loaded from: classes.dex */
class C1542f {

    /* renamed from: c */
    static String f5952c;

    /* renamed from: a */
    static String[] f5950a = {"203.107.1.1"};

    /* renamed from: b */
    static final String[] f5951b = {"203.107.1.97", "203.107.1.100", "httpdns-sc.aliyuncs.com"};

    /* renamed from: c */
    static final String[] f5953c = new String[0];

    /* renamed from: d */
    static String f5954d = "80";
    static String PROTOCOL = "http://";

    /* renamed from: a */
    static int f5948a = C3330by.f14355b;
    static Map<String, String> extra = new HashMap();

    /* renamed from: a */
    static List<IPProbeItem> f5949a = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized void m7159a(List<IPProbeItem> list) {
        synchronized (C1542f.class) {
            f5949a = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static synchronized void m7161c(String str) {
        synchronized (C1542f.class) {
            f5952c = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void clearSdnsGlobalParams() {
        synchronized (C1542f.class) {
            extra.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void setHTTPSRequestEnabled(boolean z10) {
        String str;
        synchronized (C1542f.class) {
            if (z10) {
                PROTOCOL = "https://";
                str = "443";
            } else {
                PROTOCOL = "http://";
                str = "80";
            }
            f5954d = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void setSdnsGlobalParams(Map<String, String> map) {
        synchronized (C1542f.class) {
            extra.putAll(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void setTimeoutInterval(int i10) {
        synchronized (C1542f.class) {
            if (i10 > 0) {
                f5948a = i10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized boolean m7160a(String[] strArr) {
        synchronized (C1542f.class) {
            if (strArr != null) {
                if (strArr.length != 0) {
                    f5950a = strArr;
                    C1545i.m7165d("serverIps:" + Arrays.toString(f5950a));
                    return true;
                }
            }
            return false;
        }
    }
}
