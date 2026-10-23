package p043ce;

import java.util.Collection;
import java.util.Iterator;
import me.InterfaceC5660l;
import ne.AbstractC5863f;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p269oe.InterfaceC5974a;

/* renamed from: ce.a */
/* loaded from: classes3.dex */
public abstract class AbstractC1482a implements Collection, InterfaceC5974a {

    /* renamed from: ce.a$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC5869l implements InterfaceC5660l {
        a() {
            super(1);
        }

        @Override // me.InterfaceC5660l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo542f(Object obj) {
            if (obj == AbstractC1482a.this) {
                return "(this Collection)";
            }
            return String.valueOf(obj);
        }
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: c */
    public abstract int mo6923c();

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (AbstractC5868k.m23669a(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        AbstractC5868k.m23674f(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return mo6923c();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return AbstractC5863f.m23667a(this);
    }

    public String toString() {
        String m7011w = null;
        m7011w = AbstractC1508t.m7011w(this, ", ", "[", "]", 0, null, new a(), 24, null);
        return m7011w;
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        AbstractC5868k.m23674f(objArr, "array");
        return AbstractC5863f.m23668b(this, objArr);
    }
}
