package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.m3 */
/* loaded from: classes.dex */
public final class C2022m3 extends AbstractC2222z8 implements InterfaceC1907ea {
    private static final C2022m3 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private C1916f3 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        C2022m3 c2022m3 = new C2022m3();
        zza = c2022m3;
        AbstractC2222z8.m9405s(C2022m3.class, c2022m3);
    }

    private C2022m3() {
    }

    /* renamed from: C */
    public static /* synthetic */ void m8670C(C2022m3 c2022m3, String str) {
        c2022m3.zze |= 2;
        c2022m3.zzg = str;
    }

    /* renamed from: z */
    public static C2007l3 m8671z() {
        return (C2007l3) zza.m9407t();
    }

    /* renamed from: B */
    public final String m8672B() {
        return this.zzg;
    }

    /* renamed from: D */
    public final boolean m8673D() {
        return this.zzi;
    }

    /* renamed from: E */
    public final boolean m8674E() {
        return this.zzj;
    }

    /* renamed from: F */
    public final boolean m8675F() {
        return this.zzk;
    }

    /* renamed from: G */
    public final boolean m8676G() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: H */
    public final boolean m8677H() {
        return (this.zze & 32) != 0;
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
                    return new C2007l3(null);
                }
                return new C2022m3();
            }
            return AbstractC2222z8.m9404r(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }

    /* renamed from: x */
    public final int m8678x() {
        return this.zzf;
    }

    /* renamed from: y */
    public final C1916f3 m8679y() {
        C1916f3 c1916f3 = this.zzh;
        if (c1916f3 == null) {
            return C1916f3.m8368y();
        }
        return c1916f3;
    }
}
