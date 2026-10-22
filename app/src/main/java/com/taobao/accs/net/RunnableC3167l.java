package com.taobao.accs.net;

import com.taobao.accs.ACCSManager;
import com.taobao.accs.common.Constants;
import com.taobao.accs.data.Message;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3203p;
import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.taobao.accs.net.l */
/* loaded from: classes.dex */
public class RunnableC3167l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3166k f13028a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3167l(C3166k c3166k) {
        this.f13028a = c3166k;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j10;
        ALog.m12938d(this.f13028a.mo12858d(), "sendAccsHeartbeatMessage", new Object[0]);
        try {
            C3203p.a m13022a = new C3203p.a().m13022a("dataType", "pingreq");
            j10 = this.f13028a.f13017p;
            ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, null, m13022a.m13021a("timeInterval", Long.valueOf(j10)).m13023a().toString().getBytes("utf-8"), UUID.randomUUID().toString());
            accsRequest.setTarget("accs-iot");
            accsRequest.setTargetServiceName("sal");
            C3166k c3166k = this.f13028a;
            this.f13028a.mo12843a(Message.buildRequest(c3166k.f12981d, c3166k.mo12849b((String) null), this.f13028a.mo12858d(), this.f13028a.f12986i.getStoreId(), this.f13028a.f12981d.getPackageName(), Constants.TARGET_SERVICE, accsRequest, true), true);
        } catch (Exception e10) {
            ALog.m12939e(this.f13028a.mo12858d(), "send accs heartbeat message", e10, new Object[0]);
        }
    }
}
