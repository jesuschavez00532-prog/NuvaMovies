package anet.channel.detect;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.detect.l */
/* loaded from: classes.dex */
public class C0923l implements NetworkStatusHelper.INetworkStatusChangeListener {

    /* renamed from: a */
    final /* synthetic */ C0922k f3846a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0923l(C0922k c0922k) {
        this.f3846a = c0922k;
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        ThreadPoolExecutorFactory.submitDetectTask(new RunnableC0924m(this, networkStatus));
    }
}
