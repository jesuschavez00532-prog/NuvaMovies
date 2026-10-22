package p288pc;

import ne.AbstractC5868k;

/* renamed from: pc.a */
/* loaded from: classes.dex */
public final class C6254a {

    /* renamed from: a */
    private final Class f24487a;

    /* renamed from: b */
    private String f24488b;

    public C6254a(Class cls, Object... objArr) {
        AbstractC5868k.m23674f(cls, "clazz");
        AbstractC5868k.m23674f(objArr, "params");
        this.f24487a = cls;
        for (Object obj : objArr) {
            if (obj != null) {
                this.f24488b += obj;
            }
        }
    }

    /* renamed from: a */
    public final Class m24889a() {
        return this.f24487a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6254a) {
            C6254a c6254a = (C6254a) obj;
            if (AbstractC5868k.m23669a(m24889a(), c6254a.m24889a()) && AbstractC5868k.m23669a(this.f24488b, c6254a.f24488b)) {
                return true;
            }
            return false;
        }
        return super.equals(obj);
    }

    public int hashCode() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m24889a().hashCode());
        String str = "";
        sb2.append("");
        String str2 = this.f24488b;
        if (str2 != null) {
            str = str2;
        }
        sb2.append(str.hashCode());
        return sb2.toString().hashCode();
    }
}
