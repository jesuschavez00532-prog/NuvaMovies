package p172i4;

import java.util.concurrent.Callable;

/* renamed from: i4.o0 */
/* loaded from: classes.dex */
final class C4881o0 extends C4885q0 {

    /* renamed from: f */
    private final Callable f20379f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C4881o0(Callable callable, AbstractC4879n0 abstractC4879n0) {
        super();
        this.f20379f = callable;
    }

    @Override // p172i4.C4885q0
    /* renamed from: a */
    final String mo20072a() {
        try {
            return (String) this.f20379f.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
