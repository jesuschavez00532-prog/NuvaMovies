package anet.channel.status;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.status.a */
/* loaded from: classes.dex */
public final class RunnableC0973a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ NetworkStatusHelper.NetworkStatus f4050a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0973a(NetworkStatusHelper.NetworkStatus networkStatus) {
        this.f4050a = networkStatus;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Iterator<NetworkStatusHelper.INetworkStatusChangeListener> it = NetworkStatusHelper.listeners.iterator();
            while (it.hasNext()) {
                NetworkStatusHelper.INetworkStatusChangeListener next = it.next();
                long currentTimeMillis = System.currentTimeMillis();
                next.onNetworkStatusChanged(this.f4050a);
                if (System.currentTimeMillis() - currentTimeMillis > 500) {
                    ALog.m4787e("awcn.NetworkStatusHelper", "call back cost too much time", null, "listener", next);
                }
            }
        } catch (Exception unused) {
        }
    }
}
