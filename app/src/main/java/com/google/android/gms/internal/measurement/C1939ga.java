package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.AbstractC0272b;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.ga */
/* loaded from: classes.dex */
public final class C1939ga implements InterfaceC2059oa {

    /* renamed from: p */
    private static final int[] f7771p = new int[0];

    /* renamed from: q */
    private static final Unsafe f7772q = AbstractC1908eb.m8310l();

    /* renamed from: a */
    private final int[] f7773a;

    /* renamed from: b */
    private final Object[] f7774b;

    /* renamed from: c */
    private final int f7775c;

    /* renamed from: d */
    private final int f7776d;

    /* renamed from: e */
    private final InterfaceC1891da f7777e;

    /* renamed from: f */
    private final boolean f7778f;

    /* renamed from: g */
    private final boolean f7779g;

    /* renamed from: h */
    private final int[] f7780h;

    /* renamed from: i */
    private final int f7781i;

    /* renamed from: j */
    private final int f7782j;

    /* renamed from: k */
    private final AbstractC2103r9 f7783k;

    /* renamed from: l */
    private final AbstractC2149ua f7784l;

    /* renamed from: m */
    private final AbstractC2072p8 f7785m;

    /* renamed from: n */
    private final C1969ia f7786n;

    /* renamed from: o */
    private final C2208y9 f7787o;

    private C1939ga(int[] iArr, Object[] objArr, int i10, int i11, InterfaceC1891da interfaceC1891da, boolean z10, boolean z11, int[] iArr2, int i12, int i13, C1969ia c1969ia, AbstractC2103r9 abstractC2103r9, AbstractC2149ua abstractC2149ua, AbstractC2072p8 abstractC2072p8, C2208y9 c2208y9, byte[] bArr) {
        this.f7773a = iArr;
        this.f7774b = objArr;
        this.f7775c = i10;
        this.f7776d = i11;
        this.f7779g = z10;
        boolean z12 = false;
        if (abstractC2072p8 != null && abstractC2072p8.mo8768c(interfaceC1891da)) {
            z12 = true;
        }
        this.f7778f = z12;
        this.f7780h = iArr2;
        this.f7781i = i12;
        this.f7782j = i13;
        this.f7786n = c1969ia;
        this.f7783k = abstractC2103r9;
        this.f7784l = abstractC2149ua;
        this.f7785m = abstractC2072p8;
        this.f7777e = interfaceC1891da;
        this.f7787o = c2208y9;
    }

