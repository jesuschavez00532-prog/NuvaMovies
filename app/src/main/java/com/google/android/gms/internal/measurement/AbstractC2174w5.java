package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.w5 */
/* loaded from: classes.dex */
public abstract class AbstractC2174w5 {
    /* renamed from: a */
    public static double m9071a(double d10) {
        int i10;
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (!Double.isInfinite(d10) && d10 != 0.0d && d10 != 0.0d) {
            if (d10 > 0.0d) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            double d11 = i10;
            double floor = Math.floor(Math.abs(d10));
            Double.isNaN(d11);
            return d11 * floor;
        }
        return d10;
    }

    /* renamed from: b */
    public static int m9072b(double d10) {
        int i10;
        if (!Double.isNaN(d10) && !Double.isInfinite(d10) && d10 != 0.0d) {
            if (d10 > 0.0d) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            double floor = Math.floor(Math.abs(d10));
            Double.isNaN(i10);
            return (int) ((r0 * floor) % 4.294967296E9d);
        }
        return 0;
    }

    /* renamed from: c */
    public static int m9073c(C2158v4 c2158v4) {
        int m9072b = m9072b(c2158v4.m9029d("runtime.counter").mo8350h().doubleValue() + 1.0d);
        if (m9072b <= 1000000) {
            c2158v4.m9032g("runtime.counter", new C1958i(Double.valueOf(m9072b)));
            return m9072b;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    /* renamed from: d */
    public static long m9074d(double d10) {
        return m9072b(d10) & 4294967295L;
    }

    /* renamed from: e */
    public static EnumC2034n0 m9075e(String str) {
        EnumC2034n0 enumC2034n0 = null;
        if (str != null && !str.isEmpty()) {
            enumC2034n0 = EnumC2034n0.m8713a(Integer.parseInt(str));
        }
        if (enumC2034n0 != null) {
            return enumC2034n0;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    /* renamed from: f */
    public static Object m9076f(InterfaceC2078q interfaceC2078q) {
        if (InterfaceC2078q.f8003R.equals(interfaceC2078q)) {
            return null;
        }
        if (InterfaceC2078q.f8002Q.equals(interfaceC2078q)) {
            return "";
        }
        if (interfaceC2078q instanceof C2033n) {
            return m9077g((C2033n) interfaceC2078q);
        }
        if (interfaceC2078q instanceof C1912f) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((C1912f) interfaceC2078q).iterator();
            while (it.hasNext()) {
                Object m9076f = m9076f((InterfaceC2078q) it.next());
                if (m9076f != null) {
                    arrayList.add(m9076f);
                }
            }
            return arrayList;
        }
        if (!interfaceC2078q.mo8350h().isNaN()) {
            return interfaceC2078q.mo8350h();
        }
        return interfaceC2078q.mo8351i();
    }

    /* renamed from: g */
    public static Map m9077g(C2033n c2033n) {
        HashMap hashMap = new HashMap();
        for (String str : c2033n.m8712a()) {
            Object m9076f = m9076f(c2033n.mo8356p(str));
            if (m9076f != null) {
                hashMap.put(str, m9076f);
            }
        }
        return hashMap;
    }

    /* renamed from: h */
    public static void m9078h(String str, int i10, List list) {
        if (list.size() == i10) {
        } else {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    /* renamed from: i */
    public static void m9079i(String str, int i10, List list) {
        if (list.size() >= i10) {
        } else {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    /* renamed from: j */
    public static void m9080j(String str, int i10, List list) {
        if (list.size() <= i10) {
        } else {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    /* renamed from: k */
    public static boolean m9081k(InterfaceC2078q interfaceC2078q) {
        if (interfaceC2078q == null) {
            return false;
        }
        Double mo8350h = interfaceC2078q.mo8350h();
        if (mo8350h.isNaN() || mo8350h.doubleValue() < 0.0d || !mo8350h.equals(Double.valueOf(Math.floor(mo8350h.doubleValue())))) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m9082l(InterfaceC2078q interfaceC2078q, InterfaceC2078q interfaceC2078q2) {
        if (!interfaceC2078q.getClass().equals(interfaceC2078q2.getClass())) {
            return false;
        }
        if ((interfaceC2078q instanceof C2153v) || (interfaceC2078q instanceof C2048o)) {
            return true;
        }
        if (interfaceC2078q instanceof C1958i) {
            if (Double.isNaN(interfaceC2078q.mo8350h().doubleValue()) || Double.isNaN(interfaceC2078q2.mo8350h().doubleValue())) {
                return false;
            }
            return interfaceC2078q.mo8350h().equals(interfaceC2078q2.mo8350h());
        }
        if (interfaceC2078q instanceof C2138u) {
            return interfaceC2078q.mo8351i().equals(interfaceC2078q2.mo8351i());
        }
        if (interfaceC2078q instanceof C1928g) {
            return interfaceC2078q.mo8352j().equals(interfaceC2078q2.mo8352j());
        }
        if (interfaceC2078q != interfaceC2078q2) {
            return false;
        }
        return true;
    }
}
