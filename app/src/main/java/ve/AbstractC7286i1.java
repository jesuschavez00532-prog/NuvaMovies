package ve;

import kotlinx.coroutines.internal.C5280s;

/* renamed from: ve.i1 */
/* loaded from: classes3.dex */
public abstract class AbstractC7286i1 {

    /* renamed from: a */
    private static final C5280s f27181a = new C5280s("COMPLETING_ALREADY");

    /* renamed from: b */
    public static final C5280s f27182b = new C5280s("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c */
    private static final C5280s f27183c = new C5280s("COMPLETING_RETRY");

    /* renamed from: d */
    private static final C5280s f27184d = new C5280s("TOO_LATE_TO_CANCEL");

    /* renamed from: e */
    private static final C5280s f27185e = new C5280s("SEALED");

    /* renamed from: f */
    private static final C7306p0 f27186f = new C7306p0(false);

    /* renamed from: g */
    private static final C7306p0 f27187g = new C7306p0(true);

    /* renamed from: g */
    public static final Object m28236g(Object obj) {
        if (obj instanceof InterfaceC7333y0) {
            return new C7335z0((InterfaceC7333y0) obj);
        }
        return obj;
    }

    /* renamed from: h */
    public static final Object m28237h(Object obj) {
        Object obj2 = null;
        InterfaceC7333y0 interfaceC7333y0;
        if (!(obj instanceof C7335z0)) {
            obj2 = null;
        } else {
            obj2 = obj;
        }
        C7335z0 c7335z0 = (C7335z0) obj2;
        if (c7335z0 != null && (interfaceC7333y0 = c7335z0.f27240a) != null) {
            return interfaceC7333y0;
        }
        return obj;
    }
}
