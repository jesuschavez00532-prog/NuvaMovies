package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.v3 */
/* loaded from: classes.dex */
public final class C2157v3 extends AbstractC2222z8 implements InterfaceC1907ea {
    private static final C2157v3 zza;
    private int zze;
    private String zzf = "";
    private InterfaceC1922f9 zzg = AbstractC2222z8.m9401n();
    private boolean zzh;

    static {
        C2157v3 c2157v3 = new C2157v3();
        zza = c2157v3;
        AbstractC2222z8.m9405s(C2157v3.class, c2157v3);
    }

    private C2157v3() {
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
                    return new C2127t3(null);
                }
                return new C2157v3();
            }
            return AbstractC2222z8.m9404r(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", C1853b4.class, "zzh"});
        }
        return (byte) 1;
    }

    /* renamed from: y */
    public final String m9025y() {
        return this.zzf;
    }
}
