package com.alibaba.sdk.android.httpdns.probe;

import com.alibaba.sdk.android.httpdns.C1534c;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.alibaba.sdk.android.httpdns.probe.a */
/* loaded from: classes.dex */
class RunnableC1556a implements Runnable {

    /* renamed from: a */
    private InterfaceC1561f f6000a;

    /* renamed from: b */
    private ConcurrentHashMap<String, Long> f6001b = new ConcurrentHashMap<>();
    private String host;
    private String[] ips;

    /* renamed from: j */
    private long f6002j;
    private int port;

    public RunnableC1556a(long j10, String str, String[] strArr, int i10, InterfaceC1561f interfaceC1561f) {
        this.f6002j = j10;
        this.host = str;
        this.ips = strArr;
        this.port = i10;
        this.f6000a = interfaceC1561f;
    }

    /* renamed from: a */
    private C1558c m7202a(String[] strArr) {
        String[] strArr2 = this.ips;
        if (strArr2 == null || strArr2.length == 0 || strArr == null || strArr.length == 0) {
            return null;
        }
        String str = strArr2[0];
        String str2 = strArr[0];
        return new C1558c(this.host, strArr, str, str2, this.f6001b.containsKey(str) ? this.f6001b.get(str).longValue() : 2147483647L, this.f6001b.containsKey(str2) ? this.f6001b.get(str2).longValue() : 2147483647L);
    }

    @Override // java.lang.Runnable
    public void run() {
        String[] m7203a;
        String[] strArr = this.ips;
        if (strArr == null || strArr.length == 0) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(this.ips.length);
        for (int i10 = 0; i10 < this.ips.length; i10++) {
            C1534c.m7102a().execute(new RunnableC1562g(this.ips[i10], this.port, countDownLatch, this.f6001b));
        }
        try {
            countDownLatch.await(10000L, TimeUnit.MILLISECONDS);
            if (this.f6000a == null || (m7203a = m7203a(this.f6001b)) == null || m7203a.length == 0) {
                return;
            }
            this.f6000a.mo7213a(this.f6002j, m7202a(m7203a));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: a */
    private String[] m7203a(ConcurrentHashMap<String, Long> concurrentHashMap) {
        if (concurrentHashMap == null) {
            return null;
        }
        int size = concurrentHashMap.size();
        String[] strArr = new String[size];
        Iterator<String> it = concurrentHashMap.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            strArr[i10] = new String(it.next());
            i10++;
        }
        for (int i11 = 0; i11 < size - 1; i11++) {
            int i12 = 0;
            while (i12 < (size - i11) - 1) {
                int i13 = i12 + 1;
                if (concurrentHashMap.get(strArr[i12]).longValue() > concurrentHashMap.get(strArr[i13]).longValue()) {
                    String str = strArr[i12];
                    strArr[i12] = strArr[i13];
                    strArr[i13] = str;
                }
                i12 = i13;
            }
        }
        return strArr;
    }
}
