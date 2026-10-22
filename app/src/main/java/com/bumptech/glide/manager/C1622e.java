package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.core.content.AbstractC0547a;
import com.bumptech.glide.manager.InterfaceC1619b;

/* renamed from: com.bumptech.glide.manager.e */
/* loaded from: classes.dex */
public class C1622e implements InterfaceC1620c {
    @Override // com.bumptech.glide.manager.InterfaceC1620c
    /* renamed from: a */
    public InterfaceC1619b mo7460a(Context context, InterfaceC1619b.a aVar) {
        boolean z10;
        String str;
        if (AbstractC0547a.m2319a(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            if (z10) {
                str = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
            } else {
                str = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
            }
            Log.d("ConnectivityMonitor", str);
        }
        if (z10) {
            return new C1621d(context, aVar);
        }
        return new C1630m();
    }
}
