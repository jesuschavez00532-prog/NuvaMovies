package p214l;

import com.raizlabs.android.dbflow.sql.language.Operator;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l.h */
/* loaded from: classes.dex */
public abstract class AbstractC5310h {

    /* renamed from: a */
    b f21612a;

    /* renamed from: b */
    c f21613b;

    /* renamed from: c */
    e f21614c;

    /* renamed from: l.h$a */
    /* loaded from: classes.dex */
    final class a implements Iterator {

        /* renamed from: a */
        final int f21615a;

        /* renamed from: b */
        int f21616b;

        /* renamed from: c */
        int f21617c;

        /* renamed from: d */
        boolean f21618d = false;

        a(int i10) {
            this.f21615a = i10;
            this.f21616b = AbstractC5310h.this.mo21354d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f21617c < this.f21616b) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                Object mo21352b = AbstractC5310h.this.mo21352b(this.f21617c, this.f21615a);
                this.f21617c++;
                this.f21618d = true;
                return mo21352b;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f21618d) {
                int i10 = this.f21617c - 1;
                this.f21617c = i10;
                this.f21616b--;
                this.f21618d = false;
                AbstractC5310h.this.mo21358h(i10);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: l.h$b */
    /* loaded from: classes.dex */
    final class b implements Set {
        b() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            int mo21354d = AbstractC5310h.this.mo21354d();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                AbstractC5310h.this.mo21357g(entry.getKey(), entry.getValue());
            }
            if (mo21354d != AbstractC5310h.this.mo21354d()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC5310h.this.mo21351a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int mo21355e = AbstractC5310h.this.mo21355e(entry.getKey());
            if (mo21355e < 0) {
                return false;
            }
            return AbstractC5307e.m21385c(AbstractC5310h.this.mo21352b(mo21355e, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC5310h.m21416k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int hashCode;
            int hashCode2;
            int i10 = 0;
            for (int mo21354d = AbstractC5310h.this.mo21354d() - 1; mo21354d >= 0; mo21354d--) {
                Object mo21352b = AbstractC5310h.this.mo21352b(mo21354d, 0);
                Object mo21352b2 = AbstractC5310h.this.mo21352b(mo21354d, 1);
                if (mo21352b == null) {
                    hashCode = 0;
                } else {
                    hashCode = mo21352b.hashCode();
                }
                if (mo21352b2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = mo21352b2.hashCode();
                }
                i10 += hashCode ^ hashCode2;
            }
            return i10;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            if (AbstractC5310h.this.mo21354d() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC5310h.this.mo21354d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: l.h$c */
    /* loaded from: classes.dex */
    final class c implements Set {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC5310h.this.mo21351a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (AbstractC5310h.this.mo21355e(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return AbstractC5310h.m21415j(AbstractC5310h.this.mo21353c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC5310h.m21416k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int hashCode;
            int i10 = 0;
            for (int mo21354d = AbstractC5310h.this.mo21354d() - 1; mo21354d >= 0; mo21354d--) {
                Object mo21352b = AbstractC5310h.this.mo21352b(mo21354d, 0);
                if (mo21352b == null) {
                    hashCode = 0;
                } else {
                    hashCode = mo21352b.hashCode();
                }
                i10 += hashCode;
            }
            return i10;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            if (AbstractC5310h.this.mo21354d() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int mo21355e = AbstractC5310h.this.mo21355e(obj);
            if (mo21355e >= 0) {
                AbstractC5310h.this.mo21358h(mo21355e);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return AbstractC5310h.m21417o(AbstractC5310h.this.mo21353c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return AbstractC5310h.m21418p(AbstractC5310h.this.mo21353c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC5310h.this.mo21354d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return AbstractC5310h.this.m21422q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC5310h.this.m21423r(objArr, 0);
        }
    }

    /* renamed from: l.h$d */
    /* loaded from: classes.dex */
    final class d implements Iterator, Map.Entry {

        /* renamed from: a */
        int f21622a;

        /* renamed from: c */
        boolean f21624c = false;

        /* renamed from: b */
        int f21623b = -1;

        d() {
            this.f21622a = AbstractC5310h.this.mo21354d() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (hasNext()) {
                this.f21623b++;
                this.f21624c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this.f21624c) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!AbstractC5307e.m21385c(entry.getKey(), AbstractC5310h.this.mo21352b(this.f21623b, 0)) || !AbstractC5307e.m21385c(entry.getValue(), AbstractC5310h.this.mo21352b(this.f21623b, 1))) {
                    return false;
                }
                return true;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f21624c) {
                return AbstractC5310h.this.mo21352b(this.f21623b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f21624c) {
                return AbstractC5310h.this.mo21352b(this.f21623b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f21623b < this.f21622a) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            if (this.f21624c) {
                int i10 = 0;
                Object mo21352b = AbstractC5310h.this.mo21352b(this.f21623b, 0);
                Object mo21352b2 = AbstractC5310h.this.mo21352b(this.f21623b, 1);
                if (mo21352b == null) {
                    hashCode = 0;
                } else {
                    hashCode = mo21352b.hashCode();
                }
                if (mo21352b2 != null) {
                    i10 = mo21352b2.hashCode();
                }
                return hashCode ^ i10;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f21624c) {
                AbstractC5310h.this.mo21358h(this.f21623b);
                this.f21623b--;
                this.f21622a--;
                this.f21624c = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.f21624c) {
                return AbstractC5310h.this.mo21359i(this.f21623b, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + Operator.Operation.EQUALS + getValue();
        }
    }

    /* renamed from: l.h$e */
    /* loaded from: classes.dex */
    final class e implements Collection {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            AbstractC5310h.this.mo21351a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            if (AbstractC5310h.this.mo21356f(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
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
            if (AbstractC5310h.this.mo21354d() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int mo21356f = AbstractC5310h.this.mo21356f(obj);
            if (mo21356f >= 0) {
                AbstractC5310h.this.mo21358h(mo21356f);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int mo21354d = AbstractC5310h.this.mo21354d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < mo21354d) {
                if (collection.contains(AbstractC5310h.this.mo21352b(i10, 1))) {
                    AbstractC5310h.this.mo21358h(i10);
                    i10--;
                    mo21354d--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int mo21354d = AbstractC5310h.this.mo21354d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < mo21354d) {
                if (!collection.contains(AbstractC5310h.this.mo21352b(i10, 1))) {
                    AbstractC5310h.this.mo21358h(i10);
                    i10--;
                    mo21354d--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public int size() {
            return AbstractC5310h.this.mo21354d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC5310h.this.m21422q(1);
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC5310h.this.m21423r(objArr, 1);
        }
    }

    /* renamed from: j */
    public static boolean m21415j(Map map, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m21416k(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: o */
    public static boolean m21417o(Map map, Collection collection) {
        int size = map.size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static boolean m21418p(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    protected abstract void mo21351a();

    /* renamed from: b */
    protected abstract Object mo21352b(int i10, int i11);

    /* renamed from: c */
    protected abstract Map mo21353c();

    /* renamed from: d */
    protected abstract int mo21354d();

    /* renamed from: e */
    protected abstract int mo21355e(Object obj);

    /* renamed from: f */
    protected abstract int mo21356f(Object obj);

    /* renamed from: g */
    protected abstract void mo21357g(Object obj, Object obj2);

    /* renamed from: h */
    protected abstract void mo21358h(int i10);

    /* renamed from: i */
    protected abstract Object mo21359i(int i10, Object obj);

    /* renamed from: l */
    public Set m21419l() {
        if (this.f21612a == null) {
            this.f21612a = new b();
        }
        return this.f21612a;
    }

    /* renamed from: m */
    public Set m21420m() {
        if (this.f21613b == null) {
            this.f21613b = new c();
        }
        return this.f21613b;
    }

    /* renamed from: n */
    public Collection m21421n() {
        if (this.f21614c == null) {
            this.f21614c = new e();
        }
        return this.f21614c;
    }

    /* renamed from: q */
    public Object[] m21422q(int i10) {
        int mo21354d = mo21354d();
        Object[] objArr = new Object[mo21354d];
        for (int i11 = 0; i11 < mo21354d; i11++) {
            objArr[i11] = mo21352b(i11, i10);
        }
        return objArr;
    }

    /* renamed from: r */
    public Object[] m21423r(Object[] objArr, int i10) {
        int mo21354d = mo21354d();
        if (objArr.length < mo21354d) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), mo21354d);
        }
        for (int i11 = 0; i11 < mo21354d; i11++) {
            objArr[i11] = mo21352b(i11, i10);
        }
        if (objArr.length > mo21354d) {
            objArr[mo21354d] = null;
        }
        return objArr;
    }
}
