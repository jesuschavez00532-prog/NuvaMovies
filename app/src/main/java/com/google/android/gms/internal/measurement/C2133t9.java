package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.t9 */
/* loaded from: classes.dex */
final class C2133t9 extends AbstractC2041n7 implements RandomAccess, InterfaceC1906e9, InterfaceC1999ka {

    /* renamed from: d */
    private static final C2133t9 f8124d;

    /* renamed from: b */
    private long[] f8125b;

    /* renamed from: c */
    private int f8126c;

    static {
        C2133t9 c2133t9 = new C2133t9(new long[0], 0);
        f8124d = c2133t9;
        c2133t9.mo8386e();
    }

    private C2133t9(long[] jArr, int i10) {
        this.f8125b = jArr;
        this.f8126c = i10;
    }

    /* renamed from: g */
    public static C2133t9 m8964g() {
        return f8124d;
    }

    /* renamed from: j */
    private final String m8965j(int i10) {
        return "Index:" + i10 + ", Size:" + this.f8126c;
    }

    /* renamed from: k */
    private final void m8966k(int i10) {
        if (i10 >= 0 && i10 < this.f8126c) {
        } else {
            throw new IndexOutOfBoundsException(m8965j(i10));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1906e9
    /* renamed from: a */
    public final long mo8291a(int i10) {
        m8966k(i10);
        return this.f8125b[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        m8737c();
        if (i10 >= 0 && i10 <= (i11 = this.f8126c)) {
            long[] jArr = this.f8125b;
            if (i11 < jArr.length) {
                System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
            } else {
                long[] jArr2 = new long[((i11 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i10);
                System.arraycopy(this.f8125b, i10, jArr2, i10 + 1, this.f8126c - i10);
                this.f8125b = jArr2;
            }
            this.f8125b[i10] = longValue;
            this.f8126c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m8965j(i10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2041n7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m8737c();
        AbstractC1938g9.m8418e(collection);
        if (!(collection instanceof C2133t9)) {
            return super.addAll(collection);
        }
        C2133t9 c2133t9 = (C2133t9) collection;
        int i10 = c2133t9.f8126c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f8126c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f8125b;
            if (i12 > jArr.length) {
                this.f8125b = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(c2133t9.f8125b, 0, this.f8125b, this.f8126c, c2133t9.f8126c);
            this.f8126c = i12;
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

    @Override // com.google.android.gms.internal.measurement.InterfaceC1922f9
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final InterfaceC1906e9 mo8095l(int i10) {
        if (i10 >= this.f8126c) {
            return new C2133t9(Arrays.copyOf(this.f8125b, i10), this.f8126c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2041n7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2133t9)) {
            return super.equals(obj);
        }
        C2133t9 c2133t9 = (C2133t9) obj;
        if (this.f8126c != c2133t9.f8126c) {
            return false;
        }
        long[] jArr = c2133t9.f8125b;
        for (int i10 = 0; i10 < this.f8126c; i10++) {
            if (this.f8125b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m8966k(i10);
        return Long.valueOf(this.f8125b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2041n7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f8126c; i11++) {
            i10 = (i10 * 31) + AbstractC1938g9.m8416c(this.f8125b[i11]);
        }
        return i10;
    }

    /* renamed from: i */
    public final void m8967i(long j10) {
        m8737c();
        int i10 = this.f8126c;
        long[] jArr = this.f8125b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f8125b = jArr2;
        }
        long[] jArr3 = this.f8125b;
        int i11 = this.f8126c;
        this.f8126c = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i10 = this.f8126c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f8125b[i11] == longValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2041n7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m8737c();
        m8966k(i10);
        long[] jArr = this.f8125b;
        long j10 = jArr[i10];
        if (i10 < this.f8126c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f8126c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        m8737c();
        if (i11 >= i10) {
            long[] jArr = this.f8125b;
            System.arraycopy(jArr, i11, jArr, i10, this.f8126c - i11);
            this.f8126c -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        m8737c();
        m8966k(i10);
        long[] jArr = this.f8125b;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8126c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2041n7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m8967i(((Long) obj).longValue());
        return true;
    }
}
