package com.google.android.gms.measurement.internal;

import p219l4.AbstractC5391n;
import p281p4.InterfaceC6200d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.s8 */
/* loaded from: classes.dex */
public final class C2441s8 {

    /* renamed from: a */
    private final InterfaceC6200d f9064a;

    /* renamed from: b */
    private long f9065b;

    public C2441s8(InterfaceC6200d interfaceC6200d) {
        AbstractC5391n.m21783i(interfaceC6200d);
        this.f9064a = interfaceC6200d;
    }

    /* renamed from: a */
    public final void m10067a() {
        this.f9065b = 0L;
    }

    /* renamed from: b */
    public final void m10068b() {
        this.f9065b = this.f9064a.mo24748b();
    }

    /* renamed from: c */
    public final boolean m10069c(long j10) {
        if (this.f9065b == 0 || this.f9064a.mo24748b() - this.f9065b >= 3600000) {
            return true;
        }
        return false;
    }
}
