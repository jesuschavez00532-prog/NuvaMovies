package ye;

import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ye.b */
/* loaded from: classes3.dex */
public final class RunnableC7708b implements Runnable, InterfaceC7718l {

    /* renamed from: a */
    private final C7717k f28323a = new C7717k();

    /* renamed from: b */
    private final C7709c f28324b;

    /* renamed from: c */
    private volatile boolean f28325c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC7708b(C7709c c7709c) {
        this.f28324b = c7709c;
    }

    @Override // ye.InterfaceC7718l
    /* renamed from: a */
    public void mo29783a(C7723q c7723q, Object obj) {
        C7716j m29820a = C7716j.m29820a(c7723q, obj);
        synchronized (this) {
            this.f28323a.m29822a(m29820a);
            if (!this.f28325c) {
                this.f28325c = true;
                this.f28324b.m29796e().execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                C7716j m29824c = this.f28323a.m29824c(1000);
                if (m29824c == null) {
                    synchronized (this) {
                        m29824c = this.f28323a.m29823b();
                        if (m29824c == null) {
                            return;
                        }
                    }
                }
                this.f28324b.m29798h(m29824c);
            } catch (InterruptedException e10) {
                this.f28324b.m29797f().mo29815b(Level.WARNING, Thread.currentThread().getName() + " was interruppted", e10);
                return;
            } finally {
                this.f28325c = false;
            }
        }
    }
}
