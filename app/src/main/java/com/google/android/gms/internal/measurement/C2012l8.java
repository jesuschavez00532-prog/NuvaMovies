package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.l8 */
/* loaded from: classes.dex */
final class C2012l8 implements InterfaceC2015lb {

    /* renamed from: a */
    private final AbstractC1997k8 f7869a;

    private C2012l8(AbstractC1997k8 abstractC1997k8) {
        AbstractC1938g9.m8419f(abstractC1997k8, "output");
        this.f7869a = abstractC1997k8;
        abstractC1997k8.f7852a = this;
    }

    /* renamed from: K */
    public static C2012l8 m8626K(AbstractC1997k8 abstractC1997k8) {
        C2012l8 c2012l8 = abstractC1997k8.f7852a;
        if (c2012l8 != null) {
            return c2012l8;
        }
        return new C2012l8(abstractC1997k8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: A */
    public final void mo8627A(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f7869a.mo8512s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            this.f7869a.mo8514u(i12);
            while (i11 < list.size()) {
                this.f7869a.mo8505l(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7869a.mo8504k(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: B */
    public final void mo8628B(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f7869a.mo8512s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).doubleValue();
                i12 += 8;
            }
            this.f7869a.mo8514u(i12);
            while (i11 < list.size()) {
                this.f7869a.mo8507n(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7869a.mo8506m(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: C */
    public final void mo8629C(int i10, long j10) {
        this.f7869a.mo8515v(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: D */
    public final void mo8630D(int i10) {
        this.f7869a.mo8512s(i10, 3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: E */
    public final void mo8631E(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f7869a.mo8512s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).floatValue();
                i12 += 4;
            }
            this.f7869a.mo8514u(i12);
            while (i11 < list.size()) {
                this.f7869a.mo8505l(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7869a.mo8504k(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: F */
    public final void mo8632F(int i10, Object obj, InterfaceC2059oa interfaceC2059oa) {
        Object obj2 = (InterfaceC1891da) obj;
        C1952h8 c1952h8 = (C1952h8) this.f7869a;
        c1952h8.mo8514u((i10 << 3) | 2);
        AbstractC2026m7 abstractC2026m7 = (AbstractC2026m7) obj2;
        int mo8702g = abstractC2026m7.mo8702g();
        if (mo8702g == -1) {
            mo8702g = interfaceC2059oa.mo8465f(abstractC2026m7);
            abstractC2026m7.mo8703i(mo8702g);
        }
        c1952h8.mo8514u(mo8702g);
        interfaceC2059oa.mo8464e(obj2, c1952h8.f7852a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: G */
    public final void mo8633G(int i10, long j10) {
        this.f7869a.mo8506m(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: H */
    public final void mo8634H(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f7869a.mo8512s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                long longValue = ((Long) list.get(i13)).longValue();
                i12 += AbstractC1997k8.m8589b((longValue >> 63) ^ (longValue + longValue));
            }
            this.f7869a.mo8514u(i12);
            while (i11 < list.size()) {
                AbstractC1997k8 abstractC1997k8 = this.f7869a;
                long longValue2 = ((Long) list.get(i11)).longValue();
                abstractC1997k8.mo8516w((longValue2 >> 63) ^ (longValue2 + longValue2));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            AbstractC1997k8 abstractC1997k82 = this.f7869a;
            long longValue3 = ((Long) list.get(i11)).longValue();
            abstractC1997k82.mo8515v(i10, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: I */
    public final void mo8635I(int i10, long j10) {
        this.f7869a.mo8515v(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: J */
    public final void mo8636J(int i10) {
        this.f7869a.mo8512s(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: a */
    public final void mo8637a(int i10, int i11) {
        this.f7869a.mo8513t(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: b */
    public final void mo8638b(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f7869a.mo8512s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            this.f7869a.mo8514u(i12);
            while (i11 < list.size()) {
                this.f7869a.mo8507n(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7869a.mo8506m(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: c */
    public final void mo8639c(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f7869a.mo8503j(i10, (AbstractC1873c8) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: d */
    public final void mo8640d(int i10, int i11) {
        this.f7869a.mo8504k(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: e */
    public final void mo8641e(int i10, boolean z10) {
        this.f7869a.mo8502i(i10, z10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: f */
    public final void mo8642f(int i10, int i11) {
        this.f7869a.mo8513t(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: g */
    public final void mo8643g(int i10, String str) {
        this.f7869a.mo8511r(i10, str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: h */
    public final void mo8644h(int i10, long j10) {
        this.f7869a.mo8515v(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: i */
    public final void mo8645i(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f7869a.mo8512s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).booleanValue();
                i12++;
            }
            this.f7869a.mo8514u(i12);
            while (i11 < list.size()) {
                this.f7869a.mo8501h(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7869a.mo8502i(i10, ((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: j */
    public final void mo8646j(int i10, long j10) {
        this.f7869a.mo8506m(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: k */
    public final void mo8647k(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f7869a.mo8512s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += AbstractC1997k8.m8588a(((Integer) list.get(i13)).intValue());
            }
            this.f7869a.mo8514u(i12);
            while (i11 < list.size()) {
                this.f7869a.mo8514u(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7869a.mo8513t(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: l */
    public final void mo8648l(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f7869a.mo8512s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            this.f7869a.mo8514u(i12);
            while (i11 < list.size()) {
                this.f7869a.mo8505l(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7869a.mo8504k(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: m */
    public final void mo8649m(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f7869a.mo8512s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += AbstractC1997k8.m8594z(((Integer) list.get(i13)).intValue());
            }
            this.f7869a.mo8514u(i12);
            while (i11 < list.size()) {
                this.f7869a.mo8509p(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7869a.mo8508o(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: n */
    public final void mo8650n(int i10, int i11) {
        this.f7869a.mo8508o(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: o */
    public final void mo8651o(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f7869a.mo8512s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += AbstractC1997k8.m8594z(((Integer) list.get(i13)).intValue());
            }
            this.f7869a.mo8514u(i12);
            while (i11 < list.size()) {
                this.f7869a.mo8509p(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7869a.mo8508o(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: p */
    public final void mo8652p(int i10, int i11) {
        this.f7869a.mo8508o(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: q */
    public final void mo8653q(int i10, AbstractC1873c8 abstractC1873c8) {
        this.f7869a.mo8503j(i10, abstractC1873c8);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: r */
    public final void mo8654r(int i10, List list) {
        int i11 = 0;
        if (list instanceof InterfaceC2013l9) {
            InterfaceC2013l9 interfaceC2013l9 = (InterfaceC2013l9) list;
            while (i11 < list.size()) {
                Object mo8601m = interfaceC2013l9.mo8601m(i11);
                if (mo8601m instanceof String) {
                    this.f7869a.mo8511r(i10, (String) mo8601m);
                } else {
                    this.f7869a.mo8503j(i10, (AbstractC1873c8) mo8601m);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7869a.mo8511r(i10, (String) list.get(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: s */
    public final void mo8655s(int i10, double d10) {
        this.f7869a.mo8506m(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: t */
    public final void mo8656t(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f7869a.mo8512s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            this.f7869a.mo8514u(i12);
            while (i11 < list.size()) {
                this.f7869a.mo8507n(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7869a.mo8506m(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: u */
    public final void mo8657u(int i10, int i11) {
        this.f7869a.mo8504k(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: v */
    public final void mo8658v(int i10, float f10) {
        this.f7869a.mo8504k(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: w */
    public final void mo8659w(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f7869a.mo8512s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue = ((Integer) list.get(i13)).intValue();
                i12 += AbstractC1997k8.m8588a((intValue >> 31) ^ (intValue + intValue));
            }
            this.f7869a.mo8514u(i12);
            while (i11 < list.size()) {
                AbstractC1997k8 abstractC1997k8 = this.f7869a;
                int intValue2 = ((Integer) list.get(i11)).intValue();
                abstractC1997k8.mo8514u((intValue2 >> 31) ^ (intValue2 + intValue2));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            AbstractC1997k8 abstractC1997k82 = this.f7869a;
            int intValue3 = ((Integer) list.get(i11)).intValue();
            abstractC1997k82.mo8513t(i10, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: x */
    public final void mo8660x(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f7869a.mo8512s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += AbstractC1997k8.m8589b(((Long) list.get(i13)).longValue());
            }
            this.f7869a.mo8514u(i12);
            while (i11 < list.size()) {
                this.f7869a.mo8516w(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7869a.mo8515v(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: y */
    public final void mo8661y(int i10, Object obj, InterfaceC2059oa interfaceC2059oa) {
        AbstractC1997k8 abstractC1997k8 = this.f7869a;
        abstractC1997k8.mo8512s(i10, 3);
        interfaceC2059oa.mo8464e((InterfaceC1891da) obj, abstractC1997k8.f7852a);
        abstractC1997k8.mo8512s(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2015lb
    /* renamed from: z */
    public final void mo8662z(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.f7869a.mo8512s(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += AbstractC1997k8.m8589b(((Long) list.get(i13)).longValue());
            }
            this.f7869a.mo8514u(i12);
            while (i11 < list.size()) {
                this.f7869a.mo8516w(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f7869a.mo8515v(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }
}
