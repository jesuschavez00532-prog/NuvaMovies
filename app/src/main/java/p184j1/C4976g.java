package p184j1;

import java.security.MessageDigest;
import p109e2.AbstractC4121k;

/* renamed from: j1.g */
/* loaded from: classes.dex */
public final class C4976g {

    /* renamed from: e */
    private static final b f20712e = new a();

    /* renamed from: a */
    private final Object f20713a;

    /* renamed from: b */
    private final b f20714b;

    /* renamed from: c */
    private final String f20715c;

    /* renamed from: d */
    private volatile byte[] f20716d;

    /* renamed from: j1.g$a */
    /* loaded from: classes.dex */
    class a implements b {
        a() {
        }

        @Override // p184j1.C4976g.b
        /* renamed from: a */
        public void mo20323a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* renamed from: j1.g$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo20323a(byte[] bArr, Object obj, MessageDigest messageDigest);
    }

    private C4976g(String str, Object obj, b bVar) {
        this.f20715c = AbstractC4121k.m17224b(str);
        this.f20713a = obj;
        this.f20714b = (b) AbstractC4121k.m17226d(bVar);
    }

    /* renamed from: a */
    public static C4976g m20316a(String str, Object obj, b bVar) {
        return new C4976g(str, obj, bVar);
    }

    /* renamed from: b */
    private static b m20317b() {
        return f20712e;
    }

    /* renamed from: d */
    private byte[] m20318d() {
        if (this.f20716d == null) {
            this.f20716d = this.f20715c.getBytes(InterfaceC4975f.f20711a);
        }
        return this.f20716d;
    }

    /* renamed from: e */
    public static C4976g m20319e(String str) {
        return new C4976g(str, null, m20317b());
    }

    /* renamed from: f */
    public static C4976g m20320f(String str, Object obj) {
        return new C4976g(str, obj, m20317b());
    }

    /* renamed from: c */
    public Object m20321c() {
        return this.f20713a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4976g) {
            return this.f20715c.equals(((C4976g) obj).f20715c);
        }
        return false;
    }

    /* renamed from: g */
    public void m20322g(Object obj, MessageDigest messageDigest) {
        this.f20714b.mo20323a(m20318d(), obj, messageDigest);
    }

    public int hashCode() {
        return this.f20715c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f20715c + "'}";
    }
}
