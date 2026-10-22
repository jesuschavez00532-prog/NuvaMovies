package p043ce;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import ne.AbstractC5868k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ce.k */
/* loaded from: classes3.dex */
public abstract class AbstractC1499k {
    /* renamed from: a */
    public static final Object[] m6982a(Object[] objArr, boolean z10) {
        AbstractC5868k.m23674f(objArr, "<this>");
        if (!z10 || !AbstractC5868k.m23669a(objArr.getClass(), Object[].class)) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
            AbstractC5868k.m23673e(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
            return copyOf;
        }
        return objArr;
    }

    /* renamed from: b */
    public static List m6983b(Object obj) {
        List singletonList = Collections.singletonList(obj);
        AbstractC5868k.m23673e(singletonList, "singletonList(element)");
        return singletonList;
    }
}
