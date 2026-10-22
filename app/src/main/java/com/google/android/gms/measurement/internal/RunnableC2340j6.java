package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1942gd;
import p025b5.C1098b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.j6 */
/* loaded from: classes.dex */
public final class RunnableC2340j6 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1098b f8715a;

    /* renamed from: b */
    final /* synthetic */ long f8716b;

    /* renamed from: c */
    final /* synthetic */ int f8717c;

    /* renamed from: d */
    final /* synthetic */ long f8718d;

    /* renamed from: e */
    final /* synthetic */ boolean f8719e;

    /* renamed from: f */
    final /* synthetic */ C1098b f8720f;

    /* renamed from: g */
    final /* synthetic */ C2406p6 f8721g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2340j6(C2406p6 c2406p6, C1098b c1098b, long j10, int i10, long j11, boolean z10, C1098b c1098b2) {
        this.f8721g = c2406p6;
        this.f8715a = c1098b;
        this.f8716b = j10;
        this.f8717c = i10;
        this.f8718d = j11;
        this.f8719e = z10;
        this.f8720f = c1098b2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8721g.m9979J(this.f8715a);
        this.f8721g.m10007z(this.f8716b, false);
        C2406p6.m9967c0(this.f8721g, this.f8715a, this.f8717c, this.f8718d, true, this.f8719e);
        C1942gd.m8472c();
        if (this.f8721g.f8714a.m10051z().m9614B(null, AbstractC2260c3.f8487u0)) {
            C2406p6.m9966b0(this.f8721g, this.f8715a, this.f8720f);
        }
    }
}
