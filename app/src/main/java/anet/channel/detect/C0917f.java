package anet.channel.detect;

import anet.channel.AwcnConfig;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.detect.f */
/* loaded from: classes.dex */
public class C0917f implements AppLifecycle.AppLifecycleListener {

    /* renamed from: a */
    final /* synthetic */ C0915d f3834a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0917f(C0915d c0915d) {
        this.f3834a = c0915d;
    }

    @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
    public void background() {
        ALog.m4788i("anet.HorseRaceDetector", "background", null, new Object[0]);
        if (!AwcnConfig.isHorseRaceEnable()) {
            return;
        }
        ThreadPoolExecutorFactory.submitHRTask(new RunnableC0918g(this));
    }

    @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
    public void forground() {
    }
}
