package p024b4;

import p324s3.AbstractC6661i;
import p324s3.AbstractC6667o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b4.b */
/* loaded from: classes.dex */
public final class C1051b extends AbstractC1069k {

    /* renamed from: a */
    private final long f4332a;

    /* renamed from: b */
    private final AbstractC6667o f4333b;

    /* renamed from: c */
    private final AbstractC6661i f4334c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1051b(long j10, AbstractC6667o abstractC6667o, AbstractC6661i abstractC6661i) {
        this.f4332a = j10;
        if (abstractC6667o != null) {
            this.f4333b = abstractC6667o;
            if (abstractC6661i != null) {
                this.f4334c = abstractC6661i;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    @Override // p024b4.AbstractC1069k
    /* renamed from: b */
    public AbstractC6661i mo4913b() {
        return this.f4334c;
    }

    @Override // p024b4.AbstractC1069k
    /* renamed from: c */
    public long mo4914c() {
        return this.f4332a;
    }

    @Override // p024b4.AbstractC1069k
    /* renamed from: d */
    public AbstractC6667o mo4915d() {
        return this.f4333b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1069k)) {
            return false;
        }
        AbstractC1069k abstractC1069k = (AbstractC1069k) obj;
        if (this.f4332a == abstractC1069k.mo4914c() && this.f4333b.equals(abstractC1069k.mo4915d()) && this.f4334c.equals(abstractC1069k.mo4913b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f4332a;
        return this.f4334c.hashCode() ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f4333b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f4332a + ", transportContext=" + this.f4333b + ", event=" + this.f4334c + "}";
    }
}
