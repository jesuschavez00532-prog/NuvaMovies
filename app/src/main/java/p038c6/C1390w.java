package p038c6;

import p038c6.AbstractC1370c0;

/* renamed from: c6.w */
/* loaded from: classes.dex */
final class C1390w extends AbstractC1370c0 {

    /* renamed from: a */
    private final AbstractC1370c0.a f5419a;

    /* renamed from: b */
    private final AbstractC1370c0.c f5420b;

    /* renamed from: c */
    private final AbstractC1370c0.b f5421c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1390w(AbstractC1370c0.a aVar, AbstractC1370c0.c cVar, AbstractC1370c0.b bVar) {
        if (aVar != null) {
            this.f5419a = aVar;
            if (cVar != null) {
                this.f5420b = cVar;
                if (bVar != null) {
                    this.f5421c = bVar;
                    return;
                }
                throw new NullPointerException("Null deviceData");
            }
            throw new NullPointerException("Null osData");
        }
        throw new NullPointerException("Null appData");
    }

    @Override // p038c6.AbstractC1370c0
    /* renamed from: a */
    public AbstractC1370c0.a mo6412a() {
        return this.f5419a;
    }

    @Override // p038c6.AbstractC1370c0
    /* renamed from: c */
    public AbstractC1370c0.b mo6413c() {
        return this.f5421c;
    }

    @Override // p038c6.AbstractC1370c0
    /* renamed from: d */
    public AbstractC1370c0.c mo6414d() {
        return this.f5420b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1370c0)) {
            return false;
        }
        AbstractC1370c0 abstractC1370c0 = (AbstractC1370c0) obj;
        if (this.f5419a.equals(abstractC1370c0.mo6412a()) && this.f5420b.equals(abstractC1370c0.mo6414d()) && this.f5421c.equals(abstractC1370c0.mo6413c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f5419a.hashCode() ^ 1000003) * 1000003) ^ this.f5420b.hashCode()) * 1000003) ^ this.f5421c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f5419a + ", osData=" + this.f5420b + ", deviceData=" + this.f5421c + "}";
    }
}
