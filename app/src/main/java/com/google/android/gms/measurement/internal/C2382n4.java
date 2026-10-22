package com.google.android.gms.measurement.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.n4 */
/* loaded from: classes.dex */
public final class C2382n4 extends Thread {

    /* renamed from: a */
    private final Object f8857a;

    /* renamed from: b */
    private final BlockingQueue f8858b;

    /* renamed from: c */
    private boolean f8859c = false;

    /* renamed from: d */
    final /* synthetic */ C2393o4 f8860d;

    public C2382n4(C2393o4 c2393o4, String str, BlockingQueue blockingQueue) {
        this.f8860d = c2393o4;
        AbstractC5391n.m21783i(str);
        AbstractC5391n.m21783i(blockingQueue);
        this.f8857a = new Object();
        this.f8858b = blockingQueue;
        setName(str);
    }

    /* renamed from: b */
    private final void m9872b() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        C2382n4 c2382n4;
        C2382n4 c2382n42;
        obj = this.f8860d.f8884i;
        synchronized (obj) {
            if (!this.f8859c) {
                semaphore = this.f8860d.f8885j;
                semaphore.release();
                obj2 = this.f8860d.f8884i;
                obj2.notifyAll();
                C2393o4 c2393o4 = this.f8860d;
                c2382n4 = c2393o4.f8878c;
                if (this == c2382n4) {
                    c2393o4.f8878c = null;
                } else {
                    c2382n42 = c2393o4.f8879d;
                    if (this == c2382n42) {
                        c2393o4.f8879d = null;
                    } else {
                        c2393o4.f8714a.mo9577b().m9800r().m9699a("Current scheduler thread is neither worker nor network");
                    }
                }
                this.f8859c = true;
            }
        }
    }

    /* renamed from: c */
    private final void m9873c(InterruptedException interruptedException) {
        this.f8860d.f8714a.mo9577b().m9805w().m9700b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* renamed from: a */
    public final void m9874a() {
        synchronized (this.f8857a) {
            this.f8857a.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        int i10;
        Object obj;
        boolean z10 = false;
        while (!z10) {
            try {
                semaphore = this.f8860d.f8885j;
                semaphore.acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                m9873c(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C2371m4 c2371m4 = (C2371m4) this.f8858b.poll();
                if (c2371m4 != null) {
                    if (true != c2371m4.f8800b) {
                        i10 = 10;
                    } else {
                        i10 = threadPriority;
                    }
                    Process.setThreadPriority(i10);
                    c2371m4.run();
                } else {
                    synchronized (this.f8857a) {
                        if (this.f8858b.peek() == null) {
                            C2393o4.m9882B(this.f8860d);
                            try {
                                this.f8857a.wait(30000L);
                            } catch (InterruptedException e11) {
                                m9873c(e11);
                            }
                        }
                    }
                    obj = this.f8860d.f8884i;
                    synchronized (obj) {
                        if (this.f8858b.peek() == null) {
                            m9872b();
                            return;
                        }
                    }
                }
            }
        } finally {
            m9872b();
        }
    }
}
