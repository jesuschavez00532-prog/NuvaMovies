package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.d0 */
/* loaded from: classes.dex */
public abstract class AbstractC1881d0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static InterfaceC2078q m8196a(String str, C1912f c1912f, C2158v4 c2158v4, List list) {
        String str2;
        char c10;
        String str3;
        double min;
        AbstractC1973j abstractC1973j;
        switch (str.hashCode()) {
            case -1776922004:
                str2 = "toString";
                if (str.equals(str2)) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str2 = "toString";
                    c10 = 0;
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    str2 = "toString";
                    c10 = 2;
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    c10 = '\n';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c10 = 17;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    c10 = 3;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c10 = 6;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c10 = 19;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 107868:
                if (str.equals("map")) {
                    c10 = 7;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 111185:
                if (str.equals("pop")) {
                    c10 = '\b';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3267882:
                if (str.equals("join")) {
                    c10 = 5;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3452698:
                if (str.equals("push")) {
                    c10 = '\t';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3536116:
                if (str.equals("some")) {
                    c10 = 15;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c10 = 16;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 96891675:
                if (str.equals("every")) {
                    str2 = "toString";
                    c10 = 1;
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c10 = '\r';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c10 = 14;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c10 = 11;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c10 = '\f';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c10 = 4;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c10 = 65535;
                break;
            default:
                str2 = "toString";
                c10 = 65535;
                break;
        }
        double d10 = 0.0d;
        switch (c10) {
            case 0:
                InterfaceC2078q mo8349g = c1912f.mo8349g();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        InterfaceC2078q m9027b = c2158v4.m9027b((InterfaceC2078q) it.next());
                        if (!(m9027b instanceof C1943h)) {
                            C1912f c1912f2 = (C1912f) mo8349g;
                            int m8358t = c1912f2.m8358t();
                            if (m9027b instanceof C1912f) {
                                C1912f c1912f3 = (C1912f) m9027b;
                                Iterator m8361w = c1912f3.m8361w();
                                while (m8361w.hasNext()) {
                                    Integer num = (Integer) m8361w.next();
                                    c1912f2.m8346B(num.intValue() + m8358t, c1912f3.m8359u(num.intValue()));
                                }
                            } else {
                                c1912f2.m8346B(m8358t, m9027b);
                            }
                        } else {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                    }
                }
                return mo8349g;
            case 1:
                AbstractC2174w5.m9078h("every", 1, list);
                InterfaceC2078q m9027b2 = c2158v4.m9027b((InterfaceC2078q) list.get(0));
                if (m9027b2 instanceof C2063p) {
                    if (c1912f.m8358t() == 0) {
                        return InterfaceC2078q.f8007a0;
                    }
                    if (m8197b(c1912f, c2158v4, (C2063p) m9027b2, Boolean.FALSE, Boolean.TRUE).m8358t() != c1912f.m8358t()) {
                        return InterfaceC2078q.f8008b0;
                    }
                    return InterfaceC2078q.f8007a0;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 2:
                AbstractC2174w5.m9078h("filter", 1, list);
                InterfaceC2078q m9027b3 = c2158v4.m9027b((InterfaceC2078q) list.get(0));
                if (m9027b3 instanceof C2063p) {
                    if (c1912f.m8357q() == 0) {
                        return new C1912f();
                    }
                    InterfaceC2078q mo8349g2 = c1912f.mo8349g();
                    C1912f m8197b = m8197b(c1912f, c2158v4, (C2063p) m9027b3, null, Boolean.TRUE);
                    C1912f c1912f4 = new C1912f();
                    Iterator m8361w2 = m8197b.m8361w();
                    while (m8361w2.hasNext()) {
                        c1912f4.m8346B(c1912f4.m8358t(), ((C1912f) mo8349g2).m8359u(((Integer) m8361w2.next()).intValue()));
                    }
                    return c1912f4;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 3:
                AbstractC2174w5.m9078h("forEach", 1, list);
                InterfaceC2078q m9027b4 = c2158v4.m9027b((InterfaceC2078q) list.get(0));
                if (m9027b4 instanceof C2063p) {
                    if (c1912f.m8357q() == 0) {
                        return InterfaceC2078q.f8002Q;
                    }
                    m8197b(c1912f, c2158v4, (C2063p) m9027b4, null, null);
                    return InterfaceC2078q.f8002Q;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 4:
                AbstractC2174w5.m9080j("indexOf", 2, list);
                InterfaceC2078q interfaceC2078q = InterfaceC2078q.f8002Q;
                if (!list.isEmpty()) {
                    interfaceC2078q = c2158v4.m9027b((InterfaceC2078q) list.get(0));
                }
                if (list.size() > 1) {
                    double m9071a = AbstractC2174w5.m9071a(c2158v4.m9027b((InterfaceC2078q) list.get(1)).mo8350h().doubleValue());
                    if (m9071a >= c1912f.m8358t()) {
                        return new C1958i(Double.valueOf(-1.0d));
                    }
                    if (m9071a < 0.0d) {
                        double m8358t2 = c1912f.m8358t();
                        Double.isNaN(m8358t2);
                        d10 = m8358t2 + m9071a;
                    } else {
                        d10 = m9071a;
                    }
                }
                Iterator m8361w3 = c1912f.m8361w();
                while (m8361w3.hasNext()) {
                    int intValue = ((Integer) m8361w3.next()).intValue();
                    double d11 = intValue;
                    if (d11 >= d10 && AbstractC2174w5.m9082l(c1912f.m8359u(intValue), interfaceC2078q)) {
                        return new C1958i(Double.valueOf(d11));
                    }
                }
                return new C1958i(Double.valueOf(-1.0d));
            case 5:
                AbstractC2174w5.m9080j("join", 1, list);
                if (c1912f.m8358t() == 0) {
                    return InterfaceC2078q.f8009c0;
                }
                if (!list.isEmpty()) {
                    InterfaceC2078q m9027b5 = c2158v4.m9027b((InterfaceC2078q) list.get(0));
                    if (!(m9027b5 instanceof C2048o) && !(m9027b5 instanceof C2153v)) {
                        str3 = m9027b5.mo8351i();
                    } else {
                        str3 = "";
                    }
                } else {
                    str3 = ",";
                }
                return new C2138u(c1912f.m8360v(str3));
            case 6:
                AbstractC2174w5.m9080j("lastIndexOf", 2, list);
                InterfaceC2078q interfaceC2078q2 = InterfaceC2078q.f8002Q;
                if (!list.isEmpty()) {
                    interfaceC2078q2 = c2158v4.m9027b((InterfaceC2078q) list.get(0));
                }
                double m8358t3 = c1912f.m8358t() - 1;
                if (list.size() > 1) {
                    InterfaceC2078q m9027b6 = c2158v4.m9027b((InterfaceC2078q) list.get(1));
                    m8358t3 = Double.isNaN(m9027b6.mo8350h().doubleValue()) ? c1912f.m8358t() - 1 : AbstractC2174w5.m9071a(m9027b6.mo8350h().doubleValue());
                    if (m8358t3 < 0.0d) {
                        double m8358t4 = c1912f.m8358t();
                        Double.isNaN(m8358t4);
                        m8358t3 += m8358t4;
                    }
                }
                if (m8358t3 < 0.0d) {
                    return new C1958i(Double.valueOf(-1.0d));
                }
                for (int min2 = (int) Math.min(c1912f.m8358t(), m8358t3); min2 >= 0; min2--) {
                    if (c1912f.m8347C(min2) && AbstractC2174w5.m9082l(c1912f.m8359u(min2), interfaceC2078q2)) {
                        return new C1958i(Double.valueOf(min2));
                    }
                }
                return new C1958i(Double.valueOf(-1.0d));
            case 7:
                AbstractC2174w5.m9078h("map", 1, list);
                InterfaceC2078q m9027b7 = c2158v4.m9027b((InterfaceC2078q) list.get(0));
                if (m9027b7 instanceof C2063p) {
                    if (c1912f.m8358t() == 0) {
                        return new C1912f();
                    }
                    return m8197b(c1912f, c2158v4, (C2063p) m9027b7, null, null);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\b':
                AbstractC2174w5.m9078h("pop", 0, list);
                int m8358t5 = c1912f.m8358t();
                if (m8358t5 == 0) {
                    return InterfaceC2078q.f8002Q;
                }
                int i10 = m8358t5 - 1;
                InterfaceC2078q m8359u = c1912f.m8359u(i10);
                c1912f.m8345A(i10);
                return m8359u;
            case '\t':
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        c1912f.m8346B(c1912f.m8358t(), c2158v4.m9027b((InterfaceC2078q) it2.next()));
                    }
                }
                return new C1958i(Double.valueOf(c1912f.m8358t()));
            case '\n':
                return m8198c(c1912f, c2158v4, list, true);
            case 11:
                return m8198c(c1912f, c2158v4, list, false);
            case '\f':
                AbstractC2174w5.m9078h("reverse", 0, list);
                int m8358t6 = c1912f.m8358t();
                if (m8358t6 != 0) {
                    for (int i11 = 0; i11 < m8358t6 / 2; i11++) {
                        if (c1912f.m8347C(i11)) {
                            InterfaceC2078q m8359u2 = c1912f.m8359u(i11);
                            c1912f.m8346B(i11, null);
                            int i12 = (m8358t6 - 1) - i11;
                            if (c1912f.m8347C(i12)) {
                                c1912f.m8346B(i11, c1912f.m8359u(i12));
                            }
                            c1912f.m8346B(i12, m8359u2);
                        }
                    }
                }
                return c1912f;
            case '\r':
                AbstractC2174w5.m9078h("shift", 0, list);
                if (c1912f.m8358t() == 0) {
                    return InterfaceC2078q.f8002Q;
                }
                InterfaceC2078q m8359u3 = c1912f.m8359u(0);
                c1912f.m8345A(0);
                return m8359u3;
            case 14:
                AbstractC2174w5.m9080j("slice", 2, list);
                if (list.isEmpty()) {
                    return c1912f.mo8349g();
                }
                double m8358t7 = c1912f.m8358t();
                double m9071a2 = AbstractC2174w5.m9071a(c2158v4.m9027b((InterfaceC2078q) list.get(0)).mo8350h().doubleValue());
                if (m9071a2 < 0.0d) {
                    Double.isNaN(m8358t7);
                    min = Math.max(m9071a2 + m8358t7, 0.0d);
                } else {
                    min = Math.min(m9071a2, m8358t7);
                }
                if (list.size() == 2) {
                    double m9071a3 = AbstractC2174w5.m9071a(c2158v4.m9027b((InterfaceC2078q) list.get(1)).mo8350h().doubleValue());
                    if (m9071a3 < 0.0d) {
                        Double.isNaN(m8358t7);
                        m8358t7 = Math.max(m8358t7 + m9071a3, 0.0d);
                    } else {
                        m8358t7 = Math.min(m8358t7, m9071a3);
                    }
                }
                C1912f c1912f5 = new C1912f();
                for (int i13 = (int) min; i13 < m8358t7; i13++) {
                    c1912f5.m8346B(c1912f5.m8358t(), c1912f.m8359u(i13));
                }
                return c1912f5;
            case 15:
                AbstractC2174w5.m9078h("some", 1, list);
                InterfaceC2078q m9027b8 = c2158v4.m9027b((InterfaceC2078q) list.get(0));
                if (m9027b8 instanceof AbstractC1973j) {
                    if (c1912f.m8358t() == 0) {
                        return InterfaceC2078q.f8008b0;
                    }
                    AbstractC1973j abstractC1973j2 = (AbstractC1973j) m9027b8;
                    Iterator m8361w4 = c1912f.m8361w();
                    while (m8361w4.hasNext()) {
                        int intValue2 = ((Integer) m8361w4.next()).intValue();
                        if (c1912f.m8347C(intValue2) && abstractC1973j2.mo8107a(c2158v4, Arrays.asList(c1912f.m8359u(intValue2), new C1958i(Double.valueOf(intValue2)), c1912f)).mo8352j().booleanValue()) {
                            return InterfaceC2078q.f8007a0;
                        }
                    }
                    return InterfaceC2078q.f8008b0;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 16:
                AbstractC2174w5.m9080j("sort", 1, list);
                if (c1912f.m8358t() >= 2) {
                    List m8362x = c1912f.m8362x();
                    if (!list.isEmpty()) {
                        InterfaceC2078q m9027b9 = c2158v4.m9027b((InterfaceC2078q) list.get(0));
                        if (m9027b9 instanceof AbstractC1973j) {
                            abstractC1973j = (AbstractC1973j) m9027b9;
                        } else {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                    } else {
                        abstractC1973j = null;
                    }
                    Collections.sort(m8362x, new C1865c0(abstractC1973j, c2158v4));
                    c1912f.m8363y();
                    Iterator it3 = m8362x.iterator();
                    int i14 = 0;
                    while (it3.hasNext()) {
                        c1912f.m8346B(i14, (InterfaceC2078q) it3.next());
                        i14++;
                    }
                }
                return c1912f;
            case 17:
                if (list.isEmpty()) {
                    return new C1912f();
                }
                int m9071a4 = (int) AbstractC2174w5.m9071a(c2158v4.m9027b((InterfaceC2078q) list.get(0)).mo8350h().doubleValue());
                if (m9071a4 < 0) {
                    m9071a4 = Math.max(0, m9071a4 + c1912f.m8358t());
                } else if (m9071a4 > c1912f.m8358t()) {
                    m9071a4 = c1912f.m8358t();
                }
                int m8358t8 = c1912f.m8358t();
                C1912f c1912f6 = new C1912f();
                if (list.size() > 1) {
                    int max = Math.max(0, (int) AbstractC2174w5.m9071a(c2158v4.m9027b((InterfaceC2078q) list.get(1)).mo8350h().doubleValue()));
                    if (max > 0) {
                        for (int i15 = m9071a4; i15 < Math.min(m8358t8, m9071a4 + max); i15++) {
                            c1912f6.m8346B(c1912f6.m8358t(), c1912f.m8359u(m9071a4));
                            c1912f.m8345A(m9071a4);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i16 = 2; i16 < list.size(); i16++) {
                            InterfaceC2078q m9027b10 = c2158v4.m9027b((InterfaceC2078q) list.get(i16));
                            if (!(m9027b10 instanceof C1943h)) {
                                c1912f.m8364z((m9071a4 + i16) - 2, m9027b10);
                            } else {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                        }
                    }
                } else {
                    while (m9071a4 < m8358t8) {
                        c1912f6.m8346B(c1912f6.m8358t(), c1912f.m8359u(m9071a4));
                        c1912f.m8346B(m9071a4, null);
                        m9071a4++;
                    }
                }
                return c1912f6;
            case 18:
                AbstractC2174w5.m9078h(str2, 0, list);
                return new C2138u(c1912f.m8360v(","));
            case 19:
                if (!list.isEmpty()) {
                    C1912f c1912f7 = new C1912f();
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        InterfaceC2078q m9027b11 = c2158v4.m9027b((InterfaceC2078q) it4.next());
                        if (!(m9027b11 instanceof C1943h)) {
                            c1912f7.m8346B(c1912f7.m8358t(), m9027b11);
                        } else {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                    }
                    int m8358t9 = c1912f7.m8358t();
                    Iterator m8361w5 = c1912f.m8361w();
                    while (m8361w5.hasNext()) {
                        Integer num2 = (Integer) m8361w5.next();
                        c1912f7.m8346B(num2.intValue() + m8358t9, c1912f.m8359u(num2.intValue()));
                    }
                    c1912f.m8363y();
                    Iterator m8361w6 = c1912f7.m8361w();
                    while (m8361w6.hasNext()) {
                        Integer num3 = (Integer) m8361w6.next();
                        c1912f.m8346B(num3.intValue(), c1912f7.m8359u(num3.intValue()));
                    }
                }
                return new C1958i(Double.valueOf(c1912f.m8358t()));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    /* renamed from: b */
    private static C1912f m8197b(C1912f c1912f, C2158v4 c2158v4, AbstractC1973j abstractC1973j, Boolean bool, Boolean bool2) {
        C1912f c1912f2 = new C1912f();
        Iterator m8361w = c1912f.m8361w();
        while (m8361w.hasNext()) {
            int intValue = ((Integer) m8361w.next()).intValue();
            if (c1912f.m8347C(intValue)) {
                InterfaceC2078q mo8107a = abstractC1973j.mo8107a(c2158v4, Arrays.asList(c1912f.m8359u(intValue), new C1958i(Double.valueOf(intValue)), c1912f));
                if (mo8107a.mo8352j().equals(bool)) {
                    return c1912f2;
                }
                if (bool2 == null || mo8107a.mo8352j().equals(bool2)) {
                    c1912f2.m8346B(intValue, mo8107a);
                }
            }
        }
        return c1912f2;
    }

    /* renamed from: c */
    private static InterfaceC2078q m8198c(C1912f c1912f, C2158v4 c2158v4, List list, boolean z10) {
        InterfaceC2078q interfaceC2078q;
        int i10;
        int i11;
        AbstractC2174w5.m9079i("reduce", 1, list);
        AbstractC2174w5.m9080j("reduce", 2, list);
        InterfaceC2078q m9027b = c2158v4.m9027b((InterfaceC2078q) list.get(0));
        if (m9027b instanceof AbstractC1973j) {
            if (list.size() == 2) {
                interfaceC2078q = c2158v4.m9027b((InterfaceC2078q) list.get(1));
                if (interfaceC2078q instanceof C1943h) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            } else if (c1912f.m8358t() != 0) {
                interfaceC2078q = null;
            } else {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            AbstractC1973j abstractC1973j = (AbstractC1973j) m9027b;
            int m8358t = c1912f.m8358t();
            if (z10) {
                i10 = 0;
            } else {
                i10 = m8358t - 1;
            }
            int i12 = -1;
            if (z10) {
                i11 = m8358t - 1;
            } else {
                i11 = 0;
            }
            if (true == z10) {
                i12 = 1;
            }
            if (interfaceC2078q == null) {
                interfaceC2078q = c1912f.m8359u(i10);
                i10 += i12;
            }
            while ((i11 - i10) * i12 >= 0) {
                if (c1912f.m8347C(i10)) {
                    interfaceC2078q = abstractC1973j.mo8107a(c2158v4, Arrays.asList(interfaceC2078q, c1912f.m8359u(i10), new C1958i(Double.valueOf(i10)), c1912f));
                    if (interfaceC2078q instanceof C1943h) {
                        throw new IllegalStateException("Reduce operation failed");
                    }
                    i10 += i12;
                } else {
                    i10 += i12;
                }
            }
            return interfaceC2078q;
        }
        throw new IllegalArgumentException("Callback should be a method");
    }
}
