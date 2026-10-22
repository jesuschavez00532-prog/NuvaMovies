package re;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: re.f */
/* loaded from: classes3.dex */
public abstract class AbstractC6578f extends AbstractC6577e {
    /* renamed from: a */
    public static int m25673a(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    /* renamed from: b */
    public static long m25674b(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    /* renamed from: c */
    public static int m25675c(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    /* renamed from: d */
    public static long m25676d(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    /* renamed from: e */
    public static int m25677e(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i10 < i11) {
                return i11;
            }
            if (i10 > i12) {
                return i12;
            }
            return i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    /* renamed from: f */
    public static C6573a m25678f(int i10, int i11) {
        return C6573a.f25191d.m25660a(i10, i11, -1);
    }

    /* renamed from: g */
    public static C6575c m25679g(int i10, int i11) {
        if (i11 <= Integer.MIN_VALUE) {
            return C6575c.f25199e.m25665a();
        }
        return new C6575c(i10, i11 - 1);
    }
}
