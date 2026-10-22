package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1942gd;
import p025b5.C1098b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.k6 */
/* loaded from: classes.dex */
public final class RunnableC2351k6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1098b f8746a;

    /* renamed from: b */
    final /* synthetic */ int f8747b;

    /* renamed from: c */
    final /* synthetic */ long f8748c;

    /* renamed from: d */
    final /* synthetic */ boolean f8749d;

    /* renamed from: e */
    final /* synthetic */ C1098b f8750e;

    /* renamed from: f */
    final /* synthetic */ C2406p6 f8751f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2351k6(C2406p6 c2406p6, C1098b c1098b, int i10, long j10, boolean z10, C1098b c1098b2) {
        this.f8751f = c2406p6;
        this.f8746a = c1098b;
        this.f8747b = i10;
        this.f8748c = j10;
        this.f8749d = z10;
        this.f8750e = c1098b2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8751f.m9979J(this.f8746a);
        C2406p6.m9967c0(this.f8751f, this.f8746a, this.f8747b, this.f8748c, false, this.f8749d);
        C1942gd.m8472c();
        if (this.f8751f.f8714a.m10051z().m9614B(null, AbstractC2260c3.f8487u0)) {
            C2406p6.m9966b0(this.f8751f, this.f8746a, this.f8750e);
        }
    }
}
