package com.google.android.gms.internal.measurement;

import p219l4.AbstractC5391n;
import p325s4.BinderC6676b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.m2 */
/* loaded from: classes.dex */
public final class C2021m2 extends AbstractRunnableC2036n2 {

    /* renamed from: e */
    final /* synthetic */ String f7875e;

    /* renamed from: f */
    final /* synthetic */ String f7876f;

    /* renamed from: g */
    final /* synthetic */ Object f7877g;

    /* renamed from: h */
    final /* synthetic */ boolean f7878h;

    /* renamed from: i */
    final /* synthetic */ C2201y2 f7879i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2021m2(C2201y2 c2201y2, String str, String str2, Object obj, boolean z10) {
        super(c2201y2, true);
        this.f7879i = c2201y2;
        this.f7875e = str;
        this.f7876f = str2;
        this.f7877g = obj;
        this.f7878h = z10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2036n2
    /* renamed from: a */
    final void mo8116a() {
        InterfaceC1945h1 interfaceC1945h1;
        interfaceC1945h1 = this.f7879i.f8281i;
        ((InterfaceC1945h1) AbstractC5391n.m21783i(interfaceC1945h1)).setUserProperty(this.f7875e, this.f7876f, BinderC6676b.m26053M(this.f7877g), this.f7878h, this.f7958a);
    }
}
