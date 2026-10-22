package p043ce;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import ne.AbstractC5868k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ce.p */
/* loaded from: classes3.dex */
public abstract class AbstractC1504p extends AbstractC1503o {
    /* renamed from: l */
    public static void m6993l(List list) {
        AbstractC5868k.m23674f(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    /* renamed from: m */
    public static void m6994m(List list, Comparator comparator) {
        AbstractC5868k.m23674f(list, "<this>");
        AbstractC5868k.m23674f(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
