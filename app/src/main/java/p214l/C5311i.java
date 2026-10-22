package p214l;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: l.i */
/* loaded from: classes.dex */
public class C5311i {

    /* renamed from: d */
    static Object[] f21627d;

    /* renamed from: e */
    static int f21628e;

    /* renamed from: f */
    static Object[] f21629f;

    /* renamed from: g */
    static int f21630g;

    /* renamed from: a */
    int[] f21631a;

    /* renamed from: b */
    Object[] f21632b;

    /* renamed from: c */
    int f21633c;

    public C5311i() {
        this.f21631a = AbstractC5307e.f21596a;
        this.f21632b = AbstractC5307e.f21598c;
        this.f21633c = 0;
    }

    /* renamed from: a */
    private void m21426a(int i10) {
        if (i10 == 8) {
            synchronized (C5311i.class) {
                Object[] objArr = f21629f;
                if (objArr != null) {
                    this.f21632b = objArr;
                    f21629f = (Object[]) objArr[0];
                    this.f21631a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f21630g--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (C5311i.class) {
                Object[] objArr2 = f21627d;
                if (objArr2 != null) {
                    this.f21632b = objArr2;
                    f21627d = (Object[]) objArr2[0];
                    this.f21631a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f21628e--;
                    return;
                }
            }
        }
        this.f21631a = new int[i10];
        this.f21632b = new Object[i10 << 1];
    }

    /* renamed from: b */
    private static int m21427b(int[] iArr, int i10, int i11) {
        try {
            return AbstractC5307e.m21383a(iArr, i10, i11);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: d */
    private static void m21428d(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (C5311i.class) {
                if (f21630g < 10) {
                    objArr[0] = f21629f;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f21629f = objArr;
                    f21630g++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C5311i.class) {
                if (f21628e < 10) {
                    objArr[0] = f21627d;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f21627d = objArr;
                    f21628e++;
                }
            }
        }
    }

    /* renamed from: c */
    public void m21429c(int i10) {
        int i11 = this.f21633c;
        int[] iArr = this.f21631a;
        if (iArr.length < i10) {
            Object[] objArr = this.f21632b;
            m21426a(i10);
            if (this.f21633c > 0) {
                System.arraycopy(iArr, 0, this.f21631a, 0, i11);
                System.arraycopy(objArr, 0, this.f21632b, 0, i11 << 1);
            }
            m21428d(iArr, objArr, i11);
        }
        if (this.f21633c == i11) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i10 = this.f21633c;
        if (i10 > 0) {
            int[] iArr = this.f21631a;
            Object[] objArr = this.f21632b;
            this.f21631a = AbstractC5307e.f21596a;
            this.f21632b = AbstractC5307e.f21598c;
            this.f21633c = 0;
            m21428d(iArr, objArr, i10);
        }
        if (this.f21633c <= 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        if (m21431f(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (m21433h(obj) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    int m21430e(Object obj, int i10) {
        int i11 = this.f21633c;
        if (i11 == 0) {
            return -1;
        }
        int m21427b = m21427b(this.f21631a, i11, i10);
        if (m21427b < 0) {
            return m21427b;
        }
        if (obj.equals(this.f21632b[m21427b << 1])) {
            return m21427b;
        }
        int i12 = m21427b + 1;
        while (i12 < i11 && this.f21631a[i12] == i10) {
            if (obj.equals(this.f21632b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = m21427b - 1; i13 >= 0 && this.f21631a[i13] == i10; i13--) {
            if (obj.equals(this.f21632b[i13 << 1])) {
                return i13;
            }
        }
        return i12 ^ (-1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5311i) {
            C5311i c5311i = (C5311i) obj;
            if (size() != c5311i.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f21633c; i10++) {
                try {
                    Object m21434i = m21434i(i10);
                    Object m21435m = m21435m(i10);
                    Object obj2 = c5311i.get(m21434i);
                    if (m21435m == null) {
                        if (obj2 != null || !c5311i.containsKey(m21434i)) {
                            return false;
                        }
                    } else if (!m21435m.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i11 = 0; i11 < this.f21633c; i11++) {
                try {
                    Object m21434i2 = m21434i(i11);
                    Object m21435m2 = m21435m(i11);
                    Object obj3 = map.get(m21434i2);
                    if (m21435m2 == null) {
                        if (obj3 != null || !map.containsKey(m21434i2)) {
                            return false;
                        }
                    } else if (!m21435m2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m21431f(Object obj) {
        if (obj == null) {
            return m21432g();
        }
        return m21430e(obj, obj.hashCode());
    }

    /* renamed from: g */
    int m21432g() {
        int i10 = this.f21633c;
        if (i10 == 0) {
            return -1;
        }
        int m21427b = m21427b(this.f21631a, i10, 0);
        if (m21427b < 0) {
            return m21427b;
        }
        if (this.f21632b[m21427b << 1] == null) {
            return m21427b;
        }
        int i11 = m21427b + 1;
        while (i11 < i10 && this.f21631a[i11] == 0) {
            if (this.f21632b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = m21427b - 1; i12 >= 0 && this.f21631a[i12] == 0; i12--) {
            if (this.f21632b[i12 << 1] == null) {
                return i12;
            }
        }
        return i11 ^ (-1);
    }

    public Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int m21431f = m21431f(obj);
        if (m21431f >= 0) {
            return this.f21632b[(m21431f << 1) + 1];
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m21433h(Object obj) {
        int i10 = this.f21633c * 2;
        Object[] objArr = this.f21632b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int hashCode;
        int[] iArr = this.f21631a;
        Object[] objArr = this.f21632b;
        int i10 = this.f21633c;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            int i14 = iArr[i12];
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i13 += hashCode ^ i14;
            i12++;
            i11 += 2;
        }
        return i13;
    }

    /* renamed from: i */
    public Object m21434i(int i10) {
        return this.f21632b[i10 << 1];
    }

    public boolean isEmpty() {
        if (this.f21633c <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public void mo17197j(C5311i c5311i) {
        int i10 = c5311i.f21633c;
        m21429c(this.f21633c + i10);
        if (this.f21633c == 0) {
            if (i10 > 0) {
                System.arraycopy(c5311i.f21631a, 0, this.f21631a, 0, i10);
                System.arraycopy(c5311i.f21632b, 0, this.f21632b, 0, i10 << 1);
                this.f21633c = i10;
                return;
            }
            return;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            put(c5311i.m21434i(i11), c5311i.m21435m(i11));
        }
    }

    /* renamed from: k */
    public Object mo17198k(int i10) {
        Object[] objArr = this.f21632b;
        int i11 = i10 << 1;
        Object obj = objArr[i11 + 1];
        int i12 = this.f21633c;
        int i13 = 0;
        if (i12 <= 1) {
            m21428d(this.f21631a, objArr, i12);
            this.f21631a = AbstractC5307e.f21596a;
            this.f21632b = AbstractC5307e.f21598c;
        } else {
            int i14 = i12 - 1;
            int[] iArr = this.f21631a;
            int i15 = 8;
            if (iArr.length > 8 && i12 < iArr.length / 3) {
                if (i12 > 8) {
                    i15 = i12 + (i12 >> 1);
                }
                m21426a(i15);
                if (i12 == this.f21633c) {
                    if (i10 > 0) {
                        System.arraycopy(iArr, 0, this.f21631a, 0, i10);
                        System.arraycopy(objArr, 0, this.f21632b, 0, i11);
                    }
                    if (i10 < i14) {
                        int i16 = i10 + 1;
                        int i17 = i14 - i10;
                        System.arraycopy(iArr, i16, this.f21631a, i10, i17);
                        System.arraycopy(objArr, i16 << 1, this.f21632b, i11, i17 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i10 < i14) {
                    int i18 = i10 + 1;
                    int i19 = i14 - i10;
                    System.arraycopy(iArr, i18, iArr, i10, i19);
                    Object[] objArr2 = this.f21632b;
                    System.arraycopy(objArr2, i18 << 1, objArr2, i11, i19 << 1);
                }
                Object[] objArr3 = this.f21632b;
                int i20 = i14 << 1;
                objArr3[i20] = null;
                objArr3[i20 + 1] = null;
            }
            i13 = i14;
        }
        if (i12 == this.f21633c) {
            this.f21633c = i13;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: l */
    public Object mo17199l(int i10, Object obj) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f21632b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    /* renamed from: m */
    public Object m21435m(int i10) {
        return this.f21632b[(i10 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i10;
        int m21430e;
        int i11 = this.f21633c;
        if (obj == null) {
            m21430e = m21432g();
            i10 = 0;
        } else {
            int hashCode = obj.hashCode();
            i10 = hashCode;
            m21430e = m21430e(obj, hashCode);
        }
        if (m21430e >= 0) {
            int i12 = (m21430e << 1) + 1;
            Object[] objArr = this.f21632b;
            Object obj3 = objArr[i12];
            objArr[i12] = obj2;
            return obj3;
        }
        int i13 = m21430e ^ (-1);
        int[] iArr = this.f21631a;
        if (i11 >= iArr.length) {
            int i14 = 8;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i14 = 4;
            }
            Object[] objArr2 = this.f21632b;
            m21426a(i14);
            if (i11 == this.f21633c) {
                int[] iArr2 = this.f21631a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f21632b, 0, objArr2.length);
                }
                m21428d(iArr, objArr2, i11);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i13 < i11) {
            int[] iArr3 = this.f21631a;
            int i15 = i13 + 1;
            System.arraycopy(iArr3, i13, iArr3, i15, i11 - i13);
            Object[] objArr3 = this.f21632b;
            System.arraycopy(objArr3, i13 << 1, objArr3, i15 << 1, (this.f21633c - i13) << 1);
        }
        int i16 = this.f21633c;
        if (i11 == i16) {
            int[] iArr4 = this.f21631a;
            if (i13 < iArr4.length) {
                iArr4[i13] = i10;
                Object[] objArr4 = this.f21632b;
                int i17 = i13 << 1;
                objArr4[i17] = obj;
                objArr4[i17 + 1] = obj2;
                this.f21633c = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public Object remove(Object obj) {
        int m21431f = m21431f(obj);
        if (m21431f >= 0) {
            return mo17198k(m21431f);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int m21431f = m21431f(obj);
        if (m21431f >= 0) {
            return mo17199l(m21431f, obj2);
        }
        return null;
    }

    public int size() {
        return this.f21633c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f21633c * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f21633c; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object m21434i = m21434i(i10);
            if (m21434i != this) {
                sb2.append(m21434i);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object m21435m = m21435m(i10);
            if (m21435m != this) {
                sb2.append(m21435m);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int m21431f = m21431f(obj);
        if (m21431f < 0) {
            return false;
        }
        Object m21435m = m21435m(m21431f);
        if (obj2 != m21435m && (obj2 == null || !obj2.equals(m21435m))) {
            return false;
        }
        mo17198k(m21431f);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int m21431f = m21431f(obj);
        if (m21431f < 0) {
            return false;
        }
        Object m21435m = m21435m(m21431f);
        if (m21435m != obj2 && (obj2 == null || !obj2.equals(m21435m))) {
            return false;
        }
        mo17199l(m21431f, obj3);
        return true;
    }

    public C5311i(int i10) {
        if (i10 == 0) {
            this.f21631a = AbstractC5307e.f21596a;
            this.f21632b = AbstractC5307e.f21598c;
        } else {
            m21426a(i10);
        }
        this.f21633c = 0;
    }

    public C5311i(C5311i c5311i) {
        this();
        if (c5311i != null) {
            mo17197j(c5311i);
        }
    }
}