    /* renamed from: A */
    private final boolean m8423A(Object obj, int i10, int i11) {
        if (AbstractC1908eb.m8306h(obj, m8440S(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    private static boolean m8424B(Object obj, long j10) {
        return ((Boolean) AbstractC1908eb.m8309k(obj, j10)).booleanValue();
    }

    /* renamed from: C */
    private static final void m8425C(int i10, Object obj, InterfaceC2015lb interfaceC2015lb) {
        if (obj instanceof String) {
            interfaceC2015lb.mo8643g(i10, (String) obj);
        } else {
            interfaceC2015lb.mo8653q(i10, (AbstractC1873c8) obj);
        }
    }

    /* renamed from: E */
    static C2164va m8426E(Object obj) {
        AbstractC2222z8 abstractC2222z8 = (AbstractC2222z8) obj;
        C2164va c2164va = abstractC2222z8.zzc;
        if (c2164va == C2164va.m9045c()) {
            C2164va m9047e = C2164va.m9047e();
            abstractC2222z8.zzc = m9047e;
            return m9047e;
        }
        return c2164va;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static C1939ga m8427F(Class cls, InterfaceC1843aa interfaceC1843aa, C1969ia c1969ia, AbstractC2103r9 abstractC2103r9, AbstractC2149ua abstractC2149ua, AbstractC2072p8 abstractC2072p8, C2208y9 c2208y9) {
        if (interfaceC1843aa instanceof C2044na) {
            return m8428G((C2044na) interfaceC1843aa, c1969ia, abstractC2103r9, abstractC2149ua, abstractC2072p8, c2208y9);
        }
        AbstractC0272b.m941a(interfaceC1843aa);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0260  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.gms.internal.measurement.C1939ga m8428G(com.google.android.gms.internal.measurement.C2044na r34, com.google.android.gms.internal.measurement.C1969ia r35, com.google.android.gms.internal.measurement.AbstractC2103r9 r36, com.google.android.gms.internal.measurement.AbstractC2149ua r37, com.google.android.gms.internal.measurement.AbstractC2072p8 r38, com.google.android.gms.internal.measurement.C2208y9 r39) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1939ga.m8428G(com.google.android.gms.internal.measurement.na, com.google.android.gms.internal.measurement.ia, com.google.android.gms.internal.measurement.r9, com.google.android.gms.internal.measurement.ua, com.google.android.gms.internal.measurement.p8, com.google.android.gms.internal.measurement.y9):com.google.android.gms.internal.measurement.ga");
    }

    /* renamed from: H */
    private static double m8429H(Object obj, long j10) {
        return ((Double) AbstractC1908eb.m8309k(obj, j10)).doubleValue();
    }

    /* renamed from: I */
    private static float m8430I(Object obj, long j10) {
        return ((Float) AbstractC1908eb.m8309k(obj, j10)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x003c. Please report as an issue. */
    /* renamed from: J */
    private final int m8431J(Object obj) {
        int i10;
        int m8588a;
        int m8588a2;
        int m8588a3;
        int m8589b;
        int m8588a4;
        int m8594z;
        int m8588a5;
        int m8588a6;
        int mo8182i;
        int m8588a7;
        int i11;
        int m8829W;
        int m8817K;
        int m8587C;
        int m8588a8;
        int i12;
        int m8588a9;
        int m8588a10;
        int m8588a11;
        int m8589b2;
        int m8588a12;
        int mo8182i2;
        int m8588a13;
        int i13;
        Unsafe unsafe = f7772q;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1048575;
        while (i15 < this.f7773a.length) {
            int m8443k = m8443k(i15);
            int[] iArr = this.f7773a;
            int i19 = iArr[i15];
            int m8442j = m8442j(m8443k);
            if (m8442j <= 17) {
                int i20 = iArr[i15 + 2];
                int i21 = i20 & i14;
                i10 = 1 << (i20 >>> 20);
                if (i21 != i18) {
                    i17 = unsafe.getInt(obj, i21);
                    i18 = i21;
                }
            } else {
                i10 = 0;
            }
            long j10 = m8443k & i14;
            switch (m8442j) {
                case 0:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        m8588a = AbstractC1997k8.m8588a(i19 << 3);
                        m8588a5 = m8588a + 8;
                        i16 += m8588a5;
                        break;
                    }
                case 1:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        m8588a2 = AbstractC1997k8.m8588a(i19 << 3);
                        m8588a5 = m8588a2 + 4;
                        i16 += m8588a5;
                        break;
                    }
                case 2:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        long j11 = unsafe.getLong(obj, j10);
                        m8588a3 = AbstractC1997k8.m8588a(i19 << 3);
                        m8589b = AbstractC1997k8.m8589b(j11);
                        i16 += m8588a3 + m8589b;
                        break;
                    }
                case 3:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        long j12 = unsafe.getLong(obj, j10);
                        m8588a3 = AbstractC1997k8.m8588a(i19 << 3);
                        m8589b = AbstractC1997k8.m8589b(j12);
                        i16 += m8588a3 + m8589b;
                        break;
                    }
                case 4:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        int i22 = unsafe.getInt(obj, j10);
                        m8588a4 = AbstractC1997k8.m8588a(i19 << 3);
                        m8594z = AbstractC1997k8.m8594z(i22);
                        i11 = m8588a4 + m8594z;
                        i16 += i11;
                        break;
                    }
                case 5:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        m8588a = AbstractC1997k8.m8588a(i19 << 3);
                        m8588a5 = m8588a + 8;
                        i16 += m8588a5;
                        break;
                    }
                case 6:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        m8588a2 = AbstractC1997k8.m8588a(i19 << 3);
                        m8588a5 = m8588a2 + 4;
                        i16 += m8588a5;
                        break;
                    }
                case 7:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        m8588a5 = AbstractC1997k8.m8588a(i19 << 3) + 1;
                        i16 += m8588a5;
                        break;
                    }
                case 8:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof AbstractC1873c8) {
                            m8588a6 = AbstractC1997k8.m8588a(i19 << 3);
                            mo8182i = ((AbstractC1873c8) object).mo8182i();
                            m8588a7 = AbstractC1997k8.m8588a(mo8182i);
                            i11 = m8588a6 + m8588a7 + mo8182i;
                            i16 += i11;
                            break;
                        } else {
                            m8588a4 = AbstractC1997k8.m8588a(i19 << 3);
                            m8594z = AbstractC1997k8.m8586B((String) object);
                            i11 = m8588a4 + m8594z;
                            i16 += i11;
                        }
                    }
                case 9:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        m8588a5 = AbstractC2089qa.m8823Q(i19, unsafe.getObject(obj, j10), m8446n(i15));
                        i16 += m8588a5;
                        break;
                    }
                case 10:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        AbstractC1873c8 abstractC1873c8 = (AbstractC1873c8) unsafe.getObject(obj, j10);
                        m8588a6 = AbstractC1997k8.m8588a(i19 << 3);
                        mo8182i = abstractC1873c8.mo8182i();
                        m8588a7 = AbstractC1997k8.m8588a(mo8182i);
                        i11 = m8588a6 + m8588a7 + mo8182i;
                        i16 += i11;
                        break;
                    }
                case 11:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        int i23 = unsafe.getInt(obj, j10);
                        m8588a4 = AbstractC1997k8.m8588a(i19 << 3);
                        m8594z = AbstractC1997k8.m8588a(i23);
                        i11 = m8588a4 + m8594z;
                        i16 += i11;
                        break;
                    }
                case 12:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        int i24 = unsafe.getInt(obj, j10);
                        m8588a4 = AbstractC1997k8.m8588a(i19 << 3);
                        m8594z = AbstractC1997k8.m8594z(i24);
                        i11 = m8588a4 + m8594z;
                        i16 += i11;
                        break;
                    }
                case 13:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        m8588a2 = AbstractC1997k8.m8588a(i19 << 3);
                        m8588a5 = m8588a2 + 4;
                        i16 += m8588a5;
                        break;
                    }
                case 14:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        m8588a = AbstractC1997k8.m8588a(i19 << 3);
                        m8588a5 = m8588a + 8;
                        i16 += m8588a5;
                        break;
                    }
                case 15:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        int i25 = unsafe.getInt(obj, j10);
                        m8588a4 = AbstractC1997k8.m8588a(i19 << 3);
                        m8594z = AbstractC1997k8.m8588a((i25 >> 31) ^ (i25 + i25));
                        i11 = m8588a4 + m8594z;
                        i16 += i11;
                        break;
                    }
                case 16:
                    if ((i10 & i17) == 0) {
                        break;
                    } else {
                        long j13 = unsafe.getLong(obj, j10);
                        i16 += AbstractC1997k8.m8588a(i19 << 3) + AbstractC1997k8.m8589b((j13 >> 63) ^ (j13 + j13));
                        break;
                    }
                case 17:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        m8588a5 = AbstractC1997k8.m8593y(i19, (InterfaceC1891da) unsafe.getObject(obj, j10), m8446n(i15));
                        i16 += m8588a5;
                        break;
                    }
                case 18:
                    m8588a5 = AbstractC2089qa.m8816J(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += m8588a5;
                    break;
                case 19:
                    m8588a5 = AbstractC2089qa.m8814H(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += m8588a5;
                    break;
                case 20:
                    m8588a5 = AbstractC2089qa.m8821O(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += m8588a5;
                    break;
                case 21:
                    m8588a5 = AbstractC2089qa.m8832Z(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += m8588a5;
                    break;
                case 22:
                    m8588a5 = AbstractC2089qa.m8819M(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += m8588a5;
                    break;
                case 23:
                    m8588a5 = AbstractC2089qa.m8816J(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += m8588a5;
                    break;
                case 24:
                    m8588a5 = AbstractC2089qa.m8814H(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += m8588a5;
                    break;
                case 25:
                    m8588a5 = AbstractC2089qa.m8807A(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += m8588a5;
                    break;
                case 26:
                    m8829W = AbstractC2089qa.m8829W(i19, (List) unsafe.getObject(obj, j10));
                    i16 += m8829W;
                    break;
                case 27:
                    m8829W = AbstractC2089qa.m8824R(i19, (List) unsafe.getObject(obj, j10), m8446n(i15));
                    i16 += m8829W;
                    break;
                case 28:
                    m8829W = AbstractC2089qa.m8811E(i19, (List) unsafe.getObject(obj, j10));
                    i16 += m8829W;
                    break;
                case 29:
                    m8829W = AbstractC2089qa.m8830X(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += m8829W;
                    break;
                case 30:
                    m8829W = AbstractC2089qa.m8812F(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += m8829W;
                    break;
                case 31:
                    m8829W = AbstractC2089qa.m8814H(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += m8829W;
                    break;
                case 32:
                    m8829W = AbstractC2089qa.m8816J(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += m8829W;
                    break;
                case 33:
                    m8829W = AbstractC2089qa.m8825S(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += m8829W;
                    break;
                case 34:
                    m8829W = AbstractC2089qa.m8827U(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += m8829W;
                    break;
                case 35:
                    m8817K = AbstractC2089qa.m8817K((List) unsafe.getObject(obj, j10));
                    if (m8817K > 0) {
                        m8587C = AbstractC1997k8.m8587C(i19);
                        m8588a8 = AbstractC1997k8.m8588a(m8817K);
                        i12 = m8587C + m8588a8;
                        i13 = i12 + m8817K;
                        i16 += i13;
                    }
                    break;
                case 36:
                    m8817K = AbstractC2089qa.m8815I((List) unsafe.getObject(obj, j10));
                    if (m8817K > 0) {
                        m8587C = AbstractC1997k8.m8587C(i19);
                        m8588a8 = AbstractC1997k8.m8588a(m8817K);
                        i12 = m8587C + m8588a8;
                        i13 = i12 + m8817K;
                        i16 += i13;
                    }
                    break;
                case 37:
                    m8817K = AbstractC2089qa.m8822P((List) unsafe.getObject(obj, j10));
                    if (m8817K > 0) {
                        m8587C = AbstractC1997k8.m8587C(i19);
                        m8588a8 = AbstractC1997k8.m8588a(m8817K);
                        i12 = m8587C + m8588a8;
                        i13 = i12 + m8817K;
                        i16 += i13;
                    }
                    break;
                case 38:
                    m8817K = AbstractC2089qa.m8834a0((List) unsafe.getObject(obj, j10));
                    if (m8817K > 0) {
                        m8587C = AbstractC1997k8.m8587C(i19);
                        m8588a8 = AbstractC1997k8.m8588a(m8817K);
                        i12 = m8587C + m8588a8;
                        i13 = i12 + m8817K;
                        i16 += i13;
                    }
                    break;
                case 39:
                    m8817K = AbstractC2089qa.m8820N((List) unsafe.getObject(obj, j10));
                    if (m8817K > 0) {
                        m8587C = AbstractC1997k8.m8587C(i19);
                        m8588a8 = AbstractC1997k8.m8588a(m8817K);
                        i12 = m8587C + m8588a8;
                        i13 = i12 + m8817K;
                        i16 += i13;
                    }
                    break;
                case 40:
                    m8817K = AbstractC2089qa.m8817K((List) unsafe.getObject(obj, j10));
                    if (m8817K > 0) {
                        m8587C = AbstractC1997k8.m8587C(i19);
                        m8588a8 = AbstractC1997k8.m8588a(m8817K);
                        i12 = m8587C + m8588a8;
                        i13 = i12 + m8817K;
                        i16 += i13;
                    }
                    break;
                case 41:
                    m8817K = AbstractC2089qa.m8815I((List) unsafe.getObject(obj, j10));
                    if (m8817K > 0) {
                        m8587C = AbstractC1997k8.m8587C(i19);
                        m8588a8 = AbstractC1997k8.m8588a(m8817K);
                        i12 = m8587C + m8588a8;
                        i13 = i12 + m8817K;
                        i16 += i13;
                    }
                    break;
                case 42:
                    m8817K = AbstractC2089qa.m8810D((List) unsafe.getObject(obj, j10));
                    if (m8817K > 0) {
                        m8587C = AbstractC1997k8.m8587C(i19);
                        m8588a8 = AbstractC1997k8.m8588a(m8817K);
                        i12 = m8587C + m8588a8;
                        i13 = i12 + m8817K;
                        i16 += i13;
                    }
                    break;
                case 43:
                    m8817K = AbstractC2089qa.m8831Y((List) unsafe.getObject(obj, j10));
                    if (m8817K > 0) {
                        m8587C = AbstractC1997k8.m8587C(i19);
                        m8588a8 = AbstractC1997k8.m8588a(m8817K);
                        i12 = m8587C + m8588a8;
                        i13 = i12 + m8817K;
                        i16 += i13;
                    }
                    break;
                case 44:
                    m8817K = AbstractC2089qa.m8813G((List) unsafe.getObject(obj, j10));
                    if (m8817K > 0) {
                        m8587C = AbstractC1997k8.m8587C(i19);
                        m8588a8 = AbstractC1997k8.m8588a(m8817K);
                        i12 = m8587C + m8588a8;
                        i13 = i12 + m8817K;
                        i16 += i13;
                    }
                    break;
                case 45:
                    m8817K = AbstractC2089qa.m8815I((List) unsafe.getObject(obj, j10));
                    if (m8817K > 0) {
                        m8587C = AbstractC1997k8.m8587C(i19);
                        m8588a8 = AbstractC1997k8.m8588a(m8817K);
                        i12 = m8587C + m8588a8;
                        i13 = i12 + m8817K;
                        i16 += i13;
                    }
                    break;
                case 46:
                    m8817K = AbstractC2089qa.m8817K((List) unsafe.getObject(obj, j10));
                    if (m8817K > 0) {
                        m8587C = AbstractC1997k8.m8587C(i19);
                        m8588a8 = AbstractC1997k8.m8588a(m8817K);
                        i12 = m8587C + m8588a8;
                        i13 = i12 + m8817K;
                        i16 += i13;
                    }
                    break;
                case 47:
                    m8817K = AbstractC2089qa.m8826T((List) unsafe.getObject(obj, j10));
                    if (m8817K > 0) {
                        m8587C = AbstractC1997k8.m8587C(i19);
                        m8588a8 = AbstractC1997k8.m8588a(m8817K);
                        i12 = m8587C + m8588a8;
                        i13 = i12 + m8817K;
                        i16 += i13;
                    }
                    break;
                case 48:
                    m8817K = AbstractC2089qa.m8828V((List) unsafe.getObject(obj, j10));
                    if (m8817K > 0) {
                        m8587C = AbstractC1997k8.m8587C(i19);
                        m8588a8 = AbstractC1997k8.m8588a(m8817K);
                        i12 = m8587C + m8588a8;
                        i13 = i12 + m8817K;
                        i16 += i13;
                    }
                    break;
                case 49:
                    m8829W = AbstractC2089qa.m8818L(i19, (List) unsafe.getObject(obj, j10), m8446n(i15));
                    i16 += m8829W;
                    break;
                case 50:
                    C2208y9.m9361a(i19, unsafe.getObject(obj, j10), m8447o(i15));
                    break;
                case 51:
                    if (m8423A(obj, i19, i15)) {
                        m8588a9 = AbstractC1997k8.m8588a(i19 << 3);
                        m8829W = m8588a9 + 8;
                        i16 += m8829W;
                    }
                    break;
                case 52:
                    if (m8423A(obj, i19, i15)) {
                        m8588a10 = AbstractC1997k8.m8588a(i19 << 3);
                        m8829W = m8588a10 + 4;
                        i16 += m8829W;
                    }
                    break;
                case 53:
                    if (m8423A(obj, i19, i15)) {
                        long m8444l = m8444l(obj, j10);
                        m8588a11 = AbstractC1997k8.m8588a(i19 << 3);
                        m8589b2 = AbstractC1997k8.m8589b(m8444l);
                        i16 += m8588a11 + m8589b2;
                    }
                    break;
                case 54:
                    if (m8423A(obj, i19, i15)) {
                        long m8444l2 = m8444l(obj, j10);
                        m8588a11 = AbstractC1997k8.m8588a(i19 << 3);
                        m8589b2 = AbstractC1997k8.m8589b(m8444l2);
                        i16 += m8588a11 + m8589b2;
                    }
                    break;
                case 55:
                    if (m8423A(obj, i19, i15)) {
                        int m8433L = m8433L(obj, j10);
                        i12 = AbstractC1997k8.m8588a(i19 << 3);
                        m8817K = AbstractC1997k8.m8594z(m8433L);
                        i13 = i12 + m8817K;
                        i16 += i13;
                    }
                    break;
                case 56:
                    if (m8423A(obj, i19, i15)) {
                        m8588a9 = AbstractC1997k8.m8588a(i19 << 3);
                        m8829W = m8588a9 + 8;
                        i16 += m8829W;
                    }
                    break;
                case 57:
                    if (m8423A(obj, i19, i15)) {
                        m8588a10 = AbstractC1997k8.m8588a(i19 << 3);
                        m8829W = m8588a10 + 4;
                        i16 += m8829W;
                    }
                    break;
                case 58:
                    if (m8423A(obj, i19, i15)) {
                        m8829W = AbstractC1997k8.m8588a(i19 << 3) + 1;
                        i16 += m8829W;
                    }
                    break;
                case 59:
                    if (m8423A(obj, i19, i15)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof AbstractC1873c8) {
                            m8588a12 = AbstractC1997k8.m8588a(i19 << 3);
                            mo8182i2 = ((AbstractC1873c8) object2).mo8182i();
                            m8588a13 = AbstractC1997k8.m8588a(mo8182i2);
                            i13 = m8588a12 + m8588a13 + mo8182i2;
                            i16 += i13;
                        } else {
                            i12 = AbstractC1997k8.m8588a(i19 << 3);
                            m8817K = AbstractC1997k8.m8586B((String) object2);
                            i13 = i12 + m8817K;
                            i16 += i13;
                        }
                    }
                    break;
                case 60:
                    if (m8423A(obj, i19, i15)) {
                        m8829W = AbstractC2089qa.m8823Q(i19, unsafe.getObject(obj, j10), m8446n(i15));
                        i16 += m8829W;
                    }
                    break;
                case 61:
                    if (m8423A(obj, i19, i15)) {
                        AbstractC1873c8 abstractC1873c82 = (AbstractC1873c8) unsafe.getObject(obj, j10);
                        m8588a12 = AbstractC1997k8.m8588a(i19 << 3);
                        mo8182i2 = abstractC1873c82.mo8182i();
                        m8588a13 = AbstractC1997k8.m8588a(mo8182i2);
                        i13 = m8588a12 + m8588a13 + mo8182i2;
                        i16 += i13;
                    }
                    break;
                case 62:
                    if (m8423A(obj, i19, i15)) {
                        int m8433L2 = m8433L(obj, j10);
                        i12 = AbstractC1997k8.m8588a(i19 << 3);
                        m8817K = AbstractC1997k8.m8588a(m8433L2);
                        i13 = i12 + m8817K;
                        i16 += i13;
                    }
                    break;
                case 63:
                    if (m8423A(obj, i19, i15)) {
                        int m8433L3 = m8433L(obj, j10);
                        i12 = AbstractC1997k8.m8588a(i19 << 3);
                        m8817K = AbstractC1997k8.m8594z(m8433L3);
                        i13 = i12 + m8817K;
                        i16 += i13;
                    }
                    break;
                case 64:
                    if (m8423A(obj, i19, i15)) {
                        m8588a10 = AbstractC1997k8.m8588a(i19 << 3);
                        m8829W = m8588a10 + 4;
                        i16 += m8829W;
                    }
                    break;
                case 65:
                    if (m8423A(obj, i19, i15)) {
                        m8588a9 = AbstractC1997k8.m8588a(i19 << 3);
                        m8829W = m8588a9 + 8;
                        i16 += m8829W;
                    }
                    break;
                case 66:
                    if (m8423A(obj, i19, i15)) {
                        int m8433L4 = m8433L(obj, j10);
                        i12 = AbstractC1997k8.m8588a(i19 << 3);
                        m8817K = AbstractC1997k8.m8588a((m8433L4 >> 31) ^ (m8433L4 + m8433L4));
                        i13 = i12 + m8817K;
                        i16 += i13;
                    }
                    break;
                case 67:
                    if (m8423A(obj, i19, i15)) {
                        long m8444l3 = m8444l(obj, j10);
                        i16 += AbstractC1997k8.m8588a(i19 << 3) + AbstractC1997k8.m8589b((m8444l3 >> 63) ^ (m8444l3 + m8444l3));
                    }
                    break;
                case 68:
                    if (m8423A(obj, i19, i15)) {
                        m8829W = AbstractC1997k8.m8593y(i19, (InterfaceC1891da) unsafe.getObject(obj, j10), m8446n(i15));
                        i16 += m8829W;
                    }
                    break;
            }
            i15 += 3;
            i14 = 1048575;
        }
        AbstractC2149ua abstractC2149ua = this.f7784l;
        int mo9011a = i16 + abstractC2149ua.mo9011a(abstractC2149ua.mo9013c(obj));
        if (!this.f7778f) {
            return mo9011a;
        }
        this.f7785m.mo8766a(obj);
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0033. Please report as an issue. */
    /* renamed from: K */
    private final int m8432K(Object obj) {
        int m8588a;
        int m8588a2;
        int m8588a3;
        int m8589b;
        int m8588a4;
        int m8594z;
        int m8588a5;
        int m8588a6;
        int mo8182i;
        int m8588a7;
        int m8823Q;
        int m8587C;
        int m8588a8;
        int i10;
        Unsafe unsafe = f7772q;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f7773a.length; i12 += 3) {
            int m8443k = m8443k(i12);
            int m8442j = m8442j(m8443k);
            int i13 = this.f7773a[i12];
            long j10 = m8443k & 1048575;
            if (m8442j >= EnumC2132t8.f8080M.m8963a() && m8442j <= EnumC2132t8.f8102l0.m8963a()) {
                int i14 = this.f7773a[i12 + 2];
            }
            switch (m8442j) {
                case 0:
                    if (m8456x(obj, i12)) {
                        m8588a = AbstractC1997k8.m8588a(i13 << 3);
                        m8823Q = m8588a + 8;
                        i11 += m8823Q;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m8456x(obj, i12)) {
                        m8588a2 = AbstractC1997k8.m8588a(i13 << 3);
                        m8823Q = m8588a2 + 4;
                        i11 += m8823Q;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m8456x(obj, i12)) {
                        long m8307i = AbstractC1908eb.m8307i(obj, j10);
                        m8588a3 = AbstractC1997k8.m8588a(i13 << 3);
                        m8589b = AbstractC1997k8.m8589b(m8307i);
                        i11 += m8588a3 + m8589b;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m8456x(obj, i12)) {
                        long m8307i2 = AbstractC1908eb.m8307i(obj, j10);
                        m8588a3 = AbstractC1997k8.m8588a(i13 << 3);
                        m8589b = AbstractC1997k8.m8589b(m8307i2);
                        i11 += m8588a3 + m8589b;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m8456x(obj, i12)) {
                        int m8306h = AbstractC1908eb.m8306h(obj, j10);
                        m8588a4 = AbstractC1997k8.m8588a(i13 << 3);
                        m8594z = AbstractC1997k8.m8594z(m8306h);
                        i10 = m8588a4 + m8594z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m8456x(obj, i12)) {
                        m8588a = AbstractC1997k8.m8588a(i13 << 3);
                        m8823Q = m8588a + 8;
                        i11 += m8823Q;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m8456x(obj, i12)) {
                        m8588a2 = AbstractC1997k8.m8588a(i13 << 3);
                        m8823Q = m8588a2 + 4;
                        i11 += m8823Q;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m8456x(obj, i12)) {
                        m8588a5 = AbstractC1997k8.m8588a(i13 << 3);
                        m8823Q = m8588a5 + 1;
                        i11 += m8823Q;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!m8456x(obj, i12)) {
                        break;
                    } else {
                        Object m8309k = AbstractC1908eb.m8309k(obj, j10);
                        if (m8309k instanceof AbstractC1873c8) {
                            m8588a6 = AbstractC1997k8.m8588a(i13 << 3);
                            mo8182i = ((AbstractC1873c8) m8309k).mo8182i();
                            m8588a7 = AbstractC1997k8.m8588a(mo8182i);
                            i10 = m8588a6 + m8588a7 + mo8182i;
                            i11 += i10;
                            break;
                        } else {
                            m8588a4 = AbstractC1997k8.m8588a(i13 << 3);
                            m8594z = AbstractC1997k8.m8586B((String) m8309k);
                            i10 = m8588a4 + m8594z;
                            i11 += i10;
                        }
                    }
                case 9:
                    if (m8456x(obj, i12)) {
                        m8823Q = AbstractC2089qa.m8823Q(i13, AbstractC1908eb.m8309k(obj, j10), m8446n(i12));
                        i11 += m8823Q;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m8456x(obj, i12)) {
                        AbstractC1873c8 abstractC1873c8 = (AbstractC1873c8) AbstractC1908eb.m8309k(obj, j10);
                        m8588a6 = AbstractC1997k8.m8588a(i13 << 3);
                        mo8182i = abstractC1873c8.mo8182i();
                        m8588a7 = AbstractC1997k8.m8588a(mo8182i);
                        i10 = m8588a6 + m8588a7 + mo8182i;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m8456x(obj, i12)) {
                        int m8306h2 = AbstractC1908eb.m8306h(obj, j10);
                        m8588a4 = AbstractC1997k8.m8588a(i13 << 3);
                        m8594z = AbstractC1997k8.m8588a(m8306h2);
                        i10 = m8588a4 + m8594z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m8456x(obj, i12)) {
                        int m8306h3 = AbstractC1908eb.m8306h(obj, j10);
                        m8588a4 = AbstractC1997k8.m8588a(i13 << 3);
                        m8594z = AbstractC1997k8.m8594z(m8306h3);
                        i10 = m8588a4 + m8594z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m8456x(obj, i12)) {
                        m8588a2 = AbstractC1997k8.m8588a(i13 << 3);
                        m8823Q = m8588a2 + 4;
                        i11 += m8823Q;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m8456x(obj, i12)) {
                        m8588a = AbstractC1997k8.m8588a(i13 << 3);
                        m8823Q = m8588a + 8;
                        i11 += m8823Q;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m8456x(obj, i12)) {
                        int m8306h4 = AbstractC1908eb.m8306h(obj, j10);
                        m8588a4 = AbstractC1997k8.m8588a(i13 << 3);
                        m8594z = AbstractC1997k8.m8588a((m8306h4 >> 31) ^ (m8306h4 + m8306h4));
                        i10 = m8588a4 + m8594z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m8456x(obj, i12)) {
                        long m8307i3 = AbstractC1908eb.m8307i(obj, j10);
                        m8588a4 = AbstractC1997k8.m8588a(i13 << 3);
                        m8594z = AbstractC1997k8.m8589b((m8307i3 >> 63) ^ (m8307i3 + m8307i3));
                        i10 = m8588a4 + m8594z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m8456x(obj, i12)) {
                        m8823Q = AbstractC1997k8.m8593y(i13, (InterfaceC1891da) AbstractC1908eb.m8309k(obj, j10), m8446n(i12));
                        i11 += m8823Q;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    m8823Q = AbstractC2089qa.m8816J(i13, (List) AbstractC1908eb.m8309k(obj, j10), false);
                    i11 += m8823Q;
                    break;
                case 19:
                    m8823Q = AbstractC2089qa.m8814H(i13, (List) AbstractC1908eb.m8309k(obj, j10), false);
                    i11 += m8823Q;
                    break;
                case 20:
                    m8823Q = AbstractC2089qa.m8821O(i13, (List) AbstractC1908eb.m8309k(obj, j10), false);
                    i11 += m8823Q;
                    break;
                case 21:
                    m8823Q = AbstractC2089qa.m8832Z(i13, (List) AbstractC1908eb.m8309k(obj, j10), false);
                    i11 += m8823Q;
                    break;
                case 22:
                    m8823Q = AbstractC2089qa.m8819M(i13, (List) AbstractC1908eb.m8309k(obj, j10), false);
                    i11 += m8823Q;
                    break;
                case 23:
                    m8823Q = AbstractC2089qa.m8816J(i13, (List) AbstractC1908eb.m8309k(obj, j10), false);
                    i11 += m8823Q;
                    break;
                case 24:
                    m8823Q = AbstractC2089qa.m8814H(i13, (List) AbstractC1908eb.m8309k(obj, j10), false);
                    i11 += m8823Q;
                    break;
                case 25:
                    m8823Q = AbstractC2089qa.m8807A(i13, (List) AbstractC1908eb.m8309k(obj, j10), false);
                    i11 += m8823Q;
                    break;
                case 26:
                    m8823Q = AbstractC2089qa.m8829W(i13, (List) AbstractC1908eb.m8309k(obj, j10));
                    i11 += m8823Q;
                    break;
                case 27:
                    m8823Q = AbstractC2089qa.m8824R(i13, (List) AbstractC1908eb.m8309k(obj, j10), m8446n(i12));
                    i11 += m8823Q;
                    break;
                case 28:
                    m8823Q = AbstractC2089qa.m8811E(i13, (List) AbstractC1908eb.m8309k(obj, j10));
                    i11 += m8823Q;
                    break;
                case 29:
                    m8823Q = AbstractC2089qa.m8830X(i13, (List) AbstractC1908eb.m8309k(obj, j10), false);
                    i11 += m8823Q;
                    break;
                case 30:
                    m8823Q = AbstractC2089qa.m8812F(i13, (List) AbstractC1908eb.m8309k(obj, j10), false);
                    i11 += m8823Q;
                    break;
                case 31:
                    m8823Q = AbstractC2089qa.m8814H(i13, (List) AbstractC1908eb.m8309k(obj, j10), false);
                    i11 += m8823Q;
                    break;
                case 32:
                    m8823Q = AbstractC2089qa.m8816J(i13, (List) AbstractC1908eb.m8309k(obj, j10), false);
                    i11 += m8823Q;
                    break;
                case 33:
                    m8823Q = AbstractC2089qa.m8825S(i13, (List) AbstractC1908eb.m8309k(obj, j10), false);
                    i11 += m8823Q;
                    break;
                case 34:
                    m8823Q = AbstractC2089qa.m8827U(i13, (List) AbstractC1908eb.m8309k(obj, j10), false);
                    i11 += m8823Q;
                    break;
                case 35:
                    m8594z = AbstractC2089qa.m8817K((List) unsafe.getObject(obj, j10));
                    if (m8594z > 0) {
                        m8587C = AbstractC1997k8.m8587C(i13);
                        m8588a8 = AbstractC1997k8.m8588a(m8594z);
                        m8588a4 = m8587C + m8588a8;
                        i10 = m8588a4 + m8594z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    m8594z = AbstractC2089qa.m8815I((List) unsafe.getObject(obj, j10));
                    if (m8594z > 0) {
                        m8587C = AbstractC1997k8.m8587C(i13);
                        m8588a8 = AbstractC1997k8.m8588a(m8594z);
                        m8588a4 = m8587C + m8588a8;
                        i10 = m8588a4 + m8594z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    m8594z = AbstractC2089qa.m8822P((List) unsafe.getObject(obj, j10));
                    if (m8594z > 0) {
                        m8587C = AbstractC1997k8.m8587C(i13);
                        m8588a8 = AbstractC1997k8.m8588a(m8594z);
                        m8588a4 = m8587C + m8588a8;
                        i10 = m8588a4 + m8594z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    m8594z = AbstractC2089qa.m8834a0((List) unsafe.getObject(obj, j10));
                    if (m8594z > 0) {
                        m8587C = AbstractC1997k8.m8587C(i13);
                        m8588a8 = AbstractC1997k8.m8588a(m8594z);
                        m8588a4 = m8587C + m8588a8;
                        i10 = m8588a4 + m8594z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    m8594z = AbstractC2089qa.m8820N((List) unsafe.getObject(obj, j10));
                    if (m8594z > 0) {
                        m8587C = AbstractC1997k8.m8587C(i13);
                        m8588a8 = AbstractC1997k8.m8588a(m8594z);
                        m8588a4 = m8587C + m8588a8;
                        i10 = m8588a4 + m8594z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    m8594z = AbstractC2089qa.m8817K((List) unsafe.getObject(obj, j10));
                    if (m8594z > 0) {
                        m8587C = AbstractC1997k8.m8587C(i13);
                        m8588a8 = AbstractC1997k8.m8588a(m8594z);
                        m8588a4 = m8587C + m8588a8;
                        i10 = m8588a4 + m8594z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    m8594z = AbstractC2089qa.m8815I((List) unsafe.getObject(obj, j10));
                    if (m8594z > 0) {
                        m8587C = AbstractC1997k8.m8587C(i13);
                        m8588a8 = AbstractC1997k8.m8588a(m8594z);
                        m8588a4 = m8587C + m8588a8;
                        i10 = m8588a4 + m8594z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    m8594z = AbstractC2089qa.m8810D((List) unsafe.getObject(obj, j10));
                    if (m8594z > 0) {
                        m8587C = AbstractC1997k8.m8587C(i13);
                        m8588a8 = AbstractC1997k8.m8588a(m8594z);
                        m8588a4 = m8587C + m8588a8;
                        i10 = m8588a4 + m8594z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    m8594z = AbstractC2089qa.m8831Y((List) unsafe.getObject(obj, j10));
                    if (m8594z > 0) {
                        m8587C = AbstractC1997k8.m8587C(i13);
                        m8588a8 = AbstractC1997k8.m8588a(m8594z);
                        m8588a4 = m8587C + m8588a8;
                        i10 = m8588a4 + m8594z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    m8594z = AbstractC2089qa.m8813G((List) unsafe.getObject(obj, j10));
                    if (m8594z > 0) {
                        m8587C = AbstractC1997k8.m8587C(i13);
                        m8588a8 = AbstractC1997k8.m8588a(m8594z);
                        m8588a4 = m8587C + m8588a8;
                        i10 = m8588a4 + m8594z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    m8594z = AbstractC2089qa.m8815I((List) unsafe.getObject(obj, j10));
                    if (m8594z > 0) {
                        m8587C = AbstractC1997k8.m8587C(i13);
                        m8588a8 = AbstractC1997k8.m8588a(m8594z);
                        m8588a4 = m8587C + m8588a8;
                        i10 = m8588a4 + m8594z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    m8594z = AbstractC2089qa.m8817K((List) unsafe.getObject(obj, j10));
                    if (m8594z > 0) {
                        m8587C = AbstractC1997k8.m8587C(i13);
                        m8588a8 = AbstractC1997k8.m8588a(m8594z);
                        m8588a4 = m8587C + m8588a8;
                        i10 = m8588a4 + m8594z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    m8594z = AbstractC2089qa.m8826T((List) unsafe.getObject(obj, j10));
                    if (m8594z > 0) {
                        m8587C = AbstractC1997k8.m8587C(i13);
                        m8588a8 = AbstractC1997k8.m8588a(m8594z);
                        m8588a4 = m8587C + m8588a8;
                        i10 = m8588a4 + m8594z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    m8594z = AbstractC2089qa.m8828V((List) unsafe.getObject(obj, j10));
                    if (m8594z > 0) {
                        m8587C = AbstractC1997k8.m8587C(i13);
                        m8588a8 = AbstractC1997k8.m8588a(m8594z);
                        m8588a4 = m8587C + m8588a8;
                        i10 = m8588a4 + m8594z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    m8823Q = AbstractC2089qa.m8818L(i13, (List) AbstractC1908eb.m8309k(obj, j10), m8446n(i12));
                    i11 += m8823Q;
                    break;
                case 50:
                    C2208y9.m9361a(i13, AbstractC1908eb.m8309k(obj, j10), m8447o(i12));
                    break;
                case 51:
                    if (m8423A(obj, i13, i12)) {
                        m8588a = AbstractC1997k8.m8588a(i13 << 3);
                        m8823Q = m8588a + 8;
                        i11 += m8823Q;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m8423A(obj, i13, i12)) {
                        m8588a2 = AbstractC1997k8.m8588a(i13 << 3);
                        m8823Q = m8588a2 + 4;
                        i11 += m8823Q;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m8423A(obj, i13, i12)) {
                        long m8444l = m8444l(obj, j10);
                        m8588a3 = AbstractC1997k8.m8588a(i13 << 3);
                        m8589b = AbstractC1997k8.m8589b(m8444l);
                        i11 += m8588a3 + m8589b;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m8423A(obj, i13, i12)) {
                        long m8444l2 = m8444l(obj, j10);
                        m8588a3 = AbstractC1997k8.m8588a(i13 << 3);
                        m8589b = AbstractC1997k8.m8589b(m8444l2);
                        i11 += m8588a3 + m8589b;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m8423A(obj, i13, i12)) {
                        int m8433L = m8433L(obj, j10);
                        m8588a4 = AbstractC1997k8.m8588a(i13 << 3);
                        m8594z = AbstractC1997k8.m8594z(m8433L);
                        i10 = m8588a4 + m8594z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m8423A(obj, i13, i12)) {
                        m8588a = AbstractC1997k8.m8588a(i13 << 3);
                        m8823Q = m8588a + 8;
                        i11 += m8823Q;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m8423A(obj, i13, i12)) {
                        m8588a2 = AbstractC1997k8.m8588a(i13 << 3);
                        m8823Q = m8588a2 + 4;
                        i11 += m8823Q;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m8423A(obj, i13, i12)) {
                        m8588a5 = AbstractC1997k8.m8588a(i13 << 3);
                        m8823Q = m8588a5 + 1;
                        i11 += m8823Q;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!m8423A(obj, i13, i12)) {
                        break;
                    } else {
                        Object m8309k2 = AbstractC1908eb.m8309k(obj, j10);
                        if (m8309k2 instanceof AbstractC1873c8) {
                            m8588a6 = AbstractC1997k8.m8588a(i13 << 3);
                            mo8182i = ((AbstractC1873c8) m8309k2).mo8182i();
                            m8588a7 = AbstractC1997k8.m8588a(mo8182i);
                            i10 = m8588a6 + m8588a7 + mo8182i;
                            i11 += i10;
                            break;
                        } else {
                            m8588a4 = AbstractC1997k8.m8588a(i13 << 3);
                            m8594z = AbstractC1997k8.m8586B((String) m8309k2);
                            i10 = m8588a4 + m8594z;
                            i11 += i10;
                        }
                    }
                case 60:
                    if (m8423A(obj, i13, i12)) {
                        m8823Q = AbstractC2089qa.m8823Q(i13, AbstractC1908eb.m8309k(obj, j10), m8446n(i12));
                        i11 += m8823Q;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m8423A(obj, i13, i12)) {
                        AbstractC1873c8 abstractC1873c82 = (AbstractC1873c8) AbstractC1908eb.m8309k(obj, j10);
                        m8588a6 = AbstractC1997k8.m8588a(i13 << 3);
                        mo8182i = abstractC1873c82.mo8182i();
                        m8588a7 = AbstractC1997k8.m8588a(mo8182i);
                        i10 = m8588a6 + m8588a7 + mo8182i;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m8423A(obj, i13, i12)) {
                        int m8433L2 = m8433L(obj, j10);
                        m8588a4 = AbstractC1997k8.m8588a(i13 << 3);
                        m8594z = AbstractC1997k8.m8588a(m8433L2);
                        i10 = m8588a4 + m8594z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m8423A(obj, i13, i12)) {
                        int m8433L3 = m8433L(obj, j10);
                        m8588a4 = AbstractC1997k8.m8588a(i13 << 3);
                        m8594z = AbstractC1997k8.m8594z(m8433L3);
                        i10 = m8588a4 + m8594z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m8423A(obj, i13, i12)) {
                        m8588a2 = AbstractC1997k8.m8588a(i13 << 3);
                        m8823Q = m8588a2 + 4;
                        i11 += m8823Q;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m8423A(obj, i13, i12)) {
                        m8588a = AbstractC1997k8.m8588a(i13 << 3);
                        m8823Q = m8588a + 8;
                        i11 += m8823Q;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m8423A(obj, i13, i12)) {
                        int m8433L4 = m8433L(obj, j10);
                        m8588a4 = AbstractC1997k8.m8588a(i13 << 3);
                        m8594z = AbstractC1997k8.m8588a((m8433L4 >> 31) ^ (m8433L4 + m8433L4));
                        i10 = m8588a4 + m8594z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m8423A(obj, i13, i12)) {
                        long m8444l3 = m8444l(obj, j10);
                        m8588a4 = AbstractC1997k8.m8588a(i13 << 3);
                        m8594z = AbstractC1997k8.m8589b((m8444l3 >> 63) ^ (m8444l3 + m8444l3));
                        i10 = m8588a4 + m8594z;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m8423A(obj, i13, i12)) {
                        m8823Q = AbstractC1997k8.m8593y(i13, (InterfaceC1891da) AbstractC1908eb.m8309k(obj, j10), m8446n(i12));
                        i11 += m8823Q;
                        break;
                    } else {
                        break;
                    }
            }
        }
        AbstractC2149ua abstractC2149ua = this.f7784l;
        return i11 + abstractC2149ua.mo9011a(abstractC2149ua.mo9013c(obj));
    }

    /* renamed from: L */
    private static int m8433L(Object obj, long j10) {
        return ((Integer) AbstractC1908eb.m8309k(obj, j10)).intValue();
    }

    /* renamed from: M */
    private final int m8434M(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, C2071p7 c2071p7) {
        Unsafe unsafe = f7772q;
        Object m8447o = m8447o(i12);
        Object object = unsafe.getObject(obj, j10);
        if (!((C2193x9) object).m9185f()) {
            C2193x9 m9182b = C2193x9.m9179a().m9182b();
            C2208y9.m9362b(m9182b, object);
            unsafe.putObject(obj, j10, m9182b);
        }
        AbstractC0272b.m941a(m8447o);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0023. Please report as an issue. */
    /* renamed from: N */
    private final int m8435N(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, C2071p7 c2071p7) {
        Unsafe unsafe = f7772q;
        long j11 = this.f7773a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(AbstractC2086q7.m8806n(bArr, i10))));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 8;
                }
                return i10;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(AbstractC2086q7.m8794b(bArr, i10))));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 4;
                }
                return i10;
            case 53:
            case 54:
                if (i14 == 0) {
                    int m8805m = AbstractC2086q7.m8805m(bArr, i10, c2071p7);
                    unsafe.putObject(obj, j10, Long.valueOf(c2071p7.f7996b));
                    unsafe.putInt(obj, j11, i13);
                    return m8805m;
                }
                return i10;
            case 55:
            case 62:
                if (i14 == 0) {
                    int m8802j = AbstractC2086q7.m8802j(bArr, i10, c2071p7);
                    unsafe.putObject(obj, j10, Integer.valueOf(c2071p7.f7995a));
                    unsafe.putInt(obj, j11, i13);
                    return m8802j;
                }
                return i10;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Long.valueOf(AbstractC2086q7.m8806n(bArr, i10)));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 8;
                }
                return i10;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Integer.valueOf(AbstractC2086q7.m8794b(bArr, i10)));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 4;
                }
                return i10;
            case 58:
                if (i14 == 0) {
                    int m8805m2 = AbstractC2086q7.m8805m(bArr, i10, c2071p7);
                    unsafe.putObject(obj, j10, Boolean.valueOf(c2071p7.f7996b != 0));
                    unsafe.putInt(obj, j11, i13);
                    return m8805m2;
                }
                return i10;
            case 59:
                if (i14 == 2) {
                    int m8802j2 = AbstractC2086q7.m8802j(bArr, i10, c2071p7);
                    int i18 = c2071p7.f7995a;
                    if (i18 == 0) {
                        unsafe.putObject(obj, j10, "");
                    } else {
                        if ((i15 & 536870912) != 0 && !AbstractC2000kb.m8608f(bArr, m8802j2, m8802j2 + i18)) {
                            throw C1968i9.m8528c();
                        }
                        unsafe.putObject(obj, j10, new String(bArr, m8802j2, i18, AbstractC1938g9.f7766b));
                        m8802j2 += i18;
                    }
                    unsafe.putInt(obj, j11, i13);
                    return m8802j2;
                }
                return i10;
            case 60:
                if (i14 == 2) {
                    int m8796d = AbstractC2086q7.m8796d(m8446n(i17), bArr, i10, i11, c2071p7);
                    Object object = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j10, c2071p7.f7997c);
                    } else {
                        unsafe.putObject(obj, j10, AbstractC1938g9.m8420g(object, c2071p7.f7997c));
                    }
                    unsafe.putInt(obj, j11, i13);
                    return m8796d;
                }
                return i10;
            case 61:
                if (i14 == 2) {
                    int m8793a = AbstractC2086q7.m8793a(bArr, i10, c2071p7);
                    unsafe.putObject(obj, j10, c2071p7.f7997c);
                    unsafe.putInt(obj, j11, i13);
                    return m8793a;
                }
                return i10;
            case 63:
                if (i14 == 0) {
                    int m8802j3 = AbstractC2086q7.m8802j(bArr, i10, c2071p7);
                    int i19 = c2071p7.f7995a;
                    InterfaceC1874c9 m8445m = m8445m(i17);
                    if (m8445m != null && !m8445m.mo8087a(i19)) {
                        m8426E(obj).m9052h(i12, Long.valueOf(i19));
                    } else {
                        unsafe.putObject(obj, j10, Integer.valueOf(i19));
                        unsafe.putInt(obj, j11, i13);
                    }
                    return m8802j3;
                }
                return i10;
            case 66:
                if (i14 == 0) {
                    int m8802j4 = AbstractC2086q7.m8802j(bArr, i10, c2071p7);
                    unsafe.putObject(obj, j10, Integer.valueOf(AbstractC1937g8.m8412a(c2071p7.f7995a)));
                    unsafe.putInt(obj, j11, i13);
                    return m8802j4;
                }
                return i10;
            case 67:
                if (i14 == 0) {
                    int m8805m3 = AbstractC2086q7.m8805m(bArr, i10, c2071p7);
                    unsafe.putObject(obj, j10, Long.valueOf(AbstractC1937g8.m8413b(c2071p7.f7996b)));
                    unsafe.putInt(obj, j11, i13);
                    return m8805m3;
                }
                return i10;
            case 68:
                if (i14 == 3) {
                    int m8795c = AbstractC2086q7.m8795c(m8446n(i17), bArr, i10, i11, (i12 & (-8)) | 4, c2071p7);
                    Object object2 = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j10, c2071p7.f7997c);
                    } else {
                        unsafe.putObject(obj, j10, AbstractC1938g9.m8420g(object2, c2071p7.f7997c));
                    }
                    unsafe.putInt(obj, j11, i13);
                    return m8795c;
                }
                return i10;
            default:
                return i10;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x0081. Please report as an issue. */
    /* renamed from: O */
    private final int m8436O(Object obj, byte[] bArr, int i10, int i11, C2071p7 c2071p7) {
        int i12;
        int i13;
        int m8438Q;
        int i14;
        int i15;
        Unsafe unsafe;
        int i16;
        int i17;
        int i18;
        int m8805m;
        int m8796d;
        int i19;
        int i20;
        int i21;
        C1939ga c1939ga = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i22 = i11;
        C2071p7 c2071p72 = c2071p7;
        Unsafe unsafe2 = f7772q;
        int i23 = 1048575;
        int i24 = -1;
        int i25 = i10;
        int i26 = -1;
        int i27 = 0;
        int i28 = 0;
        int i29 = 1048575;
        while (i25 < i22) {
            int i30 = i25 + 1;
            byte b10 = bArr2[i25];
            if (b10 < 0) {
                i13 = AbstractC2086q7.m8803k(b10, bArr2, i30, c2071p72);
                i12 = c2071p72.f7995a;
            } else {
                i12 = b10;
                i13 = i30;
            }
            int i31 = i12 >>> 3;
            int i32 = i12 & 7;
            if (i31 > i26) {
                m8438Q = c1939ga.m8439R(i31, i27 / 3);
            } else {
                m8438Q = c1939ga.m8438Q(i31);
            }
            int i33 = m8438Q;
            if (i33 == i24) {
                i14 = i13;
                i15 = i31;
                unsafe = unsafe2;
                i16 = 0;
            } else {
                int[] iArr = c1939ga.f7773a;
                int i34 = iArr[i33 + 1];
                int m8442j = m8442j(i34);
                long j10 = i34 & i23;
                if (m8442j <= 17) {
                    int i35 = iArr[i33 + 2];
                    int i36 = 1 << (i35 >>> 20);
                    int i37 = i35 & 1048575;
                    if (i37 != i29) {
                        if (i29 != 1048575) {
                            unsafe2.putInt(obj2, i29, i28);
                        }
                        if (i37 != 1048575) {
                            i28 = unsafe2.getInt(obj2, i37);
                        }
                        i29 = i37;
                    }
                    switch (m8442j) {
                        case 0:
                            c2071p72 = c2071p7;
                            i17 = i33;
                            i18 = i13;
                            i15 = i31;
                            if (i32 == 1) {
                                AbstractC1908eb.m8318t(obj2, j10, Double.longBitsToDouble(AbstractC2086q7.m8806n(bArr2, i18)));
                                i25 = i18 + 8;
                                i28 |= i36;
                                i27 = i17;
                                i26 = i15;
                                break;
                            }
                            i14 = i18;
                            unsafe = unsafe2;
                            i16 = i17;
                            break;
                        case 1:
                            c2071p72 = c2071p7;
                            i17 = i33;
                            i18 = i13;
                            i15 = i31;
                            if (i32 == 5) {
                                AbstractC1908eb.m8319u(obj2, j10, Float.intBitsToFloat(AbstractC2086q7.m8794b(bArr2, i18)));
                                i25 = i18 + 4;
                                i28 |= i36;
                                i27 = i17;
                                i26 = i15;
                                break;
                            }
                            i14 = i18;
                            unsafe = unsafe2;
                            i16 = i17;
                            break;
                        case 2:
                        case 3:
                            c2071p72 = c2071p7;
                            i17 = i33;
                            i18 = i13;
                            i15 = i31;
                            if (i32 == 0) {
                                m8805m = AbstractC2086q7.m8805m(bArr2, i18, c2071p72);
                                unsafe2.putLong(obj, j10, c2071p72.f7996b);
                                i28 |= i36;
                                i25 = m8805m;
                                i27 = i17;
                                i26 = i15;
                                break;
                            }
                            i14 = i18;
                            unsafe = unsafe2;
                            i16 = i17;
                            break;
                        case 4:
                        case 11:
                            c2071p72 = c2071p7;
                            i17 = i33;
                            i18 = i13;
                            i15 = i31;
                            if (i32 == 0) {
                                i25 = AbstractC2086q7.m8802j(bArr2, i18, c2071p72);
                                unsafe2.putInt(obj2, j10, c2071p72.f7995a);
                                i28 |= i36;
                                i27 = i17;
                                i26 = i15;
                                break;
                            }
                            i14 = i18;
                            unsafe = unsafe2;
                            i16 = i17;
                            break;
                        case 5:
                        case 14:
                            c2071p72 = c2071p7;
                            i17 = i33;
                            i15 = i31;
                            if (i32 == 1) {
                                i18 = i13;
                                unsafe2.putLong(obj, j10, AbstractC2086q7.m8806n(bArr2, i13));
                                i25 = i18 + 8;
                                i28 |= i36;
                                i27 = i17;
                                i26 = i15;
                                break;
                            }
                            i18 = i13;
                            i14 = i18;
                            unsafe = unsafe2;
                            i16 = i17;
                            break;
                        case 6:
                        case 13:
                            c2071p72 = c2071p7;
                            i17 = i33;
                            i15 = i31;
                            if (i32 == 5) {
                                unsafe2.putInt(obj2, j10, AbstractC2086q7.m8794b(bArr2, i13));
                                i25 = i13 + 4;
                                i28 |= i36;
                                i27 = i17;
                                i26 = i15;
                                break;
                            }
                            i18 = i13;
                            i14 = i18;
                            unsafe = unsafe2;
                            i16 = i17;
                            break;
                        case 7:
                            c2071p72 = c2071p7;
                            i17 = i33;
                            i15 = i31;
                            if (i32 == 0) {
                                i25 = AbstractC2086q7.m8805m(bArr2, i13, c2071p72);
                                AbstractC1908eb.m8316r(obj2, j10, c2071p72.f7996b != 0);
                                i28 |= i36;
                                i27 = i17;
                                i26 = i15;
                                break;
                            }
                            i18 = i13;
                            i14 = i18;
                            unsafe = unsafe2;
                            i16 = i17;
                            break;
                        case 8:
                            c2071p72 = c2071p7;
                            i17 = i33;
                            i15 = i31;
                            if (i32 == 2) {
                                if ((536870912 & i34) == 0) {
                                    i25 = AbstractC2086q7.m8799g(bArr2, i13, c2071p72);
                                } else {
                                    i25 = AbstractC2086q7.m8800h(bArr2, i13, c2071p72);
                                }
                                unsafe2.putObject(obj2, j10, c2071p72.f7997c);
                                i28 |= i36;
                                i27 = i17;
                                i26 = i15;
                                break;
                            }
                            i18 = i13;
                            i14 = i18;
                            unsafe = unsafe2;
                            i16 = i17;
                            break;
                        case 9:
                            c2071p72 = c2071p7;
                            i17 = i33;
                            i15 = i31;
                            if (i32 == 2) {
                                m8796d = AbstractC2086q7.m8796d(c1939ga.m8446n(i17), bArr2, i13, i22, c2071p72);
                                Object object = unsafe2.getObject(obj2, j10);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j10, c2071p72.f7997c);
                                } else {
                                    unsafe2.putObject(obj2, j10, AbstractC1938g9.m8420g(object, c2071p72.f7997c));
                                }
                                i28 |= i36;
                                i25 = m8796d;
                                i27 = i17;
                                i26 = i15;
                                break;
                            }
                            i18 = i13;
                            i14 = i18;
                            unsafe = unsafe2;
                            i16 = i17;
                            break;
                        case 10:
                            c2071p72 = c2071p7;
                            i17 = i33;
                            i15 = i31;
                            if (i32 == 2) {
                                m8796d = AbstractC2086q7.m8793a(bArr2, i13, c2071p72);
                                unsafe2.putObject(obj2, j10, c2071p72.f7997c);
                                i28 |= i36;
                                i25 = m8796d;
                                i27 = i17;
                                i26 = i15;
                                break;
                            }
                            i18 = i13;
                            i14 = i18;
                            unsafe = unsafe2;
                            i16 = i17;
                            break;
                        case 12:
                            c2071p72 = c2071p7;
                            i17 = i33;
                            i15 = i31;
                            if (i32 == 0) {
                                m8796d = AbstractC2086q7.m8802j(bArr2, i13, c2071p72);
                                unsafe2.putInt(obj2, j10, c2071p72.f7995a);
                                i28 |= i36;
                                i25 = m8796d;
                                i27 = i17;
                                i26 = i15;
                                break;
                            }
                            i18 = i13;
                            i14 = i18;
                            unsafe = unsafe2;
                            i16 = i17;
                            break;
                        case 15:
                            c2071p72 = c2071p7;
                            i17 = i33;
                            i15 = i31;
                            if (i32 == 0) {
                                m8796d = AbstractC2086q7.m8802j(bArr2, i13, c2071p72);
                                unsafe2.putInt(obj2, j10, AbstractC1937g8.m8412a(c2071p72.f7995a));
                                i28 |= i36;
                                i25 = m8796d;
                                i27 = i17;
                                i26 = i15;
                                break;
                            }
                            i18 = i13;
                            i14 = i18;
                            unsafe = unsafe2;
                            i16 = i17;
                            break;
                        case 16:
                            if (i32 != 0) {
                                i15 = i31;
                                i17 = i33;
                                i18 = i13;
                                i14 = i18;
                                unsafe = unsafe2;
                                i16 = i17;
                                break;
                            } else {
                                c2071p72 = c2071p7;
                                m8805m = AbstractC2086q7.m8805m(bArr2, i13, c2071p72);
                                i17 = i33;
                                i15 = i31;
                                unsafe2.putLong(obj, j10, AbstractC1937g8.m8413b(c2071p72.f7996b));
                                i28 |= i36;
                                i25 = m8805m;
                                i27 = i17;
                                i26 = i15;
                                break;
                            }
                        default:
                            i15 = i31;
                            i17 = i33;
                            i18 = i13;
                            i14 = i18;
                            unsafe = unsafe2;
                            i16 = i17;
                            break;
                    }
                } else {
                    c2071p72 = c2071p7;
                    i17 = i33;
                    int i38 = i13;
                    i15 = i31;
                    if (m8442j == 27) {
                        if (i32 == 2) {
                            InterfaceC1922f9 interfaceC1922f9 = (InterfaceC1922f9) unsafe2.getObject(obj2, j10);
                            if (!interfaceC1922f9.mo8387f()) {
                                int size = interfaceC1922f9.size();
                                interfaceC1922f9 = interfaceC1922f9.mo8095l(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j10, interfaceC1922f9);
                            }
                            i25 = AbstractC2086q7.m8797e(c1939ga.m8446n(i17), i12, bArr, i38, i11, interfaceC1922f9, c2071p7);
                            i28 = i28;
                            i27 = i17;
                            i26 = i15;
                        } else {
                            i19 = i38;
                            i20 = i28;
                            i21 = i29;
                            unsafe = unsafe2;
                            i16 = i17;
                        }
                    } else if (m8442j <= 49) {
                        i20 = i28;
                        i21 = i29;
                        unsafe = unsafe2;
                        i16 = i17;
                        i25 = m8437P(obj, bArr, i38, i11, i12, i15, i32, i17, i34, m8442j, j10, c2071p7);
                        if (i25 != i38) {
                            obj2 = obj;
                            bArr2 = bArr;
                            i22 = i11;
                            c2071p72 = c2071p7;
                            i29 = i21;
                            i26 = i15;
                            i28 = i20;
                            i27 = i16;
                            unsafe2 = unsafe;
                            i24 = -1;
                            i23 = 1048575;
                            c1939ga = this;
                        } else {
                            i14 = i25;
                            i29 = i21;
                            i28 = i20;
                        }
                    } else {
                        i19 = i38;
                        i20 = i28;
                        i21 = i29;
                        unsafe = unsafe2;
                        i16 = i17;
                        if (m8442j != 50) {
                            i25 = m8435N(obj, bArr, i19, i11, i12, i15, i32, i34, m8442j, j10, i16, c2071p7);
                            if (i25 != i19) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i22 = i11;
                                c2071p72 = c2071p7;
                                i29 = i21;
                                i26 = i15;
                                i28 = i20;
                                i27 = i16;
                                unsafe2 = unsafe;
                                i24 = -1;
                                i23 = 1048575;
                                c1939ga = this;
                            } else {
                                i14 = i25;
                                i29 = i21;
                                i28 = i20;
                            }
                        } else if (i32 == 2) {
                            i25 = m8434M(obj, bArr, i19, i11, i16, j10, c2071p7);
                            if (i25 != i19) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i22 = i11;
                                c2071p72 = c2071p7;
                                i29 = i21;
                                i26 = i15;
                                i28 = i20;
                                i27 = i16;
                                unsafe2 = unsafe;
                                i24 = -1;
                                i23 = 1048575;
                                c1939ga = this;
                            } else {
                                i14 = i25;
                                i29 = i21;
                                i28 = i20;
                            }
                        }
                    }
                    i14 = i19;
                    i29 = i21;
                    i28 = i20;
                }
                i24 = -1;
                i23 = 1048575;
            }
            i25 = AbstractC2086q7.m8801i(i12, bArr, i14, i11, m8426E(obj), c2071p7);
            c1939ga = this;
            obj2 = obj;
            bArr2 = bArr;
            i22 = i11;
            c2071p72 = c2071p7;
            i26 = i15;
            i27 = i16;
            unsafe2 = unsafe;
            i24 = -1;
            i23 = 1048575;
        }
        int i39 = i28;
        int i40 = i29;
        Unsafe unsafe3 = unsafe2;
        if (i40 != 1048575) {
            unsafe3.putInt(obj, i40, i39);
        }
        if (i25 == i11) {
            return i25;
        }
        throw C1968i9.m8530e();
    }

    /* renamed from: P */
    private final int m8437P(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, C2071p7 c2071p7) {
        int i17;
        int i18;
        int m8804l;
        int i19 = i10;
        Unsafe unsafe = f7772q;
        InterfaceC1922f9 interfaceC1922f9 = (InterfaceC1922f9) unsafe.getObject(obj, j11);
        if (!interfaceC1922f9.mo8387f()) {
            int size = interfaceC1922f9.size();
            interfaceC1922f9 = interfaceC1922f9.mo8095l(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j11, interfaceC1922f9);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    AbstractC0272b.m941a(interfaceC1922f9);
                    int m8802j = AbstractC2086q7.m8802j(bArr, i19, c2071p7);
                    int i20 = c2071p7.f7995a + m8802j;
                    if (m8802j < i20) {
                        Double.longBitsToDouble(AbstractC2086q7.m8806n(bArr, m8802j));
                        throw null;
                    }
                    if (m8802j == i20) {
                        return m8802j;
                    }
                    throw C1968i9.m8531f();
                }
                if (i14 == 1) {
                    AbstractC0272b.m941a(interfaceC1922f9);
                    Double.longBitsToDouble(AbstractC2086q7.m8806n(bArr, i10));
                    throw null;
                }
                break;
            case 19:
            case 36:
                if (i14 == 2) {
                    AbstractC0272b.m941a(interfaceC1922f9);
                    int m8802j2 = AbstractC2086q7.m8802j(bArr, i19, c2071p7);
                    int i21 = c2071p7.f7995a + m8802j2;
                    if (m8802j2 < i21) {
                        Float.intBitsToFloat(AbstractC2086q7.m8794b(bArr, m8802j2));
                        throw null;
                    }
                    if (m8802j2 == i21) {
                        return m8802j2;
                    }
                    throw C1968i9.m8531f();
                }
                if (i14 == 5) {
                    AbstractC0272b.m941a(interfaceC1922f9);
                    Float.intBitsToFloat(AbstractC2086q7.m8794b(bArr, i10));
                    throw null;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    C2133t9 c2133t9 = (C2133t9) interfaceC1922f9;
                    int m8802j3 = AbstractC2086q7.m8802j(bArr, i19, c2071p7);
                    int i22 = c2071p7.f7995a + m8802j3;
                    while (m8802j3 < i22) {
                        m8802j3 = AbstractC2086q7.m8805m(bArr, m8802j3, c2071p7);
                        c2133t9.m8967i(c2071p7.f7996b);
                    }
                    if (m8802j3 == i22) {
                        return m8802j3;
                    }
                    throw C1968i9.m8531f();
                }
                if (i14 == 0) {
                    C2133t9 c2133t92 = (C2133t9) interfaceC1922f9;
                    int m8805m = AbstractC2086q7.m8805m(bArr, i19, c2071p7);
                    c2133t92.m8967i(c2071p7.f7996b);
                    while (m8805m < i11) {
                        int m8802j4 = AbstractC2086q7.m8802j(bArr, m8805m, c2071p7);
                        if (i12 != c2071p7.f7995a) {
                            return m8805m;
                        }
                        m8805m = AbstractC2086q7.m8805m(bArr, m8802j4, c2071p7);
                        c2133t92.m8967i(c2071p7.f7996b);
                    }
                    return m8805m;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return AbstractC2086q7.m8798f(bArr, i19, interfaceC1922f9, c2071p7);
                }
                if (i14 == 0) {
                    return AbstractC2086q7.m8804l(i12, bArr, i10, i11, interfaceC1922f9, c2071p7);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i14 == 2) {
                    C2133t9 c2133t93 = (C2133t9) interfaceC1922f9;
                    int m8802j5 = AbstractC2086q7.m8802j(bArr, i19, c2071p7);
                    int i23 = c2071p7.f7995a + m8802j5;
                    while (m8802j5 < i23) {
                        c2133t93.m8967i(AbstractC2086q7.m8806n(bArr, m8802j5));
                        m8802j5 += 8;
                    }
                    if (m8802j5 == i23) {
                        return m8802j5;
                    }
                    throw C1968i9.m8531f();
                }
                if (i14 == 1) {
                    C2133t9 c2133t94 = (C2133t9) interfaceC1922f9;
                    c2133t94.m8967i(AbstractC2086q7.m8806n(bArr, i10));
                    while (true) {
                        i17 = i19 + 8;
                        if (i17 < i11) {
                            i19 = AbstractC2086q7.m8802j(bArr, i17, c2071p7);
                            if (i12 == c2071p7.f7995a) {
                                c2133t94.m8967i(AbstractC2086q7.m8806n(bArr, i19));
                            }
                        }
                    }
                    return i17;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    C1842a9 c1842a9 = (C1842a9) interfaceC1922f9;
                    int m8802j6 = AbstractC2086q7.m8802j(bArr, i19, c2071p7);
                    int i24 = c2071p7.f7995a + m8802j6;
                    while (m8802j6 < i24) {
                        c1842a9.m8094j(AbstractC2086q7.m8794b(bArr, m8802j6));
                        m8802j6 += 4;
                    }
                    if (m8802j6 == i24) {
                        return m8802j6;
                    }
                    throw C1968i9.m8531f();
                }
                if (i14 == 5) {
                    C1842a9 c1842a92 = (C1842a9) interfaceC1922f9;
                    c1842a92.m8094j(AbstractC2086q7.m8794b(bArr, i10));
                    while (true) {
                        i18 = i19 + 4;
                        if (i18 < i11) {
                            i19 = AbstractC2086q7.m8802j(bArr, i18, c2071p7);
                            if (i12 == c2071p7.f7995a) {
                                c1842a92.m8094j(AbstractC2086q7.m8794b(bArr, i19));
                            }
                        }
                    }
                    return i18;
                }
                break;
            case 25:
            case 42:
                if (i14 == 2) {
                    AbstractC0272b.m941a(interfaceC1922f9);
                    int m8802j7 = AbstractC2086q7.m8802j(bArr, i19, c2071p7);
                    int i25 = c2071p7.f7995a + m8802j7;
                    if (m8802j7 < i25) {
                        AbstractC2086q7.m8805m(bArr, m8802j7, c2071p7);
                        throw null;
                    }
                    if (m8802j7 == i25) {
                        return m8802j7;
                    }
                    throw C1968i9.m8531f();
                }
                if (i14 == 0) {
                    AbstractC0272b.m941a(interfaceC1922f9);
                    AbstractC2086q7.m8805m(bArr, i19, c2071p7);
                    long j12 = c2071p7.f7996b;
                    throw null;
                }
                break;
            case 26:
                if (i14 == 2) {
                    if ((j10 & IjkMediaMeta.AV_CH_STEREO_LEFT) == 0) {
                        i19 = AbstractC2086q7.m8802j(bArr, i19, c2071p7);
                        int i26 = c2071p7.f7995a;
                        if (i26 < 0) {
                            throw C1968i9.m8529d();
                        }
                        if (i26 == 0) {
                            interfaceC1922f9.add("");
                        } else {
                            interfaceC1922f9.add(new String(bArr, i19, i26, AbstractC1938g9.f7766b));
                            i19 += i26;
                        }
                        while (i19 < i11) {
                            int m8802j8 = AbstractC2086q7.m8802j(bArr, i19, c2071p7);
                            if (i12 != c2071p7.f7995a) {
                                break;
                            } else {
                                i19 = AbstractC2086q7.m8802j(bArr, m8802j8, c2071p7);
                                int i27 = c2071p7.f7995a;
                                if (i27 < 0) {
                                    throw C1968i9.m8529d();
                                }
                                if (i27 == 0) {
                                    interfaceC1922f9.add("");
                                } else {
                                    interfaceC1922f9.add(new String(bArr, i19, i27, AbstractC1938g9.f7766b));
                                    i19 += i27;
                                }
                            }
                        }
                        break;
                    } else {
                        i19 = AbstractC2086q7.m8802j(bArr, i19, c2071p7);
                        int i28 = c2071p7.f7995a;
                        if (i28 < 0) {
                            throw C1968i9.m8529d();
                        }
                        if (i28 == 0) {
                            interfaceC1922f9.add("");
                        } else {
                            int i29 = i19 + i28;
                            if (AbstractC2000kb.m8608f(bArr, i19, i29)) {
                                interfaceC1922f9.add(new String(bArr, i19, i28, AbstractC1938g9.f7766b));
                                i19 = i29;
                            } else {
                                throw C1968i9.m8528c();
                            }
                        }
                        while (i19 < i11) {
                            int m8802j9 = AbstractC2086q7.m8802j(bArr, i19, c2071p7);
                            if (i12 != c2071p7.f7995a) {
                                break;
                            } else {
                                i19 = AbstractC2086q7.m8802j(bArr, m8802j9, c2071p7);
                                int i30 = c2071p7.f7995a;
                                if (i30 < 0) {
                                    throw C1968i9.m8529d();
                                }
                                if (i30 == 0) {
                                    interfaceC1922f9.add("");
                                } else {
                                    int i31 = i19 + i30;
                                    if (AbstractC2000kb.m8608f(bArr, i19, i31)) {
                                        interfaceC1922f9.add(new String(bArr, i19, i30, AbstractC1938g9.f7766b));
                                        i19 = i31;
                                    } else {
                                        throw C1968i9.m8528c();
                                    }
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 27:
                if (i14 == 2) {
                    return AbstractC2086q7.m8797e(m8446n(i15), i12, bArr, i10, i11, interfaceC1922f9, c2071p7);
                }
                break;
            case 28:
                if (i14 == 2) {
                    int m8802j10 = AbstractC2086q7.m8802j(bArr, i19, c2071p7);
                    int i32 = c2071p7.f7995a;
                    if (i32 >= 0) {
                        if (i32 > bArr.length - m8802j10) {
                            throw C1968i9.m8531f();
                        }
                        if (i32 == 0) {
                            interfaceC1922f9.add(AbstractC1873c8.f7691b);
                        } else {
                            interfaceC1922f9.add(AbstractC1873c8.m8178u(bArr, m8802j10, i32));
                            m8802j10 += i32;
                        }
                        while (m8802j10 < i11) {
                            int m8802j11 = AbstractC2086q7.m8802j(bArr, m8802j10, c2071p7);
                            if (i12 != c2071p7.f7995a) {
                                return m8802j10;
                            }
                            m8802j10 = AbstractC2086q7.m8802j(bArr, m8802j11, c2071p7);
                            int i33 = c2071p7.f7995a;
                            if (i33 >= 0) {
                                if (i33 > bArr.length - m8802j10) {
                                    throw C1968i9.m8531f();
                                }
                                if (i33 == 0) {
                                    interfaceC1922f9.add(AbstractC1873c8.f7691b);
                                } else {
                                    interfaceC1922f9.add(AbstractC1873c8.m8178u(bArr, m8802j10, i33));
                                    m8802j10 += i33;
                                }
                            } else {
                                throw C1968i9.m8529d();
                            }
                        }
                        return m8802j10;
                    }
                    throw C1968i9.m8529d();
                }
                break;
            case 30:
            case 44:
                if (i14 == 2) {
                    m8804l = AbstractC2086q7.m8798f(bArr, i19, interfaceC1922f9, c2071p7);
                } else if (i14 == 0) {
                    m8804l = AbstractC2086q7.m8804l(i12, bArr, i10, i11, interfaceC1922f9, c2071p7);
                }
                AbstractC2222z8 abstractC2222z8 = (AbstractC2222z8) obj;
                C2164va c2164va = abstractC2222z8.zzc;
                Object m8837c = AbstractC2089qa.m8837c(i13, interfaceC1922f9, m8445m(i15), c2164va != C2164va.m9045c() ? c2164va : null, this.f7784l);
                if (m8837c == null) {
                    return m8804l;
                }
                abstractC2222z8.zzc = (C2164va) m8837c;
                return m8804l;
            case 33:
            case 47:
                if (i14 == 2) {
                    C1842a9 c1842a93 = (C1842a9) interfaceC1922f9;
                    int m8802j12 = AbstractC2086q7.m8802j(bArr, i19, c2071p7);
                    int i34 = c2071p7.f7995a + m8802j12;
                    while (m8802j12 < i34) {
                        m8802j12 = AbstractC2086q7.m8802j(bArr, m8802j12, c2071p7);
                        c1842a93.m8094j(AbstractC1937g8.m8412a(c2071p7.f7995a));
                    }
                    if (m8802j12 == i34) {
                        return m8802j12;
                    }
                    throw C1968i9.m8531f();
                }
                if (i14 == 0) {
                    C1842a9 c1842a94 = (C1842a9) interfaceC1922f9;
                    int m8802j13 = AbstractC2086q7.m8802j(bArr, i19, c2071p7);
                    c1842a94.m8094j(AbstractC1937g8.m8412a(c2071p7.f7995a));
                    while (m8802j13 < i11) {
                        int m8802j14 = AbstractC2086q7.m8802j(bArr, m8802j13, c2071p7);
                        if (i12 != c2071p7.f7995a) {
                            return m8802j13;
                        }
                        m8802j13 = AbstractC2086q7.m8802j(bArr, m8802j14, c2071p7);
                        c1842a94.m8094j(AbstractC1937g8.m8412a(c2071p7.f7995a));
                    }
                    return m8802j13;
                }
                break;
            case 34:
            case 48:
                if (i14 == 2) {
                    C2133t9 c2133t95 = (C2133t9) interfaceC1922f9;
                    int m8802j15 = AbstractC2086q7.m8802j(bArr, i19, c2071p7);
                    int i35 = c2071p7.f7995a + m8802j15;
                    while (m8802j15 < i35) {
                        m8802j15 = AbstractC2086q7.m8805m(bArr, m8802j15, c2071p7);
                        c2133t95.m8967i(AbstractC1937g8.m8413b(c2071p7.f7996b));
                    }
                    if (m8802j15 == i35) {
                        return m8802j15;
                    }
                    throw C1968i9.m8531f();
                }
                if (i14 == 0) {
                    C2133t9 c2133t96 = (C2133t9) interfaceC1922f9;
                    int m8805m2 = AbstractC2086q7.m8805m(bArr, i19, c2071p7);
                    c2133t96.m8967i(AbstractC1937g8.m8413b(c2071p7.f7996b));
                    while (m8805m2 < i11) {
                        int m8802j16 = AbstractC2086q7.m8802j(bArr, m8805m2, c2071p7);
                        if (i12 != c2071p7.f7995a) {
                            return m8805m2;
                        }
                        m8805m2 = AbstractC2086q7.m8805m(bArr, m8802j16, c2071p7);
                        c2133t96.m8967i(AbstractC1937g8.m8413b(c2071p7.f7996b));
                    }
                    return m8805m2;
                }
                break;
            default:
                if (i14 == 3) {
                    InterfaceC2059oa m8446n = m8446n(i15);
                    int i36 = (i12 & (-8)) | 4;
                    int m8795c = AbstractC2086q7.m8795c(m8446n, bArr, i10, i11, i36, c2071p7);
                    interfaceC1922f9.add(c2071p7.f7997c);
                    while (m8795c < i11) {
                        int m8802j17 = AbstractC2086q7.m8802j(bArr, m8795c, c2071p7);
                        if (i12 != c2071p7.f7995a) {
                            return m8795c;
                        }
                        m8795c = AbstractC2086q7.m8795c(m8446n, bArr, m8802j17, i11, i36, c2071p7);
                        interfaceC1922f9.add(c2071p7.f7997c);
                    }
                    return m8795c;
                }
                break;
        }
        return i19;
    }

    /* renamed from: Q */
    private final int m8438Q(int i10) {
        if (i10 >= this.f7775c && i10 <= this.f7776d) {
            return m8441T(i10, 0);
        }
        return -1;
    }

    /* renamed from: R */
    private final int m8439R(int i10, int i11) {
        if (i10 >= this.f7775c && i10 <= this.f7776d) {
            return m8441T(i10, i11);
        }
        return -1;
    }

    /* renamed from: S */
    private final int m8440S(int i10) {
        return this.f7773a[i10 + 2];
    }

    /* renamed from: T */
    private final int m8441T(int i10, int i11) {
        int length = (this.f7773a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f7773a[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /* renamed from: j */
    private static int m8442j(int i10) {
        return (i10 >>> 20) & 255;
    }

    /* renamed from: k */
    private final int m8443k(int i10) {
        return this.f7773a[i10 + 1];
    }

    /* renamed from: l */
    private static long m8444l(Object obj, long j10) {
        return ((Long) AbstractC1908eb.m8309k(obj, j10)).longValue();
    }

    /* renamed from: m */
    private final InterfaceC1874c9 m8445m(int i10) {
        int i11 = i10 / 3;
        return (InterfaceC1874c9) this.f7774b[i11 + i11 + 1];
    }

    /* renamed from: n */
    private final InterfaceC2059oa m8446n(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        InterfaceC2059oa interfaceC2059oa = (InterfaceC2059oa) this.f7774b[i12];
        if (interfaceC2059oa != null) {
            return interfaceC2059oa;
        }
        InterfaceC2059oa m8664b = C2014la.m8663a().m8664b((Class) this.f7774b[i12 + 1]);
        this.f7774b[i12] = m8664b;
        return m8664b;
    }

    /* renamed from: o */
    private final Object m8447o(int i10) {
        int i11 = i10 / 3;
        return this.f7774b[i11 + i11];
    }

    /* renamed from: p */
    private static Field m8448p(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* renamed from: q */
    private final void m8449q(Object obj, Object obj2, int i10) {
        long m8443k = m8443k(i10) & 1048575;
        if (!m8456x(obj2, i10)) {
            return;
        }
        Object m8309k = AbstractC1908eb.m8309k(obj, m8443k);
        Object m8309k2 = AbstractC1908eb.m8309k(obj2, m8443k);
        if (m8309k != null && m8309k2 != null) {
            AbstractC1908eb.m8322x(obj, m8443k, AbstractC1938g9.m8420g(m8309k, m8309k2));
            m8451s(obj, i10);
        } else if (m8309k2 != null) {
            AbstractC1908eb.m8322x(obj, m8443k, m8309k2);
            m8451s(obj, i10);
        }
    }

    /* renamed from: r */
    private final void m8450r(Object obj, Object obj2, int i10) {
        Object obj3;
        int m8443k = m8443k(i10);
        int i11 = this.f7773a[i10];
        long j10 = m8443k & 1048575;
        if (!m8423A(obj2, i11, i10)) {
            return;
        }
        if (m8423A(obj, i11, i10)) {
            obj3 = AbstractC1908eb.m8309k(obj, j10);
        } else {
            obj3 = null;
        }
        Object m8309k = AbstractC1908eb.m8309k(obj2, j10);
        if (obj3 != null && m8309k != null) {
            AbstractC1908eb.m8322x(obj, j10, AbstractC1938g9.m8420g(obj3, m8309k));
            m8452t(obj, i11, i10);
        } else if (m8309k != null) {
            AbstractC1908eb.m8322x(obj, j10, m8309k);
            m8452t(obj, i11, i10);
        }
    }

    /* renamed from: s */
    private final void m8451s(Object obj, int i10) {
        int m8440S = m8440S(i10);
        long j10 = 1048575 & m8440S;
        if (j10 == 1048575) {
            return;
        }
        AbstractC1908eb.m8320v(obj, j10, (1 << (m8440S >>> 20)) | AbstractC1908eb.m8306h(obj, j10));
    }

    /* renamed from: t */
    private final void m8452t(Object obj, int i10, int i11) {
        AbstractC1908eb.m8320v(obj, m8440S(i11) & 1048575, i10);
    }

    /* renamed from: u */
    private final void m8453u(Object obj, InterfaceC2015lb interfaceC2015lb) {
        int i10;
        if (!this.f7778f) {
            int length = this.f7773a.length;
            Unsafe unsafe = f7772q;
            int i11 = 1048575;
            int i12 = 0;
            int i13 = 0;
            int i14 = 1048575;
            while (i12 < length) {
                int m8443k = m8443k(i12);
                int[] iArr = this.f7773a;
                int i15 = iArr[i12];
                int m8442j = m8442j(m8443k);
                if (m8442j <= 17) {
                    int i16 = iArr[i12 + 2];
                    int i17 = i16 & i11;
                    if (i17 != i14) {
                        i13 = unsafe.getInt(obj, i17);
                        i14 = i17;
                    }
                    i10 = 1 << (i16 >>> 20);
                } else {
                    i10 = 0;
                }
                long j10 = m8443k & i11;
                switch (m8442j) {
                    case 0:
                        if ((i13 & i10) == 0) {
                            break;
                        } else {
                            interfaceC2015lb.mo8655s(i15, AbstractC1908eb.m8304f(obj, j10));
                            continue;
                        }
                    case 1:
                        if ((i13 & i10) != 0) {
                            interfaceC2015lb.mo8658v(i15, AbstractC1908eb.m8305g(obj, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i13 & i10) != 0) {
                            interfaceC2015lb.mo8644h(i15, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i13 & i10) != 0) {
                            interfaceC2015lb.mo8629C(i15, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i13 & i10) != 0) {
                            interfaceC2015lb.mo8652p(i15, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i13 & i10) != 0) {
                            interfaceC2015lb.mo8633G(i15, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i13 & i10) != 0) {
                            interfaceC2015lb.mo8640d(i15, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i13 & i10) != 0) {
                            interfaceC2015lb.mo8641e(i15, AbstractC1908eb.m8295B(obj, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i13 & i10) != 0) {
                            m8425C(i15, unsafe.getObject(obj, j10), interfaceC2015lb);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i13 & i10) != 0) {
                            interfaceC2015lb.mo8632F(i15, unsafe.getObject(obj, j10), m8446n(i12));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i13 & i10) != 0) {
                            interfaceC2015lb.mo8653q(i15, (AbstractC1873c8) unsafe.getObject(obj, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i13 & i10) != 0) {
                            interfaceC2015lb.mo8637a(i15, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i13 & i10) != 0) {
                            interfaceC2015lb.mo8650n(i15, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i13 & i10) != 0) {
                            interfaceC2015lb.mo8657u(i15, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i13 & i10) != 0) {
                            interfaceC2015lb.mo8646j(i15, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i13 & i10) != 0) {
                            interfaceC2015lb.mo8642f(i15, unsafe.getInt(obj, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if ((i13 & i10) != 0) {
                            interfaceC2015lb.mo8635I(i15, unsafe.getLong(obj, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i13 & i10) != 0) {
                            interfaceC2015lb.mo8661y(i15, unsafe.getObject(obj, j10), m8446n(i12));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        AbstractC2089qa.m8844j(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, false);
                        continue;
                    case 19:
                        AbstractC2089qa.m8848n(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, false);
                        continue;
                    case 20:
                        AbstractC2089qa.m8851q(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, false);
                        continue;
                    case 21:
                        AbstractC2089qa.m8859y(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, false);
                        continue;
                    case 22:
                        AbstractC2089qa.m8850p(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, false);
                        continue;
                    case 23:
                        AbstractC2089qa.m8847m(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, false);
                        continue;
                    case 24:
                        AbstractC2089qa.m8846l(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, false);
                        continue;
                    case 25:
                        AbstractC2089qa.m8842h(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, false);
                        continue;
                    case 26:
                        AbstractC2089qa.m8857w(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb);
                        break;
                    case 27:
                        AbstractC2089qa.m8852r(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, m8446n(i12));
                        break;
                    case 28:
                        AbstractC2089qa.m8843i(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb);
                        break;
                    case 29:
                        AbstractC2089qa.m8858x(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, false);
                        break;
                    case 30:
                        AbstractC2089qa.m8845k(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, false);
                        break;
                    case 31:
                        AbstractC2089qa.m8853s(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, false);
                        break;
                    case 32:
                        AbstractC2089qa.m8854t(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, false);
                        break;
                    case 33:
                        AbstractC2089qa.m8855u(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, false);
                        break;
                    case 34:
                        AbstractC2089qa.m8856v(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, false);
                        break;
                    case 35:
                        AbstractC2089qa.m8844j(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, true);
                        break;
                    case 36:
                        AbstractC2089qa.m8848n(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, true);
                        break;
                    case 37:
                        AbstractC2089qa.m8851q(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, true);
                        break;
                    case 38:
                        AbstractC2089qa.m8859y(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, true);
                        break;
                    case 39:
                        AbstractC2089qa.m8850p(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, true);
                        break;
                    case 40:
                        AbstractC2089qa.m8847m(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, true);
                        break;
                    case 41:
                        AbstractC2089qa.m8846l(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, true);
                        break;
                    case 42:
                        AbstractC2089qa.m8842h(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, true);
                        break;
                    case 43:
                        AbstractC2089qa.m8858x(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, true);
                        break;
                    case 44:
                        AbstractC2089qa.m8845k(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, true);
                        break;
                    case 45:
                        AbstractC2089qa.m8853s(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, true);
                        break;
                    case 46:
                        AbstractC2089qa.m8854t(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, true);
                        break;
                    case 47:
                        AbstractC2089qa.m8855u(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, true);
                        break;
                    case 48:
                        AbstractC2089qa.m8856v(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, true);
                        break;
                    case 49:
                        AbstractC2089qa.m8849o(this.f7773a[i12], (List) unsafe.getObject(obj, j10), interfaceC2015lb, m8446n(i12));
                        break;
                    case 50:
                        m8454v(interfaceC2015lb, i15, unsafe.getObject(obj, j10), i12);
                        break;
                    case 51:
                        if (m8423A(obj, i15, i12)) {
                            interfaceC2015lb.mo8655s(i15, m8429H(obj, j10));
                            break;
                        }
                        break;
                    case 52:
                        if (m8423A(obj, i15, i12)) {
                            interfaceC2015lb.mo8658v(i15, m8430I(obj, j10));
                            break;
                        }
                        break;
                    case 53:
                        if (m8423A(obj, i15, i12)) {
                            interfaceC2015lb.mo8644h(i15, m8444l(obj, j10));
                            break;
                        }
                        break;
                    case 54:
                        if (m8423A(obj, i15, i12)) {
                            interfaceC2015lb.mo8629C(i15, m8444l(obj, j10));
                            break;
                        }
                        break;
                    case 55:
                        if (m8423A(obj, i15, i12)) {
                            interfaceC2015lb.mo8652p(i15, m8433L(obj, j10));
                            break;
                        }
                        break;
                    case 56:
                        if (m8423A(obj, i15, i12)) {
                            interfaceC2015lb.mo8633G(i15, m8444l(obj, j10));
                            break;
                        }
                        break;
                    case 57:
                        if (m8423A(obj, i15, i12)) {
                            interfaceC2015lb.mo8640d(i15, m8433L(obj, j10));
                            break;
                        }
                        break;
                    case 58:
                        if (m8423A(obj, i15, i12)) {
                            interfaceC2015lb.mo8641e(i15, m8424B(obj, j10));
                            break;
                        }
                        break;
                    case 59:
                        if (m8423A(obj, i15, i12)) {
                            m8425C(i15, unsafe.getObject(obj, j10), interfaceC2015lb);
                            break;
                        }
                        break;
                    case 60:
                        if (m8423A(obj, i15, i12)) {
                            interfaceC2015lb.mo8632F(i15, unsafe.getObject(obj, j10), m8446n(i12));
                            break;
                        }
                        break;
                    case 61:
                        if (m8423A(obj, i15, i12)) {
                            interfaceC2015lb.mo8653q(i15, (AbstractC1873c8) unsafe.getObject(obj, j10));
                            break;
                        }
                        break;
                    case 62:
                        if (m8423A(obj, i15, i12)) {
                            interfaceC2015lb.mo8637a(i15, m8433L(obj, j10));
                            break;
                        }
                        break;
                    case 63:
                        if (m8423A(obj, i15, i12)) {
                            interfaceC2015lb.mo8650n(i15, m8433L(obj, j10));
                            break;
                        }
                        break;
                    case 64:
                        if (m8423A(obj, i15, i12)) {
                            interfaceC2015lb.mo8657u(i15, m8433L(obj, j10));
                            break;
                        }
                        break;
                    case 65:
                        if (m8423A(obj, i15, i12)) {
                            interfaceC2015lb.mo8646j(i15, m8444l(obj, j10));
                            break;
                        }
                        break;
                    case 66:
                        if (m8423A(obj, i15, i12)) {
                            interfaceC2015lb.mo8642f(i15, m8433L(obj, j10));
                            break;
                        }
                        break;
                    case 67:
                        if (m8423A(obj, i15, i12)) {
                            interfaceC2015lb.mo8635I(i15, m8444l(obj, j10));
                            break;
                        }
                        break;
                    case 68:
                        if (m8423A(obj, i15, i12)) {
                            interfaceC2015lb.mo8661y(i15, unsafe.getObject(obj, j10), m8446n(i12));
                            break;
                        }
                        break;
                }
                i12 += 3;
                i11 = 1048575;
            }
            AbstractC2149ua abstractC2149ua = this.f7784l;
            abstractC2149ua.mo9019i(abstractC2149ua.mo9013c(obj), interfaceC2015lb);
            return;
        }
        this.f7785m.mo8766a(obj);
        throw null;
    }

    /* renamed from: v */
    private final void m8454v(InterfaceC2015lb interfaceC2015lb, int i10, Object obj, int i11) {
        if (obj == null) {
            return;
        }
        AbstractC0272b.m941a(m8447o(i11));
        throw null;
    }

    /* renamed from: w */
    private final boolean m8455w(Object obj, Object obj2, int i10) {
        if (m8456x(obj, i10) == m8456x(obj2, i10)) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    private final boolean m8456x(Object obj, int i10) {
        int m8440S = m8440S(i10);
        long j10 = m8440S & 1048575;
        if (j10 == 1048575) {
            int m8443k = m8443k(i10);
            long j11 = m8443k & 1048575;
            switch (m8442j(m8443k)) {
                case 0:
                    if (Double.doubleToRawLongBits(AbstractC1908eb.m8304f(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(AbstractC1908eb.m8305g(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (AbstractC1908eb.m8307i(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (AbstractC1908eb.m8307i(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (AbstractC1908eb.m8306h(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (AbstractC1908eb.m8307i(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (AbstractC1908eb.m8306h(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return AbstractC1908eb.m8295B(obj, j11);
                case 8:
                    Object m8309k = AbstractC1908eb.m8309k(obj, j11);
                    if (m8309k instanceof String) {
                        if (((String) m8309k).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (m8309k instanceof AbstractC1873c8) {
                        if (AbstractC1873c8.f7691b.equals(m8309k)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (AbstractC1908eb.m8309k(obj, j11) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (AbstractC1873c8.f7691b.equals(AbstractC1908eb.m8309k(obj, j11))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (AbstractC1908eb.m8306h(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (AbstractC1908eb.m8306h(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (AbstractC1908eb.m8306h(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (AbstractC1908eb.m8307i(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (AbstractC1908eb.m8306h(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (AbstractC1908eb.m8307i(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (AbstractC1908eb.m8309k(obj, j11) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((AbstractC1908eb.m8306h(obj, j10) & (1 << (m8440S >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    private final boolean m8457y(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return m8456x(obj, i10);
        }
        if ((i12 & i13) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    private static boolean m8458z(Object obj, int i10, InterfaceC2059oa interfaceC2059oa) {
        return interfaceC2059oa.mo8462c(AbstractC1908eb.m8309k(obj, i10 & 1048575));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0366, code lost:
    
        if (r0 != r20) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0368, code lost:
    
        r15 = r28;
        r14 = r29;
        r12 = r30;
        r13 = r32;
        r11 = r33;
        r9 = r34;
        r1 = r17;
        r3 = r18;
        r5 = r20;
        r2 = r23;
        r6 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0382, code lost:
    
        r2 = r0;
        r7 = r17;
        r6 = r24;
        r0 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x03b2, code lost:
    
        if (r0 != r15) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03d7, code lost:
    
        if (r0 != r15) goto L116;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x008d. Please report as an issue. */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m8459D(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.measurement.C2071p7 r34) {
        /*
            Method dump skipped, instructions count: 1206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1939ga.m8459D(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.p7):int");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2059oa
    /* renamed from: a */
    public final void mo8460a(Object obj) {
        int i10;
        int i11 = this.f7781i;
        while (true) {
            i10 = this.f7782j;
            if (i11 >= i10) {
                break;
            }
            long m8443k = m8443k(this.f7780h[i11]) & 1048575;
            Object m8309k = AbstractC1908eb.m8309k(obj, m8443k);
            if (m8309k != null) {
                ((C2193x9) m8309k).m9183d();
                AbstractC1908eb.m8322x(obj, m8443k, m8309k);
            }
            i11++;
        }
        int length = this.f7780h.length;
        while (i10 < length) {
            this.f7783k.mo8738a(obj, this.f7780h[i10]);
            i10++;
        }
        this.f7784l.mo9017g(obj);
        if (this.f7778f) {
            this.f7785m.mo8767b(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2059oa
    /* renamed from: b */
    public final Object mo8461b() {
        return ((AbstractC2222z8) this.f7777e).mo8126w(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2059oa
    /* renamed from: c */
    public final boolean mo8462c(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f7781i) {
            int i15 = this.f7780h[i14];
            int i16 = this.f7773a[i15];
            int m8443k = m8443k(i15);
            int i17 = this.f7773a[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f7772q.getInt(obj, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if ((268435456 & m8443k) != 0 && !m8457y(obj, i15, i10, i11, i19)) {
                return false;
            }
            int m8442j = m8442j(m8443k);
            if (m8442j != 9 && m8442j != 17) {
                if (m8442j != 27) {
                    if (m8442j != 60 && m8442j != 68) {
                        if (m8442j != 49) {
                            if (m8442j == 50 && !((C2193x9) AbstractC1908eb.m8309k(obj, m8443k & 1048575)).isEmpty()) {
                                AbstractC0272b.m941a(m8447o(i15));
                                throw null;
                            }
                        }
                    } else if (m8423A(obj, i16, i15) && !m8458z(obj, m8443k, m8446n(i15))) {
                        return false;
                    }
                }
                List list = (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC2059oa m8446n = m8446n(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!m8446n.mo8462c(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (m8457y(obj, i15, i10, i11, i19) && !m8458z(obj, m8443k, m8446n(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        if (!this.f7778f) {
            return true;
        }
        this.f7785m.mo8766a(obj);
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001a. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2059oa
    /* renamed from: d */
    public final int mo8463d(Object obj) {
        int i10;
        int m8416c;
        int length = this.f7773a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int m8443k = m8443k(i12);
            int i13 = this.f7773a[i12];
            long j10 = 1048575 & m8443k;
            int i14 = 37;
            switch (m8442j(m8443k)) {
                case 0:
                    i10 = i11 * 53;
                    m8416c = AbstractC1938g9.m8416c(Double.doubleToLongBits(AbstractC1908eb.m8304f(obj, j10)));
                    i11 = i10 + m8416c;
                    break;
                case 1:
                    i10 = i11 * 53;
                    m8416c = Float.floatToIntBits(AbstractC1908eb.m8305g(obj, j10));
                    i11 = i10 + m8416c;
                    break;
                case 2:
                    i10 = i11 * 53;
                    m8416c = AbstractC1938g9.m8416c(AbstractC1908eb.m8307i(obj, j10));
                    i11 = i10 + m8416c;
                    break;
                case 3:
                    i10 = i11 * 53;
                    m8416c = AbstractC1938g9.m8416c(AbstractC1908eb.m8307i(obj, j10));
                    i11 = i10 + m8416c;
                    break;
                case 4:
                    i10 = i11 * 53;
                    m8416c = AbstractC1908eb.m8306h(obj, j10);
                    i11 = i10 + m8416c;
                    break;
                case 5:
                    i10 = i11 * 53;
                    m8416c = AbstractC1938g9.m8416c(AbstractC1908eb.m8307i(obj, j10));
                    i11 = i10 + m8416c;
                    break;
                case 6:
                    i10 = i11 * 53;
                    m8416c = AbstractC1908eb.m8306h(obj, j10);
                    i11 = i10 + m8416c;
                    break;
                case 7:
                    i10 = i11 * 53;
                    m8416c = AbstractC1938g9.m8414a(AbstractC1908eb.m8295B(obj, j10));
                    i11 = i10 + m8416c;
                    break;
                case 8:
                    i10 = i11 * 53;
                    m8416c = ((String) AbstractC1908eb.m8309k(obj, j10)).hashCode();
                    i11 = i10 + m8416c;
                    break;
                case 9:
                    Object m8309k = AbstractC1908eb.m8309k(obj, j10);
                    if (m8309k != null) {
                        i14 = m8309k.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case 10:
                    i10 = i11 * 53;
                    m8416c = AbstractC1908eb.m8309k(obj, j10).hashCode();
                    i11 = i10 + m8416c;
                    break;
                case 11:
                    i10 = i11 * 53;
                    m8416c = AbstractC1908eb.m8306h(obj, j10);
                    i11 = i10 + m8416c;
                    break;
                case 12:
                    i10 = i11 * 53;
                    m8416c = AbstractC1908eb.m8306h(obj, j10);
                    i11 = i10 + m8416c;
                    break;
                case 13:
                    i10 = i11 * 53;
                    m8416c = AbstractC1908eb.m8306h(obj, j10);
                    i11 = i10 + m8416c;
                    break;
                case 14:
                    i10 = i11 * 53;
                    m8416c = AbstractC1938g9.m8416c(AbstractC1908eb.m8307i(obj, j10));
                    i11 = i10 + m8416c;
                    break;
                case 15:
                    i10 = i11 * 53;
                    m8416c = AbstractC1908eb.m8306h(obj, j10);
                    i11 = i10 + m8416c;
                    break;
                case 16:
                    i10 = i11 * 53;
                    m8416c = AbstractC1938g9.m8416c(AbstractC1908eb.m8307i(obj, j10));
                    i11 = i10 + m8416c;
                    break;
                case 17:
                    Object m8309k2 = AbstractC1908eb.m8309k(obj, j10);
                    if (m8309k2 != null) {
                        i14 = m8309k2.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    m8416c = AbstractC1908eb.m8309k(obj, j10).hashCode();
                    i11 = i10 + m8416c;
                    break;
                case 50:
                    i10 = i11 * 53;
                    m8416c = AbstractC1908eb.m8309k(obj, j10).hashCode();
                    i11 = i10 + m8416c;
                    break;
                case 51:
                    if (m8423A(obj, i13, i12)) {
                        i10 = i11 * 53;
                        m8416c = AbstractC1938g9.m8416c(Double.doubleToLongBits(m8429H(obj, j10)));
                        i11 = i10 + m8416c;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m8423A(obj, i13, i12)) {
                        i10 = i11 * 53;
                        m8416c = Float.floatToIntBits(m8430I(obj, j10));
                        i11 = i10 + m8416c;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m8423A(obj, i13, i12)) {
                        i10 = i11 * 53;
                        m8416c = AbstractC1938g9.m8416c(m8444l(obj, j10));
                        i11 = i10 + m8416c;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m8423A(obj, i13, i12)) {
                        i10 = i11 * 53;
                        m8416c = AbstractC1938g9.m8416c(m8444l(obj, j10));
                        i11 = i10 + m8416c;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m8423A(obj, i13, i12)) {
                        i10 = i11 * 53;
                        m8416c = m8433L(obj, j10);
                        i11 = i10 + m8416c;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m8423A(obj, i13, i12)) {
                        i10 = i11 * 53;
                        m8416c = AbstractC1938g9.m8416c(m8444l(obj, j10));
                        i11 = i10 + m8416c;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m8423A(obj, i13, i12)) {
                        i10 = i11 * 53;
                        m8416c = m8433L(obj, j10);
                        i11 = i10 + m8416c;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m8423A(obj, i13, i12)) {
                        i10 = i11 * 53;
                        m8416c = AbstractC1938g9.m8414a(m8424B(obj, j10));
                        i11 = i10 + m8416c;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m8423A(obj, i13, i12)) {
                        i10 = i11 * 53;
                        m8416c = ((String) AbstractC1908eb.m8309k(obj, j10)).hashCode();
                        i11 = i10 + m8416c;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m8423A(obj, i13, i12)) {
                        i10 = i11 * 53;
                        m8416c = AbstractC1908eb.m8309k(obj, j10).hashCode();
                        i11 = i10 + m8416c;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m8423A(obj, i13, i12)) {
                        i10 = i11 * 53;
                        m8416c = AbstractC1908eb.m8309k(obj, j10).hashCode();
                        i11 = i10 + m8416c;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m8423A(obj, i13, i12)) {
                        i10 = i11 * 53;
                        m8416c = m8433L(obj, j10);
                        i11 = i10 + m8416c;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m8423A(obj, i13, i12)) {
                        i10 = i11 * 53;
                        m8416c = m8433L(obj, j10);
                        i11 = i10 + m8416c;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m8423A(obj, i13, i12)) {
                        i10 = i11 * 53;
                        m8416c = m8433L(obj, j10);
                        i11 = i10 + m8416c;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m8423A(obj, i13, i12)) {
                        i10 = i11 * 53;
                        m8416c = AbstractC1938g9.m8416c(m8444l(obj, j10));
                        i11 = i10 + m8416c;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m8423A(obj, i13, i12)) {
                        i10 = i11 * 53;
                        m8416c = m8433L(obj, j10);
                        i11 = i10 + m8416c;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m8423A(obj, i13, i12)) {
                        i10 = i11 * 53;
                        m8416c = AbstractC1938g9.m8416c(m8444l(obj, j10));
                        i11 = i10 + m8416c;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m8423A(obj, i13, i12)) {
                        i10 = i11 * 53;
                        m8416c = AbstractC1908eb.m8309k(obj, j10).hashCode();
                        i11 = i10 + m8416c;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i11 * 53) + this.f7784l.mo9013c(obj).hashCode();
        if (!this.f7778f) {
            return hashCode;
        }
        this.f7785m.mo8766a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2059oa
    /* renamed from: e */
    public final void mo8464e(Object obj, InterfaceC2015lb interfaceC2015lb) {
        if (this.f7779g) {
            if (!this.f7778f) {
                int length = this.f7773a.length;
                for (int i10 = 0; i10 < length; i10 += 3) {
                    int m8443k = m8443k(i10);
                    int i11 = this.f7773a[i10];
                    switch (m8442j(m8443k)) {
                        case 0:
                            if (m8456x(obj, i10)) {
                                interfaceC2015lb.mo8655s(i11, AbstractC1908eb.m8304f(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (m8456x(obj, i10)) {
                                interfaceC2015lb.mo8658v(i11, AbstractC1908eb.m8305g(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (m8456x(obj, i10)) {
                                interfaceC2015lb.mo8644h(i11, AbstractC1908eb.m8307i(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (m8456x(obj, i10)) {
                                interfaceC2015lb.mo8629C(i11, AbstractC1908eb.m8307i(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (m8456x(obj, i10)) {
                                interfaceC2015lb.mo8652p(i11, AbstractC1908eb.m8306h(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (m8456x(obj, i10)) {
                                interfaceC2015lb.mo8633G(i11, AbstractC1908eb.m8307i(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (m8456x(obj, i10)) {
                                interfaceC2015lb.mo8640d(i11, AbstractC1908eb.m8306h(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (m8456x(obj, i10)) {
                                interfaceC2015lb.mo8641e(i11, AbstractC1908eb.m8295B(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (m8456x(obj, i10)) {
                                m8425C(i11, AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (m8456x(obj, i10)) {
                                interfaceC2015lb.mo8632F(i11, AbstractC1908eb.m8309k(obj, m8443k & 1048575), m8446n(i10));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (m8456x(obj, i10)) {
                                interfaceC2015lb.mo8653q(i11, (AbstractC1873c8) AbstractC1908eb.m8309k(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (m8456x(obj, i10)) {
                                interfaceC2015lb.mo8637a(i11, AbstractC1908eb.m8306h(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (m8456x(obj, i10)) {
                                interfaceC2015lb.mo8650n(i11, AbstractC1908eb.m8306h(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (m8456x(obj, i10)) {
                                interfaceC2015lb.mo8657u(i11, AbstractC1908eb.m8306h(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (m8456x(obj, i10)) {
                                interfaceC2015lb.mo8646j(i11, AbstractC1908eb.m8307i(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (m8456x(obj, i10)) {
                                interfaceC2015lb.mo8642f(i11, AbstractC1908eb.m8306h(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (m8456x(obj, i10)) {
                                interfaceC2015lb.mo8635I(i11, AbstractC1908eb.m8307i(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (m8456x(obj, i10)) {
                                interfaceC2015lb.mo8661y(i11, AbstractC1908eb.m8309k(obj, m8443k & 1048575), m8446n(i10));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            AbstractC2089qa.m8844j(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, false);
                            break;
                        case 19:
                            AbstractC2089qa.m8848n(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, false);
                            break;
                        case 20:
                            AbstractC2089qa.m8851q(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, false);
                            break;
                        case 21:
                            AbstractC2089qa.m8859y(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, false);
                            break;
                        case 22:
                            AbstractC2089qa.m8850p(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, false);
                            break;
                        case 23:
                            AbstractC2089qa.m8847m(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, false);
                            break;
                        case 24:
                            AbstractC2089qa.m8846l(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, false);
                            break;
                        case 25:
                            AbstractC2089qa.m8842h(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, false);
                            break;
                        case 26:
                            AbstractC2089qa.m8857w(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb);
                            break;
                        case 27:
                            AbstractC2089qa.m8852r(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, m8446n(i10));
                            break;
                        case 28:
                            AbstractC2089qa.m8843i(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb);
                            break;
                        case 29:
                            AbstractC2089qa.m8858x(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, false);
                            break;
                        case 30:
                            AbstractC2089qa.m8845k(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, false);
                            break;
                        case 31:
                            AbstractC2089qa.m8853s(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, false);
                            break;
                        case 32:
                            AbstractC2089qa.m8854t(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, false);
                            break;
                        case 33:
                            AbstractC2089qa.m8855u(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, false);
                            break;
                        case 34:
                            AbstractC2089qa.m8856v(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, false);
                            break;
                        case 35:
                            AbstractC2089qa.m8844j(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, true);
                            break;
                        case 36:
                            AbstractC2089qa.m8848n(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, true);
                            break;
                        case 37:
                            AbstractC2089qa.m8851q(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, true);
                            break;
                        case 38:
                            AbstractC2089qa.m8859y(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, true);
                            break;
                        case 39:
                            AbstractC2089qa.m8850p(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, true);
                            break;
                        case 40:
                            AbstractC2089qa.m8847m(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, true);
                            break;
                        case 41:
                            AbstractC2089qa.m8846l(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, true);
                            break;
                        case 42:
                            AbstractC2089qa.m8842h(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, true);
                            break;
                        case 43:
                            AbstractC2089qa.m8858x(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, true);
                            break;
                        case 44:
                            AbstractC2089qa.m8845k(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, true);
                            break;
                        case 45:
                            AbstractC2089qa.m8853s(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, true);
                            break;
                        case 46:
                            AbstractC2089qa.m8854t(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, true);
                            break;
                        case 47:
                            AbstractC2089qa.m8855u(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, true);
                            break;
                        case 48:
                            AbstractC2089qa.m8856v(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, true);
                            break;
                        case 49:
                            AbstractC2089qa.m8849o(i11, (List) AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb, m8446n(i10));
                            break;
                        case 50:
                            m8454v(interfaceC2015lb, i11, AbstractC1908eb.m8309k(obj, m8443k & 1048575), i10);
                            break;
                        case 51:
                            if (m8423A(obj, i11, i10)) {
                                interfaceC2015lb.mo8655s(i11, m8429H(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (m8423A(obj, i11, i10)) {
                                interfaceC2015lb.mo8658v(i11, m8430I(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (m8423A(obj, i11, i10)) {
                                interfaceC2015lb.mo8644h(i11, m8444l(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (m8423A(obj, i11, i10)) {
                                interfaceC2015lb.mo8629C(i11, m8444l(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (m8423A(obj, i11, i10)) {
                                interfaceC2015lb.mo8652p(i11, m8433L(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (m8423A(obj, i11, i10)) {
                                interfaceC2015lb.mo8633G(i11, m8444l(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (m8423A(obj, i11, i10)) {
                                interfaceC2015lb.mo8640d(i11, m8433L(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (m8423A(obj, i11, i10)) {
                                interfaceC2015lb.mo8641e(i11, m8424B(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (m8423A(obj, i11, i10)) {
                                m8425C(i11, AbstractC1908eb.m8309k(obj, m8443k & 1048575), interfaceC2015lb);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (m8423A(obj, i11, i10)) {
                                interfaceC2015lb.mo8632F(i11, AbstractC1908eb.m8309k(obj, m8443k & 1048575), m8446n(i10));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (m8423A(obj, i11, i10)) {
                                interfaceC2015lb.mo8653q(i11, (AbstractC1873c8) AbstractC1908eb.m8309k(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (m8423A(obj, i11, i10)) {
                                interfaceC2015lb.mo8637a(i11, m8433L(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (m8423A(obj, i11, i10)) {
                                interfaceC2015lb.mo8650n(i11, m8433L(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (m8423A(obj, i11, i10)) {
                                interfaceC2015lb.mo8657u(i11, m8433L(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (m8423A(obj, i11, i10)) {
                                interfaceC2015lb.mo8646j(i11, m8444l(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (m8423A(obj, i11, i10)) {
                                interfaceC2015lb.mo8642f(i11, m8433L(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (m8423A(obj, i11, i10)) {
                                interfaceC2015lb.mo8635I(i11, m8444l(obj, m8443k & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (m8423A(obj, i11, i10)) {
                                interfaceC2015lb.mo8661y(i11, AbstractC1908eb.m8309k(obj, m8443k & 1048575), m8446n(i10));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                AbstractC2149ua abstractC2149ua = this.f7784l;
                abstractC2149ua.mo9019i(abstractC2149ua.mo9013c(obj), interfaceC2015lb);
                return;
            }
            this.f7785m.mo8766a(obj);
            throw null;
        }
        m8453u(obj, interfaceC2015lb);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2059oa
    /* renamed from: f */
    public final int mo8465f(Object obj) {
        if (this.f7779g) {
            return m8432K(obj);
        }
        return m8431J(obj);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2059oa
    /* renamed from: g */
    public final void mo8466g(Object obj, Object obj2) {
        obj2.getClass();
        for (int i10 = 0; i10 < this.f7773a.length; i10 += 3) {
            int m8443k = m8443k(i10);
            long j10 = 1048575 & m8443k;
            int i11 = this.f7773a[i10];
            switch (m8442j(m8443k)) {
                case 0:
                    if (m8456x(obj2, i10)) {
                        AbstractC1908eb.m8318t(obj, j10, AbstractC1908eb.m8304f(obj2, j10));
                        m8451s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m8456x(obj2, i10)) {
                        AbstractC1908eb.m8319u(obj, j10, AbstractC1908eb.m8305g(obj2, j10));
                        m8451s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m8456x(obj2, i10)) {
                        AbstractC1908eb.m8321w(obj, j10, AbstractC1908eb.m8307i(obj2, j10));
                        m8451s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m8456x(obj2, i10)) {
                        AbstractC1908eb.m8321w(obj, j10, AbstractC1908eb.m8307i(obj2, j10));
                        m8451s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m8456x(obj2, i10)) {
                        AbstractC1908eb.m8320v(obj, j10, AbstractC1908eb.m8306h(obj2, j10));
                        m8451s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m8456x(obj2, i10)) {
                        AbstractC1908eb.m8321w(obj, j10, AbstractC1908eb.m8307i(obj2, j10));
                        m8451s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m8456x(obj2, i10)) {
                        AbstractC1908eb.m8320v(obj, j10, AbstractC1908eb.m8306h(obj2, j10));
                        m8451s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m8456x(obj2, i10)) {
                        AbstractC1908eb.m8316r(obj, j10, AbstractC1908eb.m8295B(obj2, j10));
                        m8451s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m8456x(obj2, i10)) {
                        AbstractC1908eb.m8322x(obj, j10, AbstractC1908eb.m8309k(obj2, j10));
                        m8451s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m8449q(obj, obj2, i10);
                    break;
                case 10:
                    if (m8456x(obj2, i10)) {
                        AbstractC1908eb.m8322x(obj, j10, AbstractC1908eb.m8309k(obj2, j10));
                        m8451s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m8456x(obj2, i10)) {
                        AbstractC1908eb.m8320v(obj, j10, AbstractC1908eb.m8306h(obj2, j10));
                        m8451s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m8456x(obj2, i10)) {
                        AbstractC1908eb.m8320v(obj, j10, AbstractC1908eb.m8306h(obj2, j10));
                        m8451s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m8456x(obj2, i10)) {
                        AbstractC1908eb.m8320v(obj, j10, AbstractC1908eb.m8306h(obj2, j10));
                        m8451s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m8456x(obj2, i10)) {
                        AbstractC1908eb.m8321w(obj, j10, AbstractC1908eb.m8307i(obj2, j10));
                        m8451s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m8456x(obj2, i10)) {
                        AbstractC1908eb.m8320v(obj, j10, AbstractC1908eb.m8306h(obj2, j10));
                        m8451s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m8456x(obj2, i10)) {
                        AbstractC1908eb.m8321w(obj, j10, AbstractC1908eb.m8307i(obj2, j10));
                        m8451s(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m8449q(obj, obj2, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f7783k.mo8739b(obj, obj2, j10);
                    break;
                case 50:
                    AbstractC2089qa.m8808B(this.f7787o, obj, obj2, j10);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (m8423A(obj2, i11, i10)) {
                        AbstractC1908eb.m8322x(obj, j10, AbstractC1908eb.m8309k(obj2, j10));
                        m8452t(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    m8450r(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m8423A(obj2, i11, i10)) {
                        AbstractC1908eb.m8322x(obj, j10, AbstractC1908eb.m8309k(obj2, j10));
                        m8452t(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    m8450r(obj, obj2, i10);
                    break;
            }
        }
        AbstractC2089qa.m8840f(this.f7784l, obj, obj2);
        if (this.f7778f) {
            AbstractC2089qa.m8839e(this.f7785m, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2059oa
    /* renamed from: h */
    public final void mo8467h(Object obj, byte[] bArr, int i10, int i11, C2071p7 c2071p7) {
        if (this.f7779g) {
            m8436O(obj, bArr, i10, i11, c2071p7);
        } else {
            m8459D(obj, bArr, i10, i11, 0, c2071p7);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c3 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2059oa
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo8468i(java.lang.Object r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1939ga.mo8468i(java.lang.Object, java.lang.Object):boolean");
    }
}
