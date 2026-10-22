package p335t3;

import java.util.Arrays;
import p335t3.AbstractC6898f;

/* renamed from: t3.a */
/* loaded from: classes.dex */
final class C6893a extends AbstractC6898f {

    /* renamed from: a */
    private final Iterable f26203a;

    /* renamed from: b */
    private final byte[] f26204b;

    /* renamed from: t3.a$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC6898f.a {

        /* renamed from: a */
        private Iterable f26205a;

        /* renamed from: b */
        private byte[] f26206b;

        @Override // p335t3.AbstractC6898f.a
        /* renamed from: a */
        public AbstractC6898f mo26818a() {
            String str = "";
            if (this.f26205a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new C6893a(this.f26205a, this.f26206b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p335t3.AbstractC6898f.a
        /* renamed from: b */
        public AbstractC6898f.a mo26819b(Iterable iterable) {
            if (iterable != null) {
                this.f26205a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        @Override // p335t3.AbstractC6898f.a
        /* renamed from: c */
        public AbstractC6898f.a mo26820c(byte[] bArr) {
            this.f26206b = bArr;
            return this;
        }
    }

    @Override // p335t3.AbstractC6898f
    /* renamed from: b */
    public Iterable mo26816b() {
        return this.f26203a;
    }

    @Override // p335t3.AbstractC6898f
    /* renamed from: c */
    public byte[] mo26817c() {
        return this.f26204b;
    }

    public boolean equals(Object obj) {
        byte[] mo26817c;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6898f)) {
            return false;
        }
        AbstractC6898f abstractC6898f = (AbstractC6898f) obj;
        if (this.f26203a.equals(abstractC6898f.mo26816b())) {
            byte[] bArr = this.f26204b;
            if (abstractC6898f instanceof C6893a) {
                mo26817c = ((C6893a) abstractC6898f).f26204b;
            } else {
                mo26817c = abstractC6898f.mo26817c();
            }
            if (Arrays.equals(bArr, mo26817c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f26203a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f26204b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f26203a + ", extras=" + Arrays.toString(this.f26204b) + "}";
    }

    private C6893a(Iterable iterable, byte[] bArr) {
        this.f26203a = iterable;
        this.f26204b = bArr;
    }
}
