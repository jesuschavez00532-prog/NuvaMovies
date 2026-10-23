package p038c6;

import p038c6.AbstractC1370c0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c6.z */
/* loaded from: classes.dex */
public final class C1393z extends AbstractC1370c0.c {

    /* renamed from: a */
    private final String f5437a;

    /* renamed from: b */
    private final String f5438b;

    /* renamed from: c */
    private final boolean f5439c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1393z(String str, String str2, boolean z10) {
        if (str != null) {
            this.f5437a = str;
            if (str2 != null) {
                this.f5438b = str2;
                this.f5439c = z10;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    @Override // p038c6.AbstractC1370c0.c
    /* renamed from: b */
    public boolean mo6433b() {
        return this.f5439c;
    }

    @Override // p038c6.AbstractC1370c0.c
    /* renamed from: c */
    public String mo6434c() {
        return this.f5438b;
    }

    @Override // p038c6.AbstractC1370c0.c
    /* renamed from: d */
    public String mo6435d() {
        return this.f5437a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1370c0.c)) {
            return false;
        }
        AbstractC1370c0.c cVar = (AbstractC1370c0.c) obj;
        if (this.f5437a.equals(cVar.mo6435d()) && this.f5438b.equals(cVar.mo6434c()) && this.f5439c == cVar.mo6433b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10 = 0;
        int hashCode = (((this.f5437a.hashCode() ^ 1000003) * 1000003) ^ this.f5438b.hashCode()) * 1000003;
        if (this.f5439c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "OsData{osRelease=" + this.f5437a + ", osCodeName=" + this.f5438b + ", isRooted=" + this.f5439c + "}";
    }
}
