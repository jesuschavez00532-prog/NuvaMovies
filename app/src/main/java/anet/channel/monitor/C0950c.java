package anet.channel.monitor;

import anet.channel.status.NetworkStatusHelper;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.monitor.c */
/* loaded from: classes.dex */
public class C0950c implements NetworkStatusHelper.INetworkStatusChangeListener {

    /* renamed from: a */
    final /* synthetic */ C0949b f3936a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0950c(C0949b c0949b) {
        this.f3936a = c0949b;
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        C0952e c0952e;
        c0952e = this.f3936a.f3934n;
        c0952e.m4601a();
        C0949b.f3926f = 0L;
        this.f3936a.m4598d();
    }
}
