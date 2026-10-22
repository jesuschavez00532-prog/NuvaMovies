package com.alibaba.sdk.android.httpdns;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.alibaba.sdk.android.httpdns.p045b.C1528b;
import java.util.ArrayList;

/* renamed from: com.alibaba.sdk.android.httpdns.p */
/* loaded from: classes.dex */
public class C1554p {

    /* renamed from: a */
    private static Context f5994a;

    /* renamed from: i */
    static boolean f5995i;

    /* renamed from: j */
    private static String f5996j;

    /* renamed from: f */
    private static String m7199f() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) f5994a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                String typeName = activeNetworkInfo.getTypeName();
                C1545i.m7165d("[detectCurrentNetwork] - Network name:" + typeName + " subType name: " + activeNetworkInfo.getSubtypeName());
                return typeName == null ? "None_Network" : typeName;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return "None_Network";
    }

    /* renamed from: g */
    static /* synthetic */ String m7200g() {
        return m7199f();
    }

    public static void setContext(Context context) {
        if (context == null) {
            throw new IllegalStateException("Context can't be null");
        }
        f5994a = context;
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.alibaba.sdk.android.httpdns.p.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                try {
                    if (!isInitialStickyBroadcast() && "android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                        C1528b.m7079b(context2);
                        String m7200g = C1554p.m7200g();
                        if (m7200g != "None_Network" && !m7200g.equalsIgnoreCase(C1554p.f5996j)) {
                            C1545i.m7165d("[BroadcastReceiver.onReceive] - Network state changed");
                            ArrayList<String> m7118a = C1536d.m7110a().m7118a();
                            C1536d.m7110a().clear();
                            C1536d.m7110a().m7119a();
                            if (C1554p.f5995i && HttpDns.instance != null) {
                                C1545i.m7165d("[BroadcastReceiver.onReceive] - refresh host");
                                HttpDns.instance.setPreResolveHosts(m7118a);
                            }
                        }
                        String unused = C1554p.f5996j = m7200g;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        };
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            f5994a.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
