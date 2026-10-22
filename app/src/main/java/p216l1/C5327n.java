package p216l1;

import java.security.MessageDigest;
import java.util.Map;
import p109e2.AbstractC4121k;
import p184j1.C4977h;
import p184j1.InterfaceC4975f;

/* renamed from: l1.n */
/* loaded from: classes.dex */
class C5327n implements InterfaceC4975f {

    /* renamed from: b */
    private final Object f21807b;

    /* renamed from: c */
    private final int f21808c;

    /* renamed from: d */
    private final int f21809d;

    /* renamed from: e */
    private final Class f21810e;

    /* renamed from: f */
    private final Class f21811f;

    /* renamed from: g */
    private final InterfaceC4975f f21812g;

    /* renamed from: h */
    private final Map f21813h;

    /* renamed from: i */
    private final C4977h f21814i;

    /* renamed from: j */
    private int f21815j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5327n(Object obj, InterfaceC4975f interfaceC4975f, int i10, int i11, Map map, Class cls, Class cls2, C4977h c4977h) {
        this.f21807b = AbstractC4121k.m17226d(obj);
        this.f21812g = (InterfaceC4975f) AbstractC4121k.m17227e(interfaceC4975f, "Signature must not be null");
        this.f21808c = i10;
        this.f21809d = i11;
        this.f21813h = (Map) AbstractC4121k.m17226d(map);
        this.f21810e = (Class) AbstractC4121k.m17227e(cls, "Resource class must not be null");
        this.f21811f = (Class) AbstractC4121k.m17227e(cls2, "Transcode class must not be null");
        this.f21814i = (C4977h) AbstractC4121k.m17226d(c4977h);
    }

    @Override // p184j1.InterfaceC4975f
    /* renamed from: a */
    public void mo16761a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p184j1.InterfaceC4975f
    public boolean equals(Object obj) {
        if (!(obj instanceof C5327n)) {
            return false;
        }
        C5327n c5327n = (C5327n) obj;
        if (!this.f21807b.equals(c5327n.f21807b) || !this.f21812g.equals(c5327n.f21812g) || this.f21809d != c5327n.f21809d || this.f21808c != c5327n.f21808c || !this.f21813h.equals(c5327n.f21813h) || !this.f21810e.equals(c5327n.f21810e) || !this.f21811f.equals(c5327n.f21811f) || !this.f21814i.equals(c5327n.f21814i)) {
            return false;
        }
        return true;
    }

    @Override // p184j1.InterfaceC4975f
    public int hashCode() {
        if (this.f21815j == 0) {
            int hashCode = this.f21807b.hashCode();
            this.f21815j = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.f21812g.hashCode()) * 31) + this.f21808c) * 31) + this.f21809d;
            this.f21815j = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.f21813h.hashCode();
            this.f21815j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f21810e.hashCode();
            this.f21815j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f21811f.hashCode();
            this.f21815j = hashCode5;
            this.f21815j = (hashCode5 * 31) + this.f21814i.hashCode();
        }
        return this.f21815j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f21807b + ", width=" + this.f21808c + ", height=" + this.f21809d + ", resourceClass=" + this.f21810e + ", transcodeClass=" + this.f21811f + ", signature=" + this.f21812g + ", hashCode=" + this.f21815j + ", transformations=" + this.f21813h + ", options=" + this.f21814i + '}';
    }
}
