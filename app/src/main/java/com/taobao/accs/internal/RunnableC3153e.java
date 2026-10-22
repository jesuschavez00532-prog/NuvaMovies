package com.taobao.accs.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.taobao.accs.internal.ServiceImpl;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3197j;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;

/* renamed from: com.taobao.accs.internal.e */
/* loaded from: classes.dex */
class RunnableC3153e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ServiceImpl.BinderC31481 f12975a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3153e(ServiceImpl.BinderC31481 binderC31481) {
        this.f12975a = binderC31481;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        Context context2;
        Context context3;
        Context context4;
        Context context5;
        try {
            context = ServiceImpl.this.f12964c;
            if (context != null) {
                context2 = ServiceImpl.this.f12964c;
                if (UtilityImpl.m12977e(context2)) {
                    Intent intent = new Intent();
                    intent.setAction("org.agoo.android.intent.action.PING_V4");
                    context3 = ServiceImpl.this.f12964c;
                    intent.setClassName(context3.getPackageName(), C3197j.channelService);
                    context4 = ServiceImpl.this.f12964c;
                    context4.startService(intent);
                    UTMini uTMini = UTMini.getInstance();
                    context5 = ServiceImpl.this.f12964c;
                    uTMini.commitEvent(66001, "probeServiceEnabled", UtilityImpl.m12986j(context5));
                    ALog.m12938d("ServiceImpl", "ReceiverImpl probeTaoBao........mContext.startService(intent) [probe][successfully]", new Object[0]);
                    ALog.m12938d("ServiceImpl", "ReceiverImpl probeTaoBao........messageServiceBinder [probe][end]", new Object[0]);
                }
            }
            Process.killProcess(Process.myPid());
            ALog.m12938d("ServiceImpl", "ReceiverImpl probeTaoBao........messageServiceBinder [probe][end]", new Object[0]);
        } catch (Throwable th) {
            ALog.m12938d("ServiceImpl", "ReceiverImpl probeTaoBao error........e=" + th, new Object[0]);
        }
    }
}
