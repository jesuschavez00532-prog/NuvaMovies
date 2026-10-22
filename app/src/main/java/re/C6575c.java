package re;

import ne.AbstractC5864g;

/* renamed from: re.c */
/* loaded from: classes3.dex */
public final class C6575c extends C6573a {

    /* renamed from: e */
    public static final a f25199e = new a(null);

    /* renamed from: f */
    private static final C6575c f25200f = new C6575c(1, 0);

    /* renamed from: re.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final C6575c m25665a() {
            return C6575c.f25200f;
        }
    }

    public C6575c(int i10, int i11) {
        super(i10, i11, 1);
    }

    @Override // re.C6573a
    public boolean equals(Object obj) {
        if (obj instanceof C6575c) {
            if (!isEmpty() || !((C6575c) obj).isEmpty()) {
                C6575c c6575c = (C6575c) obj;
                if (m25656c() != c6575c.m25656c() || m25657g() != c6575c.m25657g()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // re.C6573a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m25656c() * 31) + m25657g();
    }

    @Override // re.C6573a
    public boolean isEmpty() {
        if (m25656c() > m25657g()) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public boolean m25662n(int i10) {
        if (m25656c() <= i10 && i10 <= m25657g()) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public Integer m25663o() {
        return Integer.valueOf(m25657g());
    }

    /* renamed from: p */
    public Integer m25664p() {
        return Integer.valueOf(m25656c());
    }

    @Override // re.C6573a
    public String toString() {
        return m25656c() + ".." + m25657g();
    }
}
