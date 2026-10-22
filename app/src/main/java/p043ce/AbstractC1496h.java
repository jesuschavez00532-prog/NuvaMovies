package p043ce;

import java.util.NoSuchElementException;
import ne.AbstractC5868k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ce.h */
/* loaded from: classes3.dex */
public abstract class AbstractC1496h extends AbstractC1494g {
    /* renamed from: e */
    public static final boolean m6954e(Object[] objArr, Object obj) {
        AbstractC5868k.m23674f(objArr, "<this>");
        if (m6955f(objArr, obj) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final int m6955f(Object[] objArr, Object obj) {
        AbstractC5868k.m23674f(objArr, "<this>");
        int i10 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i10 < length2) {
            if (AbstractC5868k.m23669a(obj, objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* renamed from: g */
    public static char m6956g(char[] cArr) {
        AbstractC5868k.m23674f(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: h */
    public static Object m6957h(Object[] objArr) {
        AbstractC5868k.m23674f(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }
}
