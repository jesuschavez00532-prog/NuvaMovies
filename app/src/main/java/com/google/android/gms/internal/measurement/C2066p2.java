package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import p219l4.AbstractC5391n;
import p325s4.BinderC6676b;

/* renamed from: com.google.android.gms.internal.measurement.p2 */
/* loaded from: classes.dex */
final class C2066p2 extends AbstractRunnableC2036n2 {

    /* renamed from: e */
    final /* synthetic */ Bundle f7990e;

    /* renamed from: f */
    final /* synthetic */ Activity f7991f;

    /* renamed from: g */
    final /* synthetic */ C2186x2 f7992g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2066p2(C2186x2 c2186x2, Bundle bundle, Activity activity) {
        super(c2186x2.f8251a, true);
        this.f7992g = c2186x2;
        this.f7990e = bundle;
        this.f7991f = activity;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2036n2
    /* renamed from: a */
    final void mo8116a() {
        Bundle bundle;
        InterfaceC1945h1 interfaceC1945h1;
        if (this.f7990e != null) {
            bundle = new Bundle();
            if (this.f7990e.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f7990e.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        interfaceC1945h1 = this.f7992g.f8251a.f8281i;
        ((InterfaceC1945h1) AbstractC5391n.m21783i(interfaceC1945h1)).onActivityCreated(BinderC6676b.m26053M(this.f7991f), bundle, this.f7959b);
    }
}
