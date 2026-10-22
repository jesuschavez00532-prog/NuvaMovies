package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.d9 */
/* loaded from: classes.dex */
public final class C2277d9 implements InterfaceC2387n9 {

    /* renamed from: a */
    final /* synthetic */ C2310g9 f8550a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2277d9(C2310g9 c2310g9) {
        this.f8550a = c2310g9;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2387n9
    /* renamed from: a */
    public final void mo9519a(String str, String str2, Bundle bundle) {
        C2415q4 c2415q4;
        C2415q4 c2415q42;
        if (TextUtils.isEmpty(str)) {
            C2310g9 c2310g9 = this.f8550a;
            c2415q4 = c2310g9.f8638l;
            if (c2415q4 != null) {
                c2415q42 = c2310g9.f8638l;
                c2415q42.mo9577b().m9800r().m9700b("AppId not known when logging event", "_err");
                return;
            }
            return;
        }
        this.f8550a.mo9575a().m9897z(new RunnableC2266c9(this, str, "_err", bundle));
    }
}
