package p038c6;

import p038c6.AbstractC1366a0;

/* renamed from: c6.o */
/* loaded from: classes.dex */
final class C1382o extends AbstractC1366a0.e.d.a.b.c {

    /* renamed from: a */
    private final String f5363a;

    /* renamed from: b */
    private final String f5364b;

    /* renamed from: c */
    private final C1368b0 f5365c;

    /* renamed from: d */
    private final AbstractC1366a0.e.d.a.b.c f5366d;

    /* renamed from: e */
    private final int f5367e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c6.o$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1366a0.e.d.a.b.c.AbstractC7809a {

        /* renamed from: a */
        private String f5368a;

        /* renamed from: b */
        private String f5369b;

        /* renamed from: c */
        private C1368b0 f5370c;

        /* renamed from: d */
        private AbstractC1366a0.e.d.a.b.c f5371d;

        /* renamed from: e */
        private Integer f5372e;

        @Override // p038c6.AbstractC1366a0.e.d.a.b.c.AbstractC7809a
        /* renamed from: a */
        public AbstractC1366a0.e.d.a.b.c mo6337a() {
            String str = "";
            if (this.f5368a == null) {
                str = " type";
            }
            if (this.f5370c == null) {
                str = str + " frames";
            }
            if (this.f5372e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new C1382o(this.f5368a, this.f5369b, this.f5370c, this.f5371d, this.f5372e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.b.c.AbstractC7809a
        /* renamed from: b */
        public AbstractC1366a0.e.d.a.b.c.AbstractC7809a mo6338b(AbstractC1366a0.e.d.a.b.c cVar) {
            this.f5371d = cVar;
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.b.c.AbstractC7809a
        /* renamed from: c */
        public AbstractC1366a0.e.d.a.b.c.AbstractC7809a mo6339c(C1368b0 c1368b0) {
            if (c1368b0 != null) {
                this.f5370c = c1368b0;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.b.c.AbstractC7809a
        /* renamed from: d */
        public AbstractC1366a0.e.d.a.b.c.AbstractC7809a mo6340d(int i10) {
            this.f5372e = Integer.valueOf(i10);
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.b.c.AbstractC7809a
        /* renamed from: e */
        public AbstractC1366a0.e.d.a.b.c.AbstractC7809a mo6341e(String str) {
            this.f5369b = str;
            return this;
        }

        @Override // p038c6.AbstractC1366a0.e.d.a.b.c.AbstractC7809a
        /* renamed from: f */
        public AbstractC1366a0.e.d.a.b.c.AbstractC7809a mo6342f(String str) {
            if (str != null) {
                this.f5368a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    @Override // p038c6.AbstractC1366a0.e.d.a.b.c
    /* renamed from: b */
    public AbstractC1366a0.e.d.a.b.c mo6332b() {
        return this.f5366d;
    }

    @Override // p038c6.AbstractC1366a0.e.d.a.b.c
    /* renamed from: c */
    public C1368b0 mo6333c() {
        return this.f5365c;
    }

    @Override // p038c6.AbstractC1366a0.e.d.a.b.c
    /* renamed from: d */
    public int mo6334d() {
        return this.f5367e;
    }

    @Override // p038c6.AbstractC1366a0.e.d.a.b.c
    /* renamed from: e */
    public String mo6335e() {
        return this.f5364b;
    }

    public boolean equals(Object obj) {
        String str = null;
        AbstractC1366a0.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1366a0.e.d.a.b.c)) {
            return false;
        }
        AbstractC1366a0.e.d.a.b.c cVar2 = (AbstractC1366a0.e.d.a.b.c) obj;
        if (this.f5363a.equals(cVar2.mo6336f()) && ((str = this.f5364b) != null ? str.equals(cVar2.mo6335e()) : cVar2.mo6335e() == null) && this.f5365c.equals(cVar2.mo6333c()) && ((cVar = this.f5366d) != null ? cVar.equals(cVar2.mo6332b()) : cVar2.mo6332b() == null) && this.f5367e == cVar2.mo6334d()) {
            return true;
        }
        return false;
    }

    @Override // p038c6.AbstractC1366a0.e.d.a.b.c
    /* renamed from: f */
    public String mo6336f() {
        return this.f5363a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f5363a.hashCode() ^ 1000003) * 1000003;
        String str = this.f5364b;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f5365c.hashCode()) * 1000003;
        AbstractC1366a0.e.d.a.b.c cVar = this.f5366d;
        if (cVar != null) {
            i10 = cVar.hashCode();
        }
        return ((hashCode3 ^ i10) * 1000003) ^ this.f5367e;
    }

    public String toString() {
        return "Exception{type=" + this.f5363a + ", reason=" + this.f5364b + ", frames=" + this.f5365c + ", causedBy=" + this.f5366d + ", overflowCount=" + this.f5367e + "}";
    }

    private C1382o(String str, String str2, C1368b0 c1368b0, AbstractC1366a0.e.d.a.b.c cVar, int i10) {
        this.f5363a = str;
        this.f5364b = str2;
        this.f5365c = c1368b0;
        this.f5366d = cVar;
        this.f5367e = i10;
    }
}
