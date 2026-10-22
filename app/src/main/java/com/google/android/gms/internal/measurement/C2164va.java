package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.va */
/* loaded from: classes.dex */
public final class C2164va {

    /* renamed from: f */
    private static final C2164va f8221f = new C2164va(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f8222a;

    /* renamed from: b */
    private int[] f8223b;

    /* renamed from: c */
    private Object[] f8224c;

    /* renamed from: d */
    private int f8225d = -1;

    /* renamed from: e */
    private boolean f8226e;

    private C2164va(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f8222a = i10;
        this.f8223b = iArr;
        this.f8224c = objArr;
        this.f8226e = z10;
    }

    /* renamed from: c */
    public static C2164va m9045c() {
        return f8221f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C2164va m9046d(C2164va c2164va, C2164va c2164va2) {
        int i10 = c2164va.f8222a + c2164va2.f8222a;
        int[] copyOf = Arrays.copyOf(c2164va.f8223b, i10);
        System.arraycopy(c2164va2.f8223b, 0, copyOf, c2164va.f8222a, c2164va2.f8222a);
        Object[] copyOf2 = Arrays.copyOf(c2164va.f8224c, i10);
        System.arraycopy(c2164va2.f8224c, 0, copyOf2, c2164va.f8222a, c2164va2.f8222a);
        return new C2164va(i10, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C2164va m9047e() {
        return new C2164va(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int m9048a() {
        int m8588a;
        int m8589b;
        int i10;
        int i11 = this.f8225d;
        if (i11 == -1) {
            int i12 = 0;
            for (int i13 = 0; i13 < this.f8222a; i13++) {
                int i14 = this.f8223b[i13];
                int i15 = i14 >>> 3;
                int i16 = i14 & 7;
                if (i16 != 0) {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            if (i16 != 3) {
                                if (i16 == 5) {
                                    ((Integer) this.f8224c[i13]).intValue();
                                    i10 = AbstractC1997k8.m8588a(i15 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(C1968i9.m8526a());
                                }
                            } else {
                                int m8587C = AbstractC1997k8.m8587C(i15);
                                m8588a = m8587C + m8587C;
                                m8589b = ((C2164va) this.f8224c[i13]).m9048a();
                            }
                        } else {
                            AbstractC1873c8 abstractC1873c8 = (AbstractC1873c8) this.f8224c[i13];
                            int m8588a2 = AbstractC1997k8.m8588a(i15 << 3);
                            int mo8182i = abstractC1873c8.mo8182i();
                            i12 += m8588a2 + AbstractC1997k8.m8588a(mo8182i) + mo8182i;
                        }
                    } else {
                        ((Long) this.f8224c[i13]).longValue();
                        i10 = AbstractC1997k8.m8588a(i15 << 3) + 8;
                    }
                    i12 += i10;
                } else {
                    long longValue = ((Long) this.f8224c[i13]).longValue();
                    m8588a = AbstractC1997k8.m8588a(i15 << 3);
                    m8589b = AbstractC1997k8.m8589b(longValue);
                }
                i10 = m8588a + m8589b;
                i12 += i10;
            }
            this.f8225d = i12;
            return i12;
        }
        return i11;
    }

    /* renamed from: b */
    public final int m9049b() {
        int i10 = this.f8225d;
        if (i10 == -1) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.f8222a; i12++) {
                int i13 = this.f8223b[i12];
                AbstractC1873c8 abstractC1873c8 = (AbstractC1873c8) this.f8224c[i12];
                int m8588a = AbstractC1997k8.m8588a(8);
                int mo8182i = abstractC1873c8.mo8182i();
                i11 += m8588a + m8588a + AbstractC1997k8.m8588a(16) + AbstractC1997k8.m8588a(i13 >>> 3) + AbstractC1997k8.m8588a(24) + AbstractC1997k8.m8588a(mo8182i) + mo8182i;
            }
            this.f8225d = i11;
            return i11;
        }
        return i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2164va)) {
            return false;
        }
        C2164va c2164va = (C2164va) obj;
        int i10 = this.f8222a;
        if (i10 == c2164va.f8222a) {
            int[] iArr = this.f8223b;
            int[] iArr2 = c2164va.f8223b;
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    if (iArr[i11] != iArr2[i11]) {
                        break;
                    }
                    i11++;
                } else {
                    Object[] objArr = this.f8224c;
                    Object[] objArr2 = c2164va.f8224c;
                    int i12 = this.f8222a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void m9050f() {
        this.f8226e = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m9051g(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f8222a; i11++) {
            AbstractC1923fa.m8389b(sb2, i10, String.valueOf(this.f8223b[i11] >>> 3), this.f8224c[i11]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final void m9052h(int i10, Object obj) {
        int i11;
        if (this.f8226e) {
            int i12 = this.f8222a;
            int[] iArr = this.f8223b;
            if (i12 == iArr.length) {
                if (i12 < 4) {
                    i11 = 8;
                } else {
                    i11 = i12 >> 1;
                }
                int i13 = i12 + i11;
                this.f8223b = Arrays.copyOf(iArr, i13);
                this.f8224c = Arrays.copyOf(this.f8224c, i13);
            }
            int[] iArr2 = this.f8223b;
            int i14 = this.f8222a;
            iArr2[i14] = i10;
            this.f8224c[i14] = obj;
            this.f8222a = i14 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i10 = this.f8222a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f8223b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f8224c;
        int i16 = this.f8222a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    /* renamed from: i */
    public final void m9053i(InterfaceC2015lb interfaceC2015lb) {
        if (this.f8222a != 0) {
            for (int i10 = 0; i10 < this.f8222a; i10++) {
                int i11 = this.f8223b[i10];
                Object obj = this.f8224c[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                if (i13 == 5) {
                                    interfaceC2015lb.mo8640d(i12, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(C1968i9.m8526a());
                                }
                            } else {
                                interfaceC2015lb.mo8630D(i12);
                                ((C2164va) obj).m9053i(interfaceC2015lb);
                                interfaceC2015lb.mo8636J(i12);
                            }
                        } else {
                            interfaceC2015lb.mo8653q(i12, (AbstractC1873c8) obj);
                        }
                    } else {
                        interfaceC2015lb.mo8633G(i12, ((Long) obj).longValue());
                    }
                } else {
                    interfaceC2015lb.mo8644h(i12, ((Long) obj).longValue());
                }
            }
        }
    }
}
