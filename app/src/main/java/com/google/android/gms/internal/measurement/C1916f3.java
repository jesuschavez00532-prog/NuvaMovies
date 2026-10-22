package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f3 */
/* loaded from: classes.dex */
public final class C1916f3 extends AbstractC2222z8 implements InterfaceC1907ea {
    private static final C1916f3 zza;
    private int zze;
    private C2097r3 zzf;
    private C1992k3 zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        C1916f3 c1916f3 = new C1916f3();
        zza = c1916f3;
        AbstractC2222z8.m9405s(C1916f3.class, c1916f3);
    }

    private C1916f3() {
    }

    /* renamed from: C */
    public static /* synthetic */ void m8366C(C1916f3 c1916f3, String str) {
        c1916f3.zze |= 8;
        c1916f3.zzi = str;
    }

    /* renamed from: y */
    public static C1916f3 m8368y() {
        return zza;
    }

    /* renamed from: A */
    public final C2097r3 m8369A() {
        C2097r3 c2097r3 = this.zzf;
        if (c2097r3 == null) {
            return C2097r3.m8868z();
        }
        return c2097r3;
    }

    /* renamed from: B */
    public final String m8370B() {
        return this.zzi;
    }

    /* renamed from: D */
    public final boolean m8371D() {
        return this.zzh;
    }

    /* renamed from: E */
    public final boolean m8372E() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: F */
    public final boolean m8373F() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: G */
    public final boolean m8374G() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: H */
    public final boolean m8375H() {
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
                    return new C1900e3(null);
                }
                return new C1916f3();
            }
            return AbstractC2222z8.m9404r(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    /* renamed from: z */
    public final C1992k3 m8376z() {
        C1992k3 c1992k3 = this.zzg;
        if (c1992k3 == null) {
            return C1992k3.m8565y();
        }
        return c1992k3;
    }
}
