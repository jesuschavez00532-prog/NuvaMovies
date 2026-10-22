package p043ce;

import java.util.Set;
import ne.AbstractC5868k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ce.g0 */
/* loaded from: classes3.dex */
public abstract class AbstractC1495g0 extends AbstractC1493f0 {
    /* renamed from: b */
    public static final Set m6952b() {
        return C1512x.f5686a;
    }

    /* renamed from: c */
    public static final Set m6953c(Set set) {
        AbstractC5868k.m23674f(set, "<this>");
        int size = set.size();
        if (size != 0) {
            if (size == 1) {
                return AbstractC1493f0.m6947a(set.iterator().next());
            }
            return set;
        }
        return m6952b();
    }
}
