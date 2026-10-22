package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.measurement.xa */
/* loaded from: classes.dex */
final class C2194xa implements ListIterator {

    /* renamed from: a */
    final ListIterator f8259a;

    /* renamed from: b */
    final /* synthetic */ int f8260b;

    /* renamed from: c */
    final /* synthetic */ C2224za f8261c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2194xa(C2224za c2224za, int i10) {
        InterfaceC2013l9 interfaceC2013l9;
        this.f8261c = c2224za;
        this.f8260b = i10;
        interfaceC2013l9 = c2224za.f8310a;
        this.f8259a = interfaceC2013l9.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f8259a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f8259a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f8259a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8259a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f8259a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8259a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
