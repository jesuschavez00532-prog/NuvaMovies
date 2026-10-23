package p175i7;

import p098d7.C3963c;
import p114e7.C4139a;
import p158h7.C4563c;
import p158h7.EnumC4561a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i7.e */
/* loaded from: classes.dex */
public abstract class AbstractC4906e {

    /* renamed from: a */
    private static final int[][] f20421a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b */
    private static final int[][] f20422b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c */
    private static final int[][] f20423c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d */
    private static final int[][] f20424d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20141a(C4139a c4139a, EnumC4561a enumC4561a, C4563c c4563c, int i10, C4903b c4903b) throws p098d7.C3963c {
        m20143c(c4903b);
        m20144d(c4563c, c4903b);
        m20152l(enumC4561a, i10, c4903b);
        m20159s(c4563c, c4903b);
        m20146f(c4139a, i10, c4903b);
    }

    /* renamed from: b */
    static int m20142b(int i10, int i11) throws p098d7.C3963c {
        if (i11 != 0) {
            int m20154n = m20154n(i11);
            int i12 = i10 << (m20154n - 1);
            while (m20154n(i12) >= m20154n) {
                i12 ^= i11 << (m20154n(i12) - m20154n);
            }
            return i12;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    /* renamed from: c */
    static void m20143c(C4903b c4903b) throws p098d7.C3963c {
        c4903b.m20104a((byte) -1);
    }

    /* renamed from: d */
    static void m20144d(C4563c c4563c, C4903b c4903b) throws p098d7.C3963c {
        m20150j(c4903b);
        m20145e(c4903b);
        m20158r(c4563c, c4903b);
        m20151k(c4903b);
    }

    /* renamed from: e */
    private static void m20145e(C4903b c4903b) throws p098d7.C3963c {
        if (c4903b.m20105b(8, c4903b.m20107d() - 8) != 0) {
            c4903b.m20109f(8, c4903b.m20107d() - 8, 1);
            return;
        }
        throw new C3963c();
    }

    /* renamed from: f */
    static void m20146f(C4139a c4139a, int i10, C4903b c4903b) throws p098d7.C3963c {
        boolean z10 = false;
        int m20108e = c4903b.m20108e() - 1;
        int m20107d = c4903b.m20107d() - 1;
        int i11 = 0;
        int i12 = -1;
        while (m20108e > 0) {
            if (m20108e == 6) {
                m20108e--;
            }
            while (m20107d >= 0 && m20107d < c4903b.m20107d()) {
                for (int i13 = 0; i13 < 2; i13++) {
                    int i14 = m20108e - i13;
                    if (m20155o(c4903b.m20105b(i14, m20107d))) {
                        if (i11 < c4139a.m17338h()) {
                            z10 = c4139a.m17337g(i11);
                            i11++;
                        } else {
                            z10 = false;
                        }
                        if (i10 != -1 && AbstractC4905d.m20138f(i10, i14, m20107d)) {
                            z10 = !z10;
                        }
                        c4903b.m20110g(i14, m20107d, z10);
                    }
                }
                m20107d += i12;
            }
            i12 = -i12;
            m20107d += i12;
            m20108e -= 2;
        }
        if (i11 == c4139a.m17338h()) {
            return;
        }
        throw new C3963c("Not all bits consumed: " + i11 + '/' + c4139a.m17338h());
    }

    /* renamed from: g */
    private static void m20147g(int i10, int i11, C4903b c4903b) throws p098d7.C3963c {
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = i10 + i12;
            if (m20155o(c4903b.m20105b(i13, i11))) {
                c4903b.m20109f(i13, i11, 0);
            } else {
                throw new C3963c();
            }
        }
    }

    /* renamed from: h */
    private static void m20148h(int i10, int i11, C4903b c4903b) {
        for (int i12 = 0; i12 < 5; i12++) {
            for (int i13 = 0; i13 < 5; i13++) {
                c4903b.m20109f(i10 + i13, i11 + i12, f20422b[i12][i13]);
            }
        }
    }

    /* renamed from: i */
    private static void m20149i(int i10, int i11, C4903b c4903b) {
        for (int i12 = 0; i12 < 7; i12++) {
            for (int i13 = 0; i13 < 7; i13++) {
                c4903b.m20109f(i10 + i13, i11 + i12, f20421a[i12][i13]);
            }
        }
    }

    /* renamed from: j */
    private static void m20150j(C4903b c4903b) {
        int length = f20421a[0].length;
        m20149i(0, 0, c4903b);
        m20149i(c4903b.m20108e() - length, 0, c4903b);
        m20149i(0, c4903b.m20108e() - length, c4903b);
        m20147g(0, 7, c4903b);
        m20147g(c4903b.m20108e() - 8, 7, c4903b);
        m20147g(0, c4903b.m20108e() - 8, c4903b);
        m20153m(7, 0, c4903b);
        m20153m((c4903b.m20107d() - 7) - 1, 0, c4903b);
        m20153m(7, c4903b.m20107d() - 7, c4903b);
    }

    /* renamed from: k */
    private static void m20151k(C4903b c4903b) throws p098d7.C3963c {
        int i10 = 8;
        while (i10 < c4903b.m20108e() - 8) {
            int i11 = i10 + 1;
            int i12 = i11 % 2;
            if (m20155o(c4903b.m20105b(i10, 6))) {
                c4903b.m20109f(i10, 6, i12);
            }
            if (m20155o(c4903b.m20105b(6, i10))) {
                c4903b.m20109f(6, i10, i12);
            }
            i10 = i11;
        }
    }

    /* renamed from: l */
    static void m20152l(EnumC4561a enumC4561a, int i10, C4903b c4903b) throws p098d7.C3963c {
        C4139a c4139a = new C4139a();
        m20156p(enumC4561a, i10, c4139a);
        for (int i11 = 0; i11 < c4139a.m17338h(); i11++) {
            boolean m17337g = c4139a.m17337g((c4139a.m17338h() - 1) - i11);
            int[] iArr = f20424d[i11];
            c4903b.m20110g(iArr[0], iArr[1], m17337g);
            if (i11 < 8) {
                c4903b.m20110g((c4903b.m20108e() - i11) - 1, 8, m17337g);
            } else {
                c4903b.m20110g(8, (c4903b.m20107d() - 7) + (i11 - 8), m17337g);
            }
        }
    }

    /* renamed from: m */
    private static void m20153m(int i10, int i11, C4903b c4903b) throws p098d7.C3963c {
        for (int i12 = 0; i12 < 7; i12++) {
            int i13 = i11 + i12;
            if (m20155o(c4903b.m20105b(i10, i13))) {
                c4903b.m20109f(i10, i13, 0);
            } else {
                throw new C3963c();
            }
        }
    }

    /* renamed from: n */
    static int m20154n(int i10) throws p098d7.C3963c {
        return 32 - Integer.numberOfLeadingZeros(i10);
    }

    /* renamed from: o */
    private static boolean m20155o(int i10) throws p098d7.C3963c {
        return i10 == -1;
    }

    /* renamed from: p */
    static void m20156p(EnumC4561a enumC4561a, int i10, C4139a c4139a) throws p098d7.C3963c {
        if (C4907f.m20160b(i10)) {
            int m18984a = (enumC4561a.m18984a() << 3) | i10;
            c4139a.m17335d(m18984a, 5);
            c4139a.m17335d(m20142b(m18984a, 1335), 10);
            C4139a c4139a2 = new C4139a();
            c4139a2.m17335d(21522, 15);
            c4139a.m17341l(c4139a2);
            if (c4139a.m17338h() == 15) {
                return;
            }
            throw new C3963c("should not happen but we got: " + c4139a.m17338h());
        }
        throw new C3963c("Invalid mask pattern");
    }

    /* renamed from: q */
    static void m20157q(C4563c c4563c, C4139a c4139a) throws p098d7.C3963c {
        c4139a.m17335d(c4563c.m18992f(), 6);
        c4139a.m17335d(m20142b(c4563c.m18992f(), 7973), 12);
        if (c4139a.m17338h() == 18) {
            return;
        }
        throw new C3963c("should not happen but we got: " + c4139a.m17338h());
    }

    /* renamed from: r */
    private static void m20158r(C4563c c4563c, C4903b c4903b) {
        if (c4563c.m18992f() < 2) {
            return;
        }
        int[] iArr = f20423c[c4563c.m18992f() - 1];
        for (int i10 : iArr) {
            for (int i11 : iArr) {
                if (i11 != -1 && i10 != -1 && m20155o(c4903b.m20105b(i11, i10))) {
                    m20148h(i11 - 2, i10 - 2, c4903b);
                }
            }
        }
    }

    /* renamed from: s */
    static void m20159s(C4563c c4563c, C4903b c4903b) {
        if (c4563c.m18992f() < 7) {
            return;
        }
        C4139a c4139a = new C4139a();
        m20157q(c4563c, c4139a);
        int i10 = 17;
        for (int i11 = 0; i11 < 6; i11++) {
            for (int i12 = 0; i12 < 3; i12++) {
                boolean m17337g = c4139a.m17337g(i10);
                i10--;
                c4903b.m20110g(i11, (c4903b.m20107d() - 11) + i12, m17337g);
                c4903b.m20110g((c4903b.m20107d() - 11) + i12, i11, m17337g);
            }
        }
    }
}
