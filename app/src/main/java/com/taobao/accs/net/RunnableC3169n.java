package com.taobao.accs.net;

import com.taobao.accs.base.AccsConnectStateListener;
import com.taobao.accs.base.TaoBaseService;

/* renamed from: com.taobao.accs.net.n */
/* loaded from: classes.dex */
class RunnableC3169n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ TaoBaseService.ConnectInfo f13030a;

    /* renamed from: b */
    final /* synthetic */ AccsConnectStateListener f13031b;

    /* renamed from: c */
    final /* synthetic */ C3168m f13032c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3169n(C3168m c3168m, TaoBaseService.ConnectInfo connectInfo, AccsConnectStateListener accsConnectStateListener) {
        this.f13032c = c3168m;
        this.f13030a = connectInfo;
        this.f13031b = accsConnectStateListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        TaoBaseService.ConnectInfo connectInfo = this.f13030a;
        if (connectInfo.connected) {
            this.f13031b.onConnected(connectInfo);
        } else {
            this.f13031b.onDisconnected(connectInfo);
        }
    }
}
