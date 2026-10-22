package p038c6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: c6.b0 */
/* loaded from: classes.dex */
public final class C1368b0 implements List, RandomAccess {

    /* renamed from: a */
    private final List f5244a;

    private C1368b0(List list) {
        this.f5244a = Collections.unmodifiableList(list);
    }

    /* renamed from: c */
    public static C1368b0 m6409c(List list) {
        return new C1368b0(list);
    }

    /* renamed from: g */
    public static C1368b0 m6410g(Object... objArr) {
        return new C1368b0(Arrays.asList(objArr));
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        return this.f5244a.add(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        return this.f5244a.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f5244a.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f5244a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.f5244a.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.f5244a.equals(obj);
    }

    @Override // java.util.List
    public Object get(int i10) {
        return this.f5244a.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f5244a.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f5244a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f5244a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f5244a.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f5244a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return this.f5244a.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.f5244a.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        return this.f5244a.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        return this.f5244a.retainAll(collection);
    }

    @Override // java.util.List
    public Object set(int i10, Object obj) {
        return this.f5244a.set(i10, obj);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f5244a.size();
    }

    @Override // java.util.List
    public List subList(int i10, int i11) {
        return this.f5244a.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f5244a.toArray();
    }

    @Override // java.util.List
    public void add(int i10, Object obj) {
        this.f5244a.add(i10, obj);
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection collection) {
        return this.f5244a.addAll(i10, collection);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i10) {
        return this.f5244a.listIterator(i10);
    }

    @Override // java.util.List
    public Object remove(int i10) {
        return this.f5244a.remove(i10);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.f5244a.toArray(objArr);
    }
}
