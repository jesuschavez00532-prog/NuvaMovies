package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.w8 */
/* loaded from: classes.dex */
public abstract class AbstractC2485w8 extends AbstractC2474v8 {

    /* renamed from: c */
    private boolean f9194c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2485w8(C2310g9 c2310g9) {
        super(c2310g9);
        this.f9168b.m9601r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final void m10099i() {
        if (m10101k()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: j */
    public final void m10100j() {
        if (!this.f9194c) {
            mo9454l();
            this.f9168b.m9596m();
            this.f9194c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean m10101k() {
        return this.f9194c;
    }

    /* renamed from: l */
    protected abstract boolean mo9454l();
}
