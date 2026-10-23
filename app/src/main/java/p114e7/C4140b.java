package p114e7;

import java.util.Arrays;

/* renamed from: e7.b */
/* loaded from: classes.dex */
public final class C4140b implements Cloneable {

    /* renamed from: a */
    private final int f18176a;

    /* renamed from: b */
    private final int f18177b;

    /* renamed from: c */
    private final int f18178c;

    /* renamed from: d */
    private final int[] f18179d;

    public C4140b(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            this.f18176a = i10;
            this.f18177b = i11;
            int i12 = (i10 + 31) / 32;
            this.f18178c = i12;
            this.f18179d = new int[i12 * i11];
            return;
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    /* renamed from: a */
    private String m17342a(String str, String str2, String str3) {
        String str4 = null;
        StringBuilder sb2 = new StringBuilder(this.f18177b * (this.f18176a + 1));
        for (int i10 = 0; i10 < this.f18177b; i10++) {
            for (int i11 = 0; i11 < this.f18176a; i11++) {
                if (m17344d(i11, i10)) {
                    str4 = str;
                } else {
                    str4 = str2;
                }
                sb2.append(str4);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4140b clone() {
        return new C4140b(this.f18176a, this.f18177b, this.f18178c, (int[]) this.f18179d.clone());
    }

    /* renamed from: d */
    public boolean m17344d(int i10, int i11) {
        if (((this.f18179d[(i11 * this.f18178c) + (i10 / 32)] >>> (i10 & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public int m17345e() {
        return this.f18177b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4140b)) {
            return false;
        }
        C4140b c4140b = (C4140b) obj;
        if (this.f18176a != c4140b.f18176a || this.f18177b != c4140b.f18177b || this.f18178c != c4140b.f18178c || !Arrays.equals(this.f18179d, c4140b.f18179d)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public int m17346f() {
        return this.f18176a;
    }

    /* renamed from: g */
    public void m17347g(int i10, int i11, int i12, int i13) {
        if (i11 >= 0 && i10 >= 0) {
            if (i13 > 0 && i12 > 0) {
                int i14 = i12 + i10;
                int i15 = i13 + i11;
                if (i15 <= this.f18177b && i14 <= this.f18176a) {
                    while (i11 < i15) {
                        int i16 = this.f18178c * i11;
                        for (int i17 = i10; i17 < i14; i17++) {
                            int[] iArr = this.f18179d;
                            int i18 = (i17 / 32) + i16;
                            iArr[i18] = iArr[i18] | (1 << (i17 & 31));
                        }
                        i11++;
                    }
                    return;
                }
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        throw new IllegalArgumentException("Left and top must be nonnegative");
    }

    /* renamed from: h */
    public String m17348h(String str, String str2) {
        return m17342a(str, str2, "\n");
    }

    public int hashCode() {
        int i10 = this.f18176a;
        return (((((((i10 * 31) + i10) * 31) + this.f18177b) * 31) + this.f18178c) * 31) + Arrays.hashCode(this.f18179d);
    }

    public String toString() {
        return m17348h("X ", "  ");
    }

    private C4140b(int i10, int i11, int i12, int[] iArr) {
        this.f18176a = i10;
        this.f18177b = i11;
        this.f18178c = i12;
        this.f18179d = iArr;
    }
}
