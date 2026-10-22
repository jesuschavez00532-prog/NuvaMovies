package p309r3;

/* renamed from: r3.h */
/* loaded from: classes.dex */
final class C6521h extends AbstractC6527n {

    /* renamed from: a */
    private final long f25076a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6521h(long j10) {
        this.f25076a = j10;
    }

    @Override // p309r3.AbstractC6527n
    /* renamed from: c */
    public long mo25538c() {
        return this.f25076a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC6527n) && this.f25076a == ((AbstractC6527n) obj).mo25538c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f25076a;
        return 1000003 ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f25076a + "}";
    }
}
