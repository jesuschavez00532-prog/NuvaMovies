package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.internal.measurement.HandlerC1866c1;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.o */
/* loaded from: classes.dex */
public abstract class AbstractC2388o {

    /* renamed from: d */
    private static volatile Handler f8870d;

    /* renamed from: a */
    private final InterfaceC2361l5 f8871a;

    /* renamed from: b */
    private final Runnable f8872b;

    /* renamed from: c */
    private volatile long f8873c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2388o(InterfaceC2361l5 interfaceC2361l5) {
        AbstractC5391n.m21783i(interfaceC2361l5);
        this.f8871a = interfaceC2361l5;
        this.f8872b = new RunnableC2377n(this, interfaceC2361l5);
    }

    /* renamed from: f */
    private final Handler m9878f() {
        Handler handler;
        if (f8870d != null) {
            return f8870d;
        }
        synchronized (AbstractC2388o.class) {
            if (f8870d == null) {
                f8870d = new HandlerC1866c1(this.f8871a.mo9584f().getMainLooper());
            }
            handler = f8870d;
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m9879b() {
        this.f8873c = 0L;
        m9878f().removeCallbacks(this.f8872b);
    }

    /* renamed from: c */
    public abstract void mo9785c();

    /* renamed from: d */
    public final void m9880d(long j10) {
        m9879b();
        if (j10 >= 0) {
            this.f8873c = this.f8871a.mo9578c().mo24747a();
            if (!m9878f().postDelayed(this.f8872b, j10)) {
                this.f8871a.mo9577b().m9800r().m9700b("Failed to schedule delayed post. time", Long.valueOf(j10));
            }
        }
    }

    /* renamed from: e */
    public final boolean m9881e() {
        return this.f8873c != 0;
    }
}
