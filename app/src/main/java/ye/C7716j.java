package ye;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ye.j */
/* loaded from: classes3.dex */
final class C7716j {

    /* renamed from: d */
    private static final List f28375d = new ArrayList();

    /* renamed from: a */
    Object f28376a;

    /* renamed from: b */
    C7723q f28377b;

    /* renamed from: c */
    C7716j f28378c;

    private C7716j(Object obj, C7723q c7723q) {
        this.f28376a = obj;
        this.f28377b = c7723q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C7716j m29820a(C7723q c7723q, Object obj) {
        List list = f28375d;
        synchronized (list) {
            int size = list.size();
            if (size > 0) {
                C7716j c7716j = (C7716j) list.remove(size - 1);
                c7716j.f28376a = obj;
                c7716j.f28377b = c7723q;
                c7716j.f28378c = null;
                return c7716j;
            }
            return new C7716j(obj, c7723q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m29821b(C7716j c7716j) {
        c7716j.f28376a = null;
        c7716j.f28377b = null;
        c7716j.f28378c = null;
        List list = f28375d;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(c7716j);
            }
        }
    }
}
