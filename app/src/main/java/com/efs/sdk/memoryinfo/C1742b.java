package com.efs.sdk.memoryinfo;

import android.content.Context;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.protocol.record.EfsJSONLog;

/* renamed from: com.efs.sdk.memoryinfo.b */
/* loaded from: classes.dex */
final class C1742b {

    /* renamed from: a */
    final EfsReporter f7271a;

    /* renamed from: b */
    boolean f7272b = false;
    final Context mContext;

    public C1742b(Context context, EfsReporter efsReporter) {
        this.mContext = context.getApplicationContext();
        this.f7271a = efsReporter;
    }

    /* renamed from: a */
    static /* synthetic */ void m7808a(C1742b c1742b, C1745e c1745e, String str) {
        C1743c c1743c = new C1743c(c1742b.mContext);
        EfsJSONLog efsJSONLog = new EfsJSONLog("memperf");
        efsJSONLog.put("w_pgid", str);
        efsJSONLog.put("crver", "0.0.4.umeng");
        efsJSONLog.put("k_st", c1743c.f7287bg);
        efsJSONLog.put("w_url", c1743c.activity);
        efsJSONLog.put("wl_tpss", Long.valueOf(c1743c.f7288n));
        efsJSONLog.put("wl_jpss", Long.valueOf(c1743c.f7289o));
        efsJSONLog.put("wl_npss", Long.valueOf(c1743c.f7290p));
        efsJSONLog.put("wl_heap", Long.valueOf(c1743c.f7291q));
        efsJSONLog.put("wf_heap_used_rate", Float.valueOf(c1743c.f7292r));
        efsJSONLog.put("wl_graphics", Long.valueOf(c1743c.f7293s));
        efsJSONLog.put("wl_vmsize", Long.valueOf(c1743c.f7294t));
        synchronized (C1745e.class) {
            if (c1745e.f7303C) {
                c1745e.m7813a(efsJSONLog);
            } else {
                c1745e.f7302B.add(efsJSONLog);
            }
        }
    }
}
