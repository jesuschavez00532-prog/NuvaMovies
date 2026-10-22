package com.google.android.gms.measurement.internal;

import p025b5.InterfaceC1106f;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.q7 */
/* loaded from: classes.dex */
public final class RunnableC2418q7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2453t9 f9006a;

    /* renamed from: b */
    final /* synthetic */ boolean f9007b;

    /* renamed from: c */
    final /* synthetic */ C2465v f9008c;

    /* renamed from: d */
    final /* synthetic */ String f9009d;

    /* renamed from: e */
    final /* synthetic */ C2254b8 f9010e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2418q7(C2254b8 c2254b8, boolean z10, C2453t9 c2453t9, boolean z11, C2465v c2465v, String str) {
        this.f9010e = c2254b8;
        this.f9006a = c2453t9;
        this.f9007b = z11;
        this.f9008c = c2465v;
        this.f9009d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1106f interfaceC1106f;
        C2465v c2465v;
        C2254b8 c2254b8 = this.f9010e;
        interfaceC1106f = c2254b8.f8405d;
        if (interfaceC1106f == null) {
            c2254b8.f8714a.mo9577b().m9800r().m9699a("Discarding data. Failed to send event to service");
            return;
        }
        AbstractC5391n.m21783i(this.f9006a);
        C2254b8 c2254b82 = this.f9010e;
        if (this.f9007b) {
            c2465v = null;
        } else {
            c2465v = this.f9008c;
        }
        c2254b82.m9504r(interfaceC1106f, c2465v, this.f9006a);
        this.f9010e.m9480E();
    }
}
