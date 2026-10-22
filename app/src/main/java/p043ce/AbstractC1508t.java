package p043ce;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p344te.InterfaceC6942b;
import p359ue.AbstractC7158l;
import pe.AbstractC6291c;

/* renamed from: ce.t */
/* loaded from: classes3.dex */
public abstract class AbstractC1508t extends AbstractC1507s {

    /* renamed from: ce.t$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC6942b {

        /* renamed from: a */
        final /* synthetic */ Iterable f5681a;

        public a(Iterable iterable) {
            this.f5681a = iterable;
        }

        @Override // p344te.InterfaceC6942b
        public Iterator iterator() {
            return this.f5681a.iterator();
        }
    }

    /* renamed from: ce.t$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC5869l implements InterfaceC5660l {

        /* renamed from: a */
        final /* synthetic */ int f5682a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10) {
            super(1);
            this.f5682a = i10;
        }

        /* renamed from: a */
        public final Object m7015a(int i10) {
            throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.f5682a + '.');
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            return m7015a(((Number) obj).intValue());
        }
    }

    /* renamed from: A */
    public static List m6996A(Iterable iterable, Comparator comparator) {
        List m6948a;
        List m6999D;
        AbstractC5868k.m23674f(iterable, "<this>");
        AbstractC5868k.m23674f(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                m6999D = m6999D(iterable);
                return m6999D;
            }
            Object[] array = collection.toArray(new Object[0]);
            AbstractC1494g.m6951d(array, comparator);
            m6948a = AbstractC1494g.m6948a(array);
            return m6948a;
        }
        List m7000E = m7000E(iterable);
        AbstractC1504p.m6994m(m7000E, comparator);
        return m7000E;
    }

    /* renamed from: B */
    public static List m6997B(Iterable iterable, int i10) {
        boolean z10;
        List m6990i;
        List m6983b;
        List m6999D;
        List m6985d;
        AbstractC5868k.m23674f(iterable, "<this>");
        int i11 = 0;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 == 0) {
                m6985d = AbstractC1500l.m6985d();
                return m6985d;
            }
            if (iterable instanceof Collection) {
                if (i10 >= ((Collection) iterable).size()) {
                    m6999D = m6999D(iterable);
                    return m6999D;
                }
                if (i10 == 1) {
                    m6983b = AbstractC1499k.m6983b(m7006r(iterable));
                    return m6983b;
                }
            }
            ArrayList arrayList = new ArrayList(i10);
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            m6990i = AbstractC1500l.m6990i(arrayList);
            return m6990i;
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    /* renamed from: C */
    public static final Collection m6998C(Iterable iterable, Collection collection) {
        AbstractC5868k.m23674f(iterable, "<this>");
        AbstractC5868k.m23674f(collection, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
        return collection;
    }

    /* renamed from: D */
    public static List m6999D(Iterable iterable) {
        List m6990i;
        List m6985d;
        Object next;
        List m6983b;
        List m7001F;
        AbstractC5868k.m23674f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            m6990i = AbstractC1500l.m6990i(m7000E(iterable));
            return m6990i;
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            m6985d = AbstractC1500l.m6985d();
            return m6985d;
        }
        if (size != 1) {
            m7001F = m7001F(collection);
            return m7001F;
        }
        if (iterable instanceof List) {
            next = ((List) iterable).get(0);
        } else {
            next = iterable.iterator().next();
        }
        m6983b = AbstractC1499k.m6983b(next);
        return m6983b;
    }

    /* renamed from: E */
    public static final List m7000E(Iterable iterable) {
        List m7001F;
        AbstractC5868k.m23674f(iterable, "<this>");
        if (iterable instanceof Collection) {
            m7001F = m7001F((Collection) iterable);
            return m7001F;
        }
        return (List) m6998C(iterable, new ArrayList());
    }

    /* renamed from: F */
    public static List m7001F(Collection collection) {
        AbstractC5868k.m23674f(collection, "<this>");
        return new ArrayList(collection);
    }

    /* renamed from: G */
    public static Set m7002G(Iterable iterable) {
        Object next;
        int m6932a;
        AbstractC5868k.m23674f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    m6932a = AbstractC1485b0.m6932a(collection.size());
                    return (Set) m6998C(iterable, new LinkedHashSet(m6932a));
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                return AbstractC1493f0.m6947a(next);
            }
            return AbstractC1495g0.m6952b();
        }
        return AbstractC1495g0.m6953c((Set) m6998C(iterable, new LinkedHashSet()));
    }

    /* renamed from: o */
    public static InterfaceC6942b m7003o(Iterable iterable) {
        AbstractC5868k.m23674f(iterable, "<this>");
        return new a(iterable);
    }

    /* renamed from: p */
    public static final Object m7004p(Iterable iterable, int i10) {
        AbstractC5868k.m23674f(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).get(i10);
        }
        return m7005q(iterable, i10, new b(i10));
    }

    /* renamed from: q */
    public static final Object m7005q(Iterable iterable, int i10, InterfaceC5660l interfaceC5660l) {
        int m6987f;
        AbstractC5868k.m23674f(iterable, "<this>");
        AbstractC5868k.m23674f(interfaceC5660l, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (i10 >= 0) {
                m6987f = AbstractC1500l.m6987f(list);
                if (i10 <= m6987f) {
                    return list.get(i10);
                }
            }
            return interfaceC5660l.mo542f(Integer.valueOf(i10));
        }
        if (i10 < 0) {
            return interfaceC5660l.mo542f(Integer.valueOf(i10));
        }
        int i11 = 0;
        for (Object obj : iterable) {
            int i12 = i11 + 1;
            if (i10 == i11) {
                return obj;
            }
            i11 = i12;
        }
        return interfaceC5660l.mo542f(Integer.valueOf(i10));
    }

    /* renamed from: r */
    public static final Object m7006r(Iterable iterable) {
        AbstractC5868k.m23674f(iterable, "<this>");
        if (iterable instanceof List) {
            return m7007s((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: s */
    public static final Object m7007s(List list) {
        AbstractC5868k.m23674f(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: t */
    public static Object m7008t(List list, int i10) {
        int m6987f;
        AbstractC5868k.m23674f(list, "<this>");
        if (i10 >= 0) {
            m6987f = AbstractC1500l.m6987f(list);
            if (i10 <= m6987f) {
                return list.get(i10);
            }
        }
        return null;
    }

    /* renamed from: u */
    public static final Appendable m7009u(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC5660l interfaceC5660l) {
        AbstractC5868k.m23674f(iterable, "<this>");
        AbstractC5868k.m23674f(appendable, "buffer");
        AbstractC5868k.m23674f(charSequence, "separator");
        AbstractC5868k.m23674f(charSequence2, "prefix");
        AbstractC5868k.m23674f(charSequence3, "postfix");
        AbstractC5868k.m23674f(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i11 = 0;
        for (Object obj : iterable) {
            i11++;
            if (i11 > 1) {
                appendable.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            AbstractC7158l.m27714a(appendable, obj, interfaceC5660l);
        }
        if (i10 >= 0 && i11 > i10) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    /* renamed from: v */
    public static final String m7010v(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC5660l interfaceC5660l) {
        AbstractC5868k.m23674f(iterable, "<this>");
        AbstractC5868k.m23674f(charSequence, "separator");
        AbstractC5868k.m23674f(charSequence2, "prefix");
        AbstractC5868k.m23674f(charSequence3, "postfix");
        AbstractC5868k.m23674f(charSequence4, "truncated");
        String sb2 = ((StringBuilder) m7009u(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, interfaceC5660l)).toString();
        AbstractC5868k.m23673e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: w */
    public static /* synthetic */ String m7011w(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC5660l interfaceC5660l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        int i12 = (i11 & 8) != 0 ? -1 : i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            interfaceC5660l = null;
        }
        return m7010v(iterable, charSequence, charSequence5, charSequence6, i12, charSequence7, interfaceC5660l);
    }

    /* renamed from: x */
    public static Object m7012x(Collection collection, AbstractC6291c abstractC6291c) {
        AbstractC5868k.m23674f(collection, "<this>");
        AbstractC5868k.m23674f(abstractC6291c, "random");
        if (!collection.isEmpty()) {
            return m7004p(collection, abstractC6291c.mo25032c(collection.size()));
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: y */
    public static Object m7013y(Iterable iterable) {
        AbstractC5868k.m23674f(iterable, "<this>");
        if (iterable instanceof List) {
            return m7014z((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: z */
    public static final Object m7014z(List list) {
        AbstractC5868k.m23674f(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }
}
