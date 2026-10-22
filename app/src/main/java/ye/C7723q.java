package ye;

/* renamed from: ye.q */
/* loaded from: classes3.dex */
final class C7723q {

    /* renamed from: a */
    final Object f28404a;

    /* renamed from: b */
    final C7721o f28405b;

    /* renamed from: c */
    volatile boolean f28406c = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7723q(Object obj, C7721o c7721o) {
        this.f28404a = obj;
        this.f28405b = c7721o;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7723q)) {
            return false;
        }
        C7723q c7723q = (C7723q) obj;
        if (this.f28404a != c7723q.f28404a || !this.f28405b.equals(c7723q.f28405b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f28404a.hashCode() + this.f28405b.f28390f.hashCode();
    }
}
