package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.AbstractC1792c;
import p127f5.C4247j;
import p172i4.C4858d;
import p187j4.C4987a;
import p203k4.InterfaceC5112i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.r */
/* loaded from: classes.dex */
public final class C1807r extends AbstractC1792c {

    /* renamed from: d */
    final /* synthetic */ AbstractC1792c.a f7610d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1807r(AbstractC1792c.a aVar, C4858d[] c4858dArr, boolean z10, int i10) {
        super(c4858dArr, z10, i10);
        this.f7610d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.AbstractC1792c
    /* renamed from: b */
    public final void mo7968b(C4987a.b bVar, C4247j c4247j) {
        InterfaceC5112i interfaceC5112i;
        interfaceC5112i = this.f7610d.f7562a;
        interfaceC5112i.accept(bVar, c4247j);
    }
}
