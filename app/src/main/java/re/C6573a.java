package re;

import ne.AbstractC5864g;
import p043ce.AbstractC1513y;
import p165he.AbstractC4820c;
import p269oe.InterfaceC5974a;

/* renamed from: re.a */
/* loaded from: classes3.dex */
public class C6573a implements Iterable, InterfaceC5974a {

    /* renamed from: d */
    public static final a f25191d = new a(null);

    /* renamed from: a */
    private final int f25192a;

    /* renamed from: b */
    private final int f25193b;

    /* renamed from: c */
    private final int f25194c;

    /* renamed from: re.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final C6573a m25660a(int i10, int i11, int i12) {
            return new C6573a(i10, i11, i12);
        }
    }

    public C6573a(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f25192a = i10;
                this.f25193b = AbstractC4820c.m19908b(i10, i11, i12);
                this.f25194c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    /* renamed from: c */
    public final int m25656c() {
        return this.f25192a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6573a) {
            if (!isEmpty() || !((C6573a) obj).isEmpty()) {
                C6573a c6573a = (C6573a) obj;
                if (this.f25192a != c6573a.f25192a || this.f25193b != c6573a.f25193b || this.f25194c != c6573a.f25194c) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final int m25657g() {
        return this.f25193b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f25192a * 31) + this.f25193b) * 31) + this.f25194c;
    }

    /* renamed from: i */
    public final int m25658i() {
        return this.f25194c;
    }

    public boolean isEmpty() {
        if (this.f25194c > 0) {
            if (this.f25192a > this.f25193b) {
                return true;
            }
        } else if (this.f25192a < this.f25193b) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC1513y iterator() {
        return new C6574b(this.f25192a, this.f25193b, this.f25194c);
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f25194c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f25192a);
            sb2.append("..");
            sb2.append(this.f25193b);
            sb2.append(" step ");
            i10 = this.f25194c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f25192a);
            sb2.append(" downTo ");
            sb2.append(this.f25193b);
            sb2.append(" step ");
            i10 = -this.f25194c;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
