package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.x3 */
/* loaded from: classes.dex */
public abstract class AbstractC2491x3 extends AbstractC2237a3 {

    /* renamed from: b */
    private boolean f9207b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2491x3(C2415q4 c2415q4) {
        super(c2415q4);
        this.f8714a.m10038i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final void m10105i() {
        if (m10108m()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: j */
    public final void m10106j() {
        if (!this.f9207b) {
            if (!mo9472n()) {
                this.f8714a.m10036g();
                this.f9207b = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* renamed from: k */
    public final void m10107k() {
        if (!this.f9207b) {
            mo9523l();
            this.f8714a.m10036g();
            this.f9207b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* renamed from: l */
    protected void mo9523l() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean m10108m() {
        return this.f9207b;
    }

    /* renamed from: n */
    protected abstract boolean mo9472n();
}
