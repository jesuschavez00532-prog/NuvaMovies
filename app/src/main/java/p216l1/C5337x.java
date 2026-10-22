package p216l1;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p109e2.AbstractC4122l;
import p109e2.C4118h;
import p184j1.C4977h;
import p184j1.InterfaceC4975f;
import p184j1.InterfaceC4981l;
import p230m1.InterfaceC5569b;

/* renamed from: l1.x */
/* loaded from: classes.dex */
final class C5337x implements InterfaceC4975f {

    /* renamed from: j */
    private static final C4118h f21853j = new C4118h(50);

    /* renamed from: b */
    private final InterfaceC5569b f21854b;

    /* renamed from: c */
    private final InterfaceC4975f f21855c;

    /* renamed from: d */
    private final InterfaceC4975f f21856d;

    /* renamed from: e */
    private final int f21857e;

    /* renamed from: f */
    private final int f21858f;

    /* renamed from: g */
    private final Class f21859g;

    /* renamed from: h */
    private final C4977h f21860h;

    /* renamed from: i */
    private final InterfaceC4981l f21861i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5337x(InterfaceC5569b interfaceC5569b, InterfaceC4975f interfaceC4975f, InterfaceC4975f interfaceC4975f2, int i10, int i11, InterfaceC4981l interfaceC4981l, Class cls, C4977h c4977h) {
        this.f21854b = interfaceC5569b;
        this.f21855c = interfaceC4975f;
        this.f21856d = interfaceC4975f2;
        this.f21857e = i10;
        this.f21858f = i11;
        this.f21861i = interfaceC4981l;
        this.f21859g = cls;
        this.f21860h = c4977h;
    }

    /* renamed from: c */
    private byte[] m21606c() {
        C4118h c4118h = f21853j;
        byte[] bArr = (byte[]) c4118h.m17213g(this.f21859g);
        if (bArr == null) {
            byte[] bytes = this.f21859g.getName().getBytes(InterfaceC4975f.f20711a);
            c4118h.m17217k(this.f21859g, bytes);
            return bytes;
        }
        return bArr;
    }

    @Override // p184j1.InterfaceC4975f
    /* renamed from: a */
    public void mo16761a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f21854b.mo22610c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f21857e).putInt(this.f21858f).array();
        this.f21856d.mo16761a(messageDigest);
        this.f21855c.mo16761a(messageDigest);
        messageDigest.update(bArr);
        InterfaceC4981l interfaceC4981l = this.f21861i;
        if (interfaceC4981l != null) {
            interfaceC4981l.mo16761a(messageDigest);
        }
        this.f21860h.mo16761a(messageDigest);
        messageDigest.update(m21606c());
        this.f21854b.put(bArr);
    }

    @Override // p184j1.InterfaceC4975f
    public boolean equals(Object obj) {
        if (!(obj instanceof C5337x)) {
            return false;
        }
        C5337x c5337x = (C5337x) obj;
        if (this.f21858f != c5337x.f21858f || this.f21857e != c5337x.f21857e || !AbstractC4122l.m17232e(this.f21861i, c5337x.f21861i) || !this.f21859g.equals(c5337x.f21859g) || !this.f21855c.equals(c5337x.f21855c) || !this.f21856d.equals(c5337x.f21856d) || !this.f21860h.equals(c5337x.f21860h)) {
            return false;
        }
        return true;
    }

    @Override // p184j1.InterfaceC4975f
    public int hashCode() {
        int hashCode = (((((this.f21855c.hashCode() * 31) + this.f21856d.hashCode()) * 31) + this.f21857e) * 31) + this.f21858f;
        InterfaceC4981l interfaceC4981l = this.f21861i;
        if (interfaceC4981l != null) {
            hashCode = (hashCode * 31) + interfaceC4981l.hashCode();
        }
        return (((hashCode * 31) + this.f21859g.hashCode()) * 31) + this.f21860h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f21855c + ", signature=" + this.f21856d + ", width=" + this.f21857e + ", height=" + this.f21858f + ", decodedResourceClass=" + this.f21859g + ", transformation='" + this.f21861i + "', options=" + this.f21860h + '}';
    }
}
