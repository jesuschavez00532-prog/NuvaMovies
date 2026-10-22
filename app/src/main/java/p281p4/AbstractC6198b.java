package p281p4;

import java.lang.reflect.Array;
import java.util.Arrays;
import p219l4.AbstractC5388m;

/* renamed from: p4.b */
/* loaded from: classes.dex */
public abstract class AbstractC6198b {
    /* renamed from: a */
    public static Object[] m24743a(Object[]... objArr) {
        if (objArr.length != 0) {
            int i10 = 0;
            for (Object[] objArr2 : objArr) {
                i10 += objArr2.length;
            }
            Object[] copyOf = Arrays.copyOf(objArr[0], i10);
            int length = objArr[0].length;
            for (int i11 = 1; i11 < objArr.length; i11++) {
                Object[] objArr3 = objArr[i11];
                int length2 = objArr3.length;
                System.arraycopy(objArr3, 0, copyOf, length, length2);
                length += length2;
            }
            return copyOf;
        }
        return (Object[]) Array.newInstance(objArr.getClass(), 0);
    }

    /* renamed from: b */
    public static boolean m24744b(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m24745c(Object[] objArr, Object obj) {
        int i10;
        if (objArr != null) {
            i10 = objArr.length;
        } else {
            i10 = 0;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            if (AbstractC5388m.m21771a(objArr[i11], obj)) {
                if (i11 >= 0) {
                    return true;
                }
            } else {
                i11++;
            }
        }
        return false;
    }
}
