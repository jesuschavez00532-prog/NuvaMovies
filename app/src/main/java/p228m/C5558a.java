package p228m;

import java.util.Arrays;
import p228m.C5566i;

/* renamed from: m.a */
/* loaded from: classes.dex */
public class C5558a {

    /* renamed from: b */
    private final C5559b f22517b;

    /* renamed from: c */
    private final C5560c f22518c;

    /* renamed from: a */
    int f22516a = 0;

    /* renamed from: d */
    private int f22519d = 8;

    /* renamed from: e */
    private C5566i f22520e = null;

    /* renamed from: f */
    private int[] f22521f = new int[8];

    /* renamed from: g */
    private int[] f22522g = new int[8];

    /* renamed from: h */
    private float[] f22523h = new float[8];

    /* renamed from: i */
    private int f22524i = -1;

    /* renamed from: j */
    private int f22525j = -1;

    /* renamed from: k */
    private boolean f22526k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5558a(C5559b c5559b, C5560c c5560c) {
        this.f22517b = c5559b;
        this.f22518c = c5560c;
    }

    /* renamed from: k */
    private boolean m22523k(C5566i c5566i, C5562e c5562e) {
        if (c5566i.f22565j <= 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m22524a(C5566i c5566i, float f10, boolean z10) {
        if (f10 == 0.0f) {
            return;
        }
        int i10 = this.f22524i;
        if (i10 == -1) {
            this.f22524i = 0;
            this.f22523h[0] = f10;
            this.f22521f[0] = c5566i.f22557b;
            this.f22522g[0] = -1;
            c5566i.f22565j++;
            c5566i.m22599a(this.f22517b);
            this.f22516a++;
            if (!this.f22526k) {
                int i11 = this.f22525j + 1;
                this.f22525j = i11;
                int[] iArr = this.f22521f;
                if (i11 >= iArr.length) {
                    this.f22526k = true;
                    this.f22525j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f22516a; i13++) {
            int i14 = this.f22521f[i10];
            int i15 = c5566i.f22557b;
            if (i14 == i15) {
                float[] fArr = this.f22523h;
                float f11 = fArr[i10] + f10;
                fArr[i10] = f11;
                if (f11 == 0.0f) {
                    if (i10 == this.f22524i) {
                        this.f22524i = this.f22522g[i10];
                    } else {
                        int[] iArr2 = this.f22522g;
                        iArr2[i12] = iArr2[i10];
                    }
                    if (z10) {
                        c5566i.m22600c(this.f22517b);
                    }
                    if (this.f22526k) {
                        this.f22525j = i10;
                    }
                    c5566i.f22565j--;
                    this.f22516a--;
                    return;
                }
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f22522g[i10];
        }
        int i16 = this.f22525j;
        int i17 = i16 + 1;
        if (this.f22526k) {
            int[] iArr3 = this.f22521f;
            if (iArr3[i16] != -1) {
                i16 = iArr3.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr4 = this.f22521f;
        if (i16 >= iArr4.length && this.f22516a < iArr4.length) {
            int i18 = 0;
            while (true) {
                int[] iArr5 = this.f22521f;
                if (i18 >= iArr5.length) {
                    break;
                }
                if (iArr5[i18] == -1) {
                    i16 = i18;
                    break;
                }
                i18++;
            }
        }
        int[] iArr6 = this.f22521f;
        if (i16 >= iArr6.length) {
            i16 = iArr6.length;
            int i19 = this.f22519d * 2;
            this.f22519d = i19;
            this.f22526k = false;
            this.f22525j = i16 - 1;
            this.f22523h = Arrays.copyOf(this.f22523h, i19);
            this.f22521f = Arrays.copyOf(this.f22521f, this.f22519d);
            this.f22522g = Arrays.copyOf(this.f22522g, this.f22519d);
        }
        this.f22521f[i16] = c5566i.f22557b;
        this.f22523h[i16] = f10;
        if (i12 != -1) {
            int[] iArr7 = this.f22522g;
            iArr7[i16] = iArr7[i12];
            iArr7[i12] = i16;
        } else {
            this.f22522g[i16] = this.f22524i;
            this.f22524i = i16;
        }
        c5566i.f22565j++;
        c5566i.m22599a(this.f22517b);
        this.f22516a++;
        if (!this.f22526k) {
            this.f22525j++;
        }
        int i20 = this.f22525j;
        int[] iArr8 = this.f22521f;
        if (i20 >= iArr8.length) {
            this.f22526k = true;
            this.f22525j = iArr8.length - 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090 A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p228m.C5566i m22525b(p228m.C5562e r15) {
        /*
            r14 = this;
            int r0 = r14.f22524i
            r1 = 0
            r2 = 0
            r3 = 0
            r3 = r1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        Lb:
            r9 = -1
            if (r0 == r9) goto L98
            int r9 = r14.f22516a
            if (r4 >= r9) goto L98
            float[] r9 = r14.f22523h
            r10 = r9[r0]
            m.c r11 = r14.f22518c
            m.i[] r11 = r11.f22534c
            int[] r12 = r14.f22521f
            r12 = r12[r0]
            r11 = r11[r12]
            int r12 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r12 >= 0) goto L33
            r12 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 <= 0) goto L42
            r9[r0] = r2
            m.b r9 = r14.f22517b
            r11.m22600c(r9)
            goto L41
        L33:
            r12 = 981668463(0x3a83126f, float:0.001)
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 >= 0) goto L42
            r9[r0] = r2
            m.b r9 = r14.f22517b
            r11.m22600c(r9)
        L41:
            r10 = 0
        L42:
            int r9 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r9 == 0) goto L90
            m.i$a r9 = r11.f22562g
            m.i$a r12 = p228m.C5566i.a.UNRESTRICTED
            r13 = 1
            if (r9 != r12) goto L6c
            if (r3 != 0) goto L57
            boolean r3 = r14.m22523k(r11, r15)
        L53:
            r5 = r3
            r7 = r10
            r3 = r11
            goto L90
        L57:
            int r9 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r9 <= 0) goto L60
            boolean r3 = r14.m22523k(r11, r15)
            goto L53
        L60:
            if (r5 != 0) goto L90
            boolean r9 = r14.m22523k(r11, r15)
            if (r9 == 0) goto L90
            r7 = r10
            r3 = r11
            r5 = 1
            goto L90
        L6c:
            if (r3 != 0) goto L90
            int r9 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r9 >= 0) goto L90
            if (r1 != 0) goto L7c
            boolean r1 = r14.m22523k(r11, r15)
        L78:
            r6 = r1
            r8 = r10
            r1 = r11
            goto L90
        L7c:
            int r9 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r9 <= 0) goto L85
            boolean r1 = r14.m22523k(r11, r15)
            goto L78
        L85:
            if (r6 != 0) goto L90
            boolean r9 = r14.m22523k(r11, r15)
            if (r9 == 0) goto L90
            r8 = r10
            r1 = r11
            r6 = 1
        L90:
            int[] r9 = r14.f22522g
            r0 = r9[r0]
            int r4 = r4 + 1
            goto Lb
        L98:
            if (r3 == 0) goto L9b
            return r3
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p228m.C5558a.m22525b(m.e):m.i");
    }

    /* renamed from: c */
    public final void m22526c() {
        int i10 = this.f22524i;
        for (int i11 = 0; i10 != -1 && i11 < this.f22516a; i11++) {
            C5566i c5566i = this.f22518c.f22534c[this.f22521f[i10]];
            if (c5566i != null) {
                c5566i.m22600c(this.f22517b);
            }
            i10 = this.f22522g[i10];
        }
        this.f22524i = -1;
        this.f22525j = -1;
        this.f22526k = false;
        this.f22516a = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean m22527d(C5566i c5566i) {
        int i10 = this.f22524i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f22516a; i11++) {
            if (this.f22521f[i10] == c5566i.f22557b) {
                return true;
            }
            i10 = this.f22522g[i10];
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m22528e(float f10) {
        int i10 = this.f22524i;
        for (int i11 = 0; i10 != -1 && i11 < this.f22516a; i11++) {
            float[] fArr = this.f22523h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f22522g[i10];
        }
    }

    /* renamed from: f */
    public final float m22529f(C5566i c5566i) {
        int i10 = this.f22524i;
        for (int i11 = 0; i10 != -1 && i11 < this.f22516a; i11++) {
            if (this.f22521f[i10] == c5566i.f22557b) {
                return this.f22523h[i10];
            }
            i10 = this.f22522g[i10];
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C5566i m22530g(boolean[] zArr, C5566i c5566i) {
        C5566i.a aVar;
        int i10 = this.f22524i;
        C5566i c5566i2 = null;
        float f10 = 0.0f;
        for (int i11 = 0; i10 != -1 && i11 < this.f22516a; i11++) {
            float f11 = this.f22523h[i10];
            if (f11 < 0.0f) {
                C5566i c5566i3 = this.f22518c.f22534c[this.f22521f[i10]];
                if ((zArr == null || !zArr[c5566i3.f22557b]) && c5566i3 != c5566i && (((aVar = c5566i3.f22562g) == C5566i.a.SLACK || aVar == C5566i.a.ERROR) && f11 < f10)) {
                    f10 = f11;
                    c5566i2 = c5566i3;
                }
            }
            i10 = this.f22522g[i10];
        }
        return c5566i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final C5566i m22531h(int i10) {
        int i11 = this.f22524i;
        for (int i12 = 0; i11 != -1 && i12 < this.f22516a; i12++) {
            if (i12 == i10) {
                return this.f22518c.f22534c[this.f22521f[i11]];
            }
            i11 = this.f22522g[i11];
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final float m22532i(int i10) {
        int i11 = this.f22524i;
        for (int i12 = 0; i11 != -1 && i12 < this.f22516a; i12++) {
            if (i12 == i10) {
                return this.f22523h[i11];
            }
            i11 = this.f22522g[i11];
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m22533j() {
        int i10 = this.f22524i;
        for (int i11 = 0; i10 != -1 && i11 < this.f22516a; i11++) {
            float[] fArr = this.f22523h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f22522g[i10];
        }
    }

    /* renamed from: l */
    public final void m22534l(C5566i c5566i, float f10) {
        if (f10 == 0.0f) {
            m22535m(c5566i, true);
            return;
        }
        int i10 = this.f22524i;
        if (i10 == -1) {
            this.f22524i = 0;
            this.f22523h[0] = f10;
            this.f22521f[0] = c5566i.f22557b;
            this.f22522g[0] = -1;
            c5566i.f22565j++;
            c5566i.m22599a(this.f22517b);
            this.f22516a++;
            if (!this.f22526k) {
                int i11 = this.f22525j + 1;
                this.f22525j = i11;
                int[] iArr = this.f22521f;
                if (i11 >= iArr.length) {
                    this.f22526k = true;
                    this.f22525j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f22516a; i13++) {
            int i14 = this.f22521f[i10];
            int i15 = c5566i.f22557b;
            if (i14 == i15) {
                this.f22523h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f22522g[i10];
        }
        int i16 = this.f22525j;
        int i17 = i16 + 1;
        if (this.f22526k) {
            int[] iArr2 = this.f22521f;
            if (iArr2[i16] != -1) {
                i16 = iArr2.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr3 = this.f22521f;
        if (i16 >= iArr3.length && this.f22516a < iArr3.length) {
            int i18 = 0;
            while (true) {
                int[] iArr4 = this.f22521f;
                if (i18 >= iArr4.length) {
                    break;
                }
                if (iArr4[i18] == -1) {
                    i16 = i18;
                    break;
                }
                i18++;
            }
        }
        int[] iArr5 = this.f22521f;
        if (i16 >= iArr5.length) {
            i16 = iArr5.length;
            int i19 = this.f22519d * 2;
            this.f22519d = i19;
            this.f22526k = false;
            this.f22525j = i16 - 1;
            this.f22523h = Arrays.copyOf(this.f22523h, i19);
            this.f22521f = Arrays.copyOf(this.f22521f, this.f22519d);
            this.f22522g = Arrays.copyOf(this.f22522g, this.f22519d);
        }
        this.f22521f[i16] = c5566i.f22557b;
        this.f22523h[i16] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f22522g;
            iArr6[i16] = iArr6[i12];
            iArr6[i12] = i16;
        } else {
            this.f22522g[i16] = this.f22524i;
            this.f22524i = i16;
        }
        c5566i.f22565j++;
        c5566i.m22599a(this.f22517b);
        int i20 = this.f22516a + 1;
        this.f22516a = i20;
        if (!this.f22526k) {
            this.f22525j++;
        }
        int[] iArr7 = this.f22521f;
        if (i20 >= iArr7.length) {
            this.f22526k = true;
        }
        if (this.f22525j >= iArr7.length) {
            this.f22526k = true;
            this.f22525j = iArr7.length - 1;
        }
    }

    /* renamed from: m */
    public final float m22535m(C5566i c5566i, boolean z10) {
        if (this.f22520e == c5566i) {
            this.f22520e = null;
        }
        int i10 = this.f22524i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f22516a) {
            if (this.f22521f[i10] == c5566i.f22557b) {
                if (i10 == this.f22524i) {
                    this.f22524i = this.f22522g[i10];
                } else {
                    int[] iArr = this.f22522g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    c5566i.m22600c(this.f22517b);
                }
                c5566i.f22565j--;
                this.f22516a--;
                this.f22521f[i10] = -1;
                if (this.f22526k) {
                    this.f22525j = i10;
                }
                return this.f22523h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f22522g[i10];
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final void m22536n(C5559b c5559b, C5559b c5559b2, boolean z10) {
        int i10 = this.f22524i;
        while (true) {
            for (int i11 = 0; i10 != -1 && i11 < this.f22516a; i11++) {
                int i12 = this.f22521f[i10];
                C5566i c5566i = c5559b2.f22527a;
                if (i12 == c5566i.f22557b) {
                    float f10 = this.f22523h[i10];
                    m22535m(c5566i, z10);
                    C5558a c5558a = c5559b2.f22530d;
                    int i13 = c5558a.f22524i;
                    for (int i14 = 0; i13 != -1 && i14 < c5558a.f22516a; i14++) {
                        m22524a(this.f22518c.f22534c[c5558a.f22521f[i13]], c5558a.f22523h[i13] * f10, z10);
                        i13 = c5558a.f22522g[i13];
                    }
                    c5559b.f22528b += c5559b2.f22528b * f10;
                    if (z10) {
                        c5559b2.f22527a.m22600c(c5559b);
                    }
                    i10 = this.f22524i;
                } else {
                    i10 = this.f22522g[i10];
                }
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m22537o(C5559b c5559b, C5559b[] c5559bArr) {
        int i10 = this.f22524i;
        while (true) {
            for (int i11 = 0; i10 != -1 && i11 < this.f22516a; i11++) {
                C5566i c5566i = this.f22518c.f22534c[this.f22521f[i10]];
                if (c5566i.f22558c != -1) {
                    float f10 = this.f22523h[i10];
                    m22535m(c5566i, true);
                    C5559b c5559b2 = c5559bArr[c5566i.f22558c];
                    if (!c5559b2.f22531e) {
                        C5558a c5558a = c5559b2.f22530d;
                        int i12 = c5558a.f22524i;
                        for (int i13 = 0; i12 != -1 && i13 < c5558a.f22516a; i13++) {
                            m22524a(this.f22518c.f22534c[c5558a.f22521f[i12]], c5558a.f22523h[i12] * f10, true);
                            i12 = c5558a.f22522g[i12];
                        }
                    }
                    c5559b.f22528b += c5559b2.f22528b * f10;
                    c5559b2.f22527a.m22600c(c5559b);
                    i10 = this.f22524i;
                } else {
                    i10 = this.f22522g[i10];
                }
            }
            return;
        }
    }

    public String toString() {
        int i10 = this.f22524i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f22516a; i11++) {
            str = ((str + " -> ") + this.f22523h[i10] + " : ") + this.f22518c.f22534c[this.f22521f[i10]];
            i10 = this.f22522g[i10];
        }
        return str;
    }
}
