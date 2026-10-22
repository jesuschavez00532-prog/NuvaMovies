package p377w3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p324s3.AbstractC6664l;

/* renamed from: w3.a */
/* loaded from: classes.dex */
public final class C7355a {

    /* renamed from: e */
    private static final C7355a f27298e = new a().m28392b();

    /* renamed from: a */
    private final C7360f f27299a;

    /* renamed from: b */
    private final List f27300b;

    /* renamed from: c */
    private final C7356b f27301c;

    /* renamed from: d */
    private final String f27302d;

    /* renamed from: w3.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private C7360f f27303a = null;

        /* renamed from: b */
        private List f27304b = new ArrayList();

        /* renamed from: c */
        private C7356b f27305c = null;

        /* renamed from: d */
        private String f27306d = "";

        a() {
        }

        /* renamed from: a */
        public a m28391a(C7358d c7358d) {
            this.f27304b.add(c7358d);
            return this;
        }

        /* renamed from: b */
        public C7355a m28392b() {
            return new C7355a(this.f27303a, Collections.unmodifiableList(this.f27304b), this.f27305c, this.f27306d);
        }

        /* renamed from: c */
        public a m28393c(String str) {
            this.f27306d = str;
            return this;
        }

        /* renamed from: d */
        public a m28394d(C7356b c7356b) {
            this.f27305c = c7356b;
            return this;
        }

        /* renamed from: e */
        public a m28395e(C7360f c7360f) {
            this.f27303a = c7360f;
            return this;
        }
    }

    C7355a(C7360f c7360f, List list, C7356b c7356b, String str) {
        this.f27299a = c7360f;
        this.f27300b = list;
        this.f27301c = c7356b;
        this.f27302d = str;
    }

    /* renamed from: e */
    public static a m28385e() {
        return new a();
    }

    /* renamed from: a */
    public String m28386a() {
        return this.f27302d;
    }

    /* renamed from: b */
    public C7356b m28387b() {
        return this.f27301c;
    }

    /* renamed from: c */
    public List m28388c() {
        return this.f27300b;
    }

    /* renamed from: d */
    public C7360f m28389d() {
        return this.f27299a;
    }

    /* renamed from: f */
    public byte[] m28390f() {
        return AbstractC6664l.m26034a(this);
    }
}
