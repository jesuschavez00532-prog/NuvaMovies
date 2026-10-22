package com.google.android.gms.internal.measurement;

import android.app.Activity;
import p219l4.AbstractC5391n;
import p325s4.BinderC6676b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.w1 */
/* loaded from: classes.dex */
public final class C2170w1 extends AbstractRunnableC2036n2 {

    /* renamed from: e */
    final /* synthetic */ Activity f8230e;

    /* renamed from: f */
    final /* synthetic */ String f8231f;

    /* renamed from: g */
    final /* synthetic */ String f8232g;

    /* renamed from: h */
    final /* synthetic */ C2201y2 f8233h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2170w1(C2201y2 c2201y2, Activity activity, String str, String str2) {
        super(c2201y2, true);
        this.f8233h = c2201y2;
        this.f8230e = activity;
        this.f8231f = str;
        this.f8232g = str2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2036n2
    /* renamed from: a */
    final void mo8116a() {
        InterfaceC1945h1 interfaceC1945h1;
        interfaceC1945h1 = this.f8233h.f8281i;
        ((InterfaceC1945h1) AbstractC5391n.m21783i(interfaceC1945h1)).setCurrentScreen(BinderC6676b.m26053M(this.f8230e), this.f8231f, this.f8232g, this.f7958a);
    }
}
