package p302qc;

import be.C1328x;
import com.therouter.router.RouteItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import me.InterfaceC5660l;
import me.InterfaceC5664p;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import tc.C6932b;

/* renamed from: qc.e */
/* loaded from: classes3.dex */
public abstract class AbstractC6450e {

    /* renamed from: a */
    private static final LinkedList f24811a = new LinkedList();

    /* renamed from: b */
    private static final HashMap f24812b = new HashMap();

    /* renamed from: c */
    private static final List f24813c = new ArrayList();

    /* renamed from: d */
    private static final List f24814d = new ArrayList();

    /* renamed from: e */
    private static final List f24815e = new ArrayList();

    /* renamed from: f */
    private static C6932b f24816f = new C6932b();

    /* renamed from: g */
    private static InterfaceC5664p f24817g = a.f24818a;

    /* renamed from: qc.e$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC5869l implements InterfaceC5664p {

        /* renamed from: a */
        public static final a f24818a = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final void m25271a(RouteItem routeItem, InterfaceC5660l interfaceC5660l) {
            AbstractC5868k.m23674f(routeItem, "route");
            AbstractC5868k.m23674f(interfaceC5660l, "callback");
            interfaceC5660l.mo542f(routeItem);
        }

        @Override // me.InterfaceC5664p
        /* renamed from: h */
        public /* bridge */ /* synthetic */ Object mo2391h(Object obj, Object obj2) {
            m25271a((RouteItem) obj, (InterfaceC5660l) obj2);
            return C1328x.f4998a;
        }
    }

    /* renamed from: g */
    public static final HashMap m25269g() {
        return f24812b;
    }

    /* renamed from: h */
    public static final void m25270h() {
        Iterator it = f24811a.iterator();
        while (it.hasNext()) {
            ((C6451f) it.next()).m25272a().invoke();
        }
        f24811a.clear();
    }
}
