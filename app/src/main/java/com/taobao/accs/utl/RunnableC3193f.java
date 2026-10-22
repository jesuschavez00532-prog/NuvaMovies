package com.taobao.accs.utl;

import android.content.Intent;
import anet.channel.appmonitor.AppMonitor;
import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.p073ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.utl.ALog;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.taobao.accs.utl.f */
/* loaded from: classes.dex */
public final class RunnableC3193f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ NetPerformanceMonitor f13182a;

    /* renamed from: b */
    final /* synthetic */ String f13183b;

    /* renamed from: c */
    final /* synthetic */ String f13184c;

    /* renamed from: d */
    final /* synthetic */ AccsDataListener f13185d;

    /* renamed from: e */
    final /* synthetic */ int f13186e;

    /* renamed from: f */
    final /* synthetic */ Intent f13187f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3193f(NetPerformanceMonitor netPerformanceMonitor, String str, String str2, AccsDataListener accsDataListener, int i10, Intent intent) {
        this.f13182a = netPerformanceMonitor;
        this.f13183b = str;
        this.f13184c = str2;
        this.f13185d = accsDataListener;
        this.f13186e = i10;
        this.f13187f = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        TaoBaseService.ExtraInfo m13001c;
        NetPerformanceMonitor netPerformanceMonitor = this.f13182a;
        if (netPerformanceMonitor != null) {
            netPerformanceMonitor.real_to_bz_date = System.currentTimeMillis();
        }
        ALog.Level level = ALog.Level.D;
        if (ALog.isPrintLog(level) || "accs-impaas".equals(this.f13183b)) {
            ALog.m12940e(C3188a.TAG, "onSendData start dataId:" + this.f13184c + " serviceId:" + this.f13183b, new Object[0]);
        }
        AccsDataListener accsDataListener = this.f13185d;
        String str = this.f13183b;
        String str2 = this.f13184c;
        int i10 = this.f13186e;
        m13001c = C3188a.m13001c(this.f13187f);
        accsDataListener.onSendData(str, str2, i10, m13001c);
        if (ALog.isPrintLog(level) || "accs-impaas".equals(this.f13183b)) {
            ALog.m12940e(C3188a.TAG, "onSendData end dataId:" + this.f13184c, new Object[0]);
        }
        AppMonitor.getInstance().commitStat(this.f13182a);
    }
}
