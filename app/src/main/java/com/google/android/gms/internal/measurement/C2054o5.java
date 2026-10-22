package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.o5 */
/* loaded from: classes.dex */
public final class C2054o5 extends AbstractC2222z8 implements InterfaceC1907ea {
    private static final C2054o5 zza;
    private int zze;
    private InterfaceC1922f9 zzf = AbstractC2222z8.m9401n();
    private C1994k5 zzg;

    static {
        C2054o5 c2054o5 = new C2054o5();
        zza = c2054o5;
        AbstractC2222z8.m9405s(C2054o5.class, c2054o5);
    }

    private C2054o5() {
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
                    return new C2039n5(null);
                }
                return new C2054o5();
            }
            return AbstractC2222z8.m9404r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", C2129t5.class, "zzg"});
        }
        return (byte) 1;
    }

    /* renamed from: x */
    public final C1994k5 m8752x() {
        C1994k5 c1994k5 = this.zzg;
        if (c1994k5 == null) {
            return C1994k5.m8579z();
        }
        return c1994k5;
    }

    /* renamed from: z */
    public final List m8753z() {
        return this.zzf;
    }
}
