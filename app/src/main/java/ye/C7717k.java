package ye;

/* renamed from: ye.k */
/* loaded from: classes3.dex */
final class C7717k {

    /* renamed from: a */
    private C7716j f28379a;

    /* renamed from: b */
    private C7716j f28380b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m29822a(C7716j c7716j) {
        try {
            if (c7716j != null) {
                C7716j c7716j2 = this.f28380b;
                if (c7716j2 != null) {
                    c7716j2.f28378c = c7716j;
                    this.f28380b = c7716j;
                } else if (this.f28379a == null) {
                    this.f28380b = c7716j;
                    this.f28379a = c7716j;
                } else {
                    throw new IllegalStateException("Head present, but no tail");
                }
                notifyAll();
            } else {
                throw new NullPointerException("null cannot be enqueued");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized C7716j m29823b() {
        C7716j c7716j;
        c7716j = this.f28379a;
        if (c7716j != null) {
            C7716j c7716j2 = c7716j.f28378c;
            this.f28379a = c7716j2;
            if (c7716j2 == null) {
                this.f28380b = null;
            }
        }
        return c7716j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized C7716j m29824c(int i10) {
        if (this.f28379a == null) {
            wait(i10);
        }
        return m29823b();
    }
}
