package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.qa */
/* loaded from: classes.dex */
public abstract class AbstractC2089qa {

    /* renamed from: a */
    private static final Class f8023a;

    /* renamed from: b */
    private static final AbstractC2149ua f8024b;

    /* renamed from: c */
    private static final AbstractC2149ua f8025c;

    /* renamed from: d */
    private static final AbstractC2149ua f8026d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f8023a = cls;
        f8024b = m8809C(false);
        f8025c = m8809C(true);
        f8026d = new C2179wa();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static int m8807A(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC1997k8.m8588a(i10 << 3) + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static void m8808B(C2208y9 c2208y9, Object obj, Object obj2, long j10) {
        AbstractC1908eb.m8322x(obj, j10, C2208y9.m9362b(AbstractC1908eb.m8309k(obj, j10), AbstractC1908eb.m8309k(obj2, j10)));
    }

    /* renamed from: C */
    private static AbstractC2149ua m8809C(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (AbstractC2149ua) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static int m8810D(List list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static int m8811E(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m8587C = size * AbstractC1997k8.m8587C(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            m8587C += AbstractC1997k8.m8592x((AbstractC1873c8) list.get(i11));
        }
        return m8587C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static int m8812F(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m8813G(list) + (size * AbstractC1997k8.m8587C(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static int m8813G(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1842a9) {
            C1842a9 c1842a9 = (C1842a9) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1997k8.m8594z(c1842a9.m8093g(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1997k8.m8594z(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static int m8814H(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC1997k8.m8588a(i10 << 3) + 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public static int m8815I(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public static int m8816J(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC1997k8.m8588a(i10 << 3) + 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public static int m8817K(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static int m8818L(int i10, List list, InterfaceC2059oa interfaceC2059oa) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += AbstractC1997k8.m8593y(i10, (InterfaceC1891da) list.get(i12), interfaceC2059oa);
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public static int m8819M(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m8820N(list) + (size * AbstractC1997k8.m8587C(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public static int m8820N(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1842a9) {
            C1842a9 c1842a9 = (C1842a9) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1997k8.m8594z(c1842a9.m8093g(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1997k8.m8594z(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public static int m8821O(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return m8822P(list) + (list.size() * AbstractC1997k8.m8587C(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public static int m8822P(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2133t9) {
            C2133t9 c2133t9 = (C2133t9) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1997k8.m8589b(c2133t9.mo8291a(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1997k8.m8589b(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public static int m8823Q(int i10, Object obj, InterfaceC2059oa interfaceC2059oa) {
        return AbstractC1997k8.m8588a(i10 << 3) + AbstractC1997k8.m8585A((InterfaceC1891da) obj, interfaceC2059oa);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public static int m8824R(int i10, List list, InterfaceC2059oa interfaceC2059oa) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m8587C = AbstractC1997k8.m8587C(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            m8587C += AbstractC1997k8.m8585A((InterfaceC1891da) list.get(i11), interfaceC2059oa);
        }
        return m8587C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public static int m8825S(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m8826T(list) + (size * AbstractC1997k8.m8587C(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public static int m8826T(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1842a9) {
            C1842a9 c1842a9 = (C1842a9) list;
            i10 = 0;
            while (i11 < size) {
                int m8093g = c1842a9.m8093g(i11);
                i10 += AbstractC1997k8.m8588a((m8093g >> 31) ^ (m8093g + m8093g));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i10 += AbstractC1997k8.m8588a((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public static int m8827U(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m8828V(list) + (size * AbstractC1997k8.m8587C(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public static int m8828V(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2133t9) {
            C2133t9 c2133t9 = (C2133t9) list;
            i10 = 0;
            while (i11 < size) {
                long mo8291a = c2133t9.mo8291a(i11);
                i10 += AbstractC1997k8.m8589b((mo8291a >> 63) ^ (mo8291a + mo8291a));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i10 += AbstractC1997k8.m8589b((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public static int m8829W(int i10, List list) {
        int m8586B;
        int m8586B2;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int m8587C = AbstractC1997k8.m8587C(i10) * size;
        if (list instanceof InterfaceC2013l9) {
            InterfaceC2013l9 interfaceC2013l9 = (InterfaceC2013l9) list;
            while (i11 < size) {
                Object mo8601m = interfaceC2013l9.mo8601m(i11);
                if (mo8601m instanceof AbstractC1873c8) {
                    m8586B2 = AbstractC1997k8.m8592x((AbstractC1873c8) mo8601m);
                } else {
                    m8586B2 = AbstractC1997k8.m8586B((String) mo8601m);
                }
                m8587C += m8586B2;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof AbstractC1873c8) {
                    m8586B = AbstractC1997k8.m8592x((AbstractC1873c8) obj);
                } else {
                    m8586B = AbstractC1997k8.m8586B((String) obj);
                }
                m8587C += m8586B;
                i11++;
            }
        }
        return m8587C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public static int m8830X(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m8831Y(list) + (size * AbstractC1997k8.m8587C(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public static int m8831Y(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1842a9) {
            C1842a9 c1842a9 = (C1842a9) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1997k8.m8588a(c1842a9.m8093g(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1997k8.m8588a(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z */
    public static int m8832Z(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m8834a0(list) + (size * AbstractC1997k8.m8587C(i10));
    }

    /* renamed from: a */
    public static AbstractC2149ua m8833a() {
        return f8025c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public static int m8834a0(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2133t9) {
            C2133t9 c2133t9 = (C2133t9) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1997k8.m8589b(c2133t9.mo8291a(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC1997k8.m8589b(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: b */
    public static AbstractC2149ua m8835b() {
        return f8026d;
    }

    /* renamed from: b0 */
    public static AbstractC2149ua m8836b0() {
        return f8024b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Object m8837c(int i10, List list, InterfaceC1874c9 interfaceC1874c9, Object obj, AbstractC2149ua abstractC2149ua) {
        if (interfaceC1874c9 == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                if (interfaceC1874c9.mo8087a(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    obj = m8838d(i10, intValue, obj, abstractC2149ua);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!interfaceC1874c9.mo8087a(intValue2)) {
                    obj = m8838d(i10, intValue2, obj, abstractC2149ua);
                    it.remove();
                }
            }
        }
        return obj;
    }

    /* renamed from: d */
    static Object m8838d(int i10, int i11, Object obj, AbstractC2149ua abstractC2149ua) {
        if (obj == null) {
            obj = abstractC2149ua.mo9015e();
        }
        abstractC2149ua.mo9016f(obj, i10, i11);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m8839e(AbstractC2072p8 abstractC2072p8, Object obj, Object obj2) {
        abstractC2072p8.mo8766a(obj2);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m8840f(AbstractC2149ua abstractC2149ua, Object obj, Object obj2) {
        abstractC2149ua.mo9018h(obj, abstractC2149ua.mo9014d(abstractC2149ua.mo9013c(obj), abstractC2149ua.mo9013c(obj2)));
    }

    /* renamed from: g */
    public static void m8841g(Class cls) {
        Class cls2;
        if (!AbstractC2222z8.class.isAssignableFrom(cls) && (cls2 = f8023a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    public static void m8842h(int i10, List list, InterfaceC2015lb interfaceC2015lb, boolean z10) {
        if (list != null && !list.isEmpty()) {
            interfaceC2015lb.mo8645i(i10, list, z10);
        }
    }

    /* renamed from: i */
    public static void m8843i(int i10, List list, InterfaceC2015lb interfaceC2015lb) {
        if (list != null && !list.isEmpty()) {
            interfaceC2015lb.mo8639c(i10, list);
        }
    }

    /* renamed from: j */
    public static void m8844j(int i10, List list, InterfaceC2015lb interfaceC2015lb, boolean z10) {
        if (list != null && !list.isEmpty()) {
            interfaceC2015lb.mo8628B(i10, list, z10);
        }
    }

    /* renamed from: k */
    public static void m8845k(int i10, List list, InterfaceC2015lb interfaceC2015lb, boolean z10) {
        if (list != null && !list.isEmpty()) {
            interfaceC2015lb.mo8651o(i10, list, z10);
        }
    }

    /* renamed from: l */
    public static void m8846l(int i10, List list, InterfaceC2015lb interfaceC2015lb, boolean z10) {
        if (list != null && !list.isEmpty()) {
            interfaceC2015lb.mo8648l(i10, list, z10);
        }
    }

    /* renamed from: m */
    public static void m8847m(int i10, List list, InterfaceC2015lb interfaceC2015lb, boolean z10) {
        if (list != null && !list.isEmpty()) {
            interfaceC2015lb.mo8656t(i10, list, z10);
        }
    }

    /* renamed from: n */
    public static void m8848n(int i10, List list, InterfaceC2015lb interfaceC2015lb, boolean z10) {
        if (list != null && !list.isEmpty()) {
            interfaceC2015lb.mo8631E(i10, list, z10);
        }
    }

    /* renamed from: o */
    public static void m8849o(int i10, List list, InterfaceC2015lb interfaceC2015lb, InterfaceC2059oa interfaceC2059oa) {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((C2012l8) interfaceC2015lb).mo8661y(i10, list.get(i11), interfaceC2059oa);
            }
        }
    }

    /* renamed from: p */
    public static void m8850p(int i10, List list, InterfaceC2015lb interfaceC2015lb, boolean z10) {
        if (list != null && !list.isEmpty()) {
            interfaceC2015lb.mo8649m(i10, list, z10);
        }
    }

    /* renamed from: q */
    public static void m8851q(int i10, List list, InterfaceC2015lb interfaceC2015lb, boolean z10) {
        if (list != null && !list.isEmpty()) {
            interfaceC2015lb.mo8660x(i10, list, z10);
        }
    }

    /* renamed from: r */
    public static void m8852r(int i10, List list, InterfaceC2015lb interfaceC2015lb, InterfaceC2059oa interfaceC2059oa) {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((C2012l8) interfaceC2015lb).mo8632F(i10, list.get(i11), interfaceC2059oa);
            }
        }
    }

    /* renamed from: s */
    public static void m8853s(int i10, List list, InterfaceC2015lb interfaceC2015lb, boolean z10) {
        if (list != null && !list.isEmpty()) {
            interfaceC2015lb.mo8627A(i10, list, z10);
        }
    }

    /* renamed from: t */
    public static void m8854t(int i10, List list, InterfaceC2015lb interfaceC2015lb, boolean z10) {
        if (list != null && !list.isEmpty()) {
            interfaceC2015lb.mo8638b(i10, list, z10);
        }
    }

    /* renamed from: u */
    public static void m8855u(int i10, List list, InterfaceC2015lb interfaceC2015lb, boolean z10) {
        if (list != null && !list.isEmpty()) {
            interfaceC2015lb.mo8659w(i10, list, z10);
        }
    }

    /* renamed from: v */
    public static void m8856v(int i10, List list, InterfaceC2015lb interfaceC2015lb, boolean z10) {
        if (list != null && !list.isEmpty()) {
            interfaceC2015lb.mo8634H(i10, list, z10);
        }
    }

    /* renamed from: w */
    public static void m8857w(int i10, List list, InterfaceC2015lb interfaceC2015lb) {
        if (list != null && !list.isEmpty()) {
            interfaceC2015lb.mo8654r(i10, list);
        }
    }

    /* renamed from: x */
    public static void m8858x(int i10, List list, InterfaceC2015lb interfaceC2015lb, boolean z10) {
        if (list != null && !list.isEmpty()) {
            interfaceC2015lb.mo8647k(i10, list, z10);
        }
    }

    /* renamed from: y */
    public static void m8859y(int i10, List list, InterfaceC2015lb interfaceC2015lb, boolean z10) {
        if (list != null && !list.isEmpty()) {
            interfaceC2015lb.mo8662z(i10, list, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public static boolean m8860z(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }
}
