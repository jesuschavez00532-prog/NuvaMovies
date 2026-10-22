package com.taobao.accs.data;

import android.content.Intent;
import android.os.Handler;
import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.data.j */
/* loaded from: classes.dex */
class HandlerC3145j extends Handler {

    /* renamed from: a */
    final /* synthetic */ MsgDistributeService f12951a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HandlerC3145j(MsgDistributeService msgDistributeService) {
        this.f12951a = msgDistributeService;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        if (message != null) {
            ALog.m12941i("MsgDistributeService", "handleMessage on receive msg", "msg", message.toString());
            Intent intent = (Intent) message.getData().getParcelable("intent");
            if (intent != null) {
                ALog.m12941i("MsgDistributeService", "handleMessage get intent success", "intent", intent.toString());
                this.f12951a.onStartCommand(intent, 0, 0);
            }
        }
    }
}
