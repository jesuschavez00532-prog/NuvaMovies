package p331t;

import android.os.CancellationSignal;

/* renamed from: t.b */
/* loaded from: classes.dex */
public final class C6871b {

    /* renamed from: a */
    private boolean f26162a;

    /* renamed from: b */
    private a f26163b;

    /* renamed from: c */
    private Object f26164c;

    /* renamed from: d */
    private boolean f26165d;

    /* renamed from: t.b$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo3255a();
    }

    /* renamed from: d */
    private void m26778d() {
        while (this.f26165d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: a */
    public void m26779a() {
        synchronized (this) {
            if (this.f26162a) {
                return;
            }
            this.f26162a = true;
            this.f26165d = true;
            a aVar = this.f26163b;
            Object obj = this.f26164c;
            if (aVar != null) {
                try {
                    aVar.mo3255a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f26165d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                ((CancellationSignal) obj).cancel();
            }
            synchronized (this) {
                this.f26165d = false;
                notifyAll();
            }
        }
    }

    /* renamed from: b */
    public boolean m26780b() {
        boolean z10;
        synchronized (this) {
            z10 = this.f26162a;
        }
        return z10;
    }

    /* renamed from: c */
    public void m26781c(a aVar) {
        synchronized (this) {
            m26778d();
            if (this.f26163b == aVar) {
                return;
            }
            this.f26163b = aVar;
            if (this.f26162a && aVar != null) {
                aVar.mo3255a();
            }
        }
    }
}
