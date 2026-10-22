package p288pc;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import ne.AbstractC5863f;
import ne.AbstractC5868k;
import p269oe.InterfaceC5975b;

/* renamed from: pc.i */
/* loaded from: classes.dex */
public final class C6262i extends ReentrantReadWriteLock implements Set, InterfaceC5975b {

    /* renamed from: a */
    private final int f24499a;

    /* renamed from: b */
    private final Set f24500b = new HashSet();

    public C6262i(int i10) {
        this.f24499a = i10;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        if (!contains(obj) && this.f24500b.add(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        AbstractC5868k.m23674f(collection, "collection");
        return this.f24500b.addAll(collection);
    }

    /* renamed from: c */
    public int m24896c() {
        return this.f24499a;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f24500b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f24500b.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        AbstractC5868k.m23674f(collection, "elements");
        return this.f24500b.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f24500b.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f24500b.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.f24500b.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        AbstractC5868k.m23674f(collection, "elements");
        return this.f24500b.removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        AbstractC5868k.m23674f(collection, "elements");
        return this.f24500b.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return m24896c();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC5863f.m23667a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        AbstractC5868k.m23674f(objArr, "array");
        return AbstractC5863f.m23668b(this, objArr);
    }
}
