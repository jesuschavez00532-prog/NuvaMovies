package com.google.android.gms.measurement.internal;

import p310r4.C6533d;
import p310r4.C6534e;

/* renamed from: com.google.android.gms.measurement.internal.d4 */
/* loaded from: classes.dex */
public final class C2272d4 {

    /* renamed from: a */
    final C2415q4 f8535a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2272d4(C2310g9 c2310g9) {
        this.f8535a = c2310g9.m9579c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean m9518a() {
        try {
            C6533d m25570a = C6534e.m25570a(this.f8535a.mo9584f());
            if (m25570a == null) {
                this.f8535a.mo9577b().m9804v().m9699a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            }
            if (m25570a.m25567e("com.android.vending", 128).versionCode < 80837300) {
                return false;
            }
            return true;
        } catch (Exception e10) {
            this.f8535a.mo9577b().m9804v().m9700b("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
