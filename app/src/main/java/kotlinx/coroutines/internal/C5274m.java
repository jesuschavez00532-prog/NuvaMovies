package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import p344te.AbstractC6948h;
import p344te.AbstractC6950j;
import p344te.InterfaceC6942b;
import ve.AbstractC7292k1;

/* renamed from: kotlinx.coroutines.internal.m */
/* loaded from: classes3.dex */
public final class C5274m {

    /* renamed from: a */
    private static final boolean f21495a = false;

    /* renamed from: b */
    public static final AbstractC7292k1 f21496b;

    /* renamed from: c */
    public static final C5274m f21497c;

    static {
        C5274m c5274m = new C5274m();
        f21497c = c5274m;
        AbstractC5281t.m21250e("kotlinx.coroutines.fast.service.loader", true);
        f21496b = c5274m.m21230a();
    }

    private C5274m() {
    }

    /* renamed from: a */
    private final AbstractC7292k1 m21230a() {
        InterfaceC6942b m26989c;
        List m26994h;
        Object next;
        AbstractC7292k1 m21234d;
        try {
            if (!f21495a) {
                m26989c = AbstractC6948h.m26989c(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator());
                m26994h = AbstractC6950j.m26994h(m26989c);
            } else {
                m26994h = C5267f.f21476a.m21192c();
            }
            Iterator it = m26994h.iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) next;
            if (mainDispatcherFactory == null || (m21234d = AbstractC5275n.m21234d(mainDispatcherFactory, m26994h)) == null) {
                return AbstractC5275n.m21232b(null, null, 3, null);
            }
            return m21234d;
        } catch (Throwable th) {
            return AbstractC5275n.m21232b(th, null, 2, null);
        }
    }
}
