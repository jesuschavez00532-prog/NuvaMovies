package p043ce;

import java.util.Collection;
import java.util.Iterator;
import ne.AbstractC5868k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ce.q */
/* loaded from: classes3.dex */
public abstract class AbstractC1505q extends AbstractC1504p {
    /* renamed from: n */
    public static boolean m6995n(Collection collection, Iterable iterable) {
        AbstractC5868k.m23674f(collection, "<this>");
        AbstractC5868k.m23674f(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }
}
