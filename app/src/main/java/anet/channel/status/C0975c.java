package anet.channel.status;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import anet.channel.util.ALog;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: anet.channel.status.c */
/* loaded from: classes.dex */
public final class C0975c extends ConnectivityManager.NetworkCallback {
    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        super.onAvailable(network);
        ALog.m4788i("awcn.NetworkStatusMonitor", "network onAvailable", null, new Object[0]);
        C0974b.f4052b = true;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        List dnsServers;
        super.onLinkPropertiesChanged(network, linkProperties);
        dnsServers = linkProperties.getDnsServers();
        C0974b.f4062l = new ArrayList(dnsServers);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        super.onLost(network);
        ALog.m4788i("awcn.NetworkStatusMonitor", "network onLost", null, new Object[0]);
        C0974b.f4052b = false;
    }
}
