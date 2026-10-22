package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.ma */
/* loaded from: classes.dex */
final class C2029ma extends AbstractC2041n7 implements RandomAccess {

    /* renamed from: d */
    private static final C2029ma f7882d;

    /* renamed from: b */
    private Object[] f7883b;

    /* renamed from: c */
    private int f7884c;

    static {
        C2029ma c2029ma = new C2029ma(new Object[0], 0);
        f7882d = c2029ma;
        c2029ma.mo8386e();
    }

    private C2029ma(Object[] objArr, int i10) {
        this.f7883b = objArr;
        this.f7884c = i10;
    }

    /* renamed from: g */
    public static C2029ma m8705g() {
        return f7882d;
    }

    /* renamed from: i */
    private final String m8706i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f7884c;
    }

    /* renamed from: j */
    private final void m8707j(int i10) {
        if (i10 >= 0 && i10 < this.f7884c) {
        } else {
            throw new IndexOutOfBoundsException(m8706i(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        m8737c();
        if (i10 >= 0 && i10 <= (i11 = this.f7884c)) {
            Object[] objArr = this.f7883b;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.f7883b, i10, objArr2, i10 + 1, this.f7884c - i10);
                this.f7883b = objArr2;
            }
            this.f7883b[i10] = obj;
            this.f7884c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m8706i(i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        m8707j(i10);
        return this.f7883b[i10];
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1922f9
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ InterfaceC1922f9 mo8095l(int i10) {
        if (i10 >= this.f7884c) {
            return new C2029ma(Arrays.copyOf(this.f7883b, i10), this.f7884c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2041n7, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        m8737c();
        m8707j(i10);
        Object[] objArr = this.f7883b;
        Object obj = objArr[i10];
        if (i10 < this.f7884c - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f7884c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        m8737c();
        m8707j(i10);
        Object[] objArr = this.f7883b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7884c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2041n7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m8737c();
        int i10 = this.f7884c;
        Object[] objArr = this.f7883b;
        if (i10 == objArr.length) {
            this.f7883b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f7883b;
        int i11 = this.f7884c;
        this.f7884c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
