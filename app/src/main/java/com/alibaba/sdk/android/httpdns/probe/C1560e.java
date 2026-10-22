package com.alibaba.sdk.android.httpdns.probe;

import com.alibaba.sdk.android.httpdns.C1534c;
import com.alibaba.sdk.android.httpdns.C1545i;
import com.alibaba.sdk.android.httpdns.p044a.C1525a;
import com.alibaba.sdk.android.httpdns.p047d.C1538b;
import com.alibaba.sdk.android.httpdns.probe.IPProbeService;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.alibaba.sdk.android.httpdns.probe.e */
/* loaded from: classes.dex */
public class C1560e implements IPProbeService {

    /* renamed from: a */
    private AtomicLong f6009a = new AtomicLong(0);

    /* renamed from: c */
    private ConcurrentHashMap<String, Long> f6011c = new ConcurrentHashMap<>();

    /* renamed from: a */
    private InterfaceC1557b f6008a = null;

    /* renamed from: b */
    private InterfaceC1561f f6010b = new InterfaceC1561f() { // from class: com.alibaba.sdk.android.httpdns.probe.e.1
        @Override // com.alibaba.sdk.android.httpdns.probe.InterfaceC1561f
        /* renamed from: a */
        public void mo7213a(long j10, C1558c c1558c) {
            if (c1558c != null) {
                try {
                    if (C1560e.this.f6011c.containsKey(c1558c.getHostName()) && ((Long) C1560e.this.f6011c.get(c1558c.getHostName())).longValue() == j10) {
                        if (c1558c.getIps() != null && c1558c.m7206j() != null && c1558c.m7207k() != null && c1558c.getHostName() != null) {
                            C1545i.m7166e("defultId:" + c1558c.m7206j() + ", selectedIp:" + c1558c.m7207k() + ", promote:" + (c1558c.m7204c() - c1558c.m7205d()));
                            C1560e.this.m7212a(c1558c.getHostName(), c1558c.m7206j(), c1558c.m7207k(), c1558c.m7204c(), c1558c.m7205d(), c1558c.getIps().length);
                            C1560e.this.f6008a.mo7124a(c1558c.getHostName(), c1558c.getIps());
                            C1560e.this.f6011c.remove(c1558c.getHostName());
                        }
                    }
                    C1545i.m7165d("corresponding tasknumber not exists, drop the result");
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    };

    @Override // com.alibaba.sdk.android.httpdns.probe.IPProbeService
    public IPProbeService.EnumC1555a getProbeStatus(String str) {
        return this.f6011c.containsKey(str) ? IPProbeService.EnumC1555a.PROBING : IPProbeService.EnumC1555a.NO_PROBING;
    }

    @Override // com.alibaba.sdk.android.httpdns.probe.IPProbeService
    public void launchIPProbeTask(String str, int i10, String[] strArr) {
        if (!C1525a.m7056a().m7065f()) {
            C1545i.m7167f("ip probe is forbidden");
        } else {
            if (getProbeStatus(str) != IPProbeService.EnumC1555a.NO_PROBING) {
                C1545i.m7167f("already launch the same task, drop the task");
                return;
            }
            long addAndGet = this.f6009a.addAndGet(1L);
            this.f6011c.put(str, Long.valueOf(addAndGet));
            C1534c.m7102a().execute(new RunnableC1556a(addAndGet, str, strArr, i10, this.f6010b));
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.probe.IPProbeService
    public void setIPListUpdateCallback(InterfaceC1557b interfaceC1557b) {
        this.f6008a = interfaceC1557b;
    }

    @Override // com.alibaba.sdk.android.httpdns.probe.IPProbeService
    public boolean stopIPProbeTask(String str) {
        if (!this.f6011c.containsKey(str)) {
            return false;
        }
        C1545i.m7165d("stop ip probe task for host:" + str);
        this.f6011c.remove(str);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7212a(String str, String str2, String str3, long j10, long j11, int i10) {
        C1538b m7126a = C1538b.m7126a();
        if (m7126a != null) {
            m7126a.m7134a(str, str2, str3, j10, j11, i10);
        }
    }
}
