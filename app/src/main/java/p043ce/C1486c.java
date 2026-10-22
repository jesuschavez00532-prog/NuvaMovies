package p043ce;

import java.util.Collection;
import java.util.Iterator;
import ne.AbstractC5859b;
import ne.AbstractC5863f;
import ne.AbstractC5868k;
import p269oe.InterfaceC5974a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ce.c */
/* loaded from: classes3.dex */
public final class C1486c implements Collection, InterfaceC5974a {

    /* renamed from: a */
    private final Object[] f5679a;

    /* renamed from: b */
    private final boolean f5680b;

    public C1486c(Object[] objArr, boolean z10) {
        AbstractC5868k.m23674f(objArr, "values");
        this.f5679a = objArr;
        this.f5680b = z10;
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
    public int m6935c() {
        return this.f5679a.length;
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return AbstractC1496h.m6954e(this.f5679a, obj);
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
        if (this.f5679a.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return AbstractC5859b.m23657a(this.f5679a);
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
        return m6935c();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        AbstractC5868k.m23674f(objArr, "array");
        return AbstractC5863f.m23668b(this, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC1499k.m6982a(this.f5679a, this.f5680b);
    }
}
