package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.k5 */
/* loaded from: classes.dex */
public abstract class AbstractC2350k5 extends AbstractC2339j5 {

    /* renamed from: b */
    private boolean f8745b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2350k5(C2415q4 c2415q4) {
        super(c2415q4);
        this.f8714a.m10038i();
    }

    /* renamed from: i */
    protected void mo9429i() {
    }

    /* renamed from: j */
    protected abstract boolean mo9430j();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public final void m9731k() {
        if (m9734n()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: l */
    public final void m9732l() {
        if (!this.f8745b) {
            if (!mo9430j()) {
                this.f8714a.m10036g();
                this.f8745b = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* renamed from: m */
    public final void m9733m() {
        if (!this.f8745b) {
            mo9429i();
            this.f8714a.m10036g();
            this.f8745b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean m9734n() {
        return this.f8745b;
    }
}
