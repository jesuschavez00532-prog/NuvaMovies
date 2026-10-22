package p038c6;

import java.util.Arrays;
import p038c6.AbstractC1366a0;

/* renamed from: c6.f */
/* loaded from: classes.dex */
final class C1373f extends AbstractC1366a0.d.b {

    /* renamed from: a */
    private final String f5269a;

    /* renamed from: b */
    private final byte[] f5270b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c6.f$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1366a0.d.b.a {

        /* renamed from: a */
        private String f5271a;

        /* renamed from: b */
        private byte[] f5272b;

        @Override // p038c6.AbstractC1366a0.d.b.a
        /* renamed from: a */
        public AbstractC1366a0.d.b mo6220a() {
            String str = "";
            if (this.f5271a == null) {
                str = " filename";
            }
            if (this.f5272b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new C1373f(this.f5271a, this.f5272b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p038c6.AbstractC1366a0.d.b.a
        /* renamed from: b */
        public AbstractC1366a0.d.b.a mo6221b(byte[] bArr) {
            if (bArr != null) {
                this.f5272b = bArr;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        @Override // p038c6.AbstractC1366a0.d.b.a
        /* renamed from: c */
        public AbstractC1366a0.d.b.a mo6222c(String str) {
            if (str != null) {
                this.f5271a = str;
                return this;
            }
            throw new NullPointerException("Null filename");
        }
    }

    @Override // p038c6.AbstractC1366a0.d.b
    /* renamed from: b */
    public byte[] mo6218b() {
        return this.f5270b;
    }

    @Override // p038c6.AbstractC1366a0.d.b
    /* renamed from: c */
    public String mo6219c() {
        return this.f5269a;
    }

    public boolean equals(Object obj) {
        byte[] mo6218b;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1366a0.d.b)) {
            return false;
        }
        AbstractC1366a0.d.b bVar = (AbstractC1366a0.d.b) obj;
        if (this.f5269a.equals(bVar.mo6219c())) {
            byte[] bArr = this.f5270b;
            if (bVar instanceof C1373f) {
                mo6218b = ((C1373f) bVar).f5270b;
            } else {
                mo6218b = bVar.mo6218b();
            }
            if (Arrays.equals(bArr, mo6218b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5269a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5270b);
    }

    public String toString() {
        return "File{filename=" + this.f5269a + ", contents=" + Arrays.toString(this.f5270b) + "}";
    }

    private C1373f(String str, byte[] bArr) {
        this.f5269a = str;
        this.f5270b = bArr;
    }
}
