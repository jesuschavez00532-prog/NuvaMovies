package org.android.agoo.control;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.taobao.accs.utl.ALog;
import org.android.agoo.control.AgooFactory;
import org.android.agoo.service.SendMessage;

/* renamed from: org.android.agoo.control.f */
/* loaded from: classes3.dex */
class RunnableC6046f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AgooFactory.ServiceConnectionC6039a f23709a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6046f(AgooFactory.ServiceConnectionC6039a serviceConnectionC6039a) {
        this.f23709a = serviceConnectionC6039a;
    }

    @Override // java.lang.Runnable
    public void run() {
        ServiceConnection serviceConnection;
        ServiceConnection serviceConnection2;
        SendMessage sendMessage;
        Intent intent;
        ServiceConnection serviceConnection3;
        try {
            ALog.m12938d("AgooFactory", "onConnected running tid:" + Thread.currentThread().getId(), new Object[0]);
            sendMessage = this.f23709a.f23690c;
            intent = this.f23709a.f23688a;
            sendMessage.doSend(intent);
            ALog.m12938d("AgooFactory", "send finish. close this connection", new Object[0]);
            this.f23709a.f23690c = null;
            try {
                Context context = AgooFactory.mContext;
                serviceConnection3 = this.f23709a.f23691d;
                context.unbindService(serviceConnection3);
            } catch (Throwable th) {
                ALog.m12939e("AgooFactory", "unbindService error", th, new Object[0]);
            }
        } catch (Throwable th2) {
            try {
                ALog.m12939e("AgooFactory", "send error", th2, new Object[0]);
                ALog.m12938d("AgooFactory", "send finish. close this connection", new Object[0]);
                this.f23709a.f23690c = null;
                try {
                    Context context2 = AgooFactory.mContext;
                    serviceConnection2 = this.f23709a.f23691d;
                    context2.unbindService(serviceConnection2);
                } catch (Throwable th3) {
                    ALog.m12939e("AgooFactory", "unbindService error", th3, new Object[0]);
                }
            } catch (Throwable th4) {
                ALog.m12938d("AgooFactory", "send finish. close this connection", new Object[0]);
                this.f23709a.f23690c = null;
                try {
                    Context context3 = AgooFactory.mContext;
                    serviceConnection = this.f23709a.f23691d;
                    context3.unbindService(serviceConnection);
                } catch (Throwable th5) {
                    ALog.m12939e("AgooFactory", "unbindService error", th5, new Object[0]);
                }
                throw th4;
            }
        }
    }
}
