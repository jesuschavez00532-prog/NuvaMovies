package p038c6;

import p038c6.AbstractC1370c0;
import p395x5.C7502e;

/* renamed from: c6.x */
/* loaded from: classes.dex */
final class C1391x extends AbstractC1370c0.a {

    /* renamed from: a */
    private final String f5422a;

    /* renamed from: b */
    private final String f5423b;

    /* renamed from: c */
    private final String f5424c;

    /* renamed from: d */
    private final String f5425d;

    /* renamed from: e */
    private final int f5426e;

    /* renamed from: f */
    private final C7502e f5427f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1391x(String str, String str2, String str3, String str4, int i10, C7502e c7502e) {
        if (str != null) {
            this.f5422a = str;
            if (str2 != null) {
                this.f5423b = str2;
                if (str3 != null) {
                    this.f5424c = str3;
                    if (str4 != null) {
                        this.f5425d = str4;
                        this.f5426e = i10;
                        if (c7502e != null) {
                            this.f5427f = c7502e;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    @Override // p038c6.AbstractC1370c0.a
    /* renamed from: a */
    public String mo6416a() {
        return this.f5422a;
    }

    @Override // p038c6.AbstractC1370c0.a
    /* renamed from: c */
    public int mo6417c() {
        return this.f5426e;
    }

    @Override // p038c6.AbstractC1370c0.a
    /* renamed from: d */
    public C7502e mo6418d() {
        return this.f5427f;
    }

    @Override // p038c6.AbstractC1370c0.a
    /* renamed from: e */
    public String mo6419e() {
        return this.f5425d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1370c0.a)) {
            return false;
        }
        AbstractC1370c0.a aVar = (AbstractC1370c0.a) obj;
        if (this.f5422a.equals(aVar.mo6416a()) && this.f5423b.equals(aVar.mo6420f()) && this.f5424c.equals(aVar.mo6421g()) && this.f5425d.equals(aVar.mo6419e()) && this.f5426e == aVar.mo6417c() && this.f5427f.equals(aVar.mo6418d())) {
            return true;
        }
        return false;
    }

    @Override // p038c6.AbstractC1370c0.a
    /* renamed from: f */
    public String mo6420f() {
        return this.f5423b;
    }

    @Override // p038c6.AbstractC1370c0.a
    /* renamed from: g */
    public String mo6421g() {
        return this.f5424c;
    }

    public int hashCode() {
        return ((((((((((this.f5422a.hashCode() ^ 1000003) * 1000003) ^ this.f5423b.hashCode()) * 1000003) ^ this.f5424c.hashCode()) * 1000003) ^ this.f5425d.hashCode()) * 1000003) ^ this.f5426e) * 1000003) ^ this.f5427f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f5422a + ", versionCode=" + this.f5423b + ", versionName=" + this.f5424c + ", installUuid=" + this.f5425d + ", deliveryMechanism=" + this.f5426e + ", developmentPlatformProvider=" + this.f5427f + "}";
    }
}
