package p324s3;

import java.util.Arrays;
import p294q3.EnumC6337d;
import p324s3.AbstractC6667o;

/* renamed from: s3.d */
/* loaded from: classes.dex */
final class C6656d extends AbstractC6667o {

    /* renamed from: a */
    private final String f25552a;

    /* renamed from: b */
    private final byte[] f25553b;

    /* renamed from: c */
    private final EnumC6337d f25554c;

    /* renamed from: s3.d$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC6667o.a {

        /* renamed from: a */
        private String f25555a;

        /* renamed from: b */
        private byte[] f25556b;

        /* renamed from: c */
        private EnumC6337d f25557c;

        @Override // p324s3.AbstractC6667o.a
        /* renamed from: a */
        public AbstractC6667o mo26007a() {
            String str = "";
            if (this.f25555a == null) {
                str = " backendName";
            }
            if (this.f25557c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C6656d(this.f25555a, this.f25556b, this.f25557c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p324s3.AbstractC6667o.a
        /* renamed from: b */
        public AbstractC6667o.a mo26008b(String str) {
            if (str != null) {
                this.f25555a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        @Override // p324s3.AbstractC6667o.a
        /* renamed from: c */
        public AbstractC6667o.a mo26009c(byte[] bArr) {
            this.f25556b = bArr;
            return this;
        }

        @Override // p324s3.AbstractC6667o.a
        /* renamed from: d */
        public AbstractC6667o.a mo26010d(EnumC6337d enumC6337d) {
            if (enumC6337d != null) {
                this.f25557c = enumC6337d;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    @Override // p324s3.AbstractC6667o
    /* renamed from: b */
    public String mo26004b() {
        return this.f25552a;
    }

    @Override // p324s3.AbstractC6667o
    /* renamed from: c */
    public byte[] mo26005c() {
        return this.f25553b;
    }

    @Override // p324s3.AbstractC6667o
    /* renamed from: d */
    public EnumC6337d mo26006d() {
        return this.f25554c;
    }

    public boolean equals(Object obj) {
        byte[] mo26005c;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6667o)) {
            return false;
        }
        AbstractC6667o abstractC6667o = (AbstractC6667o) obj;
        if (this.f25552a.equals(abstractC6667o.mo26004b())) {
            byte[] bArr = this.f25553b;
            if (abstractC6667o instanceof C6656d) {
                mo26005c = ((C6656d) abstractC6667o).f25553b;
            } else {
                mo26005c = abstractC6667o.mo26005c();
            }
            if (Arrays.equals(bArr, mo26005c) && this.f25554c.equals(abstractC6667o.mo26006d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f25552a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f25553b)) * 1000003) ^ this.f25554c.hashCode();
    }

    private C6656d(String str, byte[] bArr, EnumC6337d enumC6337d) {
        this.f25552a = str;
        this.f25553b = bArr;
        this.f25554c = enumC6337d;
    }
}
