package ve;

import kotlinx.coroutines.internal.C5280s;

/* renamed from: ve.u0 */
/* loaded from: classes3.dex */
public abstract class AbstractC7321u0 {

    /* renamed from: a */
    private static final C5280s f27228a = new C5280s("REMOVED_TASK");

    /* renamed from: b */
    private static final C5280s f27229b = new C5280s("CLOSED_EMPTY");

    /* renamed from: c */
    public static final long m28302c(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j10;
    }
}
