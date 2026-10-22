package p359ue;

import ne.AbstractC5868k;
import re.C6575c;

/* renamed from: ue.e */
/* loaded from: classes3.dex */
public final class C7151e {

    /* renamed from: a */
    private final String f26845a;

    /* renamed from: b */
    private final C6575c f26846b;

    public C7151e(String str, C6575c c6575c) {
        AbstractC5868k.m23674f(str, "value");
        AbstractC5868k.m23674f(c6575c, "range");
        this.f26845a = str;
        this.f26846b = c6575c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7151e)) {
            return false;
        }
        C7151e c7151e = (C7151e) obj;
        return AbstractC5868k.m23669a(this.f26845a, c7151e.f26845a) && AbstractC5868k.m23669a(this.f26846b, c7151e.f26846b);
    }

    public int hashCode() {
        return (this.f26845a.hashCode() * 31) + this.f26846b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f26845a + ", range=" + this.f26846b + ')';
    }
}
