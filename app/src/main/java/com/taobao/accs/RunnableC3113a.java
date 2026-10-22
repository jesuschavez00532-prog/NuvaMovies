package com.taobao.accs;

import android.app.Notification;
import android.content.Context;
import com.taobao.accs.ChannelService;
import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.a */
/* loaded from: classes.dex */
class RunnableC3113a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ChannelService.KernelService f12827a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3113a(ChannelService.KernelService kernelService) {
        this.f12827a = kernelService;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        ChannelService.KernelService kernelService;
        Context context2;
        Context context3;
        ChannelService.KernelService kernelService2;
        ChannelService.KernelService kernelService3;
        try {
            ChannelService channelService = ChannelService.getInstance();
            context = this.f12827a.f12826b;
            int i10 = context.getPackageManager().getPackageInfo(this.f12827a.getPackageName(), 0).applicationInfo.icon;
            if (i10 != 0) {
                context2 = this.f12827a.f12826b;
                Notification.Builder builder = new Notification.Builder(context2);
                builder.setSmallIcon(i10);
                builder.setContentText("正在运行…");
                channelService.startForeground(9371, builder.build());
                context3 = this.f12827a.f12826b;
                Notification.Builder builder2 = new Notification.Builder(context3);
                builder2.setSmallIcon(i10);
                builder2.setContentText("正在运行…");
                kernelService2 = ChannelService.KernelService.f12825a;
                kernelService2.startForeground(9371, builder2.build());
                kernelService3 = ChannelService.KernelService.f12825a;
                kernelService3.stopForeground(true);
            }
            kernelService = ChannelService.KernelService.f12825a;
            kernelService.stopSelf();
        } catch (Throwable th) {
            ALog.m12939e("ChannelService", " onStartCommand run", th, new Object[0]);
        }
    }
}
