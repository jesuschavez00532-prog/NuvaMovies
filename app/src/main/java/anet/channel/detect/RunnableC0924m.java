package anet.channel.detect;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;

/* renamed from: anet.channel.detect.m */
/* loaded from: classes.dex */
class RunnableC0924m implements Runnable {

    /* renamed from: a */
    final /* synthetic */ NetworkStatusHelper.NetworkStatus f3847a;

    /* renamed from: b */
    final /* synthetic */ C0923l f3848b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0924m(C0923l c0923l, NetworkStatusHelper.NetworkStatus networkStatus) {
        this.f3848b = c0923l;
        this.f3847a = networkStatus;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            NetworkStatusHelper.NetworkStatus networkStatus = this.f3847a;
            if (networkStatus != NetworkStatusHelper.NetworkStatus.NO && networkStatus != NetworkStatusHelper.NetworkStatus.NONE) {
                this.f3848b.f3846a.m4544a(NetworkStatusHelper.getUniqueId(networkStatus));
            }
        } catch (Throwable th) {
            ALog.m4786e("anet.MTUDetector", "MTU detecet fail.", null, th, new Object[0]);
        }
    }
}
