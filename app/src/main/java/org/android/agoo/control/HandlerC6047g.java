package org.android.agoo.control;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.android.agoo.control.g */
/* loaded from: classes3.dex */
public class HandlerC6047g extends Handler {

    /* renamed from: a */
    final /* synthetic */ BaseIntentService f23710a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HandlerC6047g(BaseIntentService baseIntentService) {
        this.f23710a = baseIntentService;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message != null) {
            ALog.m12941i("BaseIntentService", "handleMessage on receive msg", "msg", message.toString());
            Intent intent = (Intent) message.getData().getParcelable("intent");
            if (intent != null) {
                ALog.m12941i("BaseIntentService", "handleMessage get intent success", "intent", intent.toString());
                ThreadPoolExecutorFactory.execute(new RunnableC6048h(this, intent));
            }
        }
    }
}
