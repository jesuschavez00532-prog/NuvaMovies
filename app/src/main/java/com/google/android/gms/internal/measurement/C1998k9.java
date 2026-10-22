package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.k9 */
/* loaded from: classes.dex */
public final class C1998k9 extends AbstractC2041n7 implements RandomAccess, InterfaceC2013l9 {

    /* renamed from: c */
    private static final C1998k9 f7853c;

    /* renamed from: d */
    public static final InterfaceC2013l9 f7854d;

    /* renamed from: b */
    private final List f7855b;

    static {
        C1998k9 c1998k9 = new C1998k9(10);
        f7853c = c1998k9;
        c1998k9.mo8386e();
        f7854d = c1998k9;
    }

    public C1998k9(int i10) {
        this.f7855b = new ArrayList(i10);
    }

    /* renamed from: i */
    private static String m8597i(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC1873c8) {
            return ((AbstractC1873c8) obj).m8189w(AbstractC1938g9.f7766b);
        }
        return AbstractC1938g9.m8421h((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        m8737c();
        this.f7855b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2041n7, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        m8737c();
        if (collection instanceof InterfaceC2013l9) {
            collection = ((InterfaceC2013l9) collection).mo8600h();
        }
        boolean addAll = this.f7855b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2013l9
    /* renamed from: b */
    public final InterfaceC2013l9 mo8598b() {
        if (mo8387f()) {
            return new C2224za(this);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2041n7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m8737c();
        this.f7855b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final String get(int i10) {
        Object obj = this.f7855b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC1873c8) {
            AbstractC1873c8 abstractC1873c8 = (AbstractC1873c8) obj;
            String m8189w = abstractC1873c8.m8189w(AbstractC1938g9.f7766b);
            if (abstractC1873c8.mo8187p()) {
                this.f7855b.set(i10, m8189w);
            }
            return m8189w;
        }
        byte[] bArr = (byte[]) obj;
        String m8421h = AbstractC1938g9.m8421h(bArr);
        if (AbstractC1938g9.m8422i(bArr)) {
            this.f7855b.set(i10, m8421h);
        }
        return m8421h;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2013l9
    /* renamed from: h */
    public final List mo8600h() {
        return Collections.unmodifiableList(this.f7855b);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1922f9
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ InterfaceC1922f9 mo8095l(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f7855b);
            return new C1998k9(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2013l9
    /* renamed from: m */
    public final Object mo8601m(int i10) {
        return this.f7855b.get(i10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2013l9
    /* renamed from: r */
    public final void mo8602r(AbstractC1873c8 abstractC1873c8) {
        m8737c();
        this.f7855b.add(abstractC1873c8);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2041n7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m8737c();
        Object remove = this.f7855b.remove(i10);
        ((AbstractList) this).modCount++;
        return m8597i(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        m8737c();
        return m8597i(this.f7855b.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7855b.size();
    }

    private C1998k9(ArrayList arrayList) {
        this.f7855b = arrayList;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2041n7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
