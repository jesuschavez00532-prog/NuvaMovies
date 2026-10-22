package com.taobao.accs.data;

import anet.channel.appmonitor.AppMonitor;
import com.taobao.accs.common.Constants;
import com.taobao.accs.p073ut.monitor.AssembleMonitor;
import com.taobao.accs.utl.ALog;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.taobao.accs.data.c */
/* loaded from: classes.dex */
public class RunnableC3138c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3136a f12923a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3138c(C3136a c3136a) {
        this.f12923a = c3136a;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        String str;
        Map map;
        String str2;
        int i11;
        synchronized (this.f12923a) {
            i10 = this.f12923a.f12919f;
            if (i10 == 0) {
                str = this.f12923a.f12915b;
                ALog.m12940e("AssembleMessage", "timeout", Constants.KEY_DATA_ID, str);
                this.f12923a.f12919f = 1;
                map = this.f12923a.f12921h;
                map.clear();
                str2 = this.f12923a.f12915b;
                i11 = this.f12923a.f12919f;
                AppMonitor.getInstance().commitStat(new AssembleMonitor(str2, String.valueOf(i11)));
            }
        }
    }
}
