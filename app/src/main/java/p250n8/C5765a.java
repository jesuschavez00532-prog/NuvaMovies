package p250n8;

import ne.AbstractC5868k;

/* renamed from: n8.a */
/* loaded from: classes2.dex */
public final class C5765a {

    /* renamed from: a */
    private final String f23096a;

    /* renamed from: b */
    private final String f23097b;

    /* renamed from: c */
    private final String f23098c;

    public C5765a(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "visitScore");
        AbstractC5868k.m23674f(str2, "homeScore");
        AbstractC5868k.m23674f(str3, "statName");
        this.f23096a = str;
        this.f23097b = str2;
        this.f23098c = str3;
    }

    /* renamed from: a */
    public final String m23225a() {
        return this.f23097b;
    }

    /* renamed from: b */
    public final String m23226b() {
        return this.f23098c;
    }

    /* renamed from: c */
    public final String m23227c() {
        return this.f23096a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5765a)) {
            return false;
        }
        C5765a c5765a = (C5765a) obj;
        return AbstractC5868k.m23669a(this.f23096a, c5765a.f23096a) && AbstractC5868k.m23669a(this.f23097b, c5765a.f23097b) && AbstractC5868k.m23669a(this.f23098c, c5765a.f23098c);
    }

    public int hashCode() {
        return (((this.f23096a.hashCode() * 31) + this.f23097b.hashCode()) * 31) + this.f23098c.hashCode();
    }

    public String toString() {
        return "DataStat(visitScore=" + this.f23096a + ", homeScore=" + this.f23097b + ", statName=" + this.f23098c + ')';
    }
}
