package ne;

/* renamed from: ne.m */
/* loaded from: classes3.dex */
public final class C5870m implements InterfaceC5861d {

    /* renamed from: a */
    private final Class f23406a;

    /* renamed from: b */
    private final String f23407b;

    public C5870m(Class cls, String str) {
        AbstractC5868k.m23674f(cls, "jClass");
        AbstractC5868k.m23674f(str, "moduleName");
        this.f23406a = cls;
        this.f23407b = str;
    }

    @Override // ne.InterfaceC5861d
    /* renamed from: a */
    public Class mo23666a() {
        return this.f23406a;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C5870m) && AbstractC5868k.m23669a(mo23666a(), ((C5870m) obj).mo23666a())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return mo23666a().hashCode();
    }

    public String toString() {
        return mo23666a().toString() + " (Kotlin reflection is not available)";
    }
}
