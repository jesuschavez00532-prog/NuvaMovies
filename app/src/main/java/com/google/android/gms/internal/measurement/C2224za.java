package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.za */
/* loaded from: classes.dex */
public final class C2224za extends AbstractList implements RandomAccess, InterfaceC2013l9 {

    /* renamed from: a */
    private final InterfaceC2013l9 f8310a;

    public C2224za(InterfaceC2013l9 interfaceC2013l9) {
        this.f8310a = interfaceC2013l9;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2013l9
    /* renamed from: b */
    public final InterfaceC2013l9 mo8598b() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((C1998k9) this.f8310a).get(i10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2013l9
    /* renamed from: h */
    public final List mo8600h() {
        return this.f8310a.mo8600h();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C2209ya(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new C2194xa(this, i10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2013l9
    /* renamed from: m */
    public final Object mo8601m(int i10) {
        return this.f8310a.mo8601m(i10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2013l9
    /* renamed from: r */
    public final void mo8602r(AbstractC1873c8 abstractC1873c8) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8310a.size();
    }
}
