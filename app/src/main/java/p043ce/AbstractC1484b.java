package p043ce;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.umeng.analytics.pro.C3325bt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import ne.AbstractC5864g;
import ne.AbstractC5868k;
import p269oe.InterfaceC5974a;

/* renamed from: ce.b */
/* loaded from: classes3.dex */
public abstract class AbstractC1484b extends AbstractC1482a implements List {

    /* renamed from: a */
    public static final a f5672a = new a(null);

    /* renamed from: ce.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC5864g abstractC5864g) {
            this();
        }

        /* renamed from: a */
        public final void m6925a(int i10, int i11) {
            if (i10 >= 0 && i10 < i11) {
                return;
            }
            throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
        }

        /* renamed from: b */
        public final void m6926b(int i10, int i11) {
            if (i10 >= 0 && i10 <= i11) {
                return;
            }
            throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
        }

        /* renamed from: c */
        public final void m6927c(int i10, int i11, int i12) {
            if (i10 >= 0 && i11 <= i12) {
                if (i10 <= i11) {
                    return;
                }
                throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
            }
            throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
        }

        /* renamed from: d */
        public final boolean m6928d(Collection collection, Collection collection2) {
            AbstractC5868k.m23674f(collection, C3325bt.f14194aL);
            AbstractC5868k.m23674f(collection2, DispatchConstants.OTHER);
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator it = collection2.iterator();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!AbstractC5868k.m23669a(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: e */
        public final int m6929e(Collection collection) {
            int i10 = 0;
            AbstractC5868k.m23674f(collection, C3325bt.f14194aL);
            int i11 = 1;
            for (Object obj : collection) {
                int i12 = i11 * 31;
                if (obj != null) {
                    i10 = obj.hashCode();
                } else {
                    i10 = 0;
                }
                i11 = i12 + i10;
            }
            return i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ce.b$b */
    /* loaded from: classes3.dex */
    public class b implements Iterator, InterfaceC5974a {

        /* renamed from: a */
        private int f5673a;

        public b() {
        }

        /* renamed from: b */
        protected final int m6930b() {
            return this.f5673a;
        }

        /* renamed from: c */
        protected final void m6931c(int i10) {
            this.f5673a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f5673a < AbstractC1484b.this.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                AbstractC1484b abstractC1484b = AbstractC1484b.this;
                int i10 = this.f5673a;
                this.f5673a = i10 + 1;
                return abstractC1484b.get(i10);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: ce.b$c */
    /* loaded from: classes3.dex */
    private class c extends b implements ListIterator {
        public c(int i10) {
            super();
            AbstractC1484b.f5672a.m6926b(i10, AbstractC1484b.this.size());
            m6931c(i10);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (m6930b() > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return m6930b();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (hasPrevious()) {
                AbstractC1484b abstractC1484b = AbstractC1484b.this;
                m6931c(m6930b() - 1);
                return abstractC1484b.get(m6930b());
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return m6930b() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: ce.b$d */
    /* loaded from: classes3.dex */
    private static final class d extends AbstractC1484b implements RandomAccess {

        /* renamed from: b */
        private final AbstractC1484b f5676b;

        /* renamed from: c */
        private final int f5677c;

        /* renamed from: d */
        private int f5678d;

        public d(AbstractC1484b abstractC1484b, int i10, int i11) {
            AbstractC5868k.m23674f(abstractC1484b, "list");
            this.f5676b = abstractC1484b;
            this.f5677c = i10;
            AbstractC1484b.f5672a.m6927c(i10, i11, abstractC1484b.size());
            this.f5678d = i11 - i10;
        }

        @Override // p043ce.AbstractC1482a
        /* renamed from: c */
        public int mo6923c() {
            return this.f5678d;
        }

        @Override // p043ce.AbstractC1484b, java.util.List
        public Object get(int i10) {
            AbstractC1484b.f5672a.m6925a(i10, this.f5678d);
            return this.f5676b.get(this.f5677c + i10);
        }
    }

    @Override // java.util.List
    public void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return f5672a.m6928d(this, (Collection) obj);
    }

    @Override // java.util.List
    public abstract Object get(int i10);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f5672a.m6929e(this);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (!AbstractC5868k.m23669a(it.next(), obj)) {
                i10++;
            } else {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (AbstractC5868k.m23669a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i10, int i11) {
        return new d(this, i10, i11);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i10) {
        return new c(i10);
    }
}
