package p377w3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: w3.d */
/* loaded from: classes.dex */
public final class C7358d {

    /* renamed from: c */
    private static final C7358d f27324c = new a().m28409a();

    /* renamed from: a */
    private final String f27325a;

    /* renamed from: b */
    private final List f27326b;

    /* renamed from: w3.d$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private String f27327a = "";

        /* renamed from: b */
        private List f27328b = new ArrayList();

        a() {
        }

        /* renamed from: a */
        public C7358d m28409a() {
            return new C7358d(this.f27327a, Collections.unmodifiableList(this.f27328b));
        }

        /* renamed from: b */
        public a m28410b(List list) {
            this.f27328b = list;
            return this;
        }

        /* renamed from: c */
        public a m28411c(String str) {
            this.f27327a = str;
            return this;
        }
    }

    C7358d(String str, List list) {
        this.f27325a = str;
        this.f27326b = list;
    }

    /* renamed from: c */
    public static a m28406c() {
        return new a();
    }

    /* renamed from: a */
    public List m28407a() {
        return this.f27326b;
    }

    /* renamed from: b */
    public String m28408b() {
        return this.f27325a;
    }
}
