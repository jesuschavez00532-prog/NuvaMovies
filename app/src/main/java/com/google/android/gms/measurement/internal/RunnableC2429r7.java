package com.google.android.gms.measurement.internal;

import p025b5.InterfaceC1106f;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.r7 */
/* loaded from: classes.dex */
public final class RunnableC2429r7 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2453t9 f9037a;

    /* renamed from: b */
    final /* synthetic */ boolean f9038b;

    /* renamed from: c */
    final /* synthetic */ C2267d f9039c;

    /* renamed from: d */
    final /* synthetic */ C2267d f9040d;

    /* renamed from: e */
    final /* synthetic */ C2254b8 f9041e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2429r7(C2254b8 c2254b8, boolean z10, C2453t9 c2453t9, boolean z11, C2267d c2267d, C2267d c2267d2) {
        this.f9041e = c2254b8;
        this.f9037a = c2453t9;
        this.f9038b = z11;
        this.f9039c = c2267d;
        this.f9040d = c2267d2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1106f interfaceC1106f;
        C2267d c2267d;
        C2254b8 c2254b8 = this.f9041e;
        interfaceC1106f = c2254b8.f8405d;
        if (interfaceC1106f == null) {
            c2254b8.f8714a.mo9577b().m9800r().m9699a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        AbstractC5391n.m21783i(this.f9037a);
        C2254b8 c2254b82 = this.f9041e;
        if (this.f9038b) {
            c2267d = null;
        } else {
            c2267d = this.f9039c;
        }
        c2254b82.m9504r(interfaceC1106f, c2267d, this.f9037a);
        this.f9041e.m9480E();
    }
}
