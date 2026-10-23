package p175i7;

/* renamed from: i7.d */
/* loaded from: classes.dex */
abstract class AbstractC4905d {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m20133a(C4903b c4903b) {
        return m20134b(c4903b, true) + m20134b(c4903b, false);
    }

    /* renamed from: b */
    private static int m20134b(C4903b c4903b, boolean z10) {
        int m20108e;
        int m20107d;
        byte b10 = 0;
        if (z10) {
            m20108e = c4903b.m20107d();
        } else {
            m20108e = c4903b.m20108e();
        }
        if (z10) {
            m20107d = c4903b.m20108e();
        } else {
            m20107d = c4903b.m20107d();
        }
        byte[][] m20106c = c4903b.m20106c();
        int i10 = 0;
        for (int i11 = 0; i11 < m20108e; i11++) {
            byte b11 = -1;
            int i12 = 0;
            for (int i13 = 0; i13 < m20107d; i13++) {
                if (z10) {
                    b10 = m20106c[i11][i13];
                } else {
                    b10 = m20106c[i13][i11];
                }
                if (b10 == b11) {
                    i12++;
                } else {
                    if (i12 >= 5) {
                        i10 += (i12 - 5) + 3;
                    }
                    b11 = b10;
                    i12 = 1;
                }
            }
            if (i12 >= 5) {
                i10 += (i12 - 5) + 3;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m20135c(C4903b c4903b) {
        byte[][] m20106c = c4903b.m20106c();
        int m20108e = c4903b.m20108e();
        int m20107d = c4903b.m20107d();
        int i10 = 0;
        for (int i11 = 0; i11 < m20107d - 1; i11++) {
            int i12 = 0;
            while (i12 < m20108e - 1) {
                byte[] bArr = m20106c[i11];
                byte b10 = bArr[i12];
                int i13 = i12 + 1;
                if (b10 == bArr[i13]) {
                    byte[] bArr2 = m20106c[i11 + 1];
                    if (b10 == bArr2[i12] && b10 == bArr2[i13]) {
                        i10++;
                    }
                }
                i12 = i13;
            }
        }
        return i10 * 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m20136d(C4903b c4903b) {
        byte[][] m20106c = c4903b.m20106c();
        int m20108e = c4903b.m20108e();
        int m20107d = c4903b.m20107d();
        int i10 = 0;
        for (int i11 = 0; i11 < m20107d; i11++) {
            for (int i12 = 0; i12 < m20108e; i12++) {
                byte[] bArr = m20106c[i11];
                int i13 = i12 + 6;
                if (i13 < m20108e && bArr[i12] == 1 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 1 && bArr[i12 + 3] == 1 && bArr[i12 + 4] == 1 && bArr[i12 + 5] == 0 && bArr[i13] == 1 && (m20139g(bArr, i12 - 4, i12) || m20139g(bArr, i12 + 7, i12 + 11))) {
                    i10++;
                }
                int i14 = i11 + 6;
                if (i14 < m20107d && m20106c[i11][i12] == 1 && m20106c[i11 + 1][i12] == 0 && m20106c[i11 + 2][i12] == 1 && m20106c[i11 + 3][i12] == 1 && m20106c[i11 + 4][i12] == 1 && m20106c[i11 + 5][i12] == 0 && m20106c[i14][i12] == 1 && (m20140h(m20106c, i12, i11 - 4, i11) || m20140h(m20106c, i12, i11 + 7, i11 + 11))) {
                    i10++;
                }
            }
        }
        return i10 * 40;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m20137e(C4903b c4903b) {
        byte[][] m20106c = c4903b.m20106c();
        int m20108e = c4903b.m20108e();
        int m20107d = c4903b.m20107d();
        int i10 = 0;
        for (int i11 = 0; i11 < m20107d; i11++) {
            byte[] bArr = m20106c[i11];
            for (int i12 = 0; i12 < m20108e; i12++) {
                if (bArr[i12] == 1) {
                    i10++;
                }
            }
        }
        int m20107d2 = c4903b.m20107d() * c4903b.m20108e();
        return ((Math.abs((i10 << 1) - m20107d2) * 10) / m20107d2) * 10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0001. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0043 A[RETURN] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m20138f(int r1, int r2, int r3) {
        /*
            r0 = 1
            switch(r1) {
                case 0: goto L3e;
                case 1: goto L3f;
                case 2: goto L3b;
                case 3: goto L37;
                case 4: goto L32;
                case 5: goto L2a;
                case 6: goto L21;
                case 7: goto L18;
                default: goto L4;
            }
        L4:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid mask pattern: "
            r3.<init>(r0)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L18:
            int r1 = r3 * r2
            int r1 = r1 % 3
            int r3 = r3 + r2
            r2 = r3 & 1
            int r1 = r1 + r2
            goto L28
        L21:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
        L28:
            r1 = r1 & r0
            goto L41
        L2a:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
            goto L41
        L32:
            int r3 = r3 / 2
            int r2 = r2 / 3
            goto L3e
        L37:
            int r3 = r3 + r2
            int r1 = r3 % 3
            goto L41
        L3b:
            int r1 = r2 % 3
            goto L41
        L3e:
            int r3 = r3 + r2
        L3f:
            r1 = r3 & 1
        L41:
            if (r1 != 0) goto L44
            return r0
        L44:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p175i7.AbstractC4905d.m20138f(int, int, int):boolean");
    }

    /* renamed from: g */
    private static boolean m20139g(byte[] bArr, int i10, int i11) {
        int min = Math.min(i11, bArr.length);
        for (int max = Math.max(i10, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    private static boolean m20140h(byte[][] bArr, int i10, int i11, int i12) {
        int min = Math.min(i12, bArr.length);
        for (int max = Math.max(i11, 0); max < min; max++) {
            if (bArr[max][i10] == 1) {
                return false;
            }
        }
        return true;
    }
}
