package lc;

/* renamed from: lc.a */
/* loaded from: classes.dex */
public class C5542a {

    /* renamed from: a */
    public final String f22468a;

    /* renamed from: b */
    public final boolean f22469b;

    /* renamed from: c */
    public final boolean f22470c;

    public C5542a(String str, boolean z10, boolean z11) {
        this.f22468a = str;
        this.f22469b = z10;
        this.f22470c = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5542a c5542a = (C5542a) obj;
        if (this.f22469b != c5542a.f22469b || this.f22470c != c5542a.f22470c) {
            return false;
        }
        return this.f22468a.equals(c5542a.f22468a);
    }

    public int hashCode() {
        return (((this.f22468a.hashCode() * 31) + (this.f22469b ? 1 : 0)) * 31) + (this.f22470c ? 1 : 0);
    }

    public String toString() {
        return "Permission{name='" + this.f22468a + "', granted=" + this.f22469b + ", shouldShowRequestPermissionRationale=" + this.f22470c + '}';
    }
}
