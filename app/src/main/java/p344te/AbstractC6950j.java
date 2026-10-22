package p344te;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import p043ce.AbstractC1500l;
import p269oe.InterfaceC5974a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: te.j */
/* loaded from: classes3.dex */
public abstract class AbstractC6950j extends AbstractC6949i {

    /* renamed from: te.j$a */
    /* loaded from: classes3.dex */
    public static final class a implements Iterable, InterfaceC5974a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6942b f26318a;

        public a(InterfaceC6942b interfaceC6942b) {
            this.f26318a = interfaceC6942b;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f26318a.iterator();
        }
    }

    /* renamed from: e */
    public static Iterable m26991e(InterfaceC6942b interfaceC6942b) {
        AbstractC5868k.m23674f(interfaceC6942b, "<this>");
        return new a(interfaceC6942b);
    }

    /* renamed from: f */
    public static InterfaceC6942b m26992f(InterfaceC6942b interfaceC6942b, InterfaceC5660l interfaceC5660l) {
        AbstractC5868k.m23674f(interfaceC6942b, "<this>");
        AbstractC5868k.m23674f(interfaceC5660l, "transform");
        return new C6951k(interfaceC6942b, interfaceC5660l);
    }

    /* renamed from: g */
    public static final Collection m26993g(InterfaceC6942b interfaceC6942b, Collection collection) {
        AbstractC5868k.m23674f(interfaceC6942b, "<this>");
        AbstractC5868k.m23674f(collection, "destination");
        Iterator it = interfaceC6942b.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
        return collection;
    }

    /* renamed from: h */
    public static List m26994h(InterfaceC6942b interfaceC6942b) {
        List m6990i;
        AbstractC5868k.m23674f(interfaceC6942b, "<this>");
        m6990i = AbstractC1500l.m6990i(m26995i(interfaceC6942b));
        return m6990i;
    }

    /* renamed from: i */
    public static final List m26995i(InterfaceC6942b interfaceC6942b) {
        AbstractC5868k.m23674f(interfaceC6942b, "<this>");
        return (List) m26993g(interfaceC6942b, new ArrayList());
    }
}
