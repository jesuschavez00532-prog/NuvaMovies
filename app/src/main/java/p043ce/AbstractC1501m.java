package p043ce;

import java.util.Collection;
import ne.AbstractC5868k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ce.m */
/* loaded from: classes3.dex */
public abstract class AbstractC1501m extends AbstractC1500l {
    /* renamed from: k */
    public static int m6992k(Iterable iterable, int i10) {
        AbstractC5868k.m23674f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i10;
    }
}
