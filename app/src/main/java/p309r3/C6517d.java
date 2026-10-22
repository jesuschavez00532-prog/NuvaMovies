package p309r3;

import java.util.List;

/* renamed from: r3.d */
/* loaded from: classes.dex */
final class C6517d extends AbstractC6523j {

    /* renamed from: a */
    private final List f25043a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6517d(List list) {
        if (list != null) {
            this.f25043a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    @Override // p309r3.AbstractC6523j
    /* renamed from: c */
    public List mo25502c() {
        return this.f25043a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6523j) {
            return this.f25043a.equals(((AbstractC6523j) obj).mo25502c());
        }
        return false;
    }

    public int hashCode() {
        return this.f25043a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f25043a + "}";
    }
}
