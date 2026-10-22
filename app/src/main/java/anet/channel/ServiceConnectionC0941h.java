package anet.channel;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import anet.channel.util.ALog;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.h */
/* loaded from: classes.dex */
public class ServiceConnectionC0941h implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ Intent f3901a;

    /* renamed from: b */
    final /* synthetic */ Context f3902b;

    /* renamed from: c */
    final /* synthetic */ SessionRequest f3903c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ServiceConnectionC0941h(SessionRequest sessionRequest, Intent intent, Context context) {
        this.f3903c = sessionRequest;
        this.f3901a = intent;
        this.f3902b = context;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ALog.m4785d("awcn.SessionRequest", "onServiceConnected", null, new Object[0]);
        try {
            Messenger messenger = new Messenger(iBinder);
            Message message = new Message();
            message.getData().putParcelable("intent", this.f3901a);
            messenger.send(message);
            try {
                this.f3902b.unbindService(this);
            } catch (Throwable th) {
                ALog.m4786e("awcn.SessionRequest", "onServiceConnected unbindService error.", null, th, new Object[0]);
            }
        } catch (Throwable th2) {
            try {
                ALog.m4786e("awcn.SessionRequest", "onServiceConnected sendMessage error.", null, th2, new Object[0]);
                try {
                    this.f3902b.unbindService(this);
                } catch (Throwable th3) {
                    ALog.m4786e("awcn.SessionRequest", "onServiceConnected unbindService error.", null, th3, new Object[0]);
                }
            } catch (Throwable th4) {
                try {
                    this.f3902b.unbindService(this);
                } catch (Throwable th5) {
                    ALog.m4786e("awcn.SessionRequest", "onServiceConnected unbindService error.", null, th5, new Object[0]);
                }
                throw th4;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        ALog.m4785d("awcn.SessionRequest", "onServiceDisconnected", null, new Object[0]);
        try {
            this.f3902b.unbindService(this);
        } catch (Throwable th) {
            ALog.m4786e("awcn.SessionRequest", "onServiceDisconnected unbindService error.", null, th, new Object[0]);
        }
    }
}
