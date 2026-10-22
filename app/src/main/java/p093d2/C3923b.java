package p093d2;

import java.security.MessageDigest;
import p109e2.AbstractC4121k;
import p184j1.InterfaceC4975f;

/* renamed from: d2.b */
/* loaded from: classes.dex */
public final class C3923b implements InterfaceC4975f {

    /* renamed from: b */
    private final Object f17601b;

    public C3923b(Object obj) {
        this.f17601b = AbstractC4121k.m17226d(obj);
    }

    @Override // p184j1.InterfaceC4975f
    /* renamed from: a */
    public void mo16761a(MessageDigest messageDigest) {
        messageDigest.update(this.f17601b.toString().getBytes(InterfaceC4975f.f20711a));
    }

    @Override // p184j1.InterfaceC4975f
    public boolean equals(Object obj) {
        if (obj instanceof C3923b) {
            return this.f17601b.equals(((C3923b) obj).f17601b);
        }
        return false;
    }

    @Override // p184j1.InterfaceC4975f
    public int hashCode() {
        return this.f17601b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f17601b + '}';
    }
}
