package p165he;

/* renamed from: he.c */
/* loaded from: classes3.dex */
public abstract class AbstractC4820c {
    /* renamed from: a */
    private static final int m19907a(int i10, int i11, int i12) {
        return m19909c(m19909c(i10, i12) - m19909c(i11, i12), i12);
    }

    /* renamed from: b */
    public static final int m19908b(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (i10 < i11) {
                return i11 - m19907a(i11, i10, i12);
            }
            return i11;
        }
        if (i12 < 0) {
            if (i10 > i11) {
                return i11 + m19907a(i10, i11, -i12);
            }
            return i11;
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* renamed from: c */
    private static final int m19909c(int i10, int i11) {
        int i12 = i10 % i11;
        if (i12 < 0) {
            return i12 + i11;
        }
        return i12;
    }
}
