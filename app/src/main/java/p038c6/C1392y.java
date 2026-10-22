package p038c6;

import p038c6.AbstractC1370c0;

/* renamed from: c6.y */
/* loaded from: classes.dex */
final class C1392y extends AbstractC1370c0.b {

    /* renamed from: a */
    private final int f5428a;

    /* renamed from: b */
    private final String f5429b;

    /* renamed from: c */
    private final int f5430c;

    /* renamed from: d */
    private final long f5431d;

    /* renamed from: e */
    private final long f5432e;

    /* renamed from: f */
    private final boolean f5433f;

    /* renamed from: g */
    private final int f5434g;

    /* renamed from: h */
    private final String f5435h;

    /* renamed from: i */
    private final String f5436i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1392y(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f5428a = i10;
        if (str != null) {
            this.f5429b = str;
            this.f5430c = i11;
            this.f5431d = j10;
            this.f5432e = j11;
            this.f5433f = z10;
            this.f5434g = i12;
            if (str2 != null) {
                this.f5435h = str2;
                if (str3 != null) {
                    this.f5436i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    @Override // p038c6.AbstractC1370c0.b
    /* renamed from: a */
    public int mo6423a() {
        return this.f5428a;
    }

    @Override // p038c6.AbstractC1370c0.b
    /* renamed from: b */
    public int mo6424b() {
        return this.f5430c;
    }

    @Override // p038c6.AbstractC1370c0.b
    /* renamed from: d */
    public long mo6425d() {
        return this.f5432e;
    }

    @Override // p038c6.AbstractC1370c0.b
    /* renamed from: e */
    public boolean mo6426e() {
        return this.f5433f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1370c0.b)) {
            return false;
        }
        AbstractC1370c0.b bVar = (AbstractC1370c0.b) obj;
        if (this.f5428a == bVar.mo6423a() && this.f5429b.equals(bVar.mo6428g()) && this.f5430c == bVar.mo6424b() && this.f5431d == bVar.mo6431j() && this.f5432e == bVar.mo6425d() && this.f5433f == bVar.mo6426e() && this.f5434g == bVar.mo6430i() && this.f5435h.equals(bVar.mo6427f()) && this.f5436i.equals(bVar.mo6429h())) {
            return true;
        }
        return false;
    }

    @Override // p038c6.AbstractC1370c0.b
    /* renamed from: f */
    public String mo6427f() {
        return this.f5435h;
    }

    @Override // p038c6.AbstractC1370c0.b
    /* renamed from: g */
    public String mo6428g() {
        return this.f5429b;
    }

    @Override // p038c6.AbstractC1370c0.b
    /* renamed from: h */
    public String mo6429h() {
        return this.f5436i;
    }

    public int hashCode() {
        int i10;
        int hashCode = (((((this.f5428a ^ 1000003) * 1000003) ^ this.f5429b.hashCode()) * 1000003) ^ this.f5430c) * 1000003;
        long j10 = this.f5431d;
        int i11 = (hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f5432e;
        int i12 = (i11 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        if (this.f5433f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((i12 ^ i10) * 1000003) ^ this.f5434g) * 1000003) ^ this.f5435h.hashCode()) * 1000003) ^ this.f5436i.hashCode();
    }

    @Override // p038c6.AbstractC1370c0.b
    /* renamed from: i */
    public int mo6430i() {
        return this.f5434g;
    }

    @Override // p038c6.AbstractC1370c0.b
    /* renamed from: j */
    public long mo6431j() {
        return this.f5431d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f5428a + ", model=" + this.f5429b + ", availableProcessors=" + this.f5430c + ", totalRam=" + this.f5431d + ", diskSpace=" + this.f5432e + ", isEmulator=" + this.f5433f + ", state=" + this.f5434g + ", manufacturer=" + this.f5435h + ", modelClass=" + this.f5436i + "}";
    }
}
