package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.t1 */
/* loaded from: classes.dex */
public final class C2125t1 extends AbstractRunnableC2036n2 {

    /* renamed from: e */
    final /* synthetic */ String f8063e;

    /* renamed from: f */
    final /* synthetic */ String f8064f;

    /* renamed from: g */
    final /* synthetic */ Bundle f8065g;

    /* renamed from: h */
    final /* synthetic */ C2201y2 f8066h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2125t1(C2201y2 c2201y2, String str, String str2, Bundle bundle) {
        super(c2201y2, true);
        this.f8066h = c2201y2;
        this.f8063e = str;
        this.f8064f = str2;
        this.f8065g = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2036n2
    /* renamed from: a */
    final void mo8116a() {
        InterfaceC1945h1 interfaceC1945h1;
        interfaceC1945h1 = this.f8066h.f8281i;
        ((InterfaceC1945h1) AbstractC5391n.m21783i(interfaceC1945h1)).clearConditionalUserProperty(this.f8063e, this.f8064f, this.f8065g);
    }
}
