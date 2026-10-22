package p335t3;

import p335t3.AbstractC6899g;

/* renamed from: t3.b */
/* loaded from: classes.dex */
final class C6894b extends AbstractC6899g {

    /* renamed from: a */
    private final AbstractC6899g.a f26207a;

    /* renamed from: b */
    private final long f26208b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6894b(AbstractC6899g.a aVar, long j10) {
        if (aVar != null) {
            this.f26207a = aVar;
            this.f26208b = j10;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // p335t3.AbstractC6899g
    /* renamed from: b */
    public long mo26821b() {
        return this.f26208b;
    }

    @Override // p335t3.AbstractC6899g
    /* renamed from: c */
    public AbstractC6899g.a mo26822c() {
        return this.f26207a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6899g)) {
            return false;
        }
        AbstractC6899g abstractC6899g = (AbstractC6899g) obj;
        if (this.f26207a.equals(abstractC6899g.mo26822c()) && this.f26208b == abstractC6899g.mo26821b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f26207a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f26208b;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f26207a + ", nextRequestWaitMillis=" + this.f26208b + "}";
    }
}
