package ve;

/* renamed from: ve.k1 */
/* loaded from: classes3.dex */
public abstract class AbstractC7292k1 extends AbstractC7329x {
    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public final String m28244A() {
        AbstractC7292k1 abstractC7292k1;
        AbstractC7292k1 m28253c = C7297m0.m28253c();
        if (this == m28253c) {
            return "Dispatchers.Main";
        }
        try {
            abstractC7292k1 = m28253c.mo21241z();
        } catch (UnsupportedOperationException unused) {
            abstractC7292k1 = null;
        }
        if (this != abstractC7292k1) {
            return null;
        }
        return "Dispatchers.Main.immediate";
    }

    /* renamed from: z */
    public abstract AbstractC7292k1 mo21241z();
}
