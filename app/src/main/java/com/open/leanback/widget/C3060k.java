package com.open.leanback.widget;

import com.open.leanback.widget.AbstractC3059j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.open.leanback.widget.k */
/* loaded from: classes2.dex */
public final class C3060k extends AbstractC3059j {
    /* renamed from: R */
    private int m12585R(boolean z10) {
        boolean z11 = false;
        if (z10) {
            for (int i10 = this.f12521g; i10 >= this.f12520f; i10--) {
                int i11 = mo12549q(i10).f12524a;
                if (i11 == 0) {
                    z11 = true;
                } else if (z11 && i11 == this.f12519e - 1) {
                    return i10;
                }
            }
            return -1;
        }
        for (int i12 = this.f12520f; i12 <= this.f12521g; i12++) {
            int i13 = mo12549q(i12).f12524a;
            if (i13 == this.f12519e - 1) {
                z11 = true;
            } else if (z11 && i13 == 0) {
                return i12;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x014d, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0135, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0136, code lost:
    
        r6 = r10;
     */
    @Override // com.open.leanback.widget.AbstractC3059j
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean mo12578J(int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.open.leanback.widget.C3060k.mo12578J(int, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0148, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0130, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0131, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0101 A[LOOP:2: B:54:0x0101->B:68:0x0125, LOOP_START, PHI: r5 r8 r9
  0x0101: PHI (r5v13 int) = (r5v6 int), (r5v19 int) binds: [B:53:0x00ff, B:68:0x0125] A[DONT_GENERATE, DONT_INLINE]
  0x0101: PHI (r8v19 int) = (r8v17 int), (r8v20 int) binds: [B:53:0x00ff, B:68:0x0125] A[DONT_GENERATE, DONT_INLINE]
  0x0101: PHI (r9v7 int) = (r9v6 int), (r9v9 int) binds: [B:53:0x00ff, B:68:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0133  */
    @Override // com.open.leanback.widget.AbstractC3059j
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean mo12584Q(int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.open.leanback.widget.C3060k.mo12584Q(int, boolean):boolean");
    }

    /* renamed from: S */
    int m12586S(int i10) {
        int i11;
        AbstractC3059j.a mo12549q;
        int i12 = this.f12520f;
        if (i12 < 0) {
            return Integer.MIN_VALUE;
        }
        if (this.f12517c) {
            int mo12485c = this.f12516b.mo12485c(i12);
            if (mo12549q(this.f12520f).f12524a == i10) {
                return mo12485c;
            }
            int i13 = this.f12520f;
            do {
                i13++;
                if (i13 <= m12580M()) {
                    mo12549q = mo12549q(i13);
                    mo12485c += mo12549q.f12543b;
                }
            } while (mo12549q.f12524a != i10);
            return mo12485c;
        }
        int mo12485c2 = this.f12516b.mo12485c(this.f12521g);
        AbstractC3059j.a mo12549q2 = mo12549q(this.f12521g);
        if (mo12549q2.f12524a == i10) {
            i11 = mo12549q2.f12544c;
        } else {
            int i14 = this.f12521g;
            do {
                i14--;
                if (i14 >= m12579L()) {
                    mo12485c2 -= mo12549q2.f12543b;
                    mo12549q2 = mo12549q(i14);
                }
            } while (mo12549q2.f12524a != i10);
            i11 = mo12549q2.f12544c;
        }
        return mo12485c2 + i11;
        return Integer.MIN_VALUE;
    }

    /* renamed from: T */
    int m12587T(int i10) {
        AbstractC3059j.a mo12549q;
        int i11;
        int i12 = this.f12520f;
        if (i12 < 0) {
            return Integer.MAX_VALUE;
        }
        if (this.f12517c) {
            int mo12485c = this.f12516b.mo12485c(this.f12521g);
            AbstractC3059j.a mo12549q2 = mo12549q(this.f12521g);
            if (mo12549q2.f12524a == i10) {
                i11 = mo12549q2.f12544c;
            } else {
                int i13 = this.f12521g;
                do {
                    i13--;
                    if (i13 >= m12579L()) {
                        mo12485c -= mo12549q2.f12543b;
                        mo12549q2 = mo12549q(i13);
                    }
                } while (mo12549q2.f12524a != i10);
                i11 = mo12549q2.f12544c;
            }
            return mo12485c - i11;
        }
        int mo12485c2 = this.f12516b.mo12485c(i12);
        if (mo12549q(this.f12520f).f12524a == i10) {
            return mo12485c2;
        }
        int i14 = this.f12520f;
        do {
            i14++;
            if (i14 <= m12580M()) {
                mo12549q = mo12549q(i14);
                mo12485c2 += mo12549q.f12543b;
            }
        } while (mo12549q.f12524a != i10);
        return mo12485c2;
        return Integer.MAX_VALUE;
    }

    @Override // com.open.leanback.widget.AbstractC3051b
    /* renamed from: i */
    public int mo12541i(boolean z10, int i10, int[] iArr) {
        int i11;
        int mo12485c = this.f12516b.mo12485c(i10);
        AbstractC3059j.a mo12549q = mo12549q(i10);
        int i12 = mo12549q.f12524a;
        if (this.f12517c) {
            i11 = i12;
            int i13 = i11;
            int i14 = 1;
            int i15 = mo12485c;
            for (int i16 = i10 + 1; i14 < this.f12519e && i16 <= this.f12521g; i16++) {
                AbstractC3059j.a mo12549q2 = mo12549q(i16);
                i15 += mo12549q2.f12543b;
                int i17 = mo12549q2.f12524a;
                if (i17 != i13) {
                    i14++;
                    if (!z10 ? i15 < mo12485c : i15 > mo12485c) {
                        mo12485c = i15;
                        i10 = i16;
                        i11 = i17;
                        i13 = i11;
                    } else {
                        i13 = i17;
                    }
                }
            }
        } else {
            int i18 = 1;
            int i19 = i12;
            AbstractC3059j.a aVar = mo12549q;
            int i20 = mo12485c;
            mo12485c = this.f12516b.mo12484b(i10) + mo12485c;
            i11 = i19;
            for (int i21 = i10 - 1; i18 < this.f12519e && i21 >= this.f12520f; i21--) {
                i20 -= aVar.f12543b;
                aVar = mo12549q(i21);
                int i22 = aVar.f12524a;
                if (i22 != i19) {
                    i18++;
                    int mo12484b = this.f12516b.mo12484b(i21) + i20;
                    if (!z10 ? mo12484b < mo12485c : mo12484b > mo12485c) {
                        mo12485c = mo12484b;
                        i10 = i21;
                        i11 = i22;
                        i19 = i11;
                    } else {
                        i19 = i22;
                    }
                }
            }
        }
        if (iArr != null) {
            iArr[0] = i11;
            iArr[1] = i10;
        }
        return mo12485c;
    }

    @Override // com.open.leanback.widget.AbstractC3051b
    /* renamed from: k */
    public int mo12543k(boolean z10, int i10, int[] iArr) {
        int i11;
        int mo12485c = this.f12516b.mo12485c(i10);
        AbstractC3059j.a mo12549q = mo12549q(i10);
        int i12 = mo12549q.f12524a;
        if (this.f12517c) {
            int i13 = 1;
            i11 = mo12485c - this.f12516b.mo12484b(i10);
            int i14 = i12;
            for (int i15 = i10 - 1; i13 < this.f12519e && i15 >= this.f12520f; i15--) {
                mo12485c -= mo12549q.f12543b;
                mo12549q = mo12549q(i15);
                int i16 = mo12549q.f12524a;
                if (i16 != i14) {
                    i13++;
                    int mo12484b = mo12485c - this.f12516b.mo12484b(i15);
                    if (!z10 ? mo12484b < i11 : mo12484b > i11) {
                        i11 = mo12484b;
                        i10 = i15;
                        i12 = i16;
                        i14 = i12;
                    } else {
                        i14 = i16;
                    }
                }
            }
        } else {
            int i17 = i12;
            int i18 = i17;
            int i19 = 1;
            int i20 = mo12485c;
            for (int i21 = i10 + 1; i19 < this.f12519e && i21 <= this.f12521g; i21++) {
                AbstractC3059j.a mo12549q2 = mo12549q(i21);
                i20 += mo12549q2.f12543b;
                int i22 = mo12549q2.f12524a;
                if (i22 != i18) {
                    i19++;
                    if (!z10 ? i20 < mo12485c : i20 > mo12485c) {
                        mo12485c = i20;
                        i10 = i21;
                        i17 = i22;
                        i18 = i17;
                    } else {
                        i18 = i22;
                    }
                }
            }
            i11 = mo12485c;
            i12 = i17;
        }
        if (iArr != null) {
            iArr[0] = i12;
            iArr[1] = i10;
        }
        return i11;
    }
}
