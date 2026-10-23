package p114e7;

import java.util.Arrays;

/* renamed from: e7.a */
/* loaded from: classes.dex */
public final class C4139a implements Cloneable {

    /* renamed from: a */
    private int[] f18174a;

    /* renamed from: b */
    private int f18175b;

    public C4139a() {
        this.f18175b = 0;
        this.f18174a = new int[1];
    }

    /* renamed from: f */
    private void m17331f(int i10) {
        if (i10 > (this.f18174a.length << 5)) {
            int[] m17332j = m17332j(i10);
            int[] iArr = this.f18174a;
            System.arraycopy(iArr, 0, m17332j, 0, iArr.length);
            this.f18174a = m17332j;
        }
    }

    /* renamed from: j */
    private static int[] m17332j(int i10) {
        return new int[(i10 + 31) / 32];
    }

    /* renamed from: a */
    public void m17333a(boolean z10) {
        m17331f(this.f18175b + 1);
        if (z10) {
            int[] iArr = this.f18174a;
            int i10 = this.f18175b;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f18175b++;
    }

    /* renamed from: b */
    public void m17334b(C4139a c4139a) {
        int i10 = c4139a.f18175b;
        m17331f(this.f18175b + i10);
        for (int i11 = 0; i11 < i10; i11++) {
            m17333a(c4139a.m17337g(i11));
        }
    }

    /* renamed from: d */
    public void m17335d(int i10, int i11) {
        if (i11 >= 0 && i11 <= 32) {
            m17331f(this.f18175b + i11);
            while (i11 > 0) {
                boolean z10 = true;
                if (((i10 >> (i11 - 1)) & 1) != 1) {
                    z10 = false;
                }
                m17333a(z10);
                i11--;
            }
            return;
        }
        throw new IllegalArgumentException("Num bits must be between 0 and 32");
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C4139a clone() {
        return new C4139a((int[]) this.f18174a.clone(), this.f18175b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4139a)) {
            return false;
        }
        C4139a c4139a = (C4139a) obj;
        if (this.f18175b != c4139a.f18175b || !Arrays.equals(this.f18174a, c4139a.f18174a)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public boolean m17337g(int i10) {
        if (((1 << (i10 & 31)) & this.f18174a[i10 / 32]) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public int m17338h() {
        return this.f18175b;
    }

    public int hashCode() {
        return (this.f18175b * 31) + Arrays.hashCode(this.f18174a);
    }

    /* renamed from: i */
    public int m17339i() {
        return (this.f18175b + 7) / 8;
    }

    /* renamed from: k */
    public void m17340k(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < 8; i15++) {
                if (m17337g(i10)) {
                    i14 |= 1 << (7 - i15);
                }
                i10++;
            }
            bArr[i11 + i13] = (byte) i14;
        }
    }

    /* renamed from: l */
    public void m17341l(C4139a c4139a) {
        if (this.f18175b == c4139a.f18175b) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.f18174a;
                if (i10 < iArr.length) {
                    iArr[i10] = iArr[i10] ^ c4139a.f18174a[i10];
                    i10++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Sizes don't match");
        }
    }

    public String toString() {
        char c10 = '\0';
        StringBuilder sb2 = new StringBuilder(this.f18175b);
        for (int i10 = 0; i10 < this.f18175b; i10++) {
            if ((i10 & 7) == 0) {
                sb2.append(' ');
            }
            if (m17337g(i10)) {
                c10 = 'X';
            } else {
                c10 = '.';
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }

    C4139a(int[] iArr, int i10) {
        this.f18174a = iArr;
        this.f18175b = i10;
    }
}
