package p109e2;

/* renamed from: e2.j */
/* loaded from: classes.dex */
public class C4120j {

    /* renamed from: a */
    private Class f18086a;

    /* renamed from: b */
    private Class f18087b;

    /* renamed from: c */
    private Class f18088c;

    public C4120j() {
    }

    /* renamed from: a */
    public void m17222a(Class cls, Class cls2, Class cls3) {
        this.f18086a = cls;
        this.f18087b = cls2;
        this.f18088c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4120j c4120j = (C4120j) obj;
        if (this.f18086a.equals(c4120j.f18086a) && this.f18087b.equals(c4120j.f18087b) && AbstractC4122l.m17232e(this.f18088c, c4120j.f18088c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = ((this.f18086a.hashCode() * 31) + this.f18087b.hashCode()) * 31;
        Class cls = this.f18088c;
        if (cls != null) {
            i10 = cls.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f18086a + ", second=" + this.f18087b + '}';
    }

    public C4120j(Class cls, Class cls2, Class cls3) {
        m17222a(cls, cls2, cls3);
    }
}
