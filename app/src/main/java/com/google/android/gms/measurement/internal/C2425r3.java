package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.google.android.gms.measurement.internal.r3 */
/* loaded from: classes.dex */
public final class C2425r3 extends AbstractC2485w8 {
    public C2425r3(C2310g9 c2310g9) {
        super(c2310g9);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2485w8
    /* renamed from: l */
    protected final boolean mo9454l() {
        return false;
    }

    /* renamed from: m */
    public final boolean m10058m() {
        m10099i();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f8714a.mo9584f().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }
}
