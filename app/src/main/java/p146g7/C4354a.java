package p146g7;

import java.util.Map;
import p098d7.EnumC3961a;
import p098d7.EnumC3962b;
import p114e7.C4140b;
import p158h7.EnumC4561a;
import p175i7.AbstractC4904c;
import p175i7.C4903b;
import p175i7.C4907f;

/* renamed from: g7.a */
/* loaded from: classes.dex */
public final class C4354a {
    /* renamed from: b */
    private static C4140b m18277b(C4907f c4907f, int i10, int i11, int i12) throws p098d7.C3963c {
        C4903b m20161a = c4907f.m20161a();
        if (m20161a != null) {
            int m20108e = m20161a.m20108e();
            int m20107d = m20161a.m20107d();
            int i13 = i12 << 1;
            int i14 = m20108e + i13;
            int i15 = i13 + m20107d;
            int max = Math.max(i10, i14);
            int max2 = Math.max(i11, i15);
            int min = Math.min(max / i14, max2 / i15);
            int i16 = (max - (m20108e * min)) / 2;
            int i17 = (max2 - (m20107d * min)) / 2;
            C4140b c4140b = new C4140b(max, max2);
            int i18 = 0;
            while (i18 < m20107d) {
                int i19 = i16;
                int i20 = 0;
                while (i20 < m20108e) {
                    if (m20161a.m20105b(i20, i18) == 1) {
                        c4140b.m17347g(i19, i17, min, min);
                    }
                    i20++;
                    i19 += min;
                }
                i18++;
                i17 += min;
            }
            return c4140b;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public C4140b m18278a(String str, EnumC3961a enumC3961a, int i10, int i11, Map map) throws p098d7.C3963c {
        if (!str.isEmpty()) {
            if (enumC3961a == EnumC3961a.QR_CODE) {
                if (i10 >= 0 && i11 >= 0) {
                    EnumC4561a enumC4561a = EnumC4561a.L;
                    int i12 = 4;
                    if (map != null) {
                        EnumC3962b enumC3962b = EnumC3962b.ERROR_CORRECTION;
                        if (map.containsKey(enumC3962b)) {
                            enumC4561a = EnumC4561a.valueOf(map.get(enumC3962b).toString());
                        }
                        EnumC3962b enumC3962b2 = EnumC3962b.MARGIN;
                        if (map.containsKey(enumC3962b2)) {
                            i12 = Integer.parseInt(map.get(enumC3962b2).toString());
                        }
                    }
                    return m18277b(AbstractC4904c.m20124n(str, enumC4561a, map), i10, i11, i12);
                }
                throw new IllegalArgumentException("Requested dimensions are too small: " + i10 + 'x' + i11);
            }
            throw new IllegalArgumentException("Can only encode QR_CODE, but got " + enumC3961a);
        }
        throw new IllegalArgumentException("Found empty contents");
    }
}
