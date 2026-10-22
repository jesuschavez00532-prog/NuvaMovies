package com.taobao.accs.p073ut.p074a;

import com.lzy.okgo.OkGo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;

/* renamed from: com.taobao.accs.ut.a.c */
/* loaded from: classes.dex */
public class C3183c {

    /* renamed from: a */
    public int f13100a;

    /* renamed from: b */
    public int f13101b;

    /* renamed from: f */
    public String f13105f;

    /* renamed from: g */
    public String f13106g;

    /* renamed from: h */
    public long f13107h;

    /* renamed from: i */
    public boolean f13108i;

    /* renamed from: j */
    public boolean f13109j;

    /* renamed from: k */
    private long f13110k = 0;

    /* renamed from: c */
    public boolean f13102c = false;

    /* renamed from: d */
    public int f13103d = 0;

    /* renamed from: e */
    public int f13104e = 0;

    /* renamed from: a */
    public void m12930a() {
        String str;
        String str2;
        long currentTimeMillis = System.currentTimeMillis();
        if (ALog.isPrintLog()) {
            ALog.m12938d("MonitorStatistic", "commitUT interval:" + (currentTimeMillis - this.f13110k) + " interval1:" + (currentTimeMillis - this.f13107h), new Object[0]);
        }
        if (currentTimeMillis - this.f13110k > 1200000 && currentTimeMillis - this.f13107h > OkGo.DEFAULT_MILLISECONDS) {
            HashMap hashMap = new HashMap();
            String str3 = null;
            try {
                String valueOf = String.valueOf(this.f13103d);
                try {
                    str2 = String.valueOf(this.f13104e);
                    try {
                        str = String.valueOf(Constants.SDK_VERSION_CODE);
                        try {
                            hashMap.put("connStatus", String.valueOf(this.f13100a));
                            hashMap.put("connType", String.valueOf(this.f13101b));
                            hashMap.put("tcpConnected", String.valueOf(this.f13102c));
                            hashMap.put("proxy", String.valueOf(this.f13105f));
                            hashMap.put("startServiceTime", String.valueOf(this.f13107h));
                            hashMap.put("commitTime", String.valueOf(currentTimeMillis));
                            hashMap.put("networkAvailable", String.valueOf(this.f13108i));
                            hashMap.put("threadIsalive", String.valueOf(this.f13109j));
                            hashMap.put("url", this.f13106g);
                            if (ALog.isPrintLog(ALog.Level.D)) {
                                try {
                                    ALog.m12938d("MonitorStatistic", UTMini.getCommitInfo(66001, valueOf, str2, str, hashMap), new Object[0]);
                                } catch (Throwable th) {
                                    th = th;
                                    str3 = valueOf;
                                    ALog.m12938d("MonitorStatistic", UTMini.getCommitInfo(66001, str3, str2, str, hashMap) + " " + th.toString(), new Object[0]);
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        str = null;
                    }
                    try {
                        UTMini.getInstance().commitEvent(66001, "MONITOR", valueOf, str2, str, hashMap);
                        this.f13110k = currentTimeMillis;
                    } catch (Throwable th4) {
                        th = th4;
                        str3 = valueOf;
                        str = str;
                        str2 = str2;
                        ALog.m12938d("MonitorStatistic", UTMini.getCommitInfo(66001, str3, str2, str, hashMap) + " " + th.toString(), new Object[0]);
                    }
                } catch (Throwable th5) {
                    th = th5;
                    str = null;
                    str2 = null;
                }
            } catch (Throwable th6) {
                th = th6;
                str = null;
                str2 = null;
            }
        }
    }
}
