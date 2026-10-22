package ua;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import anet.channel.util.ErrorConstant;

/* renamed from: ua.a */
/* loaded from: classes2.dex */
public class C7069a extends BroadcastReceiver {

    /* renamed from: a */
    private a f26498a;

    /* renamed from: ua.a$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: e5 */
        void mo16596e5(int i10);

        /* renamed from: o1 */
        void mo16601o1(NetworkInfo networkInfo);
    }

    /* renamed from: a */
    public void m27233a(a aVar) {
        this.f26498a = aVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            try {
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                if (wifiManager == null) {
                    return;
                }
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(9);
                int rssi = wifiManager.getConnectionInfo().getRssi();
                int i10 = ErrorConstant.ERROR_NO_NETWORK;
                if (rssi != -200) {
                    if (rssi <= 0 && rssi >= -50) {
                        i10 = 4;
                    } else if (rssi < -50 && rssi >= -70) {
                        i10 = 3;
                    } else if (rssi < -70 && rssi >= -80) {
                        i10 = 2;
                    } else if (rssi < -80 && rssi >= -100) {
                        i10 = 1;
                    }
                }
                a aVar = this.f26498a;
                if (aVar != null) {
                    aVar.mo16601o1(networkInfo);
                    this.f26498a.mo16596e5(i10);
                }
            } catch (NullPointerException e10) {
                e10.printStackTrace();
            }
        }
    }
}
