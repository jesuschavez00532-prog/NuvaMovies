package p038c6;

import p038c6.AbstractC1366a0;

/* renamed from: c6.v */
/* loaded from: classes.dex */
final class C1389v extends AbstractC1366a0.e.f {

    /* renamed from: a */
    private final String f5417a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c6.v$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1366a0.e.f.a {

        /* renamed from: a */
        private String f5418a;

        @Override // p038c6.AbstractC1366a0.e.f.a
        /* renamed from: a */
        public AbstractC1366a0.e.f mo6407a() {
            String str = "";
            if (this.f5418a == null) {
                str = " identifier";
            }
            if (str.isEmpty()) {
                return new C1389v(this.f5418a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p038c6.AbstractC1366a0.e.f.a
        /* renamed from: b */
        public AbstractC1366a0.e.f.a mo6408b(String str) {
            if (str != null) {
                this.f5418a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }
    }

    @Override // p038c6.AbstractC1366a0.e.f
    /* renamed from: b */
    public String mo6406b() {
        return this.f5417a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1366a0.e.f) {
            return this.f5417a.equals(((AbstractC1366a0.e.f) obj).mo6406b());
        }
        return false;
    }

    public int hashCode() {
        return this.f5417a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f5417a + "}";
    }

    private C1389v(String str) {
        this.f5417a = str;
    }
}
