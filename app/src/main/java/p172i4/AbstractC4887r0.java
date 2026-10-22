package p172i4;

/* renamed from: i4.r0 */
/* loaded from: classes.dex */
abstract class AbstractC4887r0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m20096a(int i10) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i11 = 0; i11 < 6; i11++) {
            int i12 = iArr[i11];
            int i13 = i12 - 1;
            if (i12 != 0) {
                if (i13 == i10) {
                    return i12;
                }
            } else {
                throw null;
            }
        }
        return 1;
    }
}
