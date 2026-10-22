package org.android.agoo.control;

import android.content.Context;
import com.taobao.accs.client.C3131a;
import org.android.agoo.message.MessageService;

/* renamed from: org.android.agoo.control.j */
/* loaded from: classes3.dex */
class RunnableC6050j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ BaseIntentService f23714a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6050j(BaseIntentService baseIntentService) {
        this.f23714a = baseIntentService;
    }

    @Override // java.lang.Runnable
    public void run() {
        NotifManager notifManager;
        MessageService messageService;
        AgooFactory agooFactory;
        NotifManager notifManager2;
        MessageService messageService2;
        C3131a.f12862f.incrementAndGet();
        this.f23714a.notifyManager = new NotifManager();
        notifManager = this.f23714a.notifyManager;
        notifManager.init(this.f23714a.getApplicationContext());
        this.f23714a.messageService = new MessageService();
        messageService = this.f23714a.messageService;
        messageService.m24211a(this.f23714a.getApplicationContext());
        this.f23714a.agooFactory = new AgooFactory();
        agooFactory = this.f23714a.agooFactory;
        Context applicationContext = this.f23714a.getApplicationContext();
        notifManager2 = this.f23714a.notifyManager;
        messageService2 = this.f23714a.messageService;
        agooFactory.init(applicationContext, notifManager2, messageService2);
    }
}
