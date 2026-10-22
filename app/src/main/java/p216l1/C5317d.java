package p216l1;

import java.security.MessageDigest;
import p184j1.InterfaceC4975f;

/* renamed from: l1.d */
/* loaded from: classes.dex */
final class C5317d implements InterfaceC4975f {

    /* renamed from: b */
    private final InterfaceC4975f f21661b;

    /* renamed from: c */
    private final InterfaceC4975f f21662c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5317d(InterfaceC4975f interfaceC4975f, InterfaceC4975f interfaceC4975f2) {
        this.f21661b = interfaceC4975f;
        this.f21662c = interfaceC4975f2;
    }

    @Override // p184j1.InterfaceC4975f
    /* renamed from: a */
    public void mo16761a(MessageDigest messageDigest) {
        this.f21661b.mo16761a(messageDigest);
        this.f21662c.mo16761a(messageDigest);
    }

    @Override // p184j1.InterfaceC4975f
    public boolean equals(Object obj) {
        if (!(obj instanceof C5317d)) {
            return false;
        }
        C5317d c5317d = (C5317d) obj;
        if (!this.f21661b.equals(c5317d.f21661b) || !this.f21662c.equals(c5317d.f21662c)) {
            return false;
        }
        return true;
    }

    @Override // p184j1.InterfaceC4975f
    public int hashCode() {
        return (this.f21661b.hashCode() * 31) + this.f21662c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f21661b + ", signature=" + this.f21662c + '}';
    }
}
