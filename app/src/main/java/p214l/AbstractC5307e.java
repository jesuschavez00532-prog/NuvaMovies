package p214l;

/* renamed from: l.e */
/* loaded from: classes.dex */
abstract class AbstractC5307e {

    /* renamed from: a */
    static final int[] f21596a = new int[0];

    /* renamed from: b */
    static final long[] f21597b = new long[0];

    /* renamed from: c */
    static final Object[] f21598c = new Object[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m21383a(int[] iArr, int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else if (i15 > i11) {
                i12 = i14 - 1;
            } else {
                return i14;
            }
        }
        return i13 ^ (-1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m21384b(long[] jArr, int i10, long j10) {
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            long j11 = jArr[i13];
            if (j11 < j10) {
                i12 = i13 + 1;
            } else if (j11 > j10) {
                i11 = i13 - 1;
            } else {
                return i13;
            }
        }
        return i12 ^ (-1);
    }

    /* renamed from: c */
    public static boolean m21385c(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static int m21386d(int i10) {
        for (int i11 = 4; i11 < 32; i11++) {
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                return i12;
            }
        }
        return i10;
    }

    /* renamed from: e */
    public static int m21387e(int i10) {
        return m21386d(i10 * 4) / 4;
    }

    /* renamed from: f */
    public static int m21388f(int i10) {
        return m21386d(i10 * 8) / 8;
    }
}
