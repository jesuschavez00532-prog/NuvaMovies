package p038c6;

import p038c6.AbstractC1366a0;

/* renamed from: c6.e */
/* loaded from: classes.dex */
final class C1372e extends AbstractC1366a0.d {

    /* renamed from: a */
    private final C1368b0 f5265a;

    /* renamed from: b */
    private final String f5266b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c6.e$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1366a0.d.a {

        /* renamed from: a */
        private C1368b0 f5267a;

        /* renamed from: b */
        private String f5268b;

        @Override // p038c6.AbstractC1366a0.d.a
        /* renamed from: a */
        public AbstractC1366a0.d mo6214a() {
            String str = "";
            if (this.f5267a == null) {
                str = " files";
            }
            if (str.isEmpty()) {
                return new C1372e(this.f5267a, this.f5268b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p038c6.AbstractC1366a0.d.a
        /* renamed from: b */
        public AbstractC1366a0.d.a mo6215b(C1368b0 c1368b0) {
            if (c1368b0 != null) {
                this.f5267a = c1368b0;
                return this;
            }
            throw new NullPointerException("Null files");
        }

        @Override // p038c6.AbstractC1366a0.d.a
        /* renamed from: c */
        public AbstractC1366a0.d.a mo6216c(String str) {
            this.f5268b = str;
            return this;
        }
    }

    @Override // p038c6.AbstractC1366a0.d
    /* renamed from: b */
    public C1368b0 mo6212b() {
        return this.f5265a;
    }

    @Override // p038c6.AbstractC1366a0.d
    /* renamed from: c */
    public String mo6213c() {
        return this.f5266b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1366a0.d)) {
            return false;
        }
        AbstractC1366a0.d dVar = (AbstractC1366a0.d) obj;
        if (this.f5265a.equals(dVar.mo6212b())) {
            String str = this.f5266b;
            if (str == null) {
                if (dVar.mo6213c() == null) {
                    return true;
                }
            } else if (str.equals(dVar.mo6213c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f5265a.hashCode() ^ 1000003) * 1000003;
        String str = this.f5266b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "FilesPayload{files=" + this.f5265a + ", orgId=" + this.f5266b + "}";
    }

    private C1372e(C1368b0 c1368b0, String str) {
        this.f5265a = c1368b0;
        this.f5266b = str;
    }
}
