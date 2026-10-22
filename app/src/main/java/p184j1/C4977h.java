package p184j1;

import java.security.MessageDigest;
import p109e2.C4112b;
import p214l.C5303a;

/* renamed from: j1.h */
/* loaded from: classes.dex */
public final class C4977h implements InterfaceC4975f {

    /* renamed from: b */
    private final C5303a f20717b = new C4112b();

    /* renamed from: f */
    private static void m20324f(C4976g c4976g, Object obj, MessageDigest messageDigest) {
        c4976g.m20322g(obj, messageDigest);
    }

    @Override // p184j1.InterfaceC4975f
    /* renamed from: a */
    public void mo16761a(MessageDigest messageDigest) {
        for (int i10 = 0; i10 < this.f20717b.size(); i10++) {
            m20324f((C4976g) this.f20717b.m21434i(i10), this.f20717b.m21435m(i10), messageDigest);
        }
    }

    /* renamed from: c */
    public Object m20325c(C4976g c4976g) {
        if (this.f20717b.containsKey(c4976g)) {
            return this.f20717b.get(c4976g);
        }
        return c4976g.m20321c();
    }

    /* renamed from: d */
    public void m20326d(C4977h c4977h) {
        this.f20717b.mo17197j(c4977h.f20717b);
    }

    /* renamed from: e */
    public C4977h m20327e(C4976g c4976g, Object obj) {
        this.f20717b.put(c4976g, obj);
        return this;
    }

    @Override // p184j1.InterfaceC4975f
    public boolean equals(Object obj) {
        if (obj instanceof C4977h) {
            return this.f20717b.equals(((C4977h) obj).f20717b);
        }
        return false;
    }

    @Override // p184j1.InterfaceC4975f
    public int hashCode() {
        return this.f20717b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f20717b + '}';
    }
}
