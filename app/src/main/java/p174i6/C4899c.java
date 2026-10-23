package p174i6;

import java.util.HashMap;

/* renamed from: i6.c */
/* loaded from: classes.dex */
public class C4899c implements InterfaceC4900d {

    /* renamed from: a */
    private final int f20409a;

    public C4899c(int i10) {
        this.f20409a = i10;
    }

    /* renamed from: b */
    private static boolean m20100b(StackTraceElement[] stackTraceElementArr, int i10, int i11) {
        int i12 = i11 - i10;
        if (i11 + i12 > stackTraceElementArr.length) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!stackTraceElementArr[i10 + i13].equals(stackTraceElementArr[i11 + i13])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static StackTraceElement[] m20101c(StackTraceElement[] stackTraceElementArr, int i10) {
        int i11 = 0;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i12 = 0;
        int i13 = 0;
        int i14 = 1;
        while (i12 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i12];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null && m20100b(stackTraceElementArr, num.intValue(), i12)) {
                int intValue = i12 - num.intValue();
                if (i14 < i10) {
                    System.arraycopy(stackTraceElementArr, i12, stackTraceElementArr2, i13, intValue);
                    i13 += intValue;
                    i14++;
                }
                i11 = (intValue - 1) + i12;
            } else {
                stackTraceElementArr2[i13] = stackTraceElementArr[i12];
                i13++;
                i11 = i12;
                i14 = 1;
            }
            hashMap.put(stackTraceElement, Integer.valueOf(i12));
            i12 = i11 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i13];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i13);
        return stackTraceElementArr3;
    }

    @Override // p174i6.InterfaceC4900d
    /* renamed from: a */
    public StackTraceElement[] mo20099a(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] m20101c = m20101c(stackTraceElementArr, this.f20409a);
        if (m20101c.length < stackTraceElementArr.length) {
            return m20101c;
        }
        return stackTraceElementArr;
    }
}
