package com.google.android.gms.internal.measurement;

import p219l4.AbstractC5391n;
import p325s4.BinderC6676b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.h2 */
/* loaded from: classes.dex */
public final class C1946h2 extends AbstractRunnableC2036n2 {

    /* renamed from: e */
    final /* synthetic */ String f7792e;

    /* renamed from: f */
    final /* synthetic */ Object f7793f;

    /* renamed from: g */
    final /* synthetic */ C2201y2 f7794g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1946h2(C2201y2 c2201y2, boolean z10, int i10, String str, Object obj, Object obj2, Object obj3) {
        super(c2201y2, false);
        this.f7794g = c2201y2;
        this.f7792e = str;
        this.f7793f = obj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2036n2
    /* renamed from: a */
    final void mo8116a() {
        InterfaceC1945h1 interfaceC1945h1;
        interfaceC1945h1 = this.f7794g.f8281i;
        ((InterfaceC1945h1) AbstractC5391n.m21783i(interfaceC1945h1)).logHealthData(5, this.f7792e, BinderC6676b.m26053M(this.f7793f), BinderC6676b.m26053M(null), BinderC6676b.m26053M(null));
    }
}
