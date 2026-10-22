package p294q3;

/* renamed from: q3.b */
/* loaded from: classes.dex */
public final class C6335b {

    /* renamed from: a */
    private final String f24681a;

    private C6335b(String str) {
        if (str != null) {
            this.f24681a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    /* renamed from: b */
    public static C6335b m25117b(String str) {
        return new C6335b(str);
    }

    /* renamed from: a */
    public String m25118a() {
        return this.f24681a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6335b)) {
            return false;
        }
        return this.f24681a.equals(((C6335b) obj).f24681a);
    }

    public int hashCode() {
        return this.f24681a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f24681a + "\"}";
    }
}
