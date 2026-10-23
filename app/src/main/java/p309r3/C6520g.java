package p309r3;

import java.util.List;
import p309r3.AbstractC6526m;

/* renamed from: r3.g */
/* loaded from: classes.dex */
final class C6520g extends AbstractC6526m {

    /* renamed from: a */
    private final long f25062a;

    /* renamed from: b */
    private final long f25063b;

    /* renamed from: c */
    private final AbstractC6524k f25064c;

    /* renamed from: d */
    private final Integer f25065d;

    /* renamed from: e */
    private final String f25066e;

    /* renamed from: f */
    private final List f25067f;

    /* renamed from: g */
    private final EnumC6529p f25068g;

    /* renamed from: r3.g$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC6526m.a {

        /* renamed from: a */
        private Long f25069a;

        /* renamed from: b */
        private Long f25070b;

        /* renamed from: c */
        private AbstractC6524k f25071c;

        /* renamed from: d */
        private Integer f25072d;

        /* renamed from: e */
        private String f25073e;

        /* renamed from: f */
        private List f25074f;

        /* renamed from: g */
        private EnumC6529p f25075g;

        @Override // p309r3.AbstractC6526m.a
        /* renamed from: a */
        public AbstractC6526m mo25530a() {
            String str = "";
            if (this.f25069a == null) {
                str = " requestTimeMs";
            }
            if (this.f25070b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C6520g(this.f25069a.longValue(), this.f25070b.longValue(), this.f25071c, this.f25072d, this.f25073e, this.f25074f, this.f25075g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p309r3.AbstractC6526m.a
        /* renamed from: b */
        public AbstractC6526m.a mo25531b(AbstractC6524k abstractC6524k) {
            this.f25071c = abstractC6524k;
            return this;
        }

        @Override // p309r3.AbstractC6526m.a
        /* renamed from: c */
        public AbstractC6526m.a mo25532c(List list) {
            this.f25074f = list;
            return this;
        }

        @Override // p309r3.AbstractC6526m.a
        /* renamed from: d */
        AbstractC6526m.a mo25533d(Integer num) {
            this.f25072d = num;
            return this;
        }

        @Override // p309r3.AbstractC6526m.a
        /* renamed from: e */
        AbstractC6526m.a mo25534e(String str) {
            this.f25073e = str;
            return this;
        }

        @Override // p309r3.AbstractC6526m.a
        /* renamed from: f */
        public AbstractC6526m.a mo25535f(EnumC6529p enumC6529p) {
            this.f25075g = enumC6529p;
            return this;
        }

        @Override // p309r3.AbstractC6526m.a
        /* renamed from: g */
        public AbstractC6526m.a mo25536g(long j10) {
            this.f25069a = Long.valueOf(j10);
            return this;
        }

        @Override // p309r3.AbstractC6526m.a
        /* renamed from: h */
        public AbstractC6526m.a mo25537h(long j10) {
            this.f25070b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // p309r3.AbstractC6526m
    /* renamed from: b */
    public AbstractC6524k mo25523b() {
        return this.f25064c;
    }

    @Override // p309r3.AbstractC6526m
    /* renamed from: c */
    public List mo25524c() {
        return this.f25067f;
    }

    @Override // p309r3.AbstractC6526m
    /* renamed from: d */
    public Integer mo25525d() {
        return this.f25065d;
    }

    @Override // p309r3.AbstractC6526m
    /* renamed from: e */
    public String mo25526e() {
        return this.f25066e;
    }

    public boolean equals(Object obj) {
        AbstractC6524k abstractC6524k;
        Integer num;
        String str = null;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6526m)) {
            return false;
        }
        AbstractC6526m abstractC6526m = (AbstractC6526m) obj;
        if (this.f25062a == abstractC6526m.mo25528g() && this.f25063b == abstractC6526m.mo25529h() && ((abstractC6524k = this.f25064c) != null ? abstractC6524k.equals(abstractC6526m.mo25523b()) : abstractC6526m.mo25523b() == null) && ((num = this.f25065d) != null ? num.equals(abstractC6526m.mo25525d()) : abstractC6526m.mo25525d() == null) && ((str = this.f25066e) != null ? str.equals(abstractC6526m.mo25526e()) : abstractC6526m.mo25526e() == null) && ((list = this.f25067f) != null ? list.equals(abstractC6526m.mo25524c()) : abstractC6526m.mo25524c() == null)) {
            EnumC6529p enumC6529p = this.f25068g;
            if (enumC6529p == null) {
                if (abstractC6526m.mo25527f() == null) {
                    return true;
                }
            } else if (enumC6529p.equals(abstractC6526m.mo25527f())) {
                return true;
            }
        }
        return false;
    }

    @Override // p309r3.AbstractC6526m
    /* renamed from: f */
    public EnumC6529p mo25527f() {
        return this.f25068g;
    }

    @Override // p309r3.AbstractC6526m
    /* renamed from: g */
    public long mo25528g() {
        return this.f25062a;
    }

    @Override // p309r3.AbstractC6526m
    /* renamed from: h */
    public long mo25529h() {
        return this.f25063b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j10 = this.f25062a;
        long j11 = this.f25063b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        AbstractC6524k abstractC6524k = this.f25064c;
        int i11 = 0;
        if (abstractC6524k == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC6524k.hashCode();
        }
        int i12 = (i10 ^ hashCode) * 1000003;
        Integer num = this.f25065d;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        String str = this.f25066e;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i14 = (i13 ^ hashCode3) * 1000003;
        List list = this.f25067f;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        EnumC6529p enumC6529p = this.f25068g;
        if (enumC6529p != null) {
            i11 = enumC6529p.hashCode();
        }
        return i15 ^ i11;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f25062a + ", requestUptimeMs=" + this.f25063b + ", clientInfo=" + this.f25064c + ", logSource=" + this.f25065d + ", logSourceName=" + this.f25066e + ", logEvents=" + this.f25067f + ", qosTier=" + this.f25068g + "}";
    }

    private C6520g(long j10, long j11, AbstractC6524k abstractC6524k, Integer num, String str, List list, EnumC6529p enumC6529p) {
        this.f25062a = j10;
        this.f25063b = j11;
        this.f25064c = abstractC6524k;
        this.f25065d = num;
        this.f25066e = str;
        this.f25067f = list;
        this.f25068g = enumC6529p;
    }
}
