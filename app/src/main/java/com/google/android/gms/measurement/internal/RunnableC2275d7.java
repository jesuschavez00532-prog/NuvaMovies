package com.google.android.gms.measurement.internal;

import p025b5.InterfaceC1106f;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.d7 */
/* loaded from: classes.dex */
public final class RunnableC2275d7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2453t9 f8540a;

    /* renamed from: b */
    final /* synthetic */ boolean f8541b;

    /* renamed from: c */
    final /* synthetic */ C2354k9 f8542c;

    /* renamed from: d */
    final /* synthetic */ C2254b8 f8543d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2275d7(C2254b8 c2254b8, C2453t9 c2453t9, boolean z10, C2354k9 c2354k9) {
        this.f8543d = c2254b8;
        this.f8540a = c2453t9;
        this.f8541b = z10;
        this.f8542c = c2354k9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1106f interfaceC1106f;
        C2354k9 c2354k9;
        C2254b8 c2254b8 = this.f8543d;
        interfaceC1106f = c2254b8.f8405d;
        if (interfaceC1106f == null) {
            c2254b8.f8714a.mo9577b().m9800r().m9699a("Discarding data. Failed to set user property");
            return;
        }
        AbstractC5391n.m21783i(this.f8540a);
        C2254b8 c2254b82 = this.f8543d;
        if (this.f8541b) {
            c2354k9 = null;
        } else {
            c2354k9 = this.f8542c;
        }
        c2254b82.m9504r(interfaceC1106f, c2354k9, this.f8540a);
        this.f8543d.m9480E();
    }
}
