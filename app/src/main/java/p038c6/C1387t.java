package p038c6;

import p038c6.AbstractC1366a0;

/* renamed from: c6.t */
/* loaded from: classes.dex */
final class C1387t extends AbstractC1366a0.e.d.AbstractC7816d {

    /* renamed from: a */
    private final String f5407a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c6.t$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1366a0.e.d.AbstractC7816d.a {

        /* renamed from: a */
        private String f5408a;

        @Override // p038c6.AbstractC1366a0.e.d.AbstractC7816d.a
        /* renamed from: a */
        public AbstractC1366a0.e.d.AbstractC7816d mo6393a() {
            String str = "";
            if (this.f5408a == null) {
                str = " content";
            }
            if (str.isEmpty()) {
                return new C1387t(this.f5408a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p038c6.AbstractC1366a0.e.d.AbstractC7816d.a
        /* renamed from: b */
        public AbstractC1366a0.e.d.AbstractC7816d.a mo6394b(String str) {
            if (str != null) {
                this.f5408a = str;
                return this;
            }
            throw new NullPointerException("Null content");
        }
    }

    @Override // p038c6.AbstractC1366a0.e.d.AbstractC7816d
    /* renamed from: b */
    public String mo6392b() {
        return this.f5407a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1366a0.e.d.AbstractC7816d) {
            return this.f5407a.equals(((AbstractC1366a0.e.d.AbstractC7816d) obj).mo6392b());
        }
        return false;
    }

    public int hashCode() {
        return this.f5407a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f5407a + "}";
    }

    private C1387t(String str) {
        this.f5407a = str;
    }
}
