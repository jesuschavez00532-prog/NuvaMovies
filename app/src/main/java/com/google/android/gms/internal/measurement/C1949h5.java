package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.h5 */
/* loaded from: classes.dex */
public final class C1949h5 extends AbstractC2222z8 implements InterfaceC1907ea {
    private static final C1949h5 zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        C1949h5 c1949h5 = new C1949h5();
        zza = c1949h5;
        AbstractC2222z8.m9405s(C1949h5.class, c1949h5);
    }

    private C1949h5() {
    }

    /* renamed from: A */
    public static C1934g5 m8479A() {
        return (C1934g5) zza.m9407t();
    }

    /* renamed from: E */
    public static /* synthetic */ void m8481E(C1949h5 c1949h5, long j10) {
        c1949h5.zze |= 1;
        c1949h5.zzf = j10;
    }

    /* renamed from: F */
    public static /* synthetic */ void m8482F(C1949h5 c1949h5, String str) {
        str.getClass();
        c1949h5.zze |= 2;
        c1949h5.zzg = str;
    }

    /* renamed from: G */
    public static /* synthetic */ void m8483G(C1949h5 c1949h5, String str) {
        str.getClass();
        c1949h5.zze |= 4;
        c1949h5.zzh = str;
    }

    /* renamed from: H */
    public static /* synthetic */ void m8484H(C1949h5 c1949h5) {
        c1949h5.zze &= -5;
        c1949h5.zzh = zza.zzh;
    }

    /* renamed from: I */
    public static /* synthetic */ void m8485I(C1949h5 c1949h5, long j10) {
        c1949h5.zze |= 8;
        c1949h5.zzi = j10;
    }

    /* renamed from: J */
    public static /* synthetic */ void m8486J(C1949h5 c1949h5) {
        c1949h5.zze &= -9;
        c1949h5.zzi = 0L;
    }

    /* renamed from: K */
    public static /* synthetic */ void m8487K(C1949h5 c1949h5, double d10) {
        c1949h5.zze |= 32;
        c1949h5.zzk = d10;
    }

    /* renamed from: L */
    public static /* synthetic */ void m8488L(C1949h5 c1949h5) {
        c1949h5.zze &= -33;
        c1949h5.zzk = 0.0d;
    }

    /* renamed from: C */
    public final String m8489C() {
        return this.zzg;
    }

    /* renamed from: D */
    public final String m8490D() {
        return this.zzh;
    }

    /* renamed from: M */
    public final boolean m8491M() {
        return (this.zze & 32) != 0;
    }

    /* renamed from: N */
    public final boolean m8492N() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: O */
    public final boolean m8493O() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: P */
    public final boolean m8494P() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2222z8
    /* renamed from: w */
    public final Object mo8126w(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new C1934g5(null);
                }
                return new C1949h5();
            }
            return AbstractC2222z8.m9404r(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }

    /* renamed from: x */
    public final double m8495x() {
        return this.zzk;
    }

    /* renamed from: y */
    public final long m8496y() {
        return this.zzi;
    }

    /* renamed from: z */
    public final long m8497z() {
        return this.zzf;
    }
}
