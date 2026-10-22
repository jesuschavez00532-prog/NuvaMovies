package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.j4 */
/* loaded from: classes.dex */
public final class C1978j4 extends AbstractC2222z8 implements InterfaceC1907ea {
    private static final C1978j4 zza;
    private int zze;
    private int zzf;
    private C1886d5 zzg;
    private C1886d5 zzh;
    private boolean zzi;

    static {
        C1978j4 c1978j4 = new C1978j4();
        zza = c1978j4;
        AbstractC2222z8.m9405s(C1978j4.class, c1978j4);
    }

    private C1978j4() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static /* synthetic */ void m8543C(C1978j4 c1978j4, int i10) {
        c1978j4.zze |= 1;
        c1978j4.zzf = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static /* synthetic */ void m8544D(C1978j4 c1978j4, C1886d5 c1886d5) {
        c1886d5.getClass();
        c1978j4.zzg = c1886d5;
        c1978j4.zze |= 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static /* synthetic */ void m8545E(C1978j4 c1978j4, C1886d5 c1886d5) {
        c1978j4.zzh = c1886d5;
        c1978j4.zze |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static /* synthetic */ void m8546F(C1978j4 c1978j4, boolean z10) {
        c1978j4.zze |= 8;
        c1978j4.zzi = z10;
    }

    /* renamed from: y */
    public static C1963i4 m8547y() {
        return (C1963i4) zza.m9407t();
    }

    /* renamed from: A */
    public final C1886d5 m8549A() {
        C1886d5 c1886d5 = this.zzg;
        if (c1886d5 == null) {
            return C1886d5.m8224E();
        }
        return c1886d5;
    }

    /* renamed from: B */
    public final C1886d5 m8550B() {
        C1886d5 c1886d5 = this.zzh;
        if (c1886d5 == null) {
            return C1886d5.m8224E();
        }
        return c1886d5;
    }

    /* renamed from: G */
    public final boolean m8551G() {
        return this.zzi;
    }

    /* renamed from: H */
    public final boolean m8552H() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: I */
    public final boolean m8553I() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: J */
    public final boolean m8554J() {
        return (this.zze & 4) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC2222z8
    /* renamed from: w */
    public final Object mo8126w(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    AbstractC1901e4 abstractC1901e4 = null;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new C1963i4(abstractC1901e4);
                }
                return new C1978j4();
            }
            return AbstractC2222z8.m9404r(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    /* renamed from: x */
    public final int m8555x() {
        return this.zzf;
    }
}
