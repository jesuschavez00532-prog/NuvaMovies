package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.k3 */
/* loaded from: classes.dex */
public final class C1992k3 extends AbstractC2222z8 implements InterfaceC1907ea {
    private static final C1992k3 zza;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        C1992k3 c1992k3 = new C1992k3();
        zza = c1992k3;
        AbstractC2222z8.m9405s(C1992k3.class, c1992k3);
    }

    private C1992k3() {
    }

    /* renamed from: y */
    public static C1992k3 m8565y() {
        return zza;
    }

    /* renamed from: A */
    public final String m8566A() {
        return this.zzj;
    }

    /* renamed from: B */
    public final String m8567B() {
        return this.zzi;
    }

    /* renamed from: C */
    public final boolean m8568C() {
        return this.zzg;
    }

    /* renamed from: D */
    public final boolean m8569D() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: E */
    public final boolean m8570E() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: F */
    public final boolean m8571F() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: G */
    public final boolean m8572G() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: H */
    public final boolean m8573H() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: I */
    public final int m8574I() {
        int m8542a = AbstractC1977j3.m8542a(this.zzf);
        if (m8542a == 0) {
            return 1;
        }
        return m8542a;
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
                    return new C1932g3(null);
                }
                return new C1992k3();
            }
            return AbstractC2222z8.m9404r(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", C1962i3.f7814a, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    /* renamed from: z */
    public final String m8575z() {
        return this.zzh;
    }
}
