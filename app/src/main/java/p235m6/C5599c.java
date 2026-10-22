package p235m6;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: m6.c */
/* loaded from: classes.dex */
public final class C5599c {

    /* renamed from: a */
    private final String f22628a;

    /* renamed from: b */
    private final Map f22629b;

    /* renamed from: m6.c$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final String f22630a;

        /* renamed from: b */
        private Map f22631b = null;

        b(String str) {
            this.f22630a = str;
        }

        /* renamed from: a */
        public C5599c m22765a() {
            Map unmodifiableMap;
            String str = this.f22630a;
            if (this.f22631b == null) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(this.f22631b));
            }
            return new C5599c(str, unmodifiableMap);
        }

        /* renamed from: b */
        public b m22766b(Annotation annotation) {
            if (this.f22631b == null) {
                this.f22631b = new HashMap();
            }
            this.f22631b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    /* renamed from: a */
    public static b m22761a(String str) {
        return new b(str);
    }

    /* renamed from: d */
    public static C5599c m22762d(String str) {
        return new C5599c(str, Collections.emptyMap());
    }

    /* renamed from: b */
    public String m22763b() {
        return this.f22628a;
    }

    /* renamed from: c */
    public Annotation m22764c(Class cls) {
        return (Annotation) this.f22629b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5599c)) {
            return false;
        }
        C5599c c5599c = (C5599c) obj;
        if (this.f22628a.equals(c5599c.f22628a) && this.f22629b.equals(c5599c.f22629b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f22628a.hashCode() * 31) + this.f22629b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f22628a + ", properties=" + this.f22629b.values() + "}";
    }

    private C5599c(String str, Map map) {
        this.f22628a = str;
        this.f22629b = map;
    }
}
