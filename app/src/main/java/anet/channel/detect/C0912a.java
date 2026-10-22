package anet.channel.detect;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.detect.a */
/* loaded from: classes.dex */
public class C0912a implements NetworkStatusHelper.INetworkStatusChangeListener {

    /* renamed from: a */
    final /* synthetic */ ExceptionDetector f3827a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0912a(ExceptionDetector exceptionDetector) {
        this.f3827a = exceptionDetector;
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        ThreadPoolExecutorFactory.submitDetectTask(new RunnableC0913b(this));
    }
}
