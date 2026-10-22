package p126f4;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: f4.c */
/* loaded from: classes.dex */
final class C4227c extends Thread {

    /* renamed from: a */
    private final WeakReference f18522a;

    /* renamed from: b */
    private final long f18523b;

    /* renamed from: c */
    final CountDownLatch f18524c = new CountDownLatch(1);

    /* renamed from: d */
    boolean f18525d = false;

    public C4227c(C4225a c4225a, long j10) {
        this.f18522a = new WeakReference(c4225a);
        this.f18523b = j10;
        start();
    }

    /* renamed from: a */
    private final void m17688a() {
        C4225a c4225a = (C4225a) this.f18522a.get();
        if (c4225a != null) {
            c4225a.m17683c();
            this.f18525d = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (!this.f18524c.await(this.f18523b, TimeUnit.MILLISECONDS)) {
                m17688a();
            }
        } catch (InterruptedException unused) {
            m17688a();
        }
    }
}
