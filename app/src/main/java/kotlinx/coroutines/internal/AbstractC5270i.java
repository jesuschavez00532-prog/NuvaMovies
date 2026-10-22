package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.i */
/* loaded from: classes3.dex */
public abstract class AbstractC5270i {

    /* renamed from: a */
    private static final Object f21478a = new C5280s("CONDITION_FALSE");

    /* renamed from: b */
    private static final Object f21479b = new C5280s("LIST_EMPTY");

    /* renamed from: a */
    public static final Object m21196a() {
        return f21478a;
    }

    /* renamed from: b */
    public static final C5271j m21197b(Object obj) {
        Object obj2;
        C5271j c5271j;
        if (!(obj instanceof C5278q)) {
            obj2 = null;
        } else {
            obj2 = obj;
        }
        C5278q c5278q = (C5278q) obj2;
        if (c5278q == null || (c5271j = c5278q.f21501a) == null) {
            if (obj != null) {
                return (C5271j) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        }
        return c5271j;
    }
}
