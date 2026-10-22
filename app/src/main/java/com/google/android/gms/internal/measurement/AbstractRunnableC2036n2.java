package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.n2 */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC2036n2 implements Runnable {

    /* renamed from: a */
    final long f7958a;

    /* renamed from: b */
    final long f7959b;

    /* renamed from: c */
    final boolean f7960c;

    /* renamed from: d */
    final /* synthetic */ C2201y2 f7961d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractRunnableC2036n2(C2201y2 c2201y2, boolean z10) {
        this.f7961d = c2201y2;
        this.f7958a = c2201y2.f8274b.mo24747a();
        this.f7959b = c2201y2.f8274b.mo24748b();
        this.f7960c = z10;
    }

    /* renamed from: a */
    abstract void mo8116a();

    /* renamed from: b */
    protected void mo8117b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        z10 = this.f7961d.f8279g;
        if (z10) {
            mo8117b();
            return;
        }
        try {
            mo8116a();
        } catch (Exception e10) {
            this.f7961d.m9201j(e10, false, this.f7960c);
            mo8117b();
        }
    }
}
