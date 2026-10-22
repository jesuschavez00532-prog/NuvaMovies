package p043ce;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import ne.AbstractC5868k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ce.g */
/* loaded from: classes3.dex */
public abstract class AbstractC1494g extends AbstractC1492f {
    /* renamed from: a */
    public static List m6948a(Object[] objArr) {
        AbstractC5868k.m23674f(objArr, "<this>");
        List m6958a = AbstractC1497i.m6958a(objArr);
        AbstractC5868k.m23673e(m6958a, "asList(this)");
        return m6958a;
    }

    /* renamed from: b */
    public static final Object[] m6949b(Object[] objArr, Object[] objArr2, int i10, int i11, int i12) {
        AbstractC5868k.m23674f(objArr, "<this>");
        AbstractC5868k.m23674f(objArr2, "destination");
        System.arraycopy(objArr, i11, objArr2, i10, i12 - i11);
        return objArr2;
    }

    /* renamed from: c */
    public static /* synthetic */ Object[] m6950c(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return m6949b(objArr, objArr2, i10, i11, i12);
    }

    /* renamed from: d */
    public static final void m6951d(Object[] objArr, Comparator comparator) {
        AbstractC5868k.m23674f(objArr, "<this>");
        AbstractC5868k.m23674f(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }
}
