package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.l4 */
/* loaded from: classes.dex */
public final class C2008l4 extends AbstractC2222z8 implements InterfaceC1907ea {
    private static final C2008l4 zza;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        C2008l4 c2008l4 = new C2008l4();
        zza = c2008l4;
        AbstractC2222z8.m9405s(C2008l4.class, c2008l4);
    }

    private C2008l4() {
    }

    /* renamed from: B */
    public static /* synthetic */ void m8615B(C2008l4 c2008l4, int i10) {
        c2008l4.zze |= 1;
        c2008l4.zzf = i10;
    }

    /* renamed from: C */
    public static /* synthetic */ void m8616C(C2008l4 c2008l4, long j10) {
        c2008l4.zze |= 2;
        c2008l4.zzg = j10;
    }

    /* renamed from: z */
    public static C1993k4 m8617z() {
        return (C1993k4) zza.m9407t();
    }

    /* renamed from: D */
    public final boolean m8618D() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: E */
    public final boolean m8619E() {
        return (this.zze & 1) != 0;
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
                    return new C1993k4(null);
                }
                return new C2008l4();
            }
            return AbstractC2222z8.m9404r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: x */
    public final int m8620x() {
        return this.zzf;
    }

    /* renamed from: y */
    public final long m8621y() {
        return this.zzg;
    }
}
