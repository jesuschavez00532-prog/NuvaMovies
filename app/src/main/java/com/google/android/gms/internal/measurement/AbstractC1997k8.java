package com.google.android.gms.internal.measurement;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.k8 */
/* loaded from: classes.dex */
public abstract class AbstractC1997k8 extends AbstractC2101r7 {

    /* renamed from: b */
    private static final Logger f7850b = Logger.getLogger(AbstractC1997k8.class.getName());

    /* renamed from: c */
    private static final boolean f7851c = AbstractC1908eb.m8296C();

    /* renamed from: a */
    C2012l8 f7852a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ AbstractC1997k8(AbstractC1982j8 abstractC1982j8) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static int m8585A(InterfaceC1891da interfaceC1891da, InterfaceC2059oa interfaceC2059oa) {
        AbstractC2026m7 abstractC2026m7 = (AbstractC2026m7) interfaceC1891da;
        int mo8702g = abstractC2026m7.mo8702g();
        if (mo8702g == -1) {
            mo8702g = interfaceC2059oa.mo8465f(abstractC2026m7);
            abstractC2026m7.mo8703i(mo8702g);
        }
        return m8588a(mo8702g) + mo8702g;
    }

    /* renamed from: B */
    public static int m8586B(String str) {
        int length;
        try {
            length = AbstractC2000kb.m8605c(str);
        } catch (C1985jb unused) {
            length = str.getBytes(AbstractC1938g9.f7766b).length;
        }
        return m8588a(length) + length;
    }

    /* renamed from: C */
    public static int m8587C(int i10) {
        return m8588a(i10 << 3);
    }

    /* renamed from: a */
    public static int m8588a(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    /* renamed from: b */
    public static int m8589b(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    /* renamed from: c */
    public static AbstractC1997k8 m8590c(byte[] bArr) {
        return new C1952h8(bArr, 0, bArr.length);
    }

    /* renamed from: x */
    public static int m8592x(AbstractC1873c8 abstractC1873c8) {
        int mo8182i = abstractC1873c8.mo8182i();
        return m8588a(mo8182i) + mo8182i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static int m8593y(int i10, InterfaceC1891da interfaceC1891da, InterfaceC2059oa interfaceC2059oa) {
        int m8588a = m8588a(i10 << 3);
        int i11 = m8588a + m8588a;
        AbstractC2026m7 abstractC2026m7 = (AbstractC2026m7) interfaceC1891da;
        int mo8702g = abstractC2026m7.mo8702g();
        if (mo8702g == -1) {
            mo8702g = interfaceC2059oa.mo8465f(abstractC2026m7);
            abstractC2026m7.mo8703i(mo8702g);
        }
        return i11 + mo8702g;
    }

    /* renamed from: z */
    public static int m8594z(int i10) {
        if (i10 >= 0) {
            return m8588a(i10);
        }
        return 10;
    }

    /* renamed from: d */
    public final void m8595d() {
        if (mo8500g() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m8596e(String str, C1985jb c1985jb) {
        f7850b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c1985jb);
        byte[] bytes = str.getBytes(AbstractC1938g9.f7766b);
        try {
            int length = bytes.length;
            mo8514u(length);
            mo8510q(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new C1967i8(e10);
        }
    }

    /* renamed from: g */
    public abstract int mo8500g();

    /* renamed from: h */
    public abstract void mo8501h(byte b10);

    /* renamed from: i */
    public abstract void mo8502i(int i10, boolean z10);

    /* renamed from: j */
    public abstract void mo8503j(int i10, AbstractC1873c8 abstractC1873c8);

    /* renamed from: k */
    public abstract void mo8504k(int i10, int i11);

    /* renamed from: l */
    public abstract void mo8505l(int i10);

    /* renamed from: m */
    public abstract void mo8506m(int i10, long j10);

    /* renamed from: n */
    public abstract void mo8507n(long j10);

    /* renamed from: o */
    public abstract void mo8508o(int i10, int i11);

    /* renamed from: p */
    public abstract void mo8509p(int i10);

    /* renamed from: q */
    public abstract void mo8510q(byte[] bArr, int i10, int i11);

    /* renamed from: r */
    public abstract void mo8511r(int i10, String str);

    /* renamed from: s */
    public abstract void mo8512s(int i10, int i11);

    /* renamed from: t */
    public abstract void mo8513t(int i10, int i11);

    /* renamed from: u */
    public abstract void mo8514u(int i10);

    /* renamed from: v */
    public abstract void mo8515v(int i10, long j10);

    /* renamed from: w */
    public abstract void mo8516w(long j10);
}
