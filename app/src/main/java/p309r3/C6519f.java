package p309r3;

import java.util.Arrays;
import p309r3.AbstractC6525l;

/* renamed from: r3.f */
/* loaded from: classes.dex */
final class C6519f extends AbstractC6525l {

    /* renamed from: a */
    private final long f25048a;

    /* renamed from: b */
    private final Integer f25049b;

    /* renamed from: c */
    private final long f25050c;

    /* renamed from: d */
    private final byte[] f25051d;

    /* renamed from: e */
    private final String f25052e;

    /* renamed from: f */
    private final long f25053f;

    /* renamed from: g */
    private final AbstractC6528o f25054g;

    /* renamed from: r3.f$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC6525l.a {

        /* renamed from: a */
        private Long f25055a;

        /* renamed from: b */
        private Integer f25056b;

        /* renamed from: c */
        private Long f25057c;

        /* renamed from: d */
        private byte[] f25058d;

        /* renamed from: e */
        private String f25059e;

        /* renamed from: f */
        private Long f25060f;

        /* renamed from: g */
        private AbstractC6528o f25061g;

        @Override // p309r3.AbstractC6525l.a
        /* renamed from: a */
        public AbstractC6525l mo25515a() {
            String str = "";
            if (this.f25055a == null) {
                str = " eventTimeMs";
            }
            if (this.f25057c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f25060f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C6519f(this.f25055a.longValue(), this.f25056b, this.f25057c.longValue(), this.f25058d, this.f25059e, this.f25060f.longValue(), this.f25061g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p309r3.AbstractC6525l.a
        /* renamed from: b */
        public AbstractC6525l.a mo25516b(Integer num) {
            this.f25056b = num;
            return this;
        }

        @Override // p309r3.AbstractC6525l.a
        /* renamed from: c */
        public AbstractC6525l.a mo25517c(long j10) {
            this.f25055a = Long.valueOf(j10);
            return this;
        }

        @Override // p309r3.AbstractC6525l.a
        /* renamed from: d */
        public AbstractC6525l.a mo25518d(long j10) {
            this.f25057c = Long.valueOf(j10);
            return this;
        }

        @Override // p309r3.AbstractC6525l.a
        /* renamed from: e */
        public AbstractC6525l.a mo25519e(AbstractC6528o abstractC6528o) {
            this.f25061g = abstractC6528o;
            return this;
        }

        @Override // p309r3.AbstractC6525l.a
        /* renamed from: f */
        AbstractC6525l.a mo25520f(byte[] bArr) {
            this.f25058d = bArr;
            return this;
        }

        @Override // p309r3.AbstractC6525l.a
        /* renamed from: g */
        AbstractC6525l.a mo25521g(String str) {
            this.f25059e = str;
            return this;
        }

        @Override // p309r3.AbstractC6525l.a
        /* renamed from: h */
        public AbstractC6525l.a mo25522h(long j10) {
            this.f25060f = Long.valueOf(j10);
            return this;
        }
    }

    @Override // p309r3.AbstractC6525l
    /* renamed from: b */
    public Integer mo25508b() {
        return this.f25049b;
    }

    @Override // p309r3.AbstractC6525l
    /* renamed from: c */
    public long mo25509c() {
        return this.f25048a;
    }

    @Override // p309r3.AbstractC6525l
    /* renamed from: d */
    public long mo25510d() {
        return this.f25050c;
    }

    @Override // p309r3.AbstractC6525l
    /* renamed from: e */
    public AbstractC6528o mo25511e() {
        return this.f25054g;
    }

    public boolean equals(Object obj) {
        Integer num;
        byte[] mo25512f;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6525l)) {
            return false;
        }
        AbstractC6525l abstractC6525l = (AbstractC6525l) obj;
        if (this.f25048a == abstractC6525l.mo25509c() && ((num = this.f25049b) != null ? num.equals(abstractC6525l.mo25508b()) : abstractC6525l.mo25508b() == null) && this.f25050c == abstractC6525l.mo25510d()) {
            byte[] bArr = this.f25051d;
            if (abstractC6525l instanceof C6519f) {
                mo25512f = ((C6519f) abstractC6525l).f25051d;
            } else {
                mo25512f = abstractC6525l.mo25512f();
            }
            if (Arrays.equals(bArr, mo25512f) && ((str = this.f25052e) != null ? str.equals(abstractC6525l.mo25513g()) : abstractC6525l.mo25513g() == null) && this.f25053f == abstractC6525l.mo25514h()) {
                AbstractC6528o abstractC6528o = this.f25054g;
                if (abstractC6528o == null) {
                    if (abstractC6525l.mo25511e() == null) {
                        return true;
                    }
                } else if (abstractC6528o.equals(abstractC6525l.mo25511e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p309r3.AbstractC6525l
    /* renamed from: f */
    public byte[] mo25512f() {
        return this.f25051d;
    }

    @Override // p309r3.AbstractC6525l
    /* renamed from: g */
    public String mo25513g() {
        return this.f25052e;
    }

    @Override // p309r3.AbstractC6525l
    /* renamed from: h */
    public long mo25514h() {
        return this.f25053f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        long j10 = this.f25048a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f25049b;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j11 = this.f25050c;
        int hashCode3 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f25051d)) * 1000003;
        String str = this.f25052e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        long j12 = this.f25053f;
        int i12 = (((hashCode3 ^ hashCode2) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        AbstractC6528o abstractC6528o = this.f25054g;
        if (abstractC6528o != null) {
            i11 = abstractC6528o.hashCode();
        }
        return i12 ^ i11;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f25048a + ", eventCode=" + this.f25049b + ", eventUptimeMs=" + this.f25050c + ", sourceExtension=" + Arrays.toString(this.f25051d) + ", sourceExtensionJsonProto3=" + this.f25052e + ", timezoneOffsetSeconds=" + this.f25053f + ", networkConnectionInfo=" + this.f25054g + "}";
    }

    private C6519f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, AbstractC6528o abstractC6528o) {
        this.f25048a = j10;
        this.f25049b = num;
        this.f25050c = j11;
        this.f25051d = bArr;
        this.f25052e = str;
        this.f25053f = j12;
        this.f25054g = abstractC6528o;
    }
}
