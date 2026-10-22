package p005a4;

import java.util.Set;
import p005a4.AbstractC0060z;

/* renamed from: a4.d */
/* loaded from: classes.dex */
final class C0023d extends AbstractC0060z.b {

    /* renamed from: a */
    private final long f119a;

    /* renamed from: b */
    private final long f120b;

    /* renamed from: c */
    private final Set f121c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a4.d$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC0060z.b.a {

        /* renamed from: a */
        private Long f122a;

        /* renamed from: b */
        private Long f123b;

        /* renamed from: c */
        private Set f124c;

        @Override // p005a4.AbstractC0060z.b.a
        /* renamed from: a */
        public AbstractC0060z.b mo146a() {
            String str = "";
            if (this.f122a == null) {
                str = " delta";
            }
            if (this.f123b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f124c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C0023d(this.f122a.longValue(), this.f123b.longValue(), this.f124c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p005a4.AbstractC0060z.b.a
        /* renamed from: b */
        public AbstractC0060z.b.a mo147b(long j10) {
            this.f122a = Long.valueOf(j10);
            return this;
        }

        @Override // p005a4.AbstractC0060z.b.a
        /* renamed from: c */
        public AbstractC0060z.b.a mo148c(Set set) {
            if (set != null) {
                this.f124c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        @Override // p005a4.AbstractC0060z.b.a
        /* renamed from: d */
        public AbstractC0060z.b.a mo149d(long j10) {
            this.f123b = Long.valueOf(j10);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p005a4.AbstractC0060z.b
    /* renamed from: b */
    public long mo143b() {
        return this.f119a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p005a4.AbstractC0060z.b
    /* renamed from: c */
    public Set mo144c() {
        return this.f121c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p005a4.AbstractC0060z.b
    /* renamed from: d */
    public long mo145d() {
        return this.f120b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0060z.b)) {
            return false;
        }
        AbstractC0060z.b bVar = (AbstractC0060z.b) obj;
        if (this.f119a == bVar.mo143b() && this.f120b == bVar.mo145d() && this.f121c.equals(bVar.mo144c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f119a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f120b;
        return this.f121c.hashCode() ^ ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f119a + ", maxAllowedDelay=" + this.f120b + ", flags=" + this.f121c + "}";
    }

    private C0023d(long j10, long j11, Set set) {
        this.f119a = j10;
        this.f120b = j11;
        this.f121c = set;
    }
}
