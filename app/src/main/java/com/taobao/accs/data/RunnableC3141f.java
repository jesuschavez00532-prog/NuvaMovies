package com.taobao.accs.data;

import com.taobao.accs.p073ut.monitor.TrafficsMonitor;

/* renamed from: com.taobao.accs.data.f */
/* loaded from: classes.dex */
class RunnableC3141f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3139d f12942a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3141f(C3139d c3139d) {
        this.f12942a = c3139d;
    }

    @Override // java.lang.Runnable
    public void run() {
        TrafficsMonitor trafficsMonitor = this.f12942a.f12926c;
        if (trafficsMonitor != null) {
            trafficsMonitor.m12936a();
        }
    }
}
