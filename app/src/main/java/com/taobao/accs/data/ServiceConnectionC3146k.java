package com.taobao.accs.data;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: com.taobao.accs.data.k */
/* loaded from: classes.dex */
class ServiceConnectionC3146k implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ MsgDistributeService f12952a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ServiceConnectionC3146k(MsgDistributeService msgDistributeService) {
        this.f12952a = msgDistributeService;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }
}
