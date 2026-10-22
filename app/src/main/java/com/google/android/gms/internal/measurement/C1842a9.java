package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.a9 */
/* loaded from: classes.dex */
final class C1842a9 extends AbstractC2041n7 implements RandomAccess, InterfaceC1890d9, InterfaceC1999ka {

    /* renamed from: d */
    private static final C1842a9 f7653d;

    /* renamed from: b */
    private int[] f7654b;

    /* renamed from: c */
    private int f7655c;

    static {
        C1842a9 c1842a9 = new C1842a9(new int[0], 0);
        f7653d = c1842a9;
        c1842a9.mo8386e();
    }

    private C1842a9(int[] iArr, int i10) {
        this.f7654b = iArr;
        this.f7655c = i10;
    }

    /* renamed from: i */
    public static C1842a9 m8090i() {
        return f7653d;
    }

    /* renamed from: k */
    private final String m8091k(int i10) {
        return "Index:" + i10 + ", Size:" + this.f7655c;
    }

    /* renamed from: n */
    private final void m8092n(int i10) {
        if (i10 >= 0 && i10 < this.f7655c) {
        } else {
            throw new IndexOutOfBoundsException(m8091k(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        m8737c();
        if (i10 >= 0 && i10 <= (i11 = this.f7655c)) {
            int[] iArr = this.f7654b;
            if (i11 < iArr.length) {
                System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
            } else {
                int[] iArr2 = new int[((i11 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i10);
                System.arraycopy(this.f7654b, i10, iArr2, i10 + 1, this.f7655c - i10);
                this.f7654b = iArr2;
            }
            this.f7654b[i10] = intValue;
            this.f7655c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m8091k(i10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2041n7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m8737c();
        AbstractC1938g9.m8418e(collection);
        if (!(collection instanceof C1842a9)) {
            return super.addAll(collection);
        }
        C1842a9 c1842a9 = (C1842a9) collection;
        int i10 = c1842a9.f7655c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f7655c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f7654b;
            if (i12 > iArr.length) {
                this.f7654b = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(c1842a9.f7654b, 0, this.f7654b, this.f7655c, c1842a9.f7655c);
            this.f7655c = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2041n7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1842a9)) {
            return super.equals(obj);
        }
        C1842a9 c1842a9 = (C1842a9) obj;
        if (this.f7655c != c1842a9.f7655c) {
            return false;
        }
        int[] iArr = c1842a9.f7654b;
        for (int i10 = 0; i10 < this.f7655c; i10++) {
            if (this.f7654b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final int m8093g(int i10) {
        m8092n(i10);
        return this.f7654b[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m8092n(i10);
        return Integer.valueOf(this.f7654b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2041n7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f7655c; i11++) {
            i10 = (i10 * 31) + this.f7654b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i10 = this.f7655c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f7654b[i11] == intValue) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final void m8094j(int i10) {
        m8737c();
        int i11 = this.f7655c;
        int[] iArr = this.f7654b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f7654b = iArr2;
        }
        int[] iArr3 = this.f7654b;
        int i12 = this.f7655c;
        this.f7655c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2041n7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m8737c();
        m8092n(i10);
        int[] iArr = this.f7654b;
        int i11 = iArr[i10];
        if (i10 < this.f7655c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f7655c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        m8737c();
        if (i11 >= i10) {
            int[] iArr = this.f7654b;
            System.arraycopy(iArr, i11, iArr, i10, this.f7655c - i11);
            this.f7655c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1922f9
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final InterfaceC1890d9 mo8095l(int i10) {
        if (i10 >= this.f7655c) {
            return new C1842a9(Arrays.copyOf(this.f7654b, i10), this.f7655c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m8737c();
        m8092n(i10);
        int[] iArr = this.f7654b;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7655c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2041n7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m8094j(((Integer) obj).intValue());
        return true;
    }
}
