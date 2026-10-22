package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0814a;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.j */
/* loaded from: classes.dex */
public class C0823j {

    /* renamed from: a */
    final a f3476a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.j$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo4107a(C0814a.b bVar);

        /* renamed from: b */
        C0814a.b mo4108b(int i10, int i11, int i12, Object obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0823j(a aVar) {
        this.f3476a = aVar;
    }

    /* renamed from: a */
    private int m4218a(List list) {
        boolean z10 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((C0814a.b) list.get(size)).f3350a == 8) {
                if (z10) {
                    return size;
                }
            } else {
                z10 = true;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private void m4219c(List list, int i10, C0814a.b bVar, int i11, C0814a.b bVar2) {
        int i12;
        int i13 = bVar.f3353d;
        int i14 = bVar2.f3351b;
        if (i13 < i14) {
            i12 = -1;
        } else {
            i12 = 0;
        }
        int i15 = bVar.f3351b;
        if (i15 < i14) {
            i12++;
        }
        if (i14 <= i15) {
            bVar.f3351b = i15 + bVar2.f3353d;
        }
        int i16 = bVar2.f3351b;
        if (i16 <= i13) {
            bVar.f3353d = i13 + bVar2.f3353d;
        }
        bVar2.f3351b = i16 + i12;
        list.set(i10, bVar2);
        list.set(i11, bVar);
    }

    /* renamed from: d */
    private void m4220d(List list, int i10, int i11) {
        C0814a.b bVar = (C0814a.b) list.get(i10);
        C0814a.b bVar2 = (C0814a.b) list.get(i11);
        int i12 = bVar2.f3350a;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 4) {
                    m4223f(list, i10, bVar, i11, bVar2);
                    return;
                }
                return;
            }
            m4222e(list, i10, bVar, i11, bVar2);
            return;
        }
        m4219c(list, i10, bVar, i11, bVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m4221b(List list) {
        while (true) {
            int m4218a = m4218a(list);
            if (m4218a != -1) {
                m4220d(list, m4218a, m4218a + 1);
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    void m4222e(List list, int i10, C0814a.b bVar, int i11, C0814a.b bVar2) {
        boolean z10;
        int i12 = bVar.f3351b;
        int i13 = bVar.f3353d;
        boolean z11 = false;
        if (i12 < i13) {
            if (bVar2.f3351b == i12 && bVar2.f3353d == i13 - i12) {
                z10 = false;
                z11 = true;
            } else {
                z10 = false;
            }
        } else if (bVar2.f3351b == i13 + 1 && bVar2.f3353d == i12 - i13) {
            z10 = true;
            z11 = true;
        } else {
            z10 = true;
        }
        int i14 = bVar2.f3351b;
        if (i13 < i14) {
            bVar2.f3351b = i14 - 1;
        } else {
            int i15 = bVar2.f3353d;
            if (i13 < i14 + i15) {
                bVar2.f3353d = i15 - 1;
                bVar.f3350a = 2;
                bVar.f3353d = 1;
                if (bVar2.f3353d == 0) {
                    list.remove(i11);
                    this.f3476a.mo4107a(bVar2);
                    return;
                }
                return;
            }
        }
        int i16 = bVar.f3351b;
        int i17 = bVar2.f3351b;
        C0814a.b bVar3 = null;
        if (i16 <= i17) {
            bVar2.f3351b = i17 + 1;
        } else {
            int i18 = bVar2.f3353d;
            if (i16 < i17 + i18) {
                bVar3 = this.f3476a.mo4108b(2, i16 + 1, (i17 + i18) - i16, null);
                bVar2.f3353d = bVar.f3351b - bVar2.f3351b;
            }
        }
        if (z11) {
            list.set(i10, bVar2);
            list.remove(i11);
            this.f3476a.mo4107a(bVar);
            return;
        }
        if (z10) {
            if (bVar3 != null) {
                int i19 = bVar.f3351b;
                if (i19 > bVar3.f3351b) {
                    bVar.f3351b = i19 - bVar3.f3353d;
                }
                int i20 = bVar.f3353d;
                if (i20 > bVar3.f3351b) {
                    bVar.f3353d = i20 - bVar3.f3353d;
                }
            }
            int i21 = bVar.f3351b;
            if (i21 > bVar2.f3351b) {
                bVar.f3351b = i21 - bVar2.f3353d;
            }
            int i22 = bVar.f3353d;
            if (i22 > bVar2.f3351b) {
                bVar.f3353d = i22 - bVar2.f3353d;
            }
        } else {
            if (bVar3 != null) {
                int i23 = bVar.f3351b;
                if (i23 >= bVar3.f3351b) {
                    bVar.f3351b = i23 - bVar3.f3353d;
                }
                int i24 = bVar.f3353d;
                if (i24 >= bVar3.f3351b) {
                    bVar.f3353d = i24 - bVar3.f3353d;
                }
            }
            int i25 = bVar.f3351b;
            if (i25 >= bVar2.f3351b) {
                bVar.f3351b = i25 - bVar2.f3353d;
            }
            int i26 = bVar.f3353d;
            if (i26 >= bVar2.f3351b) {
                bVar.f3353d = i26 - bVar2.f3353d;
            }
        }
        list.set(i10, bVar2);
        if (bVar.f3351b != bVar.f3353d) {
            list.set(i11, bVar);
        } else {
            list.remove(i11);
        }
        if (bVar3 != null) {
            list.add(i10, bVar3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m4223f(java.util.List r9, int r10, androidx.recyclerview.widget.C0814a.b r11, int r12, androidx.recyclerview.widget.C0814a.b r13) {
        /*
            r8 = this;
            int r0 = r11.f3353d
            int r1 = r13.f3351b
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto Ld
            int r1 = r1 - r3
            r13.f3351b = r1
            goto L20
        Ld:
            int r5 = r13.f3353d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r3
            r13.f3353d = r5
            androidx.recyclerview.widget.j$a r0 = r8.f3476a
            int r1 = r11.f3351b
            java.lang.Object r5 = r13.f3352c
            androidx.recyclerview.widget.a$b r0 = r0.mo4108b(r2, r1, r3, r5)
            goto L21
        L20:
            r0 = r4
        L21:
            int r1 = r11.f3351b
            int r5 = r13.f3351b
            if (r1 > r5) goto L2b
            int r5 = r5 + r3
            r13.f3351b = r5
            goto L41
        L2b:
            int r6 = r13.f3353d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.j$a r4 = r8.f3476a
            int r1 = r1 + r3
            java.lang.Object r3 = r13.f3352c
            androidx.recyclerview.widget.a$b r4 = r4.mo4108b(r2, r1, r5, r3)
            int r1 = r13.f3353d
            int r1 = r1 - r5
            r13.f3353d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f3353d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.j$a r11 = r8.f3476a
            r11.mo4107a(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r4 == 0) goto L5e
            r9.add(r10, r4)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0823j.m4223f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
