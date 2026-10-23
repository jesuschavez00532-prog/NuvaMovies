package p366v5;

import com.umeng.analytics.pro.C3384f;

/* renamed from: v5.r */
/* loaded from: classes.dex */
public final class C7233r {

    /* renamed from: a */
    private final Class f27036a;

    /* renamed from: b */
    private final int f27037b;

    /* renamed from: c */
    private final int f27038c;

    private C7233r(Class cls, int i10, int i11) {
        this.f27036a = (Class) AbstractC7219e0.m27948c(cls, "Null dependency anInterface.");
        this.f27037b = i10;
        this.f27038c = i11;
    }

    /* renamed from: a */
    public static C7233r m27991a(Class cls) {
        return new C7233r(cls, 0, 2);
    }

    /* renamed from: b */
    private static String m27992b(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return "deferred";
                }
                throw new AssertionError("Unsupported injection: " + i10);
            }
            return C3384f.f14552M;
        }
        return "direct";
    }

    /* renamed from: h */
    public static C7233r m27993h(Class cls) {
        return new C7233r(cls, 0, 0);
    }

    /* renamed from: i */
    public static C7233r m27994i(Class cls) {
        return new C7233r(cls, 0, 1);
    }

    /* renamed from: j */
    public static C7233r m27995j(Class cls) {
        return new C7233r(cls, 1, 0);
    }

    /* renamed from: k */
    public static C7233r m27996k(Class cls) {
        return new C7233r(cls, 1, 1);
    }

    /* renamed from: l */
    public static C7233r m27997l(Class cls) {
        return new C7233r(cls, 2, 0);
    }

    /* renamed from: c */
    public Class m27998c() {
        return this.f27036a;
    }

    /* renamed from: d */
    public boolean m27999d() {
        if (this.f27038c == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean m28000e() {
        if (this.f27038c == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7233r)) {
            return false;
        }
        C7233r c7233r = (C7233r) obj;
        if (this.f27036a != c7233r.f27036a || this.f27037b != c7233r.f27037b || this.f27038c != c7233r.f27038c) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean m28001f() {
        if (this.f27037b == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m28002g() {
        if (this.f27037b == 2) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f27036a.hashCode() ^ 1000003) * 1000003) ^ this.f27037b) * 1000003) ^ this.f27038c;
    }

    public String toString() {
        String str = null;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f27036a);
        sb2.append(", type=");
        int i10 = this.f27037b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        sb2.append(m27992b(this.f27038c));
        sb2.append("}");
        return sb2.toString();
    }
}
