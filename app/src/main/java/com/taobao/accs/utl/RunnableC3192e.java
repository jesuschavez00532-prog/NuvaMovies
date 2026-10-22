package com.taobao.accs.utl;

import android.content.Intent;
import anet.channel.appmonitor.AppMonitor;
import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.p073ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.utl.ALog;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.taobao.accs.utl.e */
/* loaded from: classes.dex */
public final class RunnableC3192e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ NetPerformanceMonitor f13175a;

    /* renamed from: b */
    final /* synthetic */ String f13176b;

    /* renamed from: c */
    final /* synthetic */ String f13177c;

    /* renamed from: d */
    final /* synthetic */ AccsDataListener f13178d;

    /* renamed from: e */
    final /* synthetic */ int f13179e;

    /* renamed from: f */
    final /* synthetic */ byte[] f13180f;

    /* renamed from: g */
    final /* synthetic */ Intent f13181g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3192e(NetPerformanceMonitor netPerformanceMonitor, String str, String str2, AccsDataListener accsDataListener, int i10, byte[] bArr, Intent intent) {
        this.f13175a = netPerformanceMonitor;
        this.f13176b = str;
        this.f13177c = str2;
        this.f13178d = accsDataListener;
        this.f13179e = i10;
        this.f13180f = bArr;
        this.f13181g = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        TaoBaseService.ExtraInfo m13001c;
        NetPerformanceMonitor netPerformanceMonitor = this.f13175a;
        if (netPerformanceMonitor != null) {
            netPerformanceMonitor.real_to_bz_date = System.currentTimeMillis();
        }
        ALog.Level level = ALog.Level.D;
        if (ALog.isPrintLog(level) || "accs-impaas".equals(this.f13176b)) {
            ALog.m12940e(C3188a.TAG, "onResponse start dataId:" + this.f13177c + " serviceId:" + this.f13176b, new Object[0]);
        }
        AccsDataListener accsDataListener = this.f13178d;
        String str = this.f13176b;
        String str2 = this.f13177c;
        int i10 = this.f13179e;
        byte[] bArr = this.f13180f;
        m13001c = C3188a.m13001c(this.f13181g);
        accsDataListener.onResponse(str, str2, i10, bArr, m13001c);
        if (ALog.isPrintLog(level) || "accs-impaas".equals(this.f13176b)) {
            ALog.m12940e(C3188a.TAG, "onResponse end dataId:" + this.f13177c, new Object[0]);
        }
        AppMonitor.getInstance().commitStat(this.f13175a);
    }
}
