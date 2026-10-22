package p214l;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: l.b */
/* loaded from: classes.dex */
public final class C5304b implements Collection, Set {

    /* renamed from: e */
    private static final int[] f21577e = new int[0];

    /* renamed from: f */
    private static final Object[] f21578f = new Object[0];

    /* renamed from: g */
    private static Object[] f21579g;

    /* renamed from: h */
    private static int f21580h;

    /* renamed from: i */
    private static Object[] f21581i;

    /* renamed from: j */
    private static int f21582j;

    /* renamed from: a */
    private int[] f21583a;

    /* renamed from: b */
    Object[] f21584b;

    /* renamed from: c */
    int f21585c;

    /* renamed from: d */
    private AbstractC5310h f21586d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l.b$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC5310h {
        a() {
        }

        @Override // p214l.AbstractC5310h
        /* renamed from: a */
        protected void mo21351a() {
            C5304b.this.clear();
        }

        @Override // p214l.AbstractC5310h
        /* renamed from: b */
        protected Object mo21352b(int i10, int i11) {
            return C5304b.this.f21584b[i10];
        }

        @Override // p214l.AbstractC5310h
        /* renamed from: c */
        protected Map mo21353c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // p214l.AbstractC5310h
        /* renamed from: d */
        protected int mo21354d() {
            return C5304b.this.f21585c;
        }

        @Override // p214l.AbstractC5310h
        /* renamed from: e */
        protected int mo21355e(Object obj) {
            return C5304b.this.indexOf(obj);
        }

        @Override // p214l.AbstractC5310h
        /* renamed from: f */
        protected int mo21356f(Object obj) {
            return C5304b.this.indexOf(obj);
        }

        @Override // p214l.AbstractC5310h
        /* renamed from: g */
        protected void mo21357g(Object obj, Object obj2) {
            C5304b.this.add(obj);
        }

        @Override // p214l.AbstractC5310h
        /* renamed from: h */
        protected void mo21358h(int i10) {
            C5304b.this.m21366o(i10);
        }

        @Override // p214l.AbstractC5310h
        /* renamed from: i */
        protected Object mo21359i(int i10, Object obj) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public C5304b() {
        this(0);
    }

    /* renamed from: c */
    private void m21360c(int i10) {
        if (i10 == 8) {
            synchronized (C5304b.class) {
                Object[] objArr = f21581i;
                if (objArr != null) {
                    this.f21584b = objArr;
                    f21581i = (Object[]) objArr[0];
                    this.f21583a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f21582j--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (C5304b.class) {
                Object[] objArr2 = f21579g;
                if (objArr2 != null) {
                    this.f21584b = objArr2;
                    f21579g = (Object[]) objArr2[0];
                    this.f21583a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f21580h--;
                    return;
                }
            }
        }
        this.f21583a = new int[i10];
        this.f21584b = new Object[i10];
    }

    /* renamed from: i */
    private static void m21361i(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (C5304b.class) {
                if (f21582j < 10) {
                    objArr[0] = f21581i;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f21581i = objArr;
                    f21582j++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C5304b.class) {
                if (f21580h < 10) {
                    objArr[0] = f21579g;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f21579g = objArr;
                    f21580h++;
                }
            }
        }
    }

    /* renamed from: j */
    private AbstractC5310h m21362j() {
        if (this.f21586d == null) {
            this.f21586d = new a();
        }
        return this.f21586d;
    }

    /* renamed from: k */
    private int m21363k(Object obj, int i10) {
        int i11 = this.f21585c;
        if (i11 == 0) {
            return -1;
        }
        int m21383a = AbstractC5307e.m21383a(this.f21583a, i11, i10);
        if (m21383a < 0) {
            return m21383a;
        }
        if (obj.equals(this.f21584b[m21383a])) {
            return m21383a;
        }
        int i12 = m21383a + 1;
        while (i12 < i11 && this.f21583a[i12] == i10) {
            if (obj.equals(this.f21584b[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = m21383a - 1; i13 >= 0 && this.f21583a[i13] == i10; i13--) {
            if (obj.equals(this.f21584b[i13])) {
                return i13;
            }
        }
        return i12 ^ (-1);
    }

    /* renamed from: n */
    private int m21364n() {
        int i10 = this.f21585c;
        if (i10 == 0) {
            return -1;
        }
        int m21383a = AbstractC5307e.m21383a(this.f21583a, i10, 0);
        if (m21383a < 0) {
            return m21383a;
        }
        if (this.f21584b[m21383a] == null) {
            return m21383a;
        }
        int i11 = m21383a + 1;
        while (i11 < i10 && this.f21583a[i11] == 0) {
            if (this.f21584b[i11] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = m21383a - 1; i12 >= 0 && this.f21583a[i12] == 0; i12--) {
            if (this.f21584b[i12] == null) {
                return i12;
            }
        }
        return i11 ^ (-1);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i10;
        int m21363k;
        if (obj == null) {
            m21363k = m21364n();
            i10 = 0;
        } else {
            int hashCode = obj.hashCode();
            i10 = hashCode;
            m21363k = m21363k(obj, hashCode);
        }
        if (m21363k >= 0) {
            return false;
        }
        int i11 = m21363k ^ (-1);
        int i12 = this.f21585c;
        int[] iArr = this.f21583a;
        if (i12 >= iArr.length) {
            int i13 = 8;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f21584b;
            m21360c(i13);
            int[] iArr2 = this.f21583a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f21584b, 0, objArr.length);
            }
            m21361i(iArr, objArr, this.f21585c);
        }
        int i14 = this.f21585c;
        if (i11 < i14) {
            int[] iArr3 = this.f21583a;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.f21584b;
            System.arraycopy(objArr2, i11, objArr2, i15, this.f21585c - i11);
        }
        this.f21583a[i11] = i10;
        this.f21584b[i11] = obj;
        this.f21585c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        m21365g(this.f21585c + collection.size());
        Iterator it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= add(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i10 = this.f21585c;
        if (i10 != 0) {
            m21361i(this.f21583a, this.f21584b, i10);
            this.f21583a = f21577e;
            this.f21584b = f21578f;
            this.f21585c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f21585c; i10++) {
                try {
                    if (!set.contains(m21367p(i10))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public void m21365g(int i10) {
        int[] iArr = this.f21583a;
        if (iArr.length < i10) {
            Object[] objArr = this.f21584b;
            m21360c(i10);
            int i11 = this.f21585c;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.f21583a, 0, i11);
                System.arraycopy(objArr, 0, this.f21584b, 0, this.f21585c);
            }
            m21361i(iArr, objArr, this.f21585c);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f21583a;
        int i10 = this.f21585c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return m21364n();
        }
        return m21363k(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        if (this.f21585c <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return m21362j().m21420m().iterator();
    }

    /* renamed from: o */
    public Object m21366o(int i10) {
        Object[] objArr = this.f21584b;
        Object obj = objArr[i10];
        int i11 = this.f21585c;
        if (i11 <= 1) {
            m21361i(this.f21583a, objArr, i11);
            this.f21583a = f21577e;
            this.f21584b = f21578f;
            this.f21585c = 0;
        } else {
            int[] iArr = this.f21583a;
            int i12 = 8;
            if (iArr.length > 8 && i11 < iArr.length / 3) {
                if (i11 > 8) {
                    i12 = i11 + (i11 >> 1);
                }
                m21360c(i12);
                this.f21585c--;
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f21583a, 0, i10);
                    System.arraycopy(objArr, 0, this.f21584b, 0, i10);
                }
                int i13 = this.f21585c;
                if (i10 < i13) {
                    int i14 = i10 + 1;
                    System.arraycopy(iArr, i14, this.f21583a, i10, i13 - i10);
                    System.arraycopy(objArr, i14, this.f21584b, i10, this.f21585c - i10);
                }
            } else {
                int i15 = i11 - 1;
                this.f21585c = i15;
                if (i10 < i15) {
                    int i16 = i10 + 1;
                    System.arraycopy(iArr, i16, iArr, i10, i15 - i10);
                    Object[] objArr2 = this.f21584b;
                    System.arraycopy(objArr2, i16, objArr2, i10, this.f21585c - i10);
                }
                this.f21584b[this.f21585c] = null;
            }
        }
        return obj;
    }

    /* renamed from: p */
    public Object m21367p(int i10) {
        return this.f21584b[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            m21366o(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        boolean z10 = false;
        for (int i10 = this.f21585c - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f21584b[i10])) {
                m21366o(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f21585c;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i10 = this.f21585c;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f21584b, 0, objArr, 0, i10);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f21585c * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f21585c; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object m21367p = m21367p(i10);
            if (m21367p != this) {
                sb2.append(m21367p);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public C5304b(int i10) {
        if (i10 == 0) {
            this.f21583a = f21577e;
            this.f21584b = f21578f;
        } else {
            m21360c(i10);
        }
        this.f21585c = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f21585c) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f21585c);
        }
        System.arraycopy(this.f21584b, 0, objArr, 0, this.f21585c);
        int length = objArr.length;
        int i10 = this.f21585c;
        if (length > i10) {
            objArr[i10] = null;
        }
        return objArr;
    }
}
