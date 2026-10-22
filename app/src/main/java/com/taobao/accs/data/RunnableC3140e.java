package com.taobao.accs.data;

import com.taobao.accs.p073ut.monitor.TrafficsMonitor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.taobao.accs.data.e */
/* loaded from: classes.dex */
public class RunnableC3140e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ TrafficsMonitor.C3187a f12940a;

    /* renamed from: b */
    final /* synthetic */ C3139d f12941b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3140e(C3139d c3139d, TrafficsMonitor.C3187a c3187a) {
        this.f12941b = c3139d;
        this.f12940a = c3187a;
    }

    @Override // java.lang.Runnable
    public void run() {
        TrafficsMonitor trafficsMonitor = this.f12941b.f12926c;
        if (trafficsMonitor != null) {
            trafficsMonitor.m12937a(this.f12940a);
        }
    }
}
