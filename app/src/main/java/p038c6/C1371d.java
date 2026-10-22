package p038c6;

import p038c6.AbstractC1366a0;

/* renamed from: c6.d */
/* loaded from: classes.dex */
final class C1371d extends AbstractC1366a0.c {

    /* renamed from: a */
    private final String f5261a;

    /* renamed from: b */
    private final String f5262b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c6.d$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1366a0.c.a {

        /* renamed from: a */
        private String f5263a;

        /* renamed from: b */
        private String f5264b;

        @Override // p038c6.AbstractC1366a0.c.a
        /* renamed from: a */
        public AbstractC1366a0.c mo6208a() {
            String str = "";
            if (this.f5263a == null) {
                str = " key";
            }
            if (this.f5264b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new C1371d(this.f5263a, this.f5264b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p038c6.AbstractC1366a0.c.a
        /* renamed from: b */
        public AbstractC1366a0.c.a mo6209b(String str) {
            if (str != null) {
                this.f5263a = str;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        @Override // p038c6.AbstractC1366a0.c.a
        /* renamed from: c */
        public AbstractC1366a0.c.a mo6210c(String str) {
            if (str != null) {
                this.f5264b = str;
                return this;
            }
            throw new NullPointerException("Null value");
        }
    }

    @Override // p038c6.AbstractC1366a0.c
    /* renamed from: b */
    public String mo6206b() {
        return this.f5261a;
    }

    @Override // p038c6.AbstractC1366a0.c
    /* renamed from: c */
    public String mo6207c() {
        return this.f5262b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1366a0.c)) {
            return false;
        }
        AbstractC1366a0.c cVar = (AbstractC1366a0.c) obj;
        if (this.f5261a.equals(cVar.mo6206b()) && this.f5262b.equals(cVar.mo6207c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5261a.hashCode() ^ 1000003) * 1000003) ^ this.f5262b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f5261a + ", value=" + this.f5262b + "}";
    }

    private C1371d(String str, String str2) {
        this.f5261a = str;
        this.f5262b = str2;
    }
}
