package kotlinx.coroutines.scheduling;

import ve.AbstractC7273e0;

/* renamed from: kotlinx.coroutines.scheduling.k */
/* loaded from: classes3.dex */
public final class C5298k extends AbstractRunnableC5296i {

    /* renamed from: c */
    public final Runnable f21563c;

    public C5298k(Runnable runnable, long j10, InterfaceC5297j interfaceC5297j) {
        super(j10, interfaceC5297j);
        this.f21563c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f21563c.run();
        } finally {
            this.f21562b.mo21332d();
        }
    }

    public String toString() {
        return "Task[" + AbstractC7273e0.m28127a(this.f21563c) + '@' + AbstractC7273e0.m28128b(this.f21563c) + ", " + this.f21561a + ", " + this.f21562b + ']';
    }
}
