package p041c9;

/* renamed from: c9.d */
/* loaded from: classes2.dex */
final class C1435d {

    /* renamed from: a */
    private final Object f5547a;

    /* renamed from: b */
    private final Object f5548b;

    private C1435d(Object obj, Object obj2) {
        this.f5547a = obj;
        this.f5548b = obj2;
    }

    /* renamed from: b */
    public static C1435d m6691b(Object obj, Object obj2) {
        return new C1435d(obj, obj2);
    }

    /* renamed from: a */
    public Object m6692a() {
        return this.f5547a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1435d.class != obj.getClass()) {
            return false;
        }
        C1435d c1435d = (C1435d) obj;
        Object obj2 = this.f5547a;
        if (obj2 == null) {
            if (c1435d.f5547a != null) {
                return false;
            }
        } else if (!obj2.equals(c1435d.f5547a)) {
            return false;
        }
        Object obj3 = this.f5548b;
        if (obj3 == null) {
            if (c1435d.f5548b != null) {
                return false;
            }
        } else if (!obj3.equals(c1435d.f5548b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        Object obj = this.f5547a;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (hashCode + 31) * 31;
        Object obj2 = this.f5548b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i11 + i10;
    }
}
