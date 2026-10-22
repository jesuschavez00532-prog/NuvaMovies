package p324s3;

import p294q3.AbstractC6336c;
import p294q3.C6335b;
import p294q3.InterfaceC6338e;
import p324s3.AbstractC6666n;

/* renamed from: s3.c */
/* loaded from: classes.dex */
final class C6655c extends AbstractC6666n {

    /* renamed from: a */
    private final AbstractC6667o f25542a;

    /* renamed from: b */
    private final String f25543b;

    /* renamed from: c */
    private final AbstractC6336c f25544c;

    /* renamed from: d */
    private final InterfaceC6338e f25545d;

    /* renamed from: e */
    private final C6335b f25546e;

    /* renamed from: s3.c$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC6666n.a {

        /* renamed from: a */
        private AbstractC6667o f25547a;

        /* renamed from: b */
        private String f25548b;

        /* renamed from: c */
        private AbstractC6336c f25549c;

        /* renamed from: d */
        private InterfaceC6338e f25550d;

        /* renamed from: e */
        private C6335b f25551e;

        @Override // p324s3.AbstractC6666n.a
        /* renamed from: a */
        public AbstractC6666n mo25998a() {
            String str = "";
            if (this.f25547a == null) {
                str = " transportContext";
            }
            if (this.f25548b == null) {
                str = str + " transportName";
            }
            if (this.f25549c == null) {
                str = str + " event";
            }
            if (this.f25550d == null) {
                str = str + " transformer";
            }
            if (this.f25551e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C6655c(this.f25547a, this.f25548b, this.f25549c, this.f25550d, this.f25551e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p324s3.AbstractC6666n.a
        /* renamed from: b */
        AbstractC6666n.a mo25999b(C6335b c6335b) {
            if (c6335b != null) {
                this.f25551e = c6335b;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        @Override // p324s3.AbstractC6666n.a
        /* renamed from: c */
        AbstractC6666n.a mo26000c(AbstractC6336c abstractC6336c) {
            if (abstractC6336c != null) {
                this.f25549c = abstractC6336c;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        @Override // p324s3.AbstractC6666n.a
        /* renamed from: d */
        AbstractC6666n.a mo26001d(InterfaceC6338e interfaceC6338e) {
            if (interfaceC6338e != null) {
                this.f25550d = interfaceC6338e;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        @Override // p324s3.AbstractC6666n.a
        /* renamed from: e */
        public AbstractC6666n.a mo26002e(AbstractC6667o abstractC6667o) {
            if (abstractC6667o != null) {
                this.f25547a = abstractC6667o;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        @Override // p324s3.AbstractC6666n.a
        /* renamed from: f */
        public AbstractC6666n.a mo26003f(String str) {
            if (str != null) {
                this.f25548b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    @Override // p324s3.AbstractC6666n
    /* renamed from: b */
    public C6335b mo25993b() {
        return this.f25546e;
    }

    @Override // p324s3.AbstractC6666n
    /* renamed from: c */
    AbstractC6336c mo25994c() {
        return this.f25544c;
    }

    @Override // p324s3.AbstractC6666n
    /* renamed from: e */
    InterfaceC6338e mo25995e() {
        return this.f25545d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6666n)) {
            return false;
        }
        AbstractC6666n abstractC6666n = (AbstractC6666n) obj;
        if (this.f25542a.equals(abstractC6666n.mo25996f()) && this.f25543b.equals(abstractC6666n.mo25997g()) && this.f25544c.equals(abstractC6666n.mo25994c()) && this.f25545d.equals(abstractC6666n.mo25995e()) && this.f25546e.equals(abstractC6666n.mo25993b())) {
            return true;
        }
        return false;
    }

    @Override // p324s3.AbstractC6666n
    /* renamed from: f */
    public AbstractC6667o mo25996f() {
        return this.f25542a;
    }

    @Override // p324s3.AbstractC6666n
    /* renamed from: g */
    public String mo25997g() {
        return this.f25543b;
    }

    public int hashCode() {
        return ((((((((this.f25542a.hashCode() ^ 1000003) * 1000003) ^ this.f25543b.hashCode()) * 1000003) ^ this.f25544c.hashCode()) * 1000003) ^ this.f25545d.hashCode()) * 1000003) ^ this.f25546e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f25542a + ", transportName=" + this.f25543b + ", event=" + this.f25544c + ", transformer=" + this.f25545d + ", encoding=" + this.f25546e + "}";
    }

    private C6655c(AbstractC6667o abstractC6667o, String str, AbstractC6336c abstractC6336c, InterfaceC6338e interfaceC6338e, C6335b c6335b) {
        this.f25542a = abstractC6667o;
        this.f25543b = str;
        this.f25544c = abstractC6336c;
        this.f25545d = interfaceC6338e;
        this.f25546e = c6335b;
    }
}
